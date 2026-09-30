package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setTopGuideFontStyle$IAuthTabCallback_Parcel extends setTopGuideFontStyle {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final String onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTopGuideFontStyle$IAuthTabCallback_Parcel(@NotNull String str, @NotNull String str2) {
        super(str, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = str2;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }
}
