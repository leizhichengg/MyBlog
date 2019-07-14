<template>
  <div class="m-footer">
    <el-divider></el-divider>
    <a class="m-icon" target="_blank" href="#">
      <i class="el-icon-ali-github"></i>
    </a>
    &nbsp;&nbsp;
    <a class="m-icon" target="_blank" href="#">
      <i class="el-icon-ali-linkedin"></i>
    </a>
    <br>
    <p>Copyright © lzc Blog 2019</p>
    <p>Designed by lzc</p>
  </div>
</template>

<script>
  export default {
    name: 'Footer',
    data () {
      return {}
    }
  }
</script>

<style scoped>
  .m-footer {
    font-size: 16px;
  }

  .m-icon {
    color: black;
  }
</style>
