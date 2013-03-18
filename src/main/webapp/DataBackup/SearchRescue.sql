-- phpMyAdmin SQL Dump
-- version 3.3.7
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2013 年 03 月 18 日 06:31
-- 服务器版本: 5.6.5
-- PHP 版本: 5.2.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `searchrescue`
--
CREATE DATABASE `searchrescue` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `searchrescue`;

-- --------------------------------------------------------

--
-- 表的结构 `beaconinfo`
--

CREATE TABLE IF NOT EXISTS `beaconinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `beacon_No` char(50) COLLATE utf8_bin DEFAULT NULL,
  `State` tinyint(4) DEFAULT '0' COMMENT '1为空闲，2为出租，3为购买，4为报废',
  `last_Update_Time` datetime DEFAULT NULL,
  `last_Update_By_User_Style` tinyint(4) DEFAULT '0' COMMENT '1为管理员，2为信标管理员，3为注册用户',
  `last_Update_By_User_ID` bigint(20) DEFAULT '0',
  `version` bigint(20) NOT NULL,
  `is_Deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`,`version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

--
-- 转存表中的数据 `beaconinfo`
--


-- --------------------------------------------------------

--
-- 表的结构 `idinfo`
--

CREATE TABLE IF NOT EXISTS `idinfo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_Info_ID` bigint(20) unsigned DEFAULT '0',
  `sex` tinyint(4) DEFAULT '0',
  `nation` char(20) COLLATE utf8_bin DEFAULT NULL,
  `nation_ID` int(11) DEFAULT '0',
  `birthday` date DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` char(20) COLLATE utf8_bin DEFAULT NULL,
  `cer_No` char(25) COLLATE utf8_bin DEFAULT NULL,
  `authority` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `effec_Duration` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `start_Time` datetime DEFAULT NULL,
  `end_Time` datetime DEFAULT NULL,
  `photo` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `photo_Path` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `remark` text COLLATE utf8_bin,
  `register_Time` datetime DEFAULT NULL,
  `register_IP` char(40) COLLATE utf8_bin DEFAULT NULL,
  `last_Login_IP` char(40) COLLATE utf8_bin DEFAULT NULL,
  `last_Login_Time` datetime DEFAULT NULL,
  `version` bigint(20) unsigned DEFAULT NULL,
  `is_Deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userInfo_Id` (`user_Info_ID`),
  KEY `cer_No` (`cer_No`),
  KEY `version` (`version`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `idinfo`
--

INSERT INTO `idinfo` (`id`, `user_Info_ID`, `sex`, `nation`, `nation_ID`, `birthday`, `address`, `phone`, `cer_No`, `authority`, `effec_Duration`, `start_Time`, `end_Time`, `photo`, `photo_Path`, `remark`, `register_Time`, `register_IP`, `last_Login_IP`, `last_Login_Time`, `version`, `is_Deleted`) VALUES
(1, 0, 1, '汉族', 0, '1989-06-28', NULL, NULL, NULL, 'sadf', '20年', '2008-03-14 00:00:00', '2023-03-14 00:00:00', NULL, NULL, '', NULL, NULL, NULL, NULL, 0, 0);

-- --------------------------------------------------------

--
-- 表的结构 `leaseinfo`
--

CREATE TABLE IF NOT EXISTS `leaseinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_ID` bigint(20) DEFAULT '0',
  `beacon_ID` bigint(20) DEFAULT '0',
  `start_Date` datetime DEFAULT NULL,
  `return_Date` datetime DEFAULT NULL,
  `remark` text COLLATE utf8_bin,
  `version` bigint(20) NOT NULL DEFAULT '0',
  `is_Returned` tinyint(4) DEFAULT '0',
  `is_Deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `userID` (`user_ID`,`beacon_ID`,`version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

--
-- 转存表中的数据 `leaseinfo`
--


-- --------------------------------------------------------

--
-- 表的结构 `passportinfo`
--

CREATE TABLE IF NOT EXISTS `passportinfo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `userInfo_ID` bigint(20) unsigned DEFAULT '0',
  `authority` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `authority_ID` int(10) unsigned DEFAULT '0' COMMENT '发证国或组织',
  `passport_No` char(40) COLLATE utf8_bin DEFAULT NULL,
  `nationality` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `nation_ID` int(11) DEFAULT '0',
  `birthday` datetime DEFAULT NULL,
  `sex` tinyint(3) unsigned DEFAULT '0',
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` char(30) COLLATE utf8_bin DEFAULT NULL,
  `issue_Date` datetime DEFAULT NULL,
  `effec_ Duration` datetime DEFAULT NULL,
  `signature` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `photo` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `photo_Path` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `remark` int(11) DEFAULT NULL,
  `register_IP` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `register_Time` datetime DEFAULT NULL,
  `last_Login_IP` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `last_Login_Time` datetime DEFAULT NULL,
  `version` bigint(20) unsigned NOT NULL DEFAULT '0',
  `is_Deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `userIndo_ID` (`userInfo_ID`,`version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

--
-- 转存表中的数据 `passportinfo`
--


-- --------------------------------------------------------

--
-- 表的结构 `userinfo`
--

CREATE TABLE IF NOT EXISTS `userinfo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_Name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `real_Name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `Cer_Style` tinyint(4) NOT NULL DEFAULT '0',
  `User_Style` tinyint(4) NOT NULL DEFAULT '0',
  `Cipher` char(40) COLLATE utf8_bin DEFAULT NULL,
  `version` bigint(20) unsigned DEFAULT NULL,
  `is_Deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=13 ;

--
-- 转存表中的数据 `userinfo`
--

INSERT INTO `userinfo` (`id`, `user_Name`, `password`, `real_Name`, `Cer_Style`, `User_Style`, `Cipher`, `version`, `is_Deleted`) VALUES
(1, 'momo1', NULL, '', 1, 1, 'momo1', 1, 0),
(8, 'yuanmomo', '123456', '袁鸿彬', 1, 3, 'e10adc3949ba59abbe56e057f20f883e', 0, 0),
(11, 'yuanmomo2', '123123', '袁鸿彬', 1, 3, '4297f44b13955235245b2497399d7a93', 0, 0),
(12, 'yuanmomo3', '123123', '袁鸿彬', 1, 3, '4297f44b13955235245b2497399d7a93', 0, 0);
