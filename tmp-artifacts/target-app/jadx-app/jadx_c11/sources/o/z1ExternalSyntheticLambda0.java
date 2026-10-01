package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z1ExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final long onExtraCallback;

    public /* synthetic */ z1ExternalSyntheticLambda0(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private z1ExternalSyntheticLambda0(long j) {
        this.onExtraCallback = j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallback;
        int i5 = i2 + 73;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return j;
    }
}
