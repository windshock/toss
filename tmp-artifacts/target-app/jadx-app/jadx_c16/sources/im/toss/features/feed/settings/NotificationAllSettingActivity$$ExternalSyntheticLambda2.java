package im.toss.features.feed.settings;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getBacktraceNote;
import viva.republica.toss.network.model.notification.group.RecentMessagesDto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getBacktraceNote f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ RecentMessagesDto f$2;

    public /* synthetic */ NotificationAllSettingActivity$$ExternalSyntheticLambda2(getBacktraceNote getbacktracenote, List list, RecentMessagesDto recentMessagesDto) {
        this.f$0 = getbacktracenote;
        this.f$1 = list;
        this.f$2 = recentMessagesDto;
    }

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = NotificationAllSettingActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (List) obj);
            int i3 = 60 / 0;
        } else {
            unitOnWarmupCompleted = NotificationAllSettingActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (List) obj);
        }
        int i4 = onExtraCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
