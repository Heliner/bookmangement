/*
Navicat MySQL Data Transfer

Source Server         : mysql80
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : bookmanagement

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-01 20:10:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bookadmin
-- ----------------------------
DROP TABLE IF EXISTS `bookadmin`;
CREATE TABLE `bookadmin` (
  `AdName` varchar(255) DEFAULT NULL,
  `AdId` varchar(36) NOT NULL,
  `AdPassword` varchar(255) NOT NULL,
  `AdPhone` varchar(255) NOT NULL,
  `AdEmail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`AdId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookadmin
-- ----------------------------
INSERT INTO `bookadmin` VALUES ('管理2', '123', '123', '157233', '30356@qq.com');
INSERT INTO `bookadmin` VALUES ('管理云3', '12343', '123', '1572331', 'h3035@gmail.com');
INSERT INTO `bookadmin` VALUES ('hfl', '62370db7-82e1-11e9-835d-f48e38ea1b0a', '123', '157', '3035');
INSERT INTO `bookadmin` VALUES ('hfl', 'c6f72112-82c6-11e9-835d-f48e38ea1b0a', '123', '', '30356@qq.com');
INSERT INTO `bookadmin` VALUES ('测试用户', 'test', 'test', '1008', 'h30@qq.com');

-- ----------------------------
-- Table structure for bookinfo
-- ----------------------------
DROP TABLE IF EXISTS `bookinfo`;
CREATE TABLE `bookinfo` (
  `book_id` varchar(36) NOT NULL,
  `book_name` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `translator` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) NOT NULL,
  `isbn_code` varchar(255) NOT NULL,
  `come_up_time` date NOT NULL,
  `publish_company` varchar(255) NOT NULL,
  `state` int(10) NOT NULL DEFAULT '1' COMMENT '0借出 1在库',
  `entering_men` varchar(255) NOT NULL,
  `entering_date` date NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookinfo
-- ----------------------------
INSERT INTO `bookinfo` VALUES ('3c91bcd5-3b77-453f-9718-294405ae1c6d', '哈利波特', '不是哈利波特', '不知道', '123.40', '不知道', '2018-06-28', '人教出版社', '0', '管理员', '2019-05-30');
INSERT INTO `bookinfo` VALUES ('5b8f6243-1ee4-4485-b174-45c8dc91d449', 'Spring源码深度解析 第2版', '郝佳', '', '85.10', '9787115499141', '2019-05-08', '人民邮电出版社', '1', '管理员', '2019-05-30');
INSERT INTO `bookinfo` VALUES ('5dcb50b3-cb0c-415e-92e0-482e02c8ed29', '拯救温斯洛', '莎朗·克里奇', '', '26.40', '9787530590690', '2019-05-09', '天津人民美术出版社', '1', '管理员', '2019-05-30');
INSERT INTO `bookinfo` VALUES ('6e21b299-73e6-4a9d-b0a4-7319391c2000', '深入理解Java虚拟机：JVM高级特性与最佳实践（第2版）', '周志明', '', '72.70', '9787111421900', '2019-05-08', '机械工业出版社', '1', '管理员', '2019-05-30');
INSERT INTO `bookinfo` VALUES ('8d882e5b-480f-4493-a9ef-30a578f47d67', '政治的逻辑--马克思主义政治学原理', '王沪宁 林尚立 孙关宏', '', '62.60', '9787208052734', '2019-05-16', '人民出版社', '1', '管理员', '2019-05-30');
INSERT INTO `bookinfo` VALUES ('c1028f06-7d73-41dd-aa59-aa7d416954c3', '哈利波特', '1', '无', '10.30', 'c1028f06-7d73-41dd-aa59-aa7d416954c3', '2019-05-04', '出版社', '1', '管理员吧', '2019-05-26');
INSERT INTO `bookinfo` VALUES ('c6d5af42-d237-4305-9694-d84dd8dd411d', '许愿地球仪', '克莉丝汀娜·奥森', '', '19.50', '9787550028715', '2019-05-09', '洲文艺出版社', '1', '管理员', '2019-05-30');
INSERT INTO `bookinfo` VALUES ('cfdc538b-1a13-4bbf-b8cd-7af2f6f0080e', '侠客岛对话郑永年', '人民日报海外版“侠客岛', '', '48.80', '9787010205786', '2019-05-15', '人民出版社', '1', '管理员', '2019-05-30');
INSERT INTO `bookinfo` VALUES ('df0ccd73-cdcd-4178-a3cf-2e76cacd830f', '小王子', '作者是我', '译者不是我', '10.30', 'df0ccd73-cdcd-4178-a3cf-2e76cacd830f', '2019-05-02', '人名出版社', '1', '管理员吧', '2019-05-26');

-- ----------------------------
-- Table structure for borrowrecords
-- ----------------------------
DROP TABLE IF EXISTS `borrowrecords`;
CREATE TABLE `borrowrecords` (
  `borrow_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(36) NOT NULL,
  `book_id` varchar(36) NOT NULL,
  `should_time` date NOT NULL,
  `return_time` date DEFAULT NULL,
  PRIMARY KEY (`borrow_id`),
  UNIQUE KEY `borrow_id` (`borrow_id`,`user_id`),
  KEY `user_id` (`user_id`),
  KEY `book_id` (`book_id`),
  CONSTRAINT `borrowrecords_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `borrowrecords_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `bookinfo` (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of borrowrecords
-- ----------------------------
INSERT INTO `borrowrecords` VALUES ('9', '123', '3c91bcd5-3b77-453f-9718-294405ae1c6d', '2019-06-09', '2019-05-30');
INSERT INTO `borrowrecords` VALUES ('10', '123', '5dcb50b3-cb0c-415e-92e0-482e02c8ed29', '2019-06-09', '2019-05-30');
INSERT INTO `borrowrecords` VALUES ('11', '123', '5dcb50b3-cb0c-415e-92e0-482e02c8ed29', '2019-06-09', '2019-05-30');
INSERT INTO `borrowrecords` VALUES ('12', '123', '5b8f6243-1ee4-4485-b174-45c8dc91d449', '2019-06-09', '2019-05-30');
INSERT INTO `borrowrecords` VALUES ('13', '123', '3c91bcd5-3b77-453f-9718-294405ae1c6d', '2019-06-09', '2019-05-30');
INSERT INTO `borrowrecords` VALUES ('14', 'test', '3c91bcd5-3b77-453f-9718-294405ae1c6d', '2019-06-09', '2019-05-30');
INSERT INTO `borrowrecords` VALUES ('15', 'test', '3c91bcd5-3b77-453f-9718-294405ae1c6d', '2019-06-10', null);

-- ----------------------------
-- Table structure for systemadmin
-- ----------------------------
DROP TABLE IF EXISTS `systemadmin`;
CREATE TABLE `systemadmin` (
  `AdminId` varchar(36) NOT NULL,
  `AdminName` varchar(255) NOT NULL,
  `AdminPassword` varchar(255) NOT NULL,
  `AdminPhone` varchar(255) NOT NULL,
  `AdminEmail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`AdminId`),
  UNIQUE KEY `AdminName` (`AdminName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of systemadmin
-- ----------------------------
INSERT INTO `systemadmin` VALUES ('123', 'hfl', '123', '157233', '303569@qq.com');
INSERT INTO `systemadmin` VALUES ('test', '测试用户', 'test', '10086', '3035@qq.com');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(36) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT '123',
  `email` varchar(255) DEFAULT NULL,
  `max` int(11) DEFAULT NULL COMMENT '借阅数量上限',
  `time` int(11) DEFAULT '10' COMMENT '借阅期限上限',
  `lended_num` int(11) DEFAULT '0',
  `phone` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `departments` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', 'hf', '123', '3035674@qq.com', '10', '10', '0', '10086', '计算机科学与技术', '计算机');
INSERT INTO `user` VALUES ('417e9d87-82ac-11e9-835d-f48e38ea1b0a', 'hfl', '123456', '3035674@qq.com', '10', '30', '0', '10086', '计算机科学', '计算机');
INSERT INTO `user` VALUES ('bb28ad5b-82e1-11e9-835d-f48e38ea1b0a', 'hfl1', '123456', '3035674@qq.com', '15', '90', '0', '1', 'sjs', 'jsj');
INSERT INTO `user` VALUES ('e303567469', '韩福林', '123456', '3035674@qq.com', '10', '30', '0', '157', '计算机科学与工程', '计算机');
INSERT INTO `user` VALUES ('e5595a28-82c6-11e9-835d-f48e38ea1b0a', '韩福林', '123456', '3035674@qq.com', '10', '30', '0', '', '计算机科学', '计算机');
INSERT INTO `user` VALUES ('e5595a28-82c6-11e9-835d-f48e38ea1b0b', '李振才', '123456', '3035674@qq.com', '10', '10', '0', '157', 'jsj', 'jsj');
INSERT INTO `user` VALUES ('test', '测试用户', 'test', '3035674@qq.com', '10', '10', '1', '10086', 'jsj', 'jsj');
