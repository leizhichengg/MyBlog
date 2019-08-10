<template>
  <div class="post-list">
    <el-tabs type="border-card">
      <!--All Posts-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-document"></i> All Posts</span>
        <el-input class="post-search" v-model="search" placeholder="Search Title..." prefix-icon="el-icon-search"/>
        <el-table
          height="540"
          :data="allPostData.filter(data => !search || data.title.toLowerCase().includes(search.toLowerCase()))"
          :header-cell-style="{color: '#60748A'}"
          style="width: 100%; color: #60748A">
          <el-table-column
            type="index"
            :index="indexMethod"
            width="80"
            align="center">
          </el-table-column>
          <el-table-column
            prop="title"
            label="Title">
            <template slot-scope="scope">
              <router-link to="/">
                {{scope.row.title}}
              </router-link>
            </template>

          </el-table-column>
<!--          <el-table-column-->
<!--            prop="author"-->
<!--            label="Author">-->
<!--          </el-table-column>-->
          <el-table-column
            prop="category.categoryName"
            label="Category">
          </el-table-column>
          <el-table-column
            prop="tags"
            label="Tags">
          </el-table-column>
          <el-table-column
            prop="views"
            label="Views"
            sortable>
          </el-table-column>
          <el-table-column
            prop="comments"
            label="Comments">
          </el-table-column>
          <el-table-column
            prop="createTime"
            label="Date"
            sortable>
          </el-table-column>
          <el-table-column
            label="Actions">
            <template slot-scope="scope">
              <el-button @click="handleClick(scope.row)" type="text" size="small">Edit</el-button>
              <el-button type="text" size="small">Delete</el-button>
            </template>
          </el-table-column>
        </el-table>
        <div class="new-post">
          <router-link to="/admin/posts/new-post">
            <el-button type="primary" class="m-button">New Post</el-button>
          </router-link>
        </div>
      </el-tab-pane>
      <!--Drafts-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-edit-outline"></i> Drafts</span>
        <el-table
          height="540"
          :data="draftData"
          :header-cell-style="{color: '#60748A'}"
          style="width: 100%; color: #60748A">
          <el-table-column
            type="index"
            :index="indexMethod"
            width="80"
            align="center">
          </el-table-column>
          <el-table-column
            prop="title"
            label="Title">
          </el-table-column>
<!--          <el-table-column-->
<!--            prop="author"-->
<!--            label="Author">-->
<!--          </el-table-column>-->
          <el-table-column
            prop="category"
            label="Category">
          </el-table-column>
          <el-table-column
            prop="tags"
            label="Tags">
          </el-table-column>
          <el-table-column
            prop="views"
            label="Views"
            sortable>
          </el-table-column>
          <el-table-column
            prop="comments"
            label="Comments">
          </el-table-column>
          <el-table-column
            prop="date"
            label="Date"
            sortable>
          </el-table-column>
          <el-table-column
            label="Actions">
            <template slot-scope="scope">
              <el-button @click="handleClick(scope.row)" type="text" size="small">Edit</el-button>
              <el-button type="text" size="small">Delete</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-tab-pane>
      <!--Trash-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-delete"></i> Trash</span>
        <el-table
          height="540"
          :data="trashData"
          :header-cell-style="{color: '#60748A'}"
          style="width: 100%; color: #60748A">
          <el-table-column
            type="index"
            :index="indexMethod"
            width="80"
            align="center">
          </el-table-column>
          <el-table-column
            prop="title"
            label="Title">
          </el-table-column>
<!--          <el-table-column-->
<!--            prop="author"-->
<!--            label="Author">-->
<!--          </el-table-column>-->
          <el-table-column
            prop="category"
            label="Category">
          </el-table-column>
          <el-table-column
            prop="tags"
            label="Tags">
          </el-table-column>
          <el-table-column
            prop="views"
            label="Views"
            sortable>
          </el-table-column>
          <el-table-column
            prop="comments"
            label="Comments">
          </el-table-column>
          <el-table-column
            prop="date"
            label="Date"
            sortable>
          </el-table-column>
          <el-table-column
            label="Actions">
            <template slot-scope="scope">
              <el-button @click="handleClick(scope.row)" type="text" size="small">Restore</el-button>
              <el-button type="text" size="small">Remove</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-tab-pane>
    </el-tabs>

  </div>
</template>

<script>
  import {getBlogList, getAllPosts, getPostDrafts, getPostTrash} from '../../api/blog'

  export default {
    name: 'PostsList',
    created () {
      // this.getBlogList()
      this.getAllPosts()
      this.getPostDrafts()
      this.getPostTrash()
    },
    data () {
      return {
        blogList: [],
        allPostData: [{
          title: 'Post Title',
          // author: 'Lei',
          category: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-03',
        }],
        draftData: [],
        trashData: [],
        search: ''
      }
    },
    methods: {
      handleClick (row) {
        console.log(row)
      },
      indexMethod (index) {
        return index
      },
      getBlogList () {
        getBlogList().then(response => {
          this.blogList = response.data
          console.info(response)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'get blog list fail!', showClose: true})
          }
        })
      },
      getAllPosts () {
        getAllPosts().then(response => {
          this.allPostData = response.data
          console.info(this.allPostData)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'get allPostData list fail!', showClose: true})
          }
        })
      },
      getPostDrafts () {
        getPostDrafts().then(response => {
          this.draftData = response.data
          console.info(this.draftData)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'get draftData list fail!', showClose: true})
          }
        })
      },
      getPostTrash () {
        getPostTrash().then(response => {
          this.trashData = response.data
          console.info(this.trashData)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'get trashData list fail!', showClose: true})
          }
        })
      }
    },
  }
</script>

<style scoped>
  .post-list {
    padding-top: 20px;
    padding-left: 10px;
    padding-right: 10px;
  }

  .title {
    margin-bottom: 10px;
    text-align: left;
    font-size: 28px;
    font-weight: 400;
    color: #60748A;
  }

  .router-link-active {
    text-decoration: none;
    color: #60748A;
    font-weight: bold;
  }

  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }

  .post-search {
    width: 300px;
    float: left;
    margin-left: 30px;
  }

  .new-post {
    margin-top: 24px;
  }

  .m-button {
    background-color: #60748A;
    border: #f0f0f0;
    width: 180px;
  }
</style>
