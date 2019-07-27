<template>
  <div class="a-side">
    <el-scrollbar wrap-class="scrollbar-wrapper">
      <el-menu
        mode="vertical"
        @open="handleOpen"
        @close="handleClose"
        :collapse="isCollapse"
        background-color="#2A3F54"
        text-color="#E1E1E1"
        active-text-color="">

        <el-menu-item index="1">
          <router-link to="/admin/dashboard">
            <i class="el-icon-ali-dashboard1"></i>
            <span>Dashboard</span>
          </router-link>
        </el-menu-item>

        <el-submenu index="2">
          <template slot="title">
            <i class="el-icon-ali-article-fill"></i>
            <span slot="title">Posts</span>
          </template>
          <el-menu-item index="2-1">
            <router-link to="/admin/posts/all-posts">
              <span>All Posts</span>
            </router-link>
          </el-menu-item>
          <el-menu-item index="2-2">
            <router-link to="/admin/posts/categories">
              <span>Categories</span>
            </router-link>
          </el-menu-item>
          <el-menu-item index="2-3">
            <router-link to="/admin/posts/tags">
              <span>Tags</span>
            </router-link>
          </el-menu-item>
        </el-submenu>

        <el-menu-item index="3">
          <router-link to="/admin/media">
            <i class="el-icon-ali-permmedia"></i>
            <span>Media</span>
          </router-link>
        </el-menu-item>

        <el-menu-item index="4">
          <router-link to="/admin/comments">
            <i class="el-icon-ali-comment"></i>
            <span>Comments</span>
          </router-link>
        </el-menu-item>

      </el-menu>
    </el-scrollbar>
  </div>
</template>

<script>
  export default {
    name: 'Sidebar',
    data() {
      return {
        isCollapse: false
      };
    },
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style scoped>
  .a-side {
    font-weight: bolder;
  }

  .scrollbar-wrapper {
    overflow-x: hidden !important;
  }

  .el-scrollbar__bar.is-vertical {
    right: 0px;
  }

  .el-scrollbar {
    height: 100%;
  }

  .is-horizontal {
    display: none;
  }

  a {
    display: inline-block;
    width: 100%;
    overflow: hidden;
    text-decoration: none;
    color: #E1E1E1;
  }

  .el-menu {
    border: none;
    height: 100%;
    width: 100% !important;
    background: transparent;
    text-align: left;
  }

  .el-menu-item {
    /*color: white !important;*/
    /*font-size: 16px;*/
  }
</style>
