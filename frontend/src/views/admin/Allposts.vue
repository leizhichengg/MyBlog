<template>
  <div class="post-list">
    <div class="title">
      <a>All Posts</a>
      <el-input class="post-search" v-model="search" placeholder="Search Title..." prefix-icon="el-icon-search"/>
    </div>

    <el-table
      height="454"
      stripe
      :data="tableData.filter(data => !search || data.title.toLowerCase().includes(search.toLowerCase()))"
      style="width: 100%">

      <el-table-column
        prop="index"
        label="Index"
        width="80">
      </el-table-column>
      <el-table-column
        prop="title"
        label="Title"
        width="200">
      </el-table-column>
      <el-table-column
        prop="author"
        label="Author"
        width="120">
      </el-table-column>
      <el-table-column
        prop="categories"
        label="Categories"
        width="120">
      </el-table-column>
      <el-table-column
        prop="tags"
        label="Tags"
        width="120">
      </el-table-column>
      <el-table-column
        prop="views"
        label="Views"
        width="100">
      </el-table-column>
      <el-table-column
        prop="comments"
        label="Comments"
        width="100">
      </el-table-column>
      <el-table-column
        prop="date"
        label="Date"
        sortable
        width="120">
      </el-table-column>
      <el-table-column
        label="Actions"
        width="140">
        <template slot-scope="scope">
          <el-button @click="handleClick(scope.row)" type="text" size="small">Edit</el-button>
          <el-button type="text" size="small">Delete</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
  export default {
    name: 'Allposts',
    methods: {
      handleClick (row) {
        console.log(row)
      }
    },
    data () {
      return {
        tableData: [{
          index: '0',
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-03',
        }, {
          index: '1',
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-02',
        }, {
          index: '2',
          title: '测试',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-04',
        }, {
          index: '3',
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-01',
        }, {
          index: '4',
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-08',
        }, {
          index: '5',
          title: 'Post Test',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-06',
        }, {
          index: '6',
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }, {
          index: '7',
          title: 'Post Title',
          author: 'Lei',
          categories: 'Test',
          tags: 'Test',
          views: '12',
          comments: '3',
          date: '2016-05-07',
        }, {
          index: '8',
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
    padding: 50px;
  }



  .title {
    margin-bottom: 10px;
    text-align: left;
    font-size: 28px;
    font-weight: 400;
  }

  .post-search {
    width: 240px;
    float: right;
    margin-right: 30px;
  }
</style>
