package o;

import android.content.Context;
import im.toss.components.tuba.variable.v2.impl.di.LocalSettingPrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieAnimationView implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<Context> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnNavigationEvent = onNavigationEvent();
        int i3 = onWarmupCompleted + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnNavigationEvent;
    }

    public TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted((Context) this.onExtraCallback.get());
            int i3 = 15 / 0;
        } else {
            textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted((Context) this.onExtraCallback.get());
        }
        int i4 = onWarmupCompleted + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(LocalSettingPrefsModule.onExtraCallbackWithResult.onWarmupCompleted(context));
        int i4 = onWarmupCompleted + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
