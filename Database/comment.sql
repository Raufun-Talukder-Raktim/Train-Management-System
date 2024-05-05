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
-- Database: `comment`
--

-- --------------------------------------------------------

--
-- Table structure for table `private`
--

CREATE TABLE `private` (
  `Serial_No` int(11) NOT NULL,
  `User_Name` varchar(15) NOT NULL,
  `Account_No` varchar(15) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Age` varchar(2) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Topic` varchar(10) NOT NULL,
  `Experience` varchar(10) NOT NULL,
  `Comment` varchar(100) NOT NULL,
  `Reply` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `private`
--

INSERT INTO `private` (`Serial_No`, `User_Name`, `Account_No`, `Name`, `Age`, `Email`, `Gender`, `Topic`, `Experience`, `Comment`, `Reply`) VALUES
(15, 'Ahsan', 'BR_UA100003', 'Raktim', '21', 'raktim@gmail.com', 'Male', 'Feedback', 'Very Good', 'Very much helpful', 'Thanks ...');

-- --------------------------------------------------------

--
-- Table structure for table `public`
--

CREATE TABLE `public` (
  `Serial_No` int(11) NOT NULL,
  `User_Name` varchar(15) NOT NULL,
  `Account_No` varchar(15) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Age` varchar(2) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Topic` varchar(10) NOT NULL,
  `Experience` varchar(10) NOT NULL,
  `Comment` varchar(100) NOT NULL,
  `Reply` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `public`
--

INSERT INTO `public` (`Serial_No`, `User_Name`, `Account_No`, `Name`, `Age`, `Email`, `Gender`, `Topic`, `Experience`, `Comment`, `Reply`) VALUES
(6, 'RAR', 'BR_UA100002', 'Ahsan', '22', 'ahsan@gmail.com', 'Male', 'Feedback', 'Very Good', 'nice ... ', 'thanks ...'),
(7, 'Ahsan', 'BR_UA100003', 'RAfi', '21', 'rafi@gmail.com', 'Male', 'Feedback', 'Excellent', 'Nice Project', 'thanks');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `private`
--
ALTER TABLE `private`
  ADD PRIMARY KEY (`Serial_No`);

--
-- Indexes for table `public`
--
ALTER TABLE `public`
  ADD PRIMARY KEY (`Serial_No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `private`
--
ALTER TABLE `private`
  MODIFY `Serial_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `public`
--
ALTER TABLE `public`
  MODIFY `Serial_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
