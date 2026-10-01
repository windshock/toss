package im.toss.features.home.ui.dst.view.card;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstCardSettingsActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeDstCardSettingsActivity f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ HomeDstCardSettingsActivity$$ExternalSyntheticLambda7(HomeDstCardSettingsActivity homeDstCardSettingsActivity, boolean z) {
        this.f$0 = homeDstCardSettingsActivity;
        this.f$1 = z;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            HomeDstCardSettingsActivity.onNavigationEvent(this.f$0, this.f$1, (Throwable) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = HomeDstCardSettingsActivity.onNavigationEvent(this.f$0, this.f$1, (Throwable) obj);
        int i3 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        return unitOnNavigationEvent;
    }
}
