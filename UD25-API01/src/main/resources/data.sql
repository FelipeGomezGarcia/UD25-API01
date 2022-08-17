drop table if exists Articulos;
Drop table if exists Fabricantes;

Create table Fabricantes(
codigo int auto_increment not null,
nombre varchar(100),
Primary key(codigo)
);

Create table Articulos(
codigo int auto_increment not null,
nombre varchar (100),
precio int,
fabricante int,
Primary key (codigo),
constraint fk_codigoFabricantes FOREIGN KEY (fabricante) 
REFERENCES Fabricantes(codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

insert into Fabricantes (nombre) values ('sony'),('apple'),('microsoft');

insert into Articulos (nombre,precio,fabricante) values 
('camara',450,1),
('pantalla',100,2),
('Word Office',60,3),
('Power Point Office',60,3);