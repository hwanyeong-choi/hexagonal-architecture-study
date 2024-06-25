package com.example.hexagonalarchitecturestudy.board.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "board")
public class BoardEntity {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long boardId;

    @Column(name = "title")
    String title;

    @Column(name = "author")
    String author;

    @Column(name = "description", columnDefinition = "TEXT")
    String description;

    @Builder
    public BoardEntity(long boardId,
                       String title,
                       String author,
                       String description) {
        this.boardId = boardId;
        this.title = title;
        this.author = author;
        this.description = description;
    }
}
