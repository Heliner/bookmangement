// pages/systemad/systemad.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
  
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },
  adminAddReader:function(){
    wx.navigateTo({
      url: '/pages/adminAddReader/adminAddReader',
    })
  }, adminOutReader: function () {
    wx.navigateTo({
      url: '/pages/adminOutReader/adminOutReader',
    })
  }, adminAlterReader: function () {
    wx.navigateTo({
      url: '/pages/adminAlterReader/adminAlterReader',
    })
  },
  adminAddAd: function () {
    wx.navigateTo({
      url: '/pages/adminAddAd/adminAddAd',
    })
  },
  adminOutAd: function () {
    wx.navigateTo({
      url: '/pages/adminOutAd/adminOutAd',
    })
  }, 
  adminAlterAd: function () {
    wx.navigateTo({
      url: '/pages/adminAlterAd/adminAlterAd',
    })
  },
  adminSearchReader: function () {
    wx.navigateTo({
      url: '/pages/adminSearchReader/adminSearchReader',
    })
  },
  adminSearchAd: function () {
    wx.navigateTo({
      url: '/pages/adminSearchAd/adminSearchAd',
    })
  },
  adminPersonal: function () {
    wx.navigateTo({
      url: '/pages/adminPersonal/adminPersonal',
    })
  },
  exit: function () {
    app.globalData.userid_adid_adminid = null,
      wx.navigateTo({
        url: '/pages/login/login',
      })

  },


})