package com.example.domain.reservation;

import com.example.domain.room.収容人数;
import com.example.domain.price.時期;
import com.example.domain.room.部屋タイプ;

public class 予約 {

    // TODO: 一部屋一泊のみの予約でとりあえず書いてみる

    時期 season;

    部屋タイプ roomType;

    収容人数 roomCapacity;

    同部屋に宿泊する客一覧 roomGuests;
}
