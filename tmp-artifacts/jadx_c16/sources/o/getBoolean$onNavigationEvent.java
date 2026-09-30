package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getBoolean$onNavigationEvent extends getBoolean {
    public static final getBoolean$onNavigationEvent IAuthTabCallback = new getBoolean$onNavigationEvent();
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 69;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private getBoolean$onNavigationEvent() {
        super(false, 1, (DefaultConstructorMarker) null);
    }
}
