package SQL;

public class day1 {
    /*
    --SQL=Structered query language.it let us access and manipulate database
--DML=Data manipulation language
--CRUD operations,create(insert),read(select),update,delete
--DDL=Data definition language
--Create alter,alter table,drop,truncate

create table KLM (employee_id integer primary key,
firstname varchar(20),
lastname varchar(30),
salary int);
create table XYZ (employee_id integer primary key,
firstname varchar(20),
lastname varchar(30),
salary int);

--insert into KLM(employee_id,firstname,lastname,salary) values (1,'mike','fan',4500);
--insert into KLM values (1,'mike','fan',4500);
insert all
into ss values(1,'mike','fan',2500)
into ss values(2,'scott','han',3500)
into ss values(3,'john','kan',5500)
into ss values(1,'mike','fan',2500)
into ab values(2,'scott','han',3500)
into ab values(3,'john','kan',5500)
into KLM values(1,'mike','fan',2500)
into KLM values(2,'scott','han',3500)
into KLM values(3,'john','kan',5500)
into XYZ values(1,'mike','fan',2500)
into XYZ values(2,'scott','han',3500)
into XYZ values(3,'john','kan',5500)
select*from dual;

--select
select*from KLM;
--* mean return everything
select firstname from KLM;
select firstname,lastname from KLM;
select KLM.firstname,XYZ.lastname from KLM,XYZ;
select*from klm,xyz;


--update==>make some variable modified

update KLM set firstname='Yunus' where employee_id=1;
update XYZ set salary=10000 where employee_id=3;
update XYZ set lastname='kilic' where rownum=1;
update XYZ set lastname='kaya' where lastname='yavuz';

--delete
--it can delete just one row or all row
--select,from,where...clause
--delete just row
select*from klm;
delete from KLM where employee_id =1;
delete from KLM where firstname ='scott';
select*from klm;
--delete all row inside of the table but not table itself
delete from klm;
select*from XYZ;
--truncate dosent accept where clause so we can not delete just one row
truncate table XYZ;
select*from XYZ;
drop table klm;
drop table xyz;
select*from klm;
drop table klm;
--Alter==>modified
--add,modify,drop,rename
Alter table ab add adress varchar(30);
select*from ab;
Alter table ab modify adress varchar(50);
select*from ab;
alter table ab rename column adress to mailingaddress;
select*from ab;
alter table ab drop column mailingaddress;
select*from ss;
alter table ss drop column salary;
select*from ss;
rollback;
select*from ss;
delete from ss where employee_id =1;
select*from ss;
rollback;--rollback dosent work with drop and truncate
select*from ss;
truncate table ss;
select*from ss;
rollback;
select*from ss;


     */
}
