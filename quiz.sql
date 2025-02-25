create database Quiz;
use Quiz;

INSERT INTO quizquestion (question, correct_answer) VALUES
	('What is the default boolean value in java? ','false'),
    ('Which of these is not features of java?','Use Pointer'),
    ('What does JVM stands for?','Java Virtual Machine'),
    ('Which is the valid declaration of char','char ch = ''c'';'),
    ('What is the size of int variable in java','32bits');
    
INSERT INTO question_options(option_text, question_id) VALUES
	('true',1),
    ('false',1),
    ('null',1),
    (0,1);
    
INSERT INTO question_options(option_text, question_id) VALUES
	('use function',2),
    ('use method',2),
    ('Use Pointer',2),
    ('not used anything',2);
    
INSERT INTO question_options(option_text, question_id) VALUES
	('java vital machine',3),
    ('java aapki mchine',3),
    ('Java Virtual Machine',3),
    (0,3);
    
INSERT INTO question_options(option_text, question_id) VALUES
	('char ch = ''c'';',4),
    ('char ch = ''cd'';',4),
    ('String ss = "ganpat"',4),
    (0,4);

INSERT INTO question_options(option_text, question_id) VALUES
	('32bits',5),
    ('64bits',5),
    ('128bits',5),
    (0,5);
    
    drop database quiz;
    
    select * from quizquestion;
    
    select * from question_options;