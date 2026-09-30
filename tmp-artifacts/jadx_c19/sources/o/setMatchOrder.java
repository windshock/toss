package o;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setMatchOrder implements Interceptor {
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;

    public setMatchOrder(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = str2;
    }

    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(chain.request().newBuilder().header(RtspHeaders.AUTHORIZATION, Credentials.basic$default(this.onExtraCallback, this.onExtraCallbackWithResult, (Charset) null, 4, (Object) null)).build());
    }
}
