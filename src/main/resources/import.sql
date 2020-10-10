INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('AndrÃ©s', 'GuzmÃ¡n','Cra 20#45-4','6598757');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Mr. John', 'Doe','Cra 33 N0 45-98','314568989');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Linus', 'Torvalds','Cra 98 N0 145-8','321548788');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Rasmus', 'Lerdorf','Cra 102 N0 5-98','31568995');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Erich', 'Gamma','Cra 13 N0 15-69','32569885');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Richard', 'Helm','Cra 33 N0 45-98','3156988855');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Ralph', 'Johnson','Cra 203 N0 59-102','315789997');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('John', 'Vlissides','Cra 45 N0 145-88','31895555');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Dr. James', 'Gosling','Cra 133 N0 58-98','317858855');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Magma', 'Lee','Cra 25 N0 45-98','321456988');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Tornado', 'Roe','Cra 133 N0 45-98','32658999');
INSERT INTO remitente (nombre, apellido, direccion , telefono ) VALUES('Jade', 'Doe','Cra 36 N0 45-98','321548888');

INSERT INTO destinatario (nombre, apellido, direccion , telefono ) VALUES('Orlando', 'Serrano' , 'Cra 4 # 6 - 18', '320485678');
INSERT INTO destinatario (nombre, apellido, direccion , telefono ) VALUES('Blanca', 'Angarita' , 'Calle 55 # 20 -30','314567985');
INSERT INTO destinatario (nombre, apellido, direccion , telefono ) VALUES('Lia', 'Contreras' , 'Avenida 50 # 73 -20','312345678');
INSERT INTO destinatario (nombre, apellido, direccion , telefono ) VALUES('Celeste',  'Dueñas' , 'Carrera 55A # 45B - 88','317098765');
INSERT INTO destinatario (nombre, apellido, direccion , telefono ) VALUES('Martha',  'Manrique' , 'Calle 62 #112 - 73','3009867456');
INSERT INTO destinatario (nombre, apellido, direccion , telefono ) VALUES('Moises',  'Gomez' , 'Carrera 78 # 12 Sur - 56','340567123');
INSERT INTO destinatario (nombre, apellido, direccion , telefono ) VALUES('Natasha',  'Uribe' , 'Calle 34 # 78 - 23','23456789');


INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('Ramiro', 'Perez', 'Calle 200 # 11 - 50', '632742');
INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('Juan', 'Maldonado', 'Carrera 15 # 13b - 150', '3103765546');
INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('Camilo', 'Rueda', 'Avenida 100 # 25 - 30', '3103765546');
INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('Carlos', 'Velez', 'Calle 20 # 13 - 14 Apto 203', '6494977');
INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('David', 'Ramirez', 'Avenida Calle 13 # 34 - 128', '320379941');
INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('Nicolas', 'Ortega', 'Calle 3 # 11 - 35', '310343531');
INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('Josue', 'Reyes', 'Carrera 4 # 11 - 50', '6239981');
INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('Armando','Valencia', 'Calle 5 # 25 - 40', '310312199');
INSERT INTO CONDUCTOR (nombre, apellido, direccion , telefono ) VALUES('Gilberto', 'Duran', 'Calle 200 # 11 - 43 Casa 20','322732855');


INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(1, 1, 'Documentos', 1);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(4, 1, 'Ropa', 2);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(5, 2, 'Caja de herramientas', 5);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(3, 4, 'accesorios de carro', 3);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(3, 6, 'Documentos', 1);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(4, 3, 'Ropa', 1);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(2, 5, 'Tuberias de acero', 7);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(2, 3, 'Televisor', 6);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(3, 1, 'Computador', 2);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(3, 4, 'elementos varios', 4);
INSERT INTO PAQUETE (destinatario, remitente, descripcion, peso) VALUES(4, 3, 'Documentos', 1);
