package com.example.domain.price;

public class 一室あたり料金 {

    long value;

    public 一室あたり料金() {
    }

    public 一室あたり料金(long value) {
        this.value = value;
    }

    public void add(long addPrice) {
        this.value += addPrice;
    }
}
