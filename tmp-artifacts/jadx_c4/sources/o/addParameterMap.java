package o;

import android.content.Context;
import im.toss.feature.bank.prefs.di.BankPrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addParameterMap implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final createAnimators<Context> IAuthTabCallback;
    private final createAnimators<getProgressColor> onExtraCallbackWithResult;
    private final createAnimators<getMax> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnNavigationEvent = onNavigationEvent();
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return textRoundCornerProgressBarSavedState1OnNavigationEvent;
    }

    public TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Context context = (Context) this.IAuthTabCallback.get();
        if (i3 != 0) {
            return onWarmupCompleted(context, (getProgressColor) this.onExtraCallbackWithResult.get(), (getMax) this.onNavigationEvent.get());
        }
        onWarmupCompleted(context, (getProgressColor) this.onExtraCallbackWithResult.get(), (getMax) this.onNavigationEvent.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onWarmupCompleted(Context context, getProgressColor getprogresscolor, getMax getmax) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = BankPrefsModule.onExtraCallback.onWarmupCompleted(context, getprogresscolor, getmax);
        if (i3 == 0) {
            return (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(textRoundCornerProgressBarSavedState1OnWarmupCompleted);
        }
        throw null;
    }
}
