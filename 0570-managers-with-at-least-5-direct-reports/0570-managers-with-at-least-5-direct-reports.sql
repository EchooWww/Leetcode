# Write your MySQL query statement below
SELECT M.name FROM Employee M
JOIN (SELECT COUNT(id) as reports, managerId
                    FROM Employee E
                    GROUP BY managerId) AS subquery
ON M.id = subquery.managerID
WHERE subquery.reports >= 5;