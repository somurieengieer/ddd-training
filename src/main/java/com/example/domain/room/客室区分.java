package com.example.domain.room;

import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;

public enum 客室区分 {
    一般客室(new 一般客室()),
    特別室(new 特別室());

    客室 roomType;

    客室区分(客室 roomType) {
        this.roomType = roomType;
    }

    public 料金 料金(時期区分 seasonType, 収容人数区分 capacityType) {
        return roomType.料金(seasonType, capacityType);
    }

}
