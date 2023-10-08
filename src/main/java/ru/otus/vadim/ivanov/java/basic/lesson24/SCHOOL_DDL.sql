--создаем структуру БД
create database school;

-- таблица с тестами
CREATE TABLE school.tests (
 id serial4 NOT NULL,
 subject varchar(250) NOT NULL,
 course int4 NOT NULL,
 description varchar(1000),
 CONSTRAINT tests_pk PRIMARY KEY(id)
);

--таблица с вопросами в тестах
CREATE TABLE school.questions (
 id serial4 NOT NULL,
 question varchar(2500) NOT NULL,
 complexity int4 NOT NULL,
 test_id int4 NOT NULL,
 CONSTRAINT questions_pk PRIMARY KEY(id)
);

--таблица с ответами
CREATE TABLE school.answers (
 id serial4 NOT NULL,
 answer varchar(2500) NOT NULL,
 is_true bool NOT NULL,
 question_id int4 NOT NULL,
 CONSTRAINT answers_pk PRIMARY KEY(id)
);

ALTER TABLE school.questions
ADD CONSTRAINT questions_fk FOREIGN KEY (test_id) REFERENCES school.tests(id)
ON DELETE CASCADE;

ALTER TABLE school.answers
ADD CONSTRAINT answers_fk FOREIGN KEY (question_id) REFERENCES school.questions(id)
ON DELETE CASCADE;