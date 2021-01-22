-- use springboot;
--parent table
insert into `friend`(id,`first_name`,`last_name`) values
(101,'aswini','kumar'),
(102,'pankaj','prajapati');

-- child table
insert into `address`(id,`city`,`state`,`country`,`category`,`friend_id`) values
(101,'Gorakhpur','up', 'india','permanent',101),
(102,'Bangalore', 'Karnataka', 'india','present',101),
(103,'Varanasi','up','india','permanent',102),
(104,'Chennai','Tamilnadu', 'india','present',102);

commit;