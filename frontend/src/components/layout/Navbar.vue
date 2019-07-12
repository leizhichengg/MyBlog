<template>
  <div class="m-nav">
    <div class="container-fluid">
      <a class="navbar-text navbar-brand" href="/">MyBlog</a>
      <div class="m-menu">
        <a href="/" class="navbar-text ">Home</a>
        <a href="/archive" class="navbar-text ">Archive</a>
        <a href="/category" class="navbar-text ">Category</a>
        <a href="/tag" class="navbar-text ">Tag</a>
        <Input class="m-search" v-model="searchValue" icon="ios-search-outline" size="large" placeholder="Search something..." style="width: 250px" />
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Navbar',
    data () {
      return {
        searchValue: ''
      }
    }
  }
</script>

<style scoped>
  .m-nav {
    height: 60px;
    line-height: 60px
  }
  .container-fluid {
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;
    background: transparent;
  }
  .m-menu {
    float: right;
    font-weight: bold;
    color: white;
  }
  .m-search {
    float: right;
    vertical-align: center;
    margin-top: 12px;
  }
  .navbar-text {
    font-size: 16px;
    color: white;
    margin-left: -15px;
    padding: 20px;
    line-height: 20px;
    float: left;
    font-weight: bold;
  }
  .navbar-brand {
    font-size: 20px;
  }
</style>
