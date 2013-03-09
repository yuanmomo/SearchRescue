-- phpMyAdmin SQL Dump
-- version 3.3.7
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2013 年 01 月 18 日 09:29
-- 服务器版本: 5.5.17
-- PHP 版本: 5.2.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

create database SearchRescue;
use SearchRescue;

--
-- 数据库: `SearchRescue`
--

-- --------------------------------------------------------

--
-- 表的结构 `beaconinfo`
--

CREATE TABLE IF NOT EXISTS `beaconinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `beacon_No` char(50) COLLATE utf8_bin DEFAULT NULL,
  `State` tinyint(4) DEFAULT '0' COMMENT '1为空闲，2为出租，3为购买，4为报废',
  `lastUpdateTime` datetime DEFAULT NULL,
  `lastUpdateByUserStyle` tinyint(4) DEFAULT '0' COMMENT '1为管理员，2为信标管理员，3为注册用户',
  `lastUpdateByUserID` bigint(20) DEFAULT '0',
  `version` bigint(20) NOT NULL,
  `isDeleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
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
  `userInfo_ID` bigint(20) unsigned DEFAULT '0',
  `sex` tinyint(4) DEFAULT '0',
  `nation` char(20) COLLATE utf8_bin DEFAULT NULL,
  `nationID` int(11) DEFAULT '0',
  `birthday` date DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` char(20) COLLATE utf8_bin DEFAULT NULL,
  `cer_No` char(25) COLLATE utf8_bin DEFAULT NULL,
  `authority` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `effec_ Duration` datetime DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `photo` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `photoPath` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `remark` text COLLATE utf8_bin,
  `registerTime` datetime DEFAULT NULL,
  `registerIP` char(40) COLLATE utf8_bin DEFAULT NULL,
  `lastLoginIP` char(40) COLLATE utf8_bin DEFAULT '',
  `lastLoginTime` datetime DEFAULT NULL,
  `version` bigint(20) unsigned DEFAULT NULL,
  `isDeleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userInfo_Id` (`userInfo_ID`),
  KEY `cer_No` (`cer_No`),
  KEY `version` (`version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

--
-- 转存表中的数据 `idinfo`
--


-- --------------------------------------------------------

--
-- 表的结构 `leaseinfo`
--

CREATE TABLE IF NOT EXISTS `leaseinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userID` bigint(20) DEFAULT '0',
  `beaconID` bigint(20) DEFAULT '0',
  `startDate` datetime DEFAULT NULL,
  `returnDate` datetime DEFAULT NULL,
  `remark` text COLLATE utf8_bin,
  `version` bigint(20) NOT NULL DEFAULT '0',
  `isReturned` tinyint(4) DEFAULT '0',
  `isDeleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `userID` (`userID`,`beaconID`,`version`)
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
  `authorityID` int(10) unsigned DEFAULT '0' COMMENT '发证国或组织',
  `passportNo` char(40) COLLATE utf8_bin DEFAULT NULL,
  `nationality` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `nationID` int(11) DEFAULT '0',
  `birthday` datetime DEFAULT NULL,
  `sex` tinyint(3) unsigned DEFAULT '0',
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `phone` char(30) COLLATE utf8_bin DEFAULT NULL,
  `issueDate` datetime DEFAULT NULL,
  `effec_ Duration` datetime DEFAULT NULL,
  `signature` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `photo` int(11) DEFAULT NULL,
  `photoPath` int(11) DEFAULT NULL,
  `remark` int(11) DEFAULT NULL,
  `registerIP` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `registerTime` datetime DEFAULT NULL,
  `lastLoginIP` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `lastLoginTime` datetime DEFAULT NULL,
  `version` bigint(20) unsigned NOT NULL DEFAULT '0',
  `isDeleted` tinyint(4) NOT NULL DEFAULT '0',
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
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `Cer_Style` tinyint(4) NOT NULL,
  `User_Style` tinyint(4) NOT NULL,
  `Cipher` char(40) COLLATE utf8_bin NOT NULL,
  `version` bigint(20) unsigned NOT NULL,
  `isDeleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

--
-- 转存表中的数据 `userinfo`
--

