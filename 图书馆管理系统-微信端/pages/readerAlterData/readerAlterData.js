// pages/readerAlterData/readerAlterData.js
var app = getApp()
Page({
  /**
   * 页面的初始数据
   */
  data: {
    user: {}
  },
  onLoad: function(e) {
    this.setData({
      user: app.global.user
    });
  },
  goAlter: function(e) {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/user/updateUser',
      method: 'post',
      data: e.detail.value,
      header: app.global.header,
      success: function(res) {
        console.log(res)
        if (that.parseInfo(res)) {
          wx.showToast({
            title: '修改成功',
          })
        } else {
          wx.showToast({
            title: '修改失败',
          })
        }
      }
    })
  },
  goIndex: function() {
    wx.navigateTo({
      url: '/pages/index1/index1',
    })
  },
  parseInfo: function(value) {
    var code = value.data.resultCode;
    if (code == 0)
      return true;
    this.toast("请求失败，原因：" + value.data.message);
    return false;
  },
  toast: function(msg) {
    wx.showToast({
      title: msg,
      icon: 'loading',
      duration: 2000
    })
  }
})