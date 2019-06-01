// pages/adAddBook/adAddBook.js
var app = getApp();
Page({
  data: {
  },
  goAddReader: function (e) {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/sysAdmin/insertUser',
      data: e.detail.value,
      method: 'post', header: app.global.header,
      success: function (res) {
        console.log(e.detail.value);
        if (app.parseInfo(res)) {
          wx.showToast({
            title: '添加成功',
          })
        } else {
          wx.showToast({
            title: '添加失败',
          })
        }
      }
    })
  }
})