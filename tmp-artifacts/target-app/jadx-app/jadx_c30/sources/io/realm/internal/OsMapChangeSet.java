package io.realm.internal;

import o.access22100;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class OsMapChangeSet implements access22100 {
    private static long onWarmupCompleted = nativeGetFinalizerPtr();
    private final long onExtraCallback;

    private static native long nativeGetFinalizerPtr();

    private static native String[] nativeGetStringKeyDeletions(long j);

    private static native String[] nativeGetStringKeyInsertions(long j);

    private static native String[] nativeGetStringKeyModifications(long j);

    public long getNativePtr() {
        return this.onExtraCallback;
    }

    public long getNativeFinalizerPtr() {
        return onWarmupCompleted;
    }
}
