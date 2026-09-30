package im.toss.tds.compose.component.theme.component;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RatingColorScheme {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public /* synthetic */ RatingColorScheme(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private RatingColorScheme(long j, long j2, long j3) {
        this.onExtraCallbackWithResult = j;
        this.onWarmupCompleted = j2;
        this.onExtraCallback = j3;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i2 + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallback;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
