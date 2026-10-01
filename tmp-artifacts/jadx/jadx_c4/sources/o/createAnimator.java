package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class createAnimator {
    public static <T> T onWarmupCompleted(T t) {
        return t;
    }

    public static <T> T onNavigationEvent(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T IAuthTabCallback(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> void IAuthTabCallback(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }
}
