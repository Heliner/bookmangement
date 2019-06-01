// pages/adAddBook/adAddBook.js
var app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
   
  },
  deleteUser: function (e) {
    wx.request({
      url: 'http://localhost:8080/sysAdmin/deleteUser',
      data: e.detail.value, header: app.global.header,
      method: 'post',
      success: function (res) {
        console.log(e.detail.value);
        if (app.parseInfo(res)) {
          wx.showToast({
            title: '删除成功',
          })
        } else {
          wx.showToast({
            title: '删除失败',
          })
        }

      }
    })
  }

})