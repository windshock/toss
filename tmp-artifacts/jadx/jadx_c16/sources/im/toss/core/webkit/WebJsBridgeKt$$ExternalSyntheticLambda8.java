package im.toss.core.webkit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setTopGuideFontSize;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class WebJsBridgeKt$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallbackWithResult = setTopGuideFontSize.onExtraCallbackWithResult(this.f$0, (startRunning) obj);
            int i3 = 55 / 0;
        } else {
            unitOnExtraCallbackWithResult = setTopGuideFontSize.onExtraCallbackWithResult(this.f$0, (startRunning) obj);
        }
        int i4 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
