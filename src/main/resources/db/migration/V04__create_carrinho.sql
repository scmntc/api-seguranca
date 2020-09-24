CREATE TABLE IF NOT EXISTS segurancaES.carrinho (
	idcarrinho BIGINT(20) auto_increment NOT NULL PRIMARY KEY,
	idusuario BIGINT(20) NOT NULL,
	dataCriacao DATETIME NOT NULL,
	finalizadoEm DATETIME NULL,
	CONSTRAINT fk_usuario_carrinho FOREIGN KEY (idusuario) REFERENCES segurancaES.usuario(idusuario)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
