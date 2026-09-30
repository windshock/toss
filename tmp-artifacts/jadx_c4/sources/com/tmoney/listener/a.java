package com.tmoney.listener;

import com.tmoney.Tmoney;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
abstract class a<T> {
    a() {
    }

    public abstract void onResult(Tmoney.ApiName apiName, TmoneyCallback.ResultType resultType, T t);
}
