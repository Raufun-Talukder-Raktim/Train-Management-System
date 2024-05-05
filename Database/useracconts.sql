-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 07, 2021 at 01:50 PM
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
-- Database: `useracconts`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `Serial_No.` int(5) NOT NULL,
  `Account_No.` varchar(12) NOT NULL,
  `Full_Name` varchar(30) NOT NULL,
  `User_Name` varchar(15) NOT NULL,
  `Password` varchar(12) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Mobile_Number` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Serial_No.`, `Account_No.`, `Full_Name`, `User_Name`, `Password`, `Gender`, `Email`, `Mobile_Number`) VALUES
(1, 'BR_UA100001', 'BD Railway', 'Admin', '12345', 'Male', 'railway.gov.bd', '9555542'),
(2, 'BR_UA100002', 'RAR Brotherhood', 'RAR', '112345', 'Male', 'rar.brotherhood@gmail.com', '01826084705'),
(8, 'BR_UA100003', 'Muhammad Ahsan', 'Ahsan', '123456', 'Male', 'ahsan@gmail.com', '01826084705'),
(9, 'BR_UA100009', '     ', '  ', '12345', 'Male', 'rar@gmail.com', '018264705');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Serial_No.`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `Serial_No.` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
