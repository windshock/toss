package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudienceNetworkAdsInitResult;
import o.setLogBuffers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAdFormatForPlacement implements a2 {
    private final HttpLoggingInterceptor.Level IAuthTabCallback;
    private final doCheckNativeCrash IAuthTabCallbackDefault;
    private final isExceptionHandlerEnabled IAuthTabCallbackStub;
    private final Interceptor asBinder;
    private final OkHttpClient asInterface;
    private final zzad onExtraCallback;
    private final access1002 onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private final Object onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[AdView.values().length];
            try {
                iArr[AdView.LOGCAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdView.FLIPPER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdView.CHUCKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallback = iArr;
        }
    }

    public getAdFormatForPlacement(@NotNull isExceptionHandlerEnabled isexceptionhandlerenabled, @NotNull access1002 access1002Var, @NotNull Object obj, @NotNull Object obj2, @NotNull HttpLoggingInterceptor.Level level, @NotNull doCheckNativeCrash dochecknativecrash, @NotNull Interceptor interceptor, @NotNull zzad zzadVar, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(isexceptionhandlerenabled, "");
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        Intrinsics.checkNotNullParameter(interceptor, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.IAuthTabCallbackStub = isexceptionhandlerenabled;
        this.onExtraCallbackWithResult = access1002Var;
        this.onNavigationEvent = obj;
        this.onWarmupCompleted = obj2;
        this.IAuthTabCallback = level;
        this.IAuthTabCallbackDefault = dochecknativecrash;
        this.asBinder = interceptor;
        this.onExtraCallback = zzadVar;
        this.asInterface = okHttpClient;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public <T> T onNavigationEvent(@NotNull Class<T> cls, @NotNull String str, @Nullable Long l, @Nullable Long l2, @Nullable Function1<? super OkHttpClient.Builder, Unit> function1) throws Throwable {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = cls.getAnnotation(g3.class) != null;
        boolean z2 = cls.getAnnotation(g2.class) != null;
        Retrofit.Builder builderOnExtraCallback = new Retrofit.Builder().IAuthTabCallback(str).onExtraCallback(this.IAuthTabCallbackDefault);
        CallAdapter.Factory factoryIAuthTabCallback = RxJava2CallAdapterFactory.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(factoryIAuthTabCallback, "");
        Retrofit.Builder builderOnNavigationEvent = builderOnExtraCallback.onNavigationEvent(new AudienceNetworkContentProvider(factoryIAuthTabCallback));
        OkHttpClient.Builder builderNewBuilder = this.asInterface.newBuilder();
        builderNewBuilder.addInterceptor(new tagView());
        if (l != null) {
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            builderNewBuilder.connectTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(l.longValue(), setRevision.SECONDS));
        }
        if (l2 != null) {
            setLogBuffers.IAuthTabCallback iAuthTabCallback2 = setLogBuffers.Companion;
            long jLongValue = l2.longValue();
            setRevision setrevision = setRevision.SECONDS;
            builderNewBuilder.readTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(jLongValue, setrevision));
            builderNewBuilder.writeTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(l2.longValue(), setrevision));
        }
        if (function1 != null) {
            function1.invoke(builderNewBuilder);
        }
        builderNewBuilder.addInterceptor(new AudienceNetworkAdsInitResult.onWarmupCompleted());
        builderNewBuilder.addInterceptor(new withPreloadedIconView());
        builderNewBuilder.addInterceptor(RxDownloaderDownloadStatusReceiver.onWarmupCompleted().onNavigationEvent(this.IAuthTabCallbackStub));
        if (this.onExtraCallback.RemoteActionCompatParcelizer()) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1590500397);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50078 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, ImageFormat.getBitsPerPixel(0) + 24757, -1871569597, false, (String) null, new Class[0]);
                }
                builderNewBuilder.addInterceptor((Interceptor) ((Constructor) objOnExtraCallback).newInstance(null));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (!z && !z2) {
            builderNewBuilder.addInterceptor(new hasCallToAction());
        }
        builderNewBuilder.addInterceptor(this.asBinder);
        builderNewBuilder.addInterceptor(new NativeAdBaseNativeAdLoadConfigBuilder(this.onNavigationEvent));
        if (this.onExtraCallback.onActivityLayout()) {
            Iterator<T> it = AdSettingsIntegrationErrorMode.onNavigationEvent.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                int i = IAuthTabCallback.onExtraCallback[((AdView) it.next()).ordinal()];
                if (i == 1) {
                    builderNewBuilder.addInterceptor(new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(this.IAuthTabCallback));
                } else if (i == 2) {
                    UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builderNewBuilder);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    builderNewBuilder.addInterceptor(this.onExtraCallbackWithResult.onWarmupCompleted());
                }
            }
            Interceptor interceptorIAuthTabCallback = UST_CERT_GetVIDRandomWithPrikey.onWarmupCompleted.IAuthTabCallback();
            if (interceptorIAuthTabCallback != null) {
                builderNewBuilder.addInterceptor(interceptorIAuthTabCallback);
            }
        }
        if (z2) {
            builderNewBuilder.addInterceptor(new NativeAdBaseRating(this.onExtraCallback, ReactInstanceDevHelper.onNavigationEvent));
        } else if (!z) {
            builderNewBuilder.addInterceptor(new NativeAdBaseImage(this.onWarmupCompleted));
        }
        OkHttpClient okHttpClientBuild = builderNewBuilder.build();
        getAdSizeApi.IAuthTabCallback.onNavigationEvent(okHttpClientBuild);
        return (T) builderOnNavigationEvent.onExtraCallbackWithResult(okHttpClientBuild).IAuthTabCallback().onNavigationEvent(cls);
    }
}
