<template>
  <div class="m-side">
    <div class="sidebar">
      <!--hot tags-->
      <div class="tag-side">
        <el-link href="#" class="side-title">Tags</el-link>
        <el-row class="m-tag">
          <el-button round size="small" class="m-side-tag-button" v-for="t in hotTags" :key="t.id">{{t.tagName}}</el-button>
        </el-row>
      </div>
      <hr>
      <!--hot category-->
      <div class="category-side">
        <el-link href="#" class="side-title">Category</el-link>
        <el-row class="m-tag">
          <el-button round size="small" class="m-side-tag-button" v-for="c in hotCategories" :key="c.id">{{c.categoryName}}</el-button>
        </el-row>
      </div>
      <hr>
      <!--about me-->
      <div class="about-me-side">
        <div class="side-title">About me</div>
        <br>
        <p>about me something whatever</p>
      </div>
    </div>
  </div>
</template>

<script>
  import {getHotTags} from '../../api/tag'
  import {getHotCategories} from '../../api/category'

  export default {
    name: 'Sider',
    created () {
      this.getHotTags()
      this.getHotCategories()
    },
    data () {
      return {
        hotTags: [],
        hotCategories: [],
      }
    },
    methods: {
      getHotTags () {
        getHotTags().then(response => {
          this.hotTags = response.data
          console.info(response)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'hot tags fail!', showClose: true})
          }
        })
      },
      getHotCategories () {
        getHotCategories().then(response => {
          this.hotCategories = response.data
          console.info(response)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'hot tags fail!', showClose: true})
          }
        })
      }
    }
  }

</script>

<style scoped>
  .m-side {
    padding-right: 150px;
  }

  .sidebar {
    background: transparent;
    margin-left: 20px;
    margin-top: 30px;
    text-align: left;
    color: #cccccc;
  }

  .tag-side {

  }

  .side-title {
    color: #cccccc;
    font-size: 22px;
    font-weight: bolder;
    margin-bottom: 20px;
  }

  .m-side-tag-button {
    margin-bottom: 10px;
  }

  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }

  .m-category {
    font-size: 16px;
    color: #cccccc;
  }
</style>
