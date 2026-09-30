package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface getTextProgressMargin {
    drawTextProgressSize onNavigationEvent(int i, @NotNull String str, @NotNull String str2, @NotNull getProgressText getprogresstext);

    void onWarmupCompleted(int i);

    default drawTextProgressSize onExtraCallback(int i, @NotNull String str, @NotNull String str2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return onNavigationEvent(i, str, str2, getProgressText.MainTabClick);
    }
}
