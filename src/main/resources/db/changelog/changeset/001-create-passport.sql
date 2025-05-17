CREATE TABLE IF NOT EXISTS passport
(
    id       SERIAL PRIMARY KEY,
    user_id   INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    passport VARCHAR(50) NOT NULL
);

INSERT INTO passport(user_id, passport)
VALUES (1, 'RUSSIAN'),
       (1, 'GERMAN'),
       (3, 'AMERICAN'),
       (2, 'CHINESE'),
       (3, 'FRENCH'),
       (4, 'JAPANESE'),
       (4, 'CANADIAN'),
       (2, 'BRAZILIAN'),
       (1, 'INDIAN'),
       (2, 'AUSTRALIAN');
