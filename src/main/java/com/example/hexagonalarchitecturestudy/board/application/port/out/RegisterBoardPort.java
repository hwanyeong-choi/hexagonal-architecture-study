package com.example.hexagonalarchitecturestudy.board.application.port.out;

import com.example.hexagonalarchitecturestudy.board.application.port.command.RegisterBoardCommand;
import com.example.hexagonalarchitecturestudy.board.domain.Board;

public interface RegisterBoardPort {

    void registerBoard(RegisterBoardCommand registerBoardCommand);

}
