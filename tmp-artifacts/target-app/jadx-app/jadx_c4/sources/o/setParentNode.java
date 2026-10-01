package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setParentNode implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<ResourceUriFetcherFactory> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnNavigationEvent = onNavigationEvent();
        int i3 = onExtraCallback + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnNavigationEvent;
        }
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult((ResourceUriFetcherFactory) this.onWarmupCompleted.get());
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult((ResourceUriFetcherFactory) this.onWarmupCompleted.get());
        int i3 = onExtraCallback + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult;
        }
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.onActivityResized(resourceUriFetcherFactory));
        int i3 = onNavigationEvent + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
