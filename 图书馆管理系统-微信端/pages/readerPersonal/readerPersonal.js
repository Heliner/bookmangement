// pages/readerPersonal/readerPersonal.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
     user:{}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    this.setData({
      user: app.global.user
    })
  },

goIndex:function(){
   wx.navigateTo({
     url: '/pages/index1/index1',
   })
},


  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

})