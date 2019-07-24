<template>
  <div class="a-side">
    <el-scrollbar wrap-class="scrollbar-wrapper">
      <el-menu mode="vertical" @open="handleOpen" @close="handleClose" :collapse="isCollapse">

        <el-menu-item index="1">
          <router-link to="/admin/dashboard">
            <i class="el-icon-ali-dashboard"></i>
            <span>Dashboard</span>
          </router-link>
        </el-menu-item>

        <el-submenu index="2">
          <template slot="title">
            <i class="el-icon-ali-post"></i>
            <span slot="title">Post</span>
          </template>
          <el-menu-item index="2-1">
            <span slot="title">Add</span>
          </el-menu-item>
          <el-menu-item index="2-2">
            Edit
          </el-menu-item>
          <el-menu-item index="2-3">
            Delete
          </el-menu-item>
        </el-submenu>

        <el-submenu index="3">
          <template slot="title">
            <i class="el-icon-ali-tag"></i>
            <span slot="title">Tag</span>
          </template>
          <el-menu-item index="3-1">
            <span slot="title">Add</span>
          </el-menu-item>
          <el-menu-item index="3-2">
            Edit
          </el-menu-item>
          <el-menu-item index="3-3">
            Delete
          </el-menu-item>
        </el-submenu>

        <el-submenu index="4">
          <template slot="title">
            <i class="el-icon-ali-category"></i>
            <span slot="title">Category</span>
          </template>
          <el-menu-item index="4-1">
            <span slot="title">Add</span>
          </el-menu-item>
          <el-menu-item index="4-2">
            Edit
          </el-menu-item>
          <el-menu-item index="4-3">
            Delete
          </el-menu-item>
        </el-submenu>

        <el-menu-item index="5">
          <router-link to="/admin/dashboard">
            <i class="el-icon-ali-comment"></i>
            <span>Comment</span>
          </router-link>
        </el-menu-item>

        <el-menu-item>test</el-menu-item>
        <el-menu-item>test</el-menu-item>
        <el-menu-item>test</el-menu-item>
        <el-menu-item>test</el-menu-item>
        <el-menu-item>test</el-menu-item>
        <el-menu-item>test</el-menu-item>
      </el-menu>
    </el-scrollbar>
  </div>
</template>

<script>
  export default {
    name: 'Sidebar',
    data() {
      return {
        isCollapse: true
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
