package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fromDescriptor {
    public static <T> T onExtraCallbackWithResult(T t, String str) {
        try {
            return (T) Class.forName(str).getDeclaredMethod("getNoop", null).invoke(null, null);
        } catch (Exception unused) {
            return t;
        }
    }
}
