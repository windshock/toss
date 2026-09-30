package com.iap.ac.android.common.task.transaction;

import com.iap.ac.android.common.a.a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Transaction implements Runnable {
    public static final AtomicInteger sCount = new AtomicInteger(0);
    public final String id;

    public Transaction() {
        StringBuilder sbA = a.a("Transaction_");
        sbA.append(sCount.getAndIncrement());
        this.id = sbA.toString();
    }

    public final String getId() {
        return this.id;
    }
}
