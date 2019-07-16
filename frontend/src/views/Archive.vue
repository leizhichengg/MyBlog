<template>
  <div>
    <b-nav/>
    <header class="a-header">
      <h1 class="m-title">Archive</h1>
    </header>
    <!--Main content-->
    <el-row :gutter="20">
      <el-col :span="14" :offset="5">
        <div class="m-time-tag">
          <el-button round size="small" class="m-side-tag-button">All <sup> 2</sup></el-button>
          <el-button round size="small" class="m-side-tag-button">2019 <sup> 2</sup></el-button>
          <el-button round size="small" class="m-side-tag-button">2018 <sup> 2</sup></el-button>
        </div>
        <div class="m-time-title">
          2019
        </div>
        <!--post list-->
        <div class="m-post-list">
          <section>
            <h1>test</h1>
          </section>
        </div>
      </el-col>
    </el-row>
    <b-footer/>
  </div>
</template>

<script>
  import Navbar from '@/components/layout/Navbar'
  import Footer from '@/components/layout/Footer'
  import Header from '../components/layout/Header'

  export default {
    name: 'Archive',
    data () {
      return {

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
    background: #ccc url("../assets/img/archive-bg.jpg") scroll;
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
  .m-time-tag {
    margin-top: 36px;
    text-align: left;
  }
  .m-time-title {
    margin-top: 24px;
    text-align: left;
  }
</style>
