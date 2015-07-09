ALTER TABLE `temp`.`employeeinfo` 
CHANGE COLUMN `id` `roleId` INT(11) NOT NULL COMMENT '' ;
CREATE TABLE `temp`.`familyrole` (
  `idFamilyRole` INT NOT NULL COMMENT '',
  `familyroletype` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`idFamilyRole`)  COMMENT '');

  INSERT INTO `temp`.`familyrole` (`idFamilyRole`, `familyroletype`) VALUES ('1', 'FATHER');
INSERT INTO `temp`.`familyrole` (`idFamilyRole`, `familyroletype`) VALUES ('2', 'SON');
INSERT INTO `temp`.`familyrole` (`idFamilyRole`, `familyroletype`) VALUES ('3', 'NEPHEW');
INSERT INTO `temp`.`familyrole` (`idFamilyRole`, `familyroletype`) VALUES ('4', 'GRANDSON');
INSERT INTO `temp`.`familyrole` (`idFamilyRole`, `familyroletype`) VALUES ('5', 'MOTHER');
