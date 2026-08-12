-- Last updated: 12/08/2026, 12:17:24
# Write your MySQL query statement below
SELECT 
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;