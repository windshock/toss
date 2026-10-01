package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.skt.usp.UCPApiConstants;
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
import im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$NativeAdsThumbnail$1$1$observer$1;
import im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$NativeAdsThumbnailAdMobController$2$1$observer$1;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.SafePlayerView;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RecomposerawaitIdle2;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda17;
import o.decrementVideoUsage;
import o.getScaleX;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;
import o.onReceiveValue;
import o.readFully;
import o.setByteOrder;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onReceiveValue {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallbackWithResult = -5910912620295049056L;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final class IAuthTabCallbackDefault implements decrementVideoUsage {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 7 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStub implements decrementVideoUsage {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 41 / 0;
            }
        }
    }

    public static final class IAuthTabCallback_Parcel implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements decrementVideoUsage {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 67 / 0;
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = i8 | i5;
        int i11 = (~((~i5) | i4)) | (~i10);
        int i12 = (~(i2 | i7 | i5)) | (~(i10 | i4));
        int i13 = i5 + i4 + i3 + (528639218 * i6) + ((-532493036) * i);
        int i14 = i13 * i13;
        int i15 = ((i5 * 873666089) - 1460666368) + (873666089 * i4) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i3) + (1819279360 * i6) + ((-1621098496) * i) + (586088448 * i14);
        int i16 = (i5 * (-1573143961)) + 2078511484 + (i4 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i3 * (-1573143025)) + (i6 * 123045422) + (i * (-1548035028)) + (i14 * 1845559296);
        switch (i15 + (i16 * i16 * 1848705024)) {
            case 1:
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                ((Number) objArr[5]).intValue();
                int i17 = 2 % 2;
                int i18 = onNavigationEvent + 39;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                IAuthTabCallback(quirksExternalSyntheticBackport0, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
                Unit unit = Unit.INSTANCE;
                int i20 = onNavigationEvent + 85;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                int i22 = 2 % 2;
                int i23 = onNavigationEvent + 7;
                onWarmupCompleted = i23 % 128;
                int i24 = i23 % 2;
                boolean zICustomTabsCallback = ICustomTabsCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                int i25 = onNavigationEvent + 75;
                onWarmupCompleted = i25 % 128;
                int i26 = i25 % 2;
                return Boolean.valueOf(zICustomTabsCallback);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asInterface(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return IAuthTabCallbackDefault(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return IAuthTabCallback_Parcel(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return access000(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return access100(objArr);
            case 17:
                return extraCallback(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i27 = 2 % 2;
                int i28 = onNavigationEvent + 25;
                onWarmupCompleted = i28 % 128;
                int i29 = i28 % 2;
                readTypedObject(getsupportedhighspeedresolutionsfor2, zBooleanValue);
                int i30 = onWarmupCompleted + 39;
                onNavigationEvent = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 19:
                return ICustomTabsCallback(objArr);
            case 20:
                return writeTypedObject(objArr);
            case 21:
                return readTypedObject(objArr);
            case 22:
                return extraCallbackWithResult(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, String str2, ConstraintLayout constraintLayout) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {context, getsupportedhighspeedresolutionsfor, highSpeedResolverExternalSyntheticLambda2, getsupportedhighspeedresolutionsfor2, str, getsupportedhighspeedresolutionsfor3, str2, constraintLayout};
        Unit unit = (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1276092443, -1276092439, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ExoPlayer exoPlayer, SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(exoPlayer, safePlayerView);
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(nativeAdsManager, str, adAsset, nativeAdsEventLogType);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsManager, str, adAsset, nativeAdsEventLogType);
        int i3 = onWarmupCompleted + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(function0, thumbnailBanner, getsupportedhighspeedresolutionsfor);
        }
        onExtraCallback(function0, thumbnailBanner, getsupportedhighspeedresolutionsfor);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, z);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        int i5 = onWarmupCompleted + 43;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ decrementVideoUsage IAuthTabCallback(NativeAdsDto.AdmobInfo admobInfo, Function0 function0, NativeAd nativeAd, Function1 function1, Context context, String str, NativeAdsDto.Mediation mediation, NativeAdsManager nativeAdsManager, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onExtraCallbackWithResult(admobInfo, function0, nativeAd, function1, context, str, mediation, nativeAdsManager, getsupportedhighspeedresolutionsfor, thumbnailBanner, isinvideousage);
        int i4 = onNavigationEvent + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return decrementvideousageOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(nativeAd);
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = onWarmupCompleted + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return zIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnMessageChannelReady = onMessageChannelReady(getsupportedhighspeedresolutionsfor);
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnMessageChannelReady;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor, Boolean.valueOf(zBooleanValue)}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1568054357, -1568054352, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i3 = onNavigationEvent + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(getsupportedhighspeedresolutionsfor, zBooleanValue);
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        ExoPlayer exoPlayer = (ExoPlayer) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        Set set = (Set) objArr[4];
        String str = (String) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[6];
        isInVideoUsage isinvideousage = (isInVideoUsage) objArr[7];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(exoPlayer, getsupportedhighspeedresolutionsfor, function1, getsupportedhighspeedresolutionsfor2, set, str, getsupportedhighspeedresolutionsfor3, isinvideousage);
        }
        onNavigationEvent(exoPlayer, getsupportedhighspeedresolutionsfor, function1, getsupportedhighspeedresolutionsfor2, set, str, getsupportedhighspeedresolutionsfor3, isinvideousage);
        throw null;
    }

    public static final /* synthetic */ void asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ConstraintLayout onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return constraintLayoutOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(thumbnailBanner, getsupportedhighspeedresolutionsfor, str);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(ExoPlayer exoPlayer, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{exoPlayer, str, getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, 688022066, -688022056, iOnExtraCallback3);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(function1, z);
        }
        onWarmupCompleted(function1, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, NativeAdsManager nativeAdsManager, boolean z, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, str, adAsset, thumbnailBanner, nativeAdsManager, z, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 113;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, boolean z, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, List list, boolean z2, boolean z3, boolean z4, Function1 function1, Function1 function12, Function1 function13, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, str, z, thumbnailBanner, list, z2, z3, z4, function1, function12, function13, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2));
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 57;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        if (i3 != 0) {
            return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1349741342, 1349741349, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        int i4 = 97 / 0;
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1349741342, 1349741349, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z), function1};
        if (i3 == 0) {
            return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -842412388, 842412399, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        int i4 = 67 / 0;
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -842412388, 842412399, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(writeTypedObject writetypedobject, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(writetypedobject, isinvideousage);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return decrementvideousageIAuthTabCallback;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedFeatures getsupportedfeatures) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor, getsupportedfeatures}, iOnExtraCallback2, -655758559, 655758572, iOnExtraCallback3);
            return;
        }
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, new Object[]{getsupportedhighspeedresolutionsfor, getsupportedfeatures}, iOnExtraCallback5, -655758559, 655758572, iOnExtraCallback6);
        int i3 = 66 / 0;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ExoPlayer exoPlayer, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(exoPlayer, function1, getsupportedhighspeedresolutionsfor);
        }
        onWarmupCompleted(exoPlayer, function1, getsupportedhighspeedresolutionsfor);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1);
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(highSpeedResolverExternalSyntheticLambda2, context, getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = onWarmupCompleted + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, NativeAdsManager nativeAdsManager, boolean z, boolean z2, Function1 function1, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, str, adAsset, thumbnailBanner, nativeAdsManager, Boolean.valueOf(z), Boolean.valueOf(z2), function1, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 2092276082, -2092276060, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 47;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, boolean z, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, List list, boolean z2, boolean z3, boolean z4, Function1 function1, Function1 function12, Function1 function13, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 61;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, z, thumbnailBanner, list, z2, z3, z4, function1, function12, function13, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 37;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<NativeAd>) getsupportedhighspeedresolutionsfor, nativeAd);
        int i4 = onNavigationEvent + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = access100((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zAccess100;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2 = (HighSpeedResolverExternalSyntheticLambda2) objArr[3];
        Context context = (Context) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[5];
        String str2 = (String) objArr[6];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsManager, str, adAsset, highSpeedResolverExternalSyntheticLambda2, context, getsupportedhighspeedresolutionsfor, str2);
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {function1, Boolean.valueOf(z)};
        Unit unit = (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 298994453, -298994441, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, NativeAdsManager nativeAdsManager, boolean z, boolean z2, Function1 function1, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, adAsset, thumbnailBanner, nativeAdsManager, z, z2, function1, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, adAsset, thumbnailBanner, nativeAdsManager, z, z2, function1, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1800540800, 1800540801, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        Object[] objArr2 = {quirksExternalSyntheticBackport0, function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getSupportedFeatures onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return readTypedObject((getSupportedHighSpeedResolutionsFor<getSupportedFeatures>) getsupportedhighspeedresolutionsfor);
        }
        readTypedObject((getSupportedHighSpeedResolutionsFor<getSupportedFeatures>) getsupportedhighspeedresolutionsfor);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(NativeAd nativeAd, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, Context context, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(nativeAd, highSpeedResolverExternalSyntheticLambda2, context, view);
        int i4 = onWarmupCompleted + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, 78091604, -78091589, iOnExtraCallback3);
        int i4 = onWarmupCompleted + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onActivityLayout(getsupportedhighspeedresolutionsfor);
            throw null;
        }
        boolean zOnActivityLayout = onActivityLayout(getsupportedhighspeedresolutionsfor);
        int i3 = onWarmupCompleted + 43;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnActivityLayout;
        }
        throw null;
    }

    public static final /* synthetic */ NativeAd onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAd nativeAdExtraCallback = extraCallback((getSupportedHighSpeedResolutionsFor<NativeAd>) getsupportedhighspeedresolutionsfor);
        int i4 = onWarmupCompleted + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return nativeAdExtraCallback;
    }

    public static /* synthetic */ SafePlayerView onWarmupCompleted(ExoPlayer exoPlayer, Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SafePlayerView safePlayerViewOnExtraCallbackWithResult = onExtraCallbackWithResult(exoPlayer, context);
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return safePlayerViewOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage);
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return decrementvideousageIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(VideoController videoController, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(videoController, getsupportedhighspeedresolutionsfor, view);
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(getsupportedhighspeedresolutionsfor, z);
        int i4 = onNavigationEvent + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws Throwable {
        Unit unitOnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) objArr[3];
        NativeAdsManager nativeAdsManager = (NativeAdsManager) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        Function0 function0 = (Function0) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue3 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, adAsset, thumbnailBanner, nativeAdsManager, zBooleanValue, function0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            int i3 = 52 / 0;
        } else {
            unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, adAsset, thumbnailBanner, nativeAdsManager, zBooleanValue, function0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        int i4 = onWarmupCompleted + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        isInVideoUsage isinvideousage = (isInVideoUsage) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, zBooleanValue, getsupportedhighspeedresolutionsfor2, isinvideousage);
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return decrementvideousageOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class ICustomTabsCallback implements decrementVideoUsage {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ IAuthTabCallbackStubProxy IAuthTabCallback;
        final /* synthetic */ ExoPlayer onExtraCallbackWithResult;

        public ICustomTabsCallback(ExoPlayer exoPlayer, IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
            this.onExtraCallbackWithResult = exoPlayer;
            this.IAuthTabCallback = iAuthTabCallbackStubProxy;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.removeListener(this.IAuthTabCallback);
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class asBinder implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdsThumbnailKt$NativeAdsThumbnailAdMobController$2$1$observer$1 IAuthTabCallback;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onNavigationEvent;

        public asBinder(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, NativeAdsThumbnailKt$NativeAdsThumbnailAdMobController$2$1$observer$1 nativeAdsThumbnailKt$NativeAdsThumbnailAdMobController$2$1$observer$1) {
            this.onNavigationEvent = textFieldScrollKtExternalSyntheticLambda0;
            this.IAuthTabCallback = nativeAdsThumbnailKt$NativeAdsThumbnailAdMobController$2$1$observer$1;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.getLifecycle().onExtraCallbackWithResult(this.IAuthTabCallback);
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
        }
    }

    public static final class asInterface implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getScaleX onWarmupCompleted;

        public asInterface(getScaleX getscalex) {
            this.onWarmupCompleted = getscalex;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.IAuthTabCallback();
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class extraCallbackWithResult implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ writeTypedObject onExtraCallback;

        public extraCallbackWithResult(writeTypedObject writetypedobject) {
            this.onExtraCallback = writetypedobject;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            writeTypedObject writetypedobject = this.onExtraCallback;
            if (writetypedobject != null) {
                removeRearDisplayPresentationStatusListener.IAuthTabCallback.IAuthTabCallback(writetypedobject);
            }
            int i3 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final class onExtraCallbackWithResult implements decrementVideoUsage {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ NativeAdsThumbnailKt$NativeAdsThumbnail$1$1$observer$1 IAuthTabCallback;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onExtraCallbackWithResult;

        public onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, NativeAdsThumbnailKt$NativeAdsThumbnail$1$1$observer$1 nativeAdsThumbnailKt$NativeAdsThumbnail$1$1$observer$1) {
            this.onExtraCallbackWithResult = textFieldScrollKtExternalSyntheticLambda0;
            this.IAuthTabCallback = nativeAdsThumbnailKt$NativeAdsThumbnail$1$1$observer$1;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.getLifecycle().onExtraCallbackWithResult(this.IAuthTabCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.onExtraCallbackWithResult.getLifecycle().onExtraCallbackWithResult(this.IAuthTabCallback);
            int i3 = onNavigationEvent + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 87;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 21;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 'H' - AndroidCharacter.getMirror('0'), 19626 - Process.getGidForName(""), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 59 - View.MeasureSpec.getSize(0), Color.alpha(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 58 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.argb(0, 0, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $11 + 103;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 52 / 0;
            objArr[0] = str;
        }
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdsDto.AdAsset $adAsset;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isHairlineVisible$delegate;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
        final /* synthetic */ NativeAdsManager $manager;
        final /* synthetic */ String $requestId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(NativeAdsManager nativeAdsManager, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, String str, NativeAdsDto.AdAsset adAsset, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$manager = nativeAdsManager;
            this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
            this.$requestId = str;
            this.$adAsset = adAsset;
            this.$isHairlineVisible$delegate = getsupportedhighspeedresolutionsfor;
        }

        public static /* synthetic */ boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor);
            int i4 = onNavigationEvent + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return zOnExtraCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$manager, this.$lifecycleOwner, this.$requestId, this.$adAsset, this.$isHairlineVisible$delegate, access13800Var);
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                int i7 = 37 / 0;
                if (onReceiveValue.IAuthTabCallback(this.$isHairlineVisible$delegate)) {
                    NativeAdsManager nativeAdsManager = this.$manager;
                    TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.$lifecycleOwner);
                    String str = this.$requestId;
                    NativeAdsDto.AdAsset adAsset = this.$adAsset;
                    final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.$isHairlineVisible$delegate;
                    nativeAdsManager.onExtraCallback((findResAndMsg) textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, str, adAsset, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$NativeAdsThumbnail$2$1$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallback + 25;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            Boolean boolValueOf = Boolean.valueOf(onReceiveValue.IAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor));
                            int i11 = onWarmupCompleted + 61;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            return boolValueOf;
                        }
                    });
                    int i8 = onWarmupCompleted + 65;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (onReceiveValue.IAuthTabCallback(this.$isHairlineVisible$delegate)) {
            }
            return Unit.INSTANCE;
        }

        private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onReceiveValue.IAuthTabCallback(getsupportedhighspeedresolutionsfor);
            }
            onReceiveValue.IAuthTabCallback(getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        access100(getsupportedhighspeedresolutionsfor, z);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        access000(getsupportedhighspeedresolutionsfor, zBooleanValue);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        asInterface(getsupportedhighspeedresolutionsfor, zBooleanValue);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Function0 function0, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<WebViewProviderAdapterExternalSyntheticLambda0>) getsupportedhighspeedresolutionsfor, WebViewProviderAdapterExternalSyntheticLambda0.TOSS);
            throw null;
        }
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<WebViewProviderAdapterExternalSyntheticLambda0>) getsupportedhighspeedresolutionsfor, WebViewProviderAdapterExternalSyntheticLambda0.TOSS);
        if (function0 != null) {
            int i3 = onWarmupCompleted + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (StringsKt.startsWith$default(thumbnailBanner.IAuthTabCallback(), "admob_shell_", false, 2, (Object) null)) {
                function0.invoke();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
      0x002b: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0029, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) throws Throwable {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(str);
            int i3 = 10 / 0;
            if (strOnExtraCallbackWithResult != null) {
                onNavigationEvent((getSupportedHighSpeedResolutionsFor<NativeAdsDto.Creative.ThumbnailBanner>) getsupportedhighspeedresolutionsfor, NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback((NativeAdsDto.Creative.ThumbnailBanner) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -486865843, 486865852, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()), null, null, null, strOnExtraCallbackWithResult, null, null, null, null, null, 503, null));
            } else {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("ad_id", thumbnailBanner.IAuthTabCallback());
                Object[] objArr = new Object[1];
                a(new char[]{13794, 54770, 62933}, Color.alpha(0) + 57367, objArr);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "benefit_thumbnailBanner_playback_failed on Compose", (String) null, (Throwable) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), thumbnailBanner.onTransact()), getWrite.IAuthTabCallback("thumbnail_url", thumbnailBanner.access100())}), 4, (Object) null);
                onNavigationEvent((getSupportedHighSpeedResolutionsFor<NativeAdsDto.Creative.ThumbnailBanner>) getsupportedhighspeedresolutionsfor, NativeAdsDto.Creative.ThumbnailBanner.onExtraCallback((NativeAdsDto.Creative.ThumbnailBanner) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -486865843, 486865852, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()), null, null, null, "", null, null, null, null, null, 503, null));
                int i4 = onWarmupCompleted + 89;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(str);
            if (strOnExtraCallbackWithResult != null) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        calculatePageOffsets.onExtraCallback(nativeAdsManager.onExtraCallbackWithResult(), str, adAsset, nativeAdsEventLogType, (Function1) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            getStrokeWidth.IAuthTabCallback(getstrokewidth, context, ((NativeAdsDto.Creative.ThumbnailBanner) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, -486865843, 486865852, iOnExtraCallback3)).onWarmupCompleted(), 0, 2, null);
            kotlin.Result.constructor-impl(Unit.INSTANCE);
            int i4 = onNavigationEvent + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 83;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, final HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, final Context context, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str2) throws Throwable {
        NativeAdsEventLogType.onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (str2 != null) {
            onextracallback = new NativeAdsEventLogType.onExtraCallback(str2);
            int i4 = onNavigationEvent + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            onextracallback = null;
        }
        getFillAlpha.onWarmupCompleted(nativeAdsManager, str, adAsset, onextracallback, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 5;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnExtraCallbackWithResult = onReceiveValue.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2, context, getsupportedhighspeedresolutionsfor);
                int i9 = IAuthTabCallback + 87;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.QuirkSettingsLoader$onWarmupCompleted */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @NotNull final NativeAdsDto.AdAsset adAsset, @NotNull final NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, @NotNull final NativeAdsManager nativeAdsManager, final boolean z, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        Function0<Unit> function02;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Function0<Unit> function03;
        Context context;
        Object obj;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        Function0<Unit> function04;
        NativeAdsDto.Mediation mediation;
        Object obj2;
        boolean z2;
        Object obj3;
        NativeAdsDto.ExtraInfo extraInfoOnTransact;
        Object objOnWarmupCompleted;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        boolean z3;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        Context context2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4;
        int i5;
        int i6;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5;
        int i7;
        Function0<Unit> function05;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted;
        Object obj4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z4;
        Function0<Unit> function06;
        boolean z5;
        Context context3;
        boolean z6;
        int i8;
        boolean z7;
        final Function0<Unit> function07;
        int i9;
        int i10;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(thumbnailBanner, "");
        Intrinsics.checkNotNullParameter(nativeAdsManager, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1314175905);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i13 = onWarmupCompleted + 81;
                onNavigationEvent = i13 % 128;
                i4 = i13 % 2 != 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i14 = onWarmupCompleted + 111;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(adAsset)) {
                int i16 = onWarmupCompleted + 61;
                onNavigationEvent = i16 % 128;
                i9 = i16 % 2 != 0 ? 15316 : 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(thumbnailBanner) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAdsManager) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 131072 : 65536;
        }
        int i17 = i2 & 64;
        if (i17 != 0) {
            i3 |= 1572864;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 1572864) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 1048576 : 524288;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (i17 != 0) {
                function02 = null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1314175905, i3, -1, "im.toss.ads_sdk.ui.compose.NativeAdsThumbnail (NativeAdsThumbnail.kt:93)");
            }
            boolean zOnTransact = adAsset.onTransact();
            Context context4 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(adAsset.onWarmupCompleted());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                List<String> listOnWarmupCompleted = adAsset.onWarmupCompleted();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
                Iterator<T> it = listOnWarmupCompleted.iterator();
                while (it.hasNext()) {
                    int i18 = onNavigationEvent + 29;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(NativeAdsEventLogType.Companion.onWarmupCompleted((String) it.next()));
                    context4 = context4;
                }
                context = context4;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(arrayList);
                obj = arrayList;
            } else {
                context = context4;
                obj = objOnMinimized;
            }
            List list = (List) obj;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor8;
                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            } else {
                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor8;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                function04 = function02;
                objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
            } else {
                function04 = function02;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
            String strIAuthTabCallback = thumbnailBanner.IAuthTabCallback();
            String interfaceDescriptor = thumbnailBanner.getInterfaceDescriptor();
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent2 | zOnNavigationEvent3) || objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(thumbnailBanner, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
            String strIAuthTabCallback2 = adAsset.IAuthTabCallback();
            int i20 = i3 & 112;
            boolean z8 = i20 == 32;
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback2);
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent4 | z8) || objOnMinimized7 == onwarmupcompleted2.onExtraCallback()) {
                NativeAdsDto nativeAdsDtoOnNavigationEvent = nativeAdsManager.onNavigationEvent(str);
                if (nativeAdsDtoOnNavigationEvent == null || (extraInfoOnTransact = nativeAdsDtoOnNavigationEvent.onTransact()) == null || (mediation = extraInfoOnTransact.onNavigationEvent()) == null) {
                    mediation = new NativeAdsDto.Mediation((String) null, (List) null, (NativeAdsDto.AdmobInfo) null, (NativeAdsDto.MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
                }
                Iterator it2 = mediation.IAuthTabCallbackDefault().iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Iterator it3 = it2;
                    String str2 = (String) next;
                    if (Intrinsics.areEqual(str2, "ADMOB")) {
                        obj3 = next;
                    } else {
                        obj3 = next;
                        if (!Intrinsics.areEqual(str2, "TOSS")) {
                            it2 = it3;
                        }
                    }
                    obj2 = obj3;
                }
                obj2 = null;
                if (!Intrinsics.areEqual(obj2, "ADMOB")) {
                    z2 = false;
                    objOnMinimized7 = Boolean.valueOf(z2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                } else {
                    int i21 = onWarmupCompleted + 45;
                    onNavigationEvent = i21 % 128;
                    if (i21 % 2 != 0) {
                        mediation.onExtraCallbackWithResult();
                        throw null;
                    }
                    NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediation.onExtraCallbackWithResult();
                    if ((admobInfoOnExtraCallbackWithResult != null ? (AdmobAdFormat) NativeAdsDto.AdmobInfo.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{admobInfoOnExtraCallbackWithResult}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1779197038) : null) == AdmobAdFormat.NATIVE) {
                        int i22 = onNavigationEvent + 57;
                        onWarmupCompleted = i22 % 128;
                        int i23 = i22 % 2;
                        z2 = true;
                    }
                    objOnMinimized7 = Boolean.valueOf(z2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
            }
            boolean zBooleanValue = ((Boolean) objOnMinimized7).booleanValue();
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(thumbnailBanner.IAuthTabCallback());
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent5 || zOnExtraCallback) || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(zBooleanValue ? WebViewProviderAdapterExternalSyntheticLambda0.ADMOB : WebViewProviderAdapterExternalSyntheticLambda0.TOSS, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnWarmupCompleted);
            } else {
                objOnWarmupCompleted = objOnMinimized8;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13 = (getSupportedHighSpeedResolutionsFor) objOnWarmupCompleted;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda02);
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnExtraCallback2 || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized9 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda23
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj5) {
                        int i24 = 2 % 2;
                        int i25 = onExtraCallbackWithResult + 21;
                        onExtraCallback = i25 % 128;
                        int i26 = i25 % 2;
                        decrementVideoUsage decrementvideousageOnWarmupCompleted = onReceiveValue.onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda02, getsupportedhighspeedresolutionsfor10, (isInVideoUsage) obj5);
                        int i27 = onExtraCallbackWithResult + 95;
                        onExtraCallback = i27 % 128;
                        if (i27 % 2 == 0) {
                            return decrementvideousageOnWarmupCompleted;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda02, (Function1) objOnMinimized9, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor9);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAdsManager);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda02);
            if (i20 == 32) {
                int i24 = onNavigationEvent + 35;
                textFieldScrollKtExternalSyntheticLambda0 = textFieldScrollKtExternalSyntheticLambda02;
                onWarmupCompleted = i24 % 128;
                int i25 = i24 % 2;
                z3 = true;
            } else {
                textFieldScrollKtExternalSyntheticLambda0 = textFieldScrollKtExternalSyntheticLambda02;
                z3 = false;
            }
            int i26 = i3 & 896;
            boolean z9 = i26 == 256;
            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z9 || (z3 | zOnExtraCallback3 | zOnExtraCallback4)) || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor14 = getsupportedhighspeedresolutionsfor;
                getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor10;
                context2 = context;
                getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor12;
                getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor14;
                i5 = i26;
                i6 = i3;
                getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor13;
                i7 = i20;
                function05 = function04;
                getsupportedhighspeedresolutionsfor6 = getsupportedhighspeedresolutionsfor9;
                getsupportedhighspeedresolutionsfor7 = getsupportedhighspeedresolutionsfor11;
                onwarmupcompleted = null;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(nativeAdsManager, textFieldScrollKtExternalSyntheticLambda0, str, adAsset, getsupportedhighspeedresolutionsfor9, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iAuthTabCallback);
                obj4 = iAuthTabCallback;
            } else {
                context2 = context;
                i5 = i26;
                i6 = i3;
                i7 = i20;
                getsupportedhighspeedresolutionsfor6 = getsupportedhighspeedresolutionsfor9;
                getsupportedhighspeedresolutionsfor7 = getsupportedhighspeedresolutionsfor11;
                getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor12;
                getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor;
                function05 = function04;
                getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor10;
                onwarmupcompleted = null;
                getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor13;
                obj4 = objOnMinimized10;
            }
            isZslDisabledByByUserCaseConfig.IAuthTabCallback(Boolean.valueOf(zIAuthTabCallbackStubProxy), adAsset, str, (Function2) obj4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i6 >> 3) & 112) | ((i6 << 3) & 896));
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport05, 0.0f, 1, onwarmupcompleted), onwarmupcompleted, false, 3, onwarmupcompleted);
            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted3 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized11 == onwarmupcompleted3.onExtraCallback()) {
                objOnMinimized11 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda24
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj5) {
                        int i27 = 2 % 2;
                        int i28 = onWarmupCompleted + 107;
                        IAuthTabCallback = i28 % 128;
                        if (i28 % 2 == 0) {
                            onReceiveValue.IAuthTabCallback(getsupportedhighspeedresolutionsfor6, ((Boolean) obj5).booleanValue());
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(getsupportedhighspeedresolutionsfor6, ((Boolean) obj5).booleanValue());
                        int i29 = IAuthTabCallback + 47;
                        onWarmupCompleted = i29 % 128;
                        int i30 = i29 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onPageCommitVisible.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted, 0.0f, (Function1) objOnMinimized11, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432);
            Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized12 == onwarmupcompleted3.onExtraCallback()) {
                objOnMinimized12 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda25
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj5) {
                        int i27 = 2 % 2;
                        int i28 = onNavigationEvent + 43;
                        IAuthTabCallback = i28 % 128;
                        int i29 = i28 % 2;
                        Unit unitOnExtraCallback = onReceiveValue.onExtraCallback(getsupportedhighspeedresolutionsfor4, ((Boolean) obj5).booleanValue());
                        int i30 = onNavigationEvent + 65;
                        IAuthTabCallback = i30 % 128;
                        int i31 = i30 % 2;
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = onPageCommitVisible.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, 0.5f, (Function1) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i27 = onNavigationEvent + 125;
                onWarmupCompleted = i27 % 128;
                if (i27 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    throw onwarmupcompleted;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            final HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            if (zBooleanValue && IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<WebViewProviderAdapterExternalSyntheticLambda0>) getsupportedhighspeedresolutionsfor5) == WebViewProviderAdapterExternalSyntheticLambda0.ADMOB) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-815915583);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, onwarmupcompleted);
                boolean zAccess000 = access000((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor4);
                boolean zAsBinder = asBinder((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor7);
                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized13 == onwarmupcompleted3.onExtraCallback()) {
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor15 = getsupportedhighspeedresolutionsfor7;
                    objOnMinimized13 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda26
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj5) {
                            int i28 = 2 % 2;
                            int i29 = onWarmupCompleted + 77;
                            IAuthTabCallback = i29 % 128;
                            if (i29 % 2 != 0) {
                                Object[] objArr = {getsupportedhighspeedresolutionsfor15, Boolean.valueOf(((Boolean) obj5).booleanValue())};
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                            Object[] objArr2 = {getsupportedhighspeedresolutionsfor15, Boolean.valueOf(((Boolean) obj5).booleanValue())};
                            Unit unit = (Unit) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -2007483923, 2007483937, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                            int i30 = onWarmupCompleted + 91;
                            IAuthTabCallback = i30 % 128;
                            if (i30 % 2 != 0) {
                                int i31 = 21 / 0;
                            }
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                }
                Function1 function1 = (Function1) objOnMinimized13;
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor16 = getsupportedhighspeedresolutionsfor5;
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor16);
                boolean z10 = (3670016 & i6) == 1048576;
                int i28 = i6 & 7168;
                boolean z11 = i28 == 2048;
                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (((zOnNavigationEvent6 | z10) || z11) || objOnMinimized14 == onwarmupcompleted3.onExtraCallback()) {
                    function07 = function05;
                    objOnMinimized14 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda27
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i29 = 2 % 2;
                            int i30 = onExtraCallback + 9;
                            onNavigationEvent = i30 % 128;
                            int i31 = i30 % 2;
                            Unit unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(function07, thumbnailBanner, getsupportedhighspeedresolutionsfor16);
                            int i32 = onExtraCallback + 81;
                            onNavigationEvent = i32 % 128;
                            int i33 = i32 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized14);
                } else {
                    function07 = function05;
                }
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, str, adAsset, thumbnailBanner, nativeAdsManager, Boolean.valueOf(zAccess000), Boolean.valueOf(zAsBinder), function1, (Function0) objOnMinimized14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(12582918 | i7 | i5 | i28 | (57344 & i6))}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 2092276082, -2092276060, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                z7 = true;
                function06 = function07;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                int i29 = i7;
                Function0<Unit> function08 = function05;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-815129237);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, onwarmupcompleted);
                NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner2 = (NativeAdsDto.Creative.ThumbnailBanner) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor3}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -486865843, 486865852, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                boolean zAccess0002 = access000((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor4);
                boolean zIAuthTabCallback_Parcel = IAuthTabCallback_Parcel((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor17 = getsupportedhighspeedresolutionsfor3;
                boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor17);
                if ((i6 & 7168) == 2048) {
                    int i30 = onNavigationEvent + 1;
                    onWarmupCompleted = i30 % 128;
                    int i31 = i30 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent7 | z4)) {
                    Object obj5 = objOnMinimized15;
                    if (objOnMinimized15 == onwarmupcompleted3.onExtraCallback()) {
                        Function1 function12 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda28
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj6) {
                                int i32 = 2 % 2;
                                int i33 = onNavigationEvent + 81;
                                onWarmupCompleted = i33 % 128;
                                int i34 = i33 % 2;
                                NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner3 = thumbnailBanner;
                                if (i34 == 0) {
                                    Object[] objArr = {thumbnailBanner3, getsupportedhighspeedresolutionsfor17, (String) obj6};
                                    return (Unit) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 848378462, -848378462, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                                }
                                Object[] objArr2 = {thumbnailBanner3, getsupportedhighspeedresolutionsfor17, (String) obj6};
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                        obj5 = function12;
                    }
                    Function1 function13 = (Function1) obj5;
                    int i32 = i5;
                    boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAdsManager);
                    boolean z12 = i29 == 32;
                    if (i32 == 256) {
                        int i33 = onWarmupCompleted + 69;
                        function06 = function08;
                        onNavigationEvent = i33 % 128;
                        int i34 = i33 % 2;
                        z5 = true;
                    } else {
                        function06 = function08;
                        z5 = false;
                    }
                    Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnExtraCallback5 | z12 | z5) || objOnMinimized16 == onwarmupcompleted3.onExtraCallback()) {
                        objOnMinimized16 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda29
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj6) {
                                Unit unitIAuthTabCallback;
                                int i35 = 2 % 2;
                                int i36 = onWarmupCompleted + 37;
                                onExtraCallback = i36 % 128;
                                if (i36 % 2 != 0) {
                                    unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(nativeAdsManager, str, adAsset, (NativeAdsEventLogType) obj6);
                                    int i37 = 91 / 0;
                                } else {
                                    unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(nativeAdsManager, str, adAsset, (NativeAdsEventLogType) obj6);
                                }
                                int i38 = onExtraCallback + 113;
                                onWarmupCompleted = i38 % 128;
                                if (i38 % 2 != 0) {
                                    return unitIAuthTabCallback;
                                }
                                Object obj7 = null;
                                obj7.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized16);
                    }
                    Function1 function14 = (Function1) objOnMinimized16;
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAdsManager);
                    boolean z13 = i29 == 32;
                    if (i32 == 256) {
                        context3 = context2;
                        z6 = true;
                    } else {
                        context3 = context2;
                        z6 = false;
                    }
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context3);
                    boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor17);
                    Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((zOnExtraCallback7 | zOnExtraCallback6 | z13 | z6) || zOnNavigationEvent8) || objOnMinimized17 == onwarmupcompleted3.onExtraCallback()) {
                        final Context context5 = context3;
                        i8 = i29;
                        Function1 function15 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda30
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj6) {
                                int i35 = 2 % 2;
                                int i36 = onExtraCallback + 67;
                                onNavigationEvent = i36 % 128;
                                int i37 = i36 % 2;
                                Object[] objArr = {nativeAdsManager, str, adAsset, highSpeedResolverExternalSyntheticLambda1, context5, getsupportedhighspeedresolutionsfor17, (String) obj6};
                                Unit unit = (Unit) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -913808713, 913808715, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                                int i38 = onNavigationEvent + 79;
                                onExtraCallback = i38 % 128;
                                int i39 = i38 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function15);
                        objOnMinimized17 = function15;
                    } else {
                        i8 = i29;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    z7 = true;
                    onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback2, str, zOnTransact, thumbnailBanner2, list, z, zAccess0002, zIAuthTabCallback_Parcel, function13, function14, (Function1) objOnMinimized17, cameraCaptureResultEmptyCameraCaptureResult2, i8 | 6 | (458752 & i6), 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder() == z7) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            function03 = function06;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            function03 = function02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda31
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj6, Object obj7) {
                    int i35 = 2 % 2;
                    int i36 = onWarmupCompleted + 101;
                    onExtraCallback = i36 % 128;
                    int i37 = i36 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                    String str3 = str;
                    NativeAdsDto.AdAsset adAsset2 = adAsset;
                    NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner3 = thumbnailBanner;
                    NativeAdsManager nativeAdsManager2 = nativeAdsManager;
                    boolean z14 = z;
                    Function0 function09 = function03;
                    int i38 = i;
                    int i39 = i2;
                    int iIntValue = ((Integer) obj7).intValue();
                    Object[] objArr = {quirksExternalSyntheticBackport06, str3, adAsset2, thumbnailBanner3, nativeAdsManager2, Boolean.valueOf(z14), function09, Integer.valueOf(i38), Integer.valueOf(i39), (CameraCaptureResultEmptyCameraCaptureResult) obj6, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -998025932, 998025953, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                    int i40 = onWarmupCompleted + 95;
                    onExtraCallback = i40 % 128;
                    int i41 = i40 % 2;
                    return unit;
                }
            });
        }
    }

    public static final class access000 implements AnalyticsListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Function1<String, Unit> onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        access000(Function1<? super String, Unit> function1, String str) {
            this.onNavigationEvent = function1;
            this.onWarmupCompleted = str;
        }

        public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(eventTime, "");
                Intrinsics.checkNotNullParameter(playbackException, "");
                this.onNavigationEvent.invoke(this.onWarmupCompleted);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(eventTime, "");
            Intrinsics.checkNotNullParameter(playbackException, "");
            this.onNavigationEvent.invoke(this.onWarmupCompleted);
            int i3 = IAuthTabCallback + 21;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 0 / 0;
            }
        }
    }

    public static final class writeTypedObject implements endRearDisplaySession {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ ExoPlayer onNavigationEvent;

        writeTypedObject(ExoPlayer exoPlayer) {
            this.onNavigationEvent = exoPlayer;
        }

        @Override // o.endRearDisplaySession
        public void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.setPlayWhenReady(true);
            this.onNavigationEvent.play();
        }

        @Override // o.endRearDisplaySession
        public void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.pause();
            this.onNavigationEvent.setPlayWhenReady(false);
            int i4 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.endRearDisplaySession
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.stop();
            this.onNavigationEvent.setPlayWhenReady(false);
            int i4 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.endRearDisplaySession
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.release();
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStubProxy implements Player.Listener {
        private static int asBinder = 1;
        private static int asInterface;
        final /* synthetic */ Function1<NativeAdsEventLogType, Unit> IAuthTabCallback;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> onExtraCallback;
        final /* synthetic */ Set<Long> onExtraCallbackWithResult;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onTransact;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, Function1<? super NativeAdsEventLogType, Unit> function1, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, Set<Long> set, String str, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor3) {
            this.onTransact = getsupportedhighspeedresolutionsfor;
            this.IAuthTabCallback = function1;
            this.onWarmupCompleted = getsupportedhighspeedresolutionsfor2;
            this.onExtraCallbackWithResult = set;
            this.onNavigationEvent = str;
            this.onExtraCallback = getsupportedhighspeedresolutionsfor3;
        }

        public void onRenderedFirstFrame() {
            int i = 2 % 2;
            int i2 = asInterface + 21;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onReceiveValue.asBinder(this.onTransact, false);
            int i4 = asInterface + 115;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onIsPlayingChanged(boolean z) {
            int i = 2 % 2;
            int i2 = asBinder + 89;
            asInterface = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onReceiveValue.onTransact(this.onWarmupCompleted, z);
                if (z) {
                    int i3 = asBinder + 91;
                    asInterface = i3 % 128;
                    if (i3 % 2 != 0) {
                        this.IAuthTabCallback.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
                        obj.hashCode();
                        throw null;
                    }
                    this.IAuthTabCallback.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
                }
                int i4 = asBinder + 67;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            onReceiveValue.onTransact(this.onWarmupCompleted, z);
            throw null;
        }

        public void onPlaybackStateChanged(int i) {
            int i2 = 2 % 2;
            int i3 = asInterface + 121;
            asBinder = i3 % 128;
            if (i3 % 2 != 0 ? i == 4 : i == 4) {
                if (this.onExtraCallbackWithResult.add(100L)) {
                    this.IAuthTabCallback.invoke(new NativeAdsEventLogType.extraCallback(100L));
                }
                this.IAuthTabCallback.invoke(NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted);
                Object[] objArr = {this.onExtraCallback, this.onNavigationEvent};
                onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -467264772, 467264778, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            }
            int i4 = asBinder + 57;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ boolean $isHalfVisible;
        final /* synthetic */ boolean $isPausedByLifecycle;
        final /* synthetic */ writeTypedObject $playable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(writeTypedObject writetypedobject, boolean z, boolean z2, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$playable = writetypedobject;
            this.$isHalfVisible = z;
            this.$isPausedByLifecycle = z2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = new access100(this.$playable, this.$isHalfVisible, this.$isPausedByLifecycle, access13800Var);
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
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
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                access100VarCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = access100VarCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            writeTypedObject writetypedobject = this.$playable;
            if (writetypedobject == null) {
                return Unit.INSTANCE;
            }
            if (!this.$isHalfVisible) {
                removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(writetypedobject);
                i = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i % 128;
            } else {
                int i5 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (!this.$isPausedByLifecycle) {
                    removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallbackWithResult(writetypedobject);
                    i = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i % 128;
                }
            }
            int i7 = i % 2;
            return Unit.INSTANCE;
        }
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ ExoPlayer $exoPlayer;
        final /* synthetic */ Set<Long> $firedPercents;
        final /* synthetic */ Set<Long> $firedSeconds;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $firedView$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isPlaying$delegate;
        final /* synthetic */ Function1<NativeAdsEventLogType, Unit> $onEvent;
        final /* synthetic */ List<NativeAdsEventLogType> $trackingData;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        getInterfaceDescriptor(ExoPlayer exoPlayer, List<? extends NativeAdsEventLogType> list, Function1<? super NativeAdsEventLogType, Unit> function1, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, Set<Long> set, Set<Long> set2, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$exoPlayer = exoPlayer;
            this.$trackingData = list;
            this.$onEvent = function1;
            this.$isPlaying$delegate = getsupportedhighspeedresolutionsfor;
            this.$firedView$delegate = getsupportedhighspeedresolutionsfor2;
            this.$firedSeconds = set;
            this.$firedPercents = set2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(this.$exoPlayer, this.$trackingData, this.$onEvent, this.$isPlaying$delegate, this.$firedView$delegate, this.$firedSeconds, this.$firedPercents, access13800Var);
            getinterfacedescriptor.L$0 = obj;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return getinterfacedescriptor;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
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
            int i3 = IAuthTabCallback + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getInterfaceDescriptor getinterfacedescriptorCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                getinterfacedescriptorCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = getinterfacedescriptorCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0187  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0074 -> B:29:0x0077). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ExoPlayer exoPlayer;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            boolean z = true;
            z = true;
            Long l = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                exoPlayer = this.$exoPlayer;
                if (exoPlayer == null) {
                    return Unit.INSTANCE;
                }
                if (!onReceiveValue.IAuthTabCallbackDefault(this.$isPlaying$delegate)) {
                    int i3 = onExtraCallback + 3;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return Unit.INSTANCE;
                    }
                    int i4 = 19 / 0;
                    return Unit.INSTANCE;
                }
                if (findRes.onWarmupCompleted(findresandmsg)) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 31;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    l.hashCode();
                    throw null;
                }
                exoPlayer = (ExoPlayer) this.L$1;
                ResultKt.onNavigationEvent(obj);
                Long lOnExtraCallback = access14000.onExtraCallback(exoPlayer.getDuration());
                if (lOnExtraCallback.longValue() <= 0) {
                    lOnExtraCallback = l;
                }
                if (lOnExtraCallback != null) {
                    long jLongValue = lOnExtraCallback.longValue();
                    long currentPosition = exoPlayer.getCurrentPosition();
                    if (!onReceiveValue.onTransact(this.$firedView$delegate) && currentPosition >= 2000) {
                        int i6 = onExtraCallback + 33;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        List<NativeAdsEventLogType> list = this.$trackingData;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((NativeAdsEventLogType) it.next()) instanceof NativeAdsEventLogType.access100) {
                                    onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this.$firedView$delegate, Boolean.valueOf(z)}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -527004642, 527004660, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                                    this.$onEvent.invoke(NativeAdsEventLogType.access100.onExtraCallbackWithResult);
                                    break;
                                }
                            }
                        }
                    }
                    long j = currentPosition / 1000;
                    long j2 = (long) ((currentPosition / jLongValue) * 100.0d);
                    List<NativeAdsEventLogType> list2 = this.$trackingData;
                    Set<Long> set = this.$firedSeconds;
                    Function1<NativeAdsEventLogType, Unit> function1 = this.$onEvent;
                    Set<Long> set2 = this.$firedPercents;
                    for (NativeAdsEventLogType nativeAdsEventLogType : list2) {
                        if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult) {
                            NativeAdsEventLogType.extraCallbackWithResult extracallbackwithresult = (NativeAdsEventLogType.extraCallbackWithResult) nativeAdsEventLogType;
                            if (j >= extracallbackwithresult.onExtraCallbackWithResult() && set.add(access14000.onExtraCallback(extracallbackwithresult.onExtraCallbackWithResult()))) {
                                function1.invoke(nativeAdsEventLogType);
                            }
                        } else if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallback) {
                            int i8 = IAuthTabCallback + 31;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                            NativeAdsEventLogType.extraCallback extracallback = (NativeAdsEventLogType.extraCallback) nativeAdsEventLogType;
                            if (j2 >= extracallback.IAuthTabCallback() && set2.add(access14000.onExtraCallback(extracallback.IAuthTabCallback()))) {
                                int i10 = onExtraCallback + 29;
                                IAuthTabCallback = i10 % 128;
                                if (i10 % 2 != 0) {
                                    function1.invoke(nativeAdsEventLogType);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                function1.invoke(nativeAdsEventLogType);
                            }
                            l = null;
                        }
                    }
                }
                l = l;
                z = true;
                if (findRes.onWarmupCompleted(findresandmsg)) {
                    this.L$0 = findresandmsg;
                    this.L$1 = exoPlayer;
                    this.label = z ? 1 : 0;
                    if (formatMsgs.onWarmupCompleted(250L, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    Long lOnExtraCallback2 = access14000.onExtraCallback(exoPlayer.getDuration());
                    if (lOnExtraCallback2.longValue() <= 0) {
                    }
                    if (lOnExtraCallback2 != null) {
                    }
                    l = l;
                    z = true;
                    if (findRes.onWarmupCompleted(findresandmsg)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private static final Unit onWarmupCompleted(Function1 function1, boolean z) {
        String str;
        int i = 2 % 2;
        if (!z) {
            int i2 = onWarmupCompleted + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            str = "201";
        } else {
            int i4 = onWarmupCompleted + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        if (str == null) {
            int i6 = onWarmupCompleted + 1;
            int i7 = i6 % 128;
            onNavigationEvent = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 125;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            str = "2005";
        }
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, boolean z) {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 99;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            if (i5 % 2 == 0) {
                str = "3002";
                int i7 = i6 + 23;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            } else {
                throw null;
            }
        } else {
            str = "301";
        }
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    private static final SafePlayerView onExtraCallbackWithResult(ExoPlayer exoPlayer, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SafePlayerView safePlayerView = new SafePlayerView(context);
        safePlayerView.setUseController(false);
        safePlayerView.setResizeMode(1);
        safePlayerView.setPlayer(exoPlayer);
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return safePlayerView;
    }

    private static final Unit onExtraCallbackWithResult(ExoPlayer exoPlayer, SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(safePlayerView, "");
        safePlayerView.setPlayer(exoPlayer);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        String str;
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        if (((Boolean) objArr[1]).booleanValue()) {
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            str = "3002";
            if (i2 % 2 != 0) {
                int i3 = 34 / 0;
            }
        } else {
            int i4 = onNavigationEvent + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            str = "301";
        }
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1000");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1002");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{13735}, 23689 / ImageFormat.getBitsPerPixel(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{13735}, 20296 - ImageFormat.getBitsPerPixel(0), objArr2);
            obj = objArr2[0];
        }
        function1.invoke(((String) obj).intern());
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (zBooleanValue) {
            function1.invoke("2500");
            int i4 = onNavigationEvent + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ExoPlayer exoPlayer = (ExoPlayer) objArr[0];
        String str = (String) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (exoPlayer == null) {
            int i5 = i3 + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        if (exoPlayer.isPlaying()) {
            exoPlayer.pause();
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, 78091604, -78091589, iOnExtraCallback3);
        } else {
            if (exoPlayer.getPlaybackState() == 4) {
                exoPlayer.seekTo(0L);
            }
            exoPlayer.play();
            int i6 = onNavigationEvent + 89;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(ExoPlayer exoPlayer, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        float f;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (exoPlayer == null) {
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        extraCallbackWithResult(getsupportedhighspeedresolutionsfor, !onActivityResized(getsupportedhighspeedresolutionsfor));
        if (onActivityResized(getsupportedhighspeedresolutionsfor)) {
            int i6 = onWarmupCompleted + 19;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        exoPlayer.setVolume(f);
        function1.invoke(onActivityResized(getsupportedhighspeedresolutionsfor) ? NativeAdsEventLogType.writeTypedObject.onExtraCallback : NativeAdsEventLogType.onPostMessage.IAuthTabCallback);
        Unit unit2 = Unit.INSTANCE;
        int i8 = onNavigationEvent + 23;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 84 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0cb1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0f80  */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final String str, final boolean z, final NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, final List<? extends NativeAdsEventLogType> list, final boolean z2, final boolean z3, final boolean z4, final Function1<? super String, Unit> function1, final Function1<? super NativeAdsEventLogType, Unit> function12, final Function1<? super String, Unit> function13, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        float f;
        float f2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        int i5;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        Object objOnMinimized;
        int i6;
        boolean z5;
        boolean zOnNavigationEvent3;
        Object objOnMinimized2;
        ExoPlayer exoPlayerIAuthTabCallback;
        int i7;
        int i8;
        int i9;
        final writeTypedObject writetypedobject;
        Set set;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        Set set2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        String str2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4;
        ExoPlayer exoPlayer;
        int i10;
        boolean z6;
        Set set3;
        boolean z7;
        int i11;
        ExoPlayer exoPlayer2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5;
        float f3;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6;
        ?? r13;
        final boolean z8;
        final Function1<? super String, Unit> function14;
        ExoPlayer exoPlayer3;
        float f4;
        boolean z9;
        ExoPlayer exoPlayer4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2;
        float f5;
        char c;
        boolean z10;
        Object obj;
        String str3;
        boolean z11;
        final Function1<? super String, Unit> function15;
        Object obj2;
        int i12;
        int i13 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(61747417);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(thumbnailBanner) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                int i14 = onWarmupCompleted + 63;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        if ((12582912 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i16 = onWarmupCompleted + 49;
            onNavigationEvent = i16 % 128;
            int i17 = i16 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(61747417, i3, i4, "im.toss.ads_sdk.ui.compose.NativeAdsThumbnailTossContent (NativeAdsThumbnail.kt:228)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            boolean zIsBlank = StringsKt.isBlank(thumbnailBanner.getInterfaceDescriptor());
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_continue_play, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int i18 = i4;
            final String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_continue_replay, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (z) {
                int i19 = onWarmupCompleted + 7;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                f = 1.91f;
            } else {
                f = 1.7777778f;
            }
            if (!zIsBlank) {
                f = 1.7777778f;
            }
            float f6 = f;
            String strIAuthTabCallback = thumbnailBanner.IAuthTabCallback();
            String interfaceDescriptor = thumbnailBanner.getInterfaceDescriptor();
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent4 | zOnNavigationEvent5) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(thumbnailBanner.IAuthTabCallback());
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent6 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                f2 = f6;
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                objOnMinimized4 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
            } else {
                f2 = f6;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(thumbnailBanner.IAuthTabCallback());
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent7) {
                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor8;
                i5 = 2;
            } else {
                int i21 = onNavigationEvent + 71;
                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor8;
                onWarmupCompleted = i21 % 128;
                i5 = 2;
                int i22 = i21 % 2;
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(thumbnailBanner.IAuthTabCallback());
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(strOnExtraCallback, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                String interfaceDescriptor2 = thumbnailBanner.getInterfaceDescriptor();
                i6 = i3 & 112;
                z5 = i6 != 32;
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor2);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent3 | z5) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new LinkedHashSet();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                Set set4 = (Set) objOnMinimized2;
                String interfaceDescriptor3 = thumbnailBanner.getInterfaceDescriptor();
                if (i6 != 32) {
                    int i23 = onNavigationEvent + 89;
                    onWarmupCompleted = i23 % 128;
                    boolean z12 = i23 % 2 != 0;
                    boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor3);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnNavigationEvent8 | z12) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized6 = new LinkedHashSet();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                    }
                    final Set set5 = (Set) objOnMinimized6;
                    String interfaceDescriptor4 = thumbnailBanner.getInterfaceDescriptor();
                    boolean z13 = i6 == 32;
                    boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor4);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnNavigationEvent9 | z13) || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted3);
                        objOnMinimized7 = getsupportedhighspeedresolutionsforOnWarmupCompleted3;
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = (getSupportedHighSpeedResolutionsFor) objOnMinimized7;
                    String interfaceDescriptor5 = thumbnailBanner.getInterfaceDescriptor();
                    String strOnTransact = thumbnailBanner.onTransact();
                    boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor5);
                    boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnTransact);
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnNavigationEvent10 | zOnNavigationEvent11) || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        if (zIsBlank) {
                            exoPlayerIAuthTabCallback = null;
                        } else {
                            CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
                            exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, (String) null, new DefaultLoadControl.Builder().setPrioritizeTimeOverSizeThresholds(true).setBufferDurationsMs(2500, 5000, 2500, 2500).build(), (Function1) null, (Function1) null, 26, (Object) null);
                            String interfaceDescriptor6 = thumbnailBanner.getInterfaceDescriptor();
                            if (StringsKt.isBlank(interfaceDescriptor6)) {
                                int i24 = onWarmupCompleted + 47;
                                onNavigationEvent = i24 % 128;
                                int i25 = i24 % 2;
                                interfaceDescriptor6 = thumbnailBanner.onTransact();
                            }
                            if (!StringsKt.isBlank(interfaceDescriptor6)) {
                                CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayerIAuthTabCallback, context, interfaceDescriptor6, false, new access000(function1, interfaceDescriptor6), 4, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                            }
                            exoPlayerIAuthTabCallback.prepare();
                            exoPlayerIAuthTabCallback.setVolume(0.0f);
                            exoPlayerIAuthTabCallback.setPlayWhenReady(false);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(exoPlayerIAuthTabCallback);
                        objOnMinimized8 = exoPlayerIAuthTabCallback;
                    }
                    final ExoPlayer exoPlayer5 = (ExoPlayer) objOnMinimized8;
                    boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(exoPlayer5);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent12 || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        writeTypedObject writetypedobject2 = exoPlayer5 == null ? null : new writeTypedObject(exoPlayer5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(writetypedobject2);
                        objOnMinimized9 = writetypedobject2;
                    }
                    writeTypedObject writetypedobject3 = (writeTypedObject) objOnMinimized9;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer5);
                    boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor7);
                    boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor9);
                    int i26 = i3 & 1879048192;
                    boolean z14 = i26 == 536870912;
                    boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(set5);
                    boolean zOnNavigationEvent16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor10);
                    boolean zOnNavigationEvent17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback2);
                    Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((zOnExtraCallback | zOnNavigationEvent13 | zOnNavigationEvent14 | z14 | zOnNavigationEvent15 | zOnNavigationEvent16) || zOnNavigationEvent17) || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        i7 = i18;
                        i8 = i3;
                        i9 = i26;
                        writetypedobject = writetypedobject3;
                        set = set4;
                        getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor7;
                        set2 = set5;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor11;
                        str2 = strOnExtraCallback;
                        getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor9;
                        exoPlayer = exoPlayer5;
                        Function1 function16 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda8
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj3) {
                                int i27 = 2 % 2;
                                int i28 = onNavigationEvent + 61;
                                onExtraCallbackWithResult = i28 % 128;
                                int i29 = i28 % 2;
                                ExoPlayer exoPlayer6 = exoPlayer5;
                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = getsupportedhighspeedresolutionsfor7;
                                if (i29 != 0) {
                                    Object[] objArr = {exoPlayer6, getsupportedhighspeedresolutionsfor12, function12, getsupportedhighspeedresolutionsfor9, set5, strOnExtraCallback2, getsupportedhighspeedresolutionsfor10, (isInVideoUsage) obj3};
                                    return (decrementVideoUsage) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1146742097, 1146742113, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                                }
                                Object[] objArr2 = {exoPlayer6, getsupportedhighspeedresolutionsfor12, function12, getsupportedhighspeedresolutionsfor9, set5, strOnExtraCallback2, getsupportedhighspeedresolutionsfor10, (isInVideoUsage) obj3};
                                int i30 = 83 / 0;
                                return (decrementVideoUsage) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1146742097, 1146742113, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function16);
                        objOnMinimized10 = function16;
                    } else {
                        i9 = i26;
                        i8 = i3;
                        getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor7;
                        set2 = set5;
                        getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor11;
                        i7 = i18;
                        str2 = strOnExtraCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor9;
                        exoPlayer = exoPlayer5;
                        writetypedobject = writetypedobject3;
                        set = set4;
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(exoPlayer, (Function1) objOnMinimized10, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    boolean zOnNavigationEvent18 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(writetypedobject);
                    Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (zOnNavigationEvent18 || objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized11 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda13
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3) {
                                int i27 = 2 % 2;
                                int i28 = onExtraCallbackWithResult + 97;
                                onWarmupCompleted = i28 % 128;
                                int i29 = i28 % 2;
                                decrementVideoUsage decrementvideousageOnExtraCallback = onReceiveValue.onExtraCallback(writetypedobject, (isInVideoUsage) obj3);
                                int i30 = onWarmupCompleted + 55;
                                onExtraCallbackWithResult = i30 % 128;
                                int i31 = i30 % 2;
                                return decrementvideousageOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized11);
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(writetypedobject, (Function1) objOnMinimized11, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    Object[] objArr = {Boolean.valueOf(z3), Boolean.valueOf(z2), Boolean.valueOf(z4), writetypedobject};
                    boolean zOnNavigationEvent19 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(writetypedobject);
                    boolean z15 = (3670016 & i8) == 1048576;
                    boolean z16 = (29360128 & i8) == 8388608;
                    Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!(!(zOnNavigationEvent19 | z15 | z16)) || objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized12 = new access100(writetypedobject, z3, z4, null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized12);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    boolean zOnMessageChannelReady = onMessageChannelReady(getsupportedhighspeedresolutionsfor4);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(exoPlayer);
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = getsupportedhighspeedresolutionsfor4;
                    boolean zOnNavigationEvent20 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor12);
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor13 = getsupportedhighspeedresolutionsfor3;
                    boolean zOnNavigationEvent21 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor13);
                    if ((57344 & i8) == 16384) {
                        z6 = true;
                        i10 = i9;
                    } else {
                        i10 = i9;
                        z6 = false;
                    }
                    if (i10 == 536870912) {
                        z7 = true;
                        set3 = set;
                    } else {
                        set3 = set;
                        z7 = false;
                    }
                    boolean zOnNavigationEvent22 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(set3);
                    Set set6 = set2;
                    boolean zOnNavigationEvent23 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(set6);
                    int i27 = i10;
                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (((z6 | zOnExtraCallback2 | zOnNavigationEvent20 | zOnNavigationEvent21 | z7 | zOnNavigationEvent22) || zOnNavigationEvent23) || objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        i11 = i27;
                        exoPlayer2 = exoPlayer;
                        getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor12;
                        f3 = f2;
                        getsupportedhighspeedresolutionsfor6 = getsupportedhighspeedresolutionsfor;
                        r13 = 0;
                        getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(exoPlayer, list, function12, getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor13, set3, set6, null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(getinterfacedescriptor);
                        objOnMinimized13 = getinterfacedescriptor;
                    } else {
                        exoPlayer2 = exoPlayer;
                        f3 = f2;
                        getsupportedhighspeedresolutionsfor6 = getsupportedhighspeedresolutionsfor;
                        i11 = i27;
                        r13 = 0;
                        getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor12;
                    }
                    isZslDisabledByByUserCaseConfig.IAuthTabCallback(Boolean.valueOf(zOnMessageChannelReady), exoPlayer2, list, (Function2) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResult2, (i8 >> 6) & 896);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, f3, (boolean) r13, 2, (Object) null);
                    setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), (boolean) r13);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, (int) r13));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
                    HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda22 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    if (zIsBlank) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1184526760);
                        String strOnTransact2 = thumbnailBanner.onTransact();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                        Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized14 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized14);
                        }
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized14;
                        boolean z17 = (i7 & 14) == 4 ? true : r13;
                        boolean z18 = (i8 & 896) == 256 ? true : r13;
                        Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if ((z17 || z18) || objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
                            z8 = z;
                            function15 = function13;
                            Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda14
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke() {
                                    int i28 = 2 % 2;
                                    int i29 = onExtraCallback + 31;
                                    onNavigationEvent = i29 % 128;
                                    int i30 = i29 % 2;
                                    Unit unitOnExtraCallback = onReceiveValue.onExtraCallback(function15, z8);
                                    int i31 = onNavigationEvent + 87;
                                    onExtraCallback = i31 % 128;
                                    int i32 = i31 % 2;
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0);
                            obj2 = function0;
                        } else {
                            z8 = z;
                            function15 = function13;
                            obj2 = objOnMinimized15;
                        }
                        AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{strOnTransact2, measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj2, 28, (Object) null), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult2, 100663680, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                        exoPlayer3 = exoPlayer2;
                        function14 = function15;
                        f4 = 0.0f;
                    } else {
                        z8 = z;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1185142172);
                        final ExoPlayer exoPlayer6 = exoPlayer2;
                        if (exoPlayer6 != null) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1185172459);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                            Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized16 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized16 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized16);
                            }
                            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized16;
                            boolean z19 = (i7 & 14) == 4;
                            boolean z20 = (i8 & 896) == 256;
                            Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!(z19 | z20)) {
                                Object obj3 = objOnMinimized17;
                                if (objOnMinimized17 == onwarmupcompleted2.onExtraCallback()) {
                                    Function0 function02 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda15
                                        private static int IAuthTabCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke() {
                                            Unit unitIAuthTabCallback;
                                            int i28 = 2 % 2;
                                            int i29 = IAuthTabCallback + 111;
                                            onWarmupCompleted = i29 % 128;
                                            if (i29 % 2 == 0) {
                                                unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(function13, z8);
                                                int i30 = 3 / 0;
                                            } else {
                                                unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(function13, z8);
                                            }
                                            int i31 = IAuthTabCallback + 103;
                                            onWarmupCompleted = i31 % 128;
                                            if (i31 % 2 != 0) {
                                                return unitIAuthTabCallback;
                                            }
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function02);
                                    obj3 = function02;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj3, 28, (Object) null);
                                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(exoPlayer6);
                                Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (!zOnExtraCallback3) {
                                    Object obj4 = objOnMinimized18;
                                    if (objOnMinimized18 == onwarmupcompleted2.onExtraCallback()) {
                                        Function1 function17 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda16
                                            private static int IAuthTabCallback = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke(Object obj5) {
                                                int i28 = 2 % 2;
                                                int i29 = IAuthTabCallback + 41;
                                                onNavigationEvent = i29 % 128;
                                                if (i29 % 2 != 0) {
                                                    onReceiveValue.onWarmupCompleted(exoPlayer6, (Context) obj5);
                                                    Object obj6 = null;
                                                    obj6.hashCode();
                                                    throw null;
                                                }
                                                SafePlayerView safePlayerViewOnWarmupCompleted = onReceiveValue.onWarmupCompleted(exoPlayer6, (Context) obj5);
                                                int i30 = IAuthTabCallback + 53;
                                                onNavigationEvent = i30 % 128;
                                                int i31 = i30 % 2;
                                                return safePlayerViewOnWarmupCompleted;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function17);
                                        obj4 = function17;
                                    }
                                    Function1 function18 = (Function1) obj4;
                                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(exoPlayer6);
                                    Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (!zOnExtraCallback4) {
                                        int i28 = onWarmupCompleted + 97;
                                        onNavigationEvent = i28 % 128;
                                        int i29 = i28 % 2;
                                        Object obj5 = objOnMinimized19;
                                        if (objOnMinimized19 == onwarmupcompleted2.onExtraCallback()) {
                                            Function1 function19 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda17
                                                private static int IAuthTabCallback = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj6) {
                                                    int i30 = 2 % 2;
                                                    int i31 = IAuthTabCallback + 17;
                                                    onWarmupCompleted = i31 % 128;
                                                    int i32 = i31 % 2;
                                                    Unit unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(exoPlayer6, (SafePlayerView) obj6);
                                                    int i33 = IAuthTabCallback + 67;
                                                    onWarmupCompleted = i33 % 128;
                                                    int i34 = i33 % 2;
                                                    return unitIAuthTabCallback;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function19);
                                            obj5 = function19;
                                        }
                                        function14 = function13;
                                        exoPlayer3 = exoPlayer6;
                                        f4 = 0.0f;
                                        CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function18, quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) obj5, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    }
                                }
                            }
                        } else {
                            function14 = function13;
                            exoPlayer3 = exoPlayer6;
                            f4 = 0.0f;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1186008963);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        if (((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1884446660, -1884446657, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1186084169);
                            String strAccess100 = thumbnailBanner.access100();
                            if (strAccess100 == null) {
                                strAccess100 = thumbnailBanner.onTransact();
                            }
                            String str4 = strAccess100;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, f4, 1, (Object) null);
                            Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted3 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized20 == onwarmupcompleted3.onExtraCallback()) {
                                objOnMinimized20 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized20);
                            }
                            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized20;
                            boolean z21 = (i7 & 14) == 4;
                            if ((i8 & 896) == 256) {
                                int i30 = onNavigationEvent + 11;
                                onWarmupCompleted = i30 % 128;
                                int i31 = i30 % 2;
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!(z21 | z9)) {
                                Object obj6 = objOnMinimized21;
                                if (objOnMinimized21 == onwarmupcompleted3.onExtraCallback()) {
                                    Function0 function03 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda18
                                        private static int onNavigationEvent = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke() {
                                            int i32 = 2 % 2;
                                            int i33 = onWarmupCompleted + 19;
                                            onNavigationEvent = i33 % 128;
                                            int i34 = i33 % 2;
                                            Unit unitOnNavigationEvent = onReceiveValue.onNavigationEvent(function14, z8);
                                            int i35 = onWarmupCompleted + 5;
                                            onNavigationEvent = i35 % 128;
                                            if (i35 % 2 == 0) {
                                                return unitOnNavigationEvent;
                                            }
                                            Object obj7 = null;
                                            obj7.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function03);
                                    obj6 = function03;
                                }
                                AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{str4, measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent3, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj6, 28, (Object) null), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult2, 100663680, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1186707331);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, f4, 1, (Object) null), onextracallbackwithresult2.onWarmupCompleted());
                    readFully.onExtraCallback onextracallback = readFully.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(verifyDrawable.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted2, readFully.onExtraCallback.onWarmupCompleted(onextracallback, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault()), setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallbackWithResult(2566914048L))}), 0.0f, 0.0f, 0, 14, (Object) null), (toMetersPerSecond) null, 0.0f, 6, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent4);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                    if (z8 && zIsBlank) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-800149701);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(quirksExternalSyntheticBackport03, onextracallbackwithresult2.onNavigationEvent()), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f), 0.0f, 11, (Object) null);
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback2);
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback3);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult3.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        String strAsInterface = thumbnailBanner.asInterface();
                        long jAsBinder = onextracallbackwithresult.asBinder();
                        GraphicDeviceInfo graphicDeviceInfoIAuthTabCallback = GraphicDeviceInfo.Companion.IAuthTabCallback();
                        long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(19);
                        Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted4 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized22 == onwarmupcompleted4.onExtraCallback()) {
                            objOnMinimized22 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized22);
                        }
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized22;
                        int i32 = i7 & 14;
                        if (i32 == 4) {
                            exoPlayer4 = exoPlayer3;
                            z11 = true;
                        } else {
                            exoPlayer4 = exoPlayer3;
                            z11 = false;
                        }
                        Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (!z11) {
                            Object obj7 = objOnMinimized23;
                            if (objOnMinimized23 == onwarmupcompleted4.onExtraCallback()) {
                                Function0 function04 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda19
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke() {
                                        int i33 = 2 % 2;
                                        int i34 = onExtraCallbackWithResult + 103;
                                        onNavigationEvent = i34 % 128;
                                        int i35 = i34 % 2;
                                        Unit unitOnExtraCallbackWithResult = onReceiveValue.onExtraCallbackWithResult(function14);
                                        int i36 = onNavigationEvent + 27;
                                        onExtraCallbackWithResult = i36 % 128;
                                        int i37 = i36 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function04);
                                obj7 = function04;
                            }
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport03, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj7, 28, (Object) null), null, Long.valueOf(jAsBinder), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallback, null, cameraCaptureResultEmptyCameraCaptureResult2, 27648, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            String strIAuthTabCallbackStub = thumbnailBanner.IAuthTabCallbackStub();
                            long jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(2583691263L);
                            long jOnExtraCallback2 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 13, (Object) null);
                            Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (objOnMinimized24 == onwarmupcompleted4.onExtraCallback()) {
                                objOnMinimized24 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized24);
                            }
                            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized24;
                            boolean z22 = i32 == 4;
                            Object objOnMinimized25 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!z22) {
                                Object obj8 = objOnMinimized25;
                                if (objOnMinimized25 == onwarmupcompleted4.onExtraCallback()) {
                                    Function0 function05 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda20
                                        private static int onExtraCallback = 0;
                                        private static int onExtraCallbackWithResult = 1;

                                        public final Object invoke() {
                                            int i33 = 2 % 2;
                                            int i34 = onExtraCallback + 23;
                                            onExtraCallbackWithResult = i34 % 128;
                                            if (i34 % 2 == 0) {
                                                onReceiveValue.IAuthTabCallback(function14);
                                                throw null;
                                            }
                                            Unit unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(function14);
                                            int i35 = onExtraCallback + 3;
                                            onExtraCallbackWithResult = i35 % 128;
                                            int i36 = i35 % 2;
                                            return unitIAuthTabCallback;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function05);
                                    obj8 = function05;
                                }
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub, measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback3, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj8, 28, (Object) null), null, Long.valueOf(jOnExtraCallbackWithResult), Long.valueOf(jOnExtraCallback2), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 27648, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                        }
                    } else {
                        exoPlayer4 = exoPlayer3;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-798917699);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(quirksExternalSyntheticBackport03, onextracallbackwithresult2.IAuthTabCallback());
                    int i33 = i7 & 14;
                    boolean z23 = i33 == 4;
                    Object objOnMinimized26 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (z23 || objOnMinimized26 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized26 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda21
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke() throws Throwable {
                                int i34 = 2 % 2;
                                int i35 = onExtraCallback + 95;
                                IAuthTabCallback = i35 % 128;
                                int i36 = i35 % 2;
                                Unit unitOnWarmupCompleted = onReceiveValue.onWarmupCompleted(function14);
                                int i37 = onExtraCallback + 23;
                                IAuthTabCallback = i37 % 128;
                                if (i37 % 2 != 0) {
                                    int i38 = 92 / 0;
                                }
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized26);
                    }
                    IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted5, (Function0) objOnMinimized26, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    String strAsBinder = thumbnailBanner.asBinder();
                    if (strAsBinder == null || StringsKt.isBlank(strAsBinder)) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1189022659);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1188680233);
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{thumbnailBanner.asBinder(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(quirksExternalSyntheticBackport03, onextracallbackwithresult2.getInterfaceDescriptor()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 9, (Object) null), null, Long.valueOf(ByteOrderedDataOutputStream.onExtraCallbackWithResult(2164260863L)), Long.valueOf(thumbnailBanner.asBinder().length() > 60 ? RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(6) : RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(8)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    if (StringsKt.isBlank(thumbnailBanner.IAuthTabCallbackDefault())) {
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        f5 = 0.0f;
                        c = 2;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1190018627);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1189104716);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda22.onWarmupCompleted(quirksExternalSyntheticBackport03, onextracallbackwithresult2.access100()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 12, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f)), AppLovinRtbRewardedRenderer.onWarmupCompleted()), onextracallbackwithresult.asBinder(), (toMetersPerSecond) null, 2, (Object) null);
                        component5 component5VarOnWarmupCompleted3 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                        int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback4);
                        Function0 function0IAuthTabCallback4 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback4);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted3, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult3.onTransact());
                        String strIAuthTabCallbackDefault = thumbnailBanner.IAuthTabCallbackDefault();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent5 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null);
                        Object objOnMinimized27 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted5 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized27 == onwarmupcompleted5.onExtraCallback()) {
                            objOnMinimized27 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized27);
                        }
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda26 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized27;
                        boolean z24 = (i8 & 896) == 256;
                        boolean z25 = i33 == 4;
                        Object objOnMinimized28 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (!(z25 | z24)) {
                            Object obj9 = objOnMinimized28;
                            if (objOnMinimized28 == onwarmupcompleted5.onExtraCallback()) {
                                Function0 function06 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda9
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i34 = 2 % 2;
                                        int i35 = onExtraCallbackWithResult + 93;
                                        onNavigationEvent = i35 % 128;
                                        int i36 = i35 % 2;
                                        Unit unitOnExtraCallback = onReceiveValue.onExtraCallback(z8, function14);
                                        int i37 = onNavigationEvent + 69;
                                        onExtraCallbackWithResult = i37 % 128;
                                        if (i37 % 2 == 0) {
                                            return unitOnExtraCallback;
                                        }
                                        Object obj10 = null;
                                        obj10.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function06);
                                obj9 = function06;
                            }
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                            c = 2;
                            f5 = 0.0f;
                            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{strIAuthTabCallbackDefault, measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent5, camera2CapturePipelineTorchTaskExternalSyntheticLambda26, (getSubtitle) null, z, (String) null, (Role) null, (Function0) obj9, 24, (Object) null), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult2, 100663680, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    }
                    if (zIsBlank) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1193423171);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1190147122);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent6 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, f5, 1, (Object) null);
                        component5 component5VarOnWarmupCompleted4 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                        int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent6);
                        Function0 function0IAuthTabCallback5 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            int i34 = onNavigationEvent + 35;
                            onWarmupCompleted = i34 % 128;
                            if (i34 % 2 == 0) {
                                getAwbState.onExtraCallback();
                                throw null;
                            }
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback5);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnWarmupCompleted4, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult3.onTransact());
                        if (onMessageChannelReady(getsupportedhighspeedresolutionsfor5)) {
                            z10 = true;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2122697111);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2124142455);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent7 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, f5, 1, (Object) null);
                            setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3422552064L));
                            setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallbackWithResult(2147483648L));
                            setByteOrder setbyteorderOnNavigationEvent3 = setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(0));
                            setByteOrder[] setbyteorderArr = new setByteOrder[3];
                            setbyteorderArr[0] = setbyteorderOnNavigationEvent;
                            z10 = true;
                            setbyteorderArr[1] = setbyteorderOnNavigationEvent2;
                            setbyteorderArr[c] = setbyteorderOnNavigationEvent3;
                            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent7, readFully.onExtraCallback.onWarmupCompleted(onextracallback, CollectionsKt.listOf(setbyteorderArr), 0L, 0.0f, 0, 14, (Object) null), (toMetersPerSecond) null, 0.0f, 6, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted8 = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult2.onExtraCallback());
                            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult2.onTransact(), cameraCaptureResultEmptyCameraCaptureResult2, 48);
                            int iHashCode6 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted9 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnWarmupCompleted8);
                            Function0 function0IAuthTabCallback6 = onextracallbackwithresult3.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback6);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, component5VarOnNavigationEvent2, onextracallbackwithresult3.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6, onextracallbackwithresult3.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, Integer.valueOf(iHashCode6), onextracallbackwithresult3.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, onextracallbackwithresult3.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, quirksExternalSyntheticBackport0OnWarmupCompleted9, onextracallbackwithresult3.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            AppLovinNativeAdImplc.onExtraCallback(Integer.valueOf(R.drawable.ads_sdk_thumbnail_icon_play_round_mono), onextracallbackwithresult.asBinder(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)), (String) null, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult2, 3504, 1008);
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{extraCallbackWithResult((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor10), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 13, (Object) null), null, Long.valueOf(onextracallbackwithresult.asBinder()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(19)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(f5), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult2, 27696, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult2.onExtraCallback()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(130.0f));
                        Object objOnMinimized29 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted6 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized29 == onwarmupcompleted6.onExtraCallback()) {
                            objOnMinimized29 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized29);
                        }
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda27 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized29;
                        final ExoPlayer exoPlayer7 = exoPlayer4;
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(exoPlayer7);
                        boolean zOnNavigationEvent24 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor10);
                        final String str5 = str2;
                        boolean zOnNavigationEvent25 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str5);
                        Object objOnMinimized30 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (!(zOnExtraCallback5 | zOnNavigationEvent24 | zOnNavigationEvent25)) {
                            Object obj10 = objOnMinimized30;
                            if (objOnMinimized30 == onwarmupcompleted6.onExtraCallback()) {
                                Function0 function07 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda10
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke() {
                                        int i35 = 2 % 2;
                                        int i36 = onExtraCallback + 5;
                                        onNavigationEvent = i36 % 128;
                                        int i37 = i36 % 2;
                                        Unit unitOnExtraCallback = onReceiveValue.onExtraCallback(exoPlayer7, str5, getsupportedhighspeedresolutionsfor10);
                                        int i38 = onExtraCallback + 7;
                                        onNavigationEvent = i38 % 128;
                                        if (i38 % 2 != 0) {
                                            int i39 = 70 / 0;
                                        }
                                        return unitOnExtraCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function07);
                                obj10 = function07;
                            }
                            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, camera2CapturePipelineTorchTaskExternalSyntheticLambda27, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj10, 28, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(quirksExternalSyntheticBackport02, onextracallbackwithresult2.onNavigationEvent()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 6, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f)), ByteOrderedDataOutputStream.onExtraCallback(1711276032), RoundedCornerShapeKt.onWarmupCompleted());
                            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(exoPlayer7);
                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor14 = getsupportedhighspeedresolutionsfor6;
                            boolean zOnNavigationEvent26 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor14);
                            boolean z26 = i11 == 536870912 ? z10 : false;
                            Object objOnMinimized31 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (((zOnExtraCallback6 | zOnNavigationEvent26) || z26) || objOnMinimized31 == onwarmupcompleted6.onExtraCallback()) {
                                Function0 function08 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda11
                                    private static int onExtraCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i35 = 2 % 2;
                                        int i36 = onNavigationEvent + 55;
                                        onExtraCallback = i36 % 128;
                                        int i37 = i36 % 2;
                                        Unit unitOnExtraCallbackWithResult = onReceiveValue.onExtraCallbackWithResult(exoPlayer7, function12, getsupportedhighspeedresolutionsfor14);
                                        int i38 = onExtraCallback + 121;
                                        onNavigationEvent = i38 % 128;
                                        if (i38 % 2 == 0) {
                                            int i39 = 15 / 0;
                                        }
                                        return unitOnExtraCallbackWithResult;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function08);
                                obj = function08;
                            } else {
                                obj = objOnMinimized31;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 15, (Object) null);
                            component5 component5VarOnWarmupCompleted5 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), false);
                            int iHashCode7 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject7 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted10 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback5);
                            Function0 function0IAuthTabCallback7 = onextracallbackwithresult3.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback7);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, component5VarOnWarmupCompleted5, onextracallbackwithresult3.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject7, onextracallbackwithresult3.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, Integer.valueOf(iHashCode7), onextracallbackwithresult3.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, onextracallbackwithresult3.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, quirksExternalSyntheticBackport0OnWarmupCompleted10, onextracallbackwithresult3.onTransact());
                            if (onActivityResized(getsupportedhighspeedresolutionsfor14)) {
                                int i35 = onWarmupCompleted + 95;
                                onNavigationEvent = i35 % 128;
                                int i36 = i35 % 2;
                                str3 = "M";
                            } else {
                                str3 = "S";
                            }
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str3, null, null, Long.valueOf(onextracallbackwithresult.asBinder()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(12)), 0L, null, null, null, Float.valueOf(f5), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 27648, 0, 131046}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, i5, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted4);
            objOnMinimized5 = getsupportedhighspeedresolutionsforOnWarmupCompleted4;
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor92 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(thumbnailBanner.IAuthTabCallback());
            zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(strOnExtraCallback, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor102 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                String interfaceDescriptor22 = thumbnailBanner.getInterfaceDescriptor();
                i6 = i3 & 112;
                if (i6 != 32) {
                }
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor22);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent3 | z5)) {
                    objOnMinimized2 = new LinkedHashSet();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    Set set42 = (Set) objOnMinimized2;
                    String interfaceDescriptor32 = thumbnailBanner.getInterfaceDescriptor();
                    if (i6 != 32) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj11, Object obj12) {
                    int i37 = 2 % 2;
                    int i38 = onExtraCallbackWithResult + 59;
                    IAuthTabCallback = i38 % 128;
                    int i39 = i38 % 2;
                    Unit unitOnExtraCallbackWithResult = onReceiveValue.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, z, thumbnailBanner, list, z2, z3, z4, function1, function12, function13, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj11, ((Integer) obj12).intValue());
                    int i40 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i40 % 128;
                    if (i40 % 2 == 0) {
                        int i41 = 82 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    public static final class onWarmupCompleted implements getScaleX.onWarmupCompleted {
        private static int asBinder = 1;
        private static int asInterface;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<NativeAd> IAuthTabCallback;
        final /* synthetic */ NativeAdsManager onExtraCallback;
        final /* synthetic */ Function1<Boolean, Unit> onExtraCallbackWithResult;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ NativeAdsDto.Creative.ThumbnailBanner onTransact;
        final /* synthetic */ Function0<Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Function1<? super Boolean, Unit> function1, NativeAdsManager nativeAdsManager, String str, getSupportedHighSpeedResolutionsFor<NativeAd> getsupportedhighspeedresolutionsfor, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, Function0<Unit> function0) {
            this.onExtraCallbackWithResult = function1;
            this.onExtraCallback = nativeAdsManager;
            this.onNavigationEvent = str;
            this.IAuthTabCallback = getsupportedhighspeedresolutionsfor;
            this.onTransact = thumbnailBanner;
            this.onWarmupCompleted = function0;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void IAuthTabCallback(NativeAd nativeAd) {
            int i = 2 % 2;
            int i2 = asBinder + 1;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAd, "");
            this.onExtraCallbackWithResult.invoke(Boolean.FALSE);
            NativeAdsManager nativeAdsManager = this.onExtraCallback;
            String str = this.onNavigationEvent;
            ExposureContent.Companion companion = ExposureContent.Companion;
            nativeAdsManager.onWarmupCompleted(str, "LOAD", companion.onExtraCallback(nativeAd));
            NativeAdsManager.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, "ADMOB", (String) null, (AdMobFailedReason) null, companion.onExtraCallback(nativeAd), 12, (Object) null);
            this.onExtraCallback.onExtraCallback(this.onNavigationEvent, nativeAd);
            onReceiveValue.onExtraCallbackWithResult(this.IAuthTabCallback, nativeAd);
            int i4 = asInterface + 75;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onWarmupCompleted(NativeAd nativeAd) {
            int i = 2 % 2;
            int i2 = asInterface + 105;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                this.onExtraCallback.onWarmupCompleted(this.onNavigationEvent, "CLICK", ExposureContent.Companion.onExtraCallback(nativeAd));
                throw null;
            }
            Intrinsics.checkNotNullParameter(nativeAd, "");
            this.onExtraCallback.onWarmupCompleted(this.onNavigationEvent, "CLICK", ExposureContent.Companion.onExtraCallback(nativeAd));
            int i3 = asBinder + 9;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onWarmupCompleted(NativeAd nativeAd, ExposureContent exposureContent) {
            int i = 2 % 2;
            int i2 = asBinder + 67;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                Intrinsics.checkNotNullParameter(exposureContent, "");
                this.onExtraCallback.onWarmupCompleted(this.onNavigationEvent, "PAID", exposureContent);
                int i3 = 65 / 0;
            } else {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                Intrinsics.checkNotNullParameter(exposureContent, "");
                this.onExtraCallback.onWarmupCompleted(this.onNavigationEvent, "PAID", exposureContent);
            }
            int i4 = asBinder + 41;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onNavigationEvent(ExposureContent exposureContent, AdMobFailedReason adMobFailedReason, boolean z) {
            int i = 2 % 2;
            int i2 = asBinder + 119;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(exposureContent, "");
                Intrinsics.checkNotNullParameter(adMobFailedReason, "");
                this.onExtraCallback.onWarmupCompleted(this.onNavigationEvent, "AD_FILTERED", exposureContent);
                throw null;
            }
            Intrinsics.checkNotNullParameter(exposureContent, "");
            Intrinsics.checkNotNullParameter(adMobFailedReason, "");
            this.onExtraCallback.onWarmupCompleted(this.onNavigationEvent, "AD_FILTERED", exposureContent);
            if (z) {
                this.onExtraCallbackWithResult.invoke(Boolean.FALSE);
                if (!StringsKt.startsWith$default(this.onTransact.IAuthTabCallback(), "admob_shell_", false, 2, (Object) null)) {
                    NativeAdsManager.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, "TOSS", (String) null, adMobFailedReason, (ExposureContent) null, 20, (Object) null);
                } else {
                    int i3 = asInterface + 119;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    NativeAdsManager.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, (String) null, "NO_AD", adMobFailedReason, (ExposureContent) null, 16, (Object) null);
                }
                this.onWarmupCompleted.invoke();
            }
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void onWarmupCompleted(String str, boolean z) {
            int i = 2 % 2;
            int i2 = asInterface + 79;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                NativeAdsManager.IAuthTabCallback(this.onExtraCallback, this.onNavigationEvent, "FAILED_TO_LOAD", (ExposureContent) null, 2, (Object) null);
                if (!z) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                NativeAdsManager.IAuthTabCallback(this.onExtraCallback, this.onNavigationEvent, "FAILED_TO_LOAD", (ExposureContent) null, 4, (Object) null);
                if (!z) {
                    return;
                }
            }
            this.onExtraCallbackWithResult.invoke(Boolean.FALSE);
            if (StringsKt.startsWith$default(this.onTransact.IAuthTabCallback(), "admob_shell_", false, 2, (Object) null)) {
                NativeAdsManager.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, (String) null, "NO_AD", new AdMobFailedReason("NO_AD", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), (ExposureContent) null, 16, (Object) null);
            } else {
                NativeAdsManager.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, "TOSS", (String) null, new AdMobFailedReason("NO_AD", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), (ExposureContent) null, 20, (Object) null);
            }
            this.onWarmupCompleted.invoke();
            int i3 = asInterface + 95;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.getScaleX.onWarmupCompleted
        public void IAuthTabCallback() {
            int i = 2 % 2;
            NativeAdsManager.IAuthTabCallback(this.onExtraCallback, this.onNavigationEvent, "TIMEOUT", (ExposureContent) null, 4, (Object) null);
            this.onExtraCallbackWithResult.invoke(Boolean.FALSE);
            if (StringsKt.startsWith$default(this.onTransact.IAuthTabCallback(), "admob_shell_", false, 2, (Object) null)) {
                NativeAdsManager.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, (String) null, "NO_AD", new AdMobFailedReason("TIMEOUT", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), (ExposureContent) null, 16, (Object) null);
            } else {
                NativeAdsManager.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, "TOSS", (String) null, new AdMobFailedReason("TIMEOUT", (List) null, (String) null, (AdmobError) null, 14, (DefaultConstructorMarker) null), (ExposureContent) null, 20, (Object) null);
                int i2 = asInterface + 7;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
            }
            this.onWarmupCompleted.invoke();
            int i4 = asInterface + 47;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 35 / 0;
            }
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $hasTrackedImpression$delegate;
        final /* synthetic */ boolean $isContentLoading;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isForcePause$delegate;
        final /* synthetic */ boolean $isHalfVisible;
        final /* synthetic */ NativeAdsManager $manager;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<NativeAd> $nativeAd$delegate;
        final /* synthetic */ String $requestId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, boolean z2, NativeAdsManager nativeAdsManager, String str, getSupportedHighSpeedResolutionsFor<NativeAd> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$isHalfVisible = z;
            this.$isContentLoading = z2;
            this.$manager = nativeAdsManager;
            this.$requestId = str;
            this.$nativeAd$delegate = getsupportedhighspeedresolutionsfor;
            this.$hasTrackedImpression$delegate = getsupportedhighspeedresolutionsfor2;
            this.$isForcePause$delegate = getsupportedhighspeedresolutionsfor3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$isHalfVisible, this.$isContentLoading, this.$manager, this.$requestId, this.$nativeAd$delegate, this.$hasTrackedImpression$delegate, this.$isForcePause$delegate, access13800Var);
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            VideoController videoController;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            NativeAd nativeAdOnWarmupCompleted = onReceiveValue.onWarmupCompleted(this.$nativeAd$delegate);
            if (nativeAdOnWarmupCompleted == null) {
                return Unit.INSTANCE;
            }
            if (!this.$isHalfVisible || this.$isContentLoading) {
                MediaContent mediaContent = nativeAdOnWarmupCompleted.getMediaContent();
                if (mediaContent != null && (videoController = mediaContent.getVideoController()) != null) {
                    videoController.pause();
                }
                return Unit.INSTANCE;
            }
            if (!((Boolean) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this.$hasTrackedImpression$delegate}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1622752553, -1622752545, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).booleanValue()) {
                int i2 = onExtraCallbackWithResult + 71;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this.$hasTrackedImpression$delegate, true}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1916228426, 1916228445, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                this.$manager.onWarmupCompleted(this.$requestId, "IMP", ExposureContent.Companion.onExtraCallback(nativeAdOnWarmupCompleted));
            }
            if (!onReceiveValue.onExtraCallbackWithResult(this.$isForcePause$delegate)) {
                int i4 = onExtraCallback + 83;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    onReceiveValue.IAuthTabCallback(nativeAdOnWarmupCompleted);
                    throw null;
                }
                onReceiveValue.IAuthTabCallback(nativeAdOnWarmupCompleted);
                int i5 = onExtraCallback + 91;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final ConstraintLayout onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        getPathData getpathdataOnNavigationEvent = getPathData.onNavigationEvent(LayoutInflater.from(context), constraintLayout);
        NativeAdView nativeAdView = getpathdataOnNavigationEvent.asInterface;
        nativeAdView.setHeadlineView(getpathdataOnNavigationEvent.asBinder);
        nativeAdView.setBodyView(getpathdataOnNavigationEvent.onTransact);
        nativeAdView.setIconView(getpathdataOnNavigationEvent.onWarmupCompleted);
        nativeAdView.setMediaView(getpathdataOnNavigationEvent.onNavigationEvent);
        nativeAdView.setCallToActionView(getpathdataOnNavigationEvent.onExtraCallback);
        getpathdataOnNavigationEvent.onNavigationEvent.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return constraintLayout;
    }

    private static final void onExtraCallback(NativeAd nativeAd, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, Context context, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAd.getResponseInfo();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        if (responseInfo != null) {
            int i3 = onNavigationEvent + 49;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Bundle responseExtras = responseInfo.getResponseExtras();
            if (responseExtras != null) {
                int i5 = onNavigationEvent + 31;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                String string = responseExtras.getString("ad_transparency_url");
                if (i6 == 0) {
                    int i7 = 16 / 0;
                    if (string == null) {
                        return;
                    }
                } else if (string == null) {
                    return;
                }
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                    getStrokeWidth.onExtraCallbackWithResult(getStrokeWidth.onExtraCallback, context, string, "ads_sdk_admob_transparency", null, 4, null);
                    kotlin.Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
        }
    }

    public static final class onExtraCallback extends VideoController.VideoLifecycleCallbacks {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<getSupportedFeatures> onExtraCallback;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        onExtraCallback(String str, getSupportedHighSpeedResolutionsFor<getSupportedFeatures> getsupportedhighspeedresolutionsfor, String str2) {
            this.onNavigationEvent = str;
            this.onExtraCallback = getsupportedhighspeedresolutionsfor;
            this.onWarmupCompleted = str2;
        }

        public void onVideoPlay() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSupportedHighSpeedResolutionsFor<getSupportedFeatures> getsupportedhighspeedresolutionsfor = this.onExtraCallback;
            onReceiveValue.onExtraCallback(getsupportedhighspeedresolutionsfor, onReceiveValue.onNavigationEvent(getsupportedhighspeedresolutionsfor).onExtraCallbackWithResult(true, this.onNavigationEvent));
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onVideoPause() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSupportedHighSpeedResolutionsFor<getSupportedFeatures> getsupportedhighspeedresolutionsfor = this.onExtraCallback;
            onReceiveValue.onExtraCallback(getsupportedhighspeedresolutionsfor, i3 != 0 ? onReceiveValue.onNavigationEvent(getsupportedhighspeedresolutionsfor).onExtraCallbackWithResult(true, this.onNavigationEvent) : onReceiveValue.onNavigationEvent(getsupportedhighspeedresolutionsfor).onExtraCallbackWithResult(false, this.onNavigationEvent));
        }

        public void onVideoEnd() {
            getSupportedFeatures getsupportedfeaturesOnNavigationEvent;
            boolean z;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSupportedHighSpeedResolutionsFor<getSupportedFeatures> getsupportedhighspeedresolutionsfor = this.onExtraCallback;
            if (i3 != 0) {
                getsupportedfeaturesOnNavigationEvent = onReceiveValue.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                z = true;
            } else {
                getsupportedfeaturesOnNavigationEvent = onReceiveValue.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                z = false;
            }
            onReceiveValue.onExtraCallback(getsupportedhighspeedresolutionsfor, getsupportedfeaturesOnNavigationEvent.onExtraCallbackWithResult(z, this.onWarmupCompleted));
        }
    }

    private static final void onExtraCallbackWithResult(VideoController videoController, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        ICustomTabsCallback(getsupportedhighspeedresolutionsfor, !((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, -813214366, 813214383, iOnExtraCallback3)).booleanValue());
        if (videoController != null) {
            int i4 = onWarmupCompleted + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {getsupportedhighspeedresolutionsfor};
            int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            if (i5 != 0) {
                videoController.mute(((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -813214366, 813214383, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).booleanValue());
                throw null;
            }
            videoController.mute(((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -813214366, 813214383, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).booleanValue());
            int i6 = onNavigationEvent + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = onNavigationEvent + 23;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        String strIntern;
        float f6;
        Object obj;
        Uri uri;
        final Context context = (Context) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        final HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2 = (HighSpeedResolverExternalSyntheticLambda2) objArr[2];
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        String str = (String) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[5];
        String str2 = (String) objArr[6];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[7];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        getPathData getpathdataOnExtraCallback = getPathData.onExtraCallback(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(getpathdataOnExtraCallback, "");
        final NativeAd nativeAdExtraCallback = extraCallback((getSupportedHighSpeedResolutionsFor<NativeAd>) getsupportedhighspeedresolutionsfor);
        Object obj2 = null;
        if (nativeAdExtraCallback == null) {
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        getpathdataOnExtraCallback.asBinder.setText(nativeAdExtraCallback.getHeadline());
        getpathdataOnExtraCallback.onTransact.setText(nativeAdExtraCallback.getBody());
        TdsImageView tdsImageView = getpathdataOnExtraCallback.onExtraCallbackWithResult;
        String body = nativeAdExtraCallback.getBody();
        if (body != null) {
            int i3 = onNavigationEvent + 9;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 1 / 0;
                f = !StringsKt.isBlank(body) ? 1.0f : 0.0f;
            } else if (!StringsKt.isBlank(body)) {
            }
        }
        tdsImageView.setAlpha(f);
        Typography7 typography7 = getpathdataOnExtraCallback.onTransact;
        String body2 = nativeAdExtraCallback.getBody();
        if (body2 != null) {
            int i5 = onWarmupCompleted + 103;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (StringsKt.isBlank(body2)) {
                f2 = 0.0f;
            } else {
                int i7 = onNavigationEvent + 99;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                f2 = 1.0f;
            }
        }
        typography7.setAlpha(f2);
        Typography7 typography72 = getpathdataOnExtraCallback.asBinder;
        String headline = nativeAdExtraCallback.getHeadline();
        if (headline != null) {
            int i9 = onWarmupCompleted + 123;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 10 / 0;
                f3 = !StringsKt.isBlank(headline) ? 1.0f : 0.0f;
            } else if (!StringsKt.isBlank(headline)) {
            }
        }
        typography72.setAlpha(f3);
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(context);
        NativeAd.Image icon = nativeAdExtraCallback.getIcon();
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventIAuthTabCallback = RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationevent.onExtraCallback((icon == null || (uri = icon.getUri()) == null) ? null : uri.toString()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new coil3.transform.RoundedCornersTransformation(4.0f)});
        TdsImageView tdsImageView2 = getpathdataOnExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        TdsImageView.setImage$default(tdsImageView2, onnavigationeventIAuthTabCallback, (Function1) null, (Function1) null, 6, (Object) null);
        getpathdataOnExtraCallback.asInterface.setNativeAd(nativeAdExtraCallback);
        getpathdataOnExtraCallback.IAuthTabCallbackStub.setOnClickListener(new View.OnClickListener() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = 2 % 2;
                int i12 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                onReceiveValue.onNavigationEvent(nativeAdExtraCallback, highSpeedResolverExternalSyntheticLambda2, context, view);
                int i14 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
            }
        });
        MediaContent mediaContent = nativeAdExtraCallback.getMediaContent();
        final VideoController videoController = mediaContent != null ? mediaContent.getVideoController() : null;
        MediaContent mediaContent2 = nativeAdExtraCallback.getMediaContent();
        boolean z = mediaContent2 != null && mediaContent2.hasVideoContent();
        FrameLayout frameLayout = getpathdataOnExtraCallback.access000;
        if (z) {
            int i11 = onWarmupCompleted + 117;
            onNavigationEvent = i11 % 128;
            f4 = i11 % 2 != 0 ? 0.0f : 1.0f;
        }
        frameLayout.setAlpha(f4);
        ConstraintLayout constraintLayoutOnNavigationEvent = getpathdataOnExtraCallback.IAuthTabCallbackDefault.onNavigationEvent();
        if (z) {
            int i12 = onNavigationEvent + 11;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        constraintLayoutOnNavigationEvent.setAlpha(f5);
        if (z) {
            TdsImageView tdsImageView3 = getpathdataOnExtraCallback.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            if (((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -813214366, 813214383, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).booleanValue()) {
                int i14 = onWarmupCompleted + 9;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{13823, 61452, 48701, 25642, 8792, 59398, 38434, 23601, 6812, 49284, 36512, 46246, 29386, 14551, 59051, 44258, 27400, 4411, 57130, 34052, 17234, 2401, 14130, 64903, 48028, 25007, 12223, 54737, 37788, 23028, 2043, 49665, 34904, 46700, 31825, 14869, 57442, 44671, 21634, 4752, 55522, 34467, 19662, 2759, 12525, 65264, 42312, 25369, 10529, 55118, 40212, 23399, 372, 53122, 62866, 46051, 31213, 10125, 60870, 44010, 20986, 7184, 55824, 32872, 20007, 29782, 12910}, TextUtils.indexOf("", "", 1) + 50671, objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{13823, 61452, 48701, 25642, 8792, 59398, 38434, 23601, 6812, 49284, 36512, 46246, 29386, 14551, 59051, 44258, 27400, 4411, 57130, 34052, 17234, 2401, 14130, 64903, 48028, 25007, 12223, 54737, 37788, 23028, 2043, 49665, 34904, 46700, 31825, 14869, 57442, 44671, 21634, 4752, 55522, 34467, 19662, 2759, 12525, 65264, 42312, 25369, 10529, 55118, 40212, 23399, 372, 53122, 62866, 46051, 31213, 10125, 60870, 44010, 20986, 7184, 55824, 32872, 20007, 29782, 12910}, 50671 - TextUtils.indexOf("", "", 0), objArr3);
                    obj = objArr3[0];
                }
                strIntern = ((String) obj).intern();
            } else {
                Object[] objArr4 = new Object[1];
                a(new char[]{13823, 29198, 47673, 57888, 10832, 21004, 39478, 49859, 2700, 45750, 64180, 8908, 27362, 37629, 56143, 768, 19240, 62297, 15182, 25390, 43898, 54155, 7142, 17333, 35788, 13277, 31723, 40987, 59476, 4158, 22591, 32835, 51224, 28718, 47253, 57567, 10410, 20661, 39126, 49378, 2226, 45329, 63770, 8493, 26949, 37210, 55596, 379, 18825, 61927, 14768, 25039, 43485, 53737, 7748, 17998, 36450, 13861, 32333, 42593, 61039, 5771, 24287, 34484, 52921, 30429}, Color.red(0) + 18413, objArr4);
                strIntern = ((String) objArr4[0]).intern();
            }
            TdsImageView.setImage$default(tdsImageView3, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
            if (videoController != null) {
                videoController.mute(((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -813214366, 813214383, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).booleanValue());
            }
            if (videoController != null) {
                videoController.setVideoLifecycleCallbacks(new onExtraCallback(str, getsupportedhighspeedresolutionsfor3, str2));
            }
            getpathdataOnExtraCallback.access000.setOnClickListener(new View.OnClickListener() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda7
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallback + 67;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    onReceiveValue.onWarmupCompleted(videoController, getsupportedhighspeedresolutionsfor2, view);
                    int i18 = onExtraCallback + 43;
                    onWarmupCompleted = i18 % 128;
                    if (i18 % 2 != 0) {
                        throw null;
                    }
                }
            });
            getpathdataOnExtraCallback.IAuthTabCallbackDefault.IAuthTabCallbackDefault.setText(readTypedObject((getSupportedHighSpeedResolutionsFor<getSupportedFeatures>) getsupportedhighspeedresolutionsfor3).onExtraCallbackWithResult());
            boolean zOnNavigationEvent = readTypedObject((getSupportedHighSpeedResolutionsFor<getSupportedFeatures>) getsupportedhighspeedresolutionsfor3).onNavigationEvent();
            getpathdataOnExtraCallback.IAuthTabCallbackDefault.onExtraCallbackWithResult.setAlpha(!zOnNavigationEvent ? 1.0f : 0.0f);
            TdsImageView tdsImageView4 = getpathdataOnExtraCallback.IAuthTabCallbackDefault.IAuthTabCallback;
            if (zOnNavigationEvent) {
                int i15 = onNavigationEvent + 71;
                onWarmupCompleted = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 3 % 3;
                }
                f6 = 0.0f;
            } else {
                int i17 = onWarmupCompleted + 109;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                f6 = 1.0f;
            }
            tdsImageView4.setAlpha(f6);
            getpathdataOnExtraCallback.IAuthTabCallbackDefault.IAuthTabCallbackDefault.setAlpha(!zOnNavigationEvent ? 1.0f : 0.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        int i;
        int i2;
        boolean z;
        NativeAdsDto.Mediation mediation;
        NativeAdsDto.ExtraInfo extraInfoOnTransact;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner;
        boolean z6;
        String str;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i3;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        boolean z7;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        String str2;
        boolean z8;
        final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        String str3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i5;
        Function0 function0;
        Function1 function1;
        int i6;
        NativeAdsDto.AdmobInfo admobInfo;
        boolean z9;
        boolean z10;
        NativeAdsManager nativeAdsManager;
        final NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        String str4;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4;
        boolean z11;
        final boolean z12;
        Object obj;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z13;
        NativeAdsManager nativeAdsManager2;
        int i7;
        int i8;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str5 = (String) objArr[1];
        final NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner3 = (NativeAdsDto.Creative.ThumbnailBanner) objArr[3];
        final NativeAdsManager nativeAdsManager3 = (NativeAdsManager) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        final Function1 function12 = (Function1) objArr[7];
        final Function0 function02 = (Function0) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int i9 = 2 % 2;
        int i10 = onNavigationEvent + 105;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1244772653);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5)) {
                int i12 = onNavigationEvent + 23;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                i8 = 32;
            } else {
                i8 = 16;
            }
            i |= i8;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(thumbnailBanner3) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAdsManager3) ? 16384 : 8192;
        }
        if ((196608 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 131072 : 65536;
        }
        if ((1572864 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 1048576 : 524288;
        }
        if ((12582912 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 8388608 : 4194304;
        }
        if ((100663296 & iIntValue) == 0) {
            int i14 = onNavigationEvent + 103;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 29 / 0;
                i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 67108864 : 33554432;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
            }
            i |= i7;
        }
        int i16 = i;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347795 & i16) != 38347794, i16 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i5 = iIntValue;
            function0 = function02;
            function1 = function12;
            z9 = zBooleanValue2;
            z13 = zBooleanValue;
            nativeAdsManager2 = nativeAdsManager3;
            thumbnailBanner2 = thumbnailBanner3;
            str4 = str5;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1244772653, i16, -1, "im.toss.ads_sdk.ui.compose.NativeAdsThumbnailAdMobController (NativeAdsThumbnail.kt:595)");
            }
            final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_continue_play, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_continue_replay, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int i17 = i16 & 112;
            if (i17 == 32) {
                int i18 = onNavigationEvent + 29;
                i2 = iIntValue;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                z = true;
            } else {
                i2 = iIntValue;
                z = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                NativeAdsDto nativeAdsDtoOnNavigationEvent = nativeAdsManager3.onNavigationEvent(str5);
                if (nativeAdsDtoOnNavigationEvent == null || (extraInfoOnTransact = nativeAdsDtoOnNavigationEvent.onTransact()) == null || (mediation = extraInfoOnTransact.onNavigationEvent()) == null) {
                    mediation = new NativeAdsDto.Mediation((String) null, (List) null, (NativeAdsDto.AdmobInfo) null, (NativeAdsDto.MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
                }
                objOnMinimized = mediation;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final NativeAdsDto.Mediation mediation2 = (NativeAdsDto.Mediation) objOnMinimized;
            if (i17 == 32) {
                int i20 = onWarmupCompleted + 1;
                z2 = zBooleanValue2;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                z3 = true;
            } else {
                z2 = zBooleanValue2;
                z3 = false;
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z3 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = (NativeAdsDto.AdmobInfo) NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), -1807668884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1807668884, new Object[]{nativeAdsManager3, str5}, nSetPosition.onExtraCallbackWithResult());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            final NativeAdsDto.AdmobInfo admobInfo2 = (NativeAdsDto.AdmobInfo) objOnMinimized2;
            if (i17 == 32) {
                z4 = zBooleanValue;
                z5 = true;
            } else {
                z4 = zBooleanValue;
                z5 = false;
            }
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z5 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = nativeAdsManager3.onExtraCallbackWithResult(str5);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            final NativeAd nativeAd = (NativeAd) objOnMinimized3;
            if (i17 == 32) {
                thumbnailBanner = thumbnailBanner3;
                z6 = true;
            } else {
                thumbnailBanner = thumbnailBanner3;
                z6 = false;
            }
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z6 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                str = strOnExtraCallback2;
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(nativeAd, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                objOnMinimized4 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
            } else {
                str = strOnExtraCallback2;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
            boolean z14 = i17 == 32;
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z14 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                i3 = 2;
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                objOnMinimized5 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                i3 = 2;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
            if (i17 == 32) {
                int i22 = onNavigationEvent + 69;
                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor6;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % i3;
                z7 = true;
            } else {
                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor6;
                z7 = false;
            }
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z7 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted3);
                objOnMinimized6 = getsupportedhighspeedresolutionsforOnWarmupCompleted3;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
            boolean z15 = i17 == 32;
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z15 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor7;
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted4);
                objOnMinimized7 = getsupportedhighspeedresolutionsforOnWarmupCompleted4;
            } else {
                getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor7;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized7;
            boolean z16 = i17 == 32;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(!(z16 | zOnNavigationEvent)) || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                str2 = str5;
                objOnMinimized8 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new getSupportedFeatures(false, strOnExtraCallback, 1, null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
            } else {
                str2 = str5;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized8;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(admobInfo2);
            boolean z17 = (234881024 & i16) == 67108864;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAd);
            boolean z18 = (i16 & 29360128) == 8388608;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
            boolean z19 = i17 == 32;
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mediation2);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(nativeAdsManager3);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
            if ((i16 & 7168) == 2048) {
                int i24 = onNavigationEvent + 41;
                onWarmupCompleted = i24 % 128;
                int i25 = i24 % 2;
                z8 = true;
            } else {
                z8 = false;
            }
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((!z8 && !(z18 | z17 | zOnNavigationEvent2 | zOnExtraCallback | zOnExtraCallback2 | z19 | zOnNavigationEvent3 | zOnExtraCallback3 | zOnNavigationEvent4)) && objOnMinimized9 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                textFieldScrollKtExternalSyntheticLambda0 = textFieldScrollKtExternalSyntheticLambda02;
                i6 = i17;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                function0 = function02;
                function1 = function12;
                admobInfo = admobInfo2;
                nativeAdsManager = nativeAdsManager3;
                z9 = z2;
                z10 = z4;
                thumbnailBanner2 = thumbnailBanner;
                getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor;
                str3 = strOnExtraCallback;
                i4 = i16;
                i5 = i2;
            } else {
                textFieldScrollKtExternalSyntheticLambda0 = textFieldScrollKtExternalSyntheticLambda02;
                str3 = strOnExtraCallback;
                i4 = i16;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i5 = i2;
                function0 = function02;
                function1 = function12;
                final String str6 = str2;
                i6 = i17;
                admobInfo = admobInfo2;
                z9 = z2;
                z10 = z4;
                nativeAdsManager = nativeAdsManager3;
                thumbnailBanner2 = thumbnailBanner;
                getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor;
                Function1 function13 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i26 = 2 % 2;
                        int i27 = IAuthTabCallback + 9;
                        onNavigationEvent = i27 % 128;
                        if (i27 % 2 == 0) {
                            return onReceiveValue.IAuthTabCallback(admobInfo2, function02, nativeAd, function12, context, str6, mediation2, nativeAdsManager3, getsupportedhighspeedresolutionsfor5, thumbnailBanner2, (isInVideoUsage) obj2);
                        }
                        onReceiveValue.IAuthTabCallback(admobInfo2, function02, nativeAd, function12, context, str6, mediation2, nativeAdsManager3, getsupportedhighspeedresolutionsfor5, thumbnailBanner2, (isInVideoUsage) obj2);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function13);
                objOnMinimized9 = function13;
            }
            str4 = str2;
            isZslDisabledByByUserCaseConfig.onWarmupCompleted(str4, admobInfo, (Function1) objOnMinimized9, cameraCaptureResultEmptyCameraCaptureResult, (i4 >> 3) & 14);
            NativeAd nativeAdExtraCallback = extraCallback((getSupportedHighSpeedResolutionsFor<NativeAd>) getsupportedhighspeedresolutionsfor5);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
            int i26 = i4 & 458752;
            if (i26 == 131072) {
                int i27 = onWarmupCompleted + 31;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor2;
                z11 = true;
            } else {
                getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor2;
                z11 = false;
            }
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor4);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (((zOnNavigationEvent5 | z11 | zOnNavigationEvent6) || zOnExtraCallback4) || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                z12 = z10;
                Function1 function14 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        int i29 = 2 % 2;
                        int i30 = onNavigationEvent + 61;
                        onWarmupCompleted = i30 % 128;
                        int i31 = i30 % 2;
                        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda03 = textFieldScrollKtExternalSyntheticLambda0;
                        if (i31 != 0) {
                            Object[] objArr2 = {textFieldScrollKtExternalSyntheticLambda03, getsupportedhighspeedresolutionsfor5, Boolean.valueOf(z12), getsupportedhighspeedresolutionsfor4, (isInVideoUsage) obj2};
                            return (decrementVideoUsage) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 2037741018, -2037740998, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                        }
                        Object[] objArr3 = {textFieldScrollKtExternalSyntheticLambda03, getsupportedhighspeedresolutionsfor5, Boolean.valueOf(z12), getsupportedhighspeedresolutionsfor4, (isInVideoUsage) obj2};
                        int i32 = 55 / 0;
                        return (decrementVideoUsage) onReceiveValue.IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr3, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 2037741018, -2037740998, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function14);
                obj = function14;
            } else {
                z12 = z10;
                obj = objOnMinimized10;
            }
            isZslDisabledByByUserCaseConfig.onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, nativeAdExtraCallback, Boolean.valueOf(z12), (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, (i4 >> 9) & 896);
            Object[] objArr2 = {extraCallback((getSupportedHighSpeedResolutionsFor<NativeAd>) getsupportedhighspeedresolutionsfor5), Boolean.valueOf(z12), Boolean.valueOf(z9), Boolean.valueOf(access100((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor4))};
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
            boolean z20 = i26 == 131072;
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = getsupportedhighspeedresolutionsfor3;
            boolean z21 = (i4 & 3670016) == 1048576;
            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor10);
            NativeAdsManager nativeAdsManager4 = nativeAdsManager;
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(nativeAdsManager4);
            boolean z22 = i6 == 32;
            boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor4);
            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((z20 | zOnNavigationEvent7 | z21 | zOnNavigationEvent8 | zOnExtraCallback5 | z22 | zOnNavigationEvent9) || objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                onNavigationEvent onnavigationevent = new onNavigationEvent(z12, z9, nativeAdsManager4, str4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor4, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onnavigationevent);
                objOnMinimized11 = onnavigationevent;
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized11, cameraCaptureResultEmptyCameraCaptureResult, 0);
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, 1.7777778f, false, 2, (Object) null);
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
                int i29 = onWarmupCompleted + 51;
                onNavigationEvent = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = 5 / 4;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            final HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            if (extraCallback((getSupportedHighSpeedResolutionsFor<NativeAd>) getsupportedhighspeedresolutionsfor5) != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1589087840);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized12 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda2
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i31 = 2 % 2;
                            int i32 = onWarmupCompleted + 117;
                            onNavigationEvent = i32 % 128;
                            int i33 = i32 % 2;
                            ConstraintLayout constraintLayoutOnExtraCallback = onReceiveValue.onExtraCallback((Context) obj2);
                            if (i33 != 0) {
                                int i34 = 17 / 0;
                            }
                            int i35 = onNavigationEvent + 113;
                            onWarmupCompleted = i35 % 128;
                            int i36 = i35 % 2;
                            return constraintLayoutOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized12);
                }
                Function1 function15 = (Function1) objOnMinimized12;
                boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor8);
                boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor9);
                final String str7 = str3;
                boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str7);
                z13 = z12;
                final String str8 = str;
                boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str8);
                nativeAdsManager2 = nativeAdsManager4;
                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent10 | zOnExtraCallback6 | zOnNavigationEvent11 | zOnNavigationEvent12 | zOnNavigationEvent13 | zOnNavigationEvent14)) {
                    Object obj2 = objOnMinimized13;
                    if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                        Function1 function16 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3) {
                                int i31 = 2 % 2;
                                int i32 = onWarmupCompleted + 23;
                                IAuthTabCallback = i32 % 128;
                                int i33 = i32 % 2;
                                Unit unitIAuthTabCallback = onReceiveValue.IAuthTabCallback(context, getsupportedhighspeedresolutionsfor5, highSpeedResolverExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor8, str7, getsupportedhighspeedresolutionsfor9, str8, (ConstraintLayout) obj3);
                                int i34 = onWarmupCompleted + 81;
                                IAuthTabCallback = i34 % 128;
                                if (i34 % 2 != 0) {
                                    int i35 = 19 / 0;
                                }
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function16);
                        obj2 = function16;
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function15, quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 54, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                z13 = z12;
                nativeAdsManager2 = nativeAdsManager4;
                if (z9) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1584405352);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        int i31 = onNavigationEvent + 105;
                        onWarmupCompleted = i31 % 128;
                        if (i31 % 2 == 0) {
                            getAwbState.onExtraCallback();
                            int i32 = 21 / 0;
                        } else {
                            getAwbState.onExtraCallback();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                    createSessionConfigBuilder.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), onextracallbackwithresult.asBinder(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0L, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 438, 56);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1584158065);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
        final String str9 = str4;
        final NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner4 = thumbnailBanner2;
        final NativeAdsManager nativeAdsManager5 = nativeAdsManager2;
        final boolean z23 = z13;
        final boolean z24 = z9;
        final Function1 function17 = function1;
        final Function0 function03 = function0;
        final int i33 = i5;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj3, Object obj4) {
                int i34 = 2 % 2;
                int i35 = onExtraCallbackWithResult + 45;
                onExtraCallback = i35 % 128;
                int i36 = i35 % 2;
                Unit unitOnNavigationEvent = onReceiveValue.onNavigationEvent(quirksExternalSyntheticBackport04, str9, adAsset, thumbnailBanner4, nativeAdsManager5, z23, z24, function17, function03, i33, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i37 = onExtraCallbackWithResult + 91;
                onExtraCallback = i37 % 128;
                if (i37 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
        return null;
    }

    private static final void onWarmupCompleted(NativeAd nativeAd) {
        VideoController videoController;
        int i = 2 % 2;
        MediaContent mediaContent = nativeAd.getMediaContent();
        if (mediaContent == null || !mediaContent.hasVideoContent()) {
            return;
        }
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MediaContent mediaContent2 = nativeAd.getMediaContent();
        if (mediaContent2 != null) {
            int i4 = onWarmupCompleted + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                mediaContent2.getVideoController();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            VideoController videoController2 = mediaContent2.getVideoController();
            if (videoController2 != null) {
                videoController2.mute(true);
            }
        }
        MediaContent mediaContent3 = nativeAd.getMediaContent();
        if (mediaContent3 == null || (videoController = mediaContent3.getVideoController()) == null) {
            return;
        }
        int i5 = onWarmupCompleted + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        videoController.play();
    }

    private static final void IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1848269339);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            int i7 = onNavigationEvent + 45;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                i4 = 2;
            } else {
                int i9 = onNavigationEvent + 125;
                onWarmupCompleted = i9 % 128;
                i4 = i9 % 2 == 0 ? 3 : 4;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18) {
            int i10 = onNavigationEvent + 13;
            int i11 = i10 % 128;
            onWarmupCompleted = i11;
            z = i10 % 2 != 0;
            int i12 = i11 + 77;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i6 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1848269339, i3, -1, "im.toss.ads_sdk.ui.compose.MoreButton (NativeAdsThumbnail.kt:854)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(999.0f))), ByteOrderedDataOutputStream.onExtraCallback(1711276032), (toMetersPerSecond) null, 2, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized, (getSubtitle) null, false, (String) null, (Role) null, function0, 28, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i14 = onWarmupCompleted + 35;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_text_more, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), null, null, Long.valueOf(setByteOrder.Companion.asBinder()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult2, 27648, 196608, 98278}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = onExtraCallback + 17;
                    IAuthTabCallback = i17 % 128;
                    if (i17 % 2 != 0) {
                        onReceiveValue.onNavigationEvent(quirksExternalSyntheticBackport02, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnNavigationEvent = onReceiveValue.onNavigationEvent(quirksExternalSyntheticBackport02, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i18 = IAuthTabCallback + 1;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 60 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            });
            int i16 = onWarmupCompleted + 7;
            onNavigationEvent = i16 % 128;
            int i17 = i16 % 2;
        }
    }

    private static final decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$NativeAdsThumbnail$1$1$observer$1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 35;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = onNavigationEvent + 79;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 19 / 0;
                }
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda02);
                if (i4 == 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 23;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda02);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2;
                boolean z;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 17;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                    z = false;
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                    z = true;
                }
                onReceiveValue.onWarmupCompleted(getsupportedhighspeedresolutionsfor2, z);
                int i4 = onNavigationEvent + 33;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                onReceiveValue.onWarmupCompleted((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, true);
                int i5 = onExtraCallback + 15;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2;
                boolean z;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 87;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                    z = true;
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                    z = false;
                }
                onReceiveValue.onWarmupCompleted(getsupportedhighspeedresolutionsfor2, z);
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return onextracallbackwithresult;
    }

    private static final boolean access000(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void access000(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void access100(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    private static final boolean IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = onNavigationEvent + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return thumbnailBanner;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<NativeAdsDto.Creative.ThumbnailBanner> getsupportedhighspeedresolutionsfor, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(thumbnailBanner);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = onNavigationEvent + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final WebViewProviderAdapterExternalSyntheticLambda0 IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<WebViewProviderAdapterExternalSyntheticLambda0> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        WebViewProviderAdapterExternalSyntheticLambda0 webViewProviderAdapterExternalSyntheticLambda0 = (WebViewProviderAdapterExternalSyntheticLambda0) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return webViewProviderAdapterExternalSyntheticLambda0;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<WebViewProviderAdapterExternalSyntheticLambda0> getsupportedhighspeedresolutionsfor, WebViewProviderAdapterExternalSyntheticLambda0 webViewProviderAdapterExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(webViewProviderAdapterExternalSyntheticLambda0);
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final decrementVideoUsage onNavigationEvent(ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Set set, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(isinvideousage, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        if (exoPlayer != null) {
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor, function1, getsupportedhighspeedresolutionsfor2, set, str, getsupportedhighspeedresolutionsfor3);
            exoPlayer.addListener(iAuthTabCallbackStubProxy);
            return new ICustomTabsCallback(exoPlayer, iAuthTabCallbackStubProxy);
        }
        IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel();
        int i3 = onWarmupCompleted + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iAuthTabCallback_Parcel;
        }
        throw null;
    }

    private static final decrementVideoUsage IAuthTabCallback(writeTypedObject writetypedobject, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        extraCallbackWithResult extracallbackwithresult = new extraCallbackWithResult(writetypedobject);
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return extracallbackwithresult;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return Boolean.valueOf(bool.booleanValue());
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void extraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onActivityResized(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void extraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onMessageChannelReady(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    private static final void onMinimized(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    private static final String extraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final boolean onActivityLayout(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void readTypedObject(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(NativeAdsDto.AdmobInfo admobInfo, Function0 function0, NativeAd nativeAd, Function1 function1, Context context, String str, NativeAdsDto.Mediation mediation, NativeAdsManager nativeAdsManager, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(isinvideousage, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        if (admobInfo == null) {
            function0.invoke();
            return new IAuthTabCallbackDefault();
        }
        if (nativeAd != null) {
            function1.invoke(Boolean.FALSE);
            return new onTransact();
        }
        getScaleX getscalex = new getScaleX(context);
        function1.invoke(Boolean.TRUE);
        getscalex.onExtraCallback(str, admobInfo, mediation, nativeAdsManager.IAuthTabCallback(), new onWarmupCompleted(function1, nativeAdsManager, str, getsupportedhighspeedresolutionsfor, thumbnailBanner, function0));
        asInterface asinterface = new asInterface(getscalex);
        int i3 = onNavigationEvent + 61;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return asinterface;
        }
        throw null;
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final boolean z, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(isinvideousage, "");
            extraCallback((getSupportedHighSpeedResolutionsFor<NativeAd>) getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        final NativeAd nativeAdExtraCallback = extraCallback((getSupportedHighSpeedResolutionsFor<NativeAd>) getsupportedhighspeedresolutionsfor);
        if (nativeAdExtraCallback == null) {
            return new IAuthTabCallbackStub();
        }
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsThumbnailKt$NativeAdsThumbnailAdMobController$2$1$observer$1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 83;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda02);
                int i6 = onNavigationEvent + 59;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda02);
                int i6 = onNavigationEvent + 25;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Object obj2 = null;
                super.onStart(textFieldScrollKtExternalSyntheticLambda02);
                if (i5 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i6 = onWarmupCompleted + 95;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                MediaContent mediaContent;
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 51;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    mediaContent = nativeAdExtraCallback.getMediaContent();
                    int i5 = 31 / 0;
                    if (mediaContent == null) {
                        return;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    mediaContent = nativeAdExtraCallback.getMediaContent();
                    if (mediaContent == null) {
                        return;
                    }
                }
                VideoController videoController = mediaContent.getVideoController();
                if (videoController != null) {
                    int i6 = onWarmupCompleted + 61;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    videoController.pause();
                    int i8 = onWarmupCompleted + 69;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                VideoController videoController;
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                MediaContent mediaContent = nativeAdExtraCallback.getMediaContent();
                if (mediaContent != null && (videoController = mediaContent.getVideoController()) != null) {
                    int i6 = onWarmupCompleted + 77;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    videoController.pause();
                }
                int i8 = onWarmupCompleted + 25;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 11 / 0;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                if (z) {
                    int i4 = onNavigationEvent + 23;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    if (onReceiveValue.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2)) {
                        return;
                    }
                    int i6 = onWarmupCompleted + 49;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    onReceiveValue.IAuthTabCallback(nativeAdExtraCallback);
                    int i8 = onWarmupCompleted + 83;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        asBinder asbinder = new asBinder(textFieldScrollKtExternalSyntheticLambda0, textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return asbinder;
    }

    private static final NativeAd extraCallback(getSupportedHighSpeedResolutionsFor<NativeAd> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAd nativeAd = (NativeAd) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return nativeAd;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<NativeAd> getsupportedhighspeedresolutionsfor, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(nativeAd);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean ICustomTabsCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return zBooleanValue;
    }

    private static final void writeTypedObject(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            throw null;
        }
    }

    private static final boolean access100(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = onNavigationEvent + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return Boolean.valueOf(bool.booleanValue());
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void ICustomTabsCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getSupportedFeatures readTypedObject(getSupportedHighSpeedResolutionsFor<getSupportedFeatures> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getSupportedFeatures getsupportedfeatures = (getSupportedFeatures) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getsupportedfeatures;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSupportedFeatures getsupportedfeatures = (getSupportedFeatures) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getsupportedfeatures);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallbackWithResult(ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Set set, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, isInVideoUsage isinvideousage) {
        Object[] objArr = {exoPlayer, getsupportedhighspeedresolutionsfor, function1, getsupportedhighspeedresolutionsfor2, set, str, getsupportedhighspeedresolutionsfor3, isinvideousage};
        return (decrementVideoUsage) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1146742097, 1146742113, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{thumbnailBanner, getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, 848378462, -848378462, iOnExtraCallback3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, NativeAdsManager nativeAdsManager, boolean z, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, adAsset, thumbnailBanner, nativeAdsManager, Boolean.valueOf(z), function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -998025932, 998025953, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ decrementVideoUsage onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, isInVideoUsage isinvideousage) {
        Object[] objArr = {textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, Boolean.valueOf(z), getsupportedhighspeedresolutionsfor2, isinvideousage};
        return (decrementVideoUsage) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 2037741018, -2037740998, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str2) {
        Object[] objArr = {nativeAdsManager, str, adAsset, highSpeedResolverExternalSyntheticLambda2, context, getsupportedhighspeedresolutionsfor, str2};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -913808713, 913808715, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -2007483923, 2007483937, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1800540800, 1800540801, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final NativeAdsDto.Creative.ThumbnailBanner asInterface(getSupportedHighSpeedResolutionsFor<NativeAdsDto.Creative.ThumbnailBanner> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (NativeAdsDto.Creative.ThumbnailBanner) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, -486865843, 486865852, iOnExtraCallback3);
    }

    private static final Unit IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1349741342, 1349741349, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1568054357, -1568054352, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final void onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, NativeAdsManager nativeAdsManager, boolean z, boolean z2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, adAsset, thumbnailBanner, nativeAdsManager, Boolean.valueOf(z), Boolean.valueOf(z2), function1, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 2092276082, -2092276060, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final boolean getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, -813214366, 813214383, iOnExtraCallback3)).booleanValue();
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<getSupportedFeatures> getsupportedhighspeedresolutionsfor, getSupportedFeatures getsupportedfeatures) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor, getsupportedfeatures}, iOnExtraCallback2, -655758559, 655758572, iOnExtraCallback3);
    }

    private static final Unit onExtraCallbackWithResult(Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, String str2, ConstraintLayout constraintLayout) {
        Object[] objArr = {context, getsupportedhighspeedresolutionsfor, highSpeedResolverExternalSyntheticLambda2, getsupportedhighspeedresolutionsfor2, str, getsupportedhighspeedresolutionsfor3, str2, constraintLayout};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1276092443, -1276092439, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final boolean writeTypedObject(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, 1884446660, -1884446657, iOnExtraCallback3)).booleanValue();
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, 78091604, -78091589, iOnExtraCallback3);
    }

    private static final Unit IAuthTabCallback(ExoPlayer exoPlayer, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{exoPlayer, str, getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, 688022066, -688022056, iOnExtraCallback3);
    }

    private static final Unit onTransact(Function1 function1, boolean z) {
        Object[] objArr = {function1, Boolean.valueOf(z)};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 298994453, -298994441, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit onExtraCallbackWithResult(boolean z, Function1 function1) {
        Object[] objArr = {Boolean.valueOf(z), function1};
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -842412388, 842412399, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static final /* synthetic */ boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, 1622752553, -1622752545, iOnExtraCallback3)).booleanValue();
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1916228426, 1916228445, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback2, -467264772, 467264778, iOnExtraCallback3);
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -527004642, 527004660, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }
}
