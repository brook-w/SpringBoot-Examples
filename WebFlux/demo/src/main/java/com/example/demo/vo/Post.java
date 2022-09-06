package com.example.demo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class Post {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;

}
