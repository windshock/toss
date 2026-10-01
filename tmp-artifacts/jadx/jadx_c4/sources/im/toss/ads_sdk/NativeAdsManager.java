package im.toss.ads_sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.admob.AdmobAdFormat;
import im.toss.ads_sdk.model.AdInfo;
import im.toss.ads_sdk.model.MediationPriority;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsError;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity;
import im.toss.ads_sdk.remote.model.AdMobFailedReason;
import im.toss.ads_sdk.remote.model.AdMobPaidAdValue;
import im.toss.ads_sdk.remote.model.AdmobError;
import im.toss.ads_sdk.remote.model.ExposureContent;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.ads_sdk.remote.model.MediationExposureEventLogRequest;
import im.toss.ads_sdk.remote.model.MediationResultLogRequest;
import im.toss.ads_sdk.remote.model.SdkErrorTrackingLogRequest;
import im.toss.ads_sdk.remote.model.SspSdkAdResponse;
import im.toss.ads_sdk.ui.activity.NativeAdsFullBannerActivity;
import im.toss.ads_sdk.ui.activity.NativeAdsFullPageActivity;
import im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsFullBannerV2Activity;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsFullPageV2Activity;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity;
import im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.state.spec.SessionState;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AUTextView;
import o.Animatable2CompatAnimationCallback;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FragmentStateAdapter4;
import o.GeckoHubImp;
import o.GeckoHubImp1;
import o.ResourceCallback;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TimelineExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.UtilsKtExternalSyntheticLambda17;
import o.ViewPager;
import o.ViewPager2LinearLayoutManagerImpl;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15300;
import o.access15400;
import o.access8100;
import o.adInfo;
import o.addNewItem;
import o.addOnAdapterChangeListener;
import o.addOnPageChangeListener;
import o.alignTextProgressInsideProgress;
import o.b10;
import o.beginFakeDrag;
import o.calculatePageOffsets;
import o.clearFaultAdjacentMetadata;
import o.deleteCert;
import o.deleteProfile;
import o.dispatchOnPageScrolled;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getFillAlpha;
import o.getPackageType;
import o.getPlatformCallback;
import o.getStrokeWidth;
import o.getWrite;
import o.initRenderFinish;
import o.isNeedUnzip;
import o.maybeUpdateAnimatable;
import o.nSetPosition;
import o.onTextViewSizeChanged;
import o.pageRight;
import o.putChannelInfo;
import o.removeNonDecorViews;
import o.requestParentDisallowInterceptTouchEvent;
import o.scrollToItem;
import o.setApTextSize;
import o.setCommandLine;
import o.setInternalPageChangeListener;
import o.setLogBuffers;
import o.setPatch;
import o.setRandomHost;
import o.setRevision;
import o.setStrokeColor;
import o.setTranslateY;
import o.setTrimPathEnd;
import o.setTrimPathOffset;
import o.unregisterDataSetObserver;
import o.videoFrameChanged;
import o.wie2;
import o.zzaj;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsManager implements DefaultLifecycleObserver {
    public static final onExtraCallbackWithResult Companion;
    private static long IEngagementSignalsCallback_Parcel;
    private static long IPostMessageService;
    private static char[] IPostMessageServiceDefault;
    private static int ITrustedWebActivityCallback;
    public static final int onExtraCallbackWithResult;
    private final Map<String, List<setStrokeColor>> IAuthTabCallback;
    private final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackDefault;
    private final Map<String, NativeAd> IAuthTabCallbackStub;
    private final FragmentStateAdapter4 IAuthTabCallbackStubProxy;
    private final Context IAuthTabCallback_Parcel;
    private final findResAndMsg ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private final Map<String, setTrimPathEnd> ICustomTabsCallbackStub;
    private final pageRight ICustomTabsCallbackStubProxy;
    private WeakReference<TextFieldScrollKtExternalSyntheticLambda0> ICustomTabsCallback_Parcel;
    private final Map<String, setTrimPathOffset> ICustomTabsService;
    private final Set<String> ICustomTabsServiceDefault;
    private final setTranslateY ICustomTabsServiceStub;
    private final Set<String> ICustomTabsServiceStubProxy;
    private final SessionState ICustomTabsService_Parcel;
    private List<String> IEngagementSignalsCallback;
    private IAuthTabCallbackStubProxy IEngagementSignalsCallbackDefault;
    private final LinkedHashSet<IAuthTabCallbackDefault> IEngagementSignalsCallbackStub;
    private boolean IEngagementSignalsCallbackStubProxy;
    private final wie2 IPostMessageServiceStub;
    private final CoroutineExceptionHandler access000;
    private Map<String, NativeAdsDto> access100;
    private final Map<String, access100> access200;
    private final Map<String, NativeAdsThumbnailAdMobView> asBinder;
    private final Map<String, NativeAdsDto> asInterface;
    private access100 extraCallback;
    private final LinkedHashMap<String, onExtraCallback> extraCallbackWithResult;
    private final Map<String, Long> extraCommand;
    private getPackageType getInterfaceDescriptor;
    private final calculatePageOffsets isEngagementSignalsApiAvailable;
    private final Map<String, setStrokeColor> mayLaunchUrl;
    private final Map<String, setStrokeColor> newAuthTabSession;
    private final Lazy newSession;
    private asBinder newSessionWithExtras;
    private Map<String, onNavigationEvent> onActivityLayout;
    private String onActivityResized;
    private Map<String, setTrimPathEnd> onExtraCallback;
    private int onGreatestScrollPercentageIncreased;
    private String onMessageChannelReady;
    private final Set<String> onMinimized;
    private Map<String, GetNativeAdsRequestBody.AdRequestOption> onNavigationEvent;
    private boolean onPostMessage;
    private long onRelationshipValidationResult;
    private ViewGroup onSessionEnded;
    private final Map<String, IAuthTabCallback> onTransact;
    private final Map<String, getPackageType> onUnminimized;
    private final LinkedHashSet<IAuthTabCallbackStub> onVerticalScrollEvent;
    private final Map<String, scrollToItem> onWarmupCompleted;
    private calculatePageOffsets.onExtraCallbackWithResult postMessage;
    private long prefetch;
    private String prefetchWithMultipleUrls;
    private getPackageType readTypedObject;
    private final Lazy receiveFile;
    private Map<String, deleteProfile> requestPostMessageChannel;
    private WeakReference<TextFieldScrollKtExternalSyntheticLambda0> requestPostMessageChannelWithExtras;
    private final Map<String, setTrimPathOffset> setEngagementSignalsCallback;
    private final Map<String, Long> updateVisuals;
    private final Map<String, getPackageType> validateRelationship;
    private Map<String, String> warmup;
    private String writeTypedList;
    private String writeTypedObject;
    private static final byte[] $$a = {57, 22, -21, -92};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ITrustedWebActivityCallbackDefault = 1;
    private static int IPostMessageService_Parcel = 0;
    private static int IPostMessageServiceStubProxy = 1;

    public static final /* synthetic */ class IAuthTabCallback_Parcel {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.LOADING.ordinal()] = 1;
                int i = onNavigationEvent + 15;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.LOADED.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i5 = onExtraCallback + 65;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    static final class ICustomTabsCallbackDefault extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        ICustomTabsCallbackDefault(access13800<? super ICustomTabsCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = NativeAdsManager.onWarmupCompleted(NativeAdsManager.this, null, null, 0, null, this);
            int i4 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    static final class ICustomTabsCallbackStubProxy extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        ICustomTabsCallbackStubProxy(access13800<? super ICustomTabsCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = NativeAdsManager.this.onExtraCallback((String) null, (GetNativeAdsRequestBody.AdRequestOption) null, false, (access13800<? super NativeAdsDto>) this);
            int i4 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    public interface asBinder {
        default void IAuthTabCallback(@NotNull AdInfo adInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(adInfo, "");
        }

        default void onExtraCallback(@NotNull AdInfo adInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(adInfo, "");
        }

        default void onExtraCallback(@NotNull NativeAdsError nativeAdsError) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsError, "");
        }

        default void onExtraCallback(@NotNull Map<String, NativeAdsDto> map) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
        }

        default void onExtraCallbackWithResult(@NotNull AdInfo adInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(adInfo, "");
        }

        default void onWarmupCompleted(@NotNull AdInfo adInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(adInfo, "");
        }

        default void onWarmupCompleted(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    static final class mayLaunchUrl extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        mayLaunchUrl(access13800<? super mayLaunchUrl> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = NativeAdsManager.this.onWarmupCompleted((String) null, (List<String>) null, (String) null, (access13800<? super Map<String, NativeAdsDto>>) this);
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
            int i5 = onExtraCallback + 107;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnWarmupCompleted;
        }
    }

    static final class onMessageChannelReady extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onMessageChannelReady(access13800<? super onMessageChannelReady> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = NativeAdsManager.this.onWarmupCompleted((JsonObject) null, (Map<String, String>) null, (access13800<? super JsonObject>) this);
            int i4 = onNavigationEvent + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    public interface onWarmupCompleted {
        NativeAdsManager onTransact();
    }

    static final class prefetchWithMultipleUrls extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        prefetchWithMultipleUrls(access13800<? super prefetchWithMultipleUrls> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = NativeAdsManager.IAuthTabCallback(NativeAdsManager.this, (NativeAdsDto) null, 0, (String) null, (access13800) this);
            int i4 = IAuthTabCallback + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static final class receiveFile extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        receiveFile(access13800<? super receiveFile> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = NativeAdsManager.onExtraCallbackWithResult(NativeAdsManager.this, (NativeAdsDto) null, 0, (String) null, (access13800) this);
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class validateRelationship extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
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

        validateRelationship(access13800<? super validateRelationship> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            if (i3 != 0) {
                NativeAdsManager.onNavigationEvent(NativeAdsManager.this, (String) null, (List) null, (access100) null, (String) null, (String) null, (String) null, (access13800) this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = NativeAdsManager.onNavigationEvent(NativeAdsManager.this, (String) null, (List) null, (access100) null, (String) null, (String) null, (String) null, (access13800) this);
            int i4 = IAuthTabCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class warmup extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        warmup(access13800<? super warmup> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            if (i3 == 0) {
                objIAuthTabCallback = NativeAdsManager.IAuthTabCallback(NativeAdsManager.this, (String) null, (access100) null, (GetNativeAdsRequestBody.AdRequestOption) null, (String) null, (String) null, (access13800) this);
                int i4 = 53 / 0;
            } else {
                objIAuthTabCallback = NativeAdsManager.IAuthTabCallback(NativeAdsManager.this, (String) null, (access100) null, (GetNativeAdsRequestBody.AdRequestOption) null, (String) null, (String) null, (access13800) this);
            }
            int i5 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = 3 - (s * 3);
        byte[] bArr = $$a;
        int i6 = (i2 * 3) + 97;
        int i7 = i * 3;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            i4 = i5;
            int i8 = i7;
            int i9 = 0;
            i5 += i8;
            i3 = i9;
            i4++;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i4];
            i5 += i8;
            i3 = i9;
            i4++;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            i5 = i6;
            i4++;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    static {
        ITrustedWebActivityCallback = 0;
        asInterface();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallbackWithResult = 8;
        int i = ITrustedWebActivityCallbackDefault + 41;
        ITrustedWebActivityCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0184, code lost:
    
        if (r2 != r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01f2, code lost:
    
        if (r0 == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        warmup warmupVar;
        Object objOnWarmupCompleted;
        String str;
        int i7 = ~((~i6) | i2 | i5);
        int i8 = i6 | i2 | i5;
        int i9 = (~((~i2) | (~i5))) | i7;
        int i10 = i2 + i5 + i + (1512347918 * i3) + (2033855975 * i4);
        int i11 = i10 * i10;
        int i12 = ((i2 * 1848112433) - 751391395) + (i5 * 1848112433) + (i7 * (-92)) + (i8 * 46) + (i9 * 46) + (1848112479 * i) + ((-818859470) * i3) + ((-357164103) * i4) + (i11 * 1740046336);
        switch (((i2 * 1295388527) - 26148864) + (1295388527 * i5) + (2139102940 * i7) + (i8 * 1077932178) + (1077932178 * i9) + ((-1921646592) * i) + (1114898432 * i3) + (1668939776 * i4) + (346619904 * i11) + (i12 * i12 * 1721171968)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
                int i13 = 2 % 2;
                int i14 = IPostMessageService_Parcel + 109;
                IPostMessageServiceStubProxy = i14 % 128;
                int i15 = i14 % 2;
                IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 823603499, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -823603490, new Object[]{nativeAdsManager}, nSetPosition.onExtraCallbackWithResult());
                int i16 = IPostMessageService_Parcel + 73;
                IPostMessageServiceStubProxy = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                NativeAdsManager nativeAdsManager2 = (NativeAdsManager) objArr[0];
                findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
                int i18 = 2 % 2;
                int i19 = IPostMessageService_Parcel + 125;
                IPostMessageServiceStubProxy = i19 % 128;
                if (i19 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(findresandmsg, "");
                    calculatePageOffsets.onNavigationEvent(nativeAdsManager2.isEngagementSignalsApiAvailable, findresandmsg, true, 4, (Object) null);
                } else {
                    Intrinsics.checkNotNullParameter(findresandmsg, "");
                    calculatePageOffsets.onNavigationEvent(nativeAdsManager2.isEngagementSignalsApiAvailable, findresandmsg, false, 2, (Object) null);
                }
                int i20 = IPostMessageServiceStubProxy + 11;
                IPostMessageService_Parcel = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 8:
                NativeAdsManager nativeAdsManager3 = (NativeAdsManager) objArr[0];
                String str2 = (String) objArr[1];
                unregisterDataSetObserver unregisterdatasetobserver = (unregisterDataSetObserver) objArr[2];
                int i22 = 2 % 2;
                int i23 = IPostMessageService_Parcel + 25;
                IPostMessageServiceStubProxy = i23 % 128;
                int i24 = i23 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsManager3, str2, unregisterdatasetobserver);
                int i25 = IPostMessageServiceStubProxy + 55;
                IPostMessageService_Parcel = i25 % 128;
                int i26 = i25 % 2;
                return unitOnNavigationEvent;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return asBinder(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return asInterface(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                NativeAdsManager nativeAdsManager4 = (NativeAdsManager) objArr[0];
                String str3 = (String) objArr[1];
                String str4 = (String) objArr[2];
                int i27 = 2 % 2;
                int i28 = IPostMessageServiceStubProxy + 39;
                IPostMessageService_Parcel = i28 % 128;
                int i29 = i28 % 2;
                nativeAdsManager4.IAuthTabCallback(str3, str4);
                int i30 = IPostMessageServiceStubProxy + 31;
                IPostMessageService_Parcel = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return access100(objArr);
            case 16:
                return getInterfaceDescriptor(objArr);
            case 17:
                return access000(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return IAuthTabCallbackStubProxy(objArr);
            case 19:
                return ICustomTabsCallback(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                return readTypedObject(objArr);
            case 22:
                return extraCallback(objArr);
            case 23:
                return writeTypedObject(objArr);
            case 24:
                return onActivityResized(objArr);
            case 25:
                return onMinimized(objArr);
            case 26:
                return onActivityLayout(objArr);
            case 27:
                return onPostMessage(objArr);
            case 28:
                return onMessageChannelReady(objArr);
            case 29:
                return onRelationshipValidationResult(objArr);
            case 30:
                return ICustomTabsCallbackStub(objArr);
            case 31:
                return onUnminimized(objArr);
            case 32:
                return ICustomTabsCallbackStubProxy(objArr);
            case 33:
                return ICustomTabsCallbackDefault(objArr);
            case 34:
                return isEngagementSignalsApiAvailable(objArr);
            case 35:
                final NativeAdsManager nativeAdsManager5 = (NativeAdsManager) objArr[0];
                findResAndMsg findresandmsg2 = (findResAndMsg) objArr[1];
                final String str5 = (String) objArr[2];
                final NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[3];
                Function0<Boolean> function0 = (Function0) objArr[4];
                Function0<Boolean> function02 = (Function0) objArr[5];
                int i32 = 2 % 2;
                Intrinsics.checkNotNullParameter(findresandmsg2, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(adAsset, "");
                Intrinsics.checkNotNullParameter(function0, "");
                Intrinsics.checkNotNullParameter(function02, "");
                nativeAdsManager5.isEngagementSignalsApiAvailable.onExtraCallback(findresandmsg2, str5, adAsset, function0, function02, new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i33 = 2 % 2;
                        int i34 = IAuthTabCallback + 95;
                        onWarmupCompleted = i34 % 128;
                        if (i34 % 2 != 0) {
                            NativeAdsManager.onWarmupCompleted(this.f$0, adAsset, str5, (NativeAdsEventLogType) obj);
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = NativeAdsManager.onWarmupCompleted(this.f$0, adAsset, str5, (NativeAdsEventLogType) obj);
                        int i35 = onWarmupCompleted + 55;
                        IAuthTabCallback = i35 % 128;
                        int i36 = i35 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                int i33 = IPostMessageService_Parcel + 15;
                IPostMessageServiceStubProxy = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case 36:
                return extraCommand(objArr);
            case 37:
                return ICustomTabsCallback_Parcel(objArr);
            case 38:
                return mayLaunchUrl(objArr);
            case 39:
                return ICustomTabsService(objArr);
            case 40:
                NativeAdsManager nativeAdsManager6 = (NativeAdsManager) objArr[0];
                int i35 = 2 % 2;
                int i36 = IPostMessageServiceStubProxy + 29;
                int i37 = i36 % 128;
                IPostMessageService_Parcel = i37;
                int i38 = i36 % 2;
                Map<String, scrollToItem> map = nativeAdsManager6.onWarmupCompleted;
                int i39 = i37 + 31;
                IPostMessageServiceStubProxy = i39 % 128;
                int i40 = i39 % 2;
                return map;
            case 41:
                return prefetch(objArr);
            case 42:
                return postMessage(objArr);
            case 43:
                NativeAdsManager nativeAdsManager7 = (NativeAdsManager) objArr[0];
                String str6 = (String) objArr[1];
                access100 access100Var = (access100) objArr[2];
                GetNativeAdsRequestBody.AdRequestOption adRequestOption = (GetNativeAdsRequestBody.AdRequestOption) objArr[3];
                String str7 = (String) objArr[4];
                String str8 = (String) objArr[5];
                warmup warmupVar2 = (access13800) objArr[6];
                int i41 = 2 % 2;
                if (warmupVar2 instanceof warmup) {
                    warmupVar = warmupVar2;
                    int i42 = warmupVar.label;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        warmupVar.label = i42 - 2147483648;
                    } else {
                        warmupVar = nativeAdsManager7.new warmup(warmupVar2);
                    }
                }
                Object objOnExtraCallback = warmupVar.result;
                Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
                int i43 = warmupVar.label;
                if (i43 == 0) {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    addNewItem addnewitemIAuthTabCallback = access100Var.IAuthTabCallback();
                    if (addnewitemIAuthTabCallback != addNewItem.NATIVE) {
                        setTranslateY settranslatey = nativeAdsManager7.ICustomTabsServiceStub;
                        String str9 = nativeAdsManager7.writeTypedList;
                        GetNativeAdsRequestBody.AppInfo appInfoOnMessageChannelReady = nativeAdsManager7.onMessageChannelReady(str8);
                        String strOnNavigationEvent = nativeAdsManager7.IAuthTabCallbackStubProxy.onNavigationEvent();
                        Set<String> setOnExtraCallback = access100Var.onExtraCallback();
                        String str10 = nativeAdsManager7.writeTypedObject;
                        Map<String, String> map2 = nativeAdsManager7.warmup;
                        String strOnNavigationEvent2 = access100Var.onNavigationEvent();
                        GetNativeAdsRequestBody.AdRequestOption adRequestOption2 = adRequestOption == null ? new GetNativeAdsRequestBody.AdRequestOption(0L, (GetNativeAdsRequestBody.VideoOption) null, (Long) null, (List) null, 15, (DefaultConstructorMarker) null) : adRequestOption;
                        warmupVar.L$0 = access15400.onNavigationEvent(str6);
                        warmupVar.L$1 = access15400.onNavigationEvent(access100Var);
                        warmupVar.L$2 = access15400.onNavigationEvent(adRequestOption);
                        warmupVar.L$3 = access15400.onNavigationEvent(str7);
                        warmupVar.L$4 = access15400.onNavigationEvent(str8);
                        warmupVar.L$5 = access15400.onNavigationEvent(addnewitemIAuthTabCallback);
                        warmupVar.label = 2;
                        objOnWarmupCompleted = settranslatey.onWarmupCompleted(str9, str6, appInfoOnMessageChannelReady, strOnNavigationEvent, str7, str10, map2, setOnExtraCallback, strOnNavigationEvent2, adRequestOption2, warmupVar);
                        break;
                    } else {
                        String strOnExtraCallbackWithResult = access100Var.onExtraCallbackWithResult();
                        if (strOnExtraCallbackWithResult == null) {
                            int i44 = IPostMessageServiceStubProxy;
                            int i45 = i44 + 53;
                            IPostMessageService_Parcel = i45 % 128;
                            int i46 = i45 % 2;
                            int i47 = i44 + 69;
                            IPostMessageService_Parcel = i47 % 128;
                            int i48 = i47 % 2;
                            str = str6;
                        } else {
                            str = strOnExtraCallbackWithResult;
                        }
                        List<String> listListOf = CollectionsKt.listOf(str6);
                        warmupVar.L$0 = str6;
                        warmupVar.L$1 = access15400.onNavigationEvent(access100Var);
                        warmupVar.L$2 = access15400.onNavigationEvent(adRequestOption);
                        warmupVar.L$3 = access15400.onNavigationEvent(str7);
                        warmupVar.L$4 = access15400.onNavigationEvent(str8);
                        warmupVar.L$5 = access15400.onNavigationEvent(addnewitemIAuthTabCallback);
                        warmupVar.L$6 = access15400.onNavigationEvent(str);
                        warmupVar.label = 1;
                        objOnExtraCallback = nativeAdsManager7.onExtraCallback(str, listListOf, access100Var, null, str7, str8, warmupVar);
                        break;
                    }
                    return objOnWarmupCompleted2;
                }
                if (i43 != 1) {
                    int i49 = IPostMessageServiceStubProxy + 93;
                    IPostMessageService_Parcel = i49 % 128;
                    int i50 = i49 % 2;
                    if (i43 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    return objOnExtraCallback;
                }
                str6 = (String) warmupVar.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
                objOnWarmupCompleted = access8100.onWarmupCompleted((Map) objOnExtraCallback, str6);
                return objOnWarmupCompleted;
            case 44:
                return newSession(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 53;
        IPostMessageServiceStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onTransact(nativeAdsManager, str, th);
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(nativeAdsManager, str, th);
        int i3 = IPostMessageService_Parcel + 61;
        IPostMessageServiceStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsManager nativeAdsManager, String str, String str2, unregisterDataSetObserver unregisterdatasetobserver) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 33;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsManager, str, str2, unregisterdatasetobserver);
        int i4 = IPostMessageServiceStubProxy + 89;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsManager nativeAdsManager, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 49;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(nativeAdsManager, str, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsManager, str, th);
        int i3 = IPostMessageServiceStubProxy + 67;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsManager nativeAdsManager, String str, unregisterDataSetObserver unregisterdatasetobserver) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 67;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsManager, str, unregisterdatasetobserver);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ setInternalPageChangeListener onExtraCallbackWithResult(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 93;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            return (setInternalPageChangeListener) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1218754100, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1218754123, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int i3 = 50 / 0;
        return (setInternalPageChangeListener) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1218754100, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1218754123, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 27;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(str, iAuthTabCallbackDefault);
        int i4 = IPostMessageService_Parcel + 33;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsManager nativeAdsManager, NativeAdsDto.AdAsset adAsset, String str, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 91;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsManager, adAsset, str, nativeAdsEventLogType);
        int i4 = IPostMessageService_Parcel + 47;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsManager nativeAdsManager, NativeAdsDto.AdAsset adAsset, String str, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 111;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 651746210, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -651746184, new Object[]{nativeAdsManager, adAsset, str, nativeAdsEventLogType}, iOnExtraCallbackWithResult2);
        int i3 = IPostMessageService_Parcel + 105;
        IPostMessageServiceStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 53;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsManager, str, th);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 99;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(adinfo);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = IPostMessageServiceStubProxy + 43;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ requestParentDisallowInterceptTouchEvent onWarmupCompleted(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 41;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttoucheventOnMessageChannelReady = onMessageChannelReady(nativeAdsManager);
        int i4 = IPostMessageServiceStubProxy + 5;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return requestparentdisallowintercepttoucheventOnMessageChannelReady;
        }
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 65;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(str, iAuthTabCallbackStub);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, iAuthTabCallbackStub);
        int i3 = IPostMessageServiceStubProxy + 19;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static final class ICustomTabsService_Parcel extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public ICustomTabsService_Parcel(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IPostMessageService ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 53;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IPostMessageService)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 45813), 85 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.blue(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getLongPressTimeout() >> 16) + 19, 8808 - TextUtils.indexOf("", "", 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 97;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    @Inject
    public NativeAdsManager(@NotNull Context context, @NotNull setTranslateY settranslatey, @NotNull FragmentStateAdapter4 fragmentStateAdapter4, @NotNull calculatePageOffsets calculatepageoffsets, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull SessionState sessionState, @NotNull pageRight pageright) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(settranslatey, "");
        Intrinsics.checkNotNullParameter(fragmentStateAdapter4, "");
        Intrinsics.checkNotNullParameter(calculatepageoffsets, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        Intrinsics.checkNotNullParameter(pageright, "");
        this.IAuthTabCallback_Parcel = context;
        this.ICustomTabsServiceStub = settranslatey;
        this.IAuthTabCallbackStubProxy = fragmentStateAdapter4;
        this.isEngagementSignalsApiAvailable = calculatepageoffsets;
        this.IAuthTabCallbackDefault = textRoundCornerProgressBarSavedState1;
        this.ICustomTabsService_Parcel = sessionState;
        this.ICustomTabsCallbackStubProxy = pageright;
        this.IEngagementSignalsCallbackDefault = IAuthTabCallbackStubProxy.ALL;
        this.warmup = access8100.onNavigationEvent();
        this.ICustomTabsCallback = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
        this.newSession = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttoucheventOnWarmupCompleted = NativeAdsManager.onWarmupCompleted(this.f$0);
                int i4 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return requestparentdisallowintercepttoucheventOnWarmupCompleted;
                }
                throw null;
            }
        });
        this.onGreatestScrollPercentageIncreased = -1;
        this.asInterface = new LinkedHashMap();
        this.onWarmupCompleted = new LinkedHashMap();
        this.asBinder = new LinkedHashMap();
        this.IAuthTabCallbackStub = new LinkedHashMap();
        this.setEngagementSignalsCallback = new LinkedHashMap();
        this.newAuthTabSession = new LinkedHashMap();
        this.IPostMessageServiceStub = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = NativeAdsManager.onWarmupCompleted((adInfo) obj);
                if (i3 != 0) {
                    int i4 = 13 / 0;
                }
                int i5 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1, (Object) null);
        this.onMessageChannelReady = "";
        this.onActivityLayout = new LinkedHashMap();
        this.IEngagementSignalsCallback = CollectionsKt.emptyList();
        this.access100 = new LinkedHashMap();
        this.onNavigationEvent = new LinkedHashMap();
        this.onExtraCallback = new LinkedHashMap();
        this.ICustomTabsCallbackStub = new LinkedHashMap();
        this.onTransact = new LinkedHashMap();
        this.IAuthTabCallback = new LinkedHashMap();
        this.ICustomTabsServiceStubProxy = new LinkedHashSet();
        this.onMinimized = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"3", "5", "4", "11"});
        this.onUnminimized = new LinkedHashMap();
        this.mayLaunchUrl = new LinkedHashMap();
        this.ICustomTabsService = new LinkedHashMap();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.writeTypedList = string;
        this.access200 = new LinkedHashMap();
        Object[] objArr = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, 1 - Drawable.resolveOpacity(0, 0), (char) (49684 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr);
        this.extraCallback = new access100(((String) objArr[0]).intern(), clearFaultAdjacentMetadata.onExtraCallback(), null, null, null, null, 56, null);
        this.updateVisuals = new LinkedHashMap();
        this.validateRelationship = new LinkedHashMap();
        this.ICustomTabsServiceDefault = new LinkedHashSet();
        this.requestPostMessageChannel = new LinkedHashMap();
        this.extraCallbackWithResult = new LinkedHashMap<>();
        this.onVerticalScrollEvent = new LinkedHashSet<>();
        this.IEngagementSignalsCallbackStub = new LinkedHashSet<>();
        this.extraCommand = new LinkedHashMap();
        this.receiveFile = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                setInternalPageChangeListener setinternalpagechangelistenerOnExtraCallbackWithResult = NativeAdsManager.onExtraCallbackWithResult(this.f$0);
                int i4 = onWarmupCompleted + 1;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return setinternalpagechangelistenerOnExtraCallbackWithResult;
            }
        });
        this.access000 = new ICustomTabsService_Parcel(CoroutineExceptionHandler.extraCallbackWithResult);
    }

    public static final /* synthetic */ NativeAdsDto IAuthTabCallback(NativeAdsManager nativeAdsManager, NativeAdsDto nativeAdsDto) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 71;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDtoOnExtraCallbackWithResult = nativeAdsManager.onExtraCallbackWithResult(nativeAdsDto);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        int i5 = IPostMessageService_Parcel + 95;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return nativeAdsDtoOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Object IAuthTabCallback(NativeAdsManager nativeAdsManager, NativeAdsDto nativeAdsDto, int i, String str, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 39;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {nativeAdsManager, nativeAdsDto, Integer.valueOf(i), str, access13800Var};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        if (i4 != 0) {
            return IAuthTabCallback(iOnExtraCallbackWithResult2, -709888601, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, 709888638, objArr, iOnExtraCallbackWithResult);
        }
        int i5 = 35 / 0;
        return IAuthTabCallback(iOnExtraCallbackWithResult2, -709888601, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, 709888638, objArr, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ Object IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, access100 access100Var, GetNativeAdsRequestBody.AdRequestOption adRequestOption, String str2, String str3, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 13;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1982624510, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1982624467, new Object[]{nativeAdsManager, str, access100Var, adRequestOption, str2, str3, access13800Var}, nSetPosition.onExtraCallbackWithResult());
        int i4 = IPostMessageService_Parcel + 97;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Map IAuthTabCallback(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 31;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Map<String, GetNativeAdsRequestBody.AdRequestOption> map = nativeAdsManager.onNavigationEvent;
        int i5 = i2 + 5;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Pair IAuthTabCallback(NativeAdsManager nativeAdsManager, String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 97;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsManager.access000(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Pair<setTrimPathEnd, scrollToItem> pairAccess000 = nativeAdsManager.access000(str);
        int i3 = IPostMessageService_Parcel + 123;
        IPostMessageServiceStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
        return pairAccess000;
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, setTrimPathOffset settrimpathoffset) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 31;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1197578342, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1197578330, new Object[]{nativeAdsManager, str, settrimpathoffset}, iOnExtraCallbackWithResult);
        int i4 = IPostMessageServiceStubProxy + 27;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsManager nativeAdsManager, List list, int i, NativeAdsDto nativeAdsDto, NativeAdsDto.Mediation mediation, AppCompatActivity appCompatActivity, boolean z, Integer num, deleteProfile deleteprofile, setStrokeColor setstrokecolor, String str, long j, int i2, String str2, String str3, String str4, AdError adError) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IPostMessageServiceStubProxy + 101;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 517095822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -517095780, new Object[]{nativeAdsManager, list, Integer.valueOf(i), nativeAdsDto, mediation, appCompatActivity, Boolean.valueOf(z), num, deleteprofile, setstrokecolor, str, Long.valueOf(j), Integer.valueOf(i2), str2, str3, str4, adError}, nSetPosition.onExtraCallbackWithResult());
        int i6 = IPostMessageServiceStubProxy + 9;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 43;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsManager.onWarmupCompleted(nativeAdsDto);
            throw null;
        }
        NativeAdsDto nativeAdsDtoOnWarmupCompleted = nativeAdsManager.onWarmupCompleted(nativeAdsDto);
        int i3 = IPostMessageService_Parcel + 69;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return nativeAdsDtoOnWarmupCompleted;
    }

    public static final /* synthetic */ Map IAuthTabCallbackDefault(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 17;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Map<String, NativeAdsDto> map = nativeAdsManager.asInterface;
        int i5 = i2 + 99;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ deleteProfile IAuthTabCallbackDefault(NativeAdsManager nativeAdsManager, String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 79;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        deleteProfile deleteprofileOnPostMessage = nativeAdsManager.onPostMessage(str);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return deleteprofileOnPostMessage;
    }

    public static final /* synthetic */ FragmentStateAdapter4 IAuthTabCallbackStub(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 73;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        FragmentStateAdapter4 fragmentStateAdapter4 = nativeAdsManager.IAuthTabCallbackStubProxy;
        if (i4 != 0) {
            int i5 = 22 / 0;
        }
        int i6 = i3 + 109;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return fragmentStateAdapter4;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(NativeAdsManager nativeAdsManager, String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 117;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsManager.ICustomTabsCallbackDefault(str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IPostMessageService_Parcel + 7;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    public static final /* synthetic */ getPackageType IAuthTabCallbackStubProxy(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 91;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        getPackageType getpackagetype = nativeAdsManager.getInterfaceDescriptor;
        int i5 = i3 + 115;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return getpackagetype;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 41;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(nativeAdsManager.onMinimized(str));
        }
        nativeAdsManager.onMinimized(str);
        throw null;
    }

    public static final /* synthetic */ WeakReference ICustomTabsCallback(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 83;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = nativeAdsManager.ICustomTabsCallback_Parcel;
        int i5 = i3 + 31;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return weakReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 83;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IPostMessageServiceDefault[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.lastIndexOf("", '0', 0)), Color.green(0) + 17, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IEngagementSignalsCallback_Parcel), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777247, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49123), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, 1494 - TextUtils.getCapsMode("", 0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49123), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 43, TextUtils.indexOf("", "") + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    public static final /* synthetic */ Map access000(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 49;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        Map<String, onNavigationEvent> map = nativeAdsManager.onActivityLayout;
        int i5 = i3 + 59;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final /* synthetic */ Map access100(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 77;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, setTrimPathEnd> map = nativeAdsManager.ICustomTabsCallbackStub;
        if (i3 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Context asBinder(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 73;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Context context = nativeAdsManager.IAuthTabCallback_Parcel;
        if (i3 == 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean asBinder(NativeAdsManager nativeAdsManager, String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 9;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnActivityResized = nativeAdsManager.onActivityResized(str);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return zOnActivityResized;
    }

    public static final /* synthetic */ Map asInterface(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 83;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Map<String, setTrimPathEnd> map = nativeAdsManager.onExtraCallback;
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = i2 + 85;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setInternalPageChangeListener extraCallback(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 11;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeAdsManager.writeTypedObject();
        }
        nativeAdsManager.writeTypedObject();
        throw null;
    }

    public static final /* synthetic */ requestParentDisallowInterceptTouchEvent extraCallbackWithResult(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 91;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {nativeAdsManager};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = (requestParentDisallowInterceptTouchEvent) IAuthTabCallback(iOnExtraCallbackWithResult2, 2086824780, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, -2086824739, objArr, iOnExtraCallbackWithResult);
        int i4 = IPostMessageService_Parcel + 97;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return requestparentdisallowintercepttouchevent;
    }

    public static final /* synthetic */ findResAndMsg getInterfaceDescriptor(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 109;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsg = nativeAdsManager.ICustomTabsCallback;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return findresandmsg;
    }

    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 25;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        Map<String, List<setStrokeColor>> map = nativeAdsManager.IAuthTabCallback;
        int i5 = i3 + 7;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public static final /* synthetic */ Set onActivityLayout(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 49;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = nativeAdsManager.ICustomTabsServiceDefault;
        int i5 = i2 + 31;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public static final /* synthetic */ List onActivityResized(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 93;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        Object obj = null;
        List<String> list = nativeAdsManager.IEngagementSignalsCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 17;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Intent onExtraCallback(NativeAdsManager nativeAdsManager, Context context, NativeAdsDto nativeAdsDto, deleteProfile deleteprofile) {
        Intent intent;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 105;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            intent = (Intent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2123852411, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2123852449, new Object[]{nativeAdsManager, context, nativeAdsDto, deleteprofile}, iOnExtraCallbackWithResult);
            int i3 = 19 / 0;
        } else {
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            intent = (Intent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2123852411, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2123852449, new Object[]{nativeAdsManager, context, nativeAdsDto, deleteprofile}, iOnExtraCallbackWithResult2);
        }
        int i4 = IPostMessageService_Parcel + 13;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return intent;
    }

    public static final /* synthetic */ void onExtraCallback(NativeAdsManager nativeAdsManager, String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 13;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsManager.IAuthTabCallback_Parcel(str);
        int i4 = IPostMessageServiceStubProxy + 9;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean onExtraCallback(NativeAdsManager nativeAdsManager, String str, long j) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 7;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeAdsManager.onWarmupCompleted(str, j);
        }
        nativeAdsManager.onWarmupCompleted(str, j);
        throw null;
    }

    public static final /* synthetic */ NativeAdsDto onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, NativeAdsDto nativeAdsDto) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            return (NativeAdsDto) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -628965044, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 628965062, new Object[]{nativeAdsManager, nativeAdsDto}, iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        NativeAdsDto nativeAdsDto2 = (NativeAdsDto) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -628965044, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 628965062, new Object[]{nativeAdsManager, nativeAdsDto}, iOnExtraCallbackWithResult2);
        int i3 = 39 / 0;
        return nativeAdsDto2;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, NativeAdsDto nativeAdsDto, int i, String str, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 117;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = nativeAdsManager.onWarmupCompleted(nativeAdsDto, i, str, (access13800<? super NativeAdsDto>) access13800Var);
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        int i6 = IPostMessageServiceStubProxy + 91;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, AppCompatActivity appCompatActivity, String str, NativeAdsDto nativeAdsDto, Intent intent, setTrimPathOffset settrimpathoffset) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 115;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -369413561, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 369413577, new Object[]{nativeAdsManager, appCompatActivity, str, nativeAdsDto, intent, settrimpathoffset}, iOnExtraCallbackWithResult);
        int i4 = IPostMessageService_Parcel + 75;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 33;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 731593341, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -731593321, new Object[]{nativeAdsManager, str}, iOnExtraCallbackWithResult);
        int i4 = IPostMessageServiceStubProxy + 87;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str, setStrokeColor setstrokecolor) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 61;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsManager.onWarmupCompleted(str, setstrokecolor);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, setTrimPathOffset settrimpathoffset, NativeAdsError nativeAdsError) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 19;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -275099588, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 275099617, new Object[]{nativeAdsManager, settrimpathoffset, nativeAdsError}, iOnExtraCallbackWithResult);
            return;
        }
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -275099588, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 275099617, new Object[]{nativeAdsManager, settrimpathoffset, nativeAdsError}, iOnExtraCallbackWithResult2);
        throw null;
    }

    public static final /* synthetic */ Map onMinimized(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 53;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Long> map = nativeAdsManager.updateVisuals;
        int i5 = i2 + 75;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public static final /* synthetic */ long onNavigationEvent(NativeAdsManager nativeAdsManager, String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 79;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = nativeAdsManager.access100(str);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = IPostMessageService_Parcel + 79;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return jAccess100;
    }

    public static final /* synthetic */ Intent onNavigationEvent(NativeAdsManager nativeAdsManager, Context context, NativeAdsDto nativeAdsDto, deleteProfile deleteprofile) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 83;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intent intentIAuthTabCallback = nativeAdsManager.IAuthTabCallback(context, nativeAdsDto, deleteprofile);
        int i4 = IPostMessageService_Parcel + 83;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return intentIAuthTabCallback;
    }

    public static final /* synthetic */ NativeAdsDto onNavigationEvent(NativeAdsManager nativeAdsManager, NativeAdsDto nativeAdsDto) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 87;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDtoIAuthTabCallback = nativeAdsManager.IAuthTabCallback(nativeAdsDto);
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return nativeAdsDtoIAuthTabCallback;
    }

    public static final /* synthetic */ Object onNavigationEvent(NativeAdsManager nativeAdsManager, String str, List list, access100 access100Var, String str2, String str3, String str4, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 87;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = nativeAdsManager.onExtraCallback(str, list, access100Var, str2, str3, str4, access13800Var);
        int i4 = IPostMessageServiceStubProxy + 91;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        setTrimPathOffset settrimpathoffset = (setTrimPathOffset) objArr[2];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 81;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setTrimPathOffset settrimpathoffsetOnExtraCallbackWithResult = nativeAdsManager.onExtraCallbackWithResult(str, settrimpathoffset);
        int i4 = IPostMessageServiceStubProxy + 89;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return settrimpathoffsetOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ access100 onTransact(NativeAdsManager nativeAdsManager, String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 53;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        access100 access100VarICustomTabsCallbackStubProxy = nativeAdsManager.ICustomTabsCallbackStubProxy(str);
        int i4 = IPostMessageService_Parcel + 81;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return access100VarICustomTabsCallbackStubProxy;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 35;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = nativeAdsManager.ICustomTabsCallbackDefault;
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        int i6 = i2 + 19;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z);
    }

    public static final /* synthetic */ Intent onWarmupCompleted(NativeAdsManager nativeAdsManager, Context context, NativeAdsDto nativeAdsDto, deleteProfile deleteprofile) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 3;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeAdsManager.onExtraCallback(context, nativeAdsDto, deleteprofile);
        }
        nativeAdsManager.onExtraCallback(context, nativeAdsDto, deleteprofile);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, int i, String str2, access13800 access13800Var) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy + 23;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return nativeAdsManager.onExtraCallback(str, adRequestOption, i, str2, (access13800<? super NativeAdsDto>) access13800Var);
        }
        nativeAdsManager.onExtraCallback(str, adRequestOption, i, str2, (access13800<? super NativeAdsDto>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, boolean z) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 19;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        List<setStrokeColor> listOnExtraCallbackWithResult = nativeAdsManager.onExtraCallbackWithResult(str, z);
        int i4 = IPostMessageService_Parcel + 73;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsManager nativeAdsManager, String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 85;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsManager.IAuthTabCallbackStubProxy(str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IPostMessageService_Parcel + 123;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, NativeAdsDto nativeAdsDto, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 37;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsManager.onExtraCallback(str, nativeAdsDto, z);
        int i4 = IPostMessageService_Parcel + 15;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 105;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Map<String, NativeAdsDto> map = nativeAdsManager.access100;
        if (i3 == 0) {
            return map;
        }
        throw null;
    }

    public static final /* synthetic */ Map readTypedObject(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 29;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        Map<String, getPackageType> map = nativeAdsManager.validateRelationship;
        int i5 = i3 + 111;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final /* synthetic */ asBinder writeTypedObject(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 101;
        IPostMessageServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        asBinder asbinder = nativeAdsManager.newSessionWithExtras;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 67;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return asbinder;
    }

    public /* bridge */ void onCreate(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 17;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = IPostMessageService_Parcel + 41;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onPause(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 41;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallbackStubProxy {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallbackStubProxy[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallbackStubProxy ALL = new IAuthTabCallbackStubProxy("ALL", 0);
        public static final IAuthTabCallbackStubProxy TOSSAD = new IAuthTabCallbackStubProxy("TOSSAD", 1);
        public static final IAuthTabCallbackStubProxy ADMOB = new IAuthTabCallbackStubProxy("ADMOB", 2);
        public static final IAuthTabCallbackStubProxy NONE = new IAuthTabCallbackStubProxy("NONE", 3);

        private static final /* synthetic */ IAuthTabCallbackStubProxy[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return new IAuthTabCallbackStubProxy[]{ALL, TOSSAD, ADMOB, NONE};
            }
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = ALL;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy2 = TOSSAD;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy3 = ADMOB;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy4 = NONE;
            IAuthTabCallbackStubProxy[] iAuthTabCallbackStubProxyArr = new IAuthTabCallbackStubProxy[2];
            iAuthTabCallbackStubProxyArr[0] = iAuthTabCallbackStubProxy;
            iAuthTabCallbackStubProxyArr[0] = iAuthTabCallbackStubProxy2;
            iAuthTabCallbackStubProxyArr[3] = iAuthTabCallbackStubProxy3;
            iAuthTabCallbackStubProxyArr[5] = iAuthTabCallbackStubProxy4;
            return iAuthTabCallbackStubProxyArr;
        }

        public static EnumEntries<IAuthTabCallbackStubProxy> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<IAuthTabCallbackStubProxy> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 66 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallbackStubProxy valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) Enum.valueOf(IAuthTabCallbackStubProxy.class, str);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackStubProxy;
            }
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallbackStubProxy[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStubProxy[] iAuthTabCallbackStubProxyArr = (IAuthTabCallbackStubProxy[]) $VALUES.clone();
            int i4 = onNavigationEvent + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackStubProxyArr;
        }

        private IAuthTabCallbackStubProxy(String str, int i) {
        }

        static {
            IAuthTabCallbackStubProxy[] iAuthTabCallbackStubProxyArr$values = $values();
            $VALUES = iAuthTabCallbackStubProxyArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackStubProxyArr$values);
            int i = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 78 / 0;
            }
        }
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 49;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        boolean z = this.onPostMessage;
        int i5 = i3 + 103;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onTransact(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 31;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.writeTypedObject = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 83;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object newSession(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        Map<String, String> map = (Map) objArr[1];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 125;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        nativeAdsManager.warmup = map;
        int i4 = IPostMessageService_Parcel + 49;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final requestParentDisallowInterceptTouchEvent onMessageChannelReady(NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = new requestParentDisallowInterceptTouchEvent(nativeAdsManager);
        int i2 = IPostMessageServiceStubProxy + 123;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return requestparentdisallowintercepttouchevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object prefetch(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 53;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = (requestParentDisallowInterceptTouchEvent) nativeAdsManager.newSession.getValue();
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = IPostMessageService_Parcel + 31;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return requestparentdisallowintercepttouchevent;
    }

    public final void asInterface(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 111;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        int i4 = i2 % 2;
        this.prefetchWithMultipleUrls = str;
        if (i4 != 0) {
            int i5 = 27 / 0;
        }
        int i6 = i3 + 105;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i = 2 % 2;
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = ((NativeAdsManager) objArr[0]).ICustomTabsCallback_Parcel;
        if (weakReference != null) {
            int i2 = IPostMessageServiceStubProxy + 17;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = weakReference.get();
            if (i3 != 0) {
                throw null;
            }
            if (textFieldScrollKtExternalSyntheticLambda0 != null) {
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0);
                int i4 = IPostMessageService_Parcel + 117;
                IPostMessageServiceStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    return textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
                }
                throw null;
            }
        }
        return null;
    }

    private static final Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 25;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallback(true);
            adinfo.onNavigationEvent(false);
            adinfo.onExtraCallbackWithResult(true);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallback(true);
            adinfo.onNavigationEvent(false);
            adinfo.onExtraCallbackWithResult(true);
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback6, 186882589, new Object[]{adinfo, true}, iOnExtraCallback5, iOnExtraCallback4);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IPostMessageServiceStubProxy + 39;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 97;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = this.ICustomTabsService_Parcel.onWarmupCompleted();
        if (strOnWarmupCompleted == null) {
            return null;
        }
        int i4 = IPostMessageServiceStubProxy + 63;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        if (StringsKt.isBlank(strOnWarmupCompleted)) {
            return null;
        }
        int i6 = IPostMessageService_Parcel + 45;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
        return strOnWarmupCompleted;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy;
        int i3 = i2 + 23;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IEngagementSignalsCallbackStubProxy;
        int i5 = i2 + 59;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void IAuthTabCallbackDefault(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 27;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.writeTypedList = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.writeTypedList = str;
            throw null;
        }
    }

    private final setInternalPageChangeListener writeTypedObject() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 101;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.receiveFile.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (setInternalPageChangeListener) value;
        }
        Object value2 = this.receiveFile.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        int i = 2 % 2;
        OkHttpClient.Builder builderIAuthTabCallback = ((NativeAdsManager) objArr[0]).ICustomTabsCallbackStubProxy.IAuthTabCallback();
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        setInternalPageChangeListener setinternalpagechangelistener = (setInternalPageChangeListener) new Retrofit.Builder().IAuthTabCallback(zzaj.onNavigationEvent().onNavigationEvent()).onExtraCallback(deleteCert.IAuthTabCallback()).onExtraCallbackWithResult(builderIAuthTabCallback.connectTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(15, setrevision)).readTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(15, setrevision)).build()).IAuthTabCallback().onNavigationEvent(setInternalPageChangeListener.class);
        int i2 = IPostMessageServiceStubProxy + 41;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return setinternalpagechangelistener;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onNavigationEvent AUTO = new onNavigationEvent("AUTO", 0);
        public static final onNavigationEvent MANUAL = new onNavigationEvent("MANUAL", 1);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {AUTO, MANUAL};
            int i5 = i3 + 83;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback LOADING = new IAuthTabCallback("LOADING", 0);
        public static final IAuthTabCallback LOADED = new IAuthTabCallback("LOADED", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = LOADING;
            if (i3 == 0) {
                return new IAuthTabCallback[]{iAuthTabCallback, LOADED};
            }
            IAuthTabCallback iAuthTabCallback2 = LOADED;
            IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[5];
            iAuthTabCallbackArr[0] = iAuthTabCallback;
            iAuthTabCallbackArr[0] = iAuthTabCallback2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public static IAuthTabCallback[] values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i3 = 55 / 0;
            } else {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            }
            int i4 = onExtraCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onWarmupCompleted + 5;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class access100 {
        private static int asBinder = 1;
        private static int onTransact;
        private final addNewItem IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final ViewPager2LinearLayoutManagerImpl onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final Set<String> onWarmupCompleted;

        public static /* synthetic */ access100 onExtraCallbackWithResult(access100 access100Var, String str, Set set, String str2, addNewItem addnewitem, String str3, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, int i, Object obj) {
            Set set2;
            String str4;
            ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl2;
            int i2 = 2 % 2;
            int i3 = onTransact;
            int i4 = i3 + 95;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            String str5 = (i & 1) != 0 ? access100Var.onNavigationEvent : str;
            if ((i & 2) != 0) {
                int i6 = i3 + 21;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                set2 = access100Var.onWarmupCompleted;
            } else {
                set2 = set;
            }
            if ((i & 4) != 0) {
                int i8 = asBinder + 21;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                str4 = access100Var.IAuthTabCallbackDefault;
            } else {
                str4 = str2;
            }
            addNewItem addnewitem2 = (i & 8) != 0 ? access100Var.IAuthTabCallback : addnewitem;
            String str6 = (i & 16) != 0 ? access100Var.onExtraCallbackWithResult : str3;
            if ((i & 32) != 0) {
                viewPager2LinearLayoutManagerImpl2 = access100Var.onExtraCallback;
                int i10 = asBinder + 49;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
            } else {
                viewPager2LinearLayoutManagerImpl2 = viewPager2LinearLayoutManagerImpl;
            }
            access100 access100VarOnNavigationEvent = access100Var.onNavigationEvent(str5, set2, str4, addnewitem2, str6, viewPager2LinearLayoutManagerImpl2);
            int i12 = onTransact + 107;
            asBinder = i12 % 128;
            if (i12 % 2 != 0) {
                return access100VarOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 125;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof access100)) {
                int i4 = i3 + 49;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            access100 access100Var = (access100) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, access100Var.onNavigationEvent) || !Intrinsics.areEqual(this.onWarmupCompleted, access100Var.onWarmupCompleted) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, access100Var.IAuthTabCallbackDefault)) {
                return false;
            }
            if (this.IAuthTabCallback != access100Var.IAuthTabCallback) {
                int i6 = asBinder + 85;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, access100Var.onExtraCallbackWithResult)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, access100Var.onExtraCallback)) {
                return true;
            }
            int i8 = onTransact + 91;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
          0x0032: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0032: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0032: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
          0x0030: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            String str;
            int iHashCode3;
            int iHashCode4;
            int i = 2 % 2;
            int i2 = asBinder + 123;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.onNavigationEvent.hashCode();
                iHashCode2 = this.onWarmupCompleted.hashCode();
                str = this.IAuthTabCallbackDefault;
                iHashCode3 = str == null ? 0 : str.hashCode();
            } else {
                iHashCode = this.onNavigationEvent.hashCode();
                iHashCode2 = this.onWarmupCompleted.hashCode();
                str = this.IAuthTabCallbackDefault;
                if (str == null) {
                }
            }
            int iHashCode5 = this.IAuthTabCallback.hashCode();
            String str2 = this.onExtraCallbackWithResult;
            if (str2 == null) {
                iHashCode4 = 0;
            } else {
                iHashCode4 = str2.hashCode();
                int i3 = asBinder + 39;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl = this.onExtraCallback;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4) * 31) + (viewPager2LinearLayoutManagerImpl != null ? viewPager2LinearLayoutManagerImpl.hashCode() : 0);
        }

        public final access100 onNavigationEvent(@NotNull String str, @NotNull Set<String> set, @Nullable String str2, @NotNull addNewItem addnewitem, @Nullable String str3, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(addnewitem, "");
            access100 access100Var = new access100(str, set, str2, addnewitem, str3, viewPager2LinearLayoutManagerImpl);
            int i2 = asBinder + 99;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SpaceLoadConfig(sdkId=" + this.onNavigationEvent + ", availableStyleIds=" + this.onWarmupCompleted + ", subBundle=" + this.IAuthTabCallbackDefault + ", productType=" + this.IAuthTabCallback + ", placementId=" + this.onExtraCallbackWithResult + ", renderer=" + this.onExtraCallback + ")";
            int i2 = onTransact + 43;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public access100(@NotNull String str, @NotNull Set<String> set, @Nullable String str2, @NotNull addNewItem addnewitem, @Nullable String str3, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(addnewitem, "");
            this.onNavigationEvent = str;
            this.onWarmupCompleted = set;
            this.IAuthTabCallbackDefault = str2;
            this.IAuthTabCallback = addnewitem;
            this.onExtraCallbackWithResult = str3;
            this.onExtraCallback = viewPager2LinearLayoutManagerImpl;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ access100(String str, Set set, String str2, addNewItem addnewitem, String str3, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, int i, DefaultConstructorMarker defaultConstructorMarker) {
            addNewItem addnewitem2;
            String str4;
            ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl2;
            if ((i & 8) != 0) {
                int i2 = onTransact + 71;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                addNewItem addnewitem3 = addNewItem.TURNKEY;
                int i4 = asBinder + 107;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
                addnewitem2 = addnewitem3;
            } else {
                addnewitem2 = addnewitem;
            }
            if ((i & 16) != 0) {
                int i6 = 2 % 2;
                str4 = null;
            } else {
                str4 = str3;
            }
            if ((i & 32) != 0) {
                int i7 = asBinder + 95;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                viewPager2LinearLayoutManagerImpl2 = null;
            } else {
                viewPager2LinearLayoutManagerImpl2 = viewPager2LinearLayoutManagerImpl;
            }
            this(str, set, str2, addnewitem2, str4, viewPager2LinearLayoutManagerImpl2);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 13;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 65;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Set<String> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 49;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            Set<String> set = this.onWarmupCompleted;
            int i4 = i2 + 123;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return set;
            }
            throw null;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 7;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.IAuthTabCallbackDefault;
            int i4 = i2 + 7;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return str;
        }

        public final addNewItem IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 53;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 17;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i3 + 101;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 32 / 0;
            }
            return str;
        }

        public final ViewPager2LinearLayoutManagerImpl onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 97;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class onTransact {
        public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder = 0;
        private static int asInterface = 0;
        private static int onTransact = 1;
        private final addNewItem IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final GetNativeAdsRequestBody.AdRequestOption onExtraCallback;
        private final deleteProfile onExtraCallbackWithResult;
        private final onNavigationEvent onNavigationEvent;
        private final String onWarmupCompleted;

        static {
            int i = onTransact + 103;
            asInterface = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 83;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 107;
                IAuthTabCallbackDefault = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!(obj instanceof onTransact)) {
                int i7 = i2 + 51;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            onTransact ontransact = (onTransact) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, ontransact.IAuthTabCallbackStub)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, ontransact.onExtraCallback)) {
                int i9 = asBinder + 89;
                IAuthTabCallbackDefault = i9 % 128;
                return i9 % 2 == 0;
            }
            if (this.onExtraCallbackWithResult != ontransact.onExtraCallbackWithResult) {
                return false;
            }
            if (this.IAuthTabCallback != ontransact.IAuthTabCallback) {
                int i10 = asBinder + 69;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (this.onNavigationEvent == ontransact.onNavigationEvent) {
                if (Intrinsics.areEqual(this.onWarmupCompleted, ontransact.onWarmupCompleted)) {
                    return true;
                }
                int i12 = asBinder + 111;
                IAuthTabCallbackDefault = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            int i14 = asBinder + 79;
            IAuthTabCallbackDefault = i14 % 128;
            if (i14 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r3
          0x0026: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
          0x0026: PHI (r3v3 im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$AdRequestOption) = 
          (r3v0 im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$AdRequestOption)
          (r3v5 im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$AdRequestOption)
         binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
          0x0024: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            GetNativeAdsRequestBody.AdRequestOption adRequestOption;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 111;
            asBinder = i2 % 128;
            int i3 = 0;
            if (i2 % 2 != 0) {
                iHashCode = this.IAuthTabCallbackStub.hashCode();
                adRequestOption = this.onExtraCallback;
                iHashCode2 = adRequestOption == null ? 0 : adRequestOption.hashCode();
            } else {
                iHashCode = this.IAuthTabCallbackStub.hashCode();
                adRequestOption = this.onExtraCallback;
                if (adRequestOption == null) {
                }
            }
            int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode4 = this.IAuthTabCallback.hashCode();
            int iHashCode5 = this.onNavigationEvent.hashCode();
            String str = this.onWarmupCompleted;
            if (str != null) {
                int i4 = asBinder + 73;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                int iHashCode6 = str.hashCode();
                if (i5 == 0) {
                    int i6 = 83 / 0;
                }
                i3 = iHashCode6;
            }
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ResolvedSpace(spaceUnitId=" + this.IAuthTabCallbackStub + ", adRequestOption=" + this.onExtraCallback + ", preferredUiMode=" + this.onExtraCallbackWithResult + ", productType=" + this.IAuthTabCallback + ", fetchType=" + this.onNavigationEvent + ", placementId=" + this.onWarmupCompleted + ")";
            int i2 = asBinder + 107;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onTransact(@NotNull String str, @Nullable GetNativeAdsRequestBody.AdRequestOption adRequestOption, @NotNull deleteProfile deleteprofile, @NotNull addNewItem addnewitem, @NotNull onNavigationEvent onnavigationevent, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intrinsics.checkNotNullParameter(addnewitem, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.IAuthTabCallbackStub = str;
            this.onExtraCallback = adRequestOption;
            this.onExtraCallbackWithResult = deleteprofile;
            this.IAuthTabCallback = addnewitem;
            this.onNavigationEvent = onnavigationevent;
            this.onWarmupCompleted = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onTransact(String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, deleteProfile deleteprofile, addNewItem addnewitem, onNavigationEvent onnavigationevent, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 32) != 0) {
                int i2 = asBinder + 41;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 91;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = null;
            }
            this(str, adRequestOption, deleteprofile, addnewitem, onnavigationevent, str2);
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 19;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 11;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final GetNativeAdsRequestBody.AdRequestOption onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 55;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            GetNativeAdsRequestBody.AdRequestOption adRequestOption = this.onExtraCallback;
            int i5 = i3 + 51;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return adRequestOption;
        }

        public final deleteProfile onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 11;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            deleteProfile deleteprofile = this.onExtraCallbackWithResult;
            int i5 = i2 + 37;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return deleteprofile;
            }
            throw null;
        }

        public final addNewItem onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 77;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            addNewItem addnewitem = this.IAuthTabCallback;
            int i5 = i2 + 17;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return addnewitem;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 27;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            onNavigationEvent onnavigationevent = this.onNavigationEvent;
            int i5 = i3 + 85;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationevent;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 67;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 79;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 85 / 0;
            }
            return str;
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
            
                return r11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
            
                if ((r11 instanceof o.addOnPageChangeListener.onNavigationEvent) == false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
            
                r11 = (o.addOnPageChangeListener.onNavigationEvent) r11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
            
                return new im.toss.ads_sdk.NativeAdsManager.onTransact(r11.IAuthTabCallback(), null, o.deleteProfile.AUTO, o.addNewItem.NATIVE, r11.onExtraCallbackWithResult(), r11.onExtraCallback());
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
            
                throw new kotlin.NoWhenBranchMatchedException();
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if ((r11 instanceof o.addOnPageChangeListener.onWarmupCompleted) != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            
                if ((r11 instanceof o.addOnPageChangeListener.onWarmupCompleted) != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
            
                r11 = (o.addOnPageChangeListener.onWarmupCompleted) r11;
                r11 = new im.toss.ads_sdk.NativeAdsManager.onTransact(r11.onNavigationEvent(), r11.onWarmupCompleted(), r11.IAuthTabCallback(), o.addNewItem.TURNKEY, r11.onExtraCallbackWithResult(), null, 32, null);
                r1 = im.toss.ads_sdk.NativeAdsManager.onTransact.onWarmupCompleted.IAuthTabCallback + 107;
                im.toss.ads_sdk.NativeAdsManager.onTransact.onWarmupCompleted.onWarmupCompleted = r1 % 128;
                r1 = r1 % 2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final onTransact onNavigationEvent(@NotNull addOnPageChangeListener addonpagechangelistener) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(addonpagechangelistener, "");
                    int i3 = 45 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(addonpagechangelistener, "");
                }
            }
        }
    }

    static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final NativeAdsDto IAuthTabCallback;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallback) obj).onNavigationEvent)) {
                int i2 = onExtraCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.IAuthTabCallback, r6.IAuthTabCallback))) {
                return true;
            }
            int i4 = onExtraCallback + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            return i3 == 0 ? (iHashCode - 102) >> this.IAuthTabCallback.hashCode() : (iHashCode * 31) + this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DisplayAdRequest(spaceUnitId=" + this.onNavigationEvent + ", ad=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallback(@NotNull String str, @NotNull NativeAdsDto nativeAdsDto) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = nativeAdsDto;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i2 + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final NativeAdsDto onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            NativeAdsDto nativeAdsDto = this.IAuthTabCallback;
            int i5 = i3 + 29;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
            return nativeAdsDto;
        }
    }

    static final class IAuthTabCallbackStub {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final String IAuthTabCallback;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(obj instanceof IAuthTabCallbackStub))) {
                IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) obj;
                if (!Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallbackStub.onNavigationEvent) || !Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallbackStub.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallbackStub.onWarmupCompleted)) {
                    return false;
                }
                int i4 = onExtraCallbackWithResult + 13;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 0;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
            int i4 = onExtraCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MediationResultKey(requestId=" + this.onNavigationEvent + ", slotId=" + this.IAuthTabCallback + ", mediationId=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallbackStub(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = str2;
            this.onWarmupCompleted = str3;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i3 + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    static final class IAuthTabCallbackDefault {
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback;
        private final String IAuthTabCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackStub + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallbackDefault)) {
                return false;
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) obj;
            if (Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallbackDefault.IAuthTabCallback)) {
                return Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallbackDefault.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallbackDefault.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallbackDefault.onExtraCallbackWithResult);
            }
            int i4 = onExtraCallback + 119;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.IAuthTabCallback.hashCode();
            return i3 != 0 ? (((((iHashCode << 21) << this.onNavigationEvent.hashCode()) << 93) - this.onWarmupCompleted.hashCode()) << 45) >>> this.onExtraCallbackWithResult.hashCode() : (((((iHashCode * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MediationExposureKey(requestId=" + this.IAuthTabCallback + ", slotId=" + this.onNavigationEvent + ", mediationId=" + this.onWarmupCompleted + ", eventName=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallbackStub + 17;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallbackDefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.IAuthTabCallback = str;
            this.onNavigationEvent = str2;
            this.onWarmupCompleted = str3;
            this.onExtraCallbackWithResult = str4;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 75;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 87;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 49 / 0;
            }
            return str;
        }
    }

    static final class asInterface {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final String IAuthTabCallback;
        private final AdMobFailedReason onExtraCallback;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, asinterface.IAuthTabCallback) || !Intrinsics.areEqual(this.onNavigationEvent, asinterface.onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, asinterface.onExtraCallback)) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.IAuthTabCallback;
            int iHashCode2 = 0;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.onNavigationEvent;
            if (str2 == null) {
                int i2 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
                int i4 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            AdMobFailedReason adMobFailedReason = this.onExtraCallback;
            if (adMobFailedReason != null) {
                int i6 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = adMobFailedReason.hashCode();
            }
            int i8 = (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
            int i9 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                return i8;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "InitializeMediationResolution(winner=" + this.IAuthTabCallback + ", tossFailed=" + this.onNavigationEvent + ", adMobFailed=" + this.onExtraCallback + ")";
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public asInterface(@Nullable String str, @Nullable String str2, @Nullable AdMobFailedReason adMobFailedReason) {
            this.IAuthTabCallback = str;
            this.onNavigationEvent = str2;
            this.onExtraCallback = adMobFailedReason;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ asInterface(String str, String str2, AdMobFailedReason adMobFailedReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 2) != 0) {
                int i2 = onWarmupCompleted + 67;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i7 = onWarmupCompleted + 107;
                int i8 = i7 % 128;
                onExtraCallbackWithResult = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 55;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 2 % 2;
                }
                adMobFailedReason = null;
            }
            this(str, str2, adMobFailedReason);
        }

        public final String onExtraCallbackWithResult() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                str = this.IAuthTabCallback;
                int i4 = 74 / 0;
            } else {
                str = this.IAuthTabCallback;
            }
            int i5 = i3 + 123;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 49 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onNavigationEvent;
            if (i3 == 0) {
                int i4 = 23 / 0;
            }
            return str;
        }

        public final AdMobFailedReason onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class prefetch extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $adRequestOption;
        final /* synthetic */ Integer $admobPreloadBufferSize;
        final /* synthetic */ setStrokeColor $loadCallback;
        final /* synthetic */ long $loadGeneration;
        final /* synthetic */ deleteProfile $preferredUiMode;
        final /* synthetic */ String $requestedPlayableUrl;
        final /* synthetic */ int $requestedTestIndex;
        final /* synthetic */ String $spaceUnitId;
        final /* synthetic */ boolean $useAdmobPreloaderFallback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        prefetch(String str, long j, AppCompatActivity appCompatActivity, boolean z, Integer num, deleteProfile deleteprofile, setStrokeColor setstrokecolor, int i, String str2, GetNativeAdsRequestBody.AdRequestOption adRequestOption, access13800<? super prefetch> access13800Var) {
            super(2, access13800Var);
            this.$spaceUnitId = str;
            this.$loadGeneration = j;
            this.$activity = appCompatActivity;
            this.$useAdmobPreloaderFallback = z;
            this.$admobPreloadBufferSize = num;
            this.$preferredUiMode = deleteprofile;
            this.$loadCallback = setstrokecolor;
            this.$requestedTestIndex = i;
            this.$requestedPlayableUrl = str2;
            this.$adRequestOption = adRequestOption;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            prefetch prefetchVar = NativeAdsManager.this.new prefetch(this.$spaceUnitId, this.$loadGeneration, this.$activity, this.$useAdmobPreloaderFallback, this.$admobPreloadBufferSize, this.$preferredUiMode, this.$loadCallback, this.$requestedTestIndex, this.$requestedPlayableUrl, this.$adRequestOption, access13800Var);
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 37 / 0;
            }
            return prefetchVar;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super NativeAdsDto>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ AppCompatActivity $activity;
            final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $adRequestOption;
            final /* synthetic */ Ref.BooleanRef $errorHandled;
            final /* synthetic */ setStrokeColor $loadCallback;
            final /* synthetic */ long $loadGeneration;
            final /* synthetic */ String $spaceUnitId;
            int I$0;
            int I$1;
            Object L$0;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, long j, Ref.BooleanRef booleanRef, setStrokeColor setstrokecolor, AppCompatActivity appCompatActivity, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
                this.$spaceUnitId = str;
                this.$adRequestOption = adRequestOption;
                this.$loadGeneration = j;
                this.$errorHandled = booleanRef;
                this.$loadCallback = setstrokecolor;
                this.$activity = appCompatActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$spaceUnitId, this.$adRequestOption, this.$loadGeneration, this.$errorHandled, this.$loadCallback, this.$activity, access13800Var);
                int i2 = onExtraCallback + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 59;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnExtraCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super NativeAdsDto> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 117;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 41 / 0;
                }
                int i5 = onExtraCallback + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: im.toss.ads_sdk.NativeAdsManager$prefetch$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
            public static final class C0006IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ Throwable $e$inlined;
                final /* synthetic */ setStrokeColor $loadCallback$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0006IAuthTabCallback(access13800 access13800Var, setStrokeColor setstrokecolor, Throwable th) {
                    super(2, access13800Var);
                    this.$loadCallback$inlined = setstrokecolor;
                    this.$e$inlined = th;
                }

                public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 89;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onNavigationEvent + 3;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C0006IAuthTabCallback c0006IAuthTabCallback = new C0006IAuthTabCallback(access13800Var, this.$loadCallback$inlined, this.$e$inlined);
                    int i2 = onExtraCallback + 47;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return c0006IAuthTabCallback;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 63;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                    int i4 = onExtraCallback + 15;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objIAuthTabCallback;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[PHI: r1
                  0x0044: PHI (r1v10 java.lang.Object) = (r1v4 java.lang.Object), (r1v11 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
                  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted;
                    int i;
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 59;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        int i4 = 48 / 0;
                        if (i == 0) {
                            ResultKt.onNavigationEvent(obj);
                            this.label = 1;
                            if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                                int i5 = onExtraCallback + 29;
                                onNavigationEvent = i5 % 128;
                                int i6 = i5 % 2;
                                return objOnWarmupCompleted;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i7 = onExtraCallback + 75;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            ResultKt.onNavigationEvent(obj);
                            int i9 = onExtraCallback + 111;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    } else {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        if (i != 0) {
                        }
                    }
                    try {
                        this.$loadCallback$inlined.onExtraCallback(new NativeAdsError(addOnAdapterChangeListener.INTERNAL_ERROR.getCode(), "Failed to fetch ad, " + this.$e$inlined, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                    } catch (Throwable unused) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ AppCompatActivity $activity$inlined;
                final /* synthetic */ setStrokeColor $loadCallback$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public onWarmupCompleted(access13800 access13800Var, setStrokeColor setstrokecolor, AppCompatActivity appCompatActivity) {
                    super(2, access13800Var);
                    this.$loadCallback$inlined = setstrokecolor;
                    this.$activity$inlined = appCompatActivity;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.$loadCallback$inlined, this.$activity$inlined);
                    int i2 = IAuthTabCallback + 77;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return onwarmupcompleted;
                    }
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 81;
                    onWarmupCompleted = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        return onExtraCallbackWithResult(findresandmsg, access13800Var);
                    }
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                    int i3 = 15 / 0;
                    return objOnExtraCallbackWithResult;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 111;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onWarmupCompleted + 113;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 != 0) {
                        int i3 = onWarmupCompleted;
                        int i4 = i3 + 113;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = i3 + 101;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            ResultKt.onNavigationEvent(obj);
                            int i7 = 91 / 0;
                        } else {
                            ResultKt.onNavigationEvent(obj);
                        }
                        int i8 = onWarmupCompleted + 3;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        this.label = 1;
                        if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    try {
                        setStrokeColor setstrokecolor = this.$loadCallback$inlined;
                        addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.NETWORK_ERROR;
                        int code = addonadapterchangelistener.getCode();
                        String string = this.$activity$inlined.getString(addonadapterchangelistener.getMessageRes());
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        setstrokecolor.onExtraCallback(new NativeAdsError(code, string, (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                    } catch (Throwable unused) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2;
                Object objOnWarmupCompleted;
                int i = 2 % 2;
                Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
                int i2 = this.label;
                try {
                    if (i2 != 0) {
                        int i3 = onExtraCallback + 37;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        objOnWarmupCompleted = obj;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        NativeAdsManager nativeAdsManager = this.this$0;
                        String str = this.$spaceUnitId;
                        GetNativeAdsRequestBody.AdRequestOption adRequestOption = this.$adRequestOption;
                        Result.Companion companion = Result.Companion;
                        getPackageType getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(nativeAdsManager);
                        if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
                        }
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        objOnWarmupCompleted = NativeAdsManager.onWarmupCompleted(nativeAdsManager, str, adRequestOption, 0, (String) null, (access13800) this, 12, (Object) null);
                        if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                            int i4 = onExtraCallbackWithResult + 59;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            return objOnWarmupCompleted2;
                        }
                    }
                    obj2 = Result.constructor-impl(objOnWarmupCompleted);
                } catch (CancellationException e) {
                    throw e;
                } catch (WebResourceResponseModel e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (Exception e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                NativeAdsManager nativeAdsManager2 = this.this$0;
                String str2 = this.$spaceUnitId;
                long j = this.$loadGeneration;
                Ref.BooleanRef booleanRef = this.$errorHandled;
                setStrokeColor setstrokecolor = this.$loadCallback;
                AppCompatActivity appCompatActivity = this.$activity;
                Throwable th = Result.exceptionOrNull-impl(obj2);
                if (th == null) {
                    return obj2;
                }
                int i6 = onExtraCallbackWithResult + 91;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0 ? !getStrokeWidth.onWarmupCompleted(getStrokeWidth.onExtraCallback, th, 0, 1, (Object) null) : !getStrokeWidth.onWarmupCompleted(getStrokeWidth.onExtraCallback, th, 0, 1, (Object) null)) {
                    if (NativeAdsManager.onExtraCallback(nativeAdsManager2, str2, j)) {
                        maybeUpdateAnimatable.onNavigationEvent(NativeAdsManager.getInterfaceDescriptor(nativeAdsManager2), putChannelInfo.onExtraCallback(), (setRandomHost) null, new C0006IAuthTabCallback(null, setstrokecolor, th), 2, (Object) null);
                    }
                } else if (NativeAdsManager.onExtraCallback(nativeAdsManager2, str2, j)) {
                    maybeUpdateAnimatable.onNavigationEvent(NativeAdsManager.getInterfaceDescriptor(nativeAdsManager2), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onWarmupCompleted(null, setstrokecolor, appCompatActivity), 2, (Object) null);
                }
                booleanRef.element = true;
                return null;
            }
        }

        public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ setStrokeColor $loadCallback$inlined;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(access13800 access13800Var, setStrokeColor setstrokecolor) {
                super(2, access13800Var);
                this.$loadCallback$inlined = setstrokecolor;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.$loadCallback$inlined);
                int i2 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onExtraCallbackWithResult(findresandmsg, access13800Var);
                }
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 1;
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
                    this.label = 1;
                    if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        int i4 = IAuthTabCallback + 21;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                try {
                    this.$loadCallback$inlined.onExtraCallback(new NativeAdsError(addOnAdapterChangeListener.INTERNAL_ERROR.getCode(), "Failed to fetch ad", (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallback;
            Ref.BooleanRef booleanRef;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(NativeAdsManager.this, this.$spaceUnitId, this.$adRequestOption, this.$loadGeneration, booleanRef2, this.$loadCallback, this.$activity, null);
                this.L$0 = booleanRef2;
                this.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 25;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                booleanRef = booleanRef2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 41;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                booleanRef = (Ref.BooleanRef) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            NativeAdsDto nativeAdsDto = (NativeAdsDto) objOnExtraCallback;
            if (nativeAdsDto != null) {
                int i7 = IAuthTabCallback + 11;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                if (NativeAdsManager.onExtraCallback(NativeAdsManager.this, this.$spaceUnitId, this.$loadGeneration)) {
                    int i9 = onNavigationEvent + 93;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    NativeAdsManager.IAuthTabCallback(NativeAdsManager.this, this.$spaceUnitId, nativeAdsDto, false, 4, (Object) null);
                }
                NativeAdsDto.Mediation mediationOnNavigationEvent = nativeAdsDto.onTransact().onNavigationEvent();
                NativeAdsManager.onExtraCallback(NativeAdsManager.this, mediationOnNavigationEvent.IAuthTabCallbackDefault(), 0, nativeAdsDto, mediationOnNavigationEvent, this.$activity, this.$useAdmobPreloaderFallback, this.$admobPreloadBufferSize, this.$preferredUiMode, this.$loadCallback, this.$spaceUnitId, this.$loadGeneration, this.$requestedTestIndex, this.$requestedPlayableUrl, null, null, null, 57344, null);
            } else if (!booleanRef.element && NativeAdsManager.onExtraCallback(NativeAdsManager.this, this.$spaceUnitId, this.$loadGeneration)) {
                maybeUpdateAnimatable.onNavigationEvent(NativeAdsManager.getInterfaceDescriptor(NativeAdsManager.this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onExtraCallbackWithResult(null, this.$loadCallback), 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    static final class ICustomTabsServiceDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ setTrimPathOffset $onShowAdCallBack;
        final /* synthetic */ String $spaceUnitId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsServiceDefault(String str, setTrimPathOffset settrimpathoffset, AppCompatActivity appCompatActivity, access13800<? super ICustomTabsServiceDefault> access13800Var) {
            super(2, access13800Var);
            this.$spaceUnitId = str;
            this.$onShowAdCallBack = settrimpathoffset;
            this.$activity = appCompatActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsServiceDefault iCustomTabsServiceDefault = NativeAdsManager.this.new ICustomTabsServiceDefault(this.$spaceUnitId, this.$onShowAdCallBack, this.$activity, access13800Var);
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iCustomTabsServiceDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
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

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return objInvokeSuspend;
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ AppCompatActivity $activity$inlined;
            final /* synthetic */ NativeAdsDto $cachedTossAd$inlined;
            final /* synthetic */ setTrimPathOffset $onShowAdCallBack$inlined;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, setTrimPathOffset settrimpathoffset, AppCompatActivity appCompatActivity, NativeAdsDto nativeAdsDto) {
                super(2, access13800Var);
                this.$onShowAdCallBack$inlined = settrimpathoffset;
                this.$activity$inlined = appCompatActivity;
                this.$cachedTossAd$inlined = nativeAdsDto;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 7;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 0;
                }
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var, this.$onShowAdCallBack$inlined, this.$activity$inlined, this.$cachedTossAd$inlined);
                int i2 = onNavigationEvent + 95;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 45 / 0;
                }
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                if (i3 == 0) {
                    int i4 = 99 / 0;
                }
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallback;
                    int i4 = i3 + 89;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i3 + 61;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        int i7 = onNavigationEvent + 41;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                try {
                    setTrimPathOffset settrimpathoffset = this.$onShowAdCallBack$inlined;
                    addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.AD_NOT_READY;
                    int code = addonadapterchangelistener.getCode();
                    String string = this.$activity$inlined.getString(addonadapterchangelistener.getMessageRes());
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    settrimpathoffset.onExtraCallback(new NativeAdsError(code, string, (String) null, this.$cachedTossAd$inlined.IAuthTabCallbackStub(), 4, (DefaultConstructorMarker) null));
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final Object invokeSuspend(Object obj) throws Throwable {
            NativeAdsDto.AdAsset adAsset;
            Pair pairIAuthTabCallback;
            String strIAuthTabCallbackStub;
            String strIAuthTabCallbackStub2;
            String strIAuthTabCallbackDefault;
            int iHashCode;
            String strIAuthTabCallbackStub3;
            String strIAuthTabCallbackStub4;
            String strIAuthTabCallbackStub5;
            String strIAuthTabCallbackStub6;
            List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            setTrimPathEnd settrimpathend = (setTrimPathEnd) NativeAdsManager.asInterface(NativeAdsManager.this).get(this.$spaceUnitId);
            NativeAdsDto nativeAdsDto = (NativeAdsDto) NativeAdsManager.IAuthTabCallbackDefault(NativeAdsManager.this).get(this.$spaceUnitId);
            scrollToItem scrolltoitem = (scrollToItem) ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 928257279, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -928257239, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult())).get(this.$spaceUnitId);
            if (nativeAdsDto == null || (listOnExtraCallbackWithResult = nativeAdsDto.onExtraCallbackWithResult()) == null) {
                adAsset = null;
            } else {
                int i4 = IAuthTabCallback + 117;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    str.hashCode();
                    throw null;
                }
                adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
            }
            if (((Boolean) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -220818320, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 220818339, new Object[]{NativeAdsManager.this, this.$spaceUnitId}, nSetPosition.onExtraCallbackWithResult())).booleanValue()) {
                int i5 = onNavigationEvent + 77;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    addOnAdapterChangeListener.AD_NOT_READY.getCode();
                    str.hashCode();
                    throw null;
                }
                NativeAdsManager nativeAdsManager = NativeAdsManager.this;
                setTrimPathOffset settrimpathoffset = this.$onShowAdCallBack;
                int code = addOnAdapterChangeListener.AD_NOT_READY.getCode();
                if (nativeAdsDto == null || (strIAuthTabCallbackStub6 = nativeAdsDto.IAuthTabCallbackStub()) == null) {
                    NativeAdsDto nativeAdsDto2 = (NativeAdsDto) ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult())).get(this.$spaceUnitId);
                    strIAuthTabCallbackStub5 = nativeAdsDto2 != null ? nativeAdsDto2.IAuthTabCallbackStub() : null;
                } else {
                    strIAuthTabCallbackStub5 = strIAuthTabCallbackStub6;
                }
                NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager, settrimpathoffset, new NativeAdsError(code, "ALREADY_SHOWING", (String) null, strIAuthTabCallbackStub5, 4, (DefaultConstructorMarker) null));
                return Unit.INSTANCE;
            }
            if (NativeAdsManager.asBinder(NativeAdsManager.this, this.$spaceUnitId)) {
                int i6 = onNavigationEvent + 15;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    addOnAdapterChangeListener.AD_NOT_LOADED.getCode();
                    throw null;
                }
                NativeAdsManager nativeAdsManager2 = NativeAdsManager.this;
                setTrimPathOffset settrimpathoffset2 = this.$onShowAdCallBack;
                int code2 = addOnAdapterChangeListener.AD_NOT_LOADED.getCode();
                if (nativeAdsDto == null || (strIAuthTabCallbackStub4 = nativeAdsDto.IAuthTabCallbackStub()) == null) {
                    NativeAdsDto nativeAdsDto3 = (NativeAdsDto) ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult())).get(this.$spaceUnitId);
                    strIAuthTabCallbackStub3 = nativeAdsDto3 != null ? nativeAdsDto3.IAuthTabCallbackStub() : null;
                } else {
                    strIAuthTabCallbackStub3 = strIAuthTabCallbackStub4;
                }
                NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager2, settrimpathoffset2, new NativeAdsError(code2, "LOADING", (String) null, strIAuthTabCallbackStub3, 4, (DefaultConstructorMarker) null));
                return Unit.INSTANCE;
            }
            if (nativeAdsDto != null && adAsset != null) {
                int i7 = onNavigationEvent + 17;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0 ? (iHashCode = (strIAuthTabCallbackDefault = adAsset.IAuthTabCallbackDefault()).hashCode()) != 1568 : (iHashCode = (strIAuthTabCallbackDefault = adAsset.IAuthTabCallbackDefault()).hashCode()) != 13281) {
                    switch (iHashCode) {
                        case 51:
                            if (strIAuthTabCallbackDefault.equals("3")) {
                                int i8 = IAuthTabCallback + 89;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                                NativeAdsManager nativeAdsManager3 = NativeAdsManager.this;
                                AppCompatActivity appCompatActivity = this.$activity;
                                String str = this.$spaceUnitId;
                                NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager3, appCompatActivity, str, nativeAdsDto, NativeAdsManager.onExtraCallback(nativeAdsManager3, (Context) appCompatActivity, nativeAdsDto, NativeAdsManager.IAuthTabCallbackDefault(nativeAdsManager3, str)), this.$onShowAdCallBack);
                                return Unit.INSTANCE;
                            }
                            break;
                        case 52:
                            if (strIAuthTabCallbackDefault.equals("4")) {
                                int i10 = IAuthTabCallback + 63;
                                onNavigationEvent = i10 % 128;
                                int i11 = i10 % 2;
                                NativeAdsManager nativeAdsManager4 = NativeAdsManager.this;
                                AppCompatActivity appCompatActivity2 = this.$activity;
                                String str2 = this.$spaceUnitId;
                                NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager4, appCompatActivity2, str2, nativeAdsDto, NativeAdsManager.onWarmupCompleted(nativeAdsManager4, (Context) appCompatActivity2, nativeAdsDto, NativeAdsManager.IAuthTabCallbackDefault(nativeAdsManager4, str2)), this.$onShowAdCallBack);
                                return Unit.INSTANCE;
                            }
                            break;
                        case 53:
                            if (!(!strIAuthTabCallbackDefault.equals("5"))) {
                                NativeAdsManager nativeAdsManager5 = NativeAdsManager.this;
                                AppCompatActivity appCompatActivity3 = this.$activity;
                                String str3 = this.$spaceUnitId;
                                NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager5, appCompatActivity3, str3, nativeAdsDto, NativeAdsManager.onNavigationEvent(nativeAdsManager5, (Context) appCompatActivity3, nativeAdsDto, NativeAdsManager.IAuthTabCallbackDefault(nativeAdsManager5, str3)), this.$onShowAdCallBack);
                                return Unit.INSTANCE;
                            }
                            break;
                    }
                } else if (strIAuthTabCallbackDefault.equals("11")) {
                    NativeAdsManager nativeAdsManager6 = NativeAdsManager.this;
                    AppCompatActivity appCompatActivity4 = this.$activity;
                    String str4 = this.$spaceUnitId;
                    NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager6, appCompatActivity4, str4, nativeAdsDto, NativeAdsManager.onExtraCallback(nativeAdsManager6, (Context) appCompatActivity4, nativeAdsDto, str4, 0, (String) null, 24, (Object) null), this.$onShowAdCallBack);
                    return Unit.INSTANCE;
                }
                if (scrolltoitem == null) {
                    maybeUpdateAnimatable.onNavigationEvent(NativeAdsManager.getInterfaceDescriptor(NativeAdsManager.this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onNavigationEvent(null, this.$onShowAdCallBack, this.$activity, nativeAdsDto), 2, (Object) null);
                    Unit unit = Unit.INSTANCE;
                    int i12 = IAuthTabCallback + 1;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            }
            if (settrimpathend == null || scrolltoitem == null) {
                pairIAuthTabCallback = null;
            } else {
                int i13 = onNavigationEvent + 95;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                pairIAuthTabCallback = NativeAdsManager.IAuthTabCallback(NativeAdsManager.this, this.$spaceUnitId);
            }
            if (pairIAuthTabCallback != null) {
                setTrimPathEnd settrimpathend2 = (setTrimPathEnd) pairIAuthTabCallback.onExtraCallbackWithResult();
                scrollToItem scrolltoitem2 = (scrollToItem) pairIAuthTabCallback.IAuthTabCallback();
                NativeAdsManager.onExtraCallback(NativeAdsManager.this, this.$spaceUnitId);
                setTrimPathOffset settrimpathoffset3 = (setTrimPathOffset) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1432143839, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1432143843, new Object[]{NativeAdsManager.this, this.$spaceUnitId, this.$onShowAdCallBack}, nSetPosition.onExtraCallbackWithResult());
                NativeAdsManager.IAuthTabCallback(NativeAdsManager.this, this.$spaceUnitId, settrimpathoffset3);
                try {
                    settrimpathend2.onWarmupCompleted(this.$activity, scrolltoitem2, scrolltoitem2.onExtraCallback(), settrimpathoffset3);
                } finally {
                }
            } else {
                NativeAdsManager nativeAdsManager7 = NativeAdsManager.this;
                setTrimPathOffset settrimpathoffset4 = this.$onShowAdCallBack;
                addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.AD_NOT_LOADED;
                int code3 = addonadapterchangelistener.getCode();
                String string = this.$activity.getString(addonadapterchangelistener.getMessageRes());
                Intrinsics.checkNotNullExpressionValue(string, "");
                if (nativeAdsDto == null || (strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub()) == null) {
                    NativeAdsDto nativeAdsDto4 = (NativeAdsDto) ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult())).get(this.$spaceUnitId);
                    strIAuthTabCallbackStub = nativeAdsDto4 != null ? nativeAdsDto4.IAuthTabCallbackStub() : null;
                } else {
                    strIAuthTabCallbackStub = strIAuthTabCallbackStub2;
                }
                NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager7, settrimpathoffset4, new NativeAdsError(code3, string, (String) null, strIAuthTabCallbackStub, 4, (DefaultConstructorMarker) null));
            }
            Unit unit2 = Unit.INSTANCE;
            int i15 = onNavigationEvent + 7;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 18 / 0;
            }
            return unit2;
        }
    }

    public static final class onActivityResized implements setTrimPathEnd.onExtraCallbackWithResult {
        private static int extraCallback = 0;
        private static int extraCallbackWithResult = 1;
        final /* synthetic */ NativeAdsDto IAuthTabCallback;
        final /* synthetic */ NativeAdsDto.Mediation IAuthTabCallbackDefault;
        final /* synthetic */ int IAuthTabCallbackStub;
        final /* synthetic */ int IAuthTabCallbackStubProxy;
        final /* synthetic */ String IAuthTabCallback_Parcel;
        final /* synthetic */ String access000;
        final /* synthetic */ List<String> access100;
        final /* synthetic */ String asBinder;
        final /* synthetic */ long asInterface;
        final /* synthetic */ deleteProfile getInterfaceDescriptor;
        final /* synthetic */ AppCompatActivity onExtraCallback;
        final /* synthetic */ Integer onExtraCallbackWithResult;
        final /* synthetic */ Ref.ObjectRef<setTrimPathEnd> onNavigationEvent;
        final /* synthetic */ setStrokeColor onTransact;
        final /* synthetic */ NativeAdsDto.AdmobInfo onWarmupCompleted;
        final /* synthetic */ boolean readTypedObject;

        public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ InterstitialAd $loadedAd$inlined;
            final /* synthetic */ setStrokeColor $onLoadAdsCallback$inlined;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(access13800 access13800Var, setStrokeColor setstrokecolor, InterstitialAd interstitialAd) {
                super(2, access13800Var);
                this.$onLoadAdsCallback$inlined = setstrokecolor;
                this.$loadedAd$inlined = interstitialAd;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(access13800Var, this.$onLoadAdsCallback$inlined, this.$loadedAd$inlined);
                int i2 = IAuthTabCallback + 77;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = IAuthTabCallback + 53;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    onextracallbackCreate.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
                int i4 = IAuthTabCallback + 23;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 1;
                    int i4 = i3 % 128;
                    IAuthTabCallback = i4;
                    int i5 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 121;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i7 = IAuthTabCallback + 107;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                try {
                    setStrokeColor setstrokecolor = this.$onLoadAdsCallback$inlined;
                    if (setstrokecolor != null) {
                        setstrokecolor.onExtraCallback(this.$loadedAd$inlined);
                    }
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            }
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ RewardedAd $loadedAd$inlined;
            final /* synthetic */ setStrokeColor $onLoadAdsCallback$inlined;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, setStrokeColor setstrokecolor, RewardedAd rewardedAd) {
                super(2, access13800Var);
                this.$onLoadAdsCallback$inlined = setstrokecolor;
                this.$loadedAd$inlined = rewardedAd;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var, this.$onLoadAdsCallback$inlined, this.$loadedAd$inlined);
                int i2 = onWarmupCompleted + 81;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 21;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 93;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 13;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallback + 11;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        int i6 = onExtraCallback + 35;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
                try {
                    setStrokeColor setstrokecolor = this.$onLoadAdsCallback$inlined;
                    if (setstrokecolor != null) {
                        setstrokecolor.IAuthTabCallback(this.$loadedAd$inlined);
                    }
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            }
        }

        onActivityResized(NativeAdsDto nativeAdsDto, String str, String str2, long j, NativeAdsDto.AdmobInfo admobInfo, Ref.ObjectRef<setTrimPathEnd> objectRef, setStrokeColor setstrokecolor, List<String> list, int i, NativeAdsDto.Mediation mediation, AppCompatActivity appCompatActivity, boolean z, Integer num, deleteProfile deleteprofile, int i2, String str3) {
            this.IAuthTabCallback = nativeAdsDto;
            this.IAuthTabCallback_Parcel = str;
            this.access000 = str2;
            this.asInterface = j;
            this.onWarmupCompleted = admobInfo;
            this.onNavigationEvent = objectRef;
            this.onTransact = setstrokecolor;
            this.access100 = list;
            this.IAuthTabCallbackStub = i;
            this.IAuthTabCallbackDefault = mediation;
            this.onExtraCallback = appCompatActivity;
            this.readTypedObject = z;
            this.onExtraCallbackWithResult = num;
            this.getInterfaceDescriptor = deleteprofile;
            this.IAuthTabCallbackStubProxy = i2;
            this.asBinder = str3;
        }

        @Override // o.setTrimPathEnd.onExtraCallbackWithResult
        public void onExtraCallbackWithResult(AdError adError) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(adError, "");
            setTrimPathEnd settrimpathend = (setTrimPathEnd) NativeAdsManager.access100(NativeAdsManager.this).remove(this.IAuthTabCallback.IAuthTabCallbackStub());
            if (settrimpathend != null) {
                int i2 = extraCallback + 47;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                settrimpathend.onNavigationEvent();
            }
            NativeAdsManager.IAuthTabCallback(NativeAdsManager.this, this.access100, this.IAuthTabCallbackStub + 1, this.IAuthTabCallback, this.IAuthTabCallbackDefault, this.onExtraCallback, this.readTypedObject, this.onExtraCallbackWithResult, this.getInterfaceDescriptor, this.onTransact, this.IAuthTabCallback_Parcel, this.asInterface, this.IAuthTabCallbackStubProxy, this.asBinder, this.access000, adError.getMessage(), adError);
            int i4 = extraCallback + 47;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.setTrimPathEnd.onExtraCallbackWithResult
        public void onExtraCallback(RewardedAd rewardedAd) {
            setTrimPathEnd settrimpathend;
            setTrimPathEnd settrimpathend2;
            int i = 2 % 2;
            int i2 = extraCallback + 95;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            setTrimPathEnd settrimpathend3 = (setTrimPathEnd) NativeAdsManager.access100(NativeAdsManager.this).remove(this.IAuthTabCallback.IAuthTabCallbackStub());
            NativeAdsManager.onNavigationEvent(NativeAdsManager.this, this.IAuthTabCallback_Parcel, this.IAuthTabCallback, "ADMOB", ExposureContent.Companion.IAuthTabCallback(rewardedAd), this.access000, null, 32, null);
            if (!NativeAdsManager.onExtraCallback(NativeAdsManager.this, this.IAuthTabCallback_Parcel, this.asInterface)) {
                if (settrimpathend3 != null) {
                    settrimpathend3.onNavigationEvent();
                    return;
                }
                return;
            }
            ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 928257279, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -928257239, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult())).put(this.IAuthTabCallback_Parcel, new scrollToItem.onWarmupCompleted(rewardedAd, this.IAuthTabCallback.onTransact().onExtraCallback(), this.onWarmupCompleted, this.IAuthTabCallback_Parcel));
            Map mapAsInterface = NativeAdsManager.asInterface(NativeAdsManager.this);
            String str = this.IAuthTabCallback_Parcel;
            Object obj = this.onNavigationEvent.element;
            if (obj == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = extraCallbackWithResult + 25;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                settrimpathend = null;
            } else {
                settrimpathend = (setTrimPathEnd) obj;
            }
            setTrimPathEnd settrimpathend4 = (setTrimPathEnd) mapAsInterface.put(str, settrimpathend);
            if (settrimpathend4 != null) {
                Object obj2 = this.onNavigationEvent.element;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    settrimpathend2 = null;
                } else {
                    settrimpathend2 = (setTrimPathEnd) obj2;
                }
                if (settrimpathend4 == settrimpathend2) {
                    settrimpathend4 = null;
                }
                if (settrimpathend4 != null) {
                    int i6 = extraCallback + 111;
                    extraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    settrimpathend4.onNavigationEvent();
                    int i8 = extraCallback + 111;
                    extraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            maybeUpdateAnimatable.onNavigationEvent(NativeAdsManager.getInterfaceDescriptor(NativeAdsManager.this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onNavigationEvent(null, this.onTransact, rewardedAd), 2, (Object) null);
            int i10 = extraCallbackWithResult + 1;
            extraCallback = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // o.setTrimPathEnd.onExtraCallbackWithResult
        public void onWarmupCompleted(InterstitialAd interstitialAd) {
            setTrimPathEnd settrimpathend;
            setTrimPathEnd settrimpathend2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            setTrimPathEnd settrimpathend3 = (setTrimPathEnd) NativeAdsManager.access100(NativeAdsManager.this).remove(this.IAuthTabCallback.IAuthTabCallbackStub());
            NativeAdsManager.onNavigationEvent(NativeAdsManager.this, this.IAuthTabCallback_Parcel, this.IAuthTabCallback, "ADMOB", ExposureContent.Companion.IAuthTabCallback(interstitialAd), this.access000, null, 32, null);
            if (!NativeAdsManager.onExtraCallback(NativeAdsManager.this, this.IAuthTabCallback_Parcel, this.asInterface)) {
                if (settrimpathend3 != null) {
                    settrimpathend3.onNavigationEvent();
                    return;
                }
                return;
            }
            Map map = (Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 928257279, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -928257239, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult());
            String str = this.IAuthTabCallback_Parcel;
            map.put(str, new scrollToItem.onExtraCallbackWithResult(interstitialAd, this.onWarmupCompleted, str));
            Map mapAsInterface = NativeAdsManager.asInterface(NativeAdsManager.this);
            String str2 = this.IAuthTabCallback_Parcel;
            Object obj = this.onNavigationEvent.element;
            if (obj == null) {
                int i2 = extraCallback + 93;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                settrimpathend = null;
            } else {
                settrimpathend = (setTrimPathEnd) obj;
            }
            setTrimPathEnd settrimpathend4 = (setTrimPathEnd) mapAsInterface.put(str2, settrimpathend);
            if (settrimpathend4 != null) {
                Object obj2 = this.onNavigationEvent.element;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    settrimpathend2 = null;
                } else {
                    settrimpathend2 = (setTrimPathEnd) obj2;
                }
                if (settrimpathend4 != settrimpathend2) {
                    int i4 = extraCallbackWithResult + 1;
                    extraCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    settrimpathend4 = null;
                }
                if (settrimpathend4 != null) {
                    int i6 = extraCallbackWithResult + 71;
                    extraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    settrimpathend4.onNavigationEvent();
                }
            }
            maybeUpdateAnimatable.onNavigationEvent(NativeAdsManager.getInterfaceDescriptor(NativeAdsManager.this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onExtraCallback(null, this.onTransact, interstitialAd), 2, (Object) null);
        }
    }

    static final class requestPostMessageChannel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $adRequestOption;
        final /* synthetic */ Integer $admobPreloadBufferSize;
        final /* synthetic */ String $forcedPlayableUrlOverride;
        final /* synthetic */ setStrokeColor $onLoadAdCallback;
        final /* synthetic */ deleteProfile $preferredUiMode;
        final /* synthetic */ String $spaceUnitId;
        final /* synthetic */ int $testIndexOverride;
        final /* synthetic */ boolean $useAdmobPreloaderFallback;
        long J$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        requestPostMessageChannel(int i, String str, String str2, setStrokeColor setstrokecolor, AppCompatActivity appCompatActivity, boolean z, Integer num, deleteProfile deleteprofile, GetNativeAdsRequestBody.AdRequestOption adRequestOption, access13800<? super requestPostMessageChannel> access13800Var) {
            super(2, access13800Var);
            this.$testIndexOverride = i;
            this.$forcedPlayableUrlOverride = str;
            this.$spaceUnitId = str2;
            this.$onLoadAdCallback = setstrokecolor;
            this.$activity = appCompatActivity;
            this.$useAdmobPreloaderFallback = z;
            this.$admobPreloadBufferSize = num;
            this.$preferredUiMode = deleteprofile;
            this.$adRequestOption = adRequestOption;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            requestPostMessageChannel requestpostmessagechannel = NativeAdsManager.this.new requestPostMessageChannel(this.$testIndexOverride, this.$forcedPlayableUrlOverride, this.$spaceUnitId, this.$onLoadAdCallback, this.$activity, this.$useAdmobPreloaderFallback, this.$admobPreloadBufferSize, this.$preferredUiMode, this.$adRequestOption, access13800Var);
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return requestpostmessagechannel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ setStrokeColor $onLoadAdCallback$inlined;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(access13800 access13800Var, setStrokeColor setstrokecolor) {
                super(2, access13800Var);
                this.$onLoadAdCallback$inlined = setstrokecolor;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 45 / 0;
                }
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.$onLoadAdCallback$inlined);
                int i2 = onWarmupCompleted + 29;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 117;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    IAuthTabCallback(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = onWarmupCompleted + 65;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 15;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                try {
                    setStrokeColor setstrokecolor = this.$onLoadAdCallback$inlined;
                    if (setstrokecolor != null) {
                        setstrokecolor.onExtraCallback(new NativeAdsError(addOnAdapterChangeListener.INTERNAL_ERROR.getCode(), "Failed to fetch ad", (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                        int i5 = onExtraCallback + 99;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                    }
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super NativeAdsDto>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $adRequestOption;
            final /* synthetic */ String $forcedPlayableUrlOverride;
            final /* synthetic */ int $testIndexOverride;
            final /* synthetic */ String $unitId;
            int I$0;
            int I$1;
            Object L$0;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(NativeAdsManager nativeAdsManager, String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, int i, String str2, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
                this.$unitId = str;
                this.$adRequestOption = adRequestOption;
                this.$testIndexOverride = i;
                this.$forcedPlayableUrlOverride = str2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$unitId, this.$adRequestOption, this.$testIndexOverride, this.$forcedPlayableUrlOverride, access13800Var);
                int i2 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 / 0;
                }
                return onextracallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super NativeAdsDto> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                try {
                    if (i2 != 0) {
                        int i3 = IAuthTabCallback + 95;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        NativeAdsManager nativeAdsManager = this.this$0;
                        String str = this.$unitId;
                        GetNativeAdsRequestBody.AdRequestOption adRequestOption = this.$adRequestOption;
                        int i5 = this.$testIndexOverride;
                        String str2 = this.$forcedPlayableUrlOverride;
                        Result.Companion companion = Result.Companion;
                        getPackageType getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(nativeAdsManager);
                        if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                            int i6 = IAuthTabCallback + 35;
                            onExtraCallbackWithResult = i6 % 128;
                            if (i6 % 2 == 0) {
                                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 0, (Object) null);
                            } else {
                                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
                            }
                            int i7 = onExtraCallbackWithResult + 65;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 3 / 3;
                            }
                        }
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        obj = NativeAdsManager.onWarmupCompleted(nativeAdsManager, str, adRequestOption, i5, str2, this);
                        if (obj == objOnWarmupCompleted) {
                            int i9 = onExtraCallbackWithResult + 41;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return objOnWarmupCompleted;
                        }
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
                if (Result.exceptionOrNull-impl(obj2) != null) {
                    return null;
                }
                int i11 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                return obj2;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Object objOnExtraCallback;
            String str2;
            long j;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if ((!NativeAdsManager.this.onExtraCallback()) && this.$testIndexOverride < 0 && StringsKt.isBlank(this.$forcedPlayableUrlOverride)) {
                    int i3 = IAuthTabCallback + 73;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    int i5 = i3 % 2;
                    str = this.$spaceUnitId;
                    int i6 = i4 + 27;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    str = "ui_test_11";
                }
                setStrokeColor setstrokecolor = this.$onLoadAdCallback;
                if (setstrokecolor != null) {
                    NativeAdsManager.onExtraCallbackWithResult(NativeAdsManager.this, str, setstrokecolor);
                }
                long jOnNavigationEvent = NativeAdsManager.onNavigationEvent(NativeAdsManager.this, str);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallback onextracallback = new onExtraCallback(NativeAdsManager.this, str, this.$adRequestOption, this.$testIndexOverride, this.$forcedPlayableUrlOverride, null);
                this.L$0 = str;
                this.J$0 = jOnNavigationEvent;
                this.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                str2 = str;
                j = jOnNavigationEvent;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onExtraCallback + 1;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                j = this.J$0;
                String str3 = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
                str2 = str3;
                objOnExtraCallback = obj;
            }
            NativeAdsDto nativeAdsDto = (NativeAdsDto) objOnExtraCallback;
            if (nativeAdsDto == null) {
                maybeUpdateAnimatable.onNavigationEvent(NativeAdsManager.getInterfaceDescriptor(NativeAdsManager.this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onWarmupCompleted(null, this.$onLoadAdCallback), 2, (Object) null);
                return Unit.INSTANCE;
            }
            if (NativeAdsManager.onExtraCallback(NativeAdsManager.this, str2, j)) {
                int i10 = onExtraCallback + 101;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                NativeAdsManager.IAuthTabCallback(NativeAdsManager.this, str2, nativeAdsDto, false, 4, (Object) null);
            }
            NativeAdsManager nativeAdsManager = NativeAdsManager.this;
            List<String> listIAuthTabCallbackDefault = nativeAdsDto.onTransact().onNavigationEvent().IAuthTabCallbackDefault();
            if (listIAuthTabCallbackDefault.isEmpty()) {
                listIAuthTabCallbackDefault = CollectionsKt.listOf("TOSS");
            }
            NativeAdsManager.onExtraCallback(nativeAdsManager, listIAuthTabCallbackDefault, 0, nativeAdsDto, nativeAdsDto.onTransact().onNavigationEvent(), this.$activity, this.$useAdmobPreloaderFallback, this.$admobPreloadBufferSize, this.$preferredUiMode, this.$onLoadAdCallback, str2, j, this.$testIndexOverride, this.$forcedPlayableUrlOverride, null, null, null, 57344, null);
            return Unit.INSTANCE;
        }
    }

    public static final class ICustomTabsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsDto $cachedTossAd$inlined;
        final /* synthetic */ setStrokeColor $callback$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallback(access13800 access13800Var, setStrokeColor setstrokecolor, NativeAdsDto nativeAdsDto) {
            super(2, access13800Var);
            this.$callback$inlined = setstrokecolor;
            this.$cachedTossAd$inlined = nativeAdsDto;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(access13800Var, this.$callback$inlined, this.$cachedTossAd$inlined);
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iCustomTabsCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 48 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
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
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 49;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            try {
                this.$callback$inlined.onNavigationEvent(this.$cachedTossAd$inlined);
                int i6 = onExtraCallback + 119;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class ICustomTabsServiceStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdsDto $ad$inlined;
        final /* synthetic */ setTrimPathOffset $showCallback$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsServiceStub(access13800 access13800Var, setTrimPathOffset settrimpathoffset, NativeAdsDto nativeAdsDto) {
            super(2, access13800Var);
            this.$showCallback$inlined = settrimpathoffset;
            this.$ad$inlined = nativeAdsDto;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsServiceStub iCustomTabsServiceStub = new ICustomTabsServiceStub(access13800Var, this.$showCallback$inlined, this.$ad$inlined);
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return iCustomTabsServiceStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 97 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 45;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 73;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 37;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            try {
                this.$showCallback$inlined.onExtraCallbackWithResult(this.$ad$inlined);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i9 = IAuthTabCallback + 97;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public static final class extraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function1 $action$inlined;
        final /* synthetic */ setTrimPathOffset $callback$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCallback(access13800 access13800Var, Function1 function1, setTrimPathOffset settrimpathoffset) {
            super(2, access13800Var);
            this.$action$inlined = function1;
            this.$callback$inlined = settrimpathoffset;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallback extracallback = new extraCallback(access13800Var, this.$action$inlined, this.$callback$inlined);
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return extracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            extraCallback extracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return extracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            extracallbackCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            try {
                this.$action$inlined.invoke(this.$callback$inlined);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ NativeAdsDto $ad$inlined;
        final /* synthetic */ AdError $adError$inlined;
        final /* synthetic */ setStrokeColor $onLoadAdsCallback$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCallbackWithResult(access13800 access13800Var, setStrokeColor setstrokecolor, AdError adError, NativeAdsDto nativeAdsDto) {
            super(2, access13800Var);
            this.$onLoadAdsCallback$inlined = setstrokecolor;
            this.$adError$inlined = adError;
            this.$ad$inlined = nativeAdsDto;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallbackWithResult extracallbackwithresult = new extraCallbackWithResult(access13800Var, this.$onLoadAdsCallback$inlined, this.$adError$inlined, this.$ad$inlined);
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return extracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = 49 / 0;
            } else {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 57;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 81;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            try {
                setStrokeColor setstrokecolor = this.$onLoadAdsCallback$inlined;
                if (setstrokecolor != null) {
                    AdError adError = this.$adError$inlined;
                    if (adError == null) {
                        adError = new AdError(999, "Forced Fail", "Test");
                    }
                    setstrokecolor.onNavigationEvent(adError, this.$ad$inlined);
                    int i7 = IAuthTabCallback + 75;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onActivityLayout extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ NativeAdsDto $ad$inlined;
        final /* synthetic */ setStrokeColor $onLoadAdsCallback$inlined;
        final /* synthetic */ String $tossResult$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onActivityLayout(access13800 access13800Var, setStrokeColor setstrokecolor, String str, NativeAdsDto nativeAdsDto) {
            super(2, access13800Var);
            this.$onLoadAdsCallback$inlined = setstrokecolor;
            this.$tossResult$inlined = str;
            this.$ad$inlined = nativeAdsDto;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityLayout onactivitylayout = new onActivityLayout(access13800Var, this.$onLoadAdsCallback$inlined, this.$tossResult$inlined, this.$ad$inlined);
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onactivitylayout;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 95;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 35;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            try {
                setStrokeColor setstrokecolor = this.$onLoadAdsCallback$inlined;
                if (setstrokecolor != null) {
                    int code = addOnAdapterChangeListener.INTERNAL_ERROR.getCode();
                    String str = this.$tossResult$inlined;
                    if (str == null) {
                        int i6 = IAuthTabCallback + 1;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        str = "Forced Fail";
                    }
                    setstrokecolor.onExtraCallback(new NativeAdsError(code, str, (String) null, this.$ad$inlined.IAuthTabCallbackStub(), 4, (DefaultConstructorMarker) null));
                }
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onNavigationEvent + 81;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    public static final class onPostMessage extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ setStrokeColor $callback$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onPostMessage(access13800 access13800Var, setStrokeColor setstrokecolor) {
            super(2, access13800Var);
            this.$callback$inlined = setstrokecolor;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onPostMessage onpostmessage = new onPostMessage(access13800Var, this.$callback$inlined);
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onpostmessage;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i5 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            try {
                this.$callback$inlined.onExtraCallback(new NativeAdsError(addOnAdapterChangeListener.INTERNAL_ERROR.getCode(), "Ad load interrupted", (String) null, (String) null, 12, (DefaultConstructorMarker) null));
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ scrollToItem $cachedAdmob$inlined;
        final /* synthetic */ setStrokeColor $callback$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public readTypedObject(access13800 access13800Var, scrollToItem scrolltoitem, setStrokeColor setstrokecolor) {
            super(2, access13800Var);
            this.$cachedAdmob$inlined = scrolltoitem;
            this.$callback$inlined = setstrokecolor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = new readTypedObject(access13800Var, this.$cachedAdmob$inlined, this.$callback$inlined);
            int i2 = onExtraCallback + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return readtypedobject;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 64 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 37;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 95;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i6 = 54 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i7 = onNavigationEvent + 99;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            try {
                scrollToItem scrolltoitem = this.$cachedAdmob$inlined;
                if (scrolltoitem instanceof scrollToItem.onExtraCallbackWithResult) {
                    int i9 = onExtraCallback + 87;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        this.$callback$inlined.onExtraCallback(((scrollToItem.onExtraCallbackWithResult) scrolltoitem).onExtraCallbackWithResult());
                        int i10 = 0 / 0;
                    } else {
                        this.$callback$inlined.onExtraCallback(((scrollToItem.onExtraCallbackWithResult) scrolltoitem).onExtraCallbackWithResult());
                    }
                } else {
                    if (!(scrolltoitem instanceof scrollToItem.onWarmupCompleted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$callback$inlined.IAuthTabCallback(((scrollToItem.onWarmupCompleted) scrolltoitem).onExtraCallbackWithResult());
                    int i11 = onNavigationEvent + 121;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class requestPostMessageChannelWithExtras extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ NativeAdsDto $ad$inlined;
        final /* synthetic */ setStrokeColor $onLoadAdCallback$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public requestPostMessageChannelWithExtras(access13800 access13800Var, setStrokeColor setstrokecolor, NativeAdsDto nativeAdsDto) {
            super(2, access13800Var);
            this.$onLoadAdCallback$inlined = setstrokecolor;
            this.$ad$inlined = nativeAdsDto;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            requestPostMessageChannelWithExtras requestpostmessagechannelwithextras = new requestPostMessageChannelWithExtras(access13800Var, this.$onLoadAdCallback$inlined, this.$ad$inlined);
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return requestpostmessagechannelwithextras;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            requestPostMessageChannelWithExtras requestpostmessagechannelwithextrasCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                requestpostmessagechannelwithextrasCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = requestpostmessagechannelwithextrasCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            try {
                setStrokeColor setstrokecolor = this.$onLoadAdCallback$inlined;
                if (setstrokecolor != null) {
                    setstrokecolor.onNavigationEvent(this.$ad$inlined);
                    int i5 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ setTrimPathOffset $callback$inlined;
        final /* synthetic */ NativeAdsError $error$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public writeTypedObject(access13800 access13800Var, setTrimPathOffset settrimpathoffset, NativeAdsError nativeAdsError) {
            super(2, access13800Var);
            this.$callback$inlined = settrimpathoffset;
            this.$error$inlined = nativeAdsError;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = new writeTypedObject(access13800Var, this.$callback$inlined, this.$error$inlined);
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
            }
            return writetypedobject;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
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
                this.label = 1;
                if (b10.IAuthTabCallback(this) == objOnWarmupCompleted) {
                    int i4 = onNavigationEvent + 87;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onExtraCallback + 95;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            try {
                this.$callback$inlined.onExtraCallback(this.$error$inlined);
            } catch (Throwable unused) {
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onNavigationEvent + 15;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 10 / 0;
            }
            return unit;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        setTrimPathOffset settrimpathoffset;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String strExtraCallbackWithResult = nativeAdsManager.extraCallbackWithResult((String) objArr[1]);
        if (strExtraCallbackWithResult == null) {
            return null;
        }
        synchronized (nativeAdsManager) {
            settrimpathoffset = nativeAdsManager.ICustomTabsService.get(strExtraCallbackWithResult);
            if (settrimpathoffset == null) {
                settrimpathoffset = nativeAdsManager.setEngagementSignalsCallback.get(strExtraCallbackWithResult);
            }
        }
        return settrimpathoffset;
    }

    private final void onWarmupCompleted(String str, setStrokeColor setstrokecolor) {
        synchronized (this) {
            this.mayLaunchUrl.put(str, setstrokecolor);
            Unit unit = Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        setTrimPathOffset settrimpathoffset = (setTrimPathOffset) objArr[2];
        synchronized (nativeAdsManager) {
            nativeAdsManager.ICustomTabsService.put(str, settrimpathoffset);
            Unit unit = Unit.INSTANCE;
        }
        return null;
    }

    private final void IAuthTabCallback(String str, String str2, Set<String> set, setStrokeColor setstrokecolor, String str3) {
        synchronized (this) {
            access100 access100Var = new access100(str2, set, str3, this.extraCallback.IAuthTabCallback(), null, this.extraCallback.onWarmupCompleted(), 16, null);
            this.extraCallback = access100Var;
            this.access200.put(str, access100Var);
            if (setstrokecolor != null) {
                this.newAuthTabSession.put(str, setstrokecolor);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(List<String> list, String str, Set<String> set, addNewItem addnewitem, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) {
        synchronized (this) {
            this.extraCallback = new access100(str, set, null, addnewitem, null, viewPager2LinearLayoutManagerImpl, 16, null);
            Iterator<T> it = this.access200.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.setValue(access100.onExtraCallbackWithResult((access100) entry.getValue(), null, null, null, addnewitem, null, viewPager2LinearLayoutManagerImpl, 19, null));
            }
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                this.access200.put((String) it2.next(), new access100(str, set, null, addnewitem, null, viewPager2LinearLayoutManagerImpl, 16, null));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final String ICustomTabsService(String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = ICustomTabsCallbackStubProxy(str).onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            return str;
        }
        int i4 = IPostMessageServiceStubProxy + 27;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    private final access100 ICustomTabsCallbackStubProxy(String str) {
        access100 access100Var;
        synchronized (this) {
            access100Var = this.access200.get(str);
            if (access100Var == null) {
                access100Var = this.extraCallback;
            }
        }
        return access100Var;
    }

    private final boolean onExtraCallback(String str, setStrokeColor setstrokecolor) {
        boolean z;
        synchronized (this) {
            IAuthTabCallback iAuthTabCallback = this.onTransact.get(str);
            int i = iAuthTabCallback == null ? -1 : IAuthTabCallback_Parcel.IAuthTabCallback[iAuthTabCallback.ordinal()];
            z = true;
            if (i != -1) {
                if (i == 1) {
                    Map<String, List<setStrokeColor>> map = this.IAuthTabCallback;
                    List<setStrokeColor> arrayList = map.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map.put(str, arrayList);
                    }
                    arrayList.add(setstrokecolor);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!IAuthTabCallback(str, setstrokecolor)) {
                        this.onTransact.remove(str);
                        this.IAuthTabCallback.put(str, CollectionsKt.mutableListOf(new setStrokeColor[]{setstrokecolor}));
                        this.onTransact.put(str, IAuthTabCallback.LOADING);
                    }
                }
                z = false;
            } else {
                this.IAuthTabCallback.put(str, CollectionsKt.mutableListOf(new setStrokeColor[]{setstrokecolor}));
                this.onTransact.put(str, IAuthTabCallback.LOADING);
            }
        }
        return z;
    }

    private final List<setStrokeColor> onExtraCallbackWithResult(String str, boolean z) {
        List<setStrokeColor> listRemove;
        synchronized (this) {
            if (z) {
                this.onTransact.put(str, IAuthTabCallback.LOADED);
            } else {
                this.onTransact.remove(str);
            }
            listRemove = this.IAuthTabCallback.remove(str);
            if (listRemove == null) {
                listRemove = CollectionsKt.emptyList();
            }
        }
        return listRemove;
    }

    private final void extraCallback(String str) {
        List<setStrokeColor> listEmptyList;
        synchronized (this) {
            if (this.onTransact.get(str) == IAuthTabCallback.LOADING) {
                this.onTransact.remove(str);
                listEmptyList = this.IAuthTabCallback.remove(str);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor(this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onPostMessage(null, (setStrokeColor) it.next()), 2, (Object) null);
        }
    }

    public static final class access000 implements setStrokeColor {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String onExtraCallbackWithResult;

        access000(String str) {
            this.onExtraCallbackWithResult = str;
        }

        @Override // o.setStrokeColor
        public void onNavigationEvent(NativeAdsDto nativeAdsDto) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            } else {
                Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            }
            Iterator it = NativeAdsManager.onWarmupCompleted(NativeAdsManager.this, this.onExtraCallbackWithResult, true).iterator();
            while (it.hasNext()) {
                ((setStrokeColor) it.next()).onNavigationEvent(nativeAdsDto);
                int i3 = onWarmupCompleted + 73;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        @Override // o.setStrokeColor
        public void onExtraCallback(InterstitialAd interstitialAd) {
            NativeAdsManager nativeAdsManager;
            String str;
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(interstitialAd, "");
                nativeAdsManager = NativeAdsManager.this;
                str = this.onExtraCallbackWithResult;
                z = false;
            } else {
                Intrinsics.checkNotNullParameter(interstitialAd, "");
                nativeAdsManager = NativeAdsManager.this;
                str = this.onExtraCallbackWithResult;
                z = true;
            }
            Iterator it = NativeAdsManager.onWarmupCompleted(nativeAdsManager, str, z).iterator();
            while (it.hasNext()) {
                int i3 = onWarmupCompleted + 9;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    ((setStrokeColor) it.next()).onExtraCallback(interstitialAd);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ((setStrokeColor) it.next()).onExtraCallback(interstitialAd);
            }
        }

        @Override // o.setStrokeColor
        public void IAuthTabCallback(RewardedAd rewardedAd) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            Iterator it = NativeAdsManager.onWarmupCompleted(NativeAdsManager.this, this.onExtraCallbackWithResult, true).iterator();
            int i4 = onExtraCallback + 89;
            onWarmupCompleted = i4 % 128;
            while (true) {
                int i5 = i4 % 2;
                if (!it.hasNext()) {
                    return;
                }
                int i6 = onExtraCallback + 55;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    ((setStrokeColor) it.next()).IAuthTabCallback(rewardedAd);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ((setStrokeColor) it.next()).IAuthTabCallback(rewardedAd);
                i4 = onWarmupCompleted + 91;
                onExtraCallback = i4 % 128;
            }
        }

        @Override // o.setStrokeColor
        public void IAuthTabCallback(String str) {
            List list;
            Intrinsics.checkNotNullParameter(str, "");
            NativeAdsManager nativeAdsManager = NativeAdsManager.this;
            String str2 = this.onExtraCallbackWithResult;
            synchronized (nativeAdsManager) {
                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                List listEmptyList = (List) ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1272569684, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1272569650, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult)).get(str2);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                list = CollectionsKt.toList(listEmptyList);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((setStrokeColor) it.next()).IAuthTabCallback(str);
            }
        }

        @Override // o.setStrokeColor
        public void onNavigationEvent(AdError adError, NativeAdsDto nativeAdsDto) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(adError, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Iterator it = NativeAdsManager.onWarmupCompleted(NativeAdsManager.this, this.onExtraCallbackWithResult, false).iterator();
            while (it.hasNext()) {
                int i2 = onWarmupCompleted + 97;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    ((setStrokeColor) it.next()).onNavigationEvent(adError, nativeAdsDto);
                    int i3 = 75 / 0;
                } else {
                    ((setStrokeColor) it.next()).onNavigationEvent(adError, nativeAdsDto);
                }
            }
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.setStrokeColor
        public void onExtraCallback(NativeAdsError nativeAdsError) {
            List listOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAdsError, "");
                listOnWarmupCompleted = NativeAdsManager.onWarmupCompleted(NativeAdsManager.this, this.onExtraCallbackWithResult, true);
            } else {
                Intrinsics.checkNotNullParameter(nativeAdsError, "");
                listOnWarmupCompleted = NativeAdsManager.onWarmupCompleted(NativeAdsManager.this, this.onExtraCallbackWithResult, false);
            }
            Iterator it = listOnWarmupCompleted.iterator();
            int i3 = onWarmupCompleted + 17;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                ((setStrokeColor) it.next()).onExtraCallback(nativeAdsError);
            }
        }
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) {
        int i = 2 % 2;
        access000 access000Var = ((NativeAdsManager) objArr[0]).new access000((String) objArr[1]);
        int i2 = IPostMessageServiceStubProxy + 101;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return access000Var;
    }

    public static final class getInterfaceDescriptor implements setTrimPathOffset {
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent;
        final /* synthetic */ NativeAdsManager IAuthTabCallback;
        private final /* synthetic */ setTrimPathOffset onExtraCallback;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ setTrimPathOffset onWarmupCompleted;

        @Override // o.setTrimPathOffset
        public void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.onExtraCallback();
                int i3 = 34 / 0;
            } else {
                this.onExtraCallback.onExtraCallback();
            }
            int i4 = onNavigationEvent + 89;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.setTrimPathOffset
        public void onExtraCallback(NativeAdsError nativeAdsError) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsError, "");
            this.onExtraCallback.onExtraCallback(nativeAdsError);
            int i4 = IAuthTabCallbackDefault + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.setTrimPathOffset
        public void onExtraCallbackWithResult(NativeAdsDto.Reward reward) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(reward, "");
            this.onExtraCallback.onExtraCallbackWithResult(reward);
            int i4 = onNavigationEvent + 19;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.setTrimPathOffset
        public void onExtraCallbackWithResult(NativeAdsDto nativeAdsDto) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            if (i3 == 0) {
                this.onExtraCallback.onExtraCallbackWithResult(nativeAdsDto);
                int i4 = 36 / 0;
            } else {
                this.onExtraCallback.onExtraCallbackWithResult(nativeAdsDto);
            }
            int i5 = IAuthTabCallbackDefault + 85;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.setTrimPathOffset
        public void onExtraCallbackWithResult(scrollToItem.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.onExtraCallback.onExtraCallbackWithResult(onwarmupcompleted);
            int i4 = onNavigationEvent + 115;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.setTrimPathOffset
        public void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback.onNavigationEvent();
                throw null;
            }
            this.onExtraCallback.onNavigationEvent();
            int i3 = IAuthTabCallbackDefault + 19;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.setTrimPathOffset
        public void onNavigationEvent(InterstitialAd interstitialAd) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            this.onExtraCallback.onNavigationEvent(interstitialAd);
            int i4 = onNavigationEvent + 5;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.setTrimPathOffset
        public void onNavigationEvent(NativeAdsDto nativeAdsDto) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.onNavigationEvent(nativeAdsDto);
            int i4 = onNavigationEvent + 119;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
        }

        @Override // o.setTrimPathOffset
        public void onWarmupCompleted(RewardedAd rewardedAd) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            this.onExtraCallback.onWarmupCompleted(rewardedAd);
            int i4 = IAuthTabCallbackDefault + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        getInterfaceDescriptor(setTrimPathOffset settrimpathoffset, NativeAdsManager nativeAdsManager, String str) {
            this.onWarmupCompleted = settrimpathoffset;
            this.IAuthTabCallback = nativeAdsManager;
            this.onExtraCallbackWithResult = str;
            this.onExtraCallback = settrimpathoffset;
        }

        @Override // o.setTrimPathOffset
        public void onExtraCallback(InterstitialAd interstitialAd) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            NativeAdsManager.onExtraCallbackWithResult(this.IAuthTabCallback, this.onExtraCallbackWithResult);
            this.onWarmupCompleted.onExtraCallback(interstitialAd);
            int i4 = IAuthTabCallbackDefault + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.setTrimPathOffset
        public void IAuthTabCallback(RewardedAd rewardedAd) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            NativeAdsManager.onExtraCallbackWithResult(this.IAuthTabCallback, this.onExtraCallbackWithResult);
            this.onWarmupCompleted.IAuthTabCallback(rewardedAd);
            int i4 = onNavigationEvent + 107;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.setTrimPathOffset
        public void IAuthTabCallback(NativeAdsDto nativeAdsDto) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAdsDto, "");
                NativeAdsManager.onExtraCallbackWithResult(this.IAuthTabCallback, this.onExtraCallbackWithResult);
                this.onWarmupCompleted.IAuthTabCallback(nativeAdsDto);
            } else {
                Intrinsics.checkNotNullParameter(nativeAdsDto, "");
                NativeAdsManager.onExtraCallbackWithResult(this.IAuthTabCallback, this.onExtraCallbackWithResult);
                this.onWarmupCompleted.IAuthTabCallback(nativeAdsDto);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override // o.setTrimPathOffset
        public void onExtraCallbackWithResult(InterstitialAd interstitialAd, AdError adError) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            Intrinsics.checkNotNullParameter(adError, "");
            NativeAdsManager.onExtraCallbackWithResult(this.IAuthTabCallback, this.onExtraCallbackWithResult);
            this.onWarmupCompleted.onExtraCallbackWithResult(interstitialAd, adError);
            int i4 = IAuthTabCallbackDefault + 71;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.setTrimPathOffset
        public void onWarmupCompleted(RewardedAd rewardedAd, AdError adError) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            Intrinsics.checkNotNullParameter(adError, "");
            NativeAdsManager.onExtraCallbackWithResult(this.IAuthTabCallback, this.onExtraCallbackWithResult);
            this.onWarmupCompleted.onWarmupCompleted(rewardedAd, adError);
            int i4 = IAuthTabCallbackDefault + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final setTrimPathOffset onExtraCallbackWithResult(String str, setTrimPathOffset settrimpathoffset) {
        int i = 2 % 2;
        getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(settrimpathoffset, this, str);
        int i2 = IPostMessageService_Parcel + 71;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return getinterfacedescriptor;
    }

    private final void IAuthTabCallback_Parcel(String str) {
        synchronized (this) {
            this.ICustomTabsServiceStubProxy.add(str);
            if (this.onTransact.get(str) == IAuthTabCallback.LOADED) {
                this.onTransact.remove(str);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        synchronized (nativeAdsManager) {
            nativeAdsManager.ICustomTabsServiceStubProxy.remove(str);
        }
        return null;
    }

    private final boolean onMinimized(String str) {
        boolean zContains;
        synchronized (this) {
            zContains = this.ICustomTabsServiceStubProxy.contains(str);
        }
        return zContains;
    }

    private final boolean onActivityResized(String str) {
        boolean z;
        synchronized (this) {
            z = this.onTransact.get(str) == IAuthTabCallback.LOADING;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onRelationshipValidationResult(String str) {
        int i = 2 % 2;
        if (zzaj.onNavigationEvent().MediaMetadataCompat()) {
            if (this.onGreatestScrollPercentageIncreased < 0) {
                int i2 = IPostMessageService_Parcel + 11;
                IPostMessageServiceStubProxy = i2 % 128;
                int i3 = i2 % 2;
                if (!StringsKt.isBlank(this.onMessageChannelReady)) {
                    int i4 = IPostMessageService_Parcel + 5;
                    IPostMessageServiceStubProxy = i4 % 128;
                    int i5 = i4 % 2;
                    str = "ui_test_11";
                }
            }
        }
        int i6 = IPostMessageServiceStubProxy + 37;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void onExtraCallback(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 59;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            textFieldScrollKtExternalSyntheticLambda0.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = this.ICustomTabsCallback_Parcel;
        textFieldScrollKtExternalSyntheticLambda0 = weakReference != null ? weakReference.get() : null;
        if (textFieldScrollKtExternalSyntheticLambda0 != null) {
            int i3 = IPostMessageService_Parcel + 43;
            IPostMessageServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(textFieldScrollKtExternalSyntheticLambda0, textFieldScrollKtExternalSyntheticLambda0)) {
                textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
                this.requestPostMessageChannelWithExtras = new WeakReference<>(textFieldScrollKtExternalSyntheticLambda0);
            }
        }
        this.ICustomTabsCallback_Parcel = new WeakReference<>(textFieldScrollKtExternalSyntheticLambda0);
        ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, nSetPosition.onExtraCallbackWithResult())).onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0);
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(this);
        int i5 = IPostMessageService_Parcel + 121;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    public final void asBinder() throws NoWhenBranchMatchedException {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = this.ICustomTabsCallback_Parcel;
        Object obj = null;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = weakReference != null ? weakReference.get() : null;
        if (textFieldScrollKtExternalSyntheticLambda02 != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda02.getLifecycle()) != null) {
            int i2 = IPostMessageService_Parcel + 69;
            IPostMessageServiceStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                lifecycle.onExtraCallbackWithResult(this);
                obj.hashCode();
                throw null;
            }
            lifecycle.onExtraCallbackWithResult(this);
            int i3 = IPostMessageServiceStubProxy + 111;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference2 = this.requestPostMessageChannelWithExtras;
        if (weakReference2 != null) {
            textFieldScrollKtExternalSyntheticLambda0 = weakReference2.get();
            int i5 = IPostMessageService_Parcel + 57;
            IPostMessageServiceStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 4;
            }
        } else {
            textFieldScrollKtExternalSyntheticLambda0 = null;
        }
        if (textFieldScrollKtExternalSyntheticLambda0 != null) {
            this.ICustomTabsCallback_Parcel = new WeakReference<>(textFieldScrollKtExternalSyntheticLambda0);
            textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(this);
            ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, nSetPosition.onExtraCallbackWithResult())).onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0);
            this.requestPostMessageChannelWithExtras = null;
        }
    }

    static final class setEngagementSignalsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ NativeAdsDto $ad;
        final /* synthetic */ NativeAdsDto.Creative.PlayableAd $creative;
        final /* synthetic */ String $forcedPlayableUrlOverride;
        final /* synthetic */ int $testIndexOverride;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setEngagementSignalsCallback(String str, int i, NativeAdsDto.Creative.PlayableAd playableAd, NativeAdsDto nativeAdsDto, access13800<? super setEngagementSignalsCallback> access13800Var) {
            super(2, access13800Var);
            this.$forcedPlayableUrlOverride = str;
            this.$testIndexOverride = i;
            this.$creative = playableAd;
            this.$ad = nativeAdsDto;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            setEngagementSignalsCallback setengagementsignalscallback = NativeAdsManager.this.new setEngagementSignalsCallback(this.$forcedPlayableUrlOverride, this.$testIndexOverride, this.$creative, this.$ad, access13800Var);
            setengagementsignalscallback.L$0 = obj;
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return setengagementsignalscallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setEngagementSignalsCallback setengagementsignalscallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                setengagementsignalscallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = setengagementsignalscallbackCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(NativeAdsManager nativeAdsManager, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 13;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return onwarmupcompleted;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 25;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 99 / 0;
                }
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws IOException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 29;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) throws IOException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                InputStream inputStreamOpen = NativeAdsManager.asBinder(this.this$0).getAssets().open("playable-reward.html");
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
                try {
                    String text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                    int i4 = IAuthTabCallback + 107;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return text;
                } finally {
                }
            }
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(NativeAdsManager nativeAdsManager, String str, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
                this.$url = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, this.$url, access13800Var);
                int i2 = onExtraCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 46 / 0;
                }
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 55;
                onExtraCallbackWithResult = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super String> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    onExtraCallbackWithResult(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = onExtraCallbackWithResult + 55;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 41 / 0;
                }
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 113;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 68 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj2 = null;
                if (i2 != 0) {
                    int i3 = onExtraCallback + 115;
                    int i4 = i3 % 128;
                    onExtraCallbackWithResult = i4;
                    int i5 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 19;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i7 != 0) {
                        return obj;
                    }
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                setInternalPageChangeListener setinternalpagechangelistenerExtraCallback = NativeAdsManager.extraCallback(this.this$0);
                String str = this.$url;
                this.label = 1;
                Object objOnWarmupCompleted2 = setinternalpagechangelistenerExtraCallback.onWarmupCompleted(str, this);
                if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                    return objOnWarmupCompleted2;
                }
                int i8 = onExtraCallbackWithResult + 29;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                setInternalPageChangeListener setinternalpagechangelistenerExtraCallback = NativeAdsManager.extraCallback(this.this$0);
                String strOnExtraCallback = zzaj.onNavigationEvent().onExtraCallback();
                this.label = 1;
                Object objOnWarmupCompleted2 = setinternalpagechangelistenerExtraCallback.onWarmupCompleted(strOnExtraCallback, this);
                if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                int i6 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return objOnWarmupCompleted2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x014d, code lost:
        
            if (r2 == r9) goto L48;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            GeckoHubImp1 geckoHubImp1OnExtraCallback;
            GeckoHubImp1 geckoHubImp1;
            GeckoHubImp1 geckoHubImp1OnExtraCallback2;
            Object objIAuthTabCallback;
            String str2;
            Object objIAuthTabCallback2;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (NativeAdsManager.this.onExtraCallback()) {
                    geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onWarmupCompleted(NativeAdsManager.this, null), 2, (Object) null);
                } else {
                    if (!StringsKt.isBlank(this.$forcedPlayableUrlOverride)) {
                        int i3 = onExtraCallback + 49;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        str = this.$forcedPlayableUrlOverride;
                    } else if (this.$testIndexOverride >= 0) {
                        int i5 = onExtraCallback + 51;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            this.$creative.IAuthTabCallbackStubProxy().get(this.$testIndexOverride);
                            obj2.hashCode();
                            throw null;
                        }
                        str = this.$creative.IAuthTabCallbackStubProxy().get(this.$testIndexOverride);
                    } else {
                        str = (String) NativeAdsDto.Creative.PlayableAd.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this.$creative}, -994883355, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 994883356, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                    }
                    geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onNavigationEvent(NativeAdsManager.this, str, null), 2, (Object) null);
                }
                geckoHubImp1 = geckoHubImp1OnExtraCallback;
                geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onExtraCallbackWithResult(NativeAdsManager.this, null), 2, (Object) null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$2 = geckoHubImp1OnExtraCallback2;
                this.label = 1;
                objIAuthTabCallback = geckoHubImp1.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i6 = IAuthTabCallback;
            int i7 = i6 + 57;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0 ? i2 != 1 : i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 125;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                String str3 = (String) this.L$3;
                ResultKt.onNavigationEvent(obj);
                str2 = str3;
                objIAuthTabCallback2 = obj;
                String str4 = (String) objIAuthTabCallback2;
                File file = new File(NativeAdsManager.asBinder(NativeAdsManager.this).getFilesDir(), "ads_sdk/playablead/html");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, "playable_" + this.$ad.IAuthTabCallbackStub() + ".html");
                File file3 = new File(NativeAdsManager.asBinder(NativeAdsManager.this).getFilesDir(), "ads_sdk/mraid");
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                File file4 = new File(file3, "mraid_cache.js");
                FilesKt.writeText$default(file2, str2, (Charset) null, 2, (Object) null);
                FilesKt.writeText$default(file4, str4, (Charset) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
            geckoHubImp1OnExtraCallback2 = (GeckoHubImp1) this.L$2;
            GeckoHubImp1 geckoHubImp12 = (GeckoHubImp1) this.L$1;
            ResultKt.onNavigationEvent(obj);
            geckoHubImp1 = geckoHubImp12;
            objIAuthTabCallback = obj;
            str2 = (String) objIAuthTabCallback;
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
            this.L$2 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback2);
            this.L$3 = str2;
            this.label = 2;
            objIAuthTabCallback2 = geckoHubImp1OnExtraCallback2.IAuthTabCallback(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        prefetchWithMultipleUrls prefetchwithmultipleurls;
        NativeAdsDto.Creative.PlayableAd playableAd;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str = (String) objArr[3];
        prefetchWithMultipleUrls prefetchwithmultipleurls2 = (access13800) objArr[4];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 51;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
            if (prefetchwithmultipleurls2 instanceof prefetchWithMultipleUrls) {
                prefetchwithmultipleurls = prefetchwithmultipleurls2;
                int i4 = prefetchwithmultipleurls.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    prefetchwithmultipleurls.label = i4 - 2147483648;
                    int i5 = IPostMessageServiceStubProxy + 21;
                    IPostMessageService_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    prefetchwithmultipleurls = nativeAdsManager.new prefetchWithMultipleUrls(prefetchwithmultipleurls2);
                }
            }
        } else if (prefetchwithmultipleurls2 instanceof prefetchWithMultipleUrls) {
        }
        prefetchWithMultipleUrls prefetchwithmultipleurls3 = prefetchwithmultipleurls;
        Object obj = prefetchwithmultipleurls3.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = prefetchwithmultipleurls3.label;
        try {
            if (i7 != 0) {
                int i8 = IPostMessageService_Parcel + 125;
                IPostMessageServiceStubProxy = i8 % 128;
                if (i8 % 2 != 0 ? i7 != 1 : i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(nativeAdsDto.onExtraCallbackWithResult());
                if (adAsset == null) {
                    return Unit.INSTANCE;
                }
                NativeAdsDto.Creative creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
                if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.PlayableAd) {
                    playableAd = (NativeAdsDto.Creative.PlayableAd) creativeOnExtraCallbackWithResult;
                    int i9 = IPostMessageServiceStubProxy + 33;
                    IPostMessageService_Parcel = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    playableAd = null;
                }
                NativeAdsDto.Creative.PlayableAd playableAd2 = playableAd;
                if (playableAd2 == null) {
                    return Unit.INSTANCE;
                }
                int i11 = (nativeAdsManager.IEngagementSignalsCallbackStubProxy || iIntValue >= 0 || !StringsKt.isBlank(str)) ? 1 : 0;
                if (i11 == 0) {
                    if (!((alignTextProgressInsideProgress) onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1136607599, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onTextViewSizeChanged.onExtraCallbackWithResult, nativeAdsManager.IAuthTabCallback_Parcel}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1136607596)).isWifi()) {
                        Unit unit = Unit.INSTANCE;
                        int i12 = IPostMessageServiceStubProxy + 21;
                        IPostMessageService_Parcel = i12 % 128;
                        int i13 = i12 % 2;
                        return unit;
                    }
                }
                setEngagementSignalsCallback setengagementsignalscallback = nativeAdsManager.new setEngagementSignalsCallback(str, iIntValue, playableAd2, nativeAdsDto, null);
                prefetchwithmultipleurls3.L$0 = access15400.onNavigationEvent(nativeAdsDto);
                prefetchwithmultipleurls3.L$1 = access15400.onNavigationEvent(str);
                prefetchwithmultipleurls3.L$2 = access15400.onNavigationEvent(adAsset);
                prefetchwithmultipleurls3.L$3 = access15400.onNavigationEvent(playableAd2);
                prefetchwithmultipleurls3.I$0 = iIntValue;
                prefetchwithmultipleurls3.I$1 = i11;
                prefetchwithmultipleurls3.label = 1;
                if (findRes.onExtraCallbackWithResult(setengagementsignalscallback, prefetchwithmultipleurls3) == objOnWarmupCompleted) {
                    int i14 = IPostMessageService_Parcel + 125;
                    IPostMessageServiceStubProxy = i14 % 128;
                    int i15 = i14 % 2;
                    return objOnWarmupCompleted;
                }
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        NativeAdsDto nativeAdsDto = nativeAdsManager.asInterface.get(str);
        if (nativeAdsDto != null) {
            int i2 = IPostMessageService_Parcel + 59;
            IPostMessageServiceStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (!nativeAdsDto.onExtraCallbackWithResult().isEmpty()) {
                int i4 = IPostMessageServiceStubProxy + 45;
                IPostMessageService_Parcel = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        if (nativeAdsManager.onWarmupCompleted.get(str) == null) {
            return false;
        }
        int i6 = IPostMessageService_Parcel + 103;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsManager nativeAdsManager, AppCompatActivity appCompatActivity, String str, deleteProfile deleteprofile, String str2, Set set, setStrokeColor setstrokecolor, GetNativeAdsRequestBody.AdRequestOption adRequestOption, boolean z, Integer num, String str3, int i, Object obj) throws Throwable {
        Set setOnExtraCallback;
        GetNativeAdsRequestBody.AdRequestOption adRequestOption2;
        String str4;
        int i2 = 2 % 2;
        deleteProfile deleteprofile2 = (i & 4) != 0 ? deleteProfile.AUTO : deleteprofile;
        if ((i & 16) != 0) {
            int i3 = IPostMessageServiceStubProxy + 123;
            IPostMessageService_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback();
                throw null;
            }
            setOnExtraCallback = Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback();
        } else {
            setOnExtraCallback = set;
        }
        if ((i & 64) != 0) {
            int i4 = IPostMessageService_Parcel + 105;
            int i5 = i4 % 128;
            IPostMessageServiceStubProxy = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 75;
            IPostMessageService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            adRequestOption2 = null;
        } else {
            adRequestOption2 = adRequestOption;
        }
        boolean z2 = (i & 128) != 0 ? true : z;
        Integer num2 = (i & 256) != 0 ? null : num;
        if ((i & 512) != 0) {
            int i9 = IPostMessageService_Parcel + 53;
            IPostMessageServiceStubProxy = i9 % 128;
            int i10 = i9 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        nativeAdsManager.onNavigationEvent(appCompatActivity, str, deleteprofile2, str2, setOnExtraCallback, setstrokecolor, adRequestOption2, z2, num2, str4);
    }

    static final class newSession extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        newSession(access13800<? super newSession> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            newSession newsession = NativeAdsManager.this.new newSession(access13800Var);
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return newsession;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 62 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        
            if (r5 == null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        
            o.getPackageType.onWarmupCompleted.onWarmupCompleted(r5, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r2 = r2 + 125;
            im.toss.ads_sdk.NativeAdsManager.newSession.onNavigationEvent = r2 % 128;
            r2 = r2 % 2;
            kotlin.ResultKt.onNavigationEvent(r5);
            r5 = im.toss.ads_sdk.NativeAdsManager.IAuthTabCallbackStubProxy(r4.this$0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 85 / 0;
            }
        }
    }

    public final void onNavigationEvent(@NotNull AppCompatActivity appCompatActivity, @NotNull String str, @NotNull deleteProfile deleteprofile, @NotNull String str2, @NotNull Set<String> set, @NotNull setStrokeColor setstrokecolor, @Nullable GetNativeAdsRequestBody.AdRequestOption adRequestOption, boolean z, @Nullable Integer num, @Nullable String str3) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(setstrokecolor, "");
        String str4 = this.onMessageChannelReady;
        int i2 = this.onGreatestScrollPercentageIncreased;
        final String strOnRelationshipValidationResult = onRelationshipValidationResult(str);
        this.requestPostMessageChannel.put(str, deleteprofile);
        onExtraCallback((TextFieldScrollKtExternalSyntheticLambda0) appCompatActivity);
        IAuthTabCallback(str, str2, set, setstrokecolor, str3);
        onWarmupCompleted(str, setstrokecolor);
        if (onExtraCallback(strOnRelationshipValidationResult, setstrokecolor)) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            setStrokeColor setstrokecolor2 = (setStrokeColor) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1777679235, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1777679196, new Object[]{this, strOnRelationshipValidationResult}, iOnExtraCallbackWithResult);
            long jAccess100 = access100(str);
            getInterfaceDescriptor(str);
            this.access100.put(str, null);
            getPackageType getpackagetype = this.onUnminimized.get(str);
            if (getpackagetype != null) {
                int i3 = IPostMessageServiceStubProxy + 101;
                IPostMessageService_Parcel = i3 % 128;
                if (i3 % 2 != 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
                int i4 = IPostMessageService_Parcel + 27;
                IPostMessageServiceStubProxy = i4 % 128;
                int i5 = i4 % 2;
            }
            this.onUnminimized.put(str, (getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{this, new newSession(null)}, nSetPosition.onExtraCallbackWithResult()));
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult2)).onWarmupCompleted((TextFieldScrollKtExternalSyntheticLambda0) appCompatActivity);
            if (onExtraCallbackWithResult(str, adRequestOption, appCompatActivity, z, num, setstrokecolor2, i2, str4)) {
                return;
            }
            getPackageType getpackagetype2 = (getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{this, new prefetch(str, jAccess100, appCompatActivity, z, num, deleteprofile, setstrokecolor2, i2, str4, adRequestOption, null)}, nSetPosition.onExtraCallbackWithResult());
            if (getpackagetype2 != null) {
                getpackagetype2.onExtraCallback(new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 67;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        NativeAdsManager nativeAdsManager = this.f$0;
                        if (i8 != 0) {
                            return NativeAdsManager.onWarmupCompleted(nativeAdsManager, strOnRelationshipValidationResult, (Throwable) obj);
                        }
                        NativeAdsManager.onWarmupCompleted(nativeAdsManager, strOnRelationshipValidationResult, (Throwable) obj);
                        throw null;
                    }
                });
            }
        }
    }

    private static final Unit onNavigationEvent(NativeAdsManager nativeAdsManager, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (th != null) {
            int i4 = i3 + 61;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                nativeAdsManager.extraCallback(str);
                int i5 = 62 / 0;
            } else {
                nativeAdsManager.extraCallback(str);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IPostMessageService_Parcel + 93;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static /* synthetic */ void onExtraCallback(NativeAdsManager nativeAdsManager, List list, int i, NativeAdsDto nativeAdsDto, NativeAdsDto.Mediation mediation, AppCompatActivity appCompatActivity, boolean z, Integer num, deleteProfile deleteprofile, setStrokeColor setstrokecolor, String str, long j, int i2, String str2, String str3, String str4, AdError adError, int i3, Object obj) throws Throwable {
        String str5;
        AdError adError2;
        int i4 = 2 % 2;
        int i5 = (i3 & 2048) != 0 ? nativeAdsManager.onGreatestScrollPercentageIncreased : i2;
        String str6 = (i3 & 4096) != 0 ? nativeAdsManager.onMessageChannelReady : str2;
        Object obj2 = null;
        String str7 = (i3 & 8192) != 0 ? null : str3;
        if ((i3 & 16384) != 0) {
            int i6 = IPostMessageServiceStubProxy + 23;
            int i7 = i6 % 128;
            IPostMessageService_Parcel = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 119;
            IPostMessageServiceStubProxy = i9 % 128;
            int i10 = i9 % 2;
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i3 & 32768) != 0) {
            int i11 = IPostMessageService_Parcel + 13;
            IPostMessageServiceStubProxy = i11 % 128;
            if (i11 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            adError2 = null;
        } else {
            adError2 = adError;
        }
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 517095822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -517095780, new Object[]{nativeAdsManager, list, Integer.valueOf(i), nativeAdsDto, mediation, appCompatActivity, Boolean.valueOf(z), num, deleteprofile, setstrokecolor, str, Long.valueOf(j), Integer.valueOf(i5), str6, str7, str5, adError2}, nSetPosition.onExtraCallbackWithResult());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object postMessage(Object[] objArr) {
        AdMobFailedReason adMobFailedReason;
        setTrimPathEnd settrimpathend;
        setTrimPathEnd settrimpathend2;
        AdMobFailedReason adMobFailedReason2;
        String str;
        AdError adError;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        List list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[3];
        NativeAdsDto.Mediation mediation = (NativeAdsDto.Mediation) objArr[4];
        AppCompatActivity appCompatActivity = (AppCompatActivity) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        Integer num = (Integer) objArr[7];
        deleteProfile deleteprofile = (deleteProfile) objArr[8];
        setStrokeColor setstrokecolor = (setStrokeColor) objArr[9];
        String str2 = (String) objArr[10];
        long jLongValue = ((Number) objArr[11]).longValue();
        int iIntValue2 = ((Number) objArr[12]).intValue();
        String str3 = (String) objArr[13];
        String str4 = (String) objArr[14];
        String str5 = (String) objArr[15];
        AdError adError2 = (AdError) objArr[16];
        int i = 2 % 2;
        if (iIntValue >= list.size()) {
            int i2 = IPostMessageServiceStubProxy + 31;
            int i3 = i2 % 128;
            IPostMessageService_Parcel = i3;
            int i4 = i2 % 2;
            if (str5 != null) {
                int i5 = i3 + 101;
                IPostMessageServiceStubProxy = i5 % 128;
                int i6 = i5 % 2;
                adMobFailedReason2 = new AdMobFailedReason(str5, (List) null, (String) null, adError2 != null ? nativeAdsManager.onExtraCallbackWithResult(adError2) : null, 6, (DefaultConstructorMarker) null);
            } else {
                adMobFailedReason2 = null;
            }
            onNavigationEvent(nativeAdsManager, str2, nativeAdsDto, null, null, str4, adMobFailedReason2, 8, null);
            if (nativeAdsManager.onWarmupCompleted(str2, jLongValue)) {
                int i7 = IPostMessageService_Parcel + 121;
                IPostMessageServiceStubProxy = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 59 / 0;
                    if (Intrinsics.areEqual(CollectionsKt.lastOrNull(list), "ADMOB")) {
                        adError = adError2;
                        maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor(nativeAdsManager), putChannelInfo.onExtraCallback(), (setRandomHost) null, new extraCallbackWithResult(null, setstrokecolor, adError, nativeAdsDto), 2, (Object) null);
                        str = str4;
                    } else {
                        adError = adError2;
                        str = str4;
                        maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor(nativeAdsManager), putChannelInfo.onExtraCallback(), (setRandomHost) null, new onActivityLayout(null, setstrokecolor, str, nativeAdsDto), 2, (Object) null);
                    }
                } else if (Intrinsics.areEqual(CollectionsKt.lastOrNull(list), "ADMOB")) {
                }
            } else {
                str = str4;
                adError = adError2;
            }
            String str6 = str5;
            if (!nativeAdsManager.onWarmupCompleted(str, str6, adError)) {
                return null;
            }
            int code = addOnAdapterChangeListener.INTERNAL_ERROR.getCode();
            if (str != null) {
                str6 = str;
            } else if (str6 == null) {
                int i9 = IPostMessageServiceStubProxy + 113;
                IPostMessageService_Parcel = i9 % 128;
                int i10 = i9 % 2;
                String message = adError != null ? adError.getMessage() : null;
                if (message == null) {
                    message = "Mediation failed";
                }
                str6 = message;
            } else {
                int i11 = IPostMessageService_Parcel + 43;
                IPostMessageServiceStubProxy = i11 % 128;
                int i12 = i11 % 2;
            }
            IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1057093614, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1057093613, new Object[]{nativeAdsManager, nativeAdsDto, Integer.valueOf(code), str6, adError != null ? adError.toString() : null, null, null, null, null, 240, null}, nSetPosition.onExtraCallbackWithResult());
            return null;
        }
        if (Intrinsics.areEqual((String) list.get(iIntValue), "TOSS")) {
            NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(nativeAdsDto.onExtraCallbackWithResult());
            if (adAsset == null) {
                IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 517095822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -517095780, new Object[]{nativeAdsManager, list, Integer.valueOf(iIntValue + 1), nativeAdsDto, mediation, appCompatActivity, Boolean.valueOf(zBooleanValue), num, deleteprofile, setstrokecolor, str2, Long.valueOf(jLongValue), Integer.valueOf(iIntValue2), str3, "NO_AD", str5, adError2}, nSetPosition.onExtraCallbackWithResult());
                return null;
            }
            int i13 = IPostMessageService_Parcel + 39;
            IPostMessageServiceStubProxy = i13 % 128;
            if (i13 % 2 == 0) {
                nativeAdsManager.onWarmupCompleted(nativeAdsDto, adAsset, str2, jLongValue, setstrokecolor);
                throw null;
            }
            if (!nativeAdsManager.onWarmupCompleted(nativeAdsDto, adAsset, str2, jLongValue, setstrokecolor)) {
                IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = nativeAdsManager.IEngagementSignalsCallbackDefault;
                String str7 = (iAuthTabCallbackStubProxy == IAuthTabCallbackStubProxy.ADMOB || iAuthTabCallbackStubProxy == IAuthTabCallbackStubProxy.NONE) ? "Forced Fail" : "INVALID_STYLE_ID";
                IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 517095822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -517095780, new Object[]{nativeAdsManager, list, Integer.valueOf(iIntValue + 1), nativeAdsDto, mediation, appCompatActivity, Boolean.valueOf(zBooleanValue), num, deleteprofile, setstrokecolor, str2, Long.valueOf(jLongValue), Integer.valueOf(iIntValue2), str3, str7, str5, adError2}, nSetPosition.onExtraCallbackWithResult());
                return null;
            }
            if (str5 != null) {
                AdMobFailedReason adMobFailedReason3 = new AdMobFailedReason(str5, (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null);
                int i14 = IPostMessageService_Parcel + 123;
                IPostMessageServiceStubProxy = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 4 / 3;
                }
                adMobFailedReason = adMobFailedReason3;
            } else {
                adMobFailedReason = null;
            }
            onNavigationEvent(nativeAdsManager, str2, nativeAdsDto, "TOSS", null, null, adMobFailedReason, 24, null);
            return null;
        }
        if (!Intrinsics.areEqual(r3, "ADMOB")) {
            return null;
        }
        NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediation != null ? mediation.onExtraCallbackWithResult() : null;
        if (admobInfoOnExtraCallbackWithResult == null) {
            IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 517095822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -517095780, new Object[]{nativeAdsManager, list, Integer.valueOf(iIntValue + 1), nativeAdsDto, mediation, appCompatActivity, Boolean.valueOf(zBooleanValue), num, deleteprofile, setstrokecolor, str2, Long.valueOf(jLongValue), Integer.valueOf(iIntValue2), str3, str4, str5, adError2}, nSetPosition.onExtraCallbackWithResult());
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new setTrimPathEnd(nativeAdsDto, str2, appCompatActivity, nativeAdsManager, nativeAdsManager.isEngagementSignalsApiAvailable, zBooleanValue, nativeAdsManager.IEngagementSignalsCallbackDefault, nativeAdsManager.new onActivityResized(nativeAdsDto, str2, str4, jLongValue, admobInfoOnExtraCallbackWithResult, objectRef, setstrokecolor, list, iIntValue, mediation, appCompatActivity, zBooleanValue, num, deleteprofile, iIntValue2, str3), num);
        Map<String, setTrimPathEnd> map = nativeAdsManager.ICustomTabsCallbackStub;
        String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
        Object obj = objectRef.element;
        if (obj == null) {
            int i16 = IPostMessageService_Parcel + 67;
            IPostMessageServiceStubProxy = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            settrimpathend = null;
        } else {
            settrimpathend = (setTrimPathEnd) obj;
        }
        setTrimPathEnd settrimpathendPut = map.put(strIAuthTabCallbackStub, settrimpathend);
        if (settrimpathendPut != null) {
            settrimpathendPut.onNavigationEvent();
        }
        if (setstrokecolor != null) {
            int i18 = IPostMessageService_Parcel + 61;
            IPostMessageServiceStubProxy = i18 % 128;
            if (i18 % 2 == 0) {
                nativeAdsManager.onWarmupCompleted(str2, setstrokecolor);
                throw null;
            }
            nativeAdsManager.onWarmupCompleted(str2, setstrokecolor);
        }
        Object obj2 = objectRef.element;
        if (obj2 == null) {
            int i19 = IPostMessageServiceStubProxy + 19;
            IPostMessageService_Parcel = i19 % 128;
            int i20 = i19 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            settrimpathend2 = null;
        } else {
            settrimpathend2 = (setTrimPathEnd) obj2;
        }
        settrimpathend2.IAuthTabCallback();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r29) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallbackWithResult(final String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, AppCompatActivity appCompatActivity, boolean z, Integer num, setStrokeColor setstrokecolor, int i, String str2) {
        int i2 = 2 % 2;
        deleteProfile deleteprofile = deleteProfile.AUTO;
        if (zzaj.onNavigationEvent().MediaMetadataCompat()) {
            int i3 = IPostMessageService_Parcel + 123;
            IPostMessageServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if ((!StringsKt.startsWith$default(str, "ui_test", false, 2, (Object) null)) && !StringsKt.startsWith$default(str, "admob_test", false, 2, (Object) null)) {
                int i5 = IPostMessageServiceStubProxy + 67;
                IPostMessageService_Parcel = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 32 / 0;
                    if (!this.IEngagementSignalsCallbackStubProxy) {
                        if (i < 0) {
                        }
                    }
                } else if (!this.IEngagementSignalsCallbackStubProxy) {
                }
            }
            findResAndMsg findresandmsg = (findResAndMsg) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 597082388, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -597082373, new Object[]{this}, nSetPosition.onExtraCallbackWithResult());
            getPackageType getpackagetypeOnNavigationEvent = findresandmsg != null ? maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new requestPostMessageChannel(i, str2, str, setstrokecolor, appCompatActivity, z, num, deleteprofile, adRequestOption, null), 3, (Object) null) : null;
            if (getpackagetypeOnNavigationEvent != null) {
                getpackagetypeOnNavigationEvent.onExtraCallback(new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda9
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        Unit unitIAuthTabCallback;
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 117;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            unitIAuthTabCallback = NativeAdsManager.IAuthTabCallback(this.f$0, str, (Throwable) obj2);
                            int i9 = 56 / 0;
                        } else {
                            unitIAuthTabCallback = NativeAdsManager.IAuthTabCallback(this.f$0, str, (Throwable) obj2);
                        }
                        int i10 = onWarmupCompleted + 7;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 26 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                });
            }
            int i7 = IPostMessageService_Parcel + 95;
            IPostMessageServiceStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        return false;
    }

    private static final Unit onTransact(NativeAdsManager nativeAdsManager, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel;
        int i3 = i2 + 89;
        IPostMessageServiceStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (th != null) {
            int i4 = i2 + 115;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            nativeAdsManager.extraCallback(nativeAdsManager.onRelationshipValidationResult(str));
            int i6 = IPostMessageService_Parcel + 89;
            IPostMessageServiceStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 4;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IPostMessageServiceStubProxy + 9;
        IPostMessageService_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    static /* synthetic */ void onNavigationEvent(NativeAdsManager nativeAdsManager, String str, NativeAdsDto nativeAdsDto, String str2, ExposureContent exposureContent, String str3, AdMobFailedReason adMobFailedReason, int i, Object obj) {
        ExposureContent exposureContent2;
        AdMobFailedReason adMobFailedReason2;
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy;
        int i4 = i3 + 87;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 8) != 0) {
            int i6 = i3 + 33;
            IPostMessageService_Parcel = i6 % 128;
            int i7 = i6 % 2;
            exposureContent2 = null;
        } else {
            exposureContent2 = exposureContent;
        }
        String str4 = (i & 16) != 0 ? null : str3;
        if ((i & 32) != 0) {
            int i8 = i3 + 87;
            IPostMessageService_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            adMobFailedReason2 = null;
        } else {
            adMobFailedReason2 = adMobFailedReason;
        }
        nativeAdsManager.onNavigationEvent(str, nativeAdsDto, str2, exposureContent2, str4, adMobFailedReason2);
    }

    private final void onNavigationEvent(String str, NativeAdsDto nativeAdsDto, String str2, ExposureContent exposureContent, String str3, AdMobFailedReason adMobFailedReason) {
        String strOnNavigationEvent;
        String str4;
        int i = 2 % 2;
        NativeAdsDto.Mediation mediationOnNavigationEvent = nativeAdsDto.onTransact().onNavigationEvent();
        if (StringsKt.isBlank(mediationOnNavigationEvent.IAuthTabCallbackStub()) || (strOnNavigationEvent = mediationOnNavigationEvent.asInterface().onNavigationEvent()) == null) {
            return;
        }
        if (StringsKt.isBlank(strOnNavigationEvent)) {
            strOnNavigationEvent = null;
        }
        final String str5 = strOnNavigationEvent;
        if (str5 != null) {
            int i2 = IPostMessageService_Parcel + 101;
            IPostMessageServiceStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (onWarmupCompleted(str, nativeAdsDto)) {
                int i4 = IPostMessageService_Parcel + 101;
                IPostMessageServiceStubProxy = i4 % 128;
                int i5 = i4 % 2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.isEngagementSignalsApiAvailable.onWarmupCompleted((CharSequence) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1372061357, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1372061352, new Object[]{this, "RESULT", str, nativeAdsDto.IAuthTabCallbackStub(), null, str2, exposureContent, str3, adMobFailedReason, 8, null}, nSetPosition.onExtraCallbackWithResult()));
                MediationResultLogRequest.Companion companion = MediationResultLogRequest.Companion;
                MediationResultLogRequest mediationResultLogRequestIAuthTabCallback = companion.IAuthTabCallback(nativeAdsDto, ICustomTabsService(str), str2, exposureContent, str3, adMobFailedReason, getInterfaceDescriptor(), ViewPager.IAuthTabCallback.IAuthTabCallback(jCurrentTimeMillis));
                calculatePageOffsets calculatepageoffsets = this.isEngagementSignalsApiAvailable;
                String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                wie2 wie2Var = this.IPostMessageServiceStub;
                wie2Var.onExtraCallback();
                String strOnWarmupCompleted = wie2Var.onWarmupCompleted(companion.serializer(), mediationResultLogRequestIAuthTabCallback);
                if (str2 == null) {
                    int i6 = IPostMessageServiceStubProxy + 119;
                    IPostMessageService_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    str4 = "";
                } else {
                    str4 = str2;
                }
                calculatepageoffsets.onWarmupCompleted(strIAuthTabCallbackStub, str5, strOnWarmupCompleted, "MEDIATION_RESULT", str4, jCurrentTimeMillis, new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda12
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 57;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnExtraCallback = NativeAdsManager.onExtraCallback(this.f$0, str5, (unregisterDataSetObserver) obj);
                        int i11 = IAuthTabCallback + 19;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        return unitOnExtraCallback;
                    }
                });
            }
        }
    }

    private static final Unit IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, unregisterDataSetObserver unregisterdatasetobserver) throws NoWhenBranchMatchedException {
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
        boolean zAreEqual = Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback);
        calculatePageOffsets calculatepageoffsets = nativeAdsManager.isEngagementSignalsApiAvailable;
        if (zAreEqual) {
            unregisterdatasetobserver = null;
        }
        if (unregisterdatasetobserver != null) {
            String strOnExtraCallback = getFillAlpha.onExtraCallback(unregisterdatasetobserver);
            int i2 = IPostMessageService_Parcel + 59;
            IPostMessageServiceStubProxy = i2 % 128;
            int i3 = i2 % 2;
            str2 = strOnExtraCallback;
        } else {
            str2 = null;
        }
        calculatepageoffsets.onExtraCallback(onNavigationEvent(nativeAdsManager, "RESULT", zAreEqual, str, (String) null, str2, 8, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i4 = IPostMessageServiceStubProxy + 43;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        Integer num = (Integer) objArr[5];
        String str3 = (String) objArr[6];
        String str4 = (String) objArr[7];
        String str5 = (String) objArr[8];
        int iIntValue2 = ((Number) objArr[9]).intValue();
        Object obj = objArr[10];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 39;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        if (i2 % 2 != 0 ? (iIntValue2 & 8) != 0 : (iIntValue2 & 105) != 0) {
            str2 = null;
        }
        if ((iIntValue2 & 16) != 0) {
            num = null;
        }
        if ((iIntValue2 & 32) != 0) {
            int i4 = i3 + 57;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            str3 = null;
        }
        if ((iIntValue2 & 64) != 0) {
            str4 = null;
        }
        if ((iIntValue2 & 128) != 0) {
            int i6 = IPostMessageService_Parcel + 117;
            IPostMessageServiceStubProxy = i6 % 128;
            int i7 = i6 % 2;
            str5 = null;
        }
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2007578406, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2007578374, new Object[]{nativeAdsManager, nativeAdsDto, Integer.valueOf(iIntValue), str, str2, num, str3, str4, str5}, nSetPosition.onExtraCallbackWithResult());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) throws Throwable {
        NativeAdsDto.Mediation mediationOnNavigationEvent;
        NativeAdsDto.MediationEndPoint mediationEndPointAsInterface;
        String strIAuthTabCallback;
        String str;
        String str2;
        String str3;
        final NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        Integer num = (Integer) objArr[5];
        String str6 = (String) objArr[6];
        String str7 = (String) objArr[7];
        String str8 = (String) objArr[8];
        int i = 2 % 2;
        if (nativeAdsDto != null) {
            int i2 = IPostMessageServiceStubProxy + 53;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
            if (extraInfoOnTransact != null && (mediationOnNavigationEvent = extraInfoOnTransact.onNavigationEvent()) != null && (mediationEndPointAsInterface = mediationOnNavigationEvent.asInterface()) != null && (strIAuthTabCallback = mediationEndPointAsInterface.IAuthTabCallback()) != null) {
                int i4 = IPostMessageService_Parcel + 77;
                IPostMessageServiceStubProxy = i4 % 128;
                int i5 = i4 % 2;
                String str9 = StringsKt.isBlank(strIAuthTabCallback) ? null : strIAuthTabCallback;
                if (str9 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    calculatePageOffsets calculatepageoffsets = nativeAdsManager.isEngagementSignalsApiAvailable;
                    String strExtraCallbackWithResult = nativeAdsManager.extraCallbackWithResult(nativeAdsDto.IAuthTabCallbackStub());
                    if (strExtraCallbackWithResult == null) {
                        strExtraCallbackWithResult = "";
                    }
                    final String str10 = str9;
                    calculatepageoffsets.onWarmupCompleted((CharSequence) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1372061357, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1372061352, new Object[]{nativeAdsManager, "ERROR", strExtraCallbackWithResult, nativeAdsDto.IAuthTabCallbackStub(), String.valueOf(iIntValue), null, null, str4, null, 176, null}, nSetPosition.onExtraCallbackWithResult()));
                    String strIAuthTabCallbackStub = nativeAdsDto.onTransact().onNavigationEvent().IAuthTabCallbackStub();
                    if (StringsKt.isBlank(strIAuthTabCallbackStub)) {
                        int i6 = IPostMessageService_Parcel + 55;
                        IPostMessageServiceStubProxy = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 35 / 0;
                        }
                        str = null;
                    } else {
                        str = strIAuthTabCallbackStub;
                    }
                    String strIAuthTabCallbackDefault = nativeAdsDto.IAuthTabCallbackDefault();
                    if (strIAuthTabCallbackDefault != null) {
                        int i8 = IPostMessageServiceStubProxy + 61;
                        IPostMessageService_Parcel = i8 % 128;
                        if (i8 % 2 != 0) {
                            StringsKt.isBlank(strIAuthTabCallbackDefault);
                            throw null;
                        }
                        if (StringsKt.isBlank(strIAuthTabCallbackDefault)) {
                            int i9 = IPostMessageServiceStubProxy + 125;
                            IPostMessageService_Parcel = i9 % 128;
                            if (i9 % 2 != 0) {
                                int i10 = 2 % 4;
                            }
                            str2 = null;
                        } else {
                            str2 = strIAuthTabCallbackDefault;
                        }
                        String strTake = str5 != null ? StringsKt.take(str5, 255) : null;
                        if (str8 != null) {
                            int i11 = IPostMessageServiceStubProxy + 47;
                            IPostMessageService_Parcel = i11 % 128;
                            String strTake2 = StringsKt.take(str8, i11 % 2 != 0 ? 15548 : 255);
                            int i12 = IPostMessageServiceStubProxy + 35;
                            IPostMessageService_Parcel = i12 % 128;
                            int i13 = i12 % 2;
                            str3 = strTake2;
                        } else {
                            str3 = null;
                        }
                        SdkErrorTrackingLogRequest sdkErrorTrackingLogRequest = new SdkErrorTrackingLogRequest(str, str2, strTake, Integer.valueOf(iIntValue), str4, num, str6, str7, str3, nativeAdsManager.getInterfaceDescriptor(), ViewPager.IAuthTabCallback.IAuthTabCallback(jCurrentTimeMillis));
                        calculatePageOffsets calculatepageoffsets2 = nativeAdsManager.isEngagementSignalsApiAvailable;
                        String strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub();
                        wie2 wie2Var = nativeAdsManager.IPostMessageServiceStub;
                        wie2Var.onExtraCallback();
                        calculatepageoffsets2.onWarmupCompleted(strIAuthTabCallbackStub2, str10, wie2Var.onWarmupCompleted(SdkErrorTrackingLogRequest.Companion.serializer(), sdkErrorTrackingLogRequest), "SDK_ERROR", String.valueOf(iIntValue), jCurrentTimeMillis, new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj) {
                                int i14 = 2 % 2;
                                int i15 = onExtraCallback + 121;
                                IAuthTabCallback = i15 % 128;
                                int i16 = i15 % 2;
                                NativeAdsManager nativeAdsManager2 = this.f$0;
                                if (i16 == 0) {
                                    return (Unit) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -32133231, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 32133239, new Object[]{nativeAdsManager2, str10, (unregisterDataSetObserver) obj}, nSetPosition.onExtraCallbackWithResult());
                                }
                                Object[] objArr2 = {nativeAdsManager2, str10, (unregisterDataSetObserver) obj};
                                int i17 = 56 / 0;
                                return (Unit) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -32133231, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 32133239, objArr2, nSetPosition.onExtraCallbackWithResult());
                            }
                        });
                    }
                }
            }
        }
        return null;
    }

    private static final Unit onNavigationEvent(NativeAdsManager nativeAdsManager, String str, unregisterDataSetObserver unregisterdatasetobserver) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 9;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
        boolean zAreEqual = Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback);
        calculatePageOffsets calculatepageoffsets = nativeAdsManager.isEngagementSignalsApiAvailable;
        if (zAreEqual) {
            int i4 = IPostMessageServiceStubProxy;
            int i5 = i4 + 1;
            IPostMessageService_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 32 / 0;
            }
            int i7 = i4 + 49;
            IPostMessageService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            unregisterdatasetobserver = null;
        }
        calculatepageoffsets.onExtraCallback(onNavigationEvent(nativeAdsManager, "ERROR", zAreEqual, str, (String) null, unregisterdatasetobserver != null ? getFillAlpha.onExtraCallback(unregisterdatasetobserver) : null, 8, (Object) null));
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(@NotNull NativeAdsDto nativeAdsDto, @NotNull AdError adError) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 5;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsDto, "");
        Intrinsics.checkNotNullParameter(adError, "");
        int code = addOnAdapterChangeListener.INTERNAL_ERROR.getCode();
        String message = adError.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "");
        String string = adError.toString();
        int code2 = adError.getCode();
        String domain = adError.getDomain();
        String message2 = adError.getMessage();
        String string2 = adError.toString();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2007578406, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2007578374, new Object[]{this, nativeAdsDto, Integer.valueOf(code), message, string, Integer.valueOf(code2), domain, message2, string2}, nSetPosition.onExtraCallbackWithResult());
        int i4 = IPostMessageService_Parcel + 21;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean onWarmupCompleted(String str, String str2, AdError adError) {
        boolean z;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 111;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (str == null && str2 == null && adError == null) {
            return true;
        }
        boolean z2 = str == null || Intrinsics.areEqual(str, "NO_AD");
        if ((adError == null || !onNavigationEvent(adError)) && !(str2 == null && adError == null)) {
            z = false;
        } else {
            int i4 = IPostMessageService_Parcel + 89;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        return (z2 && z) ? false : true;
    }

    private final boolean onNavigationEvent(AdError adError) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 71;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            if (adError.getCode() == 4) {
                return true;
            }
        } else if (adError.getCode() == 3) {
            return true;
        }
        int i3 = IPostMessageServiceStubProxy + 33;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (Intrinsics.areEqual(adError.getMessage(), "ads exhausted")) {
            return true;
        }
        int i5 = IPostMessageService_Parcel + 7;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 != im.toss.ads_sdk.NativeAdsManager.IAuthTabCallbackStubProxy.NONE) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = im.toss.ads_sdk.NativeAdsManager.IPostMessageService_Parcel + 103;
        im.toss.ads_sdk.NativeAdsManager.IPostMessageServiceStubProxy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r9 = r9.IAuthTabCallbackDefault();
        r1 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r1 == 16547) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r9 = r9.IAuthTabCallbackDefault();
        r1 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1 == 1568) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        switch(r1) {
            case 51: goto L26;
            case 52: goto L23;
            case 53: goto L20;
            default: goto L31;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r9.equals("5") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r9 = im.toss.ads_sdk.NativeAdsManager.IPostMessageServiceStubProxy + 115;
        im.toss.ads_sdk.NativeAdsManager.IPostMessageService_Parcel = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r9.equals("4") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r9.equals("3") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r9.equals("11") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (onWarmupCompleted(r10, r11) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        o.maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor(r7), o.putChannelInfo.onExtraCallback(), (o.setRandomHost) null, new im.toss.ads_sdk.NativeAdsManager.requestPostMessageChannelWithExtras(null, r13, r8), 2, (java.lang.Object) null);
        r7.asInterface.put(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        r8 = im.toss.ads_sdk.NativeAdsManager.IPostMessageServiceStubProxy + 29;
        im.toss.ads_sdk.NativeAdsManager.IPostMessageService_Parcel = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 != im.toss.ads_sdk.NativeAdsManager.IAuthTabCallbackStubProxy.NONE) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted(NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset, String str, long j, setStrokeColor setstrokecolor) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 29;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = this.IEngagementSignalsCallbackDefault;
        if (iAuthTabCallbackStubProxy != IAuthTabCallbackStubProxy.ADMOB) {
            int i4 = IPostMessageService_Parcel + 41;
            IPostMessageServiceStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 92 / 0;
            }
        }
        return false;
    }

    private final void getInterfaceDescriptor(String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 75;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            setTrimPathEnd settrimpathendRemove = this.onExtraCallback.remove(str);
            if (settrimpathendRemove != null) {
                settrimpathendRemove.onNavigationEvent();
                int i3 = IPostMessageServiceStubProxy + 113;
                IPostMessageService_Parcel = i3 % 128;
                int i4 = i3 % 2;
            }
            this.asInterface.remove(str);
            this.onWarmupCompleted.remove(str);
            IAuthTabCallbackStubProxy(str);
            return;
        }
        this.onExtraCallback.remove(str);
        throw null;
    }

    private final Pair<setTrimPathEnd, scrollToItem> access000(String str) {
        int i = 2 % 2;
        setTrimPathEnd settrimpathendRemove = this.onExtraCallback.remove(str);
        scrollToItem scrolltoitemRemove = this.onWarmupCompleted.remove(str);
        Object obj = null;
        if (settrimpathendRemove == null || scrolltoitemRemove == null) {
            if (settrimpathendRemove != null) {
                settrimpathendRemove.onNavigationEvent();
            }
            return null;
        }
        int i2 = IPostMessageServiceStubProxy + 85;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            getWrite.IAuthTabCallback(settrimpathendRemove, scrolltoitemRemove);
            obj.hashCode();
            throw null;
        }
        Pair<setTrimPathEnd, scrollToItem> pairIAuthTabCallback = getWrite.IAuthTabCallback(settrimpathendRemove, scrolltoitemRemove);
        int i3 = IPostMessageServiceStubProxy + 21;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return pairIAuthTabCallback;
    }

    private final void IAuthTabCallbackStub() {
        synchronized (this) {
            this.onTransact.clear();
            this.IAuthTabCallback.clear();
            this.ICustomTabsServiceStubProxy.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            this.onTransact.remove(str);
            this.IAuthTabCallback.remove(str);
            this.ICustomTabsServiceStubProxy.remove(str);
        }
    }

    private final deleteProfile onPostMessage(String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 59;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            this.requestPostMessageChannel.get(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        deleteProfile deleteprofile = this.requestPostMessageChannel.get(str);
        if (deleteprofile != null) {
            return deleteprofile;
        }
        deleteProfile deleteprofile2 = deleteProfile.AUTO;
        int i3 = IPostMessageServiceStubProxy + 25;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return deleteprofile2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r4
      0x0031: PHI (r4v9 java.lang.String) = (r4v1 java.lang.String), (r4v10 java.lang.String) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final deleteProfile asBinder(@NotNull String str) {
        String strExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 75;
        IPostMessageService_Parcel = i2 % 128;
        String str2 = "";
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            strExtraCallbackWithResult = extraCallbackWithResult(str);
            int i3 = 32 / 0;
            if (strExtraCallbackWithResult == null) {
                int i4 = IPostMessageServiceStubProxy + 61;
                IPostMessageService_Parcel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str2 = strExtraCallbackWithResult;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            strExtraCallbackWithResult = extraCallbackWithResult(str);
            if (strExtraCallbackWithResult == null) {
            }
        }
        deleteProfile deleteprofile = this.requestPostMessageChannel.get(str2);
        return deleteprofile == null ? deleteProfile.AUTO : deleteprofile;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        NativeAdsDto nativeAdsDtoOnNavigationEvent = nativeAdsManager.onNavigationEvent(str);
        if (nativeAdsDtoOnNavigationEvent == null) {
            return null;
        }
        int i2 = IPostMessageServiceStubProxy + 81;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDtoOnNavigationEvent.onTransact();
        if (extraInfoOnTransact == null) {
            return null;
        }
        int i4 = IPostMessageService_Parcel + 3;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        NativeAdsDto.Mediation mediationOnNavigationEvent = extraInfoOnTransact.onNavigationEvent();
        if (mediationOnNavigationEvent == null) {
            return null;
        }
        int i6 = IPostMessageServiceStubProxy + 7;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediationOnNavigationEvent.onExtraCallbackWithResult();
        int i8 = IPostMessageServiceStubProxy + 69;
        IPostMessageService_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return admobInfoOnExtraCallbackWithResult;
    }

    public final NativeAdsDto onNavigationEvent(@NotNull String str) {
        Object next;
        NativeAdsDto nativeAdsDtoOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback onextracallbackICustomTabsCallback = ICustomTabsCallback(str);
        if (onextracallbackICustomTabsCallback != null && (nativeAdsDtoOnExtraCallback = onextracallbackICustomTabsCallback.onExtraCallback()) != null) {
            return nativeAdsDtoOnExtraCallback;
        }
        Iterator<T> it = this.access100.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = IPostMessageServiceStubProxy + 13;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            next = it.next();
            NativeAdsDto nativeAdsDto = (NativeAdsDto) ((Map.Entry) next).getValue();
            if (Intrinsics.areEqual(nativeAdsDto != null ? nativeAdsDto.IAuthTabCallbackStub() : null, str)) {
                int i4 = IPostMessageServiceStubProxy + 19;
                IPostMessageService_Parcel = i4 % 128;
                int i5 = i4 % 2;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (NativeAdsDto) entry.getValue();
        }
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, String str2, ExposureContent exposureContent, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel;
        int i4 = i3 + 63;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i6 = i3 + 69;
            IPostMessageServiceStubProxy = i6 % 128;
            int i7 = i6 % 2;
            exposureContent = null;
        }
        nativeAdsManager.onWarmupCompleted(str, str2, exposureContent);
        int i8 = IPostMessageService_Parcel + 113;
        IPostMessageServiceStubProxy = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f A[PHI: r2
      0x002f: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String) binds: [B:7:0x002d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @Nullable ExposureContent exposureContent) {
        NativeAdsDto nativeAdsDtoOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 3;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onExtraCallback onextracallbackICustomTabsCallback = ICustomTabsCallback(str);
        if (onextracallbackICustomTabsCallback != null) {
            int i4 = IPostMessageService_Parcel + 81;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            String strExtraCallbackWithResult = onextracallbackICustomTabsCallback.onWarmupCompleted();
            if (strExtraCallbackWithResult == null) {
                strExtraCallbackWithResult = extraCallbackWithResult(str);
                if (strExtraCallbackWithResult != null) {
                    if ((onextracallbackICustomTabsCallback != null && (nativeAdsDtoOnNavigationEvent = onextracallbackICustomTabsCallback.onExtraCallback()) != null) || (nativeAdsDtoOnNavigationEvent = onNavigationEvent(str)) != null) {
                        onExtraCallback(strExtraCallbackWithResult, nativeAdsDtoOnNavigationEvent, str2, exposureContent);
                        return;
                    }
                }
            }
        }
        int i6 = IPostMessageService_Parcel + 93;
        IPostMessageServiceStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, NativeAdsDto nativeAdsDto, String str2, ExposureContent exposureContent, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            int i3 = IPostMessageService_Parcel + 103;
            int i4 = i3 % 128;
            IPostMessageServiceStubProxy = i4;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i5 = i4 + 27;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            exposureContent = null;
        }
        nativeAdsManager.onExtraCallback(str, nativeAdsDto, str2, exposureContent);
    }

    public final void onExtraCallback(@NotNull String str, @NotNull NativeAdsDto nativeAdsDto, @NotNull final String str2, @Nullable ExposureContent exposureContent) {
        String strOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativeAdsDto, "");
        Intrinsics.checkNotNullParameter(str2, "");
        NativeAdsDto.Mediation mediationOnNavigationEvent = nativeAdsDto.onTransact().onNavigationEvent();
        if (StringsKt.isBlank(mediationOnNavigationEvent.IAuthTabCallbackStub()) || (strOnExtraCallback = mediationOnNavigationEvent.asInterface().onExtraCallback()) == null) {
            return;
        }
        int i2 = IPostMessageServiceStubProxy + 7;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (StringsKt.isBlank(strOnExtraCallback)) {
            strOnExtraCallback = null;
        }
        final String str3 = strOnExtraCallback;
        if (str3 == null || !onExtraCallbackWithResult(str, nativeAdsDto, str2)) {
            return;
        }
        int i4 = IPostMessageService_Parcel + 51;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        MediationExposureEventLogRequest.Companion companion = MediationExposureEventLogRequest.Companion;
        MediationExposureEventLogRequest mediationExposureEventLogRequestOnNavigationEvent = MediationExposureEventLogRequest.onNavigationEvent(companion.onNavigationEvent(str2, ICustomTabsService(str), nativeAdsDto, getInterfaceDescriptor(), ViewPager.IAuthTabCallback.IAuthTabCallback(jCurrentTimeMillis)), null, null, null, null, null, null, 0L, exposureContent, null, null, 895, null);
        this.isEngagementSignalsApiAvailable.onWarmupCompleted((CharSequence) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1372061357, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1372061352, new Object[]{this, "EXPOSE", str, nativeAdsDto.IAuthTabCallbackStub(), str2, null, exposureContent, null, null, 208, null}, nSetPosition.onExtraCallbackWithResult()));
        calculatePageOffsets calculatepageoffsets = this.isEngagementSignalsApiAvailable;
        String strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
        wie2 wie2Var = this.IPostMessageServiceStub;
        wie2Var.onExtraCallback();
        String strOnWarmupCompleted = wie2Var.onWarmupCompleted(companion.serializer(), mediationExposureEventLogRequestOnNavigationEvent);
        String str4 = "CLICK";
        if (!Intrinsics.areEqual(str2, "CLICK")) {
            int i6 = IPostMessageServiceStubProxy + 99;
            IPostMessageService_Parcel = i6 % 128;
            int i7 = i6 % 2;
            str4 = "MEDIATION_EXPOSURE";
        }
        calculatepageoffsets.onWarmupCompleted(strIAuthTabCallbackStub, str3, strOnWarmupCompleted, str4, str2, jCurrentTimeMillis, new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 61;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    NativeAdsManager.onExtraCallback(this.f$0, str3, str2, (unregisterDataSetObserver) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallback = NativeAdsManager.onExtraCallback(this.f$0, str3, str2, (unregisterDataSetObserver) obj);
                int i10 = onWarmupCompleted + 87;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                return unitOnExtraCallback;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[PHI: r1 r2
      0x0033: PHI (r1v8 boolean) = (r1v5 boolean), (r1v10 boolean) binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r2v5 o.calculatePageOffsets) = (r2v2 o.calculatePageOffsets), (r2v6 o.calculatePageOffsets) binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r2
      0x0030: PHI (r1v6 boolean) = (r1v5 boolean), (r1v10 boolean) binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r2v3 o.calculatePageOffsets) = (r2v2 o.calculatePageOffsets), (r2v6 o.calculatePageOffsets) binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, String str2, unregisterDataSetObserver unregisterdatasetobserver) throws NoWhenBranchMatchedException {
        boolean zAreEqual;
        calculatePageOffsets calculatepageoffsets;
        boolean z;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 125;
        IPostMessageServiceStubProxy = i2 % 128;
        String strOnExtraCallback = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
            zAreEqual = Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback);
            calculatepageoffsets = nativeAdsManager.isEngagementSignalsApiAvailable;
            int i3 = 40 / 0;
            if (zAreEqual) {
                z = zAreEqual;
                unregisterdatasetobserver = null;
            } else {
                z = zAreEqual;
            }
        } else {
            Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
            zAreEqual = Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback);
            calculatepageoffsets = nativeAdsManager.isEngagementSignalsApiAvailable;
            if (zAreEqual) {
            }
        }
        if (unregisterdatasetobserver != null) {
            strOnExtraCallback = getFillAlpha.onExtraCallback(unregisterdatasetobserver);
            int i4 = IPostMessageService_Parcel + 71;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        calculatepageoffsets.onExtraCallback(nativeAdsManager.onExtraCallbackWithResult("EXPOSE", z, str, str2, strOnExtraCallback));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str, String str2, String str3, AdMobFailedReason adMobFailedReason, ExposureContent exposureContent, int i, Object obj) {
        String str4;
        ExposureContent exposureContent2;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IPostMessageService_Parcel + 15;
            IPostMessageServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        AdMobFailedReason adMobFailedReason2 = (i & 8) != 0 ? null : adMobFailedReason;
        if ((i & 16) != 0) {
            int i5 = IPostMessageServiceStubProxy + 49;
            IPostMessageService_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 94 / 0;
            }
            exposureContent2 = null;
        } else {
            exposureContent2 = exposureContent;
        }
        nativeAdsManager.onExtraCallback(str, str2, str4, adMobFailedReason2, exposureContent2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable AdMobFailedReason adMobFailedReason, @Nullable ExposureContent exposureContent) {
        String strExtraCallbackWithResult;
        NativeAdsDto nativeAdsDto;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 67;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback onextracallbackICustomTabsCallback = ICustomTabsCallback(str);
        if (onextracallbackICustomTabsCallback != null) {
            int i4 = IPostMessageServiceStubProxy + 59;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                onextracallbackICustomTabsCallback.onWarmupCompleted();
                throw null;
            }
            strExtraCallbackWithResult = onextracallbackICustomTabsCallback.onWarmupCompleted();
            if (strExtraCallbackWithResult == null) {
                strExtraCallbackWithResult = extraCallbackWithResult(str);
                if (strExtraCallbackWithResult == null) {
                    return;
                }
            }
        }
        String str4 = strExtraCallbackWithResult;
        int i5 = IPostMessageServiceStubProxy + 119;
        int i6 = i5 % 128;
        IPostMessageService_Parcel = i6;
        int i7 = i5 % 2;
        if (onextracallbackICustomTabsCallback != null) {
            int i8 = i6 + 77;
            IPostMessageServiceStubProxy = i8 % 128;
            int i9 = i8 % 2;
            NativeAdsDto nativeAdsDtoOnExtraCallback = onextracallbackICustomTabsCallback.onExtraCallback();
            if (nativeAdsDtoOnExtraCallback != null) {
                nativeAdsDto = nativeAdsDtoOnExtraCallback;
            } else {
                NativeAdsDto nativeAdsDtoOnNavigationEvent = onNavigationEvent(str);
                if (nativeAdsDtoOnNavigationEvent == null) {
                    return;
                } else {
                    nativeAdsDto = nativeAdsDtoOnNavigationEvent;
                }
            }
        }
        onNavigationEvent(str4, nativeAdsDto, str2, exposureContent, str3, adMobFailedReason);
    }

    private final String extraCallbackWithResult(String str) {
        Object next;
        String strIAuthTabCallbackStub;
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 79;
        IPostMessageService_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback onextracallbackICustomTabsCallback = ICustomTabsCallback(str);
            if (onextracallbackICustomTabsCallback != null && (strOnWarmupCompleted = onextracallbackICustomTabsCallback.onWarmupCompleted()) != null) {
                int i3 = IPostMessageService_Parcel + 31;
                IPostMessageServiceStubProxy = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 37 / 0;
                }
                return strOnWarmupCompleted;
            }
            Iterator<T> it = this.access100.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                NativeAdsDto nativeAdsDto = (NativeAdsDto) ((Map.Entry) next).getValue();
                if (nativeAdsDto != null) {
                    strIAuthTabCallbackStub = nativeAdsDto.IAuthTabCallbackStub();
                } else {
                    int i5 = IPostMessageService_Parcel + 119;
                    IPostMessageServiceStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    strIAuthTabCallbackStub = null;
                }
                if (Intrinsics.areEqual(strIAuthTabCallbackStub, str)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null) {
                return null;
            }
            String str2 = (String) entry.getKey();
            int i7 = IPostMessageServiceStubProxy + 123;
            IPostMessageService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            return str2;
        }
        ICustomTabsCallback(str);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[PHI: r1
      0x0044: PHI (r1v4 im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView) = (r1v3 im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView), (r1v9 im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView) binds: [B:10:0x0042, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobViewPut;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = (NativeAdsThumbnailAdMobView) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativeAdsThumbnailAdMobView, "");
        String strExtraCallbackWithResult = nativeAdsManager.extraCallbackWithResult(str);
        if (strExtraCallbackWithResult != null) {
            int i2 = IPostMessageService_Parcel + 3;
            IPostMessageServiceStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                nativeAdsThumbnailAdMobViewPut = nativeAdsManager.asBinder.put(strExtraCallbackWithResult, nativeAdsThumbnailAdMobView);
                int i3 = 21 / 0;
                if (nativeAdsThumbnailAdMobViewPut != null) {
                    if (nativeAdsThumbnailAdMobViewPut == nativeAdsThumbnailAdMobView) {
                        nativeAdsThumbnailAdMobViewPut = null;
                    }
                    if (nativeAdsThumbnailAdMobViewPut != null) {
                        nativeAdsThumbnailAdMobViewPut.onExtraCallback();
                    }
                }
            } else {
                nativeAdsThumbnailAdMobViewPut = nativeAdsManager.asBinder.put(strExtraCallbackWithResult, nativeAdsThumbnailAdMobView);
                if (nativeAdsThumbnailAdMobViewPut != null) {
                }
            }
        }
        int i4 = IPostMessageServiceStubProxy + 43;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final NativeAdsThumbnailAdMobView onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strExtraCallbackWithResult = extraCallbackWithResult(str);
        if (strExtraCallbackWithResult != null) {
            NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = this.asBinder.get(strExtraCallbackWithResult);
            int i2 = IPostMessageService_Parcel + 79;
            IPostMessageServiceStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 89 / 0;
            }
            return nativeAdsThumbnailAdMobView;
        }
        int i4 = IPostMessageServiceStubProxy + 59;
        int i5 = i4 % 128;
        IPostMessageService_Parcel = i5;
        if (i4 % 2 != 0) {
            int i6 = 97 / 0;
        }
        int i7 = i5 + 65;
        IPostMessageServiceStubProxy = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final void onExtraCallback(@NotNull String str, @NotNull NativeAd nativeAd) {
        NativeAd nativeAdPut;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativeAd, "");
        String strExtraCallbackWithResult = extraCallbackWithResult(str);
        if (strExtraCallbackWithResult != null) {
            int i2 = IPostMessageServiceStubProxy + 23;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                nativeAdPut = this.IAuthTabCallbackStub.put(strExtraCallbackWithResult, nativeAd);
                int i3 = 90 / 0;
                if (nativeAdPut == null) {
                    return;
                }
            } else {
                nativeAdPut = this.IAuthTabCallbackStub.put(strExtraCallbackWithResult, nativeAd);
                if (nativeAdPut == null) {
                    return;
                }
            }
            if (nativeAdPut == nativeAd) {
                nativeAdPut = null;
            }
            if (nativeAdPut != null) {
                int i4 = IPostMessageService_Parcel + 83;
                IPostMessageServiceStubProxy = i4 % 128;
                int i5 = i4 % 2;
                nativeAdPut.destroy();
                if (i5 == 0) {
                    throw null;
                }
                int i6 = IPostMessageServiceStubProxy + 79;
                IPostMessageService_Parcel = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public final NativeAd onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 23;
        IPostMessageService_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            extraCallbackWithResult(str);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String strExtraCallbackWithResult = extraCallbackWithResult(str);
        if (strExtraCallbackWithResult != null) {
            return this.IAuthTabCallbackStub.get(strExtraCallbackWithResult);
        }
        int i3 = IPostMessageService_Parcel + 109;
        IPostMessageServiceStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, AppCompatActivity appCompatActivity, String str, NativeAdsDto nativeAdsDto, deleteProfile deleteprofile, String str2, Set set, setStrokeColor setstrokecolor, boolean z, Integer num, int i, Object obj) throws Throwable {
        deleteProfile deleteprofile2;
        Set setOnExtraCallback;
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            int i3 = IPostMessageService_Parcel + 123;
            IPostMessageServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
            deleteProfile deleteprofile3 = deleteProfile.AUTO;
            int i5 = IPostMessageServiceStubProxy + 103;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            deleteprofile2 = deleteprofile3;
        } else {
            deleteprofile2 = deleteprofile;
        }
        Object obj2 = null;
        if ((i & 32) != 0) {
            int i7 = IPostMessageService_Parcel + 33;
            IPostMessageServiceStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            setOnExtraCallback = Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback();
        } else {
            setOnExtraCallback = set;
        }
        nativeAdsManager.onWarmupCompleted(appCompatActivity, str, nativeAdsDto, deleteprofile2, str2, (Set<String>) setOnExtraCallback, setstrokecolor, (i & 128) != 0 ? true : z, (i & 256) != 0 ? null : num);
    }

    static final class newSessionWithExtras extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        newSessionWithExtras(access13800<? super newSessionWithExtras> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            newSessionWithExtras newsessionwithextras = NativeAdsManager.this.new newSessionWithExtras(access13800Var);
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return newsessionwithextras;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 13;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            getPackageType getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(NativeAdsManager.this);
            if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    static final class newAuthTabSession extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ NativeAdsDto $adResponse;
        final /* synthetic */ Integer $admobPreloadBufferSize;
        final /* synthetic */ setStrokeColor $loadCallback;
        final /* synthetic */ long $loadGeneration;
        final /* synthetic */ deleteProfile $preferredUiMode;
        final /* synthetic */ String $requestedPlayableUrl;
        final /* synthetic */ int $requestedTestIndex;
        final /* synthetic */ String $spaceUnitId;
        final /* synthetic */ boolean $useAdmobPreloaderFallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        newAuthTabSession(NativeAdsDto nativeAdsDto, int i, String str, String str2, long j, AppCompatActivity appCompatActivity, boolean z, Integer num, deleteProfile deleteprofile, setStrokeColor setstrokecolor, access13800<? super newAuthTabSession> access13800Var) {
            super(2, access13800Var);
            this.$adResponse = nativeAdsDto;
            this.$requestedTestIndex = i;
            this.$requestedPlayableUrl = str;
            this.$spaceUnitId = str2;
            this.$loadGeneration = j;
            this.$activity = appCompatActivity;
            this.$useAdmobPreloaderFallback = z;
            this.$admobPreloadBufferSize = num;
            this.$preferredUiMode = deleteprofile;
            this.$loadCallback = setstrokecolor;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            newAuthTabSession newauthtabsession = NativeAdsManager.this.new newAuthTabSession(this.$adResponse, this.$requestedTestIndex, this.$requestedPlayableUrl, this.$spaceUnitId, this.$loadGeneration, this.$activity, this.$useAdmobPreloaderFallback, this.$admobPreloadBufferSize, this.$preferredUiMode, this.$loadCallback, access13800Var);
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 82 / 0;
            }
            return newauthtabsession;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallbackWithResult;
            NativeAdsManager nativeAdsManager;
            String str;
            boolean z;
            int i;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 51;
            IAuthTabCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                NativeAdsManager nativeAdsManager2 = NativeAdsManager.this;
                NativeAdsDto nativeAdsDto = this.$adResponse;
                int i5 = this.$requestedTestIndex;
                String str2 = this.$requestedPlayableUrl;
                this.label = 1;
                objOnExtraCallbackWithResult = NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager2, nativeAdsDto, i5, str2, (access13800) this);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    int i6 = onWarmupCompleted + 121;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = obj;
            }
            NativeAdsDto nativeAdsDto2 = (NativeAdsDto) objOnExtraCallbackWithResult;
            if (NativeAdsManager.onExtraCallback(NativeAdsManager.this, this.$spaceUnitId, this.$loadGeneration)) {
                int i7 = IAuthTabCallback + 51;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    nativeAdsManager = NativeAdsManager.this;
                    str = this.$spaceUnitId;
                    z = false;
                    i = 3;
                } else {
                    nativeAdsManager = NativeAdsManager.this;
                    str = this.$spaceUnitId;
                    z = false;
                    i = 4;
                }
                NativeAdsManager.IAuthTabCallback(nativeAdsManager, str, nativeAdsDto2, z, i, (Object) null);
            }
            NativeAdsDto.Mediation mediationOnNavigationEvent = nativeAdsDto2.onTransact().onNavigationEvent();
            List<String> listIAuthTabCallbackDefault = mediationOnNavigationEvent.IAuthTabCallbackDefault();
            if (listIAuthTabCallbackDefault.isEmpty()) {
                listIAuthTabCallbackDefault = CollectionsKt.listOf("TOSS");
            }
            NativeAdsManager.onExtraCallback(NativeAdsManager.this, listIAuthTabCallbackDefault, 0, nativeAdsDto2, mediationOnNavigationEvent, this.$activity, this.$useAdmobPreloaderFallback, this.$admobPreloadBufferSize, this.$preferredUiMode, this.$loadCallback, this.$spaceUnitId, this.$loadGeneration, this.$requestedTestIndex, this.$requestedPlayableUrl, null, null, null, 57344, null);
            return Unit.INSTANCE;
        }
    }

    public final void onWarmupCompleted(@NotNull AppCompatActivity appCompatActivity, @NotNull String str, @NotNull NativeAdsDto nativeAdsDto, @NotNull deleteProfile deleteprofile, @NotNull String str2, @NotNull Set<String> set, @NotNull setStrokeColor setstrokecolor, boolean z, @Nullable Integer num) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativeAdsDto, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(setstrokecolor, "");
        String str3 = this.onMessageChannelReady;
        int i2 = this.onGreatestScrollPercentageIncreased;
        final String strOnRelationshipValidationResult = onRelationshipValidationResult(str);
        this.requestPostMessageChannel.put(str, deleteprofile);
        onExtraCallback((TextFieldScrollKtExternalSyntheticLambda0) appCompatActivity);
        IAuthTabCallback(str, str2, set, setstrokecolor, (String) null);
        onWarmupCompleted(str, setstrokecolor);
        if (onExtraCallback(strOnRelationshipValidationResult, setstrokecolor)) {
            int i3 = IPostMessageServiceStubProxy + 1;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            setStrokeColor setstrokecolor2 = (setStrokeColor) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1777679235, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1777679196, new Object[]{this, strOnRelationshipValidationResult}, iOnExtraCallbackWithResult);
            long jAccess100 = access100(str);
            getInterfaceDescriptor(str);
            this.access100.put(str, null);
            getPackageType getpackagetype = this.onUnminimized.get(str);
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                int i5 = IPostMessageService_Parcel + 93;
                IPostMessageServiceStubProxy = i5 % 128;
                int i6 = i5 % 2;
            }
            this.onUnminimized.put(str, (getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{this, new newSessionWithExtras(null)}, nSetPosition.onExtraCallbackWithResult()));
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult2)).onWarmupCompleted((TextFieldScrollKtExternalSyntheticLambda0) appCompatActivity);
            getPackageType getpackagetype2 = (getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{this, new newAuthTabSession(nativeAdsDto, i2, str3, str, jAccess100, appCompatActivity, z, num, deleteprofile, setstrokecolor2, null)}, nSetPosition.onExtraCallbackWithResult());
            if (getpackagetype2 != null) {
                getpackagetype2.onExtraCallback(new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 93;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallback = NativeAdsManager.onExtraCallback(this.f$0, strOnRelationshipValidationResult, (Throwable) obj);
                        int i10 = onExtraCallbackWithResult + 55;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnExtraCallback;
                    }
                });
                int i7 = IPostMessageService_Parcel + 81;
                IPostMessageServiceStubProxy = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str, Throwable th) {
        int i = 2 % 2;
        if (th != null) {
            int i2 = IPostMessageService_Parcel + 101;
            IPostMessageServiceStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                nativeAdsManager.extraCallback(str);
            } else {
                nativeAdsManager.extraCallback(str);
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IPostMessageServiceStubProxy + 23;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final AdmobError onExtraCallbackWithResult(AdError adError) {
        int i = 2 % 2;
        int code = adError.getCode();
        AdmobError admobError = new AdmobError(Integer.valueOf(code), adError.getDomain(), adError.getMessage());
        int i2 = IPostMessageService_Parcel + 113;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return admobError;
    }

    private final NativeAdsDto onExtraCallbackWithResult(NativeAdsDto nativeAdsDto) throws Throwable {
        int i = 2 % 2;
        String str = this.onActivityResized;
        if (str == null) {
            return nativeAdsDto;
        }
        int i2 = IPostMessageServiceStubProxy + 9;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L), 1 - View.resolveSize(0, 0), (char) (49684 - (ViewConfiguration.getTouchSlop() >> 8)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (iHashCode != 0) {
            int i4 = IPostMessageService_Parcel + 37;
            int i5 = i4 % 128;
            IPostMessageServiceStubProxy = i5;
            int i6 = i4 % 2;
            if (iHashCode != 49) {
                int i7 = i5 + 89;
                IPostMessageService_Parcel = i7 % 128;
                int i8 = i7 % 2;
                if (iHashCode == 50) {
                    a(-TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), new Object[1]);
                    if (!str.equals(((String) r4[0]).intern())) {
                        return nativeAdsDto;
                    }
                } else if (iHashCode != 3707) {
                    if (iHashCode != 3708) {
                        return nativeAdsDto;
                    }
                    Object[] objArr2 = new Object[1];
                    b(new char[]{9865, 51864, 9983, 1289, 9147, 60164}, 1 - View.resolveSizeAndState(0, 0, 0), objArr2);
                    if (!str.equals(((String) objArr2[0]).intern())) {
                        return nativeAdsDto;
                    }
                } else if (!str.equals("v1")) {
                    return nativeAdsDto;
                }
                Object[] objArr3 = new Object[1];
                a(1 - Color.argb(0, 0, 0, 0), 1 - View.resolveSize(0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
                strIntern = ((String) objArr3[0]).intern();
            } else {
                Object[] objArr4 = new Object[1];
                a(TextUtils.lastIndexOf("", '0') + 1, AndroidCharacter.getMirror('0') - '/', (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49683), objArr4);
                if (!str.equals(((String) objArr4[0]).intern())) {
                    int i9 = IPostMessageService_Parcel + 69;
                    IPostMessageServiceStubProxy = i9 % 128;
                    if (i9 % 2 != 0) {
                        return nativeAdsDto;
                    }
                    int i10 = 4 / 5;
                    return nativeAdsDto;
                }
            }
        } else if (!str.equals("")) {
            return nativeAdsDto;
        }
        return Intrinsics.areEqual(nativeAdsDto.onWarmupCompleted(), strIntern) ? nativeAdsDto : nativeAdsDto.onExtraCallback(strIntern);
    }

    private final NativeAdsDto onWarmupCompleted(NativeAdsDto nativeAdsDto) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 91;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        MediationPriority mediationPriority = (MediationPriority) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -674206288, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 674206302, new Object[]{this}, iOnExtraCallbackWithResult);
        if (mediationPriority != null) {
            return NativeAdsDto.onExtraCallbackWithResult(nativeAdsDto, null, null, null, null, null, NativeAdsDto.ExtraInfo.onNavigationEvent(nativeAdsDto.onTransact(), null, null, null, false, null, NativeAdsDto.Mediation.onExtraCallbackWithResult(nativeAdsDto.onTransact().onNavigationEvent(), null, CollectionsKt.listOf(mediationPriority.name()), null, null, null, null, 61, null), null, 95, null), 31, null);
        }
        int i4 = IPostMessageService_Parcel + 87;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return nativeAdsDto;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Object next;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        int i = 2 % 2;
        if (nativeAdsManager.IAuthTabCallbackDefault.onExtraCallback("debug_forced_mediation_source_expires_at", 0L) <= System.currentTimeMillis()) {
            nativeAdsManager.access000();
            return null;
        }
        String strIAuthTabCallback = nativeAdsManager.IAuthTabCallbackDefault.IAuthTabCallback("debug_forced_mediation_source");
        if (strIAuthTabCallback == null) {
            int i2 = IPostMessageService_Parcel;
            int i3 = i2 + 37;
            IPostMessageServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            IPostMessageServiceStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        Iterator it = MediationPriority.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((MediationPriority) next).name(), strIAuthTabCallback)) {
                int i7 = IPostMessageServiceStubProxy + 119;
                IPostMessageService_Parcel = i7 % 128;
                int i8 = i7 % 2;
                break;
            }
        }
        MediationPriority mediationPriority = (MediationPriority) next;
        if (mediationPriority != null) {
            return mediationPriority;
        }
        nativeAdsManager.access000();
        return null;
    }

    private final void access000() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 15;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault.onTransact("debug_forced_mediation_source");
        this.IAuthTabCallbackDefault.onTransact("debug_forced_mediation_source_expires_at");
        int i4 = IPostMessageService_Parcel + 103;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[1];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 11;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return nativeAdsManager.asInterface(nativeAdsManager.IAuthTabCallback(nativeAdsManager.onWarmupCompleted(nativeAdsManager.onExtraCallbackWithResult(nativeAdsDto))));
        }
        nativeAdsManager.asInterface(nativeAdsManager.IAuthTabCallback(nativeAdsManager.onWarmupCompleted(nativeAdsManager.onExtraCallbackWithResult(nativeAdsDto))));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final NativeAdsDto IAuthTabCallback(NativeAdsDto nativeAdsDto) throws Throwable {
        Object obj;
        boolean zAsBinder;
        int i = 2 % 2;
        String str = this.writeTypedObject;
        Object obj2 = null;
        if (str != null) {
            int i2 = IPostMessageServiceStubProxy + 3;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(new JSONObject(str));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onExtraCallback(obj)) {
                    int i4 = IPostMessageServiceStubProxy + 103;
                    IPostMessageService_Parcel = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 % 2;
                    }
                    obj = null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    Double dOnNavigationEvent = onNavigationEvent(jSONObject, "skippableOffsetSeconds");
                    Double dOnNavigationEvent2 = onNavigationEvent(jSONObject, "refetchSeconds");
                    if (dOnNavigationEvent2 != null) {
                        int i6 = IPostMessageService_Parcel + 87;
                        IPostMessageServiceStubProxy = i6 % 128;
                        int i7 = i6 % 2;
                        if (dOnNavigationEvent2.doubleValue() <= 0.0d) {
                            dOnNavigationEvent2 = null;
                        }
                        Boolean bool = (Boolean) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -815893111, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 815893136, new Object[]{this, jSONObject, "isAdBadgeEnabled"}, nSetPosition.onExtraCallbackWithResult());
                        if (dOnNavigationEvent == null && dOnNavigationEvent2 == null) {
                            int i8 = IPostMessageServiceStubProxy + 35;
                            IPostMessageService_Parcel = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        NativeAdsDto.ExtraInfo extraInfoOnTransact = nativeAdsDto.onTransact();
                        if (dOnNavigationEvent == null) {
                            dOnNavigationEvent = nativeAdsDto.onTransact().IAuthTabCallbackDefault();
                        }
                        Double d = dOnNavigationEvent;
                        if (dOnNavigationEvent2 == null) {
                            int i10 = IPostMessageService_Parcel + 11;
                            IPostMessageServiceStubProxy = i10 % 128;
                            if (i10 % 2 == 0) {
                                dOnNavigationEvent2 = nativeAdsDto.onTransact().IAuthTabCallback();
                                int i11 = 22 / 0;
                            } else {
                                dOnNavigationEvent2 = nativeAdsDto.onTransact().IAuthTabCallback();
                            }
                        }
                        Double d2 = dOnNavigationEvent2;
                        if (bool != null) {
                            zAsBinder = bool.booleanValue();
                        } else {
                            zAsBinder = nativeAdsDto.onTransact().asBinder();
                            int i12 = IPostMessageServiceStubProxy + 43;
                            IPostMessageService_Parcel = i12 % 128;
                            int i13 = i12 % 2;
                        }
                        return NativeAdsDto.onExtraCallbackWithResult(nativeAdsDto, null, null, null, null, null, NativeAdsDto.ExtraInfo.onNavigationEvent(extraInfoOnTransact, null, d, null, zAsBinder, d2, null, null, 101, null), 31, null);
                    }
                }
            }
        }
        int i14 = IPostMessageService_Parcel + 5;
        IPostMessageServiceStubProxy = i14 % 128;
        if (i14 % 2 != 0) {
            return nativeAdsDto;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Double onNavigationEvent(JSONObject jSONObject, String str) {
        Double d;
        Object obj;
        int i = 2 % 2;
        if (jSONObject.has(str)) {
            int i2 = IPostMessageService_Parcel + 37;
            IPostMessageServiceStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (jSONObject.isNull(str)) {
                d = null;
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(Double.valueOf(jSONObject.getDouble(str)));
                    int i4 = IPostMessageService_Parcel + 47;
                    IPostMessageServiceStubProxy = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onExtraCallback(obj)) {
                    int i6 = IPostMessageServiceStubProxy + 79;
                    IPostMessageService_Parcel = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 85 / 0;
                    }
                    obj = null;
                }
                d = (Double) obj;
            }
        }
        int i8 = IPostMessageServiceStubProxy + 109;
        IPostMessageService_Parcel = i8 % 128;
        if (i8 % 2 == 0) {
            return d;
        }
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        Object obj;
        JSONObject jSONObject = (JSONObject) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        Object obj2 = null;
        if (jSONObject.has(str)) {
            if (jSONObject.isNull(str)) {
                int i2 = IPostMessageServiceStubProxy + 13;
                IPostMessageService_Parcel = i2 % 128;
                int i3 = i2 % 2;
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    obj = Result.constructor-impl(Boolean.valueOf(jSONObject.getBoolean(str)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onExtraCallback(obj)) {
                    int i4 = IPostMessageService_Parcel + 31;
                    IPostMessageServiceStubProxy = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                } else {
                    obj2 = obj;
                }
                obj2 = (Boolean) obj2;
            }
        }
        int i5 = IPostMessageServiceStubProxy + 51;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(NativeAdsDto nativeAdsDto, int i, String str, access13800<? super NativeAdsDto> access13800Var) {
        receiveFile receivefile;
        int i2 = 2 % 2;
        if (access13800Var instanceof receiveFile) {
            receivefile = (receiveFile) access13800Var;
            int i3 = receivefile.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                receivefile.label = i3 - 2147483648;
            } else {
                receivefile = new receiveFile(access13800Var);
            }
        }
        Object obj = receivefile.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = receivefile.label;
        if (i4 != 0) {
            int i5 = IPostMessageServiceStubProxy + 63;
            IPostMessageService_Parcel = i5 % 128;
            if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NativeAdsDto nativeAdsDto2 = (NativeAdsDto) receivefile.L$2;
            ResultKt.onNavigationEvent(obj);
            return nativeAdsDto2;
        }
        ResultKt.onNavigationEvent(obj);
        NativeAdsDto nativeAdsDto3 = (NativeAdsDto) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -628965044, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 628965062, new Object[]{this, nativeAdsDto}, nSetPosition.onExtraCallbackWithResult());
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(nativeAdsDto3.onExtraCallbackWithResult());
        Object obj2 = null;
        if (Intrinsics.areEqual(adAsset != null ? adAsset.IAuthTabCallbackDefault() : null, "11")) {
            receivefile.L$0 = access15400.onNavigationEvent(nativeAdsDto);
            receivefile.L$1 = access15400.onNavigationEvent(str);
            receivefile.L$2 = nativeAdsDto3;
            receivefile.I$0 = i;
            receivefile.label = 1;
            if (IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -709888601, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 709888638, new Object[]{this, nativeAdsDto3, Integer.valueOf(i), str, receivefile}, nSetPosition.onExtraCallbackWithResult()) == objOnWarmupCompleted) {
                int i6 = IPostMessageServiceStubProxy + 37;
                IPostMessageService_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
        }
        return nativeAdsDto3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final NativeAdsDto asInterface(NativeAdsDto nativeAdsDto) throws Throwable {
        int i = 2 % 2;
        NativeAdsDto.Mediation mediationOnNavigationEvent = nativeAdsDto.onTransact().onNavigationEvent();
        if (nativeAdsDto.onExtraCallbackWithResult().isEmpty() && Intrinsics.areEqual(nativeAdsDto.asInterface(), "NO_AD") && mediationOnNavigationEvent.onExtraCallbackWithResult() != null) {
            if (((AdmobAdFormat) NativeAdsDto.AdmobInfo.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{mediationOnNavigationEvent.onExtraCallbackWithResult()}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1779197038)) == AdmobAdFormat.NATIVE) {
                List<String> listIAuthTabCallbackDefault = mediationOnNavigationEvent.IAuthTabCallbackDefault();
                if (listIAuthTabCallbackDefault instanceof Collection) {
                    int i2 = IPostMessageServiceStubProxy + 13;
                    IPostMessageService_Parcel = i2 % 128;
                    if (i2 % 2 != 0) {
                        listIAuthTabCallbackDefault.isEmpty();
                        throw null;
                    }
                    if (!listIAuthTabCallbackDefault.isEmpty()) {
                        Iterator<T> it = listIAuthTabCallbackDefault.iterator();
                        int i3 = IPostMessageService_Parcel + 55;
                        IPostMessageServiceStubProxy = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 4 / 5;
                        }
                        while (it.hasNext()) {
                            if (StringsKt.equals((String) it.next(), "ADMOB", true)) {
                                NativeAdsDto.Creative.ThumbnailVideo thumbnailVideo = new NativeAdsDto.Creative.ThumbnailVideo("admob_shell_" + nativeAdsDto.IAuthTabCallbackStub(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 510, (DefaultConstructorMarker) null);
                                Object[] objArr = new Object[1];
                                a(1 - View.MeasureSpec.getSize(0), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + (-1)), objArr);
                                return NativeAdsDto.onExtraCallbackWithResult(nativeAdsDto, null, null, null, null, CollectionsKt.listOf(new NativeAdsDto.AdAsset("7", thumbnailVideo, ((String) objArr[0]).intern(), null, null, null, null, UCPApiConstants.ARAM_TIME_OUT, null)), null, 47, null);
                            }
                        }
                    }
                }
            }
        }
        return nativeAdsDto;
    }

    static /* synthetic */ void IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, NativeAdsDto nativeAdsDto, boolean z, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy;
        int i4 = i3 + 57;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0 ? (i & 4) != 0 : (i & 3) != 0) {
            int i5 = i3 + 15;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        nativeAdsManager.onExtraCallback(str, nativeAdsDto, z);
    }

    private final void onExtraCallback(String str, NativeAdsDto nativeAdsDto, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 35;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.access100.put(str, nativeAdsDto);
        IAuthTabCallback(str, nativeAdsDto);
        if (z) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 383534523, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -383534520, new Object[]{this, str, nativeAdsDto}, iOnExtraCallbackWithResult);
            int i4 = IPostMessageService_Parcel + 79;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        onUnminimized(str);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[2];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 121;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        asInterface asinterfaceOnNavigationEvent = nativeAdsManager.onNavigationEvent(nativeAdsDto);
        if (asinterfaceOnNavigationEvent == null) {
            return null;
        }
        onNavigationEvent(nativeAdsManager, str, nativeAdsDto, asinterfaceOnNavigationEvent.onExtraCallbackWithResult(), null, asinterfaceOnNavigationEvent.onWarmupCompleted(), asinterfaceOnNavigationEvent.onExtraCallback(), 8, null);
        int i4 = IPostMessageService_Parcel + 25;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final asInterface onNavigationEvent(NativeAdsDto nativeAdsDto) {
        int i = 2 % 2;
        NativeAdsDto.Mediation mediationOnNavigationEvent = nativeAdsDto.onTransact().onNavigationEvent();
        if (!IAuthTabCallback(mediationOnNavigationEvent)) {
            return null;
        }
        List<String> listIAuthTabCallbackDefault = mediationOnNavigationEvent.IAuthTabCallbackDefault();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallbackDefault, 10));
        Iterator<T> it = listIAuthTabCallbackDefault.iterator();
        while (it.hasNext()) {
            String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            arrayList.add(upperCase);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            if (Intrinsics.areEqual(str, "TOSS") || Intrinsics.areEqual(str, "ADMOB")) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i2 = IPostMessageService_Parcel + 67;
            IPostMessageServiceStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (!nativeAdsDto.onExtraCallbackWithResult().isEmpty()) {
                return new asInterface("TOSS", null, null, 6, null);
            }
            asInterface asinterface = new asInterface(null, "NO_AD", null, 4, null);
            int i4 = IPostMessageService_Parcel + 81;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return asinterface;
        }
        Iterator it2 = arrayList2.iterator();
        String str2 = null;
        AdMobFailedReason typedObject = null;
        while (it2.hasNext()) {
            int i6 = IPostMessageService_Parcel + 69;
            IPostMessageServiceStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (Intrinsics.areEqual((String) it2.next(), "TOSS")) {
                if (!nativeAdsDto.onExtraCallbackWithResult().isEmpty()) {
                    return new asInterface("TOSS", null, typedObject, 2, null);
                }
                str2 = "NO_AD";
            } else if (!Intrinsics.areEqual(r6, "ADMOB")) {
                continue;
            } else {
                int i8 = IPostMessageService_Parcel + 73;
                IPostMessageServiceStubProxy = i8 % 128;
                int i9 = i8 % 2;
                NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediationOnNavigationEvent.onExtraCallbackWithResult();
                if (admobInfoOnExtraCallbackWithResult != null) {
                    int i10 = IPostMessageService_Parcel + 17;
                    IPostMessageServiceStubProxy = i10 % 128;
                    int i11 = i10 % 2;
                    if (((AdmobAdFormat) NativeAdsDto.AdmobInfo.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{admobInfoOnExtraCallbackWithResult}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1779197038)) == AdmobAdFormat.NATIVE) {
                        return null;
                    }
                    typedObject = readTypedObject();
                } else {
                    continue;
                }
            }
        }
        return new asInterface(null, str2, typedObject);
    }

    private final boolean IAuthTabCallback(NativeAdsDto.Mediation mediation) {
        int i = 2 % 2;
        Object obj = null;
        if (StringsKt.isBlank(mediation.IAuthTabCallbackStub())) {
            int i2 = IPostMessageServiceStubProxy + 115;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                mediation.IAuthTabCallbackDefault().isEmpty();
                obj.hashCode();
                throw null;
            }
            if (mediation.IAuthTabCallbackDefault().isEmpty()) {
                int i3 = IPostMessageServiceStubProxy + 57;
                IPostMessageService_Parcel = i3 % 128;
                int i4 = i3 % 2;
                if (mediation.onExtraCallbackWithResult() == null) {
                    int i5 = IPostMessageServiceStubProxy + 101;
                    IPostMessageService_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
            }
        }
        int i7 = IPostMessageServiceStubProxy + 97;
        IPostMessageService_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    private final AdMobFailedReason readTypedObject() {
        int i = 2 % 2;
        AdMobFailedReason adMobFailedReason = new AdMobFailedReason("FILTERED", CollectionsKt.listOf("INVALID_ADMOB_TYPE"), (String) null, (AdmobError) null, 12, (DefaultConstructorMarker) null);
        int i2 = IPostMessageService_Parcel + 121;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return adMobFailedReason;
        }
        throw null;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        Context context = (Context) objArr[1];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[2];
        deleteProfile deleteprofile = (deleteProfile) objArr[3];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 37;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (!(true ^ nativeAdsDto.access100())) {
            return NativeAdsFullBannerV2Activity.Companion.IAuthTabCallback(context, nativeAdsDto, deleteprofile, nativeAdsManager.prefetchWithMultipleUrls);
        }
        Intent intentOnExtraCallbackWithResult = NativeAdsFullBannerActivity.Companion.onExtraCallbackWithResult(context, nativeAdsDto, deleteprofile, nativeAdsManager.prefetchWithMultipleUrls);
        int i4 = IPostMessageServiceStubProxy + 53;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return intentOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Intent IAuthTabCallback(Context context, NativeAdsDto nativeAdsDto, deleteProfile deleteprofile) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 45;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (nativeAdsDto.access100()) {
            int i4 = IPostMessageServiceStubProxy + 29;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                return NativeAdsFullPageV2Activity.Companion.onWarmupCompleted(context, nativeAdsDto, deleteprofile, this.prefetchWithMultipleUrls);
            }
            NativeAdsFullPageV2Activity.Companion.onWarmupCompleted(context, nativeAdsDto, deleteprofile, this.prefetchWithMultipleUrls);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return NativeAdsFullPageActivity.Companion.onExtraCallback(context, nativeAdsDto, deleteprofile, this.prefetchWithMultipleUrls);
    }

    private final Intent onExtraCallback(Context context, NativeAdsDto nativeAdsDto, deleteProfile deleteprofile) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 83;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            if (!nativeAdsDto.access100()) {
                return NativeAdsShortVideoActivity.Companion.IAuthTabCallback(context, nativeAdsDto, deleteprofile, this.prefetchWithMultipleUrls);
            }
            int i3 = IPostMessageService_Parcel + 93;
            IPostMessageServiceStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return NativeAdsShortVideoV2Activity.Companion.onExtraCallbackWithResult(context, nativeAdsDto, deleteprofile, this.prefetchWithMultipleUrls);
            }
            NativeAdsShortVideoV2Activity.Companion.onExtraCallbackWithResult(context, nativeAdsDto, deleteprofile, this.prefetchWithMultipleUrls);
            throw null;
        }
        nativeAdsDto.access100();
        throw null;
    }

    static /* synthetic */ Intent onExtraCallback(NativeAdsManager nativeAdsManager, Context context, NativeAdsDto nativeAdsDto, String str, int i, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IPostMessageServiceStubProxy + 73;
        int i5 = i4 % 128;
        IPostMessageService_Parcel = i5;
        int i6 = i4 % 2;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i7 = i;
        if ((i2 & 16) != 0) {
            int i8 = i5 + 107;
            IPostMessageServiceStubProxy = i8 % 128;
            str2 = "";
            if (i8 % 2 == 0) {
                int i9 = 19 / 0;
            }
        }
        return nativeAdsManager.onExtraCallback(context, nativeAdsDto, str, i7, str2);
    }

    private final Intent onExtraCallback(Context context, NativeAdsDto nativeAdsDto, String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy + 51;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intent intentOnExtraCallbackWithResult = NativeAdsPlayableAdActivity.Companion.onExtraCallbackWithResult(context, nativeAdsDto, str, this.prefetchWithMultipleUrls, Integer.valueOf(i), str2);
        int i5 = IPostMessageService_Parcel + 121;
        IPostMessageServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return intentOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        AppCompatActivity appCompatActivity = (AppCompatActivity) objArr[1];
        String str = (String) objArr[2];
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[3];
        Intent intent = (Intent) objArr[4];
        setTrimPathOffset settrimpathoffset = (setTrimPathOffset) objArr[5];
        int i = 2 % 2;
        getPlatformCallback.IAuthTabCallback.onExtraCallbackWithResult(nativeAdsDto.IAuthTabCallbackStub(), nativeAdsManager);
        setTrimPathOffset settrimpathoffsetOnExtraCallbackWithResult = nativeAdsManager.onExtraCallbackWithResult(str, settrimpathoffset);
        nativeAdsManager.IAuthTabCallback_Parcel(str);
        nativeAdsManager.asInterface.remove(str);
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1197578342, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1197578330, new Object[]{nativeAdsManager, str, settrimpathoffsetOnExtraCallbackWithResult}, iOnExtraCallbackWithResult);
        try {
            appCompatActivity.startActivity(intent);
            maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor(nativeAdsManager), putChannelInfo.onExtraCallback(), (setRandomHost) null, new ICustomTabsServiceStub(null, settrimpathoffsetOnExtraCallbackWithResult, nativeAdsDto), 2, (Object) null);
            int i2 = IPostMessageServiceStubProxy + 113;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Throwable th) {
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 731593341, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -731593321, new Object[]{nativeAdsManager, str}, iOnExtraCallbackWithResult2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e A[PHI: r0
      0x008e: PHI (r0v28 java.lang.String) = (r0v27 java.lang.String), (r0v29 java.lang.String) binds: [B:14:0x008b, B:11:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull AppCompatActivity appCompatActivity, @NotNull String str, @NotNull setTrimPathOffset settrimpathoffset) throws Throwable {
        String strIAuthTabCallbackStub;
        String strIAuthTabCallbackStub2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(settrimpathoffset, "");
        String strOnRelationshipValidationResult = onRelationshipValidationResult(str);
        if (((getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{this, new ICustomTabsServiceDefault(strOnRelationshipValidationResult, settrimpathoffset, appCompatActivity, null)}, nSetPosition.onExtraCallbackWithResult())) == null) {
            int i2 = IPostMessageServiceStubProxy + 121;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                addOnAdapterChangeListener addonadapterchangelistener = addOnAdapterChangeListener.AD_NOT_LOADED;
                addonadapterchangelistener.getCode();
                Intrinsics.checkNotNullExpressionValue(appCompatActivity.getString(addonadapterchangelistener.getMessageRes()), "");
                this.asInterface.get(strOnRelationshipValidationResult);
                throw null;
            }
            addOnAdapterChangeListener addonadapterchangelistener2 = addOnAdapterChangeListener.AD_NOT_LOADED;
            int code = addonadapterchangelistener2.getCode();
            String string = appCompatActivity.getString(addonadapterchangelistener2.getMessageRes());
            Intrinsics.checkNotNullExpressionValue(string, "");
            NativeAdsDto nativeAdsDto = this.asInterface.get(strOnRelationshipValidationResult);
            if (nativeAdsDto != null) {
                int i3 = IPostMessageServiceStubProxy + 15;
                IPostMessageService_Parcel = i3 % 128;
                if (i3 % 2 != 0) {
                    strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub();
                    int i4 = 40 / 0;
                    if (strIAuthTabCallbackStub2 == null) {
                        NativeAdsDto nativeAdsDto2 = this.access100.get(strOnRelationshipValidationResult);
                        strIAuthTabCallbackStub = nativeAdsDto2 != null ? nativeAdsDto2.IAuthTabCallbackStub() : null;
                    } else {
                        strIAuthTabCallbackStub = strIAuthTabCallbackStub2;
                    }
                } else {
                    strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub();
                    if (strIAuthTabCallbackStub2 == null) {
                    }
                }
                IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -275099588, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 275099617, new Object[]{this, settrimpathoffset, new NativeAdsError(code, string, (String) null, strIAuthTabCallbackStub, 4, (DefaultConstructorMarker) null)}, nSetPosition.onExtraCallbackWithResult());
            }
        }
        int i5 = IPostMessageServiceStubProxy + 89;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
    }

    public final void onExtraCallback(@NotNull calculatePageOffsets.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 3;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            zzaj.onNavigationEvent().MediaMetadataCompat();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (zzaj.onNavigationEvent().MediaMetadataCompat()) {
            int i3 = IPostMessageServiceStubProxy + 19;
            IPostMessageService_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                this.isEngagementSignalsApiAvailable.onWarmupCompleted(onextracallbackwithresult);
                this.postMessage = onextracallbackwithresult;
            } else {
                this.isEngagementSignalsApiAvailable.onWarmupCompleted(onextracallbackwithresult);
                this.postMessage = onextracallbackwithresult;
                int i4 = 28 / 0;
            }
        }
    }

    public final void onWarmupCompleted(@NotNull calculatePageOffsets.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 61;
        IPostMessageService_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.isEngagementSignalsApiAvailable.IAuthTabCallback(onextracallbackwithresult);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.isEngagementSignalsApiAvailable.IAuthTabCallback(onextracallbackwithresult);
        if (this.postMessage == onextracallbackwithresult) {
            this.postMessage = null;
        }
        int i3 = IPostMessageServiceStubProxy + 65;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        ExposureContent exposureContent = (ExposureContent) objArr[6];
        String str6 = (String) objArr[7];
        AdMobFailedReason adMobFailedReason = (AdMobFailedReason) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        Object obj = objArr[10];
        int i = 2 % 2;
        if ((iIntValue & 8) != 0) {
            str4 = null;
        }
        if ((iIntValue & 16) != 0) {
            str5 = null;
        }
        if ((iIntValue & 32) != 0) {
            int i2 = IPostMessageService_Parcel + 119;
            IPostMessageServiceStubProxy = i2 % 128;
            int i3 = i2 % 2;
            exposureContent = null;
        }
        if ((iIntValue & 64) != 0) {
            int i4 = IPostMessageService_Parcel + 57;
            IPostMessageServiceStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str6 = null;
        }
        if ((iIntValue & 128) != 0) {
            adMobFailedReason = null;
        }
        return (CharSequence) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 772268527, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -772268510, new Object[]{nativeAdsManager, str, str2, str3, str4, str5, exposureContent, str6, adMobFailedReason}, nSetPosition.onExtraCallbackWithResult());
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        List<String> listOnExtraCallbackWithResult;
        SpannableStringBuilder spannableStringBuilderAppend;
        List<String> list;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        CharSequence charSequence3;
        Function1 function1;
        int i2;
        AdMobPaidAdValue adMobPaidAdValueIAuthTabCallback;
        String strOnWarmupCompleted;
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        String str6 = (String) objArr[5];
        ExposureContent exposureContent = (ExposureContent) objArr[6];
        String str7 = (String) objArr[7];
        AdMobFailedReason adMobFailedReason = (AdMobFailedReason) objArr[8];
        int i3 = 2 % 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str8 = "[MEDIATION][" + str2 + "] ";
        spannableStringBuilder.append((CharSequence) str8);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#8B95A1")), 0, str8.length(), 33);
        spannableStringBuilder.append((CharSequence) "space=").append((CharSequence) str3);
        spannableStringBuilder.append((CharSequence) " requestId=").append((CharSequence) str4);
        List<String> list2 = null;
        if (str5 != null) {
            int i4 = IPostMessageServiceStubProxy + 49;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                StringsKt.isBlank(str5);
                throw null;
            }
            if (true ^ StringsKt.isBlank(str5)) {
                spannableStringBuilder.append((CharSequence) " event=").append((CharSequence) str5);
            }
        }
        if (str6 != null && !StringsKt.isBlank(str6)) {
            spannableStringBuilder.append((CharSequence) " winner=").append((CharSequence) str6);
        }
        if (exposureContent != null) {
            int i5 = IPostMessageService_Parcel + 67;
            IPostMessageServiceStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                exposureContent.onNavigationEvent();
                throw null;
            }
            String strOnNavigationEvent = exposureContent.onNavigationEvent();
            if (strOnNavigationEvent != null) {
                if (StringsKt.isBlank(strOnNavigationEvent)) {
                    int i6 = IPostMessageService_Parcel + 29;
                    IPostMessageServiceStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                    strOnNavigationEvent = null;
                }
                if (strOnNavigationEvent != null) {
                    int i8 = IPostMessageService_Parcel + 29;
                    IPostMessageServiceStubProxy = i8 % 128;
                    int i9 = i8 % 2;
                    spannableStringBuilder.append((CharSequence) " responseId=").append((CharSequence) strOnNavigationEvent);
                }
            }
        }
        if (exposureContent != null && (strOnWarmupCompleted = exposureContent.onWarmupCompleted()) != null) {
            if (StringsKt.isBlank(strOnWarmupCompleted)) {
                int i10 = IPostMessageService_Parcel + 53;
                IPostMessageServiceStubProxy = i10 % 128;
                int i11 = i10 % 2;
                strOnWarmupCompleted = null;
            }
            if (strOnWarmupCompleted != null) {
                spannableStringBuilder.append((CharSequence) " source=").append((CharSequence) strOnWarmupCompleted);
            }
        }
        if (exposureContent != null && (adMobPaidAdValueIAuthTabCallback = exposureContent.IAuthTabCallback()) != null) {
            SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilder.append((CharSequence) " valueMicros=");
            Long lOnExtraCallbackWithResult = adMobPaidAdValueIAuthTabCallback.onExtraCallbackWithResult();
            String strValueOf = lOnExtraCallbackWithResult != null ? String.valueOf(lOnExtraCallbackWithResult.longValue()) : null;
            if (strValueOf == null) {
                int i12 = IPostMessageServiceStubProxy + 23;
                IPostMessageService_Parcel = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 68 / 0;
                }
                strValueOf = "";
            }
            spannableStringBuilderAppend2.append((CharSequence) strValueOf);
            spannableStringBuilder.append((CharSequence) " currency=").append((CharSequence) adMobPaidAdValueIAuthTabCallback.IAuthTabCallback());
            spannableStringBuilder.append((CharSequence) " precision=").append((CharSequence) adMobPaidAdValueIAuthTabCallback.onWarmupCompleted());
        }
        if (str7 != null) {
            int i14 = IPostMessageServiceStubProxy + 29;
            IPostMessageService_Parcel = i14 % 128;
            int i15 = i14 % 2;
            if (StringsKt.isBlank(str7)) {
                str7 = null;
            }
            if (str7 != null) {
                spannableStringBuilder.append((CharSequence) " tossFailed=").append((CharSequence) str7);
            }
        }
        if (adMobFailedReason != null) {
            int i16 = IPostMessageServiceStubProxy + 55;
            IPostMessageService_Parcel = i16 % 128;
            int i17 = i16 % 2;
            String strOnTransact = adMobFailedReason.onTransact();
            if (strOnTransact != null) {
                if (StringsKt.isBlank(strOnTransact)) {
                    strOnTransact = null;
                }
                if (strOnTransact != null) {
                    spannableStringBuilder.append((CharSequence) " adMobFailed=").append((CharSequence) strOnTransact);
                }
            }
        }
        if (adMobFailedReason != null && (listOnExtraCallbackWithResult = adMobFailedReason.onExtraCallbackWithResult()) != null) {
            if (!listOnExtraCallbackWithResult.isEmpty()) {
                int i18 = IPostMessageServiceStubProxy + 69;
                IPostMessageService_Parcel = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
                list2 = listOnExtraCallbackWithResult;
            }
            if (list2 != null) {
                int i19 = IPostMessageServiceStubProxy + 61;
                IPostMessageService_Parcel = i19 % 128;
                if (i19 % 2 != 0) {
                    spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) " filters=");
                    list = list2;
                    str = "|";
                    charSequence = null;
                    charSequence2 = null;
                    i = 1;
                    charSequence3 = null;
                    function1 = null;
                    i2 = 105;
                } else {
                    spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) " filters=");
                    list = list2;
                    str = "|";
                    charSequence = null;
                    charSequence2 = null;
                    i = 0;
                    charSequence3 = null;
                    function1 = null;
                    i2 = 62;
                }
                spannableStringBuilderAppend.append((CharSequence) CollectionsKt.joinToString$default(list, str, charSequence, charSequence2, i, charSequence3, function1, i2, (Object) null));
            }
        }
        return spannableStringBuilder;
    }

    static /* synthetic */ CharSequence onNavigationEvent(NativeAdsManager nativeAdsManager, String str, boolean z, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        String str5;
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy;
        int i4 = i3 + 21;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0 ? (i & 8) == 0 : (i & 73) == 0) {
            str5 = str3;
        } else {
            int i5 = i3 + 77;
            int i6 = i5 % 128;
            IPostMessageService_Parcel = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 95;
            IPostMessageServiceStubProxy = i8 % 128;
            int i9 = i8 % 2;
            str5 = null;
        }
        return nativeAdsManager.onExtraCallbackWithResult(str, z, str2, str5, (i & 16) != 0 ? null : str4);
    }

    private final CharSequence onExtraCallbackWithResult(String str, boolean z, String str2, String str3, String str4) throws Throwable {
        Object obj;
        int i = 2 % 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            Object[] objArr = new Object[1];
            b(new char[]{37859, 21927, 37808, 39505, 35128, 5693, 14101, 22975, 44330, 23515, 52156}, View.MeasureSpec.getMode(0) + 1, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            b(new char[]{32287, 58932, 32345, 10710, 48453, 8778, 4469, 32720}, KeyEvent.getDeadChar(0, 0) + 1, objArr2);
            obj = objArr2[0];
        }
        String str5 = "[MEDIATION][" + str + "][" + ((String) obj).intern() + "] ";
        spannableStringBuilder.append((CharSequence) str5);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(z ? "#4ADE80" : "#F87171")), 0, str5.length(), 33);
        spannableStringBuilder.append((CharSequence) str2);
        if (str3 != null && !StringsKt.isBlank(str3)) {
            int i2 = IPostMessageServiceStubProxy + 7;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                spannableStringBuilder.append((CharSequence) " event=").append((CharSequence) str3);
                throw null;
            }
            spannableStringBuilder.append((CharSequence) " event=").append((CharSequence) str3);
            int i3 = IPostMessageService_Parcel + 105;
            IPostMessageServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        if (str4 != null) {
            int i5 = IPostMessageServiceStubProxy + 95;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if (!StringsKt.isBlank(str4)) {
                spannableStringBuilder.append((CharSequence) " error=").append((CharSequence) str4);
            }
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsManager nativeAdsManager, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, String str, Set set, ViewGroup viewGroup, addNewItem addnewitem, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, int i, Object obj) throws Throwable {
        ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl2;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IPostMessageService_Parcel + 65;
            IPostMessageServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
            set = Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback();
        }
        Set set2 = set;
        ViewGroup viewGroup2 = (i & 8) != 0 ? null : viewGroup;
        if ((i & 16) != 0) {
            int i5 = IPostMessageService_Parcel + 123;
            IPostMessageServiceStubProxy = i5 % 128;
            int i6 = i5 % 2;
            addnewitem = addNewItem.TURNKEY;
        }
        addNewItem addnewitem2 = addnewitem;
        if ((i & 32) != 0) {
            int i7 = IPostMessageService_Parcel + 95;
            IPostMessageServiceStubProxy = i7 % 128;
            int i8 = i7 % 2;
            viewPager2LinearLayoutManagerImpl2 = null;
        } else {
            viewPager2LinearLayoutManagerImpl2 = viewPager2LinearLayoutManagerImpl;
        }
        nativeAdsManager.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, str, set2, viewGroup2, addnewitem2, viewPager2LinearLayoutManagerImpl2);
    }

    static final class writeTypedList extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        writeTypedList(access13800<? super writeTypedList> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            writeTypedList writetypedlistCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return writetypedlistCreate.invokeSuspend(unit);
            }
            writetypedlistCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedList writetypedlist = NativeAdsManager.this.new writeTypedList(access13800Var);
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 66 / 0;
            }
            return writetypedlist;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            getPackageType getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(NativeAdsManager.this);
            if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
                int i4 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull String str, @NotNull Set<String> set, @Nullable ViewGroup viewGroup, @NotNull addNewItem addnewitem, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 93;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(addnewitem, "");
        onExtraCallback(CollectionsKt.emptyList(), str, set, addnewitem, viewPager2LinearLayoutManagerImpl);
        onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
        this.access100.clear();
        getPackageType getpackagetype = this.onUnminimized.get("native_ad_batch");
        if (getpackagetype != null) {
            int i4 = IPostMessageServiceStubProxy + 17;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.onUnminimized.put("native_ad_batch", (getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{this, new writeTypedList(null)}, nSetPosition.onExtraCallbackWithResult()));
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult)).onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0);
        if (viewGroup != null) {
            onWarmupCompleted(viewGroup);
        }
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[1];
        List<? extends addOnPageChangeListener> list = (List) objArr[2];
        String str = (String) objArr[3];
        Set<String> setOnExtraCallback = (Set) objArr[4];
        ViewGroup viewGroup = (ViewGroup) objArr[5];
        asBinder asbinder = (asBinder) objArr[6];
        addNewItem addnewitem = (addNewItem) objArr[7];
        ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl = (ViewPager2LinearLayoutManagerImpl) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        Object obj = objArr[10];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 89;
        int i3 = i2 % 128;
        IPostMessageServiceStubProxy = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 8) != 0) {
            int i5 = i3 + 15;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            setOnExtraCallback = Animatable2CompatAnimationCallback.onExtraCallback.onExtraCallback();
        }
        if ((iIntValue & 16) != 0) {
            viewGroup = null;
        }
        if ((iIntValue & 32) != 0) {
            int i7 = IPostMessageServiceStubProxy + 83;
            IPostMessageService_Parcel = i7 % 128;
            int i8 = i7 % 2;
            asbinder = null;
        }
        if ((iIntValue & 64) != 0) {
            addnewitem = addNewItem.TURNKEY;
        }
        if ((iIntValue & 128) != 0) {
            viewPager2LinearLayoutManagerImpl = null;
        }
        nativeAdsManager.onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, list, str, setOnExtraCallback, viewGroup, asbinder, addnewitem, viewPager2LinearLayoutManagerImpl);
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull List<? extends addOnPageChangeListener> list, @NotNull String str, @NotNull Set<String> set, @Nullable ViewGroup viewGroup, @Nullable asBinder asbinder, @NotNull addNewItem addnewitem, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(addnewitem, "");
        List<? extends addOnPageChangeListener> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        int i2 = IPostMessageServiceStubProxy + 77;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = IPostMessageService_Parcel + 93;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(onTransact.Companion.onNavigationEvent((addOnPageChangeListener) it.next()));
        }
        onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, (List<onTransact>) arrayList, str, set, viewGroup, asbinder, addnewitem, viewPager2LinearLayoutManagerImpl, false);
    }

    public final void IAuthTabCallback(@NotNull List<? extends addOnPageChangeListener> list) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<? extends addOnPageChangeListener> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        int i2 = IPostMessageServiceStubProxy + 83;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = IPostMessageServiceStubProxy + 53;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(onTransact.Companion.onNavigationEvent((addOnPageChangeListener) it.next()));
        }
        onWarmupCompleted(arrayList);
    }

    static final class ICustomTabsService extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ boolean $fetchOnInit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsService(boolean z, access13800<? super ICustomTabsService> access13800Var) {
            super(2, access13800Var);
            this.$fetchOnInit = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsService iCustomTabsService = NativeAdsManager.this.new ICustomTabsService(this.$fetchOnInit, access13800Var);
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iCustomTabsService;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = 58 / 0;
            } else {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            getPackageType getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(NativeAdsManager.this);
            if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                int i4 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
                }
            }
            if (this.$fetchOnInit) {
                int i5 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2123829058, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2123829056, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult());
                    throw null;
                }
                NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2123829058, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2123829056, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult());
            }
            return Unit.INSTANCE;
        }
    }

    private final void onWarmupCompleted(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, List<onTransact> list, String str, Set<String> set, ViewGroup viewGroup, asBinder asbinder, addNewItem addnewitem, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, boolean z) throws Throwable {
        int i = 2 % 2;
        List<onTransact> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = IPostMessageServiceStubProxy + 35;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.add(((onTransact) it.next()).onTransact());
                int i3 = 79 / 0;
            } else {
                arrayList.add(((onTransact) it.next()).onTransact());
            }
        }
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1447398757, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1447398733, new Object[]{this, arrayList}, iOnExtraCallbackWithResult);
        onExtraCallback(arrayList, str, set, addnewitem, viewPager2LinearLayoutManagerImpl);
        this.newSessionWithExtras = asbinder;
        onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
        this.IEngagementSignalsCallback = arrayList;
        this.access100.clear();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2036096770, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2036096806, new Object[]{this, list}, iOnExtraCallbackWithResult2);
        getPackageType getpackagetype = this.onUnminimized.get("native_ad_batch");
        if (getpackagetype != null) {
            int i4 = IPostMessageService_Parcel + 25;
            IPostMessageServiceStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.onUnminimized.put("native_ad_batch", (getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{this, new ICustomTabsService(z, null)}, nSetPosition.onExtraCallbackWithResult()));
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult3)).onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0);
        if (viewGroup != null) {
            int i5 = IPostMessageServiceStubProxy + 39;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            onWarmupCompleted(viewGroup);
        }
    }

    private final void onWarmupCompleted(List<onTransact> list) throws Throwable {
        int i = 2 % 2;
        List<onTransact> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        int i2 = IPostMessageServiceStubProxy + 115;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = IPostMessageServiceStubProxy + 5;
            IPostMessageService_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                arrayList.add(((onTransact) it.next()).onTransact());
                int i5 = 33 / 0;
            } else {
                arrayList.add(((onTransact) it.next()).onTransact());
            }
        }
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1447398757, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1447398733, new Object[]{this, arrayList}, iOnExtraCallbackWithResult);
        this.IEngagementSignalsCallback = arrayList;
        this.access100.clear();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2036096770, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2036096806, new Object[]{this, list}, iOnExtraCallbackWithResult2);
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        List<String> list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 19;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        for (String str : list) {
            int i4 = IPostMessageService_Parcel + 115;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            nativeAdsManager.onExtraCallback(str);
            nativeAdsManager.getInterfaceDescriptor(str);
            int i6 = IPostMessageService_Parcel + 81;
            IPostMessageServiceStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
        return null;
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        List<onTransact> list = (List) objArr[1];
        for (onTransact ontransact : list) {
            String strOnTransact = ontransact.onTransact();
            nativeAdsManager.onActivityLayout.put(strOnTransact, ontransact.IAuthTabCallback());
            nativeAdsManager.requestPostMessageChannel.put(strOnTransact, ontransact.onWarmupCompleted());
            nativeAdsManager.onNavigationEvent.put(strOnTransact, ontransact.onExtraCallbackWithResult());
            nativeAdsManager.access100.put(strOnTransact, null);
        }
        synchronized (nativeAdsManager) {
            for (onTransact ontransact2 : list) {
                Map<String, access100> map = nativeAdsManager.access200;
                String strOnTransact2 = ontransact2.onTransact();
                access100 access100Var = nativeAdsManager.access200.get(ontransact2.onTransact());
                if (access100Var == null) {
                    access100Var = nativeAdsManager.extraCallback;
                }
                map.put(strOnTransact2, access100.onExtraCallbackWithResult(access100Var, null, null, null, ontransact2.onExtraCallback(), ontransact2.onNavigationEvent(), null, 39, null));
            }
            Unit unit = Unit.INSTANCE;
        }
        return null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy + 117;
        int i4 = i3 % 128;
        IPostMessageService_Parcel = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 91;
            IPostMessageServiceStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                adRequestOption = nativeAdsManager.onNavigationEvent.get(str);
                int i7 = 57 / 0;
            } else {
                adRequestOption = nativeAdsManager.onNavigationEvent.get(str);
            }
        }
        if ((i & 4) != 0) {
            int i8 = IPostMessageService_Parcel + 37;
            IPostMessageServiceStubProxy = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        return nativeAdsManager.onExtraCallback(str, adRequestOption, z, (access13800<? super NativeAdsDto>) access13800Var);
    }

    static final class onRelationshipValidationResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super NativeAdsDto>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $adRequestOption;
        final /* synthetic */ String $spaceUnitId;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onRelationshipValidationResult(String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, access13800<? super onRelationshipValidationResult> access13800Var) {
            super(2, access13800Var);
            this.$spaceUnitId = str;
            this.$adRequestOption = adRequestOption;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onRelationshipValidationResult onrelationshipvalidationresult = NativeAdsManager.this.new onRelationshipValidationResult(this.$spaceUnitId, this.$adRequestOption, access13800Var);
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onrelationshipvalidationresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super NativeAdsDto> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onRelationshipValidationResult onrelationshipvalidationresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onrelationshipvalidationresultCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onrelationshipvalidationresultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    NativeAdsManager nativeAdsManager = NativeAdsManager.this;
                    String str = this.$spaceUnitId;
                    GetNativeAdsRequestBody.AdRequestOption adRequestOption = this.$adRequestOption;
                    Result.Companion companion = Result.Companion;
                    getPackageType getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(nativeAdsManager);
                    if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                        int i4 = onExtraCallback + 77;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 0, (Object) null);
                        } else {
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
                        }
                    }
                    if (adRequestOption == null) {
                        int i5 = onExtraCallback + 89;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            adRequestOption = (GetNativeAdsRequestBody.AdRequestOption) NativeAdsManager.IAuthTabCallback(nativeAdsManager).get(str);
                            int i6 = 85 / 0;
                        } else {
                            adRequestOption = (GetNativeAdsRequestBody.AdRequestOption) NativeAdsManager.IAuthTabCallback(nativeAdsManager).get(str);
                        }
                    }
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = NativeAdsManager.onWarmupCompleted(nativeAdsManager, str, adRequestOption, 0, (String) null, (access13800) this, 12, (Object) null);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
                i = onExtraCallback + 125;
                onWarmupCompleted = i % 128;
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                i = onWarmupCompleted + 13;
                onExtraCallback = i % 128;
            } catch (CancellationException e3) {
                throw e3;
            }
            int i7 = i % 2;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                return null;
            }
            int i8 = onExtraCallback + 29;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 59 / 0;
            }
            return obj2;
        }
    }

    static final class onUnminimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ NativeAdsDto $ad;
        final /* synthetic */ String $spaceUnitId;
        int label;
        final /* synthetic */ NativeAdsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onUnminimized(NativeAdsDto nativeAdsDto, NativeAdsManager nativeAdsManager, String str, access13800<? super onUnminimized> access13800Var) {
            super(2, access13800Var);
            this.$ad = nativeAdsDto;
            this.this$0 = nativeAdsManager;
            this.$spaceUnitId = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onUnminimized onunminimized = new onUnminimized(this.$ad, this.this$0, this.$spaceUnitId, access13800Var);
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onunminimized;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            NativeAdsDto nativeAdsDto = this.$ad;
            if (nativeAdsDto == null) {
                int i3 = onExtraCallback + 121;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult())).put(this.$spaceUnitId, null);
                    throw null;
                }
                ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult())).put(this.$spaceUnitId, null);
            } else {
                NativeAdsManager.onWarmupCompleted(this.this$0, this.$spaceUnitId, nativeAdsDto, true);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 97;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull String str, @Nullable GetNativeAdsRequestBody.AdRequestOption adRequestOption, boolean z, @NotNull access13800<? super NativeAdsDto> access13800Var) {
        ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy;
        NativeAdsDto nativeAdsDto;
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 101;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
            if (access13800Var instanceof ICustomTabsCallbackStubProxy) {
                iCustomTabsCallbackStubProxy = (ICustomTabsCallbackStubProxy) access13800Var;
                int i4 = iCustomTabsCallbackStubProxy.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    iCustomTabsCallbackStubProxy.label = i4 - 2147483648;
                } else {
                    iCustomTabsCallbackStubProxy = new ICustomTabsCallbackStubProxy(access13800Var);
                }
            }
        } else if (access13800Var instanceof ICustomTabsCallbackStubProxy) {
        }
        Object obj = iCustomTabsCallbackStubProxy.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iCustomTabsCallbackStubProxy.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            nativeAdsDto = this.access100.get(str);
            if (nativeAdsDto != null) {
                this.isEngagementSignalsApiAvailable.IAuthTabCallback(nativeAdsDto.IAuthTabCallbackStub());
            }
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onRelationshipValidationResult onrelationshipvalidationresult = new onRelationshipValidationResult(str, adRequestOption, null);
            iCustomTabsCallbackStubProxy.L$0 = str;
            iCustomTabsCallbackStubProxy.L$1 = access15400.onNavigationEvent(adRequestOption);
            iCustomTabsCallbackStubProxy.L$2 = access15400.onNavigationEvent(nativeAdsDto);
            iCustomTabsCallbackStubProxy.Z$0 = z;
            iCustomTabsCallbackStubProxy.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onrelationshipvalidationresult, iCustomTabsCallbackStubProxy);
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        int i6 = IPostMessageService_Parcel + 125;
        int i7 = i6 % 128;
        IPostMessageServiceStubProxy = i7;
        if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = i7 + 25;
            IPostMessageService_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                NativeAdsDto nativeAdsDto2 = (NativeAdsDto) iCustomTabsCallbackStubProxy.L$3;
                ResultKt.onNavigationEvent(obj);
                return nativeAdsDto2;
            }
            NativeAdsDto nativeAdsDto3 = (NativeAdsDto) iCustomTabsCallbackStubProxy.L$3;
            ResultKt.onNavigationEvent(obj);
            int i9 = 3 / 0;
            return nativeAdsDto3;
        }
        z = iCustomTabsCallbackStubProxy.Z$0;
        NativeAdsDto nativeAdsDto4 = (NativeAdsDto) iCustomTabsCallbackStubProxy.L$2;
        adRequestOption = (GetNativeAdsRequestBody.AdRequestOption) iCustomTabsCallbackStubProxy.L$1;
        String str2 = (String) iCustomTabsCallbackStubProxy.L$0;
        ResultKt.onNavigationEvent(obj);
        nativeAdsDto = nativeAdsDto4;
        str = str2;
        objOnExtraCallback = obj;
        NativeAdsDto nativeAdsDto5 = (NativeAdsDto) objOnExtraCallback;
        if (!z) {
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
            onUnminimized onunminimized = new onUnminimized(nativeAdsDto5, this, str, null);
            iCustomTabsCallbackStubProxy.L$0 = access15400.onNavigationEvent(str);
            iCustomTabsCallbackStubProxy.L$1 = access15400.onNavigationEvent(adRequestOption);
            iCustomTabsCallbackStubProxy.L$2 = access15400.onNavigationEvent(nativeAdsDto);
            iCustomTabsCallbackStubProxy.L$3 = nativeAdsDto5;
            iCustomTabsCallbackStubProxy.Z$0 = z;
            iCustomTabsCallbackStubProxy.label = 2;
            if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, onunminimized, iCustomTabsCallbackStubProxy) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return nativeAdsDto5;
    }

    static final class isEngagementSignalsApiAvailable extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Map<String, NativeAdsDto> $preparedAds;
        final /* synthetic */ List<String> $slotIds;
        int label;
        final /* synthetic */ NativeAdsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        isEngagementSignalsApiAvailable(List<String> list, Map<String, NativeAdsDto> map, NativeAdsManager nativeAdsManager, access13800<? super isEngagementSignalsApiAvailable> access13800Var) {
            super(2, access13800Var);
            this.$slotIds = list;
            this.$preparedAds = map;
            this.this$0 = nativeAdsManager;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            isEngagementSignalsApiAvailable isengagementsignalsapiavailable = new isEngagementSignalsApiAvailable(this.$slotIds, this.$preparedAds, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 82 / 0;
            }
            return isengagementsignalsapiavailable;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            if ((r1 % 2) == 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r13);
            r13 = r12.$slotIds;
            r1 = r12.$preparedAds;
            r3 = r12.this$0;
            r13 = r13.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r13.hasNext() == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            r4 = im.toss.ads_sdk.NativeAdsManager.isEngagementSignalsApiAvailable.onNavigationEvent + 49;
            im.toss.ads_sdk.NativeAdsManager.isEngagementSignalsApiAvailable.onWarmupCompleted = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            if ((r4 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            r4 = (java.lang.String) r13.next();
            r5 = r1.get(r4);
            r6 = 27 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            if (r5 != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            r4 = (java.lang.String) r13.next();
            r5 = r1.get(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        
            if (r5 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            r11 = o.nSetPosition.onExtraCallbackWithResult();
            ((java.util.Map) im.toss.ads_sdk.NativeAdsManager.IAuthTabCallback(o.nSetPosition.onExtraCallbackWithResult(), 694540167, o.nSetPosition.onExtraCallbackWithResult(), o.nSetPosition.onExtraCallbackWithResult(), -694540146, new java.lang.Object[]{r3}, r11)).put(r4, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
        
            im.toss.ads_sdk.NativeAdsManager.onWarmupCompleted(r3, r4, r5, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r13);
            r12.$slotIds.iterator();
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r12.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r12.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r1 = r1 + 83;
            im.toss.ads_sdk.NativeAdsManager.isEngagementSignalsApiAvailable.onWarmupCompleted = r1 % 128;
            r2 = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 101;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 65 / 0;
            }
        }
    }

    public final void onWarmupCompleted(@NotNull ViewGroup viewGroup) throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 45;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.onSessionEnded = viewGroup;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult)).onNavigationEvent(viewGroup);
        int i4 = IPostMessageServiceStubProxy + 63;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted(@NotNull removeNonDecorViews removenondecorviews) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 41;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removenondecorviews, "");
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        Object[] objArr = {(requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult), removenondecorviews};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -912883003, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 912883007);
        int i4 = IPostMessageService_Parcel + 35;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        removeNonDecorViews removenondecorviews = (removeNonDecorViews) objArr[1];
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 23;
        IPostMessageServiceStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(removenondecorviews, "");
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult)).onNavigationEvent(removenondecorviews);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(removenondecorviews, "");
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        ((requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult2)).onNavigationEvent(removenondecorviews);
        int i3 = IPostMessageServiceStubProxy + 77;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onTransact() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 39;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            Object[] objArr = {(requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult)};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -871835226, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
            return;
        }
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        Object[] objArr2 = {(requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult2)};
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -871835226, iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onResume(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 41;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            super.onResume(textFieldScrollKtExternalSyntheticLambda0);
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.writeTypedList = string;
            return;
        }
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        this.writeTypedList = string2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onStart(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        this.ICustomTabsCallbackDefault = true;
        Object obj = null;
        calculatePageOffsets.onNavigationEvent(this.isEngagementSignalsApiAvailable, (findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), false, 2, (Object) null);
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        Object[] objArr = {(requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -871835226, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
        Iterator<T> it = this.IEngagementSignalsCallback.iterator();
        while (it.hasNext()) {
            int i2 = IPostMessageServiceStubProxy + 3;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                this.onActivityLayout.get((String) it.next());
                onNavigationEvent onnavigationevent = onNavigationEvent.AUTO;
                obj.hashCode();
                throw null;
            }
            String str2 = (String) it.next();
            if (this.onActivityLayout.get(str2) == onNavigationEvent.AUTO) {
                ICustomTabsCallbackDefault(str2);
            }
        }
        Iterator it2 = CollectionsKt.toList(this.ICustomTabsServiceDefault).iterator();
        while (it2.hasNext()) {
            int i3 = IPostMessageService_Parcel + 15;
            IPostMessageServiceStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                str = (String) it2.next();
                int i4 = 98 / 0;
                if (this.onActivityLayout.get(str) != onNavigationEvent.AUTO) {
                    this.ICustomTabsServiceDefault.remove(str);
                    ICustomTabsCallbackDefault(str);
                } else {
                    this.ICustomTabsServiceDefault.remove(str);
                }
            } else {
                str = (String) it2.next();
                if (this.onActivityLayout.get(str) != onNavigationEvent.AUTO) {
                    this.ICustomTabsServiceDefault.remove(str);
                    ICustomTabsCallbackDefault(str);
                } else {
                    this.ICustomTabsServiceDefault.remove(str);
                }
            }
        }
        onActivityLayout();
    }

    public void onStop(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 95;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        this.ICustomTabsCallbackDefault = false;
        calculatePageOffsets.onExtraCallbackWithResult(this.isEngagementSignalsApiAvailable, false, 1, (Object) null);
        onMessageChannelReady();
        int i4 = IPostMessageServiceStubProxy + 65;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onDestroy(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        calculatePageOffsets.onExtraCallbackWithResult(this.isEngagementSignalsApiAvailable, false, 1, (Object) null);
        onMessageChannelReady();
        for (getPackageType getpackagetype : this.onUnminimized.values()) {
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.onUnminimized.clear();
        getPackageType getpackagetype2 = this.readTypedObject;
        if (getpackagetype2 != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
        }
        this.readTypedObject = null;
        getPackageType getpackagetype3 = this.getInterfaceDescriptor;
        if (getpackagetype3 != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype3, (CancellationException) null, 1, (Object) null);
        }
        this.getInterfaceDescriptor = null;
        for (getPackageType getpackagetype4 : this.validateRelationship.values()) {
            if (getpackagetype4 != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype4, (CancellationException) null, 1, (Object) null);
            }
        }
        this.validateRelationship.clear();
        access100();
        onMinimized();
        onPostMessage();
        this.onExtraCallback.clear();
        this.ICustomTabsCallbackStub.clear();
        IAuthTabCallbackStub();
        IAuthTabCallbackStubProxy();
        synchronized (this) {
            this.mayLaunchUrl.clear();
            this.ICustomTabsService.clear();
            this.newAuthTabSession.clear();
            this.setEngagementSignalsCallback.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void onMinimized() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 43;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = this.onExtraCallback.values().iterator();
        int i4 = IPostMessageServiceStubProxy + 27;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            int i6 = IPostMessageService_Parcel + 31;
            IPostMessageServiceStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            setTrimPathEnd settrimpathend = (setTrimPathEnd) it.next();
            if (settrimpathend != null) {
                settrimpathend.onNavigationEvent();
            }
        }
    }

    private final void onPostMessage() {
        Iterator it;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 81;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            it = this.ICustomTabsCallbackStub.values().iterator();
            int i3 = 46 / 0;
        } else {
            it = this.ICustomTabsCallbackStub.values().iterator();
        }
        while (it.hasNext()) {
            ((setTrimPathEnd) it.next()).onNavigationEvent();
        }
        int i4 = IPostMessageServiceStubProxy + 9;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
    }

    private final void IAuthTabCallbackStubProxy(String str) {
        int i = 2 % 2;
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobViewRemove = this.asBinder.remove(str);
        if (nativeAdsThumbnailAdMobViewRemove != null) {
            nativeAdsThumbnailAdMobViewRemove.onExtraCallback();
            int i2 = IPostMessageServiceStubProxy + 109;
            IPostMessageService_Parcel = i2 % 128;
            int i3 = i2 % 2;
        }
        NativeAd nativeAdRemove = this.IAuthTabCallbackStub.remove(str);
        if (nativeAdRemove != null) {
            nativeAdRemove.destroy();
        }
        int i4 = IPostMessageServiceStubProxy + 61;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void access100() {
        int i = 2 % 2;
        Iterator<T> it = this.asBinder.values().iterator();
        while (it.hasNext()) {
            ((NativeAdsThumbnailAdMobView) it.next()).onExtraCallback();
        }
        this.asBinder.clear();
        Iterator<T> it2 = this.IAuthTabCallbackStub.values().iterator();
        int i2 = IPostMessageService_Parcel + 105;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 4;
        }
        while (it2.hasNext()) {
            int i4 = IPostMessageService_Parcel + 119;
            IPostMessageServiceStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                ((NativeAd) it2.next()).destroy();
                throw null;
            }
            ((NativeAd) it2.next()).destroy();
        }
        this.IAuthTabCallbackStub.clear();
    }

    public final void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 19;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onRelationshipValidationResult = System.currentTimeMillis();
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 823603499, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -823603490, new Object[]{this}, iOnExtraCallbackWithResult);
        int i4 = IPostMessageServiceStubProxy + 45;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        String strIAuthTabCallbackStub;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        int i = 2 % 2;
        getPackageType getpackagetype = nativeAdsManager.getInterfaceDescriptor;
        if (getpackagetype != null) {
            int i2 = IPostMessageServiceStubProxy + 45;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 == 0 ? getpackagetype.onExtraCallback() : !getpackagetype.onExtraCallback()) {
                return null;
            }
        }
        Iterator<Map.Entry<String, NativeAdsDto>> it = nativeAdsManager.access100.entrySet().iterator();
        while (it.hasNext()) {
            NativeAdsDto value = it.next().getValue();
            if (value != null && (strIAuthTabCallbackStub = value.IAuthTabCallbackStub()) != null) {
                nativeAdsManager.isEngagementSignalsApiAvailable.IAuthTabCallback(strIAuthTabCallbackStub);
                int i3 = IPostMessageService_Parcel + 39;
                IPostMessageServiceStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        nativeAdsManager.access100.clear();
        getPackageType getpackagetype2 = nativeAdsManager.readTypedObject;
        if (getpackagetype2 != null) {
            int i5 = IPostMessageService_Parcel + 85;
            IPostMessageServiceStubProxy = i5 % 128;
            int i6 = i5 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype2, (CancellationException) null, 1, (Object) null);
        }
        nativeAdsManager.readTypedObject = (getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{nativeAdsManager, nativeAdsManager.new onMinimized(null)}, nSetPosition.onExtraCallbackWithResult());
        return null;
    }

    static final class onMinimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        int label;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onMinimized onminimized = NativeAdsManager.this.new onMinimized(access13800Var);
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onminimized;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onMinimized onminimizedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onminimizedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onminimizedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 57 / 0;
            }
            return objInvokeSuspend;
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends Pair<? extends String, ? extends NativeAdsDto>>>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(NativeAdsManager nativeAdsManager, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
                onnavigationevent.L$0 = obj;
                int i2 = onNavigationEvent + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 15;
                onExtraCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<Pair<String, NativeAdsDto>>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onExtraCallback(findresandmsg, access13800Var);
                }
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super List<Pair<String, NativeAdsDto>>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 31;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends NativeAdsDto>>, Object> {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ String $spaceUnitId;
                int I$0;
                int I$1;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                final /* synthetic */ NativeAdsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, access13800<? super IAuthTabCallback> access13800Var) {
                    super(2, access13800Var);
                    this.this$0 = nativeAdsManager;
                    this.$spaceUnitId = str;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$spaceUnitId, access13800Var);
                    int i2 = onWarmupCompleted + 83;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return iAuthTabCallback;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 19;
                    onExtraCallback = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Pair<String, NativeAdsDto>> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        onNavigationEvent(findresandmsg, access13800Var);
                        throw null;
                    }
                    Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                    int i3 = onExtraCallback + 89;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnNavigationEvent;
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Pair<String, NativeAdsDto>> access13800Var) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 101;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onWarmupCompleted + 13;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* renamed from: im.toss.ads_sdk.NativeAdsManager$onMinimized$onNavigationEvent$IAuthTabCallback$4, reason: invalid class name */
                static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;
                    final /* synthetic */ AppCompatActivity $activity;
                    final /* synthetic */ NativeAdsDto $ad;
                    final /* synthetic */ NativeAdsDto.AdAsset $adAsset;
                    final /* synthetic */ String $spaceUnitId;
                    int label;
                    final /* synthetic */ NativeAdsManager this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass4(NativeAdsDto.AdAsset adAsset, NativeAdsDto nativeAdsDto, NativeAdsManager nativeAdsManager, AppCompatActivity appCompatActivity, String str, access13800<? super AnonymousClass4> access13800Var) {
                        super(2, access13800Var);
                        this.$adAsset = adAsset;
                        this.$ad = nativeAdsDto;
                        this.this$0 = nativeAdsManager;
                        this.$activity = appCompatActivity;
                        this.$spaceUnitId = str;
                    }

                    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 17;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                        int i4 = onExtraCallback + 97;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return objInvokeSuspend;
                    }

                    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                        int i = 2 % 2;
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$adAsset, this.$ad, this.this$0, this.$activity, this.$spaceUnitId, access13800Var);
                        int i2 = onExtraCallbackWithResult + 57;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        return anonymousClass4;
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult + 47;
                        onExtraCallback = i2 % 128;
                        findResAndMsg findresandmsg = (findResAndMsg) obj;
                        access13800<? super Unit> access13800Var = (access13800) obj2;
                        if (i2 % 2 != 0) {
                            return IAuthTabCallback(findresandmsg, access13800Var);
                        }
                        IAuthTabCallback(findresandmsg, access13800Var);
                        throw null;
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                     */
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult;
                        int i3 = i2 + 69;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = i2 + 85;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        ResultKt.onNavigationEvent(obj);
                        String strIAuthTabCallbackDefault = this.$adAsset.IAuthTabCallbackDefault();
                        int iHashCode = strIAuthTabCallbackDefault.hashCode();
                        if (iHashCode != 1568) {
                            switch (iHashCode) {
                                case 51:
                                    if (strIAuthTabCallbackDefault.equals("3")) {
                                        getPlatformCallback.IAuthTabCallback.onExtraCallbackWithResult(this.$ad.IAuthTabCallbackStub(), this.this$0);
                                        NativeAdsManager nativeAdsManager = this.this$0;
                                        this.$activity.startActivity(NativeAdsManager.onExtraCallback(nativeAdsManager, (Context) this.$activity, this.$ad, NativeAdsManager.IAuthTabCallbackDefault(nativeAdsManager, this.$spaceUnitId)));
                                        break;
                                    }
                                    break;
                                case 52:
                                    if (strIAuthTabCallbackDefault.equals("4")) {
                                        getPlatformCallback.IAuthTabCallback.onExtraCallbackWithResult(this.$ad.IAuthTabCallbackStub(), this.this$0);
                                        NativeAdsManager nativeAdsManager2 = this.this$0;
                                        this.$activity.startActivity(NativeAdsManager.onWarmupCompleted(nativeAdsManager2, (Context) this.$activity, this.$ad, NativeAdsManager.IAuthTabCallbackDefault(nativeAdsManager2, this.$spaceUnitId)));
                                        break;
                                    }
                                    break;
                                case 53:
                                    if (strIAuthTabCallbackDefault.equals("5")) {
                                        int i7 = onExtraCallback + 23;
                                        onExtraCallbackWithResult = i7 % 128;
                                        int i8 = i7 % 2;
                                        getPlatformCallback.IAuthTabCallback.onExtraCallbackWithResult(this.$ad.IAuthTabCallbackStub(), this.this$0);
                                        NativeAdsManager nativeAdsManager3 = this.this$0;
                                        this.$activity.startActivity(NativeAdsManager.onNavigationEvent(nativeAdsManager3, (Context) this.$activity, this.$ad, NativeAdsManager.IAuthTabCallbackDefault(nativeAdsManager3, this.$spaceUnitId)));
                                        break;
                                    }
                                    break;
                            }
                        } else if (!(!strIAuthTabCallbackDefault.equals("11"))) {
                            getPlatformCallback.IAuthTabCallback.onExtraCallbackWithResult(this.$ad.IAuthTabCallbackStub(), this.this$0);
                            this.$activity.startActivity(NativeAdsManager.onExtraCallback(this.this$0, (Context) this.$activity, this.$ad, this.$spaceUnitId, 0, (String) null, 24, (Object) null));
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|100|(2:4|(1:30)(2:9|(21:23|104|24|25|40|41|(1:43)|53|(2:55|(1:57)(2:58|59))|60|(5:62|(1:64)|65|(1:67)|68)|69|(2:71|(1:78))|79|(1:81)(1:82)|83|(1:85)(1:86)|(1:90)|(1:94)|97|98)(2:14|(2:16|(3:18|97|98)(2:19|20))(2:21|22))))(3:31|(0)|99)|33|102|34|(1:36)|37|(18:39|40|41|(0)|53|(0)|60|(0)|69|(0)|79|(0)(0)|83|(0)(0)|(2:88|90)|(1:94)|97|98)|99|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x0115, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x0226, code lost:
                
                    if (o.maybeUpdateAnimatable.onExtraCallback(r3, r4, r23) != r10) goto L97;
                 */
                /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01cd  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01d4  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x01dc  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x01df  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x01ee A[ADDED_TO_REGION] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objOnNavigationEvent;
                    String str;
                    Object objOnExtraCallbackWithResult;
                    String str2;
                    NativeAdsDto nativeAdsDto;
                    Throwable th;
                    getPackageType getpackagetypeIAuthTabCallbackStubProxy;
                    AppCompatActivity appCompatActivity;
                    List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult;
                    Object objIAuthTabCallback;
                    int i;
                    int i2 = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i3 = this.label;
                    NativeAdsDto.AdAsset adAsset = null;
                    try {
                        if (i3 == 0) {
                            ResultKt.onNavigationEvent(obj);
                            FragmentStateAdapter4 fragmentStateAdapter4IAuthTabCallbackStub = NativeAdsManager.IAuthTabCallbackStub(this.this$0);
                            this.label = 1;
                            objOnNavigationEvent = fragmentStateAdapter4IAuthTabCallbackStub.onNavigationEvent(this);
                            if (objOnNavigationEvent != objOnWarmupCompleted) {
                            }
                            return objOnWarmupCompleted;
                        }
                        int i4 = onExtraCallback + 105;
                        int i5 = i4 % 128;
                        onWarmupCompleted = i5;
                        if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                            int i6 = i5 + 37;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 == 0 ? i3 != 2 : i3 != 2) {
                                int i7 = i5 + 69;
                                onExtraCallback = i7 % 128;
                                int i8 = i7 % 2;
                                if (i3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i9 = i5 + 117;
                                onExtraCallback = i9 % 128;
                                if (i9 % 2 == 0) {
                                    nativeAdsDto = (NativeAdsDto) this.L$1;
                                    ResultKt.onNavigationEvent(obj);
                                    return new Pair(this.$spaceUnitId, nativeAdsDto);
                                }
                                ResultKt.onNavigationEvent(obj);
                                throw null;
                            }
                            str2 = (String) this.L$0;
                            try {
                                ResultKt.onNavigationEvent(obj);
                                objIAuthTabCallback = obj;
                                objOnExtraCallbackWithResult = Result.constructor-impl(objIAuthTabCallback);
                                i = onWarmupCompleted + 85;
                                onExtraCallback = i % 128;
                                if (i % 2 != 0) {
                                    int i10 = 2 / 4;
                                }
                            } catch (WebResourceResponseModel e) {
                                WebResourceResponseModel e2 = e;
                                str = str2;
                                Result.Companion companion = Result.Companion;
                                objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e2));
                                str2 = str;
                                NativeAdsManager nativeAdsManager = this.this$0;
                                if (Result.onNavigationEvent(objOnExtraCallbackWithResult)) {
                                }
                                Object obj2 = Result.constructor-impl(objOnExtraCallbackWithResult);
                                NativeAdsManager nativeAdsManager2 = this.this$0;
                                th = Result.exceptionOrNull-impl(obj2);
                                if (th != null) {
                                }
                                nativeAdsDto = (NativeAdsDto) obj2;
                                getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(this.this$0);
                                if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                                }
                                WeakReference weakReferenceICustomTabsCallback = NativeAdsManager.ICustomTabsCallback(this.this$0);
                                if (weakReferenceICustomTabsCallback == null) {
                                }
                                if (!(textFieldScrollKtExternalSyntheticLambda0 instanceof AppCompatActivity)) {
                                }
                                if (nativeAdsDto != null) {
                                }
                                if (appCompatActivity != null) {
                                }
                                return new Pair(this.$spaceUnitId, nativeAdsDto);
                            } catch (Exception e3) {
                                Exception e4 = e3;
                                str = str2;
                                Result.Companion companion2 = Result.Companion;
                                objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e4));
                                str2 = str;
                                NativeAdsManager nativeAdsManager3 = this.this$0;
                                if (Result.onNavigationEvent(objOnExtraCallbackWithResult)) {
                                }
                                Object obj22 = Result.constructor-impl(objOnExtraCallbackWithResult);
                                NativeAdsManager nativeAdsManager22 = this.this$0;
                                th = Result.exceptionOrNull-impl(obj22);
                                if (th != null) {
                                }
                                nativeAdsDto = (NativeAdsDto) obj22;
                                getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(this.this$0);
                                if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                                }
                                WeakReference weakReferenceICustomTabsCallback2 = NativeAdsManager.ICustomTabsCallback(this.this$0);
                                if (weakReferenceICustomTabsCallback2 == null) {
                                }
                                if (!(textFieldScrollKtExternalSyntheticLambda0 instanceof AppCompatActivity)) {
                                }
                                if (nativeAdsDto != null) {
                                }
                                if (appCompatActivity != null) {
                                }
                                return new Pair(this.$spaceUnitId, nativeAdsDto);
                            }
                            NativeAdsManager nativeAdsManager32 = this.this$0;
                            if (Result.onNavigationEvent(objOnExtraCallbackWithResult)) {
                                int i11 = onWarmupCompleted + 85;
                                onExtraCallback = i11 % 128;
                                if (i11 % 2 != 0) {
                                    Result.Companion companion3 = Result.Companion;
                                    NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager32, (NativeAdsDto) objOnExtraCallbackWithResult);
                                    adAsset.hashCode();
                                    throw null;
                                }
                                Result.Companion companion4 = Result.Companion;
                                objOnExtraCallbackWithResult = NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager32, (NativeAdsDto) objOnExtraCallbackWithResult);
                            }
                            Object obj222 = Result.constructor-impl(objOnExtraCallbackWithResult);
                            NativeAdsManager nativeAdsManager222 = this.this$0;
                            th = Result.exceptionOrNull-impl(obj222);
                            if (th != null) {
                                asBinder asbinderWriteTypedObject = NativeAdsManager.writeTypedObject(nativeAdsManager222);
                                if (asbinderWriteTypedObject != null) {
                                    asbinderWriteTypedObject.onExtraCallback(new NativeAdsError(addOnAdapterChangeListener.INVALID_SPACE.getCode(), "Failed to fetch ad: " + th.getMessage(), (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                                }
                                int i12 = onExtraCallback + 81;
                                onWarmupCompleted = i12 % 128;
                                if (i12 % 2 == 0) {
                                    int i13 = 4 / 5;
                                }
                                obj222 = null;
                            }
                            nativeAdsDto = (NativeAdsDto) obj222;
                            getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(this.this$0);
                            if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                                int i14 = onWarmupCompleted + 61;
                                onExtraCallback = i14 % 128;
                                if (i14 % 2 == 0 ? getpackagetypeIAuthTabCallbackStubProxy.onExtraCallback() : getpackagetypeIAuthTabCallbackStubProxy.onExtraCallback()) {
                                    return null;
                                }
                            }
                            WeakReference weakReferenceICustomTabsCallback22 = NativeAdsManager.ICustomTabsCallback(this.this$0);
                            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = weakReferenceICustomTabsCallback22 == null ? (TextFieldScrollKtExternalSyntheticLambda0) weakReferenceICustomTabsCallback22.get() : null;
                            appCompatActivity = !(textFieldScrollKtExternalSyntheticLambda0 instanceof AppCompatActivity) ? (AppCompatActivity) textFieldScrollKtExternalSyntheticLambda0 : null;
                            if (nativeAdsDto != null && (listOnExtraCallbackWithResult = nativeAdsDto.onExtraCallbackWithResult()) != null) {
                                adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
                            }
                            if (appCompatActivity != null && nativeAdsDto != null && adAsset != null) {
                                setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
                                AnonymousClass4 anonymousClass4 = new AnonymousClass4(adAsset, nativeAdsDto, this.this$0, appCompatActivity, this.$spaceUnitId, null);
                                this.L$0 = access15400.onNavigationEvent(str2);
                                this.L$1 = nativeAdsDto;
                                this.L$2 = access15400.onNavigationEvent(appCompatActivity);
                                this.L$3 = access15400.onNavigationEvent(adAsset);
                                this.label = 3;
                            }
                            return new Pair(this.$spaceUnitId, nativeAdsDto);
                        }
                        ResultKt.onNavigationEvent(obj);
                        objOnNavigationEvent = obj;
                        str = (String) objOnNavigationEvent;
                        NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1904660455, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1904660468, new Object[]{this.this$0, str, this.$spaceUnitId}, nSetPosition.onExtraCallbackWithResult());
                        NativeAdsManager nativeAdsManager4 = this.this$0;
                        String str3 = this.$spaceUnitId;
                        Result.Companion companion5 = Result.Companion;
                        getPackageType getpackagetypeIAuthTabCallbackStubProxy2 = NativeAdsManager.IAuthTabCallbackStubProxy(nativeAdsManager4);
                        if (getpackagetypeIAuthTabCallbackStubProxy2 != null) {
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy2, (CancellationException) null, 1, (Object) null);
                        }
                        access100 access100VarOnTransact = NativeAdsManager.onTransact(nativeAdsManager4, str3);
                        GetNativeAdsRequestBody.AdRequestOption adRequestOption = (GetNativeAdsRequestBody.AdRequestOption) NativeAdsManager.IAuthTabCallback(nativeAdsManager4).get(str3);
                        this.L$0 = access15400.onNavigationEvent(str);
                        this.L$1 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 2;
                        objIAuthTabCallback = NativeAdsManager.IAuthTabCallback(nativeAdsManager4, str3, access100VarOnTransact, adRequestOption, str, (String) null, (access13800) this);
                        if (objIAuthTabCallback != objOnWarmupCompleted) {
                            str2 = str;
                            objOnExtraCallbackWithResult = Result.constructor-impl(objIAuthTabCallback);
                            i = onWarmupCompleted + 85;
                            onExtraCallback = i % 128;
                            if (i % 2 != 0) {
                            }
                            NativeAdsManager nativeAdsManager322 = this.this$0;
                            if (Result.onNavigationEvent(objOnExtraCallbackWithResult)) {
                            }
                            Object obj2222 = Result.constructor-impl(objOnExtraCallbackWithResult);
                            NativeAdsManager nativeAdsManager2222 = this.this$0;
                            th = Result.exceptionOrNull-impl(obj2222);
                            if (th != null) {
                            }
                            nativeAdsDto = (NativeAdsDto) obj2222;
                            getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(this.this$0);
                            if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                            }
                            WeakReference weakReferenceICustomTabsCallback222 = NativeAdsManager.ICustomTabsCallback(this.this$0);
                            if (weakReferenceICustomTabsCallback222 == null) {
                            }
                            if (!(textFieldScrollKtExternalSyntheticLambda0 instanceof AppCompatActivity)) {
                            }
                            if (nativeAdsDto != null) {
                                adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
                            }
                            if (appCompatActivity != null) {
                                setPatch setpatchOnExtraCallback2 = putChannelInfo.onExtraCallback();
                                AnonymousClass4 anonymousClass42 = new AnonymousClass4(adAsset, nativeAdsDto, this.this$0, appCompatActivity, this.$spaceUnitId, null);
                                this.L$0 = access15400.onNavigationEvent(str2);
                                this.L$1 = nativeAdsDto;
                                this.L$2 = access15400.onNavigationEvent(appCompatActivity);
                                this.L$3 = access15400.onNavigationEvent(adAsset);
                                this.label = 3;
                            }
                            return new Pair(this.$spaceUnitId, nativeAdsDto);
                        }
                        return objOnWarmupCompleted;
                    } catch (CancellationException e5) {
                        throw e5;
                    }
                }
            }

            public final Object invokeSuspend(Object obj) {
                GeckoHubImp1 geckoHubImp1OnExtraCallback;
                int i = 2 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj2 = null;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onNavigationEvent + 95;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        return obj;
                    }
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                List<String> listOnActivityResized = NativeAdsManager.onActivityResized(this.this$0);
                NativeAdsManager nativeAdsManager = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (String str : listOnActivityResized) {
                    if (NativeAdsManager.access000(nativeAdsManager).get(str) != onNavigationEvent.AUTO) {
                        geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new IAuthTabCallback(nativeAdsManager, str, null), 2, (Object) null);
                        int i4 = onNavigationEvent + 115;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        geckoHubImp1OnExtraCallback = null;
                    }
                    if (geckoHubImp1OnExtraCallback != null) {
                        int i6 = onExtraCallback + 47;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            arrayList.add(geckoHubImp1OnExtraCallback);
                            obj2.hashCode();
                            throw null;
                        }
                        arrayList.add(geckoHubImp1OnExtraCallback);
                    }
                }
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 1;
                Object objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    int i7 = onExtraCallback + 121;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
                int i9 = onNavigationEvent + 91;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return objIAuthTabCallback;
            }
        }

        /* renamed from: im.toss.ads_sdk.NativeAdsManager$onMinimized$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(NativeAdsManager nativeAdsManager, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                Object objOnExtraCallback;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                    int i3 = 35 / 0;
                } else {
                    objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                }
                int i4 = IAuthTabCallback + 19;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 91;
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
                int i2 = onWarmupCompleted + 29;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                ResultKt.onNavigationEvent(obj);
                NativeAdsManager nativeAdsManager = this.this$0;
                try {
                    Result.Companion companion = Result.Companion;
                    Object[] objArr = {NativeAdsManager.extraCallbackWithResult(nativeAdsManager)};
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -871835226, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
                    obj2 = Result.constructor-impl(Unit.INSTANCE);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                    int i4 = onWarmupCompleted + 3;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                Result.exceptionOrNull-impl(obj2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x010c, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r4, r7, r18) == r2) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                onNavigationEvent onnavigationevent = new onNavigationEvent(NativeAdsManager.this, null);
                this.label = 1;
                objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(onnavigationevent, this);
                if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i2 != 1) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 119;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 21;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallbackWithResult = obj;
            List list = (List) objOnExtraCallbackWithResult;
            Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(CollectionsKt.filterNotNull(list));
            NativeAdsManager nativeAdsManager = NativeAdsManager.this;
            for (Map.Entry entry : mapOnExtraCallbackWithResult.entrySet()) {
                int i7 = IAuthTabCallback + 3;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                String str = (String) entry.getKey();
                NativeAdsDto nativeAdsDto = (NativeAdsDto) entry.getValue();
                if (nativeAdsDto == null) {
                    int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                    ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult)).put(str, null);
                } else {
                    NativeAdsManager.onWarmupCompleted(nativeAdsManager, str, nativeAdsDto, true);
                }
            }
            asBinder asbinderWriteTypedObject = NativeAdsManager.writeTypedObject(NativeAdsManager.this);
            if (asbinderWriteTypedObject != null) {
                asbinderWriteTypedObject.onExtraCallback((Map<String, NativeAdsDto>) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult()));
            }
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(NativeAdsManager.this, null);
            this.L$0 = access15400.onNavigationEvent(list);
            this.L$1 = access15400.onNavigationEvent(mapOnExtraCallbackWithResult);
            this.label = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(String str, List<String> list, access100 access100Var, String str2, String str3, String str4, access13800<? super Map<String, NativeAdsDto>> access13800Var) {
        validateRelationship validaterelationship;
        Pair pairIAuthTabCallback;
        String str5;
        List list2;
        Map map;
        int i = 2 % 2;
        if (!(access13800Var instanceof validateRelationship)) {
            validaterelationship = new validateRelationship(access13800Var);
        } else {
            validaterelationship = (validateRelationship) access13800Var;
            int i2 = validaterelationship.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                validaterelationship.label = i2 - 2147483648;
            }
        }
        Object objOnNavigationEvent = validaterelationship.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = validaterelationship.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            List<String> list3 = list;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i4 = IPostMessageServiceStubProxy + 105;
                IPostMessageService_Parcel = i4 % 128;
                int i5 = i4 % 2;
                String str6 = (String) it.next();
                NativeAdsDto nativeAdsDtoOnExtraCallback = this.ICustomTabsServiceStub.onExtraCallback(str6);
                pairIAuthTabCallback = nativeAdsDtoOnExtraCallback != null ? getWrite.IAuthTabCallback(str6, nativeAdsDtoOnExtraCallback) : null;
                if (pairIAuthTabCallback != null) {
                    arrayList.add(pairIAuthTabCallback);
                }
            }
            Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(arrayList);
            ArrayList arrayList2 = new ArrayList();
            int i6 = IPostMessageService_Parcel + 75;
            IPostMessageServiceStubProxy = i6 % 128;
            int i7 = i6 % 2;
            for (Object obj : list3) {
                if (!mapOnExtraCallbackWithResult.containsKey((String) obj)) {
                    int i8 = IPostMessageService_Parcel + 47;
                    IPostMessageServiceStubProxy = i8 % 128;
                    if (i8 % 2 == 0) {
                        arrayList2.add(obj);
                        pairIAuthTabCallback.hashCode();
                        throw null;
                    }
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i9 = IPostMessageServiceStubProxy + 23;
                IPostMessageService_Parcel = i9 % 128;
                int i10 = i9 % 2;
                return mapOnExtraCallbackWithResult;
            }
            setTranslateY settranslatey = this.ICustomTabsServiceStub;
            String str7 = this.writeTypedList;
            GetNativeAdsRequestBody.AppInfo appInfoOnMessageChannelReady = onMessageChannelReady(str4);
            String strOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent();
            String strWireValue = addNewItem.NATIVE.wireValue();
            if (strWireValue == null) {
                int i11 = IPostMessageServiceStubProxy + 13;
                IPostMessageService_Parcel = i11 % 128;
                int i12 = i11 % 2;
                str5 = "";
            } else {
                str5 = strWireValue;
            }
            String str8 = this.writeTypedObject;
            Map<String, String> map2 = this.warmup;
            String strOnNavigationEvent2 = access100Var.onNavigationEvent();
            validaterelationship.L$0 = access15400.onNavigationEvent(str);
            validaterelationship.L$1 = access15400.onNavigationEvent(list);
            validaterelationship.L$2 = access15400.onNavigationEvent(access100Var);
            validaterelationship.L$3 = access15400.onNavigationEvent(str2);
            validaterelationship.L$4 = access15400.onNavigationEvent(str3);
            validaterelationship.L$5 = access15400.onNavigationEvent(str4);
            validaterelationship.L$6 = mapOnExtraCallbackWithResult;
            validaterelationship.L$7 = arrayList2;
            validaterelationship.label = 1;
            objOnNavigationEvent = settranslatey.onNavigationEvent(str7, str, arrayList2, appInfoOnMessageChannelReady, strOnNavigationEvent, str5, str2, str3, str8, map2, strOnNavigationEvent2, validaterelationship);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            list2 = arrayList2;
            map = mapOnExtraCallbackWithResult;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) validaterelationship.L$7;
            map = (Map) validaterelationship.L$6;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        }
        SspSdkAdResponse sspSdkAdResponse = (SspSdkAdResponse) objOnNavigationEvent;
        List list4 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
        for (Object obj2 : list4) {
            linkedHashMap.put(obj2, beginFakeDrag.onWarmupCompleted(sspSdkAdResponse, (String) obj2));
        }
        return access8100.onWarmupCompleted(map, linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f3, code lost:
    
        if (r1 == r11) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, int i, String str2, access13800<? super NativeAdsDto> access13800Var) throws Throwable {
        ICustomTabsCallbackDefault iCustomTabsCallbackDefault;
        int i2;
        GetNativeAdsRequestBody.AdRequestOption adRequestOption2;
        String str3;
        String str4;
        GetNativeAdsRequestBody.AdRequestOption adRequestOption3;
        int i3;
        String str5;
        String str6;
        access100 access100VarICustomTabsCallbackStubProxy;
        String str7;
        String str8;
        String str9;
        int i4;
        GetNativeAdsRequestBody.AdRequestOption adRequestOption4;
        access100 access100Var;
        String str10;
        String str11;
        String str12;
        Object obj;
        NativeAdsDto nativeAdsDto;
        String str13 = str;
        int i5 = 2 % 2;
        if (access13800Var instanceof ICustomTabsCallbackDefault) {
            iCustomTabsCallbackDefault = (ICustomTabsCallbackDefault) access13800Var;
            int i6 = iCustomTabsCallbackDefault.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iCustomTabsCallbackDefault.label = i6 - 2147483648;
            } else {
                iCustomTabsCallbackDefault = new ICustomTabsCallbackDefault(access13800Var);
            }
        }
        ICustomTabsCallbackDefault iCustomTabsCallbackDefault2 = iCustomTabsCallbackDefault;
        Object objOnNavigationEvent = iCustomTabsCallbackDefault2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iCustomTabsCallbackDefault2.label;
        Object obj2 = null;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                ICustomTabsCallbackStub iCustomTabsCallbackStub = new ICustomTabsCallbackStub(str13, null);
                iCustomTabsCallbackDefault2.L$0 = str13;
                iCustomTabsCallbackDefault2.L$1 = adRequestOption;
                iCustomTabsCallbackDefault2.L$2 = str2;
                i2 = i;
                iCustomTabsCallbackDefault2.I$0 = i2;
                iCustomTabsCallbackDefault2.label = 1;
                if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, iCustomTabsCallbackStub, iCustomTabsCallbackDefault2) != objOnWarmupCompleted) {
                    int i8 = IPostMessageServiceStubProxy + 7;
                    IPostMessageService_Parcel = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 42 / 0;
                    }
                    adRequestOption2 = adRequestOption;
                    str3 = str2;
                }
                return objOnWarmupCompleted;
            }
            if (i7 == 1) {
                int i10 = iCustomTabsCallbackDefault2.I$0;
                str3 = (String) iCustomTabsCallbackDefault2.L$2;
                adRequestOption2 = (GetNativeAdsRequestBody.AdRequestOption) iCustomTabsCallbackDefault2.L$1;
                String str14 = (String) iCustomTabsCallbackDefault2.L$0;
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                int i11 = IPostMessageServiceStubProxy + 107;
                IPostMessageService_Parcel = i11 % 128;
                int i12 = i11 % 2;
                i2 = i10;
                str13 = str14;
            } else {
                if (i7 == 2) {
                    int i13 = iCustomTabsCallbackDefault2.I$0;
                    String str15 = (String) iCustomTabsCallbackDefault2.L$2;
                    GetNativeAdsRequestBody.AdRequestOption adRequestOption5 = (GetNativeAdsRequestBody.AdRequestOption) iCustomTabsCallbackDefault2.L$1;
                    String str16 = (String) iCustomTabsCallbackDefault2.L$0;
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    i3 = i13;
                    str5 = str15;
                    adRequestOption3 = adRequestOption5;
                    str4 = str16;
                    str6 = objOnNavigationEvent;
                    IAuthTabCallback(str6, str4);
                    access100VarICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(str4);
                    try {
                        Result.Companion companion = Result.Companion;
                        String strIAuthTabCallbackDefault = access100VarICustomTabsCallbackStubProxy.IAuthTabCallbackDefault();
                        iCustomTabsCallbackDefault2.L$0 = access15400.onNavigationEvent(str4);
                        iCustomTabsCallbackDefault2.L$1 = access15400.onNavigationEvent(adRequestOption3);
                        iCustomTabsCallbackDefault2.L$2 = str5;
                        iCustomTabsCallbackDefault2.L$3 = access15400.onNavigationEvent(str6);
                        iCustomTabsCallbackDefault2.L$4 = access15400.onNavigationEvent(access100VarICustomTabsCallbackStubProxy);
                        iCustomTabsCallbackDefault2.L$5 = access15400.onNavigationEvent(iCustomTabsCallbackDefault2);
                        iCustomTabsCallbackDefault2.I$0 = i3;
                        iCustomTabsCallbackDefault2.I$1 = 0;
                        iCustomTabsCallbackDefault2.I$2 = 0;
                        iCustomTabsCallbackDefault2.label = 3;
                        str7 = str6;
                        str8 = str4;
                        str9 = str5;
                    } catch (Exception e) {
                        e = e;
                        str7 = str6;
                        str8 = str4;
                        str9 = str5;
                    } catch (WebResourceResponseModel e2) {
                        e = e2;
                        str7 = str6;
                        str8 = str4;
                        str9 = str5;
                    }
                    try {
                        objOnNavigationEvent = IAuthTabCallback(this, str4, access100VarICustomTabsCallbackStubProxy, adRequestOption3, str6, strIAuthTabCallbackDefault, (access13800) iCustomTabsCallbackDefault2);
                    } catch (WebResourceResponseModel e3) {
                        e = e3;
                        i4 = i3;
                        adRequestOption4 = adRequestOption3;
                        access100Var = access100VarICustomTabsCallbackStubProxy;
                        str10 = str7;
                        str11 = str8;
                        str12 = str9;
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(e));
                        if (Result.onExtraCallback(obj)) {
                        }
                        nativeAdsDto = (NativeAdsDto) obj;
                        if (nativeAdsDto != null) {
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i4 = i3;
                        adRequestOption4 = adRequestOption3;
                        access100Var = access100VarICustomTabsCallbackStubProxy;
                        str10 = str7;
                        str11 = str8;
                        str12 = str9;
                        Result.Companion companion3 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(e));
                        if (Result.onExtraCallback(obj)) {
                        }
                        nativeAdsDto = (NativeAdsDto) obj;
                        if (nativeAdsDto != null) {
                        }
                    }
                    if (objOnNavigationEvent != objOnWarmupCompleted) {
                        int i14 = IPostMessageService_Parcel + 57;
                        IPostMessageServiceStubProxy = i14 % 128;
                        int i15 = i14 % 2;
                        i4 = i3;
                        adRequestOption4 = adRequestOption3;
                        access100Var = access100VarICustomTabsCallbackStubProxy;
                        str10 = str7;
                        str11 = str8;
                        str12 = str9;
                        obj = Result.constructor-impl(objOnNavigationEvent);
                        if (Result.onExtraCallback(obj)) {
                        }
                        nativeAdsDto = (NativeAdsDto) obj;
                        if (nativeAdsDto != null) {
                        }
                    }
                    return objOnWarmupCompleted;
                }
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    return (NativeAdsDto) objOnNavigationEvent;
                }
                i4 = iCustomTabsCallbackDefault2.I$0;
                access100Var = (access100) iCustomTabsCallbackDefault2.L$4;
                str10 = (String) iCustomTabsCallbackDefault2.L$3;
                str12 = (String) iCustomTabsCallbackDefault2.L$2;
                adRequestOption4 = (GetNativeAdsRequestBody.AdRequestOption) iCustomTabsCallbackDefault2.L$1;
                str11 = (String) iCustomTabsCallbackDefault2.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    obj = Result.constructor-impl(objOnNavigationEvent);
                } catch (WebResourceResponseModel e5) {
                    e = e5;
                    Result.Companion companion22 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    if (Result.onExtraCallback(obj)) {
                    }
                    nativeAdsDto = (NativeAdsDto) obj;
                    if (nativeAdsDto != null) {
                    }
                } catch (Exception e6) {
                    e = e6;
                    Result.Companion companion32 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    if (Result.onExtraCallback(obj)) {
                    }
                    nativeAdsDto = (NativeAdsDto) obj;
                    if (nativeAdsDto != null) {
                    }
                }
                if (Result.onExtraCallback(obj)) {
                    obj = null;
                }
                nativeAdsDto = (NativeAdsDto) obj;
                if (nativeAdsDto != null) {
                    return null;
                }
                iCustomTabsCallbackDefault2.L$0 = access15400.onNavigationEvent(str11);
                iCustomTabsCallbackDefault2.L$1 = access15400.onNavigationEvent(adRequestOption4);
                iCustomTabsCallbackDefault2.L$2 = access15400.onNavigationEvent(str12);
                iCustomTabsCallbackDefault2.L$3 = access15400.onNavigationEvent(str10);
                iCustomTabsCallbackDefault2.L$4 = access15400.onNavigationEvent(access100Var);
                iCustomTabsCallbackDefault2.L$5 = access15400.onNavigationEvent(nativeAdsDto);
                iCustomTabsCallbackDefault2.I$0 = i4;
                iCustomTabsCallbackDefault2.I$1 = 0;
                iCustomTabsCallbackDefault2.label = 4;
                objOnNavigationEvent = onWarmupCompleted(nativeAdsDto, i4, str12, (access13800<? super NativeAdsDto>) iCustomTabsCallbackDefault2);
            }
            FragmentStateAdapter4 fragmentStateAdapter4 = this.IAuthTabCallbackStubProxy;
            iCustomTabsCallbackDefault2.L$0 = str13;
            iCustomTabsCallbackDefault2.L$1 = adRequestOption2;
            iCustomTabsCallbackDefault2.L$2 = str3;
            iCustomTabsCallbackDefault2.I$0 = i2;
            iCustomTabsCallbackDefault2.label = 2;
            objOnNavigationEvent = fragmentStateAdapter4.onNavigationEvent(iCustomTabsCallbackDefault2);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
                int i16 = IPostMessageServiceStubProxy + 77;
                IPostMessageService_Parcel = i16 % 128;
                if (i16 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                str4 = str13;
                adRequestOption3 = adRequestOption2;
                i3 = i2;
                str5 = str3;
                str6 = objOnNavigationEvent;
                IAuthTabCallback(str6, str4);
                access100VarICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(str4);
                Result.Companion companion4 = Result.Companion;
                String strIAuthTabCallbackDefault2 = access100VarICustomTabsCallbackStubProxy.IAuthTabCallbackDefault();
                iCustomTabsCallbackDefault2.L$0 = access15400.onNavigationEvent(str4);
                iCustomTabsCallbackDefault2.L$1 = access15400.onNavigationEvent(adRequestOption3);
                iCustomTabsCallbackDefault2.L$2 = str5;
                iCustomTabsCallbackDefault2.L$3 = access15400.onNavigationEvent(str6);
                iCustomTabsCallbackDefault2.L$4 = access15400.onNavigationEvent(access100VarICustomTabsCallbackStubProxy);
                iCustomTabsCallbackDefault2.L$5 = access15400.onNavigationEvent(iCustomTabsCallbackDefault2);
                iCustomTabsCallbackDefault2.I$0 = i3;
                iCustomTabsCallbackDefault2.I$1 = 0;
                iCustomTabsCallbackDefault2.I$2 = 0;
                iCustomTabsCallbackDefault2.label = 3;
                str7 = str6;
                str8 = str4;
                str9 = str5;
                objOnNavigationEvent = IAuthTabCallback(this, str4, access100VarICustomTabsCallbackStubProxy, adRequestOption3, str6, strIAuthTabCallbackDefault2, (access13800) iCustomTabsCallbackDefault2);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                }
            }
            return objOnWarmupCompleted;
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    static /* synthetic */ Object onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, int i, String str2, access13800 access13800Var, int i2, Object obj) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i5 = IPostMessageServiceStubProxy;
            int i6 = i5 + 21;
            IPostMessageService_Parcel = i6 % 128;
            int i7 = i6 % 2;
            int i8 = nativeAdsManager.onGreatestScrollPercentageIncreased;
            int i9 = i5 + 119;
            IPostMessageService_Parcel = i9 % 128;
            int i10 = i9 % 2;
            i3 = i8;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            int i11 = IPostMessageService_Parcel + 39;
            IPostMessageServiceStubProxy = i11 % 128;
            if (i11 % 2 == 0) {
                String str3 = nativeAdsManager.onMessageChannelReady;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = nativeAdsManager.onMessageChannelReady;
        }
        Object objOnExtraCallback = nativeAdsManager.onExtraCallback(str, adRequestOption, i3, str2, (access13800<? super NativeAdsDto>) access13800Var);
        int i12 = IPostMessageServiceStubProxy + 95;
        IPostMessageService_Parcel = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 24 / 0;
        }
        return objOnExtraCallback;
    }

    static final class ICustomTabsCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ String $spaceUnitId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallbackStub(String str, access13800<? super ICustomTabsCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$spaceUnitId = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackStub iCustomTabsCallbackStub = NativeAdsManager.this.new ICustomTabsCallbackStub(this.$spaceUnitId, access13800Var);
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            NativeAdsManager.onWarmupCompleted(NativeAdsManager.this, this.$spaceUnitId);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4
      0x002b: PHI (r1v11 im.toss.ads_sdk.NativeAdsManager$onMessageChannelReady) = 
      (r1v10 im.toss.ads_sdk.NativeAdsManager$onMessageChannelReady)
      (r1v13 im.toss.ads_sdk.NativeAdsManager$onMessageChannelReady)
     binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull JsonObject jsonObject, @NotNull Map<String, String> map, @NotNull access13800<? super JsonObject> access13800Var) throws Throwable {
        onMessageChannelReady onmessagechannelready;
        JsonPrimitive jsonPrimitive;
        String strOnNavigationEvent;
        Object objOnNavigationEvent;
        JsonObject jsonObject2;
        Map<String, String> map2;
        String str;
        Object obj;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof onMessageChannelReady) {
            int i3 = IPostMessageService_Parcel + 7;
            IPostMessageServiceStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                onmessagechannelready = (onMessageChannelReady) access13800Var;
                i = onmessagechannelready.label;
                int i4 = 18 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onmessagechannelready.label = i - 2147483648;
                } else {
                    onmessagechannelready = new onMessageChannelReady(access13800Var);
                }
            } else {
                onmessagechannelready = (onMessageChannelReady) access13800Var;
                i = onmessagechannelready.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        onMessageChannelReady onmessagechannelready2 = onmessagechannelready;
        Object obj2 = onmessagechannelready2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onmessagechannelready2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj2);
            Object[] objArr = new Object[1];
            b(new char[]{39352, 44535, 39371, 25137, 16310, 41091, 60220, 34214, 42845, 41911, 32063, 10394, 58564}, -TextUtils.lastIndexOf("", '0'), objArr);
            Object obj3 = jsonObject.get(((String) objArr[0]).intern());
            if (obj3 instanceof JsonPrimitive) {
                jsonPrimitive = (JsonPrimitive) obj3;
            } else {
                int i6 = IPostMessageServiceStubProxy + 39;
                IPostMessageService_Parcel = i6 % 128;
                int i7 = i6 % 2;
                jsonPrimitive = null;
            }
            if (jsonPrimitive == null || (strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitive)) == null) {
                strOnNavigationEvent = this.writeTypedList;
                FragmentStateAdapter4 fragmentStateAdapter4 = this.IAuthTabCallbackStubProxy;
                onmessagechannelready2.L$0 = jsonObject;
                onmessagechannelready2.L$1 = map;
                onmessagechannelready2.L$2 = strOnNavigationEvent;
                onmessagechannelready2.label = 1;
                objOnNavigationEvent = fragmentStateAdapter4.onNavigationEvent(onmessagechannelready2);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    jsonObject2 = jsonObject;
                    map2 = map;
                    str = strOnNavigationEvent;
                    obj = objOnNavigationEvent;
                }
            } else {
                if (StringsKt.isBlank(strOnNavigationEvent)) {
                    strOnNavigationEvent = null;
                }
                if (strOnNavigationEvent == null) {
                }
                FragmentStateAdapter4 fragmentStateAdapter42 = this.IAuthTabCallbackStubProxy;
                onmessagechannelready2.L$0 = jsonObject;
                onmessagechannelready2.L$1 = map;
                onmessagechannelready2.L$2 = strOnNavigationEvent;
                onmessagechannelready2.label = 1;
                objOnNavigationEvent = fragmentStateAdapter42.onNavigationEvent(onmessagechannelready2);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                }
            }
        }
        int i8 = IPostMessageServiceStubProxy + 45;
        int i9 = i8 % 128;
        IPostMessageService_Parcel = i9;
        int i10 = i8 % 2;
        if (i5 != 1) {
            int i11 = i9 + 97;
            IPostMessageServiceStubProxy = i11 % 128;
            int i12 = i11 % 2;
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = i9 + 61;
            IPostMessageServiceStubProxy = i13 % 128;
            int i14 = i13 % 2;
            ResultKt.onNavigationEvent(obj2);
            return obj2;
        }
        str = (String) onmessagechannelready2.L$2;
        Map<String, String> map3 = (Map) onmessagechannelready2.L$1;
        JsonObject jsonObject3 = (JsonObject) onmessagechannelready2.L$0;
        ResultKt.onNavigationEvent(obj2);
        map2 = map3;
        jsonObject2 = jsonObject3;
        obj = obj2;
        String str2 = (String) obj;
        IAuthTabCallback(str2, (String) null);
        setTranslateY settranslatey = this.ICustomTabsServiceStub;
        String strOnNavigationEvent2 = this.IAuthTabCallbackStubProxy.onNavigationEvent();
        onmessagechannelready2.L$0 = access15400.onNavigationEvent(jsonObject2);
        onmessagechannelready2.L$1 = access15400.onNavigationEvent(map2);
        onmessagechannelready2.L$2 = access15400.onNavigationEvent(str);
        onmessagechannelready2.L$3 = access15400.onNavigationEvent(str2);
        onmessagechannelready2.label = 2;
        Object objOnExtraCallback = settranslatey.onExtraCallback(str, jsonObject2, strOnNavigationEvent2, str2, map2, onmessagechannelready2);
        return objOnExtraCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallback;
    }

    private final void IAuthTabCallback(String str, String str2) {
        setStrokeColor setstrokecolor;
        asBinder asbinder = this.newSessionWithExtras;
        if (asbinder != null) {
            asbinder.onWarmupCompleted(str);
        }
        if (str2 != null) {
            synchronized (this) {
                setstrokecolor = this.newAuthTabSession.get(str2);
            }
        } else {
            setstrokecolor = null;
        }
        if (setstrokecolor != null) {
            setstrokecolor.IAuthTabCallback(str);
        }
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) throws Throwable {
        CoroutineContext coroutineContextPlus;
        setRandomHost setrandomhost;
        int i;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        int i2 = 2 % 2;
        int i3 = IPostMessageServiceStubProxy + 55;
        IPostMessageService_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        findResAndMsg findresandmsg = (findResAndMsg) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 597082388, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -597082373, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult2);
        if (findresandmsg == null) {
            return null;
        }
        int i4 = IPostMessageServiceStubProxy + 123;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            coroutineContextPlus = putChannelInfo.onExtraCallback().plus(nativeAdsManager.access000);
            setrandomhost = null;
            i = 3;
        } else {
            coroutineContextPlus = putChannelInfo.onExtraCallback().plus(nativeAdsManager.access000);
            setrandomhost = null;
            i = 2;
        }
        return maybeUpdateAnimatable.onNavigationEvent(findresandmsg, coroutineContextPlus, setrandomhost, function2, i, (Object) null);
    }

    public final calculatePageOffsets onExtraCallbackWithResult() {
        calculatePageOffsets calculatepageoffsets;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 107;
        int i3 = i2 % 128;
        IPostMessageService_Parcel = i3;
        if (i2 % 2 != 0) {
            calculatepageoffsets = this.isEngagementSignalsApiAvailable;
            int i4 = 96 / 0;
        } else {
            calculatepageoffsets = this.isEngagementSignalsApiAvailable;
        }
        int i5 = i3 + 19;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return calculatepageoffsets;
    }

    public final void onExtraCallback(@NotNull findResAndMsg findresandmsg, @NotNull final String str, @NotNull final NativeAdsDto.AdAsset adAsset, @NotNull Function0<Boolean> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.isEngagementSignalsApiAvailable.onExtraCallback(findresandmsg, str, adAsset, function0, new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 91;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    NativeAdsManager.onNavigationEvent(this.f$0, adAsset, str, (NativeAdsEventLogType) obj);
                    throw null;
                }
                Unit unitOnNavigationEvent = NativeAdsManager.onNavigationEvent(this.f$0, adAsset, str, (NativeAdsEventLogType) obj);
                int i4 = onNavigationEvent + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        });
        int i2 = IPostMessageServiceStubProxy + 39;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, NativeAdsDto.AdAsset adAsset, String str, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 91;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        asBinder asbinder = nativeAdsManager.newSessionWithExtras;
        if (asbinder != null) {
            asbinder.onExtraCallback(new AdInfo(adAsset.onExtraCallbackWithResult().asInterface(), adAsset.onExtraCallbackWithResult().IAuthTabCallbackStub(), str, adAsset.onExtraCallbackWithResult().IAuthTabCallback()));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IPostMessageService_Parcel + 7;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        asBinder asbinder;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        String str = (String) objArr[2];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[3];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 109;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        if (Intrinsics.areEqual(nativeAdsEventLogType, NativeAdsEventLogType.asInterface.onExtraCallbackWithResult)) {
            asBinder asbinder2 = nativeAdsManager.newSessionWithExtras;
            if (asbinder2 != null) {
                asbinder2.onExtraCallbackWithResult(new AdInfo(adAsset.onExtraCallbackWithResult().asInterface(), adAsset.onExtraCallbackWithResult().IAuthTabCallbackStub(), str, adAsset.onExtraCallbackWithResult().IAuthTabCallback()));
            }
        } else if (!(!Intrinsics.areEqual(nativeAdsEventLogType, NativeAdsEventLogType.getInterfaceDescriptor.onExtraCallbackWithResult)) && (asbinder = nativeAdsManager.newSessionWithExtras) != null) {
            asbinder.IAuthTabCallback(new AdInfo(adAsset.onExtraCallbackWithResult().asInterface(), adAsset.onExtraCallbackWithResult().IAuthTabCallbackStub(), str, adAsset.onExtraCallbackWithResult().IAuthTabCallback()));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IPostMessageService_Parcel + 93;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[3];
        dispatchOnPageScrolled dispatchonpagescrolled = (dispatchOnPageScrolled) objArr[4];
        String str2 = (String) objArr[5];
        Function1 function1 = (Function1) objArr[6];
        Function0 function0 = (Function0) objArr[7];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 25;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(dispatchonpagescrolled, "");
        Intrinsics.checkNotNullParameter(function0, "");
        asBinder asbinder = nativeAdsManager.newSessionWithExtras;
        if (asbinder != null) {
            asbinder.onWarmupCompleted(new AdInfo(adAsset.onExtraCallbackWithResult().asInterface(), adAsset.onExtraCallbackWithResult().IAuthTabCallbackStub(), str, adAsset.onExtraCallbackWithResult().IAuthTabCallback()));
            int i4 = IPostMessageServiceStubProxy + 93;
            IPostMessageService_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr2 = {nativeAdsManager.isEngagementSignalsApiAvailable, str, adAsset, nativeAdsEventLogType, dispatchonpagescrolled, str2, function1, function0};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr2, -25815037, 25815050, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
        return null;
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 3;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        calculatePageOffsets.onExtraCallbackWithResult(this.isEngagementSignalsApiAvailable, false, 1, (Object) null);
        int i4 = IPostMessageService_Parcel + 67;
        IPostMessageServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 125;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.isEngagementSignalsApiAvailable};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 2131831744, -2131831730, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
        int i4 = IPostMessageService_Parcel + 109;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final GetNativeAdsRequestBody.AppInfo onMessageChannelReady(String str) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 45;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String interfaceDescriptor = zzaj.onNavigationEvent().getInterfaceDescriptor();
        String smallIconBitmap = zzaj.onNavigationEvent().getSmallIconBitmap();
        if (str == null) {
            int i4 = IPostMessageService_Parcel + 105;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        GetNativeAdsRequestBody.AppInfo appInfo = new GetNativeAdsRequestBody.AppInfo(interfaceDescriptor, smallIconBitmap, str);
        int i6 = IPostMessageService_Parcel + 81;
        IPostMessageServiceStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return appInfo;
    }

    private final void IAuthTabCallbackStubProxy() {
        synchronized (this) {
            this.extraCallbackWithResult.clear();
            this.onVerticalScrollEvent.clear();
            this.IEngagementSignalsCallbackStub.clear();
        }
    }

    private final long access100(String str) {
        long j;
        synchronized (this) {
            j = this.prefetch + 1;
            this.prefetch = j;
            this.extraCommand.put(str, Long.valueOf(j));
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted(String str, long j) {
        boolean z;
        synchronized (this) {
            Long l = this.extraCommand.get(str);
            if (l != null) {
                z = l.longValue() == j;
            }
        }
        return z;
    }

    private final void IAuthTabCallback(String str, NativeAdsDto nativeAdsDto) {
        synchronized (this) {
            this.extraCallbackWithResult.put(nativeAdsDto.IAuthTabCallbackStub(), new onExtraCallback(str, nativeAdsDto));
            while (this.extraCallbackWithResult.size() > 200) {
                String key = this.extraCallbackWithResult.entrySet().iterator().next().getKey();
                Intrinsics.checkNotNullExpressionValue(key, "");
                final String str2 = key;
                this.extraCallbackWithResult.remove(str2);
                CollectionsKt.removeAll(this.onVerticalScrollEvent, new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda10
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 51;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        Boolean boolValueOf = Boolean.valueOf(NativeAdsManager.onWarmupCompleted(str2, (NativeAdsManager.IAuthTabCallbackStub) obj));
                        int i4 = onNavigationEvent + 11;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return boolValueOf;
                    }
                });
                CollectionsKt.removeAll(this.IEngagementSignalsCallbackStub, new Function1() { // from class: im.toss.ads_sdk.NativeAdsManager$$ExternalSyntheticLambda11
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj) {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 91;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        boolean zOnExtraCallbackWithResult = NativeAdsManager.onExtraCallbackWithResult(str2, (NativeAdsManager.IAuthTabCallbackDefault) obj);
                        if (i3 == 0) {
                            return Boolean.valueOf(zOnExtraCallbackWithResult);
                        }
                        Boolean.valueOf(zOnExtraCallbackWithResult);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
            }
        }
    }

    private static final boolean onExtraCallbackWithResult(String str, IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 25;
        IPostMessageService_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        boolean zAreEqual = Intrinsics.areEqual(iAuthTabCallbackStub.IAuthTabCallback(), str);
        int i4 = IPostMessageService_Parcel + 23;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return zAreEqual;
    }

    private static final boolean onWarmupCompleted(String str, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        boolean zAreEqual;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 29;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            zAreEqual = Intrinsics.areEqual(iAuthTabCallbackDefault.onNavigationEvent(), str);
            int i3 = 76 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            zAreEqual = Intrinsics.areEqual(iAuthTabCallbackDefault.onNavigationEvent(), str);
        }
        int i4 = IPostMessageServiceStubProxy + 47;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return zAreEqual;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final onExtraCallback ICustomTabsCallback(String str) {
        onExtraCallback onextracallback;
        synchronized (this) {
            onextracallback = this.extraCallbackWithResult.get(str);
        }
        return onextracallback;
    }

    private final boolean onWarmupCompleted(String str, NativeAdsDto nativeAdsDto) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.onVerticalScrollEvent.add(new IAuthTabCallbackStub(nativeAdsDto.IAuthTabCallbackStub(), str, nativeAdsDto.onTransact().onNavigationEvent().IAuthTabCallbackStub()));
            onNavigationEvent(this.onVerticalScrollEvent);
        }
        return zAdd;
    }

    private final boolean onExtraCallbackWithResult(String str, NativeAdsDto nativeAdsDto, String str2) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.IEngagementSignalsCallbackStub.add(new IAuthTabCallbackDefault(nativeAdsDto.IAuthTabCallbackStub(), str, nativeAdsDto.onTransact().onNavigationEvent().IAuthTabCallbackStub(), str2));
            onNavigationEvent(this.IEngagementSignalsCallbackStub);
        }
        return zAdd;
    }

    private final void onNavigationEvent(LinkedHashSet<?> linkedHashSet) {
        int i = 2 % 2;
        while (linkedHashSet.size() > 2000) {
            int i2 = IPostMessageServiceStubProxy + 7;
            IPostMessageService_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                Iterator<?> it = linkedHashSet.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                it.next();
                it.remove();
                throw null;
            }
            Iterator<?> it2 = linkedHashSet.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "");
            it2.next();
            it2.remove();
        }
    }

    private final void onExtraCallbackWithResult(String str, long j) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 101;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (this.onActivityLayout.get(str) != onNavigationEvent.AUTO) {
            int i4 = IPostMessageService_Parcel + 85;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            this.updateVisuals.put(str, Long.valueOf(j));
            this.ICustomTabsServiceDefault.remove(str);
            getPackageType getpackagetype = this.validateRelationship.get(str);
            if (getpackagetype != null) {
                int i6 = IPostMessageService_Parcel + 101;
                IPostMessageServiceStubProxy = i6 % 128;
                if (i6 % 2 == 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
            }
            this.validateRelationship.remove(str);
            if (this.ICustomTabsCallbackDefault) {
                int i7 = IPostMessageServiceStubProxy + 11;
                IPostMessageService_Parcel = i7 % 128;
                int i8 = i7 % 2;
                if (j > 0) {
                    this.validateRelationship.put(str, onActivityLayout(str));
                    return;
                }
            }
            if (j == 0) {
                this.ICustomTabsServiceDefault.add(str);
                int i9 = IPostMessageService_Parcel + 115;
                IPostMessageServiceStubProxy = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r1 = r15.updateVisuals.get(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r3 = im.toss.ads_sdk.NativeAdsManager.IPostMessageServiceStubProxy + 117;
        im.toss.ads_sdk.NativeAdsManager.IPostMessageService_Parcel = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if ((r3 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r0 = r1.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r0 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r0 = r1.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r0 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r15.ICustomTabsServiceDefault.add(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        return (o.getPackageType) IAuthTabCallback(o.nSetPosition.onExtraCallbackWithResult(), 2082142470, o.nSetPosition.onExtraCallbackWithResult(), o.nSetPosition.onExtraCallbackWithResult(), -2082142437, new java.lang.Object[]{r15, new im.toss.ads_sdk.NativeAdsManager.postMessage(r0, r15, r16, null)}, o.nSetPosition.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r15.onActivityLayout.get(r16) == im.toss.ads_sdk.NativeAdsManager.onNavigationEvent.AUTO) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r15.onActivityLayout.get(r16) == im.toss.ads_sdk.NativeAdsManager.onNavigationEvent.AUTO) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final getPackageType onActivityLayout(String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 55;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
    }

    static final class postMessage extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ long $initial;
        final /* synthetic */ String $spaceUnitId;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NativeAdsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        postMessage(long j, NativeAdsManager nativeAdsManager, String str, access13800<? super postMessage> access13800Var) {
            super(2, access13800Var);
            this.$initial = j;
            this.this$0 = nativeAdsManager;
            this.$spaceUnitId = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            postMessage postmessage = new postMessage(this.$initial, this.this$0, this.$spaceUnitId, access13800Var);
            postmessage.L$0 = obj;
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return postmessage;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = 97 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            postMessage postmessageCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return postmessageCreate.invokeSuspend(Unit.INSTANCE);
            }
            postmessageCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0078 -> B:20:0x007b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            getPackageType getpackagetype;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                j = this.$initial;
                if (findRes.onWarmupCompleted(findresandmsg)) {
                }
                if (j <= 0) {
                }
                getpackagetype = (getPackageType) NativeAdsManager.readTypedObject(this.this$0).get(this.$spaceUnitId);
                if (getpackagetype != null) {
                }
                NativeAdsManager.readTypedObject(this.this$0).remove(this.$spaceUnitId);
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            ResultKt.onNavigationEvent(obj);
            j--;
            NativeAdsManager.onMinimized(this.this$0).put(this.$spaceUnitId, access14000.onExtraCallback(j));
            if (findRes.onWarmupCompleted(findresandmsg)) {
                if (((Boolean) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -433751357, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 433751388, new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult())).booleanValue() && j > 0) {
                    setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                    long jOnWarmupCompleted = setCommandLine.onWarmupCompleted(1, setRevision.SECONDS);
                    this.L$0 = findresandmsg;
                    this.J$0 = j;
                    this.label = 1;
                    if (formatMsgs.IAuthTabCallback(jOnWarmupCompleted, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    j--;
                    NativeAdsManager.onMinimized(this.this$0).put(this.$spaceUnitId, access14000.onExtraCallback(j));
                    if (findRes.onWarmupCompleted(findresandmsg)) {
                    }
                }
            }
            if (j <= 0) {
                if (!((Boolean) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -433751357, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 433751388, new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult())).booleanValue()) {
                    NativeAdsManager.onActivityLayout(this.this$0).add(this.$spaceUnitId);
                } else {
                    NativeAdsManager.IAuthTabCallbackStub(this.this$0, this.$spaceUnitId);
                }
            }
            getpackagetype = (getPackageType) NativeAdsManager.readTypedObject(this.this$0).get(this.$spaceUnitId);
            if (getpackagetype != null) {
                int i4 = onNavigationEvent + 61;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
            NativeAdsManager.readTypedObject(this.this$0).remove(this.$spaceUnitId);
            return Unit.INSTANCE;
        }
    }

    private final void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 55;
        IPostMessageService_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.validateRelationship.values().iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<T> it = this.validateRelationship.values().iterator();
        while (it.hasNext()) {
            int i3 = IPostMessageServiceStubProxy + 49;
            IPostMessageService_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            getPackageType getpackagetype = (getPackageType) it.next();
            if (getpackagetype != null) {
                int i4 = IPostMessageServiceStubProxy + 85;
                IPostMessageService_Parcel = i4 % 128;
                int i5 = i4 % 2;
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.validateRelationship.clear();
    }

    private final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 13;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.ICustomTabsCallbackDefault) {
            for (Map.Entry<String, Long> entry : this.updateVisuals.entrySet()) {
                int i3 = IPostMessageServiceStubProxy + 51;
                IPostMessageService_Parcel = i3 % 128;
                int i4 = i3 % 2;
                String key = entry.getKey();
                long jLongValue = entry.getValue().longValue();
                if (this.onActivityLayout.get(key) != onNavigationEvent.AUTO) {
                    int i5 = IPostMessageServiceStubProxy + 97;
                    IPostMessageService_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    if (jLongValue > 0) {
                        getPackageType getpackagetype = this.validateRelationship.get(key);
                        if (getpackagetype != null) {
                            int i7 = IPostMessageService_Parcel + 43;
                            IPostMessageServiceStubProxy = i7 % 128;
                            if (i7 % 2 == 0) {
                                if (!getpackagetype.onExtraCallback()) {
                                }
                            } else if (!getpackagetype.onExtraCallback()) {
                            }
                        }
                        this.validateRelationship.put(key, onActivityLayout(key));
                    }
                }
            }
        }
    }

    private final void ICustomTabsCallbackDefault(String str) {
        GetNativeAdsRequestBody.AdRequestOption adRequestOption;
        int i = 2 % 2;
        Iterator<String> it = this.IEngagementSignalsCallback.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i3 = IPostMessageService_Parcel + 63;
            IPostMessageServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(it.next(), str)) {
                i2++;
            } else if (i2 >= 0) {
                adRequestOption = this.onNavigationEvent.get(str);
            }
        }
        int i5 = IPostMessageService_Parcel + 55;
        IPostMessageServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        adRequestOption = null;
    }

    static final class updateVisuals extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $option;
        final /* synthetic */ String $spaceUnitId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        updateVisuals(String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, access13800<? super updateVisuals> access13800Var) {
            super(2, access13800Var);
            this.$spaceUnitId = str;
            this.$option = adRequestOption;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            updateVisuals updatevisuals = NativeAdsManager.this.new updateVisuals(this.$spaceUnitId, this.$option, access13800Var);
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return updatevisuals;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 25 / 0;
            }
            return objInvokeSuspend;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super NativeAdsDto>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $option;
            final /* synthetic */ String $spaceUnitId;
            int I$0;
            int I$1;
            Object L$0;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
                this.$spaceUnitId = str;
                this.$option = adRequestOption;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, this.$spaceUnitId, this.$option, access13800Var);
                int i2 = onWarmupCompleted + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 69;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                if (i3 == 0) {
                    int i4 = 6 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super NativeAdsDto> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 119;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                }
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2;
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onWarmupCompleted = i2 % 128;
                Object obj3 = null;
                if (i2 % 2 == 0) {
                    access14300.onWarmupCompleted();
                    obj3.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        NativeAdsManager nativeAdsManager = this.this$0;
                        String str = this.$spaceUnitId;
                        GetNativeAdsRequestBody.AdRequestOption adRequestOption = this.$option;
                        Result.Companion companion = Result.Companion;
                        getPackageType getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(nativeAdsManager);
                        if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
                        }
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        obj = NativeAdsManager.onWarmupCompleted(nativeAdsManager, str, adRequestOption, 0, (String) null, (access13800) this, 12, (Object) null);
                        if (obj == objOnWarmupCompleted) {
                            int i4 = onExtraCallback + 73;
                            onWarmupCompleted = i4 % 128;
                            if (i4 % 2 != 0) {
                                return objOnWarmupCompleted;
                            }
                            obj3.hashCode();
                            throw null;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    obj2 = Result.constructor-impl(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (WebResourceResponseModel e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (Exception e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                if (Result.exceptionOrNull-impl(obj2) != null) {
                    return null;
                }
                int i5 = onWarmupCompleted + 31;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 44 / 0;
                }
                return obj2;
            }
        }

        /* renamed from: im.toss.ads_sdk.NativeAdsManager$updateVisuals$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ String $spaceUnitId;
            int label;
            final /* synthetic */ NativeAdsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(NativeAdsManager nativeAdsManager, String str, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsManager;
                this.$spaceUnitId = str;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 103;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                obj.hashCode();
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$spaceUnitId, access13800Var);
                int i2 = onNavigationEvent + 59;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 15;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 67;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (WebResourceResponseModel e2) {
                    Result.Companion companion = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (Exception e3) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                    int i7 = IAuthTabCallback + 43;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (i6 == 0) {
                    NativeAdsManager nativeAdsManager = this.this$0;
                    Result.Companion companion3 = Result.Companion;
                    Object[] objArr = {NativeAdsManager.extraCallbackWithResult(nativeAdsManager)};
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -871835226, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
                    obj2 = Result.constructor-impl(Unit.INSTANCE);
                    Result.exceptionOrNull-impl(obj2);
                    return Unit.INSTANCE;
                }
                NativeAdsManager nativeAdsManager2 = this.this$0;
                Result.Companion companion4 = Result.Companion;
                Object[] objArr2 = {NativeAdsManager.extraCallbackWithResult(nativeAdsManager2)};
                int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -871835226, iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
                Result.constructor-impl(Unit.INSTANCE);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
        
            if (o.maybeUpdateAnimatable.onExtraCallback(r2, r3, r12) == r1) goto L27;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(NativeAdsManager.this, this.$spaceUnitId, this.$option, null);
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Unit unit = Unit.INSTANCE;
                int i3 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            NativeAdsDto nativeAdsDto = (NativeAdsDto) obj;
            if (nativeAdsDto == null) {
                ((Map) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult())).put(this.$spaceUnitId, null);
                int i4 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                NativeAdsManager.onWarmupCompleted(NativeAdsManager.this, this.$spaceUnitId, nativeAdsDto, true);
            }
            asBinder asbinderWriteTypedObject = NativeAdsManager.writeTypedObject(NativeAdsManager.this);
            if (asbinderWriteTypedObject != null) {
                int i6 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                asbinderWriteTypedObject.onExtraCallback((Map<String, NativeAdsDto>) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{NativeAdsManager.this}, nSetPosition.onExtraCallbackWithResult()));
            }
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(NativeAdsManager.this, this.$spaceUnitId, null);
            this.L$0 = access15400.onNavigationEvent(nativeAdsDto);
            this.label = 2;
        }
    }

    private final void onUnminimized(String str) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStubProxy + 35;
        IPostMessageService_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
            if (this.onActivityLayout.get(str) == onNavigationEvent.AUTO) {
                return;
            }
        } else if (this.onActivityLayout.get(str) == onNavigationEvent.AUTO) {
            return;
        }
        NativeAdsDto nativeAdsDto = this.access100.get(str);
        if (nativeAdsDto == null || nativeAdsDto.onTransact().IAuthTabCallback() == null) {
            return;
        }
        int i4 = IPostMessageService_Parcel + 25;
        IPostMessageServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            if (nativeAdsDto.onTransact().IAuthTabCallback().doubleValue() < 1.0d) {
                return;
            }
        } else if (nativeAdsDto.onTransact().IAuthTabCallback().doubleValue() < 0.0d) {
            return;
        }
        onExtraCallbackWithResult(str, (long) nativeAdsDto.onTransact().IAuthTabCallback().doubleValue());
    }

    static final class ICustomTabsCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends NativeAdsDto>>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $referrer;
        final /* synthetic */ List<String> $slotIds;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallback_Parcel(String str, List<String> list, String str2, access13800<? super ICustomTabsCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$placementId = str;
            this.$slotIds = list;
            this.$referrer = str2;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Map<String, NativeAdsDto>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback_Parcel iCustomTabsCallback_Parcel = NativeAdsManager.this.new ICustomTabsCallback_Parcel(this.$placementId, this.$slotIds, this.$referrer, access13800Var);
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 64 / 0;
            }
            int i5 = onExtraCallback + 91;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0148 A[LOOP:0: B:52:0x0142->B:54:0x0148, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            NativeAdsManager nativeAdsManager;
            List<String> list;
            int i;
            Object objOnNavigationEvent2;
            String str;
            String str2;
            int i2;
            ICustomTabsCallback_Parcel iCustomTabsCallback_Parcel;
            Object objOnNavigationEvent3;
            int i3 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                objOnNavigationEvent = Result.constructor-impl(ResultKt.createFailure(e2));
                int i5 = onExtraCallback + 77;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 / 2;
                }
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                objOnNavigationEvent = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                nativeAdsManager = NativeAdsManager.this;
                String str3 = this.$placementId;
                list = this.$slotIds;
                String str4 = this.$referrer;
                Result.Companion companion3 = Result.Companion;
                getPackageType getpackagetypeIAuthTabCallbackStubProxy = NativeAdsManager.IAuthTabCallbackStubProxy(nativeAdsManager);
                if (getpackagetypeIAuthTabCallbackStubProxy != null) {
                    int i7 = onExtraCallbackWithResult + 17;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeIAuthTabCallbackStubProxy, (CancellationException) null, 1, (Object) null);
                    int i9 = onExtraCallback + 113;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                }
                FragmentStateAdapter4 fragmentStateAdapter4IAuthTabCallbackStub = NativeAdsManager.IAuthTabCallbackStub(nativeAdsManager);
                this.L$0 = nativeAdsManager;
                this.L$1 = str3;
                this.L$2 = list;
                this.L$3 = str4;
                this.L$4 = access15400.onNavigationEvent(this);
                i = 0;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnNavigationEvent2 = fragmentStateAdapter4IAuthTabCallbackStub.onNavigationEvent(this);
                if (objOnNavigationEvent2 != objOnWarmupCompleted) {
                    str = str3;
                    str2 = str4;
                    i2 = 0;
                    iCustomTabsCallback_Parcel = this;
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = onExtraCallbackWithResult + 79;
                onExtraCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent3 = obj;
                objOnNavigationEvent = Result.constructor-impl(objOnNavigationEvent3);
                if (Result.exceptionOrNull-impl(objOnNavigationEvent) != null) {
                    objOnNavigationEvent = access8100.onNavigationEvent();
                }
                Map map = (Map) objOnNavigationEvent;
                NativeAdsManager nativeAdsManager2 = NativeAdsManager.this;
                LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), NativeAdsManager.onNavigationEvent(nativeAdsManager2, (NativeAdsDto) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2040025895, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2040025905, new Object[]{nativeAdsManager2, NativeAdsManager.IAuthTabCallback(nativeAdsManager2, (NativeAdsDto) entry.getValue())}, nSetPosition.onExtraCallbackWithResult())));
                }
                return linkedHashMap;
            }
            int i12 = this.I$1;
            int i13 = this.I$0;
            ICustomTabsCallback_Parcel iCustomTabsCallback_Parcel2 = (access13800) this.L$4;
            String str5 = (String) this.L$3;
            List<String> list2 = (List) this.L$2;
            str = (String) this.L$1;
            NativeAdsManager nativeAdsManager3 = (NativeAdsManager) this.L$0;
            ResultKt.onNavigationEvent(obj);
            str2 = str5;
            list = list2;
            iCustomTabsCallback_Parcel = iCustomTabsCallback_Parcel2;
            i2 = i13;
            objOnNavigationEvent2 = obj;
            i = i12;
            nativeAdsManager = nativeAdsManager3;
            String str6 = (String) objOnNavigationEvent2;
            access100 access100VarOnTransact = NativeAdsManager.onTransact(nativeAdsManager, (String) CollectionsKt.first(list));
            this.L$0 = access15400.onNavigationEvent(iCustomTabsCallback_Parcel);
            this.L$1 = access15400.onNavigationEvent(str6);
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 2;
            objOnNavigationEvent3 = NativeAdsManager.onNavigationEvent(nativeAdsManager, str, (List) list, access100VarOnTransact, str2, str6, (String) null, (access13800) this);
            if (objOnNavigationEvent3 == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            objOnNavigationEvent = Result.constructor-impl(objOnNavigationEvent3);
            if (Result.exceptionOrNull-impl(objOnNavigationEvent) != null) {
            }
            Map map2 = (Map) objOnNavigationEvent;
            NativeAdsManager nativeAdsManager22 = NativeAdsManager.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(access8100.IAuthTabCallback(map2.size()));
            while (r0.hasNext()) {
            }
            return linkedHashMap2;
        }
    }

    public final void onExtraCallback(@NotNull String str, @NotNull Function1<? super setTrimPathOffset, Unit> function1) {
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 51;
        IPostMessageServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        setTrimPathOffset settrimpathoffset = (setTrimPathOffset) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1802341315, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1802341304, new Object[]{this, str}, iOnExtraCallbackWithResult2);
        if (settrimpathoffset != null) {
            maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor(this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new extraCallback(null, function1, settrimpathoffset), 2, (Object) null);
            return;
        }
        int i3 = IPostMessageServiceStubProxy + 9;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    private final boolean IAuthTabCallback(String str, setStrokeColor setstrokecolor) {
        List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IPostMessageService_Parcel + 63;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDto = this.asInterface.get(str);
        NativeAdsDto.AdAsset adAsset = (nativeAdsDto == null || (listOnExtraCallbackWithResult = nativeAdsDto.onExtraCallbackWithResult()) == null) ? null : (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
        if (nativeAdsDto != null && adAsset != null) {
            int i4 = IPostMessageService_Parcel + 21;
            IPostMessageServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            String strIAuthTabCallbackDefault = adAsset.IAuthTabCallbackDefault();
            if (strIAuthTabCallbackDefault != null && this.onMinimized.contains(strIAuthTabCallbackDefault)) {
                maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor(this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new ICustomTabsCallback(null, setstrokecolor, nativeAdsDto), 2, (Object) null);
                return true;
            }
        }
        scrollToItem scrolltoitem = this.onWarmupCompleted.get(str);
        if (scrolltoitem == null) {
            int i6 = IPostMessageServiceStubProxy + 77;
            IPostMessageService_Parcel = i6 % 128;
            return i6 % 2 != 0;
        }
        maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor(this), putChannelInfo.onExtraCallback(), (setRandomHost) null, new readTypedObject(null, scrolltoitem, setstrokecolor), 2, (Object) null);
        int i7 = IPostMessageServiceStubProxy + 91;
        IPostMessageService_Parcel = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(getInterfaceDescriptor((NativeAdsManager) objArr[0]), putChannelInfo.onExtraCallback(), (setRandomHost) null, new writeTypedObject(null, (setTrimPathOffset) objArr[1], (NativeAdsError) objArr[2]), 2, (Object) null);
        int i2 = IPostMessageService_Parcel + 31;
        IPostMessageServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v51 im.toss.ads_sdk.NativeAdsManager$mayLaunchUrl) = (r1v50 im.toss.ads_sdk.NativeAdsManager$mayLaunchUrl), (r1v53 im.toss.ads_sdk.NativeAdsManager$mayLaunchUrl) binds: [B:10:0x002e, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v24 int) = (r3v23 int), (r3v26 int) binds: [B:10:0x002e, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8 A[LOOP:0: B:62:0x01a2->B:64:0x01a8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull String str, @NotNull List<String> list, @Nullable String str2, @NotNull access13800<? super Map<String, NativeAdsDto>> access13800Var) {
        mayLaunchUrl maylaunchurl;
        String str3;
        String str4;
        List<String> list2;
        Map map;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof mayLaunchUrl) {
            int i3 = IPostMessageServiceStubProxy + 19;
            IPostMessageService_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                maylaunchurl = (mayLaunchUrl) access13800Var;
                i = maylaunchurl.label;
                int i4 = 50 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    maylaunchurl.label = i - 2147483648;
                } else {
                    maylaunchurl = new mayLaunchUrl(access13800Var);
                }
            } else {
                maylaunchurl = (mayLaunchUrl) access13800Var;
                i = maylaunchurl.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        mayLaunchUrl maylaunchurl2 = maylaunchurl;
        Object objOnExtraCallback = maylaunchurl2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = maylaunchurl2.label;
        Object obj = null;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            if (list.isEmpty()) {
                return access8100.onNavigationEvent();
            }
            List<String> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    if (ICustomTabsCallbackStubProxy((String) it.next()).IAuthTabCallback() != addNewItem.NATIVE) {
                        extraCommand extracommand = new extraCommand(list, this, (access13800) null);
                        maylaunchurl2.L$0 = access15400.onNavigationEvent(str);
                        maylaunchurl2.L$1 = access15400.onNavigationEvent(list);
                        maylaunchurl2.L$2 = access15400.onNavigationEvent(str2);
                        maylaunchurl2.label = 1;
                        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(extracommand, maylaunchurl2);
                        if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                            int i6 = IPostMessageService_Parcel + 63;
                            IPostMessageServiceStubProxy = i6 % 128;
                            int i7 = i6 % 2;
                            return objOnExtraCallbackWithResult;
                        }
                        return objOnWarmupCompleted;
                    }
                }
            }
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                int i8 = IPostMessageServiceStubProxy + 25;
                IPostMessageService_Parcel = i8 % 128;
                int i9 = i8 % 2;
                NativeAdsDto nativeAdsDto = this.access100.get((String) it2.next());
                if (nativeAdsDto != null) {
                    this.isEngagementSignalsApiAvailable.IAuthTabCallback(nativeAdsDto.IAuthTabCallbackStub());
                }
            }
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            ICustomTabsCallback_Parcel iCustomTabsCallback_Parcel = new ICustomTabsCallback_Parcel(str, list, str2, null);
            maylaunchurl2.L$0 = access15400.onNavigationEvent(str);
            maylaunchurl2.L$1 = list;
            maylaunchurl2.L$2 = access15400.onNavigationEvent(str2);
            maylaunchurl2.label = 2;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iCustomTabsCallback_Parcel, maylaunchurl2);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                int i10 = IPostMessageService_Parcel + 71;
                IPostMessageServiceStubProxy = i10 % 128;
                if (i10 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                str3 = str;
                str4 = str2;
                list2 = list;
            }
            return objOnWarmupCompleted;
        }
        if (i5 == 1) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            return objOnExtraCallback;
        }
        int i11 = IPostMessageServiceStubProxy + 35;
        IPostMessageService_Parcel = i11 % 128;
        if (i11 % 2 == 0 ? i5 != 2 : i5 != 5) {
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) maylaunchurl2.L$3;
            list2 = (List) maylaunchurl2.L$1;
            ResultKt.onNavigationEvent(objOnExtraCallback);
            List<String> list4 = list2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
            for (Object obj2 : list4) {
                linkedHashMap.put(obj2, (NativeAdsDto) map.get((String) obj2));
                int i12 = IPostMessageService_Parcel + 49;
                IPostMessageServiceStubProxy = i12 % 128;
                int i13 = i12 % 2;
            }
            return linkedHashMap;
        }
        str4 = (String) maylaunchurl2.L$2;
        list2 = (List) maylaunchurl2.L$1;
        str3 = (String) maylaunchurl2.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        Map map2 = (Map) objOnExtraCallback;
        setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
        isEngagementSignalsApiAvailable isengagementsignalsapiavailable = new isEngagementSignalsApiAvailable(list2, map2, this, null);
        maylaunchurl2.L$0 = access15400.onNavigationEvent(str3);
        maylaunchurl2.L$1 = list2;
        maylaunchurl2.L$2 = access15400.onNavigationEvent(str4);
        maylaunchurl2.L$3 = map2;
        maylaunchurl2.label = 3;
        if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, isengagementsignalsapiavailable, maylaunchurl2) != objOnWarmupCompleted) {
            map = map2;
            List<String> list42 = list2;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list42, 10)), 16));
            while (r2.hasNext()) {
            }
            return linkedHashMap2;
        }
        return objOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str, unregisterDataSetObserver unregisterdatasetobserver) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -32133231, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 32133239, new Object[]{nativeAdsManager, str, unregisterdatasetobserver}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ NativeAdsDto onWarmupCompleted(NativeAdsManager nativeAdsManager, NativeAdsDto nativeAdsDto) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (NativeAdsDto) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2040025895, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2040025905, new Object[]{nativeAdsManager, nativeAdsDto}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ setTrimPathOffset onExtraCallback(NativeAdsManager nativeAdsManager, String str, setTrimPathOffset settrimpathoffset) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (setTrimPathOffset) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1432143839, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1432143843, new Object[]{nativeAdsManager, str, settrimpathoffset}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void onExtraCallback(NativeAdsManager nativeAdsManager) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2123829058, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2123829056, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ Map onNavigationEvent(NativeAdsManager nativeAdsManager) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Map) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 928257279, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -928257239, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ Map onTransact(NativeAdsManager nativeAdsManager) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Map) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1272569684, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1272569650, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ Map IAuthTabCallback_Parcel(NativeAdsManager nativeAdsManager) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Map) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 694540167, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -694540146, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ boolean asInterface(NativeAdsManager nativeAdsManager, String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -220818320, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 220818339, new Object[]{nativeAdsManager, str}, iOnExtraCallbackWithResult)).booleanValue();
    }

    public static final /* synthetic */ boolean onPostMessage(NativeAdsManager nativeAdsManager) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -433751357, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 433751388, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult)).booleanValue();
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsManager nativeAdsManager, String str, String str2) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1904660455, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1904660468, new Object[]{nativeAdsManager, str, str2}, iOnExtraCallbackWithResult);
    }

    private final CharSequence onExtraCallback(String str, String str2, String str3, String str4, String str5, ExposureContent exposureContent, String str6, AdMobFailedReason adMobFailedReason) {
        return (CharSequence) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 772268527, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -772268510, new Object[]{this, str, str2, str3, str4, str5, exposureContent, str6, adMobFailedReason}, nSetPosition.onExtraCallbackWithResult());
    }

    static /* synthetic */ CharSequence onExtraCallbackWithResult(NativeAdsManager nativeAdsManager, String str, String str2, String str3, String str4, String str5, ExposureContent exposureContent, String str6, AdMobFailedReason adMobFailedReason, int i, Object obj) {
        return (CharSequence) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1372061357, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1372061352, new Object[]{nativeAdsManager, str, str2, str3, str4, str5, exposureContent, str6, adMobFailedReason, Integer.valueOf(i), obj}, nSetPosition.onExtraCallbackWithResult());
    }

    private final void onExtraCallbackWithResult(List<String> list) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1447398757, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1447398733, new Object[]{this, list}, iOnExtraCallbackWithResult);
    }

    private final setStrokeColor readTypedObject(String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (setStrokeColor) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1777679235, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1777679196, new Object[]{this, str}, iOnExtraCallbackWithResult);
    }

    private final Intent onNavigationEvent(Context context, NativeAdsDto nativeAdsDto, deleteProfile deleteprofile) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Intent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2123852411, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2123852449, new Object[]{this, context, nativeAdsDto, deleteprofile}, iOnExtraCallbackWithResult);
    }

    private final void onWarmupCompleted(setTrimPathOffset settrimpathoffset, NativeAdsError nativeAdsError) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -275099588, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 275099617, new Object[]{this, settrimpathoffset, nativeAdsError}, iOnExtraCallbackWithResult);
    }

    private final void onWarmupCompleted(List<String> list, int i, NativeAdsDto nativeAdsDto, NativeAdsDto.Mediation mediation, AppCompatActivity appCompatActivity, boolean z, Integer num, deleteProfile deleteprofile, setStrokeColor setstrokecolor, String str, long j, int i2, String str2, String str3, String str4, AdError adError) throws Throwable {
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 517095822, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -517095780, new Object[]{this, list, Integer.valueOf(i), nativeAdsDto, mediation, appCompatActivity, Boolean.valueOf(z), num, deleteprofile, setstrokecolor, str, Long.valueOf(j), Integer.valueOf(i2), str2, str3, str4, adError}, nSetPosition.onExtraCallbackWithResult());
    }

    private final void IAuthTabCallback_Parcel() throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 823603499, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -823603490, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    private final void writeTypedObject(String str) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 731593341, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -731593321, new Object[]{this, str}, iOnExtraCallbackWithResult);
    }

    private final MediationPriority ICustomTabsCallback() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (MediationPriority) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -674206288, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 674206302, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    private final requestParentDisallowInterceptTouchEvent extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (requestParentDisallowInterceptTouchEvent) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2086824780, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2086824739, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    private final findResAndMsg extraCallback() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (findResAndMsg) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 597082388, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -597082373, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallback(NativeAdsManager nativeAdsManager, NativeAdsDto.AdAsset adAsset, String str, NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 651746210, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -651746184, new Object[]{nativeAdsManager, adAsset, str, nativeAdsEventLogType}, iOnExtraCallbackWithResult);
    }

    private final getPackageType IAuthTabCallback(Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (getPackageType) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2082142470, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2082142437, new Object[]{this, function2}, iOnExtraCallbackWithResult);
    }

    private final void onNavigationEvent(String str, NativeAdsDto nativeAdsDto) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 383534523, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -383534520, new Object[]{this, str, nativeAdsDto}, iOnExtraCallbackWithResult);
    }

    private final Boolean onExtraCallback(JSONObject jSONObject, String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (Boolean) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -815893111, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 815893136, new Object[]{this, jSONObject, str}, iOnExtraCallbackWithResult);
    }

    private static final setInternalPageChangeListener onUnminimized(NativeAdsManager nativeAdsManager) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (setInternalPageChangeListener) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1218754100, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1218754123, new Object[]{nativeAdsManager}, iOnExtraCallbackWithResult);
    }

    private final Object onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, int i, String str, access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -709888601, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 709888638, new Object[]{this, nativeAdsDto, Integer.valueOf(i), str, access13800Var}, nSetPosition.onExtraCallbackWithResult());
    }

    private final NativeAdsDto onExtraCallback(NativeAdsDto nativeAdsDto) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (NativeAdsDto) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -628965044, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 628965062, new Object[]{this, nativeAdsDto}, iOnExtraCallbackWithResult);
    }

    private final void IAuthTabCallback(String str, setTrimPathOffset settrimpathoffset) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1197578342, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1197578330, new Object[]{this, str, settrimpathoffset}, iOnExtraCallbackWithResult);
    }

    private final setTrimPathOffset ICustomTabsCallbackStub(String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (setTrimPathOffset) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1802341315, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1802341304, new Object[]{this, str}, iOnExtraCallbackWithResult);
    }

    private final void onWarmupCompleted(NativeAdsDto nativeAdsDto, int i, String str, String str2, Integer num, String str3, String str4, String str5) throws Throwable {
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2007578406, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2007578374, new Object[]{this, nativeAdsDto, Integer.valueOf(i), str, str2, num, str3, str4, str5}, nSetPosition.onExtraCallbackWithResult());
    }

    private final Object IAuthTabCallback(String str, access100 access100Var, GetNativeAdsRequestBody.AdRequestOption adRequestOption, String str2, String str3, access13800<? super NativeAdsDto> access13800Var) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1982624510, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1982624467, new Object[]{this, str, access100Var, adRequestOption, str2, str3, access13800Var}, iOnExtraCallbackWithResult);
    }

    private final void onWarmupCompleted(AppCompatActivity appCompatActivity, String str, NativeAdsDto nativeAdsDto, Intent intent, setTrimPathOffset settrimpathoffset) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -369413561, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 369413577, new Object[]{this, appCompatActivity, str, nativeAdsDto, intent, settrimpathoffset}, iOnExtraCallbackWithResult);
    }

    private final void onExtraCallback(List<onTransact> list) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -2036096770, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2036096806, new Object[]{this, list}, iOnExtraCallbackWithResult);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 695726411, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -695726405, new Object[]{this, str, nativeAdsThumbnailAdMobView}, iOnExtraCallbackWithResult);
    }

    public final NativeAdsDto.AdmobInfo IAuthTabCallback(@NotNull String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return (NativeAdsDto.AdmobInfo) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1807668884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1807668884, new Object[]{this, str}, iOnExtraCallbackWithResult);
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset, @Nullable NativeAdsEventLogType nativeAdsEventLogType, @NotNull dispatchOnPageScrolled dispatchonpagescrolled, @Nullable String str2, @Nullable Function1<? super NativeAdsEventLogType, Unit> function1, @NotNull Function0<Unit> function0) throws Throwable {
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 461439007, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -461438985, new Object[]{this, str, adAsset, nativeAdsEventLogType, dispatchonpagescrolled, str2, function1, function0}, nSetPosition.onExtraCallbackWithResult());
    }

    public final boolean IAuthTabCallbackStub(@NotNull String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 2016815888, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -2016815860, new Object[]{this, str}, iOnExtraCallbackWithResult)).booleanValue();
    }

    public final void onExtraCallback(@NotNull findResAndMsg findresandmsg, @NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset, @NotNull Function0<Boolean> function0, @NotNull Function0<Boolean> function02) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1869487633, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1869487598, new Object[]{this, findresandmsg, str, adAsset, function0, function02}, iOnExtraCallbackWithResult);
    }

    public final void onNavigationEvent(@NotNull removeNonDecorViews removenondecorviews) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1941440202, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1941440172, new Object[]{this, removenondecorviews}, iOnExtraCallbackWithResult);
    }

    public final void onExtraCallbackWithResult(@NotNull Map<String, String> map) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1221152744, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1221152788, new Object[]{this, map}, iOnExtraCallbackWithResult);
    }

    public final void onExtraCallback(@NotNull findResAndMsg findresandmsg) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1109048653, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1109048646, new Object[]{this, findresandmsg}, iOnExtraCallbackWithResult);
    }

    static void asInterface() {
        IPostMessageServiceDefault = new char[]{12273, 60902};
        IEngagementSignalsCallback_Parcel = -5640906862655248320L;
        IPostMessageService = 6523156109905736879L;
    }
}
