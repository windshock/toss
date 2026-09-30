package io.realm.internal;

import io.realm.RealmModel;
import io.realm.RealmObject;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.Nullable;
import o.access22900;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Util {
    private static Boolean IAuthTabCallback;
    private static Boolean onExtraCallbackWithResult;

    static native String nativeGetTablePrefix();

    public static String IAuthTabCallback() {
        return nativeGetTablePrefix();
    }

    public static Class<? extends RealmModel> onExtraCallbackWithResult(Class<? extends RealmModel> cls) {
        if (cls.equals(RealmModel.class) || cls.equals(RealmObject.class)) {
            throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
        }
        Class superclass = cls.getSuperclass();
        return (superclass.equals(Object.class) || superclass.equals(RealmObject.class)) ? cls : superclass;
    }

    public static boolean onNavigationEvent(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    public static <T> Set<T> onWarmupCompleted(T... tArr) {
        if (tArr == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : tArr) {
            if (t != null) {
                linkedHashSet.add(t);
            }
        }
        return linkedHashSet;
    }

    public static void IAuthTabCallback(String str, String str2) {
        if (onNavigationEvent(str)) {
            throw new IllegalArgumentException("Non-empty '" + str2 + "' required.");
        }
    }

    public static void onExtraCallback(@Nullable Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("Nonnull '" + str + "' required.");
    }

    public static void onWarmupCompleted(String str) {
        if (new access22900().onExtraCallback()) {
            throw new IllegalStateException(str);
        }
    }

    public static boolean onExtraCallbackWithResult() {
        boolean zBooleanValue;
        synchronized (Util.class) {
            if (IAuthTabCallback == null) {
                try {
                    Class.forName("o.JsonReaderUnknownNumberParsing");
                    IAuthTabCallback = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    IAuthTabCallback = Boolean.FALSE;
                }
                zBooleanValue = IAuthTabCallback.booleanValue();
            } else {
                zBooleanValue = IAuthTabCallback.booleanValue();
            }
        }
        return zBooleanValue;
    }

    public static boolean onNavigationEvent() {
        boolean zBooleanValue;
        synchronized (Util.class) {
            if (onExtraCallbackWithResult == null) {
                try {
                    onExtraCallbackWithResult = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    onExtraCallbackWithResult = Boolean.FALSE;
                }
                zBooleanValue = onExtraCallbackWithResult.booleanValue();
            } else {
                zBooleanValue = onExtraCallbackWithResult.booleanValue();
            }
        }
        return zBooleanValue;
    }
}
