package com.tmoney;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum TmoneyConstants$MonthlySumUsedPlaceType {
    All("00", "사용종합"),
    Trans("01", "교통"),
    Shopping("02", "쇼핑"),
    Gift("03", "선물"),
    Load("04", "충전"),
    Taxi("05", "택시");

    private String a;
    private String b;

    TmoneyConstants$MonthlySumUsedPlaceType(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String getCode() {
        return this.a;
    }

    public final String getName() {
        return this.b;
    }
}
