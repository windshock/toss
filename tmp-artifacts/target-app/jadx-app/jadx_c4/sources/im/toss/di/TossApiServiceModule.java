package im.toss.di;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import dagger.Lazy;
import im.toss.di.TossApiServiceModule$;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AdSettingsIntegrationErrorMode;
import o.AdView;
import o.AppContext;
import o.AudienceNetworkAdsInitResult;
import o.AudienceNetworkContentProvider;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BidderTokenProvider;
import o.CacheFlag;
import o.DefaultDevLoadingViewImplementationExternalSyntheticLambda4;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DevSupportManagerBaseExternalSyntheticLambda14;
import o.ExtHubLogger1;
import o.FullScreenAd;
import o.FullScreenAdShowConfigBuilder;
import o.InterstitialAdInterstitialAdShowConfigBuilder;
import o.MediaViewListener;
import o.NativeAdBaseMediaCacheFlag;
import o.RedBoxDialogSurfaceDelegate;
import o.UST_CERT_GetSubjectKeyIdentifier;
import o.a3;
import o.access1002;
import o.ca;
import o.contentUrl;
import o.deleteCert;
import o.disengageSeek;
import o.doCheckNativeCrash;
import o.ea;
import o.enablePreloadSwitchOpt;
import o.extraData;
import o.fromJSONObject;
import o.g1;
import o.gd;
import o.getAdSizeApi;
import o.getAddPhoneContactDialog;
import o.getAppAlias;
import o.getBidderToken;
import o.getDevicePerformance;
import o.getLocalLanguage;
import o.getLongValue;
import o.getMediaViewVideoRendererApi;
import o.getQuestionnaireOptSwitch;
import o.getVolume;
import o.hasRootStatusPermission;
import o.initRender;
import o.isNativeCaller;
import o.keywords;
import o.onExitFullscreen;
import o.onFullscreenBackground;
import o.onFullscreenForeground;
import o.onPaused;
import o.onResourceRequest;
import o.onSeekEngaged;
import o.sendEventId;
import o.setCommandLine;
import o.setH5OptionMenuTextFlag;
import o.setIconfontSize;
import o.setJSExceptionHandler;
import o.setLogBuffers;
import o.setNativeAd;
import o.setRegistry;
import o.setRevision;
import o.wie2;
import o.withInitListener;
import o.withMediaCacheFlag;
import o.withPreloadedIconView;
import o.zzad;
import o.zzaj;
import okhttp3.Cache;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossApiServiceModule {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final TossApiServiceModule IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static boolean IAuthTabCallbackStub = false;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final String onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static boolean onTransact;
    private static char[] onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[AdView.values().length];
            try {
                iArr[AdView.LOGCAT.ordinal()] = 1;
                int i = onExtraCallback + 109;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdView.FLIPPER.ordinal()] = 2;
                int i3 = onWarmupCompleted + 97;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdView.CHUCKER.ordinal()] = 3;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int i7 = onWarmupCompleted + 53;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(builder);
        int i4 = IAuthTabCallbackDefault + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private TossApiServiceModule() {
    }

    static {
        IAuthTabCallback();
        IAuthTabCallback = new TossApiServiceModule();
        onNavigationEvent = zzaj.onNavigationEvent().IAuthTabCallbackDefault();
        onExtraCallback = zzaj.onNavigationEvent().IAuthTabCallbackStub();
        int i = IAuthTabCallback_Parcel + 7;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Singleton
    public final OkHttpClient onWarmupCompleted(@NotNull ea eaVar, @NotNull Lazy<CertificatePinner> lazy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eaVar, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.dns(eaVar.onNavigationEvent(ca.COMMON));
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        builder.connectTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(6L, setrevision));
        builder.readTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(20L, setrevision));
        builder.writeTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(20L, setrevision));
        builder.connectionPool(new ConnectionPool(20, 1L, TimeUnit.MINUTES));
        builder.retryOnConnectionFailure(false);
        if (!zzaj.onNavigationEvent().ICustomTabsCallbackStubProxy()) {
            int i2 = asInterface + 5;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            CertificatePinner certificatePinner = lazy.get();
            Intrinsics.checkNotNullExpressionValue(certificatePinner, "");
            builder.certificatePinner(certificatePinner);
            int i4 = asInterface + 81;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        setJSExceptionHandler setjsexceptionhandler = setJSExceptionHandler.onWarmupCompleted;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (((Boolean) setJSExceptionHandler.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 216163519, new Object[]{setjsexceptionhandler}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -216163519, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue()) {
            builder.addNetworkInterceptor(new setRegistry(setjsexceptionhandler));
        }
        withInitListener.onWarmupCompleted onwarmupcompleted = withInitListener.Companion;
        builder.sslSocketFactory(onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.onExtraCallback());
        OkHttpClient okHttpClientBuild = builder.build();
        getAdSizeApi.IAuthTabCallback.onNavigationEvent(okHttpClientBuild);
        return okHttpClientBuild;
    }

    @Singleton
    public final HttpLoggingInterceptor.Level onExtraCallback() {
        int i = 2 % 2;
        if (!zzaj.onNavigationEvent().ICustomTabsCallback_Parcel()) {
            return HttpLoggingInterceptor.Level.NONE;
        }
        Object obj = null;
        if (Log.isLoggable("ApiModule", 2)) {
            int i2 = IAuthTabCallbackDefault + 119;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return HttpLoggingInterceptor.Level.BODY;
            }
            HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
            obj.hashCode();
            throw null;
        }
        if (!(!Log.isLoggable("ApiModule", 3))) {
            int i3 = IAuthTabCallbackDefault + 91;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return HttpLoggingInterceptor.Level.HEADERS;
            }
            HttpLoggingInterceptor.Level level2 = HttpLoggingInterceptor.Level.HEADERS;
            obj.hashCode();
            throw null;
        }
        if (Log.isLoggable("ApiModule", 4)) {
            return HttpLoggingInterceptor.Level.BASIC;
        }
        HttpLoggingInterceptor.Level level3 = HttpLoggingInterceptor.Level.NONE;
        int i4 = asInterface + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return level3;
        }
        obj.hashCode();
        throw null;
    }

    public final onExitFullscreen onMinimized(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, onExitFullscreen.class, onNavigationEvent, (Long) null, (Long) null, (Function1) null, 104, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, onExitFullscreen.class, onNavigationEvent, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        onExitFullscreen onexitfullscreen = (onExitFullscreen) objOnExtraCallback;
        int i3 = IAuthTabCallbackDefault + 17;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return onexitfullscreen;
    }

    public final MediaViewListener onMessageChannelReady(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, MediaViewListener.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 88, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, MediaViewListener.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (MediaViewListener) objOnExtraCallback;
    }

    public final getMediaViewVideoRendererApi ICustomTabsCallbackStub(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getMediaViewVideoRendererApi.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 5, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getMediaViewVideoRendererApi.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (getMediaViewVideoRendererApi) objOnExtraCallback;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int i3 = $10 + 123;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j) + 1), 78 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        float f = 0.0f;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 75 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 16037 - TextUtils.indexOf("", "", 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i6 = $10 + 73;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $11 + 29;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 63 - TextUtils.indexOf("", "", 0, 0), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            f = 0.0f;
        }
        objArr[0] = new String(cArr6);
    }

    public final onFullscreenBackground ICustomTabsCallback(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        onFullscreenBackground onfullscreenbackground = (onFullscreenBackground) g1.onExtraCallback(g1Var, onFullscreenBackground.class, onNavigationEvent, 4L, 10L, (Function1) null, 16, (Object) null);
        int i4 = asInterface + 101;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return onfullscreenbackground;
    }

    public final onPaused onRelationshipValidationResult(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, onPaused.class, onNavigationEvent, (Long) null, 30L, (Function1) null, 88, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, onPaused.class, onNavigationEvent, (Long) null, 30L, (Function1) null, 20, (Object) null);
        }
        onPaused onpaused = (onPaused) objOnExtraCallback;
        int i3 = asInterface + 89;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return onpaused;
    }

    public final onSeekEngaged onUnminimized(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        onSeekEngaged onseekengaged = (onSeekEngaged) g1.onExtraCallback(g1Var, onSeekEngaged.class, onExtraCallback, (Long) null, 30L, (Function1) null, 20, (Object) null);
        int i4 = IAuthTabCallbackDefault + 37;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return onseekengaged;
    }

    public final disengageSeek ICustomTabsCallbackDefault(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        disengageSeek disengageseek = (disengageSeek) g1.onExtraCallback(g1Var, disengageSeek.class, onNavigationEvent, (Long) null, 90L, (Function1) null, 20, (Object) null);
        int i4 = IAuthTabCallbackDefault + 39;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return disengageseek;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBidderToken onWarmupCompleted(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        getBidderToken getbiddertoken = (getBidderToken) g1.onExtraCallback(g1Var, getBidderToken.class, onNavigationEvent, (Long) null, 30L, (Function1) null, 20, (Object) null);
        int i4 = IAuthTabCallbackDefault + 75;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return getbiddertoken;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str;
        Class<InterstitialAdInterstitialAdShowConfigBuilder> cls;
        Long l;
        long j;
        Function1 function1;
        int i;
        g1 g1Var = (g1) objArr[1];
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            str = onExtraCallback;
            cls = InterstitialAdInterstitialAdShowConfigBuilder.class;
            l = null;
            j = 60L;
            function1 = null;
            i = 118;
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            str = onExtraCallback;
            cls = InterstitialAdInterstitialAdShowConfigBuilder.class;
            l = null;
            j = 60L;
            function1 = null;
            i = 20;
        }
        return (InterstitialAdInterstitialAdShowConfigBuilder) g1.onExtraCallback(g1Var, cls, str, l, j, function1, i, (Object) null);
    }

    public final CacheFlag onExtraCallbackWithResult(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        CacheFlag cacheFlag = (CacheFlag) g1.onExtraCallback(g1Var, CacheFlag.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackDefault + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cacheFlag;
    }

    public final setIconfontSize access100(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, setIconfontSize.class, onExtraCallback, 60L, 60L, (Function1) null, 56, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, setIconfontSize.class, onExtraCallback, 60L, 60L, (Function1) null, 16, (Object) null);
        }
        return (setIconfontSize) objOnExtraCallback;
    }

    public final isNativeCaller getInterfaceDescriptor(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, isNativeCaller.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 93, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, isNativeCaller.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (isNativeCaller) objOnExtraCallback;
    }

    public final BidderTokenProvider onNavigationEvent(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        BidderTokenProvider bidderTokenProvider = (BidderTokenProvider) g1.onExtraCallback(g1Var, BidderTokenProvider.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackDefault + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return bidderTokenProvider;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        g1 g1Var = (g1) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        DevSupportManagerBaseExternalSyntheticLambda14 devSupportManagerBaseExternalSyntheticLambda14 = (DevSupportManagerBaseExternalSyntheticLambda14) g1.onExtraCallback(g1Var, DevSupportManagerBaseExternalSyntheticLambda14.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = asInterface + 51;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return devSupportManagerBaseExternalSyntheticLambda14;
    }

    public final onFullscreenForeground onActivityResized(@NotNull g1 g1Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        onFullscreenForeground onfullscreenforeground = (onFullscreenForeground) g1.onExtraCallback(g1Var, onFullscreenForeground.class, zzaj.onNavigationEvent().IPostMessageServiceStubProxy(), (Long) null, (Long) null, new TossApiServiceModule$.ExternalSyntheticLambda0(), 12, (Object) null);
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onfullscreenforeground;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(builder, "");
            RedBoxDialogSurfaceDelegate.onExtraCallback.onNavigationEvent(builder);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(builder, "");
        RedBoxDialogSurfaceDelegate.onExtraCallback.onNavigationEvent(builder);
        int i3 = 23 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String strIAuthTabCallbackStub;
        Class<getAppAlias> cls;
        Long l;
        long j;
        Function1 function1;
        int i;
        g1 g1Var = (g1) objArr[1];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 37;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            strIAuthTabCallbackStub = zzaj.onNavigationEvent().IAuthTabCallbackStub();
            cls = getAppAlias.class;
            l = null;
            j = 60L;
            function1 = null;
            i = 37;
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            strIAuthTabCallbackStub = zzaj.onNavigationEvent().IAuthTabCallbackStub();
            cls = getAppAlias.class;
            l = null;
            j = 60L;
            function1 = null;
            i = 20;
        }
        getAppAlias getappalias = (getAppAlias) g1.onExtraCallback(g1Var, cls, strIAuthTabCallbackStub, l, j, function1, i, (Object) null);
        int i4 = asInterface + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return getappalias;
    }

    public final hasRootStatusPermission asBinder(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        hasRootStatusPermission hasrootstatuspermission = (hasRootStatusPermission) g1.onExtraCallback(g1Var, hasRootStatusPermission.class, zzaj.onNavigationEvent().IAuthTabCallbackStub(), (Long) null, 60L, (Function1) null, 20, (Object) null);
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return hasrootstatuspermission;
    }

    public final getDevicePerformance IAuthTabCallbackStub(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        getDevicePerformance getdeviceperformance = (getDevicePerformance) g1.onExtraCallback(g1Var, getDevicePerformance.class, zzaj.onNavigationEvent().IAuthTabCallbackStub(), (Long) null, 60L, (Function1) null, 20, (Object) null);
        int i4 = IAuthTabCallbackDefault + 41;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return getdeviceperformance;
    }

    public final getQuestionnaireOptSwitch IAuthTabCallbackDefault(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        getQuestionnaireOptSwitch getquestionnaireoptswitch = (getQuestionnaireOptSwitch) g1.onExtraCallback(g1Var, getQuestionnaireOptSwitch.class, zzaj.onNavigationEvent().IAuthTabCallbackStub(), (Long) null, 60L, (Function1) null, 20, (Object) null);
        int i4 = asInterface + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return getquestionnaireoptswitch;
    }

    public final enablePreloadSwitchOpt onTransact(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        enablePreloadSwitchOpt enablepreloadswitchopt = (enablePreloadSwitchOpt) g1.onExtraCallback(g1Var, enablePreloadSwitchOpt.class, onNavigationEvent, (Long) null, 60L, (Function1) null, 20, (Object) null);
        int i4 = IAuthTabCallbackDefault + 3;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return enablepreloadswitchopt;
    }

    public final getLocalLanguage asInterface(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getLocalLanguage.class, onNavigationEvent, (Long) null, 60L, (Function1) null, 20, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getLocalLanguage.class, onNavigationEvent, (Long) null, 60L, (Function1) null, 20, (Object) null);
        }
        getLocalLanguage getlocallanguage = (getLocalLanguage) objOnExtraCallback;
        int i3 = asInterface + 83;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return getlocallanguage;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final setNativeAd onWarmupCompleted(@NotNull OkHttpClient okHttpClient, @NotNull access1002 access1002Var, @NotNull HttpLoggingInterceptor.Level level, @NotNull doCheckNativeCrash dochecknativecrash) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        Retrofit.Builder builderOnExtraCallback = new Retrofit.Builder().IAuthTabCallback(zzaj.onNavigationEvent().IAuthTabCallbackStub()).onExtraCallback(dochecknativecrash);
        CallAdapter.Factory factoryIAuthTabCallback = RxJava2CallAdapterFactory.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(factoryIAuthTabCallback, "");
        Retrofit.Builder builderOnNavigationEvent = builderOnExtraCallback.onNavigationEvent(new AudienceNetworkContentProvider(new CallAdapter.Factory[]{factoryIAuthTabCallback}));
        OkHttpClient.Builder builderAddInterceptor = okHttpClient.newBuilder().addInterceptor(new AudienceNetworkAdsInitResult.onWarmupCompleted()).addInterceptor(new withPreloadedIconView());
        if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1590500397);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 50078), AndroidCharacter.getMirror('0') - 25, 24756 - View.resolveSizeAndState(0, 0, 0), -1871569597, false, (String) null, new Class[0]);
                }
                builderAddInterceptor.addInterceptor((Interceptor) ((Constructor) objOnExtraCallback).newInstance(null));
                int i2 = asInterface + 15;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (zzaj.onNavigationEvent().onActivityLayout()) {
            Iterator it = AdSettingsIntegrationErrorMode.onNavigationEvent.onWarmupCompleted().iterator();
            int i4 = asInterface + 121;
            IAuthTabCallbackDefault = i4 % 128;
            loop0: while (true) {
                int i5 = i4 % 2;
                while (it.hasNext()) {
                    int i6 = onExtraCallbackWithResult.IAuthTabCallback[((AdView) it.next()).ordinal()];
                    if (i6 == 1) {
                        builderAddInterceptor.addInterceptor(new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(level));
                    } else if (i6 != 2) {
                        int i7 = asInterface + 81;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        builderAddInterceptor.addInterceptor(access1002Var.onWarmupCompleted());
                    }
                }
                UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builderAddInterceptor);
                i4 = IAuthTabCallbackDefault + 15;
                asInterface = i4 % 128;
            }
        }
        builderAddInterceptor.addInterceptor(new withMediaCacheFlag());
        OkHttpClient okHttpClientBuild = builderAddInterceptor.build();
        getAdSizeApi.IAuthTabCallback.onNavigationEvent(okHttpClientBuild);
        Retrofit retrofitIAuthTabCallback = builderOnNavigationEvent.onExtraCallbackWithResult(okHttpClientBuild).IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(retrofitIAuthTabCallback, "");
        Object objOnNavigationEvent = retrofitIAuthTabCallback.onNavigationEvent(setNativeAd.class);
        Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
        Intrinsics.checkNotNull(objOnNavigationEvent, "");
        return (setNativeAd) objOnNavigationEvent;
    }

    public final contentUrl onExtraCallbackWithResult(@NotNull Context context, @NotNull access1002 access1002Var, @NotNull HttpLoggingInterceptor.Level level) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(level, "");
        contentUrl contenturl = (contentUrl) onExtraCallback(this, contentUrl.class, access1002Var, level, null, context, 8, null);
        int i4 = IAuthTabCallbackDefault + 69;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return contenturl;
    }

    public final setH5OptionMenuTextFlag IAuthTabCallback(@NotNull access1002 access1002Var, @NotNull HttpLoggingInterceptor.Level level) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(level, "");
        setH5OptionMenuTextFlag seth5optionmenutextflag = (setH5OptionMenuTextFlag) onExtraCallback(this, setH5OptionMenuTextFlag.class, access1002Var, level, zzaj.onNavigationEvent().IAuthTabCallbackStubProxy(), null, 16, null);
        int i4 = asInterface + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return seth5optionmenutextflag;
    }

    public final AppContext IAuthTabCallback(@NotNull access1002 access1002Var, @NotNull wie2 wie2Var, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        AppContext appContext = (AppContext) onWarmupCompleted(this, AppContext.class, access1002Var, wie2Var, null, zzadVar, 8, null);
        int i4 = asInterface + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return appContext;
    }

    static /* synthetic */ Object onWarmupCompleted(TossApiServiceModule tossApiServiceModule, Class cls, access1002 access1002Var, wie2 wie2Var, HttpLoggingInterceptor.Level level, zzad zzadVar, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 8) != 0) {
            level = HttpLoggingInterceptor.Level.BODY;
        }
        Object objOnWarmupCompleted = tossApiServiceModule.onWarmupCompleted(cls, access1002Var, wie2Var, level, zzadVar);
        int i5 = IAuthTabCallbackDefault + 3;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return objOnWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final <T> T onWarmupCompleted(Class<T> cls, access1002 access1002Var, wie2 wie2Var, HttpLoggingInterceptor.Level level, zzad zzadVar) throws Throwable {
        int i = 2 % 2;
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().connectionSpecs(CollectionsKt.listOf(new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT})).addInterceptor(new NativeAdBaseMediaCacheFlag());
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        OkHttpClient.Builder builder = builderAddInterceptor.readTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(30L, setrevision)).writeTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(30L, setrevision));
        if (zzadVar.RemoteActionCompatParcelizer()) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1590500397);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 50078), TextUtils.lastIndexOf("", '0', 0, 0) + 24, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24756, -1871569597, false, (String) null, new Class[0]);
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
        if (zzadVar.onActivityLayout()) {
            Iterator<T> it = AdSettingsIntegrationErrorMode.onNavigationEvent.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                int i2 = asInterface + 115;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                int i4 = onExtraCallbackWithResult.IAuthTabCallback[((AdView) it.next()).ordinal()];
                if (i4 != 1) {
                    int i5 = IAuthTabCallbackDefault;
                    int i6 = i5 + 103;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    if (i4 == 2) {
                        UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builder);
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i8 = i5 + 51;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                        builder.addInterceptor(access1002Var.onWarmupCompleted());
                    }
                } else {
                    builder.addInterceptor(new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(level));
                }
            }
        }
        OkHttpClient okHttpClientBuild = builder.build();
        getAdSizeApi.IAuthTabCallback.onNavigationEvent(okHttpClientBuild);
        return (T) new Retrofit.Builder().onExtraCallbackWithResult(okHttpClientBuild).IAuthTabCallback("http://localhost").onExtraCallback(deleteCert.IAuthTabCallback()).onExtraCallback(a3.Companion.onExtraCallbackWithResult(wie2Var)).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).IAuthTabCallback().onNavigationEvent(cls);
    }

    static /* synthetic */ Object onExtraCallback(TossApiServiceModule tossApiServiceModule, Class cls, access1002 access1002Var, HttpLoggingInterceptor.Level level, String str, Context context, int i, Object obj) {
        String str2;
        Context context2;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 33;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0 ? (i & 8) == 0 : (i & 50) == 0) {
            str2 = str;
        } else {
            int i5 = i3 + 13;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        if ((i & 16) != 0) {
            int i7 = i3 + 109;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            context2 = null;
        } else {
            context2 = context;
        }
        return onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -2031609872, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 2031609880, new Object[]{tossApiServiceModule, cls, access1002Var, level, str2, context2});
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        int i;
        int i2;
        Class cls = (Class) objArr[1];
        access1002 access1002Var = (access1002) objArr[2];
        HttpLoggingInterceptor.Level level = (HttpLoggingInterceptor.Level) objArr[3];
        String str = (String) objArr[4];
        Context context = (Context) objArr[5];
        int i3 = 2 % 2;
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().connectionSpecs(CollectionsKt.listOf(new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT})).addInterceptor(new NativeAdBaseMediaCacheFlag());
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        OkHttpClient.Builder builder = builderAddInterceptor.readTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(30L, setrevision)).writeTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(30L, setrevision));
        if (context != null) {
            builder.cache(new Cache(new File(context.getCacheDir(), "external_api_http_cache"), 10485760L));
        }
        if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1590500397);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 50078), 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 24756, -1871569597, false, (String) null, new Class[0]);
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
            Iterator it = AdSettingsIntegrationErrorMode.onNavigationEvent.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                int i4 = asInterface + 47;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    i = onExtraCallbackWithResult.IAuthTabCallback[((AdView) it.next()).ordinal()];
                    if (i != 0) {
                        i2 = asInterface + 55;
                        IAuthTabCallbackDefault = i2 % 128;
                        if (i2 % 2 == 0) {
                            if (i == 4) {
                                UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builder);
                            } else {
                                if (i == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                builder.addInterceptor(access1002Var.onWarmupCompleted());
                            }
                        } else if (i == 2) {
                            UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builder);
                        } else if (i == 3) {
                        }
                    } else {
                        builder.addInterceptor(new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(level));
                    }
                } else {
                    i = onExtraCallbackWithResult.IAuthTabCallback[((AdView) it.next()).ordinal()];
                    if (i != 1) {
                        i2 = asInterface + 55;
                        IAuthTabCallbackDefault = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    } else {
                        builder.addInterceptor(new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(level));
                    }
                }
            }
        }
        OkHttpClient okHttpClientBuild = builder.build();
        getAdSizeApi.IAuthTabCallback.onNavigationEvent(okHttpClientBuild);
        Retrofit.Builder builderOnExtraCallbackWithResult = new Retrofit.Builder().onExtraCallbackWithResult(okHttpClientBuild);
        if (str != null) {
            int i5 = asInterface + 25;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (str.length() == 0) {
                str = "http://localhost";
            }
        }
        return builderOnExtraCallbackWithResult.IAuthTabCallback(str).onExtraCallback(deleteCert.IAuthTabCallback()).onExtraCallback(gd.Companion.onNavigationEvent()).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).IAuthTabCallback().onNavigationEvent(cls);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossApiServiceModule tossApiServiceModule = (TossApiServiceModule) objArr[0];
        access1002 access1002Var = (access1002) objArr[1];
        HttpLoggingInterceptor.Level level = (HttpLoggingInterceptor.Level) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(access1002Var, "");
            Intrinsics.checkNotNullParameter(level, "");
            return (getLongValue) tossApiServiceModule.onExtraCallback(getLongValue.class, access1002Var, level);
        }
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(level, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final <T> T onExtraCallback(Class<T> cls, access1002 access1002Var, HttpLoggingInterceptor.Level level) throws Throwable {
        int i = 2 % 2;
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(new fromJSONObject());
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        OkHttpClient.Builder builder = builderAddInterceptor.readTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(30L, setrevision)).writeTimeout-LRDsOJo(setCommandLine.IAuthTabCallback(30L, setrevision));
        Object obj = null;
        if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1590500397);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50078 - Drawable.resolveOpacity(0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, 24756 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1871569597, false, (String) null, new Class[0]);
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
            int i2 = IAuthTabCallbackDefault + 7;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                AdSettingsIntegrationErrorMode.onNavigationEvent.onWarmupCompleted().iterator();
                obj.hashCode();
                throw null;
            }
            Iterator<T> it = AdSettingsIntegrationErrorMode.onNavigationEvent.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                int i3 = IAuthTabCallbackDefault + 17;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = onExtraCallbackWithResult.IAuthTabCallback[((AdView) it.next()).ordinal()];
                if (i5 != 1) {
                    int i6 = IAuthTabCallbackDefault + 109;
                    int i7 = i6 % 128;
                    asInterface = i7;
                    int i8 = i6 % 2;
                    if (i5 == 2) {
                        UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builder);
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i9 = i7 + 49;
                        IAuthTabCallbackDefault = i9 % 128;
                        if (i9 % 2 != 0) {
                            builder.addInterceptor(access1002Var.onWarmupCompleted());
                            int i10 = 63 / 0;
                        } else {
                            builder.addInterceptor(access1002Var.onWarmupCompleted());
                        }
                    }
                } else {
                    builder.addInterceptor(new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(level));
                }
            }
        }
        OkHttpClient okHttpClientBuild = builder.build();
        getAdSizeApi.IAuthTabCallback.onNavigationEvent(okHttpClientBuild);
        return (T) new Retrofit.Builder().onExtraCallbackWithResult(okHttpClientBuild).IAuthTabCallback(zzaj.onNavigationEvent().IAuthTabCallbackDefault()).onExtraCallback(deleteCert.IAuthTabCallback()).onExtraCallback(gd.Companion.onNavigationEvent()).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).IAuthTabCallback().onNavigationEvent(cls);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final extraData onNavigationEvent(@NotNull Context context, @NotNull access1002 access1002Var, @NotNull HttpLoggingInterceptor.Level level) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(level, "");
        OkHttpClient.Builder builderCache = new OkHttpClient.Builder().cache(new Cache(new File(context.getCacheDir(), "download_cache"), 104857600L));
        if (zzaj.onNavigationEvent().onActivityLayout()) {
            Iterator it = AdSettingsIntegrationErrorMode.onNavigationEvent.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                int i2 = onExtraCallbackWithResult.IAuthTabCallback[((AdView) it.next()).ordinal()];
                if (i2 != 1) {
                    int i3 = asInterface;
                    int i4 = i3 + 91;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (i2 == 5) {
                            UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builderCache);
                        } else {
                            if (i2 == 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i5 = i3 + 115;
                            IAuthTabCallbackDefault = i5 % 128;
                            int i6 = i5 % 2;
                            builderCache.addInterceptor(access1002Var.onWarmupCompleted());
                        }
                    } else if (i2 == 2) {
                        UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builderCache);
                    } else if (i2 == 3) {
                    }
                } else {
                    builderCache.addInterceptor(new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(level));
                    int i7 = asInterface + 65;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        }
        OkHttpClient okHttpClientBuild = builderCache.build();
        getAdSizeApi.IAuthTabCallback.onNavigationEvent(okHttpClientBuild);
        Retrofit retrofitIAuthTabCallback = new Retrofit.Builder().onExtraCallbackWithResult(okHttpClientBuild).IAuthTabCallback(zzaj.onNavigationEvent().IAuthTabCallbackDefault()).onExtraCallback(deleteCert.IAuthTabCallback()).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(retrofitIAuthTabCallback, "");
        Object objOnNavigationEvent = retrofitIAuthTabCallback.onNavigationEvent(extraData.class);
        Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
        Intrinsics.checkNotNull(objOnNavigationEvent, "");
        return (extraData) objOnNavigationEvent;
    }

    public final keywords IAuthTabCallback_Parcel(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, keywords.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, keywords.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        keywords keywordsVar = (keywords) objOnExtraCallback;
        int i3 = asInterface + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return keywordsVar;
    }

    public final onResourceRequest access000(@NotNull g1 g1Var) throws Throwable {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-122, -119, -114, -115, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, View.resolveSize(1, 0) * 32, objArr);
            objOnExtraCallback = g1.onExtraCallback(g1Var, onResourceRequest.class, ((String) objArr[0]).intern(), (Long) null, (Long) null, (Function1) null, 48, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-122, -119, -114, -115, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - View.resolveSize(0, 0), objArr2);
            objOnExtraCallback = g1.onExtraCallback(g1Var, onResourceRequest.class, ((String) objArr2[0]).intern(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (onResourceRequest) objOnExtraCallback;
    }

    public final sendEventId readTypedObject(@NotNull g1 g1Var) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        String str = onExtraCallback;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-122, -114, -109, -120, -110, -111, -113, -122, -112, -113}, 126 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
        sb.append(((String) objArr[0]).intern());
        sendEventId sendeventid = (sendEventId) g1.onExtraCallback(g1Var, sendEventId.class, sb.toString(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i2 = IAuthTabCallbackDefault + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return sendeventid;
        }
        obj.hashCode();
        throw null;
    }

    public final getVolume IAuthTabCallback(@NotNull access1002 access1002Var, @NotNull HttpLoggingInterceptor.Level level, @NotNull doCheckNativeCrash dochecknativecrash) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(access1002Var, "");
            Intrinsics.checkNotNullParameter(level, "");
            Intrinsics.checkNotNullParameter(dochecknativecrash, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        getVolume getvolume = (getVolume) initRender.onNavigationEvent(getVolume.class, zzaj.onNavigationEvent().IAuthTabCallbackStubProxy(), access1002Var, level, dochecknativecrash);
        int i3 = IAuthTabCallbackDefault + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return getvolume;
    }

    public final ExtHubLogger1 extraCallbackWithResult(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        ExtHubLogger1 extHubLogger1 = (ExtHubLogger1) g1.onExtraCallback(g1Var, ExtHubLogger1.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackDefault + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return extHubLogger1;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        String str;
        Class<FullScreenAdShowConfigBuilder> cls;
        Long l;
        Function1 function1;
        int i7;
        String str2;
        Class<FullScreenAd> cls2;
        Long l2;
        Long l3;
        Function1 function12;
        int i8;
        int i9 = ~i6;
        int i10 = ~i3;
        int i11 = (~(i9 | i10)) | (~(i10 | i));
        int i12 = ~i;
        int i13 = i11 | (~(i12 | i6 | i3));
        int i14 = i6 | i3;
        int i15 = i12 | i14;
        int i16 = (~(i | i6)) | (~i14);
        int i17 = i6 + i3 + i2 + (1068639271 * i4) + ((-1919980423) * i5);
        int i18 = i17 * i17;
        int i19 = (i6 * 982247175) + 1844138806 + (i3 * 982247175) + (i13 * (-762)) + (i15 * (-762)) + (i16 * 762) + (982246413 * i2) + (1533776379 * i4) + (1016546853 * i5) + (i18 * (-1070530560));
        switch (((i6 * 1648758371) - 594280448) + (1648758371 * i3) + (i13 * (-226102882)) + ((-226102882) * i15) + (226102882 * i16) + (1422655488 * i2) + ((-1693188096) * i4) + (611057664 * i5) + ((-810221568) * i18) + (i19 * i19 * 1708326912)) {
            case 1:
                g1 g1Var = (g1) objArr[1];
                int i20 = 2 % 2;
                int i21 = asInterface + 1;
                IAuthTabCallbackDefault = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(g1Var, "");
                DefaultDevLoadingViewImplementationExternalSyntheticLambda4 defaultDevLoadingViewImplementationExternalSyntheticLambda4 = (DefaultDevLoadingViewImplementationExternalSyntheticLambda4) g1.onExtraCallback(g1Var, DefaultDevLoadingViewImplementationExternalSyntheticLambda4.class, onExtraCallback, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
                int i23 = IAuthTabCallbackDefault + 113;
                asInterface = i23 % 128;
                int i24 = i23 % 2;
                return defaultDevLoadingViewImplementationExternalSyntheticLambda4;
            case 2:
                g1 g1Var2 = (g1) objArr[1];
                int i25 = 2 % 2;
                int i26 = asInterface + 69;
                IAuthTabCallbackDefault = i26 % 128;
                if (i26 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(g1Var2, "");
                    str = onNavigationEvent;
                    cls = FullScreenAdShowConfigBuilder.class;
                    l = null;
                    function1 = null;
                    i7 = 104;
                } else {
                    Intrinsics.checkNotNullParameter(g1Var2, "");
                    str = onNavigationEvent;
                    cls = FullScreenAdShowConfigBuilder.class;
                    l = null;
                    function1 = null;
                    i7 = 20;
                }
                return (FullScreenAdShowConfigBuilder) g1.onExtraCallback(g1Var2, cls, str, l, 60L, function1, i7, (Object) null);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onExtraCallbackWithResult(objArr);
            case 7:
                g1 g1Var3 = (g1) objArr[1];
                int i27 = 2 % 2;
                int i28 = IAuthTabCallbackDefault + 91;
                asInterface = i28 % 128;
                int i29 = i28 % 2;
                Intrinsics.checkNotNullParameter(g1Var3, "");
                getAddPhoneContactDialog getaddphonecontactdialog = (getAddPhoneContactDialog) g1.onExtraCallback(g1Var3, getAddPhoneContactDialog.class, zzaj.onNavigationEvent().IAuthTabCallbackStub(), (Long) null, 60L, (Function1) null, 20, (Object) null);
                int i30 = asInterface + 121;
                IAuthTabCallbackDefault = i30 % 128;
                int i31 = i30 % 2;
                return getaddphonecontactdialog;
            case 8:
                return onExtraCallback(objArr);
            default:
                g1 g1Var4 = (g1) objArr[1];
                int i32 = 2 % 2;
                int i33 = IAuthTabCallbackDefault + 35;
                asInterface = i33 % 128;
                if (i33 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(g1Var4, "");
                    str2 = onExtraCallback;
                    cls2 = FullScreenAd.class;
                    l2 = null;
                    l3 = null;
                    function12 = null;
                    i8 = 14;
                } else {
                    Intrinsics.checkNotNullParameter(g1Var4, "");
                    str2 = onExtraCallback;
                    cls2 = FullScreenAd.class;
                    l2 = null;
                    l3 = null;
                    function12 = null;
                    i8 = 28;
                }
                return (FullScreenAd) g1.onExtraCallback(g1Var4, cls2, str2, l2, l3, function12, i8, (Object) null);
        }
    }

    private final <T> T onExtraCallbackWithResult(Class<T> cls, access1002 access1002Var, HttpLoggingInterceptor.Level level, String str, Context context) {
        return (T) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -2031609872, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 2031609880, new Object[]{this, cls, access1002Var, level, str, context});
    }

    public final getAddPhoneContactDialog IAuthTabCallback(@NotNull g1 g1Var) {
        return (getAddPhoneContactDialog) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 708073920, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -708073913, new Object[]{this, g1Var});
    }

    public final getAppAlias onExtraCallback(@NotNull g1 g1Var) {
        return (getAppAlias) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 381090062, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -381090059, new Object[]{this, g1Var});
    }

    public final getLongValue onExtraCallbackWithResult(@NotNull access1002 access1002Var, @NotNull HttpLoggingInterceptor.Level level) {
        return (getLongValue) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 515021508, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -515021503, new Object[]{this, access1002Var, level});
    }

    public final FullScreenAd IAuthTabCallbackStubProxy(@NotNull g1 g1Var) {
        return (FullScreenAd) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1167137314, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1167137314, new Object[]{this, g1Var});
    }

    public final FullScreenAdShowConfigBuilder writeTypedObject(@NotNull g1 g1Var) {
        return (FullScreenAdShowConfigBuilder) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1720799176, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1720799178, new Object[]{this, g1Var});
    }

    public final InterstitialAdInterstitialAdShowConfigBuilder extraCallback(@NotNull g1 g1Var) {
        return (InterstitialAdInterstitialAdShowConfigBuilder) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1160867494, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1160867498, new Object[]{this, g1Var});
    }

    public final DefaultDevLoadingViewImplementationExternalSyntheticLambda4 onPostMessage(@NotNull g1 g1Var) {
        return (DefaultDevLoadingViewImplementationExternalSyntheticLambda4) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -2118352941, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 2118352942, new Object[]{this, g1Var});
    }

    public final DevSupportManagerBaseExternalSyntheticLambda14 onActivityLayout(@NotNull g1 g1Var) {
        return (DevSupportManagerBaseExternalSyntheticLambda14) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 107132258, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -107132252, new Object[]{this, g1Var});
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{32554, 32550, 32546, 32551, 32536, 32739, 32561, 32553, 32567, 32748, 32547, 32557, 32559, 32601, 32548, 32743, 32565, 32544, 32564};
        onExtraCallbackWithResult = -1184333870;
        onTransact = true;
        IAuthTabCallbackStub = true;
    }
}
