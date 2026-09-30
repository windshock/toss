package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pmi10 {
    public static <T> T onExtraCallbackWithResult(String str, T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str + " can not be null");
    }

    public static void onExtraCallbackWithResult(String str, boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }

    public static <T> T onExtraCallbackWithResult(String str, T t, boolean z) {
        if (z) {
            return t;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }
}
