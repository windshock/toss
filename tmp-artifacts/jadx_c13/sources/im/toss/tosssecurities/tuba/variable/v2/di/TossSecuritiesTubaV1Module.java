package im.toss.tosssecurities.tuba.variable.v2.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.AFe1qSDK;
import o.AFe1qSDK1;
import o.AFe1vSDKAFa1tSDK;
import o.addAnimatorPauseListener;
import o.addLottieOnCompositionLoadedListener;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossSecuritiesTubaV1Module {
    public static final TossSecuritiesTubaV1Module IAuthTabCallback = new TossSecuritiesTubaV1Module();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 61;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TossSecuritiesTubaV1Module() {
    }

    @Singleton
    public final AFe1qSDK onExtraCallback(@NotNull AFe1vSDKAFa1tSDK aFe1vSDKAFa1tSDK, @NotNull addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistener, @NotNull addAnimatorPauseListener addanimatorpauselistener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFe1vSDKAFa1tSDK, "");
        Intrinsics.checkNotNullParameter(addlottieoncompositionloadedlistener, "");
        Intrinsics.checkNotNullParameter(addanimatorpauselistener, "");
        AFe1qSDK1 aFe1qSDK1 = new AFe1qSDK1(aFe1vSDKAFa1tSDK, addlottieoncompositionloadedlistener, addanimatorpauselistener);
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return aFe1qSDK1;
    }
}
