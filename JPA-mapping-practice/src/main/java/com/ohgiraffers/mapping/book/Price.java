package com.ohgiraffers.mapping.book;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Price {

    @Column(name = "regular_price")
    private int regularPrice;

    @Column(name = "discount_rate", nullable = false)
    private double discountRate;

    @Column(name = "sell_price")
    private int sellPrice;

    protected Price() {}

    public Price(int regularPrice, double discountRate) {
        validateNagativePrice(regularPrice);
        validateNegativeDiscountRate(discountRate);
        this.regularPrice = regularPrice;
        this.discountRate = discountRate;
        this.sellPrice = calcSellPrice(regularPrice, discountRate);
    }

    private void validateNagativePrice(int regularPrice) {
        if(regularPrice < 0) {
            throw new IllegalArgumentException("가격은 음수일 수 없습니다.");
        }
    }

    private void validateNegativeDiscountRate(double discountRate) {
        if(discountRate < 0) {
            throw new IllegalArgumentException("할인율은 음수일 수 없습니다.");
        }
    }

    private int calcSellPrice(int regularPrice, double discountRate) {
        return (int) (regularPrice - (regularPrice * discountRate));
    }

    public int getRegularPrice() {
        return regularPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public String toString() {
        return "Price{" +
                "regularPrice=" + regularPrice +
                ", discountRate=" + discountRate +
                ", sellPrice=" + sellPrice +
                '}';
    }
}
