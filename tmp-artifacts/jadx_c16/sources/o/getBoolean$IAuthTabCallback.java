package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getBoolean$IAuthTabCallback extends getBoolean {
    private static int onExtraCallback = 0;
    public static final getBoolean$IAuthTabCallback onExtraCallbackWithResult = new getBoolean$IAuthTabCallback();
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 93;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private getBoolean$IAuthTabCallback() {
        super(false, 1, (DefaultConstructorMarker) null);
    }
}
