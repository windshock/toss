package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addRenderReadyListener implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<ResourceUriFetcherFactory> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
            int i3 = 18 / 0;
        } else {
            textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onNavigationEvent + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent((ResourceUriFetcherFactory) this.onExtraCallbackWithResult.get());
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnNavigationEvent = onNavigationEvent((ResourceUriFetcherFactory) this.onExtraCallbackWithResult.get());
        int i3 = onExtraCallback + 33;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1OnNavigationEvent;
        }
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onNavigationEvent(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.requestPostMessageChannel(resourceUriFetcherFactory));
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }
}
