package io.realm.internal;

import java.util.Collection;
import java.util.Iterator;
import o.access21700;
import o.access22100;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsSchemaInfo implements access22100 {
    private static final long onExtraCallbackWithResult = nativeGetFinalizerPtr();
    private final OsSharedRealm onExtraCallback;
    private long onNavigationEvent;

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j, String str);

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.onNavigationEvent = nativeCreateFromList(onWarmupCompleted(collection));
        access21700.onWarmupCompleted.onWarmupCompleted(this);
        this.onExtraCallback = null;
    }

    OsSchemaInfo(long j, OsSharedRealm osSharedRealm) {
        this.onNavigationEvent = j;
        this.onExtraCallback = osSharedRealm;
    }

    private static long[] onWarmupCompleted(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<OsObjectSchemaInfo> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().getNativePtr();
            i++;
        }
        return jArr;
    }

    public OsObjectSchemaInfo onNavigationEvent(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.onNavigationEvent, str));
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onNavigationEvent;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onExtraCallbackWithResult;
    }
}
