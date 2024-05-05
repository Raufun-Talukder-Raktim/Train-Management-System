-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 07, 2021 at 01:47 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `classcategory`
--

-- --------------------------------------------------------

--
-- Table structure for table `chittagongchandpur`
--

CREATE TABLE `chittagongchandpur` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chittagongchandpur`
--

INSERT INTO `chittagongchandpur` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '165'),
('B', 'Shuvon Chair', '195'),
('C', 'First Seat', '260'),
('D', 'First Birth', '390'),
('E', 'Snigdha', '374'),
('F', 'AC', '449'),
('G', 'AC Birth', '673');

-- --------------------------------------------------------

--
-- Table structure for table `chittagongsylhet`
--

CREATE TABLE `chittagongsylhet` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chittagongsylhet`
--

INSERT INTO `chittagongsylhet` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '315'),
('B', 'Shuvon Chair', '375'),
('C', 'First Seat', '500'),
('D', 'First Birth', '745'),
('E', 'Snigdha', '719'),
('F', 'AC', '857'),
('G', 'AC Birth', '1288');

-- --------------------------------------------------------

--
-- Table structure for table `dhakabhairabbazar`
--

CREATE TABLE `dhakabhairabbazar` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakabhairabbazar`
--

INSERT INTO `dhakabhairabbazar` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '85'),
('B', 'Shuvon Chair', '105'),
('C', 'First Seat', '135'),
('D', 'First Birth', '205'),
('E', 'Snigdha', '196'),
('F', 'AC', '236'),
('G', 'AC Birth', '351');

-- --------------------------------------------------------

--
-- Table structure for table `dhakachittagong`
--

CREATE TABLE `dhakachittagong` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakachittagong`
--

INSERT INTO `dhakachittagong` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '285'),
('B', 'Shuvon Chair', '345'),
('C', 'First Seat', '460'),
('D', 'First Birth', '685'),
('E', 'Snigdha', '656'),
('F', 'AC', '788'),
('G', 'AC Birth', '1179');

-- --------------------------------------------------------

--
-- Table structure for table `dhakadewangong`
--

CREATE TABLE `dhakadewangong` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakadewangong`
--

INSERT INTO `dhakadewangong` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '185'),
('B', 'Shuvon Chair', '225'),
('C', 'First Seat', '300'),
('D', 'First Birth', '445'),
('E', 'Snigdha', '426'),
('F', 'AC', '512'),
('G', 'AC Birth', '771');

-- --------------------------------------------------------

--
-- Table structure for table `dhakadinajpur`
--

CREATE TABLE `dhakadinajpur` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakadinajpur`
--

INSERT INTO `dhakadinajpur` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '390'),
('B', 'Shuvon Chair', '365'),
('C', 'First Seat', '775'),
('D', 'First Birth', '620'),
('E', 'Snigdha', '930'),
('F', 'AC', '930'),
('G', 'AC Birth', '1390');

-- --------------------------------------------------------

--
-- Table structure for table `dhakakisoregonj`
--

CREATE TABLE `dhakakisoregonj` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakakisoregonj`
--

INSERT INTO `dhakakisoregonj` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '125'),
('B', 'Shuvon Chair', '150'),
('C', 'First Seat', '200'),
('D', 'First Birth', '300'),
('E', 'Snigdha', '288'),
('F', 'AC', '345'),
('G', 'AC Birth', '518');

-- --------------------------------------------------------

--
-- Table structure for table `dhakalalmonirhat`
--

CREATE TABLE `dhakalalmonirhat` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakalalmonirhat`
--

INSERT INTO `dhakalalmonirhat` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '420'),
('B', 'Shuvon Chair', '505'),
('C', 'First Seat', '675'),
('D', 'First Birth', '1010'),
('E', 'Snigdha', '840'),
('F', 'AC', '1010'),
('G', 'AC Birth', '1510');

-- --------------------------------------------------------

--
-- Table structure for table `dhakanoakhali`
--

CREATE TABLE `dhakanoakhali` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakanoakhali`
--

INSERT INTO `dhakanoakhali` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '225'),
('B', 'Shuvon Chair', '270'),
('C', 'First Seat', '360'),
('D', 'First Birth', '540'),
('E', 'Snigdha', '518'),
('F', 'AC', '621'),
('G', 'AC Birth', '932');

-- --------------------------------------------------------

--
-- Table structure for table `dhakarangpur`
--

CREATE TABLE `dhakarangpur` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakarangpur`
--

INSERT INTO `dhakarangpur` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon Chair', '505'),
('B', 'Snigdha', '966'),
('C', 'AC', '1162');

-- --------------------------------------------------------

--
-- Table structure for table `dhakasirajgong`
--

CREATE TABLE `dhakasirajgong` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakasirajgong`
--

INSERT INTO `dhakasirajgong` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon Chair', '150');

-- --------------------------------------------------------

--
-- Table structure for table `dhakasylhet`
--

CREATE TABLE `dhakasylhet` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakasylhet`
--

INSERT INTO `dhakasylhet` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '265'),
('B', 'Shuvon Chair', '320'),
('C', 'First Seat', '425'),
('D', 'First Birth', '640'),
('E', 'Snigdha', '610'),
('F', 'AC', '558'),
('G', 'AC Birth', '1099');

-- --------------------------------------------------------

--
-- Table structure for table `dhakatarakandi`
--

CREATE TABLE `dhakatarakandi` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dhakatarakandi`
--

INSERT INTO `dhakatarakandi` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '185'),
('B', 'Shuvon Chair', '220'),
('C', 'First Seat', '295'),
('D', 'First Birth', '440'),
('E', 'Snigdha', '420'),
('F', 'AC', '506'),
('G', 'AC Birth', '754');

-- --------------------------------------------------------

--
-- Table structure for table `dinajpursantahar`
--

CREATE TABLE `dinajpursantahar` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dinajpursantahar`
--

INSERT INTO `dinajpursantahar` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '120'),
('B', 'Shuvon Chair', '145'),
('C', 'First Seat', '195'),
('D', 'First Birth', '290'),
('E', 'Snigdha', '240'),
('F', 'AC', '290'),
('G', 'AC Birth', '430');

-- --------------------------------------------------------

--
-- Table structure for table `khulnarajshahi`
--

CREATE TABLE `khulnarajshahi` (
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_Category` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `khulnarajshahi`
--

INSERT INTO `khulnarajshahi` (`Bogie_No.`, `Seat_Category`, `Fare`) VALUES
('A', 'Shuvon', '260'),
('B', 'Shuvon Chair', '310'),
('C', 'First Seat', '410'),
('D', 'Snigdha', '515'),
('E', 'AC', '615');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
