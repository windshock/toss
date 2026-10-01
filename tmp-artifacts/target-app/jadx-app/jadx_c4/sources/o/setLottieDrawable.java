package o;

import android.content.Context;
import im.toss.components.tuba.variable.v2.impl.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setLottieDrawable implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<Context> IAuthTabCallback;
    private final createAnimators<DiskLruCacheExternalSyntheticLambda0> onExtraCallbackWithResult;
    private final createAnimators<supports> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
        }
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.IAuthTabCallback.get();
        if (i3 != 0) {
            return onExtraCallbackWithResult((Context) obj, (supports) this.onNavigationEvent.get(), (DiskLruCacheExternalSyntheticLambda0) this.onExtraCallbackWithResult.get());
        }
        onExtraCallbackWithResult((Context) obj, (supports) this.onNavigationEvent.get(), (DiskLruCacheExternalSyntheticLambda0) this.onExtraCallbackWithResult.get());
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(Context context, supports supportsVar, DiskLruCacheExternalSyntheticLambda0 diskLruCacheExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent(PrefsModule.onExtraCallback.onWarmupCompleted(context, supportsVar, diskLruCacheExternalSyntheticLambda0));
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }
}
