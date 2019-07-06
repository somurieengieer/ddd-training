package com.example.domain.fee.season;

import com.example.domain.fee.capacity.一名一室;
import com.example.domain.fee.capacity.二名一室;
import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.price.宿泊料金;

public class 繁忙期 implements 時期 {

    @Override
    public 宿泊料金 料金(一名一室 一名一室) {
        return new 宿泊料金(3000);
    }

    @Override
    public 宿泊料金 料金(二名一室 一名一室) {
        return new 宿泊料金(2800);
    }
}
