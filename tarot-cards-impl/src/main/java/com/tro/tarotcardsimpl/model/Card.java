package com.tro.tarotcardsimpl.model;

import com.tro.tarotcardsapi.enums.ArcanaEnum;
import com.tro.tarotcardsapi.enums.SuitEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    private Long id;
    private String name;
    private Integer number;
    private ArcanaEnum arcanaType;
    private SuitEnum suitType;
    private String description;
    private boolean active;
    private OffsetDateTime createdDate;
}
