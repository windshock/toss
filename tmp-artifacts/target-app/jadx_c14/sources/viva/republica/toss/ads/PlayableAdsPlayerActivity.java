package viva.republica.toss.ads;

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
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.OnBackPressedCallback;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.PlayableAdInfoResponse;
import im.toss.ads_sdk.playable.PlayableEndCardBottomSheet;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.base.BaseActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.Address;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraControllerExternalSyntheticLambda0;
import o.ConstraintTrackingWorkerExternalSyntheticLambda1;
import o.ConvertFloatArrayToByteArray;
import o.DERObjectIdentifier;
import o.EasingFunctionsKtExternalSyntheticLambda3;
import o.EncryptedContentInfoParser;
import o.GeckoHubImp;
import o.PlayerErrorCode;
import o.RepeatableSpec;
import o.Rmenu;
import o.SetDetectableSize;
import o.SuspendAnimationKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.auth;
import o.callTimeoutMillis;
import o.certificateChainCleaner;
import o.clearFaultAdjacentMetadata;
import o.convertAnyToMap;
import o.deleteCert;
import o.findResAndMsg;
import o.formatMsgs;
import o.getBacktraceNoteBytes;
import o.getConsentFlowUserGeography;
import o.getContentView;
import o.getScaleY;
import o.getWrite;
import o.infoForChild;
import o.maybeUpdateAnimatable;
import o.minFresh;
import o.noStore;
import o.putChannelInfo;
import o.r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4;
import o.setCommandLine;
import o.setInternalPageChangeListener;
import o.setLogBuffers;
import o.setRandomHost;
import o.setRevision;
import o.setTranslateY;
import o.transparentBackground;
import o.varyMatches;
import o.zzad;
import o.zzaj;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Retrofit;
import viva.republica.toss.ads.PlayableAdsPlayerActivity;
import viva.republica.toss.ads.PlayableAdsPlayerActivity$;
import viva.republica.toss.ads.PlayableAdsPlayerActivity$maybeLogImpressionsBySpec$2$;
import viva.republica.toss.ads.PlayableAdsPlayerActivity$setBackPressed$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlayableAdsPlayerActivity extends Hilt_PlayableAdsPlayerActivity {
    public static final onWarmupCompleted Companion;
    private static int ICustomTabsServiceStub;
    public static final int asInterface;
    private static int prefetchWithMultipleUrls;
    private static char requestPostMessageChannel;
    private static long requestPostMessageChannelWithExtras;
    private AudioManager IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private Long ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private boolean ICustomTabsCallback_Parcel;
    private PlayableAdInfoResponse access000;
    private boolean access100;
    private boolean extraCallback;
    private long extraCallbackWithResult;
    private infoForChild extraCommand;
    private boolean getInterfaceDescriptor;

    @Inject
    public zzad injectedEnvironments;

    @Inject
    public setTranslateY nativeAdsRepository;
    private long onActivityResized;
    private int onMessageChannelReady;
    private Long onMinimized;
    private Long onPostMessage;
    private boolean onRelationshipValidationResult;
    private String prefetch;
    private long readTypedObject;
    private ContentObserver receiveFile;
    private ValueAnimator setEngagementSignalsCallback;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 156;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int updateVisuals = 1;
    private static int ICustomTabsServiceDefault = 0;
    private static int warmup = 1;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new extraCallback(this));
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda10
        public final Object invoke() {
            return PlayableAdsPlayerActivity.IAuthTabCallback_Parcel(this.f$0);
        }
    });
    private final Lazy postMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda11
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return Boolean.valueOf(((Boolean) PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1582896451, objArr, -1582896435)).booleanValue());
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda12
        public final Object invoke() {
            return PlayableAdsPlayerActivity.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy newSessionWithExtras = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda13
        public final Object invoke() {
            return PlayableAdsPlayerActivity.access100(this.f$0);
        }
    });
    private final Lazy newAuthTabSession = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda14
        public final Object invoke() {
            return Boolean.valueOf(PlayableAdsPlayerActivity.asInterface(this.f$0));
        }
    });
    private final AtomicInteger newSession = new AtomicInteger(0);
    private final Lazy mayLaunchUrl = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda15
        public final Object invoke() {
            return PlayableAdsPlayerActivity.onNavigationEvent();
        }
    });
    private final Handler isEngagementSignalsApiAvailable = new Handler(Looper.getMainLooper());
    private final List<ValueAnimator> onUnminimized = new ArrayList();
    private final CoroutineExceptionHandler writeTypedObject = new access000(CoroutineExceptionHandler.extraCallbackWithResult, this);
    private final Set<Long> ICustomTabsService = new LinkedHashSet();
    private final AtomicBoolean onActivityLayout = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, int r6, short r7) {
        /*
            byte[] r0 = viva.republica.toss.ads.PlayableAdsPlayerActivity.$$a
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = 110 - r7
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.PlayableAdsPlayerActivity.$$c(short, int, short):java.lang.String");
    }

    static {
        ICustomTabsServiceStub = 0;
        updateVisuals();
        Companion = new onWarmupCompleted(null);
        asInterface = 8;
        int i = updateVisuals + 83;
        ICustomTabsServiceStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 39;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return ITrustedWebActivityServiceDefault();
        }
        ITrustedWebActivityServiceDefault();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 89;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(playableAdsPlayerActivity, setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(playableAdsPlayerActivity, setDetectableSize);
        int i3 = ICustomTabsServiceDefault + 29;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, JSONObject jSONObject) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 43;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(playableAdsPlayerActivity, jSONObject);
        int i4 = warmup + 3;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(View view, ValueAnimator valueAnimator) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 31;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 667592475, new Object[]{view, valueAnimator}, -667592472);
        int i4 = warmup + 75;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 87;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        prefetch(playableAdsPlayerActivity);
        int i4 = warmup + 99;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 41;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 651229120, new Object[]{playableAdsPlayerActivity, view}, -651229119);
            throw null;
        }
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2, 651229120, new Object[]{playableAdsPlayerActivity, view}, -651229119);
        int i3 = ICustomTabsServiceDefault + 93;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        int i9 = 2 % 2;
        int i10 = warmup + 9;
        ICustomTabsServiceDefault = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = {playableAdsPlayerActivity, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 319828349, objArr, -319828349);
        int i12 = ICustomTabsServiceDefault + 45;
        warmup = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(PlayableAdsPlayerActivity playableAdsPlayerActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 5;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            warmup(playableAdsPlayerActivity);
            obj.hashCode();
            throw null;
        }
        Unit unitWarmup = warmup(playableAdsPlayerActivity);
        int i3 = ICustomTabsServiceDefault + 61;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return unitWarmup;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 41;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            requestPostMessageChannel(playableAdsPlayerActivity);
            obj.hashCode();
            throw null;
        }
        Unit unitRequestPostMessageChannel = requestPostMessageChannel(playableAdsPlayerActivity);
        int i3 = warmup + 123;
        ICustomTabsServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unitRequestPostMessageChannel;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        boolean zBooleanValue;
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 31;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            zBooleanValue = ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 554820697, new Object[]{playableAdsPlayerActivity}, -554820669)).booleanValue();
            int i3 = 15 / 0;
        } else {
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            zBooleanValue = ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2, 554820697, new Object[]{playableAdsPlayerActivity}, -554820669)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(PlayableAdsPlayerActivity playableAdsPlayerActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 99;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -609153688, new Object[]{playableAdsPlayerActivity}, 609153708);
            throw null;
        }
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2, -609153688, new Object[]{playableAdsPlayerActivity}, 609153708);
        int i3 = warmup + 21;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ String IAuthTabCallback_Parcel(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 117;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String strNewSessionWithExtras = newSessionWithExtras(playableAdsPlayerActivity);
        int i4 = ICustomTabsServiceDefault + 85;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return strNewSessionWithExtras;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 9;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(playableAdsPlayerActivity, view);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String access100(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 93;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return prefetchWithMultipleUrls(playableAdsPlayerActivity);
        }
        prefetchWithMultipleUrls(playableAdsPlayerActivity);
        throw null;
    }

    public static /* synthetic */ boolean asInterface(PlayableAdsPlayerActivity playableAdsPlayerActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 85;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zUpdateVisuals = updateVisuals(playableAdsPlayerActivity);
        int i4 = ICustomTabsServiceDefault + 71;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return zUpdateVisuals;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8 | i4);
        int i10 = ~((~i4) | i8 | i6);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i6);
        int i13 = (~(i4 | i7)) | (~(i7 | i5)) | i10;
        int i14 = i6 + i5 + i + (1787548100 * i2) + (1101416392 * i3);
        int i15 = i14 * i14;
        int i16 = (i6 * (-930662234)) + 656878810 + (i5 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + ((-930661477) * i) + (2052861356 * i2) + (749768216 * i3) + (i15 * (-2028863488));
        switch ((((-61410478) * i6) - 623378432) + (561581232 * i5) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i) + ((-778043392) * i2) + ((-46137344) * i3) + (324403200 * i15) + (i16 * i16 * (-1850081280))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                final UIKitBaseActivity uIKitBaseActivity = (PlayableAdsPlayerActivity) objArr[0];
                int i17 = 2 % 2;
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1229795L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda21
                    public final Object invoke(Object obj) {
                        return PlayableAdsPlayerActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
                    }
                }, 14, (Object) null);
                callTimeoutMillis.onNavigationEvent onnavigationevent = callTimeoutMillis.Companion;
                String str = ((PlayableAdsPlayerActivity) uIKitBaseActivity).prefetch;
                Intrinsics.checkNotNull(str);
                String strIAuthTabCallback = convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback(str, "adId", uIKitBaseActivity.ICustomTabsServiceDefault()), "advertiseSpaceId", uIKitBaseActivity.IEngagementSignalsCallback()), "requestId", uIKitBaseActivity.IEngagementSignalsCallbackDefault());
                Object[] objArr2 = new Object[1];
                a((char) (Color.rgb(0, 0, 0) + 16783471), 16777216 + Color.rgb(0, 0, 0), new char[]{29575, 23019, 9924, 12542, 54083, 33357}, new char[]{0, 0, 0, 0}, new char[]{16155, 64071, 28513, 46360}, objArr2);
                callTimeoutMillis.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, uIKitBaseActivity, convertAnyToMap.IAuthTabCallback(strIAuthTabCallback, ((String) objArr2[0]).intern(), "true"), new certificateChainCleaner(uIKitBaseActivity.getReferrerParam(), "ads_ad_in_ad", (String) null), (List) null, (String) null, (String) null, (Function1) null, (Function1) null, 248, (Object) null);
                int i18 = warmup + 99;
                ICustomTabsServiceDefault = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
                int i20 = 2 % 2;
                int i21 = ICustomTabsServiceDefault + 105;
                warmup = i21 % 128;
                int i22 = i21 % 2;
                playableAdsPlayerActivity.ITrustedWebActivityService();
                int i23 = warmup + 59;
                ICustomTabsServiceDefault = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return access100(objArr);
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                return extraCallbackWithResult(objArr);
            case 18:
                return writeTypedObject(objArr);
            case 19:
                return extraCallback(objArr);
            case 20:
                return readTypedObject(objArr);
            case 21:
                return ICustomTabsCallback(objArr);
            case 22:
                return onMinimized(objArr);
            case 23:
                return onPostMessage(objArr);
            case 24:
                return onActivityLayout(objArr);
            case 25:
                return onActivityResized(objArr);
            case 26:
                return onMessageChannelReady(objArr);
            case 27:
                return ICustomTabsCallbackStubProxy(objArr);
            case 28:
                return onUnminimized(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View view = (View) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 23;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(view, valueAnimator);
        int i4 = ICustomTabsServiceDefault + 79;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) {
        int i = 2 % 2;
        int i2 = warmup + 79;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(playableAdsPlayerActivity, str);
        int i4 = warmup + 53;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WindowInsetsCompat onExtraCallbackWithResult(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 61;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnWarmupCompleted = onWarmupCompleted(view, windowInsetsCompat);
        int i4 = ICustomTabsServiceDefault + 35;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 69;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            setEngagementSignalsCallback(playableAdsPlayerActivity);
            throw null;
        }
        Unit engagementSignalsCallback = setEngagementSignalsCallback(playableAdsPlayerActivity);
        int i3 = warmup + 115;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return engagementSignalsCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 59;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(playableAdsPlayerActivity, motionEvent);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, WebView webView, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 23;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(playableAdsPlayerActivity, webView, str);
        }
        IAuthTabCallback(playableAdsPlayerActivity, webView, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 75;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(playableAdsPlayerActivity, setDetectableSize);
        int i4 = warmup + 113;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return unitAsInterface;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 7;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(playableAdsPlayerActivity);
        int i4 = warmup + 9;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unitRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ String onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 11;
        ICustomTabsServiceDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            postMessage(playableAdsPlayerActivity);
            obj.hashCode();
            throw null;
        }
        String strPostMessage = postMessage(playableAdsPlayerActivity);
        int i3 = ICustomTabsServiceDefault + 41;
        warmup = i3 % 128;
        if (i3 % 2 != 0) {
            return strPostMessage;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = warmup + 19;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {Integer.valueOf(i), playableAdsPlayerActivity, setDetectableSize};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        if (i4 != 0) {
            unit = (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1162906904, objArr, 1162906906);
            int i5 = 35 / 0;
        } else {
            unit = (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1162906904, objArr, 1162906906);
        }
        int i6 = warmup + 125;
        ICustomTabsServiceDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 1;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(playableAdsPlayerActivity, setDetectableSize);
        int i4 = ICustomTabsServiceDefault + 3;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, boolean z) {
        int i = 2 % 2;
        int i2 = warmup + 45;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(playableAdsPlayerActivity, z);
        int i4 = warmup + 11;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ setInternalPageChangeListener onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 35;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        setInternalPageChangeListener setinternalpagechangelistenerIPostMessageServiceStubProxy = IPostMessageServiceStubProxy();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return setinternalpagechangelistenerIPostMessageServiceStubProxy;
    }

    public static /* synthetic */ void onNavigationEvent(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 41;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(webView, str);
        int i4 = ICustomTabsServiceDefault + 13;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = warmup + 11;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 25524233, new Object[]{playableAdsPlayerActivity, view, motionEvent}, -25524214)).booleanValue();
        int i4 = warmup + 121;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onTransact(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 13;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitValidateRelationship = validateRelationship(playableAdsPlayerActivity);
        int i4 = warmup + 103;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitValidateRelationship;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 61;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1117721511, new Object[]{playableAdsPlayerActivity, setDetectableSize}, -1117721487);
        int i4 = warmup + 85;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 27;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        newAuthTabSession(playableAdsPlayerActivity);
        int i4 = ICustomTabsServiceDefault + 13;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 47;
        ICustomTabsServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 37;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public static final class extraCallback implements Function0<getScaleY> {
        final /* synthetic */ Activity onExtraCallback;

        public extraCallback(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getScaleY invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return getScaleY.IAuthTabCallback(layoutInflater);
        }
    }

    public static final class IAuthTabCallback_Parcel implements View.OnLayoutChangeListener {
        public IAuthTabCallback_Parcel() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
            view.removeOnLayoutChangeListener(this);
            PlayableAdsPlayerActivity.mayLaunchUrl(PlayableAdsPlayerActivity.this);
        }
    }

    public static final class asInterface implements View.OnLayoutChangeListener {
        final /* synthetic */ TdsSkeletonV1View IAuthTabCallback;
        final /* synthetic */ TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor onExtraCallbackWithResult;
        final /* synthetic */ PlayableAdsPlayerActivity onWarmupCompleted;

        public asInterface(TdsSkeletonV1View tdsSkeletonV1View, TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor, PlayableAdsPlayerActivity playableAdsPlayerActivity) {
            this.IAuthTabCallback = tdsSkeletonV1View;
            this.onExtraCallbackWithResult = getinterfacedescriptor;
            this.onWarmupCompleted = playableAdsPlayerActivity;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
            view.removeOnLayoutChangeListener(this);
            float f = this.IAuthTabCallback.getResources().getDisplayMetrics().density;
            double dOnExtraCallback = 0.0d;
            for (TdsSkeletonV1View.onExtraCallbackWithResult onextracallbackwithresult : this.onExtraCallbackWithResult.onNavigationEvent()) {
                dOnExtraCallback += onextracallbackwithresult.onExtraCallback() + onextracallbackwithresult.onExtraCallbackWithResult();
            }
            float f2 = (float) dOnExtraCallback;
            TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor = this.onExtraCallbackWithResult;
            int iOnExtraCallback = getinterfacedescriptor.onNavigationEvent(getinterfacedescriptor.onNavigationEvent().size()).onExtraCallback();
            TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor2 = this.onExtraCallbackWithResult;
            float fOnExtraCallbackWithResult = (f2 + ((iOnExtraCallback + getinterfacedescriptor2.onNavigationEvent(getinterfacedescriptor2.onNavigationEvent().size()).onExtraCallbackWithResult()) * this.onExtraCallbackWithResult.IAuthTabCallback())) * f;
            float fCoerceAtLeast = RangesKt.coerceAtLeast((view.getHeight() / 2.0f) - (fOnExtraCallbackWithResult / 2.0f), 0.0f);
            view.setPadding(view.getPaddingLeft(), (int) fCoerceAtLeast, view.getPaddingRight(), view.getPaddingBottom());
            PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{this.onWarmupCompleted, "Skeleton centered: screenHeight=" + view.getHeight() + ", contentHeight=" + fOnExtraCallbackWithResult + ", topPadding=" + fCoerceAtLeast}, 1102686358);
        }
    }

    public static final class access000 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ PlayableAdsPlayerActivity onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access000(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, PlayableAdsPlayerActivity playableAdsPlayerActivity) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = playableAdsPlayerActivity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{this.onWarmupCompleted, "CoroutineException: " + th.getMessage()}, 1102686358);
            this.onWarmupCompleted.finish();
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 7;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1511035606, new Object[]{playableAdsPlayerActivity, str, str2}, -1511035597);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2, 1511035606, new Object[]{playableAdsPlayerActivity, str, str2}, -1511035597);
        int i3 = warmup + 125;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 77;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(playableAdsPlayerActivity.IPostMessageService());
        }
        playableAdsPlayerActivity.IPostMessageService();
        throw null;
    }

    public static final /* synthetic */ PlayableAdInfoResponse ICustomTabsCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 41;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        PlayableAdInfoResponse playableAdInfoResponse = playableAdsPlayerActivity.access000;
        if (i3 == 0) {
            return playableAdInfoResponse;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        PlayableAdInfoResponse playableAdInfoResponse = (PlayableAdInfoResponse) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 125;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.access000 = playableAdInfoResponse;
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ Set ICustomTabsCallbackStub(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 81;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Set<Long> set = playableAdsPlayerActivity.ICustomTabsService;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 95;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return set;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 83;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.onNavigationEvent(str);
        if (i3 == 0) {
            return null;
        }
        int i4 = 65 / 0;
        return null;
    }

    public static final /* synthetic */ AtomicInteger ICustomTabsCallbackStubProxy(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 79;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        AtomicInteger atomicInteger = playableAdsPlayerActivity.newSession;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 75;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return atomicInteger;
    }

    public static final /* synthetic */ boolean ICustomTabsCallback_Parcel(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 1;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIPostMessageServiceStub = playableAdsPlayerActivity.IPostMessageServiceStub();
        int i4 = ICustomTabsServiceDefault + 7;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return zIPostMessageServiceStub;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 71;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.IAuthTabCallback(str);
        int i4 = warmup + 109;
        ICustomTabsServiceDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String access000(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 123;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String strIEngagementSignalsCallback = playableAdsPlayerActivity.IEngagementSignalsCallback();
        int i4 = ICustomTabsServiceDefault + 63;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return strIEngagementSignalsCallback;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 53;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        setInternalPageChangeListener setinternalpagechangelistener = (setInternalPageChangeListener) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1050687090, new Object[]{playableAdsPlayerActivity}, 1050687112);
        int i4 = warmup + 39;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return setinternalpagechangelistener;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 57;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        getScaleY getscaleyWriteTypedList = playableAdsPlayerActivity.writeTypedList();
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return getscaleyWriteTypedList;
    }

    public static final /* synthetic */ void asInterface(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 79;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        playableAdsPlayerActivity.prefetch = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 125;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AudioManager extraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 47;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        AudioManager audioManager = playableAdsPlayerActivity.IAuthTabCallbackStub;
        int i5 = i3 + 55;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return audioManager;
    }

    public static final /* synthetic */ void extraCommand(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 27;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.ITrustedWebActivityCallbackDefault();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsServiceDefault + 49;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 23;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        boolean z = playableAdsPlayerActivity.ICustomTabsCallbackStubProxy;
        int i5 = i2 + 27;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String getInterfaceDescriptor(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 55;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceDefault = playableAdsPlayerActivity.ICustomTabsServiceDefault();
        int i4 = warmup + 69;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsServiceDefault;
    }

    public static final /* synthetic */ void mayLaunchUrl(PlayableAdsPlayerActivity playableAdsPlayerActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 125;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -168871558, new Object[]{playableAdsPlayerActivity}, 168871576);
            return;
        }
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2, -168871558, new Object[]{playableAdsPlayerActivity}, 168871576);
        int i3 = 83 / 0;
    }

    public static final /* synthetic */ infoForChild onActivityLayout(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 71;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        infoForChild infoforchild = playableAdsPlayerActivity.extraCommand;
        int i5 = i3 + 21;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return infoforchild;
    }

    public static final /* synthetic */ Long onActivityResized(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 39;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Long l = playableAdsPlayerActivity.ICustomTabsCallback;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 61;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 21;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.onWarmupCompleted(str);
        int i4 = ICustomTabsServiceDefault + 59;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 25;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.extraCallback = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long onMessageChannelReady(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 31;
        int i3 = i2 % 128;
        warmup = i3;
        int i4 = i2 % 2;
        long j = playableAdsPlayerActivity.extraCallbackWithResult;
        int i5 = i3 + 119;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) throws Throwable {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 27;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.onExtraCallbackWithResult(str);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = warmup + 101;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ Long onMinimized(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 29;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Long l = playableAdsPlayerActivity.onMinimized;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 35;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public static final /* synthetic */ String onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str, String str2) {
        String str3;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 99;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            str3 = (String) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1279456801, new Object[]{playableAdsPlayerActivity, str, str2}, 1279456824);
            int i3 = 16 / 0;
        } else {
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            str3 = (String) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback2, -1279456801, new Object[]{playableAdsPlayerActivity, str, str2}, 1279456824);
        }
        int i4 = ICustomTabsServiceDefault + 51;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return str3;
    }

    public static final /* synthetic */ long onPostMessage(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 43;
        ICustomTabsServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            long j = playableAdsPlayerActivity.onActivityResized;
            throw null;
        }
        long j2 = playableAdsPlayerActivity.onActivityResized;
        int i4 = i2 + 113;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return j2;
    }

    public static final /* synthetic */ String onRelationshipValidationResult(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 15;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String strIEngagementSignalsCallbackDefault = playableAdsPlayerActivity.IEngagementSignalsCallbackDefault();
        int i4 = warmup + 91;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return strIEngagementSignalsCallbackDefault;
        }
        throw null;
    }

    public static final /* synthetic */ String onUnminimized(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 73;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String strIEngagementSignalsCallbackStub = playableAdsPlayerActivity.IEngagementSignalsCallbackStub();
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = warmup + 19;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return strIEngagementSignalsCallbackStub;
    }

    public static final /* synthetic */ void onWarmupCompleted(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 69;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4.onExtraCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4.onExtraCallback(), iOnExtraCallback, -1673005904, new Object[]{playableAdsPlayerActivity, str}, 1673005914);
        int i4 = warmup + 95;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean readTypedObject(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 13;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        boolean z = playableAdsPlayerActivity.getInterfaceDescriptor;
        int i5 = i2 + 11;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ zzad writeTypedObject(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 3;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            playableAdsPlayerActivity.ICustomTabsServiceStubProxy();
            throw null;
        }
        zzad zzadVarICustomTabsServiceStubProxy = playableAdsPlayerActivity.ICustomTabsServiceStubProxy();
        int i3 = ICustomTabsServiceDefault + 85;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return zzadVarICustomTabsServiceStubProxy;
    }

    public static final class ICustomTabsCallback implements Animator.AnimatorListener {
        final /* synthetic */ View onExtraCallbackWithResult;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public ICustomTabsCallback(View view) {
            this.onExtraCallbackWithResult = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.onExtraCallbackWithResult.setTranslationX(0.0f);
        }
    }

    public static final class onExtraCallbackWithResult implements Animator.AnimatorListener {
        final /* synthetic */ Function0 onExtraCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public onExtraCallbackWithResult(Function0 function0) {
            this.onExtraCallback = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Function0 function0 = this.onExtraCallback;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final class writeTypedObject implements Animator.AnimatorListener {
        final /* synthetic */ View onNavigationEvent;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public writeTypedObject(View view) {
            this.onNavigationEvent = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.onNavigationEvent.setTranslationX(0.0f);
        }
    }

    private final getScaleY writeTypedList() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 99;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        getScaleY getscaley = (getScaleY) this.IAuthTabCallbackDefault.getValue();
        int i4 = ICustomTabsServiceDefault + 55;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return getscaley;
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 1;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asBinder.getValue();
        int i4 = ICustomTabsServiceDefault + 73;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String newSessionWithExtras(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 7;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = playableAdsPlayerActivity.getIntent().getStringExtra("adId");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = ICustomTabsServiceDefault + 13;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = warmup + 81;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.postMessage.getValue()).booleanValue();
        int i4 = warmup + 65;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        BaseActivity baseActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 19;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(baseActivity.getIntent().getStringExtra("useLocal"), "true");
        int i4 = ICustomTabsServiceDefault + 57;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zAreEqual);
        }
        int i5 = 60 / 0;
        return Boolean.valueOf(zAreEqual);
    }

    private final String IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = warmup + 101;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        int i4 = ICustomTabsServiceDefault + 19;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String postMessage(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 25;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = playableAdsPlayerActivity.getIntent().getStringExtra("advertiseSpaceId");
        if (i3 != 0) {
            int i4 = 2 / 0;
            if (stringExtra != null) {
                return stringExtra;
            }
        } else if (stringExtra != null) {
            return stringExtra;
        }
        int i5 = warmup + 39;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    private final String IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 69;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) this.newSessionWithExtras.getValue();
        int i3 = warmup + 65;
        ICustomTabsServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String prefetchWithMultipleUrls(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = warmup + 49;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = playableAdsPlayerActivity.getIntent().getStringExtra("requestId");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = warmup + 101;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return "";
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 25;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) playableAdsPlayerActivity.newAuthTabSession.getValue()).booleanValue();
        int i4 = warmup + 65;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean updateVisuals(PlayableAdsPlayerActivity playableAdsPlayerActivity) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = warmup + 49;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = playableAdsPlayerActivity.getIntent();
        if (i3 != 0) {
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getFadingEdgeLength() / 52) * 7792), TextUtils.getCapsMode("", 1, 0), new char[]{29575, 23019, 9924, 12542, 54083, 33357}, new char[]{0, 0, 0, 0}, new char[]{16155, 64071, 28513, 46360}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((char) (6255 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.getCapsMode("", 0, 0), new char[]{29575, 23019, 9924, 12542, 54083, 33357}, new char[]{0, 0, 0, 0}, new char[]{16155, 64071, 28513, 46360}, objArr2);
            obj = objArr2[0];
        }
        return Intrinsics.areEqual(intent.getStringExtra(((String) obj).intern()), "true");
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 19;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 1;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), 43 - View.combineMeasuredStates(0, 0), 1452 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 49123), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1494 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23972), 50 - (ViewConfiguration.getTouchSlop() >> 8), 22939 - (ViewConfiguration.getPressedStateDuration() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45847), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, 12577 - KeyEvent.keyCodeFromString(""), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (requestPostMessageChannelWithExtras ^ 7798559133331975163L)) ^ ((int) (prefetchWithMultipleUrls ^ 7798559133331975163L))) ^ ((char) (requestPostMessageChannel ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 69;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 13 / 0;
            objArr[0] = str;
        }
    }

    public final setTranslateY ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 25;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        setTranslateY settranslatey = this.nativeAdsRepository;
        if (settranslatey != null) {
            return settranslatey;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = ICustomTabsServiceDefault + 109;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final zzad setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = warmup + 99;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        zzad zzadVar = this.injectedEnvironments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 99;
        warmup = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    private final zzad ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 117;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.injectedEnvironments == null) {
            auth.IAuthTabCallback(auth.onNavigationEvent, new IllegalStateException("environments accessed before injection: PlayableAdsPlayerActivity"), (Map) null, 2, (Object) null);
            return zzaj.onNavigationEvent();
        }
        int i5 = i2 + 57;
        warmup = i5 % 128;
        if (i5 % 2 != 0) {
            return setEngagementSignalsCallback();
        }
        setEngagementSignalsCallback();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 27;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Object value = playableAdsPlayerActivity.mayLaunchUrl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        setInternalPageChangeListener setinternalpagechangelistener = (setInternalPageChangeListener) value;
        int i4 = warmup + 87;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return setinternalpagechangelistener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final setInternalPageChangeListener IPostMessageServiceStubProxy() throws Throwable {
        int i = 2 % 2;
        Retrofit.Builder builder = new Retrofit.Builder();
        Object[] objArr = new Object[1];
        a((char) ((Process.getThreadPriority(0) + 20) >> 6), 103172609 - Gravity.getAbsoluteGravity(0, 0), new char[]{21844, 49593, 12571, 42124, 62702, 10750, 1343, 39845, 28067, 31984, 42261, 22262, 59256, 42205, 21963, 31046, 51258, 22413, 33166, 43497, 20138, 20832, 54809}, new char[]{0, 0, 0, 0}, new char[]{415, 9802, 27654, 43350}, objArr);
        Retrofit.Builder builderOnExtraCallback = builder.IAuthTabCallback(((String) objArr[0]).intern()).onExtraCallback(deleteCert.IAuthTabCallback());
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        setInternalPageChangeListener setinternalpagechangelistener = (setInternalPageChangeListener) builderOnExtraCallback.onExtraCallbackWithResult(builder2.connectTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(10, setrevision)).readTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(10, setrevision)).build()).IAuthTabCallback().onNavigationEvent(setInternalPageChangeListener.class);
        int i2 = warmup + 5;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        return setinternalpagechangelistener;
    }

    private final float ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 107;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i3 != 0) {
            return displayMetrics.density;
        }
        float f = displayMetrics.density;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceDefault + 29;
        warmup = i3 % 128;
        return (int) (i3 % 2 == 0 ? i + ICustomTabsService_Parcel() : i / ICustomTabsService_Parcel());
    }

    private final boolean IPostMessageService() {
        int i = 2 % 2;
        int i2 = warmup + 101;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(ICustomTabsServiceDefault(), "uiTestObject");
        int i4 = ICustomTabsServiceDefault + 95;
        warmup = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    private final boolean access200() {
        int i = 2 % 2;
        if (!ICustomTabsServiceStubProxy().RemoteActionCompatParcelizer()) {
            int i2 = warmup + 65;
            ICustomTabsServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            if (!ICustomTabsServiceStubProxy().MediaMetadataCompat()) {
                int i4 = warmup;
                int i5 = i4 + 91;
                ICustomTabsServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 89;
                ICustomTabsServiceDefault = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
        }
        int i9 = warmup + 119;
        ICustomTabsServiceDefault = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static final WindowInsetsCompat onWarmupCompleted(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iAsBinder = WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iAsBinder);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(iAsBinder, CameraControllerExternalSyntheticLambda0.onNavigationEvent).onExtraCallbackWithResult();
        int i2 = warmup + 69;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        return windowInsetsCompatOnExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.ads.Hilt_PlayableAdsPlayerActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        boolean z;
        int i = 2 % 2;
        super.onCreate(bundle);
        if (bundle != null) {
            int i2 = ICustomTabsServiceDefault + 49;
            warmup = i2 % 128;
            z = i2 % 2 == 0 ? bundle.getBoolean("ads_can_close", true) : bundle.getBoolean("ads_can_close", false);
        } else {
            int i3 = warmup + 77;
            ICustomTabsServiceDefault = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        this.getInterfaceDescriptor = z;
        this.IAuthTabCallback_Parcel = bundle != null ? bundle.getLong("ads_countdown_remaining_ms", 0L) : 0L;
        if (IPostMessageService() && !access200()) {
            int i5 = ICustomTabsServiceDefault + 77;
            warmup = i5 % 128;
            if (i5 % 2 != 0) {
                finish();
                return;
            } else {
                finish();
                throw null;
            }
        }
        EasingFunctionsKtExternalSyntheticLambda3.onWarmupCompleted(writeTypedList().onExtraCallbackWithResult());
        this.ICustomTabsCallbackStubProxy = true;
        getConsentFlowUserGeography.onWarmupCompleted(this, true);
        RepeatableSpec.onExtraCallbackWithResult(getWindow(), false);
        getWindow().setStatusBarColor(0);
        new SuspendAnimationKtExternalSyntheticLambda0(getWindow(), getWindow().getDecorView()).onNavigationEvent(false);
        ViewCompat.onWarmupCompleted(writeTypedList().onExtraCallbackWithResult(), new PlayableAdsPlayerActivity$.ExternalSyntheticLambda18());
        getWindow().setNavigationBarColor(-16777216);
        setContentView(writeTypedList().onExtraCallbackWithResult());
        Object systemService = getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "");
        this.IAuthTabCallbackStub = (AudioManager) systemService;
        getActiveNotifications();
        ITrustedWebActivityCallback();
        writeTypedList().onWarmupCompleted.setV2Style(true);
        writeTypedList().onWarmupCompleted.setCloseGradientVisible(false);
        getSmallIconBitmap();
        cancelNotification();
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 33;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("touch_cnt", playableAdsPlayerActivity.newSession);
        setDetectableSize.onExtraCallback("click_type", "share");
        setDetectableSize.onExtraCallback("ad_id", playableAdsPlayerActivity.ICustomTabsServiceDefault());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", playableAdsPlayerActivity.IEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("ssp_request_id", playableAdsPlayerActivity.IEngagementSignalsCallbackDefault());
        setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 19;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 37;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        TdsRoundLayout tdsRoundLayout = playableAdsPlayerActivity.writeTypedList().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        playableAdsPlayerActivity.onExtraCallbackWithResult((View) tdsRoundLayout);
        minFresh.onNavigationEvent(playableAdsPlayerActivity, noStore.Companion.access100());
        int i4 = warmup + 9;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void notifyNotificationWithChannel() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 45;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        read();
        if (this.onRelationshipValidationResult) {
            writeTypedList().IAuthTabCallbackStub.setOnTouchListener(null);
            writeTypedList().IAuthTabCallbackStub.setOnClickListener(new PlayableAdsPlayerActivity$.ExternalSyntheticLambda19(this));
            return;
        }
        TdsRoundLayout tdsRoundLayout = writeTypedList().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        transparentBackground.onWarmupCompleted(tdsRoundLayout, false, (Integer) null, 0, (View) null, (List) null, 0.0f, 0.98f, (Function2) null, false, 0L, (String) null, (getContentView) null, new PlayableAdsPlayerActivity$.ExternalSyntheticLambda20(this), 4030, (Object) null);
        int i4 = ICustomTabsServiceDefault + 17;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(PlayableAdsPlayerActivity playableAdsPlayerActivity, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = warmup + 7;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.ICustomTabsCallbackStub = !playableAdsPlayerActivity.ICustomTabsCallbackStub;
        playableAdsPlayerActivity.read();
        playableAdsPlayerActivity.ITrustedWebActivityCallbackDefault();
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 63;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void read() throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = warmup + 121;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        if (!this.ICustomTabsCallbackStub) {
            Object[] objArr = new Object[1];
            a((char) (KeyEvent.keyCodeFromString("") + 4057), (-1) - TextUtils.lastIndexOf("", '0'), new char[]{35344, 51155, 14093, 1062, 17940, 44103, 46122, 56770, 38483, 3099, 3666, 1733, 32988, 3644, 19747, 27703, 52839, 51705, 8255, 25337, 61088, 53362, 63808, 54298, 60879, 47570, 49755, 9618, 13140, 39067, 11157, 62048, 40586, 6281, 36880, 10775, 63685, 52600, 58973, 31922, 63933, 8171, 57013, 3290, 6958, 46322, 29994, 40202, 47992, 6862, 22760, 57824, 20117, 26982, 52562, 60050, 29649, 47801}, new char[]{0, 0, 0, 0}, new char[]{12295, 47018, 55628, 56847}, objArr);
            String strIntern2 = ((String) objArr[0]).intern();
            int i5 = warmup + 117;
            ICustomTabsServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            strIntern = strIntern2;
        } else {
            int i7 = i3 + 123;
            warmup = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr2 = new Object[1];
            a((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1448413801, new char[]{3165, 45670, 60901, 32675, 35915, 1415, 38594, 26363, 33668, 63993, 37364, 10252, 29622, 7056, 42614, 21783, 61858, 19655, 15108, 54112, 45762, 19967, 37769, 49830, 34220, 25586, 36203, 1248, 45543, 44766, 64022, 50775, 52557, 65443, 63114, 59282, 14547, 27579, 46945, 44322, 36672, 53146, 8976, 'F', 64305, 65199, 27488, 63840, 56428, 8932, 42620, 41212, 45379, 3018, 29496, 60882, 34467, 25370, 60677}, new char[]{0, 0, 0, 0}, new char[]{27025, 21770, 46934, 8421}, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        }
        TdsImageView tdsImageView = writeTypedList().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
    }

    private final void ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        infoForChild infoforchild = this.extraCommand;
        if (infoforchild == null) {
            return;
        }
        infoForChild infoforchild2 = null;
        if (this.ICustomTabsCallbackStub) {
            if (infoforchild == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                infoforchild = null;
            }
            infoforchild.onWarmupCompleted(0);
            return;
        }
        AudioManager audioManager = this.IAuthTabCallbackStub;
        if (audioManager == null) {
            int i2 = ICustomTabsServiceDefault + 65;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            audioManager = null;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        AudioManager audioManager2 = this.IAuthTabCallbackStub;
        if (audioManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = warmup + 33;
            ICustomTabsServiceDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
            audioManager2 = null;
        }
        int iCoerceAtLeast = (int) ((streamVolume / RangesKt.coerceAtLeast(audioManager2.getStreamMaxVolume(3), 1)) * 100.0f);
        infoForChild infoforchild3 = this.extraCommand;
        if (infoforchild3 == null) {
            int i6 = ICustomTabsServiceDefault + 115;
            warmup = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 == 0) {
                throw null;
            }
        } else {
            infoforchild2 = infoforchild3;
        }
        infoforchild2.onWarmupCompleted(Integer.valueOf(iCoerceAtLeast));
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view, long j, long j2, Function0 function0, int i, Object obj) {
        Function0 function02;
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            int i3 = ICustomTabsServiceDefault + 91;
            warmup = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            j2 = 600;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            int i4 = warmup + 85;
            ICustomTabsServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            function02 = null;
        } else {
            function02 = function0;
        }
        playableAdsPlayerActivity.onExtraCallbackWithResult(view, j3, j4, function02);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        View view = (View) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = warmup + 87;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        view.setAlpha(((Float) animatedValue).floatValue());
        int i4 = warmup + 57;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull View view, long j, long j2, @Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.setAlpha(0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onWarmupCompleted());
        valueAnimatorOfFloat.addUpdateListener(new PlayableAdsPlayerActivity$.ExternalSyntheticLambda3(view));
        valueAnimatorOfFloat.start();
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new onExtraCallbackWithResult(function0));
        this.onUnminimized.add(valueAnimatorOfFloat);
        int i2 = warmup + 15;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
    }

    private final Unit areNotificationsEnabled() {
        NativeAdsDto.Creative.EndCard endCardOnExtraCallback;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 107;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        writeTypedList();
        PlayableAdInfoResponse playableAdInfoResponse = this.access000;
        if (playableAdInfoResponse == null || (endCardOnExtraCallback = playableAdInfoResponse.onExtraCallback()) == null) {
            return null;
        }
        int i4 = ICustomTabsServiceDefault + 119;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            writeTypedList().IAuthTabCallbackDefault.onExtraCallbackWithResult(endCardOnExtraCallback);
            return Unit.INSTANCE;
        }
        writeTypedList().IAuthTabCallbackDefault.onExtraCallbackWithResult(endCardOnExtraCallback);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 99;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        if (this.ICustomTabsCallbackDefault) {
            return;
        }
        this.ICustomTabsCallbackDefault = true;
        runOnUiThread(new PlayableAdsPlayerActivity$.ExternalSyntheticLambda17(this));
        int i4 = ICustomTabsServiceDefault + 89;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void prefetch(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        playableAdsPlayerActivity.ITrustedWebActivityCallbackStubProxy();
        playableAdsPlayerActivity.getSmallIconId();
        playableAdsPlayerActivity.areNotificationsEnabled();
        playableAdsPlayerActivity.writeTypedList().getInterfaceDescriptor.onExtraCallbackWithResult();
        TdsRoundLayout tdsRoundLayout = playableAdsPlayerActivity.writeTypedList().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        onExtraCallbackWithResult(playableAdsPlayerActivity, tdsRoundLayout, 0L, 0L, null, 12, null);
        if (playableAdsPlayerActivity.prefetch == null) {
            TdsRoundLayout tdsRoundLayout2 = playableAdsPlayerActivity.writeTypedList().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
            onExtraCallbackWithResult(playableAdsPlayerActivity, tdsRoundLayout2, 100L, 0L, null, 12, null);
            AdsCircularCountdownLayout adsCircularCountdownLayout = playableAdsPlayerActivity.writeTypedList().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(adsCircularCountdownLayout, "");
            onExtraCallbackWithResult(playableAdsPlayerActivity, adsCircularCountdownLayout, 200L, 0L, null, 12, null);
            int i2 = ICustomTabsServiceDefault + 65;
            warmup = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = ICustomTabsServiceDefault + 29;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            TdsRoundLayout tdsRoundLayout3 = playableAdsPlayerActivity.writeTypedList().asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout3, "");
            onExtraCallbackWithResult(playableAdsPlayerActivity, tdsRoundLayout3, 100L, 0L, null, 12, null);
            TdsRoundLayout tdsRoundLayout4 = playableAdsPlayerActivity.writeTypedList().IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout4, "");
            onExtraCallbackWithResult(playableAdsPlayerActivity, tdsRoundLayout4, 200L, 0L, null, 12, null);
            AdsCircularCountdownLayout adsCircularCountdownLayout2 = playableAdsPlayerActivity.writeTypedList().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(adsCircularCountdownLayout2, "");
            onExtraCallbackWithResult(playableAdsPlayerActivity, adsCircularCountdownLayout2, 300L, 0L, null, 12, null);
        }
        playableAdsPlayerActivity.ITrustedWebActivityCallbackDefault();
    }

    private static final Unit asBinder(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 37;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            playableAdsPlayerActivity.onWarmupCompleted(str);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        playableAdsPlayerActivity.onWarmupCompleted(str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = warmup + 81;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit requestPostMessageChannel(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 33;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        playableAdsPlayerActivity.IPostMessageServiceDefault();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit warmup(PlayableAdsPlayerActivity playableAdsPlayerActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 107;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1214043452, new Object[]{playableAdsPlayerActivity}, 1214043465);
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 101;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 53;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(playableAdsPlayerActivity.newSession.get()));
        setDetectableSize.onExtraCallback("click_type", "cta");
        setDetectableSize.onExtraCallback("ad_id", playableAdsPlayerActivity.ICustomTabsServiceDefault());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", playableAdsPlayerActivity.IEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("ssp_request_id", playableAdsPlayerActivity.IEngagementSignalsCallbackDefault());
        setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 73;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit validateRelationship(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1229795L, false, (String) null, (Map) null, new PlayableAdsPlayerActivity$.ExternalSyntheticLambda4(playableAdsPlayerActivity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = warmup + 115;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit requestPostMessageChannelWithExtras(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 29;
        warmup = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = playableAdsPlayerActivity.getInterfaceDescriptor;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (playableAdsPlayerActivity.getInterfaceDescriptor) {
            int i4 = i2 + 121;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                playableAdsPlayerActivity.finish();
                int i5 = 55 / 0;
            } else {
                playableAdsPlayerActivity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 101;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 29;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, JSONObject jSONObject) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 41;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            playableAdsPlayerActivity.IPostMessageService_Parcel();
            if (jSONObject != null) {
                Object[] objArr = new Object[1];
                a((char) (ViewConfiguration.getScrollBarSize() >> 8), 615761040 - TextUtils.indexOf("", "", 0), new char[]{49306, 48267, 23030, 6360, 60832, 28566, 1900}, new char[]{0, 0, 0, 0}, new char[]{36866, 46020, 15652, 42375}, objArr);
                playableAdsPlayerActivity.onWarmupCompleted("MRAID Rendered detected: source=" + jSONObject.optString("source", ((String) objArr[0]).intern()) + ", latency=" + jSONObject.optLong("latencyMs", -1L) + "ms, hasAudio=" + jSONObject.optBoolean("hasAudio", true));
                playableAdsPlayerActivity.ICustomTabsCallbackStub = true;
                playableAdsPlayerActivity.notifyNotificationWithChannel();
                playableAdsPlayerActivity.ITrustedWebActivityCallbackDefault();
                int i3 = warmup + 119;
                ICustomTabsServiceDefault = i3 % 128;
                int i4 = i3 % 2;
            } else {
                playableAdsPlayerActivity.onWarmupCompleted("MRAID Rendered detected (no params)");
            }
            playableAdsPlayerActivity.IEngagementSignalsCallback_Parcel();
            return Unit.INSTANCE;
        }
        playableAdsPlayerActivity.IPostMessageService_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 47;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        webView.evaluateJavascript(str, null);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = ICustomTabsServiceDefault + 21;
        warmup = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, WebView webView, String str) {
        int i = 2 % 2;
        int i2 = warmup + 91;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            boolean z = playableAdsPlayerActivity.ICustomTabsCallbackStubProxy;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (playableAdsPlayerActivity.ICustomTabsCallbackStubProxy) {
            playableAdsPlayerActivity.runOnUiThread(new PlayableAdsPlayerActivity$.ExternalSyntheticLambda8(webView, str));
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsServiceDefault + 85;
        warmup = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final class access100 extends WebViewClient {
        access100() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) throws Throwable {
            Uri url;
            String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
            if (string == null) {
                string = "";
            }
            PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{PlayableAdsPlayerActivity.this, "Navigation blocked: " + string + ". Use mraid.open() instead."}, 1102686358);
            PlayableAdsPlayerActivity.onWarmupCompleted(PlayableAdsPlayerActivity.this, "unauthorized-navigation: " + string);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws Throwable {
            Uri url;
            Uri url2;
            String scheme = null;
            String string = (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString();
            if (string == null) {
                string = "";
            }
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                scheme = url.getScheme();
            }
            if (scheme == null) {
                scheme = "";
            }
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (Intrinsics.areEqual(lowerCase, "http") || Intrinsics.areEqual(lowerCase, "https")) {
                PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{PlayableAdsPlayerActivity.this, "External resource blocked: " + string}, 1102686358);
                PlayableAdsPlayerActivity.onWarmupCompleted(PlayableAdsPlayerActivity.this, "external-resource-blocked: " + string);
                return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream(new byte[0]));
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) throws Throwable {
            super.onPageFinished(webView, str);
            Object[] objArr = {PlayableAdsPlayerActivity.this};
            PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1003272613, objArr, 1003272624);
            PlayableAdsPlayerActivity.extraCommand(PlayableAdsPlayerActivity.this);
        }
    }

    public static final class getInterfaceDescriptor extends WebChromeClient {
        getInterfaceDescriptor() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) throws Throwable {
            if (consoleMessage != null) {
                PlayableAdsPlayerActivity playableAdsPlayerActivity = PlayableAdsPlayerActivity.this;
                String strMessage = consoleMessage.message();
                PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{playableAdsPlayerActivity, "JS " + consoleMessage.messageLevel() + ": " + strMessage}, 1102686358);
                Intrinsics.checkNotNull(strMessage);
                PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 870921869, new Object[]{playableAdsPlayerActivity, strMessage}, -870921843);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 9;
        warmup = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            motionEvent.getAction();
            obj.hashCode();
            throw null;
        }
        if (motionEvent.getAction() == 0) {
            playableAdsPlayerActivity.onWarmupCompleted("onTouch ACTION_DOWN");
            int i3 = ICustomTabsServiceDefault + 71;
            warmup = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = ICustomTabsServiceDefault + 113;
        warmup = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return false;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws JSONException {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int iIntValue5 = ((Number) objArr[6]).intValue();
        int iIntValue6 = ((Number) objArr[7]).intValue();
        int iIntValue7 = ((Number) objArr[8]).intValue();
        int iIntValue8 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = warmup + 115;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (iIntValue == iIntValue5 && iIntValue2 == iIntValue6 && iIntValue3 == iIntValue7) {
            int i4 = i3 + 109;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            if (iIntValue4 == iIntValue8) {
                return null;
            }
        }
        playableAdsPlayerActivity.ITrustedWebActivityCallback_Parcel();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void getActiveNotifications() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.PlayableAdsPlayerActivity.getActiveNotifications():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r1 r4
      0x0048: PHI (r1v7 im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout) = 
      (r1v5 im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout)
      (r1v6 im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout)
      (r1v9 im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout)
     binds: [B:8:0x002d, B:12:0x003c, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r4v2 int) = (r4v0 int), (r4v1 int), (r4v3 int) binds: [B:8:0x002d, B:12:0x003c, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1 r4 r5
      0x002f: PHI (r1v6 im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout) = (r1v5 im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout), (r1v9 im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r4v1 int) = (r4v0 int), (r4v3 int) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r5v1 long) = (r5v0 long), (r5v5 long) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ITrustedWebActivityCallbackStubProxy() {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.ads.PlayableAdsPlayerActivity.ICustomTabsServiceDefault
            int r1 = r1 + 1
            int r2 = r1 % 128
            viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L21
            o.getScaleY r1 = r13.writeTypedList()
            im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout r1 = r1.onWarmupCompleted
            int r4 = r13.onMessageChannelReady
            long r5 = r13.IAuthTabCallback_Parcel
            r7 = 1
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L48
            goto L2f
        L21:
            o.getScaleY r1 = r13.writeTypedList()
            im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout r1 = r1.onWarmupCompleted
            int r4 = r13.onMessageChannelReady
            long r5 = r13.IAuthTabCallback_Parcel
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L48
        L2f:
            int r7 = viva.republica.toss.ads.PlayableAdsPlayerActivity.ICustomTabsServiceDefault
            int r7 = r7 + 87
            int r8 = r7 % 128
            viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L43
            boolean r7 = r13.getInterfaceDescriptor
            if (r7 == 0) goto L3f
            goto L48
        L3f:
            r7 = r4
            r8 = r5
            r6 = r1
            goto L54
        L43:
            r0 = 0
            r0.hashCode()
            throw r0
        L48:
            int r5 = viva.republica.toss.ads.PlayableAdsPlayerActivity.ICustomTabsServiceDefault
            int r5 = r5 + 125
            int r6 = r5 % 128
            viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup = r6
            int r5 = r5 % r0
            r6 = r1
            r8 = r2
            r7 = r4
        L54:
            boolean r10 = r13.getInterfaceDescriptor
            viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda5 r11 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda5
            r11.<init>(r13)
            viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda6 r12 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda6
            r12.<init>(r13)
            r6.onWarmupCompleted(r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.PlayableAdsPlayerActivity.ITrustedWebActivityCallbackStubProxy():void");
    }

    private static final Unit onWarmupCompleted(PlayableAdsPlayerActivity playableAdsPlayerActivity, boolean z) {
        int i = 2 % 2;
        int i2 = warmup + 87;
        ICustomTabsServiceDefault = i2 % 128;
        playableAdsPlayerActivity.getInterfaceDescriptor = i2 % 2 == 0;
        playableAdsPlayerActivity.IAuthTabCallback_Parcel = 0L;
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        float fCurrentTimeMillis;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(playableAdsPlayerActivity.newSession.get()));
        setDetectableSize.onExtraCallback("ad_id", playableAdsPlayerActivity.ICustomTabsServiceDefault());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", playableAdsPlayerActivity.IEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("ssp_request_id", playableAdsPlayerActivity.IEngagementSignalsCallbackDefault());
        setDetectableSize.onExtraCallback("click_type", "close");
        if (playableAdsPlayerActivity.ICustomTabsCallback != null) {
            setDetectableSize.onExtraCallback("first_exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(((playableAdsPlayerActivity.extraCallbackWithResult + System.currentTimeMillis()) - r1.longValue()) / 1000.0f)));
            int i2 = warmup + 81;
            ICustomTabsServiceDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        if (playableAdsPlayerActivity.onMinimized != null) {
            int i4 = warmup + 125;
            ICustomTabsServiceDefault = i4 % 128;
            if (i4 % 2 != 0) {
                fCurrentTimeMillis = (r1.longValue() ^ (playableAdsPlayerActivity.onActivityResized - System.currentTimeMillis())) * 1000.0f;
            } else {
                fCurrentTimeMillis = ((playableAdsPlayerActivity.onActivityResized + System.currentTimeMillis()) - r1.longValue()) / 1000.0f;
            }
            setDetectableSize.onExtraCallback("load_exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(fCurrentTimeMillis)));
        }
        setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
        return Unit.INSTANCE;
    }

    private static final Unit setEngagementSignalsCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1955540L, false, (String) null, (Map) null, new PlayableAdsPlayerActivity$.ExternalSyntheticLambda16(playableAdsPlayerActivity), 14, (Object) null);
        playableAdsPlayerActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsServiceDefault + 111;
        warmup = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asBinder extends OnBackPressedCallback {
        asBinder() {
            super(true);
        }

        public void handleOnBackPressed() {
            if (PlayableAdsPlayerActivity.readTypedObject(PlayableAdsPlayerActivity.this)) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1955540L, false, (String) null, (Map) null, new PlayableAdsPlayerActivity$setBackPressed$1$.ExternalSyntheticLambda0(PlayableAdsPlayerActivity.this), 14, (Object) null);
                PlayableAdsPlayerActivity.this.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(PlayableAdsPlayerActivity.ICustomTabsCallbackStubProxy(playableAdsPlayerActivity).get()));
            setDetectableSize.onExtraCallback("ad_id", PlayableAdsPlayerActivity.getInterfaceDescriptor(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("advertise_space_unit_id", PlayableAdsPlayerActivity.access000(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ssp_request_id", PlayableAdsPlayerActivity.onRelationshipValidationResult(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("click_type", "back");
            if (PlayableAdsPlayerActivity.onActivityResized(playableAdsPlayerActivity) != null) {
                setDetectableSize.onExtraCallback("first_exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(((PlayableAdsPlayerActivity.onMessageChannelReady(playableAdsPlayerActivity) + System.currentTimeMillis()) - r0.longValue()) / 1000.0f)));
            }
            if (PlayableAdsPlayerActivity.onMinimized(playableAdsPlayerActivity) != null) {
                setDetectableSize.onExtraCallback("load_exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(((PlayableAdsPlayerActivity.onPostMessage(playableAdsPlayerActivity) + System.currentTimeMillis()) - r0.longValue()) / 1000.0f)));
            }
            setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
            return Unit.INSTANCE;
        }
    }

    private final void cancelNotification() {
        int i = 2 % 2;
        getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new asBinder());
        int i2 = ICustomTabsServiceDefault + 61;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            if (this.onActivityLayout.compareAndSet(false, true)) {
                runOnUiThread(new PlayableAdsPlayerActivity$.ExternalSyntheticLambda1(this));
            }
            int iAddAndGet = this.newSession.addAndGet(1);
            if (iAddAndGet == 1) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1229795L, false, (String) null, (Map) null, new PlayableAdsPlayerActivity$.ExternalSyntheticLambda2(iAddAndGet, this), 14, (Object) null);
            }
            if (this.ICustomTabsCallback == null) {
                int i2 = ICustomTabsServiceDefault + 61;
                warmup = i2 % 128;
                if (i2 % 2 == 0) {
                    this.ICustomTabsCallback = Long.valueOf(System.currentTimeMillis());
                    int i3 = 15 / 0;
                } else {
                    this.ICustomTabsCallback = Long.valueOf(System.currentTimeMillis());
                }
            }
            Result.constructor-impl(Unit.INSTANCE);
            int i4 = ICustomTabsServiceDefault + 85;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private static final void newAuthTabSession(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            playableAdsPlayerActivity.writeTypedList().ICustomTabsCallback.evaluateJavascript("console.log('PLAYABLE_FIRST_INTERACTION')", null);
            Result.constructor-impl(Unit.INSTANCE);
            int i2 = warmup + 7;
            ICustomTabsServiceDefault = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.Companion;
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (playableAdsPlayerActivity.ICustomTabsCallbackStub) {
            int i4 = ICustomTabsServiceDefault + 81;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            playableAdsPlayerActivity.ITrustedWebActivityCallbackDefault();
            if (i5 == 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = warmup + 113;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("touch_cnt", Integer.valueOf(iIntValue));
        setDetectableSize.onExtraCallback("click_type", "touch");
        setDetectableSize.onExtraCallback("ad_id", playableAdsPlayerActivity.ICustomTabsServiceDefault());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", playableAdsPlayerActivity.IEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("ssp_request_id", playableAdsPlayerActivity.IEngagementSignalsCallbackDefault());
        setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 3;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlayableAdsPlayerActivity.this.new onExtraCallback(access13800Var);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    PlayableAdsPlayerActivity playableAdsPlayerActivity = PlayableAdsPlayerActivity.this;
                    Result.Companion companion = Result.Companion;
                    if (((Boolean) PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 170975258, new Object[]{playableAdsPlayerActivity}, -170975252)).booleanValue()) {
                        obj = DERObjectIdentifier.IAuthTabCallback.onExtraCallback();
                    } else {
                        setTranslateY settranslateyICustomTabsServiceStub = playableAdsPlayerActivity.ICustomTabsServiceStub();
                        String strOnExtraCallback = ConstraintTrackingWorkerExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback();
                        String interfaceDescriptor = PlayableAdsPlayerActivity.getInterfaceDescriptor(playableAdsPlayerActivity);
                        String strAsInterface = PlayerErrorCode.asInterface();
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        obj = settranslateyICustomTabsServiceStub.onExtraCallbackWithResult(interfaceDescriptor, strAsInterface, strOnExtraCallback, this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            PlayableAdsPlayerActivity playableAdsPlayerActivity2 = PlayableAdsPlayerActivity.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{playableAdsPlayerActivity2, "Failed to get playable ad info: " + th.getMessage()}, 1102686358);
                playableAdsPlayerActivity2.finish();
                return Unit.INSTANCE;
            }
            PlayableAdInfoResponse playableAdInfoResponse = (PlayableAdInfoResponse) obj2;
            PlayableAdsPlayerActivity.asInterface(PlayableAdsPlayerActivity.this, playableAdInfoResponse.onExtraCallbackWithResult());
            PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 359386387, new Object[]{PlayableAdsPlayerActivity.this, playableAdInfoResponse}, -359386366);
            if (((Boolean) PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 170975258, new Object[]{PlayableAdsPlayerActivity.this}, -170975252)).booleanValue() && PlayableAdsPlayerActivity.ICustomTabsCallback_Parcel(PlayableAdsPlayerActivity.this)) {
                PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1835889099, new Object[]{PlayableAdsPlayerActivity.this, "playable-reward.html"}, -1835889085);
            } else {
                PlayableAdsPlayerActivity.IAuthTabCallback(PlayableAdsPlayerActivity.this, playableAdInfoResponse.IAuthTabCallback(), playableAdInfoResponse.onWarmupCompleted());
            }
            infoForChild infoforchildOnActivityLayout = PlayableAdsPlayerActivity.onActivityLayout(PlayableAdsPlayerActivity.this);
            if (infoforchildOnActivityLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                infoforchildOnActivityLayout = null;
            }
            infoforchildOnActivityLayout.IAuthTabCallback(playableAdInfoResponse.onNavigationEvent());
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(playableAdsPlayerActivity), (CoroutineContext) null, (setRandomHost) null, playableAdsPlayerActivity.new onExtraCallback(null), 3, (Object) null);
        int i2 = warmup + 7;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $assetFileName;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$assetFileName = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlayableAdsPlayerActivity.this.new onNavigationEvent(this.$assetFileName, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: viva.republica.toss.ads.PlayableAdsPlayerActivity$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        static final class C0021onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
            final /* synthetic */ String $assetFileName;
            int label;
            final /* synthetic */ PlayableAdsPlayerActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0021onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str, access13800<? super C0021onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = playableAdsPlayerActivity;
                this.$assetFileName = str;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new C0021onNavigationEvent(this.this$0, this.$assetFileName, access13800Var);
            }

            public final Object invokeSuspend(Object obj) throws IOException {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                InputStream inputStreamOpen = this.this$0.getAssets().open(this.$assetFileName);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
                try {
                    String text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                    return text;
                } finally {
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        
            if (r8 == r0) goto L17;
         */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, viva.republica.toss.ads.PlayableAdsPlayerActivity] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r7.L$0
                java.lang.String r0 = (java.lang.String) r0
                kotlin.ResultKt.onNavigationEvent(r8)
                goto L57
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.ResultKt.onNavigationEvent(r8)
                goto L3b
            L23:
                kotlin.ResultKt.onNavigationEvent(r8)
                o.GeckoHubImp r8 = o.putChannelInfo.IAuthTabCallback()
                viva.republica.toss.ads.PlayableAdsPlayerActivity$onNavigationEvent$onNavigationEvent r1 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$onNavigationEvent$onNavigationEvent
                viva.republica.toss.ads.PlayableAdsPlayerActivity r5 = viva.republica.toss.ads.PlayableAdsPlayerActivity.this
                java.lang.String r6 = r7.$assetFileName
                r1.<init>(r5, r6, r4)
                r7.label = r3
                java.lang.Object r8 = o.maybeUpdateAnimatable.onExtraCallback(r8, r1, r7)
                if (r8 == r0) goto L66
            L3b:
                java.lang.String r8 = (java.lang.String) r8
                o.GeckoHubImp r1 = o.putChannelInfo.onWarmupCompleted()
                viva.republica.toss.ads.PlayableAdsPlayerActivity$onNavigationEvent$IAuthTabCallback r3 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$onNavigationEvent$IAuthTabCallback
                viva.republica.toss.ads.PlayableAdsPlayerActivity r5 = viva.republica.toss.ads.PlayableAdsPlayerActivity.this
                r3.<init>(r5, r8, r4)
                java.lang.Object r8 = o.access15400.onNavigationEvent(r8)
                r7.L$0 = r8
                r7.label = r2
                java.lang.Object r8 = o.maybeUpdateAnimatable.onExtraCallback(r1, r3, r7)
                if (r8 != r0) goto L57
                goto L66
            L57:
                java.lang.String r8 = (java.lang.String) r8
                viva.republica.toss.ads.PlayableAdsPlayerActivity r0 = viva.republica.toss.ads.PlayableAdsPlayerActivity.this
                viva.republica.toss.ads.PlayableAdsPlayerActivity$loadHtmlFromAsset$1$$ExternalSyntheticLambda0 r1 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$loadHtmlFromAsset$1$$ExternalSyntheticLambda0
                r1.<init>()
                r0.runOnUiThread(r1)
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L66:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.PlayableAdsPlayerActivity.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
            final /* synthetic */ String $html;
            int label;
            final /* synthetic */ PlayableAdsPlayerActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = playableAdsPlayerActivity;
                this.$html = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new IAuthTabCallback(this.this$0, this.$html, access13800Var);
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                PlayableAdsPlayerActivity playableAdsPlayerActivity = this.this$0;
                return PlayableAdsPlayerActivity.onNavigationEvent(playableAdsPlayerActivity, this.$html, PlayableAdsPlayerActivity.onUnminimized(playableAdsPlayerActivity));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            ((getScaleY) PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1593890037, new Object[]{playableAdsPlayerActivity}, -1593890029)).ICustomTabsCallback.loadDataWithBaseURL("file:///android_asset/", str, "text/html", "utf-8", null);
        }
    }

    private final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 99;
        int i3 = i2 % 128;
        warmup = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!this.IAuthTabCallbackStubProxy) {
                this.IAuthTabCallbackStubProxy = true;
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), this.writeTypedObject, (setRandomHost) null, new onNavigationEvent(str, null), 2, (Object) null);
                return;
            }
            int i4 = i3 + 103;
            ICustomTabsServiceDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 34 / 0;
                return;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $mraidJsUrl;
        final /* synthetic */ String $urlString;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(String str, String str2, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$urlString = str;
            this.$mraidJsUrl = str2;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlayableAdsPlayerActivity.this.new IAuthTabCallback(this.$urlString, this.$mraidJsUrl, access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b1, code lost:
        
            if (r13 == r0) goto L21;
         */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, viva.republica.toss.ads.PlayableAdsPlayerActivity] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r0 = r12.L$2
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r12.L$1
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r12.L$0
                kotlin.Pair r0 = (kotlin.Pair) r0
                kotlin.ResultKt.onNavigationEvent(r13)
                goto Lb4
            L20:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L28:
                kotlin.ResultKt.onNavigationEvent(r13)
                goto L76
            L2c:
                kotlin.ResultKt.onNavigationEvent(r13)
                viva.republica.toss.ads.PlayableAdsPlayerActivity r13 = viva.republica.toss.ads.PlayableAdsPlayerActivity.this
                java.lang.String r1 = r12.$urlString
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "loadHtmlFromCdn start (Large file support): "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                java.lang.Object[] r10 = new java.lang.Object[]{r13, r1}
                int r8 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
                int r5 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
                int r6 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
                int r7 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
                r11 = 1102686358(0x41b9a896, float:23.207317)
                r9 = -1102686333(0xffffffffbe465783, float:-0.1936932)
                viva.republica.toss.ads.PlayableAdsPlayerActivity.onExtraCallback(r5, r6, r7, r8, r9, r10, r11)
                viva.republica.toss.ads.PlayableAdsPlayerActivity$IAuthTabCallback$onNavigationEvent r13 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$IAuthTabCallback$onNavigationEvent
                viva.republica.toss.ads.PlayableAdsPlayerActivity r1 = viva.republica.toss.ads.PlayableAdsPlayerActivity.this
                java.lang.String r5 = r12.$urlString
                java.lang.String r6 = r12.$mraidJsUrl
                r13.<init>(r1, r5, r6, r4)
                r12.label = r3
                r5 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r13 = o.doGet.onWarmupCompleted(r5, r13, r12)
                if (r13 == r0) goto Lc5
            L76:
                kotlin.Pair r13 = (kotlin.Pair) r13
                if (r13 != 0) goto L82
                viva.republica.toss.ads.PlayableAdsPlayerActivity r13 = viva.republica.toss.ads.PlayableAdsPlayerActivity.this
                r13.finish()
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            L82:
                java.lang.Object r1 = r13.onExtraCallbackWithResult()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r13.IAuthTabCallback()
                java.lang.String r3 = (java.lang.String) r3
                o.GeckoHubImp r5 = o.putChannelInfo.onWarmupCompleted()
                viva.republica.toss.ads.PlayableAdsPlayerActivity$IAuthTabCallback$onExtraCallbackWithResult r6 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$IAuthTabCallback$onExtraCallbackWithResult
                viva.republica.toss.ads.PlayableAdsPlayerActivity r7 = viva.republica.toss.ads.PlayableAdsPlayerActivity.this
                r6.<init>(r7, r1, r3, r4)
                java.lang.Object r13 = o.access15400.onNavigationEvent(r13)
                r12.L$0 = r13
                java.lang.Object r13 = o.access15400.onNavigationEvent(r1)
                r12.L$1 = r13
                java.lang.Object r13 = o.access15400.onNavigationEvent(r3)
                r12.L$2 = r13
                r12.label = r2
                java.lang.Object r13 = o.maybeUpdateAnimatable.onExtraCallback(r5, r6, r12)
                if (r13 != r0) goto Lb4
                goto Lc5
            Lb4:
                java.lang.String r13 = (java.lang.String) r13
                viva.republica.toss.ads.PlayableAdsPlayerActivity r0 = viva.republica.toss.ads.PlayableAdsPlayerActivity.this
                viva.republica.toss.ads.PlayableAdsPlayerActivity$loadHtmlFromCdn$1$$ExternalSyntheticLambda0 r1 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$loadHtmlFromCdn$1$$ExternalSyntheticLambda0
                java.lang.String r2 = r12.$urlString
                r1.<init>()
                r0.runOnUiThread(r1)
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            Lc5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.PlayableAdsPlayerActivity.IAuthTabCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends String>>, Object> {
            final /* synthetic */ String $mraidJsUrl;
            final /* synthetic */ String $urlString;
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ PlayableAdsPlayerActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str, String str2, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = playableAdsPlayerActivity;
                this.$urlString = str;
                this.$mraidJsUrl = str2;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Pair<String, String>> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onNavigationEvent(this.this$0, this.$urlString, this.$mraidJsUrl, access13800Var);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:62)|(1:(1:(12:6|56|7|8|60|27|(3:54|29|30)|38|(1:40)|41|50|(1:52)(1:64))(2:11|12))(3:13|14|15))(4:16|17|(1:19)|43)|20|58|21|(1:23)|24|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
            
                if (r4 == r0) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Removed duplicated region for block: B:40:0x013c A[Catch: Exception -> 0x014b, CancellationException -> 0x0157, WebResourceResponseModel -> 0x0159, TryCatch #6 {WebResourceResponseModel -> 0x0159, CancellationException -> 0x0157, Exception -> 0x014b, blocks: (B:38:0x0136, B:40:0x013c, B:41:0x0140, B:37:0x0108, B:14:0x0048, B:20:0x0093, B:17:0x0058), top: B:62:0x000c }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x016a A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 364
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.PlayableAdsPlayerActivity.IAuthTabCallback.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
            final /* synthetic */ String $htmlBody;
            final /* synthetic */ String $mraidJs;
            int label;
            final /* synthetic */ PlayableAdsPlayerActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str, String str2, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = playableAdsPlayerActivity;
                this.$htmlBody = str;
                this.$mraidJs = str2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallbackWithResult(this.this$0, this.$htmlBody, this.$mraidJs, access13800Var);
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return PlayableAdsPlayerActivity.onNavigationEvent(this.this$0, this.$htmlBody, this.$mraidJs);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str, String str2) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            ((getScaleY) PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1593890037, new Object[]{playableAdsPlayerActivity}, -1593890029)).ICustomTabsCallback.loadDataWithBaseURL(str, str2, "text/html", "utf-8", null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r1.IAuthTabCallbackStubProxy = true;
        o.maybeUpdateAnimatable.onNavigationEvent(o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r1), r1.writeTypedObject, (o.setRandomHost) null, new viva.republica.toss.ads.PlayableAdsPlayerActivity.IAuthTabCallback(r1, r3, r8, null), 2, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r1.IAuthTabCallbackStubProxy != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r1.IAuthTabCallbackStubProxy != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r6 = r6 + 73;
        viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStub(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            viva.republica.toss.ads.PlayableAdsPlayerActivity r1 = (viva.republica.toss.ads.PlayableAdsPlayerActivity) r1
            r2 = 1
            r3 = r8[r2]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            r8 = r8[r4]
            java.lang.String r8 = (java.lang.String) r8
            int r5 = r4 % r4
            int r5 = viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup
            int r5 = r5 + 119
            int r6 = r5 % 128
            viva.republica.toss.ads.PlayableAdsPlayerActivity.ICustomTabsServiceDefault = r6
            int r5 = r5 % r4
            r7 = 0
            if (r5 == 0) goto L24
            boolean r5 = r1.IAuthTabCallbackStubProxy
            int r0 = r4 / 0
            if (r5 == 0) goto L30
            goto L28
        L24:
            boolean r0 = r1.IAuthTabCallbackStubProxy
            if (r0 == 0) goto L30
        L28:
            int r6 = r6 + 73
            int r8 = r6 % 128
            viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup = r8
            int r6 = r6 % r4
            return r7
        L30:
            r1.IAuthTabCallbackStubProxy = r2
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r0 = o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r1)
            kotlinx.coroutines.CoroutineExceptionHandler r2 = r1.writeTypedObject
            r4 = 0
            viva.republica.toss.ads.PlayableAdsPlayerActivity$IAuthTabCallback r5 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$IAuthTabCallback
            r5.<init>(r3, r8, r7)
            r8 = 2
            r6 = 0
            r1 = r2
            r2 = r4
            r3 = r5
            r4 = r8
            r5 = r6
            o.maybeUpdateAnimatable.onNavigationEvent(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.PlayableAdsPlayerActivity.IAuthTabCallbackStub(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        String strReplace = new Regex("<script[^>]+src=[\\\"'][^\\\"']*mraid(?:\\.js)?[^\\\"']*[\\\"'][^>]*>.*?</script>", clearFaultAdjacentMetadata.onExtraCallback(new RegexOption[]{regexOption, RegexOption.DOT_MATCHES_ALL})).replace(str, "");
        MatchResult matchResultFind$default = Regex.find$default(new Regex("<head[^>]*>", regexOption), strReplace, 0, 2, (Object) null);
        String str3 = "\n<script type=\"text/javascript\">\n" + str2 + "\n</script>\n";
        if (matchResultFind$default != null) {
            int last = matchResultFind$default.onExtraCallback().getLast() + 1;
            StringBuilder sb = new StringBuilder(strReplace.length() + str3.length());
            String strSubstring = strReplace.substring(0, last);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            sb.append(strSubstring);
            sb.append(str3);
            String strSubstring2 = strReplace.substring(last);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            sb.append(strSubstring2);
            String string = sb.toString();
            Intrinsics.checkNotNull(string);
            return string;
        }
        String str4 = "<html><head>" + str3 + "</head>" + strReplace + "</html>";
        int i2 = warmup + 41;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        return str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        try {
            File file = new File(new File(getFilesDir(), "ads_sdk/mraid"), "mraid_cache.js");
            if (!(!file.exists())) {
                int i2 = warmup + 119;
                ICustomTabsServiceDefault = i2 % 128;
                int i3 = i2 % 2;
                String text = FilesKt.readText(file, Charsets.UTF_8);
                int i4 = warmup + 89;
                ICustomTabsServiceDefault = i4 % 128;
                int i5 = i4 % 2;
                return text;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $jsContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(String str, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$jsContent = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlayableAdsPlayerActivity.this.new onTransact(this.$jsContent, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            try {
                File file = new File(PlayableAdsPlayerActivity.this.getFilesDir(), "ads_sdk/mraid");
                if (!file.exists()) {
                    file.mkdirs();
                }
                FilesKt.writeText(new File(file, "mraid_cache.js"), this.$jsContent, Charsets.UTF_8);
                PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{PlayableAdsPlayerActivity.this, "MRAID cache updated in internal storage"}, 1102686358);
            } catch (Exception e) {
                PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{PlayableAdsPlayerActivity.this, "Failed to cache MRAID JS: " + e.getMessage()}, 1102686358);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onTransact(str, null), 2, (Object) null);
        int i2 = ICustomTabsServiceDefault + 43;
        warmup = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onWarmupCompleted(String str) {
        Object orNull;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 125;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            orNull = ArraysKt.getOrNull(stackTrace, 5);
        } else {
            StackTraceElement[] stackTrace2 = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "");
            orNull = ArraysKt.getOrNull(stackTrace2, 4);
        }
        int i3 = warmup + 87;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        StringsKt.contains$default(str, "PLAYABLE_FIRST_INTERACTION", false, 2, (Object) null);
        if (!StringsKt.startsWith(str, "PLAYABLE_ERROR:", true) && !StringsKt.contains(str, "external", true)) {
            int i2 = ICustomTabsServiceDefault + 57;
            warmup = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 50 / 0;
                return;
            }
            return;
        }
        int iOnExtraCallback = r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4.onExtraCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4.onExtraCallback(), iOnExtraCallback, -1673005904, new Object[]{this, str}, 1673005914);
        int i4 = ICustomTabsServiceDefault + 33;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IPostMessageService_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 65;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallback_Parcel = true;
        ITrustedWebActivityCallbackStub();
        if (this.onMinimized == null) {
            int i4 = warmup + 41;
            ICustomTabsServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            this.onMinimized = Long.valueOf(System.currentTimeMillis());
            int i6 = warmup + 99;
            ICustomTabsServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static final Unit onExtraCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = warmup + 23;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("ad_id", playableAdsPlayerActivity.ICustomTabsServiceDefault());
        setDetectableSize.onExtraCallback("advertise_space_unit_id", playableAdsPlayerActivity.IEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("ssp_request_id", playableAdsPlayerActivity.IEngagementSignalsCallbackDefault());
        setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
        if (playableAdsPlayerActivity.onPostMessage != null) {
            setDetectableSize.onExtraCallback("exposure_time", Long.valueOf(getBacktraceNoteBytes.onExtraCallbackWithResult(((playableAdsPlayerActivity.readTypedObject + System.currentTimeMillis()) - r1.longValue()) / 1000.0f)));
        }
        setDetectableSize.onExtraCallback("share_yn", ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 466488007, new Object[]{playableAdsPlayerActivity}, -466487990)).booleanValue() ^ true ? "N" : "Y");
        Unit unit = Unit.INSTANCE;
        int i4 = warmup + 15;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlayableAdsPlayerActivity.this.new IAuthTabCallbackStub(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Object[] objArr = {PlayableAdsPlayerActivity.this};
            if (!((Boolean) PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -100233618, objArr, 100233630)).booleanValue()) {
                return Unit.INSTANCE;
            }
            if (PlayableAdsPlayerActivity.ICustomTabsCallbackStub(PlayableAdsPlayerActivity.this).add(access14000.onExtraCallback(1293117L))) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1293117L, false, (String) null, (Map) null, new PlayableAdsPlayerActivity$maybeLogImpressionsBySpec$2$.ExternalSyntheticLambda0(PlayableAdsPlayerActivity.this), 14, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
            setDetectableSize.onExtraCallback("ad_id", PlayableAdsPlayerActivity.getInterfaceDescriptor(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("advertise_space_unit_id", PlayableAdsPlayerActivity.access000(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ssp_request_id", PlayableAdsPlayerActivity.onRelationshipValidationResult(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
            return Unit.INSTANCE;
        }
    }

    private final void ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        if (this.ICustomTabsCallback_Parcel) {
            int i2 = ICustomTabsServiceDefault + 65;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            if (this.access100) {
                if (this.ICustomTabsService.add(1229791L)) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1229791L, false, (String) null, (Map) null, new PlayableAdsPlayerActivity$.ExternalSyntheticLambda22(this), 14, (Object) null);
                    int i4 = ICustomTabsServiceDefault + 85;
                    warmup = i4 % 128;
                    int i5 = i4 % 2;
                }
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
            }
        }
        int i6 = ICustomTabsServiceDefault + 19;
        warmup = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NativeAdsPlayableAdActivity", "reportPlayableError " + playableAdsPlayerActivity.ICustomTabsServiceDefault() + " reason " + str, (Throwable) null, (Map) null, 12, (Object) null);
        int i2 = ICustomTabsServiceDefault + 71;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
        return null;
    }

    @Override // viva.republica.toss.ads.Hilt_PlayableAdsPlayerActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = warmup + 83;
        ICustomTabsServiceDefault = i2 % 128;
        infoForChild infoforchild = null;
        try {
            if (i2 % 2 != 0) {
                super.onPause();
                Result.Companion companion = Result.Companion;
                writeTypedList().ICustomTabsCallback.onPause();
                infoforchild.hashCode();
                throw null;
            }
            super.onPause();
            Result.Companion companion2 = Result.Companion;
            writeTypedList().ICustomTabsCallback.onPause();
            infoForChild infoforchild2 = this.extraCommand;
            if (infoforchild2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                infoforchild2 = null;
            }
            infoforchild2.onExtraCallback("hidden");
            infoForChild infoforchild3 = this.extraCommand;
            if (infoforchild3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = warmup + 79;
                ICustomTabsServiceDefault = i3 % 128;
                int i4 = i3 % 2;
            } else {
                infoforchild = infoforchild3;
            }
            infoforchild.onExtraCallbackWithResult(false);
            this.access100 = false;
            Result.constructor-impl(Unit.INSTANCE);
            int i5 = warmup + 81;
            ICustomTabsServiceDefault = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    @Override // viva.republica.toss.ads.Hilt_PlayableAdsPlayerActivity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        try {
            Result.Companion companion = Result.Companion;
            writeTypedList().ICustomTabsCallback.onResume();
            infoForChild infoforchild = this.extraCommand;
            infoForChild infoforchild2 = null;
            if (infoforchild == null) {
                int i2 = ICustomTabsServiceDefault + 95;
                warmup = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                infoforchild = null;
            }
            infoforchild.onExtraCallback("default");
            infoForChild infoforchild3 = this.extraCommand;
            if (infoforchild3 == null) {
                int i4 = ICustomTabsServiceDefault + 121;
                warmup = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                infoforchild2 = infoforchild3;
            }
            infoforchild2.onExtraCallbackWithResult(true);
            this.access100 = true;
            ITrustedWebActivityCallbackStub();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public void onDestroy() {
        int i = 2 % 2;
        this.ICustomTabsCallbackStubProxy = false;
        ITrustedWebActivityServiceStub();
        try {
            Result.Companion companion = Result.Companion;
            infoForChild infoforchild = this.extraCommand;
            if (infoforchild == null) {
                int i2 = ICustomTabsServiceDefault + 107;
                warmup = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i3 = 6 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                infoforchild = null;
            }
            infoforchild.onExtraCallbackWithResult();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
            int i4 = ICustomTabsServiceDefault + 83;
            warmup = i4 % 128;
            int i5 = i4 % 2;
        }
        try {
            Result.Companion companion3 = Result.Companion;
            writeTypedList().ICustomTabsCallback.removeJavascriptInterface("TossMraid");
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
        try {
            Result.Companion companion5 = Result.Companion;
            writeTypedList().ICustomTabsCallback.removeJavascriptInterface("AndroidMraidLog");
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th3));
        }
        try {
            Result.Companion companion7 = Result.Companion;
            writeTypedList().ICustomTabsCallback.loadUrl("about:blank");
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th4));
        }
        try {
            Result.Companion companion9 = Result.Companion;
            writeTypedList().ICustomTabsCallback.stopLoading();
            Result.constructor-impl(Unit.INSTANCE);
            int i6 = ICustomTabsServiceDefault + 35;
            warmup = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th5) {
            Result.Companion companion10 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th5));
        }
        try {
            Result.Companion companion11 = Result.Companion;
            writeTypedList().ICustomTabsCallback.setWebChromeClient(null);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th6) {
            Result.Companion companion12 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th6));
        }
        try {
            Result.Companion companion13 = Result.Companion;
            writeTypedList().ICustomTabsCallback.setWebViewClient(new WebViewClient());
            Result.constructor-impl(Unit.INSTANCE);
            int i8 = warmup + 3;
            ICustomTabsServiceDefault = i8 % 128;
            int i9 = i8 % 2;
        } catch (Throwable th7) {
            Result.Companion companion14 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th7));
        }
        try {
            Result.Companion companion15 = Result.Companion;
            writeTypedList().ICustomTabsCallback.destroy();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th8) {
            Result.Companion companion16 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th8));
        }
        super.onDestroy();
    }

    public static final class IAuthTabCallbackDefault extends ContentObserver {
        private int onExtraCallbackWithResult;

        IAuthTabCallbackDefault(Handler handler) {
            super(handler);
            AudioManager audioManagerExtraCallbackWithResult = PlayableAdsPlayerActivity.extraCallbackWithResult(PlayableAdsPlayerActivity.this);
            if (audioManagerExtraCallbackWithResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                audioManagerExtraCallbackWithResult = null;
            }
            this.onExtraCallbackWithResult = audioManagerExtraCallbackWithResult.getStreamVolume(3);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AudioManager audioManagerExtraCallbackWithResult = PlayableAdsPlayerActivity.extraCallbackWithResult(PlayableAdsPlayerActivity.this);
            if (audioManagerExtraCallbackWithResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                audioManagerExtraCallbackWithResult = null;
            }
            int streamVolume = audioManagerExtraCallbackWithResult.getStreamVolume(3);
            if (streamVolume != this.onExtraCallbackWithResult) {
                this.onExtraCallbackWithResult = streamVolume;
                PlayableAdsPlayerActivity.extraCommand(PlayableAdsPlayerActivity.this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityCallback() {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.isEngagementSignalsApiAvailable);
            getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, iAuthTabCallbackDefault);
            this.receiveFile = iAuthTabCallbackDefault;
            Result.constructor-impl(Unit.INSTANCE);
            int i2 = ICustomTabsServiceDefault + 85;
            warmup = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityServiceStub() {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            ContentObserver contentObserver = this.receiveFile;
            if (contentObserver != null) {
                int i2 = ICustomTabsServiceDefault + 35;
                warmup = i2 % 128;
                int i3 = i2 % 2;
                getContentResolver().unregisterContentObserver(contentObserver);
                int i4 = warmup + 17;
                ICustomTabsServiceDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 5;
                }
            }
            this.receiveFile = null;
            Result.constructor-impl(Unit.INSTANCE);
            int i6 = warmup + 95;
            ICustomTabsServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private final Map<String, JSONObject> onSessionEnded() throws JSONException {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        writeTypedList().ICustomTabsCallback.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        int width = writeTypedList().ICustomTabsCallback.getWidth();
        int height = writeTypedList().ICustomTabsCallback.getHeight();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", onExtraCallback(i2));
        jSONObject.put("height", onExtraCallback(i3));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", onExtraCallback(width));
        jSONObject2.put("height", onExtraCallback(height));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("x", onExtraCallback(i4));
        jSONObject3.put("y", onExtraCallback(i5));
        jSONObject3.put("width", onExtraCallback(width));
        jSONObject3.put("height", onExtraCallback(height));
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("x", onExtraCallback(i4));
        jSONObject4.put("y", onExtraCallback(i5));
        jSONObject4.put("width", onExtraCallback(width));
        jSONObject4.put("height", onExtraCallback(height));
        Map<String, JSONObject> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("screenSize", jSONObject), getWrite.IAuthTabCallback("maxSize", jSONObject2), getWrite.IAuthTabCallback("defaultPosition", jSONObject3), getWrite.IAuthTabCallback("currentPosition", jSONObject4)});
        int i6 = warmup + 115;
        ICustomTabsServiceDefault = i6 % 128;
        int i7 = i6 % 2;
        return mapOnWarmupCompleted;
    }

    private final void ITrustedWebActivityService() throws JSONException {
        infoForChild infoforchild;
        int i = 2 % 2;
        Map<String, JSONObject> mapOnSessionEnded = onSessionEnded();
        JSONObject jSONObjectPut = new JSONObject().put("sms", false).put("tel", true).put("calendar", false).put("storePicture", false).put("inlineVideo", true);
        infoForChild infoforchild2 = this.extraCommand;
        Object obj = null;
        if (infoforchild2 == null) {
            int i2 = ICustomTabsServiceDefault + 73;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            infoforchild = null;
        } else {
            infoforchild = infoforchild2;
        }
        JSONObject jSONObject = mapOnSessionEnded.get("screenSize");
        Intrinsics.checkNotNull(jSONObject);
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = mapOnSessionEnded.get("maxSize");
        Intrinsics.checkNotNull(jSONObject3);
        JSONObject jSONObject4 = jSONObject3;
        JSONObject jSONObject5 = mapOnSessionEnded.get("defaultPosition");
        Intrinsics.checkNotNull(jSONObject5);
        JSONObject jSONObject6 = mapOnSessionEnded.get("currentPosition");
        Intrinsics.checkNotNull(jSONObject6);
        Intrinsics.checkNotNull(jSONObjectPut);
        infoforchild.onExtraCallbackWithResult("", jSONObject2, jSONObject4, jSONObject5, jSONObject6, jSONObjectPut);
        int i4 = ICustomTabsServiceDefault + 89;
        warmup = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void ITrustedWebActivityCallback_Parcel() throws JSONException {
        int i = 2 % 2;
        if (this.extraCommand == null) {
            return;
        }
        Map<String, JSONObject> mapOnSessionEnded = onSessionEnded();
        JSONObject jSONObject = mapOnSessionEnded.get("currentPosition");
        Intrinsics.checkNotNull(jSONObject);
        JSONObject jSONObject2 = jSONObject;
        infoForChild infoforchild = this.extraCommand;
        if (infoforchild == null) {
            int i2 = ICustomTabsServiceDefault + 21;
            warmup = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            infoforchild = null;
        }
        infoforchild.onNavigationEvent(jSONObject2.getInt("width"), jSONObject2.getInt("height"), mapOnSessionEnded.get("maxSize"), jSONObject2, mapOnSessionEnded.get("defaultPosition"));
        int i4 = ICustomTabsServiceDefault + 47;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(final View view) {
        int i = 2 % 2;
        validateRelationship();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(varyMatches.IAuthTabCallback(2, this), 0);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(new Rmenu.onNavigationEvent(1.0d, 0.2d));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) throws Throwable {
                Object[] objArr = {view, valueAnimator};
                PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1753327834, objArr, 1753327839);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new ICustomTabsCallback(view));
        valueAnimatorOfInt.addListener(new writeTypedObject(view));
        valueAnimatorOfInt.start();
        this.setEngagementSignalsCallback = valueAnimatorOfInt;
        int i2 = ICustomTabsServiceDefault + 43;
        warmup = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 71;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Intrinsics.checkNotNull(valueAnimator.getAnimatedValue(), "");
        view.setTranslationX(((Integer) r4).intValue());
        int i4 = warmup + 11;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void validateRelationship() {
        int i = 2 % 2;
        int i2 = warmup + 53;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ValueAnimator valueAnimator = this.setEngagementSignalsCallback;
        if (valueAnimator != null) {
            int i4 = i3 + 125;
            warmup = i4 % 128;
            int i5 = i4 % 2;
            valueAnimator.cancel();
            if (i5 == 0) {
                throw null;
            }
        }
    }

    @Override // viva.republica.toss.ads.Hilt_PlayableAdsPlayerActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 93;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.ICustomTabsCallbackStubProxy = true;
        Object obj = null;
        if (this.onMinimized != null) {
            int i4 = ICustomTabsServiceDefault + 79;
            warmup = i4 % 128;
            if (i4 % 2 == 0) {
                this.onMinimized = Long.valueOf(System.currentTimeMillis());
                throw null;
            }
            this.onMinimized = Long.valueOf(System.currentTimeMillis());
        }
        if (this.ICustomTabsCallback != null) {
            int i5 = ICustomTabsServiceDefault + 23;
            warmup = i5 % 128;
            int i6 = i5 % 2;
            this.ICustomTabsCallback = Long.valueOf(System.currentTimeMillis());
        }
        if (this.onPostMessage != null) {
            int i7 = warmup + 29;
            ICustomTabsServiceDefault = i7 % 128;
            if (i7 % 2 == 0) {
                this.onPostMessage = Long.valueOf(System.currentTimeMillis());
            } else {
                this.onPostMessage = Long.valueOf(System.currentTimeMillis());
                obj.hashCode();
                throw null;
            }
        }
    }

    public void onStop() {
        long jLongValue;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 39;
        warmup = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        this.ICustomTabsCallbackStubProxy = false;
        validateRelationship();
        if (this.onMinimized != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = this.onMinimized;
            Intrinsics.checkNotNull(l);
            this.onActivityResized = jCurrentTimeMillis - l.longValue();
        }
        if (this.onPostMessage != null) {
            int i4 = warmup + 5;
            ICustomTabsServiceDefault = i4 % 128;
            if (i4 % 2 != 0) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Long l2 = this.onPostMessage;
                Intrinsics.checkNotNull(l2);
                jLongValue = jCurrentTimeMillis2 ^ l2.longValue();
            } else {
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                Long l3 = this.onPostMessage;
                Intrinsics.checkNotNull(l3);
                jLongValue = jCurrentTimeMillis3 - l3.longValue();
            }
            this.readTypedObject = jLongValue;
        }
        if (this.ICustomTabsCallback != null) {
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            Long l4 = this.ICustomTabsCallback;
            Intrinsics.checkNotNull(l4);
            this.extraCallbackWithResult = jCurrentTimeMillis4 - l4.longValue();
        }
    }

    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        writeTypedList().ICustomTabsCallback.post(new Runnable() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                PlayableAdsPlayerActivity.IAuthTabCallbackStubProxy(this.f$0);
            }
        });
        int i2 = warmup + 107;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws JSONException {
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup + 77;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        playableAdsPlayerActivity.ITrustedWebActivityCallback_Parcel();
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsServiceDefault + 21;
        warmup = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        if (this.getInterfaceDescriptor) {
            int i2 = warmup + 79;
            ICustomTabsServiceDefault = i2 % 128;
            jOnExtraCallbackWithResult = i2 % 2 != 0 ? 1L : 0L;
        } else {
            jOnExtraCallbackWithResult = writeTypedList().onWarmupCompleted.onExtraCallbackWithResult();
            int i3 = ICustomTabsServiceDefault + 101;
            warmup = i3 % 128;
            int i4 = i3 % 2;
        }
        bundle.putBoolean("ads_can_close", this.getInterfaceDescriptor);
        bundle.putLong("ads_countdown_remaining_ms", jOnExtraCallbackWithResult);
        int i5 = warmup + 121;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            File file = new File(new File(getFilesDir(), "ads_sdk/playablead/html"), "playable_" + IEngagementSignalsCallbackDefault() + ".html");
            if (file.exists()) {
                int i2 = warmup + 75;
                ICustomTabsServiceDefault = i2 % 128;
                int i3 = i2 % 2;
                file.delete();
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
            int i4 = warmup + 51;
            ICustomTabsServiceDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        setResult(-1);
        super.finish();
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlayableAdsPlayerActivity.this.new IAuthTabCallbackStubProxy(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            final PlayableAdsPlayerActivity playableAdsPlayerActivity = PlayableAdsPlayerActivity.this;
            ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 2286196L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$showEndCard$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return PlayableAdsPlayerActivity.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(playableAdsPlayerActivity, (SetDetectableSize) obj2);
                }
            }, 14, (Object) null);
            PlayableAdsPlayerActivity.onExtraCallbackWithResult(PlayableAdsPlayerActivity.this, true);
            Object[] objArr = {PlayableAdsPlayerActivity.this};
            PlayableEndCardBottomSheet playableEndCardBottomSheet = ((getScaleY) PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1593890037, objArr, -1593890029)).IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(playableEndCardBottomSheet, "");
            playableEndCardBottomSheet.setVisibility(0);
            Object[] objArr2 = {PlayableAdsPlayerActivity.this};
            PlayableEndCardBottomSheet playableEndCardBottomSheet2 = ((getScaleY) PlayableAdsPlayerActivity.onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1593890037, objArr2, -1593890029)).IAuthTabCallbackDefault;
            final PlayableAdsPlayerActivity playableAdsPlayerActivity2 = PlayableAdsPlayerActivity.this;
            Function0 function0 = new Function0() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$showEndCard$1$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return PlayableAdsPlayerActivity.IAuthTabCallbackStubProxy.IAuthTabCallback(playableAdsPlayerActivity2);
                }
            };
            final PlayableAdsPlayerActivity playableAdsPlayerActivity3 = PlayableAdsPlayerActivity.this;
            Object[] objArr3 = {playableEndCardBottomSheet2, function0, new Function0() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$showEndCard$1$$ExternalSyntheticLambda2
                public final Object invoke() {
                    return PlayableAdsPlayerActivity.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(playableAdsPlayerActivity3);
                }
            }};
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            PlayableEndCardBottomSheet.onNavigationEvent(objArr3, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, 614432937, -614432935);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
            setDetectableSize.onExtraCallback("ad_id", PlayableAdsPlayerActivity.getInterfaceDescriptor(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("advertise_space_unit_id", PlayableAdsPlayerActivity.access000(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ssp_request_id", PlayableAdsPlayerActivity.onRelationshipValidationResult(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
            setDetectableSize.onExtraCallback("action_type", "end_card");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(final PlayableAdsPlayerActivity playableAdsPlayerActivity) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2286196L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$showEndCard$1$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return PlayableAdsPlayerActivity.IAuthTabCallbackStubProxy.onExtraCallback(playableAdsPlayerActivity, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
            setDetectableSize.onExtraCallback("ad_id", PlayableAdsPlayerActivity.getInterfaceDescriptor(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("advertise_space_unit_id", PlayableAdsPlayerActivity.access000(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ssp_request_id", PlayableAdsPlayerActivity.onRelationshipValidationResult(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
            setDetectableSize.onExtraCallback("action_type", "interaction");
            setDetectableSize.onExtraCallback("interaction_type", "click");
            setDetectableSize.onExtraCallback("button_name", "toss_end_card_close");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit onExtraCallbackWithResult(final PlayableAdsPlayerActivity playableAdsPlayerActivity) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2286196L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.ads.PlayableAdsPlayerActivity$showEndCard$1$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return PlayableAdsPlayerActivity.IAuthTabCallbackStubProxy.IAuthTabCallbackDefault(playableAdsPlayerActivity, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            try {
                PlayableAdInfoResponse playableAdInfoResponseICustomTabsCallback = PlayableAdsPlayerActivity.ICustomTabsCallback(playableAdsPlayerActivity);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(playableAdInfoResponseICustomTabsCallback != null ? playableAdInfoResponseICustomTabsCallback.onNavigationEvent() : null));
                intent.addFlags(268435456);
                playableAdsPlayerActivity.startActivity(intent);
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallbackDefault(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
            setDetectableSize.onExtraCallback("ad_id", PlayableAdsPlayerActivity.getInterfaceDescriptor(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("advertise_space_unit_id", PlayableAdsPlayerActivity.access000(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ssp_request_id", PlayableAdsPlayerActivity.onRelationshipValidationResult(playableAdsPlayerActivity));
            setDetectableSize.onExtraCallback("ad_content_type", "ad_in_ad");
            setDetectableSize.onExtraCallback("action_type", "redirection");
            setDetectableSize.onExtraCallback("trigger_type", "toss_end_card");
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        NativeAdsDto.Creative.EndCard endCardOnExtraCallback;
        PlayableAdsPlayerActivity playableAdsPlayerActivity = (PlayableAdsPlayerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = warmup;
        int i3 = i2 + 99;
        int i4 = i3 % 128;
        ICustomTabsServiceDefault = i4;
        int i5 = i3 % 2;
        if (!playableAdsPlayerActivity.extraCallback) {
            PlayableAdInfoResponse playableAdInfoResponse = playableAdsPlayerActivity.access000;
            if (playableAdInfoResponse != null) {
                int i6 = i2 + 111;
                ICustomTabsServiceDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    endCardOnExtraCallback = playableAdInfoResponse.onExtraCallback();
                    int i7 = 40 / 0;
                } else {
                    endCardOnExtraCallback = playableAdInfoResponse.onExtraCallback();
                }
            } else {
                int i8 = i4 + 81;
                warmup = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 % 4;
                }
                endCardOnExtraCallback = null;
            }
            if (endCardOnExtraCallback != null) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(playableAdsPlayerActivity), putChannelInfo.onExtraCallback(), (setRandomHost) null, playableAdsPlayerActivity.new IAuthTabCallbackStubProxy(null), 2, (Object) null);
            }
        }
        return null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private final void getSmallIconBitmap() throws Throwable {
        int i = 2 % 2;
        TdsSkeletonV1View tdsSkeletonV1View = writeTypedList().getInterfaceDescriptor;
        tdsSkeletonV1View.setSkeletonColor(TdsSkeletonV1View.onWarmupCompleted.Dark);
        tdsSkeletonV1View.setBackgroundColor(-16777216);
        tdsSkeletonV1View.setVisibility(0);
        TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor = TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback;
        getinterfacedescriptor.onExtraCallback(3);
        tdsSkeletonV1View.setSkeletonType(getinterfacedescriptor);
        Intrinsics.checkNotNull(tdsSkeletonV1View);
        if (!tdsSkeletonV1View.isLaidOut() || !(!tdsSkeletonV1View.isLayoutRequested())) {
            tdsSkeletonV1View.addOnLayoutChangeListener(new asInterface(tdsSkeletonV1View, getinterfacedescriptor, this));
            return;
        }
        float f = tdsSkeletonV1View.getResources().getDisplayMetrics().density;
        double dOnExtraCallback = 0.0d;
        for (TdsSkeletonV1View.onExtraCallbackWithResult onextracallbackwithresult : getinterfacedescriptor.onNavigationEvent()) {
            dOnExtraCallback += onextracallbackwithresult.onExtraCallback() + onextracallbackwithresult.onExtraCallbackWithResult();
            int i2 = ICustomTabsServiceDefault + 25;
            warmup = i2 % 128;
            int i3 = i2 % 2;
        }
        float fOnExtraCallback = (((float) dOnExtraCallback) + ((getinterfacedescriptor.onNavigationEvent(getinterfacedescriptor.onNavigationEvent().size()).onExtraCallback() + getinterfacedescriptor.onNavigationEvent(getinterfacedescriptor.onNavigationEvent().size()).onExtraCallbackWithResult()) * getinterfacedescriptor.IAuthTabCallback())) * f;
        float fCoerceAtLeast = RangesKt.coerceAtLeast((tdsSkeletonV1View.getHeight() / 2.0f) - (fOnExtraCallback / 2.0f), 0.0f);
        tdsSkeletonV1View.setPadding(tdsSkeletonV1View.getPaddingLeft(), (int) fCoerceAtLeast, tdsSkeletonV1View.getPaddingRight(), tdsSkeletonV1View.getPaddingBottom());
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1102686333, new Object[]{this, "Skeleton centered: screenHeight=" + tdsSkeletonV1View.getHeight() + ", contentHeight=" + fOnExtraCallback + ", topPadding=" + fCoerceAtLeast}, 1102686358);
        int i4 = ICustomTabsServiceDefault + 101;
        warmup = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = writeTypedList().asInterface;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r1.setVisibility(0);
        writeTypedList().asInterface.setOnClickListener(new viva.republica.toss.ads.PlayableAdsPlayerActivity$.ExternalSyntheticLambda0(r5));
        r1 = viva.republica.toss.ads.PlayableAdsPlayerActivity.ICustomTabsServiceDefault + 77;
        viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r1) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void getSmallIconId() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r5.prefetch
            java.lang.String r2 = ""
            if (r1 == 0) goto L49
            int r3 = viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup
            int r3 = r3 + 11
            int r4 = r3 % 128
            viva.republica.toss.ads.PlayableAdsPlayerActivity.ICustomTabsServiceDefault = r4
            int r3 = r3 % r0
            r4 = 0
            if (r3 == 0) goto L1f
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            r3 = 40
            int r3 = r3 / r4
            if (r1 != 0) goto L49
            goto L25
        L1f:
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 != 0) goto L49
        L25:
            o.getScaleY r1 = r5.writeTypedList()
            im.toss.tds.view.component.widget.TdsRoundLayout r1 = r1.asInterface
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r1.setVisibility(r4)
            o.getScaleY r1 = r5.writeTypedList()
            im.toss.tds.view.component.widget.TdsRoundLayout r1 = r1.asInterface
            viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda0 r2 = new viva.republica.toss.ads.PlayableAdsPlayerActivity$$ExternalSyntheticLambda0
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            int r1 = viva.republica.toss.ads.PlayableAdsPlayerActivity.ICustomTabsServiceDefault
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.ads.PlayableAdsPlayerActivity.warmup = r2
            int r1 = r1 % r0
            return
        L49:
            o.getScaleY r0 = r5.writeTypedList()
            im.toss.tds.view.component.widget.TdsRoundLayout r0 = r0.asInterface
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.PlayableAdsPlayerActivity.getSmallIconId():void");
    }

    public static /* synthetic */ boolean onExtraCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1582896451, new Object[]{playableAdsPlayerActivity}, -1582896435)).booleanValue();
    }

    public static /* synthetic */ void onNavigationEvent(View view, ValueAnimator valueAnimator) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1753327834, new Object[]{view, valueAnimator}, 1753327839);
    }

    public static /* synthetic */ Unit asBinder(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 178832007, new Object[]{playableAdsPlayerActivity}, -178832003);
    }

    public static /* synthetic */ void onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 658683485, new Object[]{playableAdsPlayerActivity, view}, -658683470);
    }

    public static final /* synthetic */ void IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1102686333, new Object[]{playableAdsPlayerActivity, str}, 1102686358);
    }

    public static final /* synthetic */ getScaleY extraCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (getScaleY) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1593890037, new Object[]{playableAdsPlayerActivity}, -1593890029);
    }

    public static final /* synthetic */ setInternalPageChangeListener ICustomTabsCallbackDefault(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (setInternalPageChangeListener) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -265459585, new Object[]{playableAdsPlayerActivity}, 265459592);
    }

    public static final /* synthetic */ void onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 870921869, new Object[]{playableAdsPlayerActivity, str}, -870921843);
    }

    public static final /* synthetic */ boolean isEngagementSignalsApiAvailable(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -100233618, new Object[]{playableAdsPlayerActivity}, 100233630)).booleanValue();
    }

    public static final /* synthetic */ boolean ICustomTabsService(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 170975258, new Object[]{playableAdsPlayerActivity}, -170975252)).booleanValue();
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1835889099, new Object[]{playableAdsPlayerActivity, str}, -1835889085);
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(PlayableAdsPlayerActivity playableAdsPlayerActivity, String str) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1453045616, new Object[]{playableAdsPlayerActivity, str}, 1453045643);
    }

    public static final /* synthetic */ void newSession(PlayableAdsPlayerActivity playableAdsPlayerActivity) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1003272613, new Object[]{playableAdsPlayerActivity}, 1003272624);
    }

    public static final /* synthetic */ void onWarmupCompleted(PlayableAdsPlayerActivity playableAdsPlayerActivity, PlayableAdInfoResponse playableAdInfoResponse) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 359386387, new Object[]{playableAdsPlayerActivity, playableAdInfoResponse}, -359386366);
    }

    private static final void onExtraCallback(View view, ValueAnimator valueAnimator) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 667592475, new Object[]{view, valueAnimator}, -667592472);
    }

    private final setInternalPageChangeListener onVerticalScrollEvent() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (setInternalPageChangeListener) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1050687090, new Object[]{this}, 1050687112);
    }

    private final boolean onGreatestScrollPercentageIncreased() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 466488007, new Object[]{this}, -466487990)).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(int i, PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Integer.valueOf(i), playableAdsPlayerActivity, setDetectableSize};
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1162906904, objArr, 1162906906);
    }

    private final void onExtraCallback(String str, String str2) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1511035606, new Object[]{this, str, str2}, -1511035597);
    }

    private final void IEngagementSignalsCallbackStubProxy() throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -168871558, new Object[]{this}, 168871576);
    }

    private static final void receiveFile(PlayableAdsPlayerActivity playableAdsPlayerActivity) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -609153688, new Object[]{playableAdsPlayerActivity}, 609153708);
    }

    private final String onNavigationEvent(String str, String str2) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (String) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1279456801, new Object[]{this, str, str2}, 1279456824);
    }

    private final void onExtraCallback(String str) throws Throwable {
        int iOnExtraCallback = r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4.onExtraCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4.onExtraCallback(), iOnExtraCallback, -1673005904, new Object[]{this, str}, 1673005914);
    }

    private static final void onWarmupCompleted(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 651229120, new Object[]{playableAdsPlayerActivity, view}, -651229119);
    }

    private static final Unit onTransact(PlayableAdsPlayerActivity playableAdsPlayerActivity, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1117721511, new Object[]{playableAdsPlayerActivity, setDetectableSize}, -1117721487);
    }

    private static final void onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        Object[] objArr = {playableAdsPlayerActivity, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 319828349, objArr, -319828349);
    }

    private static final boolean IAuthTabCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, View view, MotionEvent motionEvent) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 25524233, new Object[]{playableAdsPlayerActivity, view, motionEvent}, -25524214)).booleanValue();
    }

    private final void RemoteActionCompatParcelizer() throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1214043452, new Object[]{this}, 1214043465);
    }

    private static final boolean ICustomTabsServiceStub(PlayableAdsPlayerActivity playableAdsPlayerActivity) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return ((Boolean) onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), iIAuthTabCallback, 554820697, new Object[]{playableAdsPlayerActivity}, -554820669)).booleanValue();
    }

    @Override // viva.republica.toss.ads.Hilt_PlayableAdsPlayerActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = warmup + 75;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void updateVisuals() {
        requestPostMessageChannelWithExtras = 7798559133331975163L;
        prefetchWithMultipleUrls = -1316600059;
        requestPostMessageChannel = (char) 27643;
    }
}
