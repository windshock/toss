package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final long onExtraCallback;

    public /* synthetic */ r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw(long j) {
        this.onExtraCallback = j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallback;
        int i5 = i2 + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
