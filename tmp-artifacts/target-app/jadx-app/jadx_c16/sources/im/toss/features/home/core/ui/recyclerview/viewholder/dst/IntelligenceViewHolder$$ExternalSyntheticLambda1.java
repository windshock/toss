package im.toss.features.home.core.ui.recyclerview.viewholder.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.isUrgentResource;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IntelligenceViewHolder$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ isUrgentResource f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            isUrgentResource.onExtraCallback(this.f$0, ((Float) obj).floatValue());
            throw null;
        }
        Unit unitOnExtraCallback = isUrgentResource.onExtraCallback(this.f$0, ((Float) obj).floatValue());
        int i3 = onNavigationEvent + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
