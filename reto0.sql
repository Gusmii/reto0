-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-09-2020 a las 14:06:04
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reto0`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertDatosAlarma` (IN `_piso` INT)  NO SQL
INSERT INTO `alarma`(`fecha`, `piso`) VALUES (now(),_piso)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertDatosCalefaccion` (IN `_piso` INT)  NO SQL
INSERT INTO `calefaccion`(`fecha`, `piso`) VALUES (now(), _piso)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selectAllAlarma` ()  NO SQL
SELECT* FROM alarma$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selectAllCalefaccion` ()  NO SQL
SELECT * FROM calefaccion$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alarma`
--

CREATE TABLE `alarma` (
  `fecha` varchar(33) COLLATE utf8_unicode_ci NOT NULL,
  `piso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `alarma`
--

INSERT INTO `alarma` (`fecha`, `piso`) VALUES
('2020-09-18 09:58:44', 2),
('2020-09-18 10:16:33', 2),
('now()', 3),
('now()', 3),
('12:43:39 18/09/2020', 3),
('18/09/2020 12:44:50', 3),
('18/09/2020 13:50:45', 3),
('21/09/2020 07:59:58', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calefaccion`
--

CREATE TABLE `calefaccion` (
  `fecha` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `piso` int(11) NOT NULL,
  `aula` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `calefaccion`
--

INSERT INTO `calefaccion` (`fecha`, `piso`, `aula`, `estado`) VALUES
('21/09/2020 08:58:42', 0, 'a1', 0),
('21/09/2020 09:08:53', 0, 'a1', 1),
('21/09/2020 09:09:02', 0, 'a1', 0),
('21/09/2020 09:27:00', 0, 'a1', 1),
('21/09/2020 09:27:01', 0, 'a5', 0),
('21/09/2020 09:27:03', 0, 'a5', 1),
('21/09/2020 09:27:05', 0, 'a2', 0),
('21/09/2020 09:27:09', 0, 'a2', 1),
('21/09/2020 09:27:10', 0, 'a3', 0),
('21/09/2020 09:27:12', 0, 'a3', 1),
('21/09/2020 09:27:13', 0, 'a4', 0),
('21/09/2020 09:27:14', 0, 'a4', 1),
('21/09/2020 09:27:16', 0, 'a5', 0),
('21/09/2020 09:27:17', 0, 'a5', 1),
('21/09/2020 09:35:08', 0, 'a5', 1),
('21/09/2020 09:35:09', 0, 'a1', 0),
('21/09/2020 09:35:10', 0, 'a1', 1),
('21/09/2020 09:35:11', 0, 'a5', 0),
('21/09/2020 09:35:12', 0, 'a5', 1),
('21/09/2020 09:35:14', 0, 'a2', 0),
('21/09/2020 09:35:15', 0, 'a3', 1),
('21/09/2020 09:35:16', 0, 'a4', 0),
('21/09/2020 09:35:17', 0, 'a4', 1),
('21/09/2020 09:35:18', 0, 'a2', 0),
('21/09/2020 09:35:18', 0, 'a2', 1),
('21/09/2020 09:37:04', 0, 'a1', 1),
('21/09/2020 09:37:06', 0, 'a5', 0),
('21/09/2020 09:37:08', 0, 'a5', 1),
('21/09/2020 09:37:09', 0, 'a5', 0),
('21/09/2020 09:37:10', 0, 'a5', 1),
('21/09/2020 09:37:11', 0, 'a4', 0),
('21/09/2020 09:37:12', 0, 'a4', 1),
('21/09/2020 09:37:13', 0, 'a3', 0),
('21/09/2020 09:37:14', 0, 'a3', 1),
('21/09/2020 09:37:15', 0, 'a2', 0),
('21/09/2020 09:37:16', 0, 'a2', 1),
('21/09/2020 09:37:19', 0, 'a1', 0),
('21/09/2020 09:37:20', 0, 'a5', 1),
('21/09/2020 09:37:21', 0, 'a5', 0),
('21/09/2020 09:37:22', 0, 'a5', 1),
('21/09/2020 09:37:23', 0, 'a5', 0),
('21/09/2020 09:37:24', 0, 'a4', 1),
('21/09/2020 09:37:25', 0, 'a4', 0),
('21/09/2020 09:37:26', 0, 'a3', 1),
('21/09/2020 09:37:26', 0, 'a3', 0),
('21/09/2020 09:37:27', 0, 'a2', 1),
('21/09/2020 09:37:27', 0, 'a2', 0),
('21/09/2020 11:40:55', 0, 'a1', 0),
('21/09/2020 11:41:11', 2, 'a15', 1),
('21/09/2020 11:41:13', 2, 'a16', 0),
('21/09/2020 11:54:17', 0, 'a1', 0),
('21/09/2020 11:54:18', 0, 'a6', 0),
('21/09/2020 11:54:19', 0, 'a5', 0),
('21/09/2020 11:54:20', 0, 'a4', 0),
('21/09/2020 11:54:21', 0, 'a3', 0),
('21/09/2020 11:54:22', 0, 'a2', 0),
('21/09/2020 11:54:23', 1, 'a11', 0),
('21/09/2020 11:54:24', 1, 'a12', 0),
('21/09/2020 11:54:25', 1, 'a7', 0),
('21/09/2020 11:54:26', 1, 'a8', 0),
('21/09/2020 11:54:26', 1, 'a9', 0),
('21/09/2020 11:54:27', 1, 'a10', 0),
('21/09/2020 11:54:29', 2, 'a15', 0),
('21/09/2020 11:54:30', 2, 'a13', 0),
('21/09/2020 11:54:31', 2, 'a14', 0),
('21/09/2020 11:54:32', 2, 'a16', 0),
('21/09/2020 12:03:04', 0, 'a1', 1),
('21/09/2020 12:03:07', 0, 'a2', 1),
('21/09/2020 12:03:08', 0, 'a3', 1),
('21/09/2020 12:03:13', 0, 'a4', 1),
('21/09/2020 12:03:46', 0, 'a1', 0),
('21/09/2020 12:03:47', 0, 'a2', 0),
('21/09/2020 12:03:47', 0, 'a3', 0),
('21/09/2020 12:03:48', 0, 'a4', 0),
('21/09/2020 12:14:16', 0, 'a1', 1),
('21/09/2020 12:14:30', 0, 'a1', 0),
('21/09/2020 12:15:29', 0, 'a1', 1),
('21/09/2020 12:15:36', 0, 'a1', 0),
('21/09/2020 12:33:50', 0, 'a1', 1),
('21/09/2020 12:33:55', 0, 'a2', 1),
('21/09/2020 12:33:56', 0, 'a3', 1),
('21/09/2020 12:33:56', 0, 'a4', 1),
('21/09/2020 12:33:57', 0, 'a6', 1),
('21/09/2020 12:58:43', 0, 'a1', 1),
('21/09/2020 12:59:48', 0, 'a1', 1),
('21/09/2020 12:59:50', 0, 'a1', 0),
('21/09/2020 12:59:50', 0, 'a1', 1),
('21/09/2020 12:59:51', 0, 'a1', 0),
('21/09/2020 12:59:51', 0, 'a1', 1),
('21/09/2020 12:59:51', 0, 'a1', 0),
('21/09/2020 12:59:51', 0, 'a1', 1),
('21/09/2020 12:59:51', 0, 'a1', 0),
('21/09/2020 12:59:52', 0, 'a1', 1),
('21/09/2020 13:07:56', 0, 'a1', 1),
('21/09/2020 13:07:57', 0, 'a6', 1),
('21/09/2020 13:07:58', 0, 'a5', 1),
('21/09/2020 13:08:00', 0, 'a2', 1),
('21/09/2020 13:08:00', 0, 'a3', 1),
('21/09/2020 13:08:01', 0, 'a4', 1),
('21/09/2020 13:08:04', 1, 'a11', 1),
('21/09/2020 13:08:04', 1, 'a12', 1),
('21/09/2020 13:08:05', 1, 'a7', 1),
('21/09/2020 13:08:06', 1, 'a8', 1),
('21/09/2020 13:08:06', 1, 'a9', 1),
('21/09/2020 13:08:07', 1, 'a10', 1),
('21/09/2020 13:08:08', 2, 'a15', 1),
('21/09/2020 13:08:09', 2, 'a13', 1),
('21/09/2020 13:08:10', 2, 'a16', 1),
('21/09/2020 13:08:11', 2, 'a14', 1),
('21/09/2020 13:09:09', 2, 'a16', 0),
('21/09/2020 13:09:10', 2, 'a14', 0),
('21/09/2020 13:09:11', 2, 'a13', 0),
('21/09/2020 13:09:11', 2, 'a15', 0),
('21/09/2020 13:09:12', 2, 'a15', 1),
('21/09/2020 13:09:12', 2, 'a13', 1),
('21/09/2020 13:09:12', 2, 'a13', 0),
('21/09/2020 13:09:12', 2, 'a13', 1),
('21/09/2020 13:09:13', 2, 'a13', 0),
('21/09/2020 13:09:13', 2, 'a13', 1),
('21/09/2020 13:52:14', 0, 'a5', 1),
('21/09/2020 13:52:15', 0, 'a6', 1),
('21/09/2020 13:52:21', 0, 'a5', 1),
('21/09/2020 13:52:21', 0, 'a6', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
