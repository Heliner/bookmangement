// pages/readerBorrowed/readerBorrowed.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    borrowInfo: []
  },


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/user/bookUnReced',
     
      header: app.global.header,
      success: function(res) {
        if (app.parseInfo(res)) {
          that.setData({
            borrowInfo: res.data.data
          })
        };
      }
    })
  },

  goIndex: function() {
    wx.navigateTo({
      url: '/pages/index1/index1',
    })
  },

})