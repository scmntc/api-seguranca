CREATE TABLE IF NOT EXISTS segurancaES.carrinhoproduto (
	idcarrinhoproduto BIGINT(20) auto_increment NOT NULL,
	idcarrinho BIGINT(20) NOT NULL,
	idproduto BIGINT(20) NOT NULL,
	qtdproduto INTEGER NOT NULL,
	dataCriacao DATETIME NOT NULL,
	CONSTRAINT carrinhoproduto_PK PRIMARY KEY (idcarrinhoproduto),
	CONSTRAINT fk_produto_carrinhoproduto FOREIGN KEY (idproduto) REFERENCES segurancaES.produto(idproduto),
	CONSTRAINT fk_carrinho_carrinhoproduto FOREIGN KEY (idcarrinho) REFERENCES segurancaES.carrinho(idcarrinho)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
