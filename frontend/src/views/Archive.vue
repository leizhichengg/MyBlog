<template>
  <div>
    <b-nav/>
    <div class="a-header">
      <h1 class="m-title">Archive</h1>
    </div>
    <div class="block">
      <el-timeline>
        <el-timeline-item timestamp="2018/4/12" placement="top">
          <el-card>
            <h4>更新 Github 模板</h4>
            <p>王小虎 提交于 2018/4/12 20:46</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2018/4/3" placement="top">
          <el-card>
            <h4>更新 Github 模板</h4>
            <p>王小虎 提交于 2018/4/3 20:46</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2018/4/2" placement="top">
          <el-card>
            <h4>更新 Github 模板</h4>
            <p>王小虎 提交于 2018/4/2 20:46</p>
          </el-card>
        </el-timeline-item>
      </el-timeline>
    </div>
    <b-footer/>
  </div>
</template>

<script>
  import Navbar from '@/components/layout/Navbar'
  import Footer from '@/components/layout/Footer'

  export default {
    name: 'Archive',
    data () {
      return {
        activities: [{
          content: '支持使用图标',
          timestamp: '2018-04-12 20:46',
          size: 'large',
          type: 'primary',
          icon: 'el-icon-more'
        }, {
          content: '支持自定义颜色',
          timestamp: '2018-04-03 20:46',
          color: '#0bbd87'
        }, {
          content: '支持自定义尺寸',
          timestamp: '2018-04-03 20:46',
          size: 'large'
        }, {
          content: '默认样式的节点',
          timestamp: '2018-04-03 20:46'
        }]
      }
    },
    components: {
      'b-nav': Navbar,
      'b-footer': Footer,

    }
  }
</script>

<style scoped>
  .a-header {
    background: #ccc url("../assets/img/archive-bg.jpg") scroll;
    background-size: cover;
    padding: 0 50px;
    text-align: left;
    width: 1200px;
    margin-left: -28px;
    margin-top: -136px;
    max-width: 100%;
    height: 300px;
    color: white;
  }

  .m-title {
    font-size: 45px;
    padding-top: 150px;
    text-align: center;
  }

  .block {
    padding-left: 300px;
    padding-top: 80px;
    padding-right: 300px;

  }
</style>
