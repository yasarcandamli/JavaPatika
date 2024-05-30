--1. film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
SELECT COUNT (length)
FROM film
WHERE length >
(
	SELECT AVG (length)
	FROM film
);

--2. film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
SELECT COUNT (rental_rate)
FROM film
WHERE rental_rate =
(
	SELECT MAX (rental_rate)
	FROM film
);

--3. film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
SELECT *
FROM film
WHERE
rental_rate =
(
	SELECT MIN (rental_rate)
	FROM film
)
AND
replacement_cost =
(
	SELECT MIN (replacement_cost)
	FROM film
);

--4. payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
--(ilk 5'i sıraladım, HAVING COUNT... olan kısmı çıkarsak da aynı sonucu alırız, ANY kullanmış olmak için o kısmı ekledim.)
SELECT customer_id, COUNT (*) AS number_of_shopping
FROM payment
GROUP BY customer_id
HAVING COUNT(*) >= ANY
(
	SELECT COUNT (*)
	FROM payment
	GROUP BY customer_id
)
ORDER BY number_of_shopping DESC
LIMIT 5;