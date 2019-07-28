<template>
  <div class="media-container">
    <div class="title">
      <a>Media Library</a>
    </div>

    <div class="media-library">
      <el-upload
        action="https://jsonplaceholder.typicode.com/posts/"
        list-type="picture-card"
        name="te"
        multiple
        :on-preview="handlePictureCardPreview"
        :on-remove="handleRemove">
        <i class="el-icon-plus"></i>
      </el-upload>
      <el-dialog :visible.sync="dialogVisible">
        <img width="100%" :src="dialogImageUrl" alt="">
      </el-dialog>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Media',
    data() {
      return {
        dialogImageUrl: '',
        dialogVisible: false
      };
    },
    methods: {
      handleRemove(file, fileList) {
        console.log(file, fileList);
      },
      handlePictureCardPreview(file) {
        this.dialogImageUrl = file.url;
        this.dialogVisible = true;
      }
    }
  }
</script>

<style scoped>
  .media-container {
    padding-top: 20px;
    padding-left: 20px;
    padding-right: 10px;
  }

  .title {
    margin-bottom: 10px;
    text-align: left;
    font-size: 28px;
    font-weight: 400;
    color: #60748A;
  }

  .media-library {
    float: left;
  }
</style>
