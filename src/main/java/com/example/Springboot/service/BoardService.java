package com.example.Springboot.service;

import com.example.Springboot.dto.BoardDTO;
import com.example.Springboot.dto.PageRequestDTO;
import com.example.Springboot.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
