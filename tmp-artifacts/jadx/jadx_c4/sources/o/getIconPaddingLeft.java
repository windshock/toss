package o;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getIconPaddingLeft extends getIconPaddingRight<Object> {
    public static final getIconPaddingLeft IAuthTabCallback = new getIconPaddingLeft();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 45;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private getIconPaddingLeft() {
        getTimestampBytes gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        super("globalNonStickyBusBus", gettimestampbytesIAuthTabCallback);
    }
}
