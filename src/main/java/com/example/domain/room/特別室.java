package com.example.domain.room;

import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;

public class 特別室 implements 客室 {

    @Override
    public 料金 料金(時期区分 seasonType, 収容人数区分 capacityType) {
        return capacityType.料金(seasonType).加算(capacityType.特別室追加料金(seasonType));
    }
}
