package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class fillParamWithConfigModel implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<ResourceUriFetcherFactory> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback();
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) this.onNavigationEvent.get();
        if (i3 == 0) {
            return onNavigationEvent(resourceUriFetcherFactory);
        }
        onNavigationEvent(resourceUriFetcherFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onNavigationEvent(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.newAuthTabSession(resourceUriFetcherFactory));
            int i3 = 22 / 0;
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.newAuthTabSession(resourceUriFetcherFactory));
        }
        int i4 = IAuthTabCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
