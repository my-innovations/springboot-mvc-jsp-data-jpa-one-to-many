-- use springboot;
--parent table
insert into `friend`(id,`first_name`,`last_name`) values
(101,'Aswini','Kumar'),
(102,'Pankaj Kumar','Prajapati');

-- child table
insert into `address`(id,`city`,`state`,`country`,`category`,`friend_id`) values
(1001,'Gorakhpur','UP', 'India','Permanent',101),
(1002,'Bangalore', 'KR', 'India','Present',101),
(1003,'Varanasi','up','India','Permanent',102),
(1004,'Chennai','Tamilnadu', 'India','Present',102),
(1005,'New Delhi','Delhi', 'India','Present2',102);

commit;