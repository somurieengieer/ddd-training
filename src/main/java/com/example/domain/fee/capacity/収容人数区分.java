package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;

public enum 収容人数区分 {

    一名一室(new 一名一室()),
    二名一室(new 二名一室()),
    三名一室(new 一名一室()),
    四名以上一室(new 一名一室());

    収容人数 capacity;

    収容人数区分(収容人数 capacity) {
        this.capacity = capacity;
    }

    public 料金 料金(時期区分 seasonType) {
        return capacity.料金(seasonType);
    }

    public 料金 特別室追加料金(時期区分 seasonType) {
        return capacity.特別室追加料金(seasonType);
    }
}
