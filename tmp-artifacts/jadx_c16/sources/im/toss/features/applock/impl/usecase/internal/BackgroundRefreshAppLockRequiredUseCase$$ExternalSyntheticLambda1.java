package im.toss.features.applock.impl.usecase.internal;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import kotlin.jvm.functions.Function1;
import o.RemoteExtension;
import o.deserializeLongCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda1 implements deserializeLongCollection {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) RemoteExtension.onWarmupCompleted(new Object[]{this.f$0, obj}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -2115182640, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 2115182642)).booleanValue();
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }
}
