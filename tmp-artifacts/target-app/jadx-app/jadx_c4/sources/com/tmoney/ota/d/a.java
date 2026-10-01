package com.tmoney.ota.d;

import android.content.Context;
import com.tmoney.g.a.d;
import com.tmoney.listener.ResultListener;
import com.tmoney.ota.a.f;
import com.tmoney.ota.dto.Product;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class a {
    private final String a = "TmoneyOta";
    private d b;
    private Context c;

    public a(Context context) {
        LogHelper.d("TmoneyOta", "TmoneyOta");
        this.c = context;
        this.b = d.getInstance();
    }

    private boolean a(com.tmoney.g.a.a aVar) {
        return this.b.offerTask(getContext(), aVar, false);
    }

    public final boolean alias(String str, ResultListener resultListener) {
        return a(new f(getContext(), str, "01", resultListener));
    }

    public final Context getContext() {
        return this.c;
    }

    public final boolean issue(Product product, ResultListener resultListener) {
        return a(new com.tmoney.ota.a.a(getContext(), product, resultListener));
    }

    public final boolean reIssue(String str, ResultListener resultListener) {
        return a(new f(getContext(), str, "05", resultListener));
    }
}
