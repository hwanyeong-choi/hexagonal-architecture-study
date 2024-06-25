package com.example.hexagonalarchitecturestudy.board.application.port.out;

import com.example.hexagonalarchitecturestudy.board.domain.Board;

import java.util.List;

public interface LoadBoardPort {

    List<Board> loadBoardList();

}
