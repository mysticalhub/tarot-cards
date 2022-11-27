package com.tro.tarotcardsapi.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ArcanaEnum {
    JUNIOR("junior"),
    SENIOR("senior");

    private final String name;
}
