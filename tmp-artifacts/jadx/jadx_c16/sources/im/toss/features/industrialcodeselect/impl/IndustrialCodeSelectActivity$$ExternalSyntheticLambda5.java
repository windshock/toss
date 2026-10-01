package im.toss.features.industrialcodeselect.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getPluginVersionInfo;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ IndustrialCodeSelectActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IndustrialCodeSelectActivity.onNavigationEvent(this.f$0, (getPluginVersionInfo) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = IndustrialCodeSelectActivity.onNavigationEvent(this.f$0, (getPluginVersionInfo) obj);
        int i3 = onWarmupCompleted + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
