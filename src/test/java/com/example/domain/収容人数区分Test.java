package com.example.domain;

import com.example.domain.fee.capacity.収容人数区分;
import com.example.domain.reservation.宿泊人数;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Junitのサンプル

class 収容人数区分Test {

    @Test
    void 収容人数区分判定() {
        assertEquals(収容人数区分.収容人数区分判定(new 宿泊人数(1)), 収容人数区分.一名一室);
        assertEquals(収容人数区分.収容人数区分判定(new 宿泊人数(2)), 収容人数区分.二名一室);
    }
}