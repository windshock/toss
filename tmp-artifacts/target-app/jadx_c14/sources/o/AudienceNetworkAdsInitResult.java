package o;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AudienceNetworkAdsInitResult {
    public static final AudienceNetworkAdsInitResult onNavigationEvent = new AudienceNetworkAdsInitResult();
    private static final Map<getSignatureAlgorithm, Response> onExtraCallback = Collections.synchronizedMap(new IdentityHashMap());
    private static final Set<getSignatureAlgorithm> onWarmupCompleted = Collections.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));

    private AudienceNetworkAdsInitResult() {
    }

    public final void onNavigationEvent(@NotNull AudienceNetworkAdsInitSettingsBuilder<?> audienceNetworkAdsInitSettingsBuilder) {
        Intrinsics.checkNotNullParameter(audienceNetworkAdsInitSettingsBuilder, "");
        getSignatureAlgorithm getsignaturealgorithmOnExtraCallback = onExtraCallback(audienceNetworkAdsInitSettingsBuilder);
        if (getsignaturealgorithmOnExtraCallback != null) {
            onWarmupCompleted.add(getsignaturealgorithmOnExtraCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationEvent(getSignatureAlgorithm getsignaturealgorithm, Response response) {
        if (onWarmupCompleted.remove(getsignaturealgorithm)) {
            Map<getSignatureAlgorithm, Response> map = onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put(getsignaturealgorithm, response);
        }
    }

    public final Response onWarmupCompleted(@NotNull AudienceNetworkAdsInitSettingsBuilder<?> audienceNetworkAdsInitSettingsBuilder) {
        Intrinsics.checkNotNullParameter(audienceNetworkAdsInitSettingsBuilder, "");
        getSignatureAlgorithm getsignaturealgorithmOnExtraCallback = onExtraCallback(audienceNetworkAdsInitSettingsBuilder);
        if (getsignaturealgorithmOnExtraCallback == null) {
            return null;
        }
        onWarmupCompleted.remove(getsignaturealgorithmOnExtraCallback);
        return onExtraCallback.remove(getsignaturealgorithmOnExtraCallback);
    }

    private final getSignatureAlgorithm onExtraCallback(AudienceNetworkAdsInitSettingsBuilder<?> audienceNetworkAdsInitSettingsBuilder) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl((getSignatureAlgorithm) audienceNetworkAdsInitSettingsBuilder.request().tag(getSignatureAlgorithm.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        return (getSignatureAlgorithm) obj;
    }

    public static final class onWarmupCompleted implements Interceptor {
        public Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "");
            Request request = chain.request();
            Response responseProceed = chain.proceed(request);
            getSignatureAlgorithm getsignaturealgorithm = (getSignatureAlgorithm) request.tag(getSignatureAlgorithm.class);
            if (getsignaturealgorithm != null) {
                AudienceNetworkAdsInitResult.onNavigationEvent.onNavigationEvent(getsignaturealgorithm, responseProceed);
            }
            return responseProceed;
        }
    }
}
