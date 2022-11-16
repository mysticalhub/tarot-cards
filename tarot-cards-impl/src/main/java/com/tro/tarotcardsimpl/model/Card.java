package com.tro.tarotcardsimpl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    private Long id;
    private String name;
    private Integer number;
    private String group;
    private String description;
}
