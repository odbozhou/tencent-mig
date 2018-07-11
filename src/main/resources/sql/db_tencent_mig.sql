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


-- 导出  表 db_tencent_mig.tb_department 结构
CREATE TABLE IF NOT EXISTS `tb_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_id` int(10) unsigned NOT NULL COMMENT '部门id',
  `name` varchar(50) NOT NULL COMMENT '部门名称',
  `sub_name` varchar(50) NOT NULL COMMENT '子部门名称',
  `job_prefix` varchar(50) NOT NULL COMMENT '职位名称前缀',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='部门信息';

-- 数据导出被取消选择。


-- 导出  表 db_tencent_mig.tb_job 结构
CREATE TABLE IF NOT EXISTS `tb_job` (
  `id` varchar(20) NOT NULL,
  `title` varchar(100) NOT NULL,
  `title_prefix` varchar(50) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `dept_name` varchar(50) DEFAULT NULL,
  `sub_dept_name` varchar(50) DEFAULT NULL,
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
-- 正在导出表  db_tencent_mig.tb_department 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `tb_department` DISABLE KEYS */;
INSERT INTO `tb_department` (`id`, `dept_id`, `name`, `sub_name`, `job_prefix`) VALUES
	(1, 1, '腾讯安全', '无线安全产品部', 'MIG08'),
	(2, 1, '腾讯安全', '科恩实验室', '19157'),
	(3, 1, '腾讯安全', '桌面安全产品部（非医疗）', 'MIG07'),
	(4, 1, '腾讯安全', '安全云部', 'MIG13'),
	(5, 1, '腾讯安全', '信息安全行业产品中心', '16078'),
	(6, 1, '腾讯安全', '玄武实验室', '15503'),
	(7, 2, 'MIX', '移动浏览器产品部（成都）', 'MIG09'),
	(8, 2, 'MIX', '地图平台部', 'MIG16'),
	(9, 2, 'MIX', '智能平台产品部', 'MIG15'),
	(10, 3, '应用分发', '移动应用平台部', 'MIG06'),
	(11, 3, '应用分发', '移动商业产品部', 'MIG18'),
	(12, 4, '互联网+', '互联网+合作事业部', '19116'),
	(13, 5, '互联网医疗', '医疗资讯产品中心', '21882'),
	(14, 6, '智能硬件', '智能平台产品部', 'MIG15'),
	(15, 6, '智能硬件', '智能创新业务部', '20718'),
	(16, 7, '支撑平台', '移动互联网市场部', 'MIG05'),
	(17, 7, '支撑平台', '移动互联网事业群办公室', 'MIG01'),
	(18, 7, '支撑平台', 'MIG战略组', 'MIG02'),
	(19, 7, '支撑平台', '无线研发部', 'MIG03'),
	(20, 7, '支撑平台', '运营商业务部', 'MIG10'),
	(21, 7, '支撑平台', '无线合作开发部', 'MIG04'),
	(22, 7, '支撑平台', '无线运营部\r\n', 'MIG12');
/*!40000 ALTER TABLE `tb_department` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

