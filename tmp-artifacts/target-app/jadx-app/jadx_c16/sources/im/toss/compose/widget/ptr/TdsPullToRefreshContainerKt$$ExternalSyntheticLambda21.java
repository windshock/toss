package im.toss.compose.widget.ptr;

import kotlin.jvm.functions.Function1;
import o.LottieDrawableExternalSyntheticLambda2;
import o.LottieDrawableExternalSyntheticLambda3;
import o.flipHorizontally;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsPullToRefreshContainerKt$$ExternalSyntheticLambda21 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LottieDrawableExternalSyntheticLambda3 f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ float f$4;
    public final /* synthetic */ float f$5;
    public final /* synthetic */ float f$6;

    public /* synthetic */ TdsPullToRefreshContainerKt$$ExternalSyntheticLambda21(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, float f, float f2, float f3, float f4, float f5, float f6) {
        this.f$0 = lottieDrawableExternalSyntheticLambda3;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = f3;
        this.f$4 = f4;
        this.f$5 = f5;
        this.f$6 = f6;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return LottieDrawableExternalSyntheticLambda2.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (flipHorizontally) obj);
        }
        int i3 = 34 / 0;
        return LottieDrawableExternalSyntheticLambda2.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (flipHorizontally) obj);
    }
}
