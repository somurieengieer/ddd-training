package com.example.domain.fee.season;

import com.example.domain.fee.capacity.一名一室;
import com.example.domain.fee.capacity.二名一室;
import com.example.domain.fee.料金;

public class 繁忙期 implements 時期 {

    @Override
    public 料金 料金(一名一室 一名一室) {
        return new 料金(3000);
    }

    @Override
    public 料金 料金(二名一室 一名一室) {
        return new 料金(2800);
    }
}
