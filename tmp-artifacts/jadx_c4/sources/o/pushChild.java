package o;

import com.google.android.gms.internal.ads.zzaq;
import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class pushChild implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<RealSubcomposeAsyncImageScope> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
        }
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback((RealSubcomposeAsyncImageScope) this.onWarmupCompleted.get());
            int i3 = 89 / 0;
        } else {
            textRoundCornerProgressBarSavedState1OnExtraCallback = onExtraCallback((RealSubcomposeAsyncImageScope) this.onWarmupCompleted.get());
        }
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallback(RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {PrefsModule.onWarmupCompleted, realSubcomposeAsyncImageScope};
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent((TextRoundCornerProgressBarSavedState1) PrefsModule.onWarmupCompleted(zzaq.onNavigationEvent(), 1726783244, objArr, zzaq.onNavigationEvent(), -1726783240, zzaq.onNavigationEvent(), zzaq.onNavigationEvent()));
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }
}
