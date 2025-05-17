CREATE TABLE IF NOT EXISTS books
(
    book_id    SERIAL PRIMARY KEY,
    user_id    INT,
    book_title VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);

INSERT INTO books(user_id, book_title)
VALUES ( 2, 'Andersons tales'),
       ( 2, 'Anna Karenina'),
       ( 1, 'The Chronicles of Narnia'),
       ( 1, 'Walking through the torments');

