package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addJsBridgeReadyListener implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAnimators<ResourceUriFetcherFactory> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted((ResourceUriFetcherFactory) this.IAuthTabCallback.get());
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    public static TextRoundCornerProgressBarSavedState1 onWarmupCompleted(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RequestPostMessageChannelWithExtras = PrefsModule.onWarmupCompleted.requestPostMessageChannelWithExtras(resourceUriFetcherFactory);
        if (i3 != 0) {
            return (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(textRoundCornerProgressBarSavedState1RequestPostMessageChannelWithExtras);
        }
        throw null;
    }
}
