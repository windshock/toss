package io.realm.internal;

import o.access21700;
import o.access22100;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsObjectSchemaInfo implements access22100 {
    private static final long IAuthTabCallback = nativeGetFinalizerPtr();
    private long onExtraCallback;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddProperties(long j, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z);

    private static native String nativeGetClassName(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetPrimaryKeyProperty(long j);

    private static native long nativeGetProperty(long j, String str);

    private static native boolean nativeIsEmbedded(long j);

    private OsObjectSchemaInfo(String str, String str2, boolean z) {
        this(nativeCreateRealmObjectSchema(str, str2, z));
    }

    OsObjectSchemaInfo(long j) {
        this.onExtraCallback = j;
        access21700.onWarmupCompleted.onWarmupCompleted(this);
    }

    public Property onExtraCallback(String str) {
        return new Property(nativeGetProperty(this.onExtraCallback, str));
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onExtraCallback;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return IAuthTabCallback;
    }
}
