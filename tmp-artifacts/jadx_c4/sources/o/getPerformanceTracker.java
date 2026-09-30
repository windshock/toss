package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.skt.usp.UCPApiConstants;
import com.tmoney.LiveCheckConstants;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.compose.foundation.anim.rally.RallyKeyframes;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o.Cacheurls1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda9;
import o.Futures3;
import o.LifecycleCameraProviderImplExternalSyntheticLambda2;
import o.MaxAppOpenAd;
import o.QualityRatioToResolutionsTableExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.RecorderExternalSyntheticLambda14;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.component8;
import o.getPerformanceTracker;
import o.getStreamSharingChildren;
import o.getSwitchMinWidth;
import o.isContainerClickable;
import o.isMergePathsEnabledForKitKatAndAbove;
import o.loop;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.removeAdapter;
import o.removeTimestamp;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.updateFocusedState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPerformanceTracker {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onActivityResized {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.values().length];
            try {
                iArr[isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Initial.ordinal()] = 1;
                int i = onExtraCallback + 99;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.In.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Out.ordinal()] = 3;
                int i3 = IAuthTabCallback + 53;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static /* synthetic */ float IAuthTabCallback(loop loopVar, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        RallyKeyframes rallyKeyframes = (RallyKeyframes) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(zBooleanValue, rallyKeyframes);
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, String str, long j, long j2, loop loopVar, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, ismergepathsenabledforkitkatandabove, str, j, j2, loopVar, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 75;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(ismergepathsenabledforkitkatandabove, futures3);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, loop loopVar, getSwitchMinWidth getswitchminwidth, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Context context, isContainerClickable iscontainerclickable, String str, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(ismergepathsenabledforkitkatandabove, loopVar, getswitchminwidth, r8lambdanm9dm2eewl4vrptnjmesfjqky4, context, iscontainerclickable, str, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(ismergepathsenabledforkitkatandabove, loopVar, getswitchminwidth, r8lambdanm9dm2eewl4vrptnjmesfjqky4, context, iscontainerclickable, str, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ updateFocusedState IAuthTabCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallbackStub(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        updateFocusedState updatefocusedstateIAuthTabCallbackStub = IAuthTabCallbackStub(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return updatefocusedstateIAuthTabCallbackStub;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onTransact(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Unit unitOnWarmupCompleted;
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[6];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[7];
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[8];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = onWarmupCompleted(getstreamsharingchildren, zBooleanValue, zBooleanValue2, iIntValue, zBooleanValue3, iIntValue2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, onextracallbackwithresult);
            int i3 = 24 / 0;
        } else {
            unitOnWarmupCompleted = onWarmupCompleted(getstreamsharingchildren, zBooleanValue, zBooleanValue2, iIntValue, zBooleanValue3, iIntValue2, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, onextracallbackwithresult);
        }
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, long j, long j2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, loop loopVar, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Context context, String str, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            unit = (Unit) onNavigationEvent(new Object[]{ismergepathsenabledforkitkatandabove, Long.valueOf(j), Long.valueOf(j2), quirksExternalSyntheticBackport0, loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4, context, str, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 864436256, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -864436253, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
            int i4 = 35 / 0;
        } else {
            unit = (Unit) onNavigationEvent(new Object[]{ismergepathsenabledforkitkatandabove, Long.valueOf(j), Long.valueOf(j2), quirksExternalSyntheticBackport0, loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4, context, str, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 864436256, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -864436253, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        }
        int i5 = onWarmupCompleted + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(removeadapter);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ isMergePathsEnabledForKitKatAndAbove onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandaboveOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return ismergepathsenabledforkitkatandaboveOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove = (isMergePathsEnabledForKitKatAndAbove) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(ismergepathsenabledforkitkatandabove);
        int i4 = onExtraCallback + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, String str, long j, long j2, loop loopVar, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, ismergepathsenabledforkitkatandabove, str, j, j2, loopVar, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 25;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {removeadapter};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(objArr, iOnExtraCallback3, -1724021276, iOnExtraCallback, iOnExtraCallback2, 1724021280, iOnExtraCallback4);
        int i4 = onWarmupCompleted + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ updateFocusedState onExtraCallbackWithResult(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        updateFocusedState updatefocusedstate;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            updatefocusedstate = (updateFocusedState) onNavigationEvent(new Object[]{onextracallback, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2103538136, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -2103538131, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
            int i5 = 27 / 0;
        } else {
            updatefocusedstate = (updateFocusedState) onNavigationEvent(new Object[]{onextracallback, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2103538136, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -2103538131, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        }
        int i6 = onExtraCallback + 119;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return updatefocusedstate;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i3)) | i2;
        int i9 = (~(i7 | (~i3))) | (~((~i2) | i7)) | (~(i2 | i5 | i3));
        int i10 = ~(i3 | i2);
        int i11 = i2 + i5 + i4 + ((-813770285) * i) + (135932771 * i6);
        int i12 = i11 * i11;
        int i13 = (526900465 * i2) + 74317824 + ((-1745228167) * i5) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i4) + (1331953664 * i) + ((-366739456) * i6) + ((-1308753920) * i12);
        int i14 = (i2 * 1149714451) + 247108311 + (i5 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i4 * 1149713731) + (i * 1918847289) + (i6 * (-2006650391)) + (i12 * 460980224);
        switch (i13 + (i14 * i14 * (-1418592256))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, float f2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda66, Exif1 exif1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda67, setOrientationDegrees setorientationdegrees) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(f, f2, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, getsupportedhighspeedresolutionsfor2, cameraPresenceProviderExternalSyntheticLambda63, cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, cameraPresenceProviderExternalSyntheticLambda66, exif1, cameraPresenceProviderExternalSyntheticLambda67, setorientationdegrees);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = onExtraCallback + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(z, maxAppOpenAd);
        }
        onExtraCallbackWithResult(z, maxAppOpenAd);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, removeadapter);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = onWarmupCompleted + 5;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ updateFocusedState onNavigationEvent(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateAsBinder = asBinder(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 111;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return updatefocusedstateAsBinder;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long jOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor);
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(jOnWarmupCompleted);
        }
        throw null;
    }

    public static /* synthetic */ float onWarmupCompleted(loop loopVar, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallback = onExtraCallback(loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnExtraCallback;
    }

    public static /* synthetic */ component8 onWarmupCompleted(boolean z, boolean z2, boolean z3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        component8 component8Var = (component8) onNavigationEvent(new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, component4Var, component7Var, virtualCameraCaptureResult}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 556013064, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -556013057, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return component8Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ updateFocusedState onWarmupCompleted(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateAsInterface = asInterface(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return updatefocusedstateAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asInterface implements Function0<Float> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 onWarmupCompleted;

        public asInterface(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            this.onWarmupCompleted = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Float fValueOf = Float.valueOf(RangesKt.coerceIn(((Number) this.onWarmupCompleted.onExtraCallbackWithResult()).floatValue(), 0.0f, 1.0f));
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return fValueOf;
        }
    }

    public static final class extraCallbackWithResult implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public extraCallbackWithResult(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ isMergePathsEnabledForKitKatAndAbove $state;
        final /* synthetic */ getSwitchMinWidth<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> $transition;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, getSwitchMinWidth<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> getswitchminwidth, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = ismergepathsenabledforkitkatandabove;
            this.$transition = getswitchminwidth;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$transition, access13800Var);
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onextracallbackCreate.invokeSuspend(unit);
            }
            onextracallbackCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (((getSupportedHighSpeedResolutionsFor) isMergePathsEnabledForKitKatAndAbove.onNavigationEvent(210787053, new Object[]{this.$state}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -210787053, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).onExtraCallbackWithResult() == isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Out && (!this.$transition.IAuthTabCallbackStubProxy())) {
                this.$state.onTransact();
                int i4 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class writeTypedObject extends Lambda implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Recorder $measurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public writeTypedObject(Recorder recorder) {
            super(1);
            this.$measurer = recorder;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(@NotNull useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            RecorderExternalSyntheticLambda13.IAuthTabCallback(useandconfigureprogramwithtexture, this.$measurer);
            int i4 = IAuthTabCallback + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class readTypedObject extends Lambda implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $isBottomSide$inlined;
        final /* synthetic */ boolean $isLeftSide$inlined;
        final /* synthetic */ boolean $isRightSide$inlined;
        final /* synthetic */ Function0 $onHelpersChanged;
        final /* synthetic */ LifecycleCameraProviderImplExternalSyntheticLambda2 $scope;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor $targetSize$delegate$inlined;
        final /* synthetic */ String $text$inlined;
        final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 $this_with$inlined;
        private static final byte[] $$a = {126, 1, 26, -71};
        private static final int $$b = 27;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static char[] onExtraCallback = {60860, 21625, 40466, 49199, 2755, 19667, 46829, 63764, 9071, 25857, 45007, 4595, 23441, 40370, 50212, 3607, 28715, 47822, 64741, 9953, 26953, 54132, 5469, 24514, 33263, 52106, 3504, 29764, 48711, 57393, 10964, 27892, 55003, 6425, 17278, 34128, 53049, 12778, 31629, 48565, 58385, 11892, 36924, 56021, 7415, 18054, 35079};
        private static long onExtraCallbackWithResult = 2992301869443798029L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, int i) {
            int i2;
            int i3;
            int i4 = b + 4;
            byte[] bArr = $$a;
            int i5 = (i * 3) + 1;
            int i6 = (b2 * 4) + 97;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i7 = i5;
                i3 = 0;
                i6 += -i7;
                i2 = i3;
                i4++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i5) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i4];
                i6 += -i7;
                i2 = i3;
                i4++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i5) {
                }
            } else {
                i2 = 0;
                i4++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public readTypedObject(LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2, int i, Function0 function0, boolean z, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z2, boolean z3, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            super(2);
            this.$scope = lifecycleCameraProviderImplExternalSyntheticLambda2;
            this.$onHelpersChanged = function0;
            this.$isBottomSide$inlined = z;
            this.$this_with$inlined = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
            this.$isLeftSide$inlined = z2;
            this.$isRightSide$inlined = z3;
            this.$text$inlined = str;
            this.$targetSize$delegate$inlined = getsupportedhighspeedresolutionsfor;
            this.$$changed = i;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            String str;
            int iOnExtraCallback;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (((i & 11) ^ 2) == 0 && cameraCaptureResultEmptyCameraCaptureResult.onMessageChannelReady()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int iOnExtraCallback2 = this.$scope.onExtraCallback();
            this.$scope.IAuthTabCallback();
            LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = this.$scope;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1621368429);
            LifecycleCameraProviderImplExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallbackWithResult();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted = iAuthTabCallbackOnExtraCallbackWithResult.onWarmupCompleted();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackIAuthTabCallback = iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallback();
            if (!this.$isBottomSide$inlined) {
                int i5 = IAuthTabCallback + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                str = "down";
            } else {
                str = "up";
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getKeyRepeatDelay() >> 16, ExpandableListView.getPackedPositionType(0L) + 47, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            sb.append("-sidebar-mono.png");
            String string = sb.toString();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, this.$this_with$inlined.IAuthTabCallback(Float.intBitsToFloat((int) (((Long) getPerformanceTracker.onNavigationEvent(new Object[]{this.$targetSize$delegate$inlined}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 989895106, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -989895100, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue() >> 32)))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.$isBottomSide$inlined);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.$isLeftSide$inlined);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.$isRightSide$inlined);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3)) {
                int i7 = IAuthTabCallback + 99;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(this.$isBottomSide$inlined, this.$isLeftSide$inlined, this.$isRightSide$inlined);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted, (Function1) objOnMinimized);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            AppLovinNativeAdImplc.onExtraCallbackWithResult(string, quirksExternalSyntheticBackport0OnExtraCallback, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 504);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.$isBottomSide$inlined);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted);
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.$isLeftSide$inlined);
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.$isRightSide$inlined);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback4 | zOnNavigationEvent | zOnExtraCallback5 | zOnExtraCallback6) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onNavigationEvent(this.$isBottomSide$inlined, stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted, this.$isLeftSide$inlined, this.$isRightSide$inlined);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(onextracallback, stillCaptureProcessorOnCaptureResultCallbackIAuthTabCallback, (Function1) objOnMinimized2);
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
            if (this.$isLeftSide$inlined) {
                int i9 = onWarmupCompleted + 15;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                iOnExtraCallback = createCameraCaptureCallback.Companion.onTransact();
            } else {
                iOnExtraCallback = this.$isRightSide$inlined ? createCameraCaptureCallback.Companion.onExtraCallback() : createCameraCaptureCallback.Companion.IAuthTabCallback();
            }
            long jIPostMessageService_Parcel = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{this.$text$inlined, quirksExternalSyntheticBackport0OnExtraCallback2, null, Long.valueOf(jIPostMessageService_Parcel), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iOnExtraCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98036}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (this.$scope.onExtraCallback() != iOnExtraCallback2) {
                int i11 = IAuthTabCallback + 77;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    this.$onHelpersChanged.invoke();
                    return;
                }
                this.$onHelpersChanged.invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $10 + 97;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.resolveSize(0, 0)), KeyEvent.normalizeMetaState(0) + 17, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - ExpandableListView.getPackedPositionType(0L)), TextUtils.getCapsMode("", 0, 0) + 31, (ViewConfiguration.getEdgeSlop() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                char c2 = (char) (49124 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int windowTouchSlop = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i7 = 1495 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                byte b = (byte) (-$$a[1]);
                                byte b2 = (byte) (b + 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, windowTouchSlop, i7, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            int i8 = $10 + 29;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
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
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i10 = $10 + 43;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        char cResolveSize = (char) (49123 - View.resolveSize(0, 0));
                        int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
                        int iBlue = 1494 - Color.blue(0);
                        byte b3 = (byte) (-$$a[1]);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, iKeyCodeFromString, iBlue, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    obj.hashCode();
                    throw null;
                }
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49124);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 44;
                    int gidForName = Process.getGidForName("") + 1495;
                    byte b5 = (byte) (-$$a[1]);
                    byte b6 = (byte) (b5 + 1);
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, deadChar, gidForName, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr);
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ long $delayMillisDismissWhenClick;
        final /* synthetic */ isMergePathsEnabledForKitKatAndAbove $state;
        int label;

        /* renamed from: o.getPerformanceTracker$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final /* synthetic */ class C0028onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.values().length];
                try {
                    iArr[isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Initial.ordinal()] = 1;
                    int i = onExtraCallbackWithResult + 121;
                    onExtraCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 3 / 2;
                    } else {
                        int i3 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.In.ordinal()] = 2;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Out.ordinal()] = 3;
                    int i5 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused3) {
                }
                onWarmupCompleted = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(long j, isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$delayMillisDismissWhenClick = j;
            this.$state = ismergepathsenabledforkitkatandabove;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$delayMillisDismissWhenClick, this.$state, access13800Var);
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$delayMillisDismissWhenClick <= 0) {
                    int i3 = onNavigationEvent + 109;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    this.$state.onWarmupCompleted(true);
                } else {
                    Object[] objArr = {this.$state};
                    int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                    int i5 = C0028onExtraCallbackWithResult.onWarmupCompleted[((isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) ((getSupportedHighSpeedResolutionsFor) isMergePathsEnabledForKitKatAndAbove.onNavigationEvent(210787053, objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -210787053, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).onExtraCallbackWithResult()).ordinal()];
                    if (i5 != 1) {
                        int i6 = IAuthTabCallback + 111;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0 ? i5 == 2 : i5 == 2) {
                            long j = this.$delayMillisDismissWhenClick;
                            this.label = 1;
                            if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        } else {
                            if (i5 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.$state.onWarmupCompleted(true);
                        }
                    } else if (!this.$state.onWarmupCompleted()) {
                        int i7 = IAuthTabCallback + 33;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        this.$state.onWarmupCompleted(false);
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i9 = onNavigationEvent + 115;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
            int i11 = onNavigationEvent + 25;
            int i12 = i11 % 128;
            IAuthTabCallback = i12;
            int i13 = i11 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = i12 + 87;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onWarmupCompleted(true);
            Unit unit2 = Unit.INSTANCE;
            int i92 = onNavigationEvent + 115;
            IAuthTabCallback = i92 % 128;
            int i102 = i92 % 2;
            return unit2;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ long $autoDismissMillis;
        final /* synthetic */ long $delayMillisDismissWhenClick;
        final /* synthetic */ isMergePathsEnabledForKitKatAndAbove $state;
        final /* synthetic */ getSwitchMinWidth<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> $transition;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(long j, long j2, getSwitchMinWidth<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> getswitchminwidth, isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$delayMillisDismissWhenClick = j;
            this.$autoDismissMillis = j2;
            this.$transition = getswitchminwidth;
            this.$state = ismergepathsenabledforkitkatandabove;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$delayMillisDismissWhenClick, this.$autoDismissMillis, this.$transition, this.$state, access13800Var);
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 37;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
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
                if (this.$delayMillisDismissWhenClick >= this.$autoDismissMillis) {
                    int i3 = onWarmupCompleted + 37;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unit = Unit.INSTANCE;
                    int i5 = IAuthTabCallback + 89;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }
                if (this.$transition.IAuthTabCallback() == isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.In) {
                    int i7 = onWarmupCompleted + 45;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (!this.$transition.IAuthTabCallbackStubProxy()) {
                        long j = this.$autoDismissMillis;
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            int i9 = IAuthTabCallback + 1;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0 ? i2 != 1 : i2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$state.IAuthTabCallback();
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ismergepathsenabledforkitkatandabove.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final float onNavigationEvent(loop loopVar, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = loopVar instanceof loop.onExtraCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!(loopVar instanceof loop.onExtraCallback))) {
            return r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f));
        }
        if (!(loopVar instanceof loop.onExtraCallbackWithResult)) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = i2 + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-((loop.onExtraCallbackWithResult) loopVar).onWarmupCompleted()));
        }
        float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-((loop.onExtraCallbackWithResult) loopVar).onWarmupCompleted()));
        int i5 = 28 / 0;
        return fOnExtraCallback;
    }

    private static final float onExtraCallback(loop loopVar, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (loopVar instanceof loop.onExtraCallbackWithResult) {
            return r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(((loop.onExtraCallbackWithResult) loopVar).onWarmupCompleted());
        }
        int i5 = i3 + 83;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final updateFocusedState onTransact(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        setOffStateDescriptionOnRAndAbove setoffstatedescriptiononrandaboveOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2048185386);
            int i4 = 33 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2048185386, i, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:164)");
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2048185386);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
        if (onextracallback.onExtraCallback() == isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Initial) {
            int i5 = onExtraCallback + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            setoffstatedescriptiononrandaboveOnExtraCallback = onQueryRefine.onWarmupCompleted(0, 1, (Object) null);
            int i7 = onWarmupCompleted + 27;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            setoffstatedescriptiononrandaboveOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 0, 2, (Object) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 91;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return setoffstatedescriptiononrandaboveOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1341616743);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1341616743, iIntValue, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:178)");
        }
        getThumbPosition getthumbpositionOnExtraCallback = onextracallback.onExtraCallbackWithResult(isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.In, isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Out) ? getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallbackStub(), 0, 2, (Object) null) : onQueryRefine.onWarmupCompleted(0, 1, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i3 = onExtraCallback + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return getthumbpositionOnExtraCallback;
    }

    private static final updateFocusedState IAuthTabCallbackStub(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        setOffStateDescriptionOnRAndAbove setoffstatedescriptiononrandaboveOnExtraCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1950061909);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1950061909, i, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:196)");
        }
        if (onextracallback.onExtraCallback() == isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Initial) {
            setoffstatedescriptiononrandaboveOnExtraCallback = onQueryRefine.onWarmupCompleted(0, 1, (Object) null);
            int i3 = onExtraCallback + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            setoffstatedescriptiononrandaboveOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallbackStub(), 0, 2, (Object) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 43;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return setoffstatedescriptiononrandaboveOnExtraCallback;
    }

    private static final updateFocusedState asInterface(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getThumbPosition getthumbpositionOnWarmupCompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-972941210);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-972941210, i, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:210)");
        }
        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted = isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Initial;
        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted2 = isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.In;
        if (onextracallback.onExtraCallbackWithResult(onwarmupcompleted, onwarmupcompleted2)) {
            int i3 = onExtraCallback + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getthumbpositionOnWarmupCompleted = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 300);
        } else if (onextracallback.onExtraCallbackWithResult(onwarmupcompleted2, isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Out)) {
            int i5 = onWarmupCompleted + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            getthumbpositionOnWarmupCompleted = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 0, 2, (Object) null);
        } else {
            getthumbpositionOnWarmupCompleted = onQueryRefine.onWarmupCompleted(0, 1, (Object) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = onWarmupCompleted + 83;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnWarmupCompleted;
    }

    public static final class ICustomTabsCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public ICustomTabsCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                int i2 = onExtraCallbackWithResult + 17;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    private static final updateFocusedState asBinder(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getThumbPosition getthumbpositionOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1348018310);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1348018310, i, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:233)");
        }
        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted = isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Initial;
        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted2 = isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.In;
        if (onextracallback.onExtraCallbackWithResult(onwarmupcompleted, onwarmupcompleted2)) {
            int i5 = onWarmupCompleted + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            getthumbpositionOnWarmupCompleted = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 300);
        } else if (onextracallback.onExtraCallbackWithResult(onwarmupcompleted2, isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Out)) {
            getthumbpositionOnWarmupCompleted = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 0, 2, (Object) null);
        } else {
            getthumbpositionOnWarmupCompleted = onQueryRefine.onWarmupCompleted(0, 1, (Object) null);
            int i7 = onExtraCallback + 79;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 4;
            }
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        final boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[3];
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        component4 component4Var = (component4) objArr[5];
        component7 component7Var = (component7) objArr[6];
        VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) objArr[7];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(virtualCameraCaptureResult.onExtraCallback());
        final int interfaceDescriptor = getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
        final int iT_ = getstreamsharingchildrenOnExtraCallback.T_();
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, interfaceDescriptor, iT_, (Map) null, new Function1() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                getStreamSharingChildren getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                boolean z = zBooleanValue;
                boolean z2 = zBooleanValue2;
                int i5 = interfaceDescriptor;
                boolean z3 = zBooleanValue3;
                int i6 = iT_;
                Unit unit = (Unit) getPerformanceTracker.onNavigationEvent(new Object[]{getstreamsharingchildren, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i5), Boolean.valueOf(z3), Integer.valueOf(i6), getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, (getStreamSharingChildren.onExtraCallbackWithResult) obj}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1581945540, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1581945548, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                int i7 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 27 / 0;
                }
                return unit;
            }
        }, 4, (Object) null);
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return component8VarIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(getStreamSharingChildren getstreamsharingchildren, boolean z, boolean z2, int i, boolean z3, int i2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallback;
        int iOnExtraCallback2;
        long jLongValue;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (z) {
            int i4 = onExtraCallback + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                jLongValue = ((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue() >> 82;
            } else {
                jLongValue = ((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue() >> 32;
            }
            iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(Float.intBitsToFloat((int) jLongValue));
        } else if (z2) {
            iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback((Float.intBitsToFloat((int) (((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue() >> 32)) + Float.intBitsToFloat((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2) >> 32))) - i);
            int i5 = onExtraCallback + 93;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback((Float.intBitsToFloat((int) (((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue() >> 32)) + (Float.intBitsToFloat((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2) >> 32)) / 2.0f)) - (i / 2));
        }
        if (z3) {
            iOnExtraCallback2 = getBacktraceNoteBytes.onExtraCallback(Float.intBitsToFloat((int) (((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue() & 4294967295L)) - i2);
        } else {
            int iOnExtraCallback3 = getBacktraceNoteBytes.onExtraCallback(Float.intBitsToFloat((int) ((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue()) + Float.intBitsToFloat((int) (4294967295L & onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2))));
            int i7 = onWarmupCompleted + 125;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            iOnExtraCallback2 = iOnExtraCallback3;
        }
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, iOnExtraCallback, iOnExtraCallback2, 0.0f, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(removeadapter, "");
            removeAdapter.IAuthTabCallback(removeadapter, 0, (Integer) null, (setOnQueryTextListener) null, 0.0f, 37, (Object) null);
            removeAdapter.IAuthTabCallback(1516033057, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1516033053, new Object[]{removeadapter, 0, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)), 58, null}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        } else {
            Intrinsics.checkNotNullParameter(removeadapter, "");
            removeAdapter.IAuthTabCallback(removeadapter, 0, (Integer) null, (setOnQueryTextListener) null, 0.0f, 6, (Object) null);
            removeAdapter.IAuthTabCallback(1516033057, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1516033053, new Object[]{removeadapter, 0, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), 6, null}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(boolean z, RallyKeyframes rallyKeyframes) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rallyKeyframes, "");
        if (z) {
            rallyKeyframes.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-10.0f)), 600);
            rallyKeyframes.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), 800);
            rallyKeyframes.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), 800);
            i = onExtraCallback + 105;
            onWarmupCompleted = i % 128;
        } else {
            rallyKeyframes.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), 600);
            rallyKeyframes.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-10.0f)), 800);
            rallyKeyframes.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), 800);
            i = onWarmupCompleted + 93;
            onExtraCallback = i % 128;
        }
        int i3 = i % 2;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final boolean z, removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.IAuthTabCallback(removeadapter, (Integer) null, 300, getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 1.0f, 1, (Object) null);
        removeadapter.onNavigationEvent(300, getCallToActionButton.onExtraCallback.onTransact(), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z ? 10 : -10)), new Function1() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda20
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                RallyKeyframes rallyKeyframes = (RallyKeyframes) obj;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (i6 == 0) {
                    return (Unit) getPerformanceTracker.onNavigationEvent(new Object[]{boolValueOf, rallyKeyframes}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1201549350, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1201549350, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        removeAdapter removeadapter = (removeAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
        removeAdapter.IAuthTabCallback(removeadapter, Integer.valueOf(geticoncontentview.asBinder().onExtraCallback()), (Integer) null, geticoncontentview.asBinder(), 0.0f, 2, (Object) null);
        Object[] objArr2 = {removeadapter, 0, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), 6, null};
        removeAdapter.IAuthTabCallback(1516033057, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1516033053, objArr2, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(final boolean z, MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
        maxAppOpenAd.onExtraCallbackWithResult(isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Initial, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 37;
                IAuthTabCallback = i3 % 128;
                removeAdapter removeadapter = (removeAdapter) obj;
                if (i3 % 2 != 0) {
                    getPerformanceTracker.onExtraCallback(removeadapter);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallback = getPerformanceTracker.onExtraCallback(removeadapter);
                int i4 = IAuthTabCallback + 93;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.In, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda14
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 93;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    getPerformanceTracker.onNavigationEvent(z, (removeAdapter) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = getPerformanceTracker.onNavigationEvent(z, (removeAdapter) obj);
                int i4 = onExtraCallback + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Out, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda15
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = getPerformanceTracker.onExtraCallbackWithResult((removeAdapter) obj);
                int i5 = onNavigationEvent + 73;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class IAuthTabCallback implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean IAuthTabCallback;
        final /* synthetic */ boolean onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;

        IAuthTabCallback(boolean z, boolean z2, boolean z3) {
            this.IAuthTabCallback = z;
            this.onExtraCallbackWithResult = z2;
            this.onExtraCallback = z3;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((StillCaptureProcessorExternalSyntheticLambda0) obj);
            if (i3 == 0) {
                Unit unit = Unit.INSTANCE;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onNavigationEvent + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
            }
            return unit2;
        }

        public final void onExtraCallback(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            if (this.IAuthTabCallback) {
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 4, (Object) null);
            } else {
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallbackWithResult(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 4, (Object) null);
            }
            if (this.onExtraCallbackWithResult) {
                int i2 = onNavigationEvent + 45;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().IAuthTabCallback(), 2.0f, 1.0f, 72, (Object) null);
                    return;
                } else {
                    RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().IAuthTabCallback(), 0.0f, 0.0f, 6, (Object) null);
                    return;
                }
            }
            if (this.onExtraCallback) {
                int i3 = onWarmupCompleted + 5;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onWarmupCompleted(), 2.0f, 2.0f, 72, (Object) null);
                    return;
                } else {
                    RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onWarmupCompleted(), 0.0f, 0.0f, 6, (Object) null);
                    return;
                }
            }
            Object obj = null;
            StillCaptureProcessorExternalSyntheticLambda0.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0, stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback(), 0.0f, 2, (Object) null);
            int i4 = onNavigationEvent + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback IAuthTabCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ boolean onNavigationEvent;
        final /* synthetic */ boolean onWarmupCompleted;

        onNavigationEvent(boolean z, StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback, boolean z2, boolean z3) {
            this.onNavigationEvent = z;
            this.IAuthTabCallback = stillCaptureProcessorOnCaptureResultCallback;
            this.onWarmupCompleted = z2;
            this.onExtraCallbackWithResult = z3;
        }

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((StillCaptureProcessorExternalSyntheticLambda0) obj);
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 70 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = IAuthTabCallbackStub + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void IAuthTabCallback(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            if (this.onNavigationEvent) {
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), this.IAuthTabCallback.onExtraCallbackWithResult(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 4, (Object) null);
                int i2 = IAuthTabCallbackStub + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            } else {
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(), this.IAuthTabCallback.onExtraCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 4, (Object) null);
            }
            if (!(!this.onWarmupCompleted)) {
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().IAuthTabCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 4, (Object) null);
                return;
            }
            if (!this.onExtraCallbackWithResult) {
                StillCaptureProcessorExternalSyntheticLambda0.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0, stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback(), 0.0f, 2, (Object) null);
                return;
            }
            RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onWarmupCompleted(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 4, (Object) null);
            int i4 = IAuthTabCallbackStub + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x073f A[PHI: r4
      0x073f: PHI (r4v88 java.lang.Object) = (r4v87 java.lang.Object), (r4v92 java.lang.Object) binds: [B:337:0x073d, B:334:0x072c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, final loop loopVar, getSwitchMinWidth getswitchminwidth, final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Context context, isContainerClickable iscontainerclickable, String str, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        Object objIAuthTabCallback;
        float f;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        String str2;
        float f2;
        Object objIAuthTabCallback2;
        int i3;
        int i4;
        float f3;
        float f4;
        Object objIAuthTabCallback3;
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        Object objIAuthTabCallback4;
        float f5;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        int i5;
        float f6;
        boolean zOnNavigationEvent2;
        int i6;
        long jReceiveFile;
        getAttribute getattributeOnExtraCallbackWithResult;
        boolean zOnNavigationEvent3;
        Object objOnMinimized2;
        Object objIAuthTabCallback5;
        int i7;
        long jReceiveFile2;
        long jOnExtraCallbackWithResult;
        int i8;
        int i9;
        boolean zOnNavigationEvent4;
        Object objOnMinimized3;
        int i10;
        char c;
        long jOnExtraCallbackWithResult2;
        int i11;
        boolean zOnNavigationEvent5;
        Object objOnMinimized4;
        boolean zOnNavigationEvent6;
        int iIntValue;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        float f7;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        Object obj;
        int i12;
        final boolean z;
        Object obj2;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1341142413, i2, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:137)");
            }
            final float fIAuthTabCallback3 = focusMeteringControlExternalSyntheticLambda9.IAuthTabCallback();
            final float fOnWarmupCompleted = focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted();
            final getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsforOnNavigationEvent = ismergepathsenabledforkitkatandabove.onNavigationEvent();
            final getSupportedHighSpeedResolutionsFor<setUseCaseDetached> getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = ismergepathsenabledforkitkatandabove.onExtraCallbackWithResult();
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(loopVar);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent7 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i14 = 2 % 2;
                        int i15 = onExtraCallback + 27;
                        onNavigationEvent = i15 % 128;
                        if (i15 % 2 == 0) {
                            Float.valueOf(getPerformanceTracker.IAuthTabCallback(loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4));
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Float fValueOf = Float.valueOf(getPerformanceTracker.IAuthTabCallback(loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4));
                        int i16 = onExtraCallback + 111;
                        onNavigationEvent = i16 % 128;
                        int i17 = i16 % 2;
                        return fValueOf;
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized5;
            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(loopVar);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent8 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i14 = 2 % 2;
                        int i15 = onNavigationEvent + 101;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        Float fValueOf = Float.valueOf(getPerformanceTracker.onWarmupCompleted(loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4));
                        int i17 = onExtraCallback + 25;
                        onNavigationEvent = i17 % 128;
                        if (i17 % 2 != 0) {
                            int i18 = 85 / 0;
                        }
                        return fValueOf;
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
            }
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized6;
            getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    int i14 = 2 % 2;
                    int i15 = onExtraCallback + 33;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    updateFocusedState updatefocusedstate = (updateFocusedState) getPerformanceTracker.onNavigationEvent(new Object[]{(getSwitchMinWidth.onExtraCallback) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1252524622, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1252524631, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                    int i17 = onNavigationEvent + 15;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    return updatefocusedstate;
                }
            };
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(floatCompanionObject);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent9) {
                    int i14 = onExtraCallback + 57;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                        Function1 function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                        try {
                            Object objIAuthTabCallback6 = getswitchminwidth.IAuthTabCallback();
                            iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback6);
                            objIAuthTabCallback = objIAuthTabCallback6;
                        } finally {
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) objIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1475699116);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1475699116, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:168)");
            }
            int[] iArr = onActivityResized.onExtraCallbackWithResult;
            int i15 = iArr[onwarmupcompleted.ordinal()];
            if (i15 == 1) {
                f = 0.0f;
            } else {
                if (i15 != 2 && i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent10 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized7 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new getInterfaceDescriptor(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
            }
            isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted2 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized7).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1475699116);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda62;
                str2 = "";
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1475699116, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:168)");
            } else {
                cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda62;
                str2 = "";
            }
            int i16 = iArr[onwarmupcompleted2.ordinal()];
            if (i16 == 1) {
                f2 = 0.0f;
            } else {
                if (i16 != 2 && i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 1.0f;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent11) {
                int i17 = onWarmupCompleted + 69;
                onExtraCallback = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 58 / 0;
                    if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized8 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackStubProxy(getswitchminwidth));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                    }
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64 = cameraPresenceProviderExternalSyntheticLambda6;
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidth, Float.valueOf(f), Float.valueOf(f2), (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized8).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback, "Clip Scale", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                    getBacktraceNote getbacktracenote2 = new getBacktraceNote() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda6
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i19 = 2 % 2;
                            int i20 = onNavigationEvent + 65;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                            updateFocusedState updatefocusedstateOnExtraCallbackWithResult = getPerformanceTracker.onExtraCallbackWithResult((getSwitchMinWidth.onExtraCallback) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i22 = onNavigationEvent + 51;
                            onExtraCallbackWithResult = i22 % 128;
                            if (i22 % 2 != 0) {
                                int i23 = 1 / 0;
                            }
                            return updatefocusedstateOnExtraCallbackWithResult;
                        }
                    };
                    getThumbTintList getthumbtintlistIAuthTabCallback2 = getThumbTextPadding.IAuthTabCallback(floatCompanionObject);
                    if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                        boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                        objIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent12 || objIAuthTabCallback2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback2 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 = iAuthTabCallback2.IAuthTabCallback();
                            Function1 function1IAuthTabCallbackStub2 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2.IAuthTabCallbackStub() : null;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2 = iAuthTabCallback2.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2);
                            try {
                                Object objIAuthTabCallback7 = getswitchminwidth.IAuthTabCallback();
                                iAuthTabCallback2.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2, function1IAuthTabCallbackStub2);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback7);
                                objIAuthTabCallback2 = objIAuthTabCallback7;
                            } finally {
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        objIAuthTabCallback2 = getswitchminwidth.IAuthTabCallback();
                    }
                    isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted3 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) objIAuthTabCallback2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1088049051);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        i3 = -1;
                    } else {
                        i3 = -1;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1088049051, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:187)");
                    }
                    i4 = iArr[onwarmupcompleted3.ordinal()];
                    if (i4 == 1) {
                        int i19 = onWarmupCompleted + 101;
                        onExtraCallback = i19 % 128;
                        int i20 = i19 % 2;
                        if (i4 == 2) {
                            f3 = 0.0f;
                        } else {
                            if (i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f3 = 1.0f;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent13 || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized9 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback_Parcel(getswitchminwidth));
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
                        }
                        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted4 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized9).onExtraCallbackWithResult();
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1088049051);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1088049051, 0, i3, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:187)");
                        }
                        int i21 = iArr[onwarmupcompleted4.ordinal()];
                        if (i21 == 1 || i21 == 2) {
                            f4 = 0.0f;
                        } else {
                            if (i21 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f4 = 1.0f;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent14 || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized10 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new extraCallback(getswitchminwidth));
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized10);
                        }
                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2 = getSwitchPadding.onExtraCallback(getswitchminwidth, Float.valueOf(f3), Float.valueOf(f4), (updateFocusedState) getbacktracenote2.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized10).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback2, "Clip width", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                        getBacktraceNote getbacktracenote3 = new getBacktraceNote() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda7
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i22 = 2 % 2;
                                int i23 = onExtraCallback + 69;
                                onExtraCallbackWithResult = i23 % 128;
                                int i24 = i23 % 2;
                                getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj3;
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (i24 != 0) {
                                    getPerformanceTracker.IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue2);
                                    Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                                updateFocusedState updatefocusedstateIAuthTabCallback = getPerformanceTracker.IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue2);
                                int i25 = onExtraCallback + 1;
                                onExtraCallbackWithResult = i25 % 128;
                                if (i25 % 2 != 0) {
                                    int i26 = 50 / 0;
                                }
                                return updatefocusedstateIAuthTabCallback;
                            }
                        };
                        getThumbTintList getthumbtintlistOnExtraCallbackWithResult = getThumbTextPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion);
                        if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            objIAuthTabCallback3 = getswitchminwidth.IAuthTabCallback();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                            boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                            objIAuthTabCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(!zOnNavigationEvent15)) {
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback3 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3 = iAuthTabCallback3.IAuthTabCallback();
                                Function1 function1IAuthTabCallbackStub3 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3.IAuthTabCallbackStub() : null;
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult3 = iAuthTabCallback3.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3);
                                try {
                                    Object objIAuthTabCallback8 = getswitchminwidth.IAuthTabCallback();
                                    iAuthTabCallback3.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult3, function1IAuthTabCallbackStub3);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback8);
                                    objIAuthTabCallback3 = objIAuthTabCallback8;
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                } finally {
                                }
                            } else {
                                int i22 = onWarmupCompleted + 119;
                                onExtraCallback = i22 % 128;
                                if (i22 % 2 == 0) {
                                    int i23 = 10 / 0;
                                    if (objIAuthTabCallback3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                } else {
                                    if (objIAuthTabCallback3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                            }
                        }
                        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted5 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) objIAuthTabCallback3;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1729655515);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1729655515, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:200)");
                        }
                        int i24 = iArr[onwarmupcompleted5.ordinal()];
                        if (i24 == 1 || i24 == 2) {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                        } else {
                            if (i24 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1000.0f);
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
                        boolean zOnNavigationEvent16 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent16 || objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized11 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new access000(getswitchminwidth));
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized11);
                        }
                        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted6 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized11).onExtraCallbackWithResult();
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1729655515);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1729655515, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:200)");
                        }
                        int i25 = iArr[onwarmupcompleted6.ordinal()];
                        if (i25 == 1 || i25 == 2) {
                            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                        } else {
                            if (i25 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1000.0f);
                        }
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            int i26 = onExtraCallback + 119;
                            onWarmupCompleted = i26 % 128;
                            if (i26 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2);
                        boolean zOnNavigationEvent17 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent17 || objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized12 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new access100(getswitchminwidth));
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized12);
                        }
                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback3 = getSwitchPadding.onExtraCallback(getswitchminwidth, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2, (updateFocusedState) getbacktracenote3.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized12).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistOnExtraCallbackWithResult, "Clip Corner Radius", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                        getBacktraceNote getbacktracenote4 = new getBacktraceNote() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda8
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i27 = 2 % 2;
                                int i28 = onWarmupCompleted + 93;
                                onExtraCallbackWithResult = i28 % 128;
                                int i29 = i28 % 2;
                                getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj3;
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (i29 != 0) {
                                    getPerformanceTracker.onWarmupCompleted(onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue2);
                                    throw null;
                                }
                                updateFocusedState updatefocusedstateOnWarmupCompleted = getPerformanceTracker.onWarmupCompleted(onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue2);
                                int i30 = onExtraCallbackWithResult + 5;
                                onWarmupCompleted = i30 % 128;
                                if (i30 % 2 == 0) {
                                    int i31 = 64 / 0;
                                }
                                return updatefocusedstateOnWarmupCompleted;
                            }
                        };
                        getThumbTintList getthumbtintlistIAuthTabCallback3 = getThumbTextPadding.IAuthTabCallback(floatCompanionObject);
                        if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            objIAuthTabCallback4 = getswitchminwidth.IAuthTabCallback();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                            boolean zOnNavigationEvent18 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                            objIAuthTabCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnNavigationEvent18 || objIAuthTabCallback4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback4 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4 = iAuthTabCallback4.IAuthTabCallback();
                                Function1 function1IAuthTabCallbackStub4 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4.IAuthTabCallbackStub() : null;
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult4 = iAuthTabCallback4.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4);
                                try {
                                    Object objIAuthTabCallback9 = getswitchminwidth.IAuthTabCallback();
                                    iAuthTabCallback4.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult4, function1IAuthTabCallbackStub4);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback9);
                                    objIAuthTabCallback4 = objIAuthTabCallback9;
                                } finally {
                                }
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted7 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) objIAuthTabCallback4;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-596278364);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-596278364, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:223)");
                        }
                        int i27 = iArr[onwarmupcompleted7.ordinal()];
                        if (i27 == 1) {
                            f5 = 0.0f;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            Float fValueOf = Float.valueOf(f5);
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(!zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackDefault(getswitchminwidth));
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                            }
                            isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted8 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult();
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-596278364);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-596278364, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:223)");
                            }
                            i5 = iArr[onwarmupcompleted8.ordinal()];
                            if (i5 == 1) {
                                f6 = 0.0f;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnNavigationEvent2) {
                                    int i28 = onExtraCallback + 23;
                                    onWarmupCompleted = i28 % 128;
                                    int i29 = i28 % 2;
                                    if (objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized13 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new asBinder(getswitchminwidth));
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized13);
                                    }
                                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback4 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf, Float.valueOf(f6), (updateFocusedState) getbacktracenote4.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized13).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback3, "Clip Dim Opacity", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                                    boolean zOnNavigationEvent19 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback4);
                                    Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnNavigationEvent19) {
                                        Object obj3 = objOnMinimized14;
                                        if (objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new asInterface(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback4));
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                                            obj3 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                                        }
                                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65 = (CameraPresenceProviderExternalSyntheticLambda6) obj3;
                                        getBacktraceNote getbacktracenote5 = new getBacktraceNote() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda9
                                            private static int IAuthTabCallback = 1;
                                            private static int onExtraCallback;

                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                int i30 = 2 % 2;
                                                int i31 = IAuthTabCallback + 33;
                                                onExtraCallback = i31 % 128;
                                                getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj4;
                                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj5;
                                                if (i31 % 2 == 0) {
                                                    return getPerformanceTracker.onNavigationEvent(onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj6).intValue());
                                                }
                                                updateFocusedState updatefocusedstateOnNavigationEvent = getPerformanceTracker.onNavigationEvent(onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj6).intValue());
                                                int i32 = 47 / 0;
                                                return updatefocusedstateOnNavigationEvent;
                                            }
                                        };
                                        isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted9 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) getswitchminwidth.access000();
                                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1479154723);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            i6 = 0;
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1479154723, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:246)");
                                        } else {
                                            i6 = 0;
                                        }
                                        if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i6)) {
                                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(166488142);
                                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                            jReceiveFile = ByteOrderedDataOutputStream.onExtraCallbackWithResult(3640655872L);
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(166490059);
                                            jReceiveFile = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).receiveFile();
                                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                        }
                                        long jOnExtraCallbackWithResult3 = jReceiveFile;
                                        int i30 = iArr[onwarmupcompleted9.ordinal()];
                                        if (i30 != 1) {
                                            int i31 = onWarmupCompleted + 21;
                                            onExtraCallback = i31 % 128;
                                            int i32 = i31 % 2;
                                            if (i30 != 2) {
                                                if (i30 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                jOnExtraCallbackWithResult3 = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult3, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                            }
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                            getattributeOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult3);
                                            zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getattributeOnExtraCallbackWithResult);
                                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!zOnNavigationEvent3 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized2 = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult);
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                                            }
                                            getThumbTintList getthumbtintlist = (getThumbTintList) objOnMinimized2;
                                            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                                                int i33 = onExtraCallback + 123;
                                                onWarmupCompleted = i33 % 128;
                                                if (i33 % 2 != 0) {
                                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                                                    boolean zOnNavigationEvent20 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                                    objIAuthTabCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    int i34 = 73 / 0;
                                                    if (!zOnNavigationEvent20) {
                                                        if (objIAuthTabCallback5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback5 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                                                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5 = iAuthTabCallback5.IAuthTabCallback();
                                                            Function1 function1IAuthTabCallbackStub5 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5.IAuthTabCallbackStub() : null;
                                                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult5 = iAuthTabCallback5.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5);
                                                            try {
                                                                Object objIAuthTabCallback10 = getswitchminwidth.IAuthTabCallback();
                                                                iAuthTabCallback5.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult5, function1IAuthTabCallbackStub5);
                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback10);
                                                                objIAuthTabCallback5 = objIAuthTabCallback10;
                                                            } finally {
                                                            }
                                                        }
                                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                    }
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                                                    boolean zOnNavigationEvent21 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                                    objIAuthTabCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnNavigationEvent21) {
                                                    }
                                                }
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                objIAuthTabCallback5 = getswitchminwidth.IAuthTabCallback();
                                            }
                                            isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted10 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) objIAuthTabCallback5;
                                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1479154723);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                i7 = 0;
                                            } else {
                                                i7 = 0;
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1479154723, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:246)");
                                            }
                                            if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i7)) {
                                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(166490059);
                                                jReceiveFile2 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).receiveFile();
                                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(166488142);
                                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                jReceiveFile2 = ByteOrderedDataOutputStream.onExtraCallbackWithResult(3640655872L);
                                            }
                                            jOnExtraCallbackWithResult = jReceiveFile2;
                                            i8 = onWarmupCompleted + 57;
                                            onExtraCallback = i8 % 128;
                                            if (i8 % 2 == 0 ? (i9 = iArr[onwarmupcompleted10.ordinal()]) == 1 : (i9 = iArr[onwarmupcompleted10.ordinal()]) == 1) {
                                                jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult);
                                                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                if (!zOnNavigationEvent4 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onTransact(getswitchminwidth));
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                                                }
                                                isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted11 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult();
                                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1479154723);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 0;
                                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1479154723, 0, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Highlight.kt:246)");
                                                }
                                                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i10)) {
                                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(166490059);
                                                    c = 6;
                                                    long jReceiveFile3 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).receiveFile();
                                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                    jOnExtraCallbackWithResult2 = jReceiveFile3;
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(166488142);
                                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                    jOnExtraCallbackWithResult2 = ByteOrderedDataOutputStream.onExtraCallbackWithResult(3640655872L);
                                                    c = 6;
                                                }
                                                i11 = iArr[onwarmupcompleted11.ordinal()];
                                                if (i11 == 1) {
                                                    jOnExtraCallbackWithResult2 = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult2, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                    setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult2);
                                                    zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnNavigationEvent5 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackStub(getswitchminwidth));
                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                                                    }
                                                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback5 = getSwitchPadding.onExtraCallback(getswitchminwidth, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent2, (updateFocusedState) getbacktracenote5.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized4).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlist, "Clip Dim Color", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                                                    zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent((Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                                                    Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (zOnNavigationEvent6) {
                                                        Object obj4 = objOnMinimized15;
                                                        if (objOnMinimized15 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            Exif1 exif1OnNavigationEvent = withType.onNavigationEvent();
                                                            Paint paintOnExtraCallbackWithResult = exif1OnNavigationEvent.onExtraCallbackWithResult();
                                                            paintOnExtraCallbackWithResult.setMaskFilter(new BlurMaskFilter(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Cacheurls1.onNavigationEvent.onExtraCallback.onExtraCallback.onExtraCallback())), BlurMaskFilter.Blur.NORMAL));
                                                            if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                                                                Resources resources = context.getResources();
                                                                String str3 = str2;
                                                                Intrinsics.checkNotNullExpressionValue(resources, str3);
                                                                Configuration configuration = resources.getConfiguration();
                                                                Intrinsics.checkNotNullExpressionValue(configuration, str3);
                                                                iIntValue = new getDEFAULT_CONNECTION_SPECSokhttp(new ICustomTabsCallback(configuration)).onWarmupCompleted();
                                                            } else {
                                                                Configuration configuration2 = context.getResources().getConfiguration();
                                                                Intrinsics.checkNotNullExpressionValue(configuration2, str2);
                                                                iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new extraCallbackWithResult(configuration2))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
                                                            }
                                                            paintOnExtraCallbackWithResult.setColor(iIntValue);
                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(exif1OnNavigationEvent);
                                                            obj4 = exif1OnNavigationEvent;
                                                        }
                                                        final Exif1 exif1 = (Exif1) obj4;
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null);
                                                        boolean zOnNavigationEvent22 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsforOnNavigationEvent);
                                                        boolean zOnNavigationEvent23 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda64);
                                                        boolean zOnNavigationEvent24 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda63);
                                                        boolean zOnNavigationEvent25 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsforOnExtraCallbackWithResult);
                                                        boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback3);
                                                        boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fOnWarmupCompleted);
                                                        boolean zOnNavigationEvent26 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback);
                                                        boolean zOnNavigationEvent27 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2);
                                                        boolean zOnNavigationEvent28 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback3);
                                                        boolean zOnNavigationEvent29 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback5);
                                                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exif1);
                                                        boolean zOnNavigationEvent30 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda65);
                                                        Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (((zOnNavigationEvent22 | zOnNavigationEvent23 | zOnNavigationEvent24 | zOnNavigationEvent25 | zIAuthTabCallback | zIAuthTabCallback2 | zOnNavigationEvent26 | zOnNavigationEvent27 | zOnNavigationEvent28 | zOnNavigationEvent29 | zOnExtraCallback) || zOnNavigationEvent30) || objOnMinimized16 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            objOnMinimized16 = new Function1() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda10
                                                                private static int IAuthTabCallback = 0;
                                                                private static int onNavigationEvent = 1;

                                                                public final Object invoke(Object obj5) throws Throwable {
                                                                    int i35 = 2 % 2;
                                                                    int i36 = onNavigationEvent + 115;
                                                                    IAuthTabCallback = i36 % 128;
                                                                    int i37 = i36 % 2;
                                                                    Unit unitOnNavigationEvent = getPerformanceTracker.onNavigationEvent(fIAuthTabCallback3, fOnWarmupCompleted, getsupportedhighspeedresolutionsforOnNavigationEvent, cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda63, getsupportedhighspeedresolutionsforOnExtraCallbackWithResult, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback3, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback5, exif1, cameraPresenceProviderExternalSyntheticLambda65, (setOrientationDegrees) obj5);
                                                                    int i38 = onNavigationEvent + 39;
                                                                    IAuthTabCallback = i38 % 128;
                                                                    int i39 = i38 % 2;
                                                                    return unitOnNavigationEvent;
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized16);
                                                        } else {
                                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                                                        }
                                                        isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized16, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                                                        boolean z2 = loopVar.onExtraCallbackWithResult() == loop.onNavigationEvent.Left;
                                                        boolean z3 = loopVar.onExtraCallbackWithResult() == loop.onNavigationEvent.Right;
                                                        boolean z4 = loopVar.onNavigationEvent() == loop.IAuthTabCallback.Top;
                                                        if (loopVar.onNavigationEvent() == loop.IAuthTabCallback.Bottom) {
                                                            f7 = 0.0f;
                                                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                                                            obj = null;
                                                            i12 = 1;
                                                            z = true;
                                                        } else {
                                                            f7 = 0.0f;
                                                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                                                            obj = null;
                                                            i12 = 1;
                                                            z = false;
                                                        }
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, f7, i12, obj);
                                                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                                                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                                                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent2);
                                                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                                                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                                                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                                                            int i35 = onExtraCallback + 93;
                                                            onWarmupCompleted = i35 % 128;
                                                            if (i35 % 2 != 0) {
                                                                getAwbState.onExtraCallback();
                                                                throw null;
                                                            }
                                                            getAwbState.onExtraCallback();
                                                        }
                                                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                                                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                                                        } else {
                                                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                                                        }
                                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                                                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                                                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z2);
                                                        boolean zOnNavigationEvent31 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsforOnNavigationEvent);
                                                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z3);
                                                        boolean zOnNavigationEvent32 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsforOnExtraCallbackWithResult);
                                                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z4);
                                                        Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if ((zOnExtraCallback2 | zOnNavigationEvent31 | zOnExtraCallback3 | zOnNavigationEvent32 | zOnExtraCallback4) || objOnMinimized17 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            final boolean z5 = z2;
                                                            final boolean z6 = z3;
                                                            final boolean z7 = z4;
                                                            objOnMinimized17 = new getBacktraceNote() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda11
                                                                private static int onExtraCallback = 1;
                                                                private static int onNavigationEvent;

                                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                                    int i36 = 2 % 2;
                                                                    int i37 = onExtraCallback + 53;
                                                                    onNavigationEvent = i37 % 128;
                                                                    int i38 = i37 % 2;
                                                                    component8 component8VarOnWarmupCompleted = getPerformanceTracker.onWarmupCompleted(z5, z6, z7, getsupportedhighspeedresolutionsforOnNavigationEvent, getsupportedhighspeedresolutionsforOnExtraCallbackWithResult, (component4) obj5, (component7) obj6, (VirtualCameraCaptureResult) obj7);
                                                                    int i39 = onNavigationEvent + 53;
                                                                    onExtraCallback = i39 % 128;
                                                                    if (i39 % 2 != 0) {
                                                                        return component8VarOnWarmupCompleted;
                                                                    }
                                                                    Object obj8 = null;
                                                                    obj8.hashCode();
                                                                    throw null;
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized17);
                                                        }
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport0, (getBacktraceNote) objOnMinimized17);
                                                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z);
                                                        Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (zOnExtraCallback5 || objOnMinimized18 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            objOnMinimized18 = new Function1() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda12
                                                                private static int IAuthTabCallback = 0;
                                                                private static int onExtraCallbackWithResult = 1;

                                                                public final Object invoke(Object obj5) {
                                                                    Unit unitOnNavigationEvent;
                                                                    int i36 = 2 % 2;
                                                                    int i37 = onExtraCallbackWithResult + 1;
                                                                    IAuthTabCallback = i37 % 128;
                                                                    if (i37 % 2 != 0) {
                                                                        unitOnNavigationEvent = getPerformanceTracker.onNavigationEvent(z, (MaxAppOpenAd) obj5);
                                                                        int i38 = 95 / 0;
                                                                    } else {
                                                                        unitOnNavigationEvent = getPerformanceTracker.onNavigationEvent(z, (MaxAppOpenAd) obj5);
                                                                    }
                                                                    int i39 = onExtraCallbackWithResult + 55;
                                                                    IAuthTabCallback = i39 % 128;
                                                                    if (i39 % 2 != 0) {
                                                                        int i40 = 43 / 0;
                                                                    }
                                                                    return unitOnNavigationEvent;
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized18);
                                                        }
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = iscontainerclickable.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted2, getswitchminwidth, (Function1) objOnMinimized18);
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(-270267499);
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(-3687241);
                                                        Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted12 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                                        if (objOnMinimized19 == onwarmupcompleted12.onExtraCallback()) {
                                                            objOnMinimized19 = new Recorder();
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized19);
                                                        }
                                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
                                                        Recorder recorder = (Recorder) objOnMinimized19;
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(-3687241);
                                                        Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (objOnMinimized20 == onwarmupcompleted12.onExtraCallback()) {
                                                            objOnMinimized20 = new LifecycleCameraProviderImplExternalSyntheticLambda2();
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized20);
                                                        }
                                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
                                                        LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = (LifecycleCameraProviderImplExternalSyntheticLambda2) objOnMinimized20;
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(-3687241);
                                                        Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (objOnMinimized21 == onwarmupcompleted12.onExtraCallback()) {
                                                            obj2 = null;
                                                            objOnMinimized21 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized21);
                                                        } else {
                                                            obj2 = null;
                                                        }
                                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
                                                        Pair pairOnNavigationEvent = onProcessCompleted.onNavigationEvent(257, lifecycleCameraProviderImplExternalSyntheticLambda2, (getSupportedHighSpeedResolutionsFor) objOnMinimized21, recorder, cameraCaptureResultEmptyCameraCaptureResult, 4544);
                                                        callAllGets.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, new writeTypedObject(recorder), 1, obj2), ForwardingCameraControl.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, -819893854, true, new readTypedObject(lifecycleCameraProviderImplExternalSyntheticLambda2, 0, (Function0) pairOnNavigationEvent.IAuthTabCallback(), z, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z2, z3, str, getsupportedhighspeedresolutionsforOnExtraCallbackWithResult)), (component5) pairOnNavigationEvent.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
                                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
                                                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                                        }
                                                    }
                                                } else {
                                                    if (i11 != 2) {
                                                        if (i11 != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        jOnExtraCallbackWithResult2 = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult2, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                                    }
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                    setByteOrder setbyteorderOnNavigationEvent22 = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult2);
                                                    zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnNavigationEvent5) {
                                                        objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackStub(getswitchminwidth));
                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                                                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback52 = getSwitchPadding.onExtraCallback(getswitchminwidth, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent22, (updateFocusedState) getbacktracenote5.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized4).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlist, "Clip Dim Color", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                                                        zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent((Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                                                        Object objOnMinimized152 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (zOnNavigationEvent6) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (i9 != 2) {
                                                    if (i9 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                                }
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                setByteOrder setbyteorderOnNavigationEvent3 = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult);
                                                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                if (!zOnNavigationEvent4) {
                                                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onTransact(getswitchminwidth));
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                                                    isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted112 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult();
                                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1479154723);
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    }
                                                    if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i10)) {
                                                    }
                                                    i11 = iArr[onwarmupcompleted112.ordinal()];
                                                    if (i11 == 1) {
                                                    }
                                                }
                                            }
                                        } else {
                                            jOnExtraCallbackWithResult3 = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult3, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                            getattributeOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult3);
                                            zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getattributeOnExtraCallbackWithResult);
                                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!zOnNavigationEvent3) {
                                                objOnMinimized2 = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult);
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                                                getThumbTintList getthumbtintlist2 = (getThumbTintList) objOnMinimized2;
                                                if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                                                }
                                                isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted102 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) objIAuthTabCallback5;
                                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1479154723);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                }
                                                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i7)) {
                                                }
                                                jOnExtraCallbackWithResult = jReceiveFile2;
                                                i8 = onWarmupCompleted + 57;
                                                onExtraCallback = i8 % 128;
                                                if (i8 % 2 == 0) {
                                                    jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                    setByteOrder setbyteorderOnNavigationEvent32 = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult);
                                                    zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnNavigationEvent4) {
                                                    }
                                                } else {
                                                    jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                                    setByteOrder setbyteorderOnNavigationEvent322 = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult);
                                                    zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnNavigationEvent4) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i5 != 2) {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f6 = 0.0f;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                Object objOnMinimized132 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnNavigationEvent2) {
                                }
                            } else {
                                f6 = 1.0f;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                                Object objOnMinimized1322 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnNavigationEvent2) {
                                }
                            }
                        } else if (i27 != 2) {
                            if (i27 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f5 = 0.0f;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            Float fValueOf2 = Float.valueOf(f5);
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(!zOnNavigationEvent)) {
                                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackDefault(getswitchminwidth));
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                                isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted82 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult();
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-596278364);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                i5 = iArr[onwarmupcompleted82.ordinal()];
                                if (i5 == 1) {
                                }
                            }
                        } else {
                            f5 = 1.0f;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            Float fValueOf22 = Float.valueOf(f5);
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(!zOnNavigationEvent)) {
                            }
                        }
                    }
                } else {
                    if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda642 = cameraPresenceProviderExternalSyntheticLambda6;
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback6 = getSwitchPadding.onExtraCallback(getswitchminwidth, Float.valueOf(f), Float.valueOf(f2), (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized8).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback, "Clip Scale", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                    getBacktraceNote getbacktracenote22 = new getBacktraceNote() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda6
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj32, Object obj42, Object obj5) {
                            int i192 = 2 % 2;
                            int i202 = onNavigationEvent + 65;
                            onExtraCallbackWithResult = i202 % 128;
                            int i212 = i202 % 2;
                            updateFocusedState updatefocusedstateOnExtraCallbackWithResult = getPerformanceTracker.onExtraCallbackWithResult((getSwitchMinWidth.onExtraCallback) obj32, (CameraCaptureResultEmptyCameraCaptureResult) obj42, ((Integer) obj5).intValue());
                            int i222 = onNavigationEvent + 51;
                            onExtraCallbackWithResult = i222 % 128;
                            if (i222 % 2 != 0) {
                                int i232 = 1 / 0;
                            }
                            return updatefocusedstateOnExtraCallbackWithResult;
                        }
                    };
                    getThumbTintList getthumbtintlistIAuthTabCallback22 = getThumbTextPadding.IAuthTabCallback(floatCompanionObject);
                    if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                    }
                    isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted onwarmupcompleted32 = (isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted) objIAuthTabCallback2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1088049051);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    i4 = iArr[onwarmupcompleted32.ordinal()];
                    if (i4 == 1) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        boolean z;
        boolean z2;
        isContainerClickable iscontainerclickable;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        getSwitchMinWidth getswitchminwidth;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        isContainerClickable iscontainerclickable2;
        final isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove = (isMergePathsEnabledForKitKatAndAbove) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = (QuirksExternalSyntheticBackport0) objArr[3];
        final loop loopVar = (loop) objArr[4];
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[5];
        final Context context = (Context) objArr[6];
        final String str = (String) objArr[7];
        isContainerClickable iscontainerclickable3 = (isContainerClickable) objArr[8];
        getSwitchMinWidth getswitchminwidth2 = (getSwitchMinWidth) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable3, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth2, "");
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(iscontainerclickable3) ^ true ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= !cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getswitchminwidth2) ? 16 : 32;
        }
        if ((i & 147) != 146) {
            int i3 = onExtraCallback + 113;
            onWarmupCompleted = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(z, i & 1)) {
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1471963255, i, -1, "im.toss.compose.v0.TdsHighlight.<anonymous>.<anonymous> (Highlight.kt:81)");
            }
            boolean zIAuthTabCallbackStubProxy = getswitchminwidth2.IAuthTabCallbackStubProxy();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(ismergepathsenabledforkitkatandabove);
            int i5 = i & 112;
            if (i5 == 32) {
                int i6 = onWarmupCompleted + 67;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
            if ((z2 | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallback(ismergepathsenabledforkitkatandabove, getswitchminwidth2, null);
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zIAuthTabCallbackStubProxy), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult3, 0);
            Object objOnExtraCallbackWithResult = ((getSupportedHighSpeedResolutionsFor) isMergePathsEnabledForKitKatAndAbove.onNavigationEvent(210787053, new Object[]{ismergepathsenabledforkitkatandabove}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -210787053, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).onExtraCallbackWithResult();
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(jLongValue);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(ismergepathsenabledforkitkatandabove);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
            if ((zOnWarmupCompleted | zOnNavigationEvent2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallbackWithResult(jLongValue, ismergepathsenabledforkitkatandabove, null);
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(Long.valueOf(jLongValue), objOnExtraCallbackWithResult, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult3, 0);
            Object objIAuthTabCallback = getswitchminwidth2.IAuthTabCallback();
            boolean zIAuthTabCallbackStubProxy2 = getswitchminwidth2.IAuthTabCallbackStubProxy();
            boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(jLongValue);
            boolean zOnWarmupCompleted3 = cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(jLongValue2);
            boolean z3 = i5 == 32;
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(ismergepathsenabledforkitkatandabove);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
            if (((zOnWarmupCompleted2 | zOnWarmupCompleted3 | z3) || zOnNavigationEvent3) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                iscontainerclickable = iscontainerclickable3;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(jLongValue, jLongValue2, getswitchminwidth2, ismergepathsenabledforkitkatandabove, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onwarmupcompleted);
                objOnMinimized3 = onwarmupcompleted;
            } else {
                iscontainerclickable = iscontainerclickable3;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
            }
            isZslDisabledByByUserCaseConfig.IAuthTabCallback(Long.valueOf(jLongValue2), objIAuthTabCallback, Boolean.valueOf(zIAuthTabCallbackStubProxy2), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1512390251);
            if (((getSupportedHighSpeedResolutionsFor) isMergePathsEnabledForKitKatAndAbove.onNavigationEvent(210787053, new Object[]{ismergepathsenabledforkitkatandabove}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -210787053, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).onExtraCallbackWithResult() != isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Out) {
                if (((getSupportedHighSpeedResolutionsFor) isMergePathsEnabledForKitKatAndAbove.onNavigationEvent(210787053, new Object[]{ismergepathsenabledforkitkatandabove}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -210787053, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).onExtraCallbackWithResult() != isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted.Initial) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(314695605);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized4 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized4;
                    boolean zOnWarmupCompleted4 = ismergepathsenabledforkitkatandabove.onWarmupCompleted();
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(ismergepathsenabledforkitkatandabove);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent4) {
                        Object obj2 = objOnMinimized5;
                        if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                            Function0 function0 = new Function0() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda18
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    int i8 = 2 % 2;
                                    int i9 = onNavigationEvent + 41;
                                    onWarmupCompleted = i9 % 128;
                                    int i10 = i9 % 2;
                                    isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove2 = ismergepathsenabledforkitkatandabove;
                                    if (i10 == 0) {
                                        return (Unit) getPerformanceTracker.onNavigationEvent(new Object[]{ismergepathsenabledforkitkatandabove2}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 246094032, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -246094031, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                                    }
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                            obj2 = function0;
                        }
                        getswitchminwidth = getswitchminwidth2;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        iscontainerclickable2 = iscontainerclickable;
                        quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, zOnWarmupCompleted4, (String) null, (Role) null, (Function0) obj2, 24, (Object) null);
                    }
                } else {
                    getswitchminwidth = getswitchminwidth2;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    iscontainerclickable2 = iscontainerclickable;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(314637604);
                }
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                final getSwitchMinWidth getswitchminwidth3 = getswitchminwidth;
                final isContainerClickable iscontainerclickable4 = iscontainerclickable2;
                FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(-1341142413, true, new getBacktraceNote() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda19
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                        int i8 = 2 % 2;
                        int i9 = IAuthTabCallback + 39;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            return getPerformanceTracker.IAuthTabCallback(ismergepathsenabledforkitkatandabove, loopVar, getswitchminwidth3, r8lambdanm9dm2eewl4vrptnjmesfjqky4, context, iscontainerclickable4, str, (FocusMeteringControlExternalSyntheticLambda9) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        }
                        getPerformanceTracker.IAuthTabCallback(ismergepathsenabledforkitkatandabove, loopVar, getswitchminwidth3, r8lambdanm9dm2eewl4vrptnjmesfjqky4, context, iscontainerclickable4, str, (FocusMeteringControlExternalSyntheticLambda9) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 3072, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, @NotNull final String str, long j, long j2, @NotNull final loop loopVar, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        long j3;
        int i4;
        int i5;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final long j4;
        final long j5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i6;
        int i7;
        long j6 = j2;
        int i8 = 2 % 2;
        int i9 = onExtraCallback + 19;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(ismergepathsenabledforkitkatandabove, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(loopVar, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-789281199);
        Object obj = null;
        if ((i & 6) == 0) {
            int i11 = onWarmupCompleted + 103;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ismergepathsenabledforkitkatandabove)) {
                int i12 = onExtraCallback + 125;
                int i13 = i12 % 128;
                onWarmupCompleted = i13;
                int i14 = i12 % 2;
                int i15 = i13 + 107;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i & 384) == 0) {
            int i17 = onWarmupCompleted + 69;
            onExtraCallback = i17 % 128;
            if (i17 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j3 = j;
                int i18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 2048 : 1024;
                i3 |= i18;
            } else {
                j3 = j;
            }
            i3 |= i18;
        } else {
            j3 = j;
        }
        int i19 = i2 & 16;
        if (i19 == 0) {
            if ((i & 24576) == 0) {
                int i20 = onWarmupCompleted + 67;
                onExtraCallback = i20 % 128;
                if (i20 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j6);
                    obj.hashCode();
                    throw null;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j6)) {
                    i4 = 8192;
                } else {
                    int i21 = onExtraCallback + 39;
                    onWarmupCompleted = i21 % 128;
                    i4 = i21 % 2 != 0 ? 27715 : 16384;
                }
                i5 = i4 | i3;
            }
            if ((196608 & i) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(loopVar)) {
                    int i22 = onWarmupCompleted + 107;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i5 |= i6;
            }
            if ((74899 & i5) == 74898) {
                int i24 = onWarmupCompleted + 19;
                onExtraCallback = i24 % 128;
                int i25 = i24 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i5 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                j4 = j3;
                j5 = j6;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                        j3 = -1;
                    }
                    if (i19 != 0) {
                        j6 = 0;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                }
                final long j7 = j6;
                final long j8 = j3;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-789281199, i5, -1, "im.toss.compose.v0.TdsHighlight (Highlight.kt:74)");
                }
                final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                MaxNativeAdBuilder.onExtraCallback((getSupportedHighSpeedResolutionsFor) isMergePathsEnabledForKitKatAndAbove.onNavigationEvent(210787053, new Object[]{ismergepathsenabledforkitkatandabove}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -210787053, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent()), (setOnQueryTextListener) null, 0, 0, ForwardingCameraControl.onExtraCallback(-1471963255, true, new setTaggedAddrCtrl() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i26 = 2 % 2;
                        int i27 = onExtraCallbackWithResult + 123;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unitOnExtraCallback = getPerformanceTracker.onExtraCallback(ismergepathsenabledforkitkatandabove, j7, j8, quirksExternalSyntheticBackport0, loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4, context, str, (isContainerClickable) obj2, (getSwitchMinWidth) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        int i29 = onExtraCallbackWithResult + 7;
                        onWarmupCompleted = i29 % 128;
                        int i30 = i29 % 2;
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 24576, 14);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i26 = onExtraCallback + 95;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                j4 = j8;
                j5 = j7;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i28 = 2 % 2;
                        int i29 = onExtraCallbackWithResult + 3;
                        onExtraCallback = i29 % 128;
                        int i30 = i29 % 2;
                        Unit unitOnExtraCallbackWithResult = getPerformanceTracker.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, ismergepathsenabledforkitkatandabove, str, j4, j5, loopVar, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i31 = onExtraCallbackWithResult + 75;
                        onExtraCallback = i31 % 128;
                        int i32 = i31 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        i5 = i3;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i5) == 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static final isMergePathsEnabledForKitKatAndAbove onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1900260358, i, -1, "im.toss.compose.v0.rememberTdsHighlightState (Highlight.kt:532)");
        }
        Object[] objArr = new Object[0];
        getCaptureIds<isMergePathsEnabledForKitKatAndAbove, Bundle> getcaptureidsOnWarmupCompleted = isMergePathsEnabledForKitKatAndAbove.Companion.onWarmupCompleted();
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function0() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda16
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 89;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandaboveOnExtraCallback = getPerformanceTracker.onExtraCallback();
                    int i8 = onWarmupCompleted + 83;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 30 / 0;
                    }
                    return ismergepathsenabledforkitkatandaboveOnExtraCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove = (isMergePathsEnabledForKitKatAndAbove) RememberSaveableKt.onWarmupCompleted(objArr, getcaptureidsOnWarmupCompleted, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 384);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 65;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return ismergepathsenabledforkitkatandabove;
    }

    private static final isMergePathsEnabledForKitKatAndAbove onWarmupCompleted() {
        int i = 2 % 2;
        isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove = new isMergePathsEnabledForKitKatAndAbove();
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ismergepathsenabledforkitkatandabove;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(ismergepathsenabledforkitkatandabove, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.compose.v0.HighlightKt$$ExternalSyntheticLambda17
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove2 = ismergepathsenabledforkitkatandabove;
                Futures3 futures3 = (Futures3) obj;
                if (i4 == 0) {
                    return getPerformanceTracker.IAuthTabCallback(ismergepathsenabledforkitkatandabove2, futures3);
                }
                getPerformanceTracker.IAuthTabCallback(ismergepathsenabledforkitkatandabove2, futures3);
                throw null;
            }
        });
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            ismergepathsenabledforkitkatandabove.onWarmupCompleted(FuturesCallbackListener.IAuthTabCallbackStub(futures3), ExtensionsManager2.onExtraCallback(futures3.asBinder()));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        ismergepathsenabledforkitkatandabove.onWarmupCompleted(FuturesCallbackListener.IAuthTabCallbackStub(futures3), ExtensionsManager2.onExtraCallback(futures3.asBinder()));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 49;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 24 / 0;
        }
        return unit2;
    }

    private static final Unit IAuthTabCallback(float f, float f2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda66, Exif1 exif1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda67, setOrientationDegrees setorientationdegrees) throws Throwable {
        long j;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue() >> 32));
        float fFloatValue = ((Float) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1621471861, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1621471863, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).floatValue();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue());
        float fOnTransact = onTransact((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue() >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2) >> 32));
        float fFloatValue2 = ((Float) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1621471861, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1621471863, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).floatValue();
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) ((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue());
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2));
        float fOnTransact2 = onTransact((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62);
        float fOnExtraCallback = setorientationdegrees.onExtraCallback(f);
        float fOnExtraCallback2 = setorientationdegrees.onExtraCallback(f2);
        float fIntBitsToFloat7 = fIntBitsToFloat + fFloatValue + ((Float.intBitsToFloat((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2) >> 32)) / 2.0f) - ((Float.intBitsToFloat((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2) >> 32)) / 2.0f) * asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda63)));
        float fIntBitsToFloat8 = (fIntBitsToFloat2 - fOnTransact) + ((Float.intBitsToFloat((int) onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2)) / 2.0f) - ((Float.intBitsToFloat((int) onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2)) / 2.0f) * asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda63)));
        float fIntBitsToFloat9 = ((fIntBitsToFloat3 + fIntBitsToFloat4) - fFloatValue2) - ((Float.intBitsToFloat((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2) >> 32)) / 2.0f) - ((Float.intBitsToFloat((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2) >> 32)) / 2.0f) * asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda63)));
        float fIntBitsToFloat10 = ((fIntBitsToFloat5 + fIntBitsToFloat6) + fOnTransact2) - ((Float.intBitsToFloat((int) onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2)) / 2.0f) - ((Float.intBitsToFloat((int) onWarmupCompleted((getSupportedHighSpeedResolutionsFor<setUseCaseDetached>) getsupportedhighspeedresolutionsfor2)) / 2.0f) * asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda63)));
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(((fIntBitsToFloat9 - fIntBitsToFloat7) / 2.0f) + fIntBitsToFloat7) << 32) | (Float.floatToRawIntBits(((fIntBitsToFloat10 - fIntBitsToFloat8) / 2.0f) + fIntBitsToFloat8) & 4294967295L));
        Rect rect = new Rect(fIntBitsToFloat7, fIntBitsToFloat8, fIntBitsToFloat9, fIntBitsToFloat10);
        int i2 = (int) (jIAuthTabCallback >> 32);
        float f3 = (2.5f * fOnExtraCallback) / 2.0f;
        int i3 = (int) jIAuthTabCallback;
        float f4 = (1.5f * fOnExtraCallback2) / 2.0f;
        RoundRect roundRectOnNavigationEvent = RoundRectKt.onNavigationEvent(RectKt.onExtraCallbackWithResult(rect, new Rect(Float.intBitsToFloat(i2) - f3, Float.intBitsToFloat(i3) - f4, Float.intBitsToFloat(i2) + f3, Float.intBitsToFloat(i3) + f4), IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda64)), getAttachedUseCaseConfigs.onExtraCallback((Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(setorientationdegrees.onExtraCallback(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda65))) << 32)));
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        removeTimestamp.onExtraCallback(removetimestampOnWarmupCompleted, roundRectOnNavigationEvent, (removeTimestamp.onNavigationEvent) null, 2, (Object) null);
        int iOnNavigationEvent = readUnsignedShort.Companion.onNavigationEvent();
        setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
        long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
        setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
        try {
            setflashstateOnExtraCallback.onTransact().onNavigationEvent(removetimestampOnWarmupCompleted, iOnNavigationEvent);
            try {
                setOrientationDegrees.onWarmupCompleted(setorientationdegrees, onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda66), setUseCaseAttached.Companion.IAuthTabCallback(), setorientationdegrees.onTransact(), 0.0f, (hasMoreElements) null, (seek) null, 0, UCPApiConstants.ARAM_TIME_OUT, (Object) null);
                readShort readshortOnNavigationEvent = setorientationdegrees.onExtraCallback().onNavigationEvent();
                float fOnExtraCallback3 = roundRectOnNavigationEvent.onExtraCallback();
                float fIAuthTabCallbackDefault = roundRectOnNavigationEvent.IAuthTabCallbackDefault();
                float fAsInterface = roundRectOnNavigationEvent.asInterface();
                float fOnExtraCallbackWithResult = roundRectOnNavigationEvent.onExtraCallbackWithResult();
                float fOnExtraCallback4 = setorientationdegrees.onExtraCallback(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda65));
                float fOnExtraCallback5 = setorientationdegrees.onExtraCallback(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda65));
                exif1.onExtraCallbackWithResult(RangesKt.coerceIn(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda67), 0.0f, 1.0f));
                Unit unit = Unit.INSTANCE;
                readshortOnNavigationEvent.onNavigationEvent(fOnExtraCallback3, fIAuthTabCallbackDefault, fAsInterface, fOnExtraCallbackWithResult, fOnExtraCallback4, fOnExtraCallback5, exif1);
                setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
                int i4 = onWarmupCompleted + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            } catch (Throwable th) {
                th = th;
                j = jOnExtraCallback;
                setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                setflashstateOnExtraCallback.onExtraCallbackWithResult(j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = jOnExtraCallback;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = ((setUseCaseAttached) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallback();
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(jOnExtraCallback);
    }

    private static final long onWarmupCompleted(getSupportedHighSpeedResolutionsFor<setUseCaseDetached> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setUseCaseDetached setusecasedetached = (setUseCaseDetached) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            setusecasedetached.onNavigationEvent();
            throw null;
        }
        long jOnNavigationEvent = setusecasedetached.onNavigationEvent();
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return jOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(fFloatValue);
        }
        int i5 = 15 / 0;
        return Float.valueOf(fFloatValue);
    }

    private static final float onTransact(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return number.floatValue();
        }
        number.floatValue();
        throw null;
    }

    private static final float asBinder(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = onWarmupCompleted + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return number.floatValue();
        }
        number.floatValue();
        throw null;
    }

    private static final float onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            throw null;
        }
        float fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static final float onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            number.floatValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = onExtraCallback + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return fFloatValue;
    }

    private static final long onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setByteOrder setbyteorder = (setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return setbyteorder.access100();
        }
        setbyteorder.access100();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getStreamSharingChildren getstreamsharingchildren, boolean z, boolean z2, int i, boolean z3, int i2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        return (Unit) onNavigationEvent(new Object[]{getstreamsharingchildren, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Boolean.valueOf(z3), Integer.valueOf(i2), getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, onextracallbackwithresult}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1581945540, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1581945548, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove) {
        return (Unit) onNavigationEvent(new Object[]{ismergepathsenabledforkitkatandabove}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 246094032, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -246094031, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, RallyKeyframes rallyKeyframes) {
        return (Unit) onNavigationEvent(new Object[]{Boolean.valueOf(z), rallyKeyframes}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1201549350, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1201549350, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    public static /* synthetic */ updateFocusedState onExtraCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (updateFocusedState) onNavigationEvent(new Object[]{onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1252524622, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1252524631, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    private static final Unit onWarmupCompleted(isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, long j, long j2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, loop loopVar, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Context context, String str, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(new Object[]{ismergepathsenabledforkitkatandabove, Long.valueOf(j), Long.valueOf(j2), quirksExternalSyntheticBackport0, loopVar, r8lambdanm9dm2eewl4vrptnjmesfjqky4, context, str, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 864436256, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -864436253, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    private static final long IAuthTabCallback(getSupportedHighSpeedResolutionsFor<setUseCaseAttached> getsupportedhighspeedresolutionsfor) {
        return ((Long) onNavigationEvent(new Object[]{getsupportedhighspeedresolutionsfor}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1808299586, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1808299596, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).longValue();
    }

    private static final component8 onExtraCallbackWithResult(boolean z, boolean z2, boolean z3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        return (component8) onNavigationEvent(new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, component4Var, component7Var, virtualCameraCaptureResult}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 556013064, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -556013057, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(removeAdapter removeadapter) {
        return (Unit) onNavigationEvent(new Object[]{removeadapter}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1724021276, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1724021280, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        return ((Float) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1621471861, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1621471863, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).floatValue();
    }

    private static final updateFocusedState IAuthTabCallbackDefault(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (updateFocusedState) onNavigationEvent(new Object[]{onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 2103538136, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -2103538131, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    public static final class IAuthTabCallbackDefault implements Function0<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public IAuthTabCallbackDefault(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.isMergePathsEnabledForKitKatAndAbove$onWarmupCompleted] */
        public final isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onExtraCallback.access000();
                obj.hashCode();
                throw null;
            }
            ?? Access000 = this.onExtraCallback.access000();
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return Access000;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function0<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public IAuthTabCallback_Parcel(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o.isMergePathsEnabledForKitKatAndAbove$onWarmupCompleted] */
        public final isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onNavigationEvent.access000();
            if (i3 == 0) {
                int i4 = 58 / 0;
            }
            return Access000;
        }
    }

    public static final class access000 implements Function0<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public access000(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.isMergePathsEnabledForKitKatAndAbove$onWarmupCompleted] */
        public final isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.access000();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ?? Access000 = this.onExtraCallback.access000();
            int i3 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return Access000;
        }
    }

    public static final class getInterfaceDescriptor implements Function0<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public getInterfaceDescriptor(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.isMergePathsEnabledForKitKatAndAbove$onWarmupCompleted] */
        public final isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.IAuthTabCallback.access000();
            int i4 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return Access000;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements Function0<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onTransact(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o.isMergePathsEnabledForKitKatAndAbove$onWarmupCompleted] */
        public final isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth getswitchminwidth = this.onNavigationEvent;
            if (i3 != 0) {
                return getswitchminwidth.access000();
            }
            getswitchminwidth.access000();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements Function0<getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted>> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public IAuthTabCallbackStub(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onextracallbackOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 55 / 0;
            } else {
                onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = onNavigationEvent + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnExtraCallbackWithResult;
        }

        public final getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
                obj.hashCode();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onextracallbackIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements Function0<getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted>> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public IAuthTabCallbackStubProxy(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onextracallbackOnWarmupCompleted = onWarmupCompleted();
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnWarmupCompleted;
        }

        public final getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onextracallbackIAuthTabCallbackDefault = this.onExtraCallback.IAuthTabCallbackDefault();
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    public static final class access100 implements Function0<getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted>> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public access100(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onextracallbackOnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnWarmupCompleted;
        }

        public final getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback.IAuthTabCallbackDefault();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onextracallbackIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
            int i3 = onNavigationEvent + 29;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    public static final class asBinder implements Function0<getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted>> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public asBinder(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onExtraCallback = onExtraCallback();
            int i4 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth getswitchminwidth = this.onNavigationEvent;
            if (i3 != 0) {
                return getswitchminwidth.IAuthTabCallbackDefault();
            }
            getswitchminwidth.IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class extraCallback implements Function0<getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted>> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public extraCallback(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback = onExtraCallback();
                int i3 = 70 / 0;
            } else {
                onExtraCallback = onExtraCallback();
            }
            int i4 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return onExtraCallback;
        }

        public final getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<isMergePathsEnabledForKitKatAndAbove.onWarmupCompleted> onextracallbackIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
            int i4 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
