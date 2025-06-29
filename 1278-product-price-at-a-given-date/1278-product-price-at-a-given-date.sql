# Write your MySQL query statement below
WITH PriceOnDate AS (
    SELECT 
        product_id,
        new_price,
        change_date
    FROM Products
    WHERE change_date <= '2019-08-16'
)
, LatestChange AS (
    SELECT 
        product_id,
        MAX(change_date) AS last_change_date
    FROM PriceOnDate
    GROUP BY product_id
)
SELECT 
    p.product_id,
    COALESCE(pc.new_price, 10) AS price
FROM (SELECT DISTINCT product_id FROM Products) p
LEFT JOIN LatestChange lc ON p.product_id = lc.product_id
LEFT JOIN PriceOnDate pc ON lc.product_id = pc.product_id AND lc.last_change_date = pc.change_date;
