package im.toss.features.home.core.ui.recyclerview.viewholder.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RVDownloadRequest;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IntelligenceHeroViewHolder$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ RVDownloadRequest f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            RVDownloadRequest.onWarmupCompleted(this.f$0, ((Float) obj).floatValue());
            throw null;
        }
        Unit unitOnWarmupCompleted = RVDownloadRequest.onWarmupCompleted(this.f$0, ((Float) obj).floatValue());
        int i3 = onNavigationEvent + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
