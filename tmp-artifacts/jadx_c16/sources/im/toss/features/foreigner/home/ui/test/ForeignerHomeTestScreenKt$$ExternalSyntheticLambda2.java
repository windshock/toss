package im.toss.features.foreigner.home.ui.test;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke() {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            unit = (Unit) setCallUrl.onExtraCallback(-1392370330, PushInfo.Companion.onExtraCallback(), iOnExtraCallback, 1392370344, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[0]);
            int i3 = 33 / 0;
        } else {
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            unit = (Unit) setCallUrl.onExtraCallback(-1392370330, PushInfo.Companion.onExtraCallback(), iOnExtraCallback2, 1392370344, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[0]);
        }
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return unit;
    }
}
