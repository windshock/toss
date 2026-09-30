package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class pageNodeDestroy implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAnimators<ResourceUriFetcherFactory> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted((ResourceUriFetcherFactory) this.onExtraCallback.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted((ResourceUriFetcherFactory) this.onExtraCallback.get());
        int i3 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    public static TextRoundCornerProgressBarSavedState1 onWarmupCompleted(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.newSessionWithExtras(resourceUriFetcherFactory));
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
