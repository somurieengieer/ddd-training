package com.example.domain;

import java.time.LocalDate;

public class 宿泊日 {

    LocalDate value;

    public 宿泊日(LocalDate value) {
        this.value = value;
    }

    public 時期 toSeason() {
        // TODO dummy logic
        return 時期.再繁忙期;
    }
}
