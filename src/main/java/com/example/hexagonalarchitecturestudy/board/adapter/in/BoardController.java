package com.example.hexagonalarchitecturestudy.board.adapter.in;

import com.example.hexagonalarchitecturestudy.board.application.port.command.RegisterBoardCommand;
import com.example.hexagonalarchitecturestudy.board.application.port.in.GetBoardQuery;
import com.example.hexagonalarchitecturestudy.board.application.port.in.RegisterBoardUseCase;
import com.example.hexagonalarchitecturestudy.board.domain.Board;
import com.example.hexagonalarchitecturestudy.common.WebAdapter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RequestMapping("/api/v1/board")
@RestController
public class BoardController {

    private final GetBoardQuery getBoardQuery;

    private final RegisterBoardUseCase registerBoardUseCase;

    public BoardController(GetBoardQuery getBoardQuery,
                           RegisterBoardUseCase registerBoardUseCase) {
        this.getBoardQuery = getBoardQuery;
        this.registerBoardUseCase = registerBoardUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Board>> getBoard() {
        List<Board> boardList = getBoardQuery.getBoardList();
        return ResponseEntity.ok(boardList);
    }

    @PostMapping
    public ResponseEntity<String> registerBoard(@RequestBody RegisterBoardCommand registerBoardCommand) {
        registerBoardUseCase.registerBoard(registerBoardCommand);
        return ResponseEntity.ok("ok");
    }

}
