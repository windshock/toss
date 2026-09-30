package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaeOaVtgql0MWPnFumztkNWmywOY {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final long onWarmupCompleted;

    public /* synthetic */ r8lambdaeOaVtgql0MWPnFumztkNWmywOY(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private r8lambdaeOaVtgql0MWPnFumztkNWmywOY(long j) {
        this.onWarmupCompleted = j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
