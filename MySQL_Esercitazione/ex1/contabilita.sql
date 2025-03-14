-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mar 14, 2025 alle 14:37
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `contabilita`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `movimentazioni`
--

CREATE TABLE `movimentazioni` (
  `id` int(11) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `descrizione` varchar(60) NOT NULL,
  `ammontare` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `movimentazioni`
--

INSERT INTO `movimentazioni` (`id`, `nome`, `descrizione`, `ammontare`) VALUES
(1, 'Spesa ufficio', 'Materiale di cancelleria', -50.00),
(2, 'Spesa viaggio', 'Biglietti treno', -120.50),
(3, 'Spesa software', 'Licenza programma', -300.25),
(4, 'Vendita prodotto', 'Vendita online', 250.75),
(5, 'Rimborso cliente', 'Rimborso fattura errata', 80.00);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `movimentazioni`
--
ALTER TABLE `movimentazioni`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `movimentazioni`
--
ALTER TABLE `movimentazioni`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
