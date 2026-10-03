package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SkiaPooledImageRegionDecoder1;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SkiaPooledImageRegionDecoder1 implements onPurchaseHistoryResponse {
    public Function1<String, String> onNavigationEvent() {
        return new Function1() { // from class: viva.republica.toss.main.TossHttpHeaderManipulator$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return SkiaPooledImageRegionDecoder1.onNavigationEvent((String) obj);
            }
        };
    }

    public /* bridge */ Request onNavigationEvent(@NotNull Request request) {
        return super.onNavigationEvent(request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNavigationEvent(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str + zzaj.onNavigationEvent().access100();
    }
}
