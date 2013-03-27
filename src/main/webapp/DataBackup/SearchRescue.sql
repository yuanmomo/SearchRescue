-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2013 年 03 月 27 日 16:28
-- 服务器版本: 5.6.5-m8
-- PHP 版本: 5.2.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `searchrescue`
--

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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=25 ;

--
-- 转存表中的数据 `beaconinfo`
--

INSERT INTO `beaconinfo` (`id`, `beacon_No`, `State`, `last_Update_Time`, `last_Update_By_User_Style`, `last_Update_By_User_ID`, `version`, `is_Deleted`) VALUES
(1, '1000002', 3, '2013-03-31 00:00:00', 3, 22, 0, 0),
(2, '1000003', 3, '2013-03-25 16:54:15', 2, 20, 0, 0),
(3, '1000004', 3, '2013-03-31 00:00:00', 3, 20, 0, 0),
(4, '1000001', 3, '2013-03-26 19:07:07', 2, 20, 0, 0),
(5, '100002', 3, '2013-03-25 17:32:42', 2, 21, 0, 0),
(6, '9999999', 3, '2013-03-31 00:00:00', 3, 22, 0, 0),
(7, '88888888', 3, '2013-03-06 00:00:00', 4, 22, 0, 0),
(8, '1000006', 4, '2013-03-25 18:17:19', 2, 22, 0, 0),
(9, '1000007', 4, '2013-03-25 18:17:19', 2, 21, 0, 0),
(10, '1000008', 4, '2013-03-25 18:17:19', 2, 22, 0, 0),
(11, '7777777', 3, '2013-03-26 19:07:07', 2, 22, 0, 0),
(12, '10000000021', 1, '2013-03-28 00:04:01', 2, 21, 0, 0),
(13, '10000000001', 1, '2013-03-28 00:05:02', 2, 21, 0, 0),
(14, '10000000005', 1, '2013-03-28 00:17:27', 2, 21, 0, 0),
(15, '10000000003', 1, '2013-03-28 00:18:10', 2, 21, 0, 0),
(16, '1000000000003', 1, '2013-03-28 00:21:17', 2, 21, 0, 0),
(17, '44444444', 1, '2013-03-28 00:23:33', 2, 21, 0, 0),
(18, '2222222', 1, '2013-03-28 00:23:33', 2, 21, 0, 0),
(19, '33333333', 1, '2013-03-28 00:23:33', 2, 21, 0, 0),
(20, '10050007', 1, '2013-03-28 00:25:12', 2, 0, 0, 0),
(21, '10050008', 1, '2013-03-28 00:25:12', 2, 0, 0, 0),
(22, '22522222', 1, '2013-03-28 00:25:12', 2, 0, 0, 0),
(23, '333533333', 1, '2013-03-28 00:25:12', 2, 0, 0, 0),
(24, '666666666', 1, '2013-03-28 00:25:34', 2, 0, 0, 0);

-- --------------------------------------------------------

--
-- 替换视图以便查看 `boughtbeacon`
--
CREATE TABLE IF NOT EXISTS `boughtbeacon` (
`user_Name` varchar(255)
,`cer_No` char(25)
,`passport_No` char(40)
,`beacon_No` char(50)
,`state` tinyint(4)
,`bought_Date` datetime
);
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=4 ;

--
-- 转存表中的数据 `idinfo`
--

INSERT INTO `idinfo` (`id`, `user_Info_ID`, `sex`, `nation`, `nation_ID`, `birthday`, `address`, `phone`, `cer_No`, `authority`, `effec_Duration`, `start_Time`, `end_Time`, `photo`, `photo_Path`, `remark`, `register_Time`, `register_IP`, `last_Login_IP`, `last_Login_Time`, `version`, `is_Deleted`) VALUES
(1, 0, 1, '汉族', 0, '1989-06-28', NULL, NULL, NULL, 'sadf', '20年', '2008-03-14 00:00:00', '2023-03-14 00:00:00', NULL, NULL, '', NULL, NULL, NULL, NULL, 0, 0),
(2, 13, 1, '汉族', 0, '2013-03-27', NULL, NULL, '12345678901234567890', 'yuanmomo7', 'yuanmomo7', '2013-03-26 00:00:00', '2013-03-27 00:00:00', NULL, NULL, '', '2013-03-19 00:01:35', '127.0.0.1', '127.0.0.1', '2013-03-19 00:01:35', 0, 0),
(3, 22, 1, '汉族', 0, '2013-03-04', NULL, NULL, '12345678901234567890', 'yuanmomo10', 'yuanmomo10', '2013-03-25 00:00:00', '2013-03-04 00:00:00', NULL, NULL, '', '2013-03-19 00:11:45', '127.0.0.1', '127.0.0.1', '2013-03-19 00:11:45', 0, 0);

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
  `effec_Duration` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `signature` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `photo` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `photo_Path` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `remark` text COLLATE utf8_bin,
  `register_IP` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `register_Time` datetime DEFAULT NULL,
  `last_Login_IP` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `last_Login_Time` datetime DEFAULT NULL,
  `version` bigint(20) unsigned NOT NULL DEFAULT '0',
  `is_Deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `userIndo_ID` (`userInfo_ID`,`version`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=3 ;

--
-- 转存表中的数据 `passportinfo`
--

INSERT INTO `passportinfo` (`id`, `userInfo_ID`, `authority`, `authority_ID`, `passport_No`, `nationality`, `nation_ID`, `birthday`, `sex`, `address`, `phone`, `issue_Date`, `effec_Duration`, `signature`, `photo`, `photo_Path`, `remark`, `register_IP`, `register_Time`, `last_Login_IP`, `last_Login_Time`, `version`, `is_Deleted`) VALUES
(1, 21, 'yuanmomo8', 0, 'yuanmomo8', 'yuanmomo8', 0, '2013-03-06 00:00:00', 1, NULL, NULL, '2013-03-05 00:00:00', 'yuanmomo8', 'yuanmomo8', NULL, NULL, '', '127.0.0.1', '2013-03-19 00:09:06', '127.0.0.1', '2013-03-19 00:09:06', 0, 0),
(2, 18, 'yuanmomo9', 0, 'yuanmomo9', 'yuanmomo9', 0, '2013-03-04 00:00:00', 2, NULL, NULL, '2013-03-04 00:00:00', 'yuanmomo9', 'yuanmomo9', NULL, NULL, '', '127.0.0.1', '2013-03-19 00:10:13', '127.0.0.1', '2013-03-19 00:10:13', 0, 0);

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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=23 ;

--
-- 转存表中的数据 `userinfo`
--

INSERT INTO `userinfo` (`id`, `user_Name`, `password`, `real_Name`, `Cer_Style`, `User_Style`, `Cipher`, `version`, `is_Deleted`) VALUES
(1, 'momo1', NULL, '', 1, 1, 'momo1', 1, 0),
(20, 'admin1', 'admin1', 'admin1', 0, 1, 'e00cf25ad42683b3df678c61f42c6bda', NULL, 0),
(21, 'admin2', 'admin2', 'admin2', 0, 2, 'c84258e9c39059a89ab77d846ddab909', 0, 0),
(22, 'admin3', 'admin3', 'admin3', 1, 3, '32cacb2f994f6b42183a1300d9a3e8d6', 0, 0);

-- --------------------------------------------------------

--
-- 视图结构 `boughtbeacon`
--
DROP TABLE IF EXISTS `boughtbeacon`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `boughtbeacon` AS (select distinct `user`.`user_Name` AS `user_Name`,`id`.`cer_No` AS `cer_No`,NULL AS `passport_No`,`beacon`.`beacon_No` AS `beacon_No`,`beacon`.`State` AS `state`,`beacon`.`last_Update_Time` AS `bought_Date` from ((`userinfo` `user` join `idinfo` `id`) join `beaconinfo` `beacon`) where ((`beacon`.`last_Update_By_User_ID` = `user`.`id`) and (`id`.`user_Info_ID` = `user`.`id`))) union (select distinct `user`.`user_Name` AS `user_Name`,NULL AS `cer_No`,`pass`.`passport_No` AS `passport_No`,`beacon`.`beacon_No` AS `beacon_No`,`beacon`.`State` AS `state`,`beacon`.`last_Update_Time` AS `bought_Date` from ((`userinfo` `user` join `passportinfo` `pass`) join `beaconinfo` `beacon`) where ((`beacon`.`last_Update_By_User_ID` = `user`.`id`) and (`pass`.`userInfo_ID` = `beacon`.`last_Update_By_User_ID`)));

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
