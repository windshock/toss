package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$NativeAdsFeedVideoV2$4$1$observer$1;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.uikit.widget.SafePlayerView;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GraphicDeviceInfo;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.WindowAreaComponentApi3Requirements;
import o.access;
import o.decrementVideoUsage;
import o.getSupportedHighSpeedResolutionsFor;
import o.immediateFailedFuture;
import o.isInVideoUsage;
import o.isQueryRefinementEnabled;
import o.onReceivedHttpError;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WindowAreaComponentApi3Requirements {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 37619;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 7231;
    private static char onNavigationEvent = 55198;
    private static char onWarmupCompleted = 8186;

    public static final class onExtraCallbackWithResult implements decrementVideoUsage {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i);
        int i10 = ~i;
        int i11 = (~(i7 | i10)) | (~(i8 | i2 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = i2 + i3 + i6 + ((-1255669517) * i5) + (533247121 * i4);
        int i14 = i13 * i13;
        int i15 = ((i2 * (-1895547823)) - 858849280) + ((-1895547823) * i3) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i6) + (760610816 * i5) + ((-1057882112) * i4) + (1344208896 * i14);
        int i16 = ((i2 * (-122328301)) - 2132886715) + (i3 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i6 * (-122328029)) + (i5 * (-1196579527)) + (i4 * 656595923) + (i14 * 138215424);
        switch (i15 + (i16 * i16 * (-833028096))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asBinder(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallback_Parcel(objArr);
            case 11:
                return access100(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return IAuthTabCallbackStubProxy(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return access000(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ExoPlayer exoPlayer = (ExoPlayer) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        isInVideoUsage isinvideousage = (isInVideoUsage) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage);
            throw null;
        }
        decrementVideoUsage decrementvideousageOnNavigationEvent = onNavigationEvent(exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage);
        int i3 = asBinder + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousageOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(function1);
            throw null;
        }
        Unit unitAsInterface = asInterface(function1);
        int i3 = asBinder + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback5 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback6 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(iIAuthTabCallback4, -2140692765, 2140692771, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{useandconfigureprogramwithtexture}, iIAuthTabCallback6, iIAuthTabCallback5);
        int i3 = onExtraCallback + 113;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return unit;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(getsupportedhighspeedresolutionsfor, z);
        int i4 = onExtraCallback + 21;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
    }

    public static final /* synthetic */ boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return access100((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        }
        access100((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        access100(getsupportedhighspeedresolutionsfor, z);
        int i4 = asBinder + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[3];
        ExoPlayer exoPlayer = (ExoPlayer) objArr[4];
        NativeAdsDto.Creative.FeedVideo feedVideo = (NativeAdsDto.Creative.FeedVideo) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[6];
        Function1 function12 = (Function1) objArr[7];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[8];
        String str = (String) objArr[9];
        long jLongValue2 = ((Number) objArr[10]).longValue();
        MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0 = (MeteringRepeatingSessionExternalSyntheticLambda0) objArr[11];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        int iIntValue = ((Number) objArr[13]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(isqueryrefinementenabled, function1, jLongValue, getsupportedhighspeedresolutionsfor, exoPlayer, feedVideo, getsupportedhighspeedresolutionsfor2, function12, getsupportedhighspeedresolutionsfor3, str, jLongValue2, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(isqueryrefinementenabled, function1, jLongValue, getsupportedhighspeedresolutionsfor, exoPlayer, feedVideo, getsupportedhighspeedresolutionsfor2, function12, getsupportedhighspeedresolutionsfor3, str, jLongValue2, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallback + 81;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            ((Boolean) IAuthTabCallback(iIAuthTabCallback, 255020600, -255020586, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback5 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback6 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iIAuthTabCallback4, 255020600, -255020586, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback6, iIAuthTabCallback5)).booleanValue();
        int i3 = onExtraCallback + 91;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        String str = (String) objArr[0];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        int i5 = onExtraCallback + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitAsInterface = asInterface(useandconfigureprogramwithtexture);
        int i3 = onExtraCallback + 7;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(function1);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        int i3 = asBinder + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsEventLogType);
        int i4 = onExtraCallback + 7;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1);
        int i4 = onExtraCallback + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, boolean z, String str, long j, boolean z2, long j2, long j3, NativeAdsDto.Creative.FeedVideo feedVideo, boolean z3, long j4, long j5, long j6, boolean z4, long j7, long j8, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Function1 function12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, String str2, long j9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, iAuthTabCallback, function1, onwarmupcompleted, z, str, j, z2, j2, j3, feedVideo, z3, j4, j5, j6, z4, j7, j8, getsupportedhighspeedresolutionsfor, exoPlayer, getsupportedhighspeedresolutionsfor2, function12, getsupportedhighspeedresolutionsfor3, str2, j9, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(getsupportedhighspeedresolutionsfor, z);
        int i4 = onExtraCallback + 33;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(useandconfigureprogramwithtexture);
        int i4 = onExtraCallback + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static final /* synthetic */ boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            ((Boolean) IAuthTabCallback(iIAuthTabCallback, 1810896322, -1810896315, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback5 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback6 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iIAuthTabCallback4, 1810896322, -1810896315, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback6, iIAuthTabCallback5)).booleanValue();
        int i3 = asBinder + 79;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 61 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1);
        int i4 = asBinder + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unitIAuthTabCallbackStubProxy;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        String str = (String) IAuthTabCallback(iIAuthTabCallback, -1830795262, 1830795267, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2);
        int i4 = asBinder + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallbackWithResult(IAuthTabCallbackStub iAuthTabCallbackStub, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(iAuthTabCallbackStub, isinvideousage);
            throw null;
        }
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(iAuthTabCallbackStub, isinvideousage);
        int i3 = onExtraCallback + 59;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return decrementvideousageIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        access000(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = asBinder + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[0];
        ExoPlayer exoPlayer = (ExoPlayer) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        isInVideoUsage isinvideousage = (isInVideoUsage) objArr[3];
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage);
        }
        onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(ExoPlayer exoPlayer, SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(exoPlayer, safePlayerView);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        int i5 = asBinder + 3;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(iIAuthTabCallback, 946049680, -946049680, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{function1}, iIAuthTabCallback3, iIAuthTabCallback2);
        int i4 = onExtraCallback + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(function1, getsupportedhighspeedresolutionsfor);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(function1, getsupportedhighspeedresolutionsfor);
        int i3 = onExtraCallback + 35;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.FeedVideo feedVideo, List list, boolean z2, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 85;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, z, deleteprofile, feedVideo, list, z2, iAuthTabCallback, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = asBinder + 11;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        asInterface(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    public static final /* synthetic */ boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = access000((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = onExtraCallback + 83;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return zAccess000;
    }

    public static /* synthetic */ Unit onTransact(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return access000(function1);
        }
        access000(function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = onExtraCallback + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ SafePlayerView onWarmupCompleted(ExoPlayer exoPlayer, Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SafePlayerView safePlayerViewOnNavigationEvent = onNavigationEvent(exoPlayer, context);
        int i4 = asBinder + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return safePlayerViewOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {useandconfigureprogramwithtexture};
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iIAuthTabCallback, -1178266446, 1178266457, iIAuthTabCallback4, objArr2, iIAuthTabCallback3, iIAuthTabCallback2);
        int i4 = asBinder + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor(function1);
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(function1);
        int i3 = onExtraCallback + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.FeedVideo feedVideo, List list, boolean z2, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asBinder + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, z, deleteprofile, feedVideo, list, z2, iAuthTabCallback, function1, function12, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asBinder + 97;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(useandconfigureprogramwithtexture);
        }
        IAuthTabCallbackStub(useandconfigureprogramwithtexture);
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(ExoPlayer exoPlayer, Function1 function1, boolean z, IAuthTabCallbackStub iAuthTabCallbackStub, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageIAuthTabCallback = IAuthTabCallback(exoPlayer, function1, z, iAuthTabCallbackStub, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, isinvideousage);
        int i4 = onExtraCallback + 83;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return decrementvideousageIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        asBinder(getsupportedhighspeedresolutionsfor, z);
        int i4 = asBinder + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ IAuthTabCallbackStub onExtraCallback;

        public IAuthTabCallbackDefault(IAuthTabCallbackStub iAuthTabCallbackStub) {
            this.onExtraCallback = iAuthTabCallbackStub;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            removeRearDisplayPresentationStatusListener.IAuthTabCallback.IAuthTabCallback(this.onExtraCallback);
            int i4 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements decrementVideoUsage {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ NativeAdsFeedVideoV2Kt$NativeAdsFeedVideoV2$4$1$observer$1 IAuthTabCallback;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onNavigationEvent;

        public asInterface(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, NativeAdsFeedVideoV2Kt$NativeAdsFeedVideoV2$4$1$observer$1 nativeAdsFeedVideoV2Kt$NativeAdsFeedVideoV2$4$1$observer$1) {
            this.onNavigationEvent = textFieldScrollKtExternalSyntheticLambda0;
            this.IAuthTabCallback = nativeAdsFeedVideoV2Kt$NativeAdsFeedVideoV2$4$1$observer$1;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onNavigationEvent.getLifecycle().onExtraCallbackWithResult(this.IAuthTabCallback);
                throw null;
            }
            this.onNavigationEvent.getLifecycle().onExtraCallbackWithResult(this.IAuthTabCallback);
            int i3 = onExtraCallback + 111;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ onWarmupCompleted onNavigationEvent;
        final /* synthetic */ ExoPlayer onWarmupCompleted;

        public onNavigationEvent(ExoPlayer exoPlayer, onWarmupCompleted onwarmupcompleted) {
            this.onWarmupCompleted = exoPlayer;
            this.onNavigationEvent = onwarmupcompleted;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.removeListener(this.onNavigationEvent);
                int i3 = 65 / 0;
            } else {
                this.onWarmupCompleted.removeListener(this.onNavigationEvent);
            }
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final Unit onWarmupCompleted(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 55;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 31;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 123;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 33;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cBlue = (char) Color.blue(i3);
                        int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, packedPositionChild, iLastIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.getOffsetBefore("", 0) + 10, 12433 - MotionEvent.axisFromString(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 16014), ExpandableListView.getPackedPositionType(0L) + 14, 19901 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class IAuthTabCallbackStub implements endRearDisplaySession {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ ExoPlayer onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> onWarmupCompleted;

        IAuthTabCallbackStub(ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
            this.onExtraCallbackWithResult = exoPlayer;
            this.onWarmupCompleted = getsupportedhighspeedresolutionsfor;
        }

        @Override // o.endRearDisplaySession
        public void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.isBlank(WindowAreaComponentApi3Requirements.onExtraCallbackWithResult(this.onWarmupCompleted))) {
                return;
            }
            if (this.onExtraCallbackWithResult.getPlaybackState() == 1) {
                int i4 = onExtraCallback + 57;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    this.onExtraCallbackWithResult.prepare();
                    int i5 = 82 / 0;
                } else {
                    this.onExtraCallbackWithResult.prepare();
                }
            }
            this.onExtraCallbackWithResult.setPlayWhenReady(true);
            this.onExtraCallbackWithResult.play();
        }

        @Override // o.endRearDisplaySession
        public void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.pause();
            this.onExtraCallbackWithResult.setPlayWhenReady(false);
            int i4 = onExtraCallback + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.endRearDisplaySession
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.stop();
            this.onExtraCallbackWithResult.setPlayWhenReady(false);
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.endRearDisplaySession
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.release();
                obj.hashCode();
                throw null;
            }
            this.onExtraCallbackWithResult.release();
            int i3 = IAuthTabCallback + 45;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class onWarmupCompleted implements Player.Listener {
        private static int IAuthTabCallbackStubProxy = 0;
        private static int IAuthTabCallback_Parcel = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> IAuthTabCallback;
        final /* synthetic */ IAuthTabCallbackStub IAuthTabCallbackDefault;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> IAuthTabCallbackStub;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> asBinder;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> asInterface;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onExtraCallback;
        final /* synthetic */ Function1<NativeAdsEventLogType, Unit> onExtraCallbackWithResult;
        final /* synthetic */ boolean onNavigationEvent;
        final /* synthetic */ ExoPlayer onTransact;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Function1<? super NativeAdsEventLogType, Unit> function1, boolean z, IAuthTabCallbackStub iAuthTabCallbackStub, ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor6) {
            this.onExtraCallbackWithResult = function1;
            this.onNavigationEvent = z;
            this.IAuthTabCallbackDefault = iAuthTabCallbackStub;
            this.onTransact = exoPlayer;
            this.asBinder = getsupportedhighspeedresolutionsfor;
            this.onWarmupCompleted = getsupportedhighspeedresolutionsfor2;
            this.onExtraCallback = getsupportedhighspeedresolutionsfor3;
            this.IAuthTabCallbackStub = getsupportedhighspeedresolutionsfor4;
            this.asInterface = getsupportedhighspeedresolutionsfor5;
            this.IAuthTabCallback = getsupportedhighspeedresolutionsfor6;
        }

        public void onPlaybackStateChanged(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStubProxy + 57;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            if (i == 4) {
                if (!WindowAreaComponentApi3Requirements.onNavigationEvent(this.asBinder)) {
                    WindowAreaComponentApi3Requirements.onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor) this.asBinder, true);
                    this.onExtraCallbackWithResult.invoke(NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted);
                }
                if (this.onNavigationEvent && WindowAreaComponentApi3Requirements.IAuthTabCallback(this.onWarmupCompleted)) {
                    Object[] objArr = {this.onExtraCallback};
                    if (!((Boolean) WindowAreaComponentApi3Requirements.IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1801407997, 1801408007, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback())).booleanValue() && removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallback(this.IAuthTabCallbackDefault)) {
                        this.onTransact.seekTo(0L);
                        this.onTransact.setPlayWhenReady(true);
                        this.onTransact.play();
                    }
                }
            }
            int i5 = IAuthTabCallback_Parcel + 19;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onPlayerError(PlaybackException playbackException) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 109;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(playbackException, "");
            String strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(WindowAreaComponentApi3Requirements.onExtraCallbackWithResult(this.IAuthTabCallbackStub));
            if (strOnExtraCallbackWithResult == null || Intrinsics.areEqual(WindowAreaComponentApi3Requirements.onExtraCallbackWithResult(this.IAuthTabCallbackStub), strOnExtraCallbackWithResult)) {
                WindowAreaComponentApi3Requirements.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.asInterface, true);
                WindowAreaComponentApi3Requirements.onNavigationEvent(this.IAuthTabCallbackStub, "");
                removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(this.IAuthTabCallbackDefault);
                return;
            }
            WindowAreaComponentApi3Requirements.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.asInterface, true);
            WindowAreaComponentApi3Requirements.onNavigationEvent(this.IAuthTabCallbackStub, strOnExtraCallbackWithResult);
            int i4 = IAuthTabCallback_Parcel + 31;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onIsPlayingChanged(boolean z) {
            Function1<NativeAdsEventLogType, Unit> function1;
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 15;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            WindowAreaComponentApi3Requirements.IAuthTabCallbackStub(this.IAuthTabCallback, z);
            if (z) {
                int i4 = IAuthTabCallbackStubProxy + 13;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    WindowAreaComponentApi3Requirements.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.asInterface, true);
                    function1 = this.onExtraCallbackWithResult;
                } else {
                    WindowAreaComponentApi3Requirements.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.asInterface, false);
                    function1 = this.onExtraCallbackWithResult;
                }
                function1.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
            }
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isPausedByLifecycle$delegate;
        final /* synthetic */ boolean $isScrollStopped;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isVisibleForPlayback$delegate;
        final /* synthetic */ IAuthTabCallbackStub $playable;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $shouldShowThumbnail$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(IAuthTabCallbackStub iAuthTabCallbackStub, boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$playable = iAuthTabCallbackStub;
            this.$isScrollStopped = z;
            this.$isVisibleForPlayback$delegate = getsupportedhighspeedresolutionsfor;
            this.$isPausedByLifecycle$delegate = getsupportedhighspeedresolutionsfor2;
            this.$shouldShowThumbnail$delegate = getsupportedhighspeedresolutionsfor3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$playable, this.$isScrollStopped, this.$isVisibleForPlayback$delegate, this.$isPausedByLifecycle$delegate, this.$shouldShowThumbnail$delegate, access13800Var);
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (o.WindowAreaComponentApi3Requirements.IAuthTabCallback(r9.$isVisibleForPlayback$delegate) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r10 = o.WindowAreaComponentApi3Requirements.IAuthTabCallback.onExtraCallbackWithResult + 101;
            o.WindowAreaComponentApi3Requirements.IAuthTabCallback.onWarmupCompleted = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            if ((r10 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            r6 = new java.lang.Object[]{r9.$isPausedByLifecycle$delegate};
            r2 = 75 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (((java.lang.Boolean) o.WindowAreaComponentApi3Requirements.IAuthTabCallback(o.access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1801407997, 1801408007, o.access.IAuthTabCallbackStubProxy.IAuthTabCallback(), r6, o.access.IAuthTabCallbackStubProxy.IAuthTabCallback(), o.access.IAuthTabCallbackStubProxy.IAuthTabCallback())).booleanValue() != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            r6 = new java.lang.Object[]{r9.$isPausedByLifecycle$delegate};
            r2 = o.access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            r8 = o.access.IAuthTabCallbackStubProxy.IAuthTabCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        
            if ((!((java.lang.Boolean) o.WindowAreaComponentApi3Requirements.IAuthTabCallback(r2, -1801407997, 1801408007, o.access.IAuthTabCallbackStubProxy.IAuthTabCallback(), r6, o.access.IAuthTabCallbackStubProxy.IAuthTabCallback(), r8)).booleanValue()) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        
            if (r9.$isScrollStopped == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
        
            r10 = o.WindowAreaComponentApi3Requirements.IAuthTabCallback.onWarmupCompleted + 107;
            o.WindowAreaComponentApi3Requirements.IAuthTabCallback.onExtraCallbackWithResult = r10 % 128;
            r10 = r10 % 2;
            o.removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallbackWithResult(r9.$playable);
            r10 = o.WindowAreaComponentApi3Requirements.IAuthTabCallback.onExtraCallbackWithResult + 39;
            o.WindowAreaComponentApi3Requirements.IAuthTabCallback.onWarmupCompleted = r10 % 128;
            r10 = r10 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        
            if (o.WindowAreaComponentApi3Requirements.IAuthTabCallback(r9.$isVisibleForPlayback$delegate) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
        
            o.WindowAreaComponentApi3Requirements.IAuthTabCallback((o.getSupportedHighSpeedResolutionsFor) r9.$shouldShowThumbnail$delegate, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
        
            o.removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(r9.$playable);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
        
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
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 66 / 0;
            }
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Set<Float> $firedPercent;
        final /* synthetic */ Set<Long> $firedSeconds;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $firedView$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isPlaying$delegate;
        final /* synthetic */ Function1<NativeAdsEventLogType, Unit> $onEvent;
        final /* synthetic */ boolean $shouldTrackView;
        final /* synthetic */ List<Float> $trackingPositions;
        final /* synthetic */ List<Long> $trackingTimes;
        final /* synthetic */ ExoPlayer $videoPlayer;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(ExoPlayer exoPlayer, boolean z, Function1<? super NativeAdsEventLogType, Unit> function1, List<Float> list, List<Long> list2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, Set<Float> set, Set<Long> set2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$videoPlayer = exoPlayer;
            this.$shouldTrackView = z;
            this.$onEvent = function1;
            this.$trackingPositions = list;
            this.$trackingTimes = list2;
            this.$isPlaying$delegate = getsupportedhighspeedresolutionsfor;
            this.$firedView$delegate = getsupportedhighspeedresolutionsfor2;
            this.$firedPercent = set;
            this.$firedSeconds = set2;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$videoPlayer, this.$shouldTrackView, this.$onEvent, this.$trackingPositions, this.$trackingTimes, this.$isPlaying$delegate, this.$firedView$delegate, this.$firedPercent, this.$firedSeconds, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 17 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            boolean z = true;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!WindowAreaComponentApi3Requirements.onTransact(this.$isPlaying$delegate)) {
                    Unit unit = Unit.INSTANCE;
                    int i3 = onNavigationEvent + 117;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 84 / 0;
                    }
                    return unit;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 73;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            while (findRes.onWarmupCompleted(findresandmsg)) {
                int i6 = onNavigationEvent + 87;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                long duration = this.$videoPlayer.getDuration();
                long jCoerceAtLeast = RangesKt.coerceAtLeast(this.$videoPlayer.getCurrentPosition(), 0L);
                if (duration > 0) {
                    int i8 = onNavigationEvent + 125;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (this.$shouldTrackView && !WindowAreaComponentApi3Requirements.onExtraCallback(this.$firedView$delegate) && jCoerceAtLeast >= 2000) {
                        WindowAreaComponentApi3Requirements.onNavigationEvent(this.$firedView$delegate, z);
                        this.$onEvent.invoke(NativeAdsEventLogType.access100.onExtraCallbackWithResult);
                    }
                    List<Float> list = this.$trackingPositions;
                    Set<Float> set = this.$firedPercent;
                    Function1<NativeAdsEventLogType, Unit> function1 = this.$onEvent;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        float fFloatValue = ((Number) it.next()).floatValue();
                        if (!set.contains(access14000.onExtraCallbackWithResult(fFloatValue)) && jCoerceAtLeast >= ((long) (duration * fFloatValue))) {
                            set.add(access14000.onExtraCallbackWithResult(fFloatValue));
                            function1.invoke(new NativeAdsEventLogType.extraCallback((long) (fFloatValue * 100.0f)));
                        }
                    }
                    List<Long> list2 = this.$trackingTimes;
                    Set<Long> set2 = this.$firedSeconds;
                    Function1<NativeAdsEventLogType, Unit> function12 = this.$onEvent;
                    Iterator<T> it2 = list2.iterator();
                    int i10 = onNavigationEvent + 43;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    while (it2.hasNext()) {
                        long jLongValue = ((Number) it2.next()).longValue();
                        if (!set2.contains(access14000.onExtraCallback(jLongValue)) && jCoerceAtLeast >= 1000 * jLongValue) {
                            set2.add(access14000.onExtraCallback(jLongValue));
                            function12.invoke(new NativeAdsEventLogType.extraCallbackWithResult(jLongValue));
                        }
                    }
                }
                this.L$0 = findresandmsg;
                this.J$0 = duration;
                this.J$1 = jCoerceAtLeast;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                    int i12 = IAuthTabCallback + 13;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                z = true;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("2500");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 77;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1004");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 103;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            StringsKt.isBlank(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (!StringsKt.isBlank(str)) {
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = asBinder + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1001");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 103;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return unit;
    }

    private static final Unit getInterfaceDescriptor(Function1 function1) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1002");
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor(getsupportedhighspeedresolutionsfor, z);
            return Unit.INSTANCE;
        }
        getInterfaceDescriptor(getsupportedhighspeedresolutionsfor, z);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("3002");
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final SafePlayerView onNavigationEvent(ExoPlayer exoPlayer, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SafePlayerView safePlayerView = new SafePlayerView(context);
        safePlayerView.setPlayer(exoPlayer);
        safePlayerView.setUseController(false);
        safePlayerView.setKeepContentOnPlayerReset(true);
        int i2 = onExtraCallback + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return safePlayerView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(ExoPlayer exoPlayer, SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(safePlayerView, "");
        if (safePlayerView.getPlayer() != exoPlayer) {
            int i4 = asBinder + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                safePlayerView.setPlayer(exoPlayer);
                throw null;
            }
            safePlayerView.setPlayer(exoPlayer);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, !((Boolean) IAuthTabCallback(iIAuthTabCallback, -1123792887, 1123792896, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2)).booleanValue());
            int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback5 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            if (((Boolean) IAuthTabCallback(iIAuthTabCallback4, -1123792887, 1123792896, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback5)).booleanValue()) {
                function1.invoke(NativeAdsEventLogType.writeTypedObject.onExtraCallback);
                int i3 = onExtraCallback + 79;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            } else {
                function1.invoke(NativeAdsEventLogType.onPostMessage.IAuthTabCallback);
            }
        } else {
            int iIAuthTabCallback6 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback7 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback8 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, !((Boolean) IAuthTabCallback(iIAuthTabCallback6, -1123792887, 1123792896, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback8, iIAuthTabCallback7)).booleanValue());
            int iIAuthTabCallback9 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            int iIAuthTabCallback10 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            if (((Boolean) IAuthTabCallback(iIAuthTabCallback9, -1123792887, 1123792896, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback10)).booleanValue()) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access000(Function1 function1) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onExtraCallback = i2 % 128;
        char[] cArr = {33390, 24301};
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(cArr, 1 << Gravity.getAbsoluteGravity(0, 1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(cArr, 1 - Gravity.getAbsoluteGravity(0, 0), objArr2);
            obj = objArr2[0];
        }
        function1.invoke(((String) obj).intern());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        int i3 = 28 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, final Function1 function1, long j, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final ExoPlayer exoPlayer, NativeAdsDto.Creative.FeedVideo feedVideo, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, final Function1 function12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, String str, long j2, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2;
        CharSequence charSequence;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String strIntern;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = asBinder + 85;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallback + 51;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i7 = onExtraCallback + 61;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1569235976, i, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2.<anonymous>.<anonymous>.<anonymous> (NativeAdsFeedVideoV2.kt:432)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.7777778f, false, 2, (Object) null), setByteOrder.Companion.onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 39;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnExtraCallback = WindowAreaComponentApi3Requirements.onExtraCallback(getsupportedhighspeedresolutionsfor, ((Boolean) obj).booleanValue());
                        int i12 = onNavigationEvent + 73;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onPageCommitVisible.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, 0.5f, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 438);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 15;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr = {function1};
                        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                        Unit unit = (Unit) WindowAreaComponentApi3Requirements.IAuthTabCallback(iIAuthTabCallback, 1394820142, -1394820138, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2);
                        int i12 = IAuthTabCallback + 11;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 95 / 0;
                        }
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, isqueryrefinementenabled, (Function0) objOnMinimized2);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda22 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exoPlayer);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj = objOnMinimized3;
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    Function1 function13 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda2
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            SafePlayerView safePlayerViewOnWarmupCompleted;
                            int i9 = 2 % 2;
                            int i10 = onNavigationEvent + 125;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 != 0) {
                                safePlayerViewOnWarmupCompleted = WindowAreaComponentApi3Requirements.onWarmupCompleted(exoPlayer, (Context) obj2);
                                int i11 = 25 / 0;
                            } else {
                                safePlayerViewOnWarmupCompleted = WindowAreaComponentApi3Requirements.onWarmupCompleted(exoPlayer, (Context) obj2);
                            }
                            int i12 = onNavigationEvent + 15;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % 2;
                            return safePlayerViewOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function13);
                    obj = function13;
                }
                Function1 function14 = (Function1) obj;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exoPlayer);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback2) {
                    Object obj2 = objOnMinimized4;
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        Function1 function15 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj3) {
                                int i9 = 2 % 2;
                                int i10 = onNavigationEvent + 93;
                                onExtraCallback = i10 % 128;
                                int i11 = i10 % 2;
                                ExoPlayer exoPlayer2 = exoPlayer;
                                SafePlayerView safePlayerView = (SafePlayerView) obj3;
                                if (i11 == 0) {
                                    return WindowAreaComponentApi3Requirements.onNavigationEvent(exoPlayer2, safePlayerView);
                                }
                                WindowAreaComponentApi3Requirements.onNavigationEvent(exoPlayer2, safePlayerView);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function15);
                        obj2 = function15;
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function14, quirksExternalSyntheticBackport0OnNavigationEvent2, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
                    if (IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1681535407);
                        String strAccess000 = feedVideo.access000();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda4
                                private static int onExtraCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj3) {
                                    int i9 = 2 % 2;
                                    int i10 = onExtraCallback + 117;
                                    onExtraCallbackWithResult = i10 % 128;
                                    int i11 = i10 % 2;
                                    Unit unitIAuthTabCallback = WindowAreaComponentApi3Requirements.IAuthTabCallback((useAndConfigureProgramWithTexture) obj3);
                                    int i12 = onExtraCallbackWithResult + 69;
                                    onExtraCallback = i12 % 128;
                                    int i13 = i12 % 2;
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                        }
                        charSequence = "";
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{strAccess000, getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent3, (Function1) objOnMinimized5), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663680, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        charSequence = "";
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1681160896);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                    int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                    int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                    if (!((Boolean) IAuthTabCallback(iIAuthTabCallback, -1123792887, 1123792896, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor2}, iIAuthTabCallback3, iIAuthTabCallback2)).booleanValue()) {
                        Object[] objArr = new Object[1];
                        a(new char[]{35776, 31902, 59573, 21719, 52978, 9604, 22677, 53951, 15939, 56616, 23408, 4927, 16039, 37342, 9112, 53324, 6158, 60806, 30031, 64496, 9165, 46930, 64815, 62925, 7185, 31425, 19758, 25600, 16822, 14782, 4388, 12806, 30657, 32412, 14273, 52143, 16039, 37342, 62393, 57807, 49550, 39620, 35216, 28471, 6543, 18817, 3250, 53732, 23696, 28548, 44422, 50955, 40516, 30265, 36512, 38946, 47401, 7390, 27481, 21623, 13345, 58783, 29844, 992, 4388, 12806}, (ViewConfiguration.getTapTimeout() >> 16) + 66, objArr);
                        strIntern = ((String) objArr[0]).intern();
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{35776, 31902, 59573, 21719, 52978, 9604, 22677, 53951, 15939, 56616, 23408, 4927, 16039, 37342, 9112, 53324, 6158, 60806, 30031, 64496, 9165, 46930, 64815, 62925, 7185, 31425, 19758, 25600, 16822, 14782, 4388, 12806, 30657, 32412, 14273, 52143, 16039, 37342, 62393, 57807, 49550, 39620, 35216, 28471, 6543, 18817, 3250, 53732, 32829, 35574, 26405, 64553, 62393, 57807, 41280, 55622, 33171, 1903, 51331, 10991, 58396, 9200, 48749, 14499, 42156, 34523, 6315, 37992}, 67 - Color.argb(0, 0, 0, 0), objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(onextracallback, onextracallbackwithresult.onNavigationEvent()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(58.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function12);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent2 | zOnNavigationEvent3)) {
                        Object obj3 = objOnMinimized6;
                        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda5
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke() {
                                    int i9 = 2 % 2;
                                    int i10 = onExtraCallbackWithResult + 123;
                                    IAuthTabCallback = i10 % 128;
                                    int i11 = i10 % 2;
                                    Unit unitOnNavigationEvent = WindowAreaComponentApi3Requirements.onNavigationEvent(function12, getsupportedhighspeedresolutionsfor2);
                                    int i12 = onExtraCallbackWithResult + 45;
                                    IAuthTabCallback = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        return unitOnNavigationEvent;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0);
                            int i9 = onExtraCallback + 115;
                            asBinder = i9 % 128;
                            int i10 = i9 % 2;
                            obj3 = function0;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = configureReward.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent4, false, (setByteOrder) null, 0.0f, 0.99f, (deprecated_url) null, (List) null, false, (noStore) null, false, 0L, (String) null, (Function0) obj3, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 14326, (Object) null);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized7 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda6
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj4) {
                                    int i11 = 2 % 2;
                                    int i12 = onWarmupCompleted + 95;
                                    onExtraCallbackWithResult = i12 % 128;
                                    useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj4;
                                    if (i12 % 2 != 0) {
                                        return WindowAreaComponentApi3Requirements.onExtraCallback(useandconfigureprogramwithtexture);
                                    }
                                    WindowAreaComponentApi3Requirements.onExtraCallback(useandconfigureprogramwithtexture);
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized7);
                        immediateFailedFuture.IAuthTabCallback iAuthTabCallback = immediateFailedFuture.Companion;
                        AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{strIntern, quirksExternalSyntheticBackport0OnWarmupCompleted2, null, null, null, null, null, null, iAuthTabCallback.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663680, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), j, (toMetersPerSecond) null, 2, (Object) null);
                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback3);
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                            int i11 = onExtraCallback + 35;
                            asBinder = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent5 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent4 || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized8 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda7
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() throws Throwable {
                                    int i13 = 2 % 2;
                                    int i14 = IAuthTabCallback + 101;
                                    onNavigationEvent = i14 % 128;
                                    int i15 = i14 % 2;
                                    Unit unitOnTransact = WindowAreaComponentApi3Requirements.onTransact(function1);
                                    int i16 = onNavigationEvent + 19;
                                    IAuthTabCallback = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        return unitOnTransact;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized8);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent5, isqueryrefinementenabled, (Function0) objOnMinimized8);
                        component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult2, 48);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallback2);
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback3);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, RowScope.onNavigationEvent(RowScopeInstance.onNavigationEvent, onextracallback, 1.0f, false, 2, (Object) null), null, Long.valueOf(j2), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized9 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda8
                                private static int IAuthTabCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj4) {
                                    int i13 = 2 % 2;
                                    int i14 = onWarmupCompleted + 111;
                                    IAuthTabCallback = i14 % 128;
                                    Object[] objArr3 = {(useAndConfigureProgramWithTexture) obj4};
                                    if (i14 % 2 == 0) {
                                        int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                                        int iIAuthTabCallback5 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                                        return (Unit) WindowAreaComponentApi3Requirements.IAuthTabCallback(iIAuthTabCallback4, 1976220118, -1976220117, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr3, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback5);
                                    }
                                    int iIAuthTabCallback6 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                                    int iIAuthTabCallback7 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized9);
                        immediateFailedFuture immediatefailedfutureIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                        CharSequence charSequence2 = charSequence;
                        Object[] objArr3 = new Object[1];
                        a(new char[]{35776, 31902, 59573, 21719, 52978, 9604, 22677, 53951, 15939, 56616, 23408, 4927, 16039, 37342, 9112, 53324, 6158, 60806, 30031, 64496, 9165, 46930, 64815, 62925, 7185, 31425, 19758, 25600, 16822, 14782, 4388, 12806, 30657, 32412, 14273, 52143, 16039, 37342, 62393, 57807, 29506, 24625, 62119, 4562, 12993, 61622, 9728, 24550, 5063, 337, 35776, 31902, 3893, 36516, 6090, 43863, 8226, 58791, 52648, 57937, 19826, 47995, 23696, 28548, 44422, 50955, 40516, 30265, 29844, 992, 4388, 12806}, 72 - TextUtils.indexOf(charSequence2, charSequence2), objArr3);
                        AppLovinNativeAdImplc.onExtraCallback(((String) objArr3[0]).intern(), j2, quirksExternalSyntheticBackport0OnWarmupCompleted5, (String) null, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, 100666374, 752);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, final Function1 function1, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, boolean z, final String str, long j, boolean z2, long j2, long j3, final NativeAdsDto.Creative.FeedVideo feedVideo, boolean z3, long j4, long j5, long j6, boolean z4, long j7, final long j8, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final ExoPlayer exoPlayer, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, final Function1 function12, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, final String str2, final long j9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        float f;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled;
        Throwable th;
        Throwable th2;
        float f2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2;
        Object obj;
        float f3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i2;
        char c;
        boolean zOnNavigationEvent;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        float fIAuthTabCallback;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1197608720, i, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2.<anonymous> (NativeAdsFeedVideoV2.kt:303)");
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabledOnNavigationEvent = WebViewClientCompat.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(WebViewClientCompat.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), isqueryrefinementenabledOnNavigationEvent), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.IAuthTabCallback(), iAuthTabCallback.onNavigationEvent());
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda9
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 33;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitAsBinder = WindowAreaComponentApi3Requirements.asBinder(function1);
                        int i7 = onNavigationEvent + 123;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 == 0) {
                            return unitAsBinder;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i4 = onExtraCallback + 125;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport06, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i6 = onExtraCallback + 107;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            if (z2) {
                int i8 = onExtraCallback + 97;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2044660537);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ensureNavButtonView.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport06, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f)), j2, RoundedCornerShapeKt.onWarmupCompleted()), RoundedCornerShapeKt.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), j3, RoundedCornerShapeKt.onWarmupCompleted());
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent3) {
                    int i10 = onExtraCallback + 35;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda10
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i12 = 2 % 2;
                                int i13 = onExtraCallbackWithResult + 57;
                                onWarmupCompleted = i13 % 128;
                                int i14 = i13 % 2;
                                Unit unitIAuthTabCallback = WindowAreaComponentApi3Requirements.IAuthTabCallback(function1);
                                int i15 = onExtraCallbackWithResult + 1;
                                onWarmupCompleted = i15 % 128;
                                int i16 = i15 % 2;
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized2);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda11
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2) {
                                int i12 = 2 % 2;
                                int i13 = onExtraCallbackWithResult + 45;
                                onNavigationEvent = i13 % 128;
                                int i14 = i13 % 2;
                                Unit unitOnWarmupCompleted = WindowAreaComponentApi3Requirements.onWarmupCompleted((useAndConfigureProgramWithTexture) obj2);
                                if (i14 != 0) {
                                    int i15 = 5 / 0;
                                }
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized3);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted4);
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                    th = null;
                    f = 0.0f;
                    isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                    AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{(String) NativeAdsDto.Creative.FeedVideo.onNavigationEvent(598113625, new Object[]{feedVideo}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -598113624, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport06, 0.0f, 1, (Object) null), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663728, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                f = 0.0f;
                isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                th = null;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2043733172);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport02, 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback3);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i12 = onExtraCallback + 39;
                asBinder = i12 % 128;
                if (i12 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                    th.hashCode();
                    throw th;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                th2 = th;
            } else {
                th2 = th;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, z2 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (z3) {
                f2 = f;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                quirksExternalSyntheticBackport0OnNavigationEvent = quirksExternalSyntheticBackport03;
            } else {
                f2 = f;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, f2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f), 1, th2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = quirksExternalSyntheticBackport0OnExtraCallback4.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent4 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda12
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = onNavigationEvent + 65;
                        onExtraCallbackWithResult = i14 % 128;
                        if (i14 % 2 == 0) {
                            WindowAreaComponentApi3Requirements.onExtraCallback(function1);
                            throw null;
                        }
                        Unit unitOnExtraCallback = WindowAreaComponentApi3Requirements.onExtraCallback(function1);
                        int i15 = onNavigationEvent + 105;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3 = isqueryrefinementenabled;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback5, isqueryrefinementenabled3, (Function0) objOnMinimized4);
            String strAsBinder = feedVideo.asBinder();
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16);
            int iOnTransact = createCameraCaptureCallback.Companion.onTransact();
            GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback2 = GraphicDeviceInfo.Companion;
            float f4 = f2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport03;
            int i13 = 0;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsBinder, quirksExternalSyntheticBackport0IAuthTabCallback3, null, Long.valueOf(j4), Long.valueOf(jOnExtraCallback), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iOnTransact), Float.valueOf(f4), null, null, 0L, 0, false, iAuthTabCallback2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (z3) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1113860204);
                if (z2) {
                    int i14 = onExtraCallback + 41;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
                } else {
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f4);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport07, fIAuthTabCallback, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda13
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i16 = 2 % 2;
                            int i17 = IAuthTabCallback + 75;
                            onWarmupCompleted = i17 % 128;
                            int i18 = i17 % 2;
                            Object[] objArr = {(useAndConfigureProgramWithTexture) obj2};
                            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            if (i18 == 0) {
                                return (Unit) WindowAreaComponentApi3Requirements.IAuthTabCallback(iIAuthTabCallback, -1128609075, 1128609083, iIAuthTabCallback4, objArr, iIAuthTabCallback3, iIAuthTabCallback2);
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_ad, cameraCaptureResultEmptyCameraCaptureResult, 0), getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback6, (Function1) objOnMinimized5), null, Long.valueOf(j5), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(f4), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1113455902);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1570751569);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback7 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport07, f4, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 13, (Object) null), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 11, (Object) null);
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!zOnNavigationEvent5)) {
                    objOnMinimized6 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda14
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i16 = 2 % 2;
                            int i17 = IAuthTabCallback + 111;
                            onNavigationEvent = i17 % 128;
                            int i18 = i17 % 2;
                            Object[] objArr = {str, (useAndConfigureProgramWithTexture) obj2};
                            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            Unit unit = (Unit) WindowAreaComponentApi3Requirements.IAuthTabCallback(iIAuthTabCallback, -137515227, 137515240, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2);
                            int i19 = IAuthTabCallback + 41;
                            onNavigationEvent = i19 % 128;
                            if (i19 % 2 != 0) {
                                return unit;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback7, true, (Function1) objOnMinimized6);
                    component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback4);
                    Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        int i16 = onExtraCallback + 31;
                        asBinder = i16 % 128;
                        int i17 = i16 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback5);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult2.onTransact());
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent) {
                        int i18 = asBinder + 65;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                        if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized7 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda15
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() {
                                    int i20 = 2 % 2;
                                    int i21 = IAuthTabCallback + 99;
                                    onNavigationEvent = i21 % 128;
                                    int i22 = i21 % 2;
                                    Unit unitOnNavigationEvent = WindowAreaComponentApi3Requirements.onNavigationEvent(function1);
                                    int i23 = IAuthTabCallback + 49;
                                    onNavigationEvent = i23 % 128;
                                    int i24 = i23 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                        }
                        isqueryrefinementenabled2 = isqueryrefinementenabled3;
                        i13 = 0;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feedVideo.asInterface(), WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport07, isqueryrefinementenabled2, (Function0) objOnMinimized7), null, Long.valueOf(j6), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(f4), null, null, 0L, 0, false, iAuthTabCallback2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        if (!z4) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1858567975);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport07;
                        } else {
                            int i20 = onExtraCallback + 31;
                            asBinder = i20 % 128;
                            if (i20 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1858946330);
                                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                                cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                throw null;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1858946330);
                            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnNavigationEvent6 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized8 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda16
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke() {
                                        int i21 = 2 % 2;
                                        int i22 = onExtraCallbackWithResult + 61;
                                        onExtraCallback = i22 % 128;
                                        Object obj2 = null;
                                        if (i22 % 2 != 0) {
                                            WindowAreaComponentApi3Requirements.onWarmupCompleted(function1);
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        Unit unitOnWarmupCompleted = WindowAreaComponentApi3Requirements.onWarmupCompleted(function1);
                                        int i23 = onExtraCallbackWithResult + 53;
                                        onExtraCallback = i23 % 128;
                                        if (i23 % 2 == 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        obj2.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                            }
                            quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport07;
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feedVideo.IAuthTabCallbackStub(), WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport07, isqueryrefinementenabled2, (Function0) objOnMinimized8), null, Long.valueOf(j7), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(f4), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        f3 = f4;
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                        c = 6;
                        i2 = 1;
                        obj = null;
                    }
                } else {
                    int i21 = onExtraCallback + 103;
                    asBinder = i21 % 128;
                    int i22 = i21 % 2;
                    if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback42 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback7, true, (Function1) objOnMinimized6);
                    component5 component5VarOnNavigationEvent32 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode52 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject52 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted72 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback42);
                    Function0 function0IAuthTabCallback52 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult52 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult52, component5VarOnNavigationEvent32, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult52, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject52, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult52, Integer.valueOf(iHashCode52), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult52, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult52, quirksExternalSyntheticBackport0OnWarmupCompleted72, onextracallbackwithresult2.onTransact());
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    Object objOnMinimized72 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent) {
                    }
                }
            } else {
                isqueryrefinementenabled2 = isqueryrefinementenabled3;
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1569424583);
                f3 = f4;
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport07;
                i2 = 1;
                c = 6;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, f3, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback8 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, f3, i2, obj), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 13, (Object) null);
            RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
            setFeatureSelectionListener setfeatureselectionlistener = setFeatureSelectionListener.onNavigationEvent;
            long jOnNavigationEvent = setByteOrder.Companion.onNavigationEvent();
            int i23 = setFeatureSelectionListener.onExtraCallbackWithResult;
            boolean z5 = i2;
            final isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled4 = isqueryrefinementenabled2;
            SessionConfigBuilder.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback8, roundedCornerShapeOnNavigationEvent, setfeatureselectionlistener.onNavigationEvent(jOnNavigationEvent, 0L, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i23 << 12) | 6, 14), (SessionConfigExternalSyntheticLambda0) null, setfeatureselectionlistener.IAuthTabCallback(z5, cameraCaptureResultEmptyCameraCaptureResult, (i23 << 3) | 6, i13).onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.5f), new createString(j, (DefaultConstructorMarker) null)), ForwardingCameraControl.onExtraCallback(1569235976, z5, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda17
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i24 = 2 % 2;
                    int i25 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i25 % 128;
                    int i26 = i25 % 2;
                    isQueryRefinementEnabled isqueryrefinementenabled5 = isqueryrefinementenabled4;
                    Function1 function13 = function1;
                    long j10 = j8;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor;
                    ExoPlayer exoPlayer2 = exoPlayer;
                    NativeAdsDto.Creative.FeedVideo feedVideo2 = feedVideo;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = getsupportedhighspeedresolutionsfor2;
                    Function1 function14 = function12;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = getsupportedhighspeedresolutionsfor3;
                    String str3 = str2;
                    long j11 = j9;
                    int iIntValue = ((Integer) obj4).intValue();
                    Object[] objArr = {isqueryrefinementenabled5, function13, Long.valueOf(j10), getsupportedhighspeedresolutionsfor4, exoPlayer2, feedVideo2, getsupportedhighspeedresolutionsfor5, function14, getsupportedhighspeedresolutionsfor6, str3, Long.valueOf(j11), (MeteringRepeatingSessionExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                    int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                    int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                    Unit unit = (Unit) WindowAreaComponentApi3Requirements.IAuthTabCallback(iIAuthTabCallback, 457550735, -457550723, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2);
                    int i27 = onExtraCallbackWithResult + 125;
                    onWarmupCompleted = i27 % 128;
                    if (i27 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196614, 8);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0504  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z, @NotNull final deleteProfile deleteprofile, @NotNull final NativeAdsDto.Creative.FeedVideo feedVideo, @NotNull final List<? extends NativeAdsEventLogType> list, final boolean z2, @Nullable onReceivedHttpError.IAuthTabCallback iAuthTabCallback, @Nullable Function1<? super NativeAdsEventLogType, Unit> function1, @NotNull final Function1<? super String, Unit> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        onReceivedHttpError.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult;
        Function1<? super NativeAdsEventLogType, Unit> function13;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final Function1<? super NativeAdsEventLogType, Unit> function14;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final onReceivedHttpError.IAuthTabCallback iAuthTabCallback2;
        boolean zIsBlank;
        String strIAuthTabCallbackStubProxy;
        String strAsInterface;
        boolean zOnNavigationEvent;
        int i5;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        boolean zOnNavigationEvent2;
        Object objOnMinimized;
        Object objOnMinimized2;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        boolean zOnNavigationEvent3;
        Object objOnMinimized3;
        String str;
        boolean zOnNavigationEvent4;
        Object objOnMinimized4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean zOnNavigationEvent5;
        Object objOnMinimized5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        float f;
        List list2;
        List list3;
        Float fValueOf;
        Object obj;
        boolean z7;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        Boolean bool;
        Configuration configuration;
        int i7;
        int i8;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(feedVideo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(378973616);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i11 = onExtraCallback + 115;
                asBinder = i11 % 128;
                i8 = i11 % 2 == 0 ? 101 : 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo)) {
                int i12 = onExtraCallback + 59;
                asBinder = i12 % 128;
                i7 = i12 % 2 == 0 ? 6698 : 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            int i13 = asBinder + 59;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0 ? (i2 & 64) != 0 : (i2 & 53) != 0) {
                iAuthTabCallbackOnExtraCallbackWithResult = iAuthTabCallback;
            } else {
                iAuthTabCallbackOnExtraCallbackWithResult = iAuthTabCallback;
                int i14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackOnExtraCallbackWithResult) ? 1048576 : 524288;
                i3 |= i14;
            }
            i3 |= i14;
        } else {
            iAuthTabCallbackOnExtraCallbackWithResult = iAuthTabCallback;
        }
        int i15 = i2 & 128;
        if (i15 != 0) {
            i3 |= 12582912;
            function13 = function1;
        } else {
            function13 = function1;
            if ((i & 12582912) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13)) {
                    int i16 = asBinder + 75;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    i4 = 8388608;
                } else {
                    i4 = 4194304;
                }
                i3 |= i4;
            }
        }
        if ((100663296 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 67108864 : 33554432;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) != 38347922, i3 & 1)) {
            int i18 = onExtraCallback + 3;
            asBinder = i18 % 128;
            if (i18 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    int i19 = onExtraCallback + 9;
                    asBinder = i19 % 128;
                    if (i19 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 22) != 0) {
                            i3 &= -3670017;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 64) != 0) {
                        }
                    }
                }
                final Function1<? super NativeAdsEventLogType, Unit> function15 = function13;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                final onReceivedHttpError.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallbackOnExtraCallbackWithResult;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(378973616, i3, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2 (NativeAdsFeedVideoV2.kt:88)");
                }
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                zIsBlank = StringsKt.isBlank(feedVideo.asInterface());
                boolean zIsBlank2 = StringsKt.isBlank(feedVideo.IAuthTabCallbackStub());
                boolean zIsBlank3 = StringsKt.isBlank((String) NativeAdsDto.Creative.FeedVideo.onNavigationEvent(598113625, new Object[]{feedVideo}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -598113624, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-878551369);
                strIAuthTabCallbackStubProxy = feedVideo.IAuthTabCallbackStubProxy();
                if (StringsKt.isBlank(strIAuthTabCallbackStubProxy)) {
                    strIAuthTabCallbackStubProxy = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_text_more, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                }
                final String str2 = strIAuthTabCallbackStubProxy;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
                boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(deleteprofile, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 14) | 48);
                final long jOnExtraCallback = !zOnExtraCallbackWithResult ? ByteOrderedDataOutputStream.onExtraCallback(484039167) : ByteOrderedDataOutputStream.onExtraCallback(218243143);
                final long jOnExtraCallback2 = !zOnExtraCallbackWithResult ? ByteOrderedDataOutputStream.onExtraCallback(484039167) : ByteOrderedDataOutputStream.onExtraCallback(218243143);
                final long jOnExtraCallback3 = !zOnExtraCallbackWithResult ? ByteOrderedDataOutputStream.onExtraCallback(484039167) : ByteOrderedDataOutputStream.onExtraCallback(218243143);
                final long jAsBinder = !zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L);
                final long jAsBinder2 = !zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L);
                final long jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(zOnExtraCallbackWithResult ? 3438473983L : 4281548107L);
                final long jOnExtraCallbackWithResult2 = ByteOrderedDataOutputStream.onExtraCallbackWithResult(!zOnExtraCallbackWithResult ? 3019043583L : 4283324776L);
                final long jOnExtraCallback4 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth.IAuthTabCallback(context, feedVideo.access100(), -1));
                final long jOnExtraCallback5 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth.IAuthTabCallback(context, feedVideo.onTransact(), Color.parseColor("#262459")));
                if (!zIsBlank || zIsBlank2) {
                    strAsInterface = feedVideo.asInterface();
                } else {
                    strAsInterface = feedVideo.asInterface() + ", " + feedVideo.IAuthTabCallbackStub();
                }
                float fMin = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
                Resources resources = context.getResources();
                final QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedAccess000 = ((resources != null || (configuration = resources.getConfiguration()) == null) ? 1.0f : configuration.fontScale) <= 1.1f ? QuirkSettingsLoader.Companion.access000() : QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.getInterfaceDescriptor());
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent) {
                    int i20 = asBinder + 49;
                    onExtraCallback = i20 % 128;
                    i5 = 2;
                    int i21 = i20 % 2;
                    if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent((String) IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1830795262, 1830795267, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback()));
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
                        ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, (String) null, (LoadControl) null, (Function1) null, (Function1) null, 30, (Object) null);
                        if (!StringsKt.isBlank((String) IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1830795262, 1830795267, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback()))) {
                            CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayerIAuthTabCallback, context, (String) IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1830795262, 1830795267, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback()), false, null, 12, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                        }
                        exoPlayerIAuthTabCallback.setPlayWhenReady(false);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(exoPlayerIAuthTabCallback);
                        objOnMinimized = exoPlayerIAuthTabCallback;
                    }
                    final ExoPlayer exoPlayer = (ExoPlayer) objOnMinimized;
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        int i22 = asBinder + 107;
                        onExtraCallback = i22 % 128;
                        if (i22 % 2 != 0) {
                            bool = Boolean.FALSE;
                            cameraPresenceProviderExternalSyntheticLambda0 = null;
                        } else {
                            cameraPresenceProviderExternalSyntheticLambda0 = null;
                            bool = Boolean.FALSE;
                        }
                        objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, cameraPresenceProviderExternalSyntheticLambda0, 2, cameraPresenceProviderExternalSyntheticLambda0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent3 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        str = strAsInterface;
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                        objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                    } else {
                        str = strAsInterface;
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                    zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent4 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                        objOnMinimized4 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                    zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent5 || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        z3 = zIsBlank3;
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted3);
                        objOnMinimized5 = getsupportedhighspeedresolutionsforOnWarmupCompleted3;
                    } else {
                        z3 = zIsBlank3;
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                    i6 = 57344 & i3;
                    if (i6 != 16384) {
                        z4 = zIsBlank;
                        z5 = true;
                    } else {
                        z4 = zIsBlank;
                        z5 = false;
                    }
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z5) {
                        Object obj2 = objOnMinimized7;
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) it.next();
                                Iterator it2 = it;
                                NativeAdsEventLogType.extraCallbackWithResult extracallbackwithresult = nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult ? (NativeAdsEventLogType.extraCallbackWithResult) nativeAdsEventLogType : null;
                                Long lValueOf = extracallbackwithresult != null ? Long.valueOf(extracallbackwithresult.onExtraCallbackWithResult()) : null;
                                if (lValueOf != null) {
                                    arrayList.add(lValueOf);
                                }
                                it = it2;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(arrayList);
                            obj2 = arrayList;
                        }
                        List list4 = (List) obj2;
                        if (i6 == 16384) {
                            int i23 = asBinder + 93;
                            onExtraCallback = i23 % 128;
                            int i24 = i23 % 2;
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z6 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                NativeAdsEventLogType nativeAdsEventLogType2 = (NativeAdsEventLogType) it3.next();
                                float f2 = fMin;
                                if ((nativeAdsEventLogType2 instanceof NativeAdsEventLogType.extraCallback ? (NativeAdsEventLogType.extraCallback) nativeAdsEventLogType2 : null) != null) {
                                    list3 = list4;
                                    fValueOf = Float.valueOf(r3.IAuthTabCallback() / 100.0f);
                                } else {
                                    list3 = list4;
                                    fValueOf = null;
                                }
                                if (fValueOf != null) {
                                    arrayList2.add(fValueOf);
                                }
                                it3 = it4;
                                fMin = f2;
                                list4 = list3;
                            }
                            f = fMin;
                            list2 = list4;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(arrayList2);
                            obj = arrayList2;
                        } else {
                            f = fMin;
                            list2 = list4;
                            obj = objOnMinimized8;
                        }
                        List list5 = (List) obj;
                        boolean z8 = i6 == 16384;
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z8 || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            List<? extends NativeAdsEventLogType> list6 = list;
                            if ((list6 instanceof Collection) && list6.isEmpty()) {
                                z7 = false;
                                objOnMinimized9 = Boolean.valueOf(z7);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                            } else {
                                Iterator<T> it5 = list6.iterator();
                                while (it5.hasNext()) {
                                    if (((NativeAdsEventLogType) it5.next()) instanceof NativeAdsEventLogType.access100) {
                                        int i25 = asBinder + 111;
                                        onExtraCallback = i25 % 128;
                                        int i26 = i25 % 2;
                                        z7 = true;
                                        break;
                                    }
                                }
                                z7 = false;
                                objOnMinimized9 = Boolean.valueOf(z7);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                            }
                        }
                        Boolean bool2 = (Boolean) objOnMinimized9;
                        boolean zBooleanValue = bool2.booleanValue();
                        String strIAuthTabCallback = feedVideo.IAuthTabCallback();
                        String interfaceDescriptor = feedVideo.getInterfaceDescriptor();
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback);
                        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor);
                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnNavigationEvent6 | zOnNavigationEvent7) || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized10 = new LinkedHashSet();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                        }
                        Set set = (Set) objOnMinimized10;
                        String strIAuthTabCallback2 = feedVideo.IAuthTabCallback();
                        String interfaceDescriptor2 = feedVideo.getInterfaceDescriptor();
                        boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback2);
                        boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor2);
                        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnNavigationEvent8 | zOnNavigationEvent9) || objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized11 = new LinkedHashSet();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                        }
                        Set set2 = (Set) objOnMinimized11;
                        String strIAuthTabCallback3 = feedVideo.IAuthTabCallback();
                        String interfaceDescriptor3 = feedVideo.getInterfaceDescriptor();
                        boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback3);
                        boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor3);
                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnNavigationEvent10 | zOnNavigationEvent11) || objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized12 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                        }
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnMinimized12;
                        String strIAuthTabCallback4 = feedVideo.IAuthTabCallback();
                        String interfaceDescriptor4 = feedVideo.getInterfaceDescriptor();
                        boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback4);
                        boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor4);
                        Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnNavigationEvent12 | zOnNavigationEvent13) || objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized13 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized13;
                        Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized14 == onwarmupcompleted2.onExtraCallback()) {
                            getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor7;
                            objOnMinimized14 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized14);
                        } else {
                            getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor7;
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized14;
                        boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(exoPlayer);
                        Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent14 || objOnMinimized15 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized15 = new IAuthTabCallbackStub(exoPlayer, getsupportedhighspeedresolutionsfor);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized15);
                        }
                        final IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) objOnMinimized15;
                        boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor8);
                        int i27 = 29360128 & i3;
                        boolean z9 = i27 == 8388608;
                        int i28 = i3 & 458752;
                        boolean z10 = i28 == 131072;
                        boolean zOnNavigationEvent16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor6);
                        boolean zOnNavigationEvent17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub);
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                        boolean zOnNavigationEvent18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                        boolean zOnNavigationEvent19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor4);
                        Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnNavigationEvent15 | z9 | z10 | zOnNavigationEvent16 | zOnNavigationEvent17 | zOnExtraCallback | zOnNavigationEvent18 | zOnNavigationEvent19) || objOnMinimized16 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized16 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda19
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj3) {
                                    int i29 = 2 % 2;
                                    int i30 = onNavigationEvent + 19;
                                    onExtraCallback = i30 % 128;
                                    int i31 = i30 % 2;
                                    decrementVideoUsage decrementvideousageOnWarmupCompleted = WindowAreaComponentApi3Requirements.onWarmupCompleted(exoPlayer, function15, z2, iAuthTabCallbackStub, getsupportedhighspeedresolutionsfor8, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor3, (isInVideoUsage) obj3);
                                    int i32 = onExtraCallback + 105;
                                    onNavigationEvent = i32 % 128;
                                    int i33 = i32 % 2;
                                    return decrementvideousageOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized16);
                        }
                        isZslDisabledByByUserCaseConfig.onWarmupCompleted(exoPlayer, iAuthTabCallbackStub, (Function1) objOnMinimized16, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        boolean zBooleanValue2 = ((Boolean) IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1123792887, 1123792896, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor5}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback())).booleanValue();
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                        boolean zOnNavigationEvent20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
                        Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnExtraCallback2 | zOnNavigationEvent20) || objOnMinimized17 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized17 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda20
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallback;

                                public final Object invoke(Object obj3) {
                                    int i29 = 2 % 2;
                                    int i30 = onExtraCallback + 71;
                                    IAuthTabCallback = i30 % 128;
                                    int i31 = i30 % 2;
                                    Object[] objArr = {exoPlayer, getsupportedhighspeedresolutionsfor5, (isInVideoUsage) obj3};
                                    int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                                    int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                                    decrementVideoUsage decrementvideousage = (decrementVideoUsage) WindowAreaComponentApi3Requirements.IAuthTabCallback(iIAuthTabCallback, 968013412, -968013410, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2);
                                    int i32 = IAuthTabCallback + 11;
                                    onExtraCallback = i32 % 128;
                                    if (i32 % 2 != 0) {
                                        int i33 = 17 / 0;
                                    }
                                    return decrementvideousage;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized17);
                        }
                        isZslDisabledByByUserCaseConfig.onWarmupCompleted(exoPlayer, Boolean.valueOf(zBooleanValue2), (Function1) objOnMinimized17, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        boolean zOnNavigationEvent21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor6);
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                        Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnNavigationEvent21 | zOnExtraCallback3 | zOnExtraCallback4) || objOnMinimized18 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized18 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda21
                                private static int onExtraCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj3) {
                                    int i29 = 2 % 2;
                                    int i30 = onExtraCallback + 23;
                                    onExtraCallbackWithResult = i30 % 128;
                                    int i31 = i30 % 2;
                                    Object[] objArr = {textFieldScrollKtExternalSyntheticLambda0, exoPlayer, getsupportedhighspeedresolutionsfor6, (isInVideoUsage) obj3};
                                    int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                                    int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                                    decrementVideoUsage decrementvideousage = (decrementVideoUsage) WindowAreaComponentApi3Requirements.IAuthTabCallback(iIAuthTabCallback, -1431141332, 1431141335, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2);
                                    int i32 = onExtraCallbackWithResult + 49;
                                    onExtraCallback = i32 % 128;
                                    int i33 = i32 % 2;
                                    return decrementvideousage;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized18);
                        }
                        isZslDisabledByByUserCaseConfig.onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, exoPlayer, (Function1) objOnMinimized18, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        Object[] objArr = {Boolean.valueOf(access100((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor9)), Boolean.valueOf(z2), Boolean.valueOf(((Boolean) IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 255020600, -255020586, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor6}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback())).booleanValue()), iAuthTabCallbackStub};
                        boolean zOnNavigationEvent22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor6);
                        boolean zOnNavigationEvent23 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor4);
                        boolean zOnNavigationEvent24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub);
                        boolean z11 = i28 == 131072;
                        Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnNavigationEvent22 | zOnNavigationEvent23 | zOnNavigationEvent24 | z11) || objOnMinimized19 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized19 = new IAuthTabCallback(iAuthTabCallbackStub, z2, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor6, getsupportedhighspeedresolutionsfor4, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized19);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized19, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        List list7 = list2;
                        Object[] objArr2 = {Boolean.valueOf(IAuthTabCallbackStubProxy((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3)), list7, list5, bool2};
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = getsupportedhighspeedresolutionsfor2;
                        boolean zOnNavigationEvent25 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor10);
                        boolean z12 = i27 == 8388608;
                        boolean zOnNavigationEvent26 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list5);
                        boolean zOnNavigationEvent27 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(set);
                        boolean zOnNavigationEvent28 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list7);
                        boolean zOnNavigationEvent29 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(set2);
                        Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(!(zOnExtraCallback5 | zOnExtraCallback6 | zOnNavigationEvent25 | z12 | zOnNavigationEvent26 | zOnNavigationEvent27 | zOnNavigationEvent28 | zOnNavigationEvent29)) || objOnMinimized20 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized20 = new onExtraCallback(exoPlayer, zBooleanValue, function15, list5, list7, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor10, set, set2, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized20);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized20, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        boolean zOnNavigationEvent30 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub);
                        Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent30 || objOnMinimized21 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized21 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda22
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj3) {
                                    int i29 = 2 % 2;
                                    int i30 = onExtraCallback + 91;
                                    onNavigationEvent = i30 % 128;
                                    int i31 = i30 % 2;
                                    decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = WindowAreaComponentApi3Requirements.onExtraCallbackWithResult(iAuthTabCallbackStub, (isInVideoUsage) obj3);
                                    int i32 = onExtraCallback + 35;
                                    onNavigationEvent = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        return decrementvideousageOnExtraCallbackWithResult;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized21);
                        }
                        isZslDisabledByByUserCaseConfig.onExtraCallback(iAuthTabCallbackStub, (Function1) objOnMinimized21, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        final boolean z13 = !z4;
                        final boolean z14 = !z3;
                        final boolean z15 = !zIsBlank2;
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                        final String str3 = str;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), f)), ForwardingCameraControl.onExtraCallback(-1197608720, true, new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda23
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj3, Object obj4) throws Throwable {
                                int i29 = 2 % 2;
                                int i30 = onExtraCallbackWithResult + 5;
                                onNavigationEvent = i30 % 128;
                                int i31 = i30 % 2;
                                Unit unitOnExtraCallback = WindowAreaComponentApi3Requirements.onExtraCallback(quirksExternalSyntheticBackport06, iAuthTabCallback3, function12, onwarmupcompletedAccess000, z13, str3, jOnExtraCallback3, z14, jOnExtraCallback, jOnExtraCallback2, feedVideo, z, jAsBinder, jAsBinder2, jOnExtraCallbackWithResult, z15, jOnExtraCallbackWithResult2, jOnExtraCallback5, getsupportedhighspeedresolutionsfor9, exoPlayer, getsupportedhighspeedresolutionsfor5, function15, getsupportedhighspeedresolutionsfor4, str2, jOnExtraCallback4, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                int i32 = onNavigationEvent + 79;
                                onExtraCallbackWithResult = i32 % 128;
                                int i33 = i32 % 2;
                                return unitOnExtraCallback;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        iAuthTabCallback2 = iAuthTabCallback3;
                        function14 = function15;
                    }
                } else {
                    i5 = 2;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(feedVideo.getInterfaceDescriptor(), (CameraPresenceProviderExternalSyntheticLambda0) null, i5, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted4);
                objOnMinimized6 = getsupportedhighspeedresolutionsforOnWarmupCompleted4;
                getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent((String) IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1830795262, 1830795267, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback()));
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent2) {
                    CommonModule_setSecureScreen commonModule_setSecureScreen2 = CommonModule_setSecureScreen.onWarmupCompleted;
                    ExoPlayer exoPlayerIAuthTabCallback2 = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen2, context, (String) null, (LoadControl) null, (Function1) null, (Function1) null, 30, (Object) null);
                    if (!StringsKt.isBlank((String) IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1830795262, 1830795267, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback()))) {
                    }
                    exoPlayerIAuthTabCallback2.setPlayWhenReady(false);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(exoPlayerIAuthTabCallback2);
                    objOnMinimized = exoPlayerIAuthTabCallback2;
                    final ExoPlayer exoPlayer2 = (ExoPlayer) objOnMinimized;
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor32 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent3) {
                        str = strAsInterface;
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted5);
                        objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted5;
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor42 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                        zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                        objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent4) {
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted22 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted22);
                            objOnMinimized4 = getsupportedhighspeedresolutionsforOnWarmupCompleted22;
                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor52 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                            zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                            objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent5) {
                                z3 = zIsBlank3;
                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted32 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted32);
                                objOnMinimized5 = getsupportedhighspeedresolutionsforOnWarmupCompleted32;
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor62 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                                i6 = 57344 & i3;
                                if (i6 != 16384) {
                                }
                                Object objOnMinimized72 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z5) {
                                }
                            }
                        }
                    }
                }
            }
            if (i10 != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            if ((i2 & 64) != 0) {
                i3 &= -3670017;
                iAuthTabCallbackOnExtraCallbackWithResult = onReceivedHttpError.onNavigationEvent.onExtraCallbackWithResult(false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663296, 255);
            }
            if (i15 != 0) {
                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized22 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized22 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda18
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj3) {
                            int i29 = 2 % 2;
                            int i30 = onWarmupCompleted + 113;
                            onExtraCallbackWithResult = i30 % 128;
                            int i31 = i30 % 2;
                            Unit unitOnExtraCallback = WindowAreaComponentApi3Requirements.onExtraCallback((NativeAdsEventLogType) obj3);
                            int i32 = onWarmupCompleted + 89;
                            onExtraCallbackWithResult = i32 % 128;
                            int i33 = i32 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized22);
                }
                function13 = (Function1) objOnMinimized22;
            }
            final Function1 function152 = function13;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport02;
            final onReceivedHttpError.IAuthTabCallback iAuthTabCallback32 = iAuthTabCallbackOnExtraCallbackWithResult;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            zIsBlank = StringsKt.isBlank(feedVideo.asInterface());
            boolean zIsBlank22 = StringsKt.isBlank(feedVideo.IAuthTabCallbackStub());
            boolean zIsBlank32 = StringsKt.isBlank((String) NativeAdsDto.Creative.FeedVideo.onNavigationEvent(598113625, new Object[]{feedVideo}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -598113624, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-878551369);
            strIAuthTabCallbackStubProxy = feedVideo.IAuthTabCallbackStubProxy();
            if (StringsKt.isBlank(strIAuthTabCallbackStubProxy)) {
            }
            final String str22 = strIAuthTabCallbackStubProxy;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            getStrokeWidth getstrokewidth2 = getStrokeWidth.onExtraCallback;
            boolean zOnExtraCallbackWithResult2 = getstrokewidth2.onExtraCallbackWithResult(deleteprofile, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 14) | 48);
            final long jOnExtraCallback6 = !zOnExtraCallbackWithResult2 ? ByteOrderedDataOutputStream.onExtraCallback(484039167) : ByteOrderedDataOutputStream.onExtraCallback(218243143);
            final long jOnExtraCallback22 = !zOnExtraCallbackWithResult2 ? ByteOrderedDataOutputStream.onExtraCallback(484039167) : ByteOrderedDataOutputStream.onExtraCallback(218243143);
            final long jOnExtraCallback32 = !zOnExtraCallbackWithResult2 ? ByteOrderedDataOutputStream.onExtraCallback(484039167) : ByteOrderedDataOutputStream.onExtraCallback(218243143);
            final long jAsBinder3 = !zOnExtraCallbackWithResult2 ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L);
            final long jAsBinder22 = !zOnExtraCallbackWithResult2 ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L);
            final long jOnExtraCallbackWithResult3 = ByteOrderedDataOutputStream.onExtraCallbackWithResult(zOnExtraCallbackWithResult2 ? 3438473983L : 4281548107L);
            final long jOnExtraCallbackWithResult22 = ByteOrderedDataOutputStream.onExtraCallbackWithResult(!zOnExtraCallbackWithResult2 ? 3019043583L : 4283324776L);
            final long jOnExtraCallback42 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth2.IAuthTabCallback(context2, feedVideo.access100(), -1));
            final long jOnExtraCallback52 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth2.IAuthTabCallback(context2, feedVideo.onTransact(), Color.parseColor("#262459")));
            if (zIsBlank) {
                strAsInterface = feedVideo.asInterface();
                float fMin2 = Math.min(context2.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
                Resources resources2 = context2.getResources();
                if (resources2 != null) {
                    final QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedAccess0002 = ((resources2 != null || (configuration = resources2.getConfiguration()) == null) ? 1.0f : configuration.fontScale) <= 1.1f ? QuirkSettingsLoader.Companion.access000() : QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.getInterfaceDescriptor());
                    Object objOnMinimized62 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent) {
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted42 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(feedVideo.getInterfaceDescriptor(), (CameraPresenceProviderExternalSyntheticLambda0) null, i5, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted42);
                    objOnMinimized62 = getsupportedhighspeedresolutionsforOnWarmupCompleted42;
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized62;
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent((String) IAuthTabCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1830795262, 1830795267, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback()));
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent2) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            function14 = function13;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            iAuthTabCallback2 = iAuthTabCallbackOnExtraCallbackWithResult;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$$ExternalSyntheticLambda24
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj3, Object obj4) {
                    int i29 = 2 % 2;
                    int i30 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i30 % 128;
                    int i31 = i30 % 2;
                    Unit unitOnWarmupCompleted = WindowAreaComponentApi3Requirements.onWarmupCompleted(quirksExternalSyntheticBackport03, z, deleteprofile, feedVideo, list, z2, iAuthTabCallback2, function14, function12, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i32 = onExtraCallbackWithResult + 121;
                    onNavigationEvent = i32 % 128;
                    int i33 = i32 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    private static final decrementVideoUsage IAuthTabCallback(ExoPlayer exoPlayer, Function1 function1, boolean z, IAuthTabCallbackStub iAuthTabCallbackStub, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(function1, z, iAuthTabCallbackStub, exoPlayer, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6);
        exoPlayer.addListener(onwarmupcompleted);
        onNavigationEvent onnavigationevent = new onNavigationEvent(exoPlayer, onwarmupcompleted);
        int i2 = onExtraCallback + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    private static final decrementVideoUsage onNavigationEvent(ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        exoPlayer.setVolume(((Boolean) IAuthTabCallback(iIAuthTabCallback, -1123792887, 1123792896, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue() ? 0.0f : 1.0f);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        int i4 = asBinder + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresult;
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, final ExoPlayer exoPlayer, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedVideoV2Kt$NativeAdsFeedVideoV2$4$1$observer$1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = onWarmupCompleted + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                WindowAreaComponentApi3Requirements.onWarmupCompleted((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, true);
                exoPlayer.pause();
                exoPlayer.setPlayWhenReady(false);
                int i5 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    WindowAreaComponentApi3Requirements.onWarmupCompleted((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, false);
                    exoPlayer.pause();
                    exoPlayer.setPlayWhenReady(true);
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    WindowAreaComponentApi3Requirements.onWarmupCompleted((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, true);
                    exoPlayer.pause();
                    exoPlayer.setPlayWhenReady(false);
                }
                int i4 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2;
                boolean z;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                    z = true;
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                    z = false;
                }
                WindowAreaComponentApi3Requirements.onWarmupCompleted(getsupportedhighspeedresolutionsfor2, z);
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        asInterface asinterface = new asInterface(textFieldScrollKtExternalSyntheticLambda0, textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        int i2 = onExtraCallback + 123;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return asinterface;
    }

    private static final decrementVideoUsage IAuthTabCallback(IAuthTabCallbackStub iAuthTabCallbackStub, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(iAuthTabCallbackStub);
        int i2 = onExtraCallback + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 53;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 45;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    private static final void access100(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
        int i4 = asBinder + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onExtraCallback + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallback + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = asBinder + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onExtraCallback + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return Boolean.valueOf(bool.booleanValue());
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        int i5 = onExtraCallback + 5;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    private static final boolean access000(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = asBinder + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return zBooleanValue;
    }

    private static final void access000(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean access100(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = asBinder + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, 1394820142, -1394820138, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{function1}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (decrementVideoUsage) IAuthTabCallback(iIAuthTabCallback, 968013412, -968013410, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onNavigationEvent(isQueryRefinementEnabled isqueryrefinementenabled, Function1 function1, long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExoPlayer exoPlayer, NativeAdsDto.Creative.FeedVideo feedVideo, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Function1 function12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, String str, long j2, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {isqueryrefinementenabled, function1, Long.valueOf(j), getsupportedhighspeedresolutionsfor, exoPlayer, feedVideo, getsupportedhighspeedresolutionsfor2, function12, getsupportedhighspeedresolutionsfor3, str, Long.valueOf(j2), meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, 457550735, -457550723, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, 1976220118, -1976220117, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{useandconfigureprogramwithtexture}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (decrementVideoUsage) IAuthTabCallback(iIAuthTabCallback, -1431141332, 1431141335, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{textFieldScrollKtExternalSyntheticLambda0, exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, -1128609075, 1128609083, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{useandconfigureprogramwithtexture}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, -137515227, 137515240, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{str, useandconfigureprogramwithtexture}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    private static final boolean asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(iIAuthTabCallback, -1123792887, 1123792896, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2)).booleanValue();
    }

    private static final boolean IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(iIAuthTabCallback, 255020600, -255020586, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2)).booleanValue();
    }

    private static final boolean asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(iIAuthTabCallback, 1810896322, -1810896315, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2)).booleanValue();
    }

    private static final String getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (String) IAuthTabCallback(iIAuthTabCallback, -1830795262, 1830795267, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    private static final Unit IAuthTabCallback_Parcel(Function1 function1) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, 946049680, -946049680, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{function1}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    private static final Unit onTransact(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, -2140692765, 2140692771, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{useandconfigureprogramwithtexture}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    private static final Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, -1178266446, 1178266457, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{useandconfigureprogramwithtexture}, iIAuthTabCallback3, iIAuthTabCallback2);
    }

    public static final /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(iIAuthTabCallback, -1801407997, 1801408007, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3, iIAuthTabCallback2)).booleanValue();
    }
}
