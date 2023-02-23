create database tienda;
use tienda;


CREATE TABLE Clientes(
  ID_Cliente INTEGER AUTO_INCREMENT PRIMARY KEY,
  Username VARCHAR(14) UNIQUE,
  Nombre VARCHAR(50) NOT NULL,
  Apellidos VARCHAR(50) NOT NULL,
  Fecha_Nacimiento DATE NOT NULL,
  Email VARCHAR(50) UNIQUE NOT NULL,
  Password VARCHAR(50) NOT NULL
);

CREATE TABLE Direcciones(
  ID_Direccion INTEGER AUTO_INCREMENT PRIMARY KEY,
  Codigo_Postal VARCHAR(5) NOT NULL,
  Localidad VARCHAR(50) NOT NULL,
  Calle VARCHAR(50) NOT NULL,
  Numero INTEGER,
  Piso INTEGER,
  Letra CHAR
);

CREATE TABLE Tarjetas_Bancarias (
  ID_Tarjeta INTEGER AUTO_INCREMENT PRIMARY KEY,
  Numero_Tarjeta VARCHAR(16) UNIQUE NOT NULL,
  Nombre_Titular VARCHAR(50) NOT NULL,
  Fecha_Caducidad DATE NOT NULL,
  CVV INTEGER NOT NULL
);

CREATE TABLE Productos(
  ID_Producto INTEGER AUTO_INCREMENT PRIMARY KEY,
  Nombre VARCHAR(50) UNIQUE NOT NULL,
  Descripcion VARCHAR(250) NOT NULL,
  Precio DOUBLE(5,2) NOT NULL,
  Stock INTEGER NOT NULL,
  Img VARCHAR(50)
);	


CREATE TABLE Pedidos(
	ID_Pedidos INTEGER AUTO_INCREMENT PRIMARY KEY,
	ID_Cliente INTEGER NOT NULL,
    ID_Tarjeta INTEGER NOT NULL, 
    ID_Direccion INTEGER NOT NULL,
	Estado VARCHAR(10),
    FOREIGN KEY (ID_Tarjeta) REFERENCES Tarjetas_Bancarias(ID_Tarjeta),
	FOREIGN KEY (ID_Direccion) REFERENCES Direcciones(ID_Direccion),
	FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente)
);

CREATE TABLE Compras_Productos(
  Num_Orden Integer AUTO_INCREMENT NOT NULL PRIMARY KEY,
  ID_Pedidos INTEGER NOT NULL,
  ID_Producto INTEGER NOT NULL,
  Cantidad INTEGER NOT NULL,
  precio_venta dec(9,2),
  FOREIGN KEY (ID_Pedidos) REFERENCES Pedidos(ID_Pedidos),
  FOREIGN KEY (ID_Producto) REFERENCES Productos(ID_Producto)
);


CREATE TABLE Clientes_Direcciones(
  ID_Cliente INTEGER NOT NULL,
  ID_Direccion INTEGER NOT NULL,
  primary key (ID_Cliente, ID_Direccion),
  FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente),
  FOREIGN KEY (ID_Direccion) REFERENCES Direcciones(ID_Direccion)
);

CREATE TABLE Clientes_Tarjetas(
  ID_Cliente INTEGER NOT NULL,
  ID_Tarjeta INTEGER NOT NULL,
  primary key (ID_Cliente, ID_Tarjeta),
  FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente),
  FOREIGN KEY (ID_Tarjeta) REFERENCES Tarjetas_Bancarias(ID_Tarjeta)
);

use tienda;
alter table clientes drop column contraseña;
alter table clientes add PASSWORD VARCHAR(50) NOT NULL;
alter table productos add ID_TIPO integer not null;
alter table productos add FOREIGN KEY (ID_TIPO) REFERENCES TIPOS_PRODUCTO(ID_TIPO);

CREATE TABLE TIPOS_PRODUCTO(
	ID_TIPO integer not null auto_increment primary key,
    nombre_tipo varchar(50)
);

grant all privileges on tienda.* to utienda;