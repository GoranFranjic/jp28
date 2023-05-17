#c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Goran\Documents\EdunovaJP28\restoran.sql

drop database if exists restoran;
create database restoran;
use restoran;

-- Tablica Jela
CREATE TABLE Jela(
  sifra int not null primary key auto_increment,
  pizze VARCHAR(50),
  grill VARCHAR(50),
  juhe VARCHAR(50),
  salate VARCHAR(50)
);

-- Tablica Jelovnik
CREATE TABLE Jelovnik(
  sifra int not null primary key auto_increment,
  ime VARCHAR(50),
  sastojci VARCHAR(50),
  cijena VARCHAR(50),
  velicina VARCHAR(50),
  jela INT
  
);

-- Tablica Pića
CREATE TABLE Pica(
  sifra int not null primary key auto_increment,
  cola VARCHAR(50),
  juice VARCHAR(50),
  minvoda VARCHAR(50),
  pivo VARCHAR(50),
  jela INT
  
);


alter table Jelovnik add FOREIGN KEY (jela) REFERENCES Jela(sifra);
alter table Pica add FOREIGN KEY (jela) REFERENCES Jela(sifra);

insert into Jelovnik (sifra,ime,sastojci,cijena,velicina) 
values(null, "Toscana","gljive","15","velika");

insert into Jela (sifra,pizze,grill,juhe,salate)
values(null, "vrste pizza ","vrste grilla","vrste juha","vrste salata");
