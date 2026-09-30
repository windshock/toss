package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class putJsonValue implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final createAnimators<ResourceUriFetcherFactory> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) this.onWarmupCompleted.get();
        if (i3 != 0) {
            return onExtraCallbackWithResult(resourceUriFetcherFactory);
        }
        onExtraCallbackWithResult(resourceUriFetcherFactory);
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.onExtraCallback(resourceUriFetcherFactory));
        if (i3 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
