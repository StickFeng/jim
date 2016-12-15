Date: 2016-12-14 18:25:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `OPERATION_LOG`
-- ----------------------------
DROP TABLE IF EXISTS `OPERATION_LOG`;
CREATE TABLE `OPERATION_LOG` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `content` varchar(2000) DEFAULT NULL,
  `timestamp` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=253907 DEFAULT CHARSET=utf8;