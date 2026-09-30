package im.toss.features.home.core.ui.recyclerview.viewholder.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.isUrgentResource;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IntelligenceViewHolder$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ isUrgentResource f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = isUrgentResource.onNavigationEvent(this.f$0, ((Float) obj).floatValue());
        int i4 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
