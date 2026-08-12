-- Last updated: 12/08/2026, 12:17:20
SELECT
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;