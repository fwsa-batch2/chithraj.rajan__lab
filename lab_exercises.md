Feature 1: Student Registration



mysql> SELECT * FROM students;
+----+------------+---------------------+------------+-----------+--------+------------+---------------------+
| id | name       | email               | mobile_no  | password  | gender | dob        | created_date        |
+----+------------+---------------------+------------+-----------+--------+------------+---------------------+
|  1 | Chithu     | Chithu3@gmail.com   | 8682072886 | Chithu3   | Male   | 2003-11-21 | 2022-03-01 00:00:00 |
+----+------------+---------------------+------------+-----------+--------+------------+---------------------+
1 row in set (0.01 sec)

mysql> INSERT INTO students VALUES(2,"Antony","anto234@gmail.com","9789255748","Ando123","Male","2003-01-18",now());
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM students;
+----+------------+---------------------+------------+------------+--------+------------+---------------------+
| id | name       | email               | mobile_no  | password   | gender | dob        | created_date        |
+----+------------+---------------------+------------+------------+--------+------------+---------------------+
|  1 | Chithu     | Chithu3@gmail.com   | 8682072886 | Chithu3    | Male   | 2003-11-21 | 2022-03-01 00:00:00 |
|  2 | Antony     | anto234@gmail.com   | 9789255748 | Ando123    | Male   | 2003-01-18 | 2022-03-02 09:30:43 |
+----+------------+---------------------+------------+------------+--------+------------+---------------------+
2 rows in set (0.00 sec)

mysql> INSERT INTO students VALUES(3,"kumar","kumar123@gmail.com","6381850501","kumar1234","Male","2002-04-25",now());
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO students VALUES(4,"saravanan","saravanan245@gmail.com","9597312147","saravanan32","Male","2003-12-09",now());
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO students VALUES(6,"Anuston","anuston234@gmail.com","7639312147","anuston23","Male","2002-02-13",now());
Query OK, 1 row affected (0.01 sec)


Feature 2: List All Students:
  
mysql> SELECT * FROM students;
+----+-------------+-------------------------+------------+------------+--------+------------+---------------------+
| id | name        | email                   | mobile_no  | password   | gender | dob        | created_date        |
+----+-------------+-------------------------+------------+------------+--------+------------+---------------------+
|  1 | Chithu      | Chithu3@gmail.com       | 8682072886 | Chithu3    | Male   | 2003-11-21 | 2022-03-01 00:00:00 |
|  2 | Antony      | anto234@gmail.com       | 9789255748 | Ando123    | Male   | 2003-01-18 | 2022-03-02 09:30:43 |
|  3 | kumar
         | kumar
123@gmail.com        | 6381850501 | kumar
1234    | Male   | 2002-04-25 | 2022-03-02 09:32:31 |
|  4 | saravanan      | saravanan245@gmail.com     | 9597312147 | saravanan32   | Male   | 2003-02-09 | 2022-03-02 09:38:33 |
|  5 | Anuston     | anuston234@gmail.com    | 7639312147 | anuston23  | Male   | 2002-02-13 | 2022-03-02 09:41:11 |
+----+-------------+-------------------------+------------+------------+--------+------------+---------------------+
5 rows in set (0.00 sec)



Feature 3: Login with email and password:

mysql> SELECT * FROM students WHERE email="Chithu3@gmail.com " and password="Chithu3";
+----+------------+---------------------+------------+-----------+--------+------------+---------------------+
| id | name       | email               | mobile_no  | password  | gender | dob        | created_date        |
+----+------------+---------------------+------------+-----------+--------+------------+---------------------+
|  1 | Chithu     | Chithu3@gmail.com   | 8682072886 | Chithu3   | Male   | 2003-11-21 | 2022-03-01 00:00:00 |
+----+------------+---------------------+------------+-----------+--------+------------+---------------------+
1 row in set (0.00 sec)






Feature 4: Update Password:

mysql> UPDATE students SET password="kumar
an25" WHERE id= 3;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM students;
+----+-------------+-------------------------+------------+------------+--------+------------+
| id | name        | email                   | mobile_no  | password   | gender | dob        |
+----+-------------+-------------------------+------------+------------+--------+------------+
|  1 | Chithu      | Chithu3@gmail.com       | 8682072886 | Chithu3    | Male   | 2003-11-21 |
|  2 | Antony      | anto234@gmail.com       | 9789255748 | Ando123    | Male   | 2003-01-18 |
|  3 | kumar
         | kumar
123@gmail.com        | 6381850501 | kumar
an25    | Male   | 2002-04-25 |
|  4 | saravanan      | saravanan245@gmail.com     | 9597312147 | saravanan32   | Male   | 2003-02-09 |
|  5 | Anuston     | anuston234@gmail.com    | 7639312147 | anuston23  | Male   | 2002-02-13 |
+----+-------------+-------------------------+------------+------------+--------+------------+
5 rows in set (0.00 sec)


Feature 5: Enroll Student into Class:
  
mysql> INSERT INTO students VALUES(6,"Chitkumar
","chitu@gmail.com","9789505011","chitu45","Male","2003-11-10",now());
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO student_class VALUES(6,6,5,"ACTIVE");
Query OK, 1 row affected (0.00 sec)

mysql> SELECT * FROM students;
+----+-------------+-------------------------+------------+------------+--------+------------+
| id | name        | email                   | mobile_no  | password   | gender | dob        |
+----+-------------+-------------------------+------------+------------+--------+------------+
|  1 | Chithu      | Chithu3@gmail.com       | 8682072886 | Chithu3    | Male   | 2003-11-21 |
|  2 | Antony      | anto234@gmail.com       | 9789255748 | Ando123    | Male   | 2003-01-18 |
|  3 | kumar
         | kumar
123@gmail.com        | 6381850501 | kumar
an25    | Male   | 2002-04-25 |
|  4 | saravanan      | saravanan245@gmail.com     | 9597312147 | saravanan32   | Male   | 2003-02-09 |
|  5 | Anuston     | anuston234@gmail.com    | 7639312147 | anuston23  | Male   | 2002-02-13 |
|  6 | Chitkumar
     | chitu@gmail.com         | 9789505011 | chitu45    | Male   | 2003-11-10 |
+----+-------------+-------------------------+------------+------------+--------+------------+
6 rows in set (0.00 sec)

mysql> SELECT * FROM class;
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  1 |          1 |     5 | ACTIVE |
|  2 |          2 |     6 | ACTIVE |
|  3 |          3 |     5 | ACTIVE |
|  4 |          4 |     6 | ACTIVE |
|  5 |          5 |     5 | ACTIVE |
|  6 |          6 |     5 | ACTIVE |
+----+------------+-------+--------+
6 rows in set (0.00 sec)
  


Feature 6: Find Students who are enrolled in the given class. Find Students who are studying in 5th standard.



mysql> SELECT * FROM class;
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  1 |          1 |     5 | ACTIVE |
|  2 |          2 |     6 | ACTIVE |
|  3 |          3 |     5 | ACTIVE |
|  4 |          4 |     6 | ACTIVE |
|  5 |          5 |     5 | ACTIVE |
|  6 |          6 |     5 | ACTIVE |
+----+------------+-------+--------+
6 rows in set (0.00 sec)

mysql> SELECT * FROM class WHERE class=5;
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  1 |          1 |     5 | ACTIVE |
|  3 |          3 |     5 | ACTIVE |
|  5 |          5 |     5 | ACTIVE |
|  6 |          6 |     5 | ACTIVE |
+----+------------+-------+--------+
4 rows in set (0.00 sec)



Feature 7: Update Student Class information.
Update student from 5th standard to 6th standard.

mysql> UPDATE class SET class=6 WHERE class=5;
Query OK, 4 rows affected (0.01 sec)
Rows matched: 4  Changed: 4  Warnings: 0

mysql> SELECT * FROM class;
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  1 |          1 |     6 | ACTIVE |
|  2 |          2 |     6 | ACTIVE |
|  3 |          3 |     6 | ACTIVE |
|  4 |          4 |     6 | ACTIVE |
|  5 |          5 |     6 | ACTIVE |
|  6 |          6 |     6 | ACTIVE |
+----+------------+-------+--------+
6 rows in set (0.01 sec)


Feature 8: Student withdrawn from a Class:

mysql> DELETE FROM student_class WHERE id=6;
Query OK, 1 row affected (0.01 sec)

Feature 9: Find student details who have not updated their Date Of Birth.

mysql> SELECT * FROM students WHERE dob=NULL;
Empty set (0.00 sec)


Feature 10: Find Total no of students actively studying in this school.


mysql> SELECT COUNT(student_id) AS "Total _no _of_student _actively_studying_in_this_school"FROM student_class WHERE status="ACTIVE";
+--------------------------------------------------------+
| Total _no _of_student _actively_studying_in_this_school |
+--------------------------------------------------------+
|                                                      5 |
+--------------------------------------------------------+
1 row in set (0.00 sec)



Feature 11: Find Total no of students actively studying in each class:

mysql> SELECT COUNT(student_id) AS "Total_no_of_students_Active",class FROM student_class WHERE status="ACTIVE" GROUP BY class;
+-----------------------------+-------+
| Total_no_of_students_Active | class |
+-----------------------------+-------+
|                           4 |     5 |
|                           3 |     6 |
+-----------------------------+-------+
2 rows in set (0.00 sec)


Feature 12: Find Total no of students actively studying each class which has less than 5 students.

mysql> SELECT COUNT(student_id),class FROM student_class WHERE status="ACTIVE" GROUP BY class HAVING COUNT(student_id)<5;
+-------------------+-------+
| COUNT(student_id) | class |
+-------------------+-------+
|                 4 |     5 |
|                 2 |     6 |
+-------------------+-------+
2 rows in set (0.00 sec)


Feature 13: Display student and class details #
Using Joins (Inner Join)

mysql> SELECT * FROM students s INNER JOIN class s_c ON s.id= s_c.student_id;
+----+-------------+-------------------------+------------+------------+--------+------------+----+------------+-------+--------+
| id | name        | email                   | mobile_no  | password   | gender | dob        | id | student_id | class | status |
+----+-------------+-------------------------+------------+------------+--------+------------+----+------------+-------+--------+
|  1 | Chithu      | Chithu3@gmail.com       | 8682072886 | Chithu3    | Male   | 2003-11-21 |  1 |          1 |     5 | ACTIVE |
|  2 | Antony      | anto234@gmail.com       | 9789255748 | Ando123    | Male   | 2003-01-18 |  2 |          2 |     6 | ACTIVE |
|  3 | kumar
         | kumar
123@gmail.com        | 6381850501 | kumar
an25    | Male   | 2002-04-25 |  3 |          3 |     5 | ACTIVE |
|  4 | saravanan      | saravanan245@gmail.com     | 9597312147 | saravanan32   | Male   | 2003-02-09 |  4 |          4 |     6 | ACTIVE |
|  5 | Anuston     | anuston234@gmail.com    | 7639312147 | anuston23  | Male   | 2002-02-13 |  5 |          5 |     5 | ACTIVE |
+----+-------------+-------------------------+------------+------------+--------+------------+----+------------+-------+--------+
5 rows in set (0.00 sec)

+-----------------------------------------------------+
|                                                     |
|Feature 13: Display student and class details.       |
| Using Subqueries                                    |
|                                                     |
+-----------------------------------------------------+
 
Feature 14: Display Student Details for the given input class. 
Class : 5th Standard (Using Joins)
 
mysql> SELECT * FROM students s INNER JOIN student_class s_c ON s.id= s_c.student_id WHERE s_c.class=5;
+----+-------------+-------------------------+------------+------------+--------+------------+----+------------+-------+--------+
| id | name        | email                   | mobile_no  | password   | gender | dob        | id | student_id | class | status |
+----+-------------+-------------------------+------------+------------+--------+------------+----+------------+-------+--------+
|  1 | Chithu      | Chithu3@gmail.com       | 8682072886 | Chithu3    | Male   | 2003-11-21 |  1 |          1 |     5 | ACTIVE |
|  3 | kumar
         | kumar
123@gmail.com        | 6381850501 | kumar
an25    | Male   | 2002-04-25 |  3 |          3 |     5 | ACTIVE |
|  5 | Anuston     | anuston234@gmail.com    | 7639312147 | anuston23  | Male   | 2002-02-13 |  5 |          5 |     5 | ACTIVE |
+----+-------------+-------------------------+------------+------------+--------+------------+----+------------+-------+--------+
3 rows in set (0.00 sec)
 
 
 
Feature 15: Find Class for the given student email id.
 
 mysql> SELECT class FROM student_class s_c INNER JOIN students s ON s.id= s_c.student_id WHERE s.email="Chithu3@gmail.com ";
+-------+
| class |
+-------+
|     5 |
+-------+
1 row in set (0.00 sec)

+---------------------------------------------------------------------+ 
|                                                                     |
| Feature 16: Find Students who has not enrolled in a class.          |
| Using Subquery                                                      |
|                                                                     |
+---------------------------------------------------------------------+ 

Feature 17: Display all students name with class - include both enrolled and not enrolled.

mysql> SELECT students.name,student_class.class FROM students LEFT JOIN student_class ON students.id=student_class.student_id;
+--------------------+-------+
| name               | class |
+--------------------+-------+
| Chithu             |     5 |
| Antony             |     6 |
| kumar
                |     5 |
| saravanan             |     6 |
| Anuston            |     5 |

+--------------------+-------+
6 rows in set (0.00 sec)
