package o;

import android.content.Context;
import im.toss.tosssecurities.tuba.variable.v2.impl.di.LocalSettingPrefsModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1vSDK2 implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<Context> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public TextRoundCornerProgressBarSavedState1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult((Context) this.onExtraCallbackWithResult.get());
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult((Context) this.onExtraCallbackWithResult.get());
        int i3 = onWarmupCompleted + 63;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(LocalSettingPrefsModule.onNavigationEvent.onExtraCallbackWithResult(context));
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
