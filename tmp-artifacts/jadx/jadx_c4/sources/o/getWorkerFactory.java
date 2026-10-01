package o;

import android.widget.FrameLayout;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getWorkerFactory {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ FrameLayout.LayoutParams onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout.LayoutParams layoutParamsOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutParamsOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final FrameLayout.LayoutParams onExtraCallbackWithResult() {
        int i = 2 % 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return layoutParams;
    }
}
