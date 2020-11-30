#CRIAÇÃO DO BANCO DE DADOS
CREATE DATABASE LOJA_ROUPA;

#SELECIONA O BANCO CRIADO PARA UTILIZAÇÃO
USE LOJA_ROUPA;

#CRIAÇÃO DA TABELA DE PRODUTO
CREATE TABLE PRODUTO(
	ID_PRODUTO INT NOT NULL AUTO_INCREMENT, 
	NOME_PRODUTO VARCHAR(50) NOT NULL,
	CATEGORIA VARCHAR(50) NOT NULL,
	MARCA VARCHAR(50) NOT NULL,
	MODELO VARCHAR(50) NOT NULL,
	DESCRICAO VARCHAR(250) NOT NULL,
	QUANTIDADE INT NOT NULL,	
	VALOR DOUBLE NOT NULL,
	STATUS_PRODUTO VARCHAR(25) NOT NULL DEFAULT 'ATIVO',
	PRIMARY KEY(ID_PRODUTO)
);

#CRIAÇÃO DA TABELA DE CLIENTE
CREATE TABLE CLIENTE(
	ID_CLIENTE INT NOT NULL AUTO_INCREMENT, 
	NOME_CLIENTE VARCHAR(50) NOT NULL,
	CPF VARCHAR(14) NOT NULL UNIQUE,
	DATA_NASCIMENTO VARCHAR(10) NOT NULL,
	ESTADO_CIVIL VARCHAR(15) NOT NULL,
	SEXO VARCHAR(10) NOT NULL,
	CEP VARCHAR(9) NOT NULL,
	LOGRADOURO VARCHAR(50) NOT NULL,
	NUMERO VARCHAR(5) NOT NULL,
	TELEFONE VARCHAR(14) NOT NULL,
	CELULAR VARCHAR(14) NOT NULL,
	EMAIL VARCHAR(50) NOT NULL,
	PRIMARY KEY(ID_CLIENTE)
);


#CRIAÇÃO DA TABELA DE VENDA
CREATE TABLE VENDA(
	ID_VENDA INT NOT NULL AUTO_INCREMENT,
	DATA DATE NOT NULL,
	VALOR_VENDA DOUBLE NOT NULL,
	ID_CLIENTE INT NOT NULL,
	NOME_CLIENTE VARCHAR(50) NOT NULL,
	PRIMARY KEY(ID_VENDA),
	FOREIGN KEY(ID_CLIENTE) REFERENCES CLIENTE(ID_CLIENTE)
);

#CRIAÇÃO DA TABELA DE ITENS DE VENDA
CREATE TABLE ITEM_VENDA(
	ID_ITEM INT NOT NULL AUTO_INCREMENT,
	QUANTIDADE INT NOT NULL,
	VALOR_ITEM DOUBLE NOT NULL,
	ID_PRODUTO INT NOT NULL,
	ID_VENDA INT NOT NULL,
	NOME_PRODUTO VARCHAR(40) NOT NULL,
	PRIMARY KEY(ID_ITEM),
	FOREIGN KEY(ID_PRODUTO) REFERENCES PRODUTO(ID_PRODUTO),
	FOREIGN KEY(ID_VENDA) REFERENCES VENDA(ID_VENDA)
);

#CRIAÇÃO DA TABELA DE LOGIN
CREATE TABLE LOGIN(
    ID_LOGIN INT NOT NULL AUTO_INCREMENT,
    LOGIN VARCHAR(10) NOT NULL UNIQUE,
    SENHA VARCHAR(15) NOT NULL UNIQUE,
    STATUS_LOGIN CHAR(1) NOT NULL DEFAULT 'A',
    PRIMARY KEY(ID_LOGIN)
);

#INSERT TABELA DE CLIENTES
INSERT INTO CLIENTE VALUES (1,'Micael de Sousa Santos', '357.810.971-12', '1997-05-28', 'Solteiro(a)', 'Masculino', '04548-080', 'Rua Teste', '182', '(11)4578-6125', '(11)94578-6125', 'micael.teste@hotmail.com');
INSERT INTO CLIENTE VALUES (2,'Calebe Diego Barros', '716.277.332-05', '1998-07-16', 'Casado(a)', 'Masculino', '48907-290', 'Caminho Sete', '478', '(11)9325-8171', '(11)99325-8171', 'calebe.teste@hotmail.com');
INSERT INTO CLIENTE VALUES (3,'Caroline Nair Moraes', '297.445.626-09', '1984-09-07', 'Casado(a)', 'Feminino',  '58423-012', 'Travessa Fortaleza', '265', '(83)8977-2136', '(83)98977-2136', 'caroline.teste@hotmail.com');
INSERT INTO CLIENTE VALUES (4,'Julia Elisa Corte Real', '508.380.517-07', '1956-01-03', 'Casado(a)', 'Feminino', '58062-186', 'Rua Rita Alves da Costa', '793', '(83)8994-6154', '(83)98994-6154', 'julia.real@hotmail.com');
INSERT INTO CLIENTE VALUES (5,'Caio Eduardo Freitas', '340.762.227-92', '1993-07-20', 'Solteiro(a)', 'Masculino', '69058-852', 'Beco Espaço Verde', '612', '(92)9471-2151', '(92)99471-2151', 'caio.freitas@hotmail.com');
INSERT INTO CLIENTE VALUES (6,'Henrique Luís Teixeira', '414.520.839-08', '1985-04-25', 'Solteiro(a)', 'Masculino', '13334-240', 'Rua Minas Gerais', '497', '(19)3539-8501', '(19)98575-5842', 'henrique.teste@hotmail.com');
INSERT INTO CLIENTE VALUES (7,'Breno Diego Gonçalves', '791.400.749-86', '1995-01-09', 'Solteiro(a)', 'Masculino', '49070-802', 'Rua H', '881', '(79)3686-3312', '(79)98216-7233', 'breno.teste@hotmail.com');
INSERT INTO CLIENTE VALUES (8,'Jennifer Francisca Viana', '175.333.676-77', '1986-09-10', 'Solteiro(a)', 'Feminino', '52120-400', 'Avenida Professor José dos Anjos', '122', '(81)3550-1817', '(81)99105-3371', 'jennifer.teste@hotmail.com');
INSERT INTO CLIENTE VALUES (9,'Cecília Marina Milena da Costa', '613.261.682-90', '1970-05-13', 'Solteiro(a)', 'Feminino', '77006-536', 'Quadra 412 Norte Alameda 6', '915', '(63)2698-7851', '(63)98289-7223', 'cecilia.costa@hotmail.com');
INSERT INTO CLIENTE VALUES (10,'Heloise Silveira', '532.329.653-42', '1992-06-12', 'Casado(a)', 'Feminino', '77006-536', 'Rua Carvalho', '661', '(67)2551-6940', '(67)98670-8248', 'heloise.silveira@hotmail.com');

#INSERT TABELA DE PRODUTOS
INSERT INTO PRODUTO VALUES (1, 'Polo Wear Básica Manga Curta' , 'Camiseta', 'Polo Wear', 'Reta', 'Camiseta Masculina Polo Wear Básica Azul-Marinho', 50, 39.90, 'ATIVO');
INSERT INTO PRODUTO VALUES (2, 'Mr. Kitsch Manga Curta', 'Camiseta', 'Mr. Kitsch', 'Reta', 'Camiseta Masculina Mr. Kitsch Manga Curta Básica Preta', 20, 34.90, 'ATIVO'); 
INSERT INTO PRODUTO VALUES (3, 'Rioutlet Moletom', 'Calça', 'Rioutlet', 'Longo', 'Calça de Moletom Masculino preto', 20, 49.9, 'ATIVO');
INSERT INTO PRODUTO VALUES (4, 'Broken Rules Moletom', 'Calça', 'Broken Rules', 'Longo', 'Calça de Moletom Broken Rules Jogger Recortes Grafite', 100, 75.00, 'ATIVO');   
INSERT INTO PRODUTO VALUES (5, 'Calvin Klein Jeans Estampada', 'Camiseta', 'Calvin Klein Jeans', 'Reta', 'Camiseta Masculina Calvin Klein Jeans Estampada Branca', 150, 24.90, 'ATIVO'); 
INSERT INTO PRODUTO VALUES (6, 'Legging Diluxo Suplex', 'Calça', 'Diluxo', 'Legging', 'Calça Feminina Legging Diluxo Suplex Preta', 35, 37.90, 'ATIVO');
INSERT INTO PRODUTO VALUES (7, 'Regata Salvatore', 'Camiseta', 'Salvatore Fashion', 'Regata', 'Regata Salvatore Cava Americana Canelada Preta', 120, 34.50, 'ATIVO');
INSERT INTO PRODUTO VALUES (8, 'Cropped Rioutlet', 'Camiseta', 'Rioutlet', 'Regata', 'Cropped Rioutlet Reto Branco', 60, 24.99, 'ATIVO');
INSERT INTO PRODUTO VALUES (9, 'Santa Lolla', 'Tênis', 'Santa Lolla', 'Santa Lolla 01AC', 'Tênis Feminino Slip On Santa Lolla Suede Preto', 10, 74.99, 'ATIVO');
INSERT INTO PRODUTO VALUES (10, 'Adidas Superstar', 'Tênis', 'Adidas', 'Originals Superstar', 'Tênis Feminino adidas Originals Superstar Slip On Preto', 25, 299.90, 'ATIVO');

#INSERT TABELA DE VENDAS
INSERT INTO VENDA VALUES (1, '2020-09-10', 174.5, 1, 'Micael de Sousa Santos');
INSERT INTO VENDA VALUES (2, '2020-10-24', 39.90, 10, 'Heloise Silveira');
INSERT INTO VENDA VALUES (3, '2020-09-15', 369.10, 7, 'Breno Diego Gonçalves');
INSERT INTO VENDA VALUES (4, '2020-08-12', 299.90, 4, 'Julia Elisa Corte Real');
INSERT INTO VENDA VALUES (5, '2020-10-06', 589.00, 2, 'Calebe Diego Barros');

#INSERT TABELA DE ITENS
INSERT INTO ITEM_VENDA VALUES (1, 5, 34.90, 2, 1, 'Mr. Kitsch Manga Curta');
INSERT INTO ITEM_VENDA VALUES (2, 1, 39.90, 1, 2, 'Polo Wear Básica Manga Curta');
INSERT INTO ITEM_VENDA VALUES (3, 5, 39.90, 1, 3, 'Polo Wear Básica Manga Curta');
INSERT INTO ITEM_VENDA VALUES (4, 2, 34.90, 2, 3, 'Mr. Kitsch Manga Curta');
INSERT INTO ITEM_VENDA VALUES (5, 2, 49.90, 3, 3, 'Rioutlet Moletom');
INSERT INTO ITEM_VENDA VALUES (6, 1, 299.90, 10, 4, 'Adidas Superstar');
INSERT INTO ITEM_VENDA VALUES (7, 3, 75.00, 4, 5, 'Broken Rules Moletom');
INSERT INTO ITEM_VENDA VALUES (8, 5, 34.90, 2, 5, 'Mr. Kitsch Manga Curta');
INSERT INTO ITEM_VENDA VALUES (9, 2, 24.90, 5, 5, 'Calvin Klein Jeans Estampada');
INSERT INTO ITEM_VENDA VALUES (10, 2, 49.90, 3, 5, 'Rioutlet Moletom');
INSERT INTO ITEM_VENDA VALUES (11, 1, 39.90, 1, 5, 'Polo Wear Básica Manga Curta');

#INSERT TABELA DE LOGIN
INSERT INTO LOGIN VALUES (1, 'admin', 'admin', 'A');
INSERT INTO LOGIN VALUES (2, 'jeferson', 'jeferson', 'A');