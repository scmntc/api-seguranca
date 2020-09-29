CREATE TABLE IF NOT EXISTS usuario (
    idusuario BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    datacadastro DATETIME NOT NULL,
    password VARCHAR(255) NOT NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;