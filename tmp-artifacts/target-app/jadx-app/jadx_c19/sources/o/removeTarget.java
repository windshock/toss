package o;

import com.krc.pl_card.KRCPlasticCardService;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class removeTarget {
    public static final removeTarget onExtraCallbackWithResult = new removeTarget();
    private static final long IAuthTabCallback = 15;
    private static final long onWarmupCompleted = 15;
    private static final long onExtraCallback = 15;
    private static final HashMap<String, Retrofit> onNavigationEvent = new HashMap<>();

    public static final class onNavigationEvent implements HttpLoggingInterceptor.Logger {
        onNavigationEvent() {
        }

        public void log(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ApmHelper11.IAuthTabCallback("[API] " + str, new Object[0]);
        }
    }

    private removeTarget() {
    }

    private final Retrofit onExtraCallbackWithResult(String str, int i2) {
        KRCPlasticCardService kRCPlasticCardService = KRCPlasticCardService.INSTANCE;
        setMatchOrder setmatchorder = new setMatchOrder(kRCPlasticCardService.getAPI_USER_NAME(), kRCPlasticCardService.getAPI_USER_PWD());
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new onNavigationEvent());
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(setmatchorder).addInterceptor(httpLoggingInterceptor);
        long j = onWarmupCompleted;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Retrofit retrofitIAuthTabCallback = new Retrofit.Builder().IAuthTabCallback(str + ':' + i2).onExtraCallback(getExtensionName.onExtraCallback()).onExtraCallbackWithResult(builderAddInterceptor.writeTimeout(j, timeUnit).readTimeout(onExtraCallback, timeUnit).build()).IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(retrofitIAuthTabCallback, "");
        return retrofitIAuthTabCallback;
    }

    public final Retrofit onExtraCallback(@NotNull String str, int i2) {
        Retrofit retrofit;
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            HashMap<String, Retrofit> map = onNavigationEvent;
            String str2 = str + ':' + i2;
            Retrofit retrofitOnExtraCallbackWithResult = map.get(str2);
            if (retrofitOnExtraCallbackWithResult == null) {
                retrofitOnExtraCallbackWithResult = onExtraCallbackWithResult.onExtraCallbackWithResult(str, i2);
                map.put(str2, retrofitOnExtraCallbackWithResult);
            }
            retrofit = retrofitOnExtraCallbackWithResult;
        }
        return retrofit;
    }
}
