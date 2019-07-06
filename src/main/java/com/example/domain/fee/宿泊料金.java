package com.example.domain.fee;

import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.fee.season.時期区分;

public class 宿泊料金 {
    時期区分 seasonType;
    収容人数区分 capacityType;

    public 料金 大人料金() {
        return capacityType.料金(seasonType);
    }

    public 宿泊料金(時期区分 seasonType, 収容人数区分 capacityType) {
        this.seasonType = seasonType;
        this.capacityType = capacityType;
    }
}
