<template>
  <div>
    <b-nav/>
    <header class="a-header">
      <h1 class="m-title">Category</h1>
    </header>
    <!--Main content-->
    <el-row class="category-container">
      <el-col :span="14" :offset="5">
        <el-row class="m-category">
          <el-button round size="small" class="m-category-button">All <sup> 2</sup></el-button>
          <el-button round size="small" class="m-category-button" v-for="c in categoryList" :key="c.id">{{c.categoryName}} <sup> 2</sup></el-button>
        </el-row>

        <div class="category-block" v-for="c in categoryList" :key="c.id">
          <div class="m-category-title">
            <i class="el-icon-ali-tag"></i>
            &nbsp;{{c.categoryName}}
          </div>
          <!--post list-->
          <div class="m-post-list">
            <div class="m-post">
              <h2>Post title</h2>
              <hr>
            </div>
            <div class="m-post">
              <h2>Post title</h2>
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
  import {getCategoryList} from '../../api/category'

  export default {
    name: 'Category',
    created () {
      this.getCategoryList()
    },
    data () {
      return {
        categoryList: [],
      }
    },
    methods: {
      getCategoryList () {
        getCategoryList().then(response => {
          this.categoryList = response.data
          console.info(response)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'get category list fail!', showClose: true})
          }
        })
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
    background: #ccc url("/static/img/category-bg.jpg") scroll;
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

  .category-container {
    width: 1200px;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;
  }

  .m-category {
    margin-top: 36px;
    text-align: left;
    margin-bottom: 36px;
  }

  .m-category-button {
    font-size: 14px;
    font-weight: bold;
  }

  .m-category-title {
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
