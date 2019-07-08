package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;
import com.example.domain.reservation.宿泊人数;

public class 一名一室 implements 収容人数 {

    static final int CAPACITY = 1;

    収容人数 nextCapacity;

    @Override
    public int capacity() {
        return CAPACITY;
    }

    public 料金 料金(時期区分 season) {
        return season.料金(this);
    }

    public 収容人数 次に小さい収容人数() {
        return nextCapacity;
    }

    public 収容人数 次に小さい収容人数(収容人数 numberOfCapacity) {
        nextCapacity = numberOfCapacity;
        return nextCapacity;
    }

    public 収容人数 収容人数区分判定(宿泊人数 numberOfPeople) {
        if (適用可否(numberOfPeople)) {
            return this;
        } else {
            return nextCapacity.収容人数区分判定(numberOfPeople);
        }
    }
}
