# Ovo je komentar

 -- putanju  C:\Users\Katedra\D... prilagoditi svojoj datoteci na disku
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\goran\OneDrive\Dokumenti\GitHub\jp28\kolokvij1.sql

-- I ovo je komentar

drop database if exists kolokvij1;
create database kolokvij1;
use kolokvij1;

create table sestra(
	sifra int not null primary key auto_increment,
    introvertno bit,
    haljina varchar(31)not null,
    maraka decimal(16,6),
    hlace varchar(46)not null,
    narukvica int not null
);


create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int,
    gustoca decimal(14,9),
    hlace varchar(41)not null
);

create table zena(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    hlace varchar(46),
    kratkamajica varchar(31) not null,
    jmbag char(11) not null,
    bojaociju varchar(39) not null,
    haljina varchar(49),
    sestra int not null,
    foreign key (sestra) references sestra(sifra)
);

create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal (16,5)not null,
    gustoca decimal (18,6) not null,
    lipa decimal(13,10),
    ogrlica int not null,
    bojakose varchar (38),
    suknja varchar(36),
    punac int,
    foreign key (punac) references punac(sifra)
);

create table sestra_svekar(
	sifra int not null primary key auto_increment,
	sestra int not null,
	svekar int not null,
	foreign key (sestra) references sestra(sifra)
    #foreign key (svekar) references svekar(sifra)
    
);

create table muskarac(
	sifra int not null primary key auto_increment,
	bojaociju varchar(50) not null,
	hlace varchar(30),
	modelnaocala varchar(43),
	maraka decimal (14,5) not null,
    zena int not null,
    foreign key (zena) references zena(sifra)

);


create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40) not null,
    prstena int,
    dukserica varchar(41),
    lipa decimal (13,8),
    eura decimal (12,7),
    majica varchar (35)
);

create table mladic(
sifra int not null primary key auto_increment,
suknja varchar(50)not null,
kuna decimal(16,8)not null,
drugiputa datetime ,
asocijalno bit,
ekstroventno bit not null,
dukserica varchar (48) not null,
muskarac int,
foreign key (muskarac) references muskarac(sifra)

);

alter table sestra_svekar add foreign key (svekar)
references svekar(sifra);


select * from sestra;

insert into sestra 
(sifra,introvertno,haljina,maraka,hlace,narukvica) 

values 
(1,(1),'kratka',150.99,'nikakve',585),
(2,(0),'crvena',250.99,'uske',525),
(3,(0),'svila',255.99,'traper','zlatna');
