# Write your MySQL query statement below
SELECT name, Bonus FROM Employee e LEFT JOIN BONUS b
ON e.empId = b.empid
WHERE bonus < 1000
OR bonus is null;
