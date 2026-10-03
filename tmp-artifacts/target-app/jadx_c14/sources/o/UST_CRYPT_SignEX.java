package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_SignEX {
    public static final UST_CRYPT_SignEX onWarmupCompleted = new UST_CRYPT_SignEX();
    private static final AtomicInteger onExtraCallback = new AtomicInteger(0);
    public static final int onNavigationEvent = 8;

    private UST_CRYPT_SignEX() {
    }

    public final int onExtraCallback() {
        return onExtraCallback.incrementAndGet();
    }
}
