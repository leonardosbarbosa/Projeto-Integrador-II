create database sistemaVendas;
use sistemaVendas;

create table clientes(
id int auto_increment not null,
nome varchar(60) not null,
cpf varchar(11) unique key not null,
rg varchar (9) unique key not null,
nascimento date not null,
sexo varchar (15) not null,
fixo varchar (10) null,
celular varchar (11) null,
email varchar (60) null,
rua varchar (60)not null,
bairro varchar (60)not null,
uf char (2)not null,
cep varchar (8)not null,
cidade varchar (60)not null,
 primary key (id));

 create table produtos(
 id int auto_increment not null,
 descr varchar(60) not null,
 un varchar (25) not null,
 fornecedor varchar(60) not null,
 marca varchar(30) not null,
 vlr_compra decimal(9,2) not null,
 vlr_venda decimal(9,2) not null,
 qtd_estoque int not null,
 categoria varchar(60) not null,
 primary key(id));

 create table vendas(
 id int auto_increment not null,
 id_cli int not null,
 id_prod int not null,
 qtd int not null,
 total decimal(9,2) not null,
 data_compra date not null,
 hora time not null,
 primary key(id),
 foreign key (id_cli) references clientes(id),
 foreign key (id_prod) references produtos(id));
