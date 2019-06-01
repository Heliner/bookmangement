// pages/adminSearchReader/adminSearchReader.js
var app=getApp()
Page({
  data: {
    content: '',
    currentPage: 1,
    tableData: []
  },

  dec: function () {
    this.setData({
      currentPage: this.data.currentPage - 1
    })
  },
  inc: function () {
    this.setData({
      currentPage: this.data.currentPage + 1
    })
  },
  search: function (e) {
    var that = this;
    wx.request({
      url: "http://localhost:8080/sysAdmin/searchBookAdmin",
      method: 'post', header: app.global.header,
      data: {
        content: e.detail.value.content,
        currentPage: e.detail.value.currentPage
      },
      success: function (value) {
        if (app.parseInfo(value)) {
          var s_data = value.data.data;
          that.setData({
            tableData: s_data.data,
            currentPage: s_data.currentPage
          })
        } else {
          app.toast("图书不存在");
        }
      }
    })
  },


})