package o;

import im.toss.components.tuba.prefs.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class OkHttpNetworkFetcherExternalSyntheticLambda0 implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAnimators<UtilsKtExternalSyntheticLambda4> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onNavigationEvent.get();
        if (i3 == 0) {
            return onExtraCallbackWithResult((UtilsKtExternalSyntheticLambda4) obj);
        }
        onExtraCallbackWithResult((UtilsKtExternalSyntheticLambda4) obj);
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onNavigationEvent.onExtraCallbackWithResult(utilsKtExternalSyntheticLambda4));
        int i4 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
