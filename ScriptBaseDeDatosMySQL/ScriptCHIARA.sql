CREATE TABLE producto(
                         id_producto int PRIMARY KEY,
                         nombre varchar(60),
                         detalle varchar(80),
                         cantidad int
)ENGINE=INNODB;


CREATE TABLE paquete(
                        cod_paquete int,
                        id_producto int,
                        id_accesorio int,
                        constraint fk_producto_2	foreign key (id_producto) references producto(id_producto),
                        constraint fk_accesorio_2	foreign key (id_accesorio) references accesorio(id_accesorio)
)ENGINE=INNODB;

CREATE TABLE accesorio(
                          id_accesorio int PRIMARY KEY,
                          precio_unitario double,
                          id_producto int,
                          constraint fk_producto_3	foreign key (id_producto) references producto(id_producto)
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
                       constraint fk_producto_4 foreign key (id_producto) references producto(id_producto),
                       constraint fk_cliente	foreign key (id_cliente) references cliente(id_cliente)
)ENGINE=INNODB;