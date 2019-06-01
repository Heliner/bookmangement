// pages/searchResult/searchResult.js
var app = getApp()
Page({
  data: {
    value: null,
    content: '',
    currentPage: 1,
    tableData: []
  },
  goPersonal: function() {
    wx.switchTab({
      url: '/pages/readerPersonal/readerPersonal',
    })
  },
  dec: function() {
    this.setData({
      currentPage: this.data.currentPage - 1
    })
  },
  inc: function() {
    this.setData({
      currentPage: this.data.currentPage + 1
    })
  },
  search: function(e) {
    var that = this;
    wx.request({
      url: "http://localhost:8080/searchResult",
      method: 'post',
      data: {
        content: e.detail.value.content,
        currentPage: e.detail.value.currentPage
      }, header: app.global.header,
      success: function(value) {
        if (app.parseInfo(value)) {
          var s_data = value.data.data;
          that.setData({
            tableData: s_data.data,
            currentPage: s_data.currentPage
          })
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onReady: function(options) {
    console.log("ready:")
    this.setData({
      tableData: app.global.searchBookResult.tableData,
      currentPage: app.global.searchBookResult.currentPage
    })
  },

})