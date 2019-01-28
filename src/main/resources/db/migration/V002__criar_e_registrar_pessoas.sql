CREATE TABLE pessoa (
 	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
 	nome VARCHAR(50) NOT NULL,
 	ativo BOOLEAN NOT NULL,
 	logradouro VARCHAR(50),
 	numero VARCHAR(10),
 	complemento VARCHAR(20), 
 	bairro VARCHAR(30),
 	cep VARCHAR(8),
 	cidade VARCHAR(50), 
 	estado VARCHAR(40)
  ) ENGINE=INNODB CHARSET=utf8; 
  
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Welington', TRUE, 'Rua A', '500', 'xxxx', 'teste', '30800876', 'Belo Horizonte', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('José', FALSE, 'Rua B', '600', 'yyy', 'teste 2', '30285140', 'Belo Horizonte', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Antônio', TRUE, 'Rua C', '700', '', 'teste 3', '38000000', 'São Paulo', 'SP');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Afonso Padilha', TRUE, 'Rua D', '800', 'jjjj', 'teste 6', '48000000', 'Brasília', 'DF');
