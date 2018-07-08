-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.13 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  8.2.0.4675
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 db_tencent_mig 的数据库结构
CREATE DATABASE IF NOT EXISTS `db_tencent_mig` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `db_tencent_mig`;


-- 导出  表 db_tencent_mig.tb_category 结构
CREATE TABLE IF NOT EXISTS `tb_category` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='工作类别';

-- 数据导出被取消选择。


-- 导出  表 db_tencent_mig.tb_job 结构
CREATE TABLE IF NOT EXISTS `tb_job` (
  `id` varchar(20) NOT NULL,
  `title` varchar(100) NOT NULL,
  `region_id` varchar(20) NOT NULL,
  `region_name` varchar(100) NOT NULL,
  `category_id` varchar(20) NOT NULL,
  `category_name` varchar(100) NOT NULL,
  `recruiting_numbers` int(10) unsigned NOT NULL,
  `is_urgently_seeking` tinyint(2) unsigned NOT NULL,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='工作信息';

-- 数据导出被取消选择。


-- 导出  表 db_tencent_mig.tb_job_detail 结构
CREATE TABLE IF NOT EXISTS `tb_job_detail` (
  `id` varchar(20) NOT NULL COMMENT 'job id',
  `requirment` text NOT NULL,
  `responsibility` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='工作详情信息';

-- 数据导出被取消选择。


-- 导出  表 db_tencent_mig.tb_region 结构
CREATE TABLE IF NOT EXISTS `tb_region` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='地区';

-- 数据导出被取消选择。
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
