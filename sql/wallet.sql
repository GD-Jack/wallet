/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : wallet

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 19/06/2023 13:49:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_wallet
-- ----------------------------
DROP TABLE IF EXISTS `user_wallet`;
CREATE TABLE `user_wallet`  (
  `user_wallet_id` int(0) NOT NULL AUTO_INCREMENT,
  `user_id` int(0) NOT NULL,
  `balance` decimal(10, 2) NULL,
  PRIMARY KEY (`user_wallet_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_wallet
-- ----------------------------
INSERT INTO `user_wallet` VALUES (1, 1, 180.00);

-- ----------------------------
-- Table structure for wallet_detail
-- ----------------------------
DROP TABLE IF EXISTS `wallet_detail`;
CREATE TABLE `wallet_detail`  (
  `wallet_detail_id` int(0) NOT NULL AUTO_INCREMENT,
  `user_id` int(0) NOT NULL,
  `amount` decimal(10, 2) NOT NULL,
  PRIMARY KEY (`wallet_detail_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wallet_detail
-- ----------------------------
INSERT INTO `wallet_detail` VALUES (19, 1, -100.00);
INSERT INTO `wallet_detail` VALUES (20, 1, -100.00);
INSERT INTO `wallet_detail` VALUES (21, 1, -100.00);
INSERT INTO `wallet_detail` VALUES (22, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (23, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (24, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (25, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (26, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (27, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (28, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (29, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (30, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (31, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (32, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (33, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (34, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (35, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (36, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (37, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (38, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (39, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (40, 1, 20.00);
INSERT INTO `wallet_detail` VALUES (41, 1, -100.00);
INSERT INTO `wallet_detail` VALUES (42, 1, -100.00);

SET FOREIGN_KEY_CHECKS = 1;
