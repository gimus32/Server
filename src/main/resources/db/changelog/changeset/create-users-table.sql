
CREATE TABLE users
(
    user_id    SERIAL PRIMARY KEY,
    user_name  VARCHAR(255),
    user_pass  VARCHAR(255),
    user_age   INT,
    user_email VARCHAR(255),
    user_phone VARCHAR(28)
);


INSERT INTO users(user_name, user_pass, user_age, user_email, user_phone)
VALUES ('Nikita', '8984', '13', 'nikitarussia27@gmail.com', '89995550323'),
       ('Alexey', '7956', '15', 'nikitarussia27@gmail.com', '89047573734'),
       ('Sergey', '4567', '22', 'nikitarussia27@gmail.com', '89080880782'),
       ('Vovan', '3224', '43', 'nikitarussia27@gmail.com', '89954321221'),
       ('Fedya', '7689', '67', 'nikitarussia27@gmail.com', '89062343221');
