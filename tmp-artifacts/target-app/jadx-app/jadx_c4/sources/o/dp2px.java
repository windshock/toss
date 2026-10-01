package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class dp2px implements getMax {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final getMax IAuthTabCallback;
    private final getSecondaryProgress onExtraCallback;
    private final TextRoundCornerProgressBarSavedState onExtraCallbackWithResult;

    public dp2px(@NotNull getMax getmax, @Nullable TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState) {
        Intrinsics.checkNotNullParameter(getmax, "");
        this.IAuthTabCallback = getmax;
        this.onExtraCallbackWithResult = textRoundCornerProgressBarSavedState;
        this.onExtraCallback = new getSecondaryProgress();
    }

    @Override // o.getMax
    public String onNavigationEvent(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        drawAll drawall = new drawAll(this.IAuthTabCallback, true, str, str2);
        String strOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(drawall);
        if (strOnWarmupCompleted != null) {
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return strOnWarmupCompleted;
            }
            throw null;
        }
        try {
            String strOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(str, str2);
            this.onExtraCallback.onExtraCallbackWithResult(drawall, strOnNavigationEvent);
            return strOnNavigationEvent;
        } catch (Throwable th) {
            TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState = this.onExtraCallbackWithResult;
            if (textRoundCornerProgressBarSavedState != null) {
                textRoundCornerProgressBarSavedState.onNavigationEvent("value encode", th);
                int i3 = onNavigationEvent + 85;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            throw th;
        }
    }

    @Override // o.getMax
    public String IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        drawAll drawall = new drawAll(this.IAuthTabCallback, false, str, str2);
        String strOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(drawall);
        if (strOnWarmupCompleted == null) {
            try {
                String strIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(str, str2);
                this.onExtraCallback.onExtraCallbackWithResult(drawall, strIAuthTabCallback);
                return strIAuthTabCallback;
            } catch (Throwable th) {
                TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState = this.onExtraCallbackWithResult;
                if (textRoundCornerProgressBarSavedState != null) {
                    textRoundCornerProgressBarSavedState.onNavigationEvent("value decode", th);
                }
                throw th;
            }
        }
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }
}
