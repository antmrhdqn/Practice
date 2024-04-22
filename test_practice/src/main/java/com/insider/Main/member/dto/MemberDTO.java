package com.insider.Main.member.dto;

import java.util.Date;

public class MemberDTO {

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

    public MemberDTO() {
    }

    public MemberDTO(String memberId, String name, String password, String departNo, String team, String positionName, Date employedDate, String address, String phoneNumber, String currentType, String email) {
        this.memberId = memberId;
        this.name = name;
        this.password = password;
        this.departNo = departNo;
        this.team = team;
        this.positionName = positionName;
        this.employedDate = employedDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.currentType = currentType;
        this.email = email;
    }

    public MemberDTO(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartNo() {
        return departNo;
    }

    public void setDepartNo(String departNo) {
        this.departNo = departNo;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Date getEmployedDate() {
        return employedDate;
    }

    public void setEmployedDate(Date employedDate) {
        this.employedDate = employedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCurrentType() {
        return currentType;
    }

    public void setCurrentType(String currentType) {
        this.currentType = currentType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", departNo='" + departNo + '\'' +
                ", team='" + team + '\'' +
                ", positionName='" + positionName + '\'' +
                ", employedDate=" + employedDate +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", currentType='" + currentType + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
