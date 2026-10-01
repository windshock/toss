package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.SnapHelper;
import o.stopIgnoring;
import o.unScrap;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    private static boolean IAuthTabCallback;
    private static final HashMap<String, Parcelable.Creator<?>> IAuthTabCallbackStub;
    private static String asBinder;
    private static final EnumMap<stopIgnoring, Integer> asInterface;
    private static unScrap onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static final stopIgnoring[] onNavigationEvent;
    private static final EnumMap<SnapHelper, Integer> onTransact;
    private static final Set<Long> onWarmupCompleted;
    private final long nativeHandle;

    public interface onNavigationEvent {
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, @Nullable String str3);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z);

    private static native long createNB(int i);

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d);

    private native float decodeFloat(long j, String str, float f);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, @Nullable String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBool_2(long j, String str, boolean z, int i);

    private native boolean encodeBytes(long j, String str, @Nullable byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, @Nullable byte[] bArr, int i);

    private native boolean encodeDouble(long j, String str, double d);

    private native boolean encodeDouble_2(long j, String str, double d, int i);

    private native boolean encodeFloat(long j, String str, float f);

    private native boolean encodeFloat_2(long j, String str, float f, int i);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeInt_2(long j, String str, int i, int i2);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeLong_2(long j, String str, long j2, int i);

    private native boolean encodeSet(long j, String str, @Nullable String[] strArr);

    private native boolean encodeSet_2(long j, String str, @Nullable String[] strArr, int i);

    private native boolean encodeString(long j, String str, @Nullable String str2);

    private native boolean encodeString_2(long j, String str, @Nullable String str2, int i);

    private static native long getDefaultMMKV(int i, @Nullable String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, @Nullable String str2);

    private static native long getMMKVWithID(String str, int i, @Nullable String str2, @Nullable String str3, long j);

    private static native long getMMKVWithIDAndSize(String str, int i, int i2, @Nullable String str2);

    private native boolean isCompareBeforeSetEnabled();

    private native boolean isEncryptionEnabled();

    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, @Nullable String str2);

    private static native void jniInitialize(String str, String str2, int i, boolean z);

    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    public static native int pageSize();

    public static native boolean removeStorage(String str, @Nullable String str2);

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, @Nullable String str3);

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j2, int i);

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@Nullable String str);

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    public native String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i);

    public native void lock();

    public native String mmapID();

    public native boolean reKey(@Nullable String str);

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    static {
        EnumMap<SnapHelper, Integer> enumMap = new EnumMap<>(SnapHelper.class);
        onTransact = enumMap;
        enumMap.put((EnumMap<SnapHelper, Integer>) SnapHelper.OnErrorDiscard, (SnapHelper) 0);
        enumMap.put((EnumMap<SnapHelper, Integer>) SnapHelper.OnErrorRecover, (SnapHelper) 1);
        EnumMap<stopIgnoring, Integer> enumMap2 = new EnumMap<>(stopIgnoring.class);
        asInterface = enumMap2;
        stopIgnoring stopignoring = stopIgnoring.LevelDebug;
        enumMap2.put((EnumMap<stopIgnoring, Integer>) stopignoring, (stopIgnoring) 0);
        stopIgnoring stopignoring2 = stopIgnoring.LevelInfo;
        enumMap2.put((EnumMap<stopIgnoring, Integer>) stopignoring2, (stopIgnoring) 1);
        stopIgnoring stopignoring3 = stopIgnoring.LevelWarning;
        enumMap2.put((EnumMap<stopIgnoring, Integer>) stopignoring3, (stopIgnoring) 2);
        stopIgnoring stopignoring4 = stopIgnoring.LevelError;
        enumMap2.put((EnumMap<stopIgnoring, Integer>) stopignoring4, (stopIgnoring) 3);
        stopIgnoring stopignoring5 = stopIgnoring.LevelNone;
        enumMap2.put((EnumMap<stopIgnoring, Integer>) stopignoring5, (stopIgnoring) 4);
        onNavigationEvent = new stopIgnoring[]{stopignoring, stopignoring2, stopignoring3, stopignoring4, stopignoring5};
        onWarmupCompleted = new HashSet();
        asBinder = null;
        onExtraCallbackWithResult = true;
        IAuthTabCallbackStub = new HashMap<>();
        IAuthTabCallback = false;
    }

    public static String onExtraCallbackWithResult(@NonNull Context context, stopIgnoring stopignoring) {
        return IAuthTabCallback(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, stopignoring, null);
    }

    public static String IAuthTabCallback(@NonNull Context context, String str, onNavigationEvent onnavigationevent, stopIgnoring stopignoring, unScrap unscrap) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            onExtraCallbackWithResult();
        } else {
            onNavigationEvent();
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        onExtraCallback = unscrap;
        if (unscrap != null && unscrap.onExtraCallback()) {
            IAuthTabCallback = true;
        }
        String strOnWarmupCompleted = onWarmupCompleted(str, absolutePath, onnavigationevent, stopignoring, IAuthTabCallback);
        if (onExtraCallback != null) {
            setCallbackHandler(IAuthTabCallback, true);
        }
        return strOnWarmupCompleted;
    }

    private static String onWarmupCompleted(String str, String str2, onNavigationEvent onnavigationevent, stopIgnoring stopignoring, boolean z) {
        if (onnavigationevent == null) {
            System.loadLibrary("mmkv");
        }
        jniInitialize(str, str2, IAuthTabCallback(stopignoring), z);
        asBinder = str;
        return str;
    }

    /* renamed from: com.tencent.mmkv.MMKV$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[stopIgnoring.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[stopIgnoring.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[stopIgnoring.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[stopIgnoring.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[stopIgnoring.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallbackWithResult[stopIgnoring.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static int IAuthTabCallback(@NonNull stopIgnoring stopignoring) {
        int i = AnonymousClass4.onExtraCallbackWithResult[stopignoring.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return 1;
                }
            }
        }
        return i2;
    }

    public static MMKV IAuthTabCallback(String str, int i, @Nullable String str2) throws RuntimeException {
        if (asBinder == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        return onExtraCallback(getMMKVWithID(str, i, str2, null, 0L), str, i);
    }

    public static MMKV onExtraCallback(String str, String str2) throws RuntimeException {
        if (asBinder == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        return onExtraCallback(getMMKVWithID(str, 1, null, str2, 0L), str, 1);
    }

    public static MMKV onNavigationEvent(String str, int i, @Nullable String str2, String str3) throws RuntimeException {
        if (asBinder == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        return onExtraCallback(getMMKVWithID(str, i, str2, str3, 0L), str, i);
    }

    private static MMKV onExtraCallback(long j, String str, int i) throws RuntimeException {
        String str2;
        if (j == 0) {
            throw new RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
        }
        if (!onExtraCallbackWithResult) {
            return new MMKV(j);
        }
        Set<Long> set = onWarmupCompleted;
        synchronized (set) {
            if (!set.contains(Long.valueOf(j))) {
                if (!checkProcessMode(j)) {
                    if (i == 1) {
                        str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                    } else {
                        str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                    }
                    throw new IllegalArgumentException(str2);
                }
                set.add(Long.valueOf(j));
            }
        }
        return new MMKV(j);
    }

    public static void onNavigationEvent() {
        synchronized (onWarmupCompleted) {
            onExtraCallbackWithResult = true;
        }
    }

    public static void onExtraCallbackWithResult() {
        synchronized (onWarmupCompleted) {
            onExtraCallbackWithResult = false;
        }
    }

    public boolean onNavigationEvent(String str, @Nullable Set<String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public Set<String> IAuthTabCallback(String str, @Nullable Set<String> set) {
        return onNavigationEvent(str, set, HashSet.class);
    }

    public Set<String> onNavigationEvent(String str, @Nullable Set<String> set, Class<? extends Set> cls) throws IllegalAccessException, InstantiationException {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set<String> setNewInstance = cls.newInstance();
                setNewInstance.addAll(Arrays.asList(strArrDecodeStringSet));
                return setNewInstance;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    private byte[] onExtraCallbackWithResult(@NonNull Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public boolean IAuthTabCallback(String str, @Nullable Parcelable parcelable) {
        if (parcelable == null) {
            return encodeBytes(this.nativeHandle, str, null);
        }
        return encodeBytes(this.nativeHandle, str, onExtraCallbackWithResult(parcelable));
    }

    public <T extends Parcelable> T onExtraCallback(String str, Class<T> cls, @Nullable T t) {
        byte[] bArrDecodeBytes;
        Parcelable.Creator<?> creator;
        if (cls == null || (bArrDecodeBytes = decodeBytes(this.nativeHandle, str)) == null) {
            return t;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrDecodeBytes, 0, bArrDecodeBytes.length);
        parcelObtain.setDataPosition(0);
        try {
            String string = cls.toString();
            HashMap<String, Parcelable.Creator<?>> map = IAuthTabCallbackStub;
            synchronized (map) {
                creator = map.get(string);
                if (creator == null && (creator = (Parcelable.Creator) cls.getField("CREATOR").get(null)) != null) {
                    map.put(string, creator);
                }
            }
            if (creator != null) {
                return (T) creator.createFromParcel(parcelObtain);
            }
            throw new Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + string);
        } catch (Exception e) {
            onWarmupCompleted(stopIgnoring.LevelError, e.toString());
            return t;
        } finally {
            parcelObtain.recycle();
        }
    }

    public boolean onExtraCallback(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public String[] IAuthTabCallback() {
        return allKeys(this.nativeHandle, false);
    }

    public long onExtraCallback() {
        return count(this.nativeHandle, false);
    }

    public void onNavigationEvent(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public void onWarmupCompleted() {
        sync(true);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, @Nullable String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return IAuthTabCallback(str, set);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        onNavigationEvent(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f) {
        encodeFloat(this.nativeHandle, str, f);
        return this;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        onNavigationEvent(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public void apply() {
        sync(false);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return onExtraCallback(str);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    private static int onMMKVCRCCheckFail(String str) {
        SnapHelper snapHelperOnExtraCallbackWithResult = SnapHelper.OnErrorDiscard;
        unScrap unscrap = onExtraCallback;
        if (unscrap != null) {
            snapHelperOnExtraCallbackWithResult = unscrap.onExtraCallbackWithResult(str);
        }
        onWarmupCompleted(stopIgnoring.LevelInfo, "Recover strategic for " + str + " is " + snapHelperOnExtraCallbackWithResult);
        Integer num = onTransact.get(snapHelperOnExtraCallbackWithResult);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        SnapHelper snapHelperOnExtraCallback = SnapHelper.OnErrorDiscard;
        unScrap unscrap = onExtraCallback;
        if (unscrap != null) {
            snapHelperOnExtraCallback = unscrap.onExtraCallback(str);
        }
        onWarmupCompleted(stopIgnoring.LevelInfo, "Recover strategic for " + str + " is " + snapHelperOnExtraCallback);
        Integer num = onTransact.get(snapHelperOnExtraCallback);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        if (onExtraCallback != null && IAuthTabCallback) {
            stopIgnoring stopignoring = onNavigationEvent[i];
        } else {
            int i3 = AnonymousClass4.onExtraCallbackWithResult[onNavigationEvent[i].ordinal()];
        }
    }

    private static void onWarmupCompleted(stopIgnoring stopignoring, String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = asInterface.get(stopignoring);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private MMKV(long j) {
        this.nativeHandle = j;
    }
}
