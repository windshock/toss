package com.iap.ac.android.acs.operation.common;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum AppFavoriteStatus {
    Unknow(-1),
    Uncollected(0),
    Collected(1);

    int value;

    AppFavoriteStatus(int i) {
        this.value = i;
    }

    public static AppFavoriteStatus parseValue(int i) {
        AppFavoriteStatus appFavoriteStatus = Unknow;
        if (i != -1) {
            if (i == 0) {
                return Uncollected;
            }
            if (i == 1) {
                return Collected;
            }
        }
        return appFavoriteStatus;
    }

    public int getValue() {
        return this.value;
    }
}
