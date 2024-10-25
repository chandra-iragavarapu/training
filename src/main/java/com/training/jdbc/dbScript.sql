use training;

CREATE TABLE `employee_jdbc` (                                                                                      
                 `id` BIGINT NOT NULL AUTO_INCREMENT,                                                                              
                 `name` VARCHAR(100) DEFAULT NULL,                                                                                 
                 `email` VARCHAR(100) DEFAULT NULL,                                                                                
                 `mobile` VARCHAR(15) DEFAULT NULL,                                                                                
                 PRIMARY KEY (`id`)                                                                                                
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC