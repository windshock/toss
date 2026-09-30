package im.toss.features.cardissue.event.ui.cs;

import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.SystemSettingFieldGroup1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueCsInfoActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ SystemSettingFieldGroup1 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (SetDetectableSize) obj};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) CardIssueCsInfoActivity.IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, 586360197, iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -586360196, iOnNavigationEvent2);
        int i4 = onNavigationEvent + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
