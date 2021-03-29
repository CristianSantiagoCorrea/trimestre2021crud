-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 29, 2021 at 07:01 AM
-- Server version: 5.7.31
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tienda`
--

-- --------------------------------------------------------

--
-- Table structure for table `recibo`
--

DROP TABLE IF EXISTS `recibo`;
CREATE TABLE IF NOT EXISTS `recibo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `referuno` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `referidos` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `valorunidad` int(11) DEFAULT NULL,
  `unmedida` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `valorcompra` int(11) DEFAULT NULL,
  `marca` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uncompra` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `existencia` int(10) DEFAULT NULL,
  `pedido` int(10) DEFAULT NULL,
  `linea` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `descuento` int(10) DEFAULT NULL,
  `fechainicial` datetime DEFAULT NULL,
  `fechafinal` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `recibo`
--

INSERT INTO `recibo` (`id`, `descripcion`, `referuno`, `referidos`, `valorunidad`, `unmedida`, `valorcompra`, `marca`, `uncompra`, `existencia`, `pedido`, `linea`, `descuento`, `fechainicial`, `fechafinal`) VALUES
(18, 'jhgf', 'kjh', 'kjkjh', 4, 'lkj', 3, 'lkjlk', '3', 3, 3, 'lkj', 2, '2021-03-26 20:38:15', NULL),
(17, 'jhgf', 'kjh', 'kjkjh', 4, 'lkj', 3, 'lkjlk', '3', 3, 3, 'lkj', 2, '2021-03-26 20:37:38', NULL),
(14, 'kjhkjh', 'kjhkjh', 'kjh', 3, 'lkjhhh', 3, 'kjhkjh', '3', 6, 4, 'lkj', 3, '2021-03-26 19:45:22', NULL),
(15, 'jhgf', 'kjh', 'kjkjh', 4, 'lkj', 3, 'lkjlk', '3', 3, 3, 'lkj', 2, '2021-03-26 20:35:30', NULL),
(6, 'permite escribir', 'texto ejemplo', 'texto ejmplo 2', 2000, 'PL', 2500, 'fbcastle', 'ton', NULL, NULL, NULL, NULL, NULL, NULL),
(7, 'permite escribir', 'texto ejemplo', 'texto ejmplo 2', 2000, 'PL', 2500, 'fbcastle', 'ton', 1000000, NULL, NULL, NULL, NULL, NULL),
(8, 'permite escribir', 'texto ejemplo', 'texto ejmplo 2', 2000, 'PL', 2500, 'fbcastle', 'ton', 1000000, 120000, 'artirst', NULL, NULL, NULL),
(16, 'jhgf', 'kjh', 'kjkjh', 4, 'lkj', 3, 'lkjlk', '3', 3, 3, 'lkj', 2, '2021-03-26 20:36:14', NULL),
(10, 'ppppppp', 'texto ejemplo', 'texto ejmplo 2', 2000, 'PL', 2500, 'fbcastle', 'ton', 1000000, 120000, 'artirst', 10, NULL, NULL),
(11, 'permite escribir', 'texto ejemplo', 'texto ejmplo 2', 2000, 'PL', 2500, 'fbcastle', 'ton', 1000000, 120000, 'artirst', 10, '2021-03-25 15:43:00', NULL),
(12, 'kjhkjh', 'kjh', 'kjh', 2, 'lkj', 2, 'lkjlk', '2', 4, 3, 'lkj', 1, '2021-03-25 21:00:37', NULL),
(13, 'pppppppp', 'kjh', 'kjh', 23, 'lkj', 2, 'lkjlk', '2', 4, 3, 'lkj', 21, '2021-03-25 21:04:04', NULL),
(19, 'jhgf', 'kjh', 'kjkjh', 4, 'lkj', 3, 'lkjlk', '3', 3, 3, 'lkj', 2, '2021-03-26 20:38:35', NULL),
(20, 'jhgf', 'kjh', 'kjkjh', 4, 'lkj', 3, 'lkjlk', '3', 3, 3, 'lkj', 2, '2021-03-26 20:38:45', NULL),
(21, 'jhgf', 'kjh', 'kjkjh', 4, 'lkj', 3, 'lkjlk', '3', 3, 3, 'lkj', 2, '2021-03-26 20:39:06', NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
