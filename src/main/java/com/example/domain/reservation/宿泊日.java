package com.example.domain.reservation;

import com.example.domain.fee.season.時期区分;

import java.time.LocalDate;

public class 宿泊日 {

    LocalDate value;

    public 宿泊日(LocalDate value) {
        this.value = value;
    }

    public 時期区分 toSeason() {

        // TODO dummy logic
        return 時期区分.繁忙期;
    }
}
