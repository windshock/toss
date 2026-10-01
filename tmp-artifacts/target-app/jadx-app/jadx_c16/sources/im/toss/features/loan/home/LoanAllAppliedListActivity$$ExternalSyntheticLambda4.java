package im.toss.features.loan.home;

import androidx.compose.foundation.layout.RowScope;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda4 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AppliedLoan f$0;
    public final /* synthetic */ LoanAllAppliedListActivity f$1;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda4(AppliedLoan appliedLoan, LoanAllAppliedListActivity loanAllAppliedListActivity) {
        this.f$0 = appliedLoan;
        this.f$1 = loanAllAppliedListActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        Unit unit = (Unit) LoanAllAppliedListActivity.onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr2, -98063956, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 98063957, iOnWarmupCompleted2);
        int i3 = onWarmupCompleted + 17;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
