# Write your MySQL query statement below
select name as Customers
from Customers cs
left join Orders os
on cs.id=os.customerId
where os.customerId is null;