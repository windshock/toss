package io.realm.internal.objectstore;

import o.access21700;
import o.access22100;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsKeyPathMapping implements access22100 {
    private static final long onExtraCallback = nativeGetFinalizerMethodPtr();
    public long onExtraCallbackWithResult;

    private static native long nativeCreateMapping(long j);

    private static native long nativeGetFinalizerMethodPtr();

    public OsKeyPathMapping(long j) {
        this.onExtraCallbackWithResult = -1L;
        this.onExtraCallbackWithResult = nativeCreateMapping(j);
        access21700.onWarmupCompleted.onWarmupCompleted(this);
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onExtraCallback;
    }
}
