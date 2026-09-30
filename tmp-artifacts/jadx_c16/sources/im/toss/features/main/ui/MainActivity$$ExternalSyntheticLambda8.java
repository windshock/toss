package im.toss.features.main.ui;

import android.content.DialogInterface;
import com.google.firebase.appdistribution.FirebaseAppDistribution;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda8 implements DialogInterface.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MainActivity f$0;
    public final /* synthetic */ FirebaseAppDistribution f$1;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda8(MainActivity mainActivity, FirebaseAppDistribution firebaseAppDistribution) {
        this.f$0 = mainActivity;
        this.f$1 = firebaseAppDistribution;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            MainActivity.IAuthTabCallback(new Object[]{this.f$0, this.f$1, dialogInterface, Integer.valueOf(i)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 303631423, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -303631413, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        } else {
            MainActivity.IAuthTabCallback(new Object[]{this.f$0, this.f$1, dialogInterface, Integer.valueOf(i)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 303631423, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -303631413, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            int i4 = 22 / 0;
        }
    }
}
