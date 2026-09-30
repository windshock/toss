package im.toss.features.fx;

import im.toss.base.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.generateLegacyNativeId;
import o.getCallbackCount;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxHanaStarter$Companion$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ BaseActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = generateLegacyNativeId.IAuthTabCallback.onExtraCallbackWithResult(this.f$0, (getCallbackCount) obj);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
