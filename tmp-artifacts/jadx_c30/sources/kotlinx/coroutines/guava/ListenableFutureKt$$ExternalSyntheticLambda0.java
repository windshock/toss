package kotlinx.coroutines.guava;

import kotlin.jvm.functions.Function1;
import o.GeckoHubImp1;
import o.getFlexDirection;
import o.getFlexWrap;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ListenableFutureKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ getFlexDirection f$0;
    public final /* synthetic */ GeckoHubImp1 f$1;

    public /* synthetic */ ListenableFutureKt$$ExternalSyntheticLambda0(getFlexDirection getflexdirection, GeckoHubImp1 geckoHubImp1) {
        this.f$0 = getflexdirection;
        this.f$1 = geckoHubImp1;
    }

    public final Object invoke(Object obj) {
        return getFlexWrap.onNavigationEvent(this.f$0, this.f$1, (Throwable) obj);
    }
}
