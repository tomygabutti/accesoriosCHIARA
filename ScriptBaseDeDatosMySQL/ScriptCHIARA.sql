CREATE TABLE producto(
                         id_producto int PRIMARY KEY,
                         nombre varchar(60),
                         detalle varchar(80),
                         cantidad int
)ENGINE=INNODB;

CREATE TABLE paquete(
                        id_paquete int PRIMARY KEY,
                        id_producto int,
                        id_paquete_padre int,
                        constraint fk_producto_2	foreign key (id_producto) references producto(id_producto),
                        constraint fk_paquete_2	foreign key (id_paquete_padre) references paquete(id_paquete)
)ENGINE=INNODB;

CREATE TABLE accesorio(
                          id_accesorio int PRIMARY KEY,
                          precio_unitario double,
                          id_producto int,
                          id_paquete int,
                          constraint fk_paquete_3	foreign key (id_paquete) references paquete(id_paquete),
                          constraint fk_producto_1	foreign key (id_producto) references producto(id_producto)
)ENGINE=INNODB;

CREATE TABLE cliente(
                        id_cliente int PRIMARY KEY,
                        nombre_usuario varchar(50),
                        contrasenia varchar(50),
                        nombre varchar(50),
                        apellido varchar(50),
                        telefono varchar(50),
                        fecha_nacimiento varchar(30)
)ENGINE=INNODB;

create table administrador(
                              id_administrador int PRIMARY KEY,
                              nombre_usuario varchar(50),
                              contrasenia varchar(50)
)ENGINE=INNODB;

CREATE TABLE compra(
                       id_compra int,
                       id_cliente int,
                       id_producto int,
                       fecha_compra varchar(30),
                       constraint fk_producto_3	foreign key (id_producto) references producto(id_producto)
)ENGINE=INNODB;
