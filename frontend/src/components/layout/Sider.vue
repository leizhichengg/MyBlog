<template>
  <div class="ivu-col-span-4 ivu-col-lg-offset-1">
    <div class="sidebar">
      <!--hot tags-->
      <div class="tag-side">
        <a href="#" class="side-title">Tags</a>
        <br><br>
        <Button shape="circle" class="m-side-tag-button">java</Button>
        <Button shape="circle" class="m-side-tag-button">python</Button>
        <Button shape="circle" class="m-side-tag-button">springboot</Button>
        <Button shape="circle" class="m-side-tag-button">test</Button>
        <Button shape="circle" class="m-side-tag-button">django</Button>
      </div>
      <hr>
      <!--hot category-->
      <div class="category-side">
        <a href="#" class="side-title">Category</a>
        <br><br>
        <a href="#" class="m-category">category1</a>
        <br>
        <a href="#" class="m-category">category2</a>
        <br>
        <a href="#" class="m-category">category3</a>
        <br>
        <a href="#" class="m-category">category4</a>
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
    font-size: 16px;
    font-weight: bolder;
  }
  .m-side-tag-button {
    margin-top: 10px;
    color: black;
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
