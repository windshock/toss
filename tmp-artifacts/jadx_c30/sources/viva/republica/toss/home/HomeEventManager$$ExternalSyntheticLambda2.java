package viva.republica.toss.home;

import kotlin.jvm.functions.Function1;
import o.FlipperPlugin;
import o.setDebug;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class HomeEventManager$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ setDebug f$0;
    public final /* synthetic */ FlipperPlugin f$1;

    public /* synthetic */ HomeEventManager$$ExternalSyntheticLambda2(setDebug setdebug, FlipperPlugin flipperPlugin) {
        this.f$0 = setdebug;
        this.f$1 = flipperPlugin;
    }

    public final Object invoke(Object obj) {
        return setDebug.onExtraCallbackWithResult(this.f$0, this.f$1, (Throwable) obj);
    }
}
