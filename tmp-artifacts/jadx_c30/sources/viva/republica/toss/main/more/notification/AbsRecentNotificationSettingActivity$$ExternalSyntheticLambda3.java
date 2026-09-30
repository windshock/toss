package viva.republica.toss.main.more.notification;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.v1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AbsRecentNotificationSettingActivity$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ AbsRecentNotificationSettingActivity f$0;
    public final /* synthetic */ v1 f$1;
    public final /* synthetic */ Pair f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ AbsRecentNotificationSettingActivity$$ExternalSyntheticLambda3(AbsRecentNotificationSettingActivity absRecentNotificationSettingActivity, v1 v1Var, Pair pair, Function0 function0, int i) {
        this.f$0 = absRecentNotificationSettingActivity;
        this.f$1 = v1Var;
        this.f$2 = pair;
        this.f$3 = function0;
        this.f$4 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return AbsRecentNotificationSettingActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
    }
}
