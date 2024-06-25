package com.example.hexagonalarchitecturestudy.board.application.port.service;


import com.example.hexagonalarchitecturestudy.board.application.port.command.RegisterBoardCommand;
import com.example.hexagonalarchitecturestudy.board.application.port.in.RegisterBoardUseCase;
import com.example.hexagonalarchitecturestudy.board.application.port.out.RegisterBoardPort;
import com.example.hexagonalarchitecturestudy.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

@UseCase
@Transactional(readOnly = false)
public class RegisterBoardService implements RegisterBoardUseCase {

    private final RegisterBoardPort registerBoardPort;

    public RegisterBoardService(RegisterBoardPort registerBoardPort) {
        this.registerBoardPort = registerBoardPort;
    }

    @Override
    public void registerBoard(RegisterBoardCommand registerBoardCommand) {
        registerBoardPort.registerBoard(registerBoardCommand);
    }

}
