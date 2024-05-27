CREATE TABLE IF NOT EXISTS `books` (
    `book_id` INT AUTO_INCREMENT PRIMARY KEY,
    `title` VARCHAR(255) NOT NULL UNIQUE,
    `genre` VARCHAR(255) NOT NULL,
    `author` VARCHAR(255) NOT NULL,
    `published_year` INT NOT NULL,
    `quantity_available` INT NOT NULL,
    `updated_at` date NOT NULL,
    `updated_by` VARCHAR(255) NOT NULL,
    `created_at` date NOT NULL,
    `created_by` VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS `authors` (
    `author_id` INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    `bio` TEXT NOT NULL,
    `country` VARCHAR(255) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `updated_by` VARCHAR(255) NOT NULL,
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `created_by` VARCHAR(255) NOT NULL
);