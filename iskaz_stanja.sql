
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Goran\Documents\EdunovaJP28\Iskaz_Stanja.sql

drop database if exists iskaz;
create database iskaz;
use iskaz;


create table unos(
	sifra int not null primary key,
	lijek int not null,
	kolicina varchar(50) not null,
	utrosak varchar(50) not null,
	datum_unosa datetime,
	djelatnik int not null

    );

    create table lijek(
	sifra int not null primary key auto_increment,
	naziv varchar(20),
    jed_mjere int not null,
	cijena decimal(18,2)
	
);

    create table jed_mjere(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null
	
);

create table djelatnik(
	sifra int not null primary key,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11),
	ambulanta varchar(100)
);

alter table unos add foreign key(lijek)
references lijek(sifra);

alter table unos add foreign key(djelatnik)
references djelatnik(sifra);

alter table lijek add foreign key(jed_mjere)
references jed_mjere(sifra);