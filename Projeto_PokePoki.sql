
DROP database pokepoki;
CREATE DATABASE DBpoke
DEFAULT CHARACTER SET UTF8MB4
DEFAULT COLLATE UTF8MB4_GENERAL_CI; 

USE DBpoke;

DROP TABLE poke;
CREATE TABLE poke (
id int not null auto_increment,
nome varchar(50) not null,
tipo varchar(50) not null,
atk_base int not null,
stamina int not null,
hp int not null,
image_path varchar(70) not null,
ataque1_id int,
ataque2_id int,
PRIMARY KEy(id)
) DEFAULT CHARSET = utf8mb4;

DROP TABLE ataque;
CREATE TABLE ataque(
id int not null auto_increment,
nome varchar(50) not null,
efeito varchar(50) not null,
valor double not null,
primary key(id)
) DEFAULT CHARSET = utf8mb4;

alter table poke
add foreign key(ataque1_id)
references ataque(id);

alter table poke
add foreign key(ataque2_id)
references ataque(id);


insert into poke(nome,tipo,atk_base,stamina,hp,image_path) values ("Galo Cururu","Lutador",8,16,20,"sss/sss/ssss");

insert into ataque (nome,efeito,valor) values ("Soco Normal","ataque",0);
insert into ataque (nome,efeito,valor) values ("Soco Forte","ataque",5);
SELECT * from ataque;
SELECT nome,tipo,atk_base,stamina,hp FROM poke;


