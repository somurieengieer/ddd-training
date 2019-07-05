package com.example.domain.room;

import com.example.domain.price.宿泊料金;
import com.example.domain.price.時期;

public enum 収容人数 {

    //TODO: 収容人数もenumで実装できるかは未確認（by hiru

    一名一室 {
        public 宿泊料金 calculater(時期 season) {

            宿泊料金 priceForAdult = season.calculaterForOneParson(this);
            return priceForAdult;
        }
    },
    二名一室 {
        public 宿泊料金 calculater(時期 season) {

            宿泊料金 priceForAdult = season.calculaterForTwoParson(this);
            return priceForAdult;
        }
    },
    三名一室 {
        public 宿泊料金 calculater(時期 season) {

            宿泊料金 priceForAdult = season.calculaterForThreeParson(this);
            return priceForAdult;
        }
    },
    四名一室 {
        public 宿泊料金 calculater(時期 season) {

            宿泊料金 priceForAdult = season.calculaterForFourParson(this);
            return priceForAdult;
        }
    };

    public abstract 宿泊料金 calculater(時期 season);
}
