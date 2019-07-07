package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;
import com.example.domain.reservation.宿泊人数;

public interface 収容人数 {
    料金 料金(時期区分 season);

    int capacity();

    default boolean 適用可否(宿泊人数 numberOfPeople) {
        return numberOfPeople.value() <= this.capacity();
    }
}
