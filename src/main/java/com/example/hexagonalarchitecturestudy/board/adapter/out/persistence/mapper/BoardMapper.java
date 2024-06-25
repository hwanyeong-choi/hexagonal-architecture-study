package com.example.hexagonalarchitecturestudy.board.adapter.out.persistence.mapper;

import com.example.hexagonalarchitecturestudy.board.adapter.out.persistence.entity.BoardEntity;
import com.example.hexagonalarchitecturestudy.board.application.port.command.RegisterBoardCommand;
import com.example.hexagonalarchitecturestudy.board.domain.Board;
import org.springframework.stereotype.Component;

@Component
public class BoardMapper {

    public Board mapToEntityDomain(BoardEntity boardEntity) {
        return Board
                .builder()
                .boardId(boardEntity.getBoardId())
                .title(boardEntity.getTitle())
                .author(boardEntity.getAuthor())
                .description(boardEntity.getDescription())
                .build();
    }

    public BoardEntity mpToDomainEntity(Board board) {
        return BoardEntity
                .builder()
                .boardId(board.getBoardId())
                .title(board.getTitle())
                .author(board.getAuthor())
                .description(board.getDescription())
                .build();
    }

    public BoardEntity mapToCommandEntity(RegisterBoardCommand registerBoardCommand) {
        return BoardEntity
                .builder()
                .title(registerBoardCommand.getTitle())
                .author(registerBoardCommand.getAuthor())
                .description(registerBoardCommand.getDescription())
                .build();
    }

}
