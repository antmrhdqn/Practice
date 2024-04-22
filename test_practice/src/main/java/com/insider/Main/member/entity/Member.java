package com.insider.Main.member.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String memberId;
    private String name;
    private String password;
    private String departNo;
    private String team;
    private String positionName;
    private Date employedDate;
    private String address;
    private String phoneNumber;
    private String currentType;
    private String email;
}
