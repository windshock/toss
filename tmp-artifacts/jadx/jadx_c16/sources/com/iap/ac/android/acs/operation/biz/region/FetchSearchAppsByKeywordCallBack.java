package com.iap.ac.android.acs.operation.biz.region;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface FetchSearchAppsByKeywordCallBack<T> {
    void onFailure(int i, String str);

    void onResponse(T t);
}
