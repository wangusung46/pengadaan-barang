-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: pengadaan
-- ------------------------------------------------------
-- Server version	5.5.5-10.6.8-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detail_kontrak`
--

DROP TABLE IF EXISTS `detail_kontrak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail_kontrak` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_kontrak` bigint(20) NOT NULL,
  `pekerjaan` varchar(100) NOT NULL,
  `volume` bigint(20) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `jumlah` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_kontrak`
--

LOCK TABLES `detail_kontrak` WRITE;
/*!40000 ALTER TABLE `detail_kontrak` DISABLE KEYS */;
INSERT INTO `detail_kontrak` VALUES (1,1,'1',1,'1',12,12);
/*!40000 ALTER TABLE `detail_kontrak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_pembelian`
--

DROP TABLE IF EXISTS `detail_pembelian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail_pembelian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_pembelian` bigint(20) NOT NULL,
  `barang` varchar(100) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `volume` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_pembelian`
--

LOCK TABLES `detail_pembelian` WRITE;
/*!40000 ALTER TABLE `detail_pembelian` DISABLE KEYS */;
INSERT INTO `detail_pembelian` VALUES (1,1,'1','1',1);
/*!40000 ALTER TABLE `detail_pembelian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_penjualan`
--

DROP TABLE IF EXISTS `detail_penjualan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail_penjualan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_penjualan` bigint(20) NOT NULL,
  `barang` varchar(100) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `volume` bigint(20) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `subtotal` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_penjualan`
--

LOCK TABLES `detail_penjualan` WRITE;
/*!40000 ALTER TABLE `detail_penjualan` DISABLE KEYS */;
INSERT INTO `detail_penjualan` VALUES (1,1,'1','1',1,1,1);
/*!40000 ALTER TABLE `detail_penjualan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `klien`
--

DROP TABLE IF EXISTS `klien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `klien` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telepon` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `klien`
--

LOCK TABLES `klien` WRITE;
/*!40000 ALTER TABLE `klien` DISABLE KEYS */;
INSERT INTO `klien` VALUES (1,'Andre','gedong','812'),(2,'AA','AA','AA');
/*!40000 ALTER TABLE `klien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kontrak`
--

DROP TABLE IF EXISTS `kontrak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kontrak` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  `tanggal_kontrak` date NOT NULL,
  `id_klien` int(7) NOT NULL,
  `nama_proyek` varchar(100) NOT NULL,
  `user` varchar(100) NOT NULL,
  `nilai_kontrak` float NOT NULL,
  `lama_proyek` bigint(20) NOT NULL,
  `syarat_pembayaran` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kontrak`
--

LOCK TABLES `kontrak` WRITE;
/*!40000 ALTER TABLE `kontrak` DISABLE KEYS */;
INSERT INTO `kontrak` VALUES (1,'2021-06-03',1,'AAA','1',1,1,'AAA'),(2,'2022-07-26',2,'1234','1',1234,1234,'1234');
/*!40000 ALTER TABLE `kontrak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pembelian`
--

DROP TABLE IF EXISTS `pembelian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pembelian` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  `id_kontrak` int(8) NOT NULL,
  `tanggal_pembelian` date NOT NULL,
  `id_supplier` int(8) NOT NULL,
  `netto` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pembelian`
--

LOCK TABLES `pembelian` WRITE;
/*!40000 ALTER TABLE `pembelian` DISABLE KEYS */;
INSERT INTO `pembelian` VALUES (1,1,'2022-05-14',1,1),(2,1,'2022-07-26',1,1234);
/*!40000 ALTER TABLE `pembelian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penjualan`
--

DROP TABLE IF EXISTS `penjualan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `penjualan` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `tanggal_penjualan` date NOT NULL,
  `id_pembelian` int(8) NOT NULL,
  `netto` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penjualan`
--

LOCK TABLES `penjualan` WRITE;
/*!40000 ALTER TABLE `penjualan` DISABLE KEYS */;
INSERT INTO `penjualan` VALUES (1,'2022-05-14',1,1),(2,'2022-07-09',1,12345);
/*!40000 ALTER TABLE `penjualan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  `nama_supplier` varchar(35) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `telepon` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'Dano','123','123'),(2,'1234','123','123');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `username` varchar(100) NOT NULL,
  `password` int(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `role` enum('Admin','Kepala Gudang','Manajer','') NOT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('1',1,'1','Admin','111'),('2',2,'2','Manajer','222'),('3',3,'3','Kepala Gudang','333');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'pengadaan'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-27  0:30:35
