package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class putIntValue implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<ResourceUriFetcherFactory> onExtraCallback;

    public /* synthetic */ Object get() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 23 / 0;
        } else {
            textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult;
        }
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult((ResourceUriFetcherFactory) this.onExtraCallback.get());
        int i4 = IAuthTabCallback + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.onNavigationEvent(resourceUriFetcherFactory));
        int i4 = onNavigationEvent + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
