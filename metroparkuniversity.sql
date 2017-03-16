-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2017 at 05:18 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `metroparkuniversity`
--

-- --------------------------------------------------------

--
-- Table structure for table `bscinformationsystems`
--

CREATE TABLE `bscinformationsystems` (
  `studentNo` varchar(15) NOT NULL,
  `accounting` int(3) NOT NULL,
  `computersecurity` int(3) NOT NULL,
  `communicationskills` int(3) NOT NULL,
  `mathematics` int(3) NOT NULL,
  `sdp01` int(3) NOT NULL,
  `webdesigning` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bscinformationsystems`
--

INSERT INTO `bscinformationsystems` (`studentNo`, `accounting`, `computersecurity`, `communicationskills`, `mathematics`, `sdp01`, `webdesigning`) VALUES
('01', 55, 60, 78, 78, 78, 54);

-- --------------------------------------------------------

--
-- Table structure for table `bscsoftwareengineering`
--

CREATE TABLE `bscsoftwareengineering` (
  `studentNo` varchar(15) NOT NULL,
  `sdp1` int(3) NOT NULL,
  `db` int(3) NOT NULL,
  `mathematics` int(3) NOT NULL,
  `oop1` int(3) NOT NULL,
  `wd` int(3) NOT NULL,
  `cf` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `courseName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`courseName`) VALUES
('Bsc. Information Systems'),
('BSc. Software Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE `lecturer` (
  `lecturerId` varchar(15) NOT NULL,
  `FirstName` varchar(250) NOT NULL,
  `LastName` varchar(250) NOT NULL,
  `Position` varchar(250) NOT NULL,
  `MobileNo` varchar(10) NOT NULL,
  `Sex` varchar(250) NOT NULL,
  `Address` varchar(250) NOT NULL,
  `Course` varchar(250) NOT NULL,
  `Module` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`lecturerId`, `FirstName`, `LastName`, `Position`, `MobileNo`, `Sex`, `Address`, `Course`, `Module`) VALUES
('30.01', 'John', 'Matt', 'Senior Lecturer', '0123658746', 'Male', '1/3, Main Streer, Australis', 'Bsc. Information Systems', 'Software Development 01'),
('30.1', 'Matt ', 'Jacob', 'Junior Lecturer', '0877456236', 'Male', '1/78, Victoria', 'BSc. Software Engineering', 'Mathematics');

-- --------------------------------------------------------

--
-- Table structure for table `modules`
--

CREATE TABLE `modules` (
  `moduleCode` varchar(15) NOT NULL,
  `moduleName` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `modules`
--

INSERT INTO `modules` (`moduleCode`, `moduleName`) VALUES
('ADDA', 'Accounting'),
('ASSC', 'Computer Security'),
('ASSE', 'Information Systems'),
('AWER', 'Communication Skills'),
('ECSD', 'Mathematics'),
('ECSI ', 'Software Development 01'),
('EDDE', 'Database'),
('ERTS', 'Computer Fundermeantals'),
('EUTY', 'Object Oriented Programming'),
('EYTR', 'Web Designing');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentNo` varchar(15) NOT NULL,
  `FirstName` varchar(250) NOT NULL,
  `LastName` varchar(250) NOT NULL,
  `Birthday` varchar(10) NOT NULL,
  `MobileNo` varchar(10) NOT NULL,
  `Sex` varchar(250) NOT NULL,
  `Address` varchar(250) NOT NULL,
  `Course` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentNo`, `FirstName`, `LastName`, `Birthday`, `MobileNo`, `Sex`, `Address`, `Course`) VALUES
('01', 'Naveen', 'Vass', '17.08.1994', '0745659874', 'Male', '14/85 Start Street, Wellawatta', 'Bsc. Information Systems');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Username` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Username`, `Password`) VALUES
('admin', 'admin'),
('student', 'student');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bscinformationsystems`
--
ALTER TABLE `bscinformationsystems`
  ADD KEY `FK_bscinformationsystems_student` (`studentNo`);

--
-- Indexes for table `bscsoftwareengineering`
--
ALTER TABLE `bscsoftwareengineering`
  ADD PRIMARY KEY (`studentNo`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`courseName`);

--
-- Indexes for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD PRIMARY KEY (`lecturerId`);

--
-- Indexes for table `modules`
--
ALTER TABLE `modules`
  ADD PRIMARY KEY (`moduleCode`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentNo`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Username`),
  ADD UNIQUE KEY `Password` (`Password`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bscinformationsystems`
--
ALTER TABLE `bscinformationsystems`
  ADD CONSTRAINT `FK_bscinformationsystems_student` FOREIGN KEY (`studentNo`) REFERENCES `student` (`studentNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `bscsoftwareengineering`
--
ALTER TABLE `bscsoftwareengineering`
  ADD CONSTRAINT `FK_bscsoftwareengineering_student` FOREIGN KEY (`studentNo`) REFERENCES `student` (`studentNo`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
