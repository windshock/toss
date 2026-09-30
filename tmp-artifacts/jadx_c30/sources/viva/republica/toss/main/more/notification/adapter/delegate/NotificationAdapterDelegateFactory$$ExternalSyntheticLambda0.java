package viva.republica.toss.main.more.notification.adapter.delegate;

import im.toss.features.onboarding.domain.entity.RecentNotification;
import kotlin.jvm.functions.Function2;
import o.AppNode;
import o.getBacktraceNote;
import o.onRewardedInterstitialClosed;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class NotificationAdapterDelegateFactory$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ getBacktraceNote f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ NotificationAdapterDelegateFactory$$ExternalSyntheticLambda0(getBacktraceNote getbacktracenote, String str) {
        this.f$0 = getbacktracenote;
        this.f$1 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return onRewardedInterstitialClosed.onExtraCallback(this.f$0, this.f$1, (AppNode) obj, (RecentNotification) obj2);
    }
}
