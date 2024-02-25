create database practice;
use practice;
/*select column from table1 inner join table2 on table1.column=table2.column*/
create table customer (cid int(10) primary key auto_increment not null, cname varchar(50), phone int (255));
insert into customer (cname,phone) values ('sagar',45643), ('vikrant',649788), ('amruta',32646), ('ajay',42516);

create table accounts(cid int, aid int primary key auto_increment not null, acountstype varchar(55), 
balance int(55), foreign key(cid) references customer(cid));

insert into accounts (cid, acountstype, balance) values (2,'saving',4500), (2,'current',3600);

drop table customer;
desc customer;
desc accounts;

--  SELECT column_name(s) FROM table1 INNER JOIN table2 ON table1.column_name = table2.column_name;
select customer.cid, cname, phone, aid, balance from customer inner join accounts on customer.cid=accounts.cid;
select c.cid, c.cname, c.phone, a.aid, a.balance from customer c inner join accounts a on c.cid = a.cid;

-- SELECT column_name(s) FROM table1 LEFT JOIN table2 ON table1.column_name = table2.column_name;
select customer.cid, cname, phone, aid, balance from customer left join accounts on customer.cid=accounts.cid; 

-- SELECT column_name(s) FROM table1 RIGHT JOIN table2 ON table1.column_name = table2.column_name;
select customer.cid, cname, phone, aid, balance from customer right join accounts on customer.cid=accounts.cid;

-- SELECT column_name(s) FROM table1 UNION SELECT column_name(s) FROM table2;
select * from customer left join accounts on customer.cid = accounts.cid union 
select * from customer right join accounts on customer.cid = accounts.cid;

-- FROM table1 FULL OUTER JOIN table2 ON table1.column_name = table2.column_name WHERE condition;
SELECT customer.cname, accounts.aid
FROM customer
LEFT JOIN accounts ON customer.cid = accounts.cid
UNION
SELECT customer.cname, accounts.aid
FROM accounts
RIGHT JOIN customer ON customer.cid = accounts.cid
ORDER BY cname;

-- SELECT column_name(s) FROM table1 T1, table1 T2 WHERE condition;
SELECT A.cname AS Customer1, B.cname AS Customer2 FROM customer A, customer B WHERE A.cid = B.cid;
SELECT A.acountstype AS Account1, B.acountstype AS Account2 FROM accounts A, accounts B WHERE A.aid = B.aid;

------------------------------------------------------------------------------------------

create schema assignment;
use assignment;
create table employee (
	id int primary key not null auto_increment, 
    firstname varchar(50), 
	lastname varchar(50), 
    address varchar(255), 
    city varchar(50), 
    salary varchar(255)
);
insert into employee values
	(1,'rajiv' ,'sundli','uk','dehradun',50000),
	(2,'kirti' ,'ahir','gj','surat',60000),
	(3,'ripu','daman','up','kanpur' ,35000),
	(4,'ajay','yadav','up','banaras',43000),
	(5,'subash','senapati','od','bubneshwar',52000),
	(6,'vikas','late','mh','nagar',22000),
	(7,'shrikant','kale','mh','yavatmal',22000);

select * from employee;
select count(id) as total_id_Count from employee;
select sum(salary) as sum_of_total_salary from employee;
select min(salary) as minimum_salary from employee;
select max(salary) as maximum_salary from employee;
select min(salary) as minimum_salary, max(salary) as maximum_salary from employee;
select * from employee order by firstname desc;
select firstname, lastname, salary from employee where salary >= 35000 and salary <= 60000;
update employee set city='pune' where id=7;
-- second highest salary in mysql
select Salary from Employee order by Salary desc limit 1,1;
-- finding avg salary group by city, firstname, lastname
select firstname, lastname, city, avg(salary) as average_salary
from employee
group by city, firstname, lastname;
-- finding avg salary group by city only
select city, avg(salary) as average_salary
from employee
where city = 'pune'
group by city;

SELECT
    firstname,
    lastname,
    city,
    AVG(salary) AS average_salary
FROM
    employee
GROUP BY
    city,
    firstname,
    lastname
HAVING
    AVG(salary) > 50000;