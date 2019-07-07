package com.example.domain.reservation;

import com.example.domain.reservation.guest.宿泊客;

import java.util.List;

/**
 * １部屋あたりの宿泊客一覧
 */
public class 宿泊客一覧 {

    List<宿泊客> guests;

    public 宿泊客一覧(List<宿泊客> guests) {
        this.guests = guests;
    }

    public 宿泊人数 宿泊人数() {
        return new 宿泊人数(
                (int)guests.stream()
                .filter(e -> e.宿泊人数カウントされる()).count()
        );
    }
}
