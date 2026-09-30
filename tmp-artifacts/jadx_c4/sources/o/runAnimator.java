package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class runAnimator {
    public static <T> T onExtraCallback(T t) {
        return t;
    }

    public static <T> T onExtraCallbackWithResult(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void onExtraCallback(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void IAuthTabCallback(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
