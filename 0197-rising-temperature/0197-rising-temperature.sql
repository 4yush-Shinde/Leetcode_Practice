SELECT w1.id as Id
FROM Weather w1
JOIN Weather w2
ON w1.recordDate - INTERVAL 1 DAY = w2.recordDate
WHERE w1.temperature > w2.temperature;