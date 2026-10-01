package com.iap.ac.android.biz.common.model;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface ScanCallback {
    void onFailure(ScanErrorCode scanErrorCode, String str);

    void onSuccess(String str);
}
