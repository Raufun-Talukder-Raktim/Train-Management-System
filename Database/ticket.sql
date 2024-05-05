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
-- Database: `ticket`
--

-- --------------------------------------------------------

--
-- Table structure for table `all_tickets`
--

CREATE TABLE `all_tickets` (
  `Serial_No` int(5) NOT NULL,
  `Ticket_No` varchar(10) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `Account_No` varchar(12) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Number_of_Tickets` varchar(1) NOT NULL,
  `Passenger_Name` varchar(30) NOT NULL,
  `Age` varchar(3) NOT NULL,
  `Mobile_Number` varchar(12) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Train_Name` varchar(25) NOT NULL,
  `Departure_Station` varchar(15) NOT NULL,
  `Arrival_Station` varchar(15) NOT NULL,
  `Bogie_No` varchar(1) NOT NULL,
  `Seat_No` varchar(10) NOT NULL,
  `Class` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Time` varchar(12) NOT NULL,
  `Keyword` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `all_tickets`
--

INSERT INTO `all_tickets` (`Serial_No`, `Ticket_No`, `User_Name`, `Account_No`, `Type`, `Number_of_Tickets`, `Passenger_Name`, `Age`, `Mobile_Number`, `Gender`, `Train_Name`, `Departure_Station`, `Arrival_Station`, `Bogie_No`, `Seat_No`, `Class`, `Fare`, `Date`, `Time`, `Keyword`) VALUES
(2, 'BR 100001', 'RAR', 'BR_UA100002', 'Cancelled', '1', 'sfvs', '22', '014161', 'Male', 'Bharamaputra', 'Dhaka', 'Dewangong', 'A', '1', 'Shuvon', '185', '30/03/2021', '18:00:00', '12345'),
(7, 'BR 100007', 'RAR', 'BR_UA100002', 'Visited', '1', 'Ahsan', '22', '011456', 'Male', 'Mohanagar Provati', 'Dhaka', 'Chittagong', 'A', '1', 'Shuvon', '285', '29/03/2021', '23:40:00', '12354'),
(8, 'BR 100008', 'RAR', 'BR_UA100002', 'Visited', '1', 'dsfv', '22', '011654', 'Male', 'Bharamaputra', 'Dhaka', 'Dewangong', 'D', '1', 'First Birth', '445', '20/03/2021', '18:00:00', '1644'),
(9, 'BR 100009', 'RAR', 'BR_UA100002', 'Visited', '2', 'dgd', '22', '0145987', 'Male', 'Subarna Express', 'Dhaka', 'Chittagong', 'A', '1 - 2', 'Shuvon', '570', '20/03/2021', '15:00:00', '356'),
(11, 'BR 100011', 'RAR', 'BR_UA100002', 'Visited', '3', 'Ahsan', '22', '01826084705', 'Male', 'Subarna Express', 'Dhaka', 'Chittagong', 'A', '1 - 3', 'Shuvon', '855', '02/04/2021', '15:00:00', '123458'),
(12, 'BR 100012', 'RAR', 'BR_UA100002', 'Visited', '1', 'Ahsan', '22', '01826084705', 'Male', 'Subarna Express', 'Dhaka', 'Chittagong', 'A', '1', 'Shuvon', '285', '02/04/2021', '15:00:00', '12345'),
(14, 'BR 100013', 'Ahsan', 'BR_UA100003', 'Cancelled', '3', 'Raktim', '22', '01812345678', 'Male', 'Bharamaputra', 'Dhaka', 'Dewangong', 'A', '1 - 3', 'Shuvon', '555', '10/04/2021', '18:00:00', '12345'),
(15, 'BR 100015', 'null', 'null', 'Visited', '1', 'Raktim', '21', '01825478569', 'Male', 'Drutojan Express', 'Dhaka', 'Dinajpur', 'A', '1', 'Shuvon', '390', '02/04/2021', '13:30:00', '12345'),
(16, 'BR 100016', 'RAR', 'BR_UA100002', 'Visited', '3', 'Ahsan', '21', '0182656465', 'Male', 'Mohanagar Goduli', 'Dhaka', 'Chittagong', 'A', '1 - 3', 'Shuvon', '855', '04/04/2021', '15:20:00', '12345'),
(17, 'BR 100017', 'null', 'null', 'Not Visited', '2', 'Ahsan', '21', '0182916545', 'Male', 'Bharamaputra', 'Dhaka', 'Dewangong', 'A', '4 - 5', 'Shuvon', '370', '10/04/2021', '18:00:00', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `ticket_list`
--

CREATE TABLE `ticket_list` (
  `Serial_No` int(5) NOT NULL,
  `Ticket_No.` varchar(10) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `Account_No.` varchar(12) NOT NULL,
  `Number_of_Tickets` varchar(1) NOT NULL,
  `Passenger_Name` varchar(30) NOT NULL,
  `Age` varchar(3) NOT NULL,
  `Mobile_Number` varchar(12) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Train_Name` varchar(25) NOT NULL,
  `Departure_Station` varchar(15) NOT NULL,
  `Arrival_Station` varchar(15) NOT NULL,
  `Bogie_No.` varchar(1) NOT NULL,
  `Seat_No.` varchar(10) NOT NULL,
  `Class` varchar(12) NOT NULL,
  `Fare` varchar(4) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Time` varchar(12) NOT NULL,
  `Keyword` varchar(10) NOT NULL,
  `Temp_Seat_No.` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticket_list`
--

INSERT INTO `ticket_list` (`Serial_No`, `Ticket_No.`, `User_Name`, `Account_No.`, `Number_of_Tickets`, `Passenger_Name`, `Age`, `Mobile_Number`, `Gender`, `Train_Name`, `Departure_Station`, `Arrival_Station`, `Bogie_No.`, `Seat_No.`, `Class`, `Fare`, `Date`, `Time`, `Keyword`, `Temp_Seat_No.`) VALUES
(27, 'BR 100017', 'null', 'null', '2', 'Ahsan', '21', '0182916545', 'Male', 'Bharamaputra', 'Dhaka', 'Dewangong', 'A', '4 - 5', 'Shuvon', '370', '10/04/2021', '18:00:00', '1234', '5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `all_tickets`
--
ALTER TABLE `all_tickets`
  ADD PRIMARY KEY (`Serial_No`);

--
-- Indexes for table `ticket_list`
--
ALTER TABLE `ticket_list`
  ADD PRIMARY KEY (`Serial_No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `all_tickets`
--
ALTER TABLE `all_tickets`
  MODIFY `Serial_No` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `ticket_list`
--
ALTER TABLE `ticket_list`
  MODIFY `Serial_No` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
