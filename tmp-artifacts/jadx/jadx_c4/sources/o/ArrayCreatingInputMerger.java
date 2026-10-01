package o;

import im.toss.base.impl.BaseDelegateProviderModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ArrayCreatingInputMerger implements captureStartValues<JFunction2> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<TextRoundCornerProgressBarSavedState1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    public JFunction2 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        JFunction2 jFunction2IAuthTabCallback = IAuthTabCallback((TextRoundCornerProgressBarSavedState1) this.onWarmupCompleted.get());
        int i4 = onExtraCallback + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return jFunction2IAuthTabCallback;
        }
        throw null;
    }

    public static JFunction2 IAuthTabCallback(TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        JFunction2 jFunction2 = (JFunction2) createAnimator.onNavigationEvent(BaseDelegateProviderModule.IAuthTabCallback.onWarmupCompleted(textRoundCornerProgressBarSavedState1));
        int i4 = onNavigationEvent + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jFunction2;
    }
}
