package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class putLongValue implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<ResourceUriFetcherFactory> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = IAuthTabCallback((ResourceUriFetcherFactory) this.IAuthTabCallback.get());
        int i4 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public static TextRoundCornerProgressBarSavedState1 IAuthTabCallback(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.writeTypedObject(resourceUriFetcherFactory));
        int i4 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
