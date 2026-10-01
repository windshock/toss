package im.toss.features.home.ui.dst.view.card;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstCardSettingsActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeDstCardSettingsActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeDstCardSettingsActivity homeDstCardSettingsActivity = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return HomeDstCardSettingsActivity.onNavigationEvent(homeDstCardSettingsActivity, setDetectableSize);
        }
        HomeDstCardSettingsActivity.onNavigationEvent(homeDstCardSettingsActivity, setDetectableSize);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
