
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Goran\OneDrive\Dokumenti\GitHub\jp28\iskaz_stanja.sql

drop database if exists iskaz;
create database iskaz;
use iskaz;


create table iskaz(
	sifra int not null primary key,
	artikal int not null,
	kolicina varchar(50) not null,
	utrosak varchar(50) not null,
	datum_unosa datetime,
	djelatnik int not null

    );

    create table artikli(
	sifra int not null primary key auto_increment,
	naziv varchar(20),
    jed_mjere int not null,
	cijena decimal(18,2)
	
);

    create table jed_mjera(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null
	
);

create table djelatnici(
	sifra int not null primary key,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11),
	ambulanta varchar(100)
);

alter table iskaz add foreign key(artikal)
references artikli(sifra);

alter table iskaz add foreign key(djelatnik)
references djelatnici(sifra);

alter table artikli add foreign key(jed_mjere)
references jed_mjera(sifra);
