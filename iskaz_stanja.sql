
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Goran\OneDrive\Dokumenti\GitHub\jp28\iskaz_stanja.sql

drop database if exists iskaz;
create database iskaz;
use iskaz;


create table iskazi(
	sifra int not null primary key auto_increment,
	artikal int not null,
	kolicina varchar(50) not null,
	utrosak varchar(50) not null,
	datum_unosa date,
	djelatnik int not null

    );

    create table artikli(
	sifra int not null primary key auto_increment,
	naziv varchar(50),
    jed_mjere int not null,
	cijena decimal(18,2)
	
);

    create table jed_mjera(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null
	
);

create table djelatnici(
	sifra int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	oib char(11),
	ambulanta varchar(100)
);

alter table iskazi add foreign key(artikal)
references artikli(sifra);

alter table iskazi add foreign key(djelatnik)
references djelatnici(sifra);

alter table artikli add foreign key(jed_mjere)
references jed_mjera(sifra);

-- unos u tabele

insert into jed_mjera (sifra) values
(101),(102),(103),(104),(105),(106),(107),(108),(109),(110),
(111),(112),(113),(114),(115),(116),(117),(118),(119),(120),
(121),(122),(123),(124),(125),(126);

select * from jed_mjera;

insert into jed_mjera (sifra,naziv) values
(null,'boca'),
(null,'komad'),
(null,'ampula');

insert into djelatnici (sifra,ime,prezime,
oib,ambulanta) values
(null,'Amber','Brouk','12345678911','Boliwood');

select * from artikli;

insert into artikli (sifra,naziv,jed_mjere,cijena) values
(null,'NaCL 100 ml',127,15);

select * from iskazi;

insert into iskazi (sifra,artikal,kolicina,utrosak,datum_unosa,djelatnik) values
(null,1,7,5,'2023-05-22',1);





















