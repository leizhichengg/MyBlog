<template>
  <div id="app">
    <b-nav></b-nav>
    <b-header></b-header>
    <br>
    <br>
    <el-row :gutter="20">
      <el-col :span="16">
        <b-content></b-content>
      </el-col>
      <el-col :span="8">
        <b-sider></b-sider>
      </el-col>
    </el-row>
    <b-footer></b-footer>
  </div>
</template>

<script>
  import Header from '@/components/layout/Header'
  import Footer from '@/components/layout/Footer'
  import Navbar from '@/components/layout/Navbar'
  import Content from '@/components/layout/Content'
  import Sider from '@/components/layout/Sider'

  export default {
    name: 'Home',
    data () {
      return {
        activeIndex: '/'
      }
    },
    components: {
      'b-nav': Navbar,
      'b-header': Header,
      'b-footer': Footer,
      'b-content': Content,
      'b-sider': Sider,
    }
  }
</script>

<style scoped>

</style>
