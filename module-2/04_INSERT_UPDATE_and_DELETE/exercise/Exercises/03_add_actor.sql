-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)

INSERT INTO movie_actor (movie_id, actor_id)
SELECT movie_id, 7036
FROM movie
WHERE title = 'Back to the Future';