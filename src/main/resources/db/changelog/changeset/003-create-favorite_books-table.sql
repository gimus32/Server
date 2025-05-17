CREATE TABLE IF NOT EXISTS favorite_books
(
    favorite_book_id SERIAL PRIMARY KEY,
    user_id          INT,
    book_id          INT,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (book_id) REFERENCES books (book_id)
);

INSERT INTO favorite_books(user_id, book_id)
VALUES (3, 4),
       (3, 1),
       (3, 3),
       (1, 2);
