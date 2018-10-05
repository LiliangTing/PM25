
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


DROP TABLE IF EXISTS `cityair`;
CREATE TABLE `cityair`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `cityname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `times` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间',
  `aqi` int(11) NULL DEFAULT NULL COMMENT '空气质量指数',
  `pm25` int(11) NULL DEFAULT NULL,
  `pm10` int(11) NULL DEFAULT NULL,
  `co` float(8, 3) NULL DEFAULT NULL,
  `so2` float(8, 3) NULL DEFAULT NULL,
  `o3` float(8, 3) NULL DEFAULT NULL,
  `no2` float(8, 3) NULL DEFAULT NULL,
  `prima` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '当时时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `aqi`(`aqi`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 8415 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '空气质量表' ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `deviceair`;
CREATE TABLE `deviceair`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `stationname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '监测点中文',
  `cityname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `times` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `aqi` int(11) NULL DEFAULT NULL COMMENT '空气质量指数',
  `pm25` int(11) NULL DEFAULT NULL,
  `pm10` int(11) NULL DEFAULT NULL,
  `co` float(8, 3) NULL DEFAULT NULL,
  `so2` float(8, 3) NULL DEFAULT NULL,
  `o3` float(8, 3) NULL DEFAULT NULL,
  `no2` float(8, 3) NULL DEFAULT NULL,
  `prkey` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40157811 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '监测点空气质量详情' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Procedure structure for cityair_new
-- ----------------------------
DROP PROCEDURE IF EXISTS `cityair_new`;
delimiter ;;
CREATE PROCEDURE `cityair_new`()
begin
select id,citycode,times,aqi,pm25,pm10,co,so2,no2,o3,prima,create_time
 from cityair where times = (select max(times) from cityair ) order by aqi;
end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
