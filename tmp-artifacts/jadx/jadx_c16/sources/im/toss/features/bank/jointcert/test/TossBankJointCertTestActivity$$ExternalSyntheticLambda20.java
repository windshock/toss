package im.toss.features.bank.jointcert.test;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import viva.republica.toss.widget.dialog.ListItemBottomSheetDialog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda20 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ListItemBottomSheetDialog f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TossBankJointCertTestActivity.onExtraCallbackWithResult(this.f$0, (View) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = TossBankJointCertTestActivity.onExtraCallbackWithResult(this.f$0, (View) obj);
        int i3 = onWarmupCompleted + 33;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
