CREATE TABLE cliente (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         nome VARCHAR(255),
                         codigo VARCHAR(255),
                         email VARCHAR(255),
                         telefone VARCHAR(255)
);

INSERT INTO cliente (nome, codigo, email, telefone) VALUES ('John Doe', 'C123', 'john.doe@example.com', '123-456-7890');
INSERT INTO cliente (nome, codigo, email, telefone) VALUES ('Jane Smith', 'C456', 'jane.smith@example.com', '987-654-3210');
