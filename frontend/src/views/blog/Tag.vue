<template>
  <div>
    <b-nav/>
    <header class="a-header">
      <h1 class="m-title">Tag</h1>
    </header>
    <!--Main content-->
    <el-row :gutter="20">
      <el-col :span="14" :offset="5">
        <div class="m-tag">
          <el-button round size="small" class="m-side-tag-button">All <sup> 2</sup></el-button>
          <el-button round size="small" class="m-side-tag-button">前端 <sup> 2</sup></el-button>
          <el-button round size="small" class="m-side-tag-button">后端 <sup> 2</sup></el-button>
        </div>
        <div class="tag-block">
          <div class="m-tag-title">
            前端
          </div>
          <!--post list-->
          <div class="m-post-list">
            <div class="m-post">
              <h3>Post title</h3>
              <h4>2019-2-9</h4>
              <hr>
            </div>
            <div class="m-post">
              <h3>Post title</h3>
              <h4>2019-2-9</h4>
              <hr>
            </div>
          </div>
        </div>
      </el-col>
    </el-row>
    <b-footer/>
  </div>
</template>

<script>
  import Navbar from '@/components/blog/navbar/HomeNavBar'
  import Footer from '@/components/blog/Footer'
  import Header from '@/components/blog/Header'

  export default {
    name: 'Tag',
    data () {
      return {
        activeIndex: '/tag'
      }
    },
    components: {
      Header,
      'b-nav': Navbar,
      'b-footer': Footer,

    }
  }
</script>

<style scoped>
  .a-header {
    background: #ccc url("/static/img/tag-bg.jpg") scroll;
    background-size: cover;
    padding: 0 50px;
    /*text-align: left;*/
    /*width: 1200px;*/
    margin-left: -8px;
    margin-right: -8px;
    margin-top: -136px;
    /*max-width: 100%;*/
    height: 300px;
    color: white;
  }

  .m-title {
    font-size: 45px;
    padding-top: 150px;
    text-align: center;
  }
  .m-tag {
    margin-top: 36px;
    text-align: left;
  }

  .m-tag-title {
    margin-top: 24px;
    text-align: left;
  }
  .m-post-list {
    text-align: left;
    padding-left: 12px;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
</style>
