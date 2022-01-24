INSERT INTO EMPRESA
VALUES(1001, 'ELIAT', 'ESMERALDAS, AV 10 - CALLE 12');

INSERT INTO ADMINISTRADOR_TH 
VALUES 
(01,1001,'0803680354', 'LARISSA', 'LOPEZ BASURTO', '0960496803', 'CALLE 123 AV LA CULTURA', 'larissalopez@gmail.com');

INSERT INTO JEFE VALUES (90, '0803680245', 'VELEZ JUAN', 5 );
INSERT INTO JEFE VALUES (91, '1717174558', 'MENDOZA LISBETH', 8 );
INSERT INTO JEFE VALUES (92, '2300025254',  'PEREZ MARIA', 2 );
INSERT INTO JEFE VALUES (93, '1311224568',  'PALMA TAMARA', 1 );
INSERT INTO JEFE VALUES (94, '1301301302',  'VALLEJO CARLOS', 7 );

INSERT INTO DEPARTAMENTO VALUES (10, 90, 'SEGURIDAD', '15/02/2020', 5, 300000);
INSERT INTO DEPARTAMENTO VALUES (11,91, 'SECRETARIA', '09/09/2019',10,1000000);
INSERT INTO DEPARTAMENTO VALUES (12,92, 'LIMPIEZA', '03/01/2018',10, 450000);
INSERT INTO DEPARTAMENTO VALUES (13,93, 'MARKETING', '20/01/2021',8, 300000);
INSERT INTO DEPARTAMENTO VALUES (14,94,'FABRICACION', '01/12/2021',10, 500555);


INSERT INTO CONTRATO VALUES (55, '12/02/2012', '3 AÑOS', 500, 100 );
INSERT INTO CONTRATO VALUES (54, '03/01/2019', '5 AÑOS', 800, 150 );
INSERT INTO CONTRATO VALUES (56, '21/09/2020', '3 AÑOS', 400, 50 );
INSERT INTO CONTRATO VALUES (52, '15/01/2020', '3 AÑOS',550, 60 );
INSERT INTO CONTRATO VALUES (51, '22/06/2021', '1 AÑOS', 600, 100 );


INSERT INTO EMPLEADO VALUES 
(200, 1,51, 10,  '1301280634','DAMIAN', 'LOPEZ BASURTO', '0991280634',  'CALLE 102 AV 10', 'damianlopez@gmail.com' );
INSERT INTO EMPLEADO VALUES 
(201, 1, 52, 11,  '131128000', 'MILENI', 'GOMEZ TORRE', '0988280622',  'CALLE 12 AV 102', 'milenig@gmail.com' );
INSERT INTO EMPLEADO VALUES 
(202, 1,56,  12,  '0891285551', 'DAYANA', 'CAICEDO CORTES', '0975280256',  'CALLE 24 AV 12', 'dayanacc@gmail.com'  );
INSERT INTO EMPLEADO VALUES 
(203, 1, 54, 13, '1301280130','SCARLEH', 'GONZALES ARAUZ', '0988455611',  'CALLE 60 AV 42', 'scarlethhga@gmail.com' );
INSERT INTO EMPLEADO VALUES 
(204, 1, 55,10,  '1301284578','THALIA', 'CORRALES VELEZ', '098008000',  'CALLE 20 AV 25', 'thaliacoralesvlez@gmail.com'  );


INSERT INTO HORARIO VALUES (100, 10, '8:00', '20:30', '1', '20', '20');
INSERT INTO HORARIO VALUES (101,11, '07:30', '12:00', '7', '20', '140');
INSERT INTO HORARIO VALUES (102, 12, '8:00', '16:00', '4', '10', '40');
INSERT INTO HORARIO VALUES (103, 13, '8:00', '16:00', '2', '10', '20');
INSERT INTO HORARIO VALUES (104, 14, '8:00', '15:00', '3', '20', '60');

INSERT INTO VACACION VALUES (700, 51, '01/02/2021', '01/03/2021' );
INSERT INTO VACACION VALUES (701, 51, '11/03/2021', '11/04/2021' );
INSERT INTO VACACION VALUES (702, 51, '25/12/2021', '20/01/2022' );
INSERT INTO VACACION VALUES (703, 51, '18/06/2021', '10/07/2021' );
INSERT INTO VACACION VALUES (704, 51, '22/10/2021', '12/11/2021' );

INSERT INTO ACCIDENTE_LABORAL VALUES(30, 200, 'FATIGA POSTURAL', '10/02/2021');
INSERT INTO ACCIDENTE_LABORAL VALUES(31, 201, 'CAÍDA DE ALTURA', '05/10/2021');
INSERT INTO ACCIDENTE_LABORAL VALUES(32, 202, 'GOLPES', '25/03/2020');
INSERT INTO ACCIDENTE_LABORAL VALUES(33, 203, 'CORTES Y HERIDA', '08/01/2021');
INSERT INTO ACCIDENTE_LABORAL VALUES(34, 204, 'ESTRÉS Y ANSIEDAD', '10/12/2020');

INSERT INTO CALAMIDAD_DOMESTICA VALUES(301, 200, 'LUTO', '10/02/2021');
INSERT INTO CALAMIDAD_DOMESTICA VALUES(311, 201, 'LUTO', '05/10/2021');
INSERT INTO CALAMIDAD_DOMESTICA VALUES(321, 202, 'ENFERMEDAD', '25/03/2020');
INSERT INTO CALAMIDAD_DOMESTICA VALUES(331, 203, 'CORTES Y HERIDA', '08/01/2021');
INSERT INTO CALAMIDAD_DOMESTICA VALUES(341, 204, 'LUTO', '10/12/2020');

INSERT INTO LLAMADO VALUES (40, 200, 'INRESPONSABILIDAD EN DOC', '10/02/2021' );
INSERT INTO LLAMADO VALUES (41, 201, 'USO EXCESIVO DE CELULAR', '10/02/2021' );
INSERT INTO LLAMADO VALUES (42, 202, 'POR INASISTENCIA', '10/02/2021' );
INSERT INTO LLAMADO VALUES (43, 203, 'POR RETRASOS EXCESIVOS', '10/02/2021' );
INSERT INTO LLAMADO VALUES (44, 204, 'INPUNTUALIDAD EN REUNIONES', '10/02/2021' );


INSERT INTO ATRASO VALUES (70, 200, '02/12/2020', 'LEVE', 2 );
INSERT INTO ATRASO VALUES (71, 201, '30/09/2020', 'GRAVE', 3 );
INSERT INTO ATRASO VALUES (72, 202, '10/12/2021', 'LEVE', 2 );
INSERT INTO ATRASO VALUES (73, 203, '19/08/2020', 'LEVE', 1 );
INSERT INTO ATRASO VALUES (74, 204, '29/03/2021', 'GRAVE',5  );

INSERT INTO PERMISO VALUES (60, 200, '10/12/2020','MATERNIDAD', 1, 1 );
INSERT INTO PERMISO VALUES (61, 201, '13/02/2019', 'ENFERMEDAD', 2, 1 );
INSERT INTO PERMISO VALUES (62, 202, '25/11/2020', 'MUDANZA', 5, 3 );
INSERT INTO PERMISO VALUES (63, 203, '23/02/2021', 'VIÁTICO', 2, 3 );
INSERT INTO PERMISO VALUES (64, 204, '22/10/2021', 'ACADEMICO', 1, 2 );