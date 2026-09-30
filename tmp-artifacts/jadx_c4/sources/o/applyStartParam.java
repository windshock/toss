package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class applyStartParam implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<ResourceUriFetcherFactory> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult((ResourceUriFetcherFactory) this.onWarmupCompleted.get());
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult((ResourceUriFetcherFactory) this.onWarmupCompleted.get());
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.ICustomTabsCallbackStubProxy(resourceUriFetcherFactory));
        int i4 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
