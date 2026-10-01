package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import kotlin.jvm.functions.Function1;
import o.GeckoHubImp1;
import o.getFlexLinesInternal;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FutureKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ CompletableFuture f$0;
    public final /* synthetic */ GeckoHubImp1 f$1;

    public /* synthetic */ FutureKt$$ExternalSyntheticLambda0(CompletableFuture completableFuture, GeckoHubImp1 geckoHubImp1) {
        this.f$0 = completableFuture;
        this.f$1 = geckoHubImp1;
    }

    public final Object invoke(Object obj) {
        return getFlexLinesInternal.onExtraCallback(this.f$0, this.f$1, (Throwable) obj);
    }
}
