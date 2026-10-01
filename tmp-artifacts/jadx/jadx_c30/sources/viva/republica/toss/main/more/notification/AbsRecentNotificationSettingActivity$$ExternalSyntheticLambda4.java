package viva.republica.toss.main.more.notification;

import im.toss.features.onboarding.domain.entity.RecentNotification;
import java.util.List;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AbsRecentNotificationSettingActivity$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ RecentNotification f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ AbsRecentNotificationSettingActivity$$ExternalSyntheticLambda4(RecentNotification recentNotification, List list) {
        this.f$0 = recentNotification;
        this.f$1 = list;
    }

    public final Object invoke(Object obj) {
        return AbsRecentNotificationSettingActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
    }
}
