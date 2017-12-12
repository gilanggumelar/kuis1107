-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.45
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1107`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1107`
--

CREATE TABLE `cv_1107` (
  `id` bigint(20) NOT NULL,
  `classes` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1107`
--

INSERT INTO `cv_1107` (`id`, `classes`, `name`) VALUES
(1, '3tic', 'gilang'),
(2, '3 tia', 'gial'),
(3, '3 tib', 'guncono');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1107`
--

CREATE TABLE `nilai_1107` (
  `id` bigint(20) NOT NULL,
  `score` double NOT NULL,
  `subject_name` varchar(150) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `cv_1107_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1107`
--

INSERT INTO `nilai_1107` (`id`, `score`, `subject_name`, `description`, `cv_1107_id`) VALUES
(3, 88, 'framework', 'graded', 3),
(11, 90, 'data warehouse', 'graded', 1),
(12, 45, 'akjk', 'not graded', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1107`
--
ALTER TABLE `cv_1107`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_so0jsrsb5c26nbwthjspjomlt` (`name`);

--
-- Indexes for table `nilai_1107`
--
ALTER TABLE `nilai_1107`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKb9uci2hev0pqogx67u6rgg2qs` (`cv_1107_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1107`
--
ALTER TABLE `cv_1107`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1107`
--
ALTER TABLE `nilai_1107`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1107`
--
ALTER TABLE `nilai_1107`
  ADD CONSTRAINT `FKb9uci2hev0pqogx67u6rgg2qs` FOREIGN KEY (`cv_1107_id`) REFERENCES `cv_1107` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
