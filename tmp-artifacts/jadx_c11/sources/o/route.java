package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class route implements accessinit {
    private static int IAuthTabCallback = 1;
    public static final route onExtraCallback = new route();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 89;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private route() {
    }

    @Override // o.accessinit
    public getORDER_BY_NAMEokhttp onNavigationEvent(float f) {
        int i = 2 % 2;
        Connection connection = new Connection(f);
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return connection;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
