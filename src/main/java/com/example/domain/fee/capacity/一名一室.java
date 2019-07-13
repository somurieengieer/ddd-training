package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;

public class 一名一室 implements 収容人数 {

    @Override
    public 料金 料金(時期区分 seasonType) {
        return seasonType.料金(this);
    }

    @Override
    public 料金 特別室追加料金(時期区分 seasonType) {
        return seasonType.特別室追加料金(this);
    }
}
