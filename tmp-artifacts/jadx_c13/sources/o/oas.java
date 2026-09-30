package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class oas {
    public static void onExtraCallback(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    public static void onNavigationEvent(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void onExtraCallback(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    public static void onExtraCallback(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void IAuthTabCallback(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    public static void onNavigationEvent(Object[] objArr) {
        onExtraCallback(objArr, "Array must not contain any null objects");
    }

    public static void onExtraCallback(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static void onExtraCallbackWithResult(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void onExtraCallback(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void onWarmupCompleted(String str) {
        throw new IllegalArgumentException(str);
    }
}
