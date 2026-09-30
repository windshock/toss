package im.toss.features.foreigner.home.ui.test;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda27 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        Unit unit = (Unit) setCallUrl.onExtraCallback(294527000, PushInfo.Companion.onExtraCallback(), iOnExtraCallback, -294526990, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[0]);
        int i4 = IAuthTabCallback + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
