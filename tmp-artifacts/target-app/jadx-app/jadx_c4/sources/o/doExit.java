package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class doExit implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final createAnimators<ResourceUriFetcherFactory> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnNavigationEvent = onNavigationEvent();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return textRoundCornerProgressBarSavedState1OnNavigationEvent;
    }

    public TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) this.onNavigationEvent.get();
        if (i3 != 0) {
            return onWarmupCompleted(resourceUriFetcherFactory);
        }
        onWarmupCompleted(resourceUriFetcherFactory);
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onWarmupCompleted(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.onRelationshipValidationResult(resourceUriFetcherFactory));
        int i4 = onExtraCallback + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
