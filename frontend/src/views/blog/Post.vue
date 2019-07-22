<template>
  <div>
    <b-nav></b-nav>
    <header class="post-header">
      <el-row :gutter="20">
        <el-col :span="14" :offset="4">
          <div class="post-tags">
            <el-button round size="small" class="m-side-tag-button">vue</el-button>
          </div>
          <div class="post-title">
            <h1>Post title test</h1>
            <h2>sub title</h2>
            <p class="post-meta">
              Post by *** on July 12, 2019
            </p>
          </div>
        </el-col>
      </el-row>
    </header>
    <div class="post-article">
      <el-row :gutter="20">
        <el-col :span="14" :offset="4">
          <p>
            post article test post article test post article test post article test post article test post article test
            post article test post article test post article test post article test post article test post article test
            post article test post article test post article test post article test post article test post article test
            post article test post article test post article test post article test post article test post article test
            post article test post article test post article test post article test post article test post article test
            post article test post article test post article test post article test post article test post article test
            post article test post article test post article test post article test post article test post article test
          </p>
        </el-col>
      </el-row>
    </div>
    <b-footer/>
  </div>
</template>

<script>
  import Navbar from '@/components/layout/Navbar'
  import Footer from '@/components/layout/Footer'

  export default {
    name: 'Post',
    components: {
      'b-nav': Navbar,
      'b-footer': Footer,
    }
  }
</script>

<style scoped>
  .post-tags {
    margin-top: 36px;
    text-align: left;
  }
  .post-header {
    /*padding: 0 50px;*/
    margin-left: 20px;
    /*margin-right: -8px;*/
    margin-top: 0px;
    text-align: left;
    /*height: 500px;*/
    color: #404040;
  }
  .post-title {
    font-family: "Helvetica Neue", Helvetica, "PingFang SC", "Hiragino Sans GB", "Microsoft YaHei", "微软雅黑", Arial, sans-serif;
  }
  .post-meta {
    font-size: 18px;
    color: #ccc;
    font-style: italic;
    margin-top: 5px;
  }
  .post-article {
    margin-top: 10px;
    text-align: left;
    margin-left: 20px;
  }
</style>
