package com.example.domain;

import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.fee.season.時期区分;
import com.example.domain.fee.宿泊料金;
import com.example.domain.fee.料金;
import com.example.domain.room.客室区分;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Junitのサンプル

class 宿泊料金Test {

    @Test
    void 料金() {
        宿泊料金 fee = new 宿泊料金(時期区分.繁忙期, 収容人数区分.二名一室, 客室区分.一般客室);
        assertEquals(new 料金(2800), fee.大人料金());
    }
}