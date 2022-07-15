DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
	`id` BIGINT AUTO_INCREMENT,
	`product_name` VARCHAR(255) NOT NULL,
	`product_price` DOUBLE NOT NULL,
	`product_type` VARCHAR(255) NOT NULL,
	`product_colour` VARCHAR(255) NOT NULL,
	 PRIMARY KEY(`id`)
);

