package com.example.domain.fee;

public class 料金 {

    long value;

    public 料金(long value) {
        this.value = value;
    }

    public 料金 加算(料金 addPrice) {
        return new 料金(this.value + addPrice.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        料金 料金 = (料金) o;

        return value == 料金.value;
    }

    @Override
    public int hashCode() {
        return (int) (value ^ (value >>> 32));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
