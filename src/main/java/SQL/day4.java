package SQL;

public class day4 {
    /*
    --Union,Union All,intersect,minus
--combine columns
--each number of columns must be same
--each column's data type should be same or similiar
--each column's order should be same
--column's name can be different
--row num can be different
select*from AB1;
select*from AB2;
select*from AB3;
--intersect
--it return only matching

select*from AB1
intersect
select*from AB2;--return nothing

select firstname from AB1
intersect
select firstname from AB2;--return matching name

select A_id from AB1
intersect
select A_id from AB2;--return matching id number

select firstname from AB1
intersect
select name from AB3;--return matching name and firstname

select lastname from AB2
intersect
select surname from AB3;--return matching lastname and surname;

select firstname from AB2
intersect
select name from AB3
intersect
select firstname from AB1;--return matching name and firstname

--minus
--return us different value
select*from AB1
minus
select*from AB2;--return everything

select firstname from AB1
minus
select firstname from AB2;--return different name

select firstname from AB2
minus
select firstname from AB1;--return different name

select A_id from AB3
minus
select A_id from AB1;--return different value

select firstname from AB1
minus
select name from AB3;--return different value

select lastname from AB2
minus
select surname from AB3;--return different value

--union
--this operator returns only distinct rows or value
--return sorted order
select*from AB1;
select*from AB2;
select*from AB3;

select firstname from AB1
union
select firstname from AB2;--return only unique value

select * from AB1
union
select * from AB2;--return only unique rows

select firstname from AB1
union
select name from AB3;--return only unique value

select * from AB2
union
select * from AB3;--return only unique rows.one rows matching
select*from AB2;
select*from AB3;
--union all
--dosent eliminate duplicate
--it returns everything

select * from AB1
union all
select * from AB2;--return everything

select * from AB2
union all
select * from AB3;--return everything

select firstname from AB1
union all
select firstname from AB2;--return allname


select A_id from AB1
union all
select A_id from AB3;--return all id


--joins
--==>combine rows
--inner join==>join matching parts from both table.Eliminate unmatching parts
--outer join==>return matching parts from one table and return unmatching part
--right outer join==>everything comes from right join just matching parts comes from left join
--left  outer join==>everything comes from left join just matching parts comes from right join
--full  outer join==>return matching part from both table and unmatching part together
--self join

--inner join
select*from customers;
select*from regions;
select region_name from regions R inner join customers C on R.region_id=C.customer_id;--1,2,3,4
select firstname from regions R inner join customers C on R.region_id=C.customer_id;--1,2,3,4
select Adress_id from regions R inner join customers C on R.region_id=C.customer_id;--1,2,3,4

--left join
--everything comes from left table just matching parts comes from right table
select*from employees;
select*from job_history;
select*from employees E left outer join job_history J on E.department_id=J.department_id;
select*from employees E left outer join job_history J on E.employee_id=J.employee_id;
select*from employees E left outer join job_history J on E.hire_date=J.start_date;

--right join
--everything comes from right table just matching parts comes from left table
select*from employees;
select*from job_history;
select*from employees E right outer join job_history J on E.department_id=J.department_id;
select*from employees E right outer join job_history J on E.employee_id=J.employee_id;
select*from employees E right outer join job_history J on E.hire_date=J.start_date;
select*from employees E right outer join job_history J on J.job_id=E.job_id;

--full join
--return everything from both table and return null value for unmatching parts
select*from employees;
select*from job_history;
select*from employees  full outer join job_history  on employees.department_id=job_history.department_id;
select*from employees E full outer join job_history J on E.employee_id=J.employee_id;
select*from employees E full outer join job_history J on E.hire_date=J.start_date;
select*from employees E full outer join job_history J on J.job_id=E.job_id;

--self join
--it is a regular join but tha table is joined with itself
--Alies  mandatory
select*from employees;
select*from employees E join employees J on e.employee_id=J.employee_id;
select*from employees E join employees J on E.employee_id=J.department_id;
select*from employees E join employees J on E.manager_id=J.employee_id;

     */
}
