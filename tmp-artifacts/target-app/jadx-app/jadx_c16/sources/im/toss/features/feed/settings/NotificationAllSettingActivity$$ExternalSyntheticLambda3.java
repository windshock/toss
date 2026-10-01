package im.toss.features.feed.settings;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.v1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NotificationAllSettingActivity f$0;
    public final /* synthetic */ v1 f$1;
    public final /* synthetic */ Pair f$2;
    public final /* synthetic */ getBacktraceNote f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ NotificationAllSettingActivity$$ExternalSyntheticLambda3(NotificationAllSettingActivity notificationAllSettingActivity, v1 v1Var, Pair pair, getBacktraceNote getbacktracenote, Function0 function0, int i) {
        this.f$0 = notificationAllSettingActivity;
        this.f$1 = v1Var;
        this.f$2 = pair;
        this.f$3 = getbacktracenote;
        this.f$4 = function0;
        this.f$5 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NotificationAllSettingActivity notificationAllSettingActivity = this.f$0;
        v1 v1Var = this.f$1;
        if (i3 != 0) {
            NotificationAllSettingActivity.onExtraCallbackWithResult(notificationAllSettingActivity, v1Var, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = NotificationAllSettingActivity.onExtraCallbackWithResult(notificationAllSettingActivity, v1Var, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
