INSERT INTO sample_schema.account (email, password, user_name) VALUES
('mng@hoge', 'mngpass', 'manager'),
('user1@hoge', 'user1pass', 'MR.user1'),
('user2@hoge', 'user2pass', 'MR.user2')
;

INSERT INTO sample_schema.users (email, password, first_name, last_name, birthdate, phone) VALUES
('user1@local', 'user1pass', 'Amir', 'aaa', '2000/01/01', '888-888-888'),
('user2@local', 'user2pass', 'Hiro', 'bbb', '2000/01/01', '888-888-888'),
('user3@local', 'user3pass', 'Yuki', 'ccc', '2000/01/01', '888-888-888');

INSERT INTO sample_schema.doctor_schedules (doctor_uuid, time) VALUES
(1, '2000/01/01 10:00:00'),
(1, '2000/01/01 10:15:00'),
(1, '2000/01/01 10:30:00');

INSERT INTO sample_schema.doctors (name) VALUES ('Prabh'), ('Amir'), ('Hiro'), ('Yuki');
