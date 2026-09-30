package io.realm.internal;

import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import o.access21700;
import o.access22100;
import o.access22700;
import o.access23600;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsMap implements access22100 {
    private static final long onNavigationEvent = nativeGetFinalizerPtr();
    private final long onExtraCallback;
    private final access21700 onExtraCallbackWithResult;
    private final Table onWarmupCompleted;

    private static native void nativeClear(long j);

    private static native boolean nativeContainsBinary(long j, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j, boolean z);

    private static native boolean nativeContainsDate(long j, long j2);

    private static native boolean nativeContainsDecimal128(long j, long j2, long j3);

    private static native boolean nativeContainsDouble(long j, double d);

    private static native boolean nativeContainsFloat(long j, float f);

    private static native boolean nativeContainsKey(long j, String str);

    private static native boolean nativeContainsLong(long j, long j2);

    private static native boolean nativeContainsNull(long j);

    private static native boolean nativeContainsObjectId(long j, String str);

    private static native boolean nativeContainsRealmAny(long j, long j2);

    private static native boolean nativeContainsRealmModel(long j, long j2, long j3);

    private static native boolean nativeContainsString(long j, String str);

    private static native boolean nativeContainsUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeCreateAndPutEmbeddedObject(long j, String str);

    private static native long nativeFreeze(long j, long j2);

    private static native Object[] nativeGetEntryForModel(long j, int i);

    private static native Object[] nativeGetEntryForPrimitive(long j, int i);

    private static native Object[] nativeGetEntryForRealmAny(long j, int i);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmAnyPtr(long j, String str);

    private static native long nativeGetRow(long j, String str);

    private static native Object nativeGetValue(long j, String str);

    private static native boolean nativeIsValid(long j);

    private static native long nativeKeys(long j);

    private static native void nativePutBinary(long j, String str, byte[] bArr);

    private static native void nativePutBoolean(long j, String str, boolean z);

    private static native void nativePutDate(long j, String str, long j2);

    private static native void nativePutDecimal128(long j, String str, long j2, long j3);

    private static native void nativePutDouble(long j, String str, double d);

    private static native void nativePutFloat(long j, String str, float f);

    private static native void nativePutLong(long j, String str, long j2);

    private static native void nativePutNull(long j, String str);

    private static native void nativePutObjectId(long j, String str, String str2);

    private static native void nativePutRealmAny(long j, String str, long j2);

    private static native void nativePutRow(long j, String str, long j2);

    private static native void nativePutString(long j, String str, String str2);

    private static native void nativePutUUID(long j, String str, String str2);

    private static native void nativeRemove(long j, String str);

    private static native long nativeSize(long j);

    private static native void nativeStartListening(long j, ObservableMap observableMap);

    private static native void nativeStopListening(long j);

    private static native long nativeValues(long j);

    public OsMap(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm osSharedRealmOnTransact = uncheckedRow.getTable().onTransact();
        long[] jArrNativeCreate = nativeCreate(osSharedRealmOnTransact.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.onExtraCallback = jArrNativeCreate[0];
        if (jArrNativeCreate[1] != -1) {
            this.onWarmupCompleted = new Table(osSharedRealmOnTransact, jArrNativeCreate[1]);
        } else {
            this.onWarmupCompleted = null;
        }
        access21700 access21700Var = osSharedRealmOnTransact.context;
        this.onExtraCallbackWithResult = access21700Var;
        access21700Var.onWarmupCompleted(this);
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onExtraCallback;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onNavigationEvent;
    }

    public long onWarmupCompleted() {
        return nativeSize(this.onExtraCallback);
    }

    public boolean onExtraCallback(@Nullable Object obj) {
        if (obj == null) {
            return nativeContainsNull(this.onExtraCallback);
        }
        if (obj instanceof Integer) {
            return nativeContainsLong(this.onExtraCallback, ((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return nativeContainsLong(this.onExtraCallback, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return nativeContainsDouble(this.onExtraCallback, ((Double) obj).doubleValue());
        }
        if (obj instanceof Short) {
            return nativeContainsLong(this.onExtraCallback, ((Short) obj).longValue());
        }
        if (obj instanceof Byte) {
            return nativeContainsLong(this.onExtraCallback, ((Byte) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return nativeContainsBoolean(this.onExtraCallback, ((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return nativeContainsString(this.onExtraCallback, (String) obj);
        }
        if (obj instanceof Byte[]) {
            return nativeContainsBinary(this.onExtraCallback, access22700.onExtraCallbackWithResult((Byte[]) obj));
        }
        if (obj instanceof byte[]) {
            return nativeContainsBinary(this.onExtraCallback, (byte[]) obj);
        }
        if (obj instanceof Float) {
            return nativeContainsFloat(this.onExtraCallback, ((Float) obj).floatValue());
        }
        if (obj instanceof UUID) {
            return nativeContainsUUID(this.onExtraCallback, obj.toString());
        }
        if (obj instanceof ObjectId) {
            return nativeContainsObjectId(this.onExtraCallback, ((ObjectId) obj).toString());
        }
        if (obj instanceof Date) {
            return nativeContainsDate(this.onExtraCallback, ((Date) obj).getTime());
        }
        if (obj instanceof Decimal128) {
            Decimal128 decimal128 = (Decimal128) obj;
            return nativeContainsDecimal128(this.onExtraCallback, decimal128.onExtraCallbackWithResult(), decimal128.onNavigationEvent());
        }
        throw new IllegalArgumentException("Invalid object type: " + obj.getClass().getCanonicalName());
    }

    public boolean IAuthTabCallback(long j) {
        return nativeContainsRealmAny(this.onExtraCallback, j);
    }

    public boolean onExtraCallbackWithResult(long j, long j2) {
        return nativeContainsRealmModel(this.onExtraCallback, j, j2);
    }

    public void IAuthTabCallback() {
        nativeClear(this.onExtraCallback);
    }

    public void onNavigationEvent(Object obj, @Nullable Object obj2) {
        if (obj2 == null) {
            try {
                nativePutNull(this.onExtraCallback, (String) obj);
                return;
            } catch (IllegalArgumentException e) {
                if (e.getMessage().contains("Value cannot be null")) {
                    throw new NullPointerException(e.getMessage());
                }
                throw e;
            }
        }
        String canonicalName = obj2.getClass().getCanonicalName();
        if (Long.class.getCanonicalName().equals(canonicalName)) {
            nativePutLong(this.onExtraCallback, (String) obj, ((Long) obj2).longValue());
            return;
        }
        if (Integer.class.getCanonicalName().equals(canonicalName)) {
            nativePutLong(this.onExtraCallback, (String) obj, ((Integer) obj2).intValue());
            return;
        }
        if (Short.class.getCanonicalName().equals(canonicalName)) {
            nativePutLong(this.onExtraCallback, (String) obj, ((Short) obj2).shortValue());
            return;
        }
        if (Byte.class.getCanonicalName().equals(canonicalName)) {
            nativePutLong(this.onExtraCallback, (String) obj, ((Byte) obj2).byteValue());
            return;
        }
        if (Float.class.getCanonicalName().equals(canonicalName)) {
            nativePutFloat(this.onExtraCallback, (String) obj, ((Float) obj2).floatValue());
            return;
        }
        if (Double.class.getCanonicalName().equals(canonicalName)) {
            nativePutDouble(this.onExtraCallback, (String) obj, ((Double) obj2).doubleValue());
            return;
        }
        if (String.class.getCanonicalName().equals(canonicalName)) {
            nativePutString(this.onExtraCallback, (String) obj, (String) obj2);
            return;
        }
        if (Boolean.class.getCanonicalName().equals(canonicalName)) {
            nativePutBoolean(this.onExtraCallback, (String) obj, ((Boolean) obj2).booleanValue());
            return;
        }
        if (Date.class.getCanonicalName().equals(canonicalName)) {
            nativePutDate(this.onExtraCallback, (String) obj, ((Date) obj2).getTime());
            return;
        }
        if (Decimal128.class.getCanonicalName().equals(canonicalName)) {
            Decimal128 decimal128 = (Decimal128) obj2;
            nativePutDecimal128(this.onExtraCallback, (String) obj, decimal128.onExtraCallbackWithResult(), decimal128.onNavigationEvent());
            return;
        }
        if (Byte[].class.getCanonicalName().equals(canonicalName)) {
            nativePutBinary(this.onExtraCallback, (String) obj, access22700.onExtraCallbackWithResult((Byte[]) obj2));
            return;
        }
        if (byte[].class.getCanonicalName().equals(canonicalName)) {
            nativePutBinary(this.onExtraCallback, (String) obj, (byte[]) obj2);
            return;
        }
        if (ObjectId.class.getCanonicalName().equals(canonicalName)) {
            nativePutObjectId(this.onExtraCallback, (String) obj, ((ObjectId) obj2).toString());
            return;
        }
        if (UUID.class.getCanonicalName().equals(canonicalName)) {
            nativePutUUID(this.onExtraCallback, (String) obj, obj2.toString());
            return;
        }
        throw new UnsupportedOperationException("Class '" + canonicalName + "' not supported.");
    }

    public void onExtraCallback(Object obj, long j) {
        nativePutRealmAny(this.onExtraCallback, (String) obj, j);
    }

    public void onNavigationEvent(Object obj) {
        nativeRemove(this.onExtraCallback, (String) obj);
    }

    public long onExtraCallbackWithResult(Object obj) {
        return nativeGetRow(this.onExtraCallback, (String) obj);
    }

    public long onWarmupCompleted(Object obj) {
        return nativeGetRealmAnyPtr(this.onExtraCallback, (String) obj);
    }

    public <K> access23600<K, Object> onNavigationEvent(int i) {
        Object[] objArrNativeGetEntryForPrimitive = nativeGetEntryForPrimitive(this.onExtraCallback, i);
        return new access23600<>((String) objArrNativeGetEntryForPrimitive[0], objArrNativeGetEntryForPrimitive[1]);
    }

    public <K> access23600<K, Long> onExtraCallbackWithResult(int i) {
        Object[] objArrNativeGetEntryForModel = nativeGetEntryForModel(this.onExtraCallback, i);
        String str = (String) objArrNativeGetEntryForModel[0];
        Long l = (Long) objArrNativeGetEntryForModel[1];
        if (l.longValue() == -1) {
            return new access23600<>(str, -1L);
        }
        return new access23600<>(str, l);
    }

    public <K> access23600<K, NativeRealmAny> onExtraCallback(int i) {
        Object[] objArrNativeGetEntryForRealmAny = nativeGetEntryForRealmAny(this.onExtraCallback, i);
        return new access23600<>((String) objArrNativeGetEntryForRealmAny[0], new NativeRealmAny(((Long) objArrNativeGetEntryForRealmAny[1]).longValue()));
    }
}
