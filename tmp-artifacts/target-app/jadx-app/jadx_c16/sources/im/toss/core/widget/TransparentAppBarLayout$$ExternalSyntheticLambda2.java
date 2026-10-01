package im.toss.core.widget;

import im.toss.core.widget.TransparentAppBarLayout;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransparentAppBarLayout$$ExternalSyntheticLambda2 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ TransparentAppBarLayout f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TransparentAppBarLayout.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = TransparentAppBarLayout.onExtraCallbackWithResult(this.f$0);
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iAuthTabCallbackOnExtraCallbackWithResult;
        }
        throw null;
    }
}
