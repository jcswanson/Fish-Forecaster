INSERT IGNORE INTO `fishforecast`.`user` (`id`, `username`, `password`, `cellphone`, `email`) VALUES ('1', 'john', '$2a$10$xn3LI/AjqicFYZFruSwve.681477XaVNaUQbr1gioaWPn4t1KsnmG', '3107219009', 'jcs@aol.com');

INSERT IGNORE INTO `fishforecast`.`authority` (`id`, `name`, `user`) VALUES ('1', 'READ', '1');
INSERT IGNORE INTO `fishforecast`.`authority` (`id`, `name`, `user`) VALUES ('2', 'WRITE', '1');