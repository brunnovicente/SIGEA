-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.7.20-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para sigea
DROP DATABASE IF EXISTS `sigea`;
CREATE DATABASE IF NOT EXISTS `sigea` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sigea`;

-- Copiando estrutura para tabela sigea.amostras
DROP TABLE IF EXISTS `amostras`;
CREATE TABLE IF NOT EXISTS `amostras` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bloco` varchar(255) DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  `enfermaria` varchar(255) DEFAULT NULL,
  `idade` int(11) NOT NULL,
  `leito` varchar(255) DEFAULT NULL,
  `medico` varchar(255) DEFAULT NULL,
  `medular` varchar(255) DEFAULT NULL,
  `mielocultura` varchar(255) DEFAULT NULL,
  `obs` varchar(255) DEFAULT NULL,
  `quantidade` int(11) NOT NULL,
  `registro` int(11) NOT NULL,
  `paciente` int(11) DEFAULT NULL,
  `usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_rq4pys412hkh6txvx99g3lxus` (`paciente`),
  KEY `FK_6t426geacrdkw7vhok9x57wso` (`usuario`),
  CONSTRAINT `FK_6t426geacrdkw7vhok9x57wso` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`id`),
  CONSTRAINT `FK_rq4pys412hkh6txvx99g3lxus` FOREIGN KEY (`paciente`) REFERENCES `pacientes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sigea.amostras: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `amostras` DISABLE KEYS */;
/*!40000 ALTER TABLE `amostras` ENABLE KEYS */;

-- Copiando estrutura para tabela sigea.livros
DROP TABLE IF EXISTS `livros`;
CREATE TABLE IF NOT EXISTS `livros` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `N` varchar(255) DEFAULT NULL,
  `caixa` int(11) NOT NULL,
  `codigoL` int(11) NOT NULL,
  `data` varchar(255) DEFAULT NULL,
  `idade` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `obs` varchar(255) DEFAULT NULL,
  `ordem` int(11) NOT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sigea.livros: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `livros` DISABLE KEYS */;
/*!40000 ALTER TABLE `livros` ENABLE KEYS */;

-- Copiando estrutura para tabela sigea.locais
DROP TABLE IF EXISTS `locais`;
CREATE TABLE IF NOT EXISTS `locais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `local` varchar(255) DEFAULT NULL,
  `quantidade` int(11) NOT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `amostra` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_8otggj891b6sysw8v5csrwhko` (`amostra`),
  CONSTRAINT `FK_8otggj891b6sysw8v5csrwhko` FOREIGN KEY (`amostra`) REFERENCES `amostras` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sigea.locais: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `locais` DISABLE KEYS */;
/*!40000 ALTER TABLE `locais` ENABLE KEYS */;

-- Copiando estrutura para tabela sigea.pacientes
DROP TABLE IF EXISTS `pacientes`;
CREATE TABLE IF NOT EXISTS `pacientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sigea.pacientes: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;

-- Copiando estrutura para tabela sigea.reais
DROP TABLE IF EXISTS `reais`;
CREATE TABLE IF NOT EXISTS `reais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `caixa` int(11) NOT NULL,
  `codigoR` int(11) NOT NULL,
  `dataCongelamento` varchar(255) DEFAULT NULL,
  `local` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `repetida` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sigea.reais: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `reais` DISABLE KEYS */;
/*!40000 ALTER TABLE `reais` ENABLE KEYS */;

-- Copiando estrutura para tabela sigea.tipos
DROP TABLE IF EXISTS `tipos`;
CREATE TABLE IF NOT EXISTS `tipos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sigea.tipos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tipos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipos` ENABLE KEYS */;

-- Copiando estrutura para tabela sigea.usuarios
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sigea.usuarios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
