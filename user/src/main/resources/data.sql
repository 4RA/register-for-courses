
INSERT INTO STUDENT (ID, STUDENT_ID, PASSWORD, NAME, EMAIL, MAJOR, GRADE, SEMESTER, CREDIT, ACTIVATED)
VALUES (1, '2022111111', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', '죠르디', 'jordy@jordy.co', '영어영문학과', 4, 2, 0, 1);

INSERT INTO AUTHORITY (AUTHORITY_NAME) values ('ROLE_USER');
INSERT INTO AUTHORITY (AUTHORITY_NAME) values ('ROLE_PROFESSOR');
INSERT INTO AUTHORITY (AUTHORITY_NAME) values ('ROLE_ADMIN');

INSERT INTO USER_AUTHORITY (ID, AUTHORITY_NAME) values (1, 'ROLE_USER');