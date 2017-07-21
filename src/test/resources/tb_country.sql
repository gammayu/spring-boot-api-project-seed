/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-07-21 17:11:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_country
-- ----------------------------
DROP TABLE IF EXISTS `tb_country`;
CREATE TABLE `tb_country` (
  `id` int(10) NOT NULL,
  `countryName` varchar(64) DEFAULT NULL,
  `countryCode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_country
-- ----------------------------
INSERT INTO `tb_country` VALUES ('1', '中国', 'chn');
