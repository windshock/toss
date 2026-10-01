package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isMultiAdsEnabled {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final long onExtraCallbackWithResult;

    public /* synthetic */ isMultiAdsEnabled(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private isMultiAdsEnabled(long j) {
        this.onExtraCallbackWithResult = j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        int i3 = 47 / 0;
        return this.onExtraCallbackWithResult;
    }
}
