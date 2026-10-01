package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class mExternalSyntheticLambda9 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final mExternalSyntheticLambda6 onExtraCallbackWithResult;
    private final mExternalSyntheticLambda6 onNavigationEvent;

    public mExternalSyntheticLambda9(@NotNull mExternalSyntheticLambda6 mexternalsyntheticlambda6, @Nullable mExternalSyntheticLambda6 mexternalsyntheticlambda62) {
        Intrinsics.checkNotNullParameter(mexternalsyntheticlambda6, "");
        this.onExtraCallbackWithResult = mexternalsyntheticlambda6;
        this.onNavigationEvent = mexternalsyntheticlambda62;
    }

    public final mExternalSyntheticLambda6 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        mExternalSyntheticLambda6 mexternalsyntheticlambda6 = this.onExtraCallbackWithResult;
        int i5 = i2 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return mexternalsyntheticlambda6;
    }

    public final mExternalSyntheticLambda6 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        mExternalSyntheticLambda6 mexternalsyntheticlambda6 = this.onNavigationEvent;
        int i5 = i3 + 103;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return mexternalsyntheticlambda6;
    }
}
