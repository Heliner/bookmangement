// pages/Bookad/Bookad.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
  
  },
  adBorrowBook:function(){
    wx.navigateTo({
      url: '/pages/adBorrowBook/adBorrowBook'
    }) 
  },
  adReturnBook: function () {
    wx.navigateTo({
      url: '/pages/adReturnBook/adReturnBook'
    })
  },
  adAddBook: function () {
    wx.navigateTo({
      url: '/pages/adAddBook/adAddBook'
    })
  },
  adOutBook: function () {
    wx.navigateTo({
      url: '/pages/adOutBook/adOutBook'
    })
  },
  adAlterBook: function () {
    wx.navigateTo({
      url: '/pages/adAlterBook/adAlterBook'
    })
  },
  adCheckBook: function () {
    wx.navigateTo({
      url: '/pages/adCheckBook/adCheckBook'
    })
  },
  adSearchBook: function () {
    wx.navigateTo({
      url: '/pages/adSearchBook/adSearchBook'
    })
  },
  adPersonal: function () {
    wx.navigateTo({
      url: '/pages/adPersonal/adPersonal'
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },
  exit: function () {
    app.global.user = null,
      wx.navigateTo({
        url: '/pages/login/login',
      })

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  }
})