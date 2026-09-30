package im.toss.features.home.ui.dst.view.card;

import im.toss.features.usshome.UssHomeItemAdapter$;
import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstCardSettingsActivity$$ExternalSyntheticLambda8 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1 function1 = this.f$0;
        if (i3 == 0) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            HomeDstCardSettingsActivity.onExtraCallback(new Object[]{function1, obj}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 900175323, -900175320);
        } else {
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            HomeDstCardSettingsActivity.onExtraCallback(new Object[]{function1, obj}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 900175323, -900175320);
            throw null;
        }
    }
}
