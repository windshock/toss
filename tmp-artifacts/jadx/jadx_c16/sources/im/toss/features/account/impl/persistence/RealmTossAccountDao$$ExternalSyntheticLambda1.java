package im.toss.features.account.impl.persistence;

import java.util.List;
import kotlin.jvm.functions.Function1;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RealmTossAccountDao$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        List list = (List) RealmTossAccountDao.IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, -1179564226, iOnWarmupCompleted2, new Object[]{(List) obj}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1179564226);
        int i4 = onNavigationEvent + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
