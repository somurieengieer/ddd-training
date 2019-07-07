package com.example.domain.fee.season;

import com.example.domain.fee.capacity.一名一室;
import com.example.domain.fee.capacity.二名一室;
import com.example.domain.fee.料金;

public enum 時期区分 {
    繁忙期(new 繁忙期()),
    閑散期(new 閑散期());

    時期 season;

    時期区分(時期 season) {
        this.season = season;
    }

    public 料金 料金(一名一室 capacity) {
        return season.料金(capacity);
    }

    public 料金 料金(二名一室 capacity) {
        return season.料金(capacity);
    }
}
