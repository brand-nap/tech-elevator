-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)

INSERT INTO genre (genre_id, genre_name)
VALUES (7, 'Sports');

INSERT INTO movie_genre (movie_id, genre_id)
SELECT movie_id, 7
FROM movie
WHERE title = 'Coach Carter';