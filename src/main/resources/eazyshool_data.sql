INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
 VALUES (' JAN 26 ','Republic Day','FESTIVAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
 VALUES (' FEB 14 ','MahaShivRatri','FESTIVAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
 VALUES (' MARCH 02 ','Holi','FESTIVAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
 VALUES (' APRIL 05 ','Shri Ram Navami','FESTIVAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
 VALUES (' AUG 15 ','Independance Day','FESTIVAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
  VALUES (' OCT 18 ','DIWALI','FESTIVAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
 VALUES (' OCT 05 ','Valmiki Jayanti','FEDERAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
 VALUES (' NOV 04 ','GuruNanakJayanti','FEDERAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
 VALUES (' DEC 25 ','Christmas','FEDERAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
  VALUES (' MARCH 30','Good Friday','FEDERAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
  VALUES (' MAY 10 ','Buddha Pornima','FEDERAL',CURDATE(),'DBA');

INSERT INTO `holidays` (`day`,`reason`,`type`,`created_at`, `created_by`)
  VALUES (' AUG 07 ','RakashaBandhan','FEDERAL',CURDATE(),'DBA');

INSERT INTO `roles` (`role_name`,`created_at`, `created_by`)
    VALUES ('ADMIN',CURDATE(),'DBA');

INSERT INTO `roles` (`role_name`,`created_at`, `created_by`)
    VALUES ('STUDENT',CURDATE(),'DBA');

INSERT INTO `person` (`name`,`email`,`mobile_number`,`pwd`,`role_id`,`created_at`, `created_by`)
  VALUES ('Admin','admin@eazyschool.com','3443434343','admin', 1 ,CURDATE(),'DBA');