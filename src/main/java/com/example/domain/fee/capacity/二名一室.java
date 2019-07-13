package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;
import com.example.domain.reservation.宿泊人数;

public class 二名一室 implements 収容人数 {

    static final int CAPACITY = 2;

    収容人数 nextCapacity;

    public 二名一室() {
    }

    public 二名一室(収容人数 nextCapacity) {
        this.nextCapacity = nextCapacity;
    }

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

    public 収容人数 収容人数区分判定(宿泊人数 numberOfPeople) {
        return new 収容人数区分判定(numberOfPeople, this, nextCapacity).収容人数();
    }

}
