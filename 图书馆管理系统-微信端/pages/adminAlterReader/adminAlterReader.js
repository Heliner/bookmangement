// pages/adminOutReader/adminOutReader.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    user: {
      userId: '',
      userName: '',
      // password: '',
      email: '',
      max: '',
      time: '',
      lendedNum: '',
      phone: '',
      major: '',
      departments: ''
    },
    inputflag: true
  },

  getInput: function(e) {
    var that = this

    wx.request({
      url: 'http://localhost:8080/sysAdmin/oneUser',
      method: 'post', header: app.global.header,
      data: {
        userId: e.detail.value
      },
      success: function(res) {
        if (app.parseInfo(res)&&res.data.data!=null) {
          that.setData({
            user: res.data.data,
            
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
  goAlterReader: function(e) {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/sysAdmin/updateUser',
      method: 'post', header: app.global.header,
      data: e.detail.value,
      success: function(res) {
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