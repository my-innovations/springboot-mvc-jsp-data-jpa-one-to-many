create table friend (id bigint not null, first_name varchar(255), last_name varchar(255), primary key (id));
create table address (id bigint not null, category varchar(255), city varchar(255), country varchar(255), state varchar(255), friend_id bigint references friend(id), primary key (id));
create sequence frnd_sequence start with 1 increment by 1;
create sequence addr_sequence start with 1 increment by 1;