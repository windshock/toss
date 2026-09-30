package im.toss.features.cardissue.event.ui.eligibility;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.SystemSettingFieldGroup1;
import o.initScreenWidth;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EligibilityLogEvent$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ SystemSettingFieldGroup1 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = initScreenWidth.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
