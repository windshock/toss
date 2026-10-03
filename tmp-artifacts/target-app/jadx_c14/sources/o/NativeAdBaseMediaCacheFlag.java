package o;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdBaseMediaCacheFlag implements Interceptor {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public Response intercept(@NotNull Interceptor.Chain chain) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        int iConnectTimeoutMillis = chain.connectTimeoutMillis();
        int timeoutMillis = chain.readTimeoutMillis();
        int iWriteTimeoutMillis = chain.writeTimeoutMillis();
        String strHeader = request.header("CONNECT_TIMEOUT");
        String strHeader2 = request.header("READ_TIMEOUT");
        String strHeader3 = request.header("WRITE_TIMEOUT");
        if (strHeader != null) {
            iConnectTimeoutMillis = Integer.parseInt(strHeader);
        }
        if (strHeader2 != null) {
            timeoutMillis = Integer.parseInt(strHeader2);
        }
        if (strHeader3 != null) {
            iWriteTimeoutMillis = Integer.parseInt(strHeader3);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return chain.withConnectTimeout(iConnectTimeoutMillis, timeUnit).withReadTimeout(timeoutMillis, timeUnit).withWriteTimeout(iWriteTimeoutMillis, timeUnit).proceed(request);
    }
}
