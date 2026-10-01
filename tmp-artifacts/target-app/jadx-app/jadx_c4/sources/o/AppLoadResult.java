package o;

import im.toss.di.TossPayThirdPartyModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppLoadResult implements captureStartValues<applyShow> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<GeckoHubImp> IAuthTabCallback;
    private final createAnimators<TextRoundCornerProgressBarSavedState1> onNavigationEvent;
    private final createAnimators<Record> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        applyShow applyshowOnWarmupCompleted = onWarmupCompleted();
        int i3 = onExtraCallbackWithResult + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return applyshowOnWarmupCompleted;
        }
        throw null;
    }

    public applyShow onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback((Record) this.onWarmupCompleted.get(), (GeckoHubImp) this.IAuthTabCallback.get(), (TextRoundCornerProgressBarSavedState1) this.onNavigationEvent.get());
            throw null;
        }
        applyShow applyshowIAuthTabCallback = IAuthTabCallback((Record) this.onWarmupCompleted.get(), (GeckoHubImp) this.IAuthTabCallback.get(), (TextRoundCornerProgressBarSavedState1) this.onNavigationEvent.get());
        int i3 = onExtraCallback + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return applyshowIAuthTabCallback;
        }
        throw null;
    }

    public static applyShow IAuthTabCallback(Record record, GeckoHubImp geckoHubImp, TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        applyShow applyshow = (applyShow) createAnimator.onNavigationEvent(TossPayThirdPartyModule.IAuthTabCallback.onNavigationEvent(record, geckoHubImp, textRoundCornerProgressBarSavedState1));
        int i4 = onExtraCallbackWithResult + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return applyshow;
    }
}
