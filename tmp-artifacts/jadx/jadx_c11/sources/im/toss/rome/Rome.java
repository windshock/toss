package im.toss.rome;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Rome {
    public static final Rome IAuthTabCallback = new Rome();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static {
        int i = onExtraCallbackWithResult + 67;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private Rome() {
    }
}
