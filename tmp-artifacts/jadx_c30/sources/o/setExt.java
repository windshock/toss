package o;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setExt implements Interceptor {
    private final setIsAutoPlay onWarmupCompleted;

    public setExt(setIsAutoPlay setisautoplay) {
        Intrinsics.checkNotNullParameter(setisautoplay, BuildConfig.FLAVOR);
        this.onWarmupCompleted = setisautoplay;
    }

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, BuildConfig.FLAVOR);
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.header("Authorization", Credentials.basic$default(this.onWarmupCompleted.IAuthTabCallback(), this.onWarmupCompleted.onExtraCallback(), (Charset) null, 4, (Object) null)).build();
        return chain.proceed(builderNewBuilder.build());
    }
}
