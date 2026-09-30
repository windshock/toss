package im.toss.devtool.noop.di;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda8;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class DevToolTubaDistributionModule$IAuthTabCallback implements UtilsKtExternalSyntheticLambda8 {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(DevToolTubaDistributionModule$IAuthTabCallback.class);

    public void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 29) & 1) != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 28) & 1;
        Intrinsics.checkNotNullParameter(str, "");
        if (i5 == 0) {
            return null;
        }
        int i6 = 32 / 0;
        return null;
    }

    @Inject
    public DevToolTubaDistributionModule$IAuthTabCallback() {
    }
}
