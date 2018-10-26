/*
Navicat MySQL Data Transfer

Source Server         : localhostMysql
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : dbgril

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-10-26 17:42:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `name` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('gsy', '1');
INSERT INTO `userinfo` VALUES ('gsy', '2');
