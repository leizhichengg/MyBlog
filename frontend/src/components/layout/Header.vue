<template>
  <div class="m-header m-img">
    <div class="m-heading">
      <h1>My Blog</h1>
      <span class="subheading">Where there's a will, there's a way.</span>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Header'
  }
</script>

<style scoped>
  .m-header {
    background: #ccc url("../../assets/img/home-bg.jpg") scroll;
    background-size: cover;
    padding: 0 50px;
    width: 1200px;
    margin-left: -28px;
    margin-top: -68px;
  }

  .m-img {
    max-width: 100%;
    height: auto;
  }

  .m-heading {
    padding: 50px 0;
    color: white;
    margin-top: 0px;
    font-size: 50px;
  }

  .subheading {
    font-size: 18px;
    line-height: 1.1;
    display: block;
    font-weight: 300;
    margin-top: -30px;
  }
</style>
