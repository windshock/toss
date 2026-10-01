package o;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.io.File;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.ComposableLambdaImplExternalSyntheticLambda7;
import o.sha256Hash;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class sha256Hash {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final sha256Hash onNavigationEvent = new sha256Hash();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ okhttp3.OkHttpClient onExtraCallback(Context context, AppLovinPostbackListener appLovinPostbackListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(context, appLovinPostbackListener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        okhttp3.OkHttpClient okHttpClientIAuthTabCallback = IAuthTabCallback(context, appLovinPostbackListener);
        int i3 = onExtraCallback + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return okHttpClientIAuthTabCallback;
    }

    private sha256Hash() {
    }

    private static final okhttp3.OkHttpClient IAuthTabCallback(Context context, AppLovinPostbackListener appLovinPostbackListener) {
        int i = 2 % 2;
        okhttp3.OkHttpClient okHttpClientBuild = appLovinPostbackListener.onTransact().IAuthTabCallback().cache(new okhttp3.Cache(new File(context.getCacheDir(), "toss_lottie_okhttp_cache"), 31457280L)).build();
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return okHttpClientBuild;
    }

    public final void onExtraCallbackWithResult(@NotNull final AppLovinPostbackListener appLovinPostbackListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinPostbackListener, "");
        final Context contextOnExtraCallback = appLovinPostbackListener.onExtraCallback();
        ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback onextracallback = new ComposableLambdaImplExternalSyntheticLambda7.onExtraCallback();
        onextracallback.IAuthTabCallback(new sha1Hash(new Function0() { // from class: im.toss.tds.foundation.lottie.LottieInitializer$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                OkHttpClient okHttpClientOnExtraCallback = sha256Hash.onExtraCallback(contextOnExtraCallback, appLovinPostbackListener);
                int i5 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return okHttpClientOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }));
        onextracallback.onExtraCallback(false);
        appLovinPostbackListener.asBinder().onExtraCallbackWithResult().invoke(onextracallback);
        ComposableLambdaImplExternalSyntheticLambda3.onExtraCallback(onextracallback.onNavigationEvent());
        Integer numOnWarmupCompleted = appLovinPostbackListener.asBinder().onWarmupCompleted();
        if (numOnWarmupCompleted != null) {
            int i2 = IAuthTabCallback + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                ComposableLambdaImplExternalSyntheticLambda9.onExtraCallbackWithResult(numOnWarmupCompleted.intValue());
                int i3 = 82 / 0;
            } else {
                ComposableLambdaImplExternalSyntheticLambda9.onExtraCallbackWithResult(numOnWarmupCompleted.intValue());
            }
        }
        onExtraCallback(contextOnExtraCallback);
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    public static final class onExtraCallback implements ComponentCallbacks2 {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Context onExtraCallbackWithResult;

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(configuration, "");
            int i4 = onWarmupCompleted + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        onExtraCallback(Context context) {
            this.onExtraCallbackWithResult = context;
        }

        @Override // android.content.ComponentCallbacks
        @Deprecated
        public void onLowMemory() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onTrimMemory(80);
            int i4 = onWarmupCompleted + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (i >= 10) {
                int i6 = i3 + 77;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                ComposableLambdaImplExternalSyntheticLambda9.onNavigationEvent(this.onExtraCallbackWithResult);
                int i8 = onExtraCallback + 59;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
        }
    }

    private final void onExtraCallback(Context context) {
        int i = 2 % 2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            context = applicationContext;
        }
        context.registerComponentCallbacks(new onExtraCallback(context));
        int i4 = IAuthTabCallback + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
