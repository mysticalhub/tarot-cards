package com.tro.tarotcardsapi.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SuitEnum {
    SPADE("spade"),
    WORM("worm"),
    TAMBOURINE("tambourine"),
    CROSS("cross");

    private final String name;

}
