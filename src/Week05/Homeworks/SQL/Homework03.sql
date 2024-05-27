--Mission 1:
SELECT * FROM country
WHERE country LIKE 'A%a';
--Mission 2:
SELECT * FROM country
WHERE country LIKE '_____%n';
--Mission 3:
SELECT title FROM film
WHERE title ILIKE '%t%t%t%t%';
--Mission 4:
SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;
