CREATE sequence user_table_seq increment 1 start 1;

CREATE TABLE user_table(
    id bigint PRIMARY KEY ,
    username varchar(255),
    email varchar(255),
    pasword varchar(255)
);