package viva.republica.toss.main.more.notification.adapter.delegate;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.AppNode;
import o.onRewardedInterstitialClosed;
import viva.republica.toss.main.more.notification.adapter.model.RecentNotificationSectionItem;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class NotificationAdapterDelegateFactory$$ExternalSyntheticLambda24 implements Function2 {
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ NotificationAdapterDelegateFactory$$ExternalSyntheticLambda24(Function1 function1, Function0 function0) {
        this.f$0 = function1;
        this.f$1 = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return onRewardedInterstitialClosed.onExtraCallbackWithResult(this.f$0, this.f$1, (AppNode) obj, (RecentNotificationSectionItem.PushRequirementFooter) obj2);
    }
}
