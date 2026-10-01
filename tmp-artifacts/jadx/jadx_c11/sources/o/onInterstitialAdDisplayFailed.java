package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.google.android.gms.internal.ads.zzgc;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.observability.instrumentation.rn.RnBundleInfo;
import im.toss.observability.instrumentation.rn.RnCause;
import im.toss.rn.granite.android.video.TossExoPlayerProvider;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.toss.core.GraniteBrownfieldModule;
import im.toss.rn.toss.core.TossModule;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import im.toss.rn.toss.core.portal.PortalRuntimeRecycleConfig;
import im.toss.rn.toss.core.portal.PortalServiceActivity;
import im.toss.rn.toss.core.util.RnAppVersion;
import im.toss.rn.toss.core.webview.TossAppServiceWebViewProvider;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.tds.view.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.MaxFullscreenAdImpl;
import o.MaxFullscreenAdImplExternalSyntheticLambda6;
import o.WebSocketFactory;
import o.getPreRenderJob;
import o.getSignForPKCS7NoContents;
import o.isLoading;
import o.onAppOpenAdDisplayed;
import o.onAppOpenAdHidden;
import o.onInterstitialAdDisplayFailed;
import o.pkcs5PBKDF2;
import o.readFileToByteArray;
import o.transGetKmCert;
import o.transV2ExportCert;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onInterstitialAdDisplayFailed {
    public static final onExtraCallbackWithResult Companion;
    private static long ICustomTabsServiceDefault;
    private static char[] ICustomTabsServiceStub;
    private static int ICustomTabsService_Parcel;
    private final Application IAuthTabCallback;
    private volatile transGetKmCert IAuthTabCallbackDefault;
    private ReactSurface IAuthTabCallbackStub;
    private final zzad IAuthTabCallbackStubProxy;
    private final onAdViewAdDisplayFailed<Activity> IAuthTabCallback_Parcel;
    private final access6900<asBinder> ICustomTabsCallback;
    private final ICustomTabsCallbackDefault ICustomTabsCallbackDefault;
    private final AtomicBoolean ICustomTabsCallbackStub;
    private String ICustomTabsCallbackStubProxy;
    private volatile String ICustomTabsCallback_Parcel;
    private volatile long ICustomTabsService;
    private volatile pauseMyRequest<Unit> access000;
    private final onAdViewAdDisplayed access100;
    private final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow asBinder;
    private final findResAndMsg asInterface;
    private final getStartTimeMillis extraCallback;
    private final LinkedHashSet<String> extraCallbackWithResult;
    private volatile long extraCommand;
    private final Lazy getInterfaceDescriptor;
    private final onAdViewAdHidden isEngagementSignalsApiAvailable;
    private final RnPhaseObserver mayLaunchUrl;
    private final okhttp3.OkHttpClient newAuthTabSession;
    private final onAppOpenAdLoaded newSession;
    private volatile String newSessionWithExtras;
    private volatile boolean onActivityLayout;
    private final Set<String> onActivityResized;
    private volatile MaxFullscreenAdImplExternalSyntheticLambda6 onExtraCallback;
    private volatile onWarmupCompleted onExtraCallbackWithResult;
    private volatile String onMessageChannelReady;
    private final ConcurrentHashMap<String, onAppOpenAdDisplayed> onMinimized;
    private final Context onNavigationEvent;
    private ReactHost onPostMessage;
    private final Runnable onRelationshipValidationResult;
    private volatile MaxFullscreenAdImplExternalSyntheticLambda2 onTransact;
    private final onAppOpenAdClicked onUnminimized;
    private final AppState onWarmupCompleted;
    private volatile long postMessage;
    private final jni_YGNodeStyleGetFlexBasisJNI prefetch;
    private final LinkedHashMap<String, IAuthTabCallbackDefault> prefetchWithMultipleUrls;
    private final ResourceResolutionException readTypedObject;
    private final AtomicBoolean receiveFile;
    private volatile long requestPostMessageChannel;
    private volatile long requestPostMessageChannelWithExtras;
    private final onAdViewAdExpanded setEngagementSignalsCallback;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 updateVisuals;
    private final getBillingPeriod validateRelationship;
    private final Handler writeTypedObject;
    private static final byte[] $$a = {29, -59, -25, -119};
    private static final int $$b = 141;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedList = 1;
    private static int warmup = 0;
    private static int IEngagementSignalsCallback = 1;

    static final class IAuthTabCallbackStubProxy extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = onInterstitialAdDisplayFailed.IAuthTabCallback(onInterstitialAdDisplayFailed.this, (onExtraCallback) null, (ReactContext) null, (access13800) this);
            if (i3 != 0) {
                int i4 = 74 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static final class ICustomTabsCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        ICustomTabsCallback(access13800<? super ICustomTabsCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = onInterstitialAdDisplayFailed.onExtraCallback(onInterstitialAdDisplayFailed.this, (String) null, (String) null, (access13800) this);
            int i4 = onExtraCallbackWithResult + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static final class ICustomTabsCallbackStubProxy<T> extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        ICustomTabsCallbackStubProxy(access13800<? super ICustomTabsCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
            if (i3 != 0) {
                return onInterstitialAdDisplayFailed.onExtraCallback(oninterstitialaddisplayfailed, null, null, null, this);
            }
            onInterstitialAdDisplayFailed.onExtraCallback(oninterstitialaddisplayfailed, null, null, null, this);
            throw null;
        }
    }

    static final class access000 extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        access000(access13800<? super access000> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
            if (i3 == 0) {
                onInterstitialAdDisplayFailed.onExtraCallback(oninterstitialaddisplayfailed, (String) null, (ReactContext) null, (access13800) this);
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onInterstitialAdDisplayFailed.onExtraCallback(oninterstitialaddisplayfailed, (String) null, (ReactContext) null, (access13800) this);
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    static final class access100 extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = onInterstitialAdDisplayFailed.onExtraCallbackWithResult(onInterstitialAdDisplayFailed.this, (String) null, (ReactContext) null, (access13800) this);
            int i4 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class extraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        extraCallback(access13800<? super extraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objIAuthTabCallback = onInterstitialAdDisplayFailed.IAuthTabCallback(821450504, new Object[]{onInterstitialAdDisplayFailed.this, null, this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -821450502);
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onMessageChannelReady extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onMessageChannelReady(access13800<? super onMessageChannelReady> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = onInterstitialAdDisplayFailed.onExtraCallbackWithResult(onInterstitialAdDisplayFailed.this, (onAppOpenAdHidden) null, (access13800) this);
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onPostMessage extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onPostMessage(access13800<? super onPostMessage> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
            if (i3 == 0) {
                return onInterstitialAdDisplayFailed.onNavigationEvent(oninterstitialaddisplayfailed, (String) null, (access13800) this);
            }
            onInterstitialAdDisplayFailed.onNavigationEvent(oninterstitialaddisplayfailed, (String) null, (access13800) this);
            obj2.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ class onTransact {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onInterstitialAdClicked.values().length];
            try {
                iArr[onInterstitialAdClicked.STALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onInterstitialAdClicked.ALREADY_CLOSED.ordinal()] = 2;
                int i = onNavigationEvent + 75;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onInterstitialAdClicked.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onInterstitialAdClicked.COMPLETED.ordinal()] = 4;
                int i3 = onNavigationEvent + 39;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2 = s2 * 3;
        int i3 = 3 - (b * 3);
        int i4 = (s * 2) + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 = (-i4) + i6;
            i = i7;
            int i8 = i3;
            int i9 = i4;
            int i10 = i8 + 1;
            bArr2[i] = (byte) i9;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i3 = i10;
            i4 = bArr[i10];
            i7 = i + 1;
            i6 = i9;
            i4 = (-i4) + i6;
            i = i7;
            int i82 = i3;
            int i92 = i4;
            int i102 = i82 + 1;
            bArr2[i] = (byte) i92;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i822 = i3;
            int i922 = i4;
            int i1022 = i822 + 1;
            bArr2[i] = (byte) i922;
            if (i == i5) {
            }
        }
    }

    static {
        ICustomTabsService_Parcel = 0;
        extraCallbackWithResult();
        Companion = new onExtraCallbackWithResult(null);
        int i = writeTypedList + 29;
        ICustomTabsService_Parcel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(Map.Entry entry) {
        int i = 2 % 2;
        int i2 = warmup + 71;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = onExtraCallback(entry);
        int i4 = warmup + 115;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallback;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i2)) | i;
        int i9 = (~(i7 | (~i2))) | (~((~i) | i7)) | (~(i | i6 | i2));
        int i10 = ~(i2 | i);
        int i11 = i + i6 + i3 + ((-813770285) * i5) + (135932771 * i4);
        int i12 = i11 * i11;
        int i13 = (526900465 * i) + 74317824 + ((-1745228167) * i6) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i3) + (1331953664 * i5) + ((-366739456) * i4) + ((-1308753920) * i12);
        int i14 = (i * 1149714451) + 247108311 + (i6 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i3 * 1149713731) + (i5 * 1918847289) + (i4 * (-2006650391)) + (i12 * 460980224);
        switch (i13 + (i14 * i14 * (-1418592256))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return writeTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return ICustomTabsCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return onMessageChannelReady(objArr);
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return onPostMessage(objArr);
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return onActivityLayout(objArr);
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return onMinimized(objArr);
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return onActivityResized(objArr);
            case R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                return ICustomTabsCallbackStub(objArr);
            case R.styleable.TdsListRowV1View_leftLottieHeight /* 27 */:
                return onUnminimized(objArr);
            case R.styleable.TdsListRowV1View_leftLottieRepeatCount /* 28 */:
                return ICustomTabsCallbackDefault(objArr);
            case R.styleable.TdsListRowV1View_leftLottieUrl /* 29 */:
                return ICustomTabsCallbackStubProxy(objArr);
            case R.styleable.TdsListRowV1View_leftLottieWidth /* 30 */:
                return onRelationshipValidationResult(objArr);
            case R.styleable.TdsListRowV1View_leftRank /* 31 */:
                return mayLaunchUrl(objArr);
            case R.styleable.TdsListRowV1View_leftType /* 32 */:
                return ICustomTabsCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_rightArrow /* 33 */:
                return isEngagementSignalsApiAvailable(objArr);
            case R.styleable.TdsListRowV1View_rightBadgeText /* 34 */:
                return ICustomTabsService(objArr);
            case R.styleable.TdsListRowV1View_rightBreakEnabled /* 35 */:
                return extraCommand(objArr);
            case R.styleable.TdsListRowV1View_rightButtonDisplay /* 36 */:
                return newAuthTabSession(objArr);
            case R.styleable.TdsListRowV1View_rightButtonLabel /* 37 */:
                return postMessage(objArr);
            default:
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
                int i15 = 2 % 2;
                int i16 = IEngagementSignalsCallback + 39;
                warmup = i16 % 128;
                int i17 = i16 % 2;
                onWarmupCompleted onwarmupcompleted = oninterstitialaddisplayfailed.onExtraCallbackWithResult;
                int i18 = warmup + 29;
                IEngagementSignalsCallback = i18 % 128;
                int i19 = i18 % 2;
                return onwarmupcompleted;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Activity activity) {
        int i = 2 % 2;
        int i2 = warmup + 107;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(oninterstitialaddisplayfailed, activity);
        int i4 = warmup + 59;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ transV2ExportCert IAuthTabCallback() {
        transV2ExportCert transv2exportcertICustomTabsCallback_Parcel;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 3;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            transv2exportcertICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
            int i3 = 3 / 0;
        } else {
            transv2exportcertICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        }
        int i4 = IEngagementSignalsCallback + 27;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return transv2exportcertICustomTabsCallback_Parcel;
    }

    public static /* synthetic */ void IAuthTabCallback(int i, onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Throwable th, String str, long j, long j2) {
        int i2 = 2 % 2;
        int i3 = warmup + 97;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(-100361786, new Object[]{Integer.valueOf(i), oninterstitialaddisplayfailed, th, str, Long.valueOf(j), Long.valueOf(j2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 100361800);
            int i4 = 19 / 0;
        } else {
            IAuthTabCallback(-100361786, new Object[]{Integer.valueOf(i), oninterstitialaddisplayfailed, th, str, Long.valueOf(j), Long.valueOf(j2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 100361800);
        }
        int i5 = warmup + 109;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 1;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 51;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(oninterstitialaddisplayfailed);
        int i4 = warmup + 95;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, int i, onInterstitialAdLoadFailed oninterstitialadloadfailed) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 123;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(oninterstitialaddisplayfailed, i, oninterstitialadloadfailed);
        int i5 = IEngagementSignalsCallback + 49;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, int i, boolean z) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 21;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(oninterstitialaddisplayfailed, i, z);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IEngagementSignalsCallback + 105;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 17;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(th);
        int i4 = IEngagementSignalsCallback + 103;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        AppState.State state = (AppState.State) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 37;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) IAuthTabCallback(-1274203815, new Object[]{oninterstitialaddisplayfailed, state}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1274203823);
        }
        throw null;
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        AppState.State state = (AppState.State) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 85;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(state);
        int i4 = IEngagementSignalsCallback + 13;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = warmup + 81;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(oninterstitialaddisplayfailed, i, z);
        if (i4 == 0) {
            int i5 = 50 / 0;
        }
        int i6 = IEngagementSignalsCallback + 35;
        warmup = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Exception exc) {
        int i = 2 % 2;
        int i2 = warmup + 29;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(oninterstitialaddisplayfailed, exc);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ onNavigationEvent onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = warmup + 65;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationeventOnMessageChannelReady = onMessageChannelReady(oninterstitialaddisplayfailed);
        int i4 = IEngagementSignalsCallback + 57;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnMessageChannelReady;
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 7;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(function1, obj);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, obj);
        int i3 = warmup + 111;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = warmup + 81;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(1006676398, new Object[]{Long.valueOf(j)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1006676373);
        int i4 = warmup + 87;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    public static /* synthetic */ readFileToByteArray onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = warmup + 47;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        readFileToByteArray readfiletobytearrayIAuthTabCallback = IAuthTabCallback(context);
        int i4 = warmup + 1;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return readfiletobytearrayIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Object obj) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 17;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(obj);
        int i4 = warmup + 125;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(iAuthTabCallback);
        int i4 = warmup + 83;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSignForPKCS7NoContents onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 59;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        getSignForPKCS7NoContents getsignforpkcs7nocontentsExtraCommand = extraCommand();
        int i4 = IEngagementSignalsCallback + 91;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return getsignforpkcs7nocontentsExtraCommand;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, long j) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 25;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(oninterstitialaddisplayfailed, j);
        if (i3 != 0) {
            throw null;
        }
        int i4 = warmup + 113;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onNavigationEvent(Object obj) {
        int i = 2 % 2;
        int i2 = warmup + 83;
        IEngagementSignalsCallback = i2 % 128;
        return i2 % 2 == 0;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 33;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = warmup + 69;
        IEngagementSignalsCallback = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 125;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(j);
        }
        IAuthTabCallback(j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = warmup + 83;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(oninterstitialaddisplayfailed);
        int i4 = IEngagementSignalsCallback + 105;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return unitOnActivityResized;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Activity activity) {
        int i = 2 % 2;
        int i2 = warmup + 75;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(oninterstitialaddisplayfailed, activity);
        }
        onExtraCallback(oninterstitialaddisplayfailed, activity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        float f;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            f = 0.0f;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $10 + 89;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(ICustomTabsServiceStub[i / i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 59697), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(ICustomTabsServiceDefault), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 46134), (ViewConfiguration.getTouchSlop() >> 8) + 31, 20220 - View.getDefaultSize(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.getOffsetAfter("", 0) + 44, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(ICustomTabsServiceStub[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 59697), View.MeasureSpec.getMode(0) + 17, (ViewConfiguration.getJumpTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(ICustomTabsServiceDefault), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46134), 32 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 49075), 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1494 - Color.alpha(0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 53;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 49123), TextUtils.indexOf("", "") + 44, 1494 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                f = 0.0f;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Inject
    public onInterstitialAdDisplayFailed(@NotNull Context context, @NotNull getBillingPeriod getbillingperiod, @NotNull zzad zzadVar, @NotNull getStartTimeMillis getstarttimemillis, @NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0, @NotNull r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow, @NotNull AppState appState, @NotNull RnPhaseObserver rnPhaseObserver) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(getstarttimemillis, "");
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(r8lambdahdae14rp_yfkbgnstt68qt10iow, "");
        Intrinsics.checkNotNullParameter(appState, "");
        Intrinsics.checkNotNullParameter(rnPhaseObserver, "");
        this.onNavigationEvent = context;
        this.validateRelationship = getbillingperiod;
        this.IAuthTabCallbackStubProxy = zzadVar;
        this.extraCallback = getstarttimemillis;
        this.updateVisuals = constraintsSizeResolverExternalSyntheticLambda0;
        this.asBinder = r8lambdahdae14rp_yfkbgnstt68qt10iow;
        this.onWarmupCompleted = appState;
        this.mayLaunchUrl = rnPhaseObserver;
        Intrinsics.checkNotNull(context, "");
        this.IAuthTabCallback = (Application) context;
        this.readTypedObject = new ResourceResolutionException();
        this.setEngagementSignalsCallback = new onAdViewAdExpanded();
        this.asInterface = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
        this.writeTypedObject = new Handler(Looper.getMainLooper());
        this.access100 = new onAdViewAdDisplayed();
        this.onUnminimized = new onAppOpenAdClicked();
        this.onRelationshipValidationResult = new Runnable() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onInterstitialAdDisplayFailed.IAuthTabCallback(this.f$0);
                if (i3 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        this.ICustomTabsCallbackStub = new AtomicBoolean(false);
        this.isEngagementSignalsApiAvailable = new onAdViewAdHidden();
        this.receiveFile = new AtomicBoolean(false);
        this.access000 = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        this.prefetchWithMultipleUrls = new LinkedHashMap<>();
        this.ICustomTabsCallback = new access6900<>();
        this.newSession = new onAppOpenAdLoaded(0, 0, 3, null);
        this.prefetch = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
        this.onMinimized = new ConcurrentHashMap<>();
        this.onActivityResized = new LinkedHashSet();
        this.extraCallbackWithResult = new LinkedHashSet<>();
        this.newAuthTabSession = new OkHttpClient.Builder().connectTimeout(300L, TimeUnit.MILLISECONDS).readTimeout(60L, TimeUnit.SECONDS).build();
        this.ICustomTabsCallbackStubProxy = "next_entry";
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 1;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    onInterstitialAdDisplayFailed.onExtraCallback(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onInterstitialAdDisplayFailed.onNavigationEvent onnavigationeventOnExtraCallback = onInterstitialAdDisplayFailed.onExtraCallback(this.f$0);
                int i3 = onNavigationEvent + 111;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return onnavigationeventOnExtraCallback;
            }
        });
        this.IAuthTabCallback_Parcel = new onAdViewAdDisplayFailed<>(new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    onInterstitialAdDisplayFailed.onWarmupCompleted(this.f$0, (Activity) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = onInterstitialAdDisplayFailed.onWarmupCompleted(this.f$0, (Activity) obj);
                int i3 = onExtraCallback + 21;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitOnWarmupCompleted;
            }
        }, new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = onInterstitialAdDisplayFailed.IAuthTabCallback(this.f$0, (Activity) obj);
                int i4 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        });
        this.ICustomTabsCallbackDefault = new ICustomTabsCallbackDefault();
    }

    public static final /* synthetic */ Long IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, long j, boolean z) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 13;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Long lOnWarmupCompleted = oninterstitialaddisplayfailed.onWarmupCompleted(j, z);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return lOnWarmupCompleted;
    }

    public static final /* synthetic */ Object IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, onExtraCallback onextracallback, ReactContext reactContext, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 125;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return oninterstitialaddisplayfailed.onNavigationEvent(onextracallback, reactContext, (access13800<? super Unit>) access13800Var);
        }
        oninterstitialaddisplayfailed.onNavigationEvent(onextracallback, reactContext, (access13800<? super Unit>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 67;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) IAuthTabCallback(1278607275, new Object[]{oninterstitialaddisplayfailed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1278607255);
        int i4 = warmup + 17;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return maxFullscreenAdImplExternalSyntheticLambda6;
    }

    public static final /* synthetic */ void IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 103;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.ICustomTabsCallback_Parcel = str;
        if (i3 != 0) {
            throw null;
        }
        int i4 = warmup + 85;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, String str2, long j) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.IAuthTabCallback(str, str2, j);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
    }

    public static final /* synthetic */ transGetKmCert IAuthTabCallbackDefault(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 21;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        transGetKmCert transgetkmcert = oninterstitialaddisplayfailed.IAuthTabCallbackDefault;
        int i4 = warmup + 123;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return transgetkmcert;
    }

    public static final /* synthetic */ ResourceResolutionException IAuthTabCallbackStub(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 111;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        ResourceResolutionException resourceResolutionException = oninterstitialaddisplayfailed.readTypedObject;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 83;
        IEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return resourceResolutionException;
    }

    public static final /* synthetic */ onAppOpenAdClicked IAuthTabCallbackStubProxy(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 85;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onAppOpenAdClicked onappopenadclicked = oninterstitialaddisplayfailed.onUnminimized;
        if (i3 == 0) {
            return onappopenadclicked;
        }
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = warmup + 59;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = oninterstitialaddisplayfailed.onActivityLayout;
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        int i5 = IEngagementSignalsCallback + 13;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ jni_YGNodeStyleGetFlexBasisJNI ICustomTabsCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = warmup + 37;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni = oninterstitialaddisplayfailed.prefetch;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 95;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return jni_ygnodestylegetflexbasisjni;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        onAppOpenAdHidden.onExtraCallback onextracallback = (onAppOpenAdHidden.onExtraCallback) objArr[2];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 95;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onAppOpenAdDisplayed onappopenaddisplayed = (onAppOpenAdDisplayed) IAuthTabCallback(1972283824, new Object[]{oninterstitialaddisplayfailed, str, onextracallback}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1972283803);
        int i3 = warmup + 89;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return onappopenaddisplayed;
    }

    public static final /* synthetic */ Set access000(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback;
        int i3 = i2 + 115;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = oninterstitialaddisplayfailed.onActivityResized;
        int i5 = i2 + 79;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public static final /* synthetic */ boolean asBinder(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 59;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnActivityLayout = oninterstitialaddisplayfailed.onActivityLayout();
        int i4 = IEngagementSignalsCallback + 31;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnActivityLayout;
        }
        throw null;
    }

    public static final /* synthetic */ RnPhaseObserver extraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback;
        int i3 = i2 + 21;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        RnPhaseObserver rnPhaseObserver = oninterstitialaddisplayfailed.mayLaunchUrl;
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        int i6 = i2 + 11;
        warmup = i6 % 128;
        if (i6 % 2 == 0) {
            return rnPhaseObserver;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 123;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.onActivityLayout = zBooleanValue;
        int i4 = IEngagementSignalsCallback + 97;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ onAppOpenAdLoaded extraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = warmup + 19;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        onAppOpenAdLoaded onappopenadloaded = oninterstitialaddisplayfailed.newSession;
        int i5 = i3 + 75;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return onappopenadloaded;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 91;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        access6900<asBinder> access6900Var = oninterstitialaddisplayfailed.ICustomTabsCallback;
        if (i4 == 0) {
            int i5 = 78 / 0;
        }
        int i6 = i2 + 105;
        IEngagementSignalsCallback = i6 % 128;
        int i7 = i6 % 2;
        return access6900Var;
    }

    public static final /* synthetic */ ConcurrentHashMap getInterfaceDescriptor(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback;
        int i3 = i2 + 109;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<String, onAppOpenAdDisplayed> concurrentHashMap = oninterstitialaddisplayfailed.onMinimized;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i2 + 3;
        warmup = i6 % 128;
        int i7 = i6 % 2;
        return concurrentHashMap;
    }

    public static final /* synthetic */ Object onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, ReactContext reactContext, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = warmup + 55;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(1999039848, new Object[]{oninterstitialaddisplayfailed, str, reactContext, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1999039837);
        }
        IAuthTabCallback(1999039848, new Object[]{oninterstitialaddisplayfailed, str, reactContext, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1999039837);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, String str2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 25;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            oninterstitialaddisplayfailed.IAuthTabCallback(str, str2, (access13800<? super onExtraCallback>) access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = oninterstitialaddisplayfailed.IAuthTabCallback(str, str2, (access13800<? super onExtraCallback>) access13800Var);
        int i3 = warmup + 99;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Function1 function1, Function1 function12, Function1 function13, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 23;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = oninterstitialaddisplayfailed.onWarmupCompleted(function1, function12, function13, access13800Var);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return objOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2 = (MaxFullscreenAdImplExternalSyntheticLambda2) objArr[1];
        String str = (String) objArr[2];
        IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) objArr[3];
        int i = 2 % 2;
        int i2 = warmup + 61;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.onExtraCallback(maxFullscreenAdImplExternalSyntheticLambda2, str, iAuthTabCallbackDefault);
        int i4 = warmup + 43;
        IEngagementSignalsCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Throwable th, int i, String str, long j, pauseMyRequest pausemyrequest) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 117;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        oninterstitialaddisplayfailed.onExtraCallbackWithResult(th, i, str, j, (pauseMyRequest<Unit>) pausemyrequest);
        if (i4 != 0) {
            throw null;
        }
        int i5 = IEngagementSignalsCallback + 73;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
    }

    public static final /* synthetic */ RnCause onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, int i) {
        int i2 = 2 % 2;
        int i3 = warmup + 65;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return oninterstitialaddisplayfailed.IAuthTabCallback(i);
        }
        oninterstitialaddisplayfailed.IAuthTabCallback(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, ReactContext reactContext, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 85;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return oninterstitialaddisplayfailed.onNavigationEvent(str, reactContext, (access13800<? super Unit>) access13800Var);
        }
        oninterstitialaddisplayfailed.onNavigationEvent(str, reactContext, (access13800<? super Unit>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, onAppOpenAdHidden onappopenadhidden, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = warmup + 19;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            oninterstitialaddisplayfailed.onExtraCallbackWithResult(onappopenadhidden, (access13800<? super IAuthTabCallback>) access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallbackWithResult = oninterstitialaddisplayfailed.onExtraCallbackWithResult(onappopenadhidden, (access13800<? super IAuthTabCallback>) access13800Var);
        int i3 = IEngagementSignalsCallback + 121;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 77;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.ICustomTabsCallback();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = warmup + 29;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, long j) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 15;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.postMessage = j;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = warmup + 123;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.onTransact = maxFullscreenAdImplExternalSyntheticLambda2;
        int i4 = warmup + 77;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2, String str, boolean z) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 85;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.IAuthTabCallback(maxFullscreenAdImplExternalSyntheticLambda2, str, z);
        int i4 = warmup + 97;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Object onNavigationEvent(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, access13800 access13800Var) {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = warmup + 125;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            objIAuthTabCallback = IAuthTabCallback(-194259008, new Object[]{oninterstitialaddisplayfailed, str, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 194259041);
            int i3 = 84 / 0;
        } else {
            objIAuthTabCallback = IAuthTabCallback(-194259008, new Object[]{oninterstitialaddisplayfailed, str, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 194259041);
        }
        int i4 = IEngagementSignalsCallback + 71;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        access13800<? super onExtraCallback> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 89;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return oninterstitialaddisplayfailed.onExtraCallbackWithResult(str, access13800Var);
        }
        oninterstitialaddisplayfailed.onExtraCallbackWithResult(str, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ MaxFullscreenAdImpl.onExtraCallbackWithResult onNavigationEvent(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 11;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = (MaxFullscreenAdImpl.onExtraCallbackWithResult) IAuthTabCallback(327908443, new Object[]{oninterstitialaddisplayfailed, maxFullscreenAdImplExternalSyntheticLambda6}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -327908436);
        int i4 = IEngagementSignalsCallback + 47;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresult;
    }

    public static final /* synthetic */ void onNavigationEvent(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        int i2 = warmup + 89;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(-1028992801, new Object[]{oninterstitialaddisplayfailed, str, iAuthTabCallbackDefault}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1028992816);
            int i3 = 94 / 0;
        } else {
            IAuthTabCallback(-1028992801, new Object[]{oninterstitialaddisplayfailed, str, iAuthTabCallbackDefault}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1028992816);
        }
        int i4 = IEngagementSignalsCallback + 121;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, transGetKmCert transgetkmcert, int i, String str, long j, pauseMyRequest pausemyrequest) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 65;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(1029332772, new Object[]{oninterstitialaddisplayfailed, transgetkmcert, Integer.valueOf(i), str, Long.valueOf(j), pausemyrequest}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1029332744);
            return;
        }
        IAuthTabCallback(1029332772, new Object[]{oninterstitialaddisplayfailed, transgetkmcert, Integer.valueOf(i), str, Long.valueOf(j), pausemyrequest}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1029332744);
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        transGetKmCert transgetkmcert = (transGetKmCert) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 119;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.IAuthTabCallbackDefault = transgetkmcert;
        int i4 = warmup + 107;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 69;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        onAdViewAdDisplayed onadviewaddisplayed = oninterstitialaddisplayfailed.access100;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 97;
        IEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onadviewaddisplayed;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 93;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.onNavigationEvent(str, th);
        int i4 = IEngagementSignalsCallback + 97;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 13;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.onExtraCallback = maxFullscreenAdImplExternalSyntheticLambda6;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = warmup + 17;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, onAppOpenAdDisplayed onappopenaddisplayed) {
        int i = 2 % 2;
        int i2 = warmup + 109;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        oninterstitialaddisplayfailed.onNavigationEvent(onappopenaddisplayed);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IEngagementSignalsCallback + 103;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ okhttp3.OkHttpClient readTypedObject(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 113;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        okhttp3.OkHttpClient okHttpClient = oninterstitialaddisplayfailed.newAuthTabSession;
        int i5 = i2 + 17;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return okHttpClient;
    }

    public static final /* synthetic */ LinkedHashMap writeTypedObject(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        int i2 = warmup + 75;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        LinkedHashMap<String, IAuthTabCallbackDefault> linkedHashMap = oninterstitialaddisplayfailed.prefetchWithMultipleUrls;
        int i5 = i3 + 9;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return linkedHashMap;
        }
        throw null;
    }

    static final class IAuthTabCallbackDefault {
        private static int asInterface = 0;
        private static int onTransact = 1;
        private WeakReference<PortalServiceActivity> IAuthTabCallback;
        private transV2ImportCert onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private final onAppOpenAdHidden onNavigationEvent;
        private TossModule onWarmupCompleted;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.onInterstitialAdDisplayFailed.IAuthTabCallbackDefault) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 75;
            o.onInterstitialAdDisplayFailed.IAuthTabCallbackDefault.asInterface = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (o.onInterstitialAdDisplayFailed.IAuthTabCallbackDefault) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            r6 = o.onInterstitialAdDisplayFailed.IAuthTabCallbackDefault.asInterface + 87;
            o.onInterstitialAdDisplayFailed.IAuthTabCallbackDefault.onTransact = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if ((r6 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        
            if (r5.onExtraCallbackWithResult == r6.onExtraCallbackWithResult) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
        
            r6 = o.onInterstitialAdDisplayFailed.IAuthTabCallbackDefault.onTransact + 121;
            o.onInterstitialAdDisplayFailed.IAuthTabCallbackDefault.asInterface = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 91;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                int i4 = 23 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.onNavigationEvent.hashCode();
            int iHashCode3 = this.IAuthTabCallback.hashCode();
            int iHashCode4 = Boolean.hashCode(this.onExtraCallbackWithResult);
            TossModule tossModule = this.onWarmupCompleted;
            if (tossModule == null) {
                int i2 = asInterface + 21;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = tossModule.hashCode();
                int i4 = asInterface + 81;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            transV2ImportCert transv2importcert = this.onExtraCallback;
            int iHashCode5 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + (transv2importcert != null ? transv2importcert.hashCode() : 0);
            int i6 = onTransact + 51;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                return iHashCode5;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ServiceSession(route=" + this.onNavigationEvent + ", activity=" + this.IAuthTabCallback + ", isVisible=" + this.onExtraCallbackWithResult + ", tossModule=" + this.onWarmupCompleted + ", microFrontendRegistration=" + this.onExtraCallback + ")";
            int i2 = onTransact + 69;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
            return str;
        }

        public IAuthTabCallbackDefault(@NotNull onAppOpenAdHidden onappopenadhidden, @NotNull WeakReference<PortalServiceActivity> weakReference, boolean z, @Nullable TossModule tossModule, @Nullable transV2ImportCert transv2importcert) {
            Intrinsics.checkNotNullParameter(onappopenadhidden, "");
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.onNavigationEvent = onappopenadhidden;
            this.IAuthTabCallback = weakReference;
            this.onExtraCallbackWithResult = z;
            this.onWarmupCompleted = tossModule;
            this.onExtraCallback = transv2importcert;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallbackDefault(onAppOpenAdHidden onappopenadhidden, WeakReference weakReference, boolean z, TossModule tossModule, transV2ImportCert transv2importcert, int i, DefaultConstructorMarker defaultConstructorMarker) {
            TossModule tossModule2;
            transV2ImportCert transv2importcert2;
            if ((i & 8) != 0) {
                int i2 = asInterface + 85;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 47;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                tossModule2 = null;
            } else {
                tossModule2 = tossModule;
            }
            if ((i & 16) != 0) {
                int i7 = onTransact;
                int i8 = i7 + 9;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 1;
                asInterface = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 % 4;
                } else {
                    int i12 = 2 % 2;
                }
                transv2importcert2 = null;
            } else {
                transv2importcert2 = transv2importcert;
            }
            this(onappopenadhidden, weakReference, z, tossModule2, transv2importcert2);
        }

        public final onAppOpenAdHidden onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 13;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final WeakReference<PortalServiceActivity> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 101;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            WeakReference<PortalServiceActivity> weakReference = this.IAuthTabCallback;
            int i5 = i2 + 13;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return weakReference;
        }

        public final void onExtraCallbackWithResult(@NotNull WeakReference<PortalServiceActivity> weakReference) {
            int i = 2 % 2;
            int i2 = onTransact + 97;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.IAuthTabCallback = weakReference;
            int i4 = asInterface + 47;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void onExtraCallbackWithResult(boolean z) {
            int i = 2 % 2;
            int i2 = asInterface + 79;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult = z;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 87;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(@Nullable TossModule tossModule) {
            int i = 2 % 2;
            int i2 = onTransact + 35;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted = tossModule;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final TossModule onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 67;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            TossModule tossModule = this.onWarmupCompleted;
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
            return tossModule;
        }

        public final void IAuthTabCallback(@Nullable transV2ImportCert transv2importcert) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 27;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallback = transv2importcert;
            int i5 = i2 + 29;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }

        public final transV2ImportCert onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 11;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            throw null;
        }
    }

    static final class onExtraCallback {
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final onAppOpenAdDisplayed onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asInterface + 49;
                IAuthTabCallbackStub = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent) || !Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                return Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted);
            }
            int i3 = asInterface + 19;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.onNavigationEvent.hashCode();
            int iHashCode3 = this.IAuthTabCallback.hashCode();
            int iHashCode4 = this.onExtraCallbackWithResult.hashCode();
            String str = this.onExtraCallback;
            int iHashCode5 = 0;
            if (str == null) {
                int i2 = IAuthTabCallbackStub + 45;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            onAppOpenAdDisplayed onappopenaddisplayed = this.onWarmupCompleted;
            if (onappopenaddisplayed != null) {
                iHashCode5 = onappopenaddisplayed.hashCode();
                int i4 = asInterface + 109;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5;
            int i7 = asInterface + 55;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LoadedServiceBundle(serviceName=" + this.onNavigationEvent + ", filePath=" + this.IAuthTabCallback + ", evaluateUrl=" + this.onExtraCallbackWithResult + ", deploymentId=" + this.onExtraCallback + ", bundleLoader=" + this.onWarmupCompleted + ")";
            int i2 = asInterface + 75;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable onAppOpenAdDisplayed onappopenaddisplayed) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = str2;
            this.onExtraCallbackWithResult = str3;
            this.onExtraCallback = str4;
            this.onWarmupCompleted = onappopenaddisplayed;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(String str, String str2, String str3, String str4, onAppOpenAdDisplayed onappopenaddisplayed, int i, DefaultConstructorMarker defaultConstructorMarker) {
            onAppOpenAdDisplayed onappopenaddisplayed2;
            String str5 = (i & 8) != 0 ? null : str4;
            if ((i & 16) != 0) {
                int i2 = asInterface;
                int i3 = i2 + 55;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 7;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                onappopenaddisplayed2 = null;
            } else {
                onappopenaddisplayed2 = onappopenaddisplayed;
            }
            this(str, str2, str3, str5, onappopenaddisplayed2);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 1;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 113;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 11;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }

        public final String onNavigationEvent() {
            String str;
            int i = 2 % 2;
            int i2 = asInterface + 33;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                str = this.onExtraCallbackWithResult;
                int i4 = 36 / 0;
            } else {
                str = this.onExtraCallbackWithResult;
            }
            int i5 = i3 + 41;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 75;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 49;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final onAppOpenAdDisplayed onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 35;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            onAppOpenAdDisplayed onappopenaddisplayed = this.onWarmupCompleted;
            int i5 = i3 + 105;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return onappopenaddisplayed;
            }
            throw null;
        }
    }

    static final class asBinder {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final Map<String, Object> onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 73;
                onNavigationEvent = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof asBinder)) {
                int i3 = onExtraCallback + 33;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            asBinder asbinder = (asBinder) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, asbinder.onWarmupCompleted)) {
                int i5 = onNavigationEvent + 85;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, asbinder.onExtraCallbackWithResult)) {
                return true;
            }
            int i7 = onExtraCallback + 121;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SessionEvent(eventName=" + this.onWarmupCompleted + ", body=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public asBinder(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = map;
        }

        public final Map<String, Object> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Map<String, Object> map = this.onExtraCallbackWithResult;
            int i5 = i3 + 53;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onWarmupCompleted {
        private static int asInterface = 1;
        private static int onExtraCallback;
        private final String IAuthTabCallback;
        private final WeakReference<PortalServiceActivity> onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 11;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = i3 + 63;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                return Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) && !(Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) ^ true);
            }
            int i7 = onExtraCallback + 59;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
            int i4 = onExtraCallback + 97;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ActiveServiceSession(identifier=" + this.IAuthTabCallback + ", schemeUri=" + this.onWarmupCompleted + ", serviceName=" + this.onNavigationEvent + ", activity=" + this.onExtraCallbackWithResult + ")";
            int i2 = asInterface + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull WeakReference<PortalServiceActivity> weakReference) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = str2;
            this.onNavigationEvent = str3;
            this.onExtraCallbackWithResult = weakReference;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 53;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 71;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 21;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 31;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 67;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 97;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final WeakReference<PortalServiceActivity> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 73;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            WeakReference<PortalServiceActivity> weakReference = this.onExtraCallbackWithResult;
            int i5 = i2 + 119;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return weakReference;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final String onExtraCallback;
        private final boolean onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                if (this.onExtraCallbackWithResult == onnavigationevent.onExtraCallbackWithResult) {
                    return true;
                }
                int i4 = onWarmupCompleted + 97;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            int i5 = IAuthTabCallback;
            int i6 = i5 + 45;
            onWarmupCompleted = i6 % 128;
            boolean z = true ^ (i6 % 2 != 0);
            int i7 = i5 + 99;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallback.hashCode() * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
            int i4 = onWarmupCompleted + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DistributionGroupResolution(group=" + this.onExtraCallback + ", isPinned=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onNavigationEvent(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = z;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.onExtraCallback;
            int i4 = i2 + 117;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
            return str;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }
    }

    private static final void onMinimized(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        Object obj;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 79;
        warmup = i2 % 128;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 != 0) {
            Result.Companion companion2 = Result.Companion;
            oninterstitialaddisplayfailed.ICustomTabsCallbackStubProxy();
            Result.constructor-impl(Unit.INSTANCE);
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        oninterstitialaddisplayfailed.ICustomTabsCallbackStubProxy();
        obj = Result.constructor-impl(Unit.INSTANCE);
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i3 = IEngagementSignalsCallback + 71;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GranitePortalRuntime", "portal_runtime_recycle_due_failed", access8100.onNavigationEvent(getWrite.IAuthTabCallback("errorClass", th2.getClass().getSimpleName())), (String) null, false, (String) null, 56, (Object) null);
        }
    }

    private final onNavigationEvent onActivityResized() {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = warmup + 43;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onnavigationevent = (onNavigationEvent) this.getInterfaceDescriptor.getValue();
            int i3 = 33 / 0;
        } else {
            onnavigationevent = (onNavigationEvent) this.getInterfaceDescriptor.getValue();
        }
        int i4 = warmup + 99;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationevent;
    }

    private static final onNavigationEvent onMessageChannelReady(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        boolean z;
        int i = 2 % 2;
        String strIAuthTabCallback = oninterstitialaddisplayfailed.asBinder.IAuthTabCallback();
        String strOnWarmupCompleted = oninterstitialaddisplayfailed.asBinder.onWarmupCompleted();
        if (strIAuthTabCallback != null) {
            int i2 = IEngagementSignalsCallback + 55;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 2;
            }
            strOnWarmupCompleted = strIAuthTabCallback;
        }
        if (strIAuthTabCallback != null) {
            int i4 = warmup + 111;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        onNavigationEvent onnavigationevent = new onNavigationEvent(strOnWarmupCompleted, z);
        onnavigationevent.onExtraCallback();
        onnavigationevent.IAuthTabCallback();
        return onnavigationevent;
    }

    public final ReactHost IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 49;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        ReactHost reactHost = this.onPostMessage;
        if (reactHost == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 33;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return reactHost;
    }

    public final Integer onWarmupCompleted() {
        ReactSurface reactSurface;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 39;
        warmup = i2 % 128;
        ReactSurface reactSurface2 = null;
        if (i2 % 2 == 0) {
            if (!this.access100.IAuthTabCallbackDefault() || (reactSurface = this.IAuthTabCallbackStub) == null) {
                return null;
            }
            if (reactSurface == null) {
                int i3 = warmup + 35;
                IEngagementSignalsCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                reactSurface2 = reactSurface;
            }
            return Integer.valueOf(reactSurface2.IAuthTabCallback());
        }
        this.access100.IAuthTabCallbackDefault();
        throw null;
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = warmup + 117;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
        int i4 = IEngagementSignalsCallback + 79;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    public final boolean access000() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = this.access100.IAuthTabCallbackDefault();
        int i4 = IEngagementSignalsCallback + 37;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackDefault;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 67;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = this.access100.onTransact();
        int i4 = IEngagementSignalsCallback + 37;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTransact;
        }
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 31;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String strName = this.access100.IAuthTabCallbackStub().name();
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int i4 = warmup + 105;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return lowerCase;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        if (this.access100.asBinder()) {
            return true;
        }
        int i2 = warmup + 55;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        long j = this.extraCommand;
        if (i3 == 0) {
            if (j != 0) {
                return true;
            }
        } else if (j != 0) {
            return true;
        }
        int i4 = warmup + 33;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = warmup + 1;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onActivityResized().onExtraCallback();
        int i4 = warmup + 123;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r3.onPostMessage != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r3 = r3.IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((r4 instanceof o.getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r1 = (o.getJSON_KEY_ATTESTATIONcredentials_play_services_auth_release) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r3.onExtraCallbackWithResult(r4, r1);
        r3 = kotlin.Unit.INSTANCE;
        r4 = o.onInterstitialAdDisplayFailed.IEngagementSignalsCallback + 89;
        o.onInterstitialAdDisplayFailed.warmup = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3.onPostMessage != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Activity activity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        if (oninterstitialaddisplayfailed.access100.IAuthTabCallbackDefault()) {
            int i2 = IEngagementSignalsCallback + 87;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 41 / 0;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Activity activity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 49;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            ReactHost reactHost = oninterstitialaddisplayfailed.onPostMessage;
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        if (oninterstitialaddisplayfailed.onPostMessage == null) {
            return Unit.INSTANCE;
        }
        oninterstitialaddisplayfailed.IAuthTabCallbackStub().onExtraCallback(activity);
        Unit unit = Unit.INSTANCE;
        int i3 = IEngagementSignalsCallback + 95;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final class ICustomTabsCallbackDefault implements ReactInstanceEventListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public static /* synthetic */ String onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = IAuthTabCallback(oninterstitialaddisplayfailed);
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return strIAuthTabCallback;
        }

        ICustomTabsCallbackDefault() {
        }

        public void onNavigationEvent(ReactContext reactContext) throws Throwable {
            ReactApplicationContext reactApplicationContext;
            Object obj;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(reactContext, "");
            if (reactContext instanceof ReactApplicationContext) {
                int i2 = onExtraCallback + 89;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                reactApplicationContext = (ReactApplicationContext) reactContext;
            } else {
                reactApplicationContext = null;
            }
            if (reactApplicationContext == null) {
                throw new IllegalStateException("Required value was null.");
            }
            MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2 = new MaxFullscreenAdImplExternalSyntheticLambda2(reactApplicationContext, null, onInterstitialAdDisplayFailed.this);
            WeakReference weakReference = new WeakReference(null);
            WeakReference weakReference2 = new WeakReference(null);
            final onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
            Role graniteBrownfieldModule = new GraniteBrownfieldModule(reactApplicationContext, weakReference, weakReference2, "", new Function0() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$reactInstanceEventListener$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 83;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    onInterstitialAdDisplayFailed oninterstitialaddisplayfailed2 = oninterstitialaddisplayfailed;
                    if (i6 == 0) {
                        return onInterstitialAdDisplayFailed.ICustomTabsCallbackDefault.onWarmupCompleted(oninterstitialaddisplayfailed2);
                    }
                    onInterstitialAdDisplayFailed.ICustomTabsCallbackDefault.onWarmupCompleted(oninterstitialaddisplayfailed2);
                    throw null;
                }
            }, false, new onExtraCallbackWithResult(onInterstitialAdDisplayFailed.this));
            boolean zIAuthTabCallback_Parcel = onInterstitialAdDisplayFailed.IAuthTabCallback_Parcel(onInterstitialAdDisplayFailed.this);
            onInterstitialAdDisplayFailed.IAuthTabCallback(849019096, new Object[]{onInterstitialAdDisplayFailed.this, true}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -849019080);
            onInterstitialAdDisplayFailed.onExtraCallbackWithResult(onInterstitialAdDisplayFailed.this, maxFullscreenAdImplExternalSyntheticLambda2);
            onInterstitialAdDisplayFailed.IAuthTabCallbackStub(onInterstitialAdDisplayFailed.this).onWarmupCompleted(CollectionsKt.listOf(new Role[]{maxFullscreenAdImplExternalSyntheticLambda2, graniteBrownfieldModule, new transImportCert(reactApplicationContext)}));
            Iterator it = onInterstitialAdDisplayFailed.writeTypedObject(onInterstitialAdDisplayFailed.this).entrySet().iterator();
            while (it.hasNext()) {
                int i4 = onExtraCallback + 99;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((IAuthTabCallbackDefault) entry.getValue()).IAuthTabCallback().get();
                    throw null;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                String str = (String) entry2.getKey();
                PortalServiceActivity portalServiceActivity = ((IAuthTabCallbackDefault) entry2.getValue()).IAuthTabCallback().get();
                if (portalServiceActivity != null) {
                    portalServiceActivity.onNavigationEvent(reactApplicationContext, str);
                }
            }
            if (zIAuthTabCallback_Parcel) {
                onInterstitialAdDisplayFailed.access000(onInterstitialAdDisplayFailed.this).clear();
                LinkedHashMap linkedHashMapWriteTypedObject = onInterstitialAdDisplayFailed.writeTypedObject(onInterstitialAdDisplayFailed.this);
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailed2 = onInterstitialAdDisplayFailed.this;
                int i5 = onExtraCallback + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                for (Map.Entry entry3 : linkedHashMapWriteTypedObject.entrySet()) {
                    String str2 = (String) entry3.getKey();
                    IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) entry3.getValue();
                    onInterstitialAdDisplayFailed.IAuthTabCallback(-199628026, new Object[]{oninterstitialaddisplayfailed2, maxFullscreenAdImplExternalSyntheticLambda2, str2, iAuthTabCallbackDefault}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 199628031);
                    onInterstitialAdDisplayFailed.onExtraCallbackWithResult(oninterstitialaddisplayfailed2, maxFullscreenAdImplExternalSyntheticLambda2, str2, iAuthTabCallbackDefault.onExtraCallbackWithResult());
                    try {
                        Result.Companion companion = Result.Companion;
                        onInterstitialAdDisplayFailed.onNavigationEvent(oninterstitialaddisplayfailed2, str2, iAuthTabCallbackDefault);
                        obj = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    Throwable th2 = Result.exceptionOrNull-impl(obj);
                    if (th2 != null) {
                        int i7 = onExtraCallback + 103;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        onInterstitialAdDisplayFailed.onWarmupCompleted(oninterstitialaddisplayfailed2, "replay_failed", str2, th2, null, 8, null);
                    }
                }
            } else {
                List<asBinder> list = CollectionsKt.toList((access6900) onInterstitialAdDisplayFailed.IAuthTabCallback(-138601257, new Object[]{onInterstitialAdDisplayFailed.this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 138601270));
                ((access6900) onInterstitialAdDisplayFailed.IAuthTabCallback(-138601257, new Object[]{onInterstitialAdDisplayFailed.this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 138601270)).clear();
                for (asBinder asbinder : list) {
                    maxFullscreenAdImplExternalSyntheticLambda2.IAuthTabCallback(asbinder.onExtraCallback(), (Map<String, ? extends Object>) asbinder.IAuthTabCallback());
                }
            }
            ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{(onAdViewAdDisplayed) onInterstitialAdDisplayFailed.IAuthTabCallback(-999534704, new Object[]{onInterstitialAdDisplayFailed.this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 999534707)}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
            System.identityHashCode(reactContext);
        }

        private static final String IAuthTabCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = null;
            Object[] objArr = {oninterstitialaddisplayfailed};
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            if (i3 != 0) {
                throw null;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) onInterstitialAdDisplayFailed.IAuthTabCallback(-1132397120, objArr, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1132397120);
            if (onwarmupcompleted != null) {
                strOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
                int i4 = onExtraCallback + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            if (strOnNavigationEvent == null) {
                int i6 = IAuthTabCallback + 51;
                onExtraCallback = i6 % 128;
                strOnNavigationEvent = "";
                if (i6 % 2 != 0) {
                    int i7 = 70 / 0;
                }
            }
            return strOnNavigationEvent;
        }

        static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function0<Boolean> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            onExtraCallbackWithResult(Object obj) {
                super(0, obj, onInterstitialAdDisplayFailed.class, "finishActiveServiceActivity", "finishActiveServiceActivity()Z", 0);
            }

            public /* synthetic */ Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted();
                }
                onWarmupCompleted();
                throw null;
            }

            public final Boolean onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    Boolean.valueOf(onInterstitialAdDisplayFailed.asBinder((onInterstitialAdDisplayFailed) ((CallableReference) this).receiver));
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(onInterstitialAdDisplayFailed.asBinder((onInterstitialAdDisplayFailed) ((CallableReference) this).receiver));
                int i3 = onExtraCallback + 61;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 65 / 0;
                }
                return boolValueOf;
            }
        }
    }

    private static final boolean onExtraCallbackWithResult(AppState.State state) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 21;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(state, "");
            return Intrinsics.areEqual(state, AppState.State.Terminate.onExtraCallbackWithResult);
        }
        Intrinsics.checkNotNullParameter(state, "");
        int i3 = 48 / 0;
        return Intrinsics.areEqual(state, AppState.State.Terminate.onExtraCallbackWithResult);
    }

    private static final boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 75;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = IEngagementSignalsCallback + 11;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 25;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!oninterstitialaddisplayfailed.receiveFile.compareAndSet(false, true)) {
            return null;
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = oninterstitialaddisplayfailed.onWarmupCompleted.IAuthTabCallback(false).onWarmupCompleted(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda18
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 71;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                Boolean boolValueOf = Boolean.valueOf(((Boolean) onInterstitialAdDisplayFailed.IAuthTabCallback(849720697, new Object[]{(AppState.State) obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -849720662)).booleanValue());
                int i7 = onNavigationEvent + 39;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    return boolValueOf;
                }
                throw null;
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(new deserializeLongCollection() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final boolean test(Object obj) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 19;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                boolean zOnExtraCallback = onInterstitialAdDisplayFailed.onExtraCallback(function1, obj);
                int i7 = onExtraCallback + 85;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 51 / 0;
                }
                return zOnExtraCallback;
            }
        });
        final Function1 function12 = new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 107;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Unit unit = (Unit) onInterstitialAdDisplayFailed.IAuthTabCallback(89763498, new Object[]{this.f$0, (AppState.State) obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -89763479);
                int i7 = IAuthTabCallback + 81;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda21
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final void accept(Object obj) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 43;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    onInterstitialAdDisplayFailed.IAuthTabCallback(2127330317, new Object[]{function12, obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2127330290);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onInterstitialAdDisplayFailed.IAuthTabCallback(2127330317, new Object[]{function12, obj}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2127330290);
                int i6 = onNavigationEvent + 79;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        };
        final Function1 function13 = new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda22
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i5 % 128;
                Throwable th = (Throwable) obj;
                if (i5 % 2 != 0) {
                    return (Unit) onInterstitialAdDisplayFailed.IAuthTabCallback(2113731012, new Object[]{th}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2113731003);
                }
                int i6 = 11 / 0;
                return (Unit) onInterstitialAdDisplayFailed.IAuthTabCallback(2113731012, new Object[]{th}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2113731003);
            }
        };
        jsonReaderUnknownNumberParsingOnWarmupCompleted2.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda23
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final void accept(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 81;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    onInterstitialAdDisplayFailed.IAuthTabCallback(function13, obj);
                    throw null;
                }
                onInterstitialAdDisplayFailed.IAuthTabCallback(function13, obj);
                int i6 = onWarmupCompleted + 75;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i4 = IEngagementSignalsCallback + 125;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 85;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        int i5 = IEngagementSignalsCallback + 103;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Object obj;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            oninterstitialaddisplayfailed.readTypedObject();
            obj = Result.constructor-impl(Unit.INSTANCE);
            int i2 = warmup + 105;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Result.exceptionOrNull-impl(obj);
        Unit unit = Unit.INSTANCE;
        int i4 = IEngagementSignalsCallback + 85;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 73;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 43;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 13;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void readTypedObject() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 51;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(-831134392, new Object[]{this, onInterstitialAdLoadFailed.SESSION_TERMINATED}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 831134429);
        int i4 = warmup + 81;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, int i, boolean z) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 69;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        oninterstitialaddisplayfailed.onNavigationEvent(i, z);
        if (i4 != 0) {
            throw null;
        }
        int i5 = IEngagementSignalsCallback + 75;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onNavigationEvent(final onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, final int i, final boolean z) {
        int i2 = 2 % 2;
        oninterstitialaddisplayfailed.writeTypedObject.post(new Runnable() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // java.lang.Runnable
            public final void run() throws NoWhenBranchMatchedException {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    onInterstitialAdDisplayFailed.IAuthTabCallback(this.f$0, i, z);
                    int i5 = 26 / 0;
                } else {
                    onInterstitialAdDisplayFailed.IAuthTabCallback(this.f$0, i, z);
                }
                int i6 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i3 = IEngagementSignalsCallback + 23;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object postMessage(Object[] objArr) throws NoWhenBranchMatchedException {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        final onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        onInterstitialAdLoadFailed oninterstitialadloadfailed = (onInterstitialAdLoadFailed) objArr[1];
        int i = 2 % 2;
        if (oninterstitialadloadfailed == onInterstitialAdLoadFailed.SESSION_TERMINATED) {
            int i2 = warmup + 97;
            IEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                oninterstitialaddisplayfailed.isEngagementSignalsApiAvailable.onWarmupCompleted();
                throw null;
            }
            oninterstitialaddisplayfailed.isEngagementSignalsApiAvailable.onWarmupCompleted();
        }
        if (!oninterstitialaddisplayfailed.prefetchWithMultipleUrls.isEmpty()) {
            oninterstitialadloadfailed.getLogValue();
            oninterstitialaddisplayfailed.prefetchWithMultipleUrls.size();
            try {
                Result.Companion companion = Result.Companion;
                r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("skipped", Boolean.TRUE);
                Object[] objArr2 = new Object[1];
                a(TextUtils.indexOf("", "", 0), 6 - TextUtils.getOffsetAfter("", 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47832), objArr2);
                r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1053925019, -1053925018, new Object[]{r8lambdaxc7xafnircae5ge7mvkfmdsqbs, "mono_hermes_teardown", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "active_sessions"), getWrite.IAuthTabCallback("trigger", oninterstitialadloadfailed.getTriggerValue()), getWrite.IAuthTabCallback("reasonDetail", oninterstitialadloadfailed.getReasonValue()), getWrite.IAuthTabCallback("sessionCount", Integer.valueOf(oninterstitialaddisplayfailed.prefetchWithMultipleUrls.size()))})}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                obj3 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj3 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj3);
            if (th2 == null) {
                return null;
            }
            oninterstitialaddisplayfailed.onNavigationEvent("mono_hermes_teardown", th2);
            return null;
        }
        if (!((Boolean) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -767343973, 767343973, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue()) {
            if (oninterstitialadloadfailed != onInterstitialAdLoadFailed.RECYCLE) {
                return null;
            }
            oninterstitialadloadfailed.getLogValue();
            Objects.toString(oninterstitialaddisplayfailed.access100.IAuthTabCallbackStub());
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GranitePortalRuntime", "portal_runtime_teardown_rejected", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("trigger", oninterstitialadloadfailed.getLogValue()), getWrite.IAuthTabCallback("phase", oninterstitialaddisplayfailed.access100.IAuthTabCallbackStub().name())}), (String) null, false, (String) null, 56, (Object) null);
            int i3 = warmup + 107;
            IEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        oninterstitialaddisplayfailed.isEngagementSignalsApiAvailable.onNavigationEvent(oninterstitialadloadfailed);
        final int iIntValue = ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
        oninterstitialaddisplayfailed.requestPostMessageChannel = SystemClock.elapsedRealtime();
        oninterstitialadloadfailed.getLogValue();
        Objects.toString(oninterstitialaddisplayfailed.access100.IAuthTabCallbackStub());
        try {
            Result.Companion companion3 = Result.Companion;
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs2 = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("phase", "started");
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("outcome", "pending");
            Object[] objArr3 = new Object[1];
            a(View.MeasureSpec.getSize(0), 6 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Gravity.getAbsoluteGravity(0, 0) + 47833), objArr3);
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), oninterstitialadloadfailed.getReasonValue());
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("trigger", oninterstitialadloadfailed.getTriggerValue());
            Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("previousRuntimeInstanceId", oninterstitialaddisplayfailed.newSessionWithExtras);
            Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("uptimeMs", Long.valueOf(oninterstitialaddisplayfailed.ICustomTabsService()));
            Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("sessionCount", Integer.valueOf(oninterstitialaddisplayfailed.prefetchWithMultipleUrls.size()));
            if (oninterstitialadloadfailed == onInterstitialAdLoadFailed.RECYCLE) {
                int i5 = warmup + 15;
                IEngagementSignalsCallback = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1053925019, -1053925018, new Object[]{r8lambdaxc7xafnircae5ge7mvkfmdsqbs2, "mono_hermes_teardown", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, getWrite.IAuthTabCallback("canReboot", Boolean.valueOf(z))})}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
            obj = Result.constructor-impl(Unit.INSTANCE);
            int i7 = IEngagementSignalsCallback + 45;
            warmup = i7 % 128;
            int i8 = i7 % 2;
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj);
        if (th4 != null) {
            oninterstitialaddisplayfailed.onNavigationEvent("mono_hermes_teardown", th4);
        }
        oninterstitialaddisplayfailed.IAuthTabCallback(iIntValue, oninterstitialadloadfailed);
        oninterstitialaddisplayfailed.mayLaunchUrl();
        if (oninterstitialaddisplayfailed.onPostMessage == null) {
            oninterstitialaddisplayfailed.onNavigationEvent(iIntValue, true);
            return null;
        }
        try {
            Result.Companion companion5 = Result.Companion;
            obj2 = Result.constructor-impl(oninterstitialaddisplayfailed.IAuthTabCallbackStub().onNavigationEvent("TossExpectedTeardown: Portal runtime destroyed on app session finish", (Exception) null, new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj4) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 99;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        onInterstitialAdDisplayFailed.onExtraCallback(this.f$0, iIntValue, ((Boolean) obj4).booleanValue());
                        throw null;
                    }
                    Unit unitOnExtraCallback = onInterstitialAdDisplayFailed.onExtraCallback(this.f$0, iIntValue, ((Boolean) obj4).booleanValue());
                    int i11 = onExtraCallbackWithResult + 77;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }));
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th5));
        }
        if (Result.exceptionOrNull-impl(obj2) == null) {
            return null;
        }
        oninterstitialaddisplayfailed.onNavigationEvent(iIntValue, false);
        return null;
    }

    private final void IAuthTabCallback(final int i, final onInterstitialAdLoadFailed oninterstitialadloadfailed) {
        int i2 = 2 % 2;
        this.writeTypedObject.postDelayed(new Runnable() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda9
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.f$0;
                if (i5 != 0) {
                    onInterstitialAdDisplayFailed.IAuthTabCallback(oninterstitialaddisplayfailed, i, oninterstitialadloadfailed);
                    return;
                }
                onInterstitialAdDisplayFailed.IAuthTabCallback(oninterstitialaddisplayfailed, i, oninterstitialadloadfailed);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 10000L);
        int i3 = warmup + 107;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, int i, onInterstitialAdLoadFailed oninterstitialadloadfailed) {
        int i2 = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            if (((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue() == i) {
                int i3 = warmup + 31;
                IEngagementSignalsCallback = i3 % 128;
                int i4 = i3 % 2;
                if (oninterstitialaddisplayfailed.access100.IAuthTabCallbackStub() != r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.TEARING_DOWN) {
                    int i5 = IEngagementSignalsCallback + 25;
                    warmup = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    oninterstitialadloadfailed.getLogValue();
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GranitePortalRuntime", "portal_runtime_teardown_stalled", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("generation", Integer.valueOf(i)), getWrite.IAuthTabCallback("trigger", oninterstitialadloadfailed.getLogValue()), getWrite.IAuthTabCallback("waitedMillis", 10000L)}), (String) null, false, (String) null, 56, (Object) null);
                }
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onNavigationEvent(int i, boolean z) throws NoWhenBranchMatchedException {
        Object obj;
        Object obj2;
        int i2 = 2 % 2;
        int i3 = onTransact.onWarmupCompleted[this.access100.IAuthTabCallback(i, z).ordinal()];
        if (i3 == 1 || i3 == 2) {
            return;
        }
        int i4 = warmup + 93;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0 ? i3 == 3 : i3 == 5) {
            this.isEngagementSignalsApiAvailable.onWarmupCompleted();
            this.requestPostMessageChannelWithExtras = SystemClock.elapsedRealtime();
            try {
                Result.Companion companion = Result.Companion;
                r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onExtraCallback(r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted, "mono_hermes_teardown", null, onExtraCallbackWithResult("failed", false), 2, null);
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                onNavigationEvent("mono_hermes_teardown", th2);
            }
            Result.IAuthTabCallback(obj2);
            return;
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.setEngagementSignalsCallback.onNavigationEvent();
        this.requestPostMessageChannelWithExtras = SystemClock.elapsedRealtime();
        boolean zIAuthTabCallback = this.isEngagementSignalsApiAvailable.IAuthTabCallback();
        try {
            Result.Companion companion3 = Result.Companion;
            Object[] objArr = {r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted, "mono_hermes_teardown", onExtraCallbackWithResult("completed", zIAuthTabCallback)};
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1053925019, -1053925018, objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj);
        if (th4 != null) {
            int i5 = warmup + 49;
            IEngagementSignalsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                onNavigationEvent("mono_hermes_teardown", th4);
                throw null;
            }
            onNavigationEvent("mono_hermes_teardown", th4);
        }
        if (!zIAuthTabCallback) {
            this.ICustomTabsCallbackStubProxy = "next_entry";
        } else {
            this.ICustomTabsCallbackStubProxy = "auto";
            access100();
        }
    }

    private final void mayLaunchUrl() {
        Unit unit;
        int i = 2 % 2;
        this.onMessageChannelReady = this.newSessionWithExtras;
        this.newSessionWithExtras = null;
        r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted.onWarmupCompleted();
        this.postMessage = 0L;
        this.extraCommand = 0L;
        this.access000.onExtraCallback(new IllegalStateException("portal runtime torn down"));
        this.access000 = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        getFullPackage.onWarmupCompleted(this.asInterface.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        Collection<IAuthTabCallbackDefault> collectionValues = this.prefetchWithMultipleUrls.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Iterator<T> it = collectionValues.iterator();
        int i2 = warmup + 9;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) it.next();
            try {
                Result.Companion companion = Result.Companion;
                transV2ImportCert transv2importcertOnWarmupCompleted = iAuthTabCallbackDefault.onWarmupCompleted();
                if (transv2importcertOnWarmupCompleted != null) {
                    int i4 = warmup + 47;
                    IEngagementSignalsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    transv2importcertOnWarmupCompleted.close();
                    unit = Unit.INSTANCE;
                    int i6 = warmup + 47;
                    IEngagementSignalsCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    unit = null;
                }
                Result.constructor-impl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
        }
        this.prefetchWithMultipleUrls.clear();
        this.ICustomTabsCallback.clear();
        this.onMinimized.clear();
        this.onActivityResized.clear();
        this.onTransact = null;
        this.onExtraCallback = null;
        this.IAuthTabCallbackDefault = null;
        this.ICustomTabsCallback_Parcel = null;
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallback_Parcel.onWarmupCompleted();
        this.writeTypedObject.removeCallbacks(this.onRelationshipValidationResult);
        this.onUnminimized.asInterface();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[PHI: r1 r5
      0x004c: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v19 java.lang.String) binds: [B:17:0x004a, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r5v3 boolean) = (r5v2 boolean), (r5v8 boolean) binds: [B:17:0x004a, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[PHI: r5
      0x0068: PHI (r5v7 boolean) = (r5v2 boolean), (r5v8 boolean) binds: [B:17:0x004a, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onRelationshipValidationResult() {
        Object obj;
        String str;
        boolean z;
        PortalRuntimeRecycleConfig portalRuntimeRecycleConfigOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (this.ICustomTabsCallbackStub.compareAndSet(false, true)) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(DERSet.onExtraCallback.fullyDrawnReporter_delegatelambda00());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                IAuthTabCallback(1960273799, new Object[]{this, th2}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1960273763);
                this.ICustomTabsCallbackStub.set(false);
                return;
            }
            int i2 = warmup + 49;
            IEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                str = (String) obj;
                boolean zIsBlank = StringsKt.isBlank(str);
                z = !zIsBlank;
                if (!zIsBlank) {
                }
            } else {
                str = (String) obj;
                boolean zIsBlank2 = StringsKt.isBlank(str);
                z = !zIsBlank2;
                if (zIsBlank2) {
                    portalRuntimeRecycleConfigOnExtraCallbackWithResult = PortalRuntimeRecycleConfig.Companion.IAuthTabCallback();
                } else {
                    int i3 = IEngagementSignalsCallback + 13;
                    warmup = i3 % 128;
                    if (i3 % 2 != 0) {
                        portalRuntimeRecycleConfigOnExtraCallbackWithResult = PortalRuntimeRecycleConfig.Companion.onExtraCallbackWithResult(str);
                        int i4 = 51 / 0;
                    } else {
                        portalRuntimeRecycleConfigOnExtraCallbackWithResult = PortalRuntimeRecycleConfig.Companion.onExtraCallbackWithResult(str);
                    }
                }
            }
            this.onUnminimized.onExtraCallbackWithResult(portalRuntimeRecycleConfigOnExtraCallbackWithResult);
            portalRuntimeRecycleConfigOnExtraCallbackWithResult.onExtraCallbackWithResult();
            portalRuntimeRecycleConfigOnExtraCallbackWithResult.onExtraCallback();
            portalRuntimeRecycleConfigOnExtraCallbackWithResult.onNavigationEvent();
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GranitePortalRuntime", "portal_runtime_recycle_config", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("enabled", Boolean.valueOf(portalRuntimeRecycleConfigOnExtraCallbackWithResult.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("delivered", Boolean.valueOf(z)), getWrite.IAuthTabCallback("sessionThreshold", Integer.valueOf(portalRuntimeRecycleConfigOnExtraCallbackWithResult.onExtraCallback())), getWrite.IAuthTabCallback("idleDelayMillis", Long.valueOf(portalRuntimeRecycleConfigOnExtraCallbackWithResult.onNavigationEvent()))}), (String) null, false, (String) null, 56, (Object) null);
            int i5 = warmup + 75;
            IEngagementSignalsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 0;
            }
        }
    }

    private static /* synthetic */ Object newAuthTabSession(Object[] objArr) throws Throwable {
        String strIntern;
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        if (th != null) {
            int i2 = warmup + 3;
            IEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                th.getClass().getSimpleName();
                throw null;
            }
            strIntern = th.getClass().getSimpleName();
        } else {
            Object[] objArr2 = new Object[1];
            a(19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 7 - TextUtils.getTrimmedLength(""), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            int i3 = IEngagementSignalsCallback + 67;
            warmup = i3 % 128;
            int i4 = i3 % 2;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "GranitePortalRuntime", "portal_runtime_recycle_config_failed", access8100.onNavigationEvent(getWrite.IAuthTabCallback("errorClass", strIntern)), (String) null, false, (String) null, 56, (Object) null);
        return null;
    }

    private final void extraCallback() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 105;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (this.onUnminimized.access100() == onAdViewAdClicked.CANCEL) {
            IAuthTabCallback(572719163, new Object[]{this, "session_mounted"}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -572719146);
            return;
        }
        int i4 = IEngagementSignalsCallback + 101;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = warmup + 117;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.onUnminimized.onTransact() != onAdViewAdClicked.CANCEL) {
            int i4 = warmup + 75;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            IAuthTabCallback(572719163, new Object[]{this, "entry_started"}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -572719146);
        }
    }

    private final void writeTypedObject() {
        int i = 2 % 2;
        int i2 = warmup + 7;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.onUnminimized.asBinder() != onAdViewAdClicked.CANCEL) {
            int i4 = warmup + 53;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            IAuthTabCallback(572719163, new Object[]{this, "service_preload"}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -572719146);
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws Throwable {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        oninterstitialaddisplayfailed.writeTypedObject.removeCallbacks(oninterstitialaddisplayfailed.onRelationshipValidationResult);
        ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 457374428, -457374428, new Object[]{oninterstitialaddisplayfailed.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        a(ViewConfiguration.getScrollBarFadeDuration() >> 16, TextUtils.indexOf("", "", 0, 0) + 6, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47833), objArr2);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "GranitePortalRuntime", "portal_runtime_recycle_cancelled", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str), getWrite.IAuthTabCallback("completedServices", Integer.valueOf(((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 457374428, -457374428, new Object[]{oninterstitialaddisplayfailed.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue()))}), (String) null, false, (String) null, 56, (Object) null);
        int i2 = warmup + 115;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void IAuthTabCallbackStub(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 107;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!this.access100.IAuthTabCallbackDefault()) {
            int i4 = warmup + 57;
            IEngagementSignalsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (this.onUnminimized.onWarmupCompleted(str, this.prefetchWithMultipleUrls.size()) == onAdViewAdClicked.SCHEDULE) {
            asInterface("session_unmounted");
            return;
        }
        int i5 = IEngagementSignalsCallback + 59;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            ICustomTabsCallbackDefault();
        } else {
            ICustomTabsCallbackDefault();
            obj.hashCode();
            throw null;
        }
    }

    private final void ICustomTabsCallbackDefault() throws Throwable {
        int i = 2 % 2;
        if (!(!this.onUnminimized.onWarmupCompleted().onExtraCallbackWithResult())) {
            int i2 = IEngagementSignalsCallback + 121;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                this.onUnminimized.IAuthTabCallback(this.prefetchWithMultipleUrls.size());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int size = this.prefetchWithMultipleUrls.size();
            String strIAuthTabCallback = this.onUnminimized.IAuthTabCallback(size);
            if (strIAuthTabCallback != null) {
                int iIAuthTabCallbackStub = this.onUnminimized.IAuthTabCallbackStub();
                int iIntValue = ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
                ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 457374428, -457374428, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a((-1) - TextUtils.lastIndexOf("", '0', 0), 6 - TextUtils.getTrimmedLength(""), (char) (Color.rgb(0, 0, 0) + 16825049), objArr);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "GranitePortalRuntime", "portal_runtime_recycle_schedule_blocked", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strIAuthTabCallback), getWrite.IAuthTabCallback("activeSessions", Integer.valueOf(size)), getWrite.IAuthTabCallback("completedServices", Integer.valueOf(((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 457374428, -457374428, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue())), getWrite.IAuthTabCallback("preparingEntries", Integer.valueOf(iIAuthTabCallbackStub)), getWrite.IAuthTabCallback("heldEntries", Integer.valueOf(iIntValue))}), (String) null, false, (String) null, 56, (Object) null);
                return;
            }
        }
        int i3 = warmup + 83;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onNavigationEvent(int i) throws Throwable {
        String str;
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 31;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        int iIntValue = ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 17195192, -17195190, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        int iIAuthTabCallbackStub = this.onUnminimized.IAuthTabCallbackStub();
        int iIntValue2 = ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        if (!this.onUnminimized.onWarmupCompleted().onExtraCallbackWithResult()) {
            int i5 = warmup + 55;
            IEngagementSignalsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 3;
            }
            str = "policy_disabled";
        } else if (i > 0) {
            int i7 = warmup + 51;
            IEngagementSignalsCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 49 / 0;
            }
            str = "active_sessions";
        } else if (iIAuthTabCallbackStub > 0) {
            int i9 = IEngagementSignalsCallback + 47;
            warmup = i9 % 128;
            int i10 = i9 % 2;
            str = "preparing_entries";
        } else {
            str = "held_entries";
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(TextUtils.getOffsetAfter("", 0), 6 - View.getDefaultSize(0, 0), (char) (47832 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "GranitePortalRuntime", "portal_runtime_recycle_due_skipped", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback("activeSessions", Integer.valueOf(i)), getWrite.IAuthTabCallback("pendingEntries", Integer.valueOf(iIntValue)), getWrite.IAuthTabCallback("preparingEntries", Integer.valueOf(iIAuthTabCallbackStub)), getWrite.IAuthTabCallback("heldEntries", Integer.valueOf(iIntValue2))}), (String) null, false, (String) null, 56, (Object) null);
    }

    private final void asInterface(String str) {
        int i = 2 % 2;
        long jOnNavigationEvent = this.onUnminimized.onWarmupCompleted().onNavigationEvent();
        this.writeTypedObject.postDelayed(this.onRelationshipValidationResult, jOnNavigationEvent);
        ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 457374428, -457374428, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GranitePortalRuntime", "portal_runtime_recycle_scheduled", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("trigger", str), getWrite.IAuthTabCallback("completedServices", Integer.valueOf(((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 457374428, -457374428, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue())), getWrite.IAuthTabCallback("delayMillis", Long.valueOf(jOnNavigationEvent))}), (String) null, false, (String) null, 56, (Object) null);
        int i2 = warmup + 39;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 103;
        IEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean zIAuthTabCallbackDefault = this.onUnminimized.IAuthTabCallbackDefault();
            int size = this.prefetchWithMultipleUrls.size();
            if (!this.onUnminimized.onExtraCallbackWithResult(size)) {
                if (!zIAuthTabCallbackDefault) {
                    int i3 = warmup + 31;
                    IEngagementSignalsCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                onNavigationEvent(size);
                return;
            }
            ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GranitePortalRuntime", "portal_runtime_recycle_due", access8100.onNavigationEvent(getWrite.IAuthTabCallback("generation", Integer.valueOf(((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue()))), (String) null, false, (String) null, 56, (Object) null);
            IAuthTabCallback(-831134392, new Object[]{this, onInterstitialAdLoadFailed.RECYCLE}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 831134429);
            return;
        }
        this.onUnminimized.IAuthTabCallbackDefault();
        this.onUnminimized.onExtraCallbackWithResult(this.prefetchWithMultipleUrls.size());
        obj.hashCode();
        throw null;
    }

    public final void access100() {
        int i = 2 % 2;
        IAuthTabCallback(1221140041, new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1221140037);
        onRelationshipValidationResult();
        this.setEngagementSignalsCallback.IAuthTabCallback(new Function0() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda17
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = onInterstitialAdDisplayFailed.onWarmupCompleted(this.f$0);
                int i5 = onExtraCallback + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        });
        int i2 = warmup + 109;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
    }

    static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ int $bootGeneration;
        final /* synthetic */ pauseMyRequest<Unit> $bootInitialization;
        final /* synthetic */ String $bootInstanceId;
        final /* synthetic */ long $bootStartedAt;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(int i, String str, long j, pauseMyRequest<Unit> pausemyrequest, access13800<? super writeTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$bootGeneration = i;
            this.$bootInstanceId = str;
            this.$bootStartedAt = j;
            this.$bootInitialization = pausemyrequest;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = onInterstitialAdDisplayFailed.this.new writeTypedObject(this.$bootGeneration, this.$bootInstanceId, this.$bootStartedAt, this.$bootInitialization, access13800Var);
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
            }
            return writetypedobject;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 59;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
            }
            return objInvokeSuspend;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function1<access13800<? super transGetKmCert>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda6 $bootstrapLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(1, access13800Var);
                this.$bootstrapLoader = maxFullscreenAdImplExternalSyntheticLambda6;
            }

            public final Object IAuthTabCallback(access13800<? super transGetKmCert> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$bootstrapLoader, access13800Var);
                int i2 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallbackwithresult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i2 % 128;
                access13800<? super transGetKmCert> access13800Var = (access13800) obj;
                if (i2 % 2 == 0) {
                    IAuthTabCallback(access13800Var);
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(access13800Var);
                int i3 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = this.$bootstrapLoader;
                    this.label = 1;
                    Object objOnWarmupCompleted2 = maxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted((access13800<? super transGetKmCert>) this);
                    if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    int i5 = onNavigationEvent + 65;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 25 / 0;
                    }
                    return objOnWarmupCompleted2;
                }
                int i7 = onNavigationEvent;
                int i8 = i7 + 73;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = i7 + 53;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }

        /* renamed from: o.onInterstitialAdDisplayFailed$writeTypedObject$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            final /* synthetic */ int $bootGeneration;
            final /* synthetic */ pauseMyRequest<Unit> $bootInitialization;
            final /* synthetic */ String $bootInstanceId;
            final /* synthetic */ long $bootStartedAt;
            final /* synthetic */ transGetKmCert $bundleSource;
            int label;
            final /* synthetic */ onInterstitialAdDisplayFailed this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, transGetKmCert transgetkmcert, int i, String str, long j, pauseMyRequest<Unit> pausemyrequest, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = oninterstitialaddisplayfailed;
                this.$bundleSource = transgetkmcert;
                this.$bootGeneration = i;
                this.$bootInstanceId = str;
                this.$bootStartedAt = j;
                this.$bootInitialization = pausemyrequest;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$bundleSource, this.$bootGeneration, this.$bootInstanceId, this.$bootStartedAt, this.$bootInitialization, access13800Var);
                int i2 = onExtraCallback + 45;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass1;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 29;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 17;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass1Create.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass1Create.invokeSuspend(unit);
                int i4 = onExtraCallback + 103;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
            
                return r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
            
                if (r9.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            
                if (r9.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r10);
                o.onInterstitialAdDisplayFailed.onNavigationEvent(r9.this$0, r9.$bundleSource, r9.$bootGeneration, r9.$bootInstanceId, r9.$bootStartedAt, r9.$bootInitialization);
                r10 = kotlin.Unit.INSTANCE;
                r1 = o.onInterstitialAdDisplayFailed.writeTypedObject.AnonymousClass1.onExtraCallback + 105;
                o.onInterstitialAdDisplayFailed.writeTypedObject.AnonymousClass1.IAuthTabCallback = r1 % 128;
                r1 = r1 % 2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 67 / 0;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0189, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r5, r15, r16) == r2) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6;
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            Object obj2 = null;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                onInterstitialAdDisplayFailed.onExtraCallback(onInterstitialAdDisplayFailed.this, th, this.$bootGeneration, this.$bootInstanceId, this.$bootStartedAt, this.$bootInitialization);
            }
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) onInterstitialAdDisplayFailed.IAuthTabCallback(-547953519, new Object[]{onInterstitialAdDisplayFailed.this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 547953520);
                RnPhaseObserver rnPhaseObserverExtraCallback = onInterstitialAdDisplayFailed.extraCallback(onInterstitialAdDisplayFailed.this);
                RnCause rnCauseOnExtraCallbackWithResult = onInterstitialAdDisplayFailed.onExtraCallbackWithResult(onInterstitialAdDisplayFailed.this, this.$bootGeneration);
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(maxFullscreenAdImplExternalSyntheticLambda6, null);
                this.L$0 = maxFullscreenAdImplExternalSyntheticLambda6;
                this.label = 1;
                int iOnExtraCallback = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback();
                int iOnExtraCallback2 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback();
                int iOnExtraCallback3 = com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback();
                objIAuthTabCallback = RnPhaseObserver.IAuthTabCallback(iOnExtraCallback2, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, new Object[]{rnPhaseObserverExtraCallback, rnCauseOnExtraCallbackWithResult, onextracallbackwithresult, this}, 45134883, -45134878, iOnExtraCallback3);
                Object obj3 = objIAuthTabCallback;
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                int i5 = onExtraCallback + 111;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                int i7 = i5 % 2;
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 113;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                obj2.hashCode();
                throw null;
            }
            MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda62 = (MaxFullscreenAdImplExternalSyntheticLambda6) this.L$0;
            ResultKt.onNavigationEvent(obj);
            int i9 = onExtraCallback + 77;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            maxFullscreenAdImplExternalSyntheticLambda6 = maxFullscreenAdImplExternalSyntheticLambda62;
            objIAuthTabCallback = obj;
            transGetKmCert transgetkmcert = (transGetKmCert) objIAuthTabCallback;
            onInterstitialAdDisplayFailed.IAuthTabCallback(88086249, new Object[]{onInterstitialAdDisplayFailed.this, transgetkmcert}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -88086243);
            if (transgetkmcert instanceof transGetKmCert.onWarmupCompleted) {
                int i11 = IAuthTabCallback + 39;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    onInterstitialAdDisplayFailed.onWarmupCompleted(onInterstitialAdDisplayFailed.this, maxFullscreenAdImplExternalSyntheticLambda6);
                    onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
                    Object[] objArr = {onInterstitialAdDisplayFailed.onNavigationEvent(oninterstitialaddisplayfailed, maxFullscreenAdImplExternalSyntheticLambda6).onExtraCallbackWithResult()};
                    int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                    onInterstitialAdDisplayFailed.IAuthTabCallback(oninterstitialaddisplayfailed, (String) TossReactBundleMeta.onWarmupCompleted(objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback()));
                    obj2.hashCode();
                    throw null;
                }
                onInterstitialAdDisplayFailed.onWarmupCompleted(onInterstitialAdDisplayFailed.this, maxFullscreenAdImplExternalSyntheticLambda6);
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailed2 = onInterstitialAdDisplayFailed.this;
                Object[] objArr2 = {onInterstitialAdDisplayFailed.onNavigationEvent(oninterstitialaddisplayfailed2, maxFullscreenAdImplExternalSyntheticLambda6).onExtraCallbackWithResult()};
                int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                onInterstitialAdDisplayFailed.IAuthTabCallback(oninterstitialaddisplayfailed2, (String) TossReactBundleMeta.onWarmupCompleted(objArr2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, iIAuthTabCallback2, WebSocketFactory.onExtraCallback.IAuthTabCallback()));
            }
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(onInterstitialAdDisplayFailed.this, transgetkmcert, this.$bootGeneration, this.$bootInstanceId, this.$bootStartedAt, this.$bootInitialization, null);
            this.L$0 = access15400.onNavigationEvent(maxFullscreenAdImplExternalSyntheticLambda6);
            this.L$1 = access15400.onNavigationEvent(transgetkmcert);
            this.label = 2;
        }
    }

    private static final Unit onActivityResized(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        int i = 2 % 2;
        if (!oninterstitialaddisplayfailed.access100.onExtraCallbackWithResult()) {
            Unit unit = Unit.INSTANCE;
            int i2 = IEngagementSignalsCallback + 117;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }
        String strOnMinimized = oninterstitialaddisplayfailed.onMinimized();
        long j = oninterstitialaddisplayfailed.ICustomTabsService;
        maybeUpdateAnimatable.onNavigationEvent(oninterstitialaddisplayfailed.asInterface, (CoroutineContext) null, (setRandomHost) null, oninterstitialaddisplayfailed.new writeTypedObject(((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue(), strOnMinimized, j, oninterstitialaddisplayfailed.access000, null), 3, (Object) null);
        Unit unit2 = Unit.INSTANCE;
        int i4 = warmup + 35;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        access13800 access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 87;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            oninterstitialaddisplayfailed.access000.IAuthTabCallback(access13800Var);
            access14300.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = oninterstitialaddisplayfailed.access000.IAuthTabCallback(access13800Var);
        if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = warmup + 99;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
        }
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) throws Throwable {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        transGetKmCert transgetkmcert = (transGetKmCert) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str = (String) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        pauseMyRequest pausemyrequest = (pauseMyRequest) objArr[5];
        int i = 2 % 2;
        oninterstitialaddisplayfailed.onUnminimized();
        MaxFullscreenAdImplExternalSyntheticLambda9 maxFullscreenAdImplExternalSyntheticLambda9OnPostMessage = oninterstitialaddisplayfailed.onPostMessage();
        oninterstitialaddisplayfailed.readTypedObject.onWarmupCompleted(maxFullscreenAdImplExternalSyntheticLambda9OnPostMessage);
        createAdListenerWrapper.IAuthTabCallback(oninterstitialaddisplayfailed.onNavigationEvent, maxFullscreenAdImplExternalSyntheticLambda9OnPostMessage.IAuthTabCallbackStubProxy(), "GranitePortalRuntime");
        Object[] objArr2 = {oninterstitialaddisplayfailed.mayLaunchUrl};
        RnPhaseObserver.IAuthTabCallback(com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback(), objArr2, 1183770401, -1183770401, com.facebook.internal.ICustomTabsCallbackStubProxy.onExtraCallback());
        RnPhaseObserver.onWarmupCompleted(oninterstitialaddisplayfailed.mayLaunchUrl, oninterstitialaddisplayfailed.IAuthTabCallback(iIntValue), "mono", oninterstitialaddisplayfailed.onWarmupCompleted(iIntValue), null, 8, null);
        Object obj = null;
        if (oninterstitialaddisplayfailed.onPostMessage == null) {
            int i2 = IEngagementSignalsCallback + 47;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                oninterstitialaddisplayfailed.onPostMessage = oninterstitialaddisplayfailed.onExtraCallback(transgetkmcert);
                oninterstitialaddisplayfailed.IAuthTabCallbackStub().onExtraCallback(oninterstitialaddisplayfailed.ICustomTabsCallbackDefault);
                obj.hashCode();
                throw null;
            }
            oninterstitialaddisplayfailed.onPostMessage = oninterstitialaddisplayfailed.onExtraCallback(transgetkmcert);
            oninterstitialaddisplayfailed.IAuthTabCallbackStub().onExtraCallback(oninterstitialaddisplayfailed.ICustomTabsCallbackDefault);
        }
        System.identityHashCode(oninterstitialaddisplayfailed.IAuthTabCallbackStub());
        transgetkmcert.getClass().getSimpleName();
        ReactHost reactHostIAuthTabCallbackStub = oninterstitialaddisplayfailed.IAuthTabCallbackStub();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(oninterstitialaddisplayfailed.onNavigationEvent, im.toss.uikit.R.style.WhiteTheme);
        Bundle bundleOnNavigationEvent = r8lambda3VLBDMfcFBq3y6wAYf87R7p92xc.onExtraCallbackWithResult.onNavigationEvent(oninterstitialaddisplayfailed.onNavigationEvent, oninterstitialaddisplayfailed.validateRelationship.onExtraCallbackWithResult().getCode(), oninterstitialaddisplayfailed.onActivityResized().onExtraCallback());
        bundleOnNavigationEvent.putBoolean("_monoHermes", true);
        bundleOnNavigationEvent.putString("_serviceSessionBundleLoaderModuleName", "TossBundleLoader");
        bundleOnNavigationEvent.putString("_serviceSessionEventModuleName", "TossBundleLoader");
        Unit unit = Unit.INSTANCE;
        Object[] objArr3 = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777229, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr3);
        oninterstitialaddisplayfailed.IAuthTabCallbackStub = reactHostIAuthTabCallbackStub.IAuthTabCallback(contextThemeWrapper, ((String) objArr3[0]).intern(), bundleOnNavigationEvent);
        DisplayMetrics displayMetrics = oninterstitialaddisplayfailed.onNavigationEvent.getResources().getDisplayMetrics();
        oninterstitialaddisplayfailed.onExtraCallback(displayMetrics.widthPixels, displayMetrics.heightPixels);
        ReactSurface reactSurface = oninterstitialaddisplayfailed.IAuthTabCallbackStub;
        if (reactSurface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            reactSurface = null;
        }
        reactSurface.IAuthTabCallback();
        ReactSurface reactSurface2 = oninterstitialaddisplayfailed.IAuthTabCallbackStub;
        if (reactSurface2 == null) {
            int i3 = warmup + 123;
            IEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = warmup + 115;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            reactSurface2 = null;
        }
        getChallenge getchallengeOnExtraCallbackWithResult = reactSurface2.onExtraCallbackWithResult();
        ReactSurface reactSurface3 = oninterstitialaddisplayfailed.IAuthTabCallbackStub;
        if (reactSurface3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            reactSurface3 = null;
        }
        maybeUpdateAnimatable.onNavigationEvent(oninterstitialaddisplayfailed.asInterface, (CoroutineContext) null, (setRandomHost) null, new extraCallbackWithResult(getchallengeOnExtraCallbackWithResult, iIntValue, reactSurface3.IAuthTabCallback(), pausemyrequest, oninterstitialaddisplayfailed, str, jLongValue, null), 3, (Object) null);
        return null;
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $bootGeneration;
        final /* synthetic */ pauseMyRequest<Unit> $bootInitialization;
        final /* synthetic */ String $bootInstanceId;
        final /* synthetic */ long $bootStartedAt;
        final /* synthetic */ getChallenge<Void> $startTask;
        final /* synthetic */ int $startedSurfaceId;
        int label;
        final /* synthetic */ onInterstitialAdDisplayFailed this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        extraCallbackWithResult(getChallenge<Void> getchallenge, int i, int i2, pauseMyRequest<Unit> pausemyrequest, onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, long j, access13800<? super extraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$startTask = getchallenge;
            this.$bootGeneration = i;
            this.$startedSurfaceId = i2;
            this.$bootInitialization = pausemyrequest;
            this.this$0 = oninterstitialaddisplayfailed;
            this.$bootInstanceId = str;
            this.$bootStartedAt = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallbackWithResult extracallbackwithresult = new extraCallbackWithResult(this.$startTask, this.$bootGeneration, this.$startedSurfaceId, this.$bootInitialization, this.this$0, this.$bootInstanceId, this.$bootStartedAt, access13800Var);
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return extracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            extraCallbackWithResult extracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return extracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            extracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: o.onInterstitialAdDisplayFailed$extraCallbackWithResult$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ int $bootGeneration;
            final /* synthetic */ String $bootInstanceId;
            final /* synthetic */ long $bootStartedAt;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ onInterstitialAdDisplayFailed this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(int i, onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, long j, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$bootGeneration = i;
                this.this$0 = oninterstitialaddisplayfailed;
                this.$bootInstanceId = str;
                this.$bootStartedAt = j;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$bootGeneration, this.this$0, this.$bootInstanceId, this.$bootStartedAt, access13800Var);
                anonymousClass5.L$0 = obj;
                int i2 = onNavigationEvent + 75;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass5;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 61;
                onNavigationEvent = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onExtraCallback(findresandmsg, access13800Var);
                }
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                int i = 2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                if (this.$bootGeneration == ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{(onAdViewAdDisplayed) onInterstitialAdDisplayFailed.IAuthTabCallback(-999534704, new Object[]{this.this$0}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 999534707)}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue()) {
                    int i2 = onNavigationEvent + 115;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    ((onAdViewAdDisplayed) onInterstitialAdDisplayFailed.IAuthTabCallback(-999534704, new Object[]{this.this$0}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 999534707)).onExtraCallback();
                    onInterstitialAdDisplayFailed.onExtraCallbackWithResult(this.this$0, SystemClock.elapsedRealtime());
                    onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = this.this$0;
                    String str = this.$bootInstanceId;
                    long j = this.$bootStartedAt;
                    try {
                        Result.Companion companion = Result.Companion;
                        onInterstitialAdDisplayFailed.IAuthTabCallback(oninterstitialaddisplayfailed, "ready", str, j);
                        obj2 = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    onInterstitialAdDisplayFailed oninterstitialaddisplayfailed2 = this.this$0;
                    Throwable th2 = Result.exceptionOrNull-impl(obj2);
                    if (th2 != null) {
                        int i4 = onWarmupCompleted + 77;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            onInterstitialAdDisplayFailed.onWarmupCompleted(oninterstitialaddisplayfailed2, "mono_hermes_reboot", th2);
                            throw null;
                        }
                        onInterstitialAdDisplayFailed.onWarmupCompleted(oninterstitialaddisplayfailed2, "mono_hermes_reboot", th2);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.$startTask.IAuthTabCallback();
                    Exception excOnNavigationEvent = this.$startTask.onNavigationEvent();
                    if (excOnNavigationEvent != null) {
                        throw excOnNavigationEvent;
                    }
                    if (this.$startTask.onExtraCallback()) {
                        throw new IllegalStateException("Controller ReactSurface start was cancelled");
                    }
                    setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$bootGeneration, this.this$0, this.$bootInstanceId, this.$bootStartedAt, null);
                    this.label = 1;
                    if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass5, this) == objOnWarmupCompleted) {
                        int i3 = onWarmupCompleted + 99;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 0 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                this.$bootInitialization.IAuthTabCallback(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                onInterstitialAdDisplayFailed.onExtraCallback(this.this$0, th, this.$bootGeneration, this.$bootInstanceId, this.$bootStartedAt, this.$bootInitialization);
                int i5 = onExtraCallback + 89;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final transV2ExportCert ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        r8lambda4EHrnZ9SU_UFWvZy_trwQUIGDEE r8lambda4ehrnz9su_ufwvzy_trwquigdee = new r8lambda4EHrnZ9SU_UFWvZy_trwQUIGDEE();
        int i2 = warmup + 25;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return r8lambda4ehrnz9su_ufwvzy_trwquigdee;
    }

    private static final getSignForPKCS7NoContents extraCommand() {
        int i = 2 % 2;
        TossExoPlayerProvider tossExoPlayerProvider = new TossExoPlayerProvider();
        int i2 = IEngagementSignalsCallback + 61;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        return tossExoPlayerProvider;
    }

    private static final readFileToByteArray IAuthTabCallback(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        d1aa d1aaVar = new d1aa(context);
        int i2 = IEngagementSignalsCallback + 115;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        return d1aaVar;
    }

    private final void onUnminimized() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 43;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        CertToolkitMgrRevokeReason certToolkitMgrRevokeReason = CertToolkitMgrRevokeReason.onExtraCallback;
        if (certToolkitMgrRevokeReason.IAuthTabCallback() == null) {
            certToolkitMgrRevokeReason.onExtraCallbackWithResult(new d1a(this.onNavigationEvent));
        }
        isValidCertNum isvalidcertnum = isValidCertNum.onExtraCallbackWithResult;
        if (!isvalidcertnum.onExtraCallback().contains("toss")) {
            isvalidcertnum.onExtraCallback("toss", new Function0() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda11
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 41;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    transV2ExportCert transv2exportcertIAuthTabCallback = onInterstitialAdDisplayFailed.IAuthTabCallback();
                    int i7 = IAuthTabCallback + 21;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 51 / 0;
                    }
                    return transv2exportcertIAuthTabCallback;
                }
            });
            isvalidcertnum.onExtraCallback("toss");
        }
        getSignForPKCS7AppCertAndVIDR getsignforpkcs7appcertandvidr = getSignForPKCS7AppCertAndVIDR.onExtraCallbackWithResult;
        if (!getsignforpkcs7appcertandvidr.onExtraCallbackWithResult().contains("toss-exoplayer")) {
            getsignforpkcs7appcertandvidr.IAuthTabCallback("toss-exoplayer", new Function0() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda12
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 73;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    getSignForPKCS7NoContents getsignforpkcs7nocontentsOnNavigationEvent = onInterstitialAdDisplayFailed.onNavigationEvent();
                    int i7 = onNavigationEvent + 93;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return getsignforpkcs7nocontentsOnNavigationEvent;
                }
            });
            getsignforpkcs7appcertandvidr.onNavigationEvent("toss-exoplayer");
        }
        decryptForPrivateKey decryptforprivatekey = decryptForPrivateKey.onNavigationEvent;
        if (!decryptforprivatekey.IAuthTabCallback()) {
            decryptforprivatekey.onExtraCallbackWithResult(new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda13
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 57;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    readFileToByteArray readfiletobytearrayOnExtraCallbackWithResult = onInterstitialAdDisplayFailed.onExtraCallbackWithResult((Context) obj);
                    int i7 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return readfiletobytearrayOnExtraCallbackWithResult;
                }
            });
            int i4 = warmup + 59;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        setShadowDrawableRight setshadowdrawableright = setShadowDrawableRight.onExtraCallbackWithResult;
        if (setshadowdrawableright.onWarmupCompleted() == null) {
            setshadowdrawableright.onExtraCallback(TossAppServiceWebViewProvider.Companion.onNavigationEvent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IEngagementSignalsCallback;
        int i5 = i4 + 19;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
            if (i > 0) {
                int i7 = i4 + 7;
                warmup = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 42 / 0;
                    if (i2 > 0) {
                        if (this.access100.IAuthTabCallbackDefault()) {
                            int i9 = warmup;
                            int i10 = i9 + 5;
                            IEngagementSignalsCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                throw null;
                            }
                            ReactSurface reactSurface = this.IAuthTabCallbackStub;
                            if (reactSurface != null) {
                                if (reactSurface == null) {
                                    int i11 = i9 + 29;
                                    IEngagementSignalsCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    int i13 = warmup + 113;
                                    IEngagementSignalsCallback = i13 % 128;
                                    int i14 = i13 % 2;
                                    reactSurface = null;
                                }
                                ViewGroup viewGroupOnNavigationEvent = reactSurface.onNavigationEvent();
                                if (viewGroupOnNavigationEvent != null) {
                                    int i15 = IEngagementSignalsCallback + 99;
                                    warmup = i15 % 128;
                                    int i16 = i15 % 2;
                                    viewGroupOnNavigationEvent.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                                    viewGroupOnNavigationEvent.layout(0, 0, i, i2);
                                }
                            }
                        }
                    }
                } else if (i2 > 0) {
                }
            }
        } else if (i > 0) {
        }
        int i17 = IEngagementSignalsCallback + 33;
        warmup = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = warmup + 35;
        IEngagementSignalsCallback = i4 % 128;
        String strOnExtraCallbackWithResult = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
        if (onwarmupcompleted != null) {
            strOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
        } else {
            int i5 = IEngagementSignalsCallback + 43;
            warmup = i5 % 128;
            int i6 = i5 % 2;
        }
        if (Intrinsics.areEqual(strOnExtraCallbackWithResult, str)) {
            onExtraCallback(i, i2);
        }
    }

    private final void onExtraCallbackWithResult(final Throwable th, final int i, final String str, final long j, pauseMyRequest<Unit> pausemyrequest) {
        int i2 = 2 % 2;
        RnPhaseObserver rnPhaseObserver = this.mayLaunchUrl;
        String strOnWarmupCompleted = onWarmupCompleted(i);
        String simpleName = th.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        rnPhaseObserver.IAuthTabCallback(strOnWarmupCompleted, simpleName);
        pausemyrequest.onExtraCallback(th);
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.writeTypedObject.post(new Runnable() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                onInterstitialAdDisplayFailed.IAuthTabCallback(i, this, th, str, jElapsedRealtime, j);
                if (i5 != 0) {
                    int i6 = 42 / 0;
                }
                int i7 = onWarmupCompleted + 107;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 44 / 0;
                }
            }
        });
        int i3 = warmup + 53;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Object obj;
        Object obj2;
        int iIntValue = ((Number) objArr[0]).intValue();
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[1];
        Throwable th = (Throwable) objArr[2];
        String str = (String) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        long jLongValue2 = ((Number) objArr[5]).longValue();
        int i = 2 % 2;
        boolean z = iIntValue == ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue() && oninterstitialaddisplayfailed.access100.onWarmupCompleted();
        try {
            Result.Companion companion = Result.Companion;
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
            Map mapOnNavigationEvent = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onNavigationEvent(r8lambdaxc7xafnircae5ge7mvkfmdsqbs, th, 0, 2, null);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("runtimeInstanceId", str);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bootElapsedMs", Long.valueOf(jLongValue));
            transGetKmCert transgetkmcert = oninterstitialaddisplayfailed.IAuthTabCallbackDefault;
            r8lambdaxc7xafnircae5ge7mvkfmdsqbs.onExtraCallback("mono_hermes_boot_failed", th, access8100.onWarmupCompleted(mapOnNavigationEvent, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("bundleSource", transgetkmcert != null ? transgetkmcert.getClass().getSimpleName() : null), getWrite.IAuthTabCallback("isTerminal", Boolean.valueOf(z))})));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
        Throwable th3 = Result.exceptionOrNull-impl(obj);
        if (th3 != null) {
            int i2 = warmup + 3;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            oninterstitialaddisplayfailed.onNavigationEvent("mono_hermes_boot_failed", th3);
        }
        if (!z) {
            return null;
        }
        try {
            Result.Companion companion3 = Result.Companion;
            oninterstitialaddisplayfailed.IAuthTabCallback("failed", str, jLongValue2);
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th4));
        }
        Throwable th5 = Result.exceptionOrNull-impl(obj2);
        if (th5 != null) {
            oninterstitialaddisplayfailed.onNavigationEvent("mono_hermes_reboot", th5);
        }
        oninterstitialaddisplayfailed.newSessionWithExtras = null;
        r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted.onWarmupCompleted();
        oninterstitialaddisplayfailed.postMessage = 0L;
        int i4 = IEngagementSignalsCallback + 63;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final String onMinimized() {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = warmup + 45;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
            strIAuthTabCallback = r8lambdaxc7xafnircae5ge7mvkfmdsqbs.IAuthTabCallback();
            this.newSessionWithExtras = strIAuthTabCallback;
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1653359475, 1653359475, new Object[]{r8lambdaxc7xafnircae5ge7mvkfmdsqbs, strIAuthTabCallback}, iOnNavigationEvent3, iOnNavigationEvent);
        } else {
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs2 = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
            strIAuthTabCallback = r8lambdaxc7xafnircae5ge7mvkfmdsqbs2.IAuthTabCallback();
            this.newSessionWithExtras = strIAuthTabCallback;
            int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent5 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent6 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent5, -1653359475, 1653359475, new Object[]{r8lambdaxc7xafnircae5ge7mvkfmdsqbs2, strIAuthTabCallback}, iOnNavigationEvent6, iOnNavigationEvent4);
        }
        this.ICustomTabsService = SystemClock.elapsedRealtime();
        this.postMessage = 0L;
        this.extraCommand = 0L;
        int i3 = warmup + 69;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    private final void onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 3;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(th instanceof JavascriptException)) {
            int i5 = i2 + 45;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!this.access100.IAuthTabCallbackDefault()) {
                int i7 = warmup + 119;
                IEngagementSignalsCallback = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
        }
        r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
        Map<String, Object> mapOnExtraCallbackWithResult = r8lambdaxc7xafnircae5ge7mvkfmdsqbs.onExtraCallbackWithResult(th, 1200);
        onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("activeService", onwarmupcompleted != null ? onwarmupcompleted.IAuthTabCallback() : null);
        Set<String> setKeySet = this.onMinimized.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        r8lambdaxc7xafnircae5ge7mvkfmdsqbs.onExtraCallback("mono_hermes_js_fatal", th, access8100.onWarmupCompleted(mapOnExtraCallbackWithResult, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("loadedServices", CollectionsKt.joinToString$default(CollectionsKt.sorted(setKeySet), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)), getWrite.IAuthTabCallback("runningSharedDeployedAt", this.ICustomTabsCallback_Parcel), getWrite.IAuthTabCallback("uptimeMs", Long.valueOf(ICustomTabsService())), getWrite.IAuthTabCallback("runtimeState", asInterface())})));
    }

    private final long ICustomTabsService() {
        int i = 2 % 2;
        int i2 = warmup + 19;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.postMessage != 0) {
            return SystemClock.elapsedRealtime() - this.postMessage;
        }
        int i4 = warmup;
        int i5 = i4 + 43;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 81;
        IEngagementSignalsCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 31 / 0;
        }
        return 0L;
    }

    private final void onNavigationEvent(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted.onWarmupCompleted(str, th);
        if (i3 != 0) {
            throw null;
        }
    }

    private final Map<String, Object> onExtraCallbackWithResult(String str, boolean z) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 17;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("phase", "finished"), getWrite.IAuthTabCallback("outcome", str), getWrite.IAuthTabCallback("previousRuntimeInstanceId", this.onMessageChannelReady), getWrite.IAuthTabCallback("teardownElapsedMs", Long.valueOf(this.requestPostMessageChannelWithExtras - this.requestPostMessageChannel)), getWrite.IAuthTabCallback("canReboot", Boolean.valueOf(z))});
        int i4 = IEngagementSignalsCallback + 93;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return mapOnWarmupCompleted;
    }

    private final void IAuthTabCallback(String str, String str2, long j) {
        int i = 2 % 2;
        int i2 = warmup + 49;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        String str3 = this.onMessageChannelReady;
        if (str3 == null) {
            return;
        }
        this.onMessageChannelReady = null;
        r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1053925019, -1053925018, new Object[]{r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted, "mono_hermes_reboot", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("previousRuntimeInstanceId", str3), getWrite.IAuthTabCallback("newRuntimeInstanceId", str2), getWrite.IAuthTabCallback("trigger", this.ICustomTabsCallbackStubProxy), getWrite.IAuthTabCallback("outcome", str), getWrite.IAuthTabCallback("bootElapsedMs", Long.valueOf(SystemClock.elapsedRealtime() - j)), getWrite.IAuthTabCallback("gapMs", Long.valueOf(j - this.requestPostMessageChannelWithExtras))})}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = IEngagementSignalsCallback + 17;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onExtraCallback(@NotNull PortalServiceActivity portalServiceActivity, @NotNull onAppOpenAdHidden onappopenadhidden, @Nullable String str) throws Throwable {
        String str2;
        int i = 2 % 2;
        int i2 = warmup + 49;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(portalServiceActivity, "");
            Intrinsics.checkNotNullParameter(onappopenadhidden, "");
            extraCallback();
            this.newSession.onNavigationEvent(onappopenadhidden.IAuthTabCallback());
            throw null;
        }
        Intrinsics.checkNotNullParameter(portalServiceActivity, "");
        Intrinsics.checkNotNullParameter(onappopenadhidden, "");
        extraCallback();
        this.newSession.onNavigationEvent(onappopenadhidden.IAuthTabCallback());
        if (str != null) {
            int i3 = IEngagementSignalsCallback + 123;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            str2 = this.prefetchWithMultipleUrls.containsKey(str) ? str : null;
            if (str2 == null) {
                str2 = onappopenadhidden.IAuthTabCallback() + ":" + UUID.randomUUID();
            }
        }
        String str3 = str2;
        IAuthTabCallbackDefault iAuthTabCallbackDefault = this.prefetchWithMultipleUrls.get(str3);
        if (iAuthTabCallbackDefault != null) {
            iAuthTabCallbackDefault.onExtraCallbackWithResult(new WeakReference<>(portalServiceActivity));
            onWarmupCompleted(portalServiceActivity, str3);
            ReactApplicationContext reactApplicationContextOnExtraCallback = onExtraCallback();
            if (reactApplicationContextOnExtraCallback != null) {
                portalServiceActivity.onNavigationEvent(reactApplicationContextOnExtraCallback, str3);
            }
            IAuthTabCallback(str3, iAuthTabCallbackDefault);
            int i5 = warmup + 43;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            return str3;
        }
        IAuthTabCallbackDefault iAuthTabCallbackDefault2 = new IAuthTabCallbackDefault(onappopenadhidden, new WeakReference(portalServiceActivity), false, null, null, 24, null);
        onWarmupCompleted(str3, iAuthTabCallbackDefault2);
        this.prefetchWithMultipleUrls.put(str3, iAuthTabCallbackDefault2);
        IAuthTabCallback(str3, iAuthTabCallbackDefault2);
        onWarmupCompleted(portalServiceActivity, str3);
        ReactApplicationContext reactApplicationContextOnExtraCallback2 = onExtraCallback();
        if (reactApplicationContextOnExtraCallback2 != null) {
            portalServiceActivity.onNavigationEvent(reactApplicationContextOnExtraCallback2, str3);
        }
        onappopenadhidden.IAuthTabCallback();
        if (str != null) {
            int i7 = warmup + 65;
            IEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        if (this.onUnminimized.onWarmupCompleted().onExtraCallbackWithResult()) {
            int i9 = IEngagementSignalsCallback + 83;
            warmup = i9 % 128;
            int i10 = i9 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GranitePortalRuntime", "service_activity_registered", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("identifier", str3), getWrite.IAuthTabCallback("serviceName", onappopenadhidden.IAuthTabCallback()), getWrite.IAuthTabCallback("restored", Boolean.valueOf(str != null)), getWrite.IAuthTabCallback("heldEntries", Integer.valueOf(((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue()))}), (String) null, false, (String) null, 56, (Object) null);
        }
        this.mayLaunchUrl.IAuthTabCallback();
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("identifier", str3);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("serviceName", onappopenadhidden.IAuthTabCallback());
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, (KeyEvent.getMaxKeyCode() >> 16) + 3, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12167), objArr);
        onNavigationEvent("openService", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onappopenadhidden.onWarmupCompleted())}));
        onExtraCallback(str3, iAuthTabCallbackDefault2);
        return str3;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 125;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(portalServiceActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            oninterstitialaddisplayfailed.prefetchWithMultipleUrls.get(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(portalServiceActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallbackDefault iAuthTabCallbackDefault = oninterstitialaddisplayfailed.prefetchWithMultipleUrls.get(str);
        if (iAuthTabCallbackDefault != null) {
            iAuthTabCallbackDefault.onExtraCallbackWithResult(new WeakReference<>(portalServiceActivity));
            oninterstitialaddisplayfailed.IAuthTabCallback(str, iAuthTabCallbackDefault);
            ResourceResolutionException resourceResolutionException = oninterstitialaddisplayfailed.readTypedObject;
            getTitleResource gettitleresourceOnExtraCallback = iAuthTabCallbackDefault.onExtraCallback();
            if (gettitleresourceOnExtraCallback == null) {
                int i3 = warmup + 25;
                IEngagementSignalsCallback = i3 % 128;
                int i4 = i3 % 2;
                gettitleresourceOnExtraCallback = portalServiceActivity.IEngagementSignalsCallbackStub();
            }
            resourceResolutionException.onWarmupCompleted(gettitleresourceOnExtraCallback);
        }
        oninterstitialaddisplayfailed.IAuthTabCallback_Parcel.onExtraCallbackWithResult(portalServiceActivity);
        int i5 = IEngagementSignalsCallback + 119;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull PortalServiceActivity portalServiceActivity) {
        int i = 2 % 2;
        int i2 = warmup + 111;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(portalServiceActivity, "");
            this.IAuthTabCallback_Parcel.onNavigationEvent(portalServiceActivity);
        } else {
            Intrinsics.checkNotNullParameter(portalServiceActivity, "");
            this.IAuthTabCallback_Parcel.onNavigationEvent(portalServiceActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 31;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback(1746685929, new Object[]{this, str, true}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1746685899);
        int i4 = warmup + 79;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = warmup + 41;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback(1746685929, new Object[]{this, str, false}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1746685899);
        int i4 = IEngagementSignalsCallback + 113;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) throws Throwable {
        IAuthTabCallbackDefault iAuthTabCallbackDefaultRemove;
        Object obj;
        Object obj2;
        Unit unit;
        Boolean boolValueOf;
        onWarmupCompleted onwarmupcompleted;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = null;
        if (zBooleanValue || (iAuthTabCallbackDefaultRemove = oninterstitialaddisplayfailed.prefetchWithMultipleUrls.remove(str)) == null) {
            return null;
        }
        transV2ImportCert transv2importcertOnWarmupCompleted = iAuthTabCallbackDefaultRemove.onWarmupCompleted();
        try {
            onWarmupCompleted onwarmupcompleted2 = oninterstitialaddisplayfailed.onExtraCallbackWithResult;
            if (Intrinsics.areEqual(onwarmupcompleted2 != null ? onwarmupcompleted2.onExtraCallbackWithResult() : null, str)) {
                Set<Map.Entry<String, IAuthTabCallbackDefault>> setEntrySet = oninterstitialaddisplayfailed.prefetchWithMultipleUrls.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
                Object obj3 = null;
                for (Object obj4 : setEntrySet) {
                    int i2 = IEngagementSignalsCallback + 5;
                    warmup = i2 % 128;
                    int i3 = i2 % 2;
                    if (((IAuthTabCallbackDefault) ((Map.Entry) obj4).getValue()).onExtraCallbackWithResult()) {
                        int i4 = warmup + 73;
                        IEngagementSignalsCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 27 / 0;
                        }
                        obj3 = obj4;
                    }
                }
                Map.Entry entry = (Map.Entry) obj3;
                if (entry != null) {
                    Object key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "");
                    Object value = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) value;
                    onwarmupcompleted = new onWarmupCompleted((String) key, iAuthTabCallbackDefault.onNavigationEvent().onWarmupCompleted(), iAuthTabCallbackDefault.onNavigationEvent().IAuthTabCallback(), iAuthTabCallbackDefault.IAuthTabCallback());
                } else {
                    onwarmupcompleted = null;
                }
                oninterstitialaddisplayfailed.onExtraCallbackWithResult = onwarmupcompleted;
            }
            IAuthTabCallback(1324998295, new Object[]{oninterstitialaddisplayfailed, iAuthTabCallbackDefaultRemove}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1324998271);
            oninterstitialaddisplayfailed.onNavigationEvent("closeService", access8100.onNavigationEvent(getWrite.IAuthTabCallback("identifier", str)));
            try {
                Result.Companion companion = Result.Companion;
                if (transv2importcertOnWarmupCompleted != null) {
                    int i6 = warmup + 59;
                    IEngagementSignalsCallback = i6 % 128;
                    int i7 = i6 % 2;
                    boolValueOf = Boolean.valueOf(transv2importcertOnWarmupCompleted.onNavigationEvent());
                } else {
                    boolValueOf = null;
                }
                obj = Result.constructor-impl(boolValueOf);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                onWarmupCompleted(oninterstitialaddisplayfailed, "close_app_failed", str, th2, null, 8, null);
            }
            try {
                Result.Companion companion3 = Result.Companion;
                if (transv2importcertOnWarmupCompleted != null) {
                    transv2importcertOnWarmupCompleted.close();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                obj2 = Result.constructor-impl(unit);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
            }
            Throwable th4 = Result.exceptionOrNull-impl(obj2);
            if (th4 != null) {
                onWarmupCompleted(oninterstitialaddisplayfailed, "close_failed", str, th4, null, 8, null);
            }
            oninterstitialaddisplayfailed.IAuthTabCallbackStub(iAuthTabCallbackDefaultRemove.onNavigationEvent().IAuthTabCallback());
            return null;
        } finally {
        }
    }

    private final void onWarmupCompleted(PortalServiceActivity portalServiceActivity, String str) {
        int i = 2 % 2;
        LinkedHashMap<String, IAuthTabCallbackDefault> linkedHashMap = this.prefetchWithMultipleUrls;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<Map.Entry<String, IAuthTabCallbackDefault>> it = linkedHashMap.entrySet().iterator();
        while (!(!it.hasNext())) {
            Map.Entry<String, IAuthTabCallbackDefault> next = it.next();
            if (!Intrinsics.areEqual(next.getKey(), str)) {
                int i2 = warmup + 107;
                IEngagementSignalsCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    linkedHashMap2.put(next.getKey(), next.getValue());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                linkedHashMap2.put(next.getKey(), next.getValue());
            }
        }
        Collection collectionValues = linkedHashMap2.values();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = collectionValues.iterator();
        int i3 = IEngagementSignalsCallback + 93;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        while (it2.hasNext()) {
            TossModule tossModuleOnExtraCallback = ((IAuthTabCallbackDefault) it2.next()).onExtraCallback();
            if (tossModuleOnExtraCallback != null) {
                arrayList.add(tossModuleOnExtraCallback);
            }
        }
        if (onInterstitialAdHidden.onExtraCallbackWithResult(this.readTypedObject.IAuthTabCallback("TossModule"), arrayList)) {
            this.readTypedObject.onWarmupCompleted(portalServiceActivity.IEngagementSignalsCallbackStub().IAuthTabCallbackStubProxy());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[PHI: r3 r7
      0x0064: PHI (r3v7 o.getTitleResource) = (r3v4 o.getTitleResource), (r3v5 o.getTitleResource), (r3v5 o.getTitleResource), (r3v9 o.getTitleResource) binds: [B:8:0x0039, B:10:0x003f, B:14:0x0054, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r7v13 im.toss.rn.toss.core.TossModule) = 
      (r7v3 im.toss.rn.toss.core.TossModule)
      (r7v4 im.toss.rn.toss.core.TossModule)
      (r7v4 im.toss.rn.toss.core.TossModule)
      (r7v14 im.toss.rn.toss.core.TossModule)
     binds: [B:8:0x0039, B:10:0x003f, B:14:0x0054, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r3 r4 r7
      0x003b: PHI (r3v5 o.getTitleResource) = (r3v4 o.getTitleResource), (r3v9 o.getTitleResource) binds: [B:8:0x0039, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r4v3 o.onInterstitialAdDisplayFailed$onWarmupCompleted) = (r4v2 o.onInterstitialAdDisplayFailed$onWarmupCompleted), (r4v9 o.onInterstitialAdDisplayFailed$onWarmupCompleted) binds: [B:8:0x0039, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r7v4 im.toss.rn.toss.core.TossModule) = (r7v3 im.toss.rn.toss.core.TossModule), (r7v14 im.toss.rn.toss.core.TossModule) binds: [B:8:0x0039, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        getTitleResource gettitleresourceIAuthTabCallback;
        TossModule tossModuleOnExtraCallback;
        onWarmupCompleted onwarmupcompleted;
        getTitleResource gettitleresourceOnExtraCallback;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 27;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            gettitleresourceIAuthTabCallback = oninterstitialaddisplayfailed.readTypedObject.IAuthTabCallback("TossModule");
            tossModuleOnExtraCallback = iAuthTabCallbackDefault.onExtraCallback();
            onwarmupcompleted = oninterstitialaddisplayfailed.onExtraCallbackWithResult;
            int i3 = 62 / 0;
            if (onwarmupcompleted != null) {
                String strOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult != null) {
                    int i4 = IEngagementSignalsCallback + 49;
                    warmup = i4 % 128;
                    if (i4 % 2 != 0) {
                        oninterstitialaddisplayfailed.prefetchWithMultipleUrls.get(strOnExtraCallbackWithResult);
                        throw null;
                    }
                    IAuthTabCallbackDefault iAuthTabCallbackDefault2 = oninterstitialaddisplayfailed.prefetchWithMultipleUrls.get(strOnExtraCallbackWithResult);
                    gettitleresourceOnExtraCallback = iAuthTabCallbackDefault2 != null ? iAuthTabCallbackDefault2.onExtraCallback() : null;
                }
            }
        } else {
            gettitleresourceIAuthTabCallback = oninterstitialaddisplayfailed.readTypedObject.IAuthTabCallback("TossModule");
            tossModuleOnExtraCallback = iAuthTabCallbackDefault.onExtraCallback();
            onwarmupcompleted = oninterstitialaddisplayfailed.onExtraCallbackWithResult;
            if (onwarmupcompleted != null) {
            }
        }
        getTitleResource gettitleresourceOnExtraCallback2 = onInterstitialAdHidden.onExtraCallback(gettitleresourceIAuthTabCallback, tossModuleOnExtraCallback, gettitleresourceOnExtraCallback, oninterstitialaddisplayfailed.onPostMessage());
        if (gettitleresourceOnExtraCallback2 != null) {
            oninterstitialaddisplayfailed.readTypedObject.onWarmupCompleted(gettitleresourceOnExtraCallback2);
            return null;
        }
        int i5 = IEngagementSignalsCallback + 23;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final MaxFullscreenAdImplExternalSyntheticLambda9 onPostMessage() {
        int i = 2 % 2;
        int i2 = warmup + 87;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = RnAppVersion.onExtraCallback.onWarmupCompleted(this.onNavigationEvent, this.IAuthTabCallbackStubProxy);
        String strOnExtraCallback = this.extraCallback.onExtraCallback();
        String strOnNavigationEvent = this.updateVisuals.onNavigationEvent();
        String strOnExtraCallback2 = onActivityResized().onExtraCallback();
        boolean zITrustedWebActivityServiceStubProxy = this.IAuthTabCallbackStubProxy.ITrustedWebActivityServiceStubProxy();
        String code = this.validateRelationship.onExtraCallbackWithResult().getCode();
        if (code == null) {
            int i4 = IEngagementSignalsCallback;
            int i5 = i4 + 75;
            warmup = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
            }
            int i7 = i4 + 39;
            warmup = i7 % 128;
            int i8 = i7 % 2;
            code = "kr";
        }
        String upperCase = code.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return new MaxFullscreenAdImplExternalSyntheticLambda9(strOnWarmupCompleted, strOnExtraCallback, strOnNavigationEvent, strOnExtraCallback2, zITrustedWebActivityServiceStubProxy, upperCase, "", "");
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $identifier;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(String str, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$identifier = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = onInterstitialAdDisplayFailed.this.new IAuthTabCallbackStub(this.$identifier, access13800Var);
            int i2 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            WeakReference<PortalServiceActivity> weakReferenceIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) onInterstitialAdDisplayFailed.writeTypedObject(onInterstitialAdDisplayFailed.this).get(this.$identifier);
            if (iAuthTabCallbackDefault == null || (weakReferenceIAuthTabCallback = iAuthTabCallbackDefault.IAuthTabCallback()) == null) {
                return null;
            }
            int i4 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            PortalServiceActivity portalServiceActivity = weakReferenceIAuthTabCallback.get();
            if (portalServiceActivity == null) {
                return null;
            }
            portalServiceActivity.finish();
            return Unit.INSTANCE;
        }
    }

    public final Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onExtraCallback().onExtraCallback(), new IAuthTabCallbackStub(str, null), access13800Var);
        int i2 = warmup + 117;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ String $bundleRequest;
        final /* synthetic */ ReactContext $reactContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(String str, ReactContext reactContext, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(1, access13800Var);
            this.$bundleRequest = str;
            this.$reactContext = reactContext;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = onInterstitialAdDisplayFailed.this.new IAuthTabCallback_Parcel(this.$bundleRequest, this.$reactContext, access13800Var);
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback_Parcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                onWarmupCompleted(access13800Var);
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(access13800Var);
            int i3 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_ParcelCreate = create(access13800Var);
            if (i3 != 0) {
                iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
                String str = this.$bundleRequest;
                ReactContext reactContext = this.$reactContext;
                this.label = 1;
                if (onInterstitialAdDisplayFailed.onExtraCallbackWithResult(oninterstitialaddisplayfailed, str, reactContext, (access13800) this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 21;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i7 != 0) {
                    int i8 = 87 / 0;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        ReactContext reactContext = (ReactContext) objArr[2];
        access13800 access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(oninterstitialaddisplayfailed, null, null, oninterstitialaddisplayfailed.new IAuthTabCallback_Parcel(str, reactContext, null), access13800Var, 3, null);
        if (objOnExtraCallbackWithResult == access14300.onWarmupCompleted()) {
            int i2 = IEngagementSignalsCallback + 19;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IEngagementSignalsCallback + 93;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x021b, code lost:
    
        if (IAuthTabCallback(1999039848, new java.lang.Object[]{r30, r3, r2, r5}, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1999039837) == r6) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(String str, ReactContext reactContext, access13800<? super Unit> access13800Var) throws Throwable {
        access100 access100Var;
        String strOnWarmupCompleted;
        int iIntValue;
        ReactContext reactContext2;
        String str2;
        int i;
        ReactContext reactContext3;
        Object objIAuthTabCallback;
        String str3;
        ReactContext reactContext4;
        ReactContext reactContext5;
        String str4;
        onExtraCallback onextracallback;
        ReactContext reactContext6 = reactContext;
        int i2 = 2 % 2;
        if (access13800Var instanceof access100) {
            access100Var = (access100) access13800Var;
            int i3 = access100Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = warmup + 113;
                IEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
                access100Var.label = i3 - 2147483648;
            } else {
                access100Var = new access100(access13800Var);
            }
        }
        Object obj = access100Var.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = access100Var.label;
        int i7 = 0;
        try {
            if (i6 == 0) {
                ResultKt.onNavigationEvent(obj);
                strOnWarmupCompleted = this.newSession.onWarmupCompleted(str);
                transGetKmCert transgetkmcert = this.IAuthTabCallbackDefault;
                if (transgetkmcert instanceof transGetKmCert.onNavigationEvent) {
                    iIntValue = ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
                    reactContext2 = this.prefetch;
                    access100Var.L$0 = str;
                    access100Var.L$1 = reactContext6;
                    access100Var.L$2 = strOnWarmupCompleted;
                    access100Var.L$3 = reactContext2;
                    access100Var.I$0 = iIntValue;
                    access100Var.I$1 = 0;
                    access100Var.label = 1;
                    if (reactContext2.IAuthTabCallback((Object) null, access100Var) != objOnWarmupCompleted) {
                        int i8 = warmup + 73;
                        IEngagementSignalsCallback = i8 % 128;
                        int i9 = i8 % 2;
                        str2 = str;
                        i = 0;
                        access100Var.L$0 = access15400.onNavigationEvent(str2);
                        access100Var.L$1 = reactContext6;
                        access100Var.L$2 = strOnWarmupCompleted;
                        access100Var.L$3 = reactContext2;
                        access100Var.I$0 = iIntValue;
                        access100Var.I$1 = i;
                        access100Var.I$2 = 0;
                        access100Var.label = 2;
                        objIAuthTabCallback = IAuthTabCallback(str2, strOnWarmupCompleted, (access13800<? super onExtraCallback>) access100Var);
                        if (objIAuthTabCallback != objOnWarmupCompleted) {
                        }
                    }
                } else {
                    if (!(transgetkmcert instanceof transGetKmCert.onWarmupCompleted)) {
                        if (transgetkmcert == null) {
                            throw new IllegalStateException("Portal controller bundle source is not initialized");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    int i10 = IEngagementSignalsCallback + 29;
                    warmup = i10 % 128;
                    int i11 = i10 % 2;
                    access100Var.L$0 = access15400.onNavigationEvent(str);
                    access100Var.L$1 = access15400.onNavigationEvent(reactContext);
                    access100Var.L$2 = access15400.onNavigationEvent(strOnWarmupCompleted);
                    access100Var.label = 4;
                }
                return objOnWarmupCompleted;
            }
            if (i6 == 1) {
                i = access100Var.I$1;
                int i12 = access100Var.I$0;
                ReactContext reactContext7 = (jni_YGNodeStyleGetFlexBasisJNI) access100Var.L$3;
                String str5 = (String) access100Var.L$2;
                ReactContext reactContext8 = (ReactContext) access100Var.L$1;
                str2 = (String) access100Var.L$0;
                ResultKt.onNavigationEvent(obj);
                strOnWarmupCompleted = str5;
                reactContext2 = reactContext7;
                iIntValue = i12;
                reactContext6 = reactContext8;
                try {
                    access100Var.L$0 = access15400.onNavigationEvent(str2);
                    access100Var.L$1 = reactContext6;
                    access100Var.L$2 = strOnWarmupCompleted;
                    access100Var.L$3 = reactContext2;
                    access100Var.I$0 = iIntValue;
                    access100Var.I$1 = i;
                    access100Var.I$2 = 0;
                    access100Var.label = 2;
                    objIAuthTabCallback = IAuthTabCallback(str2, strOnWarmupCompleted, (access13800<? super onExtraCallback>) access100Var);
                    if (objIAuthTabCallback != objOnWarmupCompleted) {
                        str3 = str2;
                        ReactContext reactContext9 = reactContext2;
                        reactContext4 = reactContext6;
                        reactContext5 = reactContext9;
                        str4 = strOnWarmupCompleted;
                        obj = objIAuthTabCallback;
                        onextracallback = (onExtraCallback) obj;
                        if (iIntValue == ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue()) {
                            access100Var.L$0 = access15400.onNavigationEvent(str3);
                            access100Var.L$1 = access15400.onNavigationEvent(reactContext4);
                            access100Var.L$2 = access15400.onNavigationEvent(str4);
                            access100Var.L$3 = reactContext5;
                            access100Var.L$4 = access15400.onNavigationEvent(onextracallback);
                            access100Var.I$0 = iIntValue;
                            access100Var.I$1 = i;
                            access100Var.I$2 = i7;
                            access100Var.label = 3;
                            if (onNavigationEvent(onextracallback, reactContext4, (access13800<? super Unit>) access100Var) == objOnWarmupCompleted) {
                            }
                            Unit unit = Unit.INSTANCE;
                            reactContext5.onWarmupCompleted((Object) null);
                            return unit;
                        }
                        ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
                        Unit unit2 = Unit.INSTANCE;
                        reactContext5.onWarmupCompleted((Object) null);
                        return unit2;
                    }
                    return objOnWarmupCompleted;
                } catch (Throwable th) {
                    th = th;
                    reactContext3 = reactContext2;
                    reactContext6 = reactContext3;
                    reactContext6.onWarmupCompleted((Object) null);
                    throw th;
                }
            }
            if (i6 != 2) {
                int i13 = IEngagementSignalsCallback + 109;
                int i14 = i13 % 128;
                warmup = i14;
                if (i13 % 2 == 0 ? i6 == 3 : i6 == 3) {
                    reactContext5 = (jni_YGNodeStyleGetFlexBasisJNI) access100Var.L$3;
                    ResultKt.onNavigationEvent(obj);
                    Unit unit3 = Unit.INSTANCE;
                    reactContext5.onWarmupCompleted((Object) null);
                    return unit3;
                }
                if (i6 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = i14 + 109;
                IEngagementSignalsCallback = i15 % 128;
                int i16 = i15 % 2;
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            i7 = access100Var.I$2;
            i = access100Var.I$1;
            int i17 = access100Var.I$0;
            reactContext3 = (jni_YGNodeStyleGetFlexBasisJNI) access100Var.L$3;
            String str6 = (String) access100Var.L$2;
            reactContext4 = (ReactContext) access100Var.L$1;
            str3 = (String) access100Var.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                iIntValue = i17;
                reactContext5 = reactContext3;
                str4 = str6;
                onextracallback = (onExtraCallback) obj;
                if (iIntValue == ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue() && reactContext4.hasActiveReactInstance()) {
                    access100Var.L$0 = access15400.onNavigationEvent(str3);
                    access100Var.L$1 = access15400.onNavigationEvent(reactContext4);
                    access100Var.L$2 = access15400.onNavigationEvent(str4);
                    access100Var.L$3 = reactContext5;
                    access100Var.L$4 = access15400.onNavigationEvent(onextracallback);
                    access100Var.I$0 = iIntValue;
                    access100Var.I$1 = i;
                    access100Var.I$2 = i7;
                    access100Var.label = 3;
                    if (onNavigationEvent(onextracallback, reactContext4, (access13800<? super Unit>) access100Var) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    Unit unit32 = Unit.INSTANCE;
                    reactContext5.onWarmupCompleted((Object) null);
                    return unit32;
                }
                ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
                Unit unit22 = Unit.INSTANCE;
                reactContext5.onWarmupCompleted((Object) null);
                return unit22;
            } catch (Throwable th2) {
                th = th2;
                reactContext6 = reactContext3;
                reactContext6.onWarmupCompleted((Object) null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static final class onActivityResized extends SuspendLambda implements Function1<access13800<? super String>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String $appName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onActivityResized(String str, access13800<? super onActivityResized> access13800Var) {
            super(1, access13800Var);
            this.$appName = str;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityResized onactivityresized = onInterstitialAdDisplayFailed.this.new onActivityResized(this.$appName, access13800Var);
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onactivityresized;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            if (i3 == 0) {
                int i4 = 21 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
            String str = this.$appName;
            this.label = 1;
            Object objOnNavigationEvent = onInterstitialAdDisplayFailed.onNavigationEvent(oninterstitialaddisplayfailed, str, (access13800) this);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
                int i3 = onExtraCallback + 87;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return objOnNavigationEvent;
            }
            int i5 = onNavigationEvent + 73;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    public final Object onWarmupCompleted(@NotNull String str, @NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(this, null, null, new onActivityResized(str, null), access13800Var, 3, null);
        int i2 = warmup + 57;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
    
        if (r11 == r7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        if (r11 == r7) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) throws Throwable {
        onPostMessage onpostmessage;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i;
        Object objIAuthTabCallback;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        onPostMessage onpostmessage2 = (access13800) objArr[2];
        int i2 = 2 % 2;
        int i3 = warmup + 33;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = onpostmessage2 instanceof onPostMessage;
            throw null;
        }
        if (onpostmessage2 instanceof onPostMessage) {
            onpostmessage = onpostmessage2;
            int i4 = onpostmessage.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onpostmessage.label = i4 - 2147483648;
            } else {
                onpostmessage = oninterstitialaddisplayfailed.new onPostMessage(onpostmessage2);
            }
        }
        Object objOnExtraCallbackWithResult = onpostmessage.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onpostmessage.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            transGetKmCert transgetkmcert = oninterstitialaddisplayfailed.IAuthTabCallbackDefault;
            if (transgetkmcert instanceof transGetKmCert.onNavigationEvent) {
                jni_ygnodestylegetflexbasisjni = oninterstitialaddisplayfailed.prefetch;
                onpostmessage.L$0 = str;
                onpostmessage.L$1 = jni_ygnodestylegetflexbasisjni;
                onpostmessage.I$0 = 0;
                onpostmessage.label = 1;
                if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, onpostmessage) != objOnWarmupCompleted) {
                    int i6 = IEngagementSignalsCallback + 39;
                    warmup = i6 % 128;
                    int i7 = i6 % 2;
                    i = 0;
                    String strIAuthTabCallback = oninterstitialaddisplayfailed.newSession.IAuthTabCallback(str);
                    onpostmessage.L$0 = access15400.onNavigationEvent(str);
                    onpostmessage.L$1 = jni_ygnodestylegetflexbasisjni;
                    onpostmessage.I$0 = i;
                    onpostmessage.I$1 = 0;
                    onpostmessage.label = 2;
                    objIAuthTabCallback = oninterstitialaddisplayfailed.IAuthTabCallback(strIAuthTabCallback, str, (access13800<? super onExtraCallback>) onpostmessage);
                    if (objIAuthTabCallback != objOnWarmupCompleted) {
                    }
                }
            } else {
                if (!(transgetkmcert instanceof transGetKmCert.onWarmupCompleted)) {
                    if (transgetkmcert == null) {
                        throw new IllegalStateException("Portal controller bundle source is not initialized");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i8 = warmup + 59;
                IEngagementSignalsCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    onpostmessage.L$0 = access15400.onNavigationEvent(str);
                    onpostmessage.label = 5;
                    objOnExtraCallbackWithResult = oninterstitialaddisplayfailed.onExtraCallbackWithResult(str, (access13800<? super onExtraCallback>) onpostmessage);
                } else {
                    onpostmessage.L$0 = access15400.onNavigationEvent(str);
                    onpostmessage.label = 3;
                    objOnExtraCallbackWithResult = oninterstitialaddisplayfailed.onExtraCallbackWithResult(str, (access13800<? super onExtraCallback>) onpostmessage);
                }
            }
            return objOnWarmupCompleted;
        }
        if (i5 == 1) {
            i = onpostmessage.I$0;
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni3 = (jni_YGNodeStyleGetFlexBasisJNI) onpostmessage.L$1;
            String str2 = (String) onpostmessage.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni3;
            str = str2;
            try {
                String strIAuthTabCallback2 = oninterstitialaddisplayfailed.newSession.IAuthTabCallback(str);
                onpostmessage.L$0 = access15400.onNavigationEvent(str);
                onpostmessage.L$1 = jni_ygnodestylegetflexbasisjni;
                onpostmessage.I$0 = i;
                onpostmessage.I$1 = 0;
                onpostmessage.label = 2;
                objIAuthTabCallback = oninterstitialaddisplayfailed.IAuthTabCallback(strIAuthTabCallback2, str, (access13800<? super onExtraCallback>) onpostmessage);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                    objOnExtraCallbackWithResult = objIAuthTabCallback;
                    String strOnExtraCallbackWithResult = ((onExtraCallback) objOnExtraCallbackWithResult).onExtraCallbackWithResult();
                    jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                    int i9 = warmup + 35;
                    IEngagementSignalsCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return strOnExtraCallbackWithResult;
                }
                return objOnWarmupCompleted;
            } catch (Throwable th) {
                th = th;
                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                throw th;
            }
        }
        int i11 = warmup;
        int i12 = i11 + 39;
        IEngagementSignalsCallback = i12 % 128;
        if (i12 % 2 != 0 ? i5 != 2 : i5 != 4) {
            int i13 = i11 + 97;
            IEngagementSignalsCallback = i13 % 128;
            int i14 = i13 % 2;
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = i11 + 49;
            IEngagementSignalsCallback = i15 % 128;
            if (i15 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                return ((onExtraCallback) objOnExtraCallbackWithResult).onExtraCallbackWithResult();
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            throw null;
        }
        jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) onpostmessage.L$1;
        try {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            String strOnExtraCallbackWithResult2 = ((onExtraCallback) objOnExtraCallbackWithResult).onExtraCallbackWithResult();
            jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
            int i92 = warmup + 35;
            IEngagementSignalsCallback = i92 % 128;
            int i102 = i92 % 2;
            return strOnExtraCallbackWithResult2;
        } catch (Throwable th2) {
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni4 = jni_ygnodestylegetflexbasisjni2;
            th = th2;
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni4;
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[PHI: r0
      0x003d: PHI (r0v5 o.onInterstitialAdDisplayFailed$onWarmupCompleted) = (r0v4 o.onInterstitialAdDisplayFailed$onWarmupCompleted), (r0v11 o.onInterstitialAdDisplayFailed$onWarmupCompleted) binds: [B:10:0x003b, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str, @NotNull TossModule tossModule) {
        onWarmupCompleted onwarmupcompleted;
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tossModule, "");
        IAuthTabCallbackDefault iAuthTabCallbackDefault = this.prefetchWithMultipleUrls.get(str);
        if (iAuthTabCallbackDefault != null) {
            int i4 = warmup + 87;
            IEngagementSignalsCallback = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                iAuthTabCallbackDefault.IAuthTabCallback(tossModule);
                onwarmupcompleted = this.onExtraCallbackWithResult;
                int i5 = 57 / 0;
                strOnExtraCallbackWithResult = onwarmupcompleted != null ? onwarmupcompleted.onExtraCallbackWithResult() : null;
            } else {
                iAuthTabCallbackDefault.IAuthTabCallback(tossModule);
                onwarmupcompleted = this.onExtraCallbackWithResult;
                if (onwarmupcompleted != null) {
                }
            }
            if (!Intrinsics.areEqual(strOnExtraCallbackWithResult, str)) {
                return;
            }
            int i6 = IEngagementSignalsCallback + 73;
            warmup = i6 % 128;
            if (i6 % 2 == 0) {
                this.readTypedObject.onWarmupCompleted(tossModule);
            } else {
                this.readTypedObject.onWarmupCompleted(tossModule);
                obj.hashCode();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 49;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        ResourceResolutionException resourceResolutionException = oninterstitialaddisplayfailed.readTypedObject;
        int i5 = i3 + 91;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return resourceResolutionException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ReactApplicationContext onExtraCallback() {
        int i = 2 % 2;
        Object obj = null;
        if (this.access100.IAuthTabCallbackDefault() && this.onPostMessage != null) {
            int i2 = IEngagementSignalsCallback + 21;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            ReactApplicationContext reactApplicationContextOnExtraCallbackWithResult = IAuthTabCallbackStub().onExtraCallbackWithResult();
            if (reactApplicationContextOnExtraCallbackWithResult instanceof ReactApplicationContext) {
                int i4 = IEngagementSignalsCallback + 111;
                warmup = i4 % 128;
                ReactApplicationContext reactApplicationContext = reactApplicationContextOnExtraCallbackWithResult;
                if (i4 % 2 == 0) {
                    return reactApplicationContext;
                }
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    public final MaxFullscreenAdImpl onTransact() {
        int i = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = this.onExtraCallback;
        if (maxFullscreenAdImplExternalSyntheticLambda6 == null) {
            int i2 = IEngagementSignalsCallback + 57;
            warmup = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = IEngagementSignalsCallback + 67;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        MaxFullscreenAdImpl maxFullscreenAdImplOnWarmupCompleted = maxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted();
        int i5 = warmup + 77;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return maxFullscreenAdImplOnWarmupCompleted;
    }

    public final MaxFullscreenAdImpl onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onAppOpenAdDisplayed onappopenaddisplayed = this.onMinimized.get(str);
        if (onappopenaddisplayed != null) {
            int i2 = warmup + 79;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            return onappopenaddisplayed.IAuthTabCallback();
        }
        int i4 = IEngagementSignalsCallback + 51;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void IAuthTabCallback(String str, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        this.onExtraCallbackWithResult = new onWarmupCompleted(str, iAuthTabCallbackDefault.onNavigationEvent().onWarmupCompleted(), iAuthTabCallbackDefault.onNavigationEvent().IAuthTabCallback(), iAuthTabCallbackDefault.IAuthTabCallback());
        int i2 = IEngagementSignalsCallback + 21;
        warmup = i2 % 128;
        int i3 = i2 % 2;
    }

    private final boolean onActivityLayout() {
        WeakReference<PortalServiceActivity> weakReferenceOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 109;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
        if (onwarmupcompleted != null && (weakReferenceOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted()) != null) {
            int i4 = IEngagementSignalsCallback + 99;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            PortalServiceActivity portalServiceActivity = weakReferenceOnWarmupCompleted.get();
            if (portalServiceActivity != null) {
                portalServiceActivity.finish();
                int i6 = warmup + 49;
                IEngagementSignalsCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        int i8 = IEngagementSignalsCallback + 51;
        warmup = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 79;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault iAuthTabCallbackDefault = oninterstitialaddisplayfailed.prefetchWithMultipleUrls.get(str);
        if (iAuthTabCallbackDefault != null) {
            int i4 = IEngagementSignalsCallback + 87;
            warmup = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 34 / 0;
                if (iAuthTabCallbackDefault.onExtraCallbackWithResult() != zBooleanValue) {
                    iAuthTabCallbackDefault.onExtraCallbackWithResult(zBooleanValue);
                    oninterstitialaddisplayfailed.onNavigationEvent("sessionVisibilityChanged", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("identifier", str), getWrite.IAuthTabCallback("isVisible", Boolean.valueOf(zBooleanValue))}));
                    transV2ImportCert transv2importcertOnWarmupCompleted = iAuthTabCallbackDefault.onWarmupCompleted();
                    if (transv2importcertOnWarmupCompleted == null) {
                        onWarmupCompleted(oninterstitialaddisplayfailed, "visibility_no_registration", str, null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("isVisible", Boolean.valueOf(zBooleanValue))), 4, null);
                        return null;
                    }
                    if (!transv2importcertOnWarmupCompleted.onWarmupCompleted(zBooleanValue)) {
                        int i6 = IEngagementSignalsCallback + 97;
                        warmup = i6 % 128;
                        int i7 = i6 % 2;
                        onWarmupCompleted(oninterstitialaddisplayfailed, "visibility_rejected", str, null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("isVisible", Boolean.valueOf(zBooleanValue))), 4, null);
                    }
                }
            } else if (iAuthTabCallbackDefault.onExtraCallbackWithResult() != zBooleanValue) {
            }
        }
        int i8 = IEngagementSignalsCallback + 31;
        warmup = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private final void onExtraCallback(String str, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 47;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        transV2ImportCert transv2importcertOnWarmupCompleted = iAuthTabCallbackDefault.onWarmupCompleted();
        if (transv2importcertOnWarmupCompleted != null) {
            String strIAuthTabCallback = iAuthTabCallbackDefault.onNavigationEvent().IAuthTabCallback();
            String strOnWarmupCompleted = iAuthTabCallbackDefault.onNavigationEvent().onWarmupCompleted();
            if (StringsKt.isBlank(strIAuthTabCallback) || StringsKt.isBlank(strOnWarmupCompleted)) {
                onWarmupCompleted(this, "open_app_skipped", str, null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("blankServiceName", Boolean.valueOf(StringsKt.isBlank(strIAuthTabCallback))), getWrite.IAuthTabCallback("blankScheme", Boolean.valueOf(StringsKt.isBlank(strOnWarmupCompleted)))}), 4, null);
                return;
            } else if (!transv2importcertOnWarmupCompleted.onWarmupCompleted(strIAuthTabCallback, strOnWarmupCompleted)) {
                int i4 = warmup + 41;
                IEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
                onWarmupCompleted(this, "open_app_rejected", str, null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("serviceName", strIAuthTabCallback)), 4, null);
            }
        }
        int i6 = warmup + 95;
        IEngagementSignalsCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    static /* synthetic */ void onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, String str2, Throwable th, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i3 = IEngagementSignalsCallback + 11;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            th = null;
        }
        if ((i & 8) != 0) {
            map = access8100.onNavigationEvent();
        }
        IAuthTabCallback(-657951309, new Object[]{oninterstitialaddisplayfailed, str, str2, th, map}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 657951340);
        int i5 = IEngagementSignalsCallback + 23;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final CharSequence onExtraCallback(Map.Entry entry) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        String str = " " + entry.getKey() + "=" + entry.getValue();
        int i2 = warmup + 105;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Throwable th = (Throwable) objArr[3];
        Map map = (Map) objArr[4];
        int i = 2 % 2;
        CollectionsKt.joinToString$default(map.entrySet(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda14
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 37;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                CharSequence charSequenceIAuthTabCallback = onInterstitialAdDisplayFailed.IAuthTabCallback((Map.Entry) obj);
                if (i4 != 0) {
                    int i5 = 88 / 0;
                }
                return charSequenceIAuthTabCallback;
            }
        }, 30, (Object) null);
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String str3 = "micro_frontend_" + str;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.put("identifier", str2);
        mapOnExtraCallback.putAll(map);
        Object obj = null;
        if (th != null) {
            int i2 = IEngagementSignalsCallback + 119;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                mapOnExtraCallback.put("cause", th.toString());
                obj.hashCode();
                throw null;
            }
            mapOnExtraCallback.put("cause", th.toString());
        }
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "GranitePortalRuntime", str3, access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 56, (Object) null);
        return null;
    }

    private final void onWarmupCompleted(String str, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 105;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        transV2ImportCert transv2importcertOnWarmupCompleted = iAuthTabCallbackDefault.onWarmupCompleted();
        if (transv2importcertOnWarmupCompleted != null) {
            transv2importcertOnWarmupCompleted.close();
        }
        iAuthTabCallbackDefault.IAuthTabCallback((transV2ImportCert) null);
        iAuthTabCallbackDefault.IAuthTabCallback(transV2Init.IAuthTabCallback(str));
        int i4 = IEngagementSignalsCallback + 19;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) objArr[2];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 19;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        oninterstitialaddisplayfailed.onWarmupCompleted(str, iAuthTabCallbackDefault);
        oninterstitialaddisplayfailed.onExtraCallback(str, iAuthTabCallbackDefault);
        transV2ImportCert transv2importcertOnWarmupCompleted = iAuthTabCallbackDefault.onWarmupCompleted();
        Object obj = null;
        if (transv2importcertOnWarmupCompleted != null) {
            int i4 = IEngagementSignalsCallback + 59;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            transv2importcertOnWarmupCompleted.onWarmupCompleted(iAuthTabCallbackDefault.onExtraCallbackWithResult());
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = IEngagementSignalsCallback + 85;
            warmup = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 3;
            }
        }
        return null;
    }

    private final boolean onNavigationEvent(String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = warmup + 47;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2 = this.onTransact;
        if (maxFullscreenAdImplExternalSyntheticLambda2 != null) {
            boolean zIAuthTabCallback = maxFullscreenAdImplExternalSyntheticLambda2.IAuthTabCallback(str, map);
            int i4 = IEngagementSignalsCallback + 57;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            return zIAuthTabCallback;
        }
        if (this.onActivityLayout) {
            return false;
        }
        this.ICustomTabsCallback.addLast(new asBinder(str, map));
        return true;
    }

    private final void onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2, String str, IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 53;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("identifier", str);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("serviceName", iAuthTabCallbackDefault.onNavigationEvent().IAuthTabCallback());
        Object[] objArr = new Object[1];
        a(6 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12167), objArr);
        maxFullscreenAdImplExternalSyntheticLambda2.IAuthTabCallback("openService", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), iAuthTabCallbackDefault.onNavigationEvent().onWarmupCompleted())}));
        int i4 = IEngagementSignalsCallback + 79;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2, String str, boolean z) {
        Map<String, ? extends Object> mapOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 15;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("identifier", str), getWrite.IAuthTabCallback("isVisible", Boolean.valueOf(z))});
        } else {
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("identifier", str);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("isVisible", Boolean.valueOf(z));
            Pair[] pairArr = new Pair[3];
            pairArr[1] = pairIAuthTabCallback;
            pairArr[0] = pairIAuthTabCallback2;
            mapOnWarmupCompleted = access8100.onWarmupCompleted(pairArr);
        }
        maxFullscreenAdImplExternalSyntheticLambda2.IAuthTabCallback("sessionVisibilityChanged", mapOnWarmupCompleted);
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super File>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ File $bundleDirectory;
        final /* synthetic */ String $filePrefix;
        final /* synthetic */ byte[] $scriptData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        readTypedObject(String str, File file, byte[] bArr, access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$filePrefix = str;
            this.$bundleDirectory = file;
            this.$scriptData = bArr;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = new readTypedObject(this.$filePrefix, this.$bundleDirectory, this.$scriptData, access13800Var);
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return readtypedobject;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super File> access13800Var) throws IOException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            readTypedObject readtypedobjectCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return readtypedobjectCreate.invokeSuspend(unit);
            }
            readtypedobjectCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i3 + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            File fileCreateTempFile = File.createTempFile(this.$filePrefix, ".bundle", this.$bundleDirectory);
            byte[] bArr = this.$scriptData;
            Intrinsics.checkNotNull(fileCreateTempFile);
            FilesKt.writeBytes(fileCreateTempFile, bArr);
            int i6 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return fileCreateTempFile;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(String str, String str2, access13800<? super onExtraCallback> access13800Var) {
        ICustomTabsCallback iCustomTabsCallback;
        String str3;
        String str4;
        int i = 2 % 2;
        if (access13800Var instanceof ICustomTabsCallback) {
            iCustomTabsCallback = (ICustomTabsCallback) access13800Var;
            int i2 = iCustomTabsCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iCustomTabsCallback.label = i2 - 2147483648;
            } else {
                iCustomTabsCallback = new ICustomTabsCallback(access13800Var);
            }
        }
        Object objOnNavigationEvent = iCustomTabsCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = iCustomTabsCallback.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            iCustomTabsCallback.L$0 = access15400.onNavigationEvent(str);
            iCustomTabsCallback.L$1 = str2;
            iCustomTabsCallback.label = 1;
            objOnNavigationEvent = onNavigationEvent(str, str2, (access13800<? super Pair<byte[], String>>) iCustomTabsCallback);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        int i4 = IEngagementSignalsCallback;
        int i5 = i4 + 121;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = i4 + 65;
            warmup = i7 % 128;
            int i8 = i7 % 2;
            String str5 = (String) iCustomTabsCallback.L$3;
            String str6 = (String) iCustomTabsCallback.L$1;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            int i9 = IEngagementSignalsCallback + 21;
            warmup = i9 % 128;
            int i10 = i9 % 2;
            str4 = str5;
            str3 = str6;
            String absolutePath = ((File) objOnNavigationEvent).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            return new onExtraCallback(str3, absolutePath, str4, null, null, 24, null);
        }
        str2 = (String) iCustomTabsCallback.L$1;
        str = (String) iCustomTabsCallback.L$0;
        ResultKt.onNavigationEvent(objOnNavigationEvent);
        Pair pair = (Pair) objOnNavigationEvent;
        byte[] bArr = (byte[]) pair.onExtraCallbackWithResult();
        String str7 = (String) pair.IAuthTabCallback();
        File file = new File(this.onNavigationEvent.getCacheDir(), "granite-micro-frontend");
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalStateException("Failed to create micro-frontend bundle cache directory");
        }
        String str8 = new Regex("[^A-Za-z0-9._-]").replace(str2, "_") + "-";
        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
        readTypedObject readtypedobject = new readTypedObject(str8, file, bArr, null);
        iCustomTabsCallback.L$0 = access15400.onNavigationEvent(str);
        iCustomTabsCallback.L$1 = str2;
        iCustomTabsCallback.L$2 = access15400.onNavigationEvent(bArr);
        iCustomTabsCallback.L$3 = str7;
        iCustomTabsCallback.L$4 = access15400.onNavigationEvent(file);
        iCustomTabsCallback.L$5 = access15400.onNavigationEvent(str8);
        iCustomTabsCallback.label = 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, readtypedobject, iCustomTabsCallback);
        if (objOnExtraCallback != objOnWarmupCompleted) {
            int i11 = IEngagementSignalsCallback + 57;
            warmup = i11 % 128;
            int i12 = i11 % 2;
            str3 = str2;
            str4 = str7;
            objOnNavigationEvent = objOnExtraCallback;
            String absolutePath2 = ((File) objOnNavigationEvent).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "");
            return new onExtraCallback(str3, absolutePath2, str4, null, null, 24, null);
        }
        return objOnWarmupCompleted;
    }

    private final String onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        String str = "portal-boot#" + i;
        int i3 = warmup + 71;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    private final RnCause IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        if (i == 0) {
            int i3 = IEngagementSignalsCallback + 113;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            return RnCause.APP_BOOT;
        }
        RnCause rnCause = RnCause.RUNTIME_RECYCLE;
        int i5 = warmup + 31;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return rnCause;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(onExtraCallback onextracallback, ReactContext reactContext, access13800<? super Unit> access13800Var) throws Throwable {
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy;
        Object obj;
        RnBundleInfo rnBundleInfo;
        String str;
        String str2;
        RnBundleInfo rnBundleInfo2;
        onExtraCallback onextracallback2;
        int i = 2 % 2;
        int i2 = warmup + 77;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = access13800Var instanceof IAuthTabCallbackStubProxy;
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallbackStubProxy) {
            iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) access13800Var;
            int i3 = iAuthTabCallbackStubProxy.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStubProxy.label = i3 - 2147483648;
            } else {
                iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(access13800Var);
            }
        }
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2 = iAuthTabCallbackStubProxy;
        Object obj2 = iAuthTabCallbackStubProxy2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = iAuthTabCallbackStubProxy2.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rnBundleInfo2 = (RnBundleInfo) iAuthTabCallbackStubProxy2.L$3;
            str2 = (String) iAuthTabCallbackStubProxy2.L$2;
            onExtraCallback onextracallback3 = (onExtraCallback) iAuthTabCallbackStubProxy2.L$0;
            try {
                ResultKt.onNavigationEvent(obj2);
                onextracallback2 = onextracallback3;
                rnBundleInfo = rnBundleInfo2;
                RnPhaseObserver.IAuthTabCallback(this.mayLaunchUrl, str2, rnBundleInfo, (String) null, false, 12, (Object) null);
                onextracallback2.onExtraCallback();
                onextracallback2.IAuthTabCallback();
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                e = e;
                this.mayLaunchUrl.onWarmupCompleted(str2, rnBundleInfo2, e.getClass().getSimpleName(), true);
                throw e;
            } catch (Throwable th) {
                th = th;
                rnBundleInfo = rnBundleInfo2;
                RnPhaseObserver.IAuthTabCallback(this.mayLaunchUrl, str2, rnBundleInfo, th.getClass().getSimpleName(), false, 8, (Object) null);
                throw th;
            }
        }
        ResultKt.onNavigationEvent(obj2);
        String strOnNavigationEvent = onextracallback.onNavigationEvent();
        this.mayLaunchUrl.onExtraCallbackWithResult(strOnNavigationEvent, "mono");
        String strOnExtraCallback = onextracallback.onExtraCallback();
        RnBundleInfo.Role role = RnBundleInfo.Role.SERVICE;
        String code = this.validateRelationship.onExtraCallbackWithResult().getCode();
        if (code == null) {
            int i5 = warmup + 15;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            code = "kr";
        }
        String upperCase = code.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        String strIAuthTabCallback = onextracallback.IAuthTabCallback();
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(access14000.onExtraCallback(new File(onextracallback.onExtraCallbackWithResult()).length()));
            int i7 = warmup + 45;
            IEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Long l = (Long) obj;
        Long l2 = (l == null || l.longValue() <= 0) ? null : l;
        Object[] objArr = new Object[1];
        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, KeyEvent.keyCodeFromString("") + 4, (char) TextUtils.getOffsetBefore("", 0), objArr);
        rnBundleInfo = new RnBundleInfo((RnBundleInfo.Source) null, strOnExtraCallback, upperCase, ((String) objArr[0]).intern(), strOnNavigationEvent, strIAuthTabCallback, (Integer) null, l2, (Long) null, (RnCause) null, role, (List) null, (Double) null, 6977, (DefaultConstructorMarker) null);
        try {
            MaxFullscreenAdImplExternalSyntheticLambda3 maxFullscreenAdImplExternalSyntheticLambda3 = MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted;
            String strOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("remoteBundleName", onextracallback.onExtraCallback());
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 13, ((byte) KeyEvent.getModifierMetaStateMask()) + 7, (char) ((-1) - MotionEvent.axisFromString("")), objArr2);
            Map<String, ? extends Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("hostBundleName", ((String) objArr2[0]).intern()), getWrite.IAuthTabCallback("distributionGroup", onActivityResized().onExtraCallback())});
            onextracallback2 = onextracallback;
            iAuthTabCallbackStubProxy2.L$0 = onextracallback2;
            iAuthTabCallbackStubProxy2.L$1 = access15400.onNavigationEvent(reactContext);
            iAuthTabCallbackStubProxy2.L$2 = strOnNavigationEvent;
            iAuthTabCallbackStubProxy2.L$3 = rnBundleInfo;
            iAuthTabCallbackStubProxy2.label = 1;
            str = strOnNavigationEvent;
            try {
                if (maxFullscreenAdImplExternalSyntheticLambda3.IAuthTabCallback(reactContext, strOnExtraCallbackWithResult, strOnNavigationEvent, "TossPortalRuntime", mapOnWarmupCompleted, iAuthTabCallbackStubProxy2) == objOnWarmupCompleted) {
                    int i9 = IEngagementSignalsCallback + 59;
                    warmup = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
                str2 = str;
                RnPhaseObserver.IAuthTabCallback(this.mayLaunchUrl, str2, rnBundleInfo, (String) null, false, 12, (Object) null);
                onextracallback2.onExtraCallback();
                onextracallback2.IAuthTabCallback();
                return Unit.INSTANCE;
            } catch (CancellationException e2) {
                e = e2;
                rnBundleInfo2 = rnBundleInfo;
                str2 = str;
                this.mayLaunchUrl.onWarmupCompleted(str2, rnBundleInfo2, e.getClass().getSimpleName(), true);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                str2 = str;
                RnPhaseObserver.IAuthTabCallback(this.mayLaunchUrl, str2, rnBundleInfo, th.getClass().getSimpleName(), false, 8, (Object) null);
                throw th;
            }
        } catch (CancellationException e3) {
            e = e3;
            str = strOnNavigationEvent;
        } catch (Throwable th4) {
            th = th4;
            str = strOnNavigationEvent;
        }
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends byte[], ? extends String>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $bundleRequest;
        final /* synthetic */ String $serviceName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(String str, String str2, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$bundleRequest = str;
            this.$serviceName = str2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = onInterstitialAdDisplayFailed.this.new getInterfaceDescriptor(this.$bundleRequest, this.$serviceName, access13800Var);
            getinterfacedescriptor.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return getinterfacedescriptor;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Pair<byte[], String>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getInterfaceDescriptor getinterfacedescriptorCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                getinterfacedescriptorCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = getinterfacedescriptorCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Response responseExecute;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ArrayList arrayList = new ArrayList();
            for (String str : onInterstitialAdDisplayFailed.extraCallbackWithResult(onInterstitialAdDisplayFailed.this).onExtraCallback(this.$bundleRequest)) {
                onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
                try {
                    Result.Companion companion = Result.Companion;
                    responseExecute = onInterstitialAdDisplayFailed.readTypedObject(oninterstitialaddisplayfailed).newCall(new Request.Builder().url(str).build()).execute();
                    try {
                    } finally {
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (!responseExecute.isSuccessful()) {
                    throw new IllegalStateException(("HTTP " + responseExecute.code()).toString());
                }
                byte[] bArrBytes = responseExecute.body().bytes();
                CloseableKt.closeFinally(responseExecute, (Throwable) null);
                obj2 = Result.constructor-impl(bArrBytes);
                int i2 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Throwable th2 = Result.exceptionOrNull-impl(obj2);
                if (th2 == null) {
                    byte[] bArr = (byte[]) obj2;
                    if (!(!onInterstitialAdDisplayFailed.extraCallbackWithResult(onInterstitialAdDisplayFailed.this).onExtraCallbackWithResult(bArr, this.$serviceName))) {
                        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(bArr, str);
                        int i4 = onExtraCallbackWithResult + 97;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 99 / 0;
                        }
                        return pairIAuthTabCallback;
                    }
                    arrayList.add(str + " (service marker mismatch)");
                } else {
                    arrayList.add(str + " (" + th2.getMessage() + ")");
                }
            }
            throw new IllegalStateException("No running Metro server provided the " + this.$serviceName + " bundle. Tried: " + CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
    }

    private final Object onNavigationEvent(String str, String str2, access13800<? super Pair<byte[], String>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new getInterfaceDescriptor(str, str2, null), access13800Var);
        int i2 = warmup + 51;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
        return objOnExtraCallback;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt.isBlank(str)) {
            int i2 = warmup + 9;
            IEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        access100();
        writeTypedObject();
        if (this.onActivityResized.contains(str)) {
            return;
        }
        this.newSession.onNavigationEvent(str);
        transV2Init.onNavigationEvent(str);
        asBinder(str);
        int i3 = warmup + 105;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }

    public final AutoCloseable onNavigationEvent(@NotNull String str, @NotNull Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (StringsKt.isBlank(str)) {
            int i2 = IEngagementSignalsCallback + 43;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke("serviceName must not be blank");
            return null;
        }
        access100();
        writeTypedObject();
        boolean zContains = this.onActivityResized.contains(str);
        if (!zContains) {
            int i4 = IEngagementSignalsCallback + 61;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            this.newSession.onNavigationEvent(str);
        }
        transV2Init.onNavigationEvent(str);
        if (!zContains) {
            asBinder(str);
        }
        function1.invoke((Object) null);
        return null;
    }

    private final void asBinder(String str) {
        int i = 2 % 2;
        int i2 = warmup + 39;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2 = this.onTransact;
            if (maxFullscreenAdImplExternalSyntheticLambda2 != null) {
                int i3 = IEngagementSignalsCallback + 65;
                warmup = i3 % 128;
                int i4 = i3 % 2;
                if (maxFullscreenAdImplExternalSyntheticLambda2.onExtraCallbackWithResult()) {
                    int i5 = IEngagementSignalsCallback + 81;
                    warmup = i5 % 128;
                    if (i5 % 2 != 0) {
                        boolean zIAuthTabCallback = maxFullscreenAdImplExternalSyntheticLambda2.IAuthTabCallback("preloadService", access8100.onNavigationEvent(getWrite.IAuthTabCallback("serviceName", str)));
                        int i6 = 52 / 0;
                        if (!zIAuthTabCallback) {
                            return;
                        }
                    } else if (!maxFullscreenAdImplExternalSyntheticLambda2.IAuthTabCallback("preloadService", access8100.onNavigationEvent(getWrite.IAuthTabCallback("serviceName", str)))) {
                        return;
                    }
                    this.onActivityResized.add(str);
                    return;
                }
            }
            this.extraCallbackWithResult.add(str);
            return;
        }
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        int i = 2 % 2;
        MaxFullscreenAdImplExternalSyntheticLambda2 maxFullscreenAdImplExternalSyntheticLambda2 = oninterstitialaddisplayfailed.onTransact;
        Object obj = null;
        if (maxFullscreenAdImplExternalSyntheticLambda2 == null || oninterstitialaddisplayfailed.extraCallbackWithResult.isEmpty()) {
            return null;
        }
        List<String> list = CollectionsKt.toList(oninterstitialaddisplayfailed.extraCallbackWithResult);
        oninterstitialaddisplayfailed.extraCallbackWithResult.clear();
        for (String str : list) {
            if (!oninterstitialaddisplayfailed.onActivityResized.contains(str)) {
                int i2 = IEngagementSignalsCallback + 1;
                warmup = i2 % 128;
                int i3 = i2 % 2;
                if (maxFullscreenAdImplExternalSyntheticLambda2.IAuthTabCallback("preloadService", access8100.onNavigationEvent(getWrite.IAuthTabCallback("serviceName", str)))) {
                    oninterstitialaddisplayfailed.onActivityResized.add(str);
                    int i4 = warmup + 15;
                    IEngagementSignalsCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
        list.size();
        int i6 = warmup + 125;
        IEngagementSignalsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        Unit unit;
        ((Number) objArr[0]).longValue();
        int i = 2 % 2;
        int i2 = warmup + 99;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 5 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = warmup + 81;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) throws Throwable {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        onAppOpenAdHidden onappopenadhidden = (onAppOpenAdHidden) objArr[1];
        int i = 2 % 2;
        Object objOnWarmupCompleted = oninterstitialaddisplayfailed.onWarmupCompleted(new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda24
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 9;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(onInterstitialAdDisplayFailed.onExtraCallbackWithResult((onInterstitialAdDisplayFailed.IAuthTabCallback) obj));
                int i5 = IAuthTabCallback + 45;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 68 / 0;
                }
                return boolValueOf;
            }
        }, (Function1) objArr[2], oninterstitialaddisplayfailed.new onActivityLayout(onappopenadhidden, null), (access13800) objArr[3]);
        int i2 = warmup + 17;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return objOnWarmupCompleted;
    }

    private static final boolean onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = warmup + 47;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        boolean z = iAuthTabCallback instanceof IAuthTabCallback.onWarmupCompleted;
        int i4 = IEngagementSignalsCallback + 59;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static final class onActivityLayout extends SuspendLambda implements Function1<access13800<? super IAuthTabCallback>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ onAppOpenAdHidden $route;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onActivityLayout(onAppOpenAdHidden onappopenadhidden, access13800<? super onActivityLayout> access13800Var) {
            super(1, access13800Var);
            this.$route = onappopenadhidden;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityLayout onactivitylayout = onInterstitialAdDisplayFailed.this.new onActivityLayout(this.$route, access13800Var);
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
            return onactivitylayout;
        }

        public /* synthetic */ Object invoke(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            access13800<? super IAuthTabCallback> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                onExtraCallback(access13800Var);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(access13800Var);
            int i3 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super IAuthTabCallback> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = onInterstitialAdDisplayFailed.this;
            onAppOpenAdHidden onappopenadhidden = this.$route;
            this.label = 1;
            Object objOnExtraCallbackWithResult = onInterstitialAdDisplayFailed.onExtraCallbackWithResult(oninterstitialaddisplayfailed, onappopenadhidden, (access13800) this);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            int i7 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Function1 function1, Function1 function12, Function1 function13, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = warmup + 83;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 51;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    boolean zOnExtraCallbackWithResult = onInterstitialAdDisplayFailed.onExtraCallbackWithResult(obj2);
                    if (i7 == 0) {
                        Boolean.valueOf(zOnExtraCallbackWithResult);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(zOnExtraCallbackWithResult);
                    int i8 = IAuthTabCallback + 5;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return boolValueOf;
                }
            };
            int i5 = warmup + 25;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            function12 = new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 113;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnWarmupCompleted = onInterstitialAdDisplayFailed.onWarmupCompleted(((Long) obj2).longValue());
                    int i10 = IAuthTabCallback + 1;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnWarmupCompleted;
                }
            };
            int i7 = warmup + 113;
            IEngagementSignalsCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return oninterstitialaddisplayfailed.onWarmupCompleted(function1, function12, function13, access13800Var);
    }

    private static final Unit IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 117;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    static final class ICustomTabsCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Ref.BooleanRef $started;
        final /* synthetic */ Ref.LongRef $startedGeneration;
        int label;
        final /* synthetic */ onInterstitialAdDisplayFailed this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallbackStub(Ref.LongRef longRef, onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Ref.BooleanRef booleanRef, access13800<? super ICustomTabsCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$startedGeneration = longRef;
            this.this$0 = oninterstitialaddisplayfailed;
            this.$started = booleanRef;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackStub iCustomTabsCallbackStub = new ICustomTabsCallbackStub(this.$startedGeneration, this.this$0, this.$started, access13800Var);
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* renamed from: o.onInterstitialAdDisplayFailed$ICustomTabsCallbackStub$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ Ref.BooleanRef $started;
            final /* synthetic */ Ref.LongRef $startedGeneration;
            int label;
            final /* synthetic */ onInterstitialAdDisplayFailed this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Ref.LongRef longRef, onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Ref.BooleanRef booleanRef, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$startedGeneration = longRef;
                this.this$0 = oninterstitialaddisplayfailed;
                this.$started = booleanRef;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$startedGeneration, this.this$0, this.$started, access13800Var);
                int i2 = onExtraCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                if (i3 != 0) {
                    int i4 = 94 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass1Create.invokeSuspend(unit);
                }
                anonymousClass1Create.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 107;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                this.$startedGeneration.element = onInterstitialAdDisplayFailed.IAuthTabCallbackStubProxy(this.this$0).IAuthTabCallback();
                this.$started.element = true;
                onInterstitialAdDisplayFailed.onExtraCallbackWithResult(this.this$0);
                Unit unit = Unit.INSTANCE;
                int i3 = onExtraCallback + 81;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 54 / 0;
                }
                return unit;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$startedGeneration, this.this$0, this.$started, null);
                this.label = 1;
                if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i3 = onNavigationEvent + 87;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class onRelationshipValidationResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Ref.BooleanRef $awaitsSessionRegistration;
        final /* synthetic */ Function1<Long, Unit> $onEntryHeld;
        final /* synthetic */ Ref.LongRef $startedGeneration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onRelationshipValidationResult(Ref.LongRef longRef, Ref.BooleanRef booleanRef, Function1<? super Long, Unit> function1, access13800<? super onRelationshipValidationResult> access13800Var) {
            super(2, access13800Var);
            this.$startedGeneration = longRef;
            this.$awaitsSessionRegistration = booleanRef;
            this.$onEntryHeld = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onRelationshipValidationResult onrelationshipvalidationresult = onInterstitialAdDisplayFailed.this.new onRelationshipValidationResult(this.$startedGeneration, this.$awaitsSessionRegistration, this.$onEntryHeld, access13800Var);
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onrelationshipvalidationresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.onInterstitialAdDisplayFailed$onRelationshipValidationResult$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Ref.BooleanRef $awaitsSessionRegistration;
            final /* synthetic */ Function1<Long, Unit> $onEntryHeld;
            final /* synthetic */ Ref.LongRef $startedGeneration;
            int label;
            final /* synthetic */ onInterstitialAdDisplayFailed this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Ref.LongRef longRef, Ref.BooleanRef booleanRef, Function1<? super Long, Unit> function1, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = oninterstitialaddisplayfailed;
                this.$startedGeneration = longRef;
                this.$awaitsSessionRegistration = booleanRef;
                this.$onEntryHeld = function1;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$startedGeneration, this.$awaitsSessionRegistration, this.$onEntryHeld, access13800Var);
                int i2 = onWarmupCompleted + 101;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass4;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 109;
                onExtraCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onExtraCallback(findresandmsg, access13800Var);
                }
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 51;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Long lIAuthTabCallback = onInterstitialAdDisplayFailed.IAuthTabCallback(this.this$0, this.$startedGeneration.element, this.$awaitsSessionRegistration.element);
                Object obj2 = null;
                if (lIAuthTabCallback == null) {
                    return null;
                }
                int i2 = onWarmupCompleted + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                this.$onEntryHeld.invoke(lIAuthTabCallback);
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 107;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i3 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 88 / 0;
                }
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(onInterstitialAdDisplayFailed.this, this.$startedGeneration, this.$awaitsSessionRegistration, this.$onEntryHeld, null);
            this.label = 1;
            Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass4, this);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                return objOnExtraCallback;
            }
            int i5 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> Object onWarmupCompleted(Function1<? super T, Boolean> function1, Function1<? super Long, Unit> function12, Function1<? super access13800<? super T>, ? extends Object> function13, access13800<? super T> access13800Var) throws Throwable {
        ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy;
        Ref.BooleanRef booleanRef;
        Function1<? super T, Boolean> function14;
        Function1<? super Long, Unit> function15;
        Function1<? super access13800<? super T>, ? extends Object> function16;
        Ref.LongRef longRef;
        Ref.BooleanRef booleanRef2;
        UpdatePackageContent updatePackageContent;
        ICustomTabsCallbackStub iCustomTabsCallbackStub;
        Ref.LongRef longRef2;
        Ref.BooleanRef booleanRef3;
        Function1<? super T, Boolean> function17;
        Ref.BooleanRef booleanRef4;
        Ref.BooleanRef booleanRef5;
        Function1<? super Long, Unit> function18;
        Function1<? super access13800<? super T>, ? extends Object> function19;
        Ref.BooleanRef booleanRef6;
        Ref.LongRef longRef3;
        Throwable th;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 55;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof ICustomTabsCallbackStubProxy) {
            iCustomTabsCallbackStubProxy = (ICustomTabsCallbackStubProxy) access13800Var;
            int i4 = iCustomTabsCallbackStubProxy.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iCustomTabsCallbackStubProxy.label = i4 - 2147483648;
            } else {
                iCustomTabsCallbackStubProxy = new ICustomTabsCallbackStubProxy(access13800Var);
            }
        }
        ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy2 = iCustomTabsCallbackStubProxy;
        Object objInvoke = iCustomTabsCallbackStubProxy2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iCustomTabsCallbackStubProxy2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objInvoke);
            booleanRef = new Ref.BooleanRef();
            Ref.LongRef longRef4 = new Ref.LongRef();
            Ref.BooleanRef booleanRef7 = new Ref.BooleanRef();
            try {
                updatePackageContent = UpdatePackageContent.onExtraCallback;
                iCustomTabsCallbackStub = new ICustomTabsCallbackStub(longRef4, this, booleanRef, null);
                function14 = function1;
            } catch (Throwable th2) {
                th = th2;
                function14 = function1;
            }
            try {
                iCustomTabsCallbackStubProxy2.L$0 = function14;
                function15 = function12;
                try {
                    iCustomTabsCallbackStubProxy2.L$1 = function15;
                    function16 = function13;
                    try {
                        iCustomTabsCallbackStubProxy2.L$2 = function16;
                        iCustomTabsCallbackStubProxy2.L$3 = booleanRef;
                        iCustomTabsCallbackStubProxy2.L$4 = longRef4;
                        iCustomTabsCallbackStubProxy2.L$5 = booleanRef7;
                        iCustomTabsCallbackStubProxy2.label = 1;
                        if (maybeUpdateAnimatable.onExtraCallback(updatePackageContent, iCustomTabsCallbackStub, iCustomTabsCallbackStubProxy2) != objOnWarmupCompleted) {
                            longRef2 = longRef4;
                            booleanRef3 = booleanRef7;
                            iCustomTabsCallbackStubProxy2.L$0 = function14;
                            iCustomTabsCallbackStubProxy2.L$1 = function15;
                            iCustomTabsCallbackStubProxy2.L$2 = access15400.onNavigationEvent(function16);
                            iCustomTabsCallbackStubProxy2.L$3 = booleanRef;
                            iCustomTabsCallbackStubProxy2.L$4 = longRef2;
                            iCustomTabsCallbackStubProxy2.L$5 = booleanRef3;
                            iCustomTabsCallbackStubProxy2.label = 2;
                            objInvoke = function16.invoke(iCustomTabsCallbackStubProxy2);
                            if (objInvoke != objOnWarmupCompleted) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        longRef = longRef4;
                        booleanRef2 = booleanRef7;
                        function17 = function14;
                        booleanRef4 = booleanRef;
                        if (!booleanRef4.element) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    function16 = function13;
                    longRef = longRef4;
                    booleanRef2 = booleanRef7;
                    function17 = function14;
                    booleanRef4 = booleanRef;
                    if (!booleanRef4.element) {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                function15 = function12;
                function16 = function13;
                longRef = longRef4;
                booleanRef2 = booleanRef7;
                function17 = function14;
                booleanRef4 = booleanRef;
                if (!booleanRef4.element) {
                }
            }
            return objOnWarmupCompleted;
        }
        if (i5 == 1) {
            booleanRef3 = (Ref.BooleanRef) iCustomTabsCallbackStubProxy2.L$5;
            longRef2 = (Ref.LongRef) iCustomTabsCallbackStubProxy2.L$4;
            booleanRef = (Ref.BooleanRef) iCustomTabsCallbackStubProxy2.L$3;
            Function1<? super access13800<? super T>, ? extends Object> function110 = (Function1) iCustomTabsCallbackStubProxy2.L$2;
            Function1<? super Long, Unit> function111 = (Function1) iCustomTabsCallbackStubProxy2.L$1;
            function14 = (Function1) iCustomTabsCallbackStubProxy2.L$0;
            try {
                ResultKt.onNavigationEvent(objInvoke);
                function16 = function110;
                function15 = function111;
                try {
                    iCustomTabsCallbackStubProxy2.L$0 = function14;
                    iCustomTabsCallbackStubProxy2.L$1 = function15;
                    iCustomTabsCallbackStubProxy2.L$2 = access15400.onNavigationEvent(function16);
                    iCustomTabsCallbackStubProxy2.L$3 = booleanRef;
                    iCustomTabsCallbackStubProxy2.L$4 = longRef2;
                    iCustomTabsCallbackStubProxy2.L$5 = booleanRef3;
                    iCustomTabsCallbackStubProxy2.label = 2;
                    objInvoke = function16.invoke(iCustomTabsCallbackStubProxy2);
                    if (objInvoke != objOnWarmupCompleted) {
                        booleanRef5 = booleanRef;
                        function18 = function15;
                        function19 = function16;
                        booleanRef6 = booleanRef3;
                        longRef3 = longRef2;
                        booleanRef6.element = ((Boolean) function14.invoke(objInvoke)).booleanValue();
                        if (booleanRef5.element) {
                        }
                        return objInvoke;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    booleanRef2 = booleanRef3;
                    longRef = longRef2;
                    function17 = function14;
                    booleanRef4 = booleanRef;
                    if (!booleanRef4.element) {
                        throw th;
                    }
                    UpdatePackageContent updatePackageContent2 = UpdatePackageContent.onExtraCallback;
                    onRelationshipValidationResult onrelationshipvalidationresult = new onRelationshipValidationResult(longRef, booleanRef2, function15, null);
                    iCustomTabsCallbackStubProxy2.L$0 = access15400.onNavigationEvent(function17);
                    iCustomTabsCallbackStubProxy2.L$1 = access15400.onNavigationEvent(function15);
                    iCustomTabsCallbackStubProxy2.L$2 = access15400.onNavigationEvent(function16);
                    iCustomTabsCallbackStubProxy2.L$3 = access15400.onNavigationEvent(booleanRef4);
                    iCustomTabsCallbackStubProxy2.L$4 = access15400.onNavigationEvent(longRef);
                    iCustomTabsCallbackStubProxy2.L$5 = access15400.onNavigationEvent(booleanRef2);
                    iCustomTabsCallbackStubProxy2.L$6 = th;
                    iCustomTabsCallbackStubProxy2.label = 4;
                    if (maybeUpdateAnimatable.onExtraCallback(updatePackageContent2, onrelationshipvalidationresult, iCustomTabsCallbackStubProxy2) != objOnWarmupCompleted) {
                        th = th;
                        int i6 = warmup + 113;
                        IEngagementSignalsCallback = i6 % 128;
                        int i7 = i6 % 2;
                        throw th;
                    }
                    return objOnWarmupCompleted;
                }
            } catch (Throwable th7) {
                th = th7;
                booleanRef2 = booleanRef3;
                longRef = longRef2;
                function16 = function110;
                function15 = function111;
                function17 = function14;
                booleanRef4 = booleanRef;
                if (!booleanRef4.element) {
                }
            }
            return objOnWarmupCompleted;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                Object obj = iCustomTabsCallbackStubProxy2.L$7;
                ResultKt.onNavigationEvent(objInvoke);
                return obj;
            }
            int i8 = warmup + 35;
            IEngagementSignalsCallback = i8 % 128;
            if (i8 % 2 != 0 ? i5 != 4 : i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) iCustomTabsCallbackStubProxy2.L$6;
            ResultKt.onNavigationEvent(objInvoke);
            int i62 = warmup + 113;
            IEngagementSignalsCallback = i62 % 128;
            int i72 = i62 % 2;
            throw th;
        }
        Ref.BooleanRef booleanRef8 = (Ref.BooleanRef) iCustomTabsCallbackStubProxy2.L$5;
        Ref.LongRef longRef5 = (Ref.LongRef) iCustomTabsCallbackStubProxy2.L$4;
        Ref.BooleanRef booleanRef9 = (Ref.BooleanRef) iCustomTabsCallbackStubProxy2.L$3;
        Function1<? super access13800<? super T>, ? extends Object> function112 = (Function1) iCustomTabsCallbackStubProxy2.L$2;
        Function1<? super Long, Unit> function113 = (Function1) iCustomTabsCallbackStubProxy2.L$1;
        function14 = (Function1) iCustomTabsCallbackStubProxy2.L$0;
        try {
            ResultKt.onNavigationEvent(objInvoke);
            booleanRef6 = booleanRef8;
            longRef3 = longRef5;
            booleanRef5 = booleanRef9;
            function19 = function112;
            function18 = function113;
            try {
                booleanRef6.element = ((Boolean) function14.invoke(objInvoke)).booleanValue();
            } catch (Throwable th8) {
                th = th8;
                function17 = function14;
                booleanRef8 = booleanRef6;
                longRef5 = longRef3;
                booleanRef9 = booleanRef5;
                booleanRef2 = booleanRef8;
                longRef = longRef5;
                booleanRef4 = booleanRef9;
                function16 = function19;
                function15 = function18;
                if (!booleanRef4.element) {
                }
            }
        } catch (Throwable th9) {
            th = th9;
            function19 = function112;
            function18 = function113;
            function17 = function14;
            booleanRef2 = booleanRef8;
            longRef = longRef5;
            booleanRef4 = booleanRef9;
            function16 = function19;
            function15 = function18;
            if (!booleanRef4.element) {
            }
        }
        if (booleanRef5.element) {
            UpdatePackageContent updatePackageContent3 = UpdatePackageContent.onExtraCallback;
            onRelationshipValidationResult onrelationshipvalidationresult2 = new onRelationshipValidationResult(longRef3, booleanRef6, function18, null);
            iCustomTabsCallbackStubProxy2.L$0 = access15400.onNavigationEvent(function14);
            iCustomTabsCallbackStubProxy2.L$1 = access15400.onNavigationEvent(function18);
            iCustomTabsCallbackStubProxy2.L$2 = access15400.onNavigationEvent(function19);
            iCustomTabsCallbackStubProxy2.L$3 = access15400.onNavigationEvent(booleanRef5);
            iCustomTabsCallbackStubProxy2.L$4 = access15400.onNavigationEvent(longRef3);
            iCustomTabsCallbackStubProxy2.L$5 = access15400.onNavigationEvent(booleanRef6);
            iCustomTabsCallbackStubProxy2.L$6 = access15400.onNavigationEvent(objInvoke);
            iCustomTabsCallbackStubProxy2.L$7 = objInvoke;
            iCustomTabsCallbackStubProxy2.label = 3;
            if (maybeUpdateAnimatable.onExtraCallback(updatePackageContent3, onrelationshipvalidationresult2, iCustomTabsCallbackStubProxy2) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return objInvoke;
    }

    private final Long onWarmupCompleted(long j, boolean z) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 29;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            Long lOnExtraCallbackWithResult = this.onUnminimized.onExtraCallbackWithResult(j, z);
            if (lOnExtraCallbackWithResult != null) {
                final long jLongValue = lOnExtraCallbackWithResult.longValue();
                this.writeTypedObject.postDelayed(new Runnable() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 75;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            onInterstitialAdDisplayFailed.onNavigationEvent(this.f$0, jLongValue);
                            int i5 = 47 / 0;
                        } else {
                            onInterstitialAdDisplayFailed.onNavigationEvent(this.f$0, jLongValue);
                        }
                        int i6 = IAuthTabCallback + 53;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }, 10000L);
                return lOnExtraCallbackWithResult;
            }
            int i3 = IEngagementSignalsCallback + 35;
            warmup = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 46 / 0;
            }
            return null;
        }
        this.onUnminimized.onExtraCallbackWithResult(j, z);
        throw null;
    }

    private static final void onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, long j) {
        Object obj;
        int i = 2 % 2;
        int i2 = warmup + 75;
        IEngagementSignalsCallback = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Result.Companion companion = Result.Companion;
                oninterstitialaddisplayfailed.onNavigationEvent(j, "hold_timeout");
                obj = Result.constructor-impl(Unit.INSTANCE);
                int i3 = 24 / 0;
            } else {
                Result.Companion companion2 = Result.Companion;
                oninterstitialaddisplayfailed.onNavigationEvent(j, "hold_timeout");
                obj = Result.constructor-impl(Unit.INSTANCE);
            }
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            oninterstitialaddisplayfailed.onNavigationEvent(j, "hold_timeout", th2);
            int i4 = IEngagementSignalsCallback + 87;
            warmup = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 5;
            }
        }
    }

    public final void onExtraCallback(long j) {
        Object obj;
        int i = 2 % 2;
        int i2 = warmup + 91;
        IEngagementSignalsCallback = i2 % 128;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 == 0) {
            Result.Companion companion2 = Result.Companion;
            onNavigationEvent(j, "entry_abandoned");
            Result.constructor-impl(Unit.INSTANCE);
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        onNavigationEvent(j, "entry_abandoned");
        obj = Result.constructor-impl(Unit.INSTANCE);
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i3 = warmup + 17;
            IEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent(j, "entry_abandoned", th2);
            int i5 = warmup + 19;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final void onNavigationEvent(long j, String str, Throwable th) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GranitePortalRuntime", "portal_runtime_entry_hold_release_failed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("trigger", str), getWrite.IAuthTabCallback("errorClass", th.getClass().getSimpleName())}), (String) null, false, (String) null, 56, (Object) null);
        int i2 = IEngagementSignalsCallback + 39;
        warmup = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(long j, String str) {
        boolean z;
        int i = 2 % 2;
        boolean zIAuthTabCallbackDefault = this.access100.IAuthTabCallbackDefault();
        int iIntValue = ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        onAdViewAdClicked onadviewadclickedOnNavigationEvent = this.onUnminimized.onNavigationEvent(j, this.prefetchWithMultipleUrls.size(), zIAuthTabCallbackDefault);
        int iIntValue2 = ((Integer) onAppOpenAdClicked.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{this.onUnminimized}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        boolean z2 = iIntValue2 < iIntValue;
        onAdViewAdClicked onadviewadclicked = onAdViewAdClicked.SCHEDULE;
        if (onadviewadclickedOnNavigationEvent == onadviewadclicked) {
            asInterface(str);
        }
        if (zIAuthTabCallbackDefault) {
            int i2 = IEngagementSignalsCallback + 43;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                this.onUnminimized.onWarmupCompleted().onExtraCallbackWithResult();
                throw null;
            }
            if (this.onUnminimized.onWarmupCompleted().onExtraCallbackWithResult()) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("trigger", str);
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("removed", Boolean.valueOf(z2));
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("heldEntries", Integer.valueOf(iIntValue2));
                if (onadviewadclickedOnNavigationEvent == onadviewadclicked) {
                    int i3 = IEngagementSignalsCallback + 77;
                    warmup = i3 % 128;
                    z = i3 % 2 == 0;
                }
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "GranitePortalRuntime", "portal_runtime_entry_hold_released", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("rescheduled", Boolean.valueOf(z))}), (String) null, false, (String) null, 56, (Object) null);
            }
        }
    }

    static final class onMinimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onMinimized onminimized = onInterstitialAdDisplayFailed.this.new onMinimized(access13800Var);
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onminimized;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onWarmupCompleted = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Boolean> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 69;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            return o.access14000.onNavigationEvent(r4.this$0.getInterfaceDescriptor());
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        
            r2 = r2 + 111;
            o.onInterstitialAdDisplayFailed.onMinimized.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
            kotlin.ResultKt.onNavigationEvent(r5);
            r4.this$0.access100();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 6 / 0;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0392 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113 A[Catch: Exception -> 0x0273, WebResourceResponseModel -> 0x0275, CancellationException -> 0x0289, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x0289, blocks: (B:16:0x005e, B:78:0x0211, B:79:0x0216, B:81:0x021d, B:82:0x0220, B:25:0x0084, B:71:0x01d3, B:73:0x01d7, B:83:0x0221, B:84:0x024a, B:32:0x00a5, B:60:0x014d, B:63:0x0155, B:68:0x0166, B:86:0x024d, B:87:0x025a, B:88:0x025b, B:89:0x0260, B:39:0x00bf, B:54:0x010b, B:56:0x0113, B:90:0x0261, B:91:0x0272, B:46:0x00d4, B:48:0x00e5), top: B:150:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155 A[Catch: Exception -> 0x00ad, WebResourceResponseModel -> 0x00b0, CancellationException -> 0x0289, TRY_ENTER, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x0289, blocks: (B:16:0x005e, B:78:0x0211, B:79:0x0216, B:81:0x021d, B:82:0x0220, B:25:0x0084, B:71:0x01d3, B:73:0x01d7, B:83:0x0221, B:84:0x024a, B:32:0x00a5, B:60:0x014d, B:63:0x0155, B:68:0x0166, B:86:0x024d, B:87:0x025a, B:88:0x025b, B:89:0x0260, B:39:0x00bf, B:54:0x010b, B:56:0x0113, B:90:0x0261, B:91:0x0272, B:46:0x00d4, B:48:0x00e5), top: B:150:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7 A[Catch: Exception -> 0x00ad, WebResourceResponseModel -> 0x00b0, CancellationException -> 0x0289, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x0289, blocks: (B:16:0x005e, B:78:0x0211, B:79:0x0216, B:81:0x021d, B:82:0x0220, B:25:0x0084, B:71:0x01d3, B:73:0x01d7, B:83:0x0221, B:84:0x024a, B:32:0x00a5, B:60:0x014d, B:63:0x0155, B:68:0x0166, B:86:0x024d, B:87:0x025a, B:88:0x025b, B:89:0x0260, B:39:0x00bf, B:54:0x010b, B:56:0x0113, B:90:0x0261, B:91:0x0272, B:46:0x00d4, B:48:0x00e5), top: B:150:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0221 A[Catch: Exception -> 0x00ad, WebResourceResponseModel -> 0x00b0, CancellationException -> 0x0289, TryCatch #12 {CancellationException -> 0x0289, blocks: (B:16:0x005e, B:78:0x0211, B:79:0x0216, B:81:0x021d, B:82:0x0220, B:25:0x0084, B:71:0x01d3, B:73:0x01d7, B:83:0x0221, B:84:0x024a, B:32:0x00a5, B:60:0x014d, B:63:0x0155, B:68:0x0166, B:86:0x024d, B:87:0x025a, B:88:0x025b, B:89:0x0260, B:39:0x00bf, B:54:0x010b, B:56:0x0113, B:90:0x0261, B:91:0x0272, B:46:0x00d4, B:48:0x00e5), top: B:150:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0261 A[Catch: Exception -> 0x0273, WebResourceResponseModel -> 0x0275, CancellationException -> 0x0289, TRY_ENTER, TryCatch #12 {CancellationException -> 0x0289, blocks: (B:16:0x005e, B:78:0x0211, B:79:0x0216, B:81:0x021d, B:82:0x0220, B:25:0x0084, B:71:0x01d3, B:73:0x01d7, B:83:0x0221, B:84:0x024a, B:32:0x00a5, B:60:0x014d, B:63:0x0155, B:68:0x0166, B:86:0x024d, B:87:0x025a, B:88:0x025b, B:89:0x0260, B:39:0x00bf, B:54:0x010b, B:56:0x0113, B:90:0x0261, B:91:0x0272, B:46:0x00d4, B:48:0x00e5), top: B:150:0x0037 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(onAppOpenAdHidden onappopenadhidden, access13800<? super IAuthTabCallback> access13800Var) throws NoWhenBranchMatchedException {
        onMessageChannelReady onmessagechannelready;
        onAppOpenAdHidden onappopenadhidden2;
        onAppOpenAdHidden onappopenadhidden3;
        setPatch setpatchOnExtraCallback;
        onMinimized onminimized;
        onMessageChannelReady onmessagechannelready2;
        int i;
        int i2;
        boolean zBooleanValue;
        onMessageChannelReady onmessagechannelready3;
        int i3;
        int i4;
        boolean z;
        onAppOpenAdHidden onappopenadhidden4;
        transGetKmCert transgetkmcertIAuthTabCallbackDefault;
        onAppOpenAdDisplayed onappopenaddisplayed;
        boolean z2;
        IAuthTabCallback.onWarmupCompleted onwarmupcompleted;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        Object obj;
        Throwable th;
        String strOnWarmupCompleted;
        Object obj2;
        int i5 = 2 % 2;
        if (access13800Var instanceof onMessageChannelReady) {
            onmessagechannelready = (onMessageChannelReady) access13800Var;
            int i6 = onmessagechannelready.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                int i7 = IEngagementSignalsCallback + 111;
                warmup = i7 % 128;
                int i8 = i7 % 2;
                onmessagechannelready.label = i6 - 2147483648;
            } else {
                onmessagechannelready = new onMessageChannelReady(access13800Var);
            }
        }
        Object objOnExtraCallback = onmessagechannelready.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = onmessagechannelready.label;
        String strOnExtraCallbackWithResult = null;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    i = onmessagechannelready.I$1;
                    int i10 = onmessagechannelready.I$0;
                    onMessageChannelReady onmessagechannelready4 = (access13800) onmessagechannelready.L$1;
                    onAppOpenAdHidden onappopenadhidden5 = (onAppOpenAdHidden) onmessagechannelready.L$0;
                    try {
                        ResultKt.onNavigationEvent(objOnExtraCallback);
                        i2 = i10;
                        onappopenadhidden2 = onappopenadhidden5;
                        onmessagechannelready2 = onmessagechannelready4;
                        zBooleanValue = ((Boolean) objOnExtraCallback).booleanValue();
                        if (!zBooleanValue) {
                            throw new asInterface("runtime_entry_closed", "Portal runtime is tearing down or terminally failed", null, 4, null);
                        }
                        onmessagechannelready.L$0 = onappopenadhidden2;
                        onmessagechannelready.L$1 = access15400.onNavigationEvent(onmessagechannelready2);
                        onmessagechannelready.I$0 = i2;
                        onmessagechannelready.I$1 = i;
                        onmessagechannelready.Z$0 = zBooleanValue;
                        onmessagechannelready.label = 2;
                        Object objIAuthTabCallback = IAuthTabCallback(-1040637423, new Object[]{this, onmessagechannelready}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1040637449);
                        Object obj3 = objIAuthTabCallback;
                        if (objIAuthTabCallback != objOnWarmupCompleted) {
                            onappopenadhidden3 = onappopenadhidden2;
                            onmessagechannelready3 = onmessagechannelready2;
                            i3 = i2;
                            i4 = i;
                            z = zBooleanValue;
                            transgetkmcertIAuthTabCallbackDefault = IAuthTabCallbackDefault(this);
                            if (transgetkmcertIAuthTabCallbackDefault instanceof transGetKmCert.onNavigationEvent) {
                            }
                        }
                        return objOnWarmupCompleted;
                    } catch (WebResourceResponseModel e) {
                        e = e;
                        onappopenadhidden4 = onappopenadhidden5;
                        Result.Companion companion = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(e));
                        onappopenadhidden3 = onappopenadhidden4;
                        th = Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                        }
                    } catch (Exception e2) {
                        e = e2;
                        onappopenadhidden4 = onappopenadhidden5;
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(e));
                        onappopenadhidden3 = onappopenadhidden4;
                        th = Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                        }
                    }
                } else if (i9 != 2) {
                    int i11 = IEngagementSignalsCallback + 33;
                    warmup = i11 % 128;
                    int i12 = i11 % 2;
                    if (i9 == 3) {
                        boolean z3 = onmessagechannelready.Z$0;
                        i4 = onmessagechannelready.I$1;
                        i3 = onmessagechannelready.I$0;
                        onAppOpenAdDisplayed onappopenaddisplayed2 = (onAppOpenAdDisplayed) onmessagechannelready.L$2;
                        onmessagechannelready3 = (access13800) onmessagechannelready.L$1;
                        onAppOpenAdHidden onappopenadhidden6 = (onAppOpenAdHidden) onmessagechannelready.L$0;
                        try {
                            ResultKt.onNavigationEvent(objOnExtraCallback);
                            z2 = z3;
                            onappopenaddisplayed = onappopenaddisplayed2;
                            onappopenadhidden3 = onappopenadhidden6;
                            if (objOnExtraCallback == onAppOpenAdDisplayed.onNavigationEvent.PRODUCTION) {
                                throw new asInterface("metro_mismatch", "Portal runtime was initialized from CDN but " + onappopenadhidden3.IAuthTabCallback() + " resolved to Metro", null, 4, null);
                            }
                            onWarmupCompleted(this, onappopenaddisplayed);
                            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjniICustomTabsCallback = ICustomTabsCallback(this);
                            onmessagechannelready.L$0 = onappopenadhidden3;
                            onmessagechannelready.L$1 = access15400.onNavigationEvent(onmessagechannelready3);
                            onmessagechannelready.L$2 = onappopenaddisplayed;
                            onmessagechannelready.L$3 = jni_ygnodestylegetflexbasisjniICustomTabsCallback;
                            onmessagechannelready.L$4 = access15400.onNavigationEvent(onmessagechannelready);
                            onmessagechannelready.I$0 = i3;
                            onmessagechannelready.I$1 = i4;
                            onmessagechannelready.Z$0 = z2;
                            onmessagechannelready.I$2 = 0;
                            onmessagechannelready.label = 4;
                            if (jni_ygnodestylegetflexbasisjniICustomTabsCallback.IAuthTabCallback((Object) null, onmessagechannelready) != objOnWarmupCompleted) {
                                jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjniICustomTabsCallback;
                                getInterfaceDescriptor(this).put(onappopenadhidden3.IAuthTabCallback(), onappopenaddisplayed);
                                Unit unit = Unit.INSTANCE;
                                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                                onwarmupcompleted = IAuthTabCallback.onWarmupCompleted.onExtraCallback;
                            }
                            return objOnWarmupCompleted;
                        } catch (Exception e3) {
                            e = e3;
                            onappopenadhidden4 = onappopenadhidden6;
                            Result.Companion companion22 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(e));
                            onappopenadhidden3 = onappopenadhidden4;
                            th = Result.exceptionOrNull-impl(obj);
                            if (th != null) {
                            }
                        } catch (WebResourceResponseModel e4) {
                            e = e4;
                            onappopenadhidden4 = onappopenadhidden6;
                            Result.Companion companion3 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(e));
                            onappopenadhidden3 = onappopenadhidden4;
                            th = Result.exceptionOrNull-impl(obj);
                            if (th != null) {
                            }
                        }
                    } else {
                        if (i9 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) onmessagechannelready.L$3;
                        onappopenaddisplayed = (onAppOpenAdDisplayed) onmessagechannelready.L$2;
                        onappopenadhidden4 = (onAppOpenAdHidden) onmessagechannelready.L$0;
                        try {
                            ResultKt.onNavigationEvent(objOnExtraCallback);
                            onappopenadhidden3 = onappopenadhidden4;
                            try {
                                getInterfaceDescriptor(this).put(onappopenadhidden3.IAuthTabCallback(), onappopenaddisplayed);
                                Unit unit2 = Unit.INSTANCE;
                                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                                onwarmupcompleted = IAuthTabCallback.onWarmupCompleted.onExtraCallback;
                            } catch (Throwable th2) {
                                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                                throw th2;
                            }
                        } catch (WebResourceResponseModel e5) {
                            e = e5;
                            Result.Companion companion32 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(e));
                            onappopenadhidden3 = onappopenadhidden4;
                            th = Result.exceptionOrNull-impl(obj);
                            if (th != null) {
                            }
                        } catch (Exception e6) {
                            e = e6;
                            Result.Companion companion222 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(e));
                            onappopenadhidden3 = onappopenadhidden4;
                            th = Result.exceptionOrNull-impl(obj);
                            if (th != null) {
                            }
                        }
                    }
                } else {
                    z = onmessagechannelready.Z$0;
                    int i13 = onmessagechannelready.I$1;
                    int i14 = onmessagechannelready.I$0;
                    onMessageChannelReady onmessagechannelready5 = (access13800) onmessagechannelready.L$1;
                    onappopenadhidden3 = (onAppOpenAdHidden) onmessagechannelready.L$0;
                    try {
                        ResultKt.onNavigationEvent(objOnExtraCallback);
                        onmessagechannelready3 = onmessagechannelready5;
                        i3 = i14;
                        i4 = i13;
                        transgetkmcertIAuthTabCallbackDefault = IAuthTabCallbackDefault(this);
                        if (transgetkmcertIAuthTabCallbackDefault instanceof transGetKmCert.onNavigationEvent) {
                            if (!(transgetkmcertIAuthTabCallbackDefault instanceof transGetKmCert.onWarmupCompleted)) {
                                if (transgetkmcertIAuthTabCallbackDefault == null) {
                                    throw new asInterface("not_initialized", "Portal controller bundle source is not initialized", null, 4, null);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            int i15 = IEngagementSignalsCallback + 99;
                            warmup = i15 % 128;
                            int i16 = i15 % 2;
                            onAppOpenAdDisplayed onappopenaddisplayed3 = (onAppOpenAdDisplayed) IAuthTabCallback(1336963396, new Object[]{this, onappopenadhidden3.IAuthTabCallback(), onappopenadhidden3.onExtraCallbackWithResult()}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1336963367);
                            onmessagechannelready.L$0 = onappopenadhidden3;
                            onmessagechannelready.L$1 = access15400.onNavigationEvent(onmessagechannelready3);
                            onmessagechannelready.L$2 = onappopenaddisplayed3;
                            onmessagechannelready.I$0 = i3;
                            onmessagechannelready.I$1 = i4;
                            onmessagechannelready.Z$0 = z;
                            onmessagechannelready.label = 3;
                            Object objOnWarmupCompleted2 = onAppOpenAdDisplayed.onWarmupCompleted(2115256031, new Object[]{onappopenaddisplayed3, onmessagechannelready}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -2115256028);
                            Object obj4 = objOnWarmupCompleted2;
                            if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                                int i17 = warmup + 43;
                                IEngagementSignalsCallback = i17 % 128;
                                int i18 = i17 % 2;
                                boolean z4 = z;
                                onappopenaddisplayed = onappopenaddisplayed3;
                                objOnExtraCallback = objOnWarmupCompleted2;
                                z2 = z4;
                                if (objOnExtraCallback == onAppOpenAdDisplayed.onNavigationEvent.PRODUCTION) {
                                }
                            }
                            return objOnWarmupCompleted;
                        }
                        onwarmupcompleted = IAuthTabCallback.onWarmupCompleted.onExtraCallback;
                    } catch (Exception e7) {
                        e = e7;
                        onappopenadhidden4 = onappopenadhidden3;
                        Result.Companion companion2222 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(e));
                        onappopenadhidden3 = onappopenadhidden4;
                        th = Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                        }
                    } catch (WebResourceResponseModel e8) {
                        e = e8;
                        onappopenadhidden4 = onappopenadhidden3;
                        Result.Companion companion322 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(e));
                        onappopenadhidden3 = onappopenadhidden4;
                        th = Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                        }
                    }
                }
                onappopenadhidden3 = onappopenadhidden4;
                th = Result.exceptionOrNull-impl(obj);
                if (th != null) {
                    return obj;
                }
                int i19 = IEngagementSignalsCallback + 87;
                int i20 = i19 % 128;
                warmup = i20;
                if (i19 % 2 != 0) {
                    boolean z5 = th instanceof asInterface;
                    throw null;
                }
                asInterface asinterface = th instanceof asInterface ? (asInterface) th : null;
                if (asinterface != null) {
                    int i21 = i20 + 7;
                    IEngagementSignalsCallback = i21 % 128;
                    if (i21 % 2 == 0) {
                        strOnWarmupCompleted = asinterface.onWarmupCompleted();
                        int i22 = 18 / 0;
                        if (strOnWarmupCompleted == null) {
                            strOnWarmupCompleted = "prepare_error";
                        }
                    } else {
                        strOnWarmupCompleted = asinterface.onWarmupCompleted();
                        if (strOnWarmupCompleted == null) {
                        }
                    }
                }
                String name = th.getClass().getName();
                onappopenadhidden3.IAuthTabCallback();
                try {
                    Result.Companion companion4 = Result.Companion;
                    r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs = r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs.onWarmupCompleted;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("serviceName", onappopenadhidden3.IAuthTabCallback());
                    Object[] objArr = new Object[1];
                    a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47833), objArr);
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strOnWarmupCompleted);
                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("reasonDetail", name);
                    if (asinterface != null) {
                        int i23 = warmup + 111;
                        IEngagementSignalsCallback = i23 % 128;
                        if (i23 % 2 == 0) {
                            asinterface.onExtraCallbackWithResult();
                            throw null;
                        }
                        strOnExtraCallbackWithResult = asinterface.onExtraCallbackWithResult();
                    }
                    r8lambdaxc7xafnircae5ge7mvkfmdsqbs.IAuthTabCallback("mono_hermes_service_failed", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("requiredSharedDeployedAt", strOnExtraCallbackWithResult), getWrite.IAuthTabCallback("runningSharedDeployedAt", this.ICustomTabsCallback_Parcel)}));
                    obj2 = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion5 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
                }
                Throwable th4 = Result.exceptionOrNull-impl(obj2);
                if (th4 != null) {
                    int i24 = warmup + 63;
                    IEngagementSignalsCallback = i24 % 128;
                    if (i24 % 2 == 0) {
                        onNavigationEvent("mono_hermes_service_failed", th4);
                        int i25 = 18 / 0;
                    } else {
                        onNavigationEvent("mono_hermes_service_failed", th4);
                    }
                }
                return new IAuthTabCallback.onExtraCallbackWithResult(strOnWarmupCompleted, name);
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            try {
                Result.Companion companion6 = Result.Companion;
                setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                onminimized = new onMinimized(null);
                onappopenadhidden2 = onappopenadhidden;
            } catch (WebResourceResponseModel e9) {
                e = e9;
                onappopenadhidden2 = onappopenadhidden;
            } catch (Exception e10) {
                e = e10;
                onappopenadhidden2 = onappopenadhidden;
            }
            try {
                onmessagechannelready.L$0 = onappopenadhidden2;
                onmessagechannelready.L$1 = access15400.onNavigationEvent(onmessagechannelready);
                onmessagechannelready.I$0 = 0;
                onmessagechannelready.I$1 = 0;
                onmessagechannelready.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, onminimized, onmessagechannelready);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    int i26 = IEngagementSignalsCallback + 43;
                    warmup = i26 % 128;
                    if (i26 % 2 != 0) {
                        onmessagechannelready2 = onmessagechannelready;
                        i2 = 1;
                        i = 0;
                    } else {
                        onmessagechannelready2 = onmessagechannelready;
                        i = 0;
                        i2 = 0;
                    }
                    zBooleanValue = ((Boolean) objOnExtraCallback).booleanValue();
                    if (!zBooleanValue) {
                    }
                }
                return objOnWarmupCompleted;
            } catch (Exception e11) {
                e = e11;
                onappopenadhidden3 = onappopenadhidden2;
                onappopenadhidden4 = onappopenadhidden3;
                Result.Companion companion22222 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(e));
                onappopenadhidden3 = onappopenadhidden4;
                th = Result.exceptionOrNull-impl(obj);
                if (th != null) {
                }
            } catch (WebResourceResponseModel e12) {
                e = e12;
                onappopenadhidden3 = onappopenadhidden2;
                onappopenadhidden4 = onappopenadhidden3;
                Result.Companion companion3222 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(e));
                onappopenadhidden3 = onappopenadhidden4;
                th = Result.exceptionOrNull-impl(obj);
                if (th != null) {
                }
            }
            obj = Result.constructor-impl(onwarmupcompleted);
            th = Result.exceptionOrNull-impl(obj);
            if (th != null) {
            }
        } catch (CancellationException e13) {
            throw e13;
        }
    }

    public static abstract class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onWarmupCompleted extends IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 113;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 89 / 0;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
            
                if ((!(r6 instanceof o.onInterstitialAdDisplayFailed.IAuthTabCallback.onWarmupCompleted)) == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r1 = r1 + 11;
                o.onInterstitialAdDisplayFailed.IAuthTabCallback.onWarmupCompleted.onWarmupCompleted = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 13;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 81 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 83;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 85;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return -1436030754;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 21;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "Ready";
            }

            private onWarmupCompleted() {
                super(null);
            }
        }

        private IAuthTabCallback() {
        }

        public static final class onExtraCallbackWithResult extends IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            private final String onExtraCallback;
            private final String onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    int i5 = i2 + 105;
                    onExtraCallbackWithResult = i5 % 128;
                    return i5 % 2 == 0;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    return false;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                    return true;
                }
                int i6 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = this.onNavigationEvent.hashCode();
                String str = this.onExtraCallback;
                if (str == null) {
                    int i2 = IAuthTabCallback + 29;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                int i4 = (iHashCode2 * 31) + iHashCode;
                int i5 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Unavailable(reason=" + this.onNavigationEvent + ", reasonDetail=" + this.onExtraCallback + ")";
                int i2 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(@NotNull String str, @Nullable String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.onNavigationEvent = str;
                this.onExtraCallback = str2;
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String str = this.onNavigationEvent;
                if (i3 != 0) {
                    int i4 = 41 / 0;
                }
                return str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onExtraCallback;
                }
                throw null;
            }
        }
    }

    static final class asInterface extends IllegalStateException {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String reason;
        private final String requiredSharedDeployedAt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            super(str2);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.reason = str;
            this.requiredSharedDeployedAt = str3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ asInterface(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                int i2 = onNavigationEvent + 27;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i3 = 2 % 2;
                str3 = null;
            }
            this(str, str2, str3);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.reason;
            int i5 = i2 + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.requiredSharedDeployedAt;
            int i5 = i3 + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r1) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        r3 = o.onInterstitialAdDisplayFailed.IEngagementSignalsCallback + 119;
        o.onInterstitialAdDisplayFailed.warmup = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, "00000000000000") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (r2.compareTo(r1) < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
    
        throw new o.onInterstitialAdDisplayFailed.asInterface("shared_too_old", "The running Portal shared bundle (" + r2 + ") is older than " + r1 + " required by " + r12.onNavigationEvent(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b6, code lost:
    
        r12 = o.onInterstitialAdDisplayFailed.IEngagementSignalsCallback + 81;
        o.onInterstitialAdDisplayFailed.warmup = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        throw new o.onInterstitialAdDisplayFailed.asInterface("not_initialized", "Running Portal shared deployment is unavailable", null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r2 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(onAppOpenAdDisplayed onappopenaddisplayed) {
        String strAsInterface;
        String str;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 27;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            strAsInterface = ((MaxFullscreenAdImpl.onExtraCallbackWithResult) IAuthTabCallback(-1603384154, new Object[]{this, onappopenaddisplayed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1603384166)).onExtraCallbackWithResult().asInterface();
            str = this.ICustomTabsCallback_Parcel;
            int i3 = 28 / 0;
        } else {
            strAsInterface = ((MaxFullscreenAdImpl.onExtraCallbackWithResult) IAuthTabCallback(-1603384154, new Object[]{this, onappopenaddisplayed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1603384166)).onExtraCallbackWithResult().asInterface();
            str = this.ICustomTabsCallback_Parcel;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        onAppOpenAdDisplayed onappopenaddisplayed = (onAppOpenAdDisplayed) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 107;
        IEngagementSignalsCallback = i2 % 128;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = null;
        if (i2 % 2 == 0) {
            boolean z = onappopenaddisplayed.IAuthTabCallback() instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult;
            onextracallbackwithresult.hashCode();
            throw null;
        }
        MaxFullscreenAdImpl maxFullscreenAdImplIAuthTabCallback = onappopenaddisplayed.IAuthTabCallback();
        if (maxFullscreenAdImplIAuthTabCallback instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
            onextracallbackwithresult = (MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImplIAuthTabCallback;
            int i3 = IEngagementSignalsCallback + 85;
            warmup = i3 % 128;
            int i4 = i3 % 2;
        }
        if (onextracallbackwithresult != null) {
            return onextracallbackwithresult;
        }
        throw new IllegalStateException(("Portal service bundle was not loaded: " + onappopenaddisplayed.onNavigationEvent()).toString());
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6 = (MaxFullscreenAdImplExternalSyntheticLambda6) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 81;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = null;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = maxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted();
        if (i3 != 0) {
            boolean z = onextracallbackwithresultOnWarmupCompleted instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult;
            onextracallbackwithresult.hashCode();
            throw null;
        }
        if (onextracallbackwithresultOnWarmupCompleted instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
            int i4 = warmup;
            int i5 = i4 + 57;
            IEngagementSignalsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            onextracallbackwithresult = onextracallbackwithresultOnWarmupCompleted;
            int i6 = i4 + 31;
            IEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if (onextracallbackwithresult != null) {
            return onextracallbackwithresult;
        }
        throw new IllegalStateException("Portal shared bundle was not loaded");
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws Throwable {
        MaxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback onextracallback;
        MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onnavigationeventOnWarmupCompleted;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 99;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            onextracallback = MaxFullscreenAdImplExternalSyntheticLambda6.Companion;
            onnavigationeventOnWarmupCompleted = onWarmupCompleted(oninterstitialaddisplayfailed, "car", (onAppOpenAdHidden.onExtraCallback) null, 3, (Object) null);
        } else {
            onextracallback = MaxFullscreenAdImplExternalSyntheticLambda6.Companion;
            onnavigationeventOnWarmupCompleted = onWarmupCompleted(oninterstitialaddisplayfailed, "car", (onAppOpenAdHidden.onExtraCallback) null, 2, (Object) null);
        }
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6OnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult(onnavigationeventOnWarmupCompleted);
        int i3 = warmup + 105;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return maxFullscreenAdImplExternalSyntheticLambda6OnExtraCallbackWithResult;
    }

    static /* synthetic */ onAppOpenAdDisplayed onExtraCallbackWithResult(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, onAppOpenAdHidden.onExtraCallback onextracallback, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 61;
        warmup = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 5) != 0) {
            onextracallback = new onAppOpenAdHidden.onExtraCallback(null, null, 3, null);
            int i4 = warmup + 113;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return (onAppOpenAdDisplayed) IAuthTabCallback(1972283824, new Object[]{oninterstitialaddisplayfailed, str, onextracallback}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1972283803);
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) throws Throwable {
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str = (String) objArr[1];
        onAppOpenAdHidden.onExtraCallback onextracallback = (onAppOpenAdHidden.onExtraCallback) objArr[2];
        int i = 2 % 2;
        int i2 = warmup + 81;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onAppOpenAdDisplayed.IAuthTabCallback iAuthTabCallback = onAppOpenAdDisplayed.Companion;
        if (i3 != 0) {
            return iAuthTabCallback.onWarmupCompleted(oninterstitialaddisplayfailed.onNavigationEvent(str, onextracallback));
        }
        iAuthTabCallback.onWarmupCompleted(oninterstitialaddisplayfailed.onNavigationEvent(str, onextracallback));
        throw null;
    }

    static /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, onAppOpenAdHidden.onExtraCallback onextracallback, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = warmup + 75;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            onextracallback = new onAppOpenAdHidden.onExtraCallback(null, null, 3, null);
            int i4 = IEngagementSignalsCallback + 45;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        }
        return oninterstitialaddisplayfailed.onNavigationEvent(str, onextracallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onNavigationEvent(String str, onAppOpenAdHidden.onExtraCallback onextracallback) throws Throwable {
        boolean z;
        int i = 2 % 2;
        String code = this.validateRelationship.onExtraCallbackWithResult().getCode();
        if (code == null) {
            code = "kr";
        }
        isLoading.onNavigationEvent onnavigationeventIAuthTabCallback = isLoading.Companion.onExtraCallback().onExtraCallback(this.IAuthTabCallbackStubProxy.updateVisuals()).onNavigationEvent(onActivityResized().onExtraCallback()).IAuthTabCallback(code);
        Object[] objArr = new Object[1];
        a(10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 4, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        isLoading isloadingOnWarmupCompleted = onnavigationeventIAuthTabCallback.onWarmupCompleted(((String) objArr[0]).intern()).onExtraCallbackWithResult("rn84").onWarmupCompleted();
        MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent = new MaxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent();
        onnavigationevent.IAuthTabCallbackDefault(str);
        Object[] objArr2 = new Object[1];
        a(13 - Gravity.getAbsoluteGravity(0, 0), 7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) View.getDefaultSize(0, 0), objArr2);
        Object[] objArr3 = new Object[1];
        a(9 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Process.getGidForName("") + 5, (char) View.resolveSizeAndState(0, 0, 0), objArr3);
        onnavigationevent.onExtraCallback(((String) objArr3[0]).intern());
        onnavigationevent.onWarmupCompleted(onextracallback.onNavigationEvent());
        onnavigationevent.IAuthTabCallback(onextracallback.onExtraCallback());
        Long lOnExtraCallback = onextracallback.onExtraCallback();
        if (lOnExtraCallback != null) {
            int i2 = IEngagementSignalsCallback + 81;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            if (lOnExtraCallback.longValue() == 0) {
                int i4 = IEngagementSignalsCallback + 31;
                warmup = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        onnavigationevent.onWarmupCompleted(z);
        onnavigationevent.onExtraCallbackWithResult(ebExternalSyntheticLambda0.Companion.onWarmupCompleted().IAuthTabCallbackStub());
        String strOnExtraCallback = onActivityResized().onExtraCallback();
        String str2 = null;
        if (!onActivityResized().IAuthTabCallback()) {
            int i6 = IEngagementSignalsCallback + 105;
            warmup = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 20 / 0;
            }
            strOnExtraCallback = null;
        }
        if (strOnExtraCallback != null) {
            str2 = "group=" + strOnExtraCallback;
        }
        onnavigationevent.onExtraCallbackWithResult(str2);
        onnavigationevent.asBinder(isloadingOnWarmupCompleted.IAuthTabCallback(str).onExtraCallbackWithResult());
        Object[] objArr4 = new Object[1];
        a(View.resolveSize(0, 0) + 13, 6 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) TextUtils.getCapsMode("", 0, 0), objArr4);
        onnavigationevent.onWarmupCompleted(isloadingOnWarmupCompleted.IAuthTabCallback(((String) objArr4[0]).intern()).onExtraCallbackWithResult());
        return onnavigationevent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[PHI: r14
      0x005f: PHI (r14v4 o.pkcs5PBKDF2) = (r14v3 o.pkcs5PBKDF2), (r14v16 o.pkcs5PBKDF2) binds: [B:13:0x005d, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[PHI: r14
      0x0072: PHI (r14v9 o.pkcs5PBKDF2) = (r14v3 o.pkcs5PBKDF2), (r14v16 o.pkcs5PBKDF2) binds: [B:13:0x005d, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ReactHost onExtraCallback(transGetKmCert transgetkmcert) throws NoWhenBranchMatchedException {
        pkcs5PBKDF2 pkcs5pbkdf2OnExtraCallback;
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        ArrayList arrayListOnExtraCallbackWithResult = new com.facebook.react.onExtraCallback(this.IAuthTabCallback).onExtraCallbackWithResult();
        arrayListOnExtraCallbackWithResult.add(0, new d0a(this.readTypedObject));
        arrayListOnExtraCallbackWithResult.add(new setPanelSlideListener());
        if (transgetkmcert instanceof transGetKmCert.onNavigationEvent) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(JSBundleLoader.Companion.createAssetLoader(this.onNavigationEvent, "assets://index.android.bundle", true), Boolean.TRUE);
        } else {
            if (!(transgetkmcert instanceof transGetKmCert.onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = IEngagementSignalsCallback + 35;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                pkcs5pbkdf2OnExtraCallback = ((transGetKmCert.onWarmupCompleted) transgetkmcert).onExtraCallback();
                int i3 = 64 / 0;
                if (pkcs5pbkdf2OnExtraCallback instanceof pkcs5PBKDF2.onExtraCallbackWithResult) {
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(JSBundleLoader.Companion.createFileLoader(((pkcs5PBKDF2.onExtraCallbackWithResult) pkcs5pbkdf2OnExtraCallback).onExtraCallbackWithResult()), Boolean.FALSE);
                } else {
                    if (!(pkcs5pbkdf2OnExtraCallback instanceof pkcs5PBKDF2.onNavigationEvent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(JSBundleLoader.Companion.createAssetLoader(this.onNavigationEvent, "assets://index.android.bundle", true), Boolean.FALSE);
                }
            } else {
                pkcs5pbkdf2OnExtraCallback = ((transGetKmCert.onWarmupCompleted) transgetkmcert).onExtraCallback();
                if (pkcs5pbkdf2OnExtraCallback instanceof pkcs5PBKDF2.onExtraCallbackWithResult) {
                }
            }
        }
        JSBundleLoader jSBundleLoader = (JSBundleLoader) pairIAuthTabCallback.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) pairIAuthTabCallback.IAuthTabCallback()).booleanValue();
        Intrinsics.checkNotNull(arrayListOnExtraCallbackWithResult);
        DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate("index", jSBundleLoader, arrayListOnExtraCallbackWithResult, new HermesInstance(), (BindingsInstaller) null, new Function1() { // from class: im.toss.rn.toss.core.portal.TossPortalRuntime$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 5;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnExtraCallback = onInterstitialAdDisplayFailed.onExtraCallback(this.f$0, (Exception) obj);
                int i7 = onExtraCallback + 59;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return unitOnExtraCallback;
            }
        }, new DefaultTurboModuleManagerDelegate.onExtraCallbackWithResult());
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        ReactHostImpl reactHostImpl = new ReactHostImpl(this.onNavigationEvent, defaultReactHostDelegate, componentFactory, zBooleanValue, zBooleanValue);
        int i4 = warmup + 109;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return reactHostImpl;
    }

    private static final Unit onNavigationEvent(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Exception exc) {
        Object obj;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 77;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        oninterstitialaddisplayfailed.extraCommand = SystemClock.elapsedRealtime();
        try {
            Result.Companion companion = Result.Companion;
            oninterstitialaddisplayfailed.onExtraCallback(exc);
            obj = Result.constructor-impl(Unit.INSTANCE);
            int i4 = warmup + 53;
            IEngagementSignalsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 3;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i6 = warmup + 31;
            IEngagementSignalsCallback = i6 % 128;
            if (i6 % 2 == 0) {
                oninterstitialaddisplayfailed.onNavigationEvent("mono_hermes_js_fatal", th2);
                throw null;
            }
            oninterstitialaddisplayfailed.onNavigationEvent("mono_hermes_js_fatal", th2);
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0174 A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:37:0x0166, B:43:0x0174, B:44:0x0177, B:46:0x017b, B:47:0x01a2, B:50:0x01a5), top: B:60:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b A[Catch: all -> 0x01a6, TryCatch #1 {all -> 0x01a6, blocks: (B:37:0x0166, B:43:0x0174, B:44:0x0177, B:46:0x017b, B:47:0x01a2, B:50:0x01a5), top: B:60:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        access000 access000Var;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int iIntValue;
        Object objOnExtraCallbackWithResult;
        String str;
        int i;
        onExtraCallback onextracallback;
        onAppOpenAdDisplayed onappopenaddisplayed;
        ReactContext reactContext;
        onAppOpenAdDisplayed onappopenaddisplayed2;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6;
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[0];
        String str2 = (String) objArr[1];
        ReactContext reactContext2 = (ReactContext) objArr[2];
        access000 access000Var2 = (access13800) objArr[3];
        int i2 = 2 % 2;
        if (access000Var2 instanceof access000) {
            int i3 = IEngagementSignalsCallback + 17;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            access000Var = access000Var2;
            int i5 = access000Var.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                access000Var.label = i5 - 2147483648;
            } else {
                access000Var = oninterstitialaddisplayfailed.new access000(access000Var2);
            }
        }
        Object obj = access000Var.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = access000Var.label;
        try {
            if (i6 == 0) {
                ResultKt.onNavigationEvent(obj);
                iIntValue = ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
                access000Var.L$0 = str2;
                access000Var.L$1 = reactContext2;
                access000Var.I$0 = iIntValue;
                access000Var.label = 1;
                objOnExtraCallbackWithResult = oninterstitialaddisplayfailed.onExtraCallbackWithResult(str2, (access13800<? super onExtraCallback>) access000Var);
                if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = IEngagementSignalsCallback + 101;
                    warmup = i7 % 128;
                    int i8 = i7 % 2;
                    jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) access000Var.L$4;
                    onappopenaddisplayed2 = (onAppOpenAdDisplayed) access000Var.L$3;
                    onextracallback = (onExtraCallback) access000Var.L$2;
                    try {
                        ResultKt.onNavigationEvent(obj);
                        Unit unit = Unit.INSTANCE;
                        jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                        onextracallback.IAuthTabCallback();
                        return unit;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (onappopenaddisplayed2 != null) {
                            onappopenaddisplayed2.asBinder();
                        }
                        maxFullscreenAdImplExternalSyntheticLambda6 = oninterstitialaddisplayfailed.onExtraCallback;
                        if (maxFullscreenAdImplExternalSyntheticLambda6 != null) {
                            Object[] objArr2 = new Object[1];
                            a(MotionEvent.axisFromString("") + 14, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                            maxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent(((String) objArr2[0]).intern());
                        }
                        throw th;
                    }
                }
                int i9 = access000Var.I$1;
                int i10 = access000Var.I$0;
                jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) access000Var.L$4;
                onappopenaddisplayed = (onAppOpenAdDisplayed) access000Var.L$3;
                onExtraCallback onextracallback2 = (onExtraCallback) access000Var.L$2;
                reactContext = (ReactContext) access000Var.L$1;
                str = (String) access000Var.L$0;
                ResultKt.onNavigationEvent(obj);
                iIntValue = i10;
                i = i9;
                onextracallback = onextracallback2;
                try {
                    if (iIntValue == ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue() || !reactContext.hasActiveReactInstance()) {
                        ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
                        Unit unit2 = Unit.INSTANCE;
                        jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                        return unit2;
                    }
                    try {
                        access000Var.L$0 = str;
                        access000Var.L$1 = access15400.onNavigationEvent(reactContext);
                        access000Var.L$2 = onextracallback;
                        access000Var.L$3 = onappopenaddisplayed;
                        access000Var.L$4 = jni_ygnodestylegetflexbasisjni;
                        access000Var.I$0 = iIntValue;
                        access000Var.I$1 = i;
                        access000Var.I$2 = 0;
                        access000Var.label = 3;
                        if (oninterstitialaddisplayfailed.onNavigationEvent(onextracallback, reactContext, (access13800<? super Unit>) access000Var) != objOnWarmupCompleted) {
                            jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                            Unit unit3 = Unit.INSTANCE;
                            jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                            onextracallback.IAuthTabCallback();
                            return unit3;
                        }
                        return objOnWarmupCompleted;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable th2) {
                        th = th2;
                        onappopenaddisplayed2 = onappopenaddisplayed;
                        if (onappopenaddisplayed2 != null) {
                        }
                        maxFullscreenAdImplExternalSyntheticLambda6 = oninterstitialaddisplayfailed.onExtraCallback;
                        if (maxFullscreenAdImplExternalSyntheticLambda6 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                    throw th;
                }
            }
            int i11 = access000Var.I$0;
            reactContext2 = (ReactContext) access000Var.L$1;
            String str3 = (String) access000Var.L$0;
            ResultKt.onNavigationEvent(obj);
            iIntValue = i11;
            str2 = str3;
            objOnExtraCallbackWithResult = obj;
            onExtraCallback onextracallback3 = (onExtraCallback) objOnExtraCallbackWithResult;
            onAppOpenAdDisplayed onappopenaddisplayedOnWarmupCompleted = onextracallback3.onWarmupCompleted();
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni3 = oninterstitialaddisplayfailed.prefetch;
            access000Var.L$0 = str2;
            access000Var.L$1 = reactContext2;
            access000Var.L$2 = onextracallback3;
            access000Var.L$3 = onappopenaddisplayedOnWarmupCompleted;
            access000Var.L$4 = jni_ygnodestylegetflexbasisjni3;
            access000Var.I$0 = iIntValue;
            access000Var.I$1 = 0;
            access000Var.label = 2;
            if (jni_ygnodestylegetflexbasisjni3.IAuthTabCallback((Object) null, access000Var) != objOnWarmupCompleted) {
                int i12 = warmup + 15;
                IEngagementSignalsCallback = i12 % 128;
                int i13 = i12 % 2;
                str = str2;
                i = 0;
                onextracallback = onextracallback3;
                onappopenaddisplayed = onappopenaddisplayedOnWarmupCompleted;
                reactContext = reactContext2;
                jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni3;
                if (iIntValue == ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue()) {
                }
                ((Integer) onAdViewAdDisplayed.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{oninterstitialaddisplayfailed.access100}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).intValue();
                Unit unit22 = Unit.INSTANCE;
                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                return unit22;
            }
            return objOnWarmupCompleted;
        } catch (Throwable th4) {
            th = th4;
            jni_ygnodestylegetflexbasisjni = 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        if (r5 != r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(String str, access13800<? super onExtraCallback> access13800Var) {
        extraCallback extracallback;
        onAppOpenAdDisplayed onappopenaddisplayedOnExtraCallbackWithResult;
        Object objOnWarmupCompleted;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        String str2;
        onAppOpenAdDisplayed onappopenaddisplayed;
        String str3 = str;
        int i = 2 % 2;
        if (!(access13800Var instanceof extraCallback)) {
            extracallback = new extraCallback(access13800Var);
            int i2 = warmup + 79;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            extracallback = (extraCallback) access13800Var;
            int i4 = extracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = warmup + 107;
                IEngagementSignalsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    extracallback.label = i4 - 2147483648;
                } else {
                    extracallback.label = i4 - 2147483648;
                }
            }
        }
        Object obj = extracallback.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i6 = extracallback.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            onappopenaddisplayedOnExtraCallbackWithResult = this.onMinimized.get(str3);
            if (onappopenaddisplayedOnExtraCallbackWithResult == null) {
                int i7 = warmup + 65;
                IEngagementSignalsCallback = i7 % 128;
                int i8 = i7 % 2;
                onappopenaddisplayedOnExtraCallbackWithResult = onExtraCallbackWithResult(this, str3, (onAppOpenAdHidden.onExtraCallback) null, 2, (Object) null);
                extracallback.L$0 = str3;
                extracallback.L$1 = onappopenaddisplayedOnExtraCallbackWithResult;
                extracallback.L$2 = access15400.onNavigationEvent(onappopenaddisplayedOnExtraCallbackWithResult);
                extracallback.I$0 = 0;
                extracallback.label = 1;
                objOnWarmupCompleted = onAppOpenAdDisplayed.onWarmupCompleted(2115256031, new Object[]{onappopenaddisplayedOnExtraCallbackWithResult, extracallback}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -2115256028);
            } else {
                onNavigationEvent(onappopenaddisplayedOnExtraCallbackWithResult);
                jni_ygnodestylegetflexbasisjni = this.prefetch;
                extracallback.L$0 = str3;
                extracallback.L$1 = onappopenaddisplayedOnExtraCallbackWithResult;
                extracallback.L$2 = jni_ygnodestylegetflexbasisjni;
                extracallback.I$0 = 0;
                extracallback.label = 2;
                if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, extracallback) != objOnWarmupCompleted2) {
                    str2 = str3;
                    onappopenaddisplayed = onappopenaddisplayedOnExtraCallbackWithResult;
                    this.onMinimized.putIfAbsent(str2, onappopenaddisplayed);
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                    return new onExtraCallback(str2, onappopenaddisplayed.onWarmupCompleted(), onappopenaddisplayed.onExtraCallbackWithResult(), onappopenaddisplayed.onExtraCallback(), onappopenaddisplayed);
                }
            }
            return objOnWarmupCompleted2;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = warmup + 125;
            IEngagementSignalsCallback = i9 % 128;
            if (i9 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) extracallback.L$2;
            onAppOpenAdDisplayed onappopenaddisplayed2 = (onAppOpenAdDisplayed) extracallback.L$1;
            String str4 = (String) extracallback.L$0;
            ResultKt.onNavigationEvent(obj);
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
            onappopenaddisplayed = onappopenaddisplayed2;
            str2 = str4;
            try {
                this.onMinimized.putIfAbsent(str2, onappopenaddisplayed);
                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                return new onExtraCallback(str2, onappopenaddisplayed.onWarmupCompleted(), onappopenaddisplayed.onExtraCallbackWithResult(), onappopenaddisplayed.onExtraCallback(), onappopenaddisplayed);
            } catch (Throwable th) {
                jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                throw th;
            }
        }
        onAppOpenAdDisplayed onappopenaddisplayed3 = (onAppOpenAdDisplayed) extracallback.L$1;
        String str5 = (String) extracallback.L$0;
        ResultKt.onNavigationEvent(obj);
        onappopenaddisplayedOnExtraCallbackWithResult = onappopenaddisplayed3;
        str3 = str5;
        objOnWarmupCompleted = obj;
        if (objOnWarmupCompleted != onAppOpenAdDisplayed.onNavigationEvent.PRODUCTION) {
            throw new IllegalStateException(("Portal runtime was initialized from CDN but " + str3 + " resolved to Metro").toString());
        }
        int i10 = IEngagementSignalsCallback + 89;
        warmup = i10 % 128;
        int i11 = i10 % 2;
        onNavigationEvent(onappopenaddisplayedOnExtraCallbackWithResult);
        jni_ygnodestylegetflexbasisjni = this.prefetch;
        extracallback.L$0 = str3;
        extracallback.L$1 = onappopenaddisplayedOnExtraCallbackWithResult;
        extracallback.L$2 = jni_ygnodestylegetflexbasisjni;
        extracallback.I$0 = 0;
        extracallback.label = 2;
        if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, extracallback) != objOnWarmupCompleted2) {
        }
        return objOnWarmupCompleted2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        return (Unit) IAuthTabCallback(2113731012, new Object[]{th}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2113731003);
    }

    public static /* synthetic */ Unit onExtraCallback(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, AppState.State state) {
        return (Unit) IAuthTabCallback(89763498, new Object[]{oninterstitialaddisplayfailed, state}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -89763479);
    }

    public static final /* synthetic */ onAppOpenAdDisplayed onNavigationEvent(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, String str, onAppOpenAdHidden.onExtraCallback onextracallback) {
        return (onAppOpenAdDisplayed) IAuthTabCallback(1336963396, new Object[]{oninterstitialaddisplayfailed, str, onextracallback}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1336963367);
    }

    public static final /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda6 onNavigationEvent(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        return (MaxFullscreenAdImplExternalSyntheticLambda6) IAuthTabCallback(-547953519, new Object[]{oninterstitialaddisplayfailed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 547953520);
    }

    public static final /* synthetic */ onWarmupCompleted onTransact(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        return (onWarmupCompleted) IAuthTabCallback(-1132397120, new Object[]{oninterstitialaddisplayfailed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1132397120);
    }

    public static final /* synthetic */ onAdViewAdDisplayed asInterface(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        return (onAdViewAdDisplayed) IAuthTabCallback(-999534704, new Object[]{oninterstitialaddisplayfailed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 999534707);
    }

    public static final /* synthetic */ access6900 access100(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        return (access6900) IAuthTabCallback(-138601257, new Object[]{oninterstitialaddisplayfailed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 138601270);
    }

    private final void IAuthTabCallback(String str) {
        IAuthTabCallback(572719163, new Object[]{this, str}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -572719146);
    }

    private static final void onWarmupCompleted(int i, onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, Throwable th, String str, long j, long j2) {
        IAuthTabCallback(-100361786, new Object[]{Integer.valueOf(i), oninterstitialaddisplayfailed, th, str, Long.valueOf(j), Long.valueOf(j2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 100361800);
    }

    private final onAppOpenAdDisplayed onExtraCallbackWithResult(String str, onAppOpenAdHidden.onExtraCallback onextracallback) {
        return (onAppOpenAdDisplayed) IAuthTabCallback(1972283824, new Object[]{this, str, onextracallback}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1972283803);
    }

    private final MaxFullscreenAdImplExternalSyntheticLambda6 onMessageChannelReady() {
        return (MaxFullscreenAdImplExternalSyntheticLambda6) IAuthTabCallback(1278607275, new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1278607255);
    }

    private final Object onWarmupCompleted(String str, ReactContext reactContext, access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(1999039848, new Object[]{this, str, reactContext, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1999039837);
    }

    private final void onWarmupCompleted(transGetKmCert transgetkmcert, int i, String str, long j, pauseMyRequest<Unit> pausemyrequest) {
        IAuthTabCallback(1029332772, new Object[]{this, transgetkmcert, Integer.valueOf(i), str, Long.valueOf(j), pausemyrequest}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1029332744);
    }

    private final Object onNavigationEvent(String str, access13800<? super String> access13800Var) {
        return IAuthTabCallback(-194259008, new Object[]{this, str, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 194259041);
    }

    private final void onExtraCallback(String str, String str2, Throwable th, Map<String, ? extends Object> map) {
        IAuthTabCallback(-657951309, new Object[]{this, str, str2, th, map}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 657951340);
    }

    private final void onExtraCallbackWithResult(Throwable th) {
        IAuthTabCallback(1960273799, new Object[]{this, th}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1960273763);
    }

    private final void ICustomTabsCallbackStub() {
        IAuthTabCallback(1221140041, new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1221140037);
    }

    private static final Unit onWarmupCompleted(onInterstitialAdDisplayFailed oninterstitialaddisplayfailed, AppState.State state) {
        return (Unit) IAuthTabCallback(-1274203815, new Object[]{oninterstitialaddisplayfailed, state}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1274203823);
    }

    private static final Unit onNavigationEvent(long j) {
        return (Unit) IAuthTabCallback(1006676398, new Object[]{Long.valueOf(j)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1006676373);
    }

    private final void onNavigationEvent(IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        IAuthTabCallback(1324998295, new Object[]{this, iAuthTabCallbackDefault}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1324998271);
    }

    private final void onExtraCallbackWithResult(String str, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        IAuthTabCallback(-1028992801, new Object[]{this, str, iAuthTabCallbackDefault}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1028992816);
    }

    private final MaxFullscreenAdImpl.onExtraCallbackWithResult onWarmupCompleted(MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6) {
        return (MaxFullscreenAdImpl.onExtraCallbackWithResult) IAuthTabCallback(327908443, new Object[]{this, maxFullscreenAdImplExternalSyntheticLambda6}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -327908436);
    }

    private final MaxFullscreenAdImpl.onExtraCallbackWithResult onExtraCallback(onAppOpenAdDisplayed onappopenaddisplayed) {
        return (MaxFullscreenAdImpl.onExtraCallbackWithResult) IAuthTabCallback(-1603384154, new Object[]{this, onappopenaddisplayed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1603384166);
    }

    private final void onExtraCallback(onInterstitialAdLoadFailed oninterstitialadloadfailed) {
        IAuthTabCallback(-831134392, new Object[]{this, oninterstitialadloadfailed}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 831134429);
    }

    private final void onNavigationEvent(String str, boolean z) {
        IAuthTabCallback(1746685929, new Object[]{this, str, Boolean.valueOf(z)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1746685899);
    }

    public final Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(-1040637423, new Object[]{this, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1040637449);
    }

    public final ResourceResolutionException IAuthTabCallbackDefault() {
        return (ResourceResolutionException) IAuthTabCallback(-1875942894, new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1875942916);
    }

    public final Object onExtraCallbackWithResult(@NotNull String str, @NotNull ReactContext reactContext, @NotNull access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(1185854566, new Object[]{this, str, reactContext, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1185854548);
    }

    public final void onExtraCallback(@NotNull PortalServiceActivity portalServiceActivity, @NotNull String str) {
        IAuthTabCallback(1109194018, new Object[]{this, portalServiceActivity, str}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1109194008);
    }

    public final void IAuthTabCallbackStubProxy() {
        IAuthTabCallback(279445662, new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -279445639);
    }

    public final Object onNavigationEvent(@NotNull onAppOpenAdHidden onappopenadhidden, @NotNull Function1<? super Long, Unit> function1, @NotNull access13800<? super IAuthTabCallback> access13800Var) {
        return IAuthTabCallback(-868812342, new Object[]{this, onappopenadhidden, function1, access13800Var}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 868812376);
    }

    public final void onWarmupCompleted(@NotNull String str, boolean z) {
        IAuthTabCallback(753585459, new Object[]{this, str, Boolean.valueOf(z)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -753585427);
    }

    static void extraCallbackWithResult() {
        ICustomTabsServiceStub = new char[]{22399, 59496, 10604, 27262, 43874, 60515, 49702, 32033, 48191, 60855, 21179, 37798, 53425, 60839, 21180, 37813, 53414, 4529, 22192, 60833, 21178, 37823, 53434, 4539, 22179, 38842};
        ICustomTabsServiceDefault = -2774974247808380204L;
    }
}
