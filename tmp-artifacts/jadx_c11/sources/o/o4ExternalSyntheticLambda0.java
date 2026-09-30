package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o4ExternalSyntheticLambda0 implements r8lambda87fRNsORQVq76SotLLUbTbiqM {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @Override // o.r8lambda87fRNsORQVq76SotLLUbTbiqM
    public void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = onExtraCallback + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }
}
