package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAdError {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final long onExtraCallbackWithResult;

    public /* synthetic */ getAdError(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private getAdError(long j) {
        this.onExtraCallbackWithResult = j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        int i3 = 39 / 0;
        return this.onExtraCallbackWithResult;
    }
}
