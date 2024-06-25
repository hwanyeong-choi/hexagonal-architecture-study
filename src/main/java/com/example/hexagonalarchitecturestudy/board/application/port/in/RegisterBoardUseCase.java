package com.example.hexagonalarchitecturestudy.board.application.port.in;

import com.example.hexagonalarchitecturestudy.board.application.port.command.RegisterBoardCommand;

public interface RegisterBoardUseCase {

    void registerBoard(RegisterBoardCommand registerBoardCommand);

}
