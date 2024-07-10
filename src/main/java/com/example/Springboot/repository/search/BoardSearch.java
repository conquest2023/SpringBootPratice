package com.example.Springboot.repository.search;

import com.example.Springboot.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch {

    Page<Board> search(Pageable pageable);

    Page<Board> searchAll(String[] types,String keyword, Pageable pageable);
}
