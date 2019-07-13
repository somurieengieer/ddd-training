package com.example.domain.fee.season;

import com.example.domain.fee.capacity.一名一室;
import com.example.domain.fee.capacity.二名一室;
import com.example.domain.fee.料金;

public interface 時期 {

    料金 料金(一名一室 一名一室);
    料金 料金(二名一室 一名一室);

    料金 特別室追加料金(一名一室 一名一室);
    料金 特別室追加料金(二名一室 一名一室);
}
