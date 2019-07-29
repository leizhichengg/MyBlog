<template>
  <div class="a-layout">

    <sidebar class="sidebar-container"/>
    <div class="main-container">
      <navbar/>
      <appmain/>
      <footer/>
    </div>
  </div>

</template>

<script>
  import Sidebar from '../../components/admin/Sidebar'
  import Navbar from '../../components/admin/Navbar'
  import Appmain from '../../components/admin/Appmain'
  import Footer from '../../components/admin/Footer'
  export default {
    name: 'Layout',
    components: {Footer, Appmain, Navbar, Sidebar}
  }
</script>

<style scoped>
  .sidebar-container {
    transition: width 0.28s;
    width: 230px !important;
    background-color: #2A3F54;
    height: 102%;
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
    margin: -8px -8px -8px 222px;
    /* 100% - sidebarWidth */
    width: calc(100% - 230px);
    /*height: 110%;*/
    position: absolute;
    transition: margin-left .28s;
    background-color: #f5f5f5;
  }
</style>
