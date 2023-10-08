--примеры использования

-- тесты
INSERT INTO school.tests
(subject,course,description)
VALUES('Астрономия',11,'Задание по курсу Астрономия');

INSERT INTO school.tests
(subject,course,description)
VALUES('Биология',7,'Задание по курсу общая Биология');

select *
 from school.tests;


--вопросы
INSERT INTO school.questions
(question,complexity,test_id)
VALUES('Какого расстояние от Земли до Солнца?',1,1);

INSERT INTO school.questions
(question,complexity,test_id)
VALUES('Как называется самый большой спутник Сатурна?',2,1);

INSERT INTO school.questions
(question,complexity,test_id)
VALUES('К какому классу живых существ относится человек?',1,2);

SELECT *
 FROM school.questions;

--ответы
INSERT INTO school.answers
(answer,is_true,question_id)
VALUES('100 000 км',false,1);

INSERT INTO school.answers
(answer,is_true,question_id)
VALUES('149,6 млн км',true,1);

INSERT INTO school.answers
(answer,is_true,question_id)
VALUES('2 астрономические единицы',false,1);

INSERT INTO school.answers
(answer,is_true,question_id)
VALUES('Титан',true,2);

INSERT INTO school.answers
(answer,is_true,question_id)
VALUES('Энцелад',false,2);

INSERT INTO school.answers
(answer,is_true,question_id)
VALUES('Млекопитающие',true,3);

INSERT INTO school.answers
(answer,is_true,question_id)
VALUES('Приматы',false,3);

SELECT *
 FROM school.answers;

--полная информация по тесту
SELECT
  t.*, q.*, a.*
  FROM school.tests t
  JOIN school.questions q ON t.id = q.test_id
  JOIN school.answers a ON q.id = a.question_id
WHERE t.id = 1;

--только верные ответы по курсу
SELECT
  t.*, q.* ,a.*
  FROM school.tests t
  JOIN school.questions q ON t.id = q.test_id
  JOIN school.answers a ON q.id = a.question_id
WHERE t.id = 1 and a.is_true is true;
