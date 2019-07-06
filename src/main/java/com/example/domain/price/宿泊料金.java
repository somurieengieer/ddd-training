package com.example.domain.price;

public class 宿泊料金 {

    long value;

    public 宿泊料金(long value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        宿泊料金 宿泊料金 = (宿泊料金) o;

        return value == 宿泊料金.value;
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
