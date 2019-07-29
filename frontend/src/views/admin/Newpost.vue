<template>
  <div class="new-post-container">

    <div class="title-input">
      <el-input
        placeholder="Input Post Title ..."
        v-model="title"
        type="text"
        maxlength="80"
        show-word-limit
      ></el-input>
    </div>

    <span>Category: &nbsp;&nbsp;</span>
    <el-select v-model="category" placeholder="Select category" style="width: 260px">
      <el-option
        v-for="item in options"
        :key="item.value"
        :label="item.label"
        :value="item.value">
      </el-option>
    </el-select>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

    <span>Tags: &nbsp;&nbsp;</span>
    <el-select
      v-model="tags"
      multiple
      filterable
      allow-create
      default-first-option
      placeholder="Select tags"
      style="width: 260px">
      <el-option
        v-for="item in options1"
        :key="item.value"
        :label="item.label"
        :value="item.value">
      </el-option>
    </el-select>

    <el-row>
      <el-col :span="24">
        <div id="editor">
          <mavon-editor
            language="en"
            fontSize="16px"
            style="height: 100%">
          </mavon-editor>
        </div>
      </el-col>
    </el-row>

    <el-row>
      <el-button type="primary" class="a-button">
        fabu
      </el-button>
    </el-row>

  </div>
</template>

<script>
  import {mavonEditor} from 'mavon-editor'
  import 'mavon-editor/dist/css/index.css'

  export default {
    name: 'Newpost',
    data () {
      return {
        options: [{
          value: 'option1',
          label: 'Test'
        }],
        options1: [{
          value: 'test',
          label: 'Test'
        }],
        title: '',
        category: '',
        tags: [],
      }
    },
    components: {
      mavonEditor
    }
  }
</script>

<style scoped>
  .new-post-container {
    padding-top: 20px;
    padding-left: 20px;
    padding-right: 10px;
  }

  .title-input {
    margin-bottom: 20px;
    /*width: 500px;*/
  }

  span {
    font-weight: bold;
  }

  #editor {
    margin: auto;
    width: 100%;
    height: 800px;
    /*height: 580px;*/
    margin-top: 30px;
  }

  .a-button {
    margin-top: 20px;
  }


</style>
