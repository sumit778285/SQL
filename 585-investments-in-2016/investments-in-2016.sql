# Write your MySQL query statement below
WITH DuplicateTIV AS (
    SELECT
        tiv_2015
    FROM Insurance
    GROUP BY tiv_2015
    HAVING COUNT(*) > 1
),
UniqueLocation AS (
    SELECT
        pid,
        tiv_2015,
        tiv_2016
    FROM Insurance
    GROUP BY lat, lon
    HAVING COUNT(*) = 1
)
SELECT 
    ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM UniqueLocation ul
JOIN DuplicateTIV dt
ON ul.tiv_2015 = dt.tiv_2015;
