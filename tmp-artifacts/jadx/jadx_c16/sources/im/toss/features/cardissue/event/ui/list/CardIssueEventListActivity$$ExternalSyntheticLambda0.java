package im.toss.features.cardissue.event.ui.list;

import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventListActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CardIssueEventListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, Boolean.valueOf(((Boolean) obj).booleanValue())};
            throw null;
        }
        Object[] objArr2 = {this.f$0, Boolean.valueOf(((Boolean) obj).booleanValue())};
        Unit unit = (Unit) CardIssueEventListActivity.IAuthTabCallback(-264465221, 264465222, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        int i3 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj2.hashCode();
        throw null;
    }
}
