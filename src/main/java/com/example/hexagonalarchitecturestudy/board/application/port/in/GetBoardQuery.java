package com.example.hexagonalarchitecturestudy.board.application.port.in;

import com.example.hexagonalarchitecturestudy.board.domain.Board;

import java.util.List;

public interface GetBoardQuery {

    List<Board> getBoardList();

}
