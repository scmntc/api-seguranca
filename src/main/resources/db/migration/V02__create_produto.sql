CREATE TABLE segurancaES.produto (
	idproduto BIGINT(20) auto_increment NOT NULL,
	idmarca BIGINT(20) NULL,
	nome varchar(100) NOT NULL,
	descricao varchar(100) NULL,
	valor DECIMAL NULL,
	CONSTRAINT produto_PK PRIMARY KEY (idproduto),
	CONSTRAINT FK_marca_produto FOREIGN KEY (idmarca) REFERENCES segurancaES.marca(codigo_marca)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
