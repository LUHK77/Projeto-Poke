
DROP database pokepoki;
CREATE DATABASE DBpoke
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI; 

USE DBpoke;

DROP TABLE poke;
CREATE TABLE poke (
id int not null auto_increment,
nome varchar(50) not null,
hp int,
stamina int,
PRIMARY KEy(id)
) DEFAULT CHARSET = utf8mb4;

