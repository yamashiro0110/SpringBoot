CREATE TABLE user (
    `user_id` BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100) NOT NULL,
    `created` DATETIME NOT NULL,
    `updated` DATETIME NOT NULL
);