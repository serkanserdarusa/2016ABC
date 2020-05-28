package SQL;

public class day3 {
    /*
    --Like==>%
select*from employees where first_name like 'S%';--retrives firstname which starts S
select*from employees where first_name like '%k';--retrives firstname which ends k
select*from employees where first_name like 'St%';--retrives firstname which starts St
select*from employees where first_name like '%en';--retrives firstname which ends el
select*from employees where first_name like '%ab%';--retrives firstname which include ab
select*from employees where first_name like '%t%o%';--retrives firstname which is contain t before o
select*from employees where first_name like '%th%o%';--retrives firstname which is contain th before o
select*from employees where first_name like 'J_n___o_';
select*from employees where first_name like '%J_n___o_';
select*from employees where first_name like 'J_n___o_%';

--IN===>allows us to specify multiple values in where clause
select*from employees where department_id in(30,50,100);
select*from employees where manager_id in(100,120);

--Between==>select values within the given range
--values can be number,text or dates
select *from employees where salary between 4000 and 15000;
select first_name,job_id from employees where hire_date between '11-MAY-04' and '07-FEB-07';

--ALiASES
--it gives temporary name
--make it readable

select first_name from employees;
select first_name as name from employees;--name comes as capital
select first_name as "name" from employees;--as it is
select first_name as "NAME" from employees;--as it is
select first_name as "NaMe" from employees;--as it is
select last_name as surname,salary from employees;

--Concat
select first_name||''||last_name as fullName from employees;
select first_name||'-'||last_name as fullName from employees;
select email||'@gmail.com' from employees;
select concat(first_name,last_name)as concatination from employees;
select concat(email,'@gmail.com') as email from employees;

--length
select first_name,length(first_name) from employees order by length(first_name) asc;
select first_name,last_name,length(first_name||''||last_name) as fullname from employees;
select first_name,length(first_name) from employees where length(first_name) between 2 and 8;
select first_name,length(first_name) from employees where length(first_name) in (2,3,4);
select first_name,last_name,length(first_name||''||last_name) from employees;
select max(length(first_name||''||last_name)) from employees;
select first_name,last_name,min(length(first_name||''||last_name)) from employees group by first_name,last_name;

--Substring
select first_name,substr(first_name,0,1) from employees;
select first_name,substr(first_name,0,3) from employees;
select first_name,last_name,SUBSTR(first_name,0,1)||'.'||SUBSTR(last_name,0,1) as initials from employees;

--LOWER and UPPER
select lower(first_name) from employees;
select upper(first_name) from employees;
select email from employees;
select initcap(email) from employees;--first letter of each words uppe,all other letters in lowercase
select upper(last_name),lower(job_id),initcap(first_name) from employees;


--Replace
select first_name,replace(first_name,'e','a') from employees;
select first_name,replace(first_name,'E','A') from employees;

--Trim==>delete unused space
select*from employees;
select '   '||first_name from employees;
select trim(' '||first_name) from employees;
select trim(first_name) from employees;

--view
--it is virtual table
--it does not hold actual data
create view batch123 as select first_name,last_name,salary from employees;
select*from batch123;
create or replace view batch123 as select first_name,last_name,salary from employees;
update batch123 set first_name='Scotttttt' where first_name='Steven';

create view batch12345 as select first_name,last_name,salary from employees;
select*from batch12345;
update batch12345 set salary=25000 where salary=24000;

--Primary Key
--it should be unique(no allows duplicate)
--cannot be null
--we can have(create) only one primary key in a table but it can be contain more than one value

create table ABCD(
Id int not null primary key,
firstname varchar(20),
lastname varchar(30));

create table ABCDE(
Id int not null ,
firstname varchar(20),
lastname varchar(30),
Primary Key(Id)
);
create table ABCDEF(
Id int not null ,
firstname varchar(20),
lastname varchar(30),
Primary Key(Id,firstname)
);
insert all
    into ABCDEF values(9,'herhandez','kan')
           into ABCDEF values(10,'tim','zan')
           into ABCDEF values(11,'manuel','tan')
           select*from dual;

create table ABCDEFG(
Id int not null ,
firstname varchar(20),
lastname varchar(30),
Primary Key(Id),
Primary Key(firstname)
);not work

--FOREIGN KEY
--it used to link two or more tables together
--it can be null
--it can be duplicate
--foreign key can be more than one in the table

create table ABCDEFGH(
Id int not null primary key,
firstname varchar(20),
lastname varchar(30));

create table ABCDEFGHI(
A_ID int not null primary Key,
student_id null,
firstname varchar(20),
lastname varchar(30),
constraint F_KA Foreign Key(student_id) references ABCDEFGH(Id));


--dual table
--it is dummy table
select 'Ali kocaaga' as abi from dual;
select 2+3 as sum from dual;
select sysdate from dual;
commit work;

     */
}
