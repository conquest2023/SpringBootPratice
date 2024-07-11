package com.example.Springboot.domain;



import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BaseEntity{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private  Long bno;

    @Column(length = 500,nullable = false)
    private  String title;

    @Column(length = 2000,nullable = false)
    private  String content;

    @Column(length = 50,nullable = false)
    private  String  writer;

    public  void change(String content,String title){
        this.content=content;
        this.title=title;
    }
}
