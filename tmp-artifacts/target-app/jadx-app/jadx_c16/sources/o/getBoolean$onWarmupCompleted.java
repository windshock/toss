package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getBoolean$onWarmupCompleted extends getBoolean {
    public static final getBoolean$onWarmupCompleted onExtraCallback = new getBoolean$onWarmupCompleted();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 51;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 86 / 0;
        }
    }

    private getBoolean$onWarmupCompleted() {
        super(false, 1, (DefaultConstructorMarker) null);
    }
}
