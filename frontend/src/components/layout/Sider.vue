<template>
  <div class="m-side">
    <div class="sidebar">
      <!--hot tags-->
      <div class="tag-side">
        <el-link href="#" class="side-title">Tags</el-link>
        <br><br>
        <el-button round size="small" class="m-side-tag-button">java</el-button>
        <el-button round size="small" class="m-side-tag-button">python</el-button>
        <el-button round size="small" class="m-side-tag-button">test</el-button>
        <el-button round size="small" class="m-side-tag-button">item</el-button>
        <el-button round size="small" class="m-side-tag-button">hahaha</el-button>
      </div>
      <hr>
      <!--hot category-->
      <div class="category-side">
        <el-link href="#" class="side-title">Category</el-link>
        <br><br>
        <el-link href="#" class="m-category">category1</el-link>
        <br>
        <el-link href="#" class="m-category">category2</el-link>
        <br>
        <el-link href="#" class="m-category">category3</el-link>
        <br>
        <el-link href="#" class="m-category">category4</el-link>
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
  export default {
    name: 'Sider'
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
