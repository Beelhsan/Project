package com.belhassen.Entities;


import javax.persistence.*;

@Entity

public class Particulier {

    @Id
        @Column(name = "PARTICULIER_ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long particulierId;

        @Column(name = "PARTICULIER_NAME")
        private String particulierName;

        @Column(name = "PARTICULIER_MAIL")
        private String particulierMail;

        @Column(name = "PARTICULIER_PASS")
        private String particulierPass;

        @Column(name = "PARTICULIER_CIN")
        private int particulierCin;

        @Column(name = "PARTICULIER_ADDRESS")
        private String particulierAddress;

        @Column(name = "PARTICULIER_PHONE")
        private int particulierPhone;


    public Particulier() {
        }

        public Particulier(String particulierName, String particulierMail, String particulierPass, int particulierCin, String particulierAddress, int particulierPhone) {
            this.particulierName = particulierName;
            this.particulierMail = particulierMail;
            this.particulierPass = particulierPass;
            this.particulierCin = particulierCin;
            this.particulierAddress = particulierAddress;
            this.particulierPhone = particulierPhone;
        }

    public long getParticulierId() {
        return particulierId;
    }

    public void setParticulierId(long particulierId) {
        this.particulierId = particulierId;
    }

    public String getParticulierName() {
        return particulierName;
    }

    public void setParticulierName(String particulierName) {
        this.particulierName = particulierName;
    }

    public String getParticulierMail() {
        return particulierMail;
    }

    public void setParticulierMail(String particulierMail) {
        this.particulierMail = particulierMail;
    }

    public String getParticulierPass() {
        return particulierPass;
    }

    public void setParticulierPass(String particulierPass) {
        this.particulierPass = particulierPass;
    }

    public int getParticulierCin() {
        return particulierCin;
    }

    public void setParticulierCin(int particulierCin) {
        this.particulierCin = particulierCin;
    }

    public String getParticulierAddress() {
        return particulierAddress;
    }

    public void setParticulierAddress(String particulierAddress) {
        this.particulierAddress = particulierAddress;
    }

    public int getParticulierPhone() {
        return particulierPhone;
    }

    public void setParticulierPhone(int particulierPhone) {
        this.particulierPhone = particulierPhone;
    }

    @Override
    public String toString() {
        return "Particulier{" +
                "particulierId=" + particulierId +
                ", particulierName='" + particulierName + '\'' +
                ", particulierMail='" + particulierMail + '\'' +
                ", particulierPass='" + particulierPass + '\'' +
                ", particulierCin=" + particulierCin +
                ", particulierAddress='" + particulierAddress + '\'' +
                ", particulierPhone=" + particulierPhone +
                '}';
    }
}
