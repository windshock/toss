package com.tmoney.c;

import android.content.Context;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultListener;
import com.tmoney.preference.TmoneyData;

/* renamed from: com.tmoney.c.b, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public class C0041b extends BaseTmoneyCallback {
    TmoneyData a;

    public C0041b(Context context) {
        this(context, null);
    }

    public C0041b(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = TmoneyData.getInstance();
    }
}
