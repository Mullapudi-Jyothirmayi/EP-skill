use csesql;
create table Employee10(emp_id int primary key,emp_name varchar(45),emp_dob varchar(20),emp_age varchar(45),emp_dep varchar(45),emp_desg varchar(20));
insert into Employee10 values(41,'raju','13-09-1996',25,'CSE','Professor');
insert into Employee10 values(42,'Hari','19-06-1980',41,'ECE','Asst.Professor');
insert into Employee10 values(43,'Giri','20-01-1995',26,'CSE','Asst.Professor');
insert into Employee10 values(44,'Ramu','17-07-1996',25,'CSE','Professor');
insert into Employee10 values(45,'Rahul','08-12-1995',26,'ECE','Professor');
insert into Employee10 values(46,'gopi','13-08-1979',42,'CSE','Asst.Professor');
insert into Employee10 values(47,'karthik','15-01-1987',34,'ME','Professor');
insert into Employee10 values(48,'gopal','06-12-1990',31,'EEE','Professor');
insert into Employee10 values(49,'dinesh','10-12-1991',30,'BT','Professor');
insert into Employee10 values(50,'suresh','25-03-1989',32,'BBA','Professor');
select * from Employee10;

insert into Employee10 (emp_id, emp_name, emp_dob, emp_age, emp_dep, emp_desg)
values (51, 'Anand','24-10-1995', 26, 'CSE', 'Asst.Professor');

update Employee10 set emp_name='Krishna' where emp_id=41;

delete from Employee10 where emp_name='suresh';

desc Employee10;

alter table Employee10 drop emp_age;

alter table Employee10 add emp_salary int;
insert into Employee10 (emp_salary) value(50000);