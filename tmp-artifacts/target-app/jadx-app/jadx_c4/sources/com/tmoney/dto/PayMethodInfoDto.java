package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class PayMethodInfoDto {
    private String birthDay;
    private String cardCompayCode;
    private String crdtChecPntDvsCd;
    private String creditCardNo;
    private String cvc;
    private String expire;
    private boolean foreign;
    private String paymethodVal;
    private String phoneNo;
    private String pwd;
    private String sex;

    public PayMethodInfoDto() {
        this.paymethodVal = "";
        this.crdtChecPntDvsCd = "";
        this.phoneNo = "";
        this.cardCompayCode = "";
        this.creditCardNo = "";
        this.expire = "";
        this.pwd = "";
        this.birthDay = "";
        this.sex = "";
        this.cvc = "";
        this.foreign = false;
    }

    public PayMethodInfoDto(String str, String str2) {
        this.crdtChecPntDvsCd = "";
        this.phoneNo = "";
        this.cardCompayCode = str;
        this.creditCardNo = "";
        this.expire = "";
        this.pwd = "";
        this.birthDay = "";
        this.sex = "";
        this.cvc = "";
        this.foreign = false;
        this.paymethodVal = str2;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public String getCardCompayCode() {
        return this.cardCompayCode;
    }

    public String getCrdtChecPntDvsCd() {
        return this.crdtChecPntDvsCd;
    }

    public String getCreditCardNo() {
        return this.creditCardNo;
    }

    public String getCvc() {
        return this.cvc;
    }

    public String getExpire() {
        return this.expire;
    }

    public String getPaymethodVal() {
        return this.paymethodVal;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public String getPwd() {
        return this.pwd;
    }

    public String getSex() {
        return this.sex;
    }

    public boolean isForeign() {
        return this.foreign;
    }

    public void setBirthDay(String str) {
        this.birthDay = str;
    }

    public void setCardCompayCode(String str) {
        this.cardCompayCode = str;
    }

    public void setCrdtChecPntDvsCd(String str) {
        this.crdtChecPntDvsCd = str;
    }

    public void setCreditCardNo(String str) {
        this.creditCardNo = str;
    }

    public void setCvc(String str) {
        this.cvc = str;
    }

    public void setExpire(String str) {
        this.expire = str;
    }

    public void setForeign(boolean z) {
        this.foreign = z;
    }

    public void setPhoneNo(String str) {
        this.phoneNo = str;
    }

    public void setPwd(String str) {
        this.pwd = str;
    }

    public void setSex(String str) {
        this.sex = str;
    }
}
