package com.example.hexagonalarchitecturestudy.board.application.service;

import com.example.hexagonalarchitecturestudy.board.application.port.command.RegisterBoardCommand;
import com.example.hexagonalarchitecturestudy.board.application.port.in.RegisterBoardUseCase;
import com.example.hexagonalarchitecturestudy.board.application.port.out.LoadBoardPort;
import com.example.hexagonalarchitecturestudy.board.domain.Board;
import com.example.hexagonalarchitecturestudy.board.application.port.in.GetBoardQuery;
import com.example.hexagonalarchitecturestudy.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@UseCase
@Transactional(readOnly = true)
public class LoadBoardService implements GetBoardQuery {

    private final LoadBoardPort loadBoardPort;

    public LoadBoardService(LoadBoardPort loadBoardPort) {
        this.loadBoardPort = loadBoardPort;
    }

    @Override
    public List<Board> getBoardList() {
        return loadBoardPort.loadBoardList();
    }
}
