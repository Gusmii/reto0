-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-09-2020 a las 13:49:15
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
  `piso` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `alarma`
--

INSERT INTO `alarma` (`fecha`, `piso`, `estado`) VALUES
('2020-09-22 13:48:23', 0, 0),
('2020-09-22 13:48:38', 1, 0),
('2020-09-22 13:48:54', 2, 0);

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
('22/09/2020 13:07:58', 0, 'a5', 0),
('22/09/2020 13:07:58', 0, 'a6', 0),
('22/09/2020 13:07:58', 0, 'a1', 0),
('22/09/2020 13:07:58', 0, 'a2', 0),
('22/09/2020 13:07:58', 0, 'a3', 0),
('22/09/2020 13:07:58', 0, 'a4', 0),
('22/09/2020 13:07:58', 1, 'a11', 0),
('22/09/2020 13:07:58', 1, 'a12', 0),
('22/09/2020 13:07:58', 1, 'a7', 0),
('22/09/2020 13:07:58', 1, 'a8', 0),
('22/09/2020 13:07:58', 1, 'a9', 0),
('22/09/2020 13:07:58', 1, 'a10', 0),
('22/09/2020 13:07:58', 2, 'a15', 0),
('22/09/2020 13:07:58', 2, 'a13', 0),
('22/09/2020 13:07:58', 2, 'a14', 0),
('22/09/2020 13:07:58', 2, 'a16', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
