/*
Navicat MySQL Data Transfer

Source Server         : 192.168.2.4
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : scxh

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-06-06 16:46:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `mybatis_user`
-- ----------------------------
DROP TABLE IF EXISTS `mybatis_user`;
CREATE TABLE `mybatis_user` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mybatis_user
-- ----------------------------
INSERT INTO `mybatis_user` VALUES ('1', '张三', '33');
