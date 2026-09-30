package io.realm.internal;

import java.util.Arrays;
import o.access11100;
import o.access21700;
import o.access22100;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsCollectionChangeSet implements access11100, access22100 {
    private static long onWarmupCompleted = nativeGetFinalizerPtr();
    private final long IAuthTabCallback;
    private final boolean onExtraCallback;

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetIndices(long j, int i);

    private static native int[] nativeGetRanges(long j, int i);

    public Throwable IAuthTabCallback() {
        return null;
    }

    public OsCollectionChangeSet(long j, boolean z) {
        this.IAuthTabCallback = j;
        this.onExtraCallback = z;
        access21700.onWarmupCompleted.onWarmupCompleted(this);
    }

    public access11100.onExtraCallback[] onWarmupCompleted() {
        return onExtraCallbackWithResult(nativeGetRanges(this.IAuthTabCallback, 0));
    }

    public access11100.onExtraCallback[] onExtraCallbackWithResult() {
        return onExtraCallbackWithResult(nativeGetRanges(this.IAuthTabCallback, 1));
    }

    public access11100.onExtraCallback[] onExtraCallback() {
        return onExtraCallbackWithResult(nativeGetRanges(this.IAuthTabCallback, 2));
    }

    public boolean asBinder() {
        return this.onExtraCallback;
    }

    public boolean onNavigationEvent() {
        return this.IAuthTabCallback == 0;
    }

    private access11100.onExtraCallback[] onExtraCallbackWithResult(int[] iArr) {
        if (iArr == null) {
            return new access11100.onExtraCallback[0];
        }
        int length = iArr.length / 2;
        access11100.onExtraCallback[] onextracallbackArr = new access11100.onExtraCallback[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            onextracallbackArr[i] = new access11100.onExtraCallback(iArr[i2], iArr[i2 + 1]);
        }
        return onextracallbackArr;
    }

    public String toString() {
        if (this.IAuthTabCallback == 0) {
            return "Change set is empty.";
        }
        return "Deletion Ranges: " + Arrays.toString(onWarmupCompleted()) + "\nInsertion Ranges: " + Arrays.toString(onExtraCallbackWithResult()) + "\nChange Ranges: " + Arrays.toString(onExtraCallback());
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.IAuthTabCallback;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onWarmupCompleted;
    }
}
