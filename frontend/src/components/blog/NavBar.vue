<template>
  <div class="m-nav">
    <div class="container-fluid">
      <el-link class="navbar-text navbar-brand" href="/">MyBlog</el-link>
      <div class="m-menu">
        <router-link to="/">
          <el-link class="navbar-text ">Home</el-link>
        </router-link>
        <router-link to="/archive">
          <el-link class="navbar-text ">Archive</el-link>
        </router-link>
        <router-link to="/category">
          <el-link href="/category" class="navbar-text ">Category</el-link>
        </router-link>
        <router-link to="/tag">
          <el-link href="/tag" class="navbar-text ">Tag</el-link>
        </router-link>
        &nbsp;&nbsp;
        <el-input class="m-search" v-model="input" suffix-icon="el-icon-search"
                  placeholder="Search something..."></el-input>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'BlogNavBar',
    data () {
      return {
        input: ''
      }
    }
  }
</script>

<style scoped>
  .m-nav {
    height: 70px;
    line-height: 70px;
    position: sticky;
    top: 0;
    z-index: 9999;
    background: #fff;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.05);
  }

  .container-fluid {
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;
  }

  .m-menu {
    float: right;
    font-weight: bold;
    background: #fff;
    /*color: white;*/
    /*text-align: center;*/
    vertical-align: center;
    /*margin-top: 20px;*/
  }

  .m-search {
    float: right;
    vertical-align: center;
    width: 250px;
  }

  .navbar-text {
    font-size: 16px;
    color: #404040;
    margin-left: -15px;
    padding: 20px;
    line-height: 30px;
    float: left;
    font-weight: bold;
  }

  .navbar-brand {
    font-size: 20px;
  }

</style>
