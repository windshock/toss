package im.toss.ads_sdk.playable;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity;
import im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$;
import im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$setBackPressed$1$;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.features.useronboarding.visitor.ui.user.verify.VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.Address;
import o.AppLovinSdkSettings;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cache;
import o.CameraControllerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EasingFunctionsKtExternalSyntheticLambda3;
import o.FragmentStateAdapter4;
import o.GeckoHubImp;
import o.RepeatableSpec;
import o.Response;
import o.Rmenu;
import o.SetDetectableSize;
import o.SuspendAnimationKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access8100;
import o.auth;
import o.authenticate;
import o.calculatePageOffsets;
import o.clearFaultAdjacentMetadata;
import o.convertAnyToMap;
import o.deleteCert;
import o.deprecated_certificatePinner;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getBacktraceNoteBytes;
import o.getExtraParameters;
import o.getFillAlpha;
import o.getPlatformCallback;
import o.getScaleY;
import o.getSpecialFeatureOptInStatus;
import o.getStrokeAlpha;
import o.getStrokeWidth;
import o.getUrlokhttp;
import o.getWrite;
import o.infoForChild;
import o.isFireOS;
import o.isMuted;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.nSetPosition;
import o.noStore;
import o.pageRight;
import o.putChannelInfo;
import o.pxToDp;
import o.readIntokhttp;
import o.removeLogBuffers;
import o.runOnUiThreadDelayed;
import o.setCommandLine;
import o.setInternalPageChangeListener;
import o.setLogBuffers;
import o.setRandomHost;
import o.setRevision;
import o.setTrimPathOffset;
import o.varyMatches;
import o.zzad;
import o.zzaj;
import o.zzck;
import o.zzw;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsPlayableAdActivity extends Hilt_NativeAdsPlayableAdActivity {
    public static final onWarmupCompleted Companion;
    private static byte[] ICustomTabsServiceDefault;
    private static int ICustomTabsServiceStub;
    private static int ICustomTabsService_Parcel;
    public static final int onTransact;
    private static int requestPostMessageChannelWithExtras;
    private static int updateVisuals;
    private static short[] validateRelationship;
    private boolean IAuthTabCallbackDefault;
    private AudioManager IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStubProxy;
    private infoForChild ICustomTabsCallback_Parcel;
    private long access100;

    @Inject
    public TextRoundCornerProgressBarSavedState1 adsSdkPrefs;

    @Inject
    public FragmentStateAdapter4 appInfoProvider;
    private boolean asInterface;
    private long extraCallback;
    private Long extraCallbackWithResult;
    private boolean getInterfaceDescriptor;

    @Inject
    public pageRight httpClientFactory;

    @Inject
    public zzad injectedEnvironments;
    private NativeAdsManager isEngagementSignalsApiAvailable;
    private boolean newAuthTabSession;
    private boolean newSessionWithExtras;
    private int onActivityLayout;
    private boolean onMinimized;
    private boolean onRelationshipValidationResult;
    private boolean onUnminimized;
    private NativeAdsDto.Creative.PlayableAd prefetch;
    private ValueAnimator prefetchWithMultipleUrls;
    private Long readTypedObject;
    private ContentObserver setEngagementSignalsCallback;
    private Long writeTypedObject;
    private static final byte[] $$a = {117, -24, -14, 98};
    private static final int $$b = 195;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsServiceStubProxy = 1;
    private static int warmup = 0;
    private static int IEngagementSignalsCallback = 1;
    private final IAuthTabCallbackDefault ICustomTabsService = new IAuthTabCallbackDefault();
    private final Lazy asBinder = getStrokeAlpha.IAuthTabCallback((Activity) this, (Function1) onExtraCallback.onNavigationEvent);
    private final Handler ICustomTabsCallbackStub = new Handler(Looper.getMainLooper());
    private final List<ValueAnimator> onPostMessage = new ArrayList();
    private final Set<Long> extraCommand = new LinkedHashSet();
    private final Lazy requestPostMessageChannel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda36
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(NativeAdsPlayableAdActivity.IAuthTabCallbackDefault(this.f$0));
            int i4 = onExtraCallback + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 93 / 0;
            }
            return numValueOf;
        }
    });
    private final Lazy onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda37
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.f$0};
            String str = (String) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 283579336, -283579332, objArr);
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy mayLaunchUrl = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda38
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                NativeAdsPlayableAdActivity.asBinder(this.f$0);
                throw null;
            }
            NativeAdsDto nativeAdsDtoAsBinder = NativeAdsPlayableAdActivity.asBinder(this.f$0);
            int i3 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return nativeAdsDtoAsBinder;
        }
    });
    private final Lazy newSession = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda39
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = this.f$0;
            if (i3 != 0) {
                return NativeAdsPlayableAdActivity.access000(nativeAdsPlayableAdActivity);
            }
            NativeAdsPlayableAdActivity.access000(nativeAdsPlayableAdActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final CoroutineExceptionHandler access000 = new onMessageChannelReady(CoroutineExceptionHandler.extraCallbackWithResult, this);
    private final AtomicInteger receiveFile = new AtomicInteger(0);
    private final AtomicBoolean onActivityResized = new AtomicBoolean(false);
    private final Lazy postMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda40
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                NativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy(this.f$0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setInternalPageChangeListener setinternalpagechangelistenerIAuthTabCallbackStubProxy = NativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy(this.f$0);
            int i3 = onWarmupCompleted + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return setinternalpagechangelistenerIAuthTabCallbackStubProxy;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2;
        int i3 = 3 - (b * 4);
        int i4 = 115 - (s * 4);
        int i5 = 1 - (b2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 = (-i4) + i3;
            i3 = i6;
            i = i7;
            int i8 = i3 + 1;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i8];
            i3 = i4;
            i4 = b3;
            i7 = i2;
            i6 = i8;
            i4 = (-i4) + i3;
            i3 = i6;
            i = i7;
            int i82 = i3 + 1;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            int i822 = i3 + 1;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$QqtiCSBD6C7XKuDxMSLiULRJB60(View view) {
        int i = 2 % 2;
        int i2 = warmup + 49;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ICustomTabsService_Parcel = 0;
        IAuthTabCallbackDefault();
        Companion = new onWarmupCompleted(null);
        onTransact = 8;
        int i = ICustomTabsServiceStubProxy + 55;
        ICustomTabsService_Parcel = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        View view = (View) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 49;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1581917979, 1581917996, new Object[]{view, motionEvent})).booleanValue();
        int i4 = warmup + 49;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = warmup + 9;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsEventLogType);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 99;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        newSession(nativeAdsPlayableAdActivity);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view) {
        int i = 2 % 2;
        int i2 = warmup + 65;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(nativeAdsPlayableAdActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 99;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsPlayableAdActivity, str);
        int i4 = IEngagementSignalsCallback + 51;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackStub;
    }

    public static /* synthetic */ int IAuthTabCallbackDefault(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 121;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {nativeAdsPlayableAdActivity};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        if (i3 != 0) {
            iIntValue = ((Integer) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 889115214, -889115183, objArr)).intValue();
            int i4 = 77 / 0;
        } else {
            iIntValue = ((Integer) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 889115214, -889115183, objArr)).intValue();
        }
        int i5 = IEngagementSignalsCallback + 55;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 1;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsServiceDefault(nativeAdsPlayableAdActivity);
        }
        ICustomTabsServiceDefault(nativeAdsPlayableAdActivity);
        throw null;
    }

    public static /* synthetic */ setInternalPageChangeListener IAuthTabCallbackStubProxy(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 47;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsServiceStub(nativeAdsPlayableAdActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setInternalPageChangeListener setinternalpagechangelistenerICustomTabsServiceStub = ICustomTabsServiceStub(nativeAdsPlayableAdActivity);
        int i3 = IEngagementSignalsCallback + 93;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return setinternalpagechangelistenerICustomTabsServiceStub;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 9;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(nativeAdsPlayableAdActivity, setDetectableSize);
        int i4 = IEngagementSignalsCallback + 29;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback_Parcel(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 31;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            return ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -2016036210, 2016036230, new Object[]{nativeAdsPlayableAdActivity})).booleanValue();
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        int i3 = 2 / 0;
        return ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult4, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, -2016036210, 2016036230, new Object[]{nativeAdsPlayableAdActivity})).booleanValue();
    }

    public static /* synthetic */ String access000(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 33;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IEngagementSignalsCallback(nativeAdsPlayableAdActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strIEngagementSignalsCallback = IEngagementSignalsCallback(nativeAdsPlayableAdActivity);
        int i3 = warmup + 15;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return strIEngagementSignalsCallback;
    }

    public static /* synthetic */ Unit access100(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 91;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return validateRelationship(nativeAdsPlayableAdActivity);
        }
        validateRelationship(nativeAdsPlayableAdActivity);
        throw null;
    }

    public static /* synthetic */ NativeAdsDto asBinder(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 7;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDtoPrefetchWithMultipleUrls = prefetchWithMultipleUrls(nativeAdsPlayableAdActivity);
        int i4 = IEngagementSignalsCallback + 103;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return nativeAdsDtoPrefetchWithMultipleUrls;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        String str = (String) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = warmup + 51;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(nativeAdsPlayableAdActivity, str, view);
        int i4 = IEngagementSignalsCallback + 17;
        warmup = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 123;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 213167740, -213167725, new Object[]{nativeAdsPlayableAdActivity});
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws JSONException, NoSuchMethodException, SecurityException {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 31;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        requestPostMessageChannelWithExtras(nativeAdsPlayableAdActivity);
        if (i3 == 0) {
            return null;
        }
        int i4 = 92 / 0;
        return null;
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        View view = (View) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 19;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(view, valueAnimator);
        int i4 = IEngagementSignalsCallback + 29;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 39;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(nativeAdsPlayableAdActivity, nativeAdsDto, adAsset);
        }
        onWarmupCompleted(nativeAdsPlayableAdActivity, nativeAdsDto, adAsset);
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 33;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitUpdateVisuals = updateVisuals(nativeAdsPlayableAdActivity);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = IEngagementSignalsCallback + 75;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return unitUpdateVisuals;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 75;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {nativeAdsPlayableAdActivity, motionEvent};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 752520589, -752520573, objArr2);
        int i4 = IEngagementSignalsCallback + 67;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getScaleY getscaley = (getScaleY) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 99;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getscaley);
        int i4 = IEngagementSignalsCallback + 15;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = warmup + 123;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, nativeAdsPlayableAdActivity, setDetectableSize);
        int i5 = IEngagementSignalsCallback + 41;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 109;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(nativeAdsEventLogType);
        }
        onNavigationEvent(nativeAdsEventLogType);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto, boolean z) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 99;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(nativeAdsPlayableAdActivity, nativeAdsDto, z);
        }
        IAuthTabCallback(nativeAdsPlayableAdActivity, nativeAdsDto, z);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 109;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1192494759, -1192494748, new Object[]{nativeAdsPlayableAdActivity, setDetectableSize});
        int i4 = IEngagementSignalsCallback + 95;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = warmup + 63;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsEventLogType);
        int i4 = IEngagementSignalsCallback + 27;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = warmup + 123;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsPlayableAdActivity, nativeAdsEventLogType);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int i = 2 % 2;
        int i2 = warmup + 119;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(nativeAdsPlayableAdActivity, str);
        int i4 = IEngagementSignalsCallback + 121;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 61;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsPlayableAdActivity, setDetectableSize);
        int i4 = warmup + 65;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto.Creative.TutorialOverlay tutorialOverlay, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 85;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tutorialOverlay, th);
        int i4 = IEngagementSignalsCallback + 53;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 73;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(nativeAdsPlayableAdActivity, setDetectableSize);
        }
        IAuthTabCallback(nativeAdsPlayableAdActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = warmup + 19;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(webView, str);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IEngagementSignalsCallback + 109;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 41;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1228758017, 1228758040, new Object[]{nativeAdsPlayableAdActivity, view});
            return;
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult4, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, -1228758017, 1228758040, new Object[]{nativeAdsPlayableAdActivity, view});
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws JSONException, NoSuchMethodException, SecurityException {
        int i9 = 2 % 2;
        int i10 = IEngagementSignalsCallback + 59;
        warmup = i10 % 128;
        int i11 = i10 % 2;
        onExtraCallbackWithResult(nativeAdsPlayableAdActivity, view, i, i2, i3, i4, i5, i6, i7, i8);
        int i12 = warmup + 3;
        IEngagementSignalsCallback = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 107;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return setEngagementSignalsCallback(nativeAdsPlayableAdActivity);
        }
        setEngagementSignalsCallback(nativeAdsPlayableAdActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onTransact(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 71;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zRequestPostMessageChannel = requestPostMessageChannel(nativeAdsPlayableAdActivity);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return zRequestPostMessageChannel;
    }

    public static /* synthetic */ WindowInsetsCompat onWarmupCompleted(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 61;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatIAuthTabCallback = IAuthTabCallback(view, windowInsetsCompat);
        int i4 = IEngagementSignalsCallback + 43;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 105;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strPrefetch = prefetch(nativeAdsPlayableAdActivity);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return strPrefetch;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, WebView webView, String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 73;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsPlayableAdActivity, webView, str);
        int i4 = IEngagementSignalsCallback + 89;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 13;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsPlayableAdActivity, nativeAdsDto, setDetectableSize);
        int i4 = IEngagementSignalsCallback + 125;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, JSONObject jSONObject) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 115;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsPlayableAdActivity, jSONObject);
        int i4 = IEngagementSignalsCallback + 71;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 69;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(view, valueAnimator);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 21;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        newSessionWithExtras(nativeAdsPlayableAdActivity);
        int i4 = warmup + 75;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view) {
        int i = 2 % 2;
        int i2 = warmup + 35;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 709694135, -709694114, new Object[]{nativeAdsPlayableAdActivity, view})).booleanValue();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult4, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, 709694135, -709694114, new Object[]{nativeAdsPlayableAdActivity, view})).booleanValue();
        int i3 = IEngagementSignalsCallback + 61;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ boolean onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = warmup + 31;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(nativeAdsPlayableAdActivity, view, motionEvent);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = warmup + 9;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallback;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 123;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -386710825, 386710850, new Object[0]);
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallbackWithResult4, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, -386710825, 386710850, new Object[0]);
        int i3 = 87 / 0;
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 53;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = warmup + 73;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class extraCallback implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public extraCallback() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onExtraCallbackWithResult + 27;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            NativeAdsPlayableAdActivity.ICustomTabsService(NativeAdsPlayableAdActivity.this);
            int i12 = onExtraCallbackWithResult + 85;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 30 / 0;
            }
        }
    }

    public static final class extraCallbackWithResult implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ NativeAdsPlayableAdActivity onExtraCallbackWithResult;
        final /* synthetic */ TdsSkeletonV1View onNavigationEvent;
        final /* synthetic */ TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor onWarmupCompleted;

        public extraCallbackWithResult(TdsSkeletonV1View tdsSkeletonV1View, TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor, NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
            this.onNavigationEvent = tdsSkeletonV1View;
            this.onWarmupCompleted = getinterfacedescriptor;
            this.onExtraCallbackWithResult = nativeAdsPlayableAdActivity;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 69;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            float f = this.onNavigationEvent.getResources().getDisplayMetrics().density;
            double dOnExtraCallback = 0.0d;
            for (TdsSkeletonV1View.onExtraCallbackWithResult onextracallbackwithresult : this.onWarmupCompleted.onNavigationEvent()) {
                int i12 = onExtraCallback + 23;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                dOnExtraCallback += onextracallbackwithresult.onExtraCallback() + onextracallbackwithresult.onExtraCallbackWithResult();
            }
            float f2 = (float) dOnExtraCallback;
            TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor = this.onWarmupCompleted;
            int iOnExtraCallback = getinterfacedescriptor.onNavigationEvent(getinterfacedescriptor.onNavigationEvent().size()).onExtraCallback();
            TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor2 = this.onWarmupCompleted;
            float fOnExtraCallbackWithResult = (f2 + ((iOnExtraCallback + getinterfacedescriptor2.onNavigationEvent(getinterfacedescriptor2.onNavigationEvent().size()).onExtraCallbackWithResult()) * this.onWarmupCompleted.IAuthTabCallback())) * f;
            float fCoerceAtLeast = RangesKt.coerceAtLeast((view.getHeight() / 2.0f) - (fOnExtraCallbackWithResult / 2.0f), 0.0f);
            view.setPadding(view.getPaddingLeft(), (int) fCoerceAtLeast, view.getPaddingRight(), view.getPaddingBottom());
            NativeAdsPlayableAdActivity.onNavigationEvent(this.onExtraCallbackWithResult, "Skeleton centered: screenHeight=" + view.getHeight() + ", contentHeight=" + fOnExtraCallbackWithResult + ", topPadding=" + fCoerceAtLeast);
            int i14 = IAuthTabCallback + 101;
            onExtraCallback = i14 % 128;
            if (i14 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onMessageChannelReady extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ NativeAdsPlayableAdActivity onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onMessageChannelReady(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = nativeAdsPlayableAdActivity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            NativeAdsPlayableAdActivity.onNavigationEvent(this.onWarmupCompleted, "CoroutineException: " + th.getMessage());
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asBinder implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    int i3 = onWarmupCompleted + 105;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i5 = onWarmupCompleted + 9;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            throw null;
        }
    }

    public static final class onActivityLayout implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ View onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onActivityLayout(View view) {
            this.onWarmupCompleted = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.setTranslationX(0.0f);
            int i4 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onExtraCallbackWithResult implements Animator.AnimatorListener {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public onExtraCallbackWithResult(Function0 function0) {
            this.IAuthTabCallback = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.IAuthTabCallback;
            if (function0 != null) {
                function0.invoke();
            }
            int i4 = onNavigationEvent + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onMinimized implements Animator.AnimatorListener {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ View IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 96 / 0;
            }
        }

        public onMinimized(View view) {
            this.IAuthTabCallback = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            this.IAuthTabCallback.setTranslationX(i2 % 2 == 0 ? 1.0f : 0.0f);
        }
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int i = 2 % 2;
        int i2 = warmup + 53;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.IAuthTabCallbackStub(str);
        int i4 = warmup + 7;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        long j;
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 75;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            j = nativeAdsPlayableAdActivity.ICustomTabsCallback;
            int i3 = 14 / 0;
        } else {
            j = nativeAdsPlayableAdActivity.ICustomTabsCallback;
        }
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback;
        int i3 = i2 + 101;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Long l = nativeAdsPlayableAdActivity.writeTypedObject;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 71;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public static final /* synthetic */ getScaleY ICustomTabsCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 111;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        getScaleY getscaleyIAuthTabCallbackStubProxy = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy();
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return getscaleyIAuthTabCallbackStubProxy;
    }

    public static final /* synthetic */ NativeAdsManager ICustomTabsCallbackDefault(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback;
        int i3 = i2 + 89;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsManager nativeAdsManager = nativeAdsPlayableAdActivity.isEngagementSignalsApiAvailable;
        int i5 = i2 + 115;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return nativeAdsManager;
        }
        throw null;
    }

    public static final /* synthetic */ NativeAdsDto.Creative.PlayableAd ICustomTabsCallbackStub(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 91;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.PlayableAd playableAd = nativeAdsPlayableAdActivity.prefetch;
        if (i3 == 0) {
            return playableAd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String ICustomTabsCallbackStubProxy(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 83;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeAdsPlayableAdActivity.onMinimized();
        }
        nativeAdsPlayableAdActivity.onMinimized();
        throw null;
    }

    public static final /* synthetic */ runOnUiThreadDelayed ICustomTabsCallback_Parcel(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 71;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsPlayableAdActivity.onActivityResized();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnActivityResized = nativeAdsPlayableAdActivity.onActivityResized();
        int i3 = warmup + 21;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return runonuithreaddelayedOnActivityResized;
    }

    public static final /* synthetic */ void ICustomTabsService(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 93;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.ICustomTabsCallbackDefault();
        int i4 = IEngagementSignalsCallback + 5;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback;
        int i3 = i2 + 55;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Long l = nativeAdsPlayableAdActivity.readTypedObject;
        int i5 = i2 + 125;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 101;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        AtomicInteger atomicInteger = nativeAdsPlayableAdActivity.receiveFile;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return atomicInteger;
    }

    public static final /* synthetic */ void asInterface(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 43;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.onNavigationEvent(str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long extraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 59;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy;
        int i5 = i3 + 59;
        IEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return j;
    }

    public static final /* synthetic */ zzad extraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 23;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsPlayableAdActivity.IAuthTabCallback_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzad zzadVarIAuthTabCallback_Parcel = nativeAdsPlayableAdActivity.IAuthTabCallback_Parcel();
        int i3 = warmup + 37;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return zzadVarIAuthTabCallback_Parcel;
    }

    public static final /* synthetic */ void newAuthTabSession(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws JSONException {
        int i = 2 % 2;
        int i2 = warmup + 95;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.ICustomTabsService();
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = IEngagementSignalsCallback + 111;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ String onActivityResized(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 47;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String strWriteTypedObject = nativeAdsPlayableAdActivity.writeTypedObject();
        int i4 = IEngagementSignalsCallback + 47;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return strWriteTypedObject;
    }

    public static final /* synthetic */ void onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int i = 2 % 2;
        int i2 = warmup + 55;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 594268570, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 1043151220, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 98253091, VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), 1649183490, -1649183457, new Object[]{nativeAdsPlayableAdActivity, str});
        int i4 = IEngagementSignalsCallback + 95;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, boolean z) {
        int i = 2 % 2;
        int i2 = warmup + 119;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        nativeAdsPlayableAdActivity.IAuthTabCallback_Parcel = z;
        int i5 = i3 + 69;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 7;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.asBinder(str);
        int i4 = warmup + 59;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return null;
    }

    public static final /* synthetic */ String onMinimized(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 1;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return nativeAdsPlayableAdActivity.extraCallback();
        }
        nativeAdsPlayableAdActivity.extraCallback();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 7;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.onWarmupCompleted(str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 39;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iOnMessageChannelReady = nativeAdsPlayableAdActivity.onMessageChannelReady();
        int i4 = warmup + 67;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iOnMessageChannelReady);
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 87;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto typedObject = nativeAdsPlayableAdActivity.readTypedObject();
        int i4 = IEngagementSignalsCallback + 75;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setInternalPageChangeListener onRelationshipValidationResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 15;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return nativeAdsPlayableAdActivity.extraCallbackWithResult();
        }
        nativeAdsPlayableAdActivity.extraCallbackWithResult();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = warmup + 117;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeAdsPlayableAdActivity.onExtraCallback(str, str2);
        }
        nativeAdsPlayableAdActivity.onExtraCallback(str, str2);
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 65;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1395696170, -1395696142, new Object[]{nativeAdsPlayableAdActivity});
        int i4 = warmup + 59;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void postMessage(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws JSONException, NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = warmup + 33;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.mayLaunchUrl();
        int i4 = IEngagementSignalsCallback + 79;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ AudioManager readTypedObject(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 93;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        AudioManager audioManager = nativeAdsPlayableAdActivity.IAuthTabCallbackStub;
        int i5 = i3 + 33;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            return audioManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean writeTypedObject(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 3;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        boolean z = nativeAdsPlayableAdActivity.asInterface;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 35;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return z;
    }

    public static final class IAuthTabCallbackDefault implements calculatePageOffsets.onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(nativeAdsPlayableAdActivity, charSequence);
            int i4 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
        }

        public static /* synthetic */ void onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(nativeAdsPlayableAdActivity);
            int i4 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        IAuthTabCallbackDefault() {
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback();
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onEvent(NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onEvent(nativeAdsEventLogType);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onNavigationEvent(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onNavigationEvent(charSequence);
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 66 / 0;
            }
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Activity, im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity] */
        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void IAuthTabCallback(final CharSequence charSequence) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            final ?? r1 = NativeAdsPlayableAdActivity.this;
            r1.runOnUiThread(new Runnable() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$networkLogCallback$1$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 123;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    NativeAdsPlayableAdActivity.IAuthTabCallbackDefault.onExtraCallbackWithResult(r1, charSequence);
                    int i5 = onExtraCallback + 67;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void onWarmupCompleted(final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, CharSequence charSequence) {
            int i = 2 % 2;
            NativeAdsPlayableAdActivity.ICustomTabsCallback(nativeAdsPlayableAdActivity).IAuthTabCallbackStubProxy.append("\n");
            NativeAdsPlayableAdActivity.ICustomTabsCallback(nativeAdsPlayableAdActivity).IAuthTabCallbackStubProxy.append(charSequence);
            NativeAdsPlayableAdActivity.ICustomTabsCallback(nativeAdsPlayableAdActivity).access000.post(new Runnable() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$networkLogCallback$1$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 9;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    NativeAdsPlayableAdActivity.IAuthTabCallbackDefault.onWarmupCompleted(nativeAdsPlayableAdActivity);
                    int i5 = onExtraCallbackWithResult + 69;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                }
            });
            int i2 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 63 / 0;
            }
        }

        private static final void onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsPlayableAdActivity.ICustomTabsCallback(nativeAdsPlayableAdActivity).access000.fullScroll(130);
            int i4 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 4090;
        private static char onExtraCallback = 63975;
        private static char onExtraCallbackWithResult = 64761;
        private static char onNavigationEvent = 41062;
        private static int onTransact = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $10 + 73;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                char c = 1;
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    char[] cArr4 = cArr3;
                    int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                    int i9 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(IAuthTabCallback);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[c] = Integer.valueOf(i8);
                        objArr2[0] = Integer.valueOf(c2);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int i10 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iResolveSize = View.resolveSize(0, 0) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, i10, iResolveSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr4[c] = cCharValue;
                        int i11 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (-16777206) - Color.rgb(0, 0, 0), Gravity.getAbsoluteGravity(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i11 + 1;
                        cArr3 = cArr4;
                        i3 = 0;
                        c = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 16014), 14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 19901 - View.resolveSizeAndState(0, 0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = $11 + 59;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i14 = $11 + 105;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            objArr[0] = str;
        }

        private onWarmupCompleted() {
        }

        public static final /* synthetic */ String IAuthTabCallback(onWarmupCompleted onwarmupcompleted, String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = onwarmupcompleted.IAuthTabCallback(str);
            int i4 = onTransact + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return strIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final String IAuthTabCallback(String str) {
            int i = 2 % 2;
            String str2 = "playable_nudge_shown:" + str;
            int i2 = onWarmupCompleted + 9;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
            return str2;
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull NativeAdsDto nativeAdsDto, @NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) NativeAdsPlayableAdActivity.class);
            intent.putExtra("native_ads_request_id", nativeAdsDto.IAuthTabCallbackStub());
            intent.putExtra("native_ads_space_unit_id", str);
            intent.putExtra("native_ads_extra", nativeAdsDto);
            Object[] objArr = new Object[1];
            a(new char[]{7565, 59502, 4129, 49707, 54560, 20012, 41606, 15792}, Color.blue(0) + 8, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str2);
            intent.putExtra("testIndex", num);
            intent.putExtra("forcedPlayableUrl", str3);
            int i2 = onWarmupCompleted + 41;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<LayoutInflater, getScaleY> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        onExtraCallback() {
            super(1, getScaleY.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lim/toss/ads_sdk/databinding/AdsSdkActivityPlayableWebviewBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getScaleY getscaleyOnNavigationEvent = onNavigationEvent((LayoutInflater) obj);
            int i4 = onWarmupCompleted + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getscaleyOnNavigationEvent;
        }

        public final getScaleY onNavigationEvent(LayoutInflater layoutInflater) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(layoutInflater, "");
                return getScaleY.IAuthTabCallback(layoutInflater);
            }
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            int i3 = 19 / 0;
            return getScaleY.IAuthTabCallback(layoutInflater);
        }
    }

    private final getScaleY IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 81;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        getScaleY getscaley = (getScaleY) this.asBinder.getValue();
        int i4 = IEngagementSignalsCallback + 5;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return getscaley;
    }

    public final FragmentStateAdapter4 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 43;
        int i3 = i2 % 128;
        warmup = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        FragmentStateAdapter4 fragmentStateAdapter4 = this.appInfoProvider;
        if (fragmentStateAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 123;
        int i5 = i4 % 128;
        IEngagementSignalsCallback = i5;
        if (i4 % 2 == 0) {
            int i6 = 91 / 0;
        }
        int i7 = i5 + 63;
        warmup = i7 % 128;
        int i8 = i7 % 2;
        return fragmentStateAdapter4;
    }

    public final pageRight onTransact() {
        int i = 2 % 2;
        int i2 = warmup + 77;
        IEngagementSignalsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        pageRight pageright = this.httpClientFactory;
        if (pageright != null) {
            return pageright;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = warmup + 1;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 41;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = this.adsSdkPrefs;
        if (textRoundCornerProgressBarSavedState1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 97;
        IEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    public final zzad asBinder() {
        int i = 2 % 2;
        int i2 = warmup + 123;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        zzad zzadVar = this.injectedEnvironments;
        if (zzadVar != null) {
            int i5 = i3 + 45;
            warmup = i5 % 128;
            int i6 = i5 % 2;
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = warmup + 3;
        IEngagementSignalsCallback = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private final zzad IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        Object obj = null;
        if (this.injectedEnvironments == null) {
            auth.IAuthTabCallback(auth.onNavigationEvent, new IllegalStateException("environments accessed before injection: NativeAdsPlayableAdActivity"), null, 2, null);
            zzad zzadVarOnNavigationEvent = zzaj.onNavigationEvent();
            int i2 = IEngagementSignalsCallback + 77;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                return zzadVarOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = warmup + 13;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return asBinder();
        }
        asBinder();
        throw null;
    }

    private final int onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 11;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.requestPostMessageChannel.getValue()).intValue();
        int i4 = warmup + 71;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        AppCompatActivity appCompatActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 95;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int intExtra = appCompatActivity.getIntent().getIntExtra("testIndex", -1);
        int i4 = warmup + 1;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(intExtra);
        }
        int i5 = 35 / 0;
        return Integer.valueOf(intExtra);
    }

    private final String extraCallback() {
        int i = 2 % 2;
        int i2 = warmup + 51;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onMessageChannelReady.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String prefetch(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 67;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = nativeAdsPlayableAdActivity.getIntent();
        if (i3 != 0) {
            intent.getStringExtra("forcedPlayableUrl");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String stringExtra = intent.getStringExtra("forcedPlayableUrl");
        if (stringExtra == null) {
            stringExtra = "";
        }
        int i4 = warmup + 33;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private final NativeAdsDto readTypedObject() {
        int i = 2 % 2;
        int i2 = warmup + 117;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDto = (NativeAdsDto) this.mayLaunchUrl.getValue();
        int i4 = IEngagementSignalsCallback + 31;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return nativeAdsDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final NativeAdsDto prefetchWithMultipleUrls(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 45;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Parcelable parcelableExtra = nativeAdsPlayableAdActivity.getIntent().getParcelableExtra("native_ads_extra");
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        NativeAdsDto nativeAdsDto = (NativeAdsDto) parcelableExtra;
        if (nativeAdsDto != null) {
            return nativeAdsDto;
        }
        NativeAdsDto nativeAdsDto2 = new NativeAdsDto((String) null, (String) null, (String) null, (String) null, (List) null, (NativeAdsDto.ExtraInfo) null, 63, (DefaultConstructorMarker) null);
        int i4 = warmup + 19;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return nativeAdsDto2;
        }
        obj.hashCode();
        throw null;
    }

    private final String onMinimized() {
        int i = 2 % 2;
        int i2 = warmup + 47;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.newSession.getValue();
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IEngagementSignalsCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        String stringExtra = nativeAdsPlayableAdActivity.getIntent().getStringExtra("native_ads_space_unit_id");
        if (stringExtra == null) {
            stringExtra = "";
            int i2 = IEngagementSignalsCallback + 59;
            warmup = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = warmup + 121;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public final calculatePageOffsets asInterface() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 29;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsManager nativeAdsManager = this.isEngagementSignalsApiAvailable;
        Object obj = null;
        if (nativeAdsManager == null) {
            return null;
        }
        int i5 = i2 + 87;
        IEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return nativeAdsManager.onExtraCallbackWithResult();
        }
        nativeAdsManager.onExtraCallbackWithResult();
        obj.hashCode();
        throw null;
    }

    private final float access100() {
        int i = 2 % 2;
        int i2 = warmup + 113;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        float f = getResources().getDisplayMetrics().density;
        int i4 = IEngagementSignalsCallback + 87;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return f;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = warmup + 53;
        IEngagementSignalsCallback = i2 % 128;
        int iAccess100 = (int) (i2 % 2 == 0 ? iIntValue + nativeAdsPlayableAdActivity.access100() : iIntValue / nativeAdsPlayableAdActivity.access100());
        int i3 = IEngagementSignalsCallback + 75;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            return Integer.valueOf(iAccess100);
        }
        throw null;
    }

    public static final class IAuthTabCallback implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdsDto IAuthTabCallback;

        public IAuthTabCallback(NativeAdsDto nativeAdsDto) {
            this.IAuthTabCallback = nativeAdsDto;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            if (i3 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.IAuthTabCallback(this.IAuthTabCallback);
                int i4 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class asInterface implements Function1<setTrimPathOffset, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public asInterface() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                Object[] objArr = {NativeAdsPlayableAdActivity.this};
                settrimpathoffset.onNavigationEvent((NativeAdsDto) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1362740741, 1362740770, objArr));
                int i4 = onExtraCallback + 39;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class getInterfaceDescriptor implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsDto.Reward IAuthTabCallback;

        public getInterfaceDescriptor(NativeAdsDto.Reward reward) {
            this.IAuthTabCallback = reward;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                    settrimpathoffset.onExtraCallbackWithResult(this.IAuthTabCallback);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(settrimpathoffset, "");
                settrimpathoffset.onExtraCallbackWithResult(this.IAuthTabCallback);
                int i3 = onWarmupCompleted + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(ICustomTabsServiceStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 43424), 42 - (KeyEvent.getMaxKeyCode() >> 16), 22439 - TextUtils.indexOf("", "", 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = ICustomTabsServiceDefault;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 12844), 55 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2166, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = ICustomTabsServiceDefault;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(requestPostMessageChannelWithExtras)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 43424), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (ICustomTabsServiceStub ^ (-4629411779493505016L))));
                    int i6 = $11 + 37;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (validateRelationship[i + ((int) (requestPostMessageChannelWithExtras ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (ICustomTabsServiceStub ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i8 = ((i + iIntValue) - 2) + ((int) (requestPostMessageChannelWithExtras ^ j));
                if (z2) {
                    int i9 = $10 + 33;
                    $11 = i9 % 128;
                    int i10 = i9 % 2 == 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i8 + i10;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(updateVisuals), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 86 - Color.red(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = ICustomTabsServiceDefault;
                    if (bArr4 != null) {
                        int i11 = $10 + 79;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i14 = $10 + 109;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            int i16 = $10 + 113;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            byte[] bArr6 = ICustomTabsServiceDefault;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = validateRelationship;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i18 = $11 + 5;
                            $10 = i18 % 128;
                            int i19 = i18 % 2;
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final setInternalPageChangeListener extraCallbackWithResult() {
        setInternalPageChangeListener setinternalpagechangelistener;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 65;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.postMessage.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            setinternalpagechangelistener = (setInternalPageChangeListener) value;
            int i3 = 29 / 0;
        } else {
            Object value2 = this.postMessage.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            setinternalpagechangelistener = (setInternalPageChangeListener) value2;
        }
        int i4 = warmup + 9;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return setinternalpagechangelistener;
    }

    private static final setInternalPageChangeListener ICustomTabsServiceStub(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        OkHttpClient.Builder builderIAuthTabCallback = nativeAdsPlayableAdActivity.onTransact().IAuthTabCallback();
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        setInternalPageChangeListener setinternalpagechangelistener = (setInternalPageChangeListener) new Retrofit.Builder().IAuthTabCallback(nativeAdsPlayableAdActivity.IAuthTabCallback_Parcel().onNavigationEvent()).onExtraCallback(deleteCert.IAuthTabCallback()).onExtraCallbackWithResult(builderIAuthTabCallback.connectTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(10, setrevision)).readTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(10, setrevision)).build()).IAuthTabCallback().onNavigationEvent(setInternalPageChangeListener.class);
        int i2 = warmup + 25;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        return setinternalpagechangelistener;
    }

    private static final WindowInsetsCompat IAuthTabCallback(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iAsBinder = WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iAsBinder);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(iAsBinder, CameraControllerExternalSyntheticLambda0.onNavigationEvent).onExtraCallbackWithResult();
        int i2 = warmup + 79;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return windowInsetsCompatOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    @Override // im.toss.ads_sdk.playable.Hilt_NativeAdsPlayableAdActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 107;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            nativeAdsManagerOnExtraCallback.hashCode();
            throw null;
        }
        super.onCreate(bundle);
        int i3 = 0;
        this.asInterface = bundle != null ? bundle.getBoolean("ads_can_close", false) : false;
        long j = 0;
        if (bundle != null) {
            j = bundle.getLong("ads_countdown_remaining_ms", 0L);
            int i4 = IEngagementSignalsCallback + 39;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        }
        this.access100 = j;
        EasingFunctionsKtExternalSyntheticLambda3.onWarmupCompleted(IAuthTabCallbackStubProxy().onExtraCallbackWithResult());
        this.onUnminimized = true;
        getInterfaceDescriptor();
        if (!ICustomTabsCallbackStubProxy()) {
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("native_ads_request_id");
        if (stringExtra == null) {
            int i6 = warmup + 31;
            IEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
            stringExtra = "";
        }
        nativeAdsManagerOnExtraCallback = stringExtra.length() > 0 ? getPlatformCallback.IAuthTabCallback.onExtraCallback(stringExtra) : null;
        if (nativeAdsManagerOnExtraCallback == null) {
            nativeAdsManagerOnExtraCallback = ((NativeAdsManager.onWarmupCompleted) Response.onWarmupCompleted(this, NativeAdsManager.onWarmupCompleted.class)).onTransact();
        }
        this.isEngagementSignalsApiAvailable = nativeAdsManagerOnExtraCallback;
        if (nativeAdsManagerOnExtraCallback != null) {
            int i8 = warmup + 71;
            IEngagementSignalsCallback = i8 % 128;
            int i9 = i8 % 2;
            nativeAdsManagerOnExtraCallback.onExtraCallback((TextFieldScrollKtExternalSyntheticLambda0) this);
        }
        if (IAuthTabCallback_Parcel().MediaMetadataCompat()) {
            int i10 = IEngagementSignalsCallback + 3;
            warmup = i10 % 128;
            int i11 = i10 % 2;
            if (IAuthTabCallback_Parcel().RemoteActionCompatParcelizer() || IAuthTabCallback_Parcel().MediaBrowserCompatMediaItem()) {
                newSession();
            } else {
                int i12 = warmup + 83;
                IEngagementSignalsCallback = i12 % 128;
                int i13 = i12 % 2;
                if (IAuthTabCallback_Parcel().onActivityLayout()) {
                }
            }
        }
        RepeatableSpec.onExtraCallbackWithResult(getWindow(), false);
        getWindow().setStatusBarColor(0);
        new SuspendAnimationKtExternalSyntheticLambda0(getWindow(), getWindow().getDecorView()).onNavigationEvent(false);
        ViewCompat.onWarmupCompleted(IAuthTabCallbackStubProxy().onExtraCallbackWithResult(), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda30());
        getWindow().setNavigationBarColor(-16777216);
        setContentView(IAuthTabCallbackStubProxy().onExtraCallbackWithResult());
        Object systemService = getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "");
        this.IAuthTabCallbackStub = (AudioManager) systemService;
        requestPostMessageChannelWithExtras();
        extraCommand();
        onNavigationEvent(readTypedObject(), (NativeAdsDto.AdAsset) CollectionsKt.first(readTypedObject().onExtraCallbackWithResult()));
        if (readTypedObject().access100()) {
            TdsRoundLayout tdsRoundLayout = IAuthTabCallbackStubProxy().IAuthTabCallbackStub;
            Configuration configuration = getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsRoundLayout.setBackgroundColor(new getUrlokhttp(new IAuthTabCallbackStub(configuration)).requestPostMessageChannel().onUnminimized());
            IAuthTabCallbackStubProxy().onWarmupCompleted.setV2Style(true);
            int i14 = warmup + 25;
            IEngagementSignalsCallback = i14 % 128;
            int i15 = i14 % 2;
        } else {
            AdsCircularCountdownLayout adsCircularCountdownLayout = IAuthTabCallbackStubProxy().onWarmupCompleted;
            Configuration configuration2 = getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            adsCircularCountdownLayout.setCloseBackgroundColor(new getUrlokhttp(new asBinder(configuration2)).requestPostMessageChannel().onMinimized());
        }
        IAuthTabCallbackStubProxy().onWarmupCompleted.setCloseGradientVisible(false);
        TdsRoundLayout tdsRoundLayout2 = IAuthTabCallbackStubProxy().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        if (!readTypedObject().onTransact().asBinder()) {
            i3 = 8;
        } else {
            int i16 = warmup + 115;
            IEngagementSignalsCallback = i16 % 128;
            int i17 = i16 % 2;
        }
        tdsRoundLayout2.setVisibility(i3);
        receiveFile();
    }

    private static final void onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view) {
        int i = 2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = nativeAdsPlayableAdActivity.onExtraCallbackWithResult();
        onWarmupCompleted onwarmupcompleted = Companion;
        NativeAdsDto.Creative.PlayableAd playableAd = nativeAdsPlayableAdActivity.prefetch;
        if (playableAd == null) {
            int i2 = IEngagementSignalsCallback + 11;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            playableAd = null;
        }
        textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult.onTransact(onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, playableAd.IAuthTabCallback()));
        int i4 = warmup + 123;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void newSession() {
        int i = 2 % 2;
        IAuthTabCallbackStubProxy().onNavigationEvent.setOnLongClickListener(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda33(this));
        IAuthTabCallbackStubProxy().onNavigationEvent.setOnClickListener(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda34(this));
        calculatePageOffsets calculatepageoffsetsAsInterface = asInterface();
        if (calculatepageoffsetsAsInterface != null) {
            int i2 = IEngagementSignalsCallback + 23;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            calculatepageoffsetsAsInterface.onWarmupCompleted(this.ICustomTabsService);
            int i4 = warmup + 19;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        IAuthTabCallbackStubProxy().access000.setOnTouchListener(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda35());
        IAuthTabCallbackStubProxy().access000.setClickable(false);
        IAuthTabCallbackStubProxy().access000.setFocusable(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access100(Object[] objArr) {
        NativeAdsDto.Creative.PlayableAd playableAd;
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 39;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(nativeAdsPlayableAdActivity.receiveFile.get()));
            setDetectableSize.onExtraCallback("click_type", "share");
            playableAd = nativeAdsPlayableAdActivity.prefetch;
            int i3 = 90 / 0;
            if (playableAd == null) {
                int i4 = IEngagementSignalsCallback + 89;
                warmup = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                playableAd = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(nativeAdsPlayableAdActivity.receiveFile.get()));
            setDetectableSize.onExtraCallback("click_type", "share");
            playableAd = nativeAdsPlayableAdActivity.prefetch;
            if (playableAd == null) {
            }
        }
        setDetectableSize.onExtraCallback("ad_id", playableAd.IAuthTabCallback());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", nativeAdsPlayableAdActivity.onMinimized());
        setDetectableSize.onExtraCallback("ssp_request_id", nativeAdsPlayableAdActivity.readTypedObject().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("share_yn", "N");
        Unit unit = Unit.INSTANCE;
        int i6 = IEngagementSignalsCallback + 23;
        warmup = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, View view) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1229795L, false, null, null, new Function1() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda46
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = NativeAdsPlayableAdActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
                int i5 = onExtraCallback + 85;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, 14, null);
        FragmentStateAdapter4 fragmentStateAdapter4IAuthTabCallbackStub = nativeAdsPlayableAdActivity.IAuthTabCallbackStub();
        NativeAdsDto.Creative.PlayableAd playableAd = nativeAdsPlayableAdActivity.prefetch;
        if (playableAd == null) {
            int i2 = warmup + 33;
            IEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 25 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            playableAd = null;
        }
        String strIAuthTabCallback = convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback(str, "adId", playableAd.IAuthTabCallback()), "advertiseSpaceId", nativeAdsPlayableAdActivity.onMinimized()), "requestId", nativeAdsPlayableAdActivity.readTypedObject().IAuthTabCallbackStub());
        Object[] objArr = new Object[1];
        a((short) Color.red(0), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1099667829) - View.resolveSize(0, 0), 2145922908 + ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf("", "", 0, 0) - 73, objArr);
        fragmentStateAdapter4IAuthTabCallbackStub.onExtraCallback(nativeAdsPlayableAdActivity, convertAnyToMap.IAuthTabCallback(strIAuthTabCallback, ((String) objArr[0]).intern(), "true"));
        int i4 = IEngagementSignalsCallback + 63;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity] */
    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        ?? r1 = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 1;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsRoundLayout tdsRoundLayout = r1.IAuthTabCallbackStubProxy().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        r1.onNavigationEvent(tdsRoundLayout);
        minFresh.onNavigationEvent((Context) r1, noStore.Companion.access100());
        int i4 = IEngagementSignalsCallback + 83;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r4 = o.getStrokeWidth.onExtraCallback;
        r5 = IAuthTabCallbackStubProxy().IAuthTabCallbackStub;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        o.getStrokeWidth.onExtraCallback(r4, r5, false, null, 0, null, null, 0.0f, 0.98f, null, false, 0, null, null, new im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$.ExternalSyntheticLambda1(r22), 4030, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r22.ICustomTabsCallbackDefault != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r22.ICustomTabsCallbackDefault != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r3 = null;
        IAuthTabCallbackStubProxy().IAuthTabCallbackStub.setOnTouchListener(null);
        IAuthTabCallbackStubProxy().IAuthTabCallbackStub.setOnClickListener(new im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$.ExternalSyntheticLambda0(r22));
        r2 = im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity.IEngagementSignalsCallback + 3;
        im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity.warmup = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 33;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsServiceStub();
            int i3 = 17 / 0;
        } else {
            ICustomTabsServiceStub();
        }
    }

    private static final Unit IAuthTabCallbackStub(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = warmup + 91;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IEngagementSignalsCallback + 97;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        NativeAdsEventLogType nativeAdsEventLogType;
        calculatePageOffsets calculatepageoffsetsAsInterface;
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 109;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy = nativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy;
            nativeAdsPlayableAdActivity.ICustomTabsServiceStub();
            nativeAdsPlayableAdActivity.ICustomTabsService();
            if (nativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy) {
                int i3 = warmup + 47;
                IEngagementSignalsCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    NativeAdsEventLogType.writeTypedObject writetypedobject = NativeAdsEventLogType.writeTypedObject.onExtraCallback;
                    throw null;
                }
                nativeAdsEventLogType = NativeAdsEventLogType.writeTypedObject.onExtraCallback;
            } else {
                nativeAdsEventLogType = NativeAdsEventLogType.onPostMessage.IAuthTabCallback;
            }
        } else {
            nativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy = true ^ nativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy;
            nativeAdsPlayableAdActivity.ICustomTabsServiceStub();
            nativeAdsPlayableAdActivity.ICustomTabsService();
            if (nativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy) {
            }
        }
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(nativeAdsPlayableAdActivity.readTypedObject().onExtraCallbackWithResult());
        if (adAsset != null && (calculatepageoffsetsAsInterface = nativeAdsPlayableAdActivity.asInterface()) != null) {
            calculatepageoffsetsAsInterface.onNavigationEvent(nativeAdsPlayableAdActivity.readTypedObject().IAuthTabCallbackStub(), adAsset, nativeAdsEventLogType, new Function1() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda9
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 67;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitIAuthTabCallback = NativeAdsPlayableAdActivity.IAuthTabCallback((NativeAdsEventLogType) obj);
                    int i7 = onExtraCallbackWithResult + 101;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            });
        }
        return Unit.INSTANCE;
    }

    private final void ICustomTabsServiceStub() throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 21;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            if (!(!this.ICustomTabsCallbackStubProxy)) {
                Object[] objArr = new Object[1];
                a((short) KeyEvent.getDeadChar(0, 0), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getTapTimeout() >> 16) - 1099667816, 2145922896 - Color.red(0), (-73) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a((short) View.getDefaultSize(0, 0), (byte) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getScrollBarSize() >> 8) - 1099667757, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2145922896, (ViewConfiguration.getJumpTapTimeout() >> 16) - 73, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                int i3 = IEngagementSignalsCallback + 87;
                warmup = i3 % 128;
                int i4 = i3 % 2;
            }
            TdsImageView tdsImageView = IAuthTabCallbackStubProxy().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsService() throws JSONException {
        int i = 2 % 2;
        infoForChild infoforchild = this.ICustomTabsCallback_Parcel;
        if (infoforchild == null) {
            int i2 = IEngagementSignalsCallback + 59;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        Object obj = null;
        if (this.ICustomTabsCallbackStubProxy) {
            if (infoforchild == null) {
                int i4 = warmup + 113;
                IEngagementSignalsCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                infoforchild = null;
            }
            infoforchild.onWarmupCompleted((Integer) 0);
            return;
        }
        if (infoforchild == null) {
            int i5 = IEngagementSignalsCallback + 7;
            warmup = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                obj.hashCode();
                throw null;
            }
            infoforchild = null;
        }
        infoforchild.onWarmupCompleted((Integer) 100);
        int i7 = IEngagementSignalsCallback + 37;
        warmup = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 63 / 0;
        }
    }

    private final boolean ICustomTabsCallbackStubProxy() {
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!(!StringsKt.isBlank(readTypedObject().IAuthTabCallbackStub()))) {
            int i2 = IEngagementSignalsCallback + 75;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(readTypedObject().onExtraCallbackWithResult());
        if (adAsset != null) {
            creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
            int i4 = warmup + 91;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            creativeOnExtraCallbackWithResult = null;
        }
        if (!(creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.PlayableAd)) {
            return false;
        }
        int i6 = IEngagementSignalsCallback + 59;
        warmup = i6 % 128;
        int i7 = i6 % 2;
        this.prefetch = (NativeAdsDto.Creative.PlayableAd) creativeOnExtraCallbackWithResult;
        return true;
    }

    public static /* synthetic */ void onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view, long j, long j2, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IEngagementSignalsCallback + 113;
            warmup = i3 % 128;
            int i4 = i3 % 2;
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            int i5 = IEngagementSignalsCallback + 61;
            int i6 = i5 % 128;
            warmup = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 125;
            IEngagementSignalsCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 / 3;
            }
            j2 = 600;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            function0 = null;
        }
        nativeAdsPlayableAdActivity.IAuthTabCallback(view, j3, j4, function0);
    }

    private static final void onExtraCallback(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = warmup + 51;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        view.setAlpha(((Float) animatedValue).floatValue());
        int i4 = IEngagementSignalsCallback + 125;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull View view, long j, long j2, @Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.setAlpha(0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onWarmupCompleted());
        valueAnimatorOfFloat.addUpdateListener(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda13(view));
        valueAnimatorOfFloat.start();
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new onExtraCallbackWithResult(function0));
        this.onPostMessage.add(valueAnimatorOfFloat);
        int i2 = warmup + 77;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private final Unit newSessionWithExtras() {
        int i = 2 % 2;
        IAuthTabCallbackStubProxy();
        NativeAdsDto.Creative.PlayableAd playableAd = this.prefetch;
        Object obj = null;
        if (playableAd == null) {
            int i2 = IEngagementSignalsCallback + 67;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            playableAd = null;
        }
        NativeAdsDto.Creative.EndCard endCardIAuthTabCallbackDefault = playableAd.IAuthTabCallbackDefault();
        if (endCardIAuthTabCallbackDefault == null) {
            return null;
        }
        int i4 = warmup + 63;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallbackStubProxy().IAuthTabCallbackDefault.onExtraCallbackWithResult(endCardIAuthTabCallbackDefault);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(NativeAdsDto.Creative.TutorialOverlay tutorialOverlay, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 37;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a((short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (-1116445048) - Color.rgb(0, 0, 0), 2145922908 + (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-74) - MotionEvent.axisFromString(""), objArr);
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "NativeAdsPlayableAdActivity - Lottie Load Failure", false, null, null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), tutorialOverlay.onWarmupCompleted()), getWrite.IAuthTabCallback("error", String.valueOf(th))}), null, 46, null);
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 121;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        NativeAdsDto.Creative.PlayableAd playableAd = nativeAdsPlayableAdActivity.prefetch;
        if (playableAd == null) {
            int i2 = warmup + 85;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = warmup + 39;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            playableAd = null;
        }
        setDetectableSize.onExtraCallback("ad_id", playableAd.IAuthTabCallback());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", nativeAdsPlayableAdActivity.onMinimized());
        setDetectableSize.onExtraCallback("ssp_request_id", nativeAdsPlayableAdActivity.readTypedObject().IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i6 = IEngagementSignalsCallback + 31;
        warmup = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsDto.Creative.TutorialOverlay $tutorial;
        int label;
        final /* synthetic */ NativeAdsPlayableAdActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(NativeAdsDto.Creative.TutorialOverlay tutorialOverlay, NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$tutorial = tutorialOverlay;
            this.this$0 = nativeAdsPlayableAdActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(this.$tutorial, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            access000 access000VarCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                access000VarCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = access000VarCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            long jDoubleValue;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Double dOnNavigationEvent = this.$tutorial.onNavigationEvent();
                if (dOnNavigationEvent != null) {
                    int i5 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        dOnNavigationEvent.doubleValue();
                        obj2.hashCode();
                        throw null;
                    }
                    jDoubleValue = (long) dOnNavigationEvent.doubleValue();
                } else {
                    jDoubleValue = 2500;
                }
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(jDoubleValue, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            NativeAdsPlayableAdActivity.ICustomTabsCallback_Parcel(this.this$0);
            return Unit.INSTANCE;
        }
    }

    private final runOnUiThreadDelayed validateRelationship() {
        int i = 2 % 2;
        int i2 = warmup + 105;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        getScaleY getscaleyIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        ConstraintLayout constraintLayout = getscaleyIAuthTabCallbackStubProxy.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        getscaleyIAuthTabCallbackStubProxy.asBinder.setAlpha(0.0f);
        getscaleyIAuthTabCallbackStubProxy.IAuthTabCallback_Parcel.setAlpha(0.0f);
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = getscaleyIAuthTabCallbackStubProxy.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout, AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 24, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        View view = getscaleyIAuthTabCallbackStubProxy.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(view, "");
        Object obj = null;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
        int i4 = warmup + 105;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return runonuithreaddelayedOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private final runOnUiThreadDelayed onActivityResized() {
        int i = 2 % 2;
        getScaleY getscaleyIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = getscaleyIAuthTabCallbackStubProxy.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.0f);
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout, isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        View view = getscaleyIAuthTabCallbackStubProxy.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(view, "");
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda6(getscaleyIAuthTabCallbackStubProxy), 1, (Object) null), false, 1, (Object) null);
        int i2 = IEngagementSignalsCallback + 79;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return runonuithreaddelayedOnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(getScaleY getscaley) {
        ConstraintLayout constraintLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 55;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            constraintLayout = getscaley.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            i = 39;
        } else {
            constraintLayout = getscaley.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            i = 8;
        }
        constraintLayout.setVisibility(i);
        Unit unit = Unit.INSTANCE;
        int i4 = IEngagementSignalsCallback + 71;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 17;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        if (!this.onRelationshipValidationResult) {
            this.onRelationshipValidationResult = true;
            runOnUiThread(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda12(this));
        } else {
            int i5 = i3 + 3;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final void newSessionWithExtras(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws Throwable {
        int i = 2 % 2;
        nativeAdsPlayableAdActivity.onWarmupCompleted(nativeAdsPlayableAdActivity.readTypedObject(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsPlayableAdActivity.readTypedObject().onExtraCallbackWithResult()));
        nativeAdsPlayableAdActivity.newAuthTabSession();
        nativeAdsPlayableAdActivity.newSessionWithExtras();
        nativeAdsPlayableAdActivity.prefetch();
        nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().getInterfaceDescriptor.onExtraCallbackWithResult();
        TdsRoundLayout tdsRoundLayout = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        onExtraCallback(nativeAdsPlayableAdActivity, tdsRoundLayout, 0L, 0L, null, 12, null);
        NativeAdsDto.Creative.PlayableAd playableAd = nativeAdsPlayableAdActivity.prefetch;
        if (playableAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = IEngagementSignalsCallback + 101;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 4;
            }
            playableAd = null;
        }
        if (playableAd.access100() != null) {
            int i4 = warmup + 37;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            TdsRoundLayout tdsRoundLayout2 = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
            onExtraCallback(nativeAdsPlayableAdActivity, tdsRoundLayout2, 100L, 0L, null, 12, null);
            TdsRoundLayout tdsRoundLayout3 = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout3, "");
            onExtraCallback(nativeAdsPlayableAdActivity, tdsRoundLayout3, 200L, 0L, null, 12, null);
            ConstraintLayout constraintLayout = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            onExtraCallback(nativeAdsPlayableAdActivity, constraintLayout, 300L, 0L, null, 12, null);
        } else {
            TdsRoundLayout tdsRoundLayout4 = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout4, "");
            onExtraCallback(nativeAdsPlayableAdActivity, tdsRoundLayout4, 100L, 0L, null, 12, null);
            ConstraintLayout constraintLayout2 = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            onExtraCallback(nativeAdsPlayableAdActivity, constraintLayout2, 200L, 0L, null, 12, null);
        }
        nativeAdsPlayableAdActivity.ICustomTabsService();
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 67;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            nativeAdsPlayableAdActivity.onWarmupCompleted(str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        nativeAdsPlayableAdActivity.onWarmupCompleted(str);
        int i3 = 78 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsServiceDefault(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 123;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.prefetchWithMultipleUrls();
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 107;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit validateRelationship(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 117;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.onPostMessage();
        Unit unit = Unit.INSTANCE;
        int i4 = IEngagementSignalsCallback + 35;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final boolean IAuthTabCallbackStub(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        getFillAlpha.onWarmupCompleted(nativeAdsPlayableAdActivity.isEngagementSignalsApiAvailable, nativeAdsPlayableAdActivity.readTypedObject().IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsPlayableAdActivity.readTypedObject().onExtraCallbackWithResult()), null, null, null, null, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda47(nativeAdsPlayableAdActivity, str), 60, null);
        int i2 = warmup + 37;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit access100(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        Object obj;
        int i = 2 % 2;
        int i2 = warmup + 23;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            getStrokeWidth.onExtraCallback.onExtraCallback((Context) nativeAdsPlayableAdActivity, str, 268435456);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            nativeAdsPlayableAdActivity.onWarmupCompleted("Failed to open landing url: " + th2.getMessage());
        }
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 103;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return unit;
    }

    private static final Unit updateVisuals(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 45;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsPlayableAdActivity.isEngagementSignalsApiAvailable();
            return Unit.INSTANCE;
        }
        nativeAdsPlayableAdActivity.isEngagementSignalsApiAvailable();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        if (nativeAdsPlayableAdActivity.asInterface) {
            int i2 = IEngagementSignalsCallback + 21;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            nativeAdsPlayableAdActivity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 93;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        int i = 2 % 2;
        int i2 = warmup + 11;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IEngagementSignalsCallback + 73;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, JSONObject jSONObject) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 51;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsPlayableAdActivity.ICustomTabsCallbackStub();
            int i3 = 65 / 0;
            if (jSONObject != null) {
                Object[] objArr = new Object[1];
                a((short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) Color.blue(0), (-1099667823) + (ViewConfiguration.getTapTimeout() >> 16), 2145922908 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-73) - ExpandableListView.getPackedPositionType(0L), objArr);
                nativeAdsPlayableAdActivity.onWarmupCompleted("MRAID Rendered detected: source=" + jSONObject.optString("source", ((String) objArr[0]).intern()) + ", latency=" + jSONObject.optLong("latencyMs", -1L) + "ms, hasAudio=" + jSONObject.optBoolean("hasAudio", true));
                nativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy = true;
                nativeAdsPlayableAdActivity.setEngagementSignalsCallback();
                nativeAdsPlayableAdActivity.ICustomTabsService();
                int i4 = warmup + 75;
                IEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                nativeAdsPlayableAdActivity.onWarmupCompleted("MRAID Rendered detected (no params)");
            }
        } else {
            nativeAdsPlayableAdActivity.ICustomTabsCallbackStub();
            if (jSONObject != null) {
            }
        }
        nativeAdsPlayableAdActivity.onActivityLayout();
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 49;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        webView.evaluateJavascript(str, null);
        int i4 = warmup + 15;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, WebView webView, String str) {
        int i = 2 % 2;
        int i2 = warmup + 85;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            boolean z = nativeAdsPlayableAdActivity.onUnminimized;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (nativeAdsPlayableAdActivity.onUnminimized) {
            nativeAdsPlayableAdActivity.runOnUiThread(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda18(webView, str));
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IEngagementSignalsCallback + 11;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class ICustomTabsCallback extends WebViewClient {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        ICustomTabsCallback() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String string = null;
            if (webResourceRequest != null) {
                int i5 = i2 + 51;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    webResourceRequest.getUrl();
                    string.hashCode();
                    throw null;
                }
                Uri url = webResourceRequest.getUrl();
                if (url != null) {
                    string = url.toString();
                    int i6 = IAuthTabCallback + 85;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            if (string == null) {
                int i8 = IAuthTabCallback + 49;
                int i9 = i8 % 128;
                onExtraCallback = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 69;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                string = "";
            }
            NativeAdsPlayableAdActivity.onNavigationEvent(NativeAdsPlayableAdActivity.this, "Navigation blocked: " + string + ". Use mraid.open() instead.");
            NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 501027462, -501027461, new Object[]{NativeAdsPlayableAdActivity.this, "unauthorized-navigation: " + string});
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String string;
            String scheme;
            Uri url;
            int i = 2 % 2;
            Object obj = null;
            if (webResourceRequest != null) {
                int i2 = IAuthTabCallback + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Uri url2 = webResourceRequest.getUrl();
                if (url2 != null) {
                    int i4 = IAuthTabCallback + 47;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        url2.toString();
                        obj.hashCode();
                        throw null;
                    }
                    string = url2.toString();
                } else {
                    string = null;
                }
            }
            if (string == null) {
                string = "";
            }
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                scheme = null;
            } else {
                int i5 = IAuthTabCallback + 17;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                scheme = url.getScheme();
            }
            if (scheme == null) {
                int i7 = IAuthTabCallback + 125;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 / 4;
                }
                scheme = "";
            }
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (!Intrinsics.areEqual(lowerCase, "http") && !Intrinsics.areEqual(lowerCase, "https")) {
                int i9 = onExtraCallback + 101;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                super.shouldInterceptRequest(webView, webResourceRequest);
                throw null;
            }
            NativeAdsPlayableAdActivity.onNavigationEvent(NativeAdsPlayableAdActivity.this, "External resource blocked: " + string);
            NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 501027462, -501027461, new Object[]{NativeAdsPlayableAdActivity.this, "external-resource-blocked: " + string});
            return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream(new byte[0]));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) throws JSONException, NoSuchMethodException, SecurityException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onPageFinished(webView, str);
            NativeAdsPlayableAdActivity.postMessage(NativeAdsPlayableAdActivity.this);
            NativeAdsPlayableAdActivity.newAuthTabSession(NativeAdsPlayableAdActivity.this);
            int i4 = IAuthTabCallback + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
        }
    }

    public static final class writeTypedObject extends WebChromeClient {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        writeTypedObject() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (consoleMessage != null) {
                NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = NativeAdsPlayableAdActivity.this;
                String strMessage = consoleMessage.message();
                NativeAdsPlayableAdActivity.onNavigationEvent(nativeAdsPlayableAdActivity, "JS " + consoleMessage.messageLevel() + ": " + strMessage);
                Intrinsics.checkNotNull(strMessage);
                NativeAdsPlayableAdActivity.onExtraCallback(nativeAdsPlayableAdActivity, strMessage);
                int i4 = onWarmupCompleted + 91;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 3;
                }
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    private static final boolean onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 93;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            motionEvent.getAction();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (motionEvent.getAction() != 0) {
            return false;
        }
        nativeAdsPlayableAdActivity.onWarmupCompleted("onTouch ACTION_DOWN");
        int i3 = IEngagementSignalsCallback + 53;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private static final void onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws JSONException, NoSuchMethodException, SecurityException {
        int i9 = 2 % 2;
        int i10 = warmup;
        int i11 = i10 + 107;
        IEngagementSignalsCallback = i11 % 128;
        int i12 = i11 % 2;
        if (i == i5 && i2 == i6) {
            int i13 = i10 + 91;
            IEngagementSignalsCallback = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            if (i3 == i7 && i4 == i8) {
                return;
            }
        }
        nativeAdsPlayableAdActivity.postMessage();
        int i14 = warmup + 113;
        IEngagementSignalsCallback = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        WebView webView = IAuthTabCallbackStubProxy().ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(webView, "");
        webView.setBackgroundColor(-16777216);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        infoForChild infoforchild = new infoForChild(this, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda19(this), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda21(this), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda22(this), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda23(this), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda24(this), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda25(this), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda26(this), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda27(), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda28(this, webView));
        NativeAdsDto.Creative.PlayableAd playableAd = this.prefetch;
        Object obj = null;
        if (playableAd == null) {
            int i2 = IEngagementSignalsCallback + 35;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 54 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            playableAd = null;
        }
        infoforchild.onNavigationEvent(playableAd.IAuthTabCallback());
        infoForChild.onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{infoforchild, onMinimized()}, 786479970, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -786479968, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        infoforchild.onWarmupCompleted(readTypedObject().IAuthTabCallbackStub());
        this.ICustomTabsCallback_Parcel = infoforchild;
        NativeAdsDto.Creative.PlayableAd playableAd2 = this.prefetch;
        if (playableAd2 == null) {
            int i4 = IEngagementSignalsCallback + 61;
            warmup = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            playableAd2 = null;
        }
        infoforchild.IAuthTabCallback(playableAd2.onWarmupCompleted());
        infoForChild infoforchild2 = this.ICustomTabsCallback_Parcel;
        if (infoforchild2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            infoforchild2 = null;
        }
        webView.addJavascriptInterface(infoforchild2, "TossMraid");
        webView.setLayerType(2, null);
        webView.setWebViewClient(new ICustomTabsCallback());
        webView.setWebChromeClient(new writeTypedObject());
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.setOnTouchListener(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda29(this));
        if (!webView.isLaidOut() || webView.isLayoutRequested()) {
            webView.addOnLayoutChangeListener(new extraCallback());
        } else {
            int i5 = warmup + 21;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
            ICustomTabsService(this);
            int i7 = IEngagementSignalsCallback + 111;
            warmup = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 5;
            }
        }
        webView.addOnLayoutChangeListener(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda20(this));
        this.extraCallbackWithResult = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onPostMessage() {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Object obj = null;
            if (this.onActivityResized.compareAndSet(false, true)) {
                int i2 = IEngagementSignalsCallback + 3;
                warmup = i2 % 128;
                if (i2 % 2 != 0) {
                    asInterface();
                    obj.hashCode();
                    throw null;
                }
                calculatePageOffsets calculatepageoffsetsAsInterface = asInterface();
                if (calculatepageoffsetsAsInterface != null) {
                    calculatePageOffsets.onExtraCallback(calculatepageoffsetsAsInterface, readTypedObject().IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(readTypedObject().onExtraCallbackWithResult()), NativeAdsEventLogType.onTransact.IAuthTabCallback, (Function1) null, 8, (Object) null);
                    int i3 = warmup + 31;
                    IEngagementSignalsCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
                runOnUiThread(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda14(this));
                if (this.ICustomTabsCallbackStubProxy) {
                    ICustomTabsService();
                }
            }
            NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(readTypedObject().onExtraCallbackWithResult());
            if (adAsset != null) {
                int i5 = IEngagementSignalsCallback + 95;
                warmup = i5 % 128;
                int i6 = i5 % 2;
                calculatePageOffsets calculatepageoffsetsAsInterface2 = asInterface();
                if (calculatepageoffsetsAsInterface2 != null) {
                    calculatepageoffsetsAsInterface2.onNavigationEvent(readTypedObject().IAuthTabCallbackStub(), adAsset, NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback, (Function1<? super NativeAdsEventLogType, Unit>) new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda15(this));
                }
            }
            int iAddAndGet = this.receiveFile.addAndGet(1);
            if (iAddAndGet == 1) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1229795L, false, null, null, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda16(iAddAndGet, this), 14, null);
            }
            Long l = this.readTypedObject;
            if (l != null && l.longValue() == 0) {
                int i7 = warmup + 9;
                IEngagementSignalsCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    this.readTypedObject = Long.valueOf(System.currentTimeMillis());
                    throw null;
                }
                this.readTypedObject = Long.valueOf(System.currentTimeMillis());
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private static final void newSession(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 57;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().ICustomTabsCallback.evaluateJavascript("console.log('PLAYABLE_FIRST_INTERACTION')", null);
            Result.constructor-impl(Unit.INSTANCE);
            int i4 = IEngagementSignalsCallback + 45;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.Companion;
            nativeAdsPlayableAdActivity.ICustomTabsCallback_Parcel();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    private static final Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        nativeAdsPlayableAdActivity.onExtraCallbackWithResult("VIEW_START logged: " + nativeAdsEventLogType);
        Unit unit = Unit.INSTANCE;
        int i2 = warmup + 47;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(int i, NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 13;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(i));
        setDetectableSize.onExtraCallback("click_type", "touch");
        NativeAdsDto.Creative.PlayableAd playableAd = nativeAdsPlayableAdActivity.prefetch;
        if (playableAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            playableAd = null;
        }
        setDetectableSize.onExtraCallback("ad_id", playableAd.IAuthTabCallback());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", nativeAdsPlayableAdActivity.onMinimized());
        setDetectableSize.onExtraCallback("ssp_request_id", nativeAdsPlayableAdActivity.readTypedObject().IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i5 = warmup + 101;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final void onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        int iDoubleValue;
        int i = 2 % 2;
        int i2 = warmup + 43;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Double dIAuthTabCallbackDefault = nativeAdsDto.onTransact().IAuthTabCallbackDefault();
        if (dIAuthTabCallbackDefault != null) {
            int i4 = warmup + 101;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            iDoubleValue = (int) dIAuthTabCallbackDefault.doubleValue();
            int i6 = IEngagementSignalsCallback + 19;
            warmup = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iDoubleValue = 0;
        }
        this.onActivityLayout = iDoubleValue;
        IAuthTabCallbackStubProxy().onWarmupCompleted.setV2Style(true);
        AdsCircularCountdownLayout adsCircularCountdownLayout = IAuthTabCallbackStubProxy().onWarmupCompleted;
        int i8 = this.onActivityLayout;
        long j = this.access100;
        if (j <= 0 || !(!this.asInterface)) {
            int i9 = warmup + 29;
            IEngagementSignalsCallback = i9 % 128;
            int i10 = i9 % 2;
            j = 0;
        }
        adsCircularCountdownLayout.onWarmupCompleted(i8, j, this.asInterface, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda31(this, nativeAdsDto), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda32(this, nativeAdsDto, adAsset));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[PHI: r1
      0x0032: PHI (r1v11 o.calculatePageOffsets) = (r1v8 o.calculatePageOffsets), (r1v14 o.calculatePageOffsets) binds: [B:13:0x0038, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto, boolean z) {
        calculatePageOffsets calculatepageoffsetsAsInterface;
        NativeAdsManager nativeAdsManagerICustomTabsCallbackDefault;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 17;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            nativeAdsPlayableAdActivity.prefetchWithMultipleUrls();
            NativeAdsDto.Reward rewardOnExtraCallback = nativeAdsDto.onTransact().onExtraCallback();
            if (rewardOnExtraCallback != null) {
                int i3 = IEngagementSignalsCallback + 19;
                warmup = i3 % 128;
                if (i3 % 2 != 0) {
                    calculatepageoffsetsAsInterface = nativeAdsPlayableAdActivity.asInterface();
                    int i4 = 60 / 0;
                    if (calculatepageoffsetsAsInterface != null) {
                        calculatePageOffsets.onExtraCallback(calculatepageoffsetsAsInterface, nativeAdsDto.IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult()), NativeAdsEventLogType.IAuthTabCallback.onExtraCallback, (Function1) null, 8, (Object) null);
                    }
                    nativeAdsManagerICustomTabsCallbackDefault = ICustomTabsCallbackDefault(nativeAdsPlayableAdActivity);
                    if (nativeAdsManagerICustomTabsCallbackDefault != null) {
                        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                        nativeAdsManagerICustomTabsCallbackDefault.onExtraCallback(((NativeAdsDto) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1362740741, 1362740770, new Object[]{nativeAdsPlayableAdActivity})).IAuthTabCallbackStub(), new getInterfaceDescriptor(rewardOnExtraCallback));
                        int i5 = warmup + 11;
                        IEngagementSignalsCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                } else {
                    calculatepageoffsetsAsInterface = nativeAdsPlayableAdActivity.asInterface();
                    if (calculatepageoffsetsAsInterface != null) {
                    }
                    nativeAdsManagerICustomTabsCallbackDefault = ICustomTabsCallbackDefault(nativeAdsPlayableAdActivity);
                    if (nativeAdsManagerICustomTabsCallbackDefault != null) {
                    }
                }
            }
            calculatePageOffsets calculatepageoffsetsAsInterface2 = nativeAdsPlayableAdActivity.asInterface();
            if (calculatepageoffsetsAsInterface2 != null) {
                calculatePageOffsets.onExtraCallback(calculatepageoffsetsAsInterface2, nativeAdsDto.IAuthTabCallbackStub(), (NativeAdsDto.AdAsset) CollectionsKt.first(nativeAdsDto.onExtraCallbackWithResult()), NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted, (Function1) null, 8, (Object) null);
            }
        }
        nativeAdsPlayableAdActivity.asInterface = true;
        nativeAdsPlayableAdActivity.access100 = 0L;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 65;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(nativeAdsPlayableAdActivity.receiveFile.get()));
        NativeAdsDto.Creative.PlayableAd playableAd = nativeAdsPlayableAdActivity.prefetch;
        if (playableAd == null) {
            int i4 = IEngagementSignalsCallback + 13;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            playableAd = null;
        }
        setDetectableSize.onExtraCallback("ad_id", playableAd.IAuthTabCallback());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", nativeAdsPlayableAdActivity.onMinimized());
        setDetectableSize.onExtraCallback("ssp_request_id", nativeAdsDto.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("click_type", "close");
        if (nativeAdsPlayableAdActivity.readTypedObject != null) {
            setDetectableSize.onExtraCallback("first_exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(((nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy + System.currentTimeMillis()) - r8.longValue()) / 1000.0f)));
        }
        if (nativeAdsPlayableAdActivity.writeTypedObject != null) {
            setDetectableSize.onExtraCallback("load_exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(((nativeAdsPlayableAdActivity.ICustomTabsCallback + System.currentTimeMillis()) - r8.longValue()) / 1000.0f)));
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, final NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) throws Throwable {
        String strIAuthTabCallbackStub;
        Function0 function0;
        int i;
        int i2 = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1955540L, false, null, null, new Function1() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda7
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 57;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = NativeAdsPlayableAdActivity.onWarmupCompleted(this.f$0, nativeAdsDto, (SetDetectableSize) obj);
                int i6 = onExtraCallbackWithResult + 13;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, 14, null);
        calculatePageOffsets calculatepageoffsetsAsInterface = nativeAdsPlayableAdActivity.asInterface();
        if (calculatepageoffsetsAsInterface != null) {
            int i3 = warmup + 111;
            IEngagementSignalsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                function0 = null;
                i = 2;
            } else {
                strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                function0 = null;
                i = 4;
            }
            calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsAsInterface, strIAuthTabCallbackStub, adAsset, function0, i, null);
            int i4 = IEngagementSignalsCallback + 73;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        }
        nativeAdsPlayableAdActivity.finish();
        return Unit.INSTANCE;
    }

    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), this.access000, (setRandomHost) null, new onTransact(this, (access13800) null), 2, (Object) null);
        int i2 = warmup + 49;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 69;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!this.getInterfaceDescriptor) {
            this.getInterfaceDescriptor = true;
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), this.access000, (setRandomHost) null, new onNavigationEvent(this, str, (access13800) null), 2, (Object) null);
        } else {
            int i5 = i2 + 119;
            IEngagementSignalsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final String onExtraCallback(String str, String str2) {
        int i = 2 % 2;
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        String strReplace = new Regex("<script[^>]+src=[\\\"'][^\\\"']*mraid(?:\\.js)?[^\\\"']*[\\\"'][^>]*>.*?</script>", clearFaultAdjacentMetadata.onExtraCallback(new RegexOption[]{regexOption, RegexOption.DOT_MATCHES_ALL})).replace(str, "");
        Regex regex = new Regex("<head[^>]*>", regexOption);
        Object obj = null;
        MatchResult matchResultFind$default = Regex.find$default(regex, strReplace, 0, 2, (Object) null);
        String str3 = "\n<script type=\"text/javascript\">\n" + str2 + "\n</script>\n";
        if (matchResultFind$default != null) {
            int last = matchResultFind$default.onExtraCallback().getLast() + 1;
            StringBuilder sb = new StringBuilder(strReplace.length() + str3.length());
            sb.append(StringsKt.take(strReplace, last));
            sb.append(str3);
            String strSubstring = strReplace.substring(last);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            sb.append(strSubstring);
            String string = sb.toString();
            Intrinsics.checkNotNull(string);
            return string;
        }
        String str4 = "<html><head>" + str3 + "</head>" + strReplace + "</html>";
        int i2 = IEngagementSignalsCallback + 75;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            return str4;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String writeTypedObject() {
        String text;
        File file;
        int i = 2 % 2;
        try {
            file = new File(new File(getFilesDir(), "ads_sdk/mraid"), "mraid_cache.js");
        } catch (Exception unused) {
        }
        if (file.exists()) {
            int i2 = IEngagementSignalsCallback + 111;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            text = FilesKt.readText(file, Charsets.UTF_8);
        } else {
            text = "";
        }
        int i4 = warmup + 45;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return text;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String $jsContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(String str, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$jsContent = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxyCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackStubProxyCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 25 / 0;
            return iAuthTabCallbackStubProxyCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = NativeAdsPlayableAdActivity.this.new IAuthTabCallbackStubProxy(this.$jsContent, access13800Var);
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = 82 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            try {
                File file = new File(NativeAdsPlayableAdActivity.this.getFilesDir(), "ads_sdk/mraid");
                if (!file.exists()) {
                    int i3 = onNavigationEvent + 99;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        file.mkdirs();
                        throw null;
                    }
                    file.mkdirs();
                }
                FilesKt.writeText(new File(file, "mraid_cache.js"), this.$jsContent, Charsets.UTF_8);
                NativeAdsPlayableAdActivity.onNavigationEvent(NativeAdsPlayableAdActivity.this, "MRAID cache updated in internal storage");
            } catch (Exception e) {
                NativeAdsPlayableAdActivity.onNavigationEvent(NativeAdsPlayableAdActivity.this, "Failed to cache MRAID JS: " + e.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallbackStub(String str) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new IAuthTabCallbackStubProxy(str, null), 2, (Object) null);
        int i2 = warmup + 1;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 27;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        int i4 = warmup + 47;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) throws Throwable {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 45;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (!(!StringsKt.contains(str, "viewableChange", true))) {
            int i4 = warmup + 25;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            nativeAdsPlayableAdActivity.onExtraCallbackWithResult(nativeAdsPlayableAdActivity.IAuthTabCallback(str));
        }
        if (StringsKt.contains$default(str, "PLAYABLE_FIRST_INTERACTION", false, 2, (Object) null)) {
            int i6 = warmup + 119;
            IEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
            nativeAdsPlayableAdActivity.ICustomTabsCallback_Parcel();
        }
        if (!StringsKt.startsWith(str, "PLAYABLE_ERROR:", true)) {
            int i8 = IEngagementSignalsCallback + 27;
            warmup = i8 % 128;
            if (i8 % 2 == 0 ? !StringsKt.contains(str, "external", true) : !StringsKt.contains(str, "external", true)) {
                return null;
            }
        }
        nativeAdsPlayableAdActivity.asBinder(str);
        int i9 = IEngagementSignalsCallback + 63;
        warmup = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    private final boolean IAuthTabCallback(String str) {
        removeLogBuffers removelogbuffersIAuthTabCallback;
        MatchGroup matchGroupOnExtraCallbackWithResult;
        Boolean booleanStrictOrNull;
        int i = 2 % 2;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("viewableChange\\s*\\(\\s*(true|false)\\s*\\)", RegexOption.IGNORE_CASE), str, 0, 2, (Object) null);
        if (matchResultFind$default != null && (removelogbuffersIAuthTabCallback = matchResultFind$default.IAuthTabCallback()) != null && (matchGroupOnExtraCallbackWithResult = removelogbuffersIAuthTabCallback.onExtraCallbackWithResult(1)) != null) {
            int i2 = IEngagementSignalsCallback + 109;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                matchGroupOnExtraCallbackWithResult.onNavigationEvent();
                throw null;
            }
            String strOnNavigationEvent = matchGroupOnExtraCallbackWithResult.onNavigationEvent();
            if (strOnNavigationEvent != null && (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(strOnNavigationEvent)) != null) {
                return booleanStrictOrNull.booleanValue();
            }
        }
        int i3 = warmup + 69;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 91;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallbackStub() throws Throwable {
        int i = 2 % 2;
        this.newSessionWithExtras = true;
        onRelationshipValidationResult();
        Long l = this.writeTypedObject;
        if (l != null) {
            int i2 = warmup + 15;
            IEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (l.longValue() != 0) {
                    return;
                }
            } else if (l.longValue() != 0) {
                return;
            }
            int i3 = IEngagementSignalsCallback + 97;
            warmup = i3 % 128;
            if (i3 % 2 == 0) {
                this.writeTypedObject = Long.valueOf(System.currentTimeMillis());
            } else {
                this.writeTypedObject = Long.valueOf(System.currentTimeMillis());
                int i4 = 93 / 0;
            }
        }
    }

    private static final Unit IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 121;
        IEngagementSignalsCallback = i2 % 128;
        NativeAdsDto.Creative.PlayableAd playableAd = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            NativeAdsDto.Creative.PlayableAd playableAd2 = nativeAdsPlayableAdActivity.prefetch;
            playableAd.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        NativeAdsDto.Creative.PlayableAd playableAd3 = nativeAdsPlayableAdActivity.prefetch;
        if (playableAd3 == null) {
            int i3 = warmup + 69;
            IEngagementSignalsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = warmup + 121;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            playableAd = playableAd3;
        }
        setDetectableSize.onExtraCallback("ad_id", playableAd.IAuthTabCallback());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", nativeAdsPlayableAdActivity.onMinimized());
        setDetectableSize.onExtraCallback("ssp_request_id", nativeAdsPlayableAdActivity.readTypedObject().IAuthTabCallbackStub());
        if (nativeAdsPlayableAdActivity.extraCallbackWithResult != null) {
            setDetectableSize.onExtraCallback("exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(((nativeAdsPlayableAdActivity.extraCallback + System.currentTimeMillis()) - r0.longValue()) / 1000.0f)));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean requestPostMessageChannel(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        int i2 = warmup + 7;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if ((!nativeAdsPlayableAdActivity.onUnminimized) || nativeAdsPlayableAdActivity.isFinishing()) {
            return false;
        }
        int i4 = warmup + 13;
        IEngagementSignalsCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean setEngagementSignalsCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int i = 2 % 2;
        if (!nativeAdsPlayableAdActivity.onUnminimized || nativeAdsPlayableAdActivity.isFinishing()) {
            int i2 = warmup + 9;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IEngagementSignalsCallback + 43;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final Unit onWarmupCompleted(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 97;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = warmup + 91;
        IEngagementSignalsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return unit2;
    }

    private final void ICustomTabsCallback_Parcel() {
        Object obj;
        Unit unit;
        int i = 2 % 2;
        int i2 = warmup + 101;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto typedObject = readTypedObject();
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(typedObject.onExtraCallbackWithResult());
        if (adAsset != null) {
            try {
                Result.Companion companion = Result.Companion;
                calculatePageOffsets calculatepageoffsetsAsInterface = asInterface();
                if (calculatepageoffsetsAsInterface != null) {
                    calculatepageoffsetsAsInterface.onNavigationEvent(typedObject.IAuthTabCallbackStub(), adAsset, NativeAdsEventLogType.onTransact.IAuthTabCallback, new Function1() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda10
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i4 = 2 % 2;
                            int i5 = IAuthTabCallback + 67;
                            onNavigationEvent = i5 % 128;
                            NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) obj2;
                            if (i5 % 2 != 0) {
                                return NativeAdsPlayableAdActivity.onExtraCallbackWithResult(nativeAdsEventLogType);
                            }
                            NativeAdsPlayableAdActivity.onExtraCallbackWithResult(nativeAdsEventLogType);
                            throw null;
                        }
                    });
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                obj = Result.constructor-impl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(obj) != null) {
                int i4 = warmup + 49;
                IEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
                calculatePageOffsets calculatepageoffsetsAsInterface2 = asInterface();
                if (i5 == 0) {
                    int i6 = 61 / 0;
                    if (calculatepageoffsetsAsInterface2 == null) {
                        return;
                    }
                } else if (calculatepageoffsetsAsInterface2 == null) {
                    return;
                }
                calculatepageoffsetsAsInterface2.onNavigationEvent(typedObject.IAuthTabCallbackStub(), adAsset, NativeAdsEventLogType.onNavigationEvent.IAuthTabCallback, new Function1() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda11
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 23;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallback = NativeAdsPlayableAdActivity.onExtraCallback((NativeAdsEventLogType) obj2);
                        if (i9 == 0) {
                            int i10 = 42 / 0;
                        }
                        int i11 = onExtraCallbackWithResult + 17;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        return unitOnExtraCallback;
                    }
                });
            }
        }
    }

    private static final Unit onNavigationEvent(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 95;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 67;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void asBinder(String str) throws Throwable {
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        int i2 = warmup + 41;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        NativeAdsDto typedObject = readTypedObject();
        if (typedObject == null || (adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(typedObject.onExtraCallbackWithResult())) == null) {
            int i3 = warmup + 85;
            IEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NativeAdsPlayableAdActivity", "reportPlayableError " + typedObject.IAuthTabCallbackStub() + " " + adAsset.onExtraCallbackWithResult().IAuthTabCallback() + " reason " + str, (Throwable) null, (Map) null, 12, (Object) null);
    }

    @Override // im.toss.ads_sdk.playable.Hilt_NativeAdsPlayableAdActivity
    public void onPause() {
        int i = 2 % 2;
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        try {
            Result.Companion companion = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.onPause();
            infoForChild infoforchild = this.ICustomTabsCallback_Parcel;
            infoForChild infoforchild2 = null;
            if (infoforchild == null) {
                int i2 = warmup + 83;
                IEngagementSignalsCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    infoforchild2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                infoforchild = null;
            }
            infoforchild.onExtraCallback("hidden");
            infoForChild infoforchild3 = this.ICustomTabsCallback_Parcel;
            if (infoforchild3 == null) {
                int i3 = IEngagementSignalsCallback + 1;
                warmup = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = 21 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            } else {
                infoforchild2 = infoforchild3;
            }
            infoforchild2.onExtraCallbackWithResult(false);
            this.IAuthTabCallbackDefault = false;
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    @Override // im.toss.ads_sdk.playable.Hilt_NativeAdsPlayableAdActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = warmup + 15;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        try {
            Result.Companion companion = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.onResume();
            infoForChild infoforchild = this.ICustomTabsCallback_Parcel;
            infoForChild infoforchild2 = null;
            if (infoforchild == null) {
                int i4 = warmup + 1;
                IEngagementSignalsCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    infoforchild2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                infoforchild = null;
            }
            infoforchild.onExtraCallback("default");
            infoForChild infoforchild3 = this.ICustomTabsCallback_Parcel;
            if (infoforchild3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                infoforchild2 = infoforchild3;
            }
            infoforchild2.onExtraCallbackWithResult(true);
            this.IAuthTabCallbackDefault = true;
            onRelationshipValidationResult();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    @Override // im.toss.ads_sdk.playable.Hilt_NativeAdsPlayableAdActivity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = warmup + 89;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onUnminimized = false;
        ICustomTabsServiceDefault();
        try {
            Result.Companion companion = Result.Companion;
            infoForChild infoforchild = this.ICustomTabsCallback_Parcel;
            if (infoforchild == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                infoforchild = null;
            }
            infoforchild.onExtraCallbackWithResult();
            Result.constructor-impl(Unit.INSTANCE);
            int i4 = IEngagementSignalsCallback + 63;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.removeJavascriptInterface("TossMraid");
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
        try {
            Result.Companion companion5 = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.removeJavascriptInterface("AndroidMraidLog");
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th3));
        }
        try {
            Result.Companion companion7 = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.loadUrl("about:blank");
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th4));
        }
        try {
            Result.Companion companion9 = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.stopLoading();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th5) {
            Result.Companion companion10 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th5));
        }
        try {
            Result.Companion companion11 = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.setWebChromeClient(null);
            Result.constructor-impl(Unit.INSTANCE);
            int i6 = IEngagementSignalsCallback + 19;
            warmup = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th6) {
            Result.Companion companion12 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th6));
        }
        try {
            Result.Companion companion13 = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.setWebViewClient(new WebViewClient());
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th7) {
            Result.Companion companion14 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th7));
        }
        try {
            Result.Companion companion15 = Result.Companion;
            IAuthTabCallbackStubProxy().ICustomTabsCallback.destroy();
            Result.constructor-impl(Unit.INSTANCE);
            int i8 = IEngagementSignalsCallback + 121;
            warmup = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable th8) {
            Result.Companion companion16 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th8));
        }
        calculatePageOffsets calculatepageoffsetsAsInterface = asInterface();
        if (calculatepageoffsetsAsInterface != null) {
            calculatepageoffsetsAsInterface.IAuthTabCallback(this.ICustomTabsService);
        }
        super.onDestroy();
    }

    public static final class access100 extends ContentObserver {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private int onWarmupCompleted;

        access100(Handler handler) {
            super(handler);
            AudioManager typedObject = NativeAdsPlayableAdActivity.readTypedObject(NativeAdsPlayableAdActivity.this);
            if (typedObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i = onExtraCallbackWithResult + 115;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
                typedObject = null;
            }
            this.onWarmupCompleted = typedObject.getStreamVolume(3);
            int i4 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) throws JSONException {
            int i = 2 % 2;
            AudioManager typedObject = NativeAdsPlayableAdActivity.readTypedObject(NativeAdsPlayableAdActivity.this);
            if (typedObject == null) {
                int i2 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                typedObject = null;
            }
            int streamVolume = typedObject.getStreamVolume(3);
            if (streamVolume != this.onWarmupCompleted) {
                this.onWarmupCompleted = streamVolume;
                NativeAdsPlayableAdActivity.newAuthTabSession(NativeAdsPlayableAdActivity.this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void extraCommand() {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            access100 access100Var = new access100(this.ICustomTabsCallbackStub);
            getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, access100Var);
            this.setEngagementSignalsCallback = access100Var;
            Result.constructor-impl(Unit.INSTANCE);
            int i2 = warmup + 1;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 117;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            ContentObserver contentObserver = this.setEngagementSignalsCallback;
            if (contentObserver != null) {
                getContentResolver().unregisterContentObserver(contentObserver);
                int i4 = warmup + 109;
                IEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            this.setEngagementSignalsCallback = null;
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws JSONException {
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        DisplayMetrics displayMetrics = nativeAdsPlayableAdActivity.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().ICustomTabsCallback.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        int width = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().ICustomTabsCallback.getWidth();
        int height = nativeAdsPlayableAdActivity.IAuthTabCallbackStubProxy().ICustomTabsCallback.getHeight();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(i2)})).intValue());
        jSONObject.put("height", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(i3)})).intValue());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(width)})).intValue());
        jSONObject2.put("height", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(height)})).intValue());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("x", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(i4)})).intValue());
        jSONObject3.put("y", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(i5)})).intValue());
        jSONObject3.put("width", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(width)})).intValue());
        jSONObject3.put("height", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(height)})).intValue());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("x", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(i4)})).intValue());
        jSONObject4.put("y", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(i5)})).intValue());
        jSONObject4.put("width", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(width)})).intValue());
        jSONObject4.put("height", ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, new Object[]{nativeAdsPlayableAdActivity, Integer.valueOf(height)})).intValue());
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("screenSize", jSONObject), getWrite.IAuthTabCallback("maxSize", jSONObject2), getWrite.IAuthTabCallback("defaultPosition", jSONObject3), getWrite.IAuthTabCallback("currentPosition", jSONObject4)});
        int i6 = IEngagementSignalsCallback + 57;
        warmup = i6 % 128;
        if (i6 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void mayLaunchUrl() throws JSONException, NoSuchMethodException, SecurityException {
        infoForChild infoforchild;
        String str;
        int i = 2 % 2;
        NativeAdsDto.Reward rewardOnExtraCallback = null;
        Map map = (Map) onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2062355049, VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026431).substring(0, 1).length() - 1707883742, 1697006017, -1697006017, new Object[]{this});
        JSONObject jSONObjectPut = new JSONObject().put("sms", false).put("tel", true).put("calendar", false).put("storePicture", false).put("inlineVideo", true);
        infoForChild infoforchild2 = this.ICustomTabsCallback_Parcel;
        if (infoforchild2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            infoforchild = null;
        } else {
            infoforchild = infoforchild2;
        }
        NativeAdsDto.ExtraInfo extraInfoOnTransact = readTypedObject().onTransact();
        if (extraInfoOnTransact != null) {
            int i2 = IEngagementSignalsCallback + 15;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                extraInfoOnTransact.onExtraCallback();
                rewardOnExtraCallback.hashCode();
                throw null;
            }
            rewardOnExtraCallback = extraInfoOnTransact.onExtraCallback();
            int i3 = IEngagementSignalsCallback + 123;
            warmup = i3 % 128;
            int i4 = i3 % 2;
        }
        if (rewardOnExtraCallback != null) {
            int i5 = IEngagementSignalsCallback + 9;
            warmup = i5 % 128;
            int i6 = i5 % 2;
            str = "rewarded";
        } else {
            str = "interstitial";
        }
        String str2 = str;
        Object obj = map.get("screenSize");
        Intrinsics.checkNotNull(obj);
        JSONObject jSONObject = (JSONObject) obj;
        Object obj2 = map.get("maxSize");
        Intrinsics.checkNotNull(obj2);
        JSONObject jSONObject2 = (JSONObject) obj2;
        Object obj3 = map.get("defaultPosition");
        Intrinsics.checkNotNull(obj3);
        JSONObject jSONObject3 = (JSONObject) obj3;
        Object obj4 = map.get("currentPosition");
        Intrinsics.checkNotNull(obj4);
        Intrinsics.checkNotNull(jSONObjectPut);
        infoforchild.onExtraCallbackWithResult(str2, jSONObject, jSONObject2, jSONObject3, (JSONObject) obj4, jSONObjectPut);
    }

    private final void postMessage() throws JSONException, NoSuchMethodException, SecurityException {
        infoForChild infoforchild;
        int i = 2 % 2;
        if (this.ICustomTabsCallback_Parcel == null) {
            return;
        }
        Map map = (Map) onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2062355049, VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026431).substring(0, 1).length() - 1707883742, 1697006017, -1697006017, new Object[]{this});
        Object obj = map.get("currentPosition");
        Intrinsics.checkNotNull(obj);
        JSONObject jSONObject = (JSONObject) obj;
        infoForChild infoforchild2 = this.ICustomTabsCallback_Parcel;
        if (infoforchild2 == null) {
            int i2 = IEngagementSignalsCallback + 75;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = IEngagementSignalsCallback + 87;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            infoforchild = null;
        } else {
            infoforchild = infoforchild2;
        }
        infoforchild.onNavigationEvent(jSONObject.getInt("width"), jSONObject.getInt("height"), (JSONObject) map.get("maxSize"), jSONObject, (JSONObject) map.get("defaultPosition"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = warmup + 85;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Result.Companion companion = Result.Companion;
                getWindow().setHideOverlayWindows(true);
                Result.constructor-impl(Unit.INSTANCE);
                int i4 = IEngagementSignalsCallback + 85;
                warmup = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(final View view) {
        int i = 2 % 2;
        access000();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(varyMatches.IAuthTabCallback(2, this), 0);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(new Rmenu.onNavigationEvent(1.0d, 0.2d));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda17
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsPlayableAdActivity.onWarmupCompleted(view, valueAnimator);
                int i5 = onExtraCallbackWithResult + 119;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 37 / 0;
                }
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new onMinimized(view));
        valueAnimatorOfInt.addListener(new onActivityLayout(view));
        valueAnimatorOfInt.start();
        this.prefetchWithMultipleUrls = valueAnimatorOfInt;
        int i2 = warmup + 51;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void IAuthTabCallback(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = warmup + 17;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Intrinsics.checkNotNull(valueAnimator.getAnimatedValue(), "");
            view.setTranslationX(((Integer) r4).intValue());
            return;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Intrinsics.checkNotNull(valueAnimator.getAnimatedValue(), "");
        view.setTranslationX(((Integer) r4).intValue());
        throw null;
    }

    private final void access000() {
        int i = 2 % 2;
        ValueAnimator valueAnimator = this.prefetchWithMultipleUrls;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            int i2 = warmup + 59;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = warmup + 89;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.playable.Hilt_NativeAdsPlayableAdActivity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        this.onUnminimized = true;
        calculatePageOffsets calculatepageoffsetsAsInterface = asInterface();
        Object obj = null;
        if (calculatepageoffsetsAsInterface != null) {
            int i2 = warmup + 3;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            calculatePageOffsets.onNavigationEvent(calculatepageoffsetsAsInterface, (findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), false, 2, (Object) null);
        }
        Long l = this.writeTypedObject;
        if (l == null || l.longValue() != 0) {
            this.writeTypedObject = Long.valueOf(System.currentTimeMillis());
        }
        Long l2 = this.readTypedObject;
        if (l2 == null || l2.longValue() != 0) {
            this.readTypedObject = Long.valueOf(System.currentTimeMillis());
        }
        if (this.extraCallbackWithResult != null) {
            int i4 = IEngagementSignalsCallback + 39;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                this.extraCallbackWithResult = Long.valueOf(System.currentTimeMillis());
            } else {
                this.extraCallbackWithResult = Long.valueOf(System.currentTimeMillis());
                obj.hashCode();
                throw null;
            }
        }
        if (this.asInterface) {
            return;
        }
        int i5 = warmup + 3;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallbackStubProxy().onWarmupCompleted.onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStop() {
        long jLongValue;
        int i = 2 % 2;
        int i2 = warmup + 39;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        this.onUnminimized = false;
        calculatePageOffsets calculatepageoffsetsAsInterface = asInterface();
        if (calculatepageoffsetsAsInterface != null) {
            int i4 = IEngagementSignalsCallback + 97;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsAsInterface, false, 1, (Object) null);
        }
        access000();
        Long l = this.writeTypedObject;
        if (l != null) {
            int i6 = warmup + 123;
            IEngagementSignalsCallback = i6 % 128;
            if (i6 % 2 != 0 ? l.longValue() != 0 : l.longValue() != 1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l2 = this.writeTypedObject;
                Intrinsics.checkNotNull(l2);
                this.ICustomTabsCallback = jCurrentTimeMillis - l2.longValue();
            }
        }
        Long l3 = this.readTypedObject;
        if (l3 == null || l3.longValue() != 0) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Long l4 = this.readTypedObject;
            Intrinsics.checkNotNull(l4);
            this.IAuthTabCallbackStubProxy = jCurrentTimeMillis2 - l4.longValue();
        }
        if (this.extraCallbackWithResult != null) {
            int i7 = IEngagementSignalsCallback + 31;
            warmup = i7 % 128;
            if (i7 % 2 != 0) {
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                Long l5 = this.extraCallbackWithResult;
                Intrinsics.checkNotNull(l5);
                jLongValue = jCurrentTimeMillis3 ^ l5.longValue();
            } else {
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                Long l6 = this.extraCallbackWithResult;
                Intrinsics.checkNotNull(l6);
                jLongValue = jCurrentTimeMillis4 - l6.longValue();
            }
            this.extraCallback = jLongValue;
        }
        IAuthTabCallbackStubProxy().onWarmupCompleted.onWarmupCompleted();
    }

    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        IAuthTabCallbackStubProxy().ICustomTabsCallback.post(new Runnable() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$$ExternalSyntheticLambda45
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0};
                NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1338271149, 1338271171, objArr);
                int i5 = onExtraCallback + 123;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = IEngagementSignalsCallback + 81;
        warmup = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void requestPostMessageChannelWithExtras(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws JSONException, NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = warmup + 119;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsPlayableAdActivity.postMessage();
        if (i3 == 0) {
            throw null;
        }
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        if (this.asInterface) {
            int i2 = IEngagementSignalsCallback + 49;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            jOnExtraCallbackWithResult = 0;
        } else {
            jOnExtraCallbackWithResult = IAuthTabCallbackStubProxy().onWarmupCompleted.onExtraCallbackWithResult();
        }
        bundle.putBoolean("ads_can_close", this.asInterface);
        bundle.putLong("ads_countdown_remaining_ms", jOnExtraCallbackWithResult);
        int i4 = IEngagementSignalsCallback + 9;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback_Parcel extends OnBackPressedCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdsDto IAuthTabCallback;
        final /* synthetic */ NativeAdsDto.AdAsset onNavigationEvent;

        public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(nativeAdsPlayableAdActivity, nativeAdsDto, setDetectableSize);
            if (i3 == 0) {
                int i4 = 81 / 0;
            }
            return unitOnExtraCallback;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
            super(true);
            this.IAuthTabCallback = nativeAdsDto;
            this.onNavigationEvent = adAsset;
        }

        private static final Unit onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto, SetDetectableSize setDetectableSize) {
            float fExtraCallback;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(((AtomicInteger) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846032053, 846032058, new Object[]{nativeAdsPlayableAdActivity})).get()));
            NativeAdsDto.Creative.PlayableAd playableAdICustomTabsCallbackStub = NativeAdsPlayableAdActivity.ICustomTabsCallbackStub(nativeAdsPlayableAdActivity);
            if (playableAdICustomTabsCallbackStub == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i2 = onWarmupCompleted + 87;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                playableAdICustomTabsCallbackStub = null;
            }
            setDetectableSize.onExtraCallback("ad_id", playableAdICustomTabsCallbackStub.IAuthTabCallback());
            setDetectableSize.onExtraCallback("advertise_space_unit_id", NativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy(nativeAdsPlayableAdActivity));
            setDetectableSize.onExtraCallback("ssp_request_id", nativeAdsDto.IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("click_type", "back");
            if (((Long) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2124517731, -2124517718, new Object[]{nativeAdsPlayableAdActivity})) != null) {
                int i4 = onExtraCallback + 49;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    fExtraCallback = ((NativeAdsPlayableAdActivity.extraCallback(nativeAdsPlayableAdActivity) + System.currentTimeMillis()) / r12.longValue()) + 1000.0f;
                } else {
                    fExtraCallback = ((NativeAdsPlayableAdActivity.extraCallback(nativeAdsPlayableAdActivity) + System.currentTimeMillis()) - r12.longValue()) / 1000.0f;
                }
                setDetectableSize.onExtraCallback("first_exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(fExtraCallback)));
            }
            Long l = (Long) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 665834362, -665834344, new Object[]{nativeAdsPlayableAdActivity});
            if (l != null) {
                int i5 = onExtraCallback + 23;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                long jLongValue = l.longValue();
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                setDetectableSize.onExtraCallback("load_exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(((((Long) NativeAdsPlayableAdActivity.onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -486899199, 486899209, new Object[]{nativeAdsPlayableAdActivity})).longValue() + System.currentTimeMillis()) - jLongValue) / 1000.0f)));
                int i7 = onWarmupCompleted + 17;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }

        public void handleOnBackPressed() throws Throwable {
            String strIAuthTabCallbackStub;
            NativeAdsDto.AdAsset adAsset;
            int i = 2 % 2;
            if (NativeAdsPlayableAdActivity.writeTypedObject(NativeAdsPlayableAdActivity.this)) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1955540L, false, null, null, new NativeAdsPlayableAdActivity$setBackPressed$1$.ExternalSyntheticLambda0(NativeAdsPlayableAdActivity.this, this.IAuthTabCallback), 14, null);
                calculatePageOffsets calculatepageoffsetsAsInterface = NativeAdsPlayableAdActivity.this.asInterface();
                if (calculatepageoffsetsAsInterface != null) {
                    int i2 = onExtraCallback + 3;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        strIAuthTabCallbackStub = this.IAuthTabCallback.IAuthTabCallbackStub();
                        adAsset = this.onNavigationEvent;
                    } else {
                        strIAuthTabCallbackStub = this.IAuthTabCallback.IAuthTabCallbackStub();
                        adAsset = this.onNavigationEvent;
                    }
                    calculatePageOffsets.onExtraCallback(calculatepageoffsetsAsInterface, strIAuthTabCallbackStub, adAsset, (Function0) null, 4, (Object) null);
                }
                NativeAdsPlayableAdActivity.this.finish();
                int i3 = onWarmupCompleted + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    private final void onNavigationEvent(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new IAuthTabCallback_Parcel(nativeAdsDto, adAsset));
        int i2 = IEngagementSignalsCallback + 71;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        Object obj;
        int i = 2 % 2;
        this.onMinimized = true;
        NativeAdsDto typedObject = readTypedObject();
        NativeAdsManager nativeAdsManagerICustomTabsCallbackDefault = ICustomTabsCallbackDefault(this);
        if (nativeAdsManagerICustomTabsCallbackDefault != null) {
            nativeAdsManagerICustomTabsCallbackDefault.onExtraCallback(((NativeAdsDto) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1362740741, 1362740770, new Object[]{this})).IAuthTabCallbackStub(), new IAuthTabCallback(typedObject));
        }
        try {
            Result.Companion companion = Result.Companion;
            File file = new File(new File(getFilesDir(), "ads_sdk/playablead/html"), "playable_" + readTypedObject().IAuthTabCallbackStub() + ".html");
            if (file.exists()) {
                int i2 = IEngagementSignalsCallback + 61;
                warmup = i2 % 128;
                int i3 = i2 % 2;
                file.delete();
                int i4 = IEngagementSignalsCallback + 5;
                warmup = i4 % 128;
                int i5 = i4 % 2;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            int i6 = warmup + 111;
            IEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
            obj = obj2;
        }
        Result.exceptionOrNull-impl(obj);
        setResult(-1);
        super/*android.app.Activity*/.finish();
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        readTypedObject(access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsPlayableAdActivity);
            if (i3 != 0) {
                int i4 = 6 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public static /* synthetic */ Unit onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
                int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            Unit unit = (Unit) onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback3, new Object[]{nativeAdsPlayableAdActivity, setDetectableSize}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1868339058, iOnExtraCallback4, 1868339059);
            int i3 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsBinder = asBinder(nativeAdsPlayableAdActivity, setDetectableSize);
            int i4 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitAsBinder;
        }

        public static /* synthetic */ Unit onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsInterface = asInterface(nativeAdsPlayableAdActivity);
            int i4 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unitAsInterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i2;
            int i9 = ~(i7 | i8);
            int i10 = ~i6;
            int i11 = i9 | (~(i10 | i2));
            int i12 = i8 | i4;
            int i13 = ~(i12 | i6);
            int i14 = (~(i2 | i7)) | (~(i8 | i10)) | (~i12);
            int i15 = i4 + i6 + i5 + (1650861130 * i) + ((-924421097) * i3);
            int i16 = i15 * i15;
            int i17 = (i4 * (-405912681)) + 1474035712 + ((-405912681) * i6) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i5) + (986710016 * i) + ((-948436992) * i3) + ((-1864630272) * i16);
            int i18 = ((i4 * (-959335331)) - 587927435) + (i6 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i5 * (-959334869)) + (i * 22983790) + (i3 * 637852125) + (i16 * (-1124859904));
            int i19 = i17 + (i18 * i18 * (-1807482880));
            return i19 != 1 ? i19 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }

        public static /* synthetic */ Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(nativeAdsPlayableAdActivity);
            }
            IAuthTabCallback(nativeAdsPlayableAdActivity);
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            Unit unit = (Unit) onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, new Object[]{nativeAdsPlayableAdActivity, setDetectableSize}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 296791486, iOnExtraCallback2, -296791486);
            int i4 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = NativeAdsPlayableAdActivity.this.new readTypedObject(access13800Var);
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 93 / 0;
            }
            return readtypedobject;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {create(findresandmsg, access13800Var), Unit.INSTANCE};
            Object objOnWarmupCompleted = onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1049758275, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1049758273);
            int i4 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
            readTypedObject readtypedobject = (readTypedObject) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (readtypedobject.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = NativeAdsPlayableAdActivity.this;
            ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 2286196L, false, null, null, new Function1() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$showEndCard$1$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 77;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnWarmupCompleted = NativeAdsPlayableAdActivity.readTypedObject.onWarmupCompleted(nativeAdsPlayableAdActivity, (SetDetectableSize) obj2);
                    int i7 = onWarmupCompleted + 33;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 58 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            }, 14, null);
            NativeAdsPlayableAdActivity.onExtraCallback(NativeAdsPlayableAdActivity.this, true);
            ConstraintLayout constraintLayout = NativeAdsPlayableAdActivity.ICustomTabsCallback(NativeAdsPlayableAdActivity.this).IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            PlayableEndCardBottomSheet playableEndCardBottomSheet = NativeAdsPlayableAdActivity.ICustomTabsCallback(NativeAdsPlayableAdActivity.this).IAuthTabCallbackDefault;
            final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity2 = NativeAdsPlayableAdActivity.this;
            Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$showEndCard$1$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke() throws Throwable {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 3;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnExtraCallback = NativeAdsPlayableAdActivity.readTypedObject.onExtraCallback(nativeAdsPlayableAdActivity2);
                    int i7 = onExtraCallback + 97;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnExtraCallback;
                }
            };
            final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity3 = NativeAdsPlayableAdActivity.this;
            Object[] objArr2 = {playableEndCardBottomSheet, function0, new Function0() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$showEndCard$1$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() throws Throwable {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 121;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity4 = nativeAdsPlayableAdActivity3;
                    if (i6 != 0) {
                        return NativeAdsPlayableAdActivity.readTypedObject.onWarmupCompleted(nativeAdsPlayableAdActivity4);
                    }
                    NativeAdsPlayableAdActivity.readTypedObject.onWarmupCompleted(nativeAdsPlayableAdActivity4);
                    throw null;
                }
            }};
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            PlayableEndCardBottomSheet.onNavigationEvent(objArr2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, 614432937, -614432935);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
            return unit;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
            SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
            int i = 2 % 2;
            NativeAdsDto.Creative.PlayableAd playableAdICustomTabsCallbackStub = NativeAdsPlayableAdActivity.ICustomTabsCallbackStub(nativeAdsPlayableAdActivity);
            if (playableAdICustomTabsCallbackStub == null) {
                int i2 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                playableAdICustomTabsCallbackStub = null;
            }
            setDetectableSize.onExtraCallback("ad_id", playableAdICustomTabsCallbackStub.IAuthTabCallback());
            setDetectableSize.onExtraCallback("advertise_space_unit_id", NativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy(nativeAdsPlayableAdActivity));
            setDetectableSize.onExtraCallback("ssp_request_id", ((NativeAdsDto) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1362740741, 1362740770, new Object[]{nativeAdsPlayableAdActivity})).IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("action_type", "end_card");
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
            SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
            int i = 2 % 2;
            NativeAdsDto.Creative.PlayableAd playableAdICustomTabsCallbackStub = NativeAdsPlayableAdActivity.ICustomTabsCallbackStub(nativeAdsPlayableAdActivity);
            if (playableAdICustomTabsCallbackStub == null) {
                int i2 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 5;
                }
                playableAdICustomTabsCallbackStub = null;
            }
            setDetectableSize.onExtraCallback("ad_id", playableAdICustomTabsCallbackStub.IAuthTabCallback());
            setDetectableSize.onExtraCallback("advertise_space_unit_id", NativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy(nativeAdsPlayableAdActivity));
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            setDetectableSize.onExtraCallback("ssp_request_id", ((NativeAdsDto) NativeAdsPlayableAdActivity.onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1362740741, 1362740770, new Object[]{nativeAdsPlayableAdActivity})).IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("action_type", "interaction");
            setDetectableSize.onExtraCallback("interaction_type", "click");
            setDetectableSize.onExtraCallback("button_name", "toss_end_card_close");
            return Unit.INSTANCE;
        }

        private static final Unit onExtraCallbackWithResult(final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws Throwable {
            int i = 2 % 2;
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2286196L, false, null, null, new Function1() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$showEndCard$1$$ExternalSyntheticLambda5
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 107;
                    onNavigationEvent = i3 % 128;
                    Object obj2 = null;
                    if (i3 % 2 != 0) {
                        NativeAdsPlayableAdActivity.readTypedObject.onExtraCallback(nativeAdsPlayableAdActivity, (SetDetectableSize) obj);
                        throw null;
                    }
                    Unit unitOnExtraCallback = NativeAdsPlayableAdActivity.readTypedObject.onExtraCallback(nativeAdsPlayableAdActivity, (SetDetectableSize) obj);
                    int i4 = onWarmupCompleted + 57;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }, 14, null);
            Unit unit = Unit.INSTANCE;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit asBinder(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            NativeAdsDto.Creative.PlayableAd playableAdICustomTabsCallbackStub = NativeAdsPlayableAdActivity.ICustomTabsCallbackStub(nativeAdsPlayableAdActivity);
            if (playableAdICustomTabsCallbackStub == null) {
                int i2 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                playableAdICustomTabsCallbackStub = null;
            }
            setDetectableSize.onExtraCallback("ad_id", playableAdICustomTabsCallbackStub.IAuthTabCallback());
            setDetectableSize.onExtraCallback("advertise_space_unit_id", NativeAdsPlayableAdActivity.ICustomTabsCallbackStubProxy(nativeAdsPlayableAdActivity));
            setDetectableSize.onExtraCallback("ssp_request_id", ((NativeAdsDto) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1362740741, 1362740770, new Object[]{nativeAdsPlayableAdActivity})).IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("action_type", "redirection");
            setDetectableSize.onExtraCallback("trigger_type", "toss_end_card");
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        private static final Unit asInterface(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                NativeAdsPlayableAdActivity.onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1447139093, -1447139061, new Object[]{nativeAdsPlayableAdActivity});
                Unit unit = Unit.INSTANCE;
                int i3 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
            NativeAdsPlayableAdActivity.onNavigationEvent(iOnExtraCallbackWithResult4, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, 1447139093, -1447139061, new Object[]{nativeAdsPlayableAdActivity});
            Unit unit2 = Unit.INSTANCE;
            throw null;
        }

        private static final Unit IAuthTabCallback(final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) throws Throwable {
            int i = 2 % 2;
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2286196L, false, null, null, new Function1() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$showEndCard$1$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 71;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity2 = nativeAdsPlayableAdActivity;
                    SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
                    if (i4 == 0) {
                        return NativeAdsPlayableAdActivity.readTypedObject.onExtraCallbackWithResult(nativeAdsPlayableAdActivity2, setDetectableSize);
                    }
                    NativeAdsPlayableAdActivity.readTypedObject.onExtraCallbackWithResult(nativeAdsPlayableAdActivity2, setDetectableSize);
                    throw null;
                }
            }, 14, null);
            NativeAdsManager nativeAdsManagerICustomTabsCallbackDefault = NativeAdsPlayableAdActivity.ICustomTabsCallbackDefault(nativeAdsPlayableAdActivity);
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            String strIAuthTabCallbackStub = ((NativeAdsDto) NativeAdsPlayableAdActivity.onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1362740741, 1362740770, new Object[]{nativeAdsPlayableAdActivity})).IAuthTabCallbackStub();
            int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
            getFillAlpha.onWarmupCompleted(nativeAdsManagerICustomTabsCallbackDefault, strIAuthTabCallbackStub, (NativeAdsDto.AdAsset) CollectionsKt.first(((NativeAdsDto) NativeAdsPlayableAdActivity.onNavigationEvent(iOnExtraCallbackWithResult4, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, -1362740741, 1362740770, new Object[]{nativeAdsPlayableAdActivity})).onExtraCallbackWithResult()), null, null, null, null, new Function0() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$showEndCard$1$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 63;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnNavigationEvent = NativeAdsPlayableAdActivity.readTypedObject.onNavigationEvent(nativeAdsPlayableAdActivity);
                    int i5 = onExtraCallbackWithResult + 117;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnNavigationEvent;
                }
            }, 60, null);
            Unit unit = Unit.INSTANCE;
            int i2 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }

        private static final Unit onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            return (Unit) onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, new Object[]{nativeAdsPlayableAdActivity, setDetectableSize}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 296791486, iOnExtraCallback2, -296791486);
        }

        private static final Unit IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            return (Unit) onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, new Object[]{nativeAdsPlayableAdActivity, setDetectableSize}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1868339058, iOnExtraCallback2, 1868339059);
        }

        public final Object invokeSuspend(Object obj) {
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            return onWarmupCompleted(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, new Object[]{this, obj}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1049758275, iOnExtraCallback2, -1049758273);
        }
    }

    private final void prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 41;
        int i3 = i2 % 128;
        warmup = i3;
        if (i2 % 2 == 0) {
            if (!this.IAuthTabCallback_Parcel) {
                NativeAdsDto.Creative.PlayableAd playableAd = this.prefetch;
                if (playableAd == null) {
                    int i4 = i3 + 43;
                    IEngagementSignalsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    if (i5 == 0) {
                        throw null;
                    }
                    playableAd = null;
                }
                if (playableAd.IAuthTabCallbackDefault() != null) {
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new readTypedObject(null), 2, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context, im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity] */
    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        Object obj;
        ?? r5 = (NativeAdsPlayableAdActivity) objArr[0];
        int i = 2 % 2;
        NativeAdsDto.Creative.PlayableAd playableAd = ((NativeAdsPlayableAdActivity) r5).prefetch;
        if (playableAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            playableAd = null;
        }
        String strOnWarmupCompleted = playableAd.onWarmupCompleted();
        if (!StringsKt.isBlank(strOnWarmupCompleted)) {
            int i2 = IEngagementSignalsCallback + 79;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                getStrokeWidth.onExtraCallback.onExtraCallback((Context) r5, strOnWarmupCompleted, 268435456);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                r5.onWarmupCompleted("Failed to open landing url: " + th2.getMessage());
                int i4 = warmup + 91;
                IEngagementSignalsCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return null;
    }

    private final void isEngagementSignalsApiAvailable() throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1229795L, false, null, null, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda8(this), 14, null);
        int i2 = warmup + 117;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        NativeAdsDto.Creative.PlayableAd playableAd;
        int i = 2 % 2;
        int i2 = warmup + 97;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(nativeAdsPlayableAdActivity.receiveFile.get()));
            setDetectableSize.onExtraCallback("click_type", "cta");
            playableAd = nativeAdsPlayableAdActivity.prefetch;
            int i3 = 49 / 0;
            if (playableAd == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = IEngagementSignalsCallback + 31;
                warmup = i4 % 128;
                int i5 = i4 % 2;
                playableAd = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(nativeAdsPlayableAdActivity.receiveFile.get()));
            setDetectableSize.onExtraCallback("click_type", "cta");
            playableAd = nativeAdsPlayableAdActivity.prefetch;
            if (playableAd == null) {
            }
        }
        setDetectableSize.onExtraCallback("ad_id", playableAd.IAuthTabCallback());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", nativeAdsPlayableAdActivity.onMinimized());
        setDetectableSize.onExtraCallback("ssp_request_id", nativeAdsPlayableAdActivity.readTypedObject().IAuthTabCallbackStub());
        return Unit.INSTANCE;
    }

    private final void receiveFile() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 91;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        TdsSkeletonV1View tdsSkeletonV1View = IAuthTabCallbackStubProxy().getInterfaceDescriptor;
        tdsSkeletonV1View.setSkeletonColor(TdsSkeletonV1View.onWarmupCompleted.Dark);
        tdsSkeletonV1View.setBackgroundColor(-16777216);
        tdsSkeletonV1View.setVisibility(0);
        TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor = TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback;
        getinterfacedescriptor.onExtraCallback(3);
        tdsSkeletonV1View.setSkeletonType(getinterfacedescriptor);
        Intrinsics.checkNotNull(tdsSkeletonV1View);
        if (tdsSkeletonV1View.isLaidOut()) {
            int i4 = warmup + 81;
            IEngagementSignalsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                tdsSkeletonV1View.isLayoutRequested();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!tdsSkeletonV1View.isLayoutRequested()) {
                float f = tdsSkeletonV1View.getResources().getDisplayMetrics().density;
                double dOnExtraCallback = 0.0d;
                for (TdsSkeletonV1View.onExtraCallbackWithResult onextracallbackwithresult : getinterfacedescriptor.onNavigationEvent()) {
                    dOnExtraCallback += onextracallbackwithresult.onExtraCallback() + onextracallbackwithresult.onExtraCallbackWithResult();
                    int i5 = warmup + 125;
                    IEngagementSignalsCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                float fOnExtraCallback = (((float) dOnExtraCallback) + ((getinterfacedescriptor.onNavigationEvent(getinterfacedescriptor.onNavigationEvent().size()).onExtraCallback() + getinterfacedescriptor.onNavigationEvent(getinterfacedescriptor.onNavigationEvent().size()).onExtraCallbackWithResult()) * getinterfacedescriptor.IAuthTabCallback())) * f;
                float fCoerceAtLeast = RangesKt.coerceAtLeast((tdsSkeletonV1View.getHeight() / 2.0f) - (fOnExtraCallback / 2.0f), 0.0f);
                tdsSkeletonV1View.setPadding(tdsSkeletonV1View.getPaddingLeft(), (int) fCoerceAtLeast, tdsSkeletonV1View.getPaddingRight(), tdsSkeletonV1View.getPaddingBottom());
                onNavigationEvent(this, "Skeleton centered: screenHeight=" + tdsSkeletonV1View.getHeight() + ", contentHeight=" + fOnExtraCallback + ", topPadding=" + fCoerceAtLeast);
                return;
            }
        }
        tdsSkeletonV1View.addOnLayoutChangeListener(new extraCallbackWithResult(tdsSkeletonV1View, getinterfacedescriptor, this));
    }

    private final void newAuthTabSession() {
        int i = 2 % 2;
        NativeAdsDto.Creative.PlayableAd playableAd = this.prefetch;
        Object obj = null;
        if (playableAd == null) {
            int i2 = IEngagementSignalsCallback + 27;
            warmup = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            playableAd = null;
        }
        String strAccess100 = playableAd.access100();
        if (strAccess100 == null || StringsKt.isBlank(strAccess100)) {
            TdsRoundLayout tdsRoundLayout = IAuthTabCallbackStubProxy().asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            tdsRoundLayout.setVisibility(8);
            return;
        }
        TdsRoundLayout tdsRoundLayout2 = IAuthTabCallbackStubProxy().asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        tdsRoundLayout2.setVisibility(0);
        IAuthTabCallbackStubProxy().asInterface.setOnClickListener(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda5(this, strAccess100));
        int i3 = IEngagementSignalsCallback + 79;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final Object prefetch() throws Throwable {
        int i = 2 % 2;
        getScaleY getscaleyIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        NativeAdsDto.Creative.TutorialOverlay tutorialOverlayOnExtraCallbackWithResult = readTypedObject().onTransact().onExtraCallbackWithResult();
        onWarmupCompleted onwarmupcompleted = Companion;
        NativeAdsDto.Creative.PlayableAd playableAd = this.prefetch;
        if (playableAd == null) {
            int i2 = IEngagementSignalsCallback + 55;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = warmup + 73;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            playableAd = null;
        }
        String strIAuthTabCallback = onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, playableAd.IAuthTabCallback());
        if (tutorialOverlayOnExtraCallbackWithResult == null || zzw.onWarmupCompleted(onExtraCallbackWithResult(), strIAuthTabCallback, false, 2, (Object) null)) {
            ConstraintLayout constraintLayout = getscaleyIAuthTabCallbackStubProxy.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            return Unit.INSTANCE;
        }
        onExtraCallbackWithResult().onNavigationEvent(strIAuthTabCallback, true);
        getscaleyIAuthTabCallbackStubProxy.extraCallback.setText(tutorialOverlayOnExtraCallbackWithResult.onExtraCallbackWithResult());
        getscaleyIAuthTabCallbackStubProxy.writeTypedObject.setText(tutorialOverlayOnExtraCallbackWithResult.IAuthTabCallback());
        LottieAnimationView lottieAnimationView = getscaleyIAuthTabCallbackStubProxy.onTransact;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        zzck.onWarmupCompleted(-59676451, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 59676451, new Object[]{lottieAnimationView, tutorialOverlayOnExtraCallbackWithResult.onWarmupCompleted(), false, 0L, null, null, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda2(tutorialOverlayOnExtraCallbackWithResult), 30, null}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        getscaleyIAuthTabCallbackStubProxy.onTransact.playAnimation();
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1976160L, false, null, null, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda3(this), 14, null);
        validateRelationship();
        getscaleyIAuthTabCallbackStubProxy.IAuthTabCallback.setOnClickListener(new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda4());
        return maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new access000(tutorialOverlayOnExtraCallbackWithResult, this, null), 3, (Object) null);
    }

    private final void onRelationshipValidationResult() throws Throwable {
        int i = 2 % 2;
        if (this.newSessionWithExtras) {
            int i2 = warmup;
            int i3 = i2 + 91;
            IEngagementSignalsCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.IAuthTabCallbackDefault) {
                int i4 = i2 + 13;
                IEngagementSignalsCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(readTypedObject().onExtraCallbackWithResult());
                if (adAsset != null) {
                    if (this.extraCommand.add(1229791L)) {
                        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1229791L, false, null, null, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda41(this), 14, null);
                    }
                    NativeAdsManager nativeAdsManager = this.isEngagementSignalsApiAvailable;
                    if (nativeAdsManager != null) {
                        nativeAdsManager.onExtraCallback((findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), readTypedObject().IAuthTabCallbackStub(), adAsset, (Function0<Boolean>) new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda42(this));
                    }
                    NativeAdsManager nativeAdsManager2 = this.isEngagementSignalsApiAvailable;
                    if (nativeAdsManager2 != null) {
                        NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1869487633, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1869487598, new Object[]{nativeAdsManager2, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), readTypedObject().IAuthTabCallbackStub(), adAsset, new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda43(this), new NativeAdsPlayableAdActivity$.ExternalSyntheticLambda44(this)}, nSetPosition.onExtraCallbackWithResult());
                    }
                    if (this.newAuthTabSession) {
                        return;
                    }
                    int i5 = IEngagementSignalsCallback + 73;
                    warmup = i5 % 128;
                    int i6 = i5 % 2;
                    this.newAuthTabSession = true;
                    NativeAdsManager nativeAdsManagerICustomTabsCallbackDefault = ICustomTabsCallbackDefault(this);
                    if (nativeAdsManagerICustomTabsCallbackDefault != null) {
                        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                        nativeAdsManagerICustomTabsCallbackDefault.onExtraCallback(((NativeAdsDto) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1362740741, 1362740770, new Object[]{this})).IAuthTabCallbackStub(), new asInterface());
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [android.app.Activity, im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity] */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        boolean z;
        int i7 = ~((~i) | i6);
        int i8 = ~((~i6) | i5);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i5) | i6));
        int i11 = i6 + i5 + i3 + (762724209 * i4) + (1201824936 * i2);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i6) + 43253760 + (1339426419 * i5) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i3) + (1302855680 * i4) + (1514143744 * i2) + (1905524736 * i12);
        int i14 = ((i6 * 162561953) - 555857873) + (i5 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i3 * 162560975) + (i4 * 701011807) + (i2 * 237771736) + (i12 * (-223608832));
        switch (i13 + (i14 * i14 * 703332352)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) objArr[0];
                String str = (String) objArr[1];
                int i15 = 2 % 2;
                int i16 = warmup + 109;
                IEngagementSignalsCallback = i16 % 128;
                int i17 = i16 % 2;
                Unit unit = (Unit) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1521565002, -1521564972, new Object[]{nativeAdsPlayableAdActivity, str});
                int i18 = IEngagementSignalsCallback + 97;
                warmup = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return access100(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return getInterfaceDescriptor(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return access000(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                return writeTypedObject(objArr);
            case 17:
                int i20 = 2 % 2;
                int i21 = IEngagementSignalsCallback + 95;
                warmup = i21 % 128;
                int i22 = i21 % 2;
                return false;
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return ICustomTabsCallback(objArr);
            case 19:
                return readTypedObject(objArr);
            case 20:
                ?? r11 = (NativeAdsPlayableAdActivity) objArr[0];
                int i23 = 2 % 2;
                if (!((NativeAdsPlayableAdActivity) r11).onUnminimized) {
                    return false;
                }
                int i24 = warmup + 113;
                IEngagementSignalsCallback = i24 % 128;
                int i25 = i24 % 2;
                if (r11.isFinishing()) {
                    return false;
                }
                int i26 = warmup + 83;
                IEngagementSignalsCallback = i26 % 128;
                return Boolean.valueOf(i26 % 2 != 0);
            case 21:
                NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity2 = (NativeAdsPlayableAdActivity) objArr[0];
                int i27 = 2 % 2;
                ScrollView scrollView = nativeAdsPlayableAdActivity2.IAuthTabCallbackStubProxy().access000;
                Intrinsics.checkNotNullExpressionValue(scrollView, "");
                ScrollView scrollView2 = nativeAdsPlayableAdActivity2.IAuthTabCallbackStubProxy().access000;
                Intrinsics.checkNotNullExpressionValue(scrollView2, "");
                if (scrollView2.getVisibility() == 0) {
                    int i28 = warmup + 27;
                    IEngagementSignalsCallback = i28 % 128;
                    int i29 = i28 % 2;
                    z = true;
                } else {
                    z = false;
                }
                scrollView.setVisibility(z ^ true ? 0 : 8);
                int i30 = warmup + 5;
                IEngagementSignalsCallback = i30 % 128;
                int i31 = i30 % 2;
                return true;
            case 22:
                return extraCallbackWithResult(objArr);
            case 23:
                return extraCallback(objArr);
            case 24:
                return onActivityResized(objArr);
            case 25:
                return onActivityLayout(objArr);
            case 26:
                return onPostMessage(objArr);
            case 27:
                return onMessageChannelReady(objArr);
            case 28:
                return onMinimized(objArr);
            case 29:
                return onRelationshipValidationResult(objArr);
            case 30:
                return ICustomTabsCallbackStubProxy(objArr);
            case 31:
                return ICustomTabsCallbackDefault(objArr);
            case 32:
                return onUnminimized(objArr);
            case 33:
                return ICustomTabsCallbackStub(objArr);
            case 34:
                return extraCommand(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(View view, MotionEvent motionEvent) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1779912830, 1779912832, new Object[]{view, motionEvent})).booleanValue();
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -972903176, 972903185, new Object[]{nativeAdsPlayableAdActivity});
    }

    public static /* synthetic */ String onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (String) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 283579336, -283579332, new Object[]{nativeAdsPlayableAdActivity});
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, MotionEvent motionEvent) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1307096056, 1307096080, new Object[]{nativeAdsPlayableAdActivity, motionEvent});
    }

    public static /* synthetic */ void IAuthTabCallbackStub(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1338271149, 1338271171, new Object[]{nativeAdsPlayableAdActivity});
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1107778039, 1107778051, new Object[]{nativeAdsPlayableAdActivity, nativeAdsDto, adAsset});
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1231230432, 1231230446, new Object[]{nativeAdsPlayableAdActivity, setDetectableSize});
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 2082004362, -2082004356, new Object[]{nativeAdsPlayableAdActivity, str});
    }

    public static /* synthetic */ Unit IAuthTabCallback(getScaleY getscaley) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 46827128, -46827125, new Object[]{getscaley});
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 2111618597, -2111618589, new Object[]{nativeAdsPlayableAdActivity, str, view});
    }

    public static /* synthetic */ void onNavigationEvent(View view, ValueAnimator valueAnimator) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 809699335, -809699301, new Object[]{view, valueAnimator});
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -120247755, 120247774, new Object[0]);
    }

    public static final /* synthetic */ Long onMessageChannelReady(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Long) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 2124517731, -2124517718, new Object[]{nativeAdsPlayableAdActivity});
    }

    public static final /* synthetic */ long onActivityLayout(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Long) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -486899199, 486899209, new Object[]{nativeAdsPlayableAdActivity})).longValue();
    }

    public static final /* synthetic */ Long onPostMessage(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Long) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 665834362, -665834344, new Object[]{nativeAdsPlayableAdActivity});
    }

    public static final /* synthetic */ NativeAdsDto onUnminimized(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (NativeAdsDto) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1362740741, 1362740770, new Object[]{nativeAdsPlayableAdActivity});
    }

    public static final /* synthetic */ int isEngagementSignalsApiAvailable(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Integer) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1820653566, 1820653592, new Object[]{nativeAdsPlayableAdActivity})).intValue();
    }

    public static final /* synthetic */ AtomicInteger mayLaunchUrl(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (AtomicInteger) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -846032053, 846032058, new Object[]{nativeAdsPlayableAdActivity});
    }

    public static final /* synthetic */ void extraCommand(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1447139093, -1447139061, new Object[]{nativeAdsPlayableAdActivity});
    }

    public static final /* synthetic */ String onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, String str2) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (String) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -393095694, 393095701, new Object[]{nativeAdsPlayableAdActivity, str, str2});
    }

    public static final /* synthetic */ void asBinder(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 501027462, -501027461, new Object[]{nativeAdsPlayableAdActivity, str});
    }

    private final Map<String, JSONObject> ICustomTabsCallback() {
        return (Map) onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2062355049, VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026431).substring(0, 1).length() - 1707883742, 1697006017, -1697006017, new Object[]{this});
    }

    private final void onExtraCallback(String str) {
        onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 594268570, (-1043151220) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 98253091, VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), 1649183490, -1649183457, new Object[]{this, str});
    }

    private static final boolean receiveFile(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -2016036210, 2016036230, new Object[]{nativeAdsPlayableAdActivity})).booleanValue();
    }

    private final void onUnminimized() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1395696170, -1395696142, new Object[]{this});
    }

    private static final boolean onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 709694135, -709694114, new Object[]{nativeAdsPlayableAdActivity, view})).booleanValue();
    }

    private static final boolean IAuthTabCallback(View view, MotionEvent motionEvent) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1581917979, 1581917996, new Object[]{view, motionEvent})).booleanValue();
    }

    private static final Unit asInterface(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1192494759, -1192494748, new Object[]{nativeAdsPlayableAdActivity, setDetectableSize});
    }

    private static final void asInterface(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1228758017, 1228758040, new Object[]{nativeAdsPlayableAdActivity, view});
    }

    private static final Unit onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, MotionEvent motionEvent) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 752520589, -752520573, new Object[]{nativeAdsPlayableAdActivity, motionEvent});
    }

    private static final Unit onTransact(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1521565002, -1521564972, new Object[]{nativeAdsPlayableAdActivity, str});
    }

    private static final Unit warmup(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 213167740, -213167725, new Object[]{nativeAdsPlayableAdActivity});
    }

    private static final Unit requestPostMessageChannel() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -386710825, 386710850, new Object[0]);
    }

    private static final int access200(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return ((Integer) onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 889115214, -889115183, new Object[]{nativeAdsPlayableAdActivity})).intValue();
    }

    private final int IAuthTabCallback(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        return ((Integer) onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), VisitorUpdateUserInfoVerifyFragment$startVisitorWelcomeOrHome$1$.ExternalSyntheticLambda0.onExtraCallback(), nSetPosition.onExtraCallbackWithResult(), -1722557962, 1722557989, objArr)).intValue();
    }

    @Override // im.toss.ads_sdk.playable.Hilt_NativeAdsPlayableAdActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = warmup + 79;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }

    static void IAuthTabCallbackDefault() {
        requestPostMessageChannelWithExtras = -439598736;
        ICustomTabsServiceStub = -1538795456;
        updateVisuals = 609224976;
        ICustomTabsServiceDefault = new byte[]{-77, -14, -11, -74, -9, -5, 25, -15, -3, -73, -1, 0, 9, 11, -11, -15, -5, -15, -10, 74, -73, 9, -9, 10, 72, -49, 8, -1, 74, -63, -2, -15, 14, -12, 78, -73, -9, 4, -14, 50, -65, 76, 13, -64, -15, -10, 73, -76, 13, -9, 4, -14, 50, -54, 12, 51, -77, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4, -6, -15, -10, 74, -73, 9, -9, 10, 72, -73, -9, 74, -63, -2, -15, 14, -12, 78, -73, -9, 4, -14, 50, -65, 76, 13, -64, -15, -10, 73, -76, 13, -9, 4, -14, 50, -54, 12, 51, -77, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4};
    }
}
