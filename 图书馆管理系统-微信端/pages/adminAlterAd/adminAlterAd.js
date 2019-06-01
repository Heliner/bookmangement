// pages/adminOutReader/adminOutReader.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    adinfo: {
      adid: '',
      adname: '',
      adpassword: '',
      adphone: '',
      ademail: ''
    },
    inputflag: true
  },

  getInput: function (e) {
    var that = this

    wx.request({
      url: 'http://localhost:8080/sysAdmin/oneBookAdmin',
      method: 'post', header: app.global.header,
      data:{adid:e.detail.value},
      success: function (res) {
        console.log(res);
        if (app.parseInfo(res)&&res.data.data!=null) {
          that.setData({
            adinfo: res.data.data,
            inputflag: false
          })
          wx.showToast({
            title: '请修改',
          })
        } else {
          wx.showToast({
            title: 'ID不存在',
          })
        }
      }
    })
  },
  goAlterAd: function (e) {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/sysAdmin/updateBookAdmin',
      method: 'post',
      data: e.detail.value, header: app.global.header,
      success: function (res) {
        if (app.parseInfo(res)) {
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
  }
})