package com.tmoney.dto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PostpaidBillingDayDto {
    private String billDay;
    private String billMon;
    private String billYM;

    public String getBillDay() {
        return this.billDay;
    }

    public String getBillYearMonth() {
        return this.billYM;
    }

    public String getMonth() {
        return this.billMon;
    }

    public void setBillDay(String str) {
        this.billDay = str;
    }

    public void setBillMon(String str) {
        this.billMon = str;
    }

    public void setBillYearMonth(String str) {
        this.billYM = str;
    }
}
