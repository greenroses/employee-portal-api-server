--
-- Create user and grant all privileges.
-- The name and password must be exactly the same as in the following commands.
--

CREATE USER 'moonlighting'@'localhost' IDENTIFIED BY 'moonlighting';

GRANT ALL PRIVILEGES ON * . * TO 'moonlighting'@'localhost';

--
-- Create database `employee_tracker`.
--

CREATE DATABASE  IF NOT EXISTS `employee_tracker`;
USE `employee_tracker`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `hiredate` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;

INSERT INTO `employee` VALUES
    (1,'David Adams',60000,'20161201','david@gmail.com'),
    (2,'John Doe',70000,'20180220','john@gmail.com'),
    (3,'Ajay Rao',80000,'20161230','ajay@gmail.com'),
    (4,'Mary Public',90000,'20170620','mary@gmail.com'),
    (5,'Maxwell Dixon',100000,'20160101','max@gmail.com');

UNLOCK TABLES;
