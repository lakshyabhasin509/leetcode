# Write your MySQL query statement below


select a.name as Employee
from 
    Employee as a,
    Employee as b
    
where (a.salary > b.salary and a.managerId=b.id);