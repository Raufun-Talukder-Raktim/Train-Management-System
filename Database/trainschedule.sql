-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 07, 2021 at 01:49 PM
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
-- Database: `trainschedule`
--

-- --------------------------------------------------------

--
-- Table structure for table `journey_info`
--

CREATE TABLE `journey_info` (
  `Schedule_No` int(11) NOT NULL,
  `Train` varchar(25) NOT NULL,
  `Departure_Station` varchar(20) NOT NULL,
  `Arrival_Station` varchar(20) NOT NULL,
  `Time` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `journey_info`
--

INSERT INTO `journey_info` (`Schedule_No`, `Train`, `Departure_Station`, `Arrival_Station`, `Time`) VALUES
(1, 'Subarna Express', 'Dhaka', 'Chittagong', '15:00:00'),
(2, 'Subarna Express', 'Chittagong', 'Dhaka', '06:40:00'),
(3, 'Mohanagar Goduli', 'Chittagong', 'Dhaka', '15:00:00'),
(4, 'Mohanagar Provati', 'Dhaka', 'Chittagong', '07:40:00'),
(5, 'Ekota Express', 'Dhaka', 'Dinajpur', '10:00:00'),
(6, 'Ekota Express', 'Dinajpur', 'Dhaka', '21:20:00'),
(7, 'Tista Express', 'Dhaka', 'Dewangong', '07:20:00'),
(8, 'Tista Express', 'Dewangong', 'Dhaka', '15:00:00'),
(9, 'Parabat Express', 'Dhaka', 'Sylhet', '06:40:00'),
(10, 'Parabat Express', 'Sylhet', 'Dhaka', '15:00:00'),
(11, 'Upukol Express', 'Noakhali', 'Dhaka', '06:20:00'),
(12, 'Upukol Express', 'Dhaka', 'Noakhali', '16:20:00'),
(13, 'Joyantika Express', 'Dhaka', 'Sylhet', '12:00:00'),
(14, 'Joyantika Express', 'Sylhet', 'Dhaka', '16:00:00'),
(15, 'Paharia Express', 'Chittagong', 'Sylhet', '08:15:00'),
(16, 'Paharia Express', 'Sylhet', 'Chittagong', '10:15:00'),
(17, 'Mohanagar Provati', 'Chittagong', 'Dhaka', '07:00:00'),
(18, 'Mohanagar Goduli', 'Dhaka', 'Chittagong', '15:20:00'),
(19, 'Uddayan Express', 'Chittagong', 'Sylhet', '21:30:00'),
(20, 'Uddayan Express', 'Sylhet', 'Chittagong', '07:20:00'),
(21, 'Megna Express', 'Chittagong', 'Chandpur', '17:00:00'),
(22, 'Megna Express', 'Chandpur', 'Chittagong', '05:00:00'),
(23, 'Agnibina Express', 'Dhaka', 'Tarakandi', '09:40:00'),
(24, 'Agnibina Express', 'Tarakandi', 'Dhaka', '16:30:00'),
(25, 'Egarosindhur Provati', 'Dhaka', 'Kisoregonj', '08:10:00'),
(26, 'Egarosindhur Provati', 'Kisoregonj', 'Dhaka', '06:45:00'),
(27, 'Upaban Express', 'Dhaka', 'Sylhet', '21:50:00'),
(28, 'Upaban Express', 'Sylhet', 'Dhaka', '07:30:00'),
(29, 'Turna Express', 'Chittagong', 'Dhaka', '23:00:00'),
(30, 'Turna Express', 'Dhaka', 'Chittagong', '06:50:00'),
(31, 'Bharamaputra', 'Dhaka', 'Dewangong', '18:00:00'),
(32, 'Bharamaputra', 'Dewangong', 'Dhaka', '06:30:00'),
(33, 'Jamuna Express', 'Dhaka', 'Bhairab Bazar', '16:40:00'),
(34, 'Jamuna Express', 'Bhairab Bazar', 'Dhaka', '01:10:00'),
(35, 'Egarosindhur Goduli', 'Dhaka', 'Kisoregonj', '18:30:00'),
(36, 'Egarosindhur Goduli', 'Kisoregonj', 'Dhaka', '12:45:00'),
(37, 'Lalmoni Express', 'Dhaka', 'Lalmonirhat', '22:10:00'),
(38, 'Lalmoni Express', 'Lalmonirhat', 'Dhaka', '10:40:00'),
(39, 'Drutojan Express', 'Dhaka', 'Dinajpur', '13:30:00'),
(40, 'Drutojan Express', 'Dinajpur', 'Dhaka', '07:40:00'),
(41, 'Dolonchapa Express', 'Santahar', 'Dinajpur', '13:30:00'),
(42, 'Dolonchapa Express', 'Dinajpur', 'Santahar', '05:40:00'),
(43, 'Rangpur Express', 'Dhaka', 'Rangpur', '09:00:00'),
(44, 'Rangpur Express', 'Rangpur', 'Dhaka', '20:00:00'),
(45, 'Kalani Express', 'Dhaka', 'Sylhet', '16:00:00'),
(46, 'Kalani Express', 'Sylhet', 'Dhaka', '06:40:00'),
(47, 'Sirajgong Express', 'Sirajgong', 'Dhaka', '07:45:00'),
(48, 'Sirajgong Express', 'Dhaka', 'Sirajgong', '17:00:00'),
(49, 'Kapotaskh express', 'Khulna', 'Rajshahi', '06:30:00'),
(50, 'Kapotaskh express', 'Rajshahi', 'Khulna', '14:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `journey_info`
--
ALTER TABLE `journey_info`
  ADD PRIMARY KEY (`Schedule_No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `journey_info`
--
ALTER TABLE `journey_info`
  MODIFY `Schedule_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
