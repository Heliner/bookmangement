// pages/readerAlterPwd/readerAlterPwd.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    user: {}
  },


  onLoad: function(options) {
    this.setData({
      user: app.global.user
    })
  },
  goAlterPwd: function(e) {
    wx.request({
      url: 'http://localhost:8080/user/updateValidateUser',
      data:e.detail.value,
      method: 'post',
      header: app.global.header,
      success: function(res) {
        if (app.parseInfo(res)) {
          wx.showToast({
            title: '修改密码成功',
          })
        } 
        
      }
    })
  },
  goIndex: function() {
    wx.navigateTo({
      url: '/pages/index1/index1',
    })
  }
})