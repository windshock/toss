package im.toss.features.applock.impl.usecase.internal;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RemoteExtension;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ RemoteExtension f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RemoteExtension remoteExtension = this.f$0;
        Unit unit = (Unit) obj;
        if (i3 != 0) {
            return Boolean.valueOf(((Boolean) RemoteExtension.onWarmupCompleted(new Object[]{remoteExtension, unit}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1773054523, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1773054522)).booleanValue());
        }
        Boolean boolValueOf = Boolean.valueOf(((Boolean) RemoteExtension.onWarmupCompleted(new Object[]{remoteExtension, unit}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1773054523, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1773054522)).booleanValue());
        int i4 = 86 / 0;
        return boolValueOf;
    }
}
