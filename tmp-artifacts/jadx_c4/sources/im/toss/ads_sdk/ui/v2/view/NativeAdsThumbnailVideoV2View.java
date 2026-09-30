package im.toss.ads_sdk.ui.v2.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
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
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.admob.AdmobAdFormat;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.remote.model.AdMobFailedReason;
import im.toss.ads_sdk.remote.model.AdmobError;
import im.toss.ads_sdk.remote.model.ExposureContent;
import im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View$;
import im.toss.ads_sdk.ui.view.NativeAdsContainerView;
import im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;
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
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setSecureScreen;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.PagerAdapter;
import o.SpannedDataExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda17;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access8100;
import o.deprecated_certificatePinner;
import o.endRearDisplayPresentationSession;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getFillAlpha;
import o.getPackageType;
import o.getRearDisplayMetrics;
import o.getScaleX;
import o.getStrokeWidth;
import o.getWrite;
import o.isFireOS;
import o.isMuted;
import o.nSetPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsThumbnailVideoV2View extends NativeAdsContainerView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback_Parcel = 1;
    private static int extraCommand;
    private final Lazy IAuthTabCallback;
    private final Set<Long> IAuthTabCallbackDefault;
    private final Set<Long> IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private List<? extends NativeAdsEventLogType> ICustomTabsCallbackDefault;
    private getPackageType ICustomTabsCallbackStub;
    private Function0<Unit> ICustomTabsCallbackStubProxy;
    private boolean access000;
    private Rally access100;
    private final String asBinder;
    private NativeAdsDto.Creative.ThumbnailBanner asInterface;
    private Function1<? super NativeAdsEventLogType, Unit> extraCallback;
    private TextFieldScrollKtExternalSyntheticLambda0 extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private final String onActivityLayout;
    private final View.OnLayoutChangeListener onActivityResized;
    private String onExtraCallback;
    private NativeAdsThumbnailAdMobView onExtraCallbackWithResult;
    private ExoPlayer onMessageChannelReady;
    private final ViewTreeObserver.OnScrollChangedListener onMinimized;
    private final PagerAdapter onNavigationEvent;
    private final onExtraCallback onPostMessage;
    private boolean onTransact;
    private NativeAdsDto.AdAsset onWarmupCompleted;
    private boolean readTypedObject;
    private final NativeAdsThumbnailVideoV2View$lifecycleObserver$1 writeTypedObject;
    private static char[] onRelationshipValidationResult = {32428, 32487, 32482, 32488, 32500, 32480, 32492, 32481, 32474, 32429, 32499, 32491, 32497, 32430, 32493, 32495, 32494, 32501, 32416, 32484, 32431, 32496, 32502, 32418, 32485, 32503};
    private static int onUnminimized = -1184334180;
    private static boolean isEngagementSignalsApiAvailable = true;
    private static boolean ICustomTabsService = true;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[NativeAdsDto.ThumbnailBannerContentType.values().length];
            try {
                iArr[NativeAdsDto.ThumbnailBannerContentType.IMAGE.ordinal()] = 1;
                int i = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeAdsDto.ThumbnailBannerContentType.VIDEO.ordinal()] = 2;
                int i3 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsThumbnailVideoV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsThumbnailVideoV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i5 | i3);
        int i12 = (~(i3 | i5)) | (~(i7 | i9)) | i8;
        int i13 = i5 + i4 + i2 + ((-1422066268) * i) + ((-2108786386) * i6);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i5) + 967573504 + (322476998 * i4) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i2) + ((-1298137088) * i) + (1722810368 * i6) + (518782976 * i14);
        int i16 = (i5 * 793895740) + 1353643607 + (i4 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i2 * 793896001) + (i * 692483748) + (i6 * (-1016611666)) + (i14 * 166461440);
        switch (i15 + (i16 * i16 * 1997799424)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
                int i17 = 2 % 2;
                int i18 = extraCommand + 13;
                ICustomTabsCallback_Parcel = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnMinimized = onMinimized(nativeAdsThumbnailVideoV2View);
                int i20 = extraCommand + 63;
                ICustomTabsCallback_Parcel = i20 % 128;
                int i21 = i20 % 2;
                return unitOnMinimized;
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asBinder(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                int i22 = 2 % 2;
                int i23 = ICustomTabsCallback_Parcel + 49;
                extraCommand = i23 % 128;
                int i24 = i23 % 2;
                Unit unit = Unit.INSTANCE;
                int i25 = extraCommand + 121;
                ICustomTabsCallback_Parcel = i25 % 128;
                int i26 = i25 % 2;
                return unit;
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access000(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objArr[1];
                int i27 = 2 % 2;
                int i28 = ICustomTabsCallback_Parcel + 53;
                extraCommand = i28 % 128;
                int i29 = i28 % 2;
                boolean zStartsWith$default = StringsKt.startsWith$default(thumbnailBanner.IAuthTabCallback(), "admob_shell_", false, 2, (Object) null);
                int i30 = extraCommand + 11;
                ICustomTabsCallback_Parcel = i30 % 128;
                int i31 = i30 % 2;
                return Boolean.valueOf(zStartsWith$default);
            case 16:
                return access100(objArr);
            case 17:
                return getInterfaceDescriptor(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return ICustomTabsCallback(objArr);
            case 19:
                return readTypedObject(objArr);
            case 20:
                return writeTypedObject(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 95;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            onMessageChannelReady(nativeAdsThumbnailVideoV2View);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnMessageChannelReady = onMessageChannelReady(nativeAdsThumbnailVideoV2View);
        int i3 = extraCommand + 5;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnMessageChannelReady;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 39;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(nativeAdsThumbnailVideoV2View, motionEvent);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = extraCommand + 111;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 85;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityResized(nativeAdsThumbnailVideoV2View);
        }
        onActivityResized(nativeAdsThumbnailVideoV2View);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 89;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, motionEvent}, iOnWarmupCompleted, 951281908, -951281902, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = ICustomTabsCallback_Parcel + 101;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 31;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, view}, iOnWarmupCompleted, -201395958, 201395961, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = ICustomTabsCallback_Parcel + 91;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit asBinder(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallbackStubProxy(nativeAdsThumbnailVideoV2View);
        }
        ICustomTabsCallbackStubProxy(nativeAdsThumbnailVideoV2View);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 23;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onUnminimized(nativeAdsThumbnailVideoV2View);
            throw null;
        }
        Unit unitOnUnminimized = onUnminimized(nativeAdsThumbnailVideoV2View);
        int i3 = ICustomTabsCallback_Parcel + 5;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return unitOnUnminimized;
    }

    public static /* synthetic */ Unit asInterface(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 61;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(nativeAdsThumbnailVideoV2View, motionEvent);
        int i4 = ICustomTabsCallback_Parcel + 111;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return access100(nativeAdsThumbnailVideoV2View, motionEvent);
        }
        access100(nativeAdsThumbnailVideoV2View, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackDefault(nativeAdsThumbnailVideoV2View);
        int i4 = ICustomTabsCallback_Parcel + 43;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 19;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onActivityLayout(nativeAdsThumbnailVideoV2View);
            obj.hashCode();
            throw null;
        }
        Unit unitOnActivityLayout = onActivityLayout(nativeAdsThumbnailVideoV2View);
        int i3 = ICustomTabsCallback_Parcel + 51;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnActivityLayout;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(nativeAdsThumbnailVideoV2View, motionEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(nativeAdsThumbnailVideoV2View, motionEvent);
        int i3 = extraCommand + 107;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 115;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsThumbnailVideoV2View, thumbnailBanner);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = ICustomTabsCallback_Parcel + 67;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, View view) {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(nativeAdsThumbnailVideoV2View, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCommand + 107;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = ICustomTabsCallback_Parcel + 57;
        extraCommand = i10 % 128;
        int i11 = i10 % 2;
        IAuthTabCallback(nativeAdsThumbnailVideoV2View, view, i, i2, i3, i4, i5, i6, i7, i8);
        int i12 = extraCommand + 59;
        ICustomTabsCallback_Parcel = i12 % 128;
        int i13 = i12 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsThumbnailVideoV2View, motionEvent);
        int i4 = ICustomTabsCallback_Parcel + 13;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = extraCommand + 97;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, motionEvent}, iOnWarmupCompleted, 1991526600, -1991526592, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = extraCommand + 21;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        NativeAd nativeAd = (NativeAd) objArr[1];
        NativeAd nativeAd2 = (NativeAd) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsThumbnailVideoV2View, nativeAd, nativeAd2);
        int i4 = ICustomTabsCallback_Parcel + 45;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCommand + 15;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, 610696307, -610696296, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(nativeAdsThumbnailVideoV2View);
        int i4 = ICustomTabsCallback_Parcel + 61;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitOnRelationshipValidationResult;
    }

    public static /* synthetic */ getScaleX onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = extraCommand + 65;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getScaleX getscalexOnExtraCallback = onExtraCallback(context);
        int i4 = extraCommand + 67;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return getscalexOnExtraCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View$lifecycleObserver$1] */
    public NativeAdsThumbnailVideoV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onActivityLayout = "NativeAdsThumbnailVideoV2View";
        this.asBinder = "16:9";
        this.IAuthTabCallbackStubProxy = "1.91:1";
        this.onExtraCallback = "";
        PagerAdapter pagerAdapterOnExtraCallbackWithResult = PagerAdapter.onExtraCallbackWithResult(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(pagerAdapterOnExtraCallbackWithResult, "");
        this.onNavigationEvent = pagerAdapterOnExtraCallbackWithResult;
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda1(context));
        this.ICustomTabsCallbackDefault = CollectionsKt.emptyList();
        this.ICustomTabsCallbackStubProxy = new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda12();
        this.IAuthTabCallbackStub = new LinkedHashSet();
        this.IAuthTabCallbackDefault = new LinkedHashSet();
        this.onMinimized = new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda13(this);
        this.onActivityResized = new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda14(this);
        this.writeTypedObject = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View$lifecycleObserver$1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 != 0) {
                    int i5 = 84 / 0;
                }
                int i6 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 51;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                int i5 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r5
              0x0033: PHI (r5v4 com.google.android.exoplayer2.ExoPlayer) = (r5v3 com.google.android.exoplayer2.ExoPlayer), (r5v14 com.google.android.exoplayer2.ExoPlayer) binds: [B:8:0x0031, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                ExoPlayer exoPlayerWriteTypedObject;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    NativeAdsThumbnailVideoV2View.onWarmupCompleted(this.IAuthTabCallback, false);
                    exoPlayerWriteTypedObject = NativeAdsThumbnailVideoV2View.writeTypedObject(this.IAuthTabCallback);
                    if (exoPlayerWriteTypedObject != null) {
                        exoPlayerWriteTypedObject.pause();
                    }
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    NativeAdsThumbnailVideoV2View.onWarmupCompleted(this.IAuthTabCallback, true);
                    exoPlayerWriteTypedObject = NativeAdsThumbnailVideoV2View.writeTypedObject(this.IAuthTabCallback);
                    if (exoPlayerWriteTypedObject != null) {
                    }
                }
                NativeAdsThumbnailVideoV2View.onTransact(this.IAuthTabCallback).setOnViewVisible(false);
                int i4 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 42 / 0;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    NativeAdsThumbnailVideoV2View.onWarmupCompleted(this.IAuthTabCallback, true);
                    Object[] objArr = {this.IAuthTabCallback};
                    int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                    NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, 980821090, -980821089, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    return;
                }
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                NativeAdsThumbnailVideoV2View.onWarmupCompleted(this.IAuthTabCallback, false);
                Object[] objArr2 = {this.IAuthTabCallback};
                int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, 980821090, -980821089, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
        };
        this.onPostMessage = new onExtraCallback();
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Typography7 typography7 = pagerAdapterOnExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, typography7, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda15(this), new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda16(this), 2045, null);
        TdsImageView tdsImageView = pagerAdapterOnExtraCallbackWithResult.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsImageView, false, null, 0, null, null, 0.0f, 1.0f, null, false, 0L, null, new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda17(this), new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda18(this), 1981, null);
        TdsImageView tdsImageView2 = pagerAdapterOnExtraCallbackWithResult.access100;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsImageView2, false, null, 0, null, null, 0.0f, 1.0f, null, false, 0L, null, new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda19(this), new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda20(this), 1981, null);
        StyledPlayerView styledPlayerView = pagerAdapterOnExtraCallbackWithResult.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, styledPlayerView, false, null, 0, null, null, 0.0f, 1.0f, null, false, 0L, null, new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda2(this), new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda3(this), 1981, null);
        SubTypography8 subTypography8 = pagerAdapterOnExtraCallbackWithResult.extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(subTypography8, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, subTypography8, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda4(this), new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda5(this), 2045, null);
        TdsSquircleLayoutV1 tdsSquircleLayoutV1 = pagerAdapterOnExtraCallbackWithResult.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsSquircleLayoutV1, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda6(this), new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda7(this), 2045, null);
        Typography7 typography72 = pagerAdapterOnExtraCallbackWithResult.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(typography72, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, typography72, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda8(this), new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda9(this), 2045, null);
        pagerAdapterOnExtraCallbackWithResult.onNavigationEvent.setOnClickListener(new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda10(this));
        pagerAdapterOnExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallback.setOnClickListener(new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda11(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsThumbnailVideoV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallback_Parcel;
            int i4 = i3 + 77;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 67;
            extraCommand = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 1;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.IAuthTabCallback_Parcel();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCommand + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    public static final /* synthetic */ PagerAdapter IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 71;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        PagerAdapter pagerAdapter = nativeAdsThumbnailVideoV2View.onNavigationEvent;
        int i5 = i2 + 75;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return pagerAdapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Rally IAuthTabCallback_Parcel(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 55;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        Rally rally = nativeAdsThumbnailVideoV2View.access100;
        int i5 = i3 + 125;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return rally;
    }

    public static final /* synthetic */ void ICustomTabsCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 49;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsCallback_Parcel();
        int i4 = ICustomTabsCallback_Parcel + 37;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 81;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {nativeAdsThumbnailVideoV2View, Long.valueOf(jLongValue)};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, iOnWarmupCompleted, -1979388677, 1979388697, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = extraCommand + 121;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return null;
    }

    public static final /* synthetic */ Set access000(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 81;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        Set<Long> set = nativeAdsThumbnailVideoV2View.IAuthTabCallbackStub;
        int i5 = i3 + 87;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return set;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 79;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {nativeAdsThumbnailVideoV2View, thumbnailBanner};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 != 0) {
            IAuthTabCallback(iOnWarmupCompleted3, iOnWarmupCompleted2, objArr2, iOnWarmupCompleted, 455955272, -455955262, iOnWarmupCompleted4);
            obj.hashCode();
            throw null;
        }
        IAuthTabCallback(iOnWarmupCompleted3, iOnWarmupCompleted2, objArr2, iOnWarmupCompleted, 455955272, -455955262, iOnWarmupCompleted4);
        int i4 = ICustomTabsCallback_Parcel + 93;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ Function1 access100(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 71;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Function1<? super NativeAdsEventLogType, Unit> function1 = nativeAdsThumbnailVideoV2View.extraCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 25;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public static final /* synthetic */ List extraCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 73;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        List<? extends NativeAdsEventLogType> list = nativeAdsThumbnailVideoV2View.ICustomTabsCallbackDefault;
        int i5 = i2 + 109;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return list;
    }

    public static final /* synthetic */ void extraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 103;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.extraCommand();
        int i4 = extraCommand + 99;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 27;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.isEngagementSignalsApiAvailable();
        int i4 = extraCommand + 81;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ Set getInterfaceDescriptor(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 75;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        Set<Long> set = nativeAdsThumbnailVideoV2View.IAuthTabCallbackDefault;
        int i5 = i3 + 45;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 123;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsService();
        int i4 = extraCommand + 29;
        ICustomTabsCallback_Parcel = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = extraCommand + 15;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, thumbnailBanner}, iOnWarmupCompleted, 411469487, -411469472, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
        int i4 = extraCommand + 67;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 89;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.IAuthTabCallback(nativeAd);
        int i4 = ICustomTabsCallback_Parcel + 67;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, Rally rally) {
        int i = 2 % 2;
        int i2 = extraCommand + 73;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.access100 = rally;
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onTransact = z;
        if (i4 == 0) {
            int i5 = 90 / 0;
        }
        int i6 = i3 + 115;
        extraCommand = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, String str, PlaybackException playbackException) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(thumbnailBanner, str, playbackException);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 67;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.IAuthTabCallback(str);
        int i4 = extraCommand + 103;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 23;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onNavigationEvent(z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback_Parcel + 117;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ NativeAdsThumbnailAdMobView onTransact(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return nativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy();
        }
        nativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, String str, ExposureContent exposureContent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, str, exposureContent}, iOnWarmupCompleted, 770986742, -770986724, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            return;
        }
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted4, new Object[]{nativeAdsThumbnailVideoV2View, str, exposureContent}, iOnWarmupCompleted3, 770986742, -770986724, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 111;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.readTypedObject = z;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
    }

    public static final /* synthetic */ ExoPlayer writeTypedObject(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 57;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        ExoPlayer exoPlayer = nativeAdsThumbnailVideoV2View.onMessageChannelReady;
        int i5 = i3 + 35;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return exoPlayer;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCommand + 51;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onActivityLayout;
        int i4 = i3 + 101;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 5;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 53;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final void setAdRequestId(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 31;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
        int i4 = ICustomTabsCallback_Parcel + 125;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private final getScaleX getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCommand + 123;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getScaleX getscalex = (getScaleX) this.IAuthTabCallback.getValue();
        if (i3 != 0) {
            return getscalex;
        }
        throw null;
    }

    private static final getScaleX onExtraCallback(Context context) {
        int i = 2 % 2;
        getScaleX getscalex = new getScaleX(context);
        int i2 = extraCommand + 91;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return getscalex;
        }
        throw null;
    }

    private final NativeAdsThumbnailAdMobView IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCommand + 35;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView = this.onExtraCallbackWithResult;
        if (nativeAdsThumbnailAdMobView == null) {
            int i4 = i3 + 73;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            nativeAdsThumbnailAdMobView = this.onNavigationEvent.onExtraCallback;
            if (i5 != 0) {
                Intrinsics.checkNotNullExpressionValue(nativeAdsThumbnailAdMobView, "");
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(nativeAdsThumbnailAdMobView, "");
        }
        return nativeAdsThumbnailAdMobView;
    }

    private static final void ICustomTabsCallbackDefault(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 9;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsService();
        int i4 = extraCommand + 113;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = ICustomTabsCallback_Parcel + 35;
        extraCommand = i10 % 128;
        int i11 = i10 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsService();
        int i12 = extraCommand + 79;
        ICustomTabsCallback_Parcel = i12 % 128;
        int i13 = i12 % 2;
    }

    public static final class asBinder implements View.OnAttachStateChangeListener {
        private static int asBinder = 1;
        private static int onExtraCallback;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ int onExtraCallbackWithResult;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ NativeAdsThumbnailVideoV2View onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }

        public asBinder(View view, NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, String str, int i) {
            this.IAuthTabCallback = view;
            this.onWarmupCompleted = nativeAdsThumbnailVideoV2View;
            this.onNavigationEvent = str;
            this.onExtraCallbackWithResult = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[PHI: r2 r3
          0x0044: PHI (r2v17 float) = (r2v8 float), (r2v22 float) binds: [B:8:0x003d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x0044: PHI (r3v15 im.toss.tds.view.component.widget.TdsRoundLayout) = (r3v2 im.toss.tds.view.component.widget.TdsRoundLayout), (r3v16 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:8:0x003d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r2 r3 r5
          0x003f: PHI (r2v9 float) = (r2v8 float), (r2v22 float) binds: [B:8:0x003d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x003f: PHI (r3v3 im.toss.tds.view.component.widget.TdsRoundLayout) = (r3v2 im.toss.tds.view.component.widget.TdsRoundLayout), (r3v16 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:8:0x003d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x003f: PHI (r5v1 android.view.ViewGroup$LayoutParams) = (r5v0 android.view.ViewGroup$LayoutParams), (r5v12 android.view.ViewGroup$LayoutParams) binds: [B:8:0x003d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.View.OnAttachStateChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewAttachedToWindow(View view) {
            float measuredWidth;
            TdsRoundLayout tdsRoundLayout;
            ViewGroup.LayoutParams layoutParams;
            int i = 2 % 2;
            int i2 = asBinder + 85;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallback.removeOnAttachStateChangeListener(this);
                measuredWidth = this.onWarmupCompleted.getMeasuredWidth() + 1.91f;
                tdsRoundLayout = this.onWarmupCompleted;
                layoutParams = tdsRoundLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.onExtraCallbackWithResult;
                } else {
                    int i3 = asBinder + 27;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    layoutParams = null;
                }
            } else {
                this.IAuthTabCallback.removeOnAttachStateChangeListener(this);
                measuredWidth = this.onWarmupCompleted.getMeasuredWidth() / 1.91f;
                tdsRoundLayout = this.onWarmupCompleted;
                layoutParams = tdsRoundLayout.getLayoutParams();
                if (layoutParams != null) {
                }
            }
            tdsRoundLayout.setLayoutParams(layoutParams);
            NativeAdsThumbnailVideoV2View.onNavigationEvent(this.onWarmupCompleted, this.onNavigationEvent);
            Rally rallyIAuthTabCallback_Parcel = NativeAdsThumbnailVideoV2View.IAuthTabCallback_Parcel(this.onWarmupCompleted);
            if (rallyIAuthTabCallback_Parcel != null) {
                rallyIAuthTabCallback_Parcel.ICustomTabsServiceStub();
            }
            NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = this.onWarmupCompleted;
            Object[] objArr = {(Rally) RallysKt.onWarmupCompleted(new Object[]{this.onWarmupCompleted, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1685808947, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(this.onExtraCallbackWithResult), Integer.valueOf((int) measuredWidth), null, 4, null}, 1685808950, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, this.onWarmupCompleted.new IAuthTabCallbackDefault(), 1, null};
            NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(nativeAdsThumbnailVideoV2View, isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 2128644226), false, 1, (Object) null));
        }
    }

    public static final class onExtraCallback implements Player.Listener {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        onExtraCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[PHI: r9
          0x0079: PHI (r9v10 kotlin.jvm.functions.Function1) = (r9v9 kotlin.jvm.functions.Function1), (r9v13 kotlin.jvm.functions.Function1) binds: [B:21:0x0077, B:18:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onIsPlayingChanged(boolean z) {
            int i;
            Function1 function1Access100;
            int i2 = 2 % 2;
            ConstraintLayout constraintLayout = NativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View.this).onExtraCallbackWithResult.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            int i3 = 8;
            constraintLayout.setVisibility(!z ? 0 : 8);
            TdsImageView tdsImageView = NativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View.this).onExtraCallbackWithResult.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            if (z) {
                i = 8;
            } else {
                int i4 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                i = 0;
            }
            tdsImageView.setVisibility(i);
            Typography5 typography5 = NativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View.this).onExtraCallbackWithResult.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            if (!z) {
                int i6 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i3 = 0;
            }
            typography5.setVisibility(i3);
            if (!z) {
                NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{NativeAdsThumbnailVideoV2View.this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 223330126, -223330109, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i8 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            int i10 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                function1Access100 = NativeAdsThumbnailVideoV2View.access100(NativeAdsThumbnailVideoV2View.this);
                int i11 = 53 / 0;
                if (function1Access100 != null) {
                    function1Access100.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
                }
            } else {
                function1Access100 = NativeAdsThumbnailVideoV2View.access100(NativeAdsThumbnailVideoV2View.this);
                if (function1Access100 != null) {
                }
            }
            NativeAdsThumbnailVideoV2View.ICustomTabsCallback(NativeAdsThumbnailVideoV2View.this);
        }

        public void onRenderedFirstFrame() {
            TdsImageView tdsImageView;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                tdsImageView = NativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View.this).access100;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                i = 59;
            } else {
                tdsImageView = NativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View.this).access100;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                i = 8;
            }
            tdsImageView.setVisibility(i);
            int i4 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onPlaybackStateChanged(int i) {
            int i2 = 2 % 2;
            if (i == 4) {
                int i3 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsThumbnailVideoV2View.IAuthTabCallbackStub(NativeAdsThumbnailVideoV2View.this);
                Function1 function1Access100 = NativeAdsThumbnailVideoV2View.access100(NativeAdsThumbnailVideoV2View.this);
                if (function1Access100 != null) {
                    int i5 = onWarmupCompleted + 83;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        function1Access100.invoke(NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    function1Access100.invoke(NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted);
                }
                NativeAdsThumbnailVideoV2View.onNavigationEvent(NativeAdsThumbnailVideoV2View.this, true);
                ConstraintLayout constraintLayout = NativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View.this).onExtraCallbackWithResult.onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                TdsImageView tdsImageView = NativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View.this).onExtraCallbackWithResult.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                tdsImageView.setVisibility(0);
                Typography5 typography5 = NativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View.this).onExtraCallbackWithResult.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(typography5, "");
                typography5.setVisibility(0);
            }
        }
    }

    private static final Unit onActivityLayout(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsCallbackStubProxy.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = extraCommand + 59;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 75;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127}, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        nativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(((String) objArr[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 29;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onActivityResized(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 65;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsCallbackStubProxy.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 35;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onExtraCallbackWithResult("2005");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 23;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onUnminimized(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 59;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsCallbackStubProxy.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        nativeAdsThumbnailVideoV2View.onExtraCallbackWithResult("3002");
        if (i3 != 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 125;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit ICustomTabsCallbackStubProxy(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 85;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsCallbackStubProxy.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unit;
    }

    private static final Unit access100(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onExtraCallbackWithResult("3002");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback_Parcel + 33;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onRelationshipValidationResult(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 73;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsCallbackStubProxy.invoke();
        if (i3 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = extraCommand + 111;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    private static final Unit access000(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 109;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onExtraCallbackWithResult("1000");
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 79;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onMinimized(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        Unit unit;
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsCallbackStubProxy.invoke();
        if (i3 == 0) {
            unit = Unit.INSTANCE;
            int i4 = 68 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i5 = extraCommand + 71;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onExtraCallbackWithResult("2500");
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onMessageChannelReady(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.ICustomTabsCallbackStubProxy.invoke();
        if (i3 != 0) {
            return Unit.INSTANCE;
        }
        int i4 = 84 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onExtraCallbackWithResult("1002");
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 37;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r3.getVolume() <= 0.0f) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r5 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r7 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r3.setVolume(r7);
        r7 = r1.extraCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r5 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r5 = im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View.ICustomTabsCallback_Parcel + 75;
        im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View.extraCommand = r5 % 128;
        r5 = r5 % 2;
        r5 = im.toss.ads_sdk.model.NativeAdsEventLogType.writeTypedObject.onExtraCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r5 = im.toss.ads_sdk.model.NativeAdsEventLogType.onPostMessage.IAuthTabCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r7.invoke(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r3.getVolume() != 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r3 = im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View.extraCommand + 1;
        im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View.ICustomTabsCallback_Parcel = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if ((r3 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r1.onWarmupCompleted(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        ExoPlayer exoPlayer;
        boolean z = false;
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 101;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            exoPlayer = nativeAdsThumbnailVideoV2View.onMessageChannelReady;
            int i3 = 66 / 0;
        } else {
            exoPlayer = nativeAdsThumbnailVideoV2View.onMessageChannelReady;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onRelationshipValidationResult;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 77, TextUtils.getTrimmedLength("") + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onUnminimized)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetBefore("", 0) + 75, ExpandableListView.getPackedPositionChild(0L) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (!ICustomTabsService) {
            if (!isEngagementSignalsApiAvailable) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $11 + 119;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), TextUtils.indexOf("", "") + 63, ((Process.getThreadPriority(0) + 20) >> 6) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i8 = $11 + 35;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        }
        char[] cArr6 = new char[i2];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $11 + 63;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), MotionEvent.axisFromString("") + 64, View.resolveSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(obj, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), Color.blue(0) + 63, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            obj = null;
            i5 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    private static final void IAuthTabCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, View view) {
        int i = 2 % 2;
        ExoPlayer exoPlayer = nativeAdsThumbnailVideoV2View.onMessageChannelReady;
        if (exoPlayer == null) {
            return;
        }
        if (!(!exoPlayer.isPlaying())) {
            int i2 = ICustomTabsCallback_Parcel + 43;
            extraCommand = i2 % 128;
            if (i2 % 2 != 0) {
                nativeAdsThumbnailVideoV2View.ICustomTabsCallback = true;
                nativeAdsThumbnailVideoV2View.onNavigationEvent(true);
                exoPlayer.pause();
                return;
            } else {
                nativeAdsThumbnailVideoV2View.ICustomTabsCallback = true;
                nativeAdsThumbnailVideoV2View.onNavigationEvent(false);
                exoPlayer.pause();
                return;
            }
        }
        nativeAdsThumbnailVideoV2View.ICustomTabsCallback = false;
        if (exoPlayer.getPlaybackState() == 4) {
            int i3 = ICustomTabsCallback_Parcel + 3;
            extraCommand = i3 % 128;
            if (i3 % 2 != 0) {
                exoPlayer.seekTo(1L);
            } else {
                exoPlayer.seekTo(0L);
            }
            int i4 = extraCommand + 115;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        nativeAdsThumbnailVideoV2View.onNavigationEvent(false);
        exoPlayer.play();
    }

    @Override // o.RestrictionAllowlist
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCommand + 29;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService();
        int i4 = extraCommand + 33;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onAttachedToWindow() throws Throwable {
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i = 2 % 2;
        int i2 = extraCommand + 101;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttachedToWindow();
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            this.extraCallbackWithResult = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle()) != null) {
                lifecycle.IAuthTabCallback(this.writeTypedObject);
            }
            getViewTreeObserver().addOnScrollChangedListener(this.onMinimized);
            addOnLayoutChangeListener(this.onActivityResized);
            ICustomTabsCallbackStub();
            ICustomTabsService();
            int i3 = ICustomTabsCallback_Parcel + 29;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onAttachedToWindow();
        this.extraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        throw null;
    }

    private final void ICustomTabsCallbackStub() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 61;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        if (!this.onTransact) {
            int i5 = i2 + 107;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
            NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = this.asInterface;
            if (thumbnailBanner != null && IAuthTabCallback(thumbnailBanner) == NativeAdsDto.ThumbnailBannerContentType.VIDEO) {
                int i7 = extraCommand + 65;
                ICustomTabsCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                if (this.onMessageChannelReady == null) {
                    TdsImageView tdsImageView = this.onNavigationEvent.access100;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    tdsImageView.setVisibility(0);
                    ConstraintLayout constraintLayout = this.onNavigationEvent.onExtraCallbackWithResult.onExtraCallbackWithResult;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    constraintLayout.setVisibility(0);
                    TdsImageView tdsImageView2 = this.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallback;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                    tdsImageView2.setVisibility(0);
                    Typography5 typography5 = this.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallbackDefault;
                    Intrinsics.checkNotNullExpressionValue(typography5, "");
                    typography5.setVisibility(0);
                    onNavigationEvent(false);
                    onWarmupCompleted(thumbnailBanner);
                    extraCallback();
                    int i9 = extraCommand + 29;
                    ICustomTabsCallback_Parcel = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 51 / 0;
                        return;
                    }
                    return;
                }
            }
        }
        int i11 = extraCommand + 117;
        ICustomTabsCallback_Parcel = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = extraCommand + 55;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDetachedFromWindow();
            throw null;
        }
        super.onDetachedFromWindow();
        Rally rally = this.access100;
        if (rally != null) {
            int i3 = ICustomTabsCallback_Parcel + 23;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            rally.ICustomTabsServiceStub();
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.extraCallbackWithResult;
        if (textFieldScrollKtExternalSyntheticLambda0 != null) {
            int i5 = extraCommand + 39;
            ICustomTabsCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
                throw null;
            }
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
            if (lifecycle != null) {
                lifecycle.onExtraCallbackWithResult(this.writeTypedObject);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onMinimized);
        removeOnLayoutChangeListener(this.onActivityResized);
        isEngagementSignalsApiAvailable();
        ExoPlayer exoPlayer = this.onMessageChannelReady;
        if (exoPlayer != null) {
            exoPlayer.pause();
            int i6 = extraCommand + 111;
            ICustomTabsCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        IAuthTabCallbackStubProxy().setOnViewVisible(false);
    }

    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        isEngagementSignalsApiAvailable();
        ExoPlayer exoPlayer = this.onMessageChannelReady;
        if (exoPlayer != null) {
            int i2 = ICustomTabsCallback_Parcel + 87;
            extraCommand = i2 % 128;
            if (i2 % 2 == 0) {
                exoPlayer.removeListener(this.onPostMessage);
            } else {
                exoPlayer.removeListener(this.onPostMessage);
                int i3 = 33 / 0;
            }
        }
        ExoPlayer exoPlayer2 = this.onMessageChannelReady;
        if (exoPlayer2 != null) {
            int i4 = extraCommand + 53;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            exoPlayer2.release();
            if (i5 == 0) {
                throw null;
            }
        }
        this.onMessageChannelReady = null;
        IAuthTabCallbackStubProxy().setVisibleRatio(0.0d);
        IAuthTabCallbackStubProxy().setOnViewVisible(false);
        IAuthTabCallbackDefault();
    }

    public static /* synthetic */ void setItem$default(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, List list, Function1 function1, Function0 function0, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCommand + 61;
        int i4 = i3 % 128;
        ICustomTabsCallback_Parcel = i4;
        if (i3 % 2 != 0 ? (i & 16) != 0 : (i & 74) != 0) {
            int i5 = i4 + 11;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
            function0 = null;
        }
        nativeAdsThumbnailVideoV2View.setItem(adAsset, thumbnailBanner, list, function1, function0);
    }

    public static final class IAuthTabCallback implements getScaleX.onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0<Unit> onExtraCallbackWithResult;
        final /* synthetic */ NativeAdsDto.Creative.ThumbnailBanner onNavigationEvent;

        IAuthTabCallback(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, Function0<Unit> function0) {
            this.onNavigationEvent = thumbnailBanner;
            this.onExtraCallbackWithResult = function0;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void IAuthTabCallback(NativeAd nativeAd) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAd, "");
            NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = NativeAdsThumbnailVideoV2View.this;
            ExposureContent.Companion companion = ExposureContent.Companion;
            NativeAdsThumbnailVideoV2View.onWarmupCompleted(nativeAdsThumbnailVideoV2View, "LOAD", companion.onExtraCallback(nativeAd));
            NativeAdsThumbnailVideoV2View.IAuthTabCallback(NativeAdsThumbnailVideoV2View.this, "ADMOB", (String) null, (AdMobFailedReason) null, companion.onExtraCallback(nativeAd), 6, (Object) null);
            NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View.this, nativeAd);
            NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = NativeAdsThumbnailVideoV2View.this.IAuthTabCallbackStub();
            if (nativeAdsManagerIAuthTabCallbackStub != null) {
                int i4 = onWarmupCompleted + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                String strOnExtraCallback = NativeAdsThumbnailVideoV2View.this.onExtraCallback();
                if (i5 == 0) {
                    NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 695726411, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -695726405, new Object[]{nativeAdsManagerIAuthTabCallbackStub, strOnExtraCallback, NativeAdsThumbnailVideoV2View.onTransact(NativeAdsThumbnailVideoV2View.this)}, nSetPosition.onExtraCallbackWithResult());
                } else {
                    NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 695726411, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -695726405, new Object[]{nativeAdsManagerIAuthTabCallbackStub, strOnExtraCallback, NativeAdsThumbnailVideoV2View.onTransact(NativeAdsThumbnailVideoV2View.this)}, nSetPosition.onExtraCallbackWithResult());
                    int i6 = 99 / 0;
                }
            }
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onWarmupCompleted(NativeAd nativeAd) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAd, "");
            NativeAdsThumbnailVideoV2View.onWarmupCompleted(NativeAdsThumbnailVideoV2View.this, "CLICK", ExposureContent.Companion.onExtraCallback(nativeAd));
            int i4 = onWarmupCompleted + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onWarmupCompleted(NativeAd nativeAd, ExposureContent exposureContent) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAd, "");
            Intrinsics.checkNotNullParameter(exposureContent, "");
            NativeAdsThumbnailVideoV2View.onWarmupCompleted(NativeAdsThumbnailVideoV2View.this, "PAID", exposureContent);
            int i4 = onWarmupCompleted + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onNavigationEvent(ExposureContent exposureContent, AdMobFailedReason adMobFailedReason, boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(exposureContent, "");
                Intrinsics.checkNotNullParameter(adMobFailedReason, "");
                NativeAdsThumbnailVideoV2View.onWarmupCompleted(NativeAdsThumbnailVideoV2View.this, "AD_FILTERED", exposureContent);
                throw null;
            }
            Intrinsics.checkNotNullParameter(exposureContent, "");
            Intrinsics.checkNotNullParameter(adMobFailedReason, "");
            NativeAdsThumbnailVideoV2View.onWarmupCompleted(NativeAdsThumbnailVideoV2View.this, "AD_FILTERED", exposureContent);
            if (!z) {
                int i3 = IAuthTabCallback + 67;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            if (NativeAdsThumbnailVideoV2View.onExtraCallback(NativeAdsThumbnailVideoV2View.this, this.onNavigationEvent)) {
                int i4 = IAuthTabCallback + 29;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    NativeAdsThumbnailVideoV2View.IAuthTabCallback(NativeAdsThumbnailVideoV2View.this, (String) null, "NO_AD", adMobFailedReason, (ExposureContent) null, 123, (Object) null);
                    NativeAdsThumbnailVideoV2View.extraCallbackWithResult(NativeAdsThumbnailVideoV2View.this);
                    return;
                } else {
                    NativeAdsThumbnailVideoV2View.IAuthTabCallback(NativeAdsThumbnailVideoV2View.this, (String) null, "NO_AD", adMobFailedReason, (ExposureContent) null, 8, (Object) null);
                    NativeAdsThumbnailVideoV2View.extraCallbackWithResult(NativeAdsThumbnailVideoV2View.this);
                    return;
                }
            }
            NativeAdsThumbnailVideoV2View.IAuthTabCallback(NativeAdsThumbnailVideoV2View.this, "TOSS", (String) null, adMobFailedReason, (ExposureContent) null, 10, (Object) null);
            NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View.this, false);
            if (this.onExtraCallbackWithResult != null) {
                NativeAdsThumbnailVideoV2View.this.setVisibility(8);
                this.onExtraCallbackWithResult.invoke();
            } else {
                Object[] objArr = {NativeAdsThumbnailVideoV2View.this, this.onNavigationEvent};
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, -2040315026, 2040315042, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onWarmupCompleted(String str, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = {NativeAdsThumbnailVideoV2View.this, "FAILED_TO_LOAD", null, 2, null};
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, 954695640, -954695627, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (!z) {
                int i2 = onWarmupCompleted + 1;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 17 / 0;
                    return;
                }
                return;
            }
            if (NativeAdsThumbnailVideoV2View.onExtraCallback(NativeAdsThumbnailVideoV2View.this, this.onNavigationEvent)) {
                NativeAdsThumbnailVideoV2View.IAuthTabCallback(NativeAdsThumbnailVideoV2View.this, (String) null, "NO_AD", new AdMobFailedReason("NO_AD", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), (ExposureContent) null, 8, (Object) null);
                NativeAdsThumbnailVideoV2View.extraCallbackWithResult(NativeAdsThumbnailVideoV2View.this);
                return;
            }
            NativeAdsThumbnailVideoV2View.IAuthTabCallback(NativeAdsThumbnailVideoV2View.this, "TOSS", (String) null, new AdMobFailedReason("NO_AD", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), (ExposureContent) null, 10, (Object) null);
            NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View.this, false);
            if (this.onExtraCallbackWithResult == null) {
                Object[] objArr2 = {NativeAdsThumbnailVideoV2View.this, this.onNavigationEvent};
                int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, -2040315026, 2040315042, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                return;
            }
            NativeAdsThumbnailVideoV2View.this.setVisibility(8);
            this.onExtraCallbackWithResult.invoke();
            int i4 = IAuthTabCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void IAuthTabCallback() {
            TdsRoundLayout tdsRoundLayout;
            int i;
            int i2 = 2 % 2;
            NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{NativeAdsThumbnailVideoV2View.this, "TIMEOUT", null, 2, null}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 954695640, -954695627, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (NativeAdsThumbnailVideoV2View.onExtraCallback(NativeAdsThumbnailVideoV2View.this, this.onNavigationEvent)) {
                NativeAdsThumbnailVideoV2View.IAuthTabCallback(NativeAdsThumbnailVideoV2View.this, (String) null, "NO_AD", new AdMobFailedReason("TIMEOUT", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), (ExposureContent) null, 8, (Object) null);
                NativeAdsThumbnailVideoV2View.extraCallbackWithResult(NativeAdsThumbnailVideoV2View.this);
                return;
            }
            NativeAdsThumbnailVideoV2View.IAuthTabCallback(NativeAdsThumbnailVideoV2View.this, "TOSS", (String) null, new AdMobFailedReason("TIMEOUT", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), (ExposureContent) null, 10, (Object) null);
            NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(NativeAdsThumbnailVideoV2View.this, false);
            if (this.onExtraCallbackWithResult != null) {
                int i3 = onWarmupCompleted + 117;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    tdsRoundLayout = NativeAdsThumbnailVideoV2View.this;
                    i = 48;
                } else {
                    tdsRoundLayout = NativeAdsThumbnailVideoV2View.this;
                    i = 8;
                }
                tdsRoundLayout.setVisibility(i);
                this.onExtraCallbackWithResult.invoke();
                return;
            }
            NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{NativeAdsThumbnailVideoV2View.this, this.onNavigationEvent}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2040315026, 2040315042, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i4 = onWarmupCompleted + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setItem(@NotNull NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, @NotNull List<? extends NativeAdsEventLogType> list, @NotNull Function1<? super NativeAdsEventLogType, Unit> function1, @Nullable Function0<Unit> function0) throws Throwable {
        NativeAdsDto.Mediation mediation;
        NativeAdsDto.AdmobInfo admobInfo;
        NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobViewOnWarmupCompleted;
        boolean z;
        NativeAdsDto.AdmobInfo admobInfo2;
        NativeAdsDto nativeAdsDtoOnNavigationEvent;
        NativeAdsDto.ExtraInfo extraInfoOnTransact;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 1;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(thumbnailBanner, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        asInterface();
        setVisibility(0);
        ICustomTabsCallbackDefault();
        this.onWarmupCompleted = adAsset;
        this.asInterface = thumbnailBanner;
        this.extraCallback = function1;
        this.ICustomTabsCallbackDefault = list;
        this.IAuthTabCallbackStub.clear();
        this.IAuthTabCallbackDefault.clear();
        this.getInterfaceDescriptor = false;
        this.ICustomTabsCallback = false;
        setContentLoadState(false);
        asBinder(thumbnailBanner);
        if (StringsKt.isBlank(thumbnailBanner.IAuthTabCallbackDefault())) {
            int i4 = ICustomTabsCallback_Parcel + 57;
            extraCommand = i4 % 128;
            if (i4 % 2 != 0) {
                TdsSquircleLayoutV1 tdsSquircleLayoutV1 = this.onNavigationEvent.IAuthTabCallback_Parcel;
                Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
                tdsSquircleLayoutV1.setVisibility(100);
            } else {
                TdsSquircleLayoutV1 tdsSquircleLayoutV12 = this.onNavigationEvent.IAuthTabCallback_Parcel;
                Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV12, "");
                tdsSquircleLayoutV12.setVisibility(8);
            }
        } else {
            TdsSquircleLayoutV1 tdsSquircleLayoutV13 = this.onNavigationEvent.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV13, "");
            tdsSquircleLayoutV13.setVisibility(0);
            TdsImageView tdsImageView = this.onNavigationEvent.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            TdsImageView.setImage$default(tdsImageView, thumbnailBanner.IAuthTabCallbackDefault(), (Function1) null, (Function1) null, 6, (Object) null);
        }
        if (thumbnailBanner.asBinder() == null || !(!StringsKt.isBlank(r0))) {
            SubTypography13 subTypography13 = this.onNavigationEvent.access000;
            Intrinsics.checkNotNullExpressionValue(subTypography13, "");
            subTypography13.setVisibility(8);
        } else {
            int i5 = ICustomTabsCallback_Parcel + 3;
            extraCommand = i5 % 128;
            if (i5 % 2 != 0) {
                SubTypography13 subTypography132 = this.onNavigationEvent.access000;
                Intrinsics.checkNotNullExpressionValue(subTypography132, "");
                subTypography132.setVisibility(0);
                this.onNavigationEvent.access000.setText(thumbnailBanner.asBinder());
                if (thumbnailBanner.asBinder().length() > 25) {
                    this.onNavigationEvent.access000.setTextSize(1, 6.0f);
                } else {
                    this.onNavigationEvent.access000.setTextSize(1, 8.0f);
                }
            } else {
                SubTypography13 subTypography133 = this.onNavigationEvent.access000;
                Intrinsics.checkNotNullExpressionValue(subTypography133, "");
                subTypography133.setVisibility(0);
                this.onNavigationEvent.access000.setText(thumbnailBanner.asBinder());
                if (thumbnailBanner.asBinder().length() > 60) {
                }
            }
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub == null || (nativeAdsDtoOnNavigationEvent = nativeAdsManagerIAuthTabCallbackStub.onNavigationEvent(this.onExtraCallback)) == null || (extraInfoOnTransact = nativeAdsDtoOnNavigationEvent.onTransact()) == null || (mediation = extraInfoOnTransact.onNavigationEvent()) == null) {
            mediation = new NativeAdsDto.Mediation((String) null, (List) null, (NativeAdsDto.AdmobInfo) null, (NativeAdsDto.MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
        }
        NativeAdsDto.Mediation mediation2 = mediation;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub2 = IAuthTabCallbackStub();
        Object obj = null;
        if (nativeAdsManagerIAuthTabCallbackStub2 != null) {
            int i6 = ICustomTabsCallback_Parcel + 113;
            extraCommand = i6 % 128;
            if (i6 % 2 != 0) {
                admobInfo2 = (NativeAdsDto.AdmobInfo) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1807668884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1807668884, new Object[]{nativeAdsManagerIAuthTabCallbackStub2, this.onExtraCallback}, nSetPosition.onExtraCallbackWithResult());
                int i7 = 59 / 0;
            } else {
                admobInfo2 = (NativeAdsDto.AdmobInfo) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1807668884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1807668884, new Object[]{nativeAdsManagerIAuthTabCallbackStub2, this.onExtraCallback}, nSetPosition.onExtraCallbackWithResult());
            }
            admobInfo = admobInfo2;
        } else {
            admobInfo = null;
        }
        if (!onWarmupCompleted(mediation2) || admobInfo == null) {
            this.onTransact = false;
            if (((Boolean) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, thumbnailBanner}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 411469487, -411469472, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue()) {
                IAuthTabCallback(this, (String) null, "NO_AD", (AdMobFailedReason) null, (ExposureContent) null, 12, (Object) null);
                extraCommand();
            } else {
                IAuthTabCallback(this, "TOSS", (String) null, (AdMobFailedReason) null, (ExposureContent) null, 14, (Object) null);
                IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, thumbnailBanner}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 455955272, -455955262, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
        } else {
            NativeAdsManager nativeAdsManagerIAuthTabCallbackStub3 = IAuthTabCallbackStub();
            if (nativeAdsManagerIAuthTabCallbackStub3 != null) {
                int i8 = extraCommand + 17;
                ICustomTabsCallback_Parcel = i8 % 128;
                if (i8 % 2 == 0) {
                    nativeAdsManagerIAuthTabCallbackStub3.onWarmupCompleted(this.onExtraCallback);
                    obj.hashCode();
                    throw null;
                }
                nativeAdsThumbnailAdMobViewOnWarmupCompleted = nativeAdsManagerIAuthTabCallbackStub3.onWarmupCompleted(this.onExtraCallback);
            } else {
                nativeAdsThumbnailAdMobViewOnWarmupCompleted = null;
            }
            if (nativeAdsThumbnailAdMobViewOnWarmupCompleted != null) {
                onWarmupCompleted(nativeAdsThumbnailAdMobViewOnWarmupCompleted);
                ICustomTabsCallbackStubProxy();
                ICustomTabsService();
            } else {
                this.onTransact = false;
                IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1538053000, 1538053004, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                getScaleX interfaceDescriptor = getInterfaceDescriptor();
                String str = this.onExtraCallback;
                NativeAdsManager nativeAdsManagerIAuthTabCallbackStub4 = IAuthTabCallbackStub();
                if (nativeAdsManagerIAuthTabCallbackStub4 != null) {
                    int i9 = ICustomTabsCallback_Parcel + 53;
                    extraCommand = i9 % 128;
                    int i10 = i9 % 2;
                    if (nativeAdsManagerIAuthTabCallbackStub4.IAuthTabCallback()) {
                        int i11 = extraCommand + 49;
                        ICustomTabsCallback_Parcel = i11 % 128;
                        int i12 = i11 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    interfaceDescriptor.onExtraCallback(str, admobInfo, mediation2, z, new IAuthTabCallback(thumbnailBanner, function0));
                }
            }
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(this.onNavigationEvent.IAuthTabCallback_Parcel, "2500");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(this.onNavigationEvent.extraCallbackWithResult, "1000");
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(this.onNavigationEvent.ICustomTabsCallback, "1002");
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(this.onNavigationEvent.onTransact, "2005");
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(this.onNavigationEvent.access100, "3002");
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(this.onNavigationEvent.getInterfaceDescriptor, "3002");
        Typography7 typography7 = this.onNavigationEvent.IAuthTabCallback;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127}, 127 - TextUtils.getCapsMode("", 0, 0), objArr);
        this.ICustomTabsCallbackStubProxy = getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback(typography7, ((String) objArr[0]).intern())}));
    }

    public final void setContentLoadState(boolean z) {
        ConstraintLayout constraintLayout;
        int i;
        int i2 = 2 % 2;
        this.IAuthTabCallback_Parcel = z;
        IAuthTabCallbackStubProxy().setContentLoadState(z);
        if (z) {
            onWarmupCompleted(this.asBinder);
            ExoPlayer exoPlayer = this.onMessageChannelReady;
            if (exoPlayer != null) {
                int i3 = ICustomTabsCallback_Parcel + 41;
                extraCommand = i3 % 128;
                int i4 = i3 % 2;
                exoPlayer.pause();
            }
            ConstraintLayout constraintLayout2 = this.onNavigationEvent.asBinder;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            int i5 = ICustomTabsCallback_Parcel + 103;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
        } else if (this.asInterface != null) {
            int i7 = ICustomTabsCallback_Parcel + 11;
            extraCommand = i7 % 128;
            if (i7 % 2 != 0) {
                constraintLayout = this.onNavigationEvent.asBinder;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                i = 67;
            } else {
                constraintLayout = this.onNavigationEvent.asBinder;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                i = 8;
            }
            constraintLayout.setVisibility(i);
        }
        ICustomTabsService();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        ViewGroup viewGroup;
        int i = 2 % 2;
        ViewParent parent = nativeAdsThumbnailAdMobView.getParent();
        if (parent instanceof ViewGroup) {
            int i2 = ICustomTabsCallback_Parcel + 45;
            extraCommand = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup = (ViewGroup) parent;
                int i3 = 1 / 0;
            } else {
                viewGroup = (ViewGroup) parent;
            }
        } else {
            int i4 = ICustomTabsCallback_Parcel + 1;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(nativeAdsThumbnailAdMobView);
        }
        ConstraintLayout constraintLayout = this.onNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        ViewGroup.LayoutParams onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, 0);
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult).IPostMessageServiceStubProxy = 0;
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult).IAuthTabCallback = 0;
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult).ITrustedWebActivityCallback = 0;
        ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult).ICustomTabsCallback = 0;
        View view = this.onNavigationEvent.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(view, "");
        ((ViewGroup) view).addView((View) nativeAdsThumbnailAdMobView, onextracallbackwithresult);
        this.onExtraCallbackWithResult = nativeAdsThumbnailAdMobView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView] */
    private final void IAuthTabCallbackDefault() {
        ViewGroup viewGroup;
        int i = 2 % 2;
        ?? r1 = this.onExtraCallbackWithResult;
        if (r1 == 0) {
            return;
        }
        r1.setVisibleRatio(0.0d);
        r1.setOnViewVisible(false);
        ViewParent parent = r1.getParent();
        if (!(!(parent instanceof ViewGroup))) {
            int i2 = extraCommand + 75;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = 0;
        }
        if (viewGroup != 0) {
            int i4 = ICustomTabsCallback_Parcel + 5;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.removeView(r1);
        }
        this.onExtraCallbackWithResult = null;
    }

    private static final Unit onNavigationEvent(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAd nativeAd, NativeAd nativeAd2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 3;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAd2, "");
            Object[] objArr = {nativeAdsThumbnailVideoV2View, "IMP", ExposureContent.Companion.onExtraCallback(nativeAd)};
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, 770986742, -770986724, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAd2, "");
        Object[] objArr2 = {nativeAdsThumbnailVideoV2View, "IMP", ExposureContent.Companion.onExtraCallback(nativeAd)};
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, 770986742, -770986724, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        Unit unit2 = Unit.INSTANCE;
        int i3 = extraCommand + 97;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private final void IAuthTabCallback(NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        ICustomTabsCallbackStubProxy();
        IAuthTabCallbackStubProxy().onExtraCallbackWithResult(nativeAd, (Function1<? super NativeAd, Unit>) new NativeAdsThumbnailVideoV2View$.ExternalSyntheticLambda0(this, nativeAd));
        ICustomTabsService();
        int i2 = extraCommand + 87;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onNavigationEvent() {
        int i = 2 % 2;
        this.access000 = true;
        ExoPlayer exoPlayer = this.onMessageChannelReady;
        if (exoPlayer != null) {
            int i2 = ICustomTabsCallback_Parcel + 27;
            extraCommand = i2 % 128;
            if (i2 % 2 != 0) {
                exoPlayer.pause();
                int i3 = 8 / 0;
            } else {
                exoPlayer.pause();
            }
        }
        IAuthTabCallbackStubProxy().setOnViewVisible(false);
        int i4 = extraCommand + 113;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 3;
        extraCommand = i2 % 128;
        this.access000 = i2 % 2 != 0;
        ICustomTabsService();
        int i3 = ICustomTabsCallback_Parcel + 13;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService();
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback_Parcel + 33;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.IAuthTabCallback_Parcel = false;
        ConstraintLayout constraintLayout = nativeAdsThumbnailVideoV2View.onNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        nativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy().setContentLoadState(false);
        nativeAdsThumbnailVideoV2View.setContentLoadState(false);
        int i4 = ICustomTabsCallback_Parcel + 3;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View, java.lang.Object] */
    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        ?? r1 = (NativeAdsThumbnailVideoV2View) objArr[0];
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 63;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        r1.setVisibility(0);
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{r1}, iOnWarmupCompleted, -658170630, 658170639, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        r1.IAuthTabCallbackStubProxy().setVisibility(8);
        r1.asBinder(thumbnailBanner);
        int i4 = onWarmupCompleted.onExtraCallback[r1.IAuthTabCallback(thumbnailBanner).ordinal()];
        if (i4 == 1) {
            r1.onWarmupCompleted(((NativeAdsThumbnailVideoV2View) r1).IAuthTabCallbackStubProxy);
            TdsImageView tdsImageView = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(0);
            StyledPlayerView styledPlayerView = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
            styledPlayerView.setVisibility(8);
            TdsImageView tdsImageView2 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.access100;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            tdsImageView2.setVisibility(8);
            TdsImageView tdsImageView3 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            TdsImageView.setImage$default(tdsImageView3, thumbnailBanner.onTransact(), (Function1) null, (Function1) null, 6, (Object) null);
            Typography7 typography7 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(typography7, "");
            typography7.setVisibility(0);
            ConstraintLayout constraintLayoutOnNavigationEvent = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
            constraintLayoutOnNavigationEvent.setVisibility(8);
            FrameLayout frameLayout = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            int i5 = ICustomTabsCallback_Parcel + 41;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = extraCommand + 113;
            int i8 = i7 % 128;
            ICustomTabsCallback_Parcel = i8;
            int i9 = i7 % 2;
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i10 = i8 + 69;
            extraCommand = i10 % 128;
            int i11 = i10 % 2;
            r1.onWarmupCompleted(((NativeAdsThumbnailVideoV2View) r1).asBinder);
            TdsImageView tdsImageView4 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
            tdsImageView4.setVisibility(8);
            StyledPlayerView styledPlayerView2 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(styledPlayerView2, "");
            styledPlayerView2.setVisibility(0);
            TdsImageView tdsImageView5 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.access100;
            Intrinsics.checkNotNullExpressionValue(tdsImageView5, "");
            tdsImageView5.setVisibility(0);
            TdsImageView tdsImageView6 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.access100;
            Intrinsics.checkNotNullExpressionValue(tdsImageView6, "");
            String strAccess100 = thumbnailBanner.access100();
            if (strAccess100 == null) {
                strAccess100 = thumbnailBanner.onTransact();
            }
            TdsImageView.setImage$default(tdsImageView6, strAccess100, (Function1) null, (Function1) null, 6, (Object) null);
            Typography7 typography72 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(typography72, "");
            typography72.setVisibility(0);
            ConstraintLayout constraintLayoutOnNavigationEvent2 = ((NativeAdsThumbnailVideoV2View) r1).onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent2, "");
            constraintLayoutOnNavigationEvent2.setVisibility(0);
            r1.onNavigationEvent(false);
            r1.onWarmupCompleted(thumbnailBanner);
            r1.extraCallback();
        }
        r1.ICustomTabsService();
        return null;
    }

    private final NativeAdsDto.ThumbnailBannerContentType IAuthTabCallback(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = extraCommand + 81;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (!StringsKt.isBlank(thumbnailBanner.getInterfaceDescriptor())) {
            int i4 = ICustomTabsCallback_Parcel + 79;
            extraCommand = i4 % 128;
            if (i4 % 2 == 0) {
                return NativeAdsDto.ThumbnailBannerContentType.VIDEO;
            }
            NativeAdsDto.ThumbnailBannerContentType thumbnailBannerContentType = NativeAdsDto.ThumbnailBannerContentType.VIDEO;
            throw null;
        }
        return NativeAdsDto.ThumbnailBannerContentType.IMAGE;
    }

    private final void asBinder(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        if (IAuthTabCallback(thumbnailBanner) == NativeAdsDto.ThumbnailBannerContentType.IMAGE) {
            int i3 = ICustomTabsCallback_Parcel + 77;
            int i4 = i3 % 128;
            extraCommand = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 51;
            ICustomTabsCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        SubTypography8 subTypography8 = this.onNavigationEvent.extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(subTypography8, "");
        if (!z) {
            i = 8;
        } else {
            int i8 = ICustomTabsCallback_Parcel + 71;
            extraCommand = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        subTypography8.setVisibility(i);
        Typography7 typography7 = this.onNavigationEvent.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        typography7.setVisibility(z ? 0 : 8);
        if (z) {
            this.onNavigationEvent.extraCallbackWithResult.setText(thumbnailBanner.asInterface());
            this.onNavigationEvent.ICustomTabsCallback.setText(thumbnailBanner.IAuthTabCallbackStub());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Object obj = null;
        if (layoutParams == null) {
            int i2 = extraCommand + 77;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(str);
                return;
            } else {
                IAuthTabCallback(str);
                obj.hashCode();
                throw null;
            }
        }
        int height = getHeight();
        if (getMeasuredWidth() <= 0 || height <= 0 || !Intrinsics.areEqual(str, this.IAuthTabCallbackStubProxy)) {
            Rally rally = this.access100;
            if (rally != null) {
                int i3 = extraCommand + 107;
                ICustomTabsCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                rally.ICustomTabsServiceStub();
            }
            layoutParams.height = -2;
            setLayoutParams(layoutParams);
            IAuthTabCallback(str);
            return;
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new asBinder(this, this, str, height));
            return;
        }
        float measuredWidth = getMeasuredWidth() / 1.91f;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = height;
            int i5 = ICustomTabsCallback_Parcel + 13;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
        } else {
            layoutParams2 = null;
        }
        setLayoutParams(layoutParams2);
        onNavigationEvent(this, str);
        Rally rallyIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(this);
        if (rallyIAuthTabCallback_Parcel != null) {
            int i7 = extraCommand + 81;
            ICustomTabsCallback_Parcel = i7 % 128;
            if (i7 % 2 == 0) {
                rallyIAuthTabCallback_Parcel.ICustomTabsServiceStub();
                int i8 = 49 / 0;
            } else {
                rallyIAuthTabCallback_Parcel.ICustomTabsServiceStub();
            }
        }
        Object[] objArr = {(Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1685808947, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(height), Integer.valueOf((int) measuredWidth), null, 4, null}, 1685808950, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new IAuthTabCallbackDefault(), 1, null};
        onExtraCallbackWithResult(this, isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 2128644226), false, 1, (Object) null));
    }

    static final class IAuthTabCallbackDefault implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        IAuthTabCallbackDefault() {
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 67 / 0;
            }
            return unit;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TdsRoundLayout tdsRoundLayout = NativeAdsThumbnailVideoV2View.this;
            ViewGroup.LayoutParams layoutParams = tdsRoundLayout.getLayoutParams();
            if (layoutParams != null) {
                int i4 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                layoutParams.height = -2;
            } else {
                layoutParams = null;
            }
            tdsRoundLayout.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.IAuthTabCallback_Parcel, r6) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.IAuthTabCallback_Parcel, r6) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r1.IAuthTabCallback_Parcel = r6;
        r5.onNavigationEvent.IAuthTabCallbackDefault.setLayoutParams(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(String str) {
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 45;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout.onExtraCallbackWithResult layoutParams = this.onNavigationEvent.IAuthTabCallbackDefault.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.onExtraCallbackWithResult) {
            int i4 = extraCommand + 55;
            ICustomTabsCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            onextracallbackwithresult = layoutParams;
        } else {
            onextracallbackwithresult = null;
        }
        if (onextracallbackwithresult != null) {
            int i5 = ICustomTabsCallback_Parcel + 53;
            extraCommand = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
        }
        int i7 = extraCommand + 77;
        ICustomTabsCallback_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements AnalyticsListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ NativeAdsDto.Creative.ThumbnailBanner IAuthTabCallback;
        final /* synthetic */ String onWarmupCompleted;

        onExtraCallbackWithResult(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, String str) {
            this.IAuthTabCallback = thumbnailBanner;
            this.onWarmupCompleted = str;
        }

        public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(eventTime, "");
                Intrinsics.checkNotNullParameter(playbackException, "");
                NativeAdsThumbnailVideoV2View.onNavigationEvent(NativeAdsThumbnailVideoV2View.this, this.IAuthTabCallback, this.onWarmupCompleted, playbackException);
                int i3 = 77 / 0;
            } else {
                Intrinsics.checkNotNullParameter(eventTime, "");
                Intrinsics.checkNotNullParameter(playbackException, "");
                NativeAdsThumbnailVideoV2View.onNavigationEvent(NativeAdsThumbnailVideoV2View.this, this.IAuthTabCallback, this.onWarmupCompleted, playbackException);
            }
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) throws Throwable {
        String string;
        MediaItem.LocalConfiguration localConfiguration;
        int i = 2 % 2;
        String interfaceDescriptor = thumbnailBanner.getInterfaceDescriptor();
        if (!(!StringsKt.isBlank(interfaceDescriptor))) {
            int i2 = ICustomTabsCallback_Parcel + 1;
            extraCommand = i2 % 128;
            if (i2 % 2 != 0) {
                thumbnailBanner.onTransact();
                throw null;
            }
            interfaceDescriptor = thumbnailBanner.onTransact();
        }
        ExoPlayer exoPlayerIAuthTabCallback = this.onMessageChannelReady;
        if (exoPlayerIAuthTabCallback == null) {
            CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, (String) null, new DefaultLoadControl.Builder().setPrioritizeTimeOverSizeThresholds(true).setBufferDurationsMs(2500, 5000, 2500, 2500).build(), (Function1) null, (Function1) null, 26, (Object) null);
            this.onMessageChannelReady = exoPlayerIAuthTabCallback;
            this.onNavigationEvent.getInterfaceDescriptor.setPlayer(exoPlayerIAuthTabCallback);
            exoPlayerIAuthTabCallback.addListener(this.onPostMessage);
        }
        exoPlayerIAuthTabCallback.setVolume(0.0f);
        onWarmupCompleted(true);
        MediaItem currentMediaItem = exoPlayerIAuthTabCallback.getCurrentMediaItem();
        if (currentMediaItem == null || (localConfiguration = currentMediaItem.localConfiguration) == null) {
            string = null;
        } else {
            int i3 = extraCommand + 85;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            Uri uri = localConfiguration.uri;
            if (uri != null) {
                string = uri.toString();
            }
        }
        if (Intrinsics.areEqual(string, interfaceDescriptor)) {
            int i5 = extraCommand + 69;
            ICustomTabsCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            CommonModule_setSecureScreen commonModule_setSecureScreen2 = CommonModule_setSecureScreen.onWarmupCompleted;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen2, exoPlayerIAuthTabCallback, context2, interfaceDescriptor, false, new onExtraCallbackWithResult(thumbnailBanner, interfaceDescriptor), 4, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            exoPlayerIAuthTabCallback.prepare();
        }
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Typography5 typography5 = this.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallbackDefault;
            obj.hashCode();
            throw null;
        }
        this.onNavigationEvent.onExtraCallbackWithResult.IAuthTabCallbackDefault.setText(z ^ true ? im.toss.ads_sdk.R.string.ads_sdk_continue_play : im.toss.ads_sdk.R.string.ads_sdk_continue_replay);
        int i3 = ICustomTabsCallback_Parcel + 55;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, String str, PlaybackException playbackException) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 1;
        extraCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(str);
            if (strOnExtraCallbackWithResult == null) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String str2 = "benefit_thumbnailBanner_playback_failed on " + IAuthTabCallback();
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("ad_id", thumbnailBanner.IAuthTabCallback());
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-124, -125, -126}, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                convertFloatArrayToByteArray.onExtraCallbackWithResult(str2, (String) null, (Throwable) playbackException, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), thumbnailBanner.onTransact()), getWrite.IAuthTabCallback("thumbnail_url", thumbnailBanner.access100())}));
                isEngagementSignalsApiAvailable();
                ExoPlayer exoPlayer = this.onMessageChannelReady;
                if (exoPlayer != null) {
                    exoPlayer.removeListener(this.onPostMessage);
                }
                ExoPlayer exoPlayer2 = this.onMessageChannelReady;
                if (exoPlayer2 != null) {
                    exoPlayer2.release();
                }
                this.onMessageChannelReady = null;
                this.onNavigationEvent.getInterfaceDescriptor.setPlayer((Player) null);
                NativeAdsDto.Creative.ThumbnailBanner thumbnailBannerOnExtraCallback = NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback(thumbnailBanner, null, null, null, "", null, null, null, null, null, 503, null);
                this.asInterface = thumbnailBannerOnExtraCallback;
                onExtraCallback(thumbnailBannerOnExtraCallback);
                return;
            }
            int i3 = ICustomTabsCallback_Parcel + 17;
            extraCommand = i3 % 128;
            if (i3 % 2 != 0) {
                NativeAdsDto.Creative.ThumbnailBanner thumbnailBannerOnExtraCallback2 = NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback(thumbnailBanner, null, null, null, strOnExtraCallbackWithResult, null, null, null, null, null, 26541, null);
                this.asInterface = thumbnailBannerOnExtraCallback2;
                IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, thumbnailBannerOnExtraCallback2}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 455955272, -455955262, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                return;
            }
            NativeAdsDto.Creative.ThumbnailBanner thumbnailBannerOnExtraCallback3 = NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback(thumbnailBanner, null, null, null, strOnExtraCallbackWithResult, null, null, null, null, null, 503, null);
            this.asInterface = thumbnailBannerOnExtraCallback3;
            IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, thumbnailBannerOnExtraCallback3}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 455955272, -455955262, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            return;
        }
        endRearDisplayPresentationSession.onExtraCallbackWithResult(str);
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = NativeAdsThumbnailVideoV2View.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 17;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 13 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 43;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                Object[] objArr = {NativeAdsThumbnailVideoV2View.this};
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, 980821090, -980821089, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                unit = Unit.INSTANCE;
                int i7 = 49 / 0;
            } else {
                Object[] objArr2 = {NativeAdsThumbnailVideoV2View.this};
                int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, 980821090, -980821089, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                unit = Unit.INSTANCE;
            }
            int i8 = onExtraCallback + 21;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    private final void extraCallback() {
        int i = 2 % 2;
        Object obj = null;
        onNavigationEvent(new onNavigationEvent(null));
        int i2 = extraCommand + 79;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsService() {
        int i = 2 % 2;
        boolean z = false;
        if (this.access000 || this.IAuthTabCallback_Parcel) {
            ExoPlayer exoPlayer = this.onMessageChannelReady;
            if (exoPlayer != null) {
                exoPlayer.pause();
            }
            IAuthTabCallbackStubProxy().setOnViewVisible(false);
            return;
        }
        if (this.onTransact) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            double dDoubleValue = ((Double) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 33340620, -33340601, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).doubleValue();
            IAuthTabCallbackStubProxy().setVisibleRatio(dDoubleValue);
            NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobViewIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            if (dDoubleValue > 0.5d) {
                int i2 = ICustomTabsCallback_Parcel + 43;
                extraCommand = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            }
            nativeAdsThumbnailAdMobViewIAuthTabCallbackStubProxy.setOnViewVisible(z);
            return;
        }
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = this.asInterface;
        if (thumbnailBanner == null || IAuthTabCallback(thumbnailBanner) == NativeAdsDto.ThumbnailBannerContentType.IMAGE) {
            return;
        }
        int i4 = extraCommand + 101;
        int i5 = i4 % 128;
        ICustomTabsCallback_Parcel = i5;
        int i6 = i4 % 2;
        ExoPlayer exoPlayer2 = this.onMessageChannelReady;
        if (exoPlayer2 != null) {
            if (this.readTypedObject) {
                int i7 = i5 + 9;
                extraCommand = i7 % 128;
                int i8 = i7 % 2;
                exoPlayer2.pause();
                return;
            }
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            if (((Double) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, 33340620, -33340601, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).doubleValue() <= 0.5d) {
                this.ICustomTabsCallback = false;
                if (exoPlayer2.isPlaying()) {
                    exoPlayer2.pause();
                    return;
                }
                return;
            }
            if (this.ICustomTabsCallback) {
                return;
            }
            int i9 = extraCommand + 19;
            ICustomTabsCallback_Parcel = i9 % 128;
            if (i9 % 2 == 0) {
                exoPlayer2.isPlaying();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if ((!exoPlayer2.isPlaying()) && exoPlayer2.getPlaybackState() != 4) {
                int i10 = ICustomTabsCallback_Parcel + 9;
                extraCommand = i10 % 128;
                if (i10 % 2 != 0) {
                    exoPlayer2.setPlayWhenReady(true);
                    exoPlayer2.play();
                } else {
                    exoPlayer2.setPlayWhenReady(true);
                    exoPlayer2.play();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View, im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View, im.toss.ads_sdk.ui.view.NativeAdsContainerView, java.lang.Object] */
    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        ?? r9 = (NativeAdsThumbnailVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 101;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{r9, r9}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2110659423, 2110659437, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (recyclerView == null) {
            if (!r9.onExtraCallbackWithResult(r9)) {
                return Double.valueOf(0.0d);
            }
            int i3 = ICustomTabsCallback_Parcel + 113;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            return Double.valueOf(1.0d);
        }
        Rect rect = new Rect();
        recyclerView.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        r9.getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        if (!rect3.setIntersect(rect, rect2)) {
            int i5 = ICustomTabsCallback_Parcel + 103;
            extraCommand = i5 % 128;
            return i5 % 2 != 0 ? Double.valueOf(1.0d) : Double.valueOf(0.0d);
        }
        int iWidth = rect3.width();
        int iHeight = rect3.height();
        int width = r9.getWidth() * r9.getHeight();
        return width <= 0 ? Double.valueOf(0.0d) : Double.valueOf((iWidth * iHeight) / width);
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        ViewParent parent;
        View view = (View) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (view != null) {
            int i2 = ICustomTabsCallback_Parcel + 9;
            extraCommand = i2 % 128;
            if (i2 % 2 != 0) {
                view.getParent();
                obj.hashCode();
                throw null;
            }
            parent = view.getParent();
        } else {
            int i3 = extraCommand + 27;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            parent = null;
        }
        while (parent != null) {
            int i5 = extraCommand + 31;
            ICustomTabsCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if (parent instanceof RecyclerView) {
                break;
            }
            parent = parent.getParent();
            int i7 = extraCommand + 41;
            ICustomTabsCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        if (!(parent instanceof RecyclerView)) {
            return null;
        }
        int i9 = extraCommand + 29;
        ICustomTabsCallback_Parcel = i9 % 128;
        if (i9 % 2 != 0) {
            return (RecyclerView) parent;
        }
        throw null;
    }

    private final void ICustomTabsCallback_Parcel() {
        ExoPlayer exoPlayer;
        int i = 2 % 2;
        int i2 = extraCommand + 79;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getPackageType getpackagetype = this.ICustomTabsCallbackStub;
        if ((getpackagetype == null || !getpackagetype.onExtraCallback()) && (exoPlayer = this.onMessageChannelReady) != null) {
            this.ICustomTabsCallbackStub = onNavigationEvent(new onTransact(exoPlayer, this, null));
            int i3 = extraCommand + 115;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 81 / 0;
            }
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ExoPlayer $player;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NativeAdsThumbnailVideoV2View this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(ExoPlayer exoPlayer, NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$player = exoPlayer;
            this.this$0 = nativeAdsThumbnailVideoV2View;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$player, this.this$0, access13800Var);
            ontransact.L$0 = obj;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return ontransact;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:14:0x003f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function1 function1Access100;
            Function1 function1Access1002;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (findRes.onWarmupCompleted(findresandmsg)) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Long lOnExtraCallback = access14000.onExtraCallback(this.$player.getDuration());
                Object obj2 = null;
                if (lOnExtraCallback.longValue() <= 0) {
                    lOnExtraCallback = null;
                }
                if (lOnExtraCallback != null) {
                    long jLongValue = lOnExtraCallback.longValue();
                    long currentPosition = this.$player.getCurrentPosition();
                    NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this.this$0, Long.valueOf(currentPosition)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1981278358, -1981278346, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    long j = currentPosition / 1000;
                    long j2 = (long) ((currentPosition / jLongValue) * 100.0d);
                    List<NativeAdsEventLogType> listExtraCallback = NativeAdsThumbnailVideoV2View.extraCallback(this.this$0);
                    NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = this.this$0;
                    for (NativeAdsEventLogType nativeAdsEventLogType : listExtraCallback) {
                        int i5 = onWarmupCompleted + 81;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult) {
                            NativeAdsEventLogType.extraCallbackWithResult extracallbackwithresult = (NativeAdsEventLogType.extraCallbackWithResult) nativeAdsEventLogType;
                            if (j >= extracallbackwithresult.onExtraCallbackWithResult() && NativeAdsThumbnailVideoV2View.access000(nativeAdsThumbnailVideoV2View).add(access14000.onExtraCallback(extracallbackwithresult.onExtraCallbackWithResult())) && (function1Access100 = NativeAdsThumbnailVideoV2View.access100(nativeAdsThumbnailVideoV2View)) != null) {
                                int i7 = IAuthTabCallback + 45;
                                onWarmupCompleted = i7 % 128;
                                int i8 = i7 % 2;
                                function1Access100.invoke(nativeAdsEventLogType);
                            }
                        } else if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback) {
                            NativeAdsEventLogType.extraCallback extracallback = (NativeAdsEventLogType.extraCallback) nativeAdsEventLogType;
                            if (j2 >= extracallback.IAuthTabCallback() && NativeAdsThumbnailVideoV2View.getInterfaceDescriptor(nativeAdsThumbnailVideoV2View).add(access14000.onExtraCallback(extracallback.IAuthTabCallback())) && (function1Access1002 = NativeAdsThumbnailVideoV2View.access100(nativeAdsThumbnailVideoV2View)) != null) {
                                int i9 = IAuthTabCallback + 51;
                                onWarmupCompleted = i9 % 128;
                                if (i9 % 2 != 0) {
                                    function1Access1002.invoke(nativeAdsEventLogType);
                                    obj2.hashCode();
                                    throw null;
                                }
                                function1Access1002.invoke(nativeAdsEventLogType);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (findRes.onWarmupCompleted(findresandmsg)) {
                    this.L$0 = findresandmsg;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(250L, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    Long lOnExtraCallback2 = access14000.onExtraCallback(this.$player.getDuration());
                    Object obj22 = null;
                    if (lOnExtraCallback2.longValue() <= 0) {
                    }
                    if (lOnExtraCallback2 != null) {
                    }
                    if (findRes.onWarmupCompleted(findresandmsg)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        getPackageType getpackagetype = this.ICustomTabsCallbackStub;
        if (getpackagetype != null) {
            int i2 = extraCommand + 5;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.ICustomTabsCallbackStub = null;
        int i3 = extraCommand + 83;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 71;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        if (!nativeAdsThumbnailVideoV2View.getInterfaceDescriptor && jLongValue >= 2000) {
            int i5 = i3 + 13;
            ICustomTabsCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            List<? extends NativeAdsEventLogType> list = nativeAdsThumbnailVideoV2View.ICustomTabsCallbackDefault;
            if ((list instanceof Collection) && list.isEmpty()) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NativeAdsEventLogType) it.next()) instanceof NativeAdsEventLogType.access100) {
                    int i7 = extraCommand + 77;
                    ICustomTabsCallback_Parcel = i7 % 128;
                    int i8 = i7 % 2;
                    nativeAdsThumbnailVideoV2View.getInterfaceDescriptor = true;
                    Function1<? super NativeAdsEventLogType, Unit> function1 = nativeAdsThumbnailVideoV2View.extraCallback;
                    if (function1 != null) {
                        function1.invoke(NativeAdsEventLogType.access100.onExtraCallbackWithResult);
                    }
                }
            }
        }
        return null;
    }

    private final void IAuthTabCallback_Parcel() {
        Function1<? super NativeAdsEventLogType, Unit> function1;
        int i = 2 % 2;
        List<? extends NativeAdsEventLogType> list = this.ICustomTabsCallbackDefault;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        int i2 = ICustomTabsCallback_Parcel + 125;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        for (NativeAdsEventLogType nativeAdsEventLogType : list) {
            int i4 = ICustomTabsCallback_Parcel + 9;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            if ((nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback) && ((NativeAdsEventLogType.extraCallback) nativeAdsEventLogType).IAuthTabCallback() == 100) {
                if (!this.IAuthTabCallbackDefault.add(100L) || (function1 = this.extraCallback) == null) {
                    return;
                }
                function1.invoke(new NativeAdsEventLogType.extraCallback(100L));
                return;
            }
        }
    }

    private final void onWarmupCompleted(boolean z) throws Throwable {
        String strIntern;
        Object obj;
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = this.onNavigationEvent.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        TdsImageView tdsImageView = this.onNavigationEvent.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        if (z) {
            int i4 = ICustomTabsCallback_Parcel + 61;
            extraCommand = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-110, -111, -121, -114, -102, -122, -116, -123, -103, -107, -104, -107, -113, -111, -113, -112, -107, -105, -105, -113, -107, -106, -111, -126, -113, -120, -107, -111, -113, -115, -116, -118, -108, -109, -118, -110, -111, -121, -118, -120, -111, -113, -115, -116, -118, -112, -116, -114, -120, -120, -113, -122, -114, -115, -116, -122, -117, -122, -120, -118, -118, -119, -120, -121, -122, -122, -123}, TextUtils.indexOf((CharSequence) "", '.') * 46, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-110, -111, -121, -114, -102, -122, -116, -123, -103, -107, -104, -107, -113, -111, -113, -112, -107, -105, -105, -113, -107, -106, -111, -126, -113, -120, -107, -111, -113, -115, -116, -118, -108, -109, -118, -110, -111, -121, -118, -120, -111, -113, -115, -116, -118, -112, -116, -114, -120, -120, -113, -122, -114, -115, -116, -122, -117, -122, -120, -118, -118, -119, -120, -121, -122, -122, -123}, 126 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
                obj = objArr2[0];
            }
            strIntern = ((String) obj).intern();
        } else {
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-110, -111, -121, -114, -102, -122, -116, -123, -103, -107, -104, -107, -113, -111, -113, -112, -107, -111, -113, -107, -106, -111, -126, -113, -120, -107, -111, -113, -115, -116, -118, -108, -109, -118, -110, -111, -121, -118, -120, -111, -113, -115, -116, -118, -112, -116, -114, -120, -120, -113, -122, -114, -115, -116, -122, -117, -122, -120, -118, -118, -119, -120, -121, -122, -122, -123}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            int i5 = ICustomTabsCallback_Parcel + 79;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
        }
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
    }

    private final void onExtraCallbackWithResult(String str) throws Throwable {
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        final NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = this.asInterface;
        if (thumbnailBanner != null) {
            int i5 = i3 + 113;
            extraCommand = i5 % 128;
            if (i5 % 2 != 0) {
                adAsset = this.onWarmupCompleted;
                int i6 = 71 / 0;
                if (adAsset == null) {
                    return;
                }
            } else {
                adAsset = this.onWarmupCompleted;
                if (adAsset == null) {
                    return;
                }
            }
            getFillAlpha.onWarmupCompleted(IAuthTabCallbackStub(), this.onExtraCallback, adAsset, str != null ? new NativeAdsEventLogType.onExtraCallback(str) : null, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda21
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 51;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = this.f$0;
                    if (i9 == 0) {
                        return NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(nativeAdsThumbnailVideoV2View, thumbnailBanner);
                    }
                    int i10 = 50 / 0;
                    return NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(nativeAdsThumbnailVideoV2View, thumbnailBanner);
                }
            }, 56, null);
            int i7 = extraCommand + 25;
            ICustomTabsCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 79;
        extraCommand = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Result.Companion companion = Result.Companion;
                getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
                Context context = nativeAdsThumbnailVideoV2View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                getStrokeWidth.IAuthTabCallback(getstrokewidth, context, thumbnailBanner.onWarmupCompleted(), 0, 2, null);
                unit = Unit.INSTANCE;
            } else {
                Result.Companion companion2 = Result.Companion;
                getStrokeWidth getstrokewidth2 = getStrokeWidth.onExtraCallback;
                Context context2 = nativeAdsThumbnailVideoV2View.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                getStrokeWidth.IAuthTabCallback(getstrokewidth2, context2, thumbnailBanner.onWarmupCompleted(), 0, 2, null);
                unit = Unit.INSTANCE;
            }
            Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallback_Parcel + 73;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        String str = (String) objArr[1];
        ExposureContent exposureContent = (ExposureContent) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = extraCommand + 97;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        if (i2 % 2 != 0 ? (iIntValue & 2) != 0 : (iIntValue & 5) != 0) {
            int i4 = i3 + 43;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            exposureContent = null;
        }
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{nativeAdsThumbnailVideoV2View, str, exposureContent}, iOnWarmupCompleted, 770986742, -770986724, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        return null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        String str = (String) objArr[1];
        ExposureContent exposureContent = (ExposureContent) objArr[2];
        int i = 2 % 2;
        int i2 = extraCommand + 65;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = nativeAdsThumbnailVideoV2View.IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub == null) {
            return null;
        }
        int i4 = extraCommand + 57;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        nativeAdsManagerIAuthTabCallbackStub.onWarmupCompleted(nativeAdsThumbnailVideoV2View.onExtraCallback, str, exposureContent);
        return null;
    }

    static /* synthetic */ void IAuthTabCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, String str, String str2, AdMobFailedReason adMobFailedReason, ExposureContent exposureContent, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i3 = ICustomTabsCallback_Parcel + 17;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            adMobFailedReason = null;
        }
        if ((i & 8) != 0) {
            exposureContent = null;
        }
        nativeAdsThumbnailVideoV2View.onWarmupCompleted(str, str2, adMobFailedReason, exposureContent);
        int i5 = extraCommand + 115;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(String str, String str2, AdMobFailedReason adMobFailedReason, ExposureContent exposureContent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 37;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            throw null;
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub != null) {
            int i3 = extraCommand + 61;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                nativeAdsManagerIAuthTabCallbackStub.onExtraCallback(this.onExtraCallback, str, str2, adMobFailedReason, exposureContent);
                int i4 = 73 / 0;
            } else {
                nativeAdsManagerIAuthTabCallbackStub.onExtraCallback(this.onExtraCallback, str, str2, adMobFailedReason, exposureContent);
            }
        }
    }

    private final boolean onWarmupCompleted(NativeAdsDto.Mediation mediation) {
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
            next = it.next();
            String str = (String) next;
            if (Intrinsics.areEqual(str, "ADMOB") || Intrinsics.areEqual(str, "TOSS")) {
                break;
            }
        }
        if (!Intrinsics.areEqual(next, "ADMOB")) {
            return false;
        }
        int i2 = ICustomTabsCallback_Parcel + 119;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediation.onExtraCallbackWithResult();
        if (admobInfoOnExtraCallbackWithResult != null) {
            admobAdFormat = (AdmobAdFormat) NativeAdsDto.AdmobInfo.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{admobInfoOnExtraCallbackWithResult}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1779197038);
        }
        if (admobAdFormat != AdmobAdFormat.NATIVE) {
            return false;
        }
        int i4 = extraCommand + 37;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final void ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCommand + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted, -658170630, 658170639, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        onWarmupCompleted(this.asBinder);
        this.onTransact = true;
        TdsImageView tdsImageView = this.onNavigationEvent.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        StyledPlayerView styledPlayerView = this.onNavigationEvent.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
        styledPlayerView.setVisibility(8);
        TdsImageView tdsImageView2 = this.onNavigationEvent.access100;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        tdsImageView2.setVisibility(8);
        Typography7 typography7 = this.onNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        typography7.setVisibility(8);
        ConstraintLayout constraintLayoutOnNavigationEvent = this.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setVisibility(8);
        FrameLayout frameLayout = this.onNavigationEvent.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        IAuthTabCallbackStubProxy().setVisibility(0);
        int i4 = extraCommand + 23;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = (NativeAdsThumbnailVideoV2View) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 111;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsThumbnailVideoV2View.onWarmupCompleted(nativeAdsThumbnailVideoV2View.asBinder);
        SubTypography8 subTypography8 = nativeAdsThumbnailVideoV2View.onNavigationEvent.extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(subTypography8, "");
        subTypography8.setVisibility(8);
        Typography7 typography7 = nativeAdsThumbnailVideoV2View.onNavigationEvent.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        typography7.setVisibility(8);
        ConstraintLayout constraintLayout = nativeAdsThumbnailVideoV2View.onNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        TdsImageView tdsImageView = nativeAdsThumbnailVideoV2View.onNavigationEvent.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        StyledPlayerView styledPlayerView = nativeAdsThumbnailVideoV2View.onNavigationEvent.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
        styledPlayerView.setVisibility(8);
        TdsImageView tdsImageView2 = nativeAdsThumbnailVideoV2View.onNavigationEvent.access100;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        tdsImageView2.setVisibility(8);
        nativeAdsThumbnailVideoV2View.IAuthTabCallbackStubProxy().setVisibility(8);
        Typography7 typography72 = nativeAdsThumbnailVideoV2View.onNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography72, "");
        typography72.setVisibility(8);
        ConstraintLayout constraintLayoutOnNavigationEvent = nativeAdsThumbnailVideoV2View.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setVisibility(8);
        FrameLayout frameLayout = nativeAdsThumbnailVideoV2View.onNavigationEvent.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        int i4 = ICustomTabsCallback_Parcel + 121;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onExtraCallback(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = extraCommand + 113;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.onNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        asBinder(NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback(thumbnailBanner, null, null, null, "", null, null, null, null, null, 503, null));
        IAuthTabCallback(this.asBinder);
        TdsImageView tdsImageView = this.onNavigationEvent.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(8);
        StyledPlayerView styledPlayerView = this.onNavigationEvent.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(styledPlayerView, "");
        styledPlayerView.setVisibility(8);
        IAuthTabCallbackStubProxy().setVisibility(8);
        TdsImageView tdsImageView2 = this.onNavigationEvent.access100;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        tdsImageView2.setVisibility(0);
        TdsImageView tdsImageView3 = this.onNavigationEvent.access100;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        String strAccess100 = thumbnailBanner.access100();
        if (strAccess100 == null) {
            int i4 = extraCommand + 19;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            strAccess100 = thumbnailBanner.onTransact();
            int i6 = ICustomTabsCallback_Parcel + 61;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
        }
        TdsImageView.setImage$default(tdsImageView3, strAccess100, (Function1) null, (Function1) null, 6, (Object) null);
        Typography7 typography7 = this.onNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        typography7.setVisibility(8);
        ConstraintLayout constraintLayoutOnNavigationEvent = this.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        constraintLayoutOnNavigationEvent.setVisibility(8);
        FrameLayout frameLayout = this.onNavigationEvent.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void extraCommand() {
        int i = 2 % 2;
        int i2 = extraCommand + 53;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = false;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted, -658170630, 658170639, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        ICustomTabsCallbackDefault();
        setVisibility(8);
        int i4 = ICustomTabsCallback_Parcel + 69;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAd nativeAd, NativeAd nativeAd2) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, nativeAd, nativeAd2}, iOnWarmupCompleted, 1336715519, -1336715519, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View}, iOnWarmupCompleted, 952862823, -952862818, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, View view) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, view}, iOnWarmupCompleted, 1735729707, -1735729700, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, motionEvent}, iOnWarmupCompleted, 1877678589, -1877678587, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final void onNavigationEvent(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, View view) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, view}, iOnWarmupCompleted, -201395958, 201395961, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback_Parcel(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, motionEvent}, iOnWarmupCompleted, 1991526600, -1991526592, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallbackStubProxy(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, MotionEvent motionEvent) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, motionEvent}, iOnWarmupCompleted, 951281908, -951281902, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, long j) {
        Object[] objArr = {nativeAdsThumbnailVideoV2View, Long.valueOf(j)};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, 1981278358, -1981278346, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static final /* synthetic */ void onNavigationEvent(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View, thumbnailBanner}, iOnWarmupCompleted, -2040315026, 2040315042, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static final /* synthetic */ void readTypedObject(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View}, iOnWarmupCompleted, 223330126, -223330109, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static final /* synthetic */ void onPostMessage(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{nativeAdsThumbnailVideoV2View}, iOnWarmupCompleted, 980821090, -980821089, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void onExtraCallback(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, -1979388677, 1979388697, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final RecyclerView onNavigationEvent(View view) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (RecyclerView) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this, view}, iOnWarmupCompleted, -2110659423, 2110659437, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final double access100() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Double) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted, 33340620, -33340601, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).doubleValue();
    }

    private final boolean onExtraCallbackWithResult(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Boolean) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this, thumbnailBanner}, iOnWarmupCompleted, 411469487, -411469472, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    private final void access000() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted, -658170630, 658170639, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void onWarmupCompleted(String str, ExposureContent exposureContent) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this, str, exposureContent}, iOnWarmupCompleted, 770986742, -770986724, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    static /* synthetic */ void onWarmupCompleted(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, String str, ExposureContent exposureContent, int i, Object obj) {
        Object[] objArr = {nativeAdsThumbnailVideoV2View, str, exposureContent, Integer.valueOf(i), obj};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, 954695640, -954695627, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void mayLaunchUrl() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, iOnWarmupCompleted, -1538053000, 1538053004, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void onNavigationEvent(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this, thumbnailBanner}, iOnWarmupCompleted, 455955272, -455955262, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit newSessionWithExtras() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, new Object[0], iOnWarmupCompleted, 610696307, -610696296, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }
}
