package com.example.domain.fee.capacity;

import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.料金;
import com.example.domain.reservation.宿泊人数;

public interface 収容人数 {

    int capacity();

    収容人数 収容人数区分判定(宿泊人数 numberOfPeople);

    料金 料金(時期区分 seasonType);

    料金 特別室追加料金(時期区分 seasonType);
}
