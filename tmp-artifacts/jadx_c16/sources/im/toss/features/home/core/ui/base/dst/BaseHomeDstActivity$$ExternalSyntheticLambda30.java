package im.toss.features.home.core.ui.base.dst;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda30 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BaseHomeDstActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseHomeDstActivity baseHomeDstActivity = this.f$0;
        View view = (View) obj;
        if (i3 != 0) {
            return BaseHomeDstActivity.onNavigationEvent(baseHomeDstActivity, view);
        }
        BaseHomeDstActivity.onNavigationEvent(baseHomeDstActivity, view);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
