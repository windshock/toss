package io.realm.internal;

import io.realm.internal.ObservableSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import o.access11400;
import o.access21700;
import o.access22100;
import o.access22200;
import o.access22600;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsSet implements access22100, access22600 {
    private static final long onNavigationEvent = nativeGetFinalizerPtr();
    private final Table IAuthTabCallback;
    private final access21700 onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final OsSharedRealm onWarmupCompleted;

    private static native boolean nativeAddAllRealmAnyCollection(long j, long j2);

    private static native long[] nativeAddBinary(long j, byte[] bArr);

    private static native long[] nativeAddBoolean(long j, boolean z);

    private static native long[] nativeAddDate(long j, long j2);

    private static native long[] nativeAddDecimal128(long j, long j2, long j3);

    private static native long[] nativeAddDouble(long j, double d);

    private static native long[] nativeAddFloat(long j, float f);

    private static native long[] nativeAddLong(long j, long j2);

    private static native long[] nativeAddNull(long j);

    private static native long[] nativeAddObjectId(long j, String str);

    private static native long[] nativeAddRealmAny(long j, long j2);

    private static native long[] nativeAddRow(long j, long j2);

    private static native long[] nativeAddString(long j, String str);

    private static native long[] nativeAddUUID(long j, String str);

    private static native boolean nativeAsymmetricDifference(long j, long j2);

    private static native void nativeClear(long j);

    private static native boolean nativeContainsAll(long j, long j2);

    private static native boolean nativeContainsAllRealmAnyCollection(long j, long j2);

    private static native boolean nativeContainsBinary(long j, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j, boolean z);

    private static native boolean nativeContainsDate(long j, long j2);

    private static native boolean nativeContainsDecimal128(long j, long j2, long j3);

    private static native boolean nativeContainsDouble(long j, double d);

    private static native boolean nativeContainsFloat(long j, float f);

    private static native boolean nativeContainsLong(long j, long j2);

    private static native boolean nativeContainsNull(long j);

    private static native boolean nativeContainsObjectId(long j, String str);

    private static native boolean nativeContainsRealmAny(long j, long j2);

    private static native boolean nativeContainsRow(long j, long j2);

    private static native boolean nativeContainsString(long j, String str);

    private static native boolean nativeContainsUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native void nativeDeleteAll(long j);

    private static native long nativeFreeze(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j);

    private static native long nativeGetRealmAny(long j, int i);

    private static native long nativeGetRow(long j, int i);

    private static native Object nativeGetValueAtIndex(long j, int i);

    private static native boolean nativeIntersect(long j, long j2);

    private static native boolean nativeIsValid(long j);

    private static native boolean nativeRemoveAllRealmAnyCollection(long j, long j2);

    private static native long[] nativeRemoveBinary(long j, byte[] bArr);

    private static native long[] nativeRemoveBoolean(long j, boolean z);

    private static native long[] nativeRemoveDate(long j, long j2);

    private static native long[] nativeRemoveDecimal128(long j, long j2, long j3);

    private static native long[] nativeRemoveDouble(long j, double d);

    private static native long[] nativeRemoveFloat(long j, float f);

    private static native long[] nativeRemoveLong(long j, long j2);

    private static native long[] nativeRemoveNull(long j);

    private static native long[] nativeRemoveObjectId(long j, String str);

    private static native long[] nativeRemoveRealmAny(long j, long j2);

    private static native long[] nativeRemoveRow(long j, long j2);

    private static native long[] nativeRemoveString(long j, String str);

    private static native long[] nativeRemoveUUID(long j, String str);

    private static native boolean nativeRetainAllRealmAnyCollection(long j, long j2);

    private static native long nativeSize(long j);

    private static native void nativeStartListening(long j, ObservableSet observableSet);

    private static native void nativeStopListening(long j);

    private static native boolean nativeUnion(long j, long j2);

    public OsSet(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm osSharedRealmOnTransact = uncheckedRow.getTable().onTransact();
        this.onWarmupCompleted = osSharedRealmOnTransact;
        long[] jArrNativeCreate = nativeCreate(osSharedRealmOnTransact.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.onExtraCallbackWithResult = jArrNativeCreate[0];
        access21700 access21700Var = osSharedRealmOnTransact.context;
        this.onExtraCallback = access21700Var;
        access21700Var.onWarmupCompleted(this);
        if (jArrNativeCreate[1] != 0) {
            this.IAuthTabCallback = new Table(osSharedRealmOnTransact, jArrNativeCreate[1]);
        } else {
            this.IAuthTabCallback = null;
        }
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onNavigationEvent;
    }

    public Object onWarmupCompleted(int i) {
        return nativeGetValueAtIndex(this.onExtraCallbackWithResult, i);
    }

    public long onWarmupCompleted() {
        return nativeSize(this.onExtraCallbackWithResult);
    }

    /* renamed from: io.realm.internal.OsSet$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[onExtraCallback.CONTAINS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[onExtraCallback.ADD_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[onExtraCallback.REMOVE_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[onExtraCallback.RETAIN_ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean onNavigationEvent(NativeRealmAnyCollection nativeRealmAnyCollection, onExtraCallback onextracallback) {
        int i = AnonymousClass2.IAuthTabCallback[onextracallback.ordinal()];
        if (i == 1) {
            return nativeContainsAllRealmAnyCollection(this.onExtraCallbackWithResult, nativeRealmAnyCollection.getNativePtr());
        }
        if (i == 2) {
            return nativeAddAllRealmAnyCollection(this.onExtraCallbackWithResult, nativeRealmAnyCollection.getNativePtr());
        }
        if (i == 3) {
            return nativeRemoveAllRealmAnyCollection(this.onExtraCallbackWithResult, nativeRealmAnyCollection.getNativePtr());
        }
        if (i == 4) {
            return onNavigationEvent(nativeRealmAnyCollection);
        }
        throw new IllegalStateException("Unexpected value: " + onextracallback);
    }

    public boolean onExtraCallback(long j) {
        return nativeContainsRow(this.onExtraCallbackWithResult, j);
    }

    public boolean onWarmupCompleted(long j) {
        return nativeAddRow(this.onExtraCallbackWithResult, j)[1] != 0;
    }

    public boolean onTransact(long j) {
        return nativeRemoveRow(this.onExtraCallbackWithResult, j)[1] != 0;
    }

    public long onNavigationEvent(int i) {
        return nativeGetRow(this.onExtraCallbackWithResult, i);
    }

    public boolean IAuthTabCallback(long j) {
        return nativeContainsRealmAny(this.onExtraCallbackWithResult, j);
    }

    public boolean onExtraCallbackWithResult(long j) {
        return nativeAddRealmAny(this.onExtraCallbackWithResult, j)[1] != 0;
    }

    public boolean onNavigationEvent(long j) {
        return nativeRemoveRealmAny(this.onExtraCallbackWithResult, j)[1] != 0;
    }

    public long IAuthTabCallback(int i) {
        return nativeGetRealmAny(this.onExtraCallbackWithResult, i);
    }

    public boolean onWarmupCompleted(OsSet osSet) {
        return nativeContainsAll(this.onExtraCallbackWithResult, osSet.getNativePtr());
    }

    public boolean onNavigationEvent(OsSet osSet) {
        return nativeUnion(this.onExtraCallbackWithResult, osSet.getNativePtr());
    }

    public boolean onExtraCallbackWithResult(OsSet osSet) {
        return nativeAsymmetricDifference(this.onExtraCallbackWithResult, osSet.getNativePtr());
    }

    public boolean onExtraCallback(OsSet osSet) {
        return nativeIntersect(this.onExtraCallbackWithResult, osSet.getNativePtr());
    }

    public void IAuthTabCallback() {
        nativeClear(this.onExtraCallbackWithResult);
    }

    public <T> void onExtraCallbackWithResult(long j, access22200<ObservableSet.IAuthTabCallback<T>> access22200Var) {
        access11400 access11400Var = new access11400(new OsCollectionChangeSet(j, false));
        if (access11400Var.IAuthTabCallback()) {
            return;
        }
        access22200Var.IAuthTabCallback(new ObservableSet.onExtraCallback(access11400Var));
    }

    private boolean onNavigationEvent(NativeRealmAnyCollection nativeRealmAnyCollection) {
        if (onWarmupCompleted() == 0) {
            return false;
        }
        if (nativeRealmAnyCollection.onExtraCallbackWithResult() == 0) {
            IAuthTabCallback();
            return true;
        }
        return nativeRetainAllRealmAnyCollection(this.onExtraCallbackWithResult, nativeRealmAnyCollection.getNativePtr());
    }
}
