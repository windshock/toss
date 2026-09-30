package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class putBooleanValue implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<ResourceUriFetcherFactory> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback();
        int i3 = onNavigationEvent + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback((ResourceUriFetcherFactory) this.IAuthTabCallback.get());
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallback(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.onExtraCallbackWithResult(resourceUriFetcherFactory));
        int i3 = onWarmupCompleted + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
