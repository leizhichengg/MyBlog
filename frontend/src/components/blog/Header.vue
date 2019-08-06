<template>
  <header class="m-header">
    <div class="container">
      <div class="m-heading">
        <h1>My Blog</h1>
        <span class="subheading">Where there's a will, there's a way.</span>
      </div>
    </div>
  </header>
</template>

<script>
  export default {
    name: 'Header'
  }
</script>

<style scoped>
  .m-header {
    background: #ccc url("/static/img/home-bg.jpg") scroll;
    background-size: cover;
    /*padding: 0 20px;*/
    /*width: 1400px;*/
    /*margin-left: -8px;*/
    /*margin-right: -10px;*/
    margin-top: -60px;
  }

  .m-heading {
    padding: 100px 0;
    color: white;
    /*margin-top: 0px;*/
    font-size: 50px;
  }

  .subheading {
    font-size: 20px;
    /*line-height: 1.1;*/
    display: block;
    /*font-weight: 300;*/
    /*margin-top: -30px;*/
  }
</style>
