use cinemaweb;

create table if not exists cinema
(
    id_cinema int          not null auto_increment primary key,
    name      varchar(100) not null,
    city      varchar(100) not null,
);

create table if not exists film
(
    id_film int not null auto_increment primary key,
    name varchar(100) not null,
    id_cinema int foreign key
);

create table if not exists client
(
    id_client int  not null auto_increment primary key,
    name varchar(100) not null,
    email varchar(100) not null
);

create table if not exists program
(
     id_program int not null auto_increment primary key,
     data_difuzare date not null,
     ora time not null,
     id_film int not null foreign key,
     id_cinema int not null foreign key
);

create table if not exists client_cinema
(
    id_client int not null foreign key,
    id_cinema int not null foreign key
)


