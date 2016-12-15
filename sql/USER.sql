/*
Navicat MySQL Data Transfer

Source Server         : new-zxd
Source Server Version : 50714
Source Host           : 99.48.18.214:3306
Source Database       : zxd_mgt

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2016-12-14 18:24:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `USER`
-- ----------------------------
DROP TABLE IF EXISTS `USER`;
CREATE TABLE `USER` (
  `no` varchar(100) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `first_login_time` datetime DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `delete_flag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
