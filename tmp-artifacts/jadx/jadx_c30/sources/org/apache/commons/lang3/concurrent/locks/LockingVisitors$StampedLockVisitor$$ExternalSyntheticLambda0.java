package org.apache.commons.lang3.concurrent.locks;

import java.util.concurrent.locks.StampedLock;
import java.util.function.Supplier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ StampedLock f$0;

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f$0.asReadLock();
    }
}
