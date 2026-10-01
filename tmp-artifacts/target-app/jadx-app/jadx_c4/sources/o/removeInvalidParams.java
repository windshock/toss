package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeInvalidParams implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<ResourceUriFetcherFactory> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback((ResourceUriFetcherFactory) this.onWarmupCompleted.get());
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = IAuthTabCallback((ResourceUriFetcherFactory) this.onWarmupCompleted.get());
        int i3 = onExtraCallback + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public static TextRoundCornerProgressBarSavedState1 IAuthTabCallback(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1PostMessage = PrefsModule.onWarmupCompleted.postMessage(resourceUriFetcherFactory);
        if (i3 != 0) {
            return (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(textRoundCornerProgressBarSavedState1PostMessage);
        }
        throw null;
    }
}
