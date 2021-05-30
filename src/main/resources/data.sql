-- use springboot;
--parent table
insert into `friend`(id,`first_name`,`last_name`) values
(frnd_sequence.nextval,'Aswini','Kumar'),
(frnd_sequence.nextval,'Pankaj Kumar','Prajapati');

-- child table
insert into `address`(id,`city`,`state`,`country`,`category`,`friend_id`) values
(addr_sequence.nextval,'Gorakhpur','UP', 'India','Permanent',1),
(addr_sequence.nextval,'Bangalore', 'KR', 'India','Present',1),
(addr_sequence.nextval,'Varanasi','up','India','Permanent',2),
(addr_sequence.nextval,'Chennai','Tamilnadu', 'India','Present',2),
(addr_sequence.nextval,'New Delhi','Delhi', 'India','Present2',2);

commit;