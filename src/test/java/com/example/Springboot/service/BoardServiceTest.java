package com.example.Springboot.service;


import com.example.Springboot.dto.BoardDTO;
import com.example.Springboot.dto.PageRequestDTO;
import com.example.Springboot.dto.PageResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@SpringBootTest
@Log4j2
public class BoardServiceTest {


    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister() {
        log.info(boardService.getClass().getName());


    }

    @Test
    public void testRegister2() {
        log.info(boardService.getClass().getName());
        BoardDTO boardDTO = BoardDTO.builder()
                .title("Sample Test")
                .content("Sample Content")
                .writer("user00")
                .build();

        Long bno = boardService.register(boardDTO);

        log.info("bno:" + bno);
    }

    @Test
    public void testList() {

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .type("tcw")
                .keyword("1")
                .page(1)
                .size(10)
                .build();

        PageResponseDTO<BoardDTO> responseDTO = boardService.list(pageRequestDTO);

        log.info(responseDTO);

    }
}
