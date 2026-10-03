package o;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.RxDownloader;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RxDownloader implements PurchasesResult {
    private final Function1<HttpUrl, HttpUrl> IAuthTabCallback = PurchasesResult.Companion.onNavigationEvent().onNavigationEvent();
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.main.TossHttpUrlManipulator$$ExternalSyntheticLambda0
        public final Object invoke() {
            return RxDownloader.onWarmupCompleted();
        }
    });

    public /* bridge */ Request onExtraCallbackWithResult(@NotNull Request request) {
        return super.onExtraCallbackWithResult(request);
    }

    public Function1<HttpUrl, HttpUrl> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final Map<HttpUrl, HttpUrl> onExtraCallbackWithResult() {
        return (Map) this.onWarmupCompleted.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map onWarmupCompleted() {
        zzad zzadVarOnNavigationEvent = zzaj.onNavigationEvent();
        HttpUrl.Companion companion = HttpUrl.Companion;
        return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(companion.get(zzadVarOnNavigationEvent.IAuthTabCallback_Parcel()), companion.get(zzadVarOnNavigationEvent.newSession())), getWrite.IAuthTabCallback(companion.get(zzadVarOnNavigationEvent.onTransact()), companion.get(zzadVarOnNavigationEvent.newAuthTabSession()))});
    }
}
