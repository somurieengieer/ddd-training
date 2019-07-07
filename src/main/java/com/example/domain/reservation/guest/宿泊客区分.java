package com.example.domain.reservation.guest;

public enum 宿泊客区分 {

    大人(new 大人()),
    小学生(new 小学生()),
    幼児(new 幼児());

    宿泊客 guest;

    宿泊客区分(宿泊客 guest) {
        this.guest = guest;
    }

    public boolean 宿泊人数カウントされる() {
        return guest.宿泊人数カウントされる();
    }
}
