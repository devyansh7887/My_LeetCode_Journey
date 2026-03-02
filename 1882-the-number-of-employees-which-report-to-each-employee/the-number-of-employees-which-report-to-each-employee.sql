SELECT 
    m.employee_id,
    m.name,
    COUNT(n.employee_id) reports_count,
    ROUND(AVG(n.age)) average_age
FROM Employees m
JOIN Employees n
    ON m.employee_id = n.reports_to
GROUP BY
    m.employee_id, m.name
ORDER BY 
    m.employee_id;