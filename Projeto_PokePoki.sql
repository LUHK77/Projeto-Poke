
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
PRIMARY KEy(id)
) DEFAULT CHARSET = utf8mb4;

DROP TABLE ataque;
CREATE TABLE ataque(
id int not null auto_increment,
nome varchar(50) not null,
efeito varchar(50) not null,
valor double not null,
custo int,
poke_id int,
primary key(id)
) DEFAULT CHARSET = utf8mb4;

alter table ataque
add foreign key(poke_id)
references poke(id);



insert into poke(nome,tipo,atk_base,stamina,hp,image_path) values ("Galo Cururu","Lutador",8,16,20,"sss/sss/ssss");

insert into ataque (nome,efeito,valor,custo,poke_id) values ("Soco Normal","ataque",5,1,1);
insert into ataque (nome,efeito,valor,custo,poke_id) values ("Soco Forte","ataque",10,5,1);
SELECT * from ataque;
SELECT id,nome,tipo,atk_base,stamina,hp FROM poke;

SELECT p.id,p.nome,p.tipo,p.atk_base,p.stamina,p.hp, a.nome from poke as p
join ataque as a where p.id = 1; 


