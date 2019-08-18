<template>
  <div>
    <b-nav/>
    <!--    <header class="a-header">-->
    <!--      <h1 class="m-title">Archive</h1>-->
    <!--    </header>-->
    <!--Main content-->
    <el-row class="archive-container">
      <el-col :span="14" :offset="5">
        <el-row class="m-archive">
          <el-button round size="small" class="m-archive-button">All <sup> 2</sup></el-button>
          <el-button round size="small" class="m-archive-button">2019 <sup> 2</sup></el-button>
          <el-button round size="small" class="m-archive-button">2018 <sup> 2</sup></el-button>
        </el-row>

        <div class="archive-block">
          <div class="m-archive-title">
            <i class="el-icon-ali-tag"></i>
            2019
          </div>
          <!--post list-->
          <div class="m-post-list">
            <div class="m-post">
              <h2>Post title</h2>
              <h5>2019-2-9</h5>
              <hr>
            </div>
            <div class="m-post">
              <h2>Post title</h2>
              <h5>2019-2-9</h5>
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
  import Navbar from '@/components/blog/Navbar'
  import Footer from '@/components/blog/Footer'

  export default {
    name: 'Archive',
    data () {
      return {}
    },
    components: {
      // Header,
      'b-nav': Navbar,
      'b-footer': Footer,

    }
  }
</script>

<style scoped>
  /*.a-header {*/
  /*  background: #ccc url("/static/img/archive-bg.jpg") scroll;*/
  /*  background-size: cover;*/
  /*  padding: 100px 0;*/
  /*  !*text-align: left;*!*/
  /*  !*width: 1200px;*!*/
  /*  !*margin-left: -8px;*!*/
  /*  !*margin-right: -8px;*!*/
  /*  margin-top: -60px;*/
  /*  !*max-width: 100%;*!*/
  /*  !*height: 300px;*!*/
  /*  color: white;*/
  /*}*/

  .archive-container {
    max-width: 1200px;
    margin: 0 auto;
  }

  .m-archive {
    margin-top: 36px;
    text-align: left;
    margin-bottom: 36px;
  }

  .m-archive-button {
    font-size: 14px;
    font-weight: bold;
  }

  .m-archive-title {
    margin-top: 24px;
    margin-bottom: 40px;
    text-align: left;
    font-size: 20px;
    font-weight: bold;
    color: #2A3F54;
  }

  .m-post-list {
    text-align: left;
    padding-left: 12px;
    font-size: 20px;
  }

  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
</style>
