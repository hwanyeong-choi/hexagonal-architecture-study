package com.example.hexagonalarchitecturestudy.board.application.port.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterBoardCommand {

    private String title;

    private String author;

    private String description;

}
