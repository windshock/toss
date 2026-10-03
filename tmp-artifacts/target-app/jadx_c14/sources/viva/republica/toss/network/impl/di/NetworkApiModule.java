package viva.republica.toss.network.impl.di;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultMediaViewVideoRenderer;
import o.EncryptedContentInfoParser;
import o.ExtraHints;
import o.ExtraHintsHintType;
import o.ExtraHintsKeyword;
import o.InterstitialAd;
import o.InterstitialAdExtendedListener;
import o.InterstitialAdInterstitialAdLoadConfigBuilder;
import o.InterstitialAdInterstitialShowAdConfig;
import o.InterstitialAdListener;
import o.MediaViewVideoRenderer;
import o.buildShowAdConfig;
import o.ca;
import o.ea;
import o.engageSeek;
import o.g1;
import o.getAdContentsView;
import o.getCurrentTimeMs;
import o.getHints;
import o.getMediaHeight;
import o.getMediaViewApi;
import o.getMediationData;
import o.getNativeAdApi;
import o.initializeSelf;
import o.isVideoContent;
import o.mediationData;
import o.onEnterFullscreen;
import o.onPlayed;
import o.onSeekDisengaged;
import o.onVolumeChange;
import o.onVolumeChanged;
import o.repair;
import o.setVideoRenderer;
import o.setVolume;
import o.shouldAllowBackgroundPlayback;
import o.shouldAutoplay;
import o.unsetNativeAd;
import o.withCacheFlags;
import o.withRewardData;
import o.withRewardedAdListener;
import o.zzaj;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.api.TossDomainLogApi;
import viva.republica.toss.network.api.TossLogApi;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NetworkApiModule {
    private static int IAuthTabCallback;
    private static short[] IAuthTabCallbackStub;
    private static int access000;
    private static byte[] asBinder;
    private static int asInterface;
    public static final NetworkApiModule onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {93, 49, 76, -114};
    private static final int $$b = 241;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r1 = viva.republica.toss.network.impl.di.NetworkApiModule.$$a
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.impl.di.NetworkApiModule.$$c(short, byte, short):java.lang.String");
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i6) | i4)) | (~(i4 | i5));
        int i8 = (~i4) | (~i5);
        int i9 = i7 | (~(i8 | i6));
        int i10 = (~i8) | i6;
        int i11 = ~(i5 | i6);
        int i12 = i6 + i4 + i3 + ((-417414852) * i2) + (1247522396 * i);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1219797419)) + 1526988800 + ((-1219797419) * i4) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i3) + ((-2135949312) * i2) + ((-953155584) * i) + ((-430374912) * i13);
        int i15 = ((i6 * 184508743) - 476012450) + (i4 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i3 * 184509739) + (i2 * (-953474796)) + (i * (-288057996)) + (i13 * (-839712768));
        switch (i14 + (i15 * i15 * 1709113344)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                g1 g1Var = (g1) objArr[1];
                int i16 = 2 % 2;
                int i17 = onTransact + 119;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNullParameter(g1Var, "");
                setVideoRenderer setvideorenderer = (setVideoRenderer) g1.onExtraCallback(g1Var, setVideoRenderer.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
                int i19 = onTransact + 21;
                IAuthTabCallbackDefault = i19 % 128;
                int i20 = i19 % 2;
                return setvideorenderer;
            case 2:
                g1 g1Var2 = (g1) objArr[1];
                final ea eaVar = (ea) objArr[2];
                int i21 = 2 % 2;
                Intrinsics.checkNotNullParameter(g1Var2, "");
                Intrinsics.checkNotNullParameter(eaVar, "");
                TossLogApi tossLogApi = (TossLogApi) g1.onExtraCallback(g1Var2, TossLogApi.class, zzaj.onNavigationEvent().ITrustedWebActivityCallback() + "/api/", (Long) null, (Long) null, new Function1() { // from class: viva.republica.toss.network.impl.di.NetworkApiModule$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return NetworkApiModule.onWarmupCompleted(eaVar, (OkHttpClient.Builder) obj);
                    }
                }, 12, (Object) null);
                int i22 = IAuthTabCallbackDefault + 95;
                onTransact = i22 % 128;
                int i23 = i22 % 2;
                return tossLogApi;
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                g1 g1Var3 = (g1) objArr[1];
                int i24 = 2 % 2;
                int i25 = onTransact + 21;
                IAuthTabCallbackDefault = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(g1Var3, "");
                InterstitialAdListener interstitialAdListener = (InterstitialAdListener) g1.onExtraCallback(g1Var3, InterstitialAdListener.class, zzaj.onNavigationEvent().readTypedObject(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
                int i27 = onTransact + 53;
                IAuthTabCallbackDefault = i27 % 128;
                int i28 = i27 % 2;
                return interstitialAdListener;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onExtraCallback(objArr);
            case 7:
                g1 g1Var4 = (g1) objArr[1];
                int i29 = 2 % 2;
                int i30 = onTransact + 93;
                IAuthTabCallbackDefault = i30 % 128;
                int i31 = i30 % 2;
                Intrinsics.checkNotNullParameter(g1Var4, "");
                initializeSelf initializeself = (initializeSelf) g1.onExtraCallback(g1Var4, initializeSelf.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
                int i32 = onTransact + 25;
                IAuthTabCallbackDefault = i32 % 128;
                int i33 = i32 % 2;
                return initializeself;
            default:
                g1 g1Var5 = (g1) objArr[1];
                int i34 = 2 % 2;
                int i35 = IAuthTabCallbackDefault + 7;
                onTransact = i35 % 128;
                int i36 = i35 % 2;
                Intrinsics.checkNotNullParameter(g1Var5, "");
                TossDomainLogApi tossDomainLogApi = (TossDomainLogApi) g1.onExtraCallback(g1Var5, TossDomainLogApi.class, zzaj.onNavigationEvent().IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
                int i37 = onTransact + 21;
                IAuthTabCallbackDefault = i37 % 128;
                int i38 = i37 % 2;
                return tossDomainLogApi;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(ea eaVar, OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(eaVar, builder);
        }
        onExtraCallbackWithResult(eaVar, builder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private NetworkApiModule() {
    }

    static {
        access000 = 1;
        onExtraCallbackWithResult();
        onExtraCallback = new NetworkApiModule();
        onNavigationEvent = zzaj.onNavigationEvent().IAuthTabCallbackDefault();
        onExtraCallbackWithResult = zzaj.onNavigationEvent().IAuthTabCallbackStub();
        int i = IAuthTabCallback_Parcel + 85;
        access000 = i % 128;
        if (i % 2 == 0) {
            int i2 = 23 / 0;
        }
    }

    public final engageSeek getInterfaceDescriptor(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, engageSeek.class, onNavigationEvent, (Long) null, (Long) null, (Function1) null, 106, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, engageSeek.class, onNavigationEvent, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (engageSeek) objOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(ea eaVar, OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        builder.dns(eaVar.onNavigationEvent(ca.INFRA));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 113;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final getCurrentTimeMs ICustomTabsCallbackDefault(@NotNull g1 g1Var) {
        String strOnTransact;
        Class<getCurrentTimeMs> cls;
        Long l;
        Long l2;
        Function1 function1;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 41;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            strOnTransact = zzaj.onNavigationEvent().onTransact();
            cls = getCurrentTimeMs.class;
            l = null;
            l2 = null;
            function1 = null;
            i = 11;
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            strOnTransact = zzaj.onNavigationEvent().onTransact();
            cls = getCurrentTimeMs.class;
            l = null;
            l2 = null;
            function1 = null;
            i = 28;
        }
        getCurrentTimeMs getcurrenttimems = (getCurrentTimeMs) g1.onExtraCallback(g1Var, cls, strOnTransact, l, l2, function1, i, (Object) null);
        int i4 = onTransact + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return getcurrenttimems;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onPlayed mayLaunchUrl(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        onPlayed onplayed = (onPlayed) g1.onExtraCallback(g1Var, onPlayed.class, onNavigationEvent, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackDefault + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return onplayed;
    }

    public final InterstitialAdInterstitialAdLoadConfigBuilder access100(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, InterstitialAdInterstitialAdLoadConfigBuilder.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 2, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, InterstitialAdInterstitialAdLoadConfigBuilder.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        InterstitialAdInterstitialAdLoadConfigBuilder interstitialAdInterstitialAdLoadConfigBuilder = (InterstitialAdInterstitialAdLoadConfigBuilder) objOnExtraCallback;
        int i3 = IAuthTabCallbackDefault + 5;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return interstitialAdInterstitialAdLoadConfigBuilder;
    }

    public final withRewardedAdListener IAuthTabCallbackStubProxy(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        withRewardedAdListener withrewardedadlistener = (withRewardedAdListener) g1.onExtraCallback(g1Var, withRewardedAdListener.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onTransact + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return withrewardedadlistener;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        g1 g1Var = (g1) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        unsetNativeAd unsetnativead = (unsetNativeAd) g1.onExtraCallback(g1Var, unsetNativeAd.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onTransact + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unsetnativead;
    }

    public final shouldAutoplay isEngagementSignalsApiAvailable(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        shouldAutoplay shouldautoplay = (shouldAutoplay) g1.onExtraCallback(g1Var, shouldAutoplay.class, onExtraCallbackWithResult, (Long) null, 60L, (Function1) null, 20, (Object) null);
        int i4 = onTransact + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return shouldautoplay;
    }

    public final setVolume ICustomTabsService(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        setVolume setvolume = (setVolume) g1.onExtraCallback(g1Var, setVolume.class, onExtraCallbackWithResult, 60L, 60L, (Function1) null, 16, (Object) null);
        int i4 = onTransact + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return setvolume;
    }

    public final shouldAllowBackgroundPlayback newAuthTabSession(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        shouldAllowBackgroundPlayback shouldallowbackgroundplayback = (shouldAllowBackgroundPlayback) g1.onExtraCallback(g1Var, shouldAllowBackgroundPlayback.class, onExtraCallbackWithResult, 60L, 60L, (Function1) null, 16, (Object) null);
        int i4 = IAuthTabCallbackDefault + 21;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return shouldallowbackgroundplayback;
        }
        throw null;
    }

    public final onVolumeChanged extraCommand(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        onVolumeChanged onvolumechanged = (onVolumeChanged) g1.onExtraCallback(g1Var, onVolumeChanged.class, onExtraCallbackWithResult, 60L, 60L, (Function1) null, 16, (Object) null);
        int i4 = onTransact + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return onvolumechanged;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getNativeAdApi newSessionWithExtras(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getNativeAdApi.class, onExtraCallbackWithResult, 60L, 60L, (Function1) null, 41, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getNativeAdApi.class, onExtraCallbackWithResult, 60L, 60L, (Function1) null, 16, (Object) null);
        }
        getNativeAdApi getnativeadapi = (getNativeAdApi) objOnExtraCallback;
        int i3 = IAuthTabCallbackDefault + 73;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return getnativeadapi;
        }
        throw null;
    }

    public final onSeekDisengaged onRelationshipValidationResult(@NotNull g1 g1Var) {
        String strIAuthTabCallbackStub;
        long j;
        Class<onSeekDisengaged> cls;
        Function1 function1;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 115;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            strIAuthTabCallbackStub = zzaj.onNavigationEvent().IAuthTabCallbackStub();
            j = 60L;
            cls = onSeekDisengaged.class;
            function1 = null;
            i = 72;
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            strIAuthTabCallbackStub = zzaj.onNavigationEvent().IAuthTabCallbackStub();
            j = 60L;
            cls = onSeekDisengaged.class;
            function1 = null;
            i = 16;
        }
        onSeekDisengaged onseekdisengaged = (onSeekDisengaged) g1.onExtraCallback(g1Var, cls, strIAuthTabCallbackStub, j, j, function1, i, (Object) null);
        int i4 = IAuthTabCallbackDefault + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return onseekdisengaged;
    }

    public final ExtraHints onExtraCallback(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, ExtraHints.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 110, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, ExtraHints.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (ExtraHints) objOnExtraCallback;
    }

    public final repair onMinimized(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, repair.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 21, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, repair.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (repair) objOnExtraCallback;
    }

    public final getMediaViewApi onMessageChannelReady(@NotNull g1 g1Var) {
        String strIPostMessageServiceDefault;
        Class<getMediaViewApi> cls;
        Long l;
        Long l2;
        Function1 function1;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 15;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            strIPostMessageServiceDefault = zzaj.onNavigationEvent().IPostMessageServiceDefault();
            cls = getMediaViewApi.class;
            l = null;
            l2 = null;
            function1 = null;
            i = 82;
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            strIPostMessageServiceDefault = zzaj.onNavigationEvent().IPostMessageServiceDefault();
            cls = getMediaViewApi.class;
            l = null;
            l2 = null;
            function1 = null;
            i = 28;
        }
        return (getMediaViewApi) g1.onExtraCallback(g1Var, cls, strIPostMessageServiceDefault, l, l2, function1, i, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3 A[PHI: r3
      0x01b3: PHI (r3v9 int) = (r3v8 int), (r3v44 int) binds: [B:39:0x01b1, B:36:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bd A[PHI: r3
      0x01bd: PHI (r3v41 int) = (r3v8 int), (r3v44 int) binds: [B:39:0x01b1, B:36:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r27, byte r28, int r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.impl.di.NetworkApiModule.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    public final onEnterFullscreen ICustomTabsCallbackStubProxy(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        onEnterFullscreen onenterfullscreen = (onEnterFullscreen) g1.onExtraCallback(g1Var, onEnterFullscreen.class, zzaj.onNavigationEvent().IEngagementSignalsCallback_Parcel(), 15L, (Long) null, (Function1) null, 24, (Object) null);
        int i4 = onTransact + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onenterfullscreen;
    }

    public final MediaViewVideoRenderer ICustomTabsCallbackStub(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        MediaViewVideoRenderer mediaViewVideoRenderer = (MediaViewVideoRenderer) g1.onExtraCallback(g1Var, MediaViewVideoRenderer.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return mediaViewVideoRenderer;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        g1 g1Var = (g1) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        DefaultMediaViewVideoRenderer defaultMediaViewVideoRenderer = (DefaultMediaViewVideoRenderer) g1.onExtraCallback(g1Var, DefaultMediaViewVideoRenderer.class, onExtraCallbackWithResult, (Long) null, 60L, (Function1) null, 20, (Object) null);
        int i4 = onTransact + 11;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return defaultMediaViewVideoRenderer;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        g1 g1Var = (g1) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        getHints gethints = (getHints) g1.onExtraCallback(g1Var, getHints.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onTransact + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return gethints;
    }

    public final getMediationData IAuthTabCallback(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getMediationData.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 3, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getMediationData.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        getMediationData getmediationdata = (getMediationData) objOnExtraCallback;
        int i3 = IAuthTabCallbackDefault + 83;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return getmediationdata;
    }

    public final onVolumeChange onUnminimized(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, onVolumeChange.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 93, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, onVolumeChange.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        onVolumeChange onvolumechange = (onVolumeChange) objOnExtraCallback;
        int i3 = IAuthTabCallbackDefault + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return onvolumechange;
    }

    public final getAdContentsView extraCallback(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        getAdContentsView getadcontentsview = (getAdContentsView) g1.onExtraCallback(g1Var, getAdContentsView.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onTransact + 93;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return getadcontentsview;
    }

    public final InterstitialAdExtendedListener extraCallbackWithResult(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        InterstitialAdExtendedListener interstitialAdExtendedListener = (InterstitialAdExtendedListener) g1.onExtraCallback(g1Var, InterstitialAdExtendedListener.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackDefault + 7;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return interstitialAdExtendedListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ExtraHintsHintType asBinder(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, ExtraHintsHintType.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 97, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, ExtraHintsHintType.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        ExtraHintsHintType extraHintsHintType = (ExtraHintsHintType) objOnExtraCallback;
        int i3 = onTransact + 77;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return extraHintsHintType;
    }

    public final InterstitialAd access000(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, InterstitialAd.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 22, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, InterstitialAd.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (InterstitialAd) objOnExtraCallback;
    }

    public final getMediaHeight readTypedObject(@NotNull g1 g1Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        getMediaHeight getmediaheight = (getMediaHeight) g1.onExtraCallback(g1Var, getMediaHeight.class, zzaj.onNavigationEvent().ITrustedWebActivityService() + "/api/", (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i2 = IAuthTabCallbackDefault + 49;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return getmediaheight;
        }
        throw null;
    }

    public final mediationData onTransact(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, mediationData.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 75, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, mediationData.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        mediationData mediationdata = (mediationData) objOnExtraCallback;
        int i3 = onTransact + 55;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return mediationdata;
        }
        throw null;
    }

    public final withCacheFlags IAuthTabCallback_Parcel(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        withCacheFlags withcacheflags = (withCacheFlags) g1.onExtraCallback(g1Var, withCacheFlags.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackDefault + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return withcacheflags;
    }

    public final ExtraHintsKeyword asInterface(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, ExtraHintsKeyword.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 42, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, ExtraHintsKeyword.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (ExtraHintsKeyword) objOnExtraCallback;
    }

    public final buildShowAdConfig IAuthTabCallbackStub(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, buildShowAdConfig.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 81, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, buildShowAdConfig.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (buildShowAdConfig) objOnExtraCallback;
    }

    public final InterstitialAdInterstitialShowAdConfig writeTypedObject(@NotNull g1 g1Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, InterstitialAdInterstitialShowAdConfig.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 120, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, InterstitialAdInterstitialShowAdConfig.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (InterstitialAdInterstitialShowAdConfig) objOnExtraCallback;
    }

    public final shouldAutoplay postMessage(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        shouldAutoplay shouldautoplay = (shouldAutoplay) g1.onExtraCallback(g1Var, shouldAutoplay.class, onExtraCallbackWithResult, (Long) null, 60L, (Function1) null, 20, (Object) null);
        int i4 = onTransact + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return shouldautoplay;
        }
        throw null;
    }

    public final shouldAutoplay ICustomTabsCallback_Parcel(@NotNull g1 g1Var) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Object obj = null;
        if (!(!zzaj.onNavigationEvent().RemoteActionCompatParcelizer())) {
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 117;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            strIntern = onExtraCallbackWithResult;
            int i4 = i2 + 107;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Object[] objArr = new Object[1];
            a((short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20), TextUtils.lastIndexOf("", '0', 0, 0) - 1173340770, (-1985906082) - (ViewConfiguration.getPressedStateDuration() >> 16), Color.argb(0, 0, 0, 0) - 102, objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        shouldAutoplay shouldautoplay = (shouldAutoplay) g1.onExtraCallback(g1Var, shouldAutoplay.class, strIntern, (Long) null, 60L, (Function1) null, 20, (Object) null);
        int i6 = onTransact + 45;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return shouldautoplay;
        }
        obj.hashCode();
        throw null;
    }

    public final isVideoContent onActivityResized(@NotNull g1 g1Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        isVideoContent isvideocontent = (isVideoContent) g1.onExtraCallback(g1Var, isVideoContent.class, zzaj.onNavigationEvent().onMinimized() + "/tossfeed-og/api/", (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i2 = onTransact + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return isvideocontent;
    }

    public final withRewardData ICustomTabsCallback(@NotNull g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        withRewardData withrewarddata = (withRewardData) g1.onExtraCallback(g1Var, withRewardData.class, onExtraCallbackWithResult, (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = IAuthTabCallbackDefault + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return withrewarddata;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final initializeSelf onNavigationEvent(@NotNull g1 g1Var) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (initializeSelf) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, g1Var}, iOnWarmupCompleted3, iOnWarmupCompleted2, 717844262, iOnWarmupCompleted, -717844255);
    }

    public final DefaultMediaViewVideoRenderer onExtraCallbackWithResult(@NotNull g1 g1Var) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (DefaultMediaViewVideoRenderer) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, g1Var}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1365216164, iOnWarmupCompleted, 1365216167);
    }

    public final getHints onWarmupCompleted(@NotNull g1 g1Var) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (getHints) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, g1Var}, iOnWarmupCompleted3, iOnWarmupCompleted2, 941663766, iOnWarmupCompleted, -941663760);
    }

    public final TossDomainLogApi IAuthTabCallbackDefault(@NotNull g1 g1Var) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (TossDomainLogApi) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, g1Var}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1509378785, iOnWarmupCompleted, 1509378785);
    }

    public final TossLogApi IAuthTabCallback(@NotNull g1 g1Var, @NotNull ea eaVar) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (TossLogApi) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, g1Var, eaVar}, iOnWarmupCompleted3, iOnWarmupCompleted2, -1489873829, iOnWarmupCompleted, 1489873831);
    }

    public final InterstitialAdListener onPostMessage(@NotNull g1 g1Var) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (InterstitialAdListener) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, g1Var}, iOnWarmupCompleted3, iOnWarmupCompleted2, -558603639, iOnWarmupCompleted, 558603643);
    }

    public final setVideoRenderer onActivityLayout(@NotNull g1 g1Var) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (setVideoRenderer) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, g1Var}, iOnWarmupCompleted3, iOnWarmupCompleted2, 147347387, iOnWarmupCompleted, -147347386);
    }

    public final unsetNativeAd prefetch(@NotNull g1 g1Var) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (unsetNativeAd) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, g1Var}, iOnWarmupCompleted3, iOnWarmupCompleted2, 893927315, iOnWarmupCompleted, -893927310);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = -509076885;
        onWarmupCompleted = -1538795411;
        asInterface = -770089470;
        asBinder = new byte[]{-79, -37, -28, 18, 47, -21, 29, 20, -30, 29, -22, -48, 25, 38, -90, 29, 25, -26, 91, -40, 30, -19, 90, 29, -24, -38, 30, -31, 29, 17};
    }
}
