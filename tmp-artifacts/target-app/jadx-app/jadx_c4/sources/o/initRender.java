package o;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setLogBuffers;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class initRender {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[AdView.values().length];
            try {
                iArr[AdView.LOGCAT.ordinal()] = 1;
                int i = onExtraCallback + 21;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdView.FLIPPER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdView.CHUCKER.ordinal()] = 3;
                int i3 = IAuthTabCallback + 37;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final <T> T onNavigationEvent(@NotNull Class<T> cls, @NotNull String str, @NotNull access1002 access1002Var, @NotNull HttpLoggingInterceptor.Level level, @NotNull doCheckNativeCrash dochecknativecrash) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().connectionSpecs(CollectionsKt.listOf(new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT})).addInterceptor(new withPreloadedIconView()).addInterceptor(new NativeAdBaseMediaCacheFlag());
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        OkHttpClient.Builder builder = builderAddInterceptor.readTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(30L, setrevision)).writeTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(30L, setrevision));
        if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1590500397);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50078 - TextUtils.indexOf("", "", 0)), 22 - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf("", "", 0) + 24756, -1871569597, false, (String) null, new Class[0]);
                }
                builder.addInterceptor((Interceptor) ((Constructor) objOnExtraCallback).newInstance(null));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (zzaj.onNavigationEvent().onActivityLayout()) {
            Iterator<T> it = AdSettingsIntegrationErrorMode.onNavigationEvent.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                int i2 = onExtraCallbackWithResult.onExtraCallbackWithResult[((AdView) it.next()).ordinal()];
                if (i2 != 1) {
                    int i3 = onExtraCallbackWithResult;
                    int i4 = i3 + 53;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 == 2) {
                        UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builder);
                        int i6 = onExtraCallbackWithResult + 125;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 3 / 5;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i8 = i3 + 21;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 == 0) {
                            builder.addInterceptor(access1002Var.onWarmupCompleted());
                            throw null;
                        }
                        builder.addInterceptor(access1002Var.onWarmupCompleted());
                    }
                } else {
                    builder.addInterceptor(new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(level));
                }
            }
        }
        OkHttpClient okHttpClientBuild = builder.build();
        getAdSizeApi.IAuthTabCallback.onNavigationEvent(okHttpClientBuild);
        return (T) new Retrofit.Builder().onExtraCallbackWithResult(okHttpClientBuild).IAuthTabCallback(str).onExtraCallback(dochecknativecrash).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).IAuthTabCallback().onNavigationEvent(cls);
    }
}
