package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z1ExternalSyntheticLambda3 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final long IAuthTabCallback;

    public /* synthetic */ z1ExternalSyntheticLambda3(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private z1ExternalSyntheticLambda3(long j) {
        this.IAuthTabCallback = j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        int i3 = 81 / 0;
        return this.IAuthTabCallback;
    }
}
