package com.example.hexagonalarchitecturestudy.board.adapter.out.persistence;

import com.example.hexagonalarchitecturestudy.board.adapter.out.persistence.entity.BoardEntity;
import com.example.hexagonalarchitecturestudy.board.adapter.out.persistence.mapper.BoardMapper;
import com.example.hexagonalarchitecturestudy.board.adapter.out.persistence.repository.BoardEntityRepository;
import com.example.hexagonalarchitecturestudy.board.application.port.command.RegisterBoardCommand;
import com.example.hexagonalarchitecturestudy.board.application.port.out.RegisterBoardPort;
import com.example.hexagonalarchitecturestudy.board.domain.Board;
import com.example.hexagonalarchitecturestudy.board.application.port.out.LoadBoardPort;
import com.example.hexagonalarchitecturestudy.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class BoardPersistenceAdapter implements LoadBoardPort, RegisterBoardPort {

    private final BoardEntityRepository boardEntityRepository;

    private final BoardMapper boardMapper;

    public BoardPersistenceAdapter(BoardEntityRepository boardEntityRepository,
                                   BoardMapper boardMapper) {
        this.boardEntityRepository = boardEntityRepository;
        this.boardMapper = boardMapper;
    }

    @Override
    public List<Board> loadBoardList() {
        return boardEntityRepository
                .findAll()
                .stream()
                .map(boardMapper::mapToEntityDomain)
                .toList();
    }

    @Override
    public void registerBoard(RegisterBoardCommand registerBoardCommand) {
        BoardEntity boardEntity = boardMapper.mapToCommandEntity(registerBoardCommand);
        boardEntityRepository.save(boardEntity);
    }
}
