package im.toss.features.applock.impl.usecase.internal;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RemoteExtension;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ RemoteExtension f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.valueOf(((Boolean) RemoteExtension.onWarmupCompleted(new Object[]{this.f$0, (Unit) obj}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1269888125, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1269888128)).booleanValue());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(((Boolean) RemoteExtension.onWarmupCompleted(new Object[]{this.f$0, (Unit) obj}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1269888125, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1269888128)).booleanValue());
        int i3 = onExtraCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }
}
