/*
Navicat MySQL Data Transfer

Source Server         : mysql80
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : bookmanagement

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-05-27 10:42:13
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
  PRIMARY KEY (`AdId`),
  UNIQUE KEY `AdName` (`AdName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookadmin
-- ----------------------------
INSERT INTO `bookadmin` VALUES ('管理员3', '123', '1243', '4123', '678');
INSERT INTO `bookadmin` VALUES ('管理员2', '1234', '123', '123', '1234');
INSERT INTO `bookadmin` VALUES ('管理云3', '12344', '', '', null);

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
INSERT INTO `bookinfo` VALUES ('', '小王子', '', null, '0.00', '', '0000-00-00', '', '1', '', '0000-00-00');
INSERT INTO `bookinfo` VALUES ('123', 'xiwaognzi ', '123', 'gihjl', '12.30', '13', '0000-00-00', '', '1', '', '0000-00-00');
INSERT INTO `bookinfo` VALUES ('c1028f06-7d73-41dd-aa59-aa7d416954c3', '哈利波特', '1', '无', '10.30', 'c1028f06-7d73-41dd-aa59-aa7d416954c3', '2019-05-04', '出版社', '1', '管理员吧', '2019-05-26');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of borrowrecords
-- ----------------------------
INSERT INTO `borrowrecords` VALUES ('4', 'h3035', '123', '2019-06-05', '2019-05-26');

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

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(36) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
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
INSERT INTO `user` VALUES ('-', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('0', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('1', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('12', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('123', 'hfl', '123', '303567469@qq.com', '10', '10', '1', '67890', 'nm,jkbn', 'ujknmg,as');
INSERT INTO `user` VALUES ('3', '1', null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('4', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('5', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('6', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('7', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('8', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('9', null, null, null, null, '10', '0', null, null, null);
INSERT INTO `user` VALUES ('h3035', '韩福林', '', '303567469@qq.com', '10', '30', '-5', '157', '计算机科学与技术', '计算机');
INSERT INTO `user` VALUES ('h303567469', '韩福林', '', '303567469@qq.com', '10', '30', '0', '157', '计算机科学与工程', '计算机');
