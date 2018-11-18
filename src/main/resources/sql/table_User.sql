/*
Navicat MySQL Data Transfer

Source Server         : localhostMysql
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : dbgril

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-11-09 17:36:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for table_user
-- ----------------------------
DROP TABLE IF EXISTS `table_user`;
CREATE TABLE `table_user` (
  `id` int(11) NOT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `passWord` varchar(50) DEFAULT NULL,
  `roleArr` text,
  `createrName` varchar(20) DEFAULT NULL,
  `createRole` varchar(20) DEFAULT NULL,
  `bindVehiclesgroup` text,
  `roleArrStr` text,
  `bindGroup` text,
  `bindVehicles` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_user
-- ----------------------------
INSERT INTO `table_user` VALUES ('1', 'sa', '123456', 'null,3,4', 'sa', '1', ',null,21312,125421,1234545,123321123,null,null,null,null,4567,12131313,213123,1212121', 'null,监控管理员,档案管理', ',null,null,null,null,null,4567', ',null,123,津AAAAAA,津AC1007,津HYY123,津Auuu11,1232132,津A10007');
INSERT INTO `table_user` VALUES ('3', 'dd', '123456', '1, ', 'sa', '0', ',', '光电车组管理', '', '');
INSERT INTO `table_user` VALUES ('5', 'ge', '123456', '1, ', 'sa', '0', '21312,,', '光电车组管理', '', '123');
INSERT INTO `table_user` VALUES ('7', '光电新亚', '123456', '3, ', 'sa', '0', ',', '监控管理员', '', '');
INSERT INTO `table_user` VALUES ('10', '新亚', '123456', '4, ', 'sa', '0', '2,123123,21312,3,1233,,', '档案管理员', '2,3', '津HXY787,123,津Aw1233');
INSERT INTO `table_user` VALUES ('12', '123123', '123456', '3, ', 'sa', '0', '213123,2,21312,123321123,3,1233,1234545,9,125421,1212121,12,12131313,,', '监控管理员', '2,3,9,12', '1232132,123,津HYY123,津Aw1233,津AC1007,津AAAAAA,津A10007,津Auuu11');
