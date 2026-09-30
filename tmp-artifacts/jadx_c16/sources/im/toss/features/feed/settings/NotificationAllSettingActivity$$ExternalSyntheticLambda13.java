package im.toss.features.feed.settings;

import kotlin.jvm.functions.Function2;
import o.getSupportedHighSpeedResolutionsFor;
import o.u5b;
import o.x1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda13 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NotificationAllSettingActivity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;

    public /* synthetic */ NotificationAllSettingActivity$$ExternalSyntheticLambda13(NotificationAllSettingActivity notificationAllSettingActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = notificationAllSettingActivity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(NotificationAllSettingActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (u5b) obj, (x1) obj2));
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return boolValueOf;
    }
}
