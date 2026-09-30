package o;

import android.content.Context;
import im.toss.components.sharedpreferences.di.BaseDataModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealDiskCache implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<SubcomposeAsyncImageKtExternalSyntheticLambda3> onExtraCallback;
    private final createAnimators<Context> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = IAuthTabCallback((Context) this.onWarmupCompleted.get(), (SubcomposeAsyncImageKtExternalSyntheticLambda3) this.onExtraCallback.get());
        int i4 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1IAuthTabCallback;
        }
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 IAuthTabCallback(Context context, SubcomposeAsyncImageKtExternalSyntheticLambda3 subcomposeAsyncImageKtExternalSyntheticLambda3) {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(BaseDataModule.onExtraCallback.onExtraCallback(context, subcomposeAsyncImageKtExternalSyntheticLambda3));
            int i3 = 54 / 0;
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(BaseDataModule.onExtraCallback.onExtraCallback(context, subcomposeAsyncImageKtExternalSyntheticLambda3));
        }
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
