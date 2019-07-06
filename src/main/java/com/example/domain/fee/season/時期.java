package com.example.domain.fee.season;

import com.example.domain.fee.capacity.一名一室;
import com.example.domain.fee.capacity.二名一室;
import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.price.宿泊料金;

public interface 時期 {

    宿泊料金 料金(一名一室 一名一室);
    宿泊料金 料金(二名一室 一名一室);
}
