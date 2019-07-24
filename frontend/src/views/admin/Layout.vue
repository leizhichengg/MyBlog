<template>
  <div class="a-layout">


    <sidebar class="sidebar-container"/>
    <div class="main-container">
      <navbar/>
    </div>
  </div>

</template>

<script>
  import Sidebar from '../../components/admin/sidebar/Sidebar'
  import Navbar from '../../components/admin/Navbar'
  export default {
    name: 'Layout',
    components: {Navbar, Sidebar}
  }
</script>

<style scoped>
  .sidebar-container {
    transition: width 0.28s;
    width: 200px !important;
    background-color: #fff;
    height: 100%;
    position: fixed;
    font-size: 0px;
    top: 0;
    bottom: 0;
    left: 0;
    z-index: 1001;
    overflow: hidden;
  }

  .main-container {
    min-height: 100%;
    margin-left: 192px;
    margin-top: -8px;
    position: relative;
    transition: margin-left .28s;
  }
</style>
