# Write your MySQL query statement below
SELECT 'Low Salary' AS category,
    SUM(CASE WHEN income<20000 THEN 1 ELSE 0 END) accounts_count
FROM accounts
 
UNION ALL

SELECT 'Average Salary' AS category,
    SUM(CASE WHEN income>=20000 AND income <=50000 THEN 1 ELSE 0 END) accounts_count
FROM accounts

UNION ALL

SELECT 'High Salary' AS category,
    SUM(CASE WHEN income>50000 THEN 1 ELSE 0 END) accounts_count
FROM accounts;