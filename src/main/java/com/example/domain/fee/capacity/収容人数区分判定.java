package com.example.domain.fee.capacity;

import com.example.domain.reservation.宿泊人数;

public class 収容人数区分判定 {

    宿泊人数 numberOfPeople;
    収容人数 capacity;
    収容人数 nextCapacity;

    public 収容人数区分 収容人数区分() {
        if (適用可能(numberOfPeople)) {
            return capacity.収容人数区分取得();
        } else {
            return nextCapacity.収容人数区分判定(numberOfPeople);
        }
    }

    boolean 適用可能(宿泊人数 numberOfPeople) {
        return numberOfPeople.value() <= this.capacity.capacity();
    }

    public 収容人数区分判定(宿泊人数 numberOfPeople, 収容人数 capacity, 収容人数 nextCapacity) {
        this.numberOfPeople = numberOfPeople;
        this.capacity = capacity;
        this.nextCapacity = nextCapacity;
    }
}
