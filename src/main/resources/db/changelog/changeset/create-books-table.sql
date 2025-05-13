CREATE TABLE books
(
    book_id    SERIAL PRIMARY KEY,
    user_id    INT,
    book_title VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);

INSERT INTO books(book_id, user_id, book_title)
VALUES (1, 2, 'Andersons tales'),
       (2, 2, 'Anna Karenina'),
       (3, 1, 'The Chronicles of Narnia'),
       (4, 1, 'Walking through the torments');

