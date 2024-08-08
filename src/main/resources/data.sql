delete from address;
delete from employee;


insert into address(city, street) values ('Vitebsk', 'Pobedy st.');
insert into address(city, street) values ('Vitebsk', 'Moskow st.');
insert into address(city, street) values ('Minsk', 'Pobediteley st.');
insert into address(city, street) values ('Vitebsk', 'Stroiteley st.');

insert into employee(first_name, last_name, age, address_id) values ('Ivan', 'Ivanov', 20, 1);
insert into employee(first_name, last_name, age, address_id) values ('Petr', 'Petrov', 21, 2);
insert into employee(first_name, last_name, age, address_id) values ('John', 'Petrov', 21, 3);

insert into person(first_name, last_name) values ('John', 'Smith');
insert into person(first_name, last_name) values ('Jane', 'Smith');

insert into passport(number, country, person_id) values ('BM2013483', 'BY', 1);
insert into passport(number, country, person_id) values ('BM2012383', 'BY', 2);

insert into phone(number) values ('111');
insert into phone(number) values ('222');

insert into subscriber (first_name, last_name) values ('John', 'Doe');
insert into subscriber (first_name, last_name) values ('Jane', 'Deer');

UPDATE phone SET subscriber_id = 1 WHERE id = 1;
UPDATE phone SET subscriber_id = 1 WHERE id = 2;

insert into author (name) values ('Stephen King');
insert into author (name) values ('Mark Twain');
insert into author (name) values ('Marcel Proust');
insert into book(title, isbn) values ('11/22/63: A Novel', '0019034210');
insert into book(title, isbn) values ('Doctor Sleep: A Novel', '0019034211');
insert into book(title, isbn) values ('In Search of Lost Time', '0019034212');

insert into book_authors(book_id, author_id) values (1, 1);
insert into book_authors(book_id, author_id) values (1, 2);
insert into book_authors(book_id, author_id) values (2, 2);


