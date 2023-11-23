SELECT * FROM books_schema.books;
INSERT INTO users(first_name,last_name)
values("jane","amsden"),
("emily","dixon"),
("theodore","dostovsky"),
("william","shapiro"),
("liu","xiu");
SELECT * FROM books_schema.books;
INSERT INTO books_schema.books (title,num_of_pages)
VALUES("C sharp",250),
("java",230),
("python",150),
("php",200),
("ruby",100);

UPDATE books SET title="c#" WHERE id=1;
UPDATE users SET first_name="bill" WHERE id=4; 

INSERT INTO favourites (user_id,book_Id)
values(1,1),
	(1,2);
INSERT INTO favourites(user_id,book_Id)
VALUES (2,1),
(2,2),
(2,3);
INSERT INTO favourites(user_id,book_Id)
VALUES(3,1),
(3,2),
(3,3),
(3,4);
INSERT INTO favourites(user_id,book_Id)
VALUES(4,1),
(4,2),
(4,3),
(4,4),
(4,5);
SELECT * FROM users 
join favourites on favourites.user_id=users.id 
join books on books.Id=favourites.book_Id
where books.Id=3;

DELETE FROM favourites WHERE book_id=3  LIMIT 1;

INSERT INTO favourites (user_id,book_Id)
VALUES(5,2);
SELECT * FROM books
join favourites on books.id=favourites.book_Id 
where user_id=3;
SELECT * FROM users 
join favourites on users.id=favourites.user_id
where book_Id=5;

