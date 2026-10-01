package im.toss.features.home.ui.dst.view.card;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstCardSettingsActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeDstCardSettingsActivity f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ HomeDstCardSettingsActivity$$ExternalSyntheticLambda2(HomeDstCardSettingsActivity homeDstCardSettingsActivity, boolean z) {
        this.f$0 = homeDstCardSettingsActivity;
        this.f$1 = z;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeDstCardSettingsActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (DialogInterface) obj);
        int i4 = onWarmupCompleted + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
