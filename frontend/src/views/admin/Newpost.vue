<template>
  <div class="new-post-container">
    <div class="title-input">
      <el-input
        type="text"
        placeholder="Input Post Title ..."
        v-model="title"
        maxlength="80"
        show-word-limit
      >
      </el-input>
    </div>

    <div class="select-tag">
      <el-tag
        :key="tag"
        v-for="tag in dynamicTags"
        closable
        :disable-transitions="false"
        @close="handleClose(tag)">
        {{tag}}
      </el-tag>
      <el-input
        class="input-new-tag"
        v-if="inputVisible"
        v-model="inputValue"
        ref="saveTagInput"
        size="small"
        @keyup.enter.native="handleInputConfirm"
        @blur="handleInputConfirm"
      >
      </el-input>
      <el-button v-else class="button-new-tag" size="small" @click="showInput">+ New Tag</el-button>

    </div>

    <div id="editor">
      <mavon-editor
        language="en"
        fontSize="16px"
        style="height: 100%">
      </mavon-editor>
    </div>
  </div>
</template>

<script>
  import {mavonEditor} from 'mavon-editor'
  import 'mavon-editor/dist/css/index.css'

  export default {
    name: 'Newpost',
    data () {
      return {
        title: ''
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

  #editor {
    margin: auto;
    width: 100%;
    height: 800px;
    /*height: 580px;*/
    margin-top: 30px;
  }

  .select-tag {
    margin-top: 20px;
  }

  .el-tag + .el-tag {
    margin-left: 10px;
  }

  .button-new-tag {
    margin-left: 10px;
    height: 32px;
    line-height: 30px;
    padding-top: 0;
    padding-bottom: 0;
  }

  .input-new-tag {
    width: 90px;
    margin-left: 10px;
    vertical-align: bottom;
  }
</style>
