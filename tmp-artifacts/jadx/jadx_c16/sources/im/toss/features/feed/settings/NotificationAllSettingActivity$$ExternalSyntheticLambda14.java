package im.toss.features.feed.settings;

import java.util.List;
import kotlin.Unit;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import viva.republica.toss.network.model.notification.group.RecentMessagesDto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda14 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NotificationAllSettingActivity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ NotificationAllSettingActivity$$ExternalSyntheticLambda14(NotificationAllSettingActivity notificationAllSettingActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = notificationAllSettingActivity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        Object obj4 = null;
        if (i2 % 2 != 0) {
            NotificationAllSettingActivity.onNavigationEvent(this.f$0, this.f$1, (List) obj, (List) obj2, (RecentMessagesDto) obj3);
            obj4.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = NotificationAllSettingActivity.onNavigationEvent(this.f$0, this.f$1, (List) obj, (List) obj2, (RecentMessagesDto) obj3);
        int i3 = IAuthTabCallback + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
