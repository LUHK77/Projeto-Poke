
CREATE DATABASE DBpoke
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI; 

USE DBpoke;

DROP TABLE poke;
CREATE TABLE poke (
id int not null auto_increment,
apelido varchar(50) not null,
level_poke int,
exp_poke int, 
hp int,
stamina int,
PRIMARY KEy(id)
) DEFAULT CHARSET = utf8mb4;

insert into poke (id, apelido, level_poke, exp_poke, hp,stamina) values (1,'Galo',1,0,20,16);
insert into poke (id, apelido, level_poke, exp_poke, hp,stamina) values (2,'Papaco',1,0,36,12);
