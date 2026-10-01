package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class putJsonArrayValue implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createAnimators<ResourceUriFetcherFactory> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback((ResourceUriFetcherFactory) this.onNavigationEvent.get());
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = IAuthTabCallback((ResourceUriFetcherFactory) this.onNavigationEvent.get());
        int i3 = onExtraCallbackWithResult + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public static TextRoundCornerProgressBarSavedState1 IAuthTabCallback(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.onWarmupCompleted(resourceUriFetcherFactory));
        int i4 = onExtraCallbackWithResult + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
