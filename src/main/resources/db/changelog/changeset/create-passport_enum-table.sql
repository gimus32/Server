CREATE TYPE passport_enum AS ENUM (
    'RUSSIAN',
    'AMERICAN',
    'GERMAN',
    'FRENCH',
    'JAPANESE',
    'CHINESE',
    'INDIAN',
    'BRAZILIAN',
    'CANADIAN',
    'AUSTRALIAN'
    );

CREATE TABLE users1
(
    id       SERIAL PRIMARY KEY,
    user_id   INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    passport passport_enum NOT NULL

);

INSERT INTO users1(user_id, passport)
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
