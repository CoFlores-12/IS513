SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE TABLE `duenios` (
  `idDuenio` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `duenios` (`idDuenio`, `nombre`, `apellido`, `correo`, `telefono`) VALUES
(1, 'cesar', 'flores', 'cofloresf@unah.hn', '87938414'),
(2, 'pedro', 'diaz', 'pdiaz@unah.hn', '8938415'),
(3, 'mario', 'bros', 'jbros@unah.hn', '87938416');

-- --------------------------------------------------------

CREATE TABLE `propiedades` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `piso` int(11) NOT NULL,
  `area` int(11) NOT NULL,
  `color` varchar(255) NOT NULL,
  `idDuenio` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `propiedades` (`id`, `piso`, `area`, `color`, `idDuenio`) VALUES
(1, 1, 250, 'green', '1'),
(2, 2, 300, 'blue', '2'),
(3, 12, 500, 'yellow', '1');

ALTER TABLE `duenios`
  ADD PRIMARY KEY (`idDuenio`);

ALTER TABLE `propiedades`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `propiedades`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;