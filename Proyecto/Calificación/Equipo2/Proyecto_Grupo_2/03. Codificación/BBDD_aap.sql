-- phpMyAdmin SQL Dump
-- version 5.0.4deb2+deb11u1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 24-09-2023 a las 18:47:29
-- Versión del servidor: 8.0.34
-- Versión de PHP: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `aap`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` bigint NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL,
  `cod_postal` varchar(5) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `dni` varchar(10) NOT NULL,
  `email` varchar(150) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `poblacion` varchar(50) NOT NULL,
  `provincia` varchar(50) NOT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `apellido1`, `apellido2`, `cod_postal`, `direccion`, `dni`, `email`, `nombre`, `poblacion`, `provincia`, `fecha_eliminacion`) VALUES
(1, 'Apellido1', 'Apellido2', 'Cod', 'Dirección', '1a', 'EMail', 'Nombre', 'Poblacion', 'Provincia', NULL),
(2, 'Apellido12', 'Apellido22', 'Cod2', 'Dirección2', '1a2', 'EMail2', 'Nombre2', 'Poblacion2', 'Provincia2', NULL),
(3, 'Apellido  Save', 'Apellido  Save', 'CodS', 'Dirección  Save', '11zzzzz', 'EMail  Save', 'Nombre Update 3', 'Poblacion  Save', 'Provincia  Save', NULL),
(8, 'Apellido11', 'Apellido21', 'Cod1', 'Direccion1', '1a1', 'EMail1', 'Nombre1', 'Poblacion1', 'Provincia1', NULL),
(10, 'Apellido13', 'Apellido23', 'Cod3', 'Direccion3', '1a3', 'EMail3', 'Nombre3', 'Poblacion3', 'Provincia3', NULL),
(11, 'Apellido14', 'Apellido24', 'Cod4', 'Direccion4', '1a4', 'EMail4', 'Nombre4', 'Poblacion4', 'Provincia4', NULL),
(12, 'Apellido15', 'Apellido25', 'Cod5', 'Direccion5', '1a5', 'EMail5', 'Nombre5', 'Poblacion5', 'Provincia5', NULL),
(13, 'Apellido16', 'Apellido26', 'Cod6', 'Direccion6', '1a6', 'EMail6', 'Nombre6', 'Poblacion6', 'Provincia6', NULL),
(14, 'Apellido17', 'Apellido27', 'Cod7', 'Direccion7', '1a7', 'EMail7', 'Nombre7', 'Poblacion7', 'Provincia7', NULL),
(15, 'Apellido18', 'Apellido28', 'Cod8', 'Direccion8', '1a8', 'EMail8', 'Nombre8', 'Poblacion8', 'Provincia8', NULL),
(16, 'Apellido19', 'Apellido29', 'Cod9', 'Direccion9', '1a9', 'EMail9', 'Nombre9', 'Poblacion9', 'Provincia9', NULL),
(17, 'Apellido110', 'Apellido210', 'Cod10', 'Direccion10', '1a10', 'EMail10', 'Nombre10', 'Poblacion10', 'Provincia10', NULL),
(18, 'Apellido111', 'Apellido211', 'Cod11', 'Direccion11', '1a11', 'EMail11', 'Nombre11', 'Poblacion11', 'Provincia11', NULL),
(19, 'Apellido112', 'Apellido212', 'Cod12', 'Direccion12', '1a12', 'EMail12', 'Nombre12', 'Poblacion12', 'Provincia12', NULL),
(20, 'Apellido113', 'Apellido213', 'Cod13', 'Direccion13', '1a13', 'EMail13', 'Nombre13', 'Poblacion13', 'Provincia13', NULL),
(21, 'Apellido114', 'Apellido214', 'Cod14', 'Direccion14', '1a14', 'EMail14', 'Nombre14', 'Poblacion14', 'Provincia14', NULL),
(22, 'Apellido115', 'Apellido215', 'Cod15', 'Direccion15', '1a15', 'EMail15', 'Nombre15', 'Poblacion15', 'Provincia15', NULL),
(23, 'Apellido116', 'Apellido216', 'Cod16', 'Direccion16', '1a16', 'EMail16', 'Nombre16', 'Poblacion16', 'Provincia16', NULL),
(24, 'Apellido117', 'Apellido217', 'Cod17', 'Direccion17', '1a17', 'EMail17', 'Nombre17', 'Poblacion17', 'Provincia17', NULL),
(25, 'Apellido118', 'Apellido218', 'Cod18', 'Direccion18', '1a18', 'EMail18', 'Nombre18', 'Poblacion18', 'Provincia18', NULL),
(26, 'Apellido119', 'Apellido219', 'Cod19', 'Direccion19', '1a19', 'EMail19', 'Nombre19', 'Poblacion19', 'Provincia19', NULL),
(27, 'Apellido120', 'Apellido220', 'Cod20', 'Direccion20', '1a20', 'EMail20', 'Nombre20', 'Poblacion20', 'Provincia20', NULL),
(28, 'Apellido121', 'Apellido221', 'Cod21', 'Direccion21', '1a21', 'EMail21', 'Nombre21', 'Poblacion21', 'Provincia21', NULL),
(29, 'Apellido122', 'Apellido222', 'Cod22', 'Direccion22', '1a22', 'EMail22', 'Nombre22', 'Poblacion22', 'Provincia22', NULL),
(30, 'Apellido123', 'Apellido223', 'Cod23', 'Direccion23', '1a23', 'EMail23', 'Nombre23', 'Poblacion23', 'Provincia23', NULL),
(31, 'Apellido124', 'Apellido224', 'Cod24', 'Direccion24', '1a24', 'EMail24', 'Nombre24', 'Poblacion24', 'Provincia24', NULL),
(32, 'Apellido125', 'Apellido225', 'Cod25', 'Direccion25', '1a25', 'EMail25', 'Nombre25', 'Poblacion25', 'Provincia25', NULL),
(33, 'Apellido126', 'Apellido226', 'Cod26', 'Direccion26', '1a26', 'EMail26', 'Nombre26', 'Poblacion26', 'Provincia26', NULL),
(34, 'Apellido127', 'Apellido227', 'Cod27', 'Direccion27', '1a27', 'EMail27', 'Nombre27', 'Poblacion27', 'Provincia27', NULL),
(35, 'Apellido128', 'Apellido228', 'Cod28', 'Direccion28', '1a28', 'EMail28', 'Nombre28', 'Poblacion28', 'Provincia28', NULL),
(36, 'Apellido129', 'Apellido229', 'Cod29', 'Direccion29', '1a29', 'EMail29', 'Nombre29', 'Poblacion29', 'Provincia29', NULL),
(37, 'Apellido130', 'Apellido230', 'Cod30', 'Direccion30', '1a30', 'EMail30', 'Nombre30', 'Poblacion30', 'Provincia30', NULL),
(38, 'Apellido131', 'Apellido231', 'Cod31', 'Direccion31', '1a31', 'EMail31', 'Nombre31', 'Poblacion31', 'Provincia31', NULL),
(39, 'Apellido132', 'Apellido232', 'Cod32', 'Direccion32', '1a32', 'EMail32', 'Nombre32', 'Poblacion32', 'Provincia32', NULL),
(40, 'Apellido133', 'Apellido233', 'Cod33', 'Direccion33', '1a33', 'EMail33', 'Nombre33', 'Poblacion33', 'Provincia33', NULL),
(41, 'Apellido134', 'Apellido234', 'Cod34', 'Direccion34', '1a34', 'EMail34', 'Nombre34', 'Poblacion34', 'Provincia34', NULL),
(42, 'Apellido135', 'Apellido235', 'Cod35', 'Direccion35', '1a35', 'EMail35', 'Nombre35', 'Poblacion35', 'Provincia35', NULL),
(43, 'Apellido136', 'Apellido236', 'Cod36', 'Direccion36', '1a36', 'EMail36', 'Nombre36', 'Poblacion36', 'Provincia36', NULL),
(44, 'Apellido137', 'Apellido237', 'Cod37', 'Direccion37', '1a37', 'EMail37', 'Nombre37', 'Poblacion37', 'Provincia37', NULL),
(45, 'Apellido138', 'Apellido238', 'Cod38', 'Direccion38', '1a38', 'EMail38', 'Nombre38', 'Poblacion38', 'Provincia38', NULL),
(46, 'Apellido139', 'Apellido239', 'Cod39', 'Direccion39', '1a39', 'EMail39', 'Nombre39', 'Poblacion39', 'Provincia39', NULL),
(47, 'Apellido140', 'Apellido240', 'Cod40', 'Direccion40', '1a40', 'EMail40', 'Nombre40', 'Poblacion40', 'Provincia40', NULL),
(48, 'Apellido141', 'Apellido241', 'Cod41', 'Direccion41', '1a41', 'EMail41', 'Nombre41', 'Poblacion41', 'Provincia41', NULL),
(49, 'Apellido142', 'Apellido242', 'Cod42', 'Direccion42', '1a42', 'EMail42', 'Nombre42', 'Poblacion42', 'Provincia42', NULL),
(50, 'Apellido143', 'Apellido243', 'Cod43', 'Direccion43', '1a43', 'EMail43', 'Nombre43', 'Poblacion43', 'Provincia43', NULL),
(51, 'Apellido144', 'Apellido244', 'Cod44', 'Direccion44', '1a44', 'EMail44', 'Nombre44', 'Poblacion44', 'Provincia44', NULL),
(52, 'Apellido145', 'Apellido245', 'Cod45', 'Direccion45', '1a45', 'EMail45', 'Nombre45', 'Poblacion45', 'Provincia45', NULL),
(53, 'Apellido146', 'Apellido246', 'Cod46', 'Direccion46', '1a46', 'EMail46', 'Nombre46', 'Poblacion46', 'Provincia46', NULL),
(54, 'Apellido147', 'Apellido247', 'Cod47', 'Direccion47', '1a47', 'EMail47', 'Nombre47', 'Poblacion47', 'Provincia47', NULL),
(55, 'Apellido148', 'Apellido248', 'Cod48', 'Direccion48', '1a48', 'EMail48', 'Nombre48', 'Poblacion48', 'Provincia48', NULL),
(56, 'Apellido149', 'Apellido249', 'Cod49', 'Direccion49', '1a49', 'EMail49', 'Nombre49', 'Poblacion49', 'Provincia49', NULL),
(57, 'Apellido150', 'Apellido250', 'Cod50', 'Direccion50', '1a50', 'EMail50', 'Nombre50', 'Poblacion50', 'Provincia50', NULL),
(58, 'Apellido151', 'Apellido251', 'Cod51', 'Direccion51', '1a51', 'EMail51', 'Nombre51', 'Poblacion51', 'Provincia51', NULL),
(59, 'Apellido  Save', 'Apellido  Save', 'CodS', 'Dirección  Save', '1aaa', 'EMail  Save', 'Nombre Save', 'Poblacion  Save', 'Provincia  Save', NULL),
(60, 'Apellido  Save', 'Apellido  Save', 'CodS', 'Dirección  Save', '2zzzzz', 'EMail  Save', 'Nombre Save', 'Poblacion  Save', 'Provincia  Save', NULL),
(61, 'Apellido  Save', 'Apellido  Save', 'CodS', 'Dirección  Save', '3zzzzz', 'EMail  Save', 'Nombre Save', 'Poblacion  Save', 'Provincia  Save', NULL),
(62, 'Apellido  Save', 'Apellido  Save', 'CodS', 'Dirección  Save', '4zzzzz', 'EMail  Save', 'Nombre Save', 'Poblacion  Save', 'Provincia  Save', NULL),
(66, 'Apellido  Save', 'Apellido  Save', 'CodS', 'Dirección  Save', '1cab', 'EMail  Save', 'Nombre Save 22', 'Poblacion  Save', 'Provincia  Save', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_facturas`
--

CREATE TABLE `detalles_facturas` (
  `id` bigint NOT NULL,
  `cantidad` int NOT NULL,
  `dto_porcentaje` int DEFAULT NULL,
  `iva` int NOT NULL,
  `precio_unitario` double NOT NULL,
  `producto` bigint NOT NULL,
  `factura` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `detalles_facturas`
--

INSERT INTO `detalles_facturas` (`id`, `cantidad`, `dto_porcentaje`, `iva`, `precio_unitario`, `producto`, `factura`) VALUES
(1, 1, 0, 21, 1, 1, 1),
(2, 2, 0, 21, 2, 2, 1),
(3, 3, 0, 21, 3, 3, 1),
(4, 233, 0, 4, 244, 2, 1),
(5, 22, 0, 21, 5, 1, 15),
(6, 3, 0, 21, 6, 6, 15),
(7, 1, 0, 21, 7, 7, 3),
(8, 2, 0, 21, 8, 8, 3),
(9, 3, 0, 21, 9, 9, 3),
(10, 222, 0, 4, 244, 2, 1),
(12, 22, 0, 4, 24, 2, 1),
(13, 223, 0, 4, 24, 2, 1),
(14, 22, 0, 4, 24, 2, 1),
(15, 22, 2, 4, 23, 5, 1),
(16, 252, 2, 4, 23, 6, 1),
(17, 22, 0, 21, 5, 1, 16),
(18, 3, 0, 21, 6, 6, 16),
(19, 22, 0, 21, 5, 1, 17),
(20, 3, 0, 21, 6, 6, 17),
(21, 22, 0, 21, 5, 1, 18),
(22, 3, 0, 21, 6, 6, 18),
(23, 22, 0, 21, 5, 1, 19),
(24, 3, 0, 21, 6, 6, 19),
(25, 22, 0, 21, 5, 1, 20),
(26, 3, 0, 21, 6, 6, 20),
(27, 22, 0, 21, 5, 1, 21),
(28, 3, 0, 21, 6, 6, 21),
(29, 22, 0, 21, 5, 1, 22),
(30, 3, 0, 21, 6, 6, 22),
(31, 22, 0, 21, 5, 1, 23),
(32, 3, 0, 21, 6, 6, 23),
(33, 22, 0, 21, 5, 1, 24),
(34, 3, 0, 21, 6, 6, 24),
(35, 22, 0, 21, 5, 1, 25),
(36, 3, 0, 21, 6, 6, 25),
(37, 22, 0, 21, 5, 1, 26),
(38, 3, 0, 21, 6, 6, 26),
(39, 22, 0, 21, 5, 1, 27),
(40, 3, 0, 21, 6, 6, 27),
(41, 22, 0, 21, 5, 1, 28),
(42, 3, 0, 21, 6, 6, 28);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_facturas_simplificadas`
--

CREATE TABLE `detalles_facturas_simplificadas` (
  `id` bigint NOT NULL,
  `cantidad` int NOT NULL,
  `dto_porcentaje` int DEFAULT NULL,
  `iva` int NOT NULL,
  `precio_unitario` double NOT NULL,
  `producto` bigint NOT NULL,
  `factura` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `detalles_facturas_simplificadas`
--

INSERT INTO `detalles_facturas_simplificadas` (`id`, `cantidad`, `dto_porcentaje`, `iva`, `precio_unitario`, `producto`, `factura`) VALUES
(1, 1, 0, 21, 1, 1, 1),
(2, 2, 0, 21, 2, 2, 1),
(3, 3, 0, 21, 3, 3, 1),
(4, 1, 0, 21, 4, 4, 1),
(5, 2, 0, 21, 5, 5, 2),
(6, 3, 0, 21, 6, 6, 2),
(7, 1, 0, 21, 7, 7, 3),
(8, 2, 0, 21, 8, 8, 3),
(9, 3, 0, 21, 9, 9, 3),
(10, 223, 0, 4, 24, 2, 1),
(11, 22, 2, 4, 23, 5, 1),
(12, 252, 2, 4, 23, 6, 1),
(15, 22, 0, 21, 5, 1, 13),
(16, 3, 0, 21, 6, 6, 13),
(17, 22, 0, 21, 5, 1, 14),
(18, 3, 0, 21, 6, 6, 14),
(19, 22, 0, 21, 5, 1, 15),
(20, 3, 0, 21, 6, 6, 15),
(21, 22, 0, 21, 5, 1, 16),
(22, 3, 0, 21, 6, 6, 16),
(23, 22, 0, 21, 5, 1, 17),
(24, 3, 0, 21, 6, 6, 17),
(25, 22, 0, 21, 5, 1, 18),
(26, 3, 0, 21, 6, 6, 18);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_sorteos`
--

CREATE TABLE `detalles_sorteos` (
  `id` bigint NOT NULL,
  `porcentaje_descuento` int DEFAULT NULL,
  `producto` bigint NOT NULL,
  `sorteo` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `detalles_sorteos`
--

INSERT INTO `detalles_sorteos` (`id`, `porcentaje_descuento`, `producto`, `sorteo`) VALUES
(1, 10, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` bigint NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL,
  `cod_postal` varchar(5) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `dni` varchar(10) NOT NULL,
  `email` varchar(150) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `poblacion` varchar(50) NOT NULL,
  `provincia` varchar(50) NOT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `apellido1`, `apellido2`, `cod_postal`, `direccion`, `dni`, `email`, `nombre`, `poblacion`, `provincia`, `fecha_eliminacion`) VALUES
(1, 'Apellido11', 'Apellido21', 'Cod1', 'Direccion1', '1a1', 'EMail1', 'Nombre1', 'Poblacion1', 'Provincia1', NULL),
(2, 'Apellido12', 'Apellido22', 'Cod2', 'Direccion2', '1a2', 'EMail2', 'Nombre2', 'Poblacion2', 'Provincia2', NULL),
(3, 'Apellido  Save', 'Apellido  Save', 'CodS', 'Dirección  Save', '11zzzzz', 'EMail  Save', 'Nombre Update 3', 'Poblacion  Save', 'Provincia  Save', NULL),
(4, 'Apellido14', 'Apellido24', 'Cod4', 'Direccion4', '1a4', 'EMail4', 'Nombre4', 'Poblacion4', 'Provincia4', NULL),
(5, 'Apellido15', 'Apellido25', 'Cod5', 'Direccion5', '1a5', 'EMail5', 'Nombre5', 'Poblacion5', 'Provincia5', NULL),
(6, 'Apellido16', 'Apellido26', 'Cod6', 'Direccion6', '1a6', 'EMail6', 'Nombre6', 'Poblacion6', 'Provincia6', NULL),
(7, 'Apellido17', 'Apellido27', 'Cod7', 'Direccion7', '1a7', 'EMail7', 'Nombre7', 'Poblacion7', 'Provincia7', NULL),
(8, 'Apellido18', 'Apellido28', 'Cod8', 'Direccion8', '1a8', 'EMail8', 'Nombre8', 'Poblacion8', 'Provincia8', NULL),
(9, 'Apellido19', 'Apellido29', 'Cod9', 'Direccion9', '1a9', 'EMail9', 'Nombre9', 'Poblacion9', 'Provincia9', NULL),
(10, 'Apellido110', 'Apellido210', 'Cod10', 'Direccion10', '1a10', 'EMail10', 'Nombre10', 'Poblacion10', 'Provincia10', NULL),
(11, 'Apellido111', 'Apellido211', 'Cod11', 'Direccion11', '1a11', 'EMail11', 'Nombre11', 'Poblacion11', 'Provincia11', NULL),
(12, 'Apellido112', 'Apellido212', 'Cod12', 'Direccion12', '1a12', 'EMail12', 'Nombre12', 'Poblacion12', 'Provincia12', NULL),
(13, 'Apellido113', 'Apellido213', 'Cod13', 'Direccion13', '1a13', 'EMail13', 'Nombre13', 'Poblacion13', 'Provincia13', NULL),
(14, 'Apellido114', 'Apellido214', 'Cod14', 'Direccion14', '1a14', 'EMail14', 'Nombre14', 'Poblacion14', 'Provincia14', NULL),
(15, 'Apellido115', 'Apellido215', 'Cod15', 'Direccion15', '1a15', 'EMail15', 'Nombre15', 'Poblacion15', 'Provincia15', NULL),
(16, 'Apellido116', 'Apellido216', 'Cod16', 'Direccion16', '1a16', 'EMail16', 'Nombre16', 'Poblacion16', 'Provincia16', NULL),
(17, 'Apellido117', 'Apellido217', 'Cod17', 'Direccion17', '1a17', 'EMail17', 'Nombre17', 'Poblacion17', 'Provincia17', NULL),
(18, 'Apellido118', 'Apellido218', 'Cod18', 'Direccion18', '1a18', 'EMail18', 'Nombre18', 'Poblacion18', 'Provincia18', NULL),
(19, 'Apellido119', 'Apellido219', 'Cod19', 'Direccion19', '1a19', 'EMail19', 'Nombre19', 'Poblacion19', 'Provincia19', NULL),
(20, 'Apellido120', 'Apellido220', 'Cod20', 'Direccion20', '1a20', 'EMail20', 'Nombre20', 'Poblacion20', 'Provincia20', NULL),
(21, 'Apellido121', 'Apellido221', 'Cod21', 'Direccion21', '1a21', 'EMail21', 'Nombre21', 'Poblacion21', 'Provincia21', NULL),
(22, 'Apellido122', 'Apellido222', 'Cod22', 'Direccion22', '1a22', 'EMail22', 'Nombre22', 'Poblacion22', 'Provincia22', NULL),
(23, 'Apellido123', 'Apellido223', 'Cod23', 'Direccion23', '1a23', 'EMail23', 'Nombre23', 'Poblacion23', 'Provincia23', NULL),
(24, 'Apellido124', 'Apellido224', 'Cod24', 'Direccion24', '1a24', 'EMail24', 'Nombre24', 'Poblacion24', 'Provincia24', NULL),
(25, 'Apellido125', 'Apellido225', 'Cod25', 'Direccion25', '1a25', 'EMail25', 'Nombre25', 'Poblacion25', 'Provincia25', NULL),
(26, 'Apellido126', 'Apellido226', 'Cod26', 'Direccion26', '1a26', 'EMail26', 'Nombre26', 'Poblacion26', 'Provincia26', NULL),
(27, 'Apellido127', 'Apellido227', 'Cod27', 'Direccion27', '1a27', 'EMail27', 'Nombre27', 'Poblacion27', 'Provincia27', NULL),
(28, 'Apellido128', 'Apellido228', 'Cod28', 'Direccion28', '1a28', 'EMail28', 'Nombre28', 'Poblacion28', 'Provincia28', NULL),
(29, 'Apellido129', 'Apellido229', 'Cod29', 'Direccion29', '1a29', 'EMail29', 'Nombre29', 'Poblacion29', 'Provincia29', NULL),
(30, 'Apellido130', 'Apellido230', 'Cod30', 'Direccion30', '1a30', 'EMail30', 'Nombre30', 'Poblacion30', 'Provincia30', NULL),
(31, 'Apellido131', 'Apellido231', 'Cod31', 'Direccion31', '1a31', 'EMail31', 'Nombre31', 'Poblacion31', 'Provincia31', NULL),
(32, 'Apellido132', 'Apellido232', 'Cod32', 'Direccion32', '1a32', 'EMail32', 'Nombre32', 'Poblacion32', 'Provincia32', NULL),
(33, 'Apellido133', 'Apellido233', 'Cod33', 'Direccion33', '1a33', 'EMail33', 'Nombre33', 'Poblacion33', 'Provincia33', NULL),
(34, 'Apellido134', 'Apellido234', 'Cod34', 'Direccion34', '1a34', 'EMail34', 'Nombre34', 'Poblacion34', 'Provincia34', NULL),
(35, 'Apellido135', 'Apellido235', 'Cod35', 'Direccion35', '1a35', 'EMail35', 'Nombre35', 'Poblacion35', 'Provincia35', NULL),
(36, 'Apellido136', 'Apellido236', 'Cod36', 'Direccion36', '1a36', 'EMail36', 'Nombre36', 'Poblacion36', 'Provincia36', NULL),
(37, 'Apellido137', 'Apellido237', 'Cod37', 'Direccion37', '1a37', 'EMail37', 'Nombre37', 'Poblacion37', 'Provincia37', NULL),
(38, 'Apellido138', 'Apellido238', 'Cod38', 'Direccion38', '1a38', 'EMail38', 'Nombre38', 'Poblacion38', 'Provincia38', NULL),
(39, 'Apellido139', 'Apellido239', 'Cod39', 'Direccion39', '1a39', 'EMail39', 'Nombre39', 'Poblacion39', 'Provincia39', NULL),
(40, 'Apellido140', 'Apellido240', 'Cod40', 'Direccion40', '1a40', 'EMail40', 'Nombre40', 'Poblacion40', 'Provincia40', NULL),
(41, 'Apellido141', 'Apellido241', 'Cod41', 'Direccion41', '1a41', 'EMail41', 'Nombre41', 'Poblacion41', 'Provincia41', NULL),
(42, 'Apellido142', 'Apellido242', 'Cod42', 'Direccion42', '1a42', 'EMail42', 'Nombre42', 'Poblacion42', 'Provincia42', NULL),
(43, 'Apellido143', 'Apellido243', 'Cod43', 'Direccion43', '1a43', 'EMail43', 'Nombre43', 'Poblacion43', 'Provincia43', NULL),
(44, 'Apellido144', 'Apellido244', 'Cod44', 'Direccion44', '1a44', 'EMail44', 'Nombre44', 'Poblacion44', 'Provincia44', NULL),
(45, 'Apellido145', 'Apellido245', 'Cod45', 'Direccion45', '1a45', 'EMail45', 'Nombre45', 'Poblacion45', 'Provincia45', NULL),
(46, 'Apellido146', 'Apellido246', 'Cod46', 'Direccion46', '1a46', 'EMail46', 'Nombre46', 'Poblacion46', 'Provincia46', NULL),
(47, 'Apellido147', 'Apellido247', 'Cod47', 'Direccion47', '1a47', 'EMail47', 'Nombre47', 'Poblacion47', 'Provincia47', NULL),
(48, 'Apellido148', 'Apellido248', 'Cod48', 'Direccion48', '1a48', 'EMail48', 'Nombre48', 'Poblacion48', 'Provincia48', NULL),
(49, 'Apellido149', 'Apellido249', 'Cod49', 'Direccion49', '1a49', 'EMail49', 'Nombre49', 'Poblacion49', 'Provincia49', NULL),
(50, 'Apellido150', 'Apellido250', 'Cod50', 'Direccion50', '1a50', 'EMail50', 'Nombre50', 'Poblacion50', 'Provincia50', NULL),
(51, 'Apellido151', 'Apellido251', 'Cod51', 'Direccion51', '1a51', 'EMail51', 'Nombre51', 'Poblacion51', 'Provincia51', NULL),
(52, 'Apellido152', 'Apellido252', 'Cod52', 'Direccion52', '1a52', 'EMail52', 'Nombre52', 'Poblacion52', 'Provincia52', NULL),
(53, 'Apellido153', 'Apellido253', 'Cod53', 'Direccion53', '1a53', 'EMail53', 'Nombre53', 'Poblacion53', 'Provincia53', NULL),
(54, 'Apellido154', 'Apellido254', 'Cod54', 'Direccion54', '1a54', 'EMail54', 'Nombre54', 'Poblacion54', 'Provincia54', NULL),
(55, 'Apellido155', 'Apellido255', 'Cod55', 'Direccion55', '1a55', 'EMail55', 'Nombre55', 'Poblacion55', 'Provincia55', NULL),
(56, 'Apellido156', 'Apellido256', 'Cod56', 'Direccion56', '1a56', 'EMail56', 'Nombre56', 'Poblacion56', 'Provincia56', NULL),
(57, 'Apellido157', 'Apellido257', 'Cod57', 'Direccion57', '1a57', 'EMail57', 'Nombre57', 'Poblacion57', 'Provincia57', NULL),
(58, 'Apellido158', 'Apellido258', 'Cod58', 'Direccion58', '1a58', 'EMail58', 'Nombre58', 'Poblacion58', 'Provincia58', NULL),
(59, 'Apellido159', 'Apellido259', 'Cod59', 'Direccion59', '1a59', 'EMail59', 'Nombre59', 'Poblacion59', 'Provincia59', NULL),
(60, 'Apellido160', 'Apellido260', 'Cod60', 'Direccion60', '1a60', 'EMail60', 'Nombre60', 'Poblacion60', 'Provincia60', NULL),
(61, 'Apellido161', 'Apellido261', 'Cod61', 'Direccion61', '1a61', 'EMail61', 'Nombre61', 'Poblacion61', 'Provincia61', NULL),
(62, 'Apellido162', 'Apellido262', 'Cod62', 'Direccion62', '1a62', 'EMail62', 'Nombre62', 'Poblacion62', 'Provincia62', NULL),
(63, 'Apellido163', 'Apellido263', 'Cod63', 'Direccion63', '1a63', 'EMail63', 'Nombre63', 'Poblacion63', 'Provincia63', NULL),
(64, 'Apellido164', 'Apellido264', 'Cod64', 'Direccion64', '1a64', 'EMail64', 'Nombre64', 'Poblacion64', 'Provincia64', NULL),
(65, 'Apellido165', 'Apellido265', 'Cod65', 'Direccion65', '1a65', 'EMail65', 'Nombre65', 'Poblacion65', 'Provincia65', NULL),
(66, 'Apellido166', 'Apellido266', 'Cod66', 'Direccion66', '1a66', 'EMail66', 'Nombre66', 'Poblacion66', 'Provincia66', NULL),
(67, 'Apellido167', 'Apellido267', 'Cod67', 'Direccion67', '1a67', 'EMail67', 'Nombre67', 'Poblacion67', 'Provincia67', NULL),
(68, 'Apellido168', 'Apellido268', 'Cod68', 'Direccion68', '1a68', 'EMail68', 'Nombre68', 'Poblacion68', 'Provincia68', NULL),
(69, 'Apellido169', 'Apellido269', 'Cod69', 'Direccion69', '1a69', 'EMail69', 'Nombre69', 'Poblacion69', 'Provincia69', NULL),
(70, 'Apellido170', 'Apellido270', 'Cod70', 'Direccion70', '1a70', 'EMail70', 'Nombre70', 'Poblacion70', 'Provincia70', NULL),
(71, 'Apellido171', 'Apellido271', 'Cod71', 'Direccion71', '1a71', 'EMail71', 'Nombre71', 'Poblacion71', 'Provincia71', NULL),
(72, 'Apellido172', 'Apellido272', 'Cod72', 'Direccion72', '1a72', 'EMail72', 'Nombre72', 'Poblacion72', 'Provincia72', NULL),
(73, 'Apellido173', 'Apellido273', 'Cod73', 'Direccion73', '1a73', 'EMail73', 'Nombre73', 'Poblacion73', 'Provincia73', NULL),
(74, 'Apellido174', 'Apellido274', 'Cod74', 'Direccion74', '1a74', 'EMail74', 'Nombre74', 'Poblacion74', 'Provincia74', NULL),
(75, 'Apellido175', 'Apellido275', 'Cod75', 'Direccion75', '1a75', 'EMail75', 'Nombre75', 'Poblacion75', 'Provincia75', NULL),
(76, 'Apellido176', 'Apellido276', 'Cod76', 'Direccion76', '1a76', 'EMail76', 'Nombre76', 'Poblacion76', 'Provincia76', NULL),
(77, 'Apellido177', 'Apellido277', 'Cod77', 'Direccion77', '1a77', 'EMail77', 'Nombre77', 'Poblacion77', 'Provincia77', NULL),
(78, 'Apellido178', 'Apellido278', 'Cod78', 'Direccion78', '1a78', 'EMail78', 'Nombre78', 'Poblacion78', 'Provincia78', NULL),
(79, 'Apellido179', 'Apellido279', 'Cod79', 'Direccion79', '1a79', 'EMail79', 'Nombre79', 'Poblacion79', 'Provincia79', NULL),
(80, 'Apellido180', 'Apellido280', 'Cod80', 'Direccion80', '1a80', 'EMail80', 'Nombre80', 'Poblacion80', 'Provincia80', NULL),
(81, 'Apellido181', 'Apellido281', 'Cod81', 'Direccion81', '1a81', 'EMail81', 'Nombre81', 'Poblacion81', 'Provincia81', NULL),
(82, 'Apellido182', 'Apellido282', 'Cod82', 'Direccion82', '1a82', 'EMail82', 'Nombre82', 'Poblacion82', 'Provincia82', NULL),
(83, 'Apellido183', 'Apellido283', 'Cod83', 'Direccion83', '1a83', 'EMail83', 'Nombre83', 'Poblacion83', 'Provincia83', NULL),
(84, 'Apellido184', 'Apellido284', 'Cod84', 'Direccion84', '1a84', 'EMail84', 'Nombre84', 'Poblacion84', 'Provincia84', NULL),
(85, 'Apellido185', 'Apellido285', 'Cod85', 'Direccion85', '1a85', 'EMail85', 'Nombre85', 'Poblacion85', 'Provincia85', NULL),
(86, 'Apellido186', 'Apellido286', 'Cod86', 'Direccion86', '1a86', 'EMail86', 'Nombre86', 'Poblacion86', 'Provincia86', NULL),
(87, 'Apellido187', 'Apellido287', 'Cod87', 'Direccion87', '1a87', 'EMail87', 'Nombre87', 'Poblacion87', 'Provincia87', NULL),
(88, 'Apellido188', 'Apellido288', 'Cod88', 'Direccion88', '1a88', 'EMail88', 'Nombre88', 'Poblacion88', 'Provincia88', NULL),
(89, 'Apellido189', 'Apellido289', 'Cod89', 'Direccion89', '1a89', 'EMail89', 'Nombre89', 'Poblacion89', 'Provincia89', NULL),
(90, 'Apellido190', 'Apellido290', 'Cod90', 'Direccion90', '1a90', 'EMail90', 'Nombre90', 'Poblacion90', 'Provincia90', NULL),
(91, 'Apellido191', 'Apellido291', 'Cod91', 'Direccion91', '1a91', 'EMail91', 'Nombre91', 'Poblacion91', 'Provincia91', NULL),
(92, 'Apellido192', 'Apellido292', 'Cod92', 'Direccion92', '1a92', 'EMail92', 'Nombre92', 'Poblacion92', 'Provincia92', NULL),
(93, 'Apellido193', 'Apellido293', 'Cod93', 'Direccion93', '1a93', 'EMail93', 'Nombre93', 'Poblacion93', 'Provincia93', NULL),
(94, 'Apellido194', 'Apellido294', 'Cod94', 'Direccion94', '1a94', 'EMail94', 'Nombre94', 'Poblacion94', 'Provincia94', NULL),
(95, 'Apellido195', 'Apellido295', 'Cod95', 'Direccion95', '1a95', 'EMail95', 'Nombre95', 'Poblacion95', 'Provincia95', NULL),
(96, 'Apellido196', 'Apellido296', 'Cod96', 'Direccion96', '1a96', 'EMail96', 'Nombre96', 'Poblacion96', 'Provincia96', NULL),
(97, 'Apellido197', 'Apellido297', 'Cod97', 'Direccion97', '1a97', 'EMail97', 'Nombre97', 'Poblacion97', 'Provincia97', NULL),
(98, 'Apellido198', 'Apellido298', 'Cod98', 'Direccion98', '1a98', 'EMail98', 'Nombre98', 'Poblacion98', 'Provincia98', NULL),
(99, 'Apellido199', 'Apellido299', 'Cod99', 'Direccion99', '1a99', 'EMail99', 'Nombre99', 'Poblacion99', 'Provincia99', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `id` bigint NOT NULL,
  `dto_porcentaje` int DEFAULT NULL,
  `fecha` datetime(6) NOT NULL,
  `fecha_anulacion` datetime(6) DEFAULT NULL,
  `numero` bigint NOT NULL,
  `observaciones` varchar(255) DEFAULT NULL,
  `forma_pago` bigint NOT NULL,
  `cliente` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`id`, `dto_porcentaje`, `fecha`, `fecha_anulacion`, `numero`, `observaciones`, `forma_pago`, `cliente`) VALUES
(1, 0, '2023-09-18 15:39:12.000000', NULL, 1, 'Observaciones1', 1, 1),
(2, 0, '2023-09-18 15:39:12.000000', NULL, 2, 'Observaciones2', 2, 2),
(3, 0, '2023-09-18 15:39:12.000000', NULL, 3, 'Observaciones3', 1, 3),
(6, 0, '2023-09-21 19:05:41.359364', NULL, 4, 'Observaciones4', 2, 2),
(8, 0, '2023-09-21 19:14:41.056860', NULL, 5, 'Observaciones44', 2, 2),
(9, 0, '2023-09-21 19:14:57.616986', NULL, 6, 'Observaciones9', 2, 2),
(10, 0, '2023-09-21 19:15:24.802132', NULL, 7, 'Observaciones9', 1, 2),
(14, 0, '2023-09-23 10:54:16.312437', NULL, 8, 'Observaciones9', 1, 2),
(15, 0, '2023-09-24 05:42:02.709072', NULL, 9, NULL, 2, 3),
(16, 0, '2023-09-24 05:45:37.669478', NULL, 10, NULL, 2, 3),
(17, 0, '2023-09-24 05:50:08.970327', NULL, 11, NULL, 2, 3),
(18, 0, '2023-09-24 05:52:13.378934', NULL, 12, NULL, 2, 3),
(19, 0, '2023-09-24 05:53:16.485710', NULL, 13, NULL, 2, 3),
(20, 0, '2023-09-24 05:56:12.460951', NULL, 14, NULL, 2, 3),
(21, 0, '2023-09-24 06:00:50.386838', NULL, 15, NULL, 2, 3),
(22, 0, '2023-09-24 06:01:41.575610', NULL, 16, NULL, 2, 3),
(23, 0, '2023-09-24 06:06:27.516045', NULL, 17, NULL, 2, 3),
(24, 0, '2023-09-24 06:10:13.098834', NULL, 18, NULL, 2, 3),
(25, 0, '2023-09-24 06:39:16.390298', NULL, 19, NULL, 2, 3),
(26, 0, '2023-09-24 08:18:30.734789', NULL, 20, NULL, 2, 3),
(27, 0, '2023-09-24 09:29:54.565356', NULL, 21, NULL, 2, 3),
(28, 0, '2023-09-24 12:25:09.613504', NULL, 22, NULL, 2, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas_simplificadas`
--

CREATE TABLE `facturas_simplificadas` (
  `id` bigint NOT NULL,
  `dto_porcentaje` int DEFAULT NULL,
  `fecha` datetime(6) NOT NULL,
  `fecha_anulacion` datetime(6) DEFAULT NULL,
  `numero` bigint NOT NULL,
  `observaciones` varchar(255) DEFAULT NULL,
  `forma_pago` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `facturas_simplificadas`
--

INSERT INTO `facturas_simplificadas` (`id`, `dto_porcentaje`, `fecha`, `fecha_anulacion`, `numero`, `observaciones`, `forma_pago`) VALUES
(1, 0, '2023-09-18 15:39:12.000000', NULL, 1, 'Observaciones1', 1),
(2, 0, '2023-09-18 15:39:12.000000', NULL, 2, 'Observaciones2', 2),
(3, 0, '2023-09-18 15:39:12.000000', NULL, 3, 'Observaciones3', 1),
(4, 0, '2023-09-21 19:34:38.023864', NULL, 4, 'Observaciones9', 2),
(5, 0, '2023-09-23 10:36:44.772924', NULL, 5, 'Observaciones9', 2),
(6, 0, '2023-09-23 10:53:12.495645', NULL, 6, 'Observaciones9', 2),
(7, 0, '2023-09-23 20:17:32.514427', NULL, 7, 'Observaciones7', 2),
(8, 0, '2023-09-23 20:17:50.909156', NULL, 8, 'Observaciones8', 2),
(9, 0, '2023-09-23 20:41:49.582527', NULL, 9, 'Observaciones9', 2),
(13, 0, '2023-09-24 06:35:54.739168', NULL, 10, NULL, 2),
(14, 0, '2023-09-24 06:36:43.140423', NULL, 11, NULL, 2),
(15, 0, '2023-09-24 06:38:35.639635', NULL, 12, NULL, 2),
(16, 0, '2023-09-24 06:38:50.187773', NULL, 13, NULL, 2),
(17, 0, '2023-09-24 09:30:00.955057', NULL, 14, NULL, 2),
(18, 0, '2023-09-24 12:24:47.659529', NULL, 15, NULL, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `familias_productos`
--

CREATE TABLE `familias_productos` (
  `id` bigint NOT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL,
  `nombre` varchar(50) NOT NULL,
  `familia_padre` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `familias_productos`
--

INSERT INTO `familias_productos` (`id`, `fecha_eliminacion`, `nombre`, `familia_padre`) VALUES
(1, NULL, 'FamiliaProducto1', NULL),
(2, NULL, 'FamiliaProducto2', NULL),
(3, NULL, 'FamiliaProducto 3', NULL),
(4, NULL, 'FamiliaProducto4', NULL),
(5, NULL, 'FamiliaProducto5', NULL),
(6, NULL, 'FamiliaProducto6', NULL),
(7, NULL, 'FamiliaProducto7', NULL),
(8, NULL, 'FamiliaProducto8', NULL),
(9, NULL, 'FamiliaProducto9', NULL),
(10, NULL, 'FamiliaProducto10', NULL),
(11, NULL, 'FamiliaProducto 11', NULL),
(12, NULL, 'FamiliaProducto 12', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `formas_pago`
--

CREATE TABLE `formas_pago` (
  `id` bigint NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `formas_pago`
--

INSERT INTO `formas_pago` (`id`, `nombre`) VALUES
(1, 'Efectivo'),
(2, 'Tarjeta Crédito');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `log_administracion`
--

CREATE TABLE `log_administracion` (
  `id` bigint NOT NULL,
  `entidad_id` bigint NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `mensaje` varchar(255) DEFAULT NULL,
  `operacion` bigint NOT NULL,
  `tipo_entidad` bigint NOT NULL,
  `usuario` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `log_operaciones`
--

CREATE TABLE `log_operaciones` (
  `id` bigint NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `log_operaciones`
--

INSERT INTO `log_operaciones` (`id`, `nombre`) VALUES
(1, 'Alta'),
(2, 'Baja'),
(3, 'Consulta'),
(4, 'Modificacion'),
(5, 'Eliminacion'),
(6, 'Realizacion'),
(7, 'Control');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `log_sorteos`
--

CREATE TABLE `log_sorteos` (
  `id` bigint NOT NULL,
  `entidad_id` bigint NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `mensaje` varchar(255) DEFAULT NULL,
  `operacion` bigint NOT NULL,
  `tipo_entidad` bigint NOT NULL,
  `usuario` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `log_tipo_entidad`
--

CREATE TABLE `log_tipo_entidad` (
  `id` bigint NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `log_tipo_entidad`
--

INSERT INTO `log_tipo_entidad` (`id`, `nombre`) VALUES
(1, 'LogAdministracion'),
(2, 'LogSorteos'),
(3, 'LogVentas'),
(4, 'SecLogAdministracion'),
(5, 'SecLogSorteos'),
(6, 'SecLogVentas'),
(7, 'Factura'),
(8, 'FacturaSimplificada'),
(9, 'DetalleFactura'),
(10, 'DetalleFacturaSimplificada'),
(11, 'Cliente'),
(12, 'FamiliaProducto'),
(13, 'FormaPago'),
(14, 'Producto'),
(15, 'Sorteo'),
(16, 'Participacion'),
(17, 'DetalleSorteo'),
(18, 'Empleado'),
(19, 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `log_ventas`
--

CREATE TABLE `log_ventas` (
  `id` bigint NOT NULL,
  `entidad_id` bigint NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `mensaje` varchar(255) DEFAULT NULL,
  `operacion` bigint NOT NULL,
  `tipo_entidad` bigint NOT NULL,
  `usuario` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `participaciones`
--

CREATE TABLE `participaciones` (
  `id` bigint NOT NULL,
  `fecha_anulacion` datetime(6) DEFAULT NULL,
  `fecha_max_validez` datetime(6) DEFAULT NULL,
  `numero` int NOT NULL,
  `factura_aplicacion` bigint DEFAULT NULL,
  `factura_generacion` bigint NOT NULL,
  `sorteo` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `participaciones`
--

INSERT INTO `participaciones` (`id`, `fecha_anulacion`, `fecha_max_validez`, `numero`, `factura_aplicacion`, `factura_generacion`, `sorteo`) VALUES
(1, NULL, '2023-09-29 00:00:00.000000', 1, 2, 1, 1),
(2, NULL, '2023-09-29 00:00:00.000000', 2, NULL, 2, 1),
(5, NULL, NULL, 3, NULL, 14, 1),
(6, NULL, NULL, 4, NULL, 17, 1),
(7, NULL, NULL, 5, NULL, 18, 1),
(8, NULL, NULL, 6, NULL, 19, 1),
(9, NULL, NULL, 7, NULL, 20, 1),
(10, NULL, NULL, 8, NULL, 21, 1),
(11, NULL, NULL, 9, NULL, 22, 1),
(12, NULL, NULL, 10, NULL, 23, 1),
(13, NULL, NULL, 11, NULL, 24, 1),
(14, NULL, NULL, 12, NULL, 25, 1),
(15, NULL, NULL, 13, NULL, 26, 1),
(16, NULL, NULL, 14, NULL, 27, 1),
(17, NULL, NULL, 15, NULL, 28, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` bigint NOT NULL,
  `cantidad` int DEFAULT NULL,
  `cod_barras` varchar(20) NOT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL,
  `iva` int DEFAULT NULL,
  `nombre` varchar(150) NOT NULL,
  `observaciones` varchar(255) DEFAULT NULL,
  `precio_unitario` double NOT NULL,
  `familia_producto` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `cantidad`, `cod_barras`, `fecha_eliminacion`, `iva`, `nombre`, `observaciones`, `precio_unitario`, `familia_producto`) VALUES
(1, 10000, 'cod1', NULL, 21, 'producto1', 'observaciones1', 1, 1),
(2, 10000, 'cod2', NULL, 21, 'producto2', 'observaciones2', 2, 2),
(3, 10000, 'cod33333', NULL, 21, 'producto3', 'observaciones3', 3, 2),
(4, 10000, 'cod4', NULL, 21, 'producto4', 'observaciones4', 4, 4),
(5, 10000, 'cod5', NULL, 21, 'producto5', 'observaciones5', 5, 5),
(6, 10000, 'cod6', NULL, 21, 'producto6', 'observaciones6', 6, 6),
(7, 10000, 'cod7', NULL, 21, 'producto7', 'observaciones7', 7, 7),
(8, 10000, 'cod8', NULL, 21, 'producto8', 'observaciones8', 8, 8),
(9, 10000, 'cod9', NULL, 21, 'producto9', 'observaciones9', 9, 9),
(10, 10000, 'cod10', NULL, 21, 'producto10', 'observaciones10', 10, 10),
(11, 10000, 'cod11', NULL, 21, 'producto11', 'observaciones11', 1, 1),
(12, 10000, 'cod12', NULL, 21, 'producto12', 'observaciones12', 2, 2),
(13, 10000, 'cod13', NULL, 21, 'producto13', 'observaciones13', 3, 3),
(14, 10000, 'cod14', NULL, 21, 'producto14', 'observaciones14', 4, 4),
(15, 10000, 'cod15', NULL, 21, 'producto15', 'observaciones15', 5, 5),
(16, 10000, 'cod16', NULL, 21, 'producto16', 'observaciones16', 6, 6),
(17, 10000, 'cod17', NULL, 21, 'producto17', 'observaciones17', 7, 7),
(18, 10000, 'cod18', NULL, 21, 'producto18', 'observaciones18', 8, 8),
(19, 10000, 'cod19', NULL, 21, 'producto19', 'observaciones19', 9, 9),
(20, 10000, 'cod20', NULL, 21, 'producto20', 'observaciones20', 10, 10),
(21, 10000, 'cod21,', NULL, 21, 'producto21,', 'observaciones21,', 1, 1),
(22, 10000, 'cod22', NULL, 21, 'producto22', 'observaciones22', 2, 2),
(23, 10000, 'cod23', NULL, 21, 'producto23', 'observaciones23', 3, 3),
(24, 10000, 'cod24', NULL, 21, 'producto24', 'observaciones24', 4, 4),
(25, 10000, 'cod25', NULL, 21, 'producto25', 'observaciones25', 5, 5),
(26, 10000, 'cod26', NULL, 21, 'producto26', 'observaciones26', 6, 6),
(27, 10000, 'cod27', NULL, 21, 'producto27', 'observaciones27', 7, 7),
(28, 10000, 'cod28', NULL, 21, 'producto28', 'observaciones28', 8, 8),
(29, 10000, 'cod29', NULL, 21, 'producto29', 'observaciones29', 9, 9),
(30, 10000, 'cod30', NULL, 21, 'producto30', 'observaciones30', 10, 10),
(31, 10000, 'cod31', NULL, 21, 'producto31', 'observaciones31', 1, 1),
(32, 10000, 'cod32', NULL, 21, 'producto32', 'observaciones32', 2, 2),
(33, 10000, 'cod33', NULL, 21, 'producto33', 'observaciones33', 3, 3),
(34, 10000, 'cod34', NULL, 21, 'producto34', 'observaciones34', 4, 4),
(35, 10000, 'cod35', NULL, 21, 'producto35', 'observaciones35', 5, 5),
(36, 10000, 'cod36', NULL, 21, 'producto36', 'observaciones36', 6, 6),
(37, 10000, 'cod37', NULL, 21, 'producto37', 'observaciones37', 7, 7),
(38, 10000, 'cod38', NULL, 21, 'producto38', 'observaciones38', 8, 8),
(39, 10000, 'cod39', NULL, 21, 'producto39', 'observaciones39', 9, 9),
(40, 10000, 'cod40', NULL, 21, 'producto40', 'observaciones40', 10, 10),
(41, 10000, 'cod41', NULL, 21, 'producto41', 'observaciones41', 1, 1),
(42, 10000, 'cod42', NULL, 21, 'producto42', 'observaciones42', 2, 2),
(43, 10000, 'cod43', NULL, 21, 'producto43', 'observaciones43', 3, 3),
(44, 10000, 'cod44', NULL, 21, 'producto44', 'observaciones44', 4, 4),
(45, 10000, 'cod45', NULL, 21, 'producto45', 'observaciones45', 5, 5),
(46, 10000, 'cod46', NULL, 21, 'producto46', 'observaciones46', 6, 6),
(47, 10000, 'cod47', NULL, 21, 'producto47', 'observaciones47', 7, 7),
(48, 10000, 'cod48', NULL, 21, 'producto48', 'observaciones48', 8, 8),
(49, 10000, 'cod49', NULL, 21, 'producto49', 'observaciones49', 9, 9),
(50, 10000, 'cod50', NULL, 21, 'producto50', 'observaciones50', 10, 10),
(51, 10000, 'cod51', NULL, 21, 'producto51', 'observaciones51', 1, 1),
(52, 10000, 'cod52', NULL, 21, 'producto52', 'observaciones52', 2, 2),
(53, 10000, 'cod53', NULL, 21, 'producto53', 'observaciones53', 3, 3),
(54, 10000, 'cod54', NULL, 21, 'producto54', 'observaciones54', 4, 4),
(55, 10000, 'cod55', NULL, 21, 'producto55', 'observaciones55', 5, 5),
(56, 10000, 'cod56', NULL, 21, 'producto56', 'observaciones56', 6, 6),
(57, 10000, 'cod57', NULL, 21, 'producto57', 'observaciones57', 7, 7),
(58, 10000, 'cod58', NULL, 21, 'producto58', 'observaciones58', 8, 8),
(59, 10000, 'cod59', NULL, 21, 'producto59', 'observaciones59', 9, 9),
(60, 10000, 'cod60', NULL, 21, 'producto60', 'observaciones60', 10, 10),
(61, 10000, 'cod61', NULL, 21, 'producto61', 'observaciones61', 1, 1),
(62, 10000, 'cod62', NULL, 21, 'producto62', 'observaciones62', 2, 2),
(63, 10000, 'cod63', NULL, 21, 'producto63', 'observaciones63', 3, 3),
(64, 10000, 'cod64', NULL, 21, 'producto64', 'observaciones64', 4, 4),
(65, 10000, 'cod65', NULL, 21, 'producto65', 'observaciones65', 5, 5),
(66, 10000, 'cod66', NULL, 21, 'producto66', 'observaciones66', 6, 6),
(67, 10000, 'cod67', NULL, 21, 'producto67', 'observaciones67', 7, 7),
(68, 10000, 'cod68', NULL, 21, 'producto68', 'observaciones68', 8, 8),
(69, 10000, 'cod69', NULL, 21, 'producto69', 'observaciones69', 9, 9),
(70, 10000, 'cod70', NULL, 21, 'producto70', 'observaciones70', 10, 10),
(71, 10000, 'cod71', NULL, 21, 'producto71', 'observaciones71', 1, 1),
(72, 10000, 'cod72', NULL, 21, 'producto72', 'observaciones72', 2, 2),
(73, 10000, 'cod73', NULL, 21, 'producto73', 'observaciones73', 3, 3),
(74, 10000, 'cod74', NULL, 21, 'producto74', 'observaciones74', 4, 4),
(75, 10000, 'cod75', NULL, 21, 'producto75', 'observaciones75', 5, 5),
(76, 10000, 'cod76', NULL, 21, 'producto76', 'observaciones76', 6, 6),
(77, 10000, 'cod77', NULL, 21, 'producto77', 'observaciones77', 7, 7),
(78, 10000, 'cod78', NULL, 21, 'producto78', 'observaciones78', 8, 8),
(79, 10000, 'cod79', NULL, 21, 'producto79', 'observaciones79', 9, 9),
(80, 10000, 'cod80', NULL, 21, 'producto80', 'observaciones80', 10, 10),
(81, 10000, 'cod81', NULL, 21, 'producto81', 'observaciones81', 1, 1),
(82, 10000, 'cod82', NULL, 21, 'producto82', 'observaciones82', 2, 2),
(83, 10000, 'cod83', NULL, 21, 'producto83', 'observaciones83', 3, 3),
(84, 10000, 'cod84', NULL, 21, 'producto84', 'observaciones84', 4, 4),
(85, 10000, 'cod85', NULL, 21, 'producto85', 'observaciones85', 5, 5),
(86, 10000, 'cod86', NULL, 21, 'producto86', 'observaciones86', 6, 6),
(87, 10000, 'cod87', NULL, 21, 'producto87', 'observaciones87', 7, 7),
(88, 10000, 'cod88', NULL, 21, 'producto88', 'observaciones88', 8, 8),
(89, 10000, 'cod89', NULL, 21, 'producto89', 'observaciones89', 9, 9),
(90, 10000, 'cod90', NULL, 21, 'producto90', 'observaciones90', 10, 10),
(91, 10000, 'cod91', NULL, 21, 'producto91', 'observaciones91', 1, 1),
(92, 10000, 'cod92', NULL, 21, 'producto92', 'observaciones92', 2, 2),
(93, 10000, 'cod93', NULL, 21, 'producto93', 'observaciones93', 3, 3),
(94, 10000, 'cod94', NULL, 21, 'producto94', 'observaciones94', 4, 4),
(95, 10000, 'cod95', NULL, 21, 'producto95', 'observaciones95', 5, 5),
(96, 10000, 'cod96', NULL, 21, 'producto96', 'observaciones96', 6, 6),
(97, 10000, 'cod97', NULL, 21, 'producto97', 'observaciones97', 7, 7),
(98, 10000, 'cod98', NULL, 21, 'producto98', 'observaciones98', 8, 8),
(99, 10000, 'cod99', NULL, 21, 'producto99', 'observaciones99', 9, 9),
(100, 10000, 'cod100', NULL, 21, 'producto100', 'observaciones100', 10, 10),
(101, 10000, 'cod1212', NULL, 20, 'producto1212', 'observaciones nuevo', 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sec_log_administracion`
--

CREATE TABLE `sec_log_administracion` (
  `id` bigint NOT NULL,
  `entidad_id` bigint NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `mensaje` varchar(255) DEFAULT NULL,
  `operacion` bigint NOT NULL,
  `tipo_entidad` bigint NOT NULL,
  `usuario` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sec_log_sorteos`
--

CREATE TABLE `sec_log_sorteos` (
  `id` bigint NOT NULL,
  `entidad_id` bigint NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `mensaje` varchar(255) DEFAULT NULL,
  `operacion` bigint NOT NULL,
  `tipo_entidad` bigint NOT NULL,
  `usuario` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sec_log_ventas`
--

CREATE TABLE `sec_log_ventas` (
  `id` bigint NOT NULL,
  `entidad_id` bigint NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `mensaje` varchar(255) DEFAULT NULL,
  `operacion` bigint NOT NULL,
  `tipo_entidad` bigint NOT NULL,
  `usuario` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sorteos`
--

CREATE TABLE `sorteos` (
  `id` bigint NOT NULL,
  `descuento_tarjeta_regalo` double DEFAULT NULL,
  `porcentaje_descuento_factura` int DEFAULT NULL,
  `dias_participacion_valida` int NOT NULL,
  `fecha_creacion` date NOT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL,
  `fecha_fin` date NOT NULL,
  `fecha_inicio` date NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `num_max_ganador` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `sorteos`
--

INSERT INTO `sorteos` (`id`, `descuento_tarjeta_regalo`, `porcentaje_descuento_factura`, `dias_participacion_valida`, `fecha_creacion`, `fecha_eliminacion`, `fecha_fin`, `fecha_inicio`, `nombre`, `num_max_ganador`) VALUES
(1, 10, 0, 3, '2023-09-06', NULL, '2023-09-26', '2023-09-06', 'Gran Sorteo de Apertura', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` bigint NOT NULL,
  `administrador` bit(1) DEFAULT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `empleado` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `administrador`, `fecha_eliminacion`, `nombre_usuario`, `password`, `empleado`) VALUES
(1, b'1', NULL, 'usuario1', 'asdasd', 1),
(2, b'0', NULL, 'usuario2', 'asdasd', 2),
(3, b'1', NULL, 'usuario3', 'asdasd3', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_m6ysdwsqke00e5piajbvgn6lg` (`dni`);

--
-- Indices de la tabla `detalles_facturas`
--
ALTER TABLE `detalles_facturas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4k3lbcc87trmlidy7agihmqi7` (`producto`),
  ADD KEY `FKi476ia6vs3a95i1wd85xppkjt` (`factura`);

--
-- Indices de la tabla `detalles_facturas_simplificadas`
--
ALTER TABLE `detalles_facturas_simplificadas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjhry7jwnpentlkpxm9t7kqiq9` (`producto`),
  ADD KEY `FKos8u042cytvyu3n6bwfy81mms` (`factura`);

--
-- Indices de la tabla `detalles_sorteos`
--
ALTER TABLE `detalles_sorteos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5ngnjrsescdtvdoawp44saehl` (`producto`),
  ADD KEY `FK6y9v4w8gurjkpv6w9ilctyp9v` (`sorteo`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_gdkxcplgdjv6ny0g0vu8f8dcm` (`dni`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_tmmdejxot9pde0r7k9w5nwoan` (`numero`),
  ADD KEY `FK3nxeenck2r6rhf5klad6pg0m7` (`forma_pago`),
  ADD KEY `FKmjaml7g1xe5ddrn8v5avncg69` (`cliente`);

--
-- Indices de la tabla `facturas_simplificadas`
--
ALTER TABLE `facturas_simplificadas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_81hhnqxqnvmpnud08fhugm9q6` (`numero`),
  ADD KEY `FKbputyu7sg076exkmbico6x8xs` (`forma_pago`);

--
-- Indices de la tabla `familias_productos`
--
ALTER TABLE `familias_productos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_55qbdthdmteu6ppu6ow9qdytl` (`nombre`),
  ADD KEY `FKl7csna3aow99vm4e33srp560b` (`familia_padre`);

--
-- Indices de la tabla `formas_pago`
--
ALTER TABLE `formas_pago`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `log_administracion`
--
ALTER TABLE `log_administracion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5bku0fnrr15n0d9k2pp22ay2b` (`operacion`),
  ADD KEY `FKlbpmyruhukifm4v88l15f2mo8` (`tipo_entidad`),
  ADD KEY `FKuhsvb1i0u8eaftfyu7eavmnf` (`usuario`);

--
-- Indices de la tabla `log_operaciones`
--
ALTER TABLE `log_operaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `log_sorteos`
--
ALTER TABLE `log_sorteos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKbjef14c9d1ivyku55ehm57bwm` (`operacion`),
  ADD KEY `FKhtitsekbd2frfcke2ufexl8e8` (`tipo_entidad`),
  ADD KEY `FKehskh0drv9sat33liurvo3j3s` (`usuario`);

--
-- Indices de la tabla `log_tipo_entidad`
--
ALTER TABLE `log_tipo_entidad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `log_ventas`
--
ALTER TABLE `log_ventas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrx53dh2mpan7jw1pevrt8uon7` (`operacion`),
  ADD KEY `FKnxmu5h1vfjq66hugf7hkj6ho3` (`tipo_entidad`),
  ADD KEY `FK4p2dh6dhg2fq59gu32jedihc0` (`usuario`);

--
-- Indices de la tabla `participaciones`
--
ALTER TABLE `participaciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKhy425ag3pbksynpfgi9s01qbs` (`factura_aplicacion`),
  ADD KEY `FKsshb9y3vl92m38sqq7opfus0c` (`factura_generacion`),
  ADD KEY `FKpavr6rqb3mn96x80e5sb1pgl0` (`sorteo`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_ak1i4550m1wkjdld3yevoe49m` (`cod_barras`),
  ADD UNIQUE KEY `UK_mlgw7js72hh2xtd4mvpdqfsbe` (`nombre`),
  ADD KEY `FK7nbm94nrjoitm4rnm9jxrhtjd` (`familia_producto`);

--
-- Indices de la tabla `sec_log_administracion`
--
ALTER TABLE `sec_log_administracion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK59vqqoeemhj8bjdx5tfhgynib` (`operacion`),
  ADD KEY `FK3hfn0yf3sqf71psiilovj4u03` (`tipo_entidad`),
  ADD KEY `FK4i0xk7e5whyie8tsasnhmhw0k` (`usuario`);

--
-- Indices de la tabla `sec_log_sorteos`
--
ALTER TABLE `sec_log_sorteos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK878hi00djr3ul7mqlvc46k98j` (`operacion`),
  ADD KEY `FKjjkgyn9ygbcxj3r80bkovyjs2` (`tipo_entidad`),
  ADD KEY `FKe5qnsup23498h4eq6455ixduv` (`usuario`);

--
-- Indices de la tabla `sec_log_ventas`
--
ALTER TABLE `sec_log_ventas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKau2s5x4ydqqedv1cw4x9wmnqo` (`operacion`),
  ADD KEY `FK83gk4bo7wlnfs118o7p30g9h2` (`tipo_entidad`),
  ADD KEY `FKh5yq2ony65j6010624q0j8u3l` (`usuario`);

--
-- Indices de la tabla `sorteos`
--
ALTER TABLE `sorteos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_ci4h5hehsnln6lbqqvw28xhns` (`fecha_fin`),
  ADD UNIQUE KEY `UK_8pxjvf0j8as83185v5wbbglk2` (`fecha_inicio`),
  ADD UNIQUE KEY `UK_hv4yls533r9lwwgvh072b38ic` (`nombre`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_64bsd6862nt4vgutmc4gb5scf` (`empleado`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;

--
-- AUTO_INCREMENT de la tabla `detalles_facturas`
--
ALTER TABLE `detalles_facturas`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT de la tabla `detalles_facturas_simplificadas`
--
ALTER TABLE `detalles_facturas_simplificadas`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `detalles_sorteos`
--
ALTER TABLE `detalles_sorteos`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `facturas_simplificadas`
--
ALTER TABLE `facturas_simplificadas`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `familias_productos`
--
ALTER TABLE `familias_productos`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `formas_pago`
--
ALTER TABLE `formas_pago`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `log_administracion`
--
ALTER TABLE `log_administracion`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `log_operaciones`
--
ALTER TABLE `log_operaciones`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `log_sorteos`
--
ALTER TABLE `log_sorteos`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `log_tipo_entidad`
--
ALTER TABLE `log_tipo_entidad`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `log_ventas`
--
ALTER TABLE `log_ventas`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `participaciones`
--
ALTER TABLE `participaciones`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT de la tabla `sec_log_administracion`
--
ALTER TABLE `sec_log_administracion`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sec_log_sorteos`
--
ALTER TABLE `sec_log_sorteos`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sec_log_ventas`
--
ALTER TABLE `sec_log_ventas`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sorteos`
--
ALTER TABLE `sorteos`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalles_facturas`
--
ALTER TABLE `detalles_facturas`
  ADD CONSTRAINT `FK4k3lbcc87trmlidy7agihmqi7` FOREIGN KEY (`producto`) REFERENCES `productos` (`id`),
  ADD CONSTRAINT `FKi476ia6vs3a95i1wd85xppkjt` FOREIGN KEY (`factura`) REFERENCES `facturas` (`id`);

--
-- Filtros para la tabla `detalles_facturas_simplificadas`
--
ALTER TABLE `detalles_facturas_simplificadas`
  ADD CONSTRAINT `FKjhry7jwnpentlkpxm9t7kqiq9` FOREIGN KEY (`producto`) REFERENCES `productos` (`id`),
  ADD CONSTRAINT `FKos8u042cytvyu3n6bwfy81mms` FOREIGN KEY (`factura`) REFERENCES `facturas_simplificadas` (`id`);

--
-- Filtros para la tabla `detalles_sorteos`
--
ALTER TABLE `detalles_sorteos`
  ADD CONSTRAINT `FK5ngnjrsescdtvdoawp44saehl` FOREIGN KEY (`producto`) REFERENCES `productos` (`id`),
  ADD CONSTRAINT `FK6y9v4w8gurjkpv6w9ilctyp9v` FOREIGN KEY (`sorteo`) REFERENCES `sorteos` (`id`);

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `FK3nxeenck2r6rhf5klad6pg0m7` FOREIGN KEY (`forma_pago`) REFERENCES `formas_pago` (`id`),
  ADD CONSTRAINT `FKmjaml7g1xe5ddrn8v5avncg69` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`id`);

--
-- Filtros para la tabla `facturas_simplificadas`
--
ALTER TABLE `facturas_simplificadas`
  ADD CONSTRAINT `FKbputyu7sg076exkmbico6x8xs` FOREIGN KEY (`forma_pago`) REFERENCES `formas_pago` (`id`);

--
-- Filtros para la tabla `familias_productos`
--
ALTER TABLE `familias_productos`
  ADD CONSTRAINT `FKl7csna3aow99vm4e33srp560b` FOREIGN KEY (`familia_padre`) REFERENCES `familias_productos` (`id`);

--
-- Filtros para la tabla `log_administracion`
--
ALTER TABLE `log_administracion`
  ADD CONSTRAINT `FK5bku0fnrr15n0d9k2pp22ay2b` FOREIGN KEY (`operacion`) REFERENCES `log_operaciones` (`id`),
  ADD CONSTRAINT `FKlbpmyruhukifm4v88l15f2mo8` FOREIGN KEY (`tipo_entidad`) REFERENCES `log_tipo_entidad` (`id`),
  ADD CONSTRAINT `FKuhsvb1i0u8eaftfyu7eavmnf` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `log_sorteos`
--
ALTER TABLE `log_sorteos`
  ADD CONSTRAINT `FKbjef14c9d1ivyku55ehm57bwm` FOREIGN KEY (`operacion`) REFERENCES `log_operaciones` (`id`),
  ADD CONSTRAINT `FKehskh0drv9sat33liurvo3j3s` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`id`),
  ADD CONSTRAINT `FKhtitsekbd2frfcke2ufexl8e8` FOREIGN KEY (`tipo_entidad`) REFERENCES `log_tipo_entidad` (`id`);

--
-- Filtros para la tabla `log_ventas`
--
ALTER TABLE `log_ventas`
  ADD CONSTRAINT `FK4p2dh6dhg2fq59gu32jedihc0` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`id`),
  ADD CONSTRAINT `FKnxmu5h1vfjq66hugf7hkj6ho3` FOREIGN KEY (`tipo_entidad`) REFERENCES `log_tipo_entidad` (`id`),
  ADD CONSTRAINT `FKrx53dh2mpan7jw1pevrt8uon7` FOREIGN KEY (`operacion`) REFERENCES `log_operaciones` (`id`);

--
-- Filtros para la tabla `participaciones`
--
ALTER TABLE `participaciones`
  ADD CONSTRAINT `FKhy425ag3pbksynpfgi9s01qbs` FOREIGN KEY (`factura_aplicacion`) REFERENCES `facturas` (`id`),
  ADD CONSTRAINT `FKpavr6rqb3mn96x80e5sb1pgl0` FOREIGN KEY (`sorteo`) REFERENCES `sorteos` (`id`),
  ADD CONSTRAINT `FKsshb9y3vl92m38sqq7opfus0c` FOREIGN KEY (`factura_generacion`) REFERENCES `facturas` (`id`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `FK7nbm94nrjoitm4rnm9jxrhtjd` FOREIGN KEY (`familia_producto`) REFERENCES `familias_productos` (`id`);

--
-- Filtros para la tabla `sec_log_administracion`
--
ALTER TABLE `sec_log_administracion`
  ADD CONSTRAINT `FK3hfn0yf3sqf71psiilovj4u03` FOREIGN KEY (`tipo_entidad`) REFERENCES `log_tipo_entidad` (`id`),
  ADD CONSTRAINT `FK4i0xk7e5whyie8tsasnhmhw0k` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`id`),
  ADD CONSTRAINT `FK59vqqoeemhj8bjdx5tfhgynib` FOREIGN KEY (`operacion`) REFERENCES `log_operaciones` (`id`);

--
-- Filtros para la tabla `sec_log_sorteos`
--
ALTER TABLE `sec_log_sorteos`
  ADD CONSTRAINT `FK878hi00djr3ul7mqlvc46k98j` FOREIGN KEY (`operacion`) REFERENCES `log_operaciones` (`id`),
  ADD CONSTRAINT `FKe5qnsup23498h4eq6455ixduv` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`id`),
  ADD CONSTRAINT `FKjjkgyn9ygbcxj3r80bkovyjs2` FOREIGN KEY (`tipo_entidad`) REFERENCES `log_tipo_entidad` (`id`);

--
-- Filtros para la tabla `sec_log_ventas`
--
ALTER TABLE `sec_log_ventas`
  ADD CONSTRAINT `FK83gk4bo7wlnfs118o7p30g9h2` FOREIGN KEY (`tipo_entidad`) REFERENCES `log_tipo_entidad` (`id`),
  ADD CONSTRAINT `FKau2s5x4ydqqedv1cw4x9wmnqo` FOREIGN KEY (`operacion`) REFERENCES `log_operaciones` (`id`),
  ADD CONSTRAINT `FKh5yq2ony65j6010624q0j8u3l` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `FK2745ujkvm0wgqohqr2ss60so2` FOREIGN KEY (`empleado`) REFERENCES `empleados` (`id`),
  ADD CONSTRAINT `FKr3a3b2n8kq619usxmcvnhd9xp` FOREIGN KEY (`empleado`) REFERENCES `usuarios` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
