<template>
  <div>
    <b-nav/>
<!--    <header class="a-header">-->
<!--      <h1 class="m-title">Tag</h1>-->
<!--    </header>-->
    <!--Main content-->
    <el-row class="tag-container">
      <el-col :span="14" :offset="5">
        <el-row class="m-tag">
          <el-button round size="small" class="m-tag-button">All <sup> 2</sup></el-button>
          <el-button round size="small" class="m-tag-button" v-for="t in tagList" :key="t.id">{{t.tagName}} <sup> 2</sup></el-button>
        </el-row>
        <div class="tag-block" v-for="t in tagList" :key="t.id">
          <h3 class="m-tag-title">
            <i class="el-icon-ali-tag"></i>
            &nbsp;{{t.tagName}}
          </h3>
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
  import Navbar from '@/components/blog/Navbar'
  import Footer from '@/components/blog/Footer'
  // import Header from '@/components/blog/Header'
  import {getTagList} from '../../api/tag'

  export default {
    name: 'Tag',
    created () {
      this.getTagList()
    },
    data () {
      return {
        tagList: [],
      }
    },

    methods: {
      getTagList () {
        getTagList().then(response => {
          this.tagList = response.data
          console.info(response)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'get tag list fail!', showClose: true})
          }
        })
      }
    },
    components: {
      // Header,
      'b-nav': Navbar,
      'b-footer': Footer,
    }
  }
</script>

<style scoped>
  .a-header {
    background: #ccc url("/static/img/tag-bg.jpg") scroll;
    background-size: cover;
    padding: 100px 0;
    /*text-align: left;*/
    /*width: 1200px;*/
    /*margin-left: -8px;*/
    /*margin-right: -8px;*/
    margin-top: -60px;
    /*max-width: 100%;*/
    /*height: 300px;*/
    color: white;
  }

  .tag-container {
    max-width: 1200px;
    /*padding-right: 15px;*/
    /*padding-left: 15px;*/
    margin: 0 auto;
    /*margin-right: auto;*/
    /*margin-left: auto;*/
  }

  .m-title {
    font-size: 45px;
    /*padding-top: 150px;*/
    /*text-align: center;*/
  }

  .m-tag {
    margin-top: 36px;
    text-align: left;
    margin-bottom: 36px;
  }

  .m-tag-button {
    font-size: 14px;
    font-weight: bold;
  }

  .m-tag-title {
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
