# Write your MySQL query statement below


select Distinct a.email as Email
from
    Person as a,
    Person as b
where (a.id != b.id and a.email=b.email);