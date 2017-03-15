-- phpMyAdmin SQL Dump
-- version 4.4.15.5
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 15, 2017 at 12:20 PM
-- Server version: 5.6.34-log
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airafpa`
--
CREATE DATABASE IF NOT EXISTS `airafpa` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `airafpa`;

-- --------------------------------------------------------

--
-- Table structure for table `access_backoffice`
--

CREATE TABLE IF NOT EXISTS `access_backoffice` (
  `user_id` bigint(20) unsigned NOT NULL,
  `nickname` varchar(16) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `access_backoffice`
--

INSERT INTO `access_backoffice` (`user_id`, `nickname`, `password`) VALUES
(97, 'carlabruni', 'a94a8fe5ccb19ba61c4c0873d391e987982fbbd3'),
(96, 'root', 'dc76e9f0c0006e8f919e0c515c66dbba3982f785');

-- --------------------------------------------------------

--
-- Table structure for table `access_site`
--

CREATE TABLE IF NOT EXISTS `access_site` (
  `user_id` bigint(20) unsigned NOT NULL,
  `nickname` varchar(16) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `access_site`
--

INSERT INTO `access_site` (`user_id`, `nickname`, `password`) VALUES
(20, 'accumsan', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(39, 'amet', '8a0d57c30df12c9cba4cb4f190a86e471f1a6c7e'),
(52, 'Anderson', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(43, 'Burke', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(79, 'Burkeke', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(63, 'Butler', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(93, 'Chapman', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(32, 'condimentum', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(47, 'Cook', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(42, 'Dean', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(35, 'diam', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(44, 'Diaz', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(6, 'dolor', '30c85ffbd1cbc9018986de8669bb43f997e4b541'),
(13, 'duis', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(74, 'Dunn', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(11, 'eget', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(36, 'elementum', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(41, 'erat', '8a0d57c30df12c9cba4cb4f190a86e471f1a6c7e'),
(16, 'est', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(7, 'etiam', '30c85ffbd1cbc9018986de8669bb43f997e4b541'),
(73, 'Ferguson', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(92, 'Fields', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(58, 'Fuller', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(48, 'Gardner', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(45, 'Gibson', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(95, 'Gilbert', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(90, 'Gomez', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(82, 'Graham', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(50, 'Gray', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(86, 'Greene', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(18, 'habitasse', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(23, 'hac', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(81, 'Hamilton', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(46, 'Harvey', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(85, 'Hawkins', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(70, 'Holmes', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(68, 'Hughes', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(26, 'iaculis', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(29, 'ipsum', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(75, 'Jones', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(17, 'justo', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(87, 'Lawson', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(83, 'LeBeauFerguson', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(9, 'leo', '30c85ffbd1cbc9018986de8669bb43f997e4b541'),
(65, 'Matthews', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(12, 'mauris', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(64, 'Mcdonald', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(56, 'mdrdu23', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(54, 'Medina', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(89, 'Mendoza', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(24, 'metus', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(33, 'morbi', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(94, 'Nelson', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(28, 'non', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(19, 'nunc', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(31, 'odio', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(67, 'Oliver', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(38, 'ololol', '8a0d57c30df12c9cba4cb4f190a86e471f1a6c7e'),
(53, 'Olson', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(80, 'Palmer', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(14, 'pellentesque', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(78, 'Porter', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(62, 'Powell', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(61, 'Price', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(22, 'primis', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(30, 'proin', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(27, 'purus', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(72, 'Reid', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(88, 'Reynolds', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(10, 'rhoncus', '30c85ffbd1cbc9018986de8669bb43f997e4b541'),
(71, 'RichardOlOl', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(60, 'Roberts', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(77, 'Rose', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(69, 'Ruiz', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(34, 'sem', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(21, 'semper', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(57, 'Shaw', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(51, 'Smith', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(8, 'tellus', '30c85ffbd1cbc9018986de8669bb43f997e4b541'),
(66, 'Thomas', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(37, 'tincidunt', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(49, 'Torres', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(25, 'tristique', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(40, 'ultrices', '8a0d57c30df12c9cba4cb4f190a86e471f1a6c7e'),
(15, 'vestibulum', '4b6cfa124411971901869dc6e1b00e5d3de5f1cc'),
(76, 'Washington', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(91, 'Wells', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(55, 'Willis', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(59, 'Wood', '714099846d5fca096f50c162b6d1bdc1378c12ec'),
(84, 'Woods', '714099846d5fca096f50c162b6d1bdc1378c12ec');

-- --------------------------------------------------------

--
-- Table structure for table `airports`
--

CREATE TABLE IF NOT EXISTS `airports` (
  `aita` varchar(4) NOT NULL,
  `city` varchar(64) NOT NULL,
  `pays` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `airports`
--

INSERT INTO `airports` (`aita`, `city`, `pays`) VALUES
('DXB', 'Dubaï', 'Émirats arabes unis'),
('FNJ', 'Pyongyang', 'Corée du Nord'),
('ICN', 'Grand Séoul', 'Corée du Sud'),
('JFK', 'New York', 'USA'),
('LAS', 'Las Vegas', 'USA'),
('MRS', 'Marseille', 'France'),
('ORY', 'Paris', 'France'),
('TLS', 'Toulouse', 'France'),
('YQB', 'Québec', 'Canada');

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE IF NOT EXISTS `bookings` (
  `id` bigint(20) unsigned NOT NULL,
  `user_id` bigint(20) unsigned NOT NULL,
  `flight_id` bigint(20) unsigned NOT NULL,
  `place` smallint(5) unsigned NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`id`, `user_id`, `flight_id`, `place`) VALUES
(1, 10, 1, 1),
(2, 13, 1, 2),
(3, 16, 1, 3),
(4, 19, 1, 4),
(5, 22, 1, 5),
(6, 25, 1, 6),
(7, 28, 1, 7),
(8, 31, 1, 8),
(9, 34, 1, 9),
(10, 37, 1, 10),
(11, 40, 1, 11),
(12, 43, 1, 12),
(13, 46, 1, 13),
(14, 49, 1, 14),
(15, 52, 1, 15),
(16, 55, 1, 16),
(17, 58, 1, 17),
(18, 61, 1, 18),
(19, 64, 1, 19),
(20, 67, 1, 20),
(21, 70, 1, 21),
(22, 73, 1, 22),
(23, 76, 1, 23),
(24, 79, 1, 24),
(25, 82, 1, 25),
(26, 85, 1, 26),
(27, 88, 1, 27),
(28, 91, 1, 28),
(29, 94, 1, 29);

-- --------------------------------------------------------

--
-- Table structure for table `flights`
--

CREATE TABLE IF NOT EXISTS `flights` (
  `id` bigint(20) unsigned NOT NULL,
  `departing_aita` varchar(4) NOT NULL,
  `arrival_aita` varchar(4) NOT NULL,
  `departing_hour` datetime NOT NULL,
  `duration` int(10) unsigned NOT NULL DEFAULT '0',
  `price` double unsigned NOT NULL DEFAULT '0',
  `id_pilot` bigint(20) unsigned DEFAULT NULL,
  `id_copilot` bigint(20) unsigned DEFAULT NULL,
  `id_staff1` bigint(20) unsigned DEFAULT NULL,
  `id_staff2` bigint(20) unsigned DEFAULT NULL,
  `id_staff3` bigint(20) unsigned DEFAULT NULL,
  `planned` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `flights`
--

INSERT INTO `flights` (`id`, `departing_aita`, `arrival_aita`, `departing_hour`, `duration`, `price`, `id_pilot`, `id_copilot`, `id_staff1`, `id_staff2`, `id_staff3`, `planned`) VALUES
(1, 'MRS', 'FNJ', '2017-03-20 05:30:00', 720, 250, 1, 2, 3, 4, 5, 1),
(2, 'ORY', 'DXB', '2017-03-29 13:25:00', 480, 247.89, NULL, NULL, NULL, NULL, NULL, 0),
(3, 'JFK', 'LAS', '2017-03-17 17:45:00', 120, 69.99, NULL, NULL, NULL, NULL, NULL, 0),
(4, 'TLS', 'YQB', '2017-04-10 05:30:00', 360, 116.89, NULL, NULL, NULL, NULL, NULL, 0),
(5, 'DXB', 'ICN', '2017-05-01 08:00:00', 420, 358.67, 1, NULL, 4, NULL, NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `functions`
--

CREATE TABLE IF NOT EXISTS `functions` (
  `id` tinyint(3) unsigned NOT NULL,
  `definition` varchar(32) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `functions`
--

INSERT INTO `functions` (`id`, `definition`) VALUES
(1, 'Pilote'),
(2, 'Co-Pilote'),
(3, 'Steward'),
(4, 'Hôtesse'),
(5, 'Admin'),
(6, 'Employé'),
(7, 'Secrétaire');

-- --------------------------------------------------------

--
-- Table structure for table `roles_rights`
--

CREATE TABLE IF NOT EXISTS `roles_rights` (
  `user_id` bigint(20) unsigned NOT NULL,
  `admin` tinyint(1) NOT NULL DEFAULT '0',
  `blocked` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `roles_rights`
--

INSERT INTO `roles_rights` (`user_id`, `admin`, `blocked`) VALUES
(96, 1, 0),
(97, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint(20) unsigned NOT NULL,
  `firstname` varchar(32) NOT NULL,
  `lastname` varchar(32) NOT NULL,
  `address` varchar(128) NOT NULL,
  `city` varchar(64) NOT NULL,
  `country` varchar(32) NOT NULL,
  `tel` varchar(32) NOT NULL,
  `mail` varchar(128) NOT NULL,
  `function` tinyint(3) unsigned DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstname`, `lastname`, `address`, `city`, `country`, `tel`, `mail`, `function`) VALUES
(1, 'Jim', 'Lovell', '2 Avenue du beau moulin', 'Paris', 'France', '0147200001', 'jim.lovell@disney.com', 1),
(2, 'Robert', 'De Niro', '8 Rue de l''arbre du pendu', 'Avignon', 'France', '0601020304', 'robert.deniro@cestrobert.com', 2),
(3, 'Jean', 'Bon', '126 Boulevard du service secret', 'Soisy-sur-École', 'France', '0290949496', 'jean.bon@chutahah.com', 3),
(4, 'Sandy', 'Kilos', '20 Impasse du poids lourd', 'Rungis', 'France', '0845634783', 'sandy.kilos@pasdeblaguessvp.biz', 4),
(5, 'Jeanne', 'De l''Arc', '8 Rue des morts', 'Paris', 'France', '0101020203', 'jeanne.arc@visions.org', 4),
(6, 'Ethan', 'Joly', '916 Quis Impasse', 'Épernay', 'France', '(208) 743-7786', 'ligula.tortor.dictum@odiosempercursus.edu', NULL),
(7, 'Juliette', 'Arnaud', '440-2589 Ornare. Route', 'Saintes', 'France', '(637) 334-7266', 'condimentum.Donec.at@temporaugueac.ca', NULL),
(8, 'Anthony', 'Evrard', 'Appartement 995-7300 Orci, Chemin', 'Hérouville-Saint-Clair', 'France', '(657) 144-8351', 'ut.aliquam@cursusluctus.com', NULL),
(9, 'Manon', 'Cousin', '9959 Ante Avenue', 'Brive-la-Gaillarde', 'France', '(611) 571-9507', 'rutrum.Fusce@diamluctus.net', NULL),
(10, 'Thomas', 'Lacroix', '7570 Est Ave', 'Compiègne', 'France', '(316) 645-8305', 'auctor@dictum.net', NULL),
(11, 'Jules', 'Louis', '186-9307 Ornare Rd.', 'Belfort', 'France', '(891) 849-1605', 'nisl.Nulla@Suspendissealiquet.co.uk', NULL),
(12, 'Arthur', 'Meyer', '234-5137 Tincidunt Rd.', 'Bourges', 'France', '(306) 423-6019', 'Fusce@lobortis.org', NULL),
(13, 'Alexia', 'Gerard', 'Appartement 436-6245 Velit. Ave', 'Maubeuge', 'France', '(291) 493-2269', 'scelerisque.scelerisque@feugiat.edu', NULL),
(14, 'Lutécia', 'Gillet', 'CP 503, 4722 Massa. Route', 'Belfort', 'France', '(198) 502-6949', 'nec@eratvelpede.com', NULL),
(15, 'Lamia', 'Guyot', 'CP 411, 330 Dapibus Rue', 'Sens', 'France', '(726) 998-6424', 'pretium.aliquet@loremsemper.net', NULL),
(16, 'Nolan', 'Bailly', '230 Nec Impasse', 'Rouen', 'France', '(922) 359-8895', 'felis@etmalesuadafames.ca', NULL),
(17, 'Hugo', 'Lacroix', 'Appartement 882-2612 Euismod Impasse', 'Niort', 'France', '(354) 881-0533', 'sit.amet.ornare@sociosquadlitora.net', NULL),
(18, 'Kimberley', 'Collin', '4162 Nonummy. Impasse', 'Saint-Louis', 'France', '(632) 203-9465', 'dui.Cum.sociis@Maurisnulla.co.uk', NULL),
(19, 'Enzo', 'Gautier', 'Appartement 254-6794 Ac Avenue', 'Créteil', 'France', '(979) 800-6086', 'dignissim@nuncnulla.com', NULL),
(20, 'Anna', 'Dumont', '4364 Sit Ave', 'Dieppe', 'France', '(162) 677-5674', 'magna@nostraperinceptos.net', NULL),
(21, 'Adam', 'Hubert', 'Appartement 417-5103 Mauris Impasse', 'Dieppe', 'France', '(229) 346-0106', 'faucibus.orci.luctus@aliquet.org', NULL),
(22, 'Lola', 'Mercier', '693-2596 Libero Rue', 'Montluçon', 'France', '(149) 239-2759', 'ut@Praesentluctus.edu', NULL),
(23, 'Maryam', 'Henry', 'CP 406, 8741 At Ave', 'Illkirch-Graffenstaden', 'France', '(521) 435-0618', 'pede@Fuscefermentum.com', NULL),
(24, 'Gabin', 'Dumont', '4524 Quis Rue', 'Carcassonne', 'France', '(453) 946-8249', 'consectetuer@mauriserateget.ca', NULL),
(25, 'Kyllian', 'Martin', 'Appartement 242-4913 Ante Rd.', 'Chalon-sur-Saône', 'France', '(285) 172-0465', 'lorem@Donec.org', NULL),
(26, 'Marwane', 'Guerin', '3386 Orci Av.', 'Dijon', 'France', '(656) 460-4325', 'eget.volutpat@tinciduntcongueturpis.edu', NULL),
(27, 'Anthony', 'Vidal', '336-6061 Mollis Chemin', 'Montbéliard', 'France', '(668) 174-2322', 'Quisque.purus.sapien@IntegermollisInteger.ca', NULL),
(28, 'Alice', 'Carpentier', 'Appartement 504-9360 Sit Impasse', 'Blois', 'France', '(277) 678-1313', 'gravida@lacusvariuset.org', NULL),
(29, 'Léonard', 'Vasseur', '838-547 Dui, Avenue', 'Ajaccio', 'France', '(286) 803-1112', 'sit@eu.co.uk', NULL),
(30, 'Valentin', 'Fournier', 'CP 890, 789 Et Impasse', 'Besançon', 'France', '(217) 370-6009', 'Proin.eget.odio@risusDonecegestas.org', NULL),
(31, 'Marwane', 'Marie', 'Appartement 115-9411 Ut Impasse', 'Bastia', 'France', '(952) 417-1968', 'Nulla.facilisi@vitaevelit.com', NULL),
(32, 'Antonin', 'Mathieu', 'Appartement 721-6500 Duis Avenue', 'Lens', 'France', '(213) 698-2246', 'In.lorem@gravida.net', NULL),
(33, 'Lamia', 'Jacob', 'Appartement 126-3413 Eu Route', 'Saint-Nazaire', 'France', '(958) 986-2869', 'dolor.Donec.fringilla@laciniamattis.co.uk', NULL),
(34, 'Quentin', 'Le goff', '1027 Id Route', 'Villeneuve-d''Ascq', 'France', '(988) 124-2323', 'libero@urna.edu', NULL),
(35, 'Thibault', 'Germain', '9002 Adipiscing Chemin', 'Dunkerque', 'France', '(917) 558-1456', 'vulputate.eu@sedpedenec.ca', NULL),
(36, 'Julie', 'Maillard', 'CP 729, 9835 Auctor, Av.', 'Illkirch-Graffenstaden', 'France', '(658) 538-0169', 'mauris.blandit@gravidamaurisut.ca', NULL),
(37, 'Eva', 'Legrand', 'CP 929, 1675 Velit. Ave', 'Wattrelos', 'France', '(250) 573-5069', 'Integer@laoreetliberoet.edu', NULL),
(38, 'Amandine', 'Menard', '9197 Urna Impasse', 'Saint-Louis', 'France', '(509) 543-0905', 'rutrum.lorem.ac@anteNuncmauris.org', NULL),
(39, 'Aaron', 'Sanchez', 'Appartement 733-8477 Mauris Av.', 'Toulouse', 'France', '(215) 854-9665', 'sollicitudin.adipiscing.ligula@augueutlacus.ca', NULL),
(40, 'Cloé', 'Maillard', 'Appartement 416-6291 Semper Chemin', 'Lambersart', 'France', '(723) 831-5356', 'purus.Maecenas.libero@adlitoratorquent.com', NULL),
(41, 'Thibault', 'Carpentier', 'CP 679, 1426 Eu, Avenue', 'Alençon', 'France', '(313) 699-8962', 'euismod.enim.Etiam@gravidamaurisut.com', NULL),
(42, 'Lamia', 'Boucher', 'Appartement 363-211 Tincidunt, Av.', 'Fréjus', 'France', '(543) 504-1980', 'ligula.Aenean@Duisdignissim.net', NULL),
(43, 'Tatiana', 'Richard', '676-8663 Mauris Rue', 'Perpignan', 'France', '(174) 996-6078', 'nascetur.ridiculus.mus@quisarcu.org', NULL),
(44, 'Émilie', 'Brunet', 'Appartement 485-4846 Primis Impasse', 'Sens', 'France', '(222) 771-8628', 'aliquet@mauriserateget.ca', NULL),
(45, 'Solene', 'Nicolas', '3493 Magnis Avenue', 'Montluçon', 'France', '(592) 587-7749', 'commodo.at@nonleoVivamus.ca', NULL),
(46, 'Colin', 'Humbert', '303-1686 Duis Route', 'Soissons', 'France', '(667) 534-3207', 'tempus.eu.ligula@fringillaeuismodenim.co.uk', NULL),
(47, 'Ambre', 'Bourgeois', 'CP 244, 6191 Rhoncus. Rd.', 'Aurillac', 'France', '(310) 299-7164', 'Morbi.sit.amet@ametdapibus.co.uk', NULL),
(48, 'Nathan', 'Le gall', 'CP 554, 927 Eleifend. Avenue', 'Brive-la-Gaillarde', 'France', '(403) 786-2360', 'tortor@malesuada.net', NULL),
(49, 'Élouan', 'Guyot', '1373 Aliquam Chemin', 'Castres', 'France', '(579) 964-3028', 'non.enim@sitamet.com', NULL),
(50, 'Clotilde', 'Leclerc', 'CP 516, 8181 Odio Av.', 'Mulhouse', 'France', '(897) 825-7364', 'convallis@scelerisquemollisPhasellus.org', NULL),
(51, 'Candice', 'Paul', '3531 Sit Impasse', 'Saint-Sébastien-sur-Loire', 'France', '(799) 601-9912', 'est.Nunc@convallisligulaDonec.net', NULL),
(52, 'Diego', 'Olivier', '186-6168 Aliquet Route', 'Colomiers', 'France', '(571) 441-5912', 'sociis.natoque.penatibus@amet.edu', NULL),
(53, 'Tatiana', 'Duval', '476-1640 Ut Route', 'Montigny-lès-Metz', 'France', '(486) 350-8971', 'vel.vulputate@arcu.ca', NULL),
(54, 'Lorenzo', 'Moulin', '547-1936 Risus. Chemin', 'Castres', 'France', '(541) 158-1353', 'Ut.sagittis@lacusCras.com', NULL),
(55, 'Jules', 'Denis', '5917 Ornare, Rue', 'Épinal', 'France', '(795) 189-9317', 'a@Crasvulputatevelit.com', NULL),
(56, 'Brenden', 'Burris', '945-4969 Sed Av.', 'Kallo', 'Belgique', '(735) 715-7188', 'dolor@nullaIntincidunt.edu', NULL),
(57, 'Oliver', 'Horn', 'Appartement 632-4848 Hendrerit. Av.', 'HŽron', 'Belgique', '(308) 468-1531', 'mauris.erat@eu.net', NULL),
(58, 'Barbara', 'Ayala', 'Appartement 107-8971 Ante Avenue', 'Elversele', 'Belgique', '(548) 871-3572', 'euismod@adipiscingelitCurabitur.com', NULL),
(59, 'Georgia', 'Mcbride', 'Appartement 607-7053 Sapien Route', 'Kalken', 'Belgique', '(483) 402-1082', 'congue.a@tellusPhaselluselit.co.uk', NULL),
(60, 'Honorato', 'Patton', 'Appartement 589-3359 Mauris Chemin', 'Cognelee', 'Belgique', '(920) 409-3347', 'magna@Proin.ca', NULL),
(61, 'Hollee', 'Berry', '132-8364 Vehicula Route', 'Ganshoren', 'Belgique', '(218) 511-3384', 'rhoncus.Nullam@liberomaurisaliquam.net', NULL),
(62, 'Orla', 'Huff', '718-5654 Etiam Chemin', 'Latinne', 'Belgique', '(492) 437-8653', 'a.enim.Suspendisse@eleifendegestasSed.net', NULL),
(63, 'Vladimir', 'Caldwell', '104 Nulla Impasse', 'Kasteelbrakel', 'Belgique', '(551) 758-0327', 'risus.Nulla@ligulaeu.ca', NULL),
(64, 'Rina', 'Knox', '641 In Rd.', 'Seilles', 'Belgique', '(225) 635-1472', 'elit.sed.consequat@Crassedleo.ca', NULL),
(65, 'Xerxes', 'Ball', '1129 Amet Rd.', 'Luttre', 'Belgique', '(163) 285-8476', 'ligula@Duiscursusdiam.ca', NULL),
(66, 'Tad', 'Greene', '9313 Orci. Chemin', 'Berlin', 'Allemagne', '(965) 605-8062', 'torquent.per@aaliquetvel.edu', NULL),
(67, 'Zelenia', 'Moran', 'Appartement 161-5840 Erat Avenue', 'Groß-Gerau', 'Allemagne', '(135) 642-4394', 'dui.in@vitae.org', NULL),
(68, 'Giacomo', 'Duncan', 'CP 243, 4855 Nulla Impasse', 'Hamburg', 'Allemagne', '(738) 741-8976', 'neque@interdumfeugiatSed.edu', NULL),
(69, 'Yeo', 'Jefferson', '4360 Nulla Impasse', 'Waren', 'Allemagne', '(170) 775-7484', 'vulputate.dui.nec@Proinnonmassa.net', NULL),
(70, 'Clark', 'Stephenson', '1026 Integer Rd.', 'Neuss', 'Allemagne', '(396) 432-3783', 'eget@non.com', NULL),
(71, 'Samuel', 'Case', 'CP 773, 127 Dictum Ave', 'Stade', 'Allemagne', '(537) 505-9766', 'tortor.nibh@eueuismod.com', NULL),
(72, 'Veda', 'Garrison', '834-6510 Curabitur Ave', 'Hamburg', 'Allemagne', '(353) 621-0976', 'diam.Proin.dolor@luctuslobortis.co.uk', NULL),
(73, 'Dorothy', 'Hudson', '7383 Sed Avenue', 'Blieskastel', 'Allemagne', '(306) 731-8795', 'tincidunt@dui.com', NULL),
(74, 'Brianna', 'Hebert', 'Appartement 423-7389 Nulla Rd.', 'Bergisch Gladbach', 'Allemagne', '(992) 507-9037', 'orci@Proin.co.uk', NULL),
(75, 'Jaime', 'Leon', 'CP 675, 9946 Congue. Route', 'Schwäbisch Gmünd', 'Allemagne', '(980) 666-5449', 'eu@nequeIn.com', NULL),
(76, 'Mannix', 'Lowe', '8561 Libero Impasse', 'Grand Rapids', 'USA', '(409) 509-5221', 'elit@Pellentesque.ca', NULL),
(77, 'Chelsea', 'Bonner', '626-2670 Sit Av.', 'Lexington', 'USA', '(189) 611-7752', 'nec@montes.org', NULL),
(78, 'Thor', 'James', '899-5008 Donec Chemin', 'Wilmington', 'USA', '(522) 590-8728', 'justo@parturient.co.uk', NULL),
(79, 'Anjolie', 'Rose', 'CP 603, 6577 Tellus Chemin', 'Fayetteville', 'USA', '(791) 346-0003', 'Curabitur.ut@Integersemelit.edu', NULL),
(80, 'Garth', 'Lloyd', '5259 Velit. Rue', 'Evansville', 'USA', '(466) 932-0536', 'ornare.placerat@Suspendisse.edu', NULL),
(81, 'Ori', 'Sellers', 'Appartement 600-9823 Orci Avenue', 'Norman', 'USA', '(965) 332-7898', 'vestibulum.lorem@turpis.org', NULL),
(82, 'Donovan', 'Moore', 'CP 374, 946 Enim. Route', 'Des Moines', 'USA', '(469) 818-2532', 'molestie.arcu@metusAenean.co.uk', NULL),
(83, 'Aspen', 'Chavez', '350-8371 Sed Rd.', 'Norfolk', 'USA', '(705) 540-0989', 'pede.sagittis@maurisipsumporta.edu', NULL),
(84, 'Jonas', 'Foster', 'Appartement 258-1261 Lacus. Impasse', 'Little Rock', 'USA', '(358) 915-4207', 'arcu.Curabitur.ut@erosProin.net', NULL),
(85, 'Leroy', 'Donaldson', 'Appartement 141-3336 Donec Av.', 'Rutland', 'USA', '(717) 109-6579', 'at.velit@maurisblandit.net', NULL),
(86, 'Whitney', 'Bean', '2938 Egestas. Av.', 'Montpelier', 'USA', '(529) 484-2363', 'ligula@lacusQuisquepurus.com', NULL),
(87, 'Patience', 'Olson', '855-6410 Commodo Chemin', 'Vancouver', 'USA', '(225) 513-4213', 'aliquam@Duis.com', NULL),
(88, 'Mechelle', 'Weber', 'Appartement 993-9825 Ligula. Rd.', 'St. Petersburg', 'USA', '(311) 720-3924', 'Pellentesque.habitant@Sed.ca', NULL),
(89, 'Lacey', 'Walsh', 'CP 891, 9749 Eu Route', 'Kansas City', 'USA', '(776) 562-1708', 'natoque.penatibus@tortordictum.net', NULL),
(90, 'Rhiannon', 'Johns', 'CP 385, 7779 Et Chemin', 'Pike Creek', 'USA', '(268) 582-2111', 'ullamcorper@diamnunc.com', NULL),
(91, 'Nehru', 'Sweet', '5264 Nunc Rue', 'Davenport', 'USA', '(537) 762-5239', 'erat.nonummy.ultricies@Duis.net', NULL),
(92, 'Blossom', 'Beard', '8521 Est Ave', 'Fairbanks', 'USA', '(870) 711-4205', 'tellus.Phasellus.elit@turpis.ca', NULL),
(93, 'Tatum', 'Evans', '4379 Suspendisse Av.', 'San Francisco', 'USA', '(387) 248-6591', 'ipsum.leo@ridiculusmus.org', NULL),
(94, 'Griffith', 'Mcleod', 'CP 316, 2686 In Impasse', 'Auburn', 'USA', '(735) 285-3789', 'in.faucibus.orci@Quisque.com', NULL),
(95, 'Adrienne', 'Whitehead', '735 Nisl. Ave', 'Phoenix', 'USA', '(997) 950-7776', 'sagittis.felis.Donec@telluseu.net', NULL),
(96, 'Super', 'Admin', 'AIR AFPA', 'Paris', 'France', '0102030405', 'root@airafpa.fr', 5),
(97, 'Carla', 'Bruni', '2 Avenue du Moulin Rouge', 'Paris', 'France', '0102030405', 'carla.bruni@lol.com', 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `access_backoffice`
--
ALTER TABLE `access_backoffice`
  ADD UNIQUE KEY `nickname` (`nickname`),
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `access_site`
--
ALTER TABLE `access_site`
  ADD UNIQUE KEY `pseudo` (`nickname`),
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `airports`
--
ALTER TABLE `airports`
  ADD PRIMARY KEY (`aita`);

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_user_id4` (`user_id`),
  ADD KEY `fk_flight_id` (`flight_id`);

--
-- Indexes for table `flights`
--
ALTER TABLE `flights`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_departing_aita` (`departing_aita`),
  ADD KEY `fk_arrival_aita` (`arrival_aita`),
  ADD KEY `fk_id_pilot` (`id_pilot`),
  ADD KEY `fk_id_copilot` (`id_copilot`),
  ADD KEY `fk_id_staff1` (`id_staff1`),
  ADD KEY `fk_id_staff2` (`id_staff2`),
  ADD KEY `fk_id_staff3` (`id_staff3`);

--
-- Indexes for table `functions`
--
ALTER TABLE `functions`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `roles_rights`
--
ALTER TABLE `roles_rights`
  ADD UNIQUE KEY `user_id` (`user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `mail` (`mail`),
  ADD KEY `fk_function` (`function`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT for table `flights`
--
ALTER TABLE `flights`
  MODIFY `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `functions`
--
ALTER TABLE `functions`
  MODIFY `id` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=98;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `access_backoffice`
--
ALTER TABLE `access_backoffice`
  ADD CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `access_site`
--
ALTER TABLE `access_site`
  ADD CONSTRAINT `fk_user_id2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `bookings`
--
ALTER TABLE `bookings`
  ADD CONSTRAINT `fk_flight_id` FOREIGN KEY (`flight_id`) REFERENCES `flights` (`id`),
  ADD CONSTRAINT `fk_user_id4` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `flights`
--
ALTER TABLE `flights`
  ADD CONSTRAINT `fk_arrival_aita` FOREIGN KEY (`arrival_aita`) REFERENCES `airports` (`aita`),
  ADD CONSTRAINT `fk_departing_aita` FOREIGN KEY (`departing_aita`) REFERENCES `airports` (`aita`),
  ADD CONSTRAINT `fk_id_copilot` FOREIGN KEY (`id_copilot`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `fk_id_pilot` FOREIGN KEY (`id_pilot`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `fk_id_staff1` FOREIGN KEY (`id_staff1`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `fk_id_staff2` FOREIGN KEY (`id_staff2`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `fk_id_staff3` FOREIGN KEY (`id_staff3`) REFERENCES `users` (`id`);

--
-- Constraints for table `roles_rights`
--
ALTER TABLE `roles_rights`
  ADD CONSTRAINT `fk_user_id3` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_function` FOREIGN KEY (`function`) REFERENCES `functions` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
