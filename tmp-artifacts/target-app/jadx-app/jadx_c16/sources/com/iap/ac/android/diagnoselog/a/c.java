package com.iap.ac.android.diagnoselog.a;

import com.iap.ac.android.diagnoselog.core.DiagnoseLogContext;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class c implements Runnable {
    public c(DiagnoseLogContext diagnoseLogContext) {
    }

    @Override // java.lang.Runnable
    public void run() {
        DiagnoseLogContext.b().a.a();
    }
}
