package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.price.宿泊料金;

public interface 収容人数 {
    宿泊料金 料金(時期区分 season);
}
