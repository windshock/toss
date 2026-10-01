package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setData implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<ResourceUriFetcherFactory> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
        int i3 = onNavigationEvent + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = IAuthTabCallback((ResourceUriFetcherFactory) this.onExtraCallbackWithResult.get());
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public static TextRoundCornerProgressBarSavedState1 IAuthTabCallback(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100 = PrefsModule.onWarmupCompleted.access100(resourceUriFetcherFactory);
        if (i3 == 0) {
            return (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(textRoundCornerProgressBarSavedState1Access100);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
