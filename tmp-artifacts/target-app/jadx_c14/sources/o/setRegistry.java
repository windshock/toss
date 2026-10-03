package o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setRegistry implements Interceptor {
    private final setJSExceptionHandler IAuthTabCallback;

    public setRegistry(@NotNull setJSExceptionHandler setjsexceptionhandler) {
        Intrinsics.checkNotNullParameter(setjsexceptionhandler, "");
        this.IAuthTabCallback = setjsexceptionhandler;
    }

    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        long jContentLength = requestBodyBody != null ? requestBodyBody.contentLength() : 0L;
        Response responseProceed = chain.proceed(request);
        ResponseBody responseBodyBody = responseProceed.body();
        if (responseBodyBody != null) {
            TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = responseBodyBody.source();
            tTAppOpenAdTransActivitySource.asBinder(Long.MAX_VALUE);
            jContentLength += tTAppOpenAdTransActivitySource.access100().ICustomTabsCallbackDefault();
        }
        setJSExceptionHandler setjsexceptionhandler = this.IAuthTabCallback;
        String path = request.url().url().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        setjsexceptionhandler.onNavigationEvent(path, jContentLength);
        return responseProceed;
    }
}
