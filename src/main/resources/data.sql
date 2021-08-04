DROP TABLE IF EXISTS tipo_cambio;

CREATE TABLE tipo_cambio  (
  id INT AUTO_INCREMENT PRIMARY KEY,
  moneda VARCHAR(255) NOT NULL,
  tipo VARCHAR(3) NOT NULL,
  cambio DECIMAL(15, 8) NOT NULL
);

INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar Estadounidense','USD', 1.00000000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Balboa Panameño','PAB', 1.00000000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Bolívar Venezolano','VES', 4005961.00366000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Colón Costarricense','CRC', 620.24178000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Córdoba Nicaraguense','NIO', 35.11707000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar Canadiense','CAD', 1.25436000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar de Barbados','BBD', 2.00000000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar de Belice','BZD', 2.01566000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar de Bermudas','BMD', 1.00251000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar de las Bahamas','BSD', 1.00000000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar de las Islas Caimán','KYD', 0.83340000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar de Trinidad y Tobago','TTD', 6.79566000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar del Caribe Oriental','XCD', 2.70281000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Dólar Jamaiquino','JMD', 154.81446000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Florín Antillano','ANG', 1.79855000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Gourde Haitiano','HTG', 97.28919000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Guaraní Paraguayo','PYG', 6924.20188000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Lempira Hondureño','HNL', 23.73237000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Peso Argentino','ARS', 96.83152000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Peso Boliviano','BOB', 6.92500000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Peso Chileno','CLP', 773.30624000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Peso Colombiano','COP', 3899.44175000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Peso Cubano','CUP', 24.00000000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Peso Dominicano','DOP', 57.05326000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Peso Mexicano','MXN', 19.88060000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Peso Uruguayo','UYU', 43.61020000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Quetzal Guatemalteco','GTQ', 7.75199000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Real Brasileño','BRL', 5.19937000);
INSERT INTO tipo_cambio (moneda,tipo,cambio) VALUES ('Sol Peruano','PEN', 3.92666000);

