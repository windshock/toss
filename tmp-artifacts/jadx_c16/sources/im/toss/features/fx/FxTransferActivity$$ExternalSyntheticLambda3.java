package im.toss.features.fx;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        Object[] objArr = {(Throwable) obj};
        if (i2 % 2 == 0) {
            unit = (Unit) FxTransferActivity.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), objArr, -2057924639, PushInfo.Companion.onExtraCallback(), 2057924641, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
            int i3 = 4 / 0;
        } else {
            unit = (Unit) FxTransferActivity.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), objArr, -2057924639, PushInfo.Companion.onExtraCallback(), 2057924641, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        }
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
