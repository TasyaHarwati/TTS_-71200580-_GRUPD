package com.rplbo.utsnota;

public class Kalkulator {
    private Integer bil2;
    private Integer bil1;
    private String operator;

    public Kalkulator(Integer bil2, Integer bil1, String operator) {
        this.bil2 = bil2;
        this.bil1 = bil1;
        this.operator = operator;
    }
    public static void main(String[] args) {
        this.operator = new Operator();
        Operator.hitung();
    }
}
