
CREATE TABLE board (
    board_id BIGINT AUTO_INCREMENT,
    title TEXT NOT NULL,
    author VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    PRIMARY KEY (board_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
