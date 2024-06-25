package com.example.hexagonalarchitecturestudy.board.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Board {

    long boardId;

    String title;

    String author;

    String description;

    @Builder
    public Board(long boardId,
                 String title,
                 String author,
                 String description) {
        this.boardId = boardId;
        this.title = title;
        this.author = author;
        this.description = description;
    }

}
