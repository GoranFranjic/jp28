
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 <C:\Users\Goran\Documents\EdunovaJP28\igraona.sql

drop database if exists igraona;
create database igraona;
use igraona;

create table dijeteposjeta(
dijete int not null,
posjeta varchar(50) not null

);


create table dijete(
sifra int not null primary key auto_increment,
ime varchar(50) not null,
imeRoditelja varchar(50) not null,
prezime varchar(50) not null,
teleronRoditelja int not null

);

alter table dijeteposjeta add foreign key (dijete) references dijete (sifra)