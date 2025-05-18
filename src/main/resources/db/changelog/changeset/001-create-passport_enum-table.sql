CREATE TYPE passport_enum AS ENUM (
    'RUSSIAN',
    'GERMAN',
    'AMERICAN',
    'CHINESE',
    'FRENCH',
    'JAPANESE',
    'CANADIAN',
    'BRAZILIAN',
    'INDIAN',
    'AUSTRALIAN'
);
CREATE TABLE IF NOT EXISTS passport
(
    id       SERIAL PRIMARY KEY,
    user_id   INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    passport passport_enum NOT NULL
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
