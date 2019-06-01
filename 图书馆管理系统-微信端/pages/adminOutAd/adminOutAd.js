// pages/adminAddAd/adminAddAd.js
var app = getApp()
Page({
  data: {},
  goOutAd: function(e) {
    var that = this
    wx.request({
      url: 'http://localhost:8080/sysAdmin/deleteBookAdmin',
      method: 'post', header: app.global.header,
      data: e.detail.value,
      success: function(res) {
        if (app.parseInfo(res)) {
          app.toast("删除成功");
        }
      }
    })
  }
})