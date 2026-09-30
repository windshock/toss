package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getForegroundInfo implements JFunction2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult;

    @Inject
    public getForegroundInfo(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onExtraCallbackWithResult = textRoundCornerProgressBarSavedState1;
    }

    @Override // o.JFunction2
    public <T> T onWarmupCompleted(@NotNull String str, @NotNull T t) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(t, "");
            return (T) this.onExtraCallbackWithResult.onExtraCallback(str, t);
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.onExtraCallbackWithResult.onExtraCallback(str, t);
        throw null;
    }

    @Override // o.JFunction2
    public <T> void onExtraCallbackWithResult(@NotNull String str, @NotNull T t, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.onExtraCallbackWithResult.onWarmupCompleted(str, (String) t, z);
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
