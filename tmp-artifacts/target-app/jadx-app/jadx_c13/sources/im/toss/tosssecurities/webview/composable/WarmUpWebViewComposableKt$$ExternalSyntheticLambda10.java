package im.toss.tosssecurities.webview.composable;

import android.os.Process;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AFi1cSDK;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class WarmUpWebViewComposableKt$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 1;
    public static int onExtraCallbackWithResult;
    public static int onNavigationEvent;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;

    public /* synthetic */ WarmUpWebViewComposableKt$$ExternalSyntheticLambda10(String str) {
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = AFi1cSDK.onExtraCallback(this.f$0, (useAndConfigureProgramWithTexture) obj);
        int i4 = IAuthTabCallback + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static int onExtraCallback() {
        int i = onExtraCallbackWithResult;
        int i2 = i % 9229577;
        onExtraCallbackWithResult = i + 1;
        if (i2 != 0) {
            return onNavigationEvent;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        onNavigationEvent = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
