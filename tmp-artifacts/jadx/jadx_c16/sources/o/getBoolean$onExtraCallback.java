package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getBoolean$onExtraCallback extends getBoolean {
    private static int onExtraCallbackWithResult = 0;
    public static final getBoolean$onExtraCallback onNavigationEvent = new getBoolean$onExtraCallback();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private getBoolean$onExtraCallback() {
        super(false, 1, (DefaultConstructorMarker) null);
    }
}
