/*
Navicat MySQL Data Transfer

Source Server         : localhostMysql
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : dbgril

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-10-26 17:41:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `UserId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1000', 'gsy', '123456', '123456');
INSERT INTO `t_user` VALUES ('1001', 'gsy2', '123456', '123123');
INSERT INTO `t_user` VALUES ('1002', 'gesy', '123456', '12345678900');
