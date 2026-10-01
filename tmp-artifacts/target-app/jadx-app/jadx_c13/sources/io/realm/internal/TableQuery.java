package io.realm.internal;

import io.realm.RealmAny;
import io.realm.RealmAnyNativeFunctionsImpl;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsKeyPathMapping;
import javax.annotation.Nullable;
import o.access21700;
import o.access22100;
import o.clearLocation;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TableQuery implements access22100 {
    private static final long IAuthTabCallback = nativeGetFinalizerPtr();
    private final long onExtraCallback;
    private final Table onNavigationEvent;
    private final RealmAnyNativeFunctionsImpl onExtraCallbackWithResult = new RealmAnyNativeFunctionsImpl();
    private boolean onWarmupCompleted = true;

    private native long[] nativeAverageDecimal128(long j, long j2);

    private native double nativeAverageDouble(long j, long j2);

    private native double nativeAverageFloat(long j, long j2);

    private native double nativeAverageInt(long j, long j2);

    private native long[] nativeAverageRealmAny(long j, long j2);

    private native void nativeBeginGroup(long j);

    private native long nativeCount(long j);

    private native void nativeEndGroup(long j);

    private native long nativeFind(long j);

    private static native long nativeGetFinalizerPtr();

    private native long[] nativeMaximumDecimal128(long j, long j2);

    private native Double nativeMaximumDouble(long j, long j2);

    private native Float nativeMaximumFloat(long j, long j2);

    private native Long nativeMaximumInt(long j, long j2);

    private native NativeRealmAny nativeMaximumRealmAny(long j, long j2);

    private native Long nativeMaximumTimestamp(long j, long j2);

    private native long[] nativeMinimumDecimal128(long j, long j2);

    private native Double nativeMinimumDouble(long j, long j2);

    private native Float nativeMinimumFloat(long j, long j2);

    private native Long nativeMinimumInt(long j, long j2);

    private native NativeRealmAny nativeMinimumRealmAny(long j, long j2);

    private native Long nativeMinimumTimestamp(long j, long j2);

    private native void nativeNot(long j);

    private native void nativeOr(long j);

    private native void nativeRawDescriptor(long j, String str, long j2);

    private native void nativeRawPredicate(long j, String str, long[] jArr, long j2);

    private native long nativeRemove(long j);

    private native long[] nativeSumDecimal128(long j, long j2);

    private native double nativeSumDouble(long j, long j2);

    private native double nativeSumFloat(long j, long j2);

    private native long nativeSumInt(long j, long j2);

    private native long[] nativeSumRealmAny(long j, long j2);

    private native String nativeValidateQuery(long j);

    private static String onExtraCallbackWithResult(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return str.replace(" ", "\\ ");
    }

    public TableQuery(access21700 access21700Var, Table table, long j) {
        this.onNavigationEvent = table;
        this.onExtraCallback = j;
        access21700Var.onWarmupCompleted(this);
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onExtraCallback;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return IAuthTabCallback;
    }

    public Table onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public void asBinder() {
        if (this.onWarmupCompleted) {
            return;
        }
        String strNativeValidateQuery = nativeValidateQuery(this.onExtraCallback);
        if (_UrlKt.FRAGMENT_ENCODE_SET.equals(strNativeValidateQuery)) {
            this.onWarmupCompleted = true;
            return;
        }
        throw new UnsupportedOperationException(strNativeValidateQuery);
    }

    public TableQuery onExtraCallback() {
        nativeBeginGroup(this.onExtraCallback);
        this.onWarmupCompleted = false;
        return this;
    }

    public TableQuery onNavigationEvent() {
        nativeEndGroup(this.onExtraCallback);
        this.onWarmupCompleted = false;
        return this;
    }

    public TableQuery IAuthTabCallbackDefault() {
        nativeOr(this.onExtraCallback);
        this.onWarmupCompleted = false;
        return this;
    }

    public static String onNavigationEvent(String[] strArr, clearLocation[] clearlocationArr) {
        StringBuilder sb = new StringBuilder("SORT(");
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        int i = 0;
        while (i < strArr.length) {
            String str2 = strArr[i];
            sb.append(str);
            sb.append(onExtraCallbackWithResult(str2));
            sb.append(" ");
            sb.append(clearlocationArr[i] == clearLocation.ASCENDING ? "ASC" : "DESC");
            i++;
            str = ", ";
        }
        sb.append(")");
        return sb.toString();
    }

    public TableQuery onNavigationEvent(@Nullable OsKeyPathMapping osKeyPathMapping, String[] strArr, clearLocation[] clearlocationArr) {
        onExtraCallbackWithResult(osKeyPathMapping, onNavigationEvent(strArr, clearlocationArr));
        return this;
    }

    public void IAuthTabCallback(@Nullable OsKeyPathMapping osKeyPathMapping, String str, long... jArr) {
        nativeRawPredicate(this.onExtraCallback, str, jArr, osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0L);
    }

    private void onExtraCallbackWithResult(@Nullable OsKeyPathMapping osKeyPathMapping, String str) {
        nativeRawDescriptor(this.onExtraCallback, str, osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0L);
    }

    public TableQuery onWarmupCompleted(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, osKeyPathMapping, onExtraCallbackWithResult(str) + " = $0", realmAny);
        this.onWarmupCompleted = false;
        return this;
    }

    public TableQuery onNavigationEvent(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, osKeyPathMapping, onExtraCallbackWithResult(str) + " =[c] $0", realmAny);
        this.onWarmupCompleted = false;
        return this;
    }

    public TableQuery onExtraCallbackWithResult(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, osKeyPathMapping, onExtraCallbackWithResult(str) + " < $0", realmAny);
        this.onWarmupCompleted = false;
        return this;
    }

    public TableQuery onExtraCallback(@Nullable OsKeyPathMapping osKeyPathMapping, String str) {
        IAuthTabCallback(osKeyPathMapping, onExtraCallbackWithResult(str) + " = NULL", new long[0]);
        this.onWarmupCompleted = false;
        return this;
    }

    public TableQuery onExtraCallbackWithResult() {
        IAuthTabCallback(null, "FALSEPREDICATE", new long[0]);
        this.onWarmupCompleted = false;
        return this;
    }

    public TableQuery onWarmupCompleted(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny[] realmAnyArr) {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        onExtraCallback();
        int length = realmAnyArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            RealmAny realmAny = realmAnyArr[i];
            if (!z) {
                IAuthTabCallbackDefault();
            }
            if (realmAny == null) {
                onExtraCallback(osKeyPathMapping, strOnExtraCallbackWithResult);
            } else {
                onWarmupCompleted(osKeyPathMapping, strOnExtraCallbackWithResult, realmAny);
            }
            i++;
            z = false;
        }
        onNavigationEvent();
        this.onWarmupCompleted = false;
        return this;
    }

    public TableQuery onExtraCallbackWithResult(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny[] realmAnyArr) {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        onExtraCallback();
        int length = realmAnyArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            RealmAny realmAny = realmAnyArr[i];
            if (!z) {
                IAuthTabCallbackDefault();
            }
            if (realmAny == null) {
                onExtraCallback(osKeyPathMapping, strOnExtraCallbackWithResult);
            } else {
                onNavigationEvent(osKeyPathMapping, strOnExtraCallbackWithResult, realmAny);
            }
            i++;
            z = false;
        }
        onNavigationEvent();
        this.onWarmupCompleted = false;
        return this;
    }

    public long IAuthTabCallback() {
        asBinder();
        return nativeFind(this.onExtraCallback);
    }
}
