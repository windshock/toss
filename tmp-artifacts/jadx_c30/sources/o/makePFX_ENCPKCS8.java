package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class makePFX_ENCPKCS8 {
    public static final int $stable = 0;
    public static final makePFX_ENCPKCS8 INSTANCE = new makePFX_ENCPKCS8();
    public static final String KEY_VIVA = "viva_key";
    public static final String SENDER_ID = "10620215402";
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 27;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private makePFX_ENCPKCS8() {
    }
}
