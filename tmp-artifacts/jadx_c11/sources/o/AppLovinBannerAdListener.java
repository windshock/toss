package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinBannerAdListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ AppLovinBannerAdListener(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private AppLovinBannerAdListener(long j, long j2) {
        this.onNavigationEvent = j;
        this.onWarmupCompleted = j2;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i2 + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.onWarmupCompleted;
        int i4 = i3 + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }
}
