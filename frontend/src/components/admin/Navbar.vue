<template>
  <div class="a-navbar">
    <hamburger class="hamburger-container"></hamburger>
    <breadcrumb class="breadcrumb-container"></breadcrumb>
    <!--Navbar Dropdown Menu-->
    <div class="nav-menu">
      <el-dropdown class="a-dropdown">
      <span class="el-dropdown-link">
        Username<i class="el-icon-arrow-down el-icon--right"></i>
      </span>
        <el-dropdown-menu slot="dropdown">
          <router-link to="/admin/dashboard">
            <el-dropdown-item>Home</el-dropdown-item>
          </router-link>
          <a target="_blank" href="https://github.com/withlzc/MyBlog">
            <el-dropdown-item>Github</el-dropdown-item>
          </a>
          <hr>
          <el-dropdown-item>Log out</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
  import Hamburger from './Hamburger'
  import Breadcrumb from './Breadcrumb'
  export default {
    name: 'Navbar',
    components: {Breadcrumb, Hamburger}
  }
</script>

<style scoped>
  .a-navbar {
    height: 50px;
    overflow: hidden;
    position: relative;
    background: #fff;
    box-shadow: 0 1px 4px rgba(0, 21, 41, .08);
    margin-right: -8px;

  }

  .nav-menu {
    text-align: right;
    margin-right: 12px;
  }

  .el-dropdown-link {
    cursor: pointer;
    /*color: #409EFF;*/
    font-weight: bold;
  }

  .a-dropdown {
    margin-top: 16px;
  }

  hr {
    border: 0;
    border-top: 1px solid #eee;
  }

  a {
    text-decoration: none;
  }

  .hamburger-container {
    line-height: 50px;
    /*height: 100%;*/
    float: left;
    cursor: pointer;
    /*transition: background .3s;*/
    /*-webkit-tap-highlight-color:transparent;*/
  }

  .breadcrumb-container {
    float: left;
    line-height: 50px;
  }


</style>
