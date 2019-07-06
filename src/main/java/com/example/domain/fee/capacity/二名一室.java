package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.price.宿泊料金;

public class 二名一室 implements 収容人数 {

    public 宿泊料金 料金(時期区分 season) {
        return season.料金(this);
    }
}
