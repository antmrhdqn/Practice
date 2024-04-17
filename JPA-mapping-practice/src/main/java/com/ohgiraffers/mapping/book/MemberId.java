package com.ohgiraffers.mapping.book;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MemberId {

    @Column(name = "memeber_id")
    private String memberId;

    protected MemberId() {}

    public MemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "MemberId{" +
                "memberId='" + memberId + '\'' +
                '}';
    }
}
