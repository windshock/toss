package viva.republica.toss.main.more.notification;

import im.toss.features.onboarding.domain.entity.RecentNotification;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AbsRecentNotificationSettingActivity$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ AbsRecentNotificationSettingActivity f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ RecentNotification f$2;

    public /* synthetic */ AbsRecentNotificationSettingActivity$$ExternalSyntheticLambda5(AbsRecentNotificationSettingActivity absRecentNotificationSettingActivity, List list, RecentNotification recentNotification) {
        this.f$0 = absRecentNotificationSettingActivity;
        this.f$1 = list;
        this.f$2 = recentNotification;
    }

    public final Object invoke(Object obj) {
        return AbsRecentNotificationSettingActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (List) obj);
    }
}
