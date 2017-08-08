# Host: localhost  (Version 5.6.37)
# Date: 2017-08-08 11:13:14
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "city"
#

DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `citycode` varchar(10) NOT NULL,
  `cityname` varchar(30) NOT NULL,
  `nameen` varchar(20) NOT NULL,
  `districten` varchar(30) NOT NULL,
  `districtcn` varchar(20) NOT NULL,
  `aqicode` int(11) DEFAULT '1',
  PRIMARY KEY (`citycode`),
  KEY `aqicode` (`aqicode`),
  KEY `name` (`nameen`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='城市信息';

#
# Structure for table "cityair"
#

DROP TABLE IF EXISTS `cityair`;
CREATE TABLE `cityair` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `citycode` varchar(20) DEFAULT NULL COMMENT '城市编号',
  `times` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间',
  `aqi` int(11) DEFAULT NULL COMMENT '空气质量指数',
  `pm25` int(11) DEFAULT NULL,
  `pm10` int(11) DEFAULT NULL,
  `co` float(8,3) DEFAULT NULL,
  `so2` float(8,3) DEFAULT NULL,
  `o3` float(8,3) DEFAULT NULL,
  `no2` float(8,3) DEFAULT NULL,
  `prima` varchar(100) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '当时时间',
  PRIMARY KEY (`id`),
  KEY `aqi` (`aqi`),
  KEY `citycode` (`citycode`)
) ENGINE=MyISAM AUTO_INCREMENT=3717 DEFAULT CHARSET=utf8 COMMENT='空气质量表';

#
# Structure for table "deviceair"
#

DROP TABLE IF EXISTS `deviceair`;
CREATE TABLE `deviceair` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `devid` varchar(50) DEFAULT NULL,
  `stationname` varchar(255) DEFAULT NULL COMMENT '监测点中文',
  `citycode` varchar(50) DEFAULT NULL,
  `cityname` varchar(50) DEFAULT NULL COMMENT '城市名称',
  `times` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `aqi` int(11) DEFAULT NULL COMMENT '空气质量指数',
  `pm25` int(11) DEFAULT NULL,
  `pm10` int(11) DEFAULT NULL,
  `co` float(8,3) DEFAULT NULL,
  `so2` float(8,3) DEFAULT NULL,
  `o3` float(8,3) DEFAULT NULL,
  `no2` float(8,3) DEFAULT NULL,
  `prkey` varchar(100) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `city_dev` (`citycode`,`devid`),
  KEY `dev_time` (`devid`,`times`)
) ENGINE=MyISAM AUTO_INCREMENT=11768 DEFAULT CHARSET=utf8 COMMENT='监测点空气质量详情';

#
# Structure for table "devices"
#

DROP TABLE IF EXISTS `devices`;
CREATE TABLE `devices` (
  `devid` varchar(20) NOT NULL,
  `citycode` varchar(20) NOT NULL DEFAULT '',
  `stationname` varchar(50) DEFAULT NULL,
  `lng` varchar(50) DEFAULT NULL,
  `lat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`devid`),
  KEY `citycode` (`citycode`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='监测点列表';

#
# Structure for table "jsons"
#

DROP TABLE IF EXISTS `jsons`;
CREATE TABLE `jsons` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `jsontext` longtext NOT NULL COMMENT '请求到的数据',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '时间值',
  `status` int(11) DEFAULT '1',
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `create_time` (`create_time`)
) ENGINE=MyISAM AUTO_INCREMENT=7371 DEFAULT CHARSET=utf8 COMMENT='请求到的数据存储';

#
# Procedure "cityair_new"
#

DROP PROCEDURE IF EXISTS `cityair_new`;
CREATE PROCEDURE `cityair_new`()
begin
select id,citycode,times,aqi,pm25,pm10,co,so2,no2,o3,prima,create_time
 from cityair where times = (select times from cityair order by  times desc limit 0,1) order by aqi;
end;
