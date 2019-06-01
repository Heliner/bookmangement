// pages/adPersonal/adPersonal.js
var app = getApp()
Page({
  data: {
    inputflag: true,
    sysadmin:{
    }
  },
  onLoad: function (options) {
    this.setData({
      sysadmin: app.global.user
    })

  },
  goInput: function () {
    this.setData({
      inputflag: false
    })

  },
  goAlter: function (e) {
  var td = e.detail.value;
    wx.request({
      url: 'http://localhost:8080/sysAdmin/updateSysAdmin',
      data:e.detail.value,
      method: 'post', header: app.global.header,
      success: function (res) {
        console.log(res.data)
        if (app.parseInfo(res)) {
          wx.showToast({
            title: '修改成功',
          })
        } 

      }
    })
  }
})