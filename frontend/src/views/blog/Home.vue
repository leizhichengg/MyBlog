<template>
  <div id="home">
    <b-nav></b-nav>
<!--    <b-header></b-header>-->
    <br>
    <br>
    <div class="m-container">
      <el-row :gutter="40">
        <el-col :span="16">
          <b-content></b-content>
<!--          <b-page/>-->
        </el-col>
        <el-col :span="8">
          <b-sider></b-sider>
        </el-col>
      </el-row>
    </div>
    <b-footer></b-footer>
  </div>
</template>

<script>
  // import Header from '@/components/blog/Header'
  import Footer from '@/components/blog/Footer'
  import Navbar from '@/components/blog/Navbar'
  import Content from '@/components/blog/Content'
  import Sider from '@/components/blog/Sider'
  import Page from '@/components/blog/Page'

  export default {
    name: 'Home',
    data () {
      return {
        activeIndex: '/'
      }
    },
    components: {
      'b-nav': Navbar,
      // 'b-header': Header,
      'b-footer': Footer,
      'b-content': Content,
      'b-sider': Sider,
      'b-page': Page,
    }
  }
</script>

<style scoped>
  .m-container {
    max-width: 1000px;
    clear: both;
    margin: 0 auto;
    padding: 30px 30px 0;
    /*padding-right: 15px;*/
    /*padding-left: 15px;*/
    /*margin-right: auto;*/
    /*margin-left: auto;*/
  }
</style>
