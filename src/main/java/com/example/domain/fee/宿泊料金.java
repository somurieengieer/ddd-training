package com.example.domain.fee;

import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.fee.season.時期区分;
import com.example.domain.room.客室区分;

public class 宿泊料金 {
    時期区分 seasonType;
    収容人数区分 capacityType;
    客室区分 roomType;

    public 料金 大人料金() {
        料金 price = capacityType.料金(seasonType);
        if (roomType == 客室区分.特別室) {
            price.加算(capacityType.特別室追加料金(seasonType));
        }
        return price;
    }

    public 宿泊料金(時期区分 seasonType, 収容人数区分 capacityType, 客室区分 roomType) {
        this.seasonType = seasonType;
        this.capacityType = capacityType;
        this.roomType = roomType;
    }
}
