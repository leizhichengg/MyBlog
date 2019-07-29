<template>
  <div class="post-list">
    <el-tabs type="border-card">
      <!--All Posts-->
      <el-tab-pane>
        <span slot="label"><i class="el-icon-document"></i> All Posts</span>
        <el-input class="post-search" v-model="search" placeholder="Search Title..." prefix-icon="el-icon-search"/>
        <el-table
          height="540"
          :data="tableData.filter(data => !search || data.title.toLowerCase().includes(search.toLowerCase()))"
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
          <el-table-column
            prop="author"
            label="Author">
          </el-table-column>
          <el-table-column
            prop="categories"
            label="Categories">
          </el-table-column>
          <el-table-column
            prop="tags"
            label="Tags">
          </el-table-column>
          <el-table-column
            prop="views"
            label="Views">
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
          :data="tableData1"
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
          <el-table-column
            prop="author"
            label="Author">
          </el-table-column>
          <el-table-column
            prop="categories"
            label="Categories">
          </el-table-column>
          <el-table-column
            prop="tags"
            label="Tags">
          </el-table-column>
          <el-table-column
            prop="views"
            label="Views">
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
          :data="tableData2"
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
          <el-table-column
            prop="author"
            label="Author">
          </el-table-column>
          <el-table-column
            prop="categories"
            label="Categories">
          </el-table-column>
          <el-table-column
            prop="tags"
            label="Tags">
          </el-table-column>
          <el-table-column
            prop="views"
            label="Views">
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
            label="Actions"
            width="140">
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
  export default {
    name: 'Allposts',
    methods: {
      handleClick (row) {
        console.log(row)
      },
      indexMethod (index) {
        return index
      }
    },
    data () {
      return {
        tableData: [{
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-03',
        }, {
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-02',
        }, {
          title: '测试',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-04',
        }, {
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-01',
        }, {
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-08',
        }, {
          title: 'Post Test',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-06',
        }, {
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }, {
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }, {
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }],
        tableData1: [{
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }, {
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }],
        tableData2: [{
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }, {
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }],
        search: ''
      }
    }
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
