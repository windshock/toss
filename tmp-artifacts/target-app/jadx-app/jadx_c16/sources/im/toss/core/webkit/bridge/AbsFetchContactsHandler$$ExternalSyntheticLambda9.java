package im.toss.core.webkit.bridge;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda9 implements deserializeIntNullableCollection {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            surfaceDestroyed.onExtraCallback(this.f$0, obj);
            obj2.hashCode();
            throw null;
        }
        List listOnExtraCallback = surfaceDestroyed.onExtraCallback(this.f$0, obj);
        int i3 = onWarmupCompleted + 61;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return listOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
