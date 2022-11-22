CREATE DATABASE IF NOT EXISTS sample_schema CHARACTER SET
utf8 COLLATE utf8_general_ci;

USE sample_schema;

DROP TABLE IF EXISTS sample_schema.account, sample_schema.users, sample_schema.doctors;

CREATE TABLE IF NOT EXISTS sample_schema.account(
    account_id    int PRIMARY KEY AUTO_INCREMENT,
    email         varchar(50) NOT NULL,
    password      varchar(30) NOT NULL,
    user_name     varchar(30) NOT NULL,
    INDEX(account_id)
);

CREATE TABLE IF NOT EXISTS sample_schema.users(
    uuid          int PRIMARY KEY AUTO_INCREMENT,
    email         varchar(50) NOT NULL,
    password      varchar(30) NOT NULL,
    first_name    varchar(30) NOT NULL,
    last_name     varchar(30) NOT NULL,
    birthdate     varchar(30) NOT NULL,
    phone         varchar(30) NOT NULL,
    INDEX(uuid)
);

CREATE TABLE IF NOT EXISTS sample_schema.doctor_schedules(
    uuid          int PRIMARY KEY AUTO_INCREMENT,
    doctor_uuid   int,
    time          varchar(30) NOT NULL,
    INDEX(uuid)
);

CREATE TABLE IF NOT EXISTS sample_schema.doctors(
    uuid          int PRIMARY KEY AUTO_INCREMENT,
    name          varchar(30) NOT NULL,
    INDEX(uuid)
);
