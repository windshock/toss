package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setWebContentBg implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createAnimators<ResourceUriFetcherFactory> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback((ResourceUriFetcherFactory) this.onNavigationEvent.get());
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback((ResourceUriFetcherFactory) this.onNavigationEvent.get());
        int i3 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallback(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.setEngagementSignalsCallback(resourceUriFetcherFactory));
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
