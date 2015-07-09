CREATE TABLE `temp`.`employeeinfo` (
  `id` INT NOT NULL COMMENT '',
  `firstname` VARCHAR(45) NULL COMMENT '',
  `lastname` VARCHAR(45) NULL COMMENT '',
  `emailId` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');
  
INSERT INTO `temp`.`employeeinfo` (`id`, `firstname`, `lastname`, `emailId`) VALUES ('1', 'John', 'Kim', 'Jk@muleDev.edu');
INSERT INTO `temp`.`employeeinfo` (`id`, `firstname`, `lastname`, `emailId`) VALUES ('2', 'Sam', 'Hooster', 'SH@muleDev.edu');
INSERT INTO `temp`.`employeeinfo` (`id`, `firstname`, `lastname`, `emailId`) VALUES ('3', 'Brad', 'West', 'BW@muleDev.edu');
INSERT INTO `temp`.`employeeinfo` (`id`, `firstname`, `lastname`, `emailId`) VALUES ('4', 'George', 'Wilson', 'GW@muleDev.edu');
INSERT INTO `temp`.`employeeinfo` (`id`, `firstname`, `lastname`, `emailId`) VALUES ('5', 'Samanatha', 'Nikson', 'SN@muleDev.edu');
commit;