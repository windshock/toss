package im.toss.core.webkit.bridge;

import im.toss.uikit.base.UIKitBaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.decodeNV21;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ShowBridgeHandler$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ UIKitBaseActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            decodeNV21.onWarmupCompleted(this.f$0);
            throw null;
        }
        Unit unitOnWarmupCompleted = decodeNV21.onWarmupCompleted(this.f$0);
        int i3 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
