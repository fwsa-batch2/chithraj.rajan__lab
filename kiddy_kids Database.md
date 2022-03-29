### Kiddy-Kids
---
```sql
 show databases;
```
| Database           |
|:------------------:|
| chith              |
| information_schema |
| kiddy_kids         |
| mysql              |
| password           |
| performance_schema |
| sakila             |
| sys                |
| views              |
| world              |
---
```sql
use kiddy_kids;
```
```sql
create table user_info (id int primary key auto_increment,title varchar(5) not null,fname varchar(20) not null,lname varchar(20) not null,email varchar(30) not null,password varchar(8) not null);
```
```sql
desc user_info;
```

| Field    | Type        | Null | Key | Default | Extra          |
|---------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| id       | int         | NO   | PRI | NULL    | auto_increment |
| title    | varchar(5)  | NO   |     | NULL    |                |
| fname    | varchar(20) | NO   |     | NULL    |                |
| lname    | varchar(20) | NO   |     | NULL    |                |
| email    | varchar(30) | NO   |     | NULL    |                |
| password | varchar(8)  | NO   |     | NULL    |                |
---
```sql
insert into user_info values (null, 'Mr','Chith','Raj','chith123gmail.com','chith123'),
(null, 'Mr','Raj','Kumar','raj133gmail.com','rajk123'),
(null,'Mr','Ismail','Mohammed','smile123@gmail.com','smile123'),
(null,'Mr','Mohammed','Riyas','riyas123@gmail.com','123riyas'),
(null,'Mr','Kasi','Antony','anto1233@gmail.com','riyas123'),
(null,'Mr','Annamalai','Shanmugam','sanann123@gmail.com','annas123');
```
```sql
select * from user_info;
```
| id | title | fname     | lname     | email               | password |
|:--:|:-----:|:---------:|:---------:|:-------------------:|:--------:|
|  1 | Mr    | Chith     | Raj       | chith123gmail.com   | chith123 |
|  2 | Mr    | Raj       | Kumar     | raj133gmail.com     | rajk123  |
|  3 | Mr    | Ismail    | Mohammed  | smile123@gmail.com  | smile123 |
|  4 | Mr    | Mohammed  | Riyas     | riyas123@gmail.com  | 123riyas |
|  5 | Mr    | Kasi      | Antony    | anto1233@gmail.com  | riyas123 |
|  6 | Mr    | Annamalai | Shanmugam | sanann123@gmail.com | annas123 |
---
```sql
create table roles (role_id int (5) not null primary key,role_name varchar(25) not null);
```
```sql
desc roles;
```

| Field     | Type        | Null | Key | Default | Extra |
|:---------:|:-----------:|:----:|:---:|:-------:|:-----:|
| role_id   | int         | NO   | PRI | NULL    |       |
| role_name | varchar(25) | NO   |     | NULL    |       |
---
```sql
insert into roles values (1001,'librarian'),(1002,'teacher'),(1003,'IT_dept'),(1004,'reading_specialist'),(1005,'teaching_specialist'),(1006,'others');
```
```sql
select*from roles;
```

| role_id | role_name           |
|:-------:|:-------------------:|
|    1001 | librarian           |
|    1002 | teacher             |
|    1003 | IT_dept             |
|    1004 | reading_specialist  |
|    1005 | teaching_specialist |
|    1006 | others              |
---
```sql
create table user_roles (id int primary key, user_id int ,foreign key(user_id) references user_info(id));
```
```sql
desc user_roles;
```

| Field   | Type | Null | Key | Default | Extra |
|:-------:|:----:|:----:|:---:|:-------:|:-----:|
| id      | int  | NO   | PRI | NULL    |       |
| user_id | int  | YES  | MUL | NULL    |       |
---
```sql
alter table user_roles add (role_id int(5),foreign key(role_id) references roles(role_id));
```
```sql
desc user_roles;
```

| Field   | Type | Null | Key | Default | Extra |
|:-------:|:----:|:----:|:---:|:-------:|:-----:|
| id      | int  | NO   | PRI | NULL    |       |
| user_id | int  | YES  | MUL | NULL    |       |
| role_id | int  | YES  | MUL | NULL    |       |
---
```sql
insert into user_roles values (1,1,1001),(2,2,1002),(3,3,1003),(4,4,1004),(5,5,1005),(6,6,1006);
```
```sql
select * from user_roles;
```

| id | user_id | role_id |
|:--:|:-------:|:-------:|
|  1 |       1 |    1001 |
|  2 |       2 |    1002 |
|  3 |       3 |    1003 |
|  4 |       4 |    1004 |
|  5 |       5 |    1005 |
|  6 |       6 |    1006 |
---
```sql
create table author_info(author_id int, author_name varchar(30), author_img blob,foreign key (author_id) references stories(author_id));
```
```sql
desc author_info;
```

| Field       | Type        | Null | Key | Default | Extra |
|:-----------:|:-----------:|:----:|:---:|:-------:|:-----:|
| author_id   | int         | YES  | MUL | NULL    |       |
| author_name | varchar(30) | YES  |     | NULL    |       |
| author_img  | blob        | YES  |     | NULL    |       |
---
```sql
insert into author_info values ( 101,'Visnu_Sarma ','0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31506348754D5858576174794A7948423665487434626239656B3633754766614D2F766965773F7573703D73686172696E67'),(102,'Andrew_Fusek_Peters','0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31506348754D5858576174794A7948423665487434626239656B3633754766614D2F766965773F7573703D73686172696E67');
```
```sql
insert into author_info values (103,'Stephen_Krensky','0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31506348754D5858576174794A7948423665487434626239656B3633754766614D2F766965773F7573703D73686172696E67'),(104,'Krishna_Rao','0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31506348754D5858576174794A7948423665487434626239656B3633754766614D2F766965773F7573703D73686172696E67'),(105,'Subba_Rao','0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31506348754D5858576174794A7948423665487434626239656B3633754766614D2F766965773F7573703D73686172696E67'),(106,'Penelope_Farmer','0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31506348754D5858576174794A7948423665487434626239656B3633754766614D2F766965773F7573703D73686172696E67'),(107,'Chris_Connor','0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31506348754D5858576174794A7948423665487434626239656B3633754766614D2F766965773F7573703D73686172696E67');
```
```sql
select * from author_info;
```

| author_id | author_name         | author_img                                                                                                                                                                                                                                                                                                                                     |
|:---------:|:-------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|       101 | Visnu_Sarma         | 0x30783638373437343730373333413246324636343732363937363635324536373646364636373643363532453633364636443246363636393643363532463634324633313530363334383735344435383538353736313734373934413739343834323336363534383734333436323632333936353642333633333735343736363631344432463736363936353737334637353733373033443733363836313732363936453637 |
|       102 | Andrew_Fusek_Peters | 0x30783638373437343730373333413246324636343732363937363635324536373646364636373643363532453633364636443246363636393643363532463634324633313530363334383735344435383538353736313734373934413739343834323336363534383734333436323632333936353642333633333735343736363631344432463736363936353737334637353733373033443733363836313732363936453637 |
|       103 | Stephen_Krensky     | 0x30783638373437343730373333413246324636343732363937363635324536373646364636373643363532453633364636443246363636393643363532463634324633313530363334383735344435383538353736313734373934413739343834323336363534383734333436323632333936353642333633333735343736363631344432463736363936353737334637353733373033443733363836313732363936453637 |
|       104 | Krishna_Rao         | 0x30783638373437343730373333413246324636343732363937363635324536373646364636373643363532453633364636443246363636393643363532463634324633313530363334383735344435383538353736313734373934413739343834323336363534383734333436323632333936353642333633333735343736363631344432463736363936353737334637353733373033443733363836313732363936453637 |
|       105 | Subba_Rao           | 0x30783638373437343730373333413246324636343732363937363635324536373646364636373643363532453633364636443246363636393643363532463634324633313530363334383735344435383538353736313734373934413739343834323336363534383734333436323632333936353642333633333735343736363631344432463736363936353737334637353733373033443733363836313732363936453637 |
|       106 | Penelope_Farmer     | 0x30783638373437343730373333413246324636343732363937363635324536373646364636373643363532453633364636443246363636393643363532463634324633313530363334383735344435383538353736313734373934413739343834323336363534383734333436323632333936353642333633333735343736363631344432463736363936353737334637353733373033443733363836313732363936453637 |
|       107 | Chris_Connor        | 0x30783638373437343730373333413246324636343732363937363635324536373646364636373643363532453633364636443246363636393643363532463634324633313530363334383735344435383538353736313734373934413739343834323336363534383734333436323632333936353642333633333735343736363631344432463736363936353737334637353733373033443733363836313732363936453637 |

---
```sql
create table stoires ( story_id int primary key, story_title varchar(25) not null,author_id int unique not null,poater_url blob not null, content_url blob not null, upload_date date not null, category varchar(25) not null);
```
```sql
desc stories;
```

| Field       | Type        | Null | Key | Default | Extra |
|:-----------:|:-----------:|:----:|:---:|:-------:|:-----:|
| story_id    | int         | NO   | PRI | NULL    |       |
| story_title | varchar(25) | NO   |     | NULL    |       |
| author_id   | int         | NO   | UNI | NULL    |       |
| poster_url  | blob        | YES  |     | NULL    |       |
| content_url | blob        | YES  |     | NULL    |       |
| upload_date | date        | YES  |     | NULL    |       |
| category    | varchar(15) | YES  |     | NULL    |       |
---
```sql
insert into stories values (1,'the_four_friends',101,'0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316B586C597369386D36414F73653066587055415531376B6D356D387535687A6B2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31316A756D44333738506C4C574363476469466C497932644E6634736B715852732F766965773F7573703D73686172696E67','2021-10-18',' moral'),(2,'the_talkative_tortoise',102,'0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67','2021-10-20','moral'),(3,'the_lion_and_hare',103,'0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67','2021-10-20','short'),(4,'the_weaver&the-princess',104,'0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67','2021-10-20','fairy'),(5,'the_crow&serpent',105,'0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E6','2021-11-02','panchathadira'),(6,'lallu_the-crocodile',106,'0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67','2021-11-02','scary'),(7,'Daedalus_and_Icarus',107,'0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67','2021-11-02','myth');
---
```
```sql
select * from stories;
```
| story_id | story_title             | author_id | poster_url                                                                                                                                                             | content_url                                                                                                                                                            | upload_date | category      |
|:--------:|:-----------------------:|:---------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------:|:-------------:|
|        1 | the_four_friends        |       101 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316B586C597369386D36414F73653066587055415531376B6D356D387535687A6B2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31316A756D44333738506C4C574363476469466C497932644E6634736B715852732F766965773F7573703D73686172696E67 | 2021-10-18  | moral         |
|        2 | the_talkative_tortoise  |       102 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-10-20  | moral         |
|        3 | the_lion_and_hare       |       103 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-10-20  | short         |
|        4 | the_weaver&the-princess |       104 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-10-20  | fairy         |
|        5 | the_crow&serpent        |       105 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-11-02  | panchathadira |
|        6 | lallu_the-crocodile     |       106 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-11-02  | scary         |
|        7 | Daedalus and Icarus     |       107 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-11-02  | myth          |
---
```sql
desc poet_info;
```

| Field     | Type        | Null | Key | Default | Extra          |
|:--------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| poet_id   | int         | NO   | PRI | NULL    | auto_increment |
| poet_name | varchar(30) | NO   |     | NULL    |                |
| poet_img  | blob        | YES  |     | NULL    |                |

---
```sql
insert into poet_info values (null,'Louis_carrol','https://drive.google.com/file/d/19i4HQtFUhbxFaNSDBocQB3e0F8IrHzF7/view?usp=sharing'),(null,'Lullaby','https://drive.google.com/file/d/19i4HQtFUhbxFaNSDBocQB3e0F8IrHzF7/view?usp=sharing'),(null,'Edward_Lear','https://drive.google.com/file/d/19i4HQtFUhbxFaNSDBocQB3e0F8IrHzF7/view?usp=sharing'),(null,' Alfred_Tennyson','https://drive.google.com/file/d/19i4HQtFUhbxFaNSDBocQB3e0F8IrHzF7/view?usp=sharing'),(null,'William_Blake','https://drive.google.com/file/d/19i4HQtFUhbxFaNSDBocQB3e0F8IrHzF7/view?usp=sharing'),(null,'Laura_Elizabeth_Richards','https://drive.google.com/file/d/19i4HQtFUhbxFaNSDBocQB3e0F8IrHzF7/view?usp=sharing'),(null,'Lewis_Carroll','https://drive.google.com/file/d/19i4HQtFUhbxFaNSDBocQB3e0F8IrHzF7/view?usp=sharing');
```

```sql
select * from poet_info;
```

| poet_id | poet_name                | poet_img                                                                                                                                                               |
|:-------:|:------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|       1 | Louis_carrol             | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31396934485174465568627846614E5344426F63514233653046384972487A46372F766965773F7573703D73686172696E67 |
|       2 | Lullaby                  | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31396934485174465568627846614E5344426F63514233653046384972487A46372F766965773F7573703D73686172696E67 |
|       3 | Edward_Lear              | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31396934485174465568627846614E5344426F63514233653046384972487A46372F766965773F7573703D73686172696E67 |
|       4 |  Alfred_Tennyson         | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31396934485174465568627846614E5344426F63514233653046384972487A46372F766965773F7573703D73686172696E67 |
|       5 | William_Blake            | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31396934485174465568627846614E5344426F63514233653046384972487A46372F766965773F7573703D73686172696E67 |
|       6 | Laura_Elizabeth_Richards | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31396934485174465568627846614E5344426F63514233653046384972487A46372F766965773F7573703D73686172696E67 |
|       7 | Lewis_Carroll            | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31396934485174465568627846614E5344426F63514233653046384972487A46372F766965773F7573703D73686172696E67 |

---
```sql
create table poems (poem_id int not null auto_increment primary key,poem_title varchar(50) not null unique,poster_url blob not null, song blob not null, upload_date date not null,poet_id int not null);
```
```sql
desc poems;
```

| Field       | Type        | Null | Key | Default | Extra          |
|:-----------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| poem_id     | int         | NO   | PRI | NULL    | auto_increment |
| poem_title  | varchar(50) | NO   | UNI | NULL    |                |
| poster_url  | blob        | NO   |     | NULL    |                |
| song        | blob        | NO   |     | NULL    |                |
| upload_date | date        | NO   |     | NULL    |                |
| poet_id     | int         | NO   |     | NULL    |                |
---
```sql
alter table poems add foreign key(poet_id) references poet_info(poet_id);
```
```sql
desc poems;
```

| Field       | Type        | Null | Key | Default | Extra          |
|:-----------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| poem_id     | int         | NO   | PRI | NULL    | auto_increment |
| poem_title  | varchar(50) | NO   | UNI | NULL    |                |
| poster_url  | blob        | NO   |     | NULL    |                |
| song        | blob        | NO   |     | NULL    |                |
| upload_date | date        | NO   |     | NULL    |                |
| poet_id     | int         | NO   | MUL | NULL    |                |

---
```sql
insert into poems values (null,'jabberwocky','https://drive.google.com/file/d/1l9iSddyISLuyFVdLn6sMv_vwnByIJFtl/view?usp=sharing','https://www.youtube.com/watch?v=GLQos7-Vq8M','2021-12-12',1),
(null,'twinkle_twinkle','https://drive.google.com/file/d/1l9iSddyISLuyFVdLn6sMv_vwnByIJFtl/view?usp=sharing','https://www.youtube.com/watch?v=GLQos7-Vq8M','2021-12-16',2),
(null,'the_pussy_cat','https://drive.google.com/file/d/1l9iSddyISLuyFVdLn6sMv_vwnByIJFtl/view?usp=sharing','https://www.youtube.com/watch?v=GLQos7-Vq8M','2021-12-20',3),
(null,'The_tyger','https://drive.google.com/file/d/1l9iSddyISLuyFVdLn6sMv_vwnByIJFtl/view?usp=sharing','https://www.youtube.com/watch?v=GLQos7-Vq8M','2021-12-23',4),
(null,'Eletelephony','https://drive.google.com/file/d/1l9iSddyISLuyFVdLn6sMv_vwnByIJFtl/view?usp=sharing','https://www.youtube.com/watch?v=GLQos7-Vq8M','2021-12-25',5),
(null,'the_eagle,'https://drive.google.com/file/d/1l9iSddyISLuyFVdLn6sMv_vwnByIJFtl/view?usp=sharing','https://www.youtube.com/watch?v=GLQos7-Vq8M','2021-12-27',6),
(null,'The_crocodile','https://drive.google.com/file/d/1l9iSddyISLuyFVdLn6sMv_vwnByIJFtl/view?usp=sharing','https://www.youtube.com/watch?v=GLQos7-Vq8M','2021-12-28',7);
```
```sql
select*from poems;
```

| poem_id | poem_title      | poster_url                                                                                                                                                             | song                                                                                     | upload_date | poet_id |
|:-------:|:---------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------:|:-----------:|:-------:|
|       1 | jabberwocky     | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-12  |       1 |
|       2 | twinkle_twinkle | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-16  |       2 |
|       3 | the_pussy_cat   | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-20  |       3 |
|       4 | The_tyger       | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-23  |       4 |
|       5 | Eletelephony    | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-25  |       5 |
|       6 | The_eagle       | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-27  |       6 |
|       7 | The_crocodile   | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-28  |       7 |
---
```sql
create table comics(comic_id int auto_increment primary key,comic_name varchar(50) not null unique, languages varchar(50) default 'english',genre varchar(30) not null, upload_date date not null);
```
```sql
desc comics;
```

| Field       | Type        | Null | Key | Default | Extra          |
|:-----------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| comic_id    | int         | NO   | PRI | NULL    | auto_increment |
| comic_name  | varchar(50) | NO   | UNI | NULL    |                |
| languages   | varchar(50) | YES  |     | english |                |
| genre       | varchar(30) | NO   |     | NULL    |                |
| upload_date | date        | NO   |     | NULL    |                |

```sql
alter table comics auto_increment = 111;
```

```sql
insert into comics values (null, 'Archie_Comics',default,'fantasy','2021-12-25'),(null, 'Sonic_the_Hedgehog',default,'humour','2021-12-29'),(null, 'The_Avengers',default,'humour','2022-01-02'),(null, 'Justice_League_Unlimited',default,'humour','2022-01-10'),(null, 'TINY_TITANS',default,'fantasy','2022-01-18');
```
```sql
select * from comics;
```
| comic_id | comic_name               | languages | genre   | upload_date |
|:--------:|:------------------------:|:---------:|:-------:|:-----------:|
|      111 | Archie_Comics            | english   | fantasy | 2021-12-25  |
|      112 | Sonic_the_Hedgehog       | english   | action  | 2021-12-29  |
|      113 | The_Avengers             | english   | action  | 2022-01-02  |
|      114 | Justice_League_Unlimited | english   | action  | 2022-01-10  |
|      116 | TINY_TITANS              | english   | fantasy | 2022-01-18  |

```sql
create table fun_zone (game_id int primary key auto_increment,game_name varchar(30) not null );
```
```sql
desc fun_zone;
```
| Field     | Type        | Null | Key | Default | Extra          |
|:---------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| game_id   | int         | NO   | PRI | NULL    | auto_increment |
| game_name | varchar(30) | NO   |     | NULL    |                |


```sql
alter table fun_zone add column game_type varchar(50) not null unique;
```
```sql
desc fun_zone;
```

| Field     | Type        | Null | Key | Default | Extra          |
|:---------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| game_id   | int         | NO   | PRI | NULL    | auto_increment |
| game_name | varchar(30) | NO   |     | NULL    |                |
| game_type | varchar(50) | NO   | UNI | NULL    |                |

```sql
insert into fun_zone values (null,'santa_run','running');
```
```sql
insert into fun_zone values (null,'zombi_strike','shooting');
```
```sql
insert into fun_zone values (null,'car_rush','racing');
```
```sql
insert into fun_zone values (null,'candy_crash','puzzle');
```
```sql
insert into fun_zone values (null,'space_fire','adventure');
```
```sql
select * from fun_zone;
```
| game_id | game_name    | game_type |
|:-------:|:------------:|:---------:|
|       1 | santa_run    | running   |
|       2 | zombi_strike | shooting  |
|       3 | car_rush     | racing    |
|       4 | candy_crash  | puzzle    |
|       5 | space_fire   | adventure |

```sql
create table category (cat_id tinyint primary key auto_increment,section varchar (30) not null);
```
```sql
desc table category;
```
| id | select_type | table    | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra |
|:--:|:-----------:|:--------:|:----------:|:----:|:-------------:|:----:|:-------:|:----:|:----:|:--------:|:-----:|
|  1 | SIMPLE      | category | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    1 |   100.00 | NULL  |

```sql
desc category;
```
| Field   | Type        | Null | Key | Default | Extra          |
|:-------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| cat_id  | tinyint     | NO   | PRI | NULL    | auto_increment |
| section | varchar(30) | NO   |     | NULL    |                |
```sql
insert into category values (null,' stories'),(null,'poems'),(null,'comics'),(null,'fun_zone');
```
```sql
select * from category;
```
| cat_id | section  |
|:------:|:--------:|
|      1 |  stories |
|      2 | poems    |
|      3 | comics   |
|      4 | fun_zone |
```sql
alter table stories add (cat_id tinyint, foreign key (cat_id) references category(cat_id));
```
```sql
alter table poems add (cat_id tinyint, foreign key (cat_id) references category(cat_id));
```
```sql
alter table comics add (cat_id tinyint, foreign key (cat_id) references category(cat_id));
```
```sql
alter table fun_zone add (cat_id tinyint, foreign key (cat_id) references category(cat_id));
```
```sql
update stories set cat_id = 1 ;
```
```sql
select * from stories;
```
| story_id | story_title             | author_id | poster_url                                                                                                                                                             | content_url                                                                                                                                                            | upload_date | category      | cat_id |
|:--------:|:-----------------------:|:---------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------:|:-------------:|:------:|
|        1 | the_four_friends        |       101 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316B586C597369386D36414F73653066587055415531376B6D356D387535687A6B2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31316A756D44333738506C4C574363476469466C497932644E6634736B715852732F766965773F7573703D73686172696E67 | 2021-10-18  | moral         |      1 |
|        2 | the_talkative_tortoise  |       102 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-10-20  | moral         |      1 |
|        3 | the_lion_and_hare       |       103 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-10-20  | short         |      1 |
|        4 | the_weaver&the-princess |       104 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-10-20  | fairy         |      1 |
|        5 | the_crow&serpent        |       105 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-11-02  | panchathadira |      1 |
|        6 | lallu_the-crocodile     |       106 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-11-02  | scary         |      1 |
|        7 | Daedalus and Icarus     |       107 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F312D556248757A486841554E4A524A62787632327A53686B5F4A5F4A4B704D5A722F766965773F7573703D73686172696E67 | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F31795A7869755051366B4F5749394E555A4F41716E5169706755467A68655762392F766965773F7573703D73686172696E67 | 2021-11-02  | myth          |      1 |

```sql
update poems set cat_id = 2 ;
```
```sql
update comics set cat_id = 3 ;
```
```sql
update fun_zone set cat_id = 4 ;
```
```sql
select * from poems;
```

| poem_id | poem_title      | poster_url                                                                                                                                                             | song                                                                                     | upload_date | poet_id | cat_id |
|:-------:|:---------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------:|:-----------:|:-------:|:------:|
|       1 | jabberwocky     | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-12  |       1 |      2 |
|       2 | twinkle_twinkle | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-16  |       2 |      2 |
|       3 | the_pussy_cat   | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-20  |       3 |      2 |
|       4 | The_tyger       | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-23  |       4 |      2 |
|       5 | Eletelephony    | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-25  |       5 |      2 |
|       6 | The_eagle       | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-27  |       6 |      2 |
|       7 | The_crocodile   | 0x68747470733A2F2F64726976652E676F6F676C652E636F6D2F66696C652F642F316C39695364647949534C75794656644C6E36734D765F76776E4279494A46746C2F766965773F7573703D73686172696E67 | 0x68747470733A2F2F7777772E796F75747562652E636F6D2F77617463683F763D474C516F73372D5671384D | 2021-12-28  |       7 |      2 |

```sql
select * from comics;
```
| comic_id | comic_name               | languages | genre   | upload_date | cat_id |
|:--------:|:------------------------:|:---------:|:-------:|:-----------:|:------:|
|      111 | Archie_Comics            | english   | fantasy | 2021-12-25  |      3 |
|      112 | Sonic_the_Hedgehog       | english   | action  | 2021-12-29  |      3 |
|      113 | The_Avengers             | english   | action  | 2022-01-02  |      3 |
|      114 | Justice_League_Unlimited | english   | action  | 2022-01-10  |      3 |
|      116 | TINY_TITANS              | english   | fantasy | 2022-01-18  |      3 |

```sql
select * from fun_zone;
```
| game_id | game_name    | game_type | cat_id |
|:-------:|:------------:|:---------:|:------:|
|       1 | santa_run    | running   |      4 |
|       2 | zombi_strike | shooting  |      4 |
|       3 | car_rush     | racing    |      4 |
|       4 | candy_crash  | puzzle    |      4 |
|       5 | space_fire   | adventure |      4 |
+---------+--------------+-----------+--------+




EER DIAGRAM

![EER _ KK](https://user-images.githubusercontent.com/93571060/160575945-30a74767-0a32-4e80-ac6f-7a422087dd7b.png)



ER DIAGRAM

![er-kiddy kids (1)](https://user-images.githubusercontent.com/93571060/160390307-481e7d01-2c25-496b-97aa-be85f5fb622f.png)












