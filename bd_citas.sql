USE bd_citas;
drop table if exists tratamientos;
CREATE TABLE tratamientos (
    TraNumero INT UNIQUE,
    TraFechaAsignado DATETIME,
    TraDescripcion VARCHAR(30),
    TraFechaInicio DATETIME,
    TraFechaFin DATE,
    TraObservaciones VARCHAR(30),
    TraPaciente VARCHAR(30),
    PRIMARY KEY (TraNumero)
);

drop table if exists pacientes;
CREATE TABLE pacientes (
    PacIdentificacion INT UNIQUE,
    PacNombre VARCHAR(30),
    PacApellidos VARCHAR(30),
    PacFechaNacimiento DATE,
    PacSexo VARCHAR(10),
    PRIMARY KEY (PacIdentificacion)
);

drop table if exists citas;
CREATE TABLE citas (
    CitNumero INT,
    CitFecha DATE,
    CitHora DATETIME,
    CitPaciente INT,
    CitMedico VARCHAR(40),
    CitConsultorio VARCHAR(4),
    CitEstado VARCHAR(10),
    CitObservaciones VARCHAR(30),
    PRIMARY KEY (CitNumero)
);

drop table if exists medicos;
CREATE TABLE medicos (
    MedIdentificacion INT(20),
    MedNombre VARCHAR(30),
    MedApellidos VARCHAR(30),
    PRIMARY KEY (MedIdentificacion)
);

drop table if exists consultorios;
CREATE TABLE consultorios (
    ConNumero INT,
    ConNombre VARCHAR(10),
    PRIMARY KEY (ConNumero)
);

insert into medicos (MedIdentificacion, MedNombre, MedApellidos) VALUES ("12341234", "Molipollo", "Morales Carrillo");
insert into medicos (MedIdentificacion, MedNombre, MedApellidos) VALUES ("12341236", "Santo Tomas", "Guarne Cotero");
insert into medicos (MedIdentificacion, MedNombre, MedApellidos) VALUES ("12341235", "Seleno", "End Brryndr");

select count(*) from medicos;


