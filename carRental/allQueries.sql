/*
create table ADMIN(
    A_ID INTEGER not null primary key,
    FIRSTNAME VARCHAR(30),
    LASTNAME VARCHAR(30),
    A_USERNAME VARCHAR(10),
    A_PASSWD VARCHAR(20)
);


create table DEALER(
    DNAME VARCHAR(30),
    D_USERNAME VARCHAR(10) not null primary key,
    D_PASSWD VARCHAR(20)
);




create table USER1(
    FIRSTNAME VARCHAR(30),
    LASTNAME VARCHAR(30),
    U_USERNAME VARCHAR(10) not null primary key ,
    U_PASSWD VARCHAR(20)
);





create table CAR(
    CNAME VARCHAR(30),
    MODEL VARCHAR(10) not null primary key ,
    TYPE VARCHAR(20),
    OWNER VARCHAR(20),
    STATUS VARCHAR(20),
    T2 VARCHAR(20)
);



*/


create table MANAGE(
    BUSER VARCHAR(30),
    BDEALER VARCHAR(30),
    MODEL VARCHAR(10) not null primary key ,
    CNAME VARCHAR(20),
    STATUS VARCHAR(20)
);