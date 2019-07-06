package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;

public class 一名一室 implements 収容人数 {

    public 料金 料金(時期区分 season) {
        return season.料金(this);
    }
}
