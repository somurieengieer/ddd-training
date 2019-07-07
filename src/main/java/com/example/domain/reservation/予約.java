package com.example.domain.reservation;

import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.fee.season.時期区分;
import com.example.domain.room.部屋タイプ;

public class 予約 {

    // TODO: 一部屋一泊のみの予約でとりあえず書いてみる

    時期区分 seasonType;

    部屋タイプ roomType;

    収容人数区分 roomCapacityType;

    宿泊客一覧 roomGuests;
}
