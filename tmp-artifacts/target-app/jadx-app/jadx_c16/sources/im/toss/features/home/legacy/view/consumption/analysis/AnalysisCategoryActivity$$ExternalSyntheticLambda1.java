package im.toss.features.home.legacy.view.consumption.analysis;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import o.NativeReactDevToolsSettingsManagerSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AnalysisCategoryActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            AnalysisCategoryActivity.onNavigationEvent(this.f$0, (NativeReactDevToolsSettingsManagerSpec) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ArrayList arrayListOnNavigationEvent = AnalysisCategoryActivity.onNavigationEvent(this.f$0, (NativeReactDevToolsSettingsManagerSpec) obj);
        int i3 = onNavigationEvent + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return arrayListOnNavigationEvent;
    }
}
