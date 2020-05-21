package SQL;

public class day2 {
    /*
    --Arithmetic Operators
-- >,<,<=,=>,=,!=(<>) not equals,or,and
    select*from employees where salary>5000;
    select*from employees where department_id<100;
    select*from employees where employee_id<=120;
    select*from employees where employee_id>=90;
    select*from employees where employee_id=90;
    select*from employees where manager_id!=100;
    select*from employees where manager_id<>100;
    select first_name,last_name from employees where first_name='David' and last_name='Austin';
    select*from employees where manager_id=100 or manager_id=121;

--distinct=it used to return unique or different value, mean no duplicate
    select first_name from employees;--107 names
    select distinct first_name from employees;--91 names
    select salary from employees;--107 salary
    select distinct salary from employees;--58 salary
    select count(distinct salary) from employees;--count number of distinct salary
    select distinct salary from employees where salary>10000;
    select count(distinct salary) from employees where salary>10000;

--Null or not Null
    select*from employees;
    select*from employees where manager_id is null;
    select*from employees where department_id is null;
    select first_name,last_name,commission_pct from employees where commission_pct is null;
    select*from employees where commission_pct is not null;

--Order By=is used to sort the result-set in ascending(increase) or descending(decrease) order
    select*from employees order by first_name desc;
    select*from employees order by salary asc;
    select last_name,hire_date from employees order by hire_date asc;

--Aggragetes==>min,max,avg,count,sum
    select min(salary) from employees;
    select max(salary) from employees;
    select sum(salary) from employees;
    select count(salary) from employees;
    select avg(salary) from employees;
    select round(avg(salary)) from employees;
    select round(avg(salary),3) from employees;
--round==>we can get rid of decimals by using round keyword
--find first,second,third ...... max salary
    select max(salary) from employees;
    select distinct salary from employees order by salary desc;
    select max(salary)from employees where salary<(select max(salary) from employees);--second salary
    select max(salary) from employees where salary!=(select max(salary) from employees);--second salary
--query within another query is called subquery
    select max(salary)from employees where salary<(select max(salary) from employees where salary<(select max(salary) from employees));--third salary
    select max(salary)from employees where salary<(select max(salary) from employees where salary<(select max(salary) from employees where salary<(select max(salary) from employees)));--fourth salary
--second way
    select min(salary) from(select distinct salary from employees order by salary desc)where rownum<13;
    select first_name,last_name,salary from employees where salary=(select min(salary) from(select distinct salary from employees order by salary desc)where rownum<13);
--third way
    SELECT * FROM ( SELECT DISTINCT salary,
                    DENSE_RANK() OVER(
    ORDER BY salary DESC) ranking
    FROM employees )
    WHERE ranking = 12;

--Group By==it used generally with aggragetion functions
    SELECT first_name,max(salary) from employees group by first_name;--we can not use max(salary) after group by
--SELECT first_name,max(salary) from employees group by max(salary);--group function is not allowed here
    select employee_id,avg(salary) from employees group by employee_id order by employee_id desc;
    select employee_id,avg(salary) from employees group by employee_id order by avg(salary) desc;--we can use max(salary) after order by

--Having==>Where clause could not be use with aggragetes functions that is why having was add to SQL
    select employee_id,min(salary)from employees group by employee_id having employee_id>100;
    select employee_id,max(salary)from employees group by employee_id having employee_id>100 order by employee_id desc;
    select employee_id,max(salary)from employees group by employee_id having max(salary)=10000 order by employee_id desc;
    select first_name,min(salary)from employees group by first_name having first_name='Alexander';
*/
}
