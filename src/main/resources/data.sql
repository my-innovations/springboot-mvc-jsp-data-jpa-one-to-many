-- use springboot;
--parent table
insert into `friend`(id,`first_name`,`last_name`) values
(101,'aswini','kumar'),
(102,'pankaj','prajapati');

-- child table
insert into `address`(id,`city`,`state`,`country`,`category`,`friend_id`) values
(1001,'Gorakhpur','up', 'india','permanent',101),
(1002,'Bangalore', 'Karnataka', 'india','present',101),
(1003,'Varanasi','up','india','permanent',102),
(1004,'Chennai','Tamilnadu', 'india','present',102),
(1005,'New Delhi','Delhi', 'india','present2',102);

commit;