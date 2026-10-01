package im.toss.ads_sdk.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.admob.AdmobAdFormat;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.remote.model.AdMobFailedReason;
import im.toss.ads_sdk.remote.model.AdmobError;
import im.toss.ads_sdk.remote.model.ExposureContent;
import im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setSecureScreen;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp;
import o.SpannedDataExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda17;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access8100;
import o.endRearDisplayPresentationSession;
import o.findRes;
import o.findResAndMsg;
import o.getCount;
import o.getFillAlpha;
import o.getPackageType;
import o.getRearDisplayMetrics;
import o.getScaleX;
import o.getStrokeWidth;
import o.getWrite;
import o.nSetPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsThumbnailVideoView extends NativeAdsContainerView {
    private static short[] extraCommand;
    private NativeAdsDto.AdAsset IAuthTabCallback;
    private NativeAdsDto.Creative.ThumbnailBanner IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private TextFieldScrollKtExternalSyntheticLambda0 ICustomTabsCallback;
    private getPackageType ICustomTabsCallbackDefault;
    private List<? extends NativeAdsEventLogType> ICustomTabsCallbackStubProxy;
    private boolean access000;
    private boolean access100;
    private final Set<Long> asBinder;
    private final Set<Long> asInterface;
    private final NativeAdsThumbnailVideoView$lifecycleObserver$1 extraCallback;
    private boolean extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private final String onActivityLayout;
    private final onNavigationEvent onActivityResized;
    private NativeAdsThumbnailAdMobView onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private ExoPlayer onMessageChannelReady;
    private Function0<Unit> onMinimized;
    private final getCount onNavigationEvent;
    private final ViewTreeObserver.OnScrollChangedListener onPostMessage;
    private boolean onTransact;
    private String onWarmupCompleted;
    private final View.OnLayoutChangeListener readTypedObject;
    private Function1<? super NativeAdsEventLogType, Unit> writeTypedObject;
    private static final byte[] $$a = {70, -47, -65, 52};
    private static final int $$b = 148;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int isEngagementSignalsApiAvailable = 0;
    private static int ICustomTabsService = 1;
    private static int onUnminimized = 651166385;
    private static int onRelationshipValidationResult = -1538795472;
    private static int ICustomTabsCallbackStub = 1301593841;
    private static byte[] ICustomTabsCallback_Parcel = {-63, -61, -14, -11, 3, -15, -10, 74, -63, -7, 3, 9, -7, 66, -13, 13, -74, 9, -9, 10, 72, -49, 8, -1, 74, -63, -2, -15, 14, -12, 78, -73, -9, 4, -14, 50, -65, 76, 13, -64, -15, -10, 73, -76, 13, -9, 4, -14, 50, -54, 12, 51, -77, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4, 2, -15, -10, 74, -63, -7, 3, 9, -7, 66, -13, 13, -74, 9, -9, 10, 72, -73, -9, 74, -63, -2, -15, 14, -12, 78, -73, -9, 4, -14, 50, -65, 76, 13, -64, -15, -10, 73, -76, 13, -9, 4, -14, 50, -54, 12, 51, -77, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4};

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[NativeAdsDto.ThumbnailBannerContentType.values().length];
            try {
                iArr[NativeAdsDto.ThumbnailBannerContentType.IMAGE.ordinal()] = 1;
                int i = onWarmupCompleted + 49;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeAdsDto.ThumbnailBannerContentType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i3 = onWarmupCompleted + 97;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private static String $$c(int i, byte b, short s) {
        int i2 = (s * 3) + 115;
        int i3 = i * 2;
        int i4 = (b * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += -i3;
            i4++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i4];
            i4++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsThumbnailVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsThumbnailVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = ~(i6 | i2);
        int i10 = i7 | (~i6);
        int i11 = i9 | (~(i10 | i));
        int i12 = (~i) | i10;
        int i13 = i6 + i2 + i3 + (1134938392 * i4) + ((-1730424158) * i5);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i6) + 1061748736 + ((-382549644) * i2) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i3) + (1924136960 * i4) + (748945408 * i5) + (912850944 * i14);
        int i16 = (i6 * 1914917686) + 639827133 + (i2 * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i3 * 1914918157) + (i4 * (-1451741640)) + (i5 * (-1338016710)) + (i14 * (-1605042176));
        switch (i15 + (i16 * i16 * (-230752256))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
                int i17 = 2 % 2;
                int i18 = isEngagementSignalsApiAvailable + 103;
                ICustomTabsService = i18 % 128;
                int i19 = i18 % 2;
                nativeAdsThumbnailVideoView.extraCommand();
                int i20 = ICustomTabsService + 19;
                isEngagementSignalsApiAvailable = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asBinder(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallback_Parcel(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access100(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return writeTypedObject(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 43;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(nativeAdsThumbnailVideoView);
        int i4 = isEngagementSignalsApiAvailable + 23;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 83;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(nativeAdsThumbnailVideoView, motionEvent);
        int i4 = ICustomTabsService + 123;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = isEngagementSignalsApiAvailable + 125;
        ICustomTabsService = i10 % 128;
        int i11 = i10 % 2;
        onWarmupCompleted(nativeAdsThumbnailVideoView, view, i, i2, i3, i4, i5, i6, i7, i8);
        if (i11 == 0) {
            throw null;
        }
        int i12 = isEngagementSignalsApiAvailable + 5;
        ICustomTabsService = i12 % 128;
        int i13 = i12 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 71;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            extraCallback(nativeAdsThumbnailVideoView);
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCallback = extraCallback(nativeAdsThumbnailVideoView);
        int i3 = isEngagementSignalsApiAvailable + 41;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 != 0) {
            return unitExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsCallback(nativeAdsThumbnailVideoView);
            throw null;
        }
        Unit unitICustomTabsCallback = ICustomTabsCallback(nativeAdsThumbnailVideoView);
        int i3 = ICustomTabsService + 1;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return unitICustomTabsCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 37;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            postMessage();
            obj.hashCode();
            throw null;
        }
        Unit unitPostMessage = postMessage();
        int i3 = isEngagementSignalsApiAvailable + 5;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 != 0) {
            return unitPostMessage;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 113;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(nativeAdsThumbnailVideoView, motionEvent);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsThumbnailVideoView, motionEvent);
        int i3 = isEngagementSignalsApiAvailable + 89;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 19;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsThumbnailVideoView, thumbnailBanner);
        int i4 = ICustomTabsService + 1;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 75;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(nativeAdsThumbnailVideoView, motionEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsThumbnailVideoView, motionEvent);
        int i3 = ICustomTabsService + 73;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ getScaleX onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        getScaleX getscalexOnNavigationEvent = onNavigationEvent(context);
        int i4 = isEngagementSignalsApiAvailable + 53;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return getscalexOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(nativeAdsThumbnailVideoView);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(nativeAdsThumbnailVideoView, view);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, View view) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 65;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 222693184, new Object[]{nativeAdsThumbnailVideoView, view}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -222693175);
        int i4 = ICustomTabsService + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 57;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(nativeAdsThumbnailVideoView);
        int i4 = ICustomTabsService + 79;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 71;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(nativeAdsThumbnailVideoView, motionEvent);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 39;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAd nativeAd, NativeAd nativeAd2) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 65;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(nativeAdsThumbnailVideoView, nativeAd, nativeAd2);
        }
        IAuthTabCallback(nativeAdsThumbnailVideoView, nativeAd, nativeAd2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView$lifecycleObserver$1] */
    public NativeAdsThumbnailVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onActivityLayout = "NativeAdsThumbnailVideoView";
        this.IAuthTabCallbackStub = "16:9";
        this.IAuthTabCallback_Parcel = "16:9";
        this.onWarmupCompleted = "";
        getCount getcountIAuthTabCallback = getCount.IAuthTabCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(getcountIAuthTabCallback, "");
        this.onNavigationEvent = getcountIAuthTabCallback;
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda0(context));
        this.ICustomTabsCallbackStubProxy = CollectionsKt.emptyList();
        this.onMinimized = new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda5();
        this.asBinder = new LinkedHashSet();
        this.asInterface = new LinkedHashSet();
        this.onPostMessage = new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda6(this);
        this.readTypedObject = new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda7(this);
        this.extraCallback = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView$lifecycleObserver$1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 != 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r9
              0x0032: PHI (r9v4 com.google.android.exoplayer2.ExoPlayer) = (r9v3 com.google.android.exoplayer2.ExoPlayer), (r9v14 com.google.android.exoplayer2.ExoPlayer) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                ExoPlayer exoPlayerAccess100;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    NativeAdsThumbnailVideoView.onExtraCallback(this.IAuthTabCallback, true);
                    exoPlayerAccess100 = NativeAdsThumbnailVideoView.access100(this.IAuthTabCallback);
                    if (exoPlayerAccess100 != null) {
                        exoPlayerAccess100.pause();
                    }
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    NativeAdsThumbnailVideoView.onExtraCallback(this.IAuthTabCallback, true);
                    exoPlayerAccess100 = NativeAdsThumbnailVideoView.access100(this.IAuthTabCallback);
                    if (exoPlayerAccess100 != null) {
                    }
                }
                ((NativeAdsThumbnailAdMobView) NativeAdsThumbnailVideoView.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1294516599, new Object[]{this.IAuthTabCallback}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1294516585)).setOnViewVisible(false);
                int i4 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                NativeAdsThumbnailVideoView.onExtraCallback(this.IAuthTabCallback, false);
                NativeAdsThumbnailVideoView.extraCallbackWithResult(this.IAuthTabCallback);
                int i5 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        };
        this.onActivityResized = new onNavigationEvent();
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Typography7 typography7 = getcountIAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, typography7, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda8(this), new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda9(this), 2045, null);
        TdsImageView tdsImageView = getcountIAuthTabCallback.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsImageView, false, null, 0, null, null, 0.0f, 1.0f, null, false, 0L, null, new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda10(this), new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda11(this), 1981, null);
        TdsImageView tdsImageView2 = getcountIAuthTabCallback.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsImageView2, false, null, 0, null, null, 0.0f, 1.0f, null, false, 0L, null, new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda12(this), new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda13(this), 1981, null);
        StyledPlayerView styledPlayerView = getcountIAuthTabCallback.access100;
        Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, styledPlayerView, false, null, 0, null, null, 0.0f, 1.0f, null, false, 0L, null, new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda1(this), new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda2(this), 1981, null);
        getcountIAuthTabCallback.onWarmupCompleted.setOnClickListener(new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda3(this));
        getcountIAuthTabCallback.onExtraCallbackWithResult.onExtraCallback.setOnClickListener(new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda4(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsThumbnailVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = isEngagementSignalsApiAvailable + 57;
            ICustomTabsService = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = ICustomTabsService + 57;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        nativeAdsThumbnailVideoView.ICustomTabsService();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsService + 47;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, String str, PlaybackException playbackException) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.IAuthTabCallback(thumbnailBanner, str, playbackException);
        int i4 = ICustomTabsService + 85;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, String str, ExposureContent exposureContent) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 35;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onWarmupCompleted(str, exposureContent);
        int i4 = ICustomTabsService + 85;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ getCount IAuthTabCallbackDefault(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        getCount getcount = nativeAdsThumbnailVideoView.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return getcount;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        nativeAdsThumbnailVideoView.onTransact = zBooleanValue;
        int i5 = i3 + 25;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ Set IAuthTabCallbackStub(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        Set<Long> set = nativeAdsThumbnailVideoView.asBinder;
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = i3 + 3;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 78 / 0;
        }
        return set;
    }

    public static final /* synthetic */ Function1 IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 7;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        Function1<? super NativeAdsEventLogType, Unit> function1 = nativeAdsThumbnailVideoView.writeTypedObject;
        int i5 = i2 + 21;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public static final /* synthetic */ List IAuthTabCallback_Parcel(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 59;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        List<? extends NativeAdsEventLogType> list = nativeAdsThumbnailVideoView.ICustomTabsCallbackStubProxy;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 55;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobViewAccess000 = nativeAdsThumbnailVideoView.access000();
        int i4 = isEngagementSignalsApiAvailable + 49;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return nativeAdsThumbnailAdMobViewAccess000;
    }

    public static final /* synthetic */ ExoPlayer access100(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 113;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        ExoPlayer exoPlayer = nativeAdsThumbnailVideoView.onMessageChannelReady;
        int i5 = i3 + 75;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return exoPlayer;
    }

    public static final /* synthetic */ void asInterface(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.IAuthTabCallbackStubProxy();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 123;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void extraCallbackWithResult(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 27;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.mayLaunchUrl();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.isEngagementSignalsApiAvailable();
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsService + 61;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void onExtraCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 103;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        nativeAdsThumbnailVideoView.IAuthTabCallbackStubProxy = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 25;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, long j) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 49;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onExtraCallbackWithResult(j);
        int i4 = isEngagementSignalsApiAvailable + 101;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 1;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.IAuthTabCallback(nativeAd);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = ICustomTabsService + 19;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 111;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2041552885, new Object[]{nativeAdsThumbnailVideoView, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2041552893);
        int i4 = ICustomTabsService + 17;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, boolean z) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 31;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onWarmupCompleted(z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Set onTransact(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 53;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        Set<Long> set = nativeAdsThumbnailVideoView.asInterface;
        int i5 = i3 + 39;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return set;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            ((Boolean) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -833872293, new Object[]{nativeAdsThumbnailVideoView, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 833872295)).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -833872293, new Object[]{nativeAdsThumbnailVideoView, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 833872295)).booleanValue();
        int i3 = isEngagementSignalsApiAvailable + 23;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 119;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onActivityLayout;
            int i4 = 38 / 0;
        } else {
            str = this.onActivityLayout;
        }
        int i5 = i2 + 87;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 71;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 37;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAdRequestId(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 75;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        int i3 = ICustomTabsService + 7;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
    }

    private final getScaleX IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        getScaleX getscalex = (getScaleX) this.onExtraCallbackWithResult.getValue();
        int i4 = isEngagementSignalsApiAvailable + 11;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return getscalex;
    }

    private static final getScaleX onNavigationEvent(Context context) {
        int i = 2 % 2;
        getScaleX getscalex = new getScaleX(context);
        int i2 = isEngagementSignalsApiAvailable + 95;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
        return getscalex;
    }

    private static final Unit postMessage() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final NativeAdsThumbnailAdMobView access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = this.onExtraCallback;
            int i3 = 52 / 0;
            if (nativeAdsThumbnailAdMobView != null) {
                return nativeAdsThumbnailAdMobView;
            }
        } else {
            NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView2 = this.onExtraCallback;
            if (nativeAdsThumbnailAdMobView2 != null) {
                return nativeAdsThumbnailAdMobView2;
            }
        }
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView3 = this.onNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(nativeAdsThumbnailAdMobView3, "");
        int i4 = ICustomTabsService + 65;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return nativeAdsThumbnailAdMobView3;
    }

    private static final void onMessageChannelReady(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.mayLaunchUrl();
        int i4 = isEngagementSignalsApiAvailable + 41;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    private static final void onWarmupCompleted(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = isEngagementSignalsApiAvailable + 29;
        ICustomTabsService = i10 % 128;
        int i11 = i10 % 2;
        nativeAdsThumbnailVideoView.mayLaunchUrl();
        int i12 = ICustomTabsService + 81;
        isEngagementSignalsApiAvailable = i12 % 128;
        int i13 = i12 % 2;
    }

    public static final class onNavigationEvent implements Player.Listener {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        onNavigationEvent() {
        }

        public void onIsPlayingChanged(boolean z) {
            int i;
            int i2 = 2 % 2;
            ConstraintLayout constraintLayout = NativeAdsThumbnailVideoView.IAuthTabCallbackDefault(NativeAdsThumbnailVideoView.this).onExtraCallbackWithResult.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            if (z) {
                i = 8;
            } else {
                int i3 = onWarmupCompleted + 97;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            }
            constraintLayout.setVisibility(i);
            TdsImageView tdsImageView = NativeAdsThumbnailVideoView.IAuthTabCallbackDefault(NativeAdsThumbnailVideoView.this).onExtraCallbackWithResult.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(!z ? 0 : 8);
            Typography5 typography5 = NativeAdsThumbnailVideoView.IAuthTabCallbackDefault(NativeAdsThumbnailVideoView.this).onExtraCallbackWithResult.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            typography5.setVisibility(z ? 8 : 0);
            if (!z) {
                NativeAdsThumbnailVideoView.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1420206872, new Object[]{NativeAdsThumbnailVideoView.this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1420206877);
                return;
            }
            int i5 = onNavigationEvent + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            Function1 function1IAuthTabCallbackStubProxy = NativeAdsThumbnailVideoView.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoView.this);
            if (function1IAuthTabCallbackStubProxy != null) {
                int i7 = onNavigationEvent + 73;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    function1IAuthTabCallbackStubProxy.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
                    throw null;
                }
                function1IAuthTabCallbackStubProxy.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
            }
            NativeAdsThumbnailVideoView.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1867583997, new Object[]{NativeAdsThumbnailVideoView.this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1867584000);
        }

        public void onRenderedFirstFrame() {
            TdsImageView tdsImageView;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 101;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                tdsImageView = NativeAdsThumbnailVideoView.IAuthTabCallbackDefault(NativeAdsThumbnailVideoView.this).IAuthTabCallback_Parcel;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                i = 59;
            } else {
                tdsImageView = NativeAdsThumbnailVideoView.IAuthTabCallbackDefault(NativeAdsThumbnailVideoView.this).IAuthTabCallback_Parcel;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                i = 8;
            }
            tdsImageView.setVisibility(i);
        }

        public void onPlaybackStateChanged(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (i == 4) {
                NativeAdsThumbnailVideoView.asInterface(NativeAdsThumbnailVideoView.this);
                Function1 function1IAuthTabCallbackStubProxy = NativeAdsThumbnailVideoView.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoView.this);
                if (function1IAuthTabCallbackStubProxy != null) {
                    function1IAuthTabCallbackStubProxy.invoke(NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted);
                    int i5 = onWarmupCompleted + 83;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                }
                NativeAdsThumbnailVideoView.onNavigationEvent(NativeAdsThumbnailVideoView.this, true);
                ConstraintLayout constraintLayout = NativeAdsThumbnailVideoView.IAuthTabCallbackDefault(NativeAdsThumbnailVideoView.this).onExtraCallbackWithResult.onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                TdsImageView tdsImageView = NativeAdsThumbnailVideoView.IAuthTabCallbackDefault(NativeAdsThumbnailVideoView.this).onExtraCallbackWithResult.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(0);
                Typography5 typography5 = NativeAdsThumbnailVideoView.IAuthTabCallbackDefault(NativeAdsThumbnailVideoView.this).onExtraCallbackWithResult.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(typography5, "");
                typography5.setVisibility(0);
            }
        }
    }

    private static final Unit extraCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onMinimized.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = ICustomTabsService + 29;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 103;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) TextUtils.getOffsetBefore("", 0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 2103977288 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 372021559, TextUtils.indexOf("", "", 0) - 57, objArr);
        nativeAdsThumbnailVideoView.onExtraCallback(((String) objArr[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 5;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit readTypedObject(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        nativeAdsThumbnailVideoView.onMinimized.invoke();
        if (i3 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 83;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onExtraCallback("201");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 51;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit ICustomTabsCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onMinimized.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsService + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 89;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onExtraCallback("301");
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsService + 119;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    private static final Unit onPostMessage(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 73;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onMinimized.invoke();
        if (i3 != 0) {
            return Unit.INSTANCE;
        }
        int i4 = 93 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.onExtraCallback("301");
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 73;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, View view) throws Throwable {
        boolean z;
        float f;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 103;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayer exoPlayer = nativeAdsThumbnailVideoView.onMessageChannelReady;
        if (exoPlayer == null) {
            return;
        }
        if (exoPlayer.getVolume() > 0.0f) {
            z = true;
        } else {
            int i4 = ICustomTabsService + 13;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (z) {
            int i6 = ICustomTabsService + 5;
            isEngagementSignalsApiAvailable = i6 % 128;
            f = i6 % 2 != 0 ? 2.0f : 0.0f;
        } else {
            f = 1.0f;
        }
        exoPlayer.setVolume(f);
        Function1<? super NativeAdsEventLogType, Unit> function1 = nativeAdsThumbnailVideoView.writeTypedObject;
        if (function1 != null) {
            int i7 = isEngagementSignalsApiAvailable + 97;
            ICustomTabsService = i7 % 128;
            int i8 = i7 % 2;
            function1.invoke(z ? NativeAdsEventLogType.writeTypedObject.onExtraCallback : NativeAdsEventLogType.onPostMessage.IAuthTabCallback);
        }
        nativeAdsThumbnailVideoView.onNavigationEvent(exoPlayer.getVolume() == 0.0f);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ExoPlayer exoPlayer = nativeAdsThumbnailVideoView.onMessageChannelReady;
        if (exoPlayer == null) {
            return null;
        }
        if (exoPlayer.isPlaying()) {
            nativeAdsThumbnailVideoView.extraCallbackWithResult = true;
            nativeAdsThumbnailVideoView.onWarmupCompleted(false);
            exoPlayer.pause();
            return null;
        }
        nativeAdsThumbnailVideoView.extraCallbackWithResult = false;
        if (exoPlayer.getPlaybackState() == 4) {
            exoPlayer.seekTo(0L);
            int i4 = isEngagementSignalsApiAvailable + 13;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
        }
        nativeAdsThumbnailVideoView.onWarmupCompleted(false);
        exoPlayer.play();
        return null;
    }

    @Override // o.RestrictionAllowlist
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 19;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        mayLaunchUrl();
        int i4 = isEngagementSignalsApiAvailable + 89;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onAttachedToWindow() {
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        super.onAttachedToWindow();
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        this.ICustomTabsCallback = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle()) != null) {
            int i2 = ICustomTabsService + 119;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            lifecycle.IAuthTabCallback(this.extraCallback);
            int i4 = ICustomTabsService + 81;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
        getViewTreeObserver().addOnScrollChangedListener(this.onPostMessage);
        addOnLayoutChangeListener(this.readTypedObject);
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1738885333, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1738885343);
        mayLaunchUrl();
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 63;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        if (i2 % 2 != 0) {
            boolean z = nativeAdsThumbnailVideoView.onTransact;
            throw null;
        }
        if (!nativeAdsThumbnailVideoView.onTransact) {
            int i4 = i3 + 11;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 == 0) {
                NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = nativeAdsThumbnailVideoView.IAuthTabCallbackDefault;
                throw null;
            }
            NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner2 = nativeAdsThumbnailVideoView.IAuthTabCallbackDefault;
            if (thumbnailBanner2 != null) {
                if (((NativeAdsDto.ThumbnailBannerContentType) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1893907374, new Object[]{nativeAdsThumbnailVideoView, thumbnailBanner2}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1893907368)) == NativeAdsDto.ThumbnailBannerContentType.VIDEO) {
                    int i5 = isEngagementSignalsApiAvailable + 51;
                    ICustomTabsService = i5 % 128;
                    int i6 = i5 % 2;
                    if (nativeAdsThumbnailVideoView.onMessageChannelReady == null) {
                        TdsImageView tdsImageView = nativeAdsThumbnailVideoView.onNavigationEvent.IAuthTabCallback_Parcel;
                        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                        tdsImageView.setVisibility(0);
                        ConstraintLayout constraintLayout = nativeAdsThumbnailVideoView.onNavigationEvent.onExtraCallbackWithResult.onExtraCallbackWithResult;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                        constraintLayout.setVisibility(0);
                        TdsImageView tdsImageView2 = nativeAdsThumbnailVideoView.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallback;
                        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                        tdsImageView2.setVisibility(0);
                        Typography5 typography5 = nativeAdsThumbnailVideoView.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallbackDefault;
                        Intrinsics.checkNotNullExpressionValue(typography5, "");
                        typography5.setVisibility(0);
                        nativeAdsThumbnailVideoView.onWarmupCompleted(false);
                        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1760386378, new Object[]{nativeAdsThumbnailVideoView, thumbnailBanner2}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1760386394);
                        nativeAdsThumbnailVideoView.extraCallback();
                        return null;
                    }
                }
            }
        }
        int i7 = isEngagementSignalsApiAvailable + 45;
        ICustomTabsService = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        super.onDetachedFromWindow();
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.ICustomTabsCallback;
        if (textFieldScrollKtExternalSyntheticLambda0 != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle()) != null) {
            lifecycle.onExtraCallbackWithResult(this.extraCallback);
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onPostMessage);
        removeOnLayoutChangeListener(this.readTypedObject);
        extraCommand();
        ExoPlayer exoPlayer = this.onMessageChannelReady;
        if (exoPlayer != null) {
            int i2 = isEngagementSignalsApiAvailable + 95;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            exoPlayer.pause();
            int i4 = isEngagementSignalsApiAvailable + 37;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
        }
        access000().setOnViewVisible(false);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAdsThumbnailVideoView.extraCommand();
            ExoPlayer exoPlayer = nativeAdsThumbnailVideoView.onMessageChannelReady;
            if (exoPlayer != null) {
                exoPlayer.removeListener(nativeAdsThumbnailVideoView.onActivityResized);
            }
            ExoPlayer exoPlayer2 = nativeAdsThumbnailVideoView.onMessageChannelReady;
            if (exoPlayer2 != null) {
                exoPlayer2.release();
                int i3 = isEngagementSignalsApiAvailable + 3;
                ICustomTabsService = i3 % 128;
                int i4 = i3 % 2;
            }
            nativeAdsThumbnailVideoView.onMessageChannelReady = null;
            nativeAdsThumbnailVideoView.access000().setVisibleRatio(0.0d);
            nativeAdsThumbnailVideoView.access000().setOnViewVisible(false);
            nativeAdsThumbnailVideoView.IAuthTabCallbackDefault();
            int i5 = isEngagementSignalsApiAvailable + 23;
            ICustomTabsService = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        nativeAdsThumbnailVideoView.extraCommand();
        ExoPlayer exoPlayer3 = nativeAdsThumbnailVideoView.onMessageChannelReady;
        throw null;
    }

    public static /* synthetic */ void setItem$default(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, List list, Function1 function1, Function0 function0, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 107;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0 ? (i & 16) != 0 : (i & 68) != 0) {
            function0 = null;
        }
        nativeAdsThumbnailVideoView.setItem(adAsset, thumbnailBanner, list, function1, function0);
        int i4 = ICustomTabsService + 41;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onRelationshipValidationResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43424), 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.getDefaultSize(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = ICustomTabsCallback_Parcel;
                float f = 0.0f;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 12844);
                            int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 54;
                            int i10 = (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 2167;
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(modifierMetaStateMask, i9, i10, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i8++;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $11 + 73;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        byte[] bArr3 = ICustomTabsCallback_Parcel;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onUnminimized)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43424), (ViewConfiguration.getScrollBarSize() >> 8) + 42, 22439 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] | (-4629411779493505016L))) / ((int) (onRelationshipValidationResult % (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = ICustomTabsCallback_Parcel;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onUnminimized)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 43424), 42 - TextUtils.indexOf("", "", 0, 0), View.combineMeasuredStates(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onRelationshipValidationResult ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i6;
                } else {
                    iIntValue = (short) (((short) (extraCommand[i + ((int) (onUnminimized ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onRelationshipValidationResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (onUnminimized ^ (-4629411779493505016L)));
                if (z2) {
                    int i13 = $11 + 105;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(ICustomTabsCallbackStub), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 86 - View.getDefaultSize(0, 0), ImageFormat.getBitsPerPixel(0) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = ICustomTabsCallback_Parcel;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i15 = 0;
                    while (i15 < length2) {
                        int i16 = $11 + 41;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            bArr6[i15] = (byte) (bArr5[i15] & (-4629411779493505016L));
                        } else {
                            bArr6[i15] = (byte) (bArr5[i15] ^ (-4629411779493505016L));
                            i15++;
                        }
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i17 = $11 + 87;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    int i19 = $11 + 97;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i21 = $10 + 47;
                        $11 = i21 % 128;
                        if (i21 % 2 == 0) {
                            byte[] bArr7 = ICustomTabsCallback_Parcel;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent / 0;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback * (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) / s)) ^ b);
                        } else {
                            byte[] bArr8 = ICustomTabsCallback_Parcel;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr8[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = extraCommand;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

    public static final class onWarmupCompleted implements getScaleX.onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0<Unit> onExtraCallback;
        final /* synthetic */ NativeAdsDto.Creative.ThumbnailBanner onExtraCallbackWithResult;

        onWarmupCompleted(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, Function0<Unit> function0) {
            this.onExtraCallbackWithResult = thumbnailBanner;
            this.onExtraCallback = function0;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void IAuthTabCallback(NativeAd nativeAd) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAd, "");
            NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = NativeAdsThumbnailVideoView.this;
            ExposureContent.Companion companion = ExposureContent.Companion;
            NativeAdsThumbnailVideoView.IAuthTabCallback(nativeAdsThumbnailVideoView, "LOAD", companion.onExtraCallback(nativeAd));
            NativeAdsThumbnailVideoView.onWarmupCompleted(NativeAdsThumbnailVideoView.this, "ADMOB", null, null, companion.onExtraCallback(nativeAd), 6, null);
            NativeAdsThumbnailVideoView.onNavigationEvent(NativeAdsThumbnailVideoView.this, nativeAd);
            NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = NativeAdsThumbnailVideoView.this.IAuthTabCallbackStub();
            if (nativeAdsManagerIAuthTabCallbackStub != null) {
                NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 695726411, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -695726405, new Object[]{nativeAdsManagerIAuthTabCallbackStub, NativeAdsThumbnailVideoView.this.onWarmupCompleted(), (NativeAdsThumbnailAdMobView) NativeAdsThumbnailVideoView.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1294516599, new Object[]{NativeAdsThumbnailVideoView.this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1294516585)}, nSetPosition.onExtraCallbackWithResult());
            }
            int i4 = onNavigationEvent + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onWarmupCompleted(NativeAd nativeAd) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                NativeAdsThumbnailVideoView.IAuthTabCallback(NativeAdsThumbnailVideoView.this, "CLICK", ExposureContent.Companion.onExtraCallback(nativeAd));
                int i3 = 33 / 0;
            } else {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                NativeAdsThumbnailVideoView.IAuthTabCallback(NativeAdsThumbnailVideoView.this, "CLICK", ExposureContent.Companion.onExtraCallback(nativeAd));
            }
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onWarmupCompleted(NativeAd nativeAd, ExposureContent exposureContent) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                Intrinsics.checkNotNullParameter(exposureContent, "");
                NativeAdsThumbnailVideoView.IAuthTabCallback(NativeAdsThumbnailVideoView.this, "PAID", exposureContent);
                throw null;
            }
            Intrinsics.checkNotNullParameter(nativeAd, "");
            Intrinsics.checkNotNullParameter(exposureContent, "");
            NativeAdsThumbnailVideoView.IAuthTabCallback(NativeAdsThumbnailVideoView.this, "PAID", exposureContent);
            int i3 = IAuthTabCallback + 109;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 45 / 0;
            }
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onNavigationEvent(ExposureContent exposureContent, AdMobFailedReason adMobFailedReason, boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(exposureContent, "");
            Intrinsics.checkNotNullParameter(adMobFailedReason, "");
            NativeAdsThumbnailVideoView.IAuthTabCallback(NativeAdsThumbnailVideoView.this, "AD_FILTERED", exposureContent);
            if (z) {
                if (!NativeAdsThumbnailVideoView.onWarmupCompleted(NativeAdsThumbnailVideoView.this, this.onExtraCallbackWithResult)) {
                    NativeAdsThumbnailVideoView.onWarmupCompleted(NativeAdsThumbnailVideoView.this, "TOSS", null, adMobFailedReason, null, 10, null);
                    NativeAdsThumbnailVideoView.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1909716856, new Object[]{NativeAdsThumbnailVideoView.this, false}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1909716863);
                    if (this.onExtraCallback == null) {
                        NativeAdsThumbnailVideoView.onNavigationEvent(NativeAdsThumbnailVideoView.this, this.onExtraCallbackWithResult);
                        return;
                    } else {
                        NativeAdsThumbnailVideoView.this.setVisibility(8);
                        this.onExtraCallback.invoke();
                        return;
                    }
                }
                int i4 = IAuthTabCallback + 113;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                NativeAdsThumbnailVideoView.onWarmupCompleted(NativeAdsThumbnailVideoView.this, null, "NO_AD", adMobFailedReason, null, 8, null);
                NativeAdsThumbnailVideoView.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2029180011, new Object[]{NativeAdsThumbnailVideoView.this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2029180011);
                int i6 = IAuthTabCallback + 57;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            if (im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.onWarmupCompleted(r16.onWarmupCompleted, r16.onExtraCallbackWithResult) == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.onWarmupCompleted(r16.onWarmupCompleted, null, "NO_AD", new im.toss.ads_sdk.remote.model.AdMobFailedReason(r17, (java.util.List) null, (java.lang.String) null, (im.toss.ads_sdk.remote.model.AdmobError) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 8, null);
            im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.IAuthTabCallback(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2029180011, new java.lang.Object[]{r16.onWarmupCompleted}, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2029180011);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
        
            im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.onWarmupCompleted(r16.onWarmupCompleted, "TOSS", null, new im.toss.ads_sdk.remote.model.AdMobFailedReason(r17, (java.util.List) null, (java.lang.String) null, (im.toss.ads_sdk.remote.model.AdmobError) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 10, null);
            im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.IAuthTabCallback(o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1909716856, new java.lang.Object[]{r16.onWarmupCompleted, false}, o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1909716863);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00bb, code lost:
        
            if (r16.onExtraCallback == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00bd, code lost:
        
            r1 = im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.onWarmupCompleted.IAuthTabCallback + 69;
            im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.onWarmupCompleted.onNavigationEvent = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
        
            if ((r1 % 2) != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
        
            r1 = r16.onWarmupCompleted;
            r2 = 26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
        
            r1 = r16.onWarmupCompleted;
            r2 = 8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
        
            r1.setVisibility(r2);
            r16.onExtraCallback.invoke();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00d9, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00da, code lost:
        
            im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.onNavigationEvent(r16.onWarmupCompleted, r16.onExtraCallbackWithResult);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        
            if (r18 == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        
            if (r18 == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        
            r1 = im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.onWarmupCompleted.IAuthTabCallback + 27;
            im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView.onWarmupCompleted.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
         */
        @Override // o.getScaleX.onWarmupCompleted
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onWarmupCompleted(String str, boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                NativeAdsThumbnailVideoView.onExtraCallbackWithResult(NativeAdsThumbnailVideoView.this, "FAILED_TO_LOAD", null, 4, null);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                NativeAdsThumbnailVideoView.onExtraCallbackWithResult(NativeAdsThumbnailVideoView.this, "FAILED_TO_LOAD", null, 2, null);
            }
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            NativeAdsThumbnailVideoView.onExtraCallbackWithResult(NativeAdsThumbnailVideoView.this, "TIMEOUT", null, 2, null);
            if (NativeAdsThumbnailVideoView.onWarmupCompleted(NativeAdsThumbnailVideoView.this, this.onExtraCallbackWithResult)) {
                NativeAdsThumbnailVideoView.onWarmupCompleted(NativeAdsThumbnailVideoView.this, null, "NO_AD", new AdMobFailedReason("TIMEOUT", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), null, 8, null);
                NativeAdsThumbnailVideoView.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2029180011, new Object[]{NativeAdsThumbnailVideoView.this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2029180011);
                return;
            }
            NativeAdsThumbnailVideoView.onWarmupCompleted(NativeAdsThumbnailVideoView.this, "TOSS", null, new AdMobFailedReason("TIMEOUT", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), null, 10, null);
            NativeAdsThumbnailVideoView.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1909716856, new Object[]{NativeAdsThumbnailVideoView.this, false}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1909716863);
            if (this.onExtraCallback == null) {
                NativeAdsThumbnailVideoView.onNavigationEvent(NativeAdsThumbnailVideoView.this, this.onExtraCallbackWithResult);
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            NativeAdsThumbnailVideoView.this.setVisibility(8);
            this.onExtraCallback.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setItem(@NotNull NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, @NotNull List<? extends NativeAdsEventLogType> list, @NotNull Function1<? super NativeAdsEventLogType, Unit> function1, @Nullable Function0<Unit> function0) throws Throwable {
        NativeAdsDto.Mediation mediation;
        NativeAdsDto nativeAdsDtoOnNavigationEvent;
        NativeAdsDto.ExtraInfo extraInfoOnTransact;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(thumbnailBanner, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        asInterface();
        setVisibility(0);
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1299311077, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1299311078);
        this.IAuthTabCallback = adAsset;
        this.IAuthTabCallbackDefault = thumbnailBanner;
        this.writeTypedObject = function1;
        this.ICustomTabsCallbackStubProxy = list;
        this.asBinder.clear();
        this.asInterface.clear();
        this.access100 = false;
        this.extraCallbackWithResult = false;
        setContentLoadState(false);
        String strAsBinder = thumbnailBanner.asBinder();
        if (strAsBinder == null || StringsKt.isBlank(strAsBinder)) {
            SubTypography13 subTypography13 = this.onNavigationEvent.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(subTypography13, "");
            subTypography13.setVisibility(8);
            int i2 = ICustomTabsService + 111;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
        } else {
            SubTypography13 subTypography132 = this.onNavigationEvent.IAuthTabCallbackStubProxy;
            Intrinsics.checkNotNullExpressionValue(subTypography132, "");
            subTypography132.setVisibility(0);
            this.onNavigationEvent.IAuthTabCallbackStubProxy.setText(thumbnailBanner.asBinder());
            if (thumbnailBanner.asBinder().length() > 60) {
                this.onNavigationEvent.IAuthTabCallbackStubProxy.setTextSize(1, 6.0f);
            } else {
                this.onNavigationEvent.IAuthTabCallbackStubProxy.setTextSize(1, 8.0f);
            }
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub == null || (nativeAdsDtoOnNavigationEvent = nativeAdsManagerIAuthTabCallbackStub.onNavigationEvent(this.onWarmupCompleted)) == null || (extraInfoOnTransact = nativeAdsDtoOnNavigationEvent.onTransact()) == null || (mediation = extraInfoOnTransact.onNavigationEvent()) == null) {
            mediation = new NativeAdsDto.Mediation((String) null, (List) null, (NativeAdsDto.AdmobInfo) null, (NativeAdsDto.MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
        }
        NativeAdsDto.Mediation mediation2 = mediation;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub2 = IAuthTabCallbackStub();
        NativeAdsDto.AdmobInfo admobInfo = nativeAdsManagerIAuthTabCallbackStub2 != null ? (NativeAdsDto.AdmobInfo) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1807668884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1807668884, new Object[]{nativeAdsManagerIAuthTabCallbackStub2, this.onWarmupCompleted}, nSetPosition.onExtraCallbackWithResult()) : null;
        if (onNavigationEvent(mediation2)) {
            int i4 = ICustomTabsService + 117;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (admobInfo != null) {
                NativeAdsManager nativeAdsManagerIAuthTabCallbackStub3 = IAuthTabCallbackStub();
                NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobViewOnWarmupCompleted = nativeAdsManagerIAuthTabCallbackStub3 != null ? nativeAdsManagerIAuthTabCallbackStub3.onWarmupCompleted(this.onWarmupCompleted) : null;
                if (nativeAdsThumbnailAdMobViewOnWarmupCompleted != null) {
                    int i5 = isEngagementSignalsApiAvailable + 123;
                    ICustomTabsService = i5 % 128;
                    int i6 = i5 % 2;
                    IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -113585859, new Object[]{this, nativeAdsThumbnailAdMobViewOnWarmupCompleted}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 113585871);
                    ICustomTabsCallbackDefault();
                    mayLaunchUrl();
                } else {
                    this.onTransact = false;
                    ICustomTabsCallback_Parcel();
                    getScaleX getscalexIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
                    String str = this.onWarmupCompleted;
                    NativeAdsManager nativeAdsManagerIAuthTabCallbackStub4 = IAuthTabCallbackStub();
                    if (nativeAdsManagerIAuthTabCallbackStub4 != null) {
                        int i7 = isEngagementSignalsApiAvailable + 51;
                        ICustomTabsService = i7 % 128;
                        int i8 = i7 % 2;
                        boolean z = nativeAdsManagerIAuthTabCallbackStub4.IAuthTabCallback();
                        getscalexIAuthTabCallback_Parcel.onExtraCallback(str, admobInfo, mediation2, z, new onWarmupCompleted(thumbnailBanner, function0));
                    }
                }
            } else {
                this.onTransact = false;
                if (((Boolean) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -833872293, new Object[]{this, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 833872295)).booleanValue()) {
                    onWarmupCompleted(this, null, "NO_AD", null, null, 12, null);
                    isEngagementSignalsApiAvailable();
                } else {
                    onWarmupCompleted(this, "TOSS", null, null, null, 14, null);
                    IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2041552885, new Object[]{this, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2041552893);
                }
            }
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(this.onNavigationEvent.asBinder, "201");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(this.onNavigationEvent.IAuthTabCallback_Parcel, "301");
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(this.onNavigationEvent.access100, "301");
        Typography7 typography7 = this.onNavigationEvent.IAuthTabCallback;
        Object[] objArr = new Object[1];
        a((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (byte) ((-1) - Process.getGidForName("")), 2103977287 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 372021559, (ViewConfiguration.getScrollBarSize() >> 8) - 57, objArr);
        this.onMinimized = getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(typography7, ((String) objArr[0]).intern())}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setContentLoadState(boolean z) {
        ConstraintLayout constraintLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 1;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            this.getInterfaceDescriptor = z;
            access000().setContentLoadState(z);
            int i4 = 27 / 0;
            if (z) {
                onNavigationEvent(this.IAuthTabCallbackStub);
                ExoPlayer exoPlayer = this.onMessageChannelReady;
                if (exoPlayer != null) {
                    exoPlayer.pause();
                }
                ConstraintLayout constraintLayout2 = this.onNavigationEvent.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(0);
            } else if (this.IAuthTabCallbackDefault != null) {
                int i5 = isEngagementSignalsApiAvailable + 59;
                ICustomTabsService = i5 % 128;
                if (i5 % 2 == 0) {
                    constraintLayout = this.onNavigationEvent.IAuthTabCallbackStub;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    i = 110;
                } else {
                    constraintLayout = this.onNavigationEvent.IAuthTabCallbackStub;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    i = 8;
                }
                constraintLayout.setVisibility(i);
            }
        } else {
            this.getInterfaceDescriptor = z;
            access000().setContentLoadState(z);
            if (z) {
            }
        }
        mayLaunchUrl();
        int i6 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView] */
    private static /* synthetic */ Object access100(Object[] objArr) {
        ViewGroup viewGroup;
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        ?? r8 = (NativeAdsThumbnailAdMobView) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 73;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = r8.getParent() instanceof ViewGroup;
            throw null;
        }
        ViewParent parent = r8.getParent();
        if (!(parent instanceof ViewGroup)) {
            viewGroup = 0;
        } else {
            int i3 = ICustomTabsService + 89;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != 0) {
            int i4 = ICustomTabsService + 57;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.removeView(r8);
        }
        ConstraintLayout constraintLayout = nativeAdsThumbnailVideoView.onNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, 0);
        onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult.IAuthTabCallback = 0;
        onextracallbackwithresult.ITrustedWebActivityCallback = 0;
        onextracallbackwithresult.ICustomTabsCallback = 0;
        View view = nativeAdsThumbnailVideoView.onNavigationEvent.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(view, "");
        ((ViewGroup) view).addView((View) r8, (ViewGroup.LayoutParams) onextracallbackwithresult);
        nativeAdsThumbnailVideoView.onExtraCallback = r8;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private final void IAuthTabCallbackDefault() {
        ?? r1;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 125;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = this.onExtraCallback;
            int i3 = 86 / 0;
            r1 = nativeAdsThumbnailAdMobView;
            if (nativeAdsThumbnailAdMobView == null) {
                return;
            }
        } else {
            NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView2 = this.onExtraCallback;
            r1 = nativeAdsThumbnailAdMobView2;
            if (nativeAdsThumbnailAdMobView2 == null) {
                return;
            }
        }
        r1.setVisibleRatio(0.0d);
        r1.setOnViewVisible(false);
        ViewParent parent = r1.getParent();
        if (parent instanceof ViewGroup) {
            int i4 = isEngagementSignalsApiAvailable;
            int i5 = i4 + 57;
            ICustomTabsService = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 61 / 0;
                viewGroup2 = (ViewGroup) parent;
            } else {
                viewGroup2 = (ViewGroup) parent;
            }
            int i7 = i4 + 13;
            ICustomTabsService = i7 % 128;
            int i8 = i7 % 2;
            viewGroup = viewGroup2;
        } else {
            viewGroup = 0;
        }
        if (viewGroup != 0) {
            viewGroup.removeView(r1);
        }
        this.onExtraCallback = null;
    }

    private static final Unit IAuthTabCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAd nativeAd, NativeAd nativeAd2) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeAd2, "");
            nativeAdsThumbnailVideoView.onWarmupCompleted("IMP", ExposureContent.Companion.onExtraCallback(nativeAd));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(nativeAd2, "");
        nativeAdsThumbnailVideoView.onWarmupCompleted("IMP", ExposureContent.Companion.onExtraCallback(nativeAd));
        int i3 = 57 / 0;
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        ICustomTabsCallbackDefault();
        access000().onExtraCallbackWithResult(nativeAd, (Function1<? super NativeAd, Unit>) new NativeAdsThumbnailVideoView$.ExternalSyntheticLambda15(this, nativeAd));
        mayLaunchUrl();
        int i2 = isEngagementSignalsApiAvailable + 81;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onNavigationEvent() {
        int i = 2 % 2;
        this.access000 = true;
        ExoPlayer exoPlayer = this.onMessageChannelReady;
        if (exoPlayer != null) {
            int i2 = ICustomTabsService + 37;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            exoPlayer.pause();
        }
        access000().setOnViewVisible(false);
        int i4 = ICustomTabsService + 35;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 93;
        isEngagementSignalsApiAvailable = i2 % 128;
        this.access000 = i2 % 2 != 0;
        mayLaunchUrl();
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        mayLaunchUrl();
        int i4 = ICustomTabsService + 107;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = (NativeAdsThumbnailVideoView) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoView.getInterfaceDescriptor = false;
        ConstraintLayout constraintLayout = nativeAdsThumbnailVideoView.onNavigationEvent.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        nativeAdsThumbnailVideoView.access000().setContentLoadState(false);
        nativeAdsThumbnailVideoView.setContentLoadState(false);
        int i4 = ICustomTabsService + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView, java.lang.Object] */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws NoWhenBranchMatchedException {
        ?? r1 = (NativeAdsThumbnailVideoView) objArr[0];
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        r1.setVisibility(0);
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1302131800, new Object[]{r1}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1302131785);
        r1.access000().setVisibility(8);
        int i4 = onExtraCallback.IAuthTabCallback[((NativeAdsDto.ThumbnailBannerContentType) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1893907374, new Object[]{r1, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1893907368)).ordinal()];
        if (i4 == 1) {
            r1.onNavigationEvent(((NativeAdsThumbnailVideoView) r1).IAuthTabCallback_Parcel);
            TdsImageView tdsImageView = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(0);
            StyledPlayerView styledPlayerView = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.access100;
            Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
            styledPlayerView.setVisibility(8);
            TdsImageView tdsImageView2 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            tdsImageView2.setVisibility(8);
            TdsImageView tdsImageView3 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            TdsImageView.setImage$default(tdsImageView3, thumbnailBanner.onTransact(), (Function1) null, (Function1) null, 6, (Object) null);
            Typography7 typography7 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(typography7, "");
            typography7.setVisibility(0);
            ConstraintLayout constraintLayoutOnNavigationEvent = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
            constraintLayoutOnNavigationEvent.setVisibility(8);
            FrameLayout frameLayout = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
        } else {
            int i5 = isEngagementSignalsApiAvailable + 11;
            ICustomTabsService = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            r1.onNavigationEvent(((NativeAdsThumbnailVideoView) r1).IAuthTabCallbackStub);
            TdsImageView tdsImageView4 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
            tdsImageView4.setVisibility(8);
            StyledPlayerView styledPlayerView2 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.access100;
            Intrinsics.checkNotNullExpressionValue(styledPlayerView2, "");
            styledPlayerView2.setVisibility(0);
            TdsImageView tdsImageView5 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(tdsImageView5, "");
            tdsImageView5.setVisibility(0);
            TdsImageView tdsImageView6 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(tdsImageView6, "");
            String strAccess100 = thumbnailBanner.access100();
            if (strAccess100 == null) {
                strAccess100 = thumbnailBanner.onTransact();
            }
            TdsImageView.setImage$default(tdsImageView6, strAccess100, (Function1) null, (Function1) null, 6, (Object) null);
            Typography7 typography72 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(typography72, "");
            typography72.setVisibility(0);
            ConstraintLayout constraintLayoutOnNavigationEvent2 = ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent2, "");
            constraintLayoutOnNavigationEvent2.setVisibility(0);
            r1.onWarmupCompleted(false);
            IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1760386378, new Object[]{r1, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1760386394);
            r1.extraCallback();
        }
        r1.mayLaunchUrl();
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        boolean zStartsWith$default = StringsKt.startsWith$default(thumbnailBanner.IAuthTabCallback(), "admob_shell_", false, 2, (Object) null);
        int i4 = isEngagementSignalsApiAvailable + 71;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zStartsWith$default);
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        if (StringsKt.isBlank(((NativeAdsDto.Creative.ThumbnailBanner) objArr[1]).getInterfaceDescriptor())) {
            NativeAdsDto.ThumbnailBannerContentType thumbnailBannerContentType = NativeAdsDto.ThumbnailBannerContentType.IMAGE;
            int i2 = isEngagementSignalsApiAvailable + 93;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            return thumbnailBannerContentType;
        }
        int i4 = ICustomTabsService + 29;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return NativeAdsDto.ThumbnailBannerContentType.VIDEO;
        }
        int i5 = 36 / 0;
        return NativeAdsDto.ThumbnailBannerContentType.VIDEO;
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(str);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
    }

    private final void IAuthTabCallback(String str) {
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout.onExtraCallbackWithResult layoutParams = this.onNavigationEvent.IAuthTabCallbackDefault.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.onExtraCallbackWithResult) {
            int i4 = isEngagementSignalsApiAvailable + 75;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            onextracallbackwithresult = layoutParams;
        } else {
            onextracallbackwithresult = null;
        }
        if (onextracallbackwithresult != null) {
            int i6 = ICustomTabsService + 27;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            if (Intrinsics.areEqual(onextracallbackwithresult.IAuthTabCallback_Parcel, str)) {
                return;
            }
            onextracallbackwithresult.IAuthTabCallback_Parcel = str;
            this.onNavigationEvent.IAuthTabCallbackDefault.setLayoutParams(onextracallbackwithresult);
        }
    }

    public static final class onExtraCallbackWithResult implements AnalyticsListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ NativeAdsDto.Creative.ThumbnailBanner onWarmupCompleted;

        onExtraCallbackWithResult(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, String str) {
            this.onWarmupCompleted = thumbnailBanner;
            this.onNavigationEvent = str;
        }

        public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventTime, "");
            Intrinsics.checkNotNullParameter(playbackException, "");
            NativeAdsThumbnailVideoView.IAuthTabCallback(NativeAdsThumbnailVideoView.this, this.onWarmupCompleted, this.onNavigationEvent, playbackException);
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        String string;
        MediaItem.LocalConfiguration localConfiguration;
        ?? r1 = (NativeAdsThumbnailVideoView) objArr[0];
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objArr[1];
        int i = 2 % 2;
        String interfaceDescriptor = thumbnailBanner.getInterfaceDescriptor();
        if (StringsKt.isBlank(interfaceDescriptor)) {
            interfaceDescriptor = thumbnailBanner.onTransact();
        }
        ExoPlayer exoPlayerIAuthTabCallback = ((NativeAdsThumbnailVideoView) r1).onMessageChannelReady;
        if (exoPlayerIAuthTabCallback == null) {
            CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
            Context context = r1.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, (String) null, new DefaultLoadControl.Builder().setPrioritizeTimeOverSizeThresholds(true).setBufferDurationsMs(2500, 5000, 2500, 2500).build(), (Function1) null, (Function1) null, 26, (Object) null);
            ((NativeAdsThumbnailVideoView) r1).onMessageChannelReady = exoPlayerIAuthTabCallback;
            ((NativeAdsThumbnailVideoView) r1).onNavigationEvent.access100.setPlayer(exoPlayerIAuthTabCallback);
            exoPlayerIAuthTabCallback.addListener(((NativeAdsThumbnailVideoView) r1).onActivityResized);
        }
        exoPlayerIAuthTabCallback.setVolume(0.0f);
        r1.onNavigationEvent(true);
        MediaItem currentMediaItem = exoPlayerIAuthTabCallback.getCurrentMediaItem();
        if (currentMediaItem == null || (localConfiguration = currentMediaItem.localConfiguration) == null) {
            string = null;
        } else {
            int i2 = ICustomTabsService + 75;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                Uri uri = localConfiguration.uri;
                throw null;
            }
            Uri uri2 = localConfiguration.uri;
            if (uri2 != null) {
                string = uri2.toString();
                int i3 = isEngagementSignalsApiAvailable + 37;
                ICustomTabsService = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (Intrinsics.areEqual(string, interfaceDescriptor)) {
            return null;
        }
        CommonModule_setSecureScreen commonModule_setSecureScreen2 = CommonModule_setSecureScreen.onWarmupCompleted;
        Context context2 = r1.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen2, exoPlayerIAuthTabCallback, context2, interfaceDescriptor, false, new onExtraCallbackWithResult(thumbnailBanner, interfaceDescriptor), 4, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        exoPlayerIAuthTabCallback.prepare();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1
      0x002f: PHI (r1v9 im.toss.tds.view.component.atom.text.Typography5) = (r1v6 im.toss.tds.view.component.atom.text.Typography5), (r1v12 im.toss.tds.view.component.atom.text.Typography5) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v7 im.toss.tds.view.component.atom.text.Typography5) = (r1v6 im.toss.tds.view.component.atom.text.Typography5), (r1v12 im.toss.tds.view.component.atom.text.Typography5) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(boolean z) {
        Typography5 typography5;
        int i;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 113;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 == 0) {
            typography5 = this.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallbackDefault;
            int i4 = 96 / 0;
            if (z) {
                i = R.string.ads_sdk_continue_replay;
                int i5 = ICustomTabsService + 125;
                isEngagementSignalsApiAvailable = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i = R.string.ads_sdk_continue_play;
            }
        } else {
            typography5 = this.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallbackDefault;
            if (z) {
            }
        }
        typography5.setText(i);
    }

    private final void IAuthTabCallback(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, String str, PlaybackException playbackException) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 117;
        ICustomTabsService = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            endRearDisplayPresentationSession.onExtraCallbackWithResult(str);
            obj.hashCode();
            throw null;
        }
        String strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(str);
        if (strOnExtraCallbackWithResult != null) {
            int i3 = ICustomTabsService + 125;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 != 0) {
                NativeAdsDto.Creative.ThumbnailBanner thumbnailBannerOnExtraCallback = NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback(thumbnailBanner, null, null, null, strOnExtraCallbackWithResult, null, null, null, null, null, 11488, null);
                this.IAuthTabCallbackDefault = thumbnailBannerOnExtraCallback;
                IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2041552885, new Object[]{this, thumbnailBannerOnExtraCallback}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2041552893);
                return;
            } else {
                NativeAdsDto.Creative.ThumbnailBanner thumbnailBannerOnExtraCallback2 = NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback(thumbnailBanner, null, null, null, strOnExtraCallbackWithResult, null, null, null, null, null, 503, null);
                this.IAuthTabCallbackDefault = thumbnailBannerOnExtraCallback2;
                IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2041552885, new Object[]{this, thumbnailBannerOnExtraCallback2}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2041552893);
                return;
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String str2 = "benefit_thumbnailBanner_playback_failed on " + IAuthTabCallback();
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("ad_id", thumbnailBanner.IAuthTabCallback());
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), 2103977287 + (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 372021628 - (ViewConfiguration.getLongPressTimeout() >> 16), (-57) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        convertFloatArrayToByteArray.onExtraCallbackWithResult(str2, (String) null, (Throwable) playbackException, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), thumbnailBanner.onTransact()), getWrite.IAuthTabCallback("thumbnail_url", thumbnailBanner.access100())}));
        extraCommand();
        ExoPlayer exoPlayer = this.onMessageChannelReady;
        if (exoPlayer != null) {
            int i4 = isEngagementSignalsApiAvailable + 25;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            exoPlayer.removeListener(this.onActivityResized);
        }
        ExoPlayer exoPlayer2 = this.onMessageChannelReady;
        if (exoPlayer2 != null) {
            int i6 = isEngagementSignalsApiAvailable + 125;
            ICustomTabsService = i6 % 128;
            if (i6 % 2 == 0) {
                exoPlayer2.release();
                obj.hashCode();
                throw null;
            }
            exoPlayer2.release();
        }
        this.onMessageChannelReady = null;
        this.onNavigationEvent.access100.setPlayer((Player) null);
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBannerOnExtraCallback3 = NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback(thumbnailBanner, null, null, null, "", null, null, null, null, null, 503, null);
        this.IAuthTabCallbackDefault = thumbnailBannerOnExtraCallback3;
        onWarmupCompleted(thumbnailBannerOnExtraCallback3);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = NativeAdsThumbnailVideoView.this.new IAuthTabCallback(access13800Var);
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 47;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            NativeAdsThumbnailVideoView.extraCallbackWithResult(NativeAdsThumbnailVideoView.this);
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 55;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private final void extraCallback() {
        int i = 2 % 2;
        onNavigationEvent(new IAuthTabCallback(null));
        int i2 = isEngagementSignalsApiAvailable + 13;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
        }
    }

    private final void mayLaunchUrl() {
        ExoPlayer exoPlayer;
        int i = 2 % 2;
        boolean z = true;
        if (!this.access000) {
            int i2 = ICustomTabsService + 33;
            isEngagementSignalsApiAvailable = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.getInterfaceDescriptor) {
                if (this.onTransact) {
                    double dAccess100 = access100();
                    access000().setVisibleRatio(dAccess100);
                    NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobViewAccess000 = access000();
                    if (dAccess100 > 0.5d) {
                        int i3 = ICustomTabsService + 123;
                        isEngagementSignalsApiAvailable = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        z = false;
                    }
                    nativeAdsThumbnailAdMobViewAccess000.setOnViewVisible(z);
                    return;
                }
                NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = this.IAuthTabCallbackDefault;
                if (thumbnailBanner != null) {
                    if (((NativeAdsDto.ThumbnailBannerContentType) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1893907374, new Object[]{this, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1893907368)) == NativeAdsDto.ThumbnailBannerContentType.IMAGE || (exoPlayer = this.onMessageChannelReady) == null) {
                        return;
                    }
                    int i5 = ICustomTabsService + 9;
                    isEngagementSignalsApiAvailable = i5 % 128;
                    int i6 = i5 % 2;
                    if (!(!this.IAuthTabCallbackStubProxy)) {
                        exoPlayer.pause();
                        return;
                    }
                    if (access100() > 0.5d) {
                        if (this.extraCallbackWithResult || exoPlayer.isPlaying() || exoPlayer.getPlaybackState() == 4) {
                            return;
                        }
                        int i7 = ICustomTabsService + 37;
                        isEngagementSignalsApiAvailable = i7 % 128;
                        int i8 = i7 % 2;
                        exoPlayer.setPlayWhenReady(true);
                        exoPlayer.play();
                        return;
                    }
                    this.extraCallbackWithResult = false;
                    if (exoPlayer.isPlaying()) {
                        int i9 = ICustomTabsService + 43;
                        isEngagementSignalsApiAvailable = i9 % 128;
                        if (i9 % 2 == 0) {
                            exoPlayer.pause();
                            return;
                        } else {
                            exoPlayer.pause();
                            obj.hashCode();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
        }
        ExoPlayer exoPlayer2 = this.onMessageChannelReady;
        if (exoPlayer2 != null) {
            int i10 = isEngagementSignalsApiAvailable + 49;
            ICustomTabsService = i10 % 128;
            int i11 = i10 % 2;
            exoPlayer2.pause();
        }
        access000().setOnViewVisible(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final double access100() {
        int i = 2 % 2;
        RecyclerView recyclerViewIAuthTabCallback = IAuthTabCallback((View) this);
        if (recyclerViewIAuthTabCallback == null) {
            return onExtraCallbackWithResult((View) this) ? 1.0d : 0.0d;
        }
        Rect rect = new Rect();
        recyclerViewIAuthTabCallback.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        if (rect3.setIntersect(rect, rect2)) {
            int iWidth = rect3.width();
            int iHeight = rect3.height();
            int width = getWidth() * getHeight();
            if (width > 0) {
                double d = (iWidth * iHeight) / width;
                int i2 = ICustomTabsService + 13;
                isEngagementSignalsApiAvailable = i2 % 128;
                int i3 = i2 % 2;
                return d;
            }
            int i4 = isEngagementSignalsApiAvailable + 101;
            int i5 = i4 % 128;
            ICustomTabsService = i5;
            double d2 = i4 % 2 != 0 ? 0.0d : 1.0d;
            int i6 = i5 + 117;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            return d2;
        }
        int i8 = isEngagementSignalsApiAvailable + 67;
        ICustomTabsService = i8 % 128;
        int i9 = i8 % 2;
        return 0.0d;
    }

    private final RecyclerView IAuthTabCallback(View view) {
        ViewParent parent;
        int i = 2 % 2;
        Object obj = null;
        if (view != null) {
            int i2 = ICustomTabsService + 93;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                view.getParent();
                obj.hashCode();
                throw null;
            }
            parent = view.getParent();
        } else {
            parent = null;
        }
        while (parent != null) {
            int i3 = isEngagementSignalsApiAvailable;
            int i4 = i3 + 27;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            if (parent instanceof RecyclerView) {
                break;
            }
            int i6 = i3 + 39;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
            parent = parent.getParent();
            int i8 = isEngagementSignalsApiAvailable + 61;
            ICustomTabsService = i8 % 128;
            int i9 = i8 % 2;
        }
        if (parent instanceof RecyclerView) {
            int i10 = ICustomTabsService + 55;
            isEngagementSignalsApiAvailable = i10 % 128;
            int i11 = i10 % 2;
            return (RecyclerView) parent;
        }
        int i12 = isEngagementSignalsApiAvailable + 71;
        ICustomTabsService = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void ICustomTabsService() {
        int i = 2 % 2;
        getPackageType getpackagetype = this.ICustomTabsCallbackDefault;
        if (getpackagetype != null) {
            int i2 = ICustomTabsService + 73;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            if (getpackagetype.onExtraCallback()) {
                return;
            }
        }
        ExoPlayer exoPlayer = this.onMessageChannelReady;
        if (exoPlayer == null) {
            int i4 = isEngagementSignalsApiAvailable + 29;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.ICustomTabsCallbackDefault = onNavigationEvent(new asInterface(exoPlayer, this, null));
            int i6 = isEngagementSignalsApiAvailable + 89;
            ICustomTabsService = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ExoPlayer $player;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NativeAdsThumbnailVideoView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(ExoPlayer exoPlayer, NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$player = exoPlayer;
            this.this$0 = nativeAdsThumbnailVideoView;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 31 / 0;
            return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$player, this.this$0, access13800Var);
            asinterface.L$0 = obj;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(250, r14) == r2) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(250, r14) == r2) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            return r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003d -> B:19:0x004b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function1 function1IAuthTabCallbackStubProxy;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (findRes.onWarmupCompleted(findresandmsg)) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Long lOnExtraCallback = access14000.onExtraCallback(this.$player.getDuration());
                if (lOnExtraCallback.longValue() <= 0) {
                    int i3 = onWarmupCompleted + 101;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    lOnExtraCallback = null;
                }
                if (lOnExtraCallback != null) {
                    int i5 = onWarmupCompleted + 1;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    long jLongValue = lOnExtraCallback.longValue();
                    long currentPosition = this.$player.getCurrentPosition();
                    NativeAdsThumbnailVideoView.onNavigationEvent(this.this$0, currentPosition);
                    long j = currentPosition / 1000;
                    long j2 = (long) ((currentPosition / jLongValue) * 100.0d);
                    List listIAuthTabCallback_Parcel = NativeAdsThumbnailVideoView.IAuthTabCallback_Parcel(this.this$0);
                    NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = this.this$0;
                    Iterator it = listIAuthTabCallback_Parcel.iterator();
                    while (!(!it.hasNext())) {
                        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) it.next();
                        if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult) {
                            NativeAdsEventLogType.extraCallbackWithResult extracallbackwithresult = (NativeAdsEventLogType.extraCallbackWithResult) nativeAdsEventLogType;
                            if (j >= extracallbackwithresult.onExtraCallbackWithResult() && NativeAdsThumbnailVideoView.IAuthTabCallbackStub(nativeAdsThumbnailVideoView).add(access14000.onExtraCallback(extracallbackwithresult.onExtraCallbackWithResult())) && (function1IAuthTabCallbackStubProxy = NativeAdsThumbnailVideoView.IAuthTabCallbackStubProxy(nativeAdsThumbnailVideoView)) != null) {
                                function1IAuthTabCallbackStubProxy.invoke(nativeAdsEventLogType);
                            }
                        } else if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback) {
                            int i7 = IAuthTabCallback + 43;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                            NativeAdsEventLogType.extraCallback extracallback = (NativeAdsEventLogType.extraCallback) nativeAdsEventLogType;
                            if (j2 >= extracallback.IAuthTabCallback() && NativeAdsThumbnailVideoView.onTransact(nativeAdsThumbnailVideoView).add(access14000.onExtraCallback(extracallback.IAuthTabCallback()))) {
                                int i9 = IAuthTabCallback + 31;
                                onWarmupCompleted = i9 % 128;
                                int i10 = i9 % 2;
                                Function1 function1IAuthTabCallbackStubProxy2 = NativeAdsThumbnailVideoView.IAuthTabCallbackStubProxy(nativeAdsThumbnailVideoView);
                                if (function1IAuthTabCallbackStubProxy2 != null) {
                                    function1IAuthTabCallbackStubProxy2.invoke(nativeAdsEventLogType);
                                }
                            }
                        }
                    }
                }
                if (findRes.onWarmupCompleted(findresandmsg)) {
                    int i11 = IAuthTabCallback + 83;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        this.L$0 = findresandmsg;
                        this.label = 0;
                    } else {
                        this.L$0 = findresandmsg;
                        this.label = 1;
                    }
                    if (findRes.onWarmupCompleted(findresandmsg)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r1
      0x001c: PHI (r1v5 o.getPackageType) = (r1v4 o.getPackageType), (r1v6 o.getPackageType) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void extraCommand() {
        getPackageType getpackagetype;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 27;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        if (i2 % 2 == 0) {
            getpackagetype = this.ICustomTabsCallbackDefault;
            int i4 = 96 / 0;
            if (getpackagetype != null) {
                int i5 = i3 + 119;
                isEngagementSignalsApiAvailable = i5 % 128;
                if (i5 % 2 != 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
            }
        } else {
            getpackagetype = this.ICustomTabsCallbackDefault;
            if (getpackagetype != null) {
            }
        }
        this.ICustomTabsCallbackDefault = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(long j) {
        Function1<? super NativeAdsEventLogType, Unit> function1;
        int i = 2 % 2;
        if (!this.access100) {
            int i2 = ICustomTabsService + 111;
            int i3 = i2 % 128;
            isEngagementSignalsApiAvailable = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (j >= 2000) {
                List<? extends NativeAdsEventLogType> list = this.ICustomTabsCallbackStubProxy;
                if (list instanceof Collection) {
                    int i4 = i3 + 51;
                    ICustomTabsService = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 56 / 0;
                        if (list.isEmpty()) {
                            return;
                        }
                    } else if (list.isEmpty()) {
                        return;
                    }
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i6 = isEngagementSignalsApiAvailable + 107;
                    ICustomTabsService = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 15 / 0;
                        if (((NativeAdsEventLogType) it.next()) instanceof NativeAdsEventLogType.access100) {
                            this.access100 = true;
                            function1 = this.writeTypedObject;
                            if (function1 == null) {
                                function1.invoke(NativeAdsEventLogType.access100.onExtraCallbackWithResult);
                                return;
                            }
                            return;
                        }
                    } else if (((NativeAdsEventLogType) it.next()) instanceof NativeAdsEventLogType.access100) {
                        this.access100 = true;
                        function1 = this.writeTypedObject;
                        if (function1 == null) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[PHI: r1
      0x005f: PHI (r1v13 kotlin.jvm.functions.Function1<? super im.toss.ads_sdk.model.NativeAdsEventLogType, kotlin.Unit>) = 
      (r1v12 kotlin.jvm.functions.Function1<? super im.toss.ads_sdk.model.NativeAdsEventLogType, kotlin.Unit>)
      (r1v17 kotlin.jvm.functions.Function1<? super im.toss.ads_sdk.model.NativeAdsEventLogType, kotlin.Unit>)
     binds: [B:24:0x005d, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallbackStubProxy() {
        Function1<? super NativeAdsEventLogType, Unit> function1;
        int i = 2 % 2;
        List<? extends NativeAdsEventLogType> list = this.ICustomTabsCallbackStubProxy;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) it.next();
            if (!(!(nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback)) && ((NativeAdsEventLogType.extraCallback) nativeAdsEventLogType).IAuthTabCallback() == 100) {
                if (this.asInterface.add(100L)) {
                    int i2 = ICustomTabsService + 41;
                    isEngagementSignalsApiAvailable = i2 % 128;
                    if (i2 % 2 != 0) {
                        function1 = this.writeTypedObject;
                        int i3 = 37 / 0;
                        if (function1 != null) {
                            function1.invoke(new NativeAdsEventLogType.extraCallback(100L));
                            int i4 = isEngagementSignalsApiAvailable + 83;
                            ICustomTabsService = i4 % 128;
                            int i5 = i4 % 2;
                        }
                    } else {
                        function1 = this.writeTypedObject;
                        if (function1 != null) {
                        }
                    }
                }
            }
        }
        int i6 = isEngagementSignalsApiAvailable + 93;
        ICustomTabsService = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae A[PHI: r1
      0x00ae: PHI (r1v10 im.toss.tds.view.component.atom.image.TdsImageView) = (r1v7 im.toss.tds.view.component.atom.image.TdsImageView), (r1v14 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1
      0x003e: PHI (r1v8 im.toss.tds.view.component.atom.image.TdsImageView) = (r1v7 im.toss.tds.view.component.atom.image.TdsImageView), (r1v14 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(boolean z) throws Throwable {
        TdsImageView tdsImageView;
        Object obj;
        String strIntern;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            FrameLayout frameLayout = this.onNavigationEvent.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            tdsImageView = this.onNavigationEvent.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            if (z) {
                int i3 = ICustomTabsService + 57;
                isEngagementSignalsApiAvailable = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a((short) Color.red(0), (byte) (KeyEvent.getMaxKeyCode() << 83), 2103977291 << (ViewConfiguration.getLongPressTimeout() % 83), 372021615 % (ViewConfiguration.getTapTimeout() * 31), 14 % (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a((short) Color.red(0), (byte) (KeyEvent.getMaxKeyCode() >> 16), 2103977291 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 372021615, (-56) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                    obj = objArr2[0];
                }
                strIntern = ((String) obj).intern();
            } else {
                Object[] objArr3 = new Object[1];
                a((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2103977358, 372021615 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 58, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                int i4 = ICustomTabsService + 117;
                isEngagementSignalsApiAvailable = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            FrameLayout frameLayout2 = this.onNavigationEvent.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(0);
            tdsImageView = this.onNavigationEvent.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            if (z) {
            }
        }
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
    }

    private final void onExtraCallback(String str) throws Throwable {
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 117;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            final NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = this.IAuthTabCallbackDefault;
            if (thumbnailBanner != null && (adAsset = this.IAuthTabCallback) != null) {
                getFillAlpha.onWarmupCompleted(IAuthTabCallbackStub(), this.onWarmupCompleted, adAsset, str != null ? new NativeAdsEventLogType.onExtraCallback(str) : null, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsThumbnailVideoView$$ExternalSyntheticLambda14
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 33;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnExtraCallback = NativeAdsThumbnailVideoView.onExtraCallback(this.f$0, thumbnailBanner);
                        int i7 = IAuthTabCallback + 53;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 31 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                }, 56, null);
                return;
            }
            int i4 = i2 + 47;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 87;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            Context context = nativeAdsThumbnailVideoView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            getStrokeWidth.IAuthTabCallback(getstrokewidth, context, thumbnailBanner.onWarmupCompleted(), 0, 2, null);
            Result.constructor-impl(Unit.INSTANCE);
            int i4 = isEngagementSignalsApiAvailable + 99;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, String str, ExposureContent exposureContent, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 117;
        int i4 = i3 % 128;
        isEngagementSignalsApiAvailable = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 101;
            ICustomTabsService = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 9 / 0;
            }
            exposureContent = null;
        }
        nativeAdsThumbnailVideoView.onWarmupCompleted(str, exposureContent);
    }

    private final void onWarmupCompleted(String str, ExposureContent exposureContent) {
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 117;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i3 = 90 / 0;
            if (nativeAdsManagerIAuthTabCallbackStub == null) {
                return;
            }
        } else {
            nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (nativeAdsManagerIAuthTabCallbackStub == null) {
                return;
            }
        }
        nativeAdsManagerIAuthTabCallbackStub.onWarmupCompleted(this.onWarmupCompleted, str, exposureContent);
        int i4 = isEngagementSignalsApiAvailable + 111;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void onWarmupCompleted(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, String str, String str2, AdMobFailedReason adMobFailedReason, ExposureContent exposureContent, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 21;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            adMobFailedReason = null;
        }
        if ((i & 8) != 0) {
            exposureContent = null;
        }
        nativeAdsThumbnailVideoView.onExtraCallbackWithResult(str, str2, adMobFailedReason, exposureContent);
        int i5 = ICustomTabsService + 125;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(String str, String str2, AdMobFailedReason adMobFailedReason, ExposureContent exposureContent) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 35;
        ICustomTabsService = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub();
            obj.hashCode();
            throw null;
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub != null) {
            nativeAdsManagerIAuthTabCallbackStub.onExtraCallback(this.onWarmupCompleted, str, str2, adMobFailedReason, exposureContent);
        }
        int i3 = isEngagementSignalsApiAvailable + 27;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final boolean onNavigationEvent(NativeAdsDto.Mediation mediation) {
        AdmobAdFormat admobAdFormat;
        Object next;
        int i = 2 % 2;
        Iterator<T> it = mediation.IAuthTabCallbackDefault().iterator();
        while (true) {
            admobAdFormat = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = isEngagementSignalsApiAvailable + 121;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            next = it.next();
            String str = (String) next;
            if (!(!Intrinsics.areEqual(str, "ADMOB"))) {
                break;
            }
            int i4 = ICustomTabsService + 5;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            if (!(!Intrinsics.areEqual(str, "TOSS"))) {
                break;
            }
        }
        if (!Intrinsics.areEqual(next, "ADMOB")) {
            return false;
        }
        NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediation.onExtraCallbackWithResult();
        if (admobInfoOnExtraCallbackWithResult != null) {
            int i6 = isEngagementSignalsApiAvailable + 7;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
            admobAdFormat = (AdmobAdFormat) NativeAdsDto.AdmobInfo.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{admobInfoOnExtraCallbackWithResult}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1779197038);
        }
        if (admobAdFormat != AdmobAdFormat.NATIVE) {
            return false;
        }
        int i8 = ICustomTabsService + 25;
        isEngagementSignalsApiAvailable = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1302131800, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1302131785);
        onNavigationEvent(this.IAuthTabCallbackStub);
        this.onTransact = true;
        TdsImageView tdsImageView = this.onNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        StyledPlayerView styledPlayerView = this.onNavigationEvent.access100;
        Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
        styledPlayerView.setVisibility(8);
        TdsImageView tdsImageView2 = this.onNavigationEvent.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        tdsImageView2.setVisibility(8);
        Typography7 typography7 = this.onNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        typography7.setVisibility(8);
        ConstraintLayout constraintLayoutOnNavigationEvent = this.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setVisibility(8);
        FrameLayout frameLayout = this.onNavigationEvent.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        access000().setVisibility(0);
        int i4 = isEngagementSignalsApiAvailable + 97;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(this.IAuthTabCallbackStub);
        ConstraintLayout constraintLayout = this.onNavigationEvent.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        TdsImageView tdsImageView = this.onNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        StyledPlayerView styledPlayerView = this.onNavigationEvent.access100;
        Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
        styledPlayerView.setVisibility(8);
        TdsImageView tdsImageView2 = this.onNavigationEvent.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        tdsImageView2.setVisibility(8);
        access000().setVisibility(8);
        Typography7 typography7 = this.onNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        typography7.setVisibility(8);
        ConstraintLayout constraintLayoutOnNavigationEvent = this.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setVisibility(8);
        FrameLayout frameLayout = this.onNavigationEvent.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        int i4 = ICustomTabsService + 11;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        String strOnTransact;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.onNavigationEvent.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        IAuthTabCallback(this.IAuthTabCallbackStub);
        TdsImageView tdsImageView = this.onNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        StyledPlayerView styledPlayerView = this.onNavigationEvent.access100;
        Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
        styledPlayerView.setVisibility(8);
        access000().setVisibility(8);
        TdsImageView tdsImageView2 = this.onNavigationEvent.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        tdsImageView2.setVisibility(0);
        TdsImageView tdsImageView3 = this.onNavigationEvent.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        String strAccess100 = thumbnailBanner.access100();
        if (strAccess100 == null) {
            int i4 = ICustomTabsService + 121;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                thumbnailBanner.onTransact();
                throw null;
            }
            strOnTransact = thumbnailBanner.onTransact();
        } else {
            strOnTransact = strAccess100;
        }
        TdsImageView.setImage$default(tdsImageView3, strOnTransact, (Function1) null, (Function1) null, 6, (Object) null);
        Typography7 typography7 = this.onNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        typography7.setVisibility(8);
        ConstraintLayout constraintLayoutOnNavigationEvent = this.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setVisibility(8);
        FrameLayout frameLayout = this.onNavigationEvent.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        int i5 = ICustomTabsService + 17;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 71;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = false;
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1302131800, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1302131785);
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1299311077, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1299311078);
        setVisibility(8);
        int i4 = ICustomTabsService + 109;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        return (Unit) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2122041606, new Object[]{nativeAdsThumbnailVideoView}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2122041595);
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, MotionEvent motionEvent) {
        return (Unit) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1221913810, new Object[]{nativeAdsThumbnailVideoView, motionEvent}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1221913806);
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        return (Unit) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1237090267, new Object[]{nativeAdsThumbnailVideoView}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1237090254);
    }

    private static final void onWarmupCompleted(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, View view) {
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 222693184, new Object[]{nativeAdsThumbnailVideoView, view}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -222693175);
    }

    public static final /* synthetic */ NativeAdsThumbnailAdMobView asBinder(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView) {
        return (NativeAdsThumbnailAdMobView) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1294516599, new Object[]{nativeAdsThumbnailVideoView}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1294516585);
    }

    private final void onWarmupCompleted(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -113585859, new Object[]{this, nativeAdsThumbnailAdMobView}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 113585871);
    }

    private final void onExtraCallbackWithResult(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1760386378, new Object[]{this, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1760386394);
    }

    private final NativeAdsDto.ThumbnailBannerContentType onNavigationEvent(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        return (NativeAdsDto.ThumbnailBannerContentType) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1893907374, new Object[]{this, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1893907368);
    }

    private final boolean IAuthTabCallback(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        return ((Boolean) IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -833872293, new Object[]{this, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 833872295)).booleanValue();
    }

    private final void getInterfaceDescriptor() {
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1302131800, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1302131785);
    }

    private final void ICustomTabsCallbackStub() {
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1299311077, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1299311078);
    }

    private final void ICustomTabsCallbackStubProxy() {
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1738885333, new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1738885343);
    }

    private final void onExtraCallback(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2041552885, new Object[]{this, thumbnailBanner}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 2041552893);
    }
}
