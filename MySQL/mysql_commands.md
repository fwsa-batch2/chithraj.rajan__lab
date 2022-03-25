Enter password: *************
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 11
Server version: 8.0.28 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;

| Database           |
|:-------------------|
| chith              |
| information_schema |
| mysql              |
| password           |
| performance_schema |
| sakila             |
| sys                |
| views              |
| world              |

9 rows in set (0.00 sec)

mysql> create database kiddy_kids;
Query OK, 1 row affected (0.01 sec)

mysql> use kiddy_kids;
Database changed
mysql> create table user_details (Id int auto_increment,First_name varchar(20),Last_name varchar(20),Email varchar(40),password varchar(8), primary key(Id));
Query OK, 0 rows affected (0.06 sec)

mysql> desc table user_details;

| id | select_type | table        | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra |
|:---|:------------|:-------------|:-----------|:-----|:--------------|:-----|:--------|:-----|:-----|:---------|:------|
|  1 | SIMPLE      | user_details | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    1 |   100.00 | NULL  |

1 row in set, 1 warning (0.01 sec)

mysql> drop table user_details;
Query OK, 0 rows affected (0.02 sec)

mysql> create table user_details (Id int auto_increment,First_name varchar(20) not null,Last_name varchar(20) not null,Email varchar(40) not null,password varchar(8)not null, primary key(Id));
Query OK, 0 rows affected (0.03 sec)

mysql> desc table user_details;

| id | select_type | table        | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra |
|:---|:------------|:-------------|:-----------|:-----|:--------------|:-----|:--------|:-----|:-----|:---------|:------|
|  1 | SIMPLE      | user_details | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    1 |   100.00 | NULL  |

1 row in set, 1 warning (0.00 sec)

mysql> desc user_details;

| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| Id         | int         | NO   | PRI | NULL    | auto_increment |
| First_name | varchar(20) | NO   |     | NULL    |                |
| Last_name  | varchar(20) | NO   |     | NULL    |                |
| Email      | varchar(40) | NO   |     | NULL    |                |
| password   | varchar(8)  | NO   |     | NULL    |                |

5 rows in set (0.02 sec)

mysql> insert into user_details values (null,"maha","lakshmi","maha@gmail.com","maha2022");
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_details values (null, 'chith','raj','chithraj123@gmail.com','chith123'),(null,'peter','parker','peterparker@gmail.com','peter123'),(null,'tony','stark','tony122@gmail.com','tony1234');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select*from user_details;

| Id | First_name | Last_name | Email                 | password |
|:---|:-----------|:----------|:----------------------|:---------|
|  1 | maha       | lakshmi   | maha@gmail.com        | maha2022 |
|  2 | chith      | raj       | chithraj123@gmail.com | chith123 |
|  3 | peter      | parker    | peterparker@gmail.com | peter123 |
|  4 | tony       | stark     | tony122@gmail.com     | tony1234 |

4 rows in set (0.00 sec)

mysql> insert into user_details values (null,'steve','jobs','jobs123@gmail.com','jobs124');
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_details values (null,'mohammed','hassan','hassan123@gmail.com','hasan124');
Query OK, 1 row affected (0.01 sec)

mysql> select*from user_details;

| Id | First_name | Last_name | Email                 | password |
|:---|:-----------|:----------|:----------------------|:---------|
|  1 | maha       | lakshmi   | maha@gmail.com        | maha2022 |
|  2 | chith      | raj       | chithraj123@gmail.com | chith123 |
|  3 | peter      | parker    | peterparker@gmail.com | peter123 |
|  4 | tony       | stark     | tony122@gmail.com     | tony1234 |
|  5 | steve      | jobs      | jobs123@gmail.com     | jobs124  |
|  6 | mohammed   | hassan    | hassan123@gmail.com   | hasan124 |

6 rows in set (0.00 sec)

mysql> insert into user_details values (null,'steve','jobs','jobs123@gmail.com','jobs124');
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_details values (null,'sundar','pitchai','pitchai@gmail.com','pitchai1');
Query OK, 1 row affected (0.01 sec)

mysql> insert into user_details values (null,'aravind','prakash','prakash@gmail.com','aravind2');
Query OK, 1 row affected (0.01 sec)

mysql> select*from user_details;

| Id | First_name | Last_name | Email                 | password |
|:---|:-----------|:----------|:----------------------|:---------|
|  1 | maha       | lakshmi   | maha@gmail.com        | maha2022 |
|  2 | chith      | raj       | chithraj123@gmail.com | chith123 |
|  3 | peter      | parker    | peterparker@gmail.com | peter123 |
|  4 | tony       | stark     | tony122@gmail.com     | tony1234 |
|  5 | steve      | jobs      | jobs123@gmail.com     | jobs124  |
|  6 | mohammed   | hassan    | hassan123@gmail.com   | hasan124 |
|  7 | steve      | jobs      | jobs123@gmail.com     | jobs124  |
|  8 | sundar     | pitchai   | pitchai@gmail.com     | pitchai1 |
|  9 | aravind    | prakash   | prakash@gmail.com     | aravind2 |

9 rows in set (0.00 sec)