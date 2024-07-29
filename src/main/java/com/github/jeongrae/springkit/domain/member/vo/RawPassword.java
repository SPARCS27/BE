package com.github.jeongrae.springkit.domain.member.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.jeongrae.springkit.domain.member.converter.RawPasswordDeserializer;

@JsonDeserialize(using = RawPasswordDeserializer.class)
public record RawPassword(
        String password
) {
}
