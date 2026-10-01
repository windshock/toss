package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.common.collect.Synchronized;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.createCameraCaptureCallback;
import o.getStreamSharingChildren;
import o.isExtraPreviewRequired;
import o.launchUri;
import o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI;
import o.r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg;
import o.setHorizontalGravity;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~((~i5) | i8)) | i7;
        int i10 = i4 | i8;
        int i11 = (~(i5 | i7 | i8)) | (~(i6 | i4));
        int i12 = i6 + i4 + i + (2049387148 * i3) + ((-609071723) * i2);
        int i13 = i12 * i12;
        int i14 = ((i6 * 335895516) - 1139737737) + (i4 * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (335896449 * i) + ((-616405876) * i3) + (126640917 * i2) + (i13 * 2020605952);
        switch (((1483459036 * i6) - 1284505600) + (2005429323 * i4) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i) + ((-243269632) * i3) + ((-895483904) * i2) + ((-1334837248) * i13) + (i14 * i14 * (-544210944))) {
            case 1:
                launchUri launchuri = (launchUri) objArr[0];
                final Function2 function2 = (Function2) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i15 = 2 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1782627613, iIntValue, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:461)");
                        int i16 = onExtraCallbackWithResult + 67;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    setPostviewFormatSelector.onNavigationEvent(PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(getHumanReadableName.onNavigationEvent(launchuri.IAuthTabCallbackDefault(), 0L, ((Long) launchUri.onNavigationEvent(-837041299, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{launchuri}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 837041311, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback())).longValue(), (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777213, (Object) null)), ForwardingCameraControl.onExtraCallback(-2064551459, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda28
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallback + 125;
                            onExtraCallbackWithResult = i19 % 128;
                            int i20 = i19 % 2;
                            Function2 function22 = function2;
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                            if (i20 != 0) {
                                Object[] objArr2 = {function22, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((Integer) obj2).intValue())};
                                int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                                return (Unit) r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr2, 1878194390, iOnNavigationEvent, -1878194385);
                            }
                            Object[] objArr3 = {function22, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((Integer) obj2).intValue())};
                            int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i18 = onExtraCallbackWithResult + 47;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i20 = onExtraCallbackWithResult + 93;
                        onWarmupCompleted = i20 % 128;
                        int i21 = i20 % 2;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                launchUri launchuri2 = (launchUri) objArr[0];
                Function2 function22 = (Function2) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i22 = 2 % 2;
                int i23 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i23 % 128;
                int i24 = i23 % 2;
                Unit unit = (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{launchuri2, function22, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(iIntValue2)}, 1619959559, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1619959558);
                int i25 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                return unit;
            case 5:
                Function2 function23 = (Function2) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i27 = 2 % 2;
                int i28 = onWarmupCompleted + 21;
                onExtraCallbackWithResult = i28 % 128;
                int i29 = i28 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(function23, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue3);
                int i30 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i30 % 128;
                int i31 = i30 % 2;
                return unitIAuthTabCallback;
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return onExtraCallbackWithResult(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return IAuthTabCallbackDefault(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(str, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, getStreamSharingChildren getstreamsharingchildren, int i2, getStreamSharingChildren getstreamsharingchildren2, int i3, getStreamSharingChildren getstreamsharingchildren3, int i4, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {Integer.valueOf(i), getstreamsharingchildren, Integer.valueOf(i2), getstreamsharingchildren2, Integer.valueOf(i3), getstreamsharingchildren3, Integer.valueOf(i4), onextracallbackwithresult};
        if (i7 != 0) {
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -610104936, iOnNavigationEvent, 610104942);
        }
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -610104936, iOnNavigationEvent2, 610104942);
        int i8 = 82 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackStubProxy(str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStubProxy(str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(launchUri launchuri, Paint paint, Paint paint2, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(launchuri, paint, paint2, setorientationdegrees);
        int i4 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(launchUri launchuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return onWarmupCompleted(launchuri, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onWarmupCompleted(launchuri, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onNavigationEvent(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Rect onExtraCallback(launchUri launchuri, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Rect rectOnWarmupCompleted = onWarmupCompleted(launchuri, setorientationdegrees);
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return rectOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return getInterfaceDescriptor(str, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        getInterfaceDescriptor(str, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(launchUri launchuri, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(launchuri, useandconfigureprogramwithtexture);
        }
        onNavigationEvent(launchuri, useandconfigureprogramwithtexture);
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(Function2 function2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{function2}, 1538860369, iOnNavigationEvent, -1538860362)).booleanValue();
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (function2 == null) {
            int i5 = i3 + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 87;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(launchUri launchuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallbackWithResult(launchuri, quirksExternalSyntheticBackport0, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallbackWithResult(launchuri, quirksExternalSyntheticBackport0, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Number onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Number numberOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return numberOnExtraCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return asBinder(str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asBinder(str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSwitchMinWidth getswitchminwidth, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(getswitchminwidth, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(getswitchminwidth, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(launchUri launchuri, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {launchuri, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        if (i4 != 0) {
            return (Unit) IAuthTabCallback(iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, objArr, 1063341240, iOnNavigationEvent, -1063341230);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(launchUri launchuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(launchuri, quirksExternalSyntheticBackport0, function2, function22, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 64 / 0;
        }
        int i8 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(launchUri launchuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(launchuri, quirksExternalSyntheticBackport0, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(launchuri, quirksExternalSyntheticBackport0, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(useandconfigureprogramwithtexture);
        int i3 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -4179741, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 4179754);
        int i6 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, launchUri launchuri, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, launchuri, str2, useandconfigureprogramwithtexture);
        int i4 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(getsupportedhighspeedresolutionsfor, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, str);
        int i3 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(launchUri launchuri, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {launchuri, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 439317291, iOnNavigationEvent, -439317280);
        int i5 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(launchUri launchuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i5 % 128;
        onExtraCallbackWithResult(launchuri, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ component8 onWarmupCompleted(launchUri launchuri, Function2 function2, Function2 function22, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarOnExtraCallbackWithResult = onExtraCallbackWithResult(launchuri, function2, function22, isextrapreviewrequired, virtualCameraCaptureResult);
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return component8VarOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, @Nullable r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str2, long j5, @Nullable String str3, long j6, boolean z, boolean z2, boolean z3, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3, int i4) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnNavigationEvent;
        String str4;
        long jOnNavigationEvent2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onextracallbackwithresult2;
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onextracallbackwithresult3;
        String str5;
        String str6;
        String str7;
        long jOnTransact;
        Object obj2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            quirksExternalSyntheticBackport02 = (i4 & 5) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i4 & 2) != 0) {
            }
        }
        getHumanReadableName gethumanreadablename2 = (i4 & 4) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        long jOnTransact2 = (i4 & 8) != 0 ? setByteOrder.Companion.onTransact() : j;
        Object obj3 = null;
        if ((i4 & 16) != 0) {
            int i7 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                obj3.hashCode();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        long jOnNavigationEvent3 = (i4 & 32) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        createCameraCaptureCallback createcameracapturecallback2 = (i4 & 64) != 0 ? null : createcameracapturecallback;
        float fOnExtraCallback = (i4 & 128) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        bindChildren bindchildren2 = (i4 & 256) != 0 ? null : bindchildren;
        use useVar2 = (i4 & 512) != 0 ? null : useVar;
        if ((i4 & 1024) != 0) {
            jOnNavigationEvent2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i8 = onExtraCallbackWithResult + 1;
            str4 = "";
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str4 = "";
            jOnNavigationEvent2 = j4;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i4 & 2048) != 0 ? null : graphicDeviceInfo;
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallbackOnWarmupCompleted = (i4 & 4096) != 0 ? r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U.onExtraCallback.onWarmupCompleted() : onextracallback;
        if ((i4 & 8192) != 0) {
            int i10 = onExtraCallbackWithResult + 61;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            onextracallbackwithresult2 = r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult.Auto;
        } else {
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        if ((i4 & 16384) != 0) {
            int i12 = onWarmupCompleted + 117;
            onextracallbackwithresult3 = onextracallbackwithresult2;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            str5 = null;
        } else {
            onextracallbackwithresult3 = onextracallbackwithresult2;
            str5 = str2;
        }
        long jOnTransact3 = (32768 & i4) != 0 ? setByteOrder.Companion.onTransact() : j5;
        String str8 = (65536 & i4) != 0 ? null : str3;
        if ((i4 & 131072) != 0) {
            str7 = str8;
            int i14 = onExtraCallbackWithResult + 1;
            str6 = str5;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            str6 = str5;
            str7 = str8;
            jOnTransact = j6;
        }
        boolean z4 = (262144 & i4) != 0 ? false : z;
        boolean z5 = (i4 & 524288) != 0 ? false : z2;
        boolean z6 = (i4 & 1048576) != 0 ? false : z3;
        if ((i4 & 2097152) != 0) {
            int i16 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 23 / 0;
            }
            obj2 = null;
        } else {
            obj2 = obj;
        }
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback2 = onextracallbackOnWarmupCompleted;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1977681321, i, i2, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2 (TdsRollingNumberV2.kt:282)");
        }
        if (z4) {
            str4 = str;
        }
        int i18 = i << 6;
        int i19 = i2 << 6;
        int i20 = i3 << 15;
        launchUri launchuriOnWarmupCompleted = r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onWarmupCompleted(str4, z4, null, null, gethumanreadablename2, jOnTransact2, jOnNavigationEvent, jOnNavigationEvent3, createcameracapturecallback2, fOnExtraCallback, bindchildren2, useVar2, jOnNavigationEvent2, graphicDeviceInfo2, null, z6, obj2, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 21) & 112) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), ((i >> 24) & 126) | (i19 & 896) | (i19 & 7168) | (i20 & 458752) | (i20 & 3670016), 16396);
        if (!z4) {
            int i21 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i21 % 128;
            int i22 = i21 % 2;
            launchUri.onExtraCallbackWithResult(launchuriOnWarmupCompleted, str, false, onextracallback2, onextracallbackwithresult3, z5, 2, null);
        }
        final String str9 = str6;
        launchUri.onNavigationEvent(73931737, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{launchuriOnWarmupCompleted, str9}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -73931735, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        final String str10 = str7;
        launchuriOnWarmupCompleted.onExtraCallbackWithResult(str10);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport03, launchuriOnWarmupCompleted, str9, str10);
        if (str9 == null) {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1259080906);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1259080907);
            final long j7 = jOnTransact3;
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(760854434, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda21
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj4, Object obj5) {
                    int i23 = 2 % 2;
                    int i24 = IAuthTabCallback + 9;
                    onNavigationEvent = i24 % 128;
                    int i25 = i24 % 2;
                    Unit unit = (Unit) r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{str9, Long.valueOf(j7), (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())}, 583114798, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -583114796);
                    int i26 = IAuthTabCallback + 47;
                    onNavigationEvent = i26 % 128;
                    if (i26 % 2 == 0) {
                        return unit;
                    }
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (str10 == null) {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1259202922);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i23 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i23 % 128;
            int i24 = i23 % 2;
            encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1259202923);
            final long j8 = jOnTransact;
            encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(456996899, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda22
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                    int i25 = 2 % 2;
                    int i26 = onNavigationEvent + 113;
                    onExtraCallbackWithResult = i26 % 128;
                    int i27 = i26 % 2;
                    Unit unitOnExtraCallback = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallback(str10, j8, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i28 = onExtraCallbackWithResult + 35;
                    onNavigationEvent = i28 % 128;
                    int i29 = i28 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        onExtraCallbackWithResult(launchuriOnWarmupCompleted, quirksExternalSyntheticBackport0OnWarmupCompleted, encoderProfilesProxyVideoProfileProxyOnExtraCallback, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i25 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i25 % 128;
            int i26 = i25 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i26 != 0) {
                int i27 = 79 / 0;
            }
        }
    }

    private static final Unit onTransact(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(760854434, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:321)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(456996899, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:326)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(456996899, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:326)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        getHumanReadableName gethumanreadablename;
        createCameraCaptureCallback createcameracapturecallback;
        GraphicDeviceInfo graphicDeviceInfo;
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onextracallbackwithresult;
        long j;
        Function2 function2;
        Function2 function22;
        Number number = (Number) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[1];
        getHumanReadableName gethumanreadablename2 = (getHumanReadableName) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        long jLongValue3 = ((Number) objArr[5]).longValue();
        createCameraCaptureCallback createcameracapturecallback2 = (createCameraCaptureCallback) objArr[6];
        float fFloatValue = ((Number) objArr[7]).floatValue();
        bindChildren bindchildren = (bindChildren) objArr[8];
        use useVar = (use) objArr[9];
        long jLongValue4 = ((Number) objArr[10]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[11];
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback = (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) objArr[12];
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onextracallbackwithresult2 = (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult) objArr[13];
        String str = (String) objArr[14];
        long jLongValue5 = ((Number) objArr[15]).longValue();
        String str2 = (String) objArr[16];
        long jLongValue6 = ((Number) objArr[17]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[18]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[19]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[20]).booleanValue();
        Object obj = objArr[21];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[22];
        int iIntValue = ((Number) objArr[23]).intValue();
        int iIntValue2 = ((Number) objArr[24]).intValue();
        int iIntValue3 = ((Number) objArr[25]).intValue();
        int iIntValue4 = ((Number) objArr[26]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(number, "");
            quirksExternalSyntheticBackport0 = (iIntValue4 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
        } else {
            Intrinsics.checkNotNullParameter(number, "");
            if ((iIntValue4 & 2) != 0) {
            }
        }
        if ((iIntValue4 & 4) != 0) {
            getHumanReadableName gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            int i3 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            gethumanreadablename = gethumanreadablename3;
        } else {
            gethumanreadablename = gethumanreadablename2;
        }
        if ((iIntValue4 & 8) != 0) {
            jLongValue = setByteOrder.Companion.onTransact();
        }
        long j2 = jLongValue;
        if ((iIntValue4 & 16) != 0) {
            int i5 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                throw null;
            }
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j3 = jLongValue2;
        if ((iIntValue4 & 32) != 0) {
            jLongValue3 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j4 = jLongValue3;
        if ((iIntValue4 & 64) != 0) {
            int i6 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            createcameracapturecallback = null;
        } else {
            createcameracapturecallback = createcameracapturecallback2;
        }
        if ((iIntValue4 & 128) != 0) {
            fFloatValue = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        }
        float f = fFloatValue;
        bindChildren bindchildren2 = (iIntValue4 & 256) != 0 ? null : bindchildren;
        use useVar2 = (iIntValue4 & 512) != 0 ? null : useVar;
        if ((iIntValue4 & 1024) != 0) {
            jLongValue4 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j5 = jLongValue4;
        if ((iIntValue4 & 2048) != 0) {
            int i8 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            graphicDeviceInfo = null;
        } else {
            graphicDeviceInfo = graphicDeviceInfo2;
        }
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallbackOnWarmupCompleted = (iIntValue4 & 4096) != 0 ? r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U.onExtraCallback.onWarmupCompleted() : onextracallback;
        if ((iIntValue4 & 8192) != 0) {
            int i10 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            onextracallbackwithresult = r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult.Auto;
        } else {
            onextracallbackwithresult = onextracallbackwithresult2;
        }
        final String str3 = (iIntValue4 & 16384) != 0 ? null : str;
        if ((32768 & iIntValue4) != 0) {
            jLongValue5 = setByteOrder.Companion.onTransact();
        }
        long j6 = jLongValue5;
        final String str4 = (65536 & iIntValue4) != 0 ? null : str2;
        if ((131072 & iIntValue4) != 0) {
            jLongValue6 = setByteOrder.Companion.onTransact();
        }
        final long j7 = jLongValue6;
        if ((262144 & iIntValue4) != 0) {
            int i12 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            zBooleanValue = false;
        }
        boolean z = (524288 & iIntValue4) != 0 ? false : zBooleanValue2;
        boolean z2 = (1048576 & iIntValue4) != 0 ? false : zBooleanValue3;
        Object obj2 = (iIntValue4 & 2097152) != 0 ? null : obj;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1214239857, iIntValue, iIntValue2, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2 (TdsRollingNumberV2.kt:365)");
        }
        int i14 = iIntValue << 6;
        int i15 = iIntValue2 << 6;
        int i16 = iIntValue3 << 15;
        launchUri launchuriOnNavigationEvent = r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onNavigationEvent(zBooleanValue ? number : null, zBooleanValue, null, null, gethumanreadablename, j2, j3, j4, createcameracapturecallback, f, bindchildren2, useVar2, j5, graphicDeviceInfo, null, z2, obj2, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue2 >> 21) & 112) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192), ((iIntValue >> 24) & 126) | (i15 & 896) | (i15 & 7168) | (i16 & 458752) | (i16 & 3670016), 16396);
        if (zBooleanValue) {
            j = j6;
        } else {
            int i17 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            j = j6;
            launchUri.onNavigationEvent(launchuriOnNavigationEvent, number, false, onextracallbackOnWarmupCompleted, onextracallbackwithresult, z, 2, null);
        }
        launchUri.onNavigationEvent(73931737, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{launchuriOnNavigationEvent, str3}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -73931735, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        launchuriOnNavigationEvent.onExtraCallbackWithResult(str4);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, launchuriOnNavigationEvent, str3, str4);
        if (str3 == null) {
            int i19 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1203056254);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            function2 = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1203056253);
            final long j8 = j;
            Function2 function2OnExtraCallback = ForwardingCameraControl.onExtraCallback(1524295898, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i21 = 2 % 2;
                    int i22 = onExtraCallbackWithResult + 3;
                    onNavigationEvent = i22 % 128;
                    if (i22 % 2 == 0) {
                        r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(str3, j8, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        throw null;
                    }
                    Unit unitOnNavigationEvent = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(str3, j8, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i23 = onNavigationEvent + 55;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i21 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 4 % 2;
            }
            function2 = function2OnExtraCallback;
        }
        if (str4 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1202981854);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            function22 = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1202981853);
            Function2 function2OnExtraCallback2 = ForwardingCameraControl.onExtraCallback(1220438363, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda8
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i23 = 2 % 2;
                    int i24 = onExtraCallbackWithResult + 45;
                    onExtraCallback = i24 % 128;
                    int i25 = i24 % 2;
                    String str5 = str4;
                    if (i25 != 0) {
                        return r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallbackWithResult(str5, j7, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallbackWithResult(str5, j7, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            function22 = function2OnExtraCallback2;
        }
        onExtraCallbackWithResult(launchuriOnNavigationEvent, quirksExternalSyntheticBackport0OnWarmupCompleted, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    private static final Unit asBinder(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 83;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1524295898, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:402)");
                int i8 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 91;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1220438363, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:403)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onWarmupCompleted + 85;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final launchUri launchuri, final String str, final String str2) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(getExtensionsBeforeInitialized.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 1;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onWarmupCompleted(str, launchuri, str2, (useAndConfigureProgramWithTexture) obj);
                int i5 = IAuthTabCallback + 101;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, launchUri launchuri, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (str == null) {
            int i3 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            str = "";
        }
        String strOnExtraCallbackWithResult = launchuri.onExtraCallbackWithResult();
        if (str2 == null) {
            int i5 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str2 = "";
        }
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str + strOnExtraCallbackWithResult + str2);
        return Unit.INSTANCE;
    }

    public static final void IAuthTabCallback(@NotNull launchUri launchuri, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @Nullable String str2, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final long jOnTransact;
        String str3;
        String str4;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(launchuri, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        final String str5 = (i2 & 4) != 0 ? "" : str;
        final String str6 = (i2 & 8) == 0 ? str2 : "";
        if ((i2 & 16) != 0) {
            int i4 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i5 = 17 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
        } else {
            jOnTransact = j;
        }
        final long jOnTransact2 = (i2 & 32) != 0 ? setByteOrder.Companion.onTransact() : j2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1389439041, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2 (TdsRollingNumberV2.kt:424)");
        }
        Function2 function2OnExtraCallback = null;
        if (str5.length() > 0) {
            int i6 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            str3 = str5;
        } else {
            str3 = null;
        }
        launchUri.onNavigationEvent(73931737, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{launchuri, str3}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -73931735, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        launchuri.onExtraCallbackWithResult(str6.length() > 0 ? str6 : null);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport02, launchuri, str5, str6);
        if (str5.length() > 0) {
            int i8 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            str4 = str5;
        } else {
            str4 = null;
        }
        if (str4 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2116926222);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2116926223);
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1300012396, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 67;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitIAuthTabCallback = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(str5, jOnTransact, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = onExtraCallback + 43;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if ((str6.length() > 0 ? str6 : null) == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2117031374);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2117031375);
            function2OnExtraCallback = ForwardingCameraControl.onExtraCallback(-1056475533, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda16
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 85;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    String str7 = str6;
                    long j3 = jOnTransact2;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {str7, Long.valueOf(j3), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                    Unit unit = (Unit) r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -959766615, iOnNavigationEvent, 959766618);
                    int i12 = onExtraCallback + 45;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i9 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            onExtraCallbackWithResult(launchuri, quirksExternalSyntheticBackport0OnWarmupCompleted, encoderProfilesProxyVideoProfileProxyOnExtraCallback, function2OnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, i & 11, 0);
            if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                return;
            }
        } else {
            onExtraCallbackWithResult(launchuri, quirksExternalSyntheticBackport0OnWarmupCompleted, encoderProfilesProxyVideoProfileProxyOnExtraCallback, function2OnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 0);
            if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                return;
            }
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        int i10 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStubProxy(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1300012396, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:435)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 2;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1056475533, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:436)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i7 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 111;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2064551459, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:464)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2064551459, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:464)");
            }
            onWarmupCompleted((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1609525374, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:474)");
            }
            onWarmupCompleted((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean z;
        launchUri launchuri = (launchUri) objArr[0];
        final Function2 function2 = (Function2) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0 ? (iIntValue & 3) == 2 : (iIntValue & 5) == 3) {
            int i4 = i2 + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1161737150, iIntValue, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:471)");
            }
            setPostviewFormatSelector.onNavigationEvent(PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(getHumanReadableName.onNavigationEvent(launchuri.IAuthTabCallbackDefault(), 0L, ((Long) launchUri.onNavigationEvent(-837041299, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{launchuri}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 837041311, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback())).longValue(), (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777213, (Object) null)), ForwardingCameraControl.onExtraCallback(1609525374, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda13
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 97;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallbackWithResult = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallbackWithResult(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = onExtraCallback + 15;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 10 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        boolean z;
        launchUri launchuri = (launchUri) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
            int i4 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2030598016, iIntValue, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous>.<anonymous>.<anonymous> (TdsRollingNumberV2.kt:485)");
            }
            onExtraCallbackWithResult(launchuri, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final component8 onExtraCallbackWithResult(final launchUri launchuri, final Function2 function2, final Function2 function22, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int interfaceDescriptor;
        int iT_;
        int iT_2;
        int iT_3;
        final int i;
        component7 component7Var;
        component7 component7Var2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        launchuri.onWarmupCompleted(virtualCameraCaptureResult.onExtraCallback(), launchuri.asBinder(), launchuri.asInterface());
        long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(virtualCameraCaptureResult.onExtraCallback(), 0, 0, 0, 0, 14, (Object) null);
        Object obj = null;
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = (function2 == null || (component7Var2 = (component7) CollectionsKt.firstOrNull(isextrapreviewrequired.IAuthTabCallback("prefix", ForwardingCameraControl.onExtraCallbackWithResult(1782627613, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda23
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2, Object obj3) {
                Unit unit;
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = {launchuri, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                    unit = (Unit) r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 408106390, iOnNavigationEvent, -408106386);
                    int i5 = 15 / 0;
                } else {
                    Object[] objArr2 = {launchuri, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                    unit = (Unit) r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr2, 408106390, iOnNavigationEvent2, -408106386);
                }
                int i6 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        })))) == null) ? null : component7Var2.onExtraCallback(jIAuthTabCallback);
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback2 = (function22 == null || (component7Var = (component7) CollectionsKt.firstOrNull(isextrapreviewrequired.IAuthTabCallback("suffix", ForwardingCameraControl.onExtraCallbackWithResult(1161737150, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda24
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj2, Object obj3) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onWarmupCompleted(launchuri, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i6 = onExtraCallback + 105;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        })))) == null) ? null : component7Var.onExtraCallback(jIAuthTabCallback);
        int i3 = 0;
        if (getstreamsharingchildrenOnExtraCallback != null) {
            int i4 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
                obj.hashCode();
                throw null;
            }
            interfaceDescriptor = getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
        } else {
            interfaceDescriptor = 0;
        }
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback3 = ((component7) CollectionsKt.first(isextrapreviewrequired.IAuthTabCallback("number", ForwardingCameraControl.onExtraCallbackWithResult(-2030598016, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda25
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2, Object obj3) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 91;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                Unit unitOnNavigationEvent = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(launchuri, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i8 = onExtraCallback + 33;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return unitOnNavigationEvent;
            }
        })))).onExtraCallback(VirtualCameraCaptureResult.IAuthTabCallback(virtualCameraCaptureResult.onExtraCallback(), 0, RangesKt.coerceAtLeast(VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()) - (interfaceDescriptor + (getstreamsharingchildrenOnExtraCallback2 != null ? getstreamsharingchildrenOnExtraCallback2.getInterfaceDescriptor() : 0)), 0), 0, 0, 12, (Object) null));
        int interfaceDescriptor2 = (getstreamsharingchildrenOnExtraCallback != null ? getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor() : 0) + getstreamsharingchildrenOnExtraCallback3.getInterfaceDescriptor() + (getstreamsharingchildrenOnExtraCallback2 != null ? getstreamsharingchildrenOnExtraCallback2.getInterfaceDescriptor() : 0);
        if (getstreamsharingchildrenOnExtraCallback != null) {
            iT_ = getstreamsharingchildrenOnExtraCallback.T_();
            int i5 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iT_ = 0;
        }
        int iT_4 = getstreamsharingchildrenOnExtraCallback3.T_();
        if (getstreamsharingchildrenOnExtraCallback2 != null) {
            iT_2 = getstreamsharingchildrenOnExtraCallback2.T_();
        } else {
            int i7 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iT_2 = 0;
        }
        int iMax = Math.max(iT_, Math.max(iT_4, iT_2));
        if (getstreamsharingchildrenOnExtraCallback != null) {
            int i9 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                getstreamsharingchildrenOnExtraCallback.T_();
                throw null;
            }
            iT_3 = getstreamsharingchildrenOnExtraCallback.T_();
        } else {
            iT_3 = 0;
        }
        final int i10 = (iMax - iT_3) / 2;
        final int iT_5 = (iMax - getstreamsharingchildrenOnExtraCallback3.T_()) / 2;
        final int iT_6 = (iMax - (getstreamsharingchildrenOnExtraCallback2 != null ? getstreamsharingchildrenOnExtraCallback2.T_() : 0)) / 2;
        int iAsInterface = VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()) != Integer.MAX_VALUE ? VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()) : interfaceDescriptor2;
        int iOnActivityResized = launchuri.IAuthTabCallbackDefault().onActivityResized();
        createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
        if (createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onNavigationEvent()) || createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onExtraCallback())) {
            i = iAsInterface - interfaceDescriptor2;
        } else {
            int i11 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0 ? createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.IAuthTabCallback()) : createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.IAuthTabCallback())) {
                i3 = (iAsInterface - interfaceDescriptor2) / 2;
            }
            int i12 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            i = i3;
        }
        return component4.IAuthTabCallback(isextrapreviewrequired, iAsInterface, iMax, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                int i14 = 2 % 2;
                int i15 = onNavigationEvent + 19;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                Unit unitIAuthTabCallback = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(i, getstreamsharingchildrenOnExtraCallback, i10, getstreamsharingchildrenOnExtraCallback3, iT_5, getstreamsharingchildrenOnExtraCallback2, iT_6, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                int i17 = IAuthTabCallback + 61;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                return unitIAuthTabCallback;
            }
        }, 4, (Object) null);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        float f;
        int i;
        int interfaceDescriptor = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        getStreamSharingChildren getstreamsharingchildren2 = (getStreamSharingChildren) objArr[3];
        int iIntValue3 = ((Number) objArr[4]).intValue();
        getStreamSharingChildren getstreamsharingchildren3 = (getStreamSharingChildren) objArr[5];
        int iIntValue4 = ((Number) objArr[6]).intValue();
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[7];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (getstreamsharingchildren != null) {
            int i3 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                f = 0.0f;
                i = 2;
            } else {
                f = 0.0f;
                i = 4;
            }
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, iIntValue, iIntValue2, f, i, (Object) null);
        }
        if (getstreamsharingchildren != null) {
            int i4 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            interfaceDescriptor = getstreamsharingchildren.getInterfaceDescriptor();
        }
        int i6 = iIntValue + interfaceDescriptor;
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren2, i6, iIntValue3, 0.0f, 4, (Object) null);
        int interfaceDescriptor2 = getstreamsharingchildren2.getInterfaceDescriptor();
        if (getstreamsharingchildren3 != null) {
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren3, i6 + interfaceDescriptor2, iIntValue4, 0.0f, 4, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
            int i3 = 51 / 0;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(launchUri launchuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onNavigationEvent;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(325371307, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2.<anonymous> (TdsRollingNumberV2.kt:523)");
            }
            int iOnActivityResized = launchuri.IAuthTabCallbackDefault().onActivityResized();
            createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
            if (createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onExtraCallbackWithResult())) {
                onNavigationEvent = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent.IAuthTabCallback();
            } else if (!createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onTransact())) {
                int i9 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                if (createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onNavigationEvent())) {
                    onNavigationEvent = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent.onNavigationEvent();
                } else if (createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onExtraCallback())) {
                    int i11 = onExtraCallbackWithResult + 37;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    onNavigationEvent = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onWarmupCompleted();
                } else {
                    onNavigationEvent = createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.IAuthTabCallback()) ? FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent() : FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface();
                }
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda27
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallbackWithResult + 123;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr = {(useAndConfigureProgramWithTexture) obj};
                        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                        if (i15 != 0) {
                            return (Unit) r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, objArr, 1714691438, iOnNavigationEvent, -1714691430);
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0, true, (Function1) objOnMinimized);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onNavigationEvent, QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            onWarmupCompleted((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            onExtraCallbackWithResult(launchuri, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            onWarmupCompleted((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function22, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final launchUri launchuri, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23;
        int i5;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24;
        int i6;
        boolean z;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z2;
        int i7 = 2 % 2;
        int i8 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(launchuri, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1301222513);
        if ((i & 6) == 0) {
            int i10 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(launchuri) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
                int i13 = onExtraCallbackWithResult + 117;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
            } else {
                if ((i & 384) == 0) {
                    function23 = function2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function24 = function22;
                        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function24))) {
                            int i15 = onWarmupCompleted + 27;
                            onExtraCallbackWithResult = i15 % 128;
                            i6 = i15 % 2 != 0 ? 21235 : 2048;
                        } else {
                            i6 = 1024;
                        }
                        i3 |= i6;
                    }
                    if ((i3 & 1171) == 1170) {
                        int i16 = onExtraCallbackWithResult + 81;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    } else {
                        int i18 = onExtraCallbackWithResult + 17;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if (i4 != 0) {
                            function23 = null;
                        }
                        if (i5 != 0) {
                            function24 = null;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i20 = onWarmupCompleted + 81;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1301222513, i3, -1, "im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2 (TdsRollingNumberV2.kt:446)");
                        }
                        if (launchuri.IAuthTabCallbackStubProxy()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1655239566);
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda17
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj) {
                                        int i22 = 2 % 2;
                                        int i23 = onWarmupCompleted + 81;
                                        onExtraCallbackWithResult = i23 % 128;
                                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                                        if (i23 % 2 != 0) {
                                            r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(useandconfigureprogramwithtexture);
                                            throw null;
                                        }
                                        Unit unitOnNavigationEvent = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(useandconfigureprogramwithtexture);
                                        int i24 = onExtraCallbackWithResult + 39;
                                        onWarmupCompleted = i24 % 128;
                                        int i25 = i24 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport04, true, (Function1) objOnMinimized);
                            boolean z3 = (i3 & 14) == 4;
                            if ((i3 & 896) == 256) {
                                int i22 = onExtraCallbackWithResult + 23;
                                onWarmupCompleted = i22 % 128;
                                int i23 = i22 % 2;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z4 = (i3 & 7168) == 2048;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z3 | z2 | z4)) {
                                int i24 = onWarmupCompleted + 113;
                                onExtraCallbackWithResult = i24 % 128;
                                int i25 = i24 % 2;
                                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized2 = new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda18
                                        private static int IAuthTabCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i26 = 2 % 2;
                                            int i27 = onWarmupCompleted + 83;
                                            IAuthTabCallback = i27 % 128;
                                            int i28 = i27 % 2;
                                            launchUri launchuri2 = launchuri;
                                            if (i28 != 0) {
                                                return r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onWarmupCompleted(launchuri2, function23, function24, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                                            }
                                            r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onWarmupCompleted(launchuri2, function23, function24, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1658165315);
                            setPostviewFormatSelector.onNavigationEvent(PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(launchuri.IAuthTabCallbackDefault()), ForwardingCameraControl.onExtraCallback(325371307, true, new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda19
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i26 = 2 % 2;
                                    int i27 = onNavigationEvent + 91;
                                    IAuthTabCallback = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        return r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(launchuri, quirksExternalSyntheticBackport04, function23, function24, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    }
                                    r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(launchuri, quirksExternalSyntheticBackport04, function23, function24, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    }
                    final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function25 = function24;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function26 = function23;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda20
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i26 = 2 % 2;
                                int i27 = onExtraCallback + 85;
                                onWarmupCompleted = i27 % 128;
                                int i28 = i27 % 2;
                                Unit unitOnNavigationEvent = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(launchuri, quirksExternalSyntheticBackport03, function26, function25, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i29 = onExtraCallback + 59;
                                onWarmupCompleted = i29 % 128;
                                int i30 = i29 % 2;
                                return unitOnNavigationEvent;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function24 = function22;
                if ((i3 & 1171) == 1170) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                }
                final Function2 function252 = function24;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            function23 = function2;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function24 = function22;
            if ((i3 & 1171) == 1170) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            final Function2 function2522 = function24;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function24 = function22;
        if ((i3 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        final Function2 function25222 = function24;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1533445475, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.Affix.<anonymous> (TdsRollingNumberV2.kt:556)");
        }
        Function2 function2 = (Function2) getswitchminwidth.access000();
        if (function2 == null) {
            function2 = (Function2) getswitchminwidth.IAuthTabCallback();
        }
        if (function2 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1601877092);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-467315451);
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i3 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1712494124);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i4 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1712494124, i2, -1, "im.toss.tds.compose.component.anim.rollingnumber.Affix (TdsRollingNumberV2.kt:543)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new makeLayout(function2);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            makeLayout makelayout = (makeLayout) objOnMinimized;
            makelayout.onExtraCallback(function2);
            final getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(makelayout, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, makeLayout.onNavigationEvent, 2);
            getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
            getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(geticoncontentview.onTransact(), 0, 2, (Object) null);
            getThumbPosition getthumbpositionOnExtraCallback2 = getSplitTrack.onExtraCallback(geticoncontentview.onTransact(), 0, 2, (Object) null);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = IAuthTabCallback + 81;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        Boolean boolValueOf = Boolean.valueOf(r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallback((Function2) obj));
                        int i11 = IAuthTabCallback + 37;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        return boolValueOf;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                int i8 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            setVerticalGravity.onExtraCallback(getswitchminwidthOnWarmupCompleted, (Function1) objOnMinimized2, (QuirksExternalSyntheticBackport0) null, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(getthumbpositionOnExtraCallback, 0.0f, 2, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(getthumbpositionOnExtraCallback2, (QuirkSettingsLoader.onNavigationEvent) null, false, (Function1) null, 10, (Object) null)), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(getthumbpositionOnExtraCallback, 0.0f, 2, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onNavigationEvent(getthumbpositionOnExtraCallback2, (QuirkSettingsLoader.onNavigationEvent) null, false, (Function1) null, 10, (Object) null)), ForwardingCameraControl.onExtraCallback(-1533445475, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 109;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnNavigationEvent = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(getswitchminwidthOnWarmupCompleted, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = IAuthTabCallback + 33;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 224304, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda11
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnNavigationEvent;
                    int i12 = 2 % 2;
                    int i13 = IAuthTabCallback + 41;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 == 0) {
                        unitOnNavigationEvent = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i14 = 6 / 0;
                    } else {
                        unitOnNavigationEvent = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i15 = onNavigationEvent + 87;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Rect onWarmupCompleted(launchUri launchuri, setOrientationDegrees setorientationdegrees) {
        float f;
        float fIntBitsToFloat;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        boolean zOnNavigationEvent = maybeHandleOnAttachedToWindow.onNavigationEvent(launchuri.IAuthTabCallbackDefault().onActivityResized());
        if (launchuri.IAuthTabCallback_Parcel()) {
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            f = zOnNavigationEvent ? -3.4028235E38f : 0.0f;
        }
        if (launchuri.IAuthTabCallback_Parcel()) {
            int i3 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
                fIntBitsToFloat = zOnNavigationEvent ^ true ? Float.MAX_VALUE : Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32));
            } else if (!zOnNavigationEvent) {
            }
        }
        Rect rect = new Rect(f, 0.0f, fIntBitsToFloat, (int) launchuri.onExtraCallback());
        int i5 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return rect;
    }

    private static final Unit onNavigationEvent(launchUri launchuri, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, launchuri.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, launchuri.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(Paint paint, launchUri launchuri, Canvas canvas, float f, float f2, float f3, r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q) {
        float fAccess000;
        int i = 2 % 2;
        paint.setAlpha(RangesKt.coerceIn((int) (launchuri.IAuthTabCallbackDefault().onExtraCallbackWithResult() * r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q.onNavigationEvent() * 255.0f), 0, 255));
        if (paint.getAlpha() != 0) {
            Triple triple = (Triple) r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q.onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 211494076, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -211494075);
            char cCharValue = ((Character) triple.onExtraCallbackWithResult()).charValue();
            char cCharValue2 = ((Character) triple.onExtraCallback()).charValue();
            char cCharValue3 = ((Character) triple.IAuthTabCallback()).charValue();
            int iOnActivityResized = launchuri.IAuthTabCallbackDefault().onActivityResized();
            createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
            if (!createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onNavigationEvent())) {
                int i2 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onExtraCallback());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                fAccess000 = !(createCameraCaptureCallback.onExtraCallbackWithResult(iOnActivityResized, iAuthTabCallback.onExtraCallback()) ^ true) ? ((int) (launchuri.access000() >> 32)) - r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q.onWarmupCompleted() : r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q.onWarmupCompleted();
            }
            if (cCharValue == cCharValue2) {
                int i3 = onWarmupCompleted + 57;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                if (cCharValue2 == cCharValue3) {
                    int i6 = i4 + 117;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    canvas.drawText(String.valueOf(cCharValue2), fAccess000 + f, f2, paint);
                    return;
                }
            }
            float fAsInterface = ((r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q.asInterface() % 1.0f) + 1.0f) * f3;
            if (launchuri.IAuthTabCallback_Parcel()) {
                canvas.drawText(String.valueOf(cCharValue), fAccess000 + f, f2 - fAsInterface, paint);
            }
            float f4 = fAccess000 + f;
            canvas.drawText(String.valueOf(cCharValue2), f4, (f2 + f3) - fAsInterface, paint);
            if (!(!launchuri.IAuthTabCallback_Parcel())) {
                canvas.drawText(String.valueOf(cCharValue3), f4, (f2 + (f3 * 2.0f)) - fAsInterface, paint);
            }
        }
    }

    private static final Unit onNavigationEvent(launchUri launchuri, Paint paint, Paint paint2, setOrientationDegrees setorientationdegrees) {
        float fIntBitsToFloat;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fOnExtraCallback = (int) (launchuri.onExtraCallback() >> 32);
        float fOnExtraCallback2 = (int) launchuri.onExtraCallback();
        readShort readshortOnNavigationEvent = setorientationdegrees.onExtraCallback().onNavigationEvent();
        Canvas canvasOnExtraCallback = ExecutedBy.onExtraCallback(readshortOnNavigationEvent);
        ExecutedBy.onExtraCallback(readshortOnNavigationEvent).saveLayer(null, null);
        paint.setColor(ByteOrderedDataOutputStream.onNavigationEvent(launchuri.IAuthTabCallbackDefault().asInterface()));
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) launchUri.onNavigationEvent(-959916986, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{launchuri}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 959916994, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        long jLongValue = ((Long) launchUri.onNavigationEvent(-837041299, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{launchuri}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 837041311, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback())).longValue();
        if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jLongValue) == 0) {
            int i2 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                jLongValue = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(accessgetTlsVersionsAsStringp.Typography5.getSize())).IAuthTabCallback();
            }
        }
        paint.setTextSize(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(jLongValue));
        if (maybeHandleOnAttachedToWindow.onNavigationEvent(launchuri.IAuthTabCallbackDefault().onActivityResized())) {
            int i3 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            fIntBitsToFloat = Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) - ((int) (launchuri.access000() >> 32));
        } else {
            int i5 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            fIntBitsToFloat = 0.0f;
        }
        float f = fIntBitsToFloat;
        float fAscent = (fOnExtraCallback2 - (paint.ascent() + paint.descent())) / 2.0f;
        List<r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q> listOnWarmupCompleted = launchuri.onWarmupCompleted();
        int i7 = 0;
        for (int size = listOnWarmupCompleted.size(); i7 < size; size = size) {
            onExtraCallback(paint, launchuri, canvasOnExtraCallback, f, fAscent, fOnExtraCallback2, listOnWarmupCompleted.get(i7));
            i7++;
        }
        onWarmupCompleted(canvasOnExtraCallback, paint2, fOnExtraCallback, fOnExtraCallback2, Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) - fOnExtraCallback);
        List<r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q> listOnTransact = launchuri.onTransact();
        int size2 = listOnTransact.size();
        for (int i8 = 0; i8 < size2; i8++) {
            onExtraCallback(paint, launchuri, canvasOnExtraCallback, f, fAscent, fOnExtraCallback2, listOnTransact.get(i8));
        }
        canvasOnExtraCallback.restore();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final launchUri launchuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-703537409);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(launchuri) ? 4 : 2) | i;
        } else {
            int i8 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            i3 = i;
        }
        int i10 = i2 & 2;
        boolean z = true;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02))) {
                    int i11 = onExtraCallbackWithResult + 53;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            boolean z2 = false;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                quirksExternalSyntheticBackport03 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-703537409, i3, -1, "im.toss.tds.compose.component.anim.rollingnumber.BasicTdsRollingNumberV2 (TdsRollingNumberV2.kt:568)");
                }
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                int i13 = i3 & 14;
                boolean z3 = i13 == 4;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z3 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    GraphicDeviceInfo interfaceDescriptor = launchuri.IAuthTabCallbackDefault().getInterfaceDescriptor();
                    if (interfaceDescriptor == null) {
                        int i14 = onExtraCallbackWithResult + 29;
                        onWarmupCompleted = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                        interfaceDescriptor = (GraphicDeviceInfo) isRepeatingEnabled.IAuthTabCallback(new Object[]{isRepeatingEnabled.onExtraCallback}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1863337886, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1863337887);
                    }
                    objOnMinimized = response.toTypeface$default(response.Companion.IAuthTabCallback(interfaceDescriptor.IAuthTabCallbackStub()), context, null, 2, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                Typeface typeface = (Typeface) objOnMinimized;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(typeface);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnNavigationEvent) {
                    Object obj = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Paint paint = new Paint();
                        paint.setTypeface(typeface);
                        paint.setAntiAlias(true);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(paint);
                        obj = paint;
                    }
                    final Paint paint2 = (Paint) obj;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    Object obj2 = objOnMinimized3;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        Paint paint3 = new Paint();
                        paint3.setAntiAlias(true);
                        paint3.setDither(true);
                        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(paint3);
                        obj2 = paint3;
                    }
                    final Paint paint4 = (Paint) obj2;
                    boolean z4 = i13 == 4;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z4 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda0
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3) {
                                int i15 = 2 % 2;
                                int i16 = onExtraCallback + 61;
                                onWarmupCompleted = i16 % 128;
                                int i17 = i16 % 2;
                                Unit unitOnExtraCallback = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallback(launchuri, (useAndConfigureProgramWithTexture) obj3);
                                int i18 = onExtraCallback + 39;
                                onWarmupCompleted = i18 % 128;
                                int i19 = i18 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, false, (Function1) objOnMinimized4, 1, (Object) null);
                    if (i13 != 4) {
                        int i15 = onExtraCallbackWithResult + 109;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        z = false;
                    }
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!z) {
                        Object obj3 = objOnMinimized5;
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda1
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj4) {
                                    int i17 = 2 % 2;
                                    int i18 = IAuthTabCallback + 9;
                                    onExtraCallbackWithResult = i18 % 128;
                                    int i19 = i18 % 2;
                                    Rect rectOnExtraCallback = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onExtraCallback(launchuri, (setOrientationDegrees) obj4);
                                    if (i19 != 0) {
                                        int i20 = 61 / 0;
                                    }
                                    return rectOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                            obj3 = function1;
                        }
                        Function1 function12 = (Function1) obj3;
                        if (i13 == 4) {
                            int i17 = onWarmupCompleted + 3;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            z2 = true;
                        }
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(paint2);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(paint4);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback | z2 | zOnExtraCallback2)) {
                            int i19 = onWarmupCompleted + 93;
                            onExtraCallbackWithResult = i19 % 128;
                            if (i19 % 2 != 0) {
                                onwarmupcompleted.onExtraCallback();
                                throw null;
                            }
                            Object obj4 = objOnMinimized6;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                Function1 function13 = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda2
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj5) {
                                        int i20 = 2 % 2;
                                        int i21 = onExtraCallback + 91;
                                        onNavigationEvent = i21 % 128;
                                        Object obj6 = null;
                                        if (i21 % 2 != 0) {
                                            r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(launchuri, paint2, paint4, (setOrientationDegrees) obj5);
                                            throw null;
                                        }
                                        Unit unitIAuthTabCallback = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(launchuri, paint2, paint4, (setOrientationDegrees) obj5);
                                        int i22 = onNavigationEvent + 13;
                                        onExtraCallback = i22 % 128;
                                        if (i22 % 2 != 0) {
                                            return unitIAuthTabCallback;
                                        }
                                        obj6.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function13);
                                obj4 = function13;
                            }
                            r8lambdai7WmVnAmn3XXZO8_FBulw7m1l6I.onNavigationEvent(launchuri, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, null, function12, (Function1) obj4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i13, 4);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj5, Object obj6) {
                        int i20 = 2 % 2;
                        int i21 = onExtraCallbackWithResult + 101;
                        onExtraCallback = i21 % 128;
                        if (i21 % 2 != 0) {
                            return r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(launchuri, quirksExternalSyntheticBackport03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                        }
                        r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(launchuri, quirksExternalSyntheticBackport03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                        Object obj7 = null;
                        obj7.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        int i20 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i20 % 128;
        int i21 = i20 % 2;
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        boolean z22 = false;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void onWarmupCompleted(Canvas canvas, Paint paint, float f, float f2, float f3) {
        int i = 2 % 2;
        float f4 = f2 * 0.15f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(f3, 0.0f, f3, f4, -16777216, 0, tileMode));
        float f5 = f + f3;
        canvas.drawRect(f3, 0.0f, f5, f4, paint);
        float f6 = f2 - (0.25f * f2);
        paint.setShader(new LinearGradient(f3, f6, f3, f2, 0, -16777216, tileMode));
        canvas.drawRect(f3, f6, f5, f2, paint);
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1772735947);
        if (i != 0) {
            int i3 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1772735947, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.Preview (TdsRollingNumberV2.kt:713)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) AppLovinNativeAdImpl.onExtraCallback(700664520, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{AppLovinNativeAdImpl.onExtraCallbackWithResult}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -700664518), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda14
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 109;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnWarmupCompleted = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onWarmupCompleted(i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnWarmupCompleted;
                }
            });
            int i7 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static final Number onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Function1<String, Number> function1IAuthTabCallback = r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U.onExtraCallback.onExtraCallback().IAuthTabCallback();
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            return (Number) function1IAuthTabCallback.invoke((String) IAuthTabCallback(iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{getsupportedhighspeedresolutionsfor}, 1359915703, iOnNavigationEvent, -1359915703));
        }
        Function1<String, Number> function1IAuthTabCallback2 = r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U.onExtraCallback.onExtraCallback().IAuthTabCallback();
        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent5 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent6 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int i3 = 2 / 0;
        return (Number) function1IAuthTabCallback2.invoke((String) IAuthTabCallback(iOnNavigationEvent5, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent6, new Object[]{getsupportedhighspeedresolutionsfor}, 1359915703, iOnNavigationEvent4, -1359915703));
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jIEngagementSignalsCallbackStub;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1148443965);
        if (i != 0) {
            int i3 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1148443965, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.InputPreview (TdsRollingNumberV2.kt:811)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1148443965, i, -1, "im.toss.tds.compose.component.anim.rollingnumber.InputPreview (TdsRollingNumberV2.kt:811)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 39;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        Number numberOnNavigationEvent = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                        if (i8 != 0) {
                            int i9 = 95 / 0;
                        }
                        return numberOnNavigationEvent;
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            String str = (String) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, 1359915703, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1359915703);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 11;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onWarmupCompleted(getsupportedhighspeedresolutionsfor, (String) obj);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.onWarmupCompleted(getsupportedhighspeedresolutionsfor, (String) obj);
                        int i8 = onExtraCallbackWithResult + 49;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            setSurfaceProvider.onWarmupCompleted(str, (Function1) objOnMinimized3, (QuirksExternalSyntheticBackport0) null, false, false, (getHumanReadableName) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (getMergedResolutions) null, (CameraUnavailableException) null, (CameraState) null, false, 0, 0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (toMetersPerSecond) null, (PreviewExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0, 1048572);
            IAuthTabCallback((String) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, 1359915703, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1359915703), null, null, 0L, 0L, 0L, null, 0.0f, null, null, 0L, null, null, null, null, 0L, null, 0L, false, false, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 0, 4194302);
            Object objOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends Number>) cameraPresenceProviderExternalSyntheticLambda6);
            Object obj = objOnNavigationEvent == null ? 0 : objOnNavigationEvent;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1633500557);
                jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1633501485);
                jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{obj, null, null, Long.valueOf(getMaxAdCount.onNavigationEvent(jIEngagementSignalsCallbackStub, 0.6f)), 0L, 0L, null, Float.valueOf(0.0f), null, null, 0L, null, null, null, "앞", 0L, "뒤", 0L, false, false, false, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1597440, 0, 4112374}, 1952929193, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1952929184);
            onExtraCallbackWithResult(r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onNavigationEvent(0, false, null, null, null, 0L, 0L, 0L, null, 0.0f, null, null, 0L, null, null, false, null, cameraCaptureResultEmptyCameraCaptureResult2, 6, 0, 131070), null, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 14);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Kt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 25;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr = {Integer.valueOf(i9), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                    Unit unit = (Unit) r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -276762863, iOnNavigationEvent, 276762875);
                    int i10 = onExtraCallbackWithResult + 125;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            });
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Number onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends Number> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return number;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 583114798, iOnNavigationEvent, -583114796);
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{useandconfigureprogramwithtexture}, 1714691438, iOnNavigationEvent, -1714691430);
    }

    public static /* synthetic */ Unit onExtraCallback(launchUri launchuri, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {launchuri, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 408106390, iOnNavigationEvent, -408106386);
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -276762863, iOnNavigationEvent, 276762875);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 1878194390, iOnNavigationEvent, -1878194385);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -959766615, iOnNavigationEvent, 959766618);
    }

    private static final boolean onNavigationEvent(Function2 function2) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return ((Boolean) IAuthTabCallback(iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{function2}, 1538860369, iOnNavigationEvent, -1538860362)).booleanValue();
    }

    private static final String onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (String) IAuthTabCallback(iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{getsupportedhighspeedresolutionsfor}, 1359915703, iOnNavigationEvent, -1359915703);
    }

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -4179741, iOnNavigationEvent, 4179754);
    }

    private static final Unit onExtraCallbackWithResult(launchUri launchuri, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {launchuri, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 1619959559, iOnNavigationEvent, -1619959558);
    }

    private static final Unit onNavigationEvent(launchUri launchuri, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {launchuri, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 439317291, iOnNavigationEvent, -439317280);
    }

    private static final Unit onWarmupCompleted(launchUri launchuri, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {launchuri, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 1063341240, iOnNavigationEvent, -1063341230);
    }

    private static final Unit onWarmupCompleted(int i, getStreamSharingChildren getstreamsharingchildren, int i2, getStreamSharingChildren getstreamsharingchildren2, int i3, getStreamSharingChildren getstreamsharingchildren3, int i4, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Object[] objArr = {Integer.valueOf(i), getstreamsharingchildren, Integer.valueOf(i2), getstreamsharingchildren2, Integer.valueOf(i3), getstreamsharingchildren3, Integer.valueOf(i4), onextracallbackwithresult};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -610104936, iOnNavigationEvent, 610104942);
    }

    public static final void onExtraCallback(@NotNull Number number, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, @Nullable r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str, long j5, @Nullable String str2, long j6, boolean z, boolean z2, boolean z3, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3, int i4) {
        Object[] objArr = {number, quirksExternalSyntheticBackport0, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), createcameracapturecallback, Float.valueOf(f), bindchildren, useVar, Long.valueOf(j4), graphicDeviceInfo, onextracallback, onextracallbackwithresult, str, Long.valueOf(j5), str2, Long.valueOf(j6), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), obj, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 1952929193, iOnNavigationEvent, -1952929184);
    }
}
