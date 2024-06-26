--Mission 1:
SELECT ROUND (AVG (rental_rate), 2) FROM film;

--Mission 2:
SELECT COUNT (*) FROM film
WHERE title LIKE 'C%';

--Mission 3:
SELECT MAX (length) FROM film
WHERE rental_rate = 0.99;

--Mission 4:
SELECT COUNT (DISTINCT (replacement_cost)) FROM film
WHERE length > 150;

