drop database sistemaVendas;

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
 categoria varchar(45) not null,
 nome varchar(60) not null,
 un int not null,
 fornecedor varchar(60) not null,
 marca varchar(45) not null,
 vlr_compra decimal(9,2) not null,
 vlr_venda decimal(9,2) not null,
 qtd_estoque int not null,
 descr text not null,
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
 
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Emanuelly Mariah Bárbara Moraes','39739317804','474480124','1948/12/02','Feminino','9136296000','91989906346','emanuellymariahbarbaramoraes@luxafit.com.br','Rua Samuel Dutra','Tenoné','PA','66820413','Belém');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Elias Carlos Isaac Cardoso','56963310416','477080145','1974/09/05','Masculino','9527758877','95985051908','eliascarlosisaaccardoso-99@lynce.com.br','Rua Zuldimar Saraiva de Pinho','Jardim Caranã','RR','69313692','Boa Vista');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Raquel Bárbara Fátima dos Santos','14829010991','145444934','1966/12/22','Feminino','1726940017','17989865509','raquelbarbarafatimadossantos@otlokk.com','Travessa Machado de Assis','Cecap I','SP','15501093','Votuporanga');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Anderson Felipe Figueiredo','88275826730','178972113','1963/01/27','Masculino','4938004806','49997373480','andersonfelipefigueiredo@br.loreal.com','Avenida Nereu Ramos - D','Centro I','SC','89801023','Chapecó');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Cláudia Kamilly Alves','89216555653','202326007','1972/11/03','Feminino','4529424421','45987501024','claudiakamillyalves@systemsadvisers.com','Rua Lúcia Lorenzetti Malacarne','Jardim Parizzotto','PR','85914200','Toledo');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Nelson Juan Benício Fogaça','98949042541','103759207','1999/02/22','Masculino','6925461647','69991410485','nelsonjuanbeniciofogaca@yoma.com.br','Rua Velho Paraibinha','Urupá','RO','76900276','Ji-Paraná');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Carolina Débora Gabriela Jesus','67119258826','196312784','1986/07/09','Feminino','6937645455','69983685273','carolinadeboragabrielajesus_@vemter.com.br','Rua Glauber Rocha','Rio Madeira','RO','76821484','Porto Velho');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Tânia Débora Gomes','79255428969','151363328','1991/11/07','Feminino','8537586051','85986283862','taniadeboragomes-87@yahoo.com.ar','Rua 10','Passaré','CE','60743765','Fortaleza');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Giovanni Thomas Almeid','73166938940','503509243','1970/12/06','Masculino','2136917838','21985591374','giovannithomasalmeida-96@metalplasma.com.br','Rua Dona Lucy','Três Fontes','RJ','26382594','Queimados');
insert into clientes (nome,cpf,rg,nascimento,sexo,fixo,celular,email,rua,bairro,uf,cep,cidade) values ('Patrícia Lívia Andrea da Costa','21670817237','351623759','1939/01/08','Feminino','3727094292','37991910758','patricialiviaandreadacosta@unitau.com.br','Rua Antunes','Vila Vilaça','MG','35680091','Itaúna'); 

insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador Intel Core i5-8400 Coffee Lake',1,'Intel','Intel',1129,1555,250,'Com esse processador inovador e incrível você desfruta ao máximo o verdadeiro potencial do seu computador e da mais pura velocidade. Maximize o seu desempenho seja trabalhando, jogando, navegando ou assistindo o seu filme preferido, com esse processador você pode tudo!');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador Intel Core i7-8700K Coffee Lake',1,'Intel','Intel',1969.90,2333.22 ,200,'Com esse processador inovador e incrível você desfruta ao máximo o verdadeiro potencial do seu computador e da mais pura velocidade. Maximize o seu desempenho seja trabalhando, jogando, navegando ou assistindo o seu filme preferido, com esse processador você pode tudo!');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador Intel Core i9-9900KS Coffee Lake',1,'Intel','Intel',2949.90,3764.59,350,'Processador Intel Core i9-9900KS Coffee Lake Refresh, Geração, Cache 16MB, 4.0GHz (5.0GHz Max Turbo), LGA 1151');

insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador AMD Ryzen 5 3600X',1,'AMD','AMD',1099.90,1555,250,'A arquitetura Zen 2 do núcleo de alto desempenho da AMD permite que os Processadores de 3ª geração Ryzen ofereçam o mais alto desempenho para uma ou múltiplas linhas de execução e de qualquer Processador de desktop convencional.');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador AMD Ryzen 3 2200G',1,'AMD','AMD',399.90,541.06,200,'Com esse processador inovador e incrível você desfruta ao máximo o verdadeiro potencial do seu computador e da mais pura velocidade. Maximize o seu desempenho seja trabalhando, jogando, navegando ou assistindo o seu filme preferido, com esse processador você pode tudo!');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador AMD Ryzen 7 3700X',1,'AMD','AMD',1799.90,2117.53,300,'Com esse processador inovador e incrível você eleva ao máximo o verdadeiro potencial do seu computador e desfruta da mais pura velocidade. Maximize o seu desempenho seja trabalhando, jogando, navegando ou assistindo o seu filme preferido, com esse processador você pode tudo!');

insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador AMD Ryzen 5 3600X',1,'AMD','AMD',1099.90,1555,250,'A arquitetura Zen 2 do núcleo de alto desempenho da AMD permite que os Processadores de 3ª geração Ryzen ofereçam o mais alto desempenho para uma ou múltiplas linhas de execução e de qualquer Processador de desktop convencional.');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador AMD Ryzen 3 2200G',1,'AMD','AMD',399.90,541.06,200,'Com esse processador inovador e incrível você desfruta ao máximo o verdadeiro potencial do seu computador e da mais pura velocidade. Maximize o seu desempenho seja trabalhando, jogando, navegando ou assistindo o seu filme preferido, com esse processador você pode tudo!');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Processadores','Processador AMD Ryzen 7 3700X',1,'AMD','AMD',1799.90,2117.53,300,'Com esse processador inovador e incrível você eleva ao máximo o verdadeiro potencial do seu computador e desfruta da mais pura velocidade. Maximize o seu desempenho seja trabalhando, jogando, navegando ou assistindo o seu filme preferido, com esse processador você pode tudo!');

insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa de Vídeo','Placa de Vídeo EVGA NVIDIA GeForce RTX 2070 XC Ultra Gaming',1,'EVGA','EVGA',2839.90,3744.59,250,'As placas gráficas EVGA GeForce RTX série 20 são equipadas com a novíssima arquitetura NVIDIA turing para oferecer incríveis novos níveis de realismo, velocidade, potência, eficiência e imersão em jogos.');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa de Vídeo','Placa de Vídeo Gigabyte NVIDIA GeForce GTX 1050 Ti',1,'Gigabyte','Gigabyte',649.90,811.65,200,'Placa de Vídeo Gigabyte NVIDIA GeForce GTX 1050 Ti D5 4G, GDDR5 - GV-N105TD5-4GD');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa de Vídeo','Placa de Vídeo Gigabyte NVIDIA GeForce GTX 1650 Gaming OC',1,'Gigabyte','Gigabyte',839.90,1176.35,300,'O sistema de arrefecimento WINDFORCE 2X possui 2x ventiladores de lâmina exclusivos de 100mm, ventilador giratório alternativo, 2 tubos de calor de cobre composto com GPU de toque direto e ventilador ativo 3D, proporcionando uma dissipação de calor efetiva');

insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa de Vídeo','Placa de Vídeo Gigabyte AMD Radeon RX 590 Gaming',1,'Gigabyte','Gigabyte',1199.90,1411.65,250,'O sistema de refrigeração WINDFORCE 2X possui 3 tubos de calor de cobre puro, GPU de toque direto para tubos de aquecimento, design exclusivo do ventilador de 90 mm para lâminas, ventilador ativo 3D com indicadores LED, placa traseira de metal elegante, oferecendo juntos uma capacidade eficaz de dissipação de calor para obter melhor desempenho em temperaturas mais baixas.');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa de Vídeo','Placa de Vídeo MSI AMD Radeon RX 570 Armor',1,'MSI','MSI',649.90,764.59 ,200,'Placa de Vídeo MSI AMD Radeon RX 570 Armor 4G OC, GDDR5');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa de Vídeo','Placa de Vídeo PCYes AMD Radeon R5 230',1,'PCYes','PCYes',199.90,235.18,300,'A Radeon R5 230 proporciona a solução perfeita para os usuários que buscam um desempenho de GPU separada, melhorando o desempenho ao executar tarefas do dia-a-dia, como funções multimídia, áreas de trabalho estendidas e aplicativos acelerados, além do consumo ultra baixo de energia. Eficiência no piloto automático e tecnologias de gerenciamento de energia. Use a tecnologia AMD PowerTune para aumentar o desempenho do seu computador quando precisar dele, e para economizar energia quando não precisar. Eleve o desempenho do seu PC com o AMD App Acceleration, tornando mais eficientes as tarefas diárias, como navegação na Web e aplicativos do Office. A tecnologia AMD CrossFire é a mais atual em termos de performance multi-GPU para plataformas gamers, permitindo que todo o potencial e poder contidos em duas ou mais placas gráficas, trabalhando paralelamente para melhorar de forma drástica o desempenho dos seus jogos.');

insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa-mãe','Placa-Mãe Asus Prime B450M Gaming',1,'ASUS','ASUS',589.90,694,250,'As placas-mãe ASUS Prime Série B450 fornecem uma base sólida para um sistema eficiente, além de características que satisfazem as suas ambições.');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa-mãe','Placa-Mãe Asus TUF H310M-Plus Gaming/BR, Intel LGA 1151',1,'ASUS','ASUS',399.90,588.12,200,'Compatível com 8ª e 9ª geração de processadores Intel');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa-mãe','Placa-Mãe Gigabyte B360M Aorus Gaming 3',1,'Gigabyte','Gigabyte',469.90,522.11,300,'Placa-Mãe GIGABYTE p/ Intel LGA 1151 mATX B360M AORUS GAMING 3 DDR4');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Placa-mãe','Placa-Mãe Gigabyte B450M DS3H',1,'Gigabyte','Gigabyte',534.90,629.29,250,'Placa-Mãe Gigabyte p/ AMD AM4 mATX B450M DS3H DDR4');

insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Armazenamento','HD Seagate BarraCuda',1,'Seagate','Seagate',239.90,266.56,250,'HD Seagate BarraCuda, 1TB, 3.5´, SATA - ST1000DM010');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Armazenamento','HD Seagate BarraCuda',1,'Seagate','Seagate',314.90,423.12,200,'HD Seagate BarraCuda, 2TB, 3.5´, SATA - ST2000DM008');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Armazenamento','SSD Kingston A400',1,'Kingston','Kingston',282.90,455.11,300,'SSD Kingston A400, 480GB, SATA, Leitura 500MB/s, Gravação 450MB/s - SA400S37/480G');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Armazenamento','SSD Kingston A400',1,'Kingston','Kingston',174.90,246.29,250,'SSD Kingston A400, 240GB, SATA, Leitura 500MB/s, Gravação 350MB/s - SA400S37/240G');

insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Periféricos','Mouse Logitech M100',1,'Logitech','Logitech',28.90,34,250,'Mouse Logitech M100 Preto 1000DPI');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Periféricos','Teclado Logitech K120',1,'Logitech','Logitech',44.90,59.82,200,'Um teclado USB que oferece uma melhor experiência de digitação que irá durar. ');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Periféricos','Mouse Gamer HyperX Pulsefire Core',1,'HyperX','HyperX',159.90,179.90,300,'O HyperX Pulsefire Core é um mouse gamer RGB confortável apresentando um sensor óptico Pixart 3327 para configurações DPI de até 6200 e rastreio suave e preciso sem aceleração do hardware. O mouse ergonomicamente projetado com forma simétrica se adapta aos estilos de segurar com a palma ou com a ponta dos dedos e possui laterais texturizadas para uma aderência sem deslizamento. Switches de nível gamer proporcionam nítido feedback tátil configuradas para 20 milhões de cliques. Personalize a iluminação, as configurações DPI e macros para 7 botões programáveis com o software HyperX NGenuity.');
insert into produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque,descr) values ('Periféricos','Teclado Gamer Corsair K55',1,'Corsair','Corsair',159.90,211.29,250,'Teclado Gamer Corsair RGB, ABNT2, K55 CH-9206015-BR');




