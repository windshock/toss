package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class createGradientDrawable implements getProgressColor {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final TextRoundCornerProgressBarSavedState onExtraCallback;
    private final getProgressColor onNavigationEvent;
    private final getSecondaryProgress onWarmupCompleted;

    public createGradientDrawable(@NotNull getProgressColor getprogresscolor, @Nullable TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState) {
        Intrinsics.checkNotNullParameter(getprogresscolor, "");
        this.onNavigationEvent = getprogresscolor;
        this.onExtraCallback = textRoundCornerProgressBarSavedState;
        this.onWarmupCompleted = new getSecondaryProgress();
    }

    @Override // o.getProgressColor
    public String onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        drawAll drawall = new drawAll(this.onNavigationEvent, true, str, null, 8, null);
        String strOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(drawall);
        if (strOnWarmupCompleted != null) {
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return strOnWarmupCompleted;
        }
        try {
            String strOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(str);
            this.onWarmupCompleted.onExtraCallbackWithResult(drawall, strOnExtraCallbackWithResult);
            int i4 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        } catch (Throwable th) {
            TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState = this.onExtraCallback;
            if (textRoundCornerProgressBarSavedState != null) {
                textRoundCornerProgressBarSavedState.onNavigationEvent("key encode", th);
            }
            throw th;
        }
    }

    @Override // o.getProgressColor
    public String onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        drawAll drawall = new drawAll(this.onNavigationEvent, false, str, null, 8, null);
        String strOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(drawall);
        if (strOnWarmupCompleted != null) {
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 99 / 0;
            }
            return strOnWarmupCompleted;
        }
        try {
            String strOnWarmupCompleted2 = this.onNavigationEvent.onWarmupCompleted(str);
            this.onWarmupCompleted.onExtraCallbackWithResult(drawall, strOnWarmupCompleted2);
            return strOnWarmupCompleted2;
        } catch (Throwable th) {
            TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState = this.onExtraCallback;
            if (textRoundCornerProgressBarSavedState != null) {
                textRoundCornerProgressBarSavedState.onNavigationEvent("key decode", th);
                int i4 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            throw th;
        }
    }
}
