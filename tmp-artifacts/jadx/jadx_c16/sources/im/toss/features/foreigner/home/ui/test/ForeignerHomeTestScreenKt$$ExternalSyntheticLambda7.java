package im.toss.features.foreigner.home.ui.test;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getFromXRiver;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        Object[] objArr = {(getFromXRiver) obj};
        if (i2 % 2 != 0) {
            return (Unit) setCallUrl.onExtraCallback(-316478849, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 316478849, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr);
        }
        throw null;
    }
}
