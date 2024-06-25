package com.example.hexagonalarchitecturestudy.board.adapter.out.persistence.repository;

import com.example.hexagonalarchitecturestudy.board.adapter.out.persistence.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardEntityRepository extends JpaRepository<BoardEntity, Long> {

}
