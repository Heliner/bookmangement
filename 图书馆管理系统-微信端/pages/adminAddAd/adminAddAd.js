// pages/adminAddAd/adminAddAd.js
var app=getApp()
Page({
  data: {
  },
  goAddAd:function(e){
    var that = this
    wx.request({
      url: 'http://localhost:8080/sysAdmin/insertBookAdmin',
      method: 'post', header: app.global.header,
      data:e.detail.value,
      success: function (res) {
        if (app.parseInfo(res)) {
          wx.showToast({
            title: '添加成功',
          })
        }
      }
    })
  }
})