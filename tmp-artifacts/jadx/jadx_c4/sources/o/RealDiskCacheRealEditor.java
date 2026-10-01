package o;

import android.content.Context;
import im.toss.components.sharedpreferences.di.factory.PrefsFactoryModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealDiskCacheRealEditor implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<getProgressColor> IAuthTabCallback;
    private final createAnimators<Context> onExtraCallback;
    private final createAnimators<getMax> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallback.get();
        if (i3 != 0) {
            return IAuthTabCallback((Context) obj, (getProgressColor) this.IAuthTabCallback.get(), (getMax) this.onWarmupCompleted.get());
        }
        int i4 = 36 / 0;
        return IAuthTabCallback((Context) obj, (getProgressColor) this.IAuthTabCallback.get(), (getMax) this.onWarmupCompleted.get());
    }

    public static TextRoundCornerProgressBarSavedState1 IAuthTabCallback(Context context, getProgressColor getprogresscolor, getMax getmax) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsFactoryModule.onNavigationEvent.onNavigationEvent(context, getprogresscolor, getmax));
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
