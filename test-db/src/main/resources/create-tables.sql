DROP TABLE IF EXISTS book;
CREATE TABLE book (
                            bookId INT NOT NULL AUTO_INCREMENT,
                            bookTitle VARCHAR(255) NOT NULL UNIQUE,
                            bookAuthor VARCHAR(255) NOT NULL,
                            genreId INT NOT NULL,
                            quantity INT NOT NULL,
                            booksOnHands INT NOT NULL,
                            booksInHall INT NOT NULL,
                            lastIssueDate DATE,
                            PRIMARY KEY (bookId)
)