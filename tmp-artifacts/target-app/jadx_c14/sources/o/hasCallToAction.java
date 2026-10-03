package o;

import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import o.wie2;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class hasCallToAction implements Interceptor {
    private static final onExtraCallback Companion = new onExtraCallback(null);

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(onWarmupCompleted(chain.request()));
    }

    private final Request onWarmupCompleted(Request request) {
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody == null) {
            return request;
        }
        String strIAuthTabCallback = RemoteWorkManager.onWarmupCompleted.IAuthTabCallback("ApiCipherRequestInterceptor" + request.url());
        String strHeader = request.header("ExcludeNword");
        boolean z = false;
        if (strHeader != null && Boolean.parseBoolean(strHeader)) {
            z = true;
        }
        String strHeader2 = request.header("x-app-name");
        if (strHeader2 == null) {
            strHeader2 = ka.onWarmupCompleted.IAuthTabCallback();
        }
        String str = strHeader2;
        String strHeader3 = request.header("x-deployment-id");
        if (strHeader3 == null) {
            strHeader3 = ka.onWarmupCompleted.onExtraCallbackWithResult();
        }
        String str2 = strHeader3;
        String strHeader4 = request.header("x-toss-ait-device-id");
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        try {
            requestBodyBody.writeTo(tTBaseActivity);
            String strOnRelationshipValidationResult = tTBaseActivity.onRelationshipValidationResult();
            tTBaseActivity.onWarmupCompleted();
            JsonElement jsonElementOnExtraCallbackWithResult = AudienceNetworkActivity.onExtraCallbackWithResult.onExtraCallbackWithResult(strOnRelationshipValidationResult, strIAuthTabCallback, !z, str, str2, strHeader4);
            wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
            iAuthTabCallback.onExtraCallback();
            HomeWatcherReceiver.IAuthTabCallback(iAuthTabCallback, JsonElement.Companion.serializer(), jsonElementOnExtraCallbackWithResult, tTBaseActivity);
            RequestBody requestBodyCreate = RequestBody.Companion.create(tTBaseActivity.writeTypedObject(), gc.onWarmupCompleted.onWarmupCompleted());
            CloseableKt.closeFinally(tTBaseActivity, (Throwable) null);
            return request.newBuilder().method(request.method(), requestBodyCreate).removeHeader("ExcludeNword").removeHeader("x-app-name").removeHeader("x-deployment-id").removeHeader("x-toss-ait-device-id").build();
        } finally {
        }
    }
}
