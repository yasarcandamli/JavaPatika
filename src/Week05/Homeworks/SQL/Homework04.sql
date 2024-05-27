--Mission 1:
SELECT DISTINCT replacement_cost FROM film;
--Mission 2:
SELECT COUNT (DISTINCT replacement_cost) FROM film;
--Mission 3:
SELECT COUNT (title) FROM film
WHERE title LIKE 'T%' AND rating = 'G';
--Mission 4:
SELECT COUNT (country) FROM country
WHERE country LIKE '_____';
--Mission 5:
SELECT COUNT (city) FROM city
WHERE city ILIKE '%R'
