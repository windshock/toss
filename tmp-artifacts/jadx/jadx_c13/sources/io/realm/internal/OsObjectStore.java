package io.realm.internal;

import io.realm.RealmConfiguration;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsObjectStore {
    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native boolean nativeDeleteTableForObject(long j, String str);

    @Nullable
    private static native String nativeGetPrimaryKeyForObject(long j, String str);

    private static native long nativeGetSchemaVersion(long j);

    private static native void nativeSetPrimaryKeyForObject(long j, String str, @Nullable String str2);

    private static native void nativeSetSchemaVersion(long j, long j2);

    public static void IAuthTabCallback(OsSharedRealm osSharedRealm, String str, @Nullable String str2) {
        try {
            nativeSetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.IAuthTabCallback() + str, str2);
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Nullable
    public static String onExtraCallback(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.IAuthTabCallback() + str);
    }

    public static void onExtraCallback(OsSharedRealm osSharedRealm, long j) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j);
    }

    public static long IAuthTabCallback(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    public static boolean IAuthTabCallback(OsSharedRealm osSharedRealm, String str) {
        return nativeDeleteTableForObject(osSharedRealm.getNativePtr(), str);
    }

    public static boolean onExtraCallback(RealmConfiguration realmConfiguration, Runnable runnable) {
        return nativeCallWithLock(realmConfiguration.asInterface(), runnable);
    }
}
