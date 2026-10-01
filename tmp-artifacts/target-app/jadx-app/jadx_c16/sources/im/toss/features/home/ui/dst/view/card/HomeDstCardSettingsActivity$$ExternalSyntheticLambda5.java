package im.toss.features.home.ui.dst.view.card;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BuildConfigApi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstCardSettingsActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeDstCardSettingsActivity f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ HomeDstCardSettingsActivity$$ExternalSyntheticLambda5(HomeDstCardSettingsActivity homeDstCardSettingsActivity, boolean z) {
        this.f$0 = homeDstCardSettingsActivity;
        this.f$1 = z;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = HomeDstCardSettingsActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (BuildConfigApi) obj);
            int i3 = 15 / 0;
        } else {
            unitOnExtraCallbackWithResult = HomeDstCardSettingsActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (BuildConfigApi) obj);
        }
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
