package im.toss.compose.widget.ptr;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.LottieDrawableExternalSyntheticLambda2;
import o.LottieDrawableExternalSyntheticLambda3;
import o.flipHorizontally;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsPullToRefreshContainerKt$$ExternalSyntheticLambda22 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LottieDrawableExternalSyntheticLambda3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LottieDrawableExternalSyntheticLambda2.IAuthTabCallback(this.f$0, (flipHorizontally) obj);
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
