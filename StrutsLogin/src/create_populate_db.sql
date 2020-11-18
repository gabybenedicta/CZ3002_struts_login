CREATE DATABASE struts2database;
USE struts2database;

create table logincredentials (
	userID varchar(20), 
    passwordID varchar(20),
    primary key(userID)
) ENGINE = InnoDB;

insert into logincredentials (userID, passwordID) 
values 
	('elaine', 'e123'),
    ('gaby', 'g123'),
    ('myat', 'm123'),
    ('user', 'P w'),
    ('prof1', 'HI'),
    ('Prof2s', '1o.2');

select * from logincredentials;

select collation(version());