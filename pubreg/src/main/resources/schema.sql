CREATE TABLE IF NOT EXISTS Publisher (
    id SERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    email VARCHAR(180) NOT NULL,
    published INT NOT NULL
);

INSERT INTO Publisher(name,email,published)
VALUES ('Olumide Omololu','oaomololu@gmail.com',2);