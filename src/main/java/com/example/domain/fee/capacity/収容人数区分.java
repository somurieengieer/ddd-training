package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;
import com.example.domain.reservation.宿泊人数;

import java.util.Arrays;

public enum 収容人数区分 {

    一名一室(new 一名一室()),
    二名一室(new 二名一室()),
    三名一室(new 一名一室()),
    四名以上一室(new 一名一室());

    収容人数 capacity;

    収容人数区分(収容人数 capacity) {
        this.capacity = capacity;
    }

    public static 収容人数区分 収容人数区分生成(収容人数 capacity) {
        return Arrays.stream(収容人数区分.values())
                .filter(c -> c.capacity.getClass() == capacity.getClass())
                .findFirst()
                .get();
    }

    public 料金 料金(時期区分 seasonType) {
        return capacity.料金(seasonType);
    }

    public 料金 特別室追加料金(時期区分 seasonType) {
        return capacity.特別室追加料金(seasonType);
    }

    public static 収容人数区分 収容人数区分判定(宿泊人数 numberOfPeople) {
        return new 一名一室(new 二名一室()).収容人数区分判定(numberOfPeople);
    }
}
