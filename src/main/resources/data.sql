-- Operadora Table
CREATE TABLE Operadora (
                           id SERIAL PRIMARY KEY,
                           bandeira VARCHAR(255)
);

-- Cartao Table
CREATE TABLE Cartao (
                        id SERIAL PRIMARY KEY,
                        numero VARCHAR(16),
                        nome VARCHAR(255),
                        operadora_id INTEGER REFERENCES Operadora(id)
);

-- Cliente Table
CREATE TABLE Cliente (
                         id SERIAL PRIMARY KEY,
                         nome VARCHAR(255)
);

-- Produto Table
CREATE TABLE Produto (
                         id SERIAL PRIMARY KEY,
                         nome VARCHAR(255)
);

-- Compra Table
CREATE TABLE Compra (
                        id SERIAL PRIMARY KEY,
                        cartao_id INTEGER REFERENCES Cartao(id),
                        cliente_id INTEGER REFERENCES Cliente(id),
                        produto_id INTEGER REFERENCES Produto(id),
                        valor DECIMAL(10, 2)
);

-- Inserting data into Operadora
INSERT INTO Operadora (bandeira) VALUES ('Visa');
INSERT INTO Operadora (bandeira) VALUES ('MasterCard');

-- Inserting data into Cartao
INSERT INTO Cartao (numero, nome, operadora_id) VALUES ('1234567890123456', 'Mr. John', 1);
INSERT INTO Cartao (numero, nome, operadora_id) VALUES ('9876543210987654', 'Mrs. Jane', 2);

-- Inserting data into Cliente
INSERT INTO Cliente (nome) VALUES ('John Doe');
INSERT INTO Cliente (nome) VALUES ('Jane Smith');

-- Inserting data into Produto
INSERT INTO Produto (nome) VALUES ('Laptop');
INSERT INTO Produto (nome) VALUES ('Smartphone');

-- Inserting data into Compra
INSERT INTO Compra (cartao_id, cliente_id, produto_id, valor) VALUES (1, 1, 1, 799.99);
INSERT INTO Compra (cartao_id, cliente_id, produto_id, valor) VALUES (2, 2, 2, 399.99);
