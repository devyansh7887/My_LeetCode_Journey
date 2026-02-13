# Write your MySQL query statement below
select p.project_id, Round(IFNULL(AVG(experience_years),0),2) average_years
from project p left join employee e
on p.employee_id = e.employee_id
group by p.project_id;