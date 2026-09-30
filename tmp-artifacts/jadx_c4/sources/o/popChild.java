package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class popChild implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<ResourceUriFetcherFactory> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback();
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.IAuthTabCallback.get();
        if (i3 == 0) {
            return IAuthTabCallback((ResourceUriFetcherFactory) obj);
        }
        IAuthTabCallback((ResourceUriFetcherFactory) obj);
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 IAuthTabCallback(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.IAuthTabCallback(resourceUriFetcherFactory));
            int i3 = 38 / 0;
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.IAuthTabCallback(resourceUriFetcherFactory));
        }
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
