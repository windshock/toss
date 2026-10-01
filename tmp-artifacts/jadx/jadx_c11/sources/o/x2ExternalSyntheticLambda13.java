package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.compose.component.compound.result.TdsResultV1Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.deprecated_followRedirects;
import o.getPrivacyDestinationUri;
import o.initSDK;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda1;
import o.x2ExternalSyntheticLambda13;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda13 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        Function2 function2 = (Function2) objArr[4];
        Function2 function22 = (Function2) objArr[5];
        Function2 function23 = (Function2) objArr[6];
        Function2 function24 = (Function2) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, jLongValue, fFloatValue, function2, function22, function23, function24, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, jLongValue, fFloatValue, function2, function22, function23, function24, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallback + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, Function2 function23, Function2 function24, long j, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function22, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function23, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function24, j, f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 65;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(str, iIntValue, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onExtraCallback(str, iIntValue, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(deprecated_followRedirects deprecated_followredirects, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {deprecated_followredirects, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1332936669, objArr, 1332936669, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
        int i5 = onExtraCallback + 3;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, long j, deprecated_followRedirects deprecated_followredirects, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(onextracallbackwithresult, j, deprecated_followredirects, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(onextracallbackwithresult, j, deprecated_followredirects, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, setCallToAction.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallback onextracallback, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(str, onwarmupcompleted, onextracallback, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(str, onwarmupcompleted, onextracallback, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, Function2 function2, Function2 function22, Function2 function23, Function2 function24, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 91;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1298608092, new Object[]{quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), function2, function22, function23, function24, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1298608088, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | (~(i9 | i3));
        int i11 = ~i3;
        int i12 = i10 | (~(i11 | i4 | i5));
        int i13 = i4 | i5;
        int i14 = i11 | i13;
        int i15 = (~(i3 | i4)) | (~i13);
        int i16 = i4 + i5 + i6 + (1068639271 * i) + ((-1919980423) * i2);
        int i17 = i16 * i16;
        int i18 = (i4 * 982247175) + 1844138806 + (i5 * 982247175) + (i12 * (-762)) + (i14 * (-762)) + (i15 * 762) + (982246413 * i6) + (1533776379 * i) + (1016546853 * i2) + (i17 * (-1070530560));
        switch (((i4 * 1648758371) - 594280448) + (1648758371 * i5) + (i12 * (-226102882)) + ((-226102882) * i14) + (226102882 * i15) + (1422655488 * i6) + ((-1693188096) * i) + (611057664 * i2) + ((-810221568) * i17) + (i18 * i18 * 1708326912)) {
            case 1:
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
                Function2 function2 = (Function2) objArr[1];
                Function2 function22 = (Function2) objArr[2];
                Function2 function23 = (Function2) objArr[3];
                Function2 function24 = (Function2) objArr[4];
                long jLongValue = ((Number) objArr[5]).longValue();
                float fFloatValue = ((Number) objArr[6]).floatValue();
                int iIntValue = ((Number) objArr[7]).intValue();
                int iIntValue2 = ((Number) objArr[8]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
                int iIntValue3 = ((Number) objArr[10]).intValue();
                int i19 = 2 % 2;
                int i20 = IAuthTabCallback + 15;
                onExtraCallback = i20 % 128;
                int i21 = i20 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, function2, function22, function23, function24, jLongValue, fFloatValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
                int i22 = onExtraCallback + 95;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                return unitIAuthTabCallback;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                Function2 function25 = (Function2) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int i24 = 2 % 2;
                int i25 = IAuthTabCallback + 93;
                onExtraCallback = i25 % 128;
                int i26 = i25 % 2;
                Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function25, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue4);
                int i27 = onExtraCallback + 93;
                IAuthTabCallback = i27 % 128;
                int i28 = i27 % 2;
                return unitIAuthTabCallbackStub;
            case 4:
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[0];
                final long jLongValue2 = ((Number) objArr[1]).longValue();
                final float fFloatValue2 = ((Number) objArr[2]).floatValue();
                final Function2 function26 = (Function2) objArr[3];
                final Function2 function27 = (Function2) objArr[4];
                final Function2 function28 = (Function2) objArr[5];
                final Function2 function29 = (Function2) objArr[6];
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[8];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
                int iIntValue5 = ((Number) objArr[10]).intValue();
                int i29 = 2 % 2;
                Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport03, "");
                if ((iIntValue5 & 48) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(quirksExternalSyntheticBackport03)) {
                        int i30 = onExtraCallback;
                        int i31 = i30 + 89;
                        IAuthTabCallback = i31 % 128;
                        int i32 = i31 % 2;
                        int i33 = i30 + 71;
                        IAuthTabCallback = i33 % 128;
                        int i34 = i33 % 2;
                        i7 = 32;
                    } else {
                        i7 = 16;
                    }
                    iIntValue5 |= i7;
                    int i35 = onExtraCallback + 75;
                    IAuthTabCallback = i35 % 128;
                    int i36 = i35 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((iIntValue5 & 145) != 144, iIntValue5 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i37 = IAuthTabCallback + 103;
                        onExtraCallback = i37 % 128;
                        int i38 = i37 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1227880434, iIntValue5, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous> (TdsResultV1.kt:157)");
                    }
                    putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.extraCallbackWithResult(), null, null, ForwardingCameraControl.onExtraCallback(-843946417, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda8
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i39 = 2 % 2;
                            int i40 = onExtraCallbackWithResult + 125;
                            IAuthTabCallback = i40 % 128;
                            if (i40 % 2 == 0) {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                                long j = jLongValue2;
                                float f = fFloatValue2;
                                int iIntValue6 = ((Integer) obj2).intValue();
                                Object[] objArr2 = {quirksExternalSyntheticBackport04, quirksExternalSyntheticBackport05, Long.valueOf(j), Float.valueOf(f), function26, function27, function28, function29, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue6)};
                                return (Unit) x2ExternalSyntheticLambda13.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -79333517, objArr2, 79333519, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport02;
                            long j2 = jLongValue2;
                            float f2 = fFloatValue2;
                            int iIntValue7 = ((Integer) obj2).intValue();
                            Object[] objArr3 = {quirksExternalSyntheticBackport06, quirksExternalSyntheticBackport07, Long.valueOf(j2), Float.valueOf(f2), function26, function27, function28, function29, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue7)};
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult3, 54), cameraCaptureResultEmptyCameraCaptureResult3, 3078, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                    int i39 = IAuthTabCallback + 117;
                    onExtraCallback = i39 % 128;
                    int i40 = i39 % 2;
                }
                return Unit.INSTANCE;
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return onNavigationEvent(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 69;
        onExtraCallback = i4 % 128;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 5;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i4 == 0) {
            unit = (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -1621501550, objArr, 1621501556, iOnNavigationEvent2);
            int i5 = 74 / 0;
        } else {
            unit = (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -1621501550, objArr, 1621501556, iOnNavigationEvent2);
        }
        int i6 = IAuthTabCallback + 75;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            asBinder(str, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAsBinder = asBinder(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, setCallToAction.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallback onextracallback, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(str, onwarmupcompleted, onextracallback, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(str, onwarmupcompleted, onextracallback, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, long j, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onextracallbackwithresult, j, str, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 75;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, @Nullable getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, long j2, @Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable Function0<Unit> function0, @Nullable String str4, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        String str5;
        float f2;
        final Function0<Unit> function02;
        long j3;
        final setCallToAction.onWarmupCompleted onwarmupcompleted2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy;
        Function2 function2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 59;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (i4 & 1) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        long jIAuthTabCallbackDefault = (i4 & 2) != 0 ? setByteOrder.Companion.IAuthTabCallbackDefault() : j;
        float fOnNavigationEvent = (i4 & 4) != 0 ? x2ExternalSyntheticLambda15.onExtraCallback.onNavigationEvent() : f;
        getPrivacyDestinationUri.onExtraCallbackWithResult c0021onExtraCallbackWithResult = (i4 & 8) != 0 ? new getPrivacyDestinationUri.onExtraCallbackWithResult.C0021onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), RectangleShapeKt.onExtraCallback(), (DefaultConstructorMarker) null) : onextracallbackwithresult;
        long jIAuthTabCallbackDefault2 = (i4 & 16) != 0 ? setByteOrder.Companion.IAuthTabCallbackDefault() : j2;
        final String str6 = (i4 & 32) != 0 ? null : str;
        if ((i4 & 64) != 0) {
            str5 = null;
        } else {
            int i8 = onExtraCallback + 85;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            str5 = str2;
        }
        int i10 = (i4 & 128) != 0 ? 1 : i;
        final String str7 = (i4 & 256) != 0 ? null : str3;
        if ((i4 & 512) != 0) {
            int i11 = IAuthTabCallback + 33;
            f2 = fOnNavigationEvent;
            onExtraCallback = i11 % 128;
            function02 = null;
            if (i11 % 2 == 0) {
                throw null;
            }
        } else {
            f2 = fOnNavigationEvent;
            function02 = function0;
        }
        final String str8 = (i4 & 1024) != 0 ? null : str4;
        if ((i4 & 2048) != 0) {
            int i12 = onExtraCallback + 75;
            j3 = jIAuthTabCallbackDefault;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            onwarmupcompleted2 = setCallToAction.onWarmupCompleted.Primary;
        } else {
            j3 = jIAuthTabCallbackDefault;
            onwarmupcompleted2 = onwarmupcompleted;
        }
        final setCallToAction.onExtraCallback onextracallback2 = (i4 & 4096) != 0 ? setCallToAction.onExtraCallback.Fill : onextracallback;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i14 = IAuthTabCallback + 91;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2094420352, i2, i3, "im.toss.tds.compose.component.compound.result.TdsResultV1 (TdsResultV1.kt:68)");
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        }
        if (str5 == null) {
            int i16 = IAuthTabCallback + 99;
            onExtraCallback = i16 % 128;
            int i17 = i16 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1886024051);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1886024050);
            final getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult2 = c0021onExtraCallbackWithResult;
            final long j4 = jIAuthTabCallbackDefault2;
            final String str9 = str5;
            final int i18 = i10;
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1713893507, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallback + 33;
                    IAuthTabCallback = i20 % 128;
                    if (i20 % 2 == 0) {
                        x2ExternalSyntheticLambda13.onWarmupCompleted(onextracallbackwithresult2, j4, str9, i18, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda13.onWarmupCompleted(onextracallbackwithresult2, j4, str9, i18, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i21 = onExtraCallback + 45;
                    IAuthTabCallback = i21 % 128;
                    int i22 = i21 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (str6 == null) {
            int i19 = IAuthTabCallback + 37;
            onExtraCallback = i19 % 128;
            if (i19 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885667613);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885667613);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxy = null;
            function2 = null;
        } else {
            encoderProfilesProxyVideoProfileProxy = null;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885667612);
            Function2 function2OnExtraCallback = ForwardingCameraControl.onExtraCallback(-628927228, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda11
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i20 = 2 % 2;
                    int i21 = onNavigationEvent + 21;
                    onExtraCallback = i21 % 128;
                    if (i21 % 2 == 0) {
                        Object[] objArr = {str6, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        throw null;
                    }
                    Object[] objArr2 = {str6, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    Unit unit = (Unit) x2ExternalSyntheticLambda13.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 2128739841, objArr2, -2128739834, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                    int i22 = onExtraCallback + 13;
                    onNavigationEvent = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 22 / 0;
                    }
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            function2 = function2OnExtraCallback;
        }
        if (str7 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885603133);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = encoderProfilesProxyVideoProfileProxy;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885603132);
            encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-208245429, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda12
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted + 1;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    Unit unitOnNavigationEvent = x2ExternalSyntheticLambda13.onNavigationEvent(str7, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i23 = onNavigationEvent + 1;
                    onWarmupCompleted = i23 % 128;
                    int i24 = i23 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (str8 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885535863);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = encoderProfilesProxyVideoProfileProxy;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1885535862);
            encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(-357894862, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda13
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted + 111;
                    onNavigationEvent = i21 % 128;
                    if (i21 % 2 == 0) {
                        x2ExternalSyntheticLambda13.onWarmupCompleted(str8, onwarmupcompleted2, onextracallback2, function02, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda13.onWarmupCompleted(str8, onwarmupcompleted2, onextracallback2, function02, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i22 = onNavigationEvent + 15;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        int i20 = i2 << 12;
        onWarmupCompleted(quirksExternalSyntheticBackport02, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback3, j3, f2, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 14) | (i20 & 458752) | (3670016 & i20), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i21 = onExtraCallback + 33;
            IAuthTabCallback = i21 % 128;
            int i22 = i21 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, int i, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i2 & 44) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    int i6 = onExtraCallback + 57;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i2 |= i3;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i2 & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 49;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2123228791, i2, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous>.<anonymous> (TdsResultV1.kt:79)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2123228791, i2, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous>.<anonymous> (TdsResultV1.kt:79)");
                int i9 = onExtraCallback + 25;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }
            appLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(str, null, i, 0.0f, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 21) & 29360128, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, long j, final String str, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i4 % 2 == 0 ? (i2 & 3) != 2 : (i2 & 5) != 3, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1713893507, i2, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:75)");
            }
            setIconUri.IAuthTabCallback(onextracallbackwithresult, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, j, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(2123228791, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda17
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 97;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    String str2 = str;
                    int i8 = i;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr = {str2, Integer.valueOf(i8), (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) x2ExternalSyntheticLambda13.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1076119462, objArr, -1076119457, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                    int i9 = onExtraCallback + 77;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 118);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onExtraCallback + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 5) == 2) {
            z = false;
        } else {
            int i5 = i3 + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onExtraCallback + 119;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-628927228, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:86)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 31;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onExtraCallback + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-208245429, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:87)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i6 == 0) {
                    int i7 = 45 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 77;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(String str, setCallToAction.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallback onextracallback, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-357894862, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:90)");
            }
            setAdvertiser.onExtraCallbackWithResult(str, null, null, onwarmupcompleted, onextracallback, null, null, null, function0, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 1766);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 77;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 12 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallback + 57;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, @Nullable getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, long j2, @Nullable String str, @Nullable deprecated_followRedirects deprecated_followredirects, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable String str3, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jIAuthTabCallbackDefault;
        final String str4;
        float f2;
        final Function0<Unit> function02;
        long j3;
        final setCallToAction.onWarmupCompleted onwarmupcompleted2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback4;
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = onExtraCallback + 47;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 2) != 0) {
            int i7 = onExtraCallback + 119;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                setByteOrder.Companion.IAuthTabCallbackDefault();
                throw null;
            }
            jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
        } else {
            jIAuthTabCallbackDefault = j;
        }
        float fOnNavigationEvent = (i3 & 4) != 0 ? x2ExternalSyntheticLambda15.onExtraCallback.onNavigationEvent() : f;
        final getPrivacyDestinationUri.onExtraCallbackWithResult c0021onExtraCallbackWithResult = (i3 & 8) != 0 ? new getPrivacyDestinationUri.onExtraCallbackWithResult.C0021onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), RectangleShapeKt.onExtraCallback(), (DefaultConstructorMarker) null) : onextracallbackwithresult;
        final long jIAuthTabCallbackDefault2 = (i3 & 16) != 0 ? setByteOrder.Companion.IAuthTabCallbackDefault() : j2;
        final String str5 = (i3 & 32) != 0 ? null : str;
        final deprecated_followRedirects deprecated_followredirects2 = (i3 & 64) != 0 ? null : deprecated_followredirects;
        if ((i3 & 128) != 0) {
            int i8 = onExtraCallback + 117;
            IAuthTabCallback = i8 % 128;
            str4 = null;
            if (i8 % 2 != 0) {
                throw null;
            }
        } else {
            str4 = str2;
        }
        if ((i3 & 256) != 0) {
            int i9 = onExtraCallback + 29;
            f2 = fOnNavigationEvent;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            function02 = null;
        } else {
            f2 = fOnNavigationEvent;
            function02 = function0;
        }
        final String str6 = (i3 & 512) != 0 ? null : str3;
        if ((i3 & 1024) != 0) {
            int i11 = IAuthTabCallback + 37;
            j3 = jIAuthTabCallbackDefault;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            onwarmupcompleted2 = setCallToAction.onWarmupCompleted.Primary;
        } else {
            j3 = jIAuthTabCallbackDefault;
            onwarmupcompleted2 = onwarmupcompleted;
        }
        final setCallToAction.onExtraCallback onextracallback2 = (i3 & 2048) != 0 ? setCallToAction.onExtraCallback.Fill : onextracallback;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = onExtraCallback + 1;
            IAuthTabCallback = i13 % 128;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            if (i13 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1328235822, i, i2, "im.toss.tds.compose.component.compound.result.TdsResultV1 (TdsResultV1.kt:116)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1328235822, i, i2, "im.toss.tds.compose.component.compound.result.TdsResultV1 (TdsResultV1.kt:116)");
        } else {
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        if (deprecated_followredirects2 == null) {
            int i14 = IAuthTabCallback + 99;
            onExtraCallback = i14 % 128;
            if (i14 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59583542);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59583542);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59583541);
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1190184352, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onNavigationEvent + 15;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnExtraCallback = x2ExternalSyntheticLambda13.onExtraCallback(c0021onExtraCallbackWithResult, jIAuthTabCallbackDefault2, deprecated_followredirects2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onExtraCallbackWithResult + 1;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (str5 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59329931);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59329930);
            encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1863911246, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i15 = 2 % 2;
                    int i16 = onWarmupCompleted + 119;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 != 0) {
                        x2ExternalSyntheticLambda13.onWarmupCompleted(str5, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda13.onWarmupCompleted(str5, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i17 = onNavigationEvent + 35;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (str4 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59265451);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59265450);
            encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(-1860010055, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i15 = 2 % 2;
                    int i16 = IAuthTabCallback + 53;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda13.onExtraCallbackWithResult(str4, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onExtraCallback + 43;
                    IAuthTabCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 92 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (str6 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59198181);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            encoderProfilesProxyVideoProfileProxyOnExtraCallback4 = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-59198180);
            encoderProfilesProxyVideoProfileProxyOnExtraCallback4 = ForwardingCameraControl.onExtraCallback(238370400, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    int i15 = 2 % 2;
                    int i16 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda13.onExtraCallbackWithResult(str6, onwarmupcompleted2, onextracallback2, function02, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onExtraCallbackWithResult + 95;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        int i15 = i << 12;
        onWarmupCompleted(quirksExternalSyntheticBackport03, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback3, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback4, j3, f2, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | (i15 & 458752) | (3670016 & i15), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i16 = IAuthTabCallback + 121;
            onExtraCallback = i16 % 128;
            if (i16 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((iIntValue & 6) == 0) {
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 109;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1497095514, iIntValue, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous>.<anonymous> (TdsResultV1.kt:127)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1497095514, iIntValue, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous>.<anonymous> (TdsResultV1.kt:127)");
            }
            AppLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 285911272, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{appLovinNativeAdImplExternalSyntheticLambda1, deprecated_followredirects, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue << 18) & 3670016), 62}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -285911271, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onExtraCallback + 59;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, long j, final deprecated_followRedirects deprecated_followredirects, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 41;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 3) != 2, i & 1)) {
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1190184352, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:123)");
            }
            setIconUri.IAuthTabCallback(onextracallbackwithresult, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, j, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1497095514, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda14
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 107;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    deprecated_followRedirects deprecated_followredirects2 = deprecated_followredirects;
                    AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) obj2;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (i7 != 0) {
                        return x2ExternalSyntheticLambda13.onExtraCallback(deprecated_followredirects2, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    }
                    x2ExternalSyntheticLambda13.onExtraCallback(deprecated_followredirects2, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 118);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 109;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 83;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i3 = IAuthTabCallback + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = IAuthTabCallback + 67;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1863911246, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:131)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallback + 13;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = IAuthTabCallback + 35;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 34 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1860010055, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:132)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = onExtraCallback + 21;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 / 2;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 33;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(String str, setCallToAction.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallback onextracallback, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i4 + 87;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 109;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(238370400, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:135)");
                    int i9 = 67 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(238370400, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:135)");
                }
            }
            setAdvertiser.onExtraCallbackWithResult(str, null, null, onwarmupcompleted, onextracallback, null, null, null, function0, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 1766);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-433772316, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsResultV1.kt:174)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 15;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = IAuthTabCallback + 117;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 41;
            onExtraCallback = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2047312181, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsResultV1.kt:185)");
                int i4 = IAuthTabCallback + 3;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            PreviewExternalSyntheticLambda3.IAuthTabCallback(getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), x2ExternalSyntheticLambda15.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, createCameraCaptureCallback.Companion.IAuthTabCallback(), 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16744442, (Object) null), function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = IAuthTabCallback + 103;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 87;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onExtraCallback + 3;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(98798124, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsResultV1.kt:197)");
            }
            PreviewExternalSyntheticLambda3.IAuthTabCallback(getHumanReadableName.onNavigationEvent((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), x2ExternalSyntheticLambda15.onExtraCallback.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.asBinder(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, createCameraCaptureCallback.Companion.IAuthTabCallback(), 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16744442, (Object) null), function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z = false;
        Function2 function2 = (Function2) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = IAuthTabCallback + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(908167760, iIntValue, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsResultV1.kt:213)");
            }
            setPostviewFormatSelector.onNavigationEvent(setAdvertiser.onExtraCallback().onExtraCallback(new setCallToAction.onExtraCallbackWithResult(null, setCallToAction.onExtraCallback.Fill, setCallToAction.IAuthTabCallback.Companion.IAuthTabCallback(), null, 9, null)), function2, cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onExtraCallback + 5;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, long j, float f, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = IAuthTabCallback + 123;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-843946417, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1.<anonymous>.<anonymous> (TdsResultV1.kt:158)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport02), j, (toMetersPerSecond) null, 2, (Object) null), f, 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i5 = onExtraCallback + 81;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = onExtraCallback + 87;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
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
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = onextracallbackwithresult.onTransact();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f));
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            if (function2 == null) {
                int i9 = onExtraCallback + 101;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-350173322);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-350173322);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-350173321);
                putBooleanArray.IAuthTabCallback(x2ExternalSyntheticLambda1.onNavigationEvent.Figure, ForwardingCameraControl.onExtraCallback(-433772316, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda4
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        Unit unitOnExtraCallback;
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 117;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 != 0) {
                            unitOnExtraCallback = x2ExternalSyntheticLambda13.onExtraCallback(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i12 = 88 / 0;
                        } else {
                            unitOnExtraCallback = x2ExternalSyntheticLambda13.onExtraCallback(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        int i13 = onNavigationEvent + 69;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
                Unit unit = Unit.INSTANCE;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (function22 == null && function23 == null) {
                int i10 = IAuthTabCallback + 97;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-348276617);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-349907434);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 54);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i12 = IAuthTabCallback + 47;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                if (function22 == null) {
                    int i14 = IAuthTabCallback + 119;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1414908196);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1414908196);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1414908197);
                    putBooleanArray.IAuthTabCallback(x2ExternalSyntheticLambda1.onNavigationEvent.Title, ForwardingCameraControl.onExtraCallback(2047312181, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i15 = 2 % 2;
                            int i16 = IAuthTabCallback + 83;
                            onWarmupCompleted = i16 % 128;
                            int i17 = i16 % 2;
                            Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda13.onExtraCallbackWithResult(function22, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i18 = onWarmupCompleted + 27;
                            IAuthTabCallback = i18 % 128;
                            if (i18 % 2 == 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
                    Unit unit2 = Unit.INSTANCE;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (function23 == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1415583004);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1415583005);
                    putBooleanArray.IAuthTabCallback(x2ExternalSyntheticLambda1.onNavigationEvent.Subtitle, ForwardingCameraControl.onExtraCallback(98798124, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda6
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i15 = 2 % 2;
                            int i16 = onExtraCallbackWithResult + 47;
                            onExtraCallback = i16 % 128;
                            int i17 = i16 % 2;
                            Function2 function25 = function23;
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                            if (i17 != 0) {
                                Object[] objArr = {function25, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((Integer) obj4).intValue())};
                                return (Unit) x2ExternalSyntheticLambda13.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1863471095, objArr, -1863471092, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                            }
                            Object[] objArr2 = {function25, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((Integer) obj4).intValue())};
                            int i18 = 35 / 0;
                            return (Unit) x2ExternalSyntheticLambda13.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1863471095, objArr2, -1863471092, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
                    Unit unit3 = Unit.INSTANCE;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (function24 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-348217469);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                putBooleanArray.IAuthTabCallback(x2ExternalSyntheticLambda1.onNavigationEvent.Button, ForwardingCameraControl.onExtraCallback(908167760, true, new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i15 = 2 % 2;
                        int i16 = onNavigationEvent + 7;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        Unit unitOnNavigationEvent = x2ExternalSyntheticLambda13.onNavigationEvent(function24, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i18 = onNavigationEvent + 59;
                        IAuthTabCallback = i18 % 128;
                        if (i18 % 2 != 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-347675465);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24, long j, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function25;
        int i4;
        int i5;
        int i6;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function26;
        int i7;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function27;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        float f2;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function28;
        final long jIAuthTabCallbackDefault;
        final float f3;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function29;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function210;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i12 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1191213849);
        int i13 = i2 & 1;
        if (i13 != 0) {
            int i14 = onExtraCallback + 77;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function25 = function2;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function25) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                int i17 = onExtraCallback + 99;
                IAuthTabCallback = i17 % 128;
                if (i17 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22);
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
                    int i18 = IAuthTabCallback + 101;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 == 0) {
                int i20 = IAuthTabCallback + 121;
                onExtraCallback = i20 % 128;
                i3 = i20 % 2 == 0 ? i3 | 602 : i3 | 3072;
            } else {
                if ((i & 3072) == 0) {
                    function26 = function23;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function26) ? 2048 : 1024;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function27 = function24;
                        i8 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function27) ? 8192 : 16384) | i3;
                    }
                    i9 = i2 & 32;
                    if (i9 == 0) {
                        i8 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                            int i21 = onExtraCallback + 109;
                            IAuthTabCallback = i21 % 128;
                            int i22 = i21 % 2;
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i8 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        z = false;
                        if ((i & 1572864) == 0) {
                            f2 = f;
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 1048576 : 524288;
                        }
                        if ((599187 & i8) != 599186) {
                            int i23 = onExtraCallback + 107;
                            IAuthTabCallback = i23 % 128;
                            int i24 = i23 % 2;
                            z = true;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i8 & 1)) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            if (i16 != 0) {
                                int i25 = onExtraCallback + 95;
                                IAuthTabCallback = i25 % 128;
                                int i26 = i25 % 2;
                                function25 = null;
                            }
                            function28 = i4 != 0 ? null : function22;
                            if (i6 != 0) {
                                function26 = null;
                            }
                            if (i7 != 0) {
                                function27 = null;
                            }
                            if (i9 != 0) {
                                int i27 = IAuthTabCallback + 27;
                                onExtraCallback = i27 % 128;
                                int i28 = i27 % 2;
                                jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
                            } else {
                                jIAuthTabCallbackDefault = j;
                            }
                            float fOnNavigationEvent = i11 != 0 ? x2ExternalSyntheticLambda15.onExtraCallback.onNavigationEvent() : f2;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i29 = IAuthTabCallback + 71;
                                onExtraCallback = i29 % 128;
                                if (i29 % 2 == 0) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1191213849, i8, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1 (TdsResultV1.kt:155)");
                                    throw null;
                                }
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1191213849, i8, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1 (TdsResultV1.kt:155)");
                            }
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                            final long j2 = jIAuthTabCallbackDefault;
                            final float f4 = fOnNavigationEvent;
                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function211 = function25;
                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function212 = function28;
                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function213 = function26;
                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function214 = function27;
                            setThreadList.IAuthTabCallback(IOOMCallback.Result, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(1227880434, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda15
                                private static int onExtraCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    int i30 = 2 % 2;
                                    int i31 = onWarmupCompleted + 111;
                                    onExtraCallback = i31 % 128;
                                    int i32 = i31 % 2;
                                    Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda13.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, j2, f4, function211, function212, function213, function214, (initSDK) obj, (QuirksExternalSyntheticBackport0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    int i33 = onExtraCallback + 13;
                                    onWarmupCompleted = i33 % 128;
                                    if (i33 % 2 == 0) {
                                        return unitOnExtraCallbackWithResult;
                                    }
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 30);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            f3 = fOnNavigationEvent;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            function29 = function25;
                            function210 = function26;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            function28 = function22;
                            jIAuthTabCallbackDefault = j;
                            f3 = f2;
                            function29 = function25;
                            function210 = function26;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function215 = function28;
                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function216 = function27;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.result.TdsResultV1Kt$$ExternalSyntheticLambda16
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i30 = 2 % 2;
                                    int i31 = IAuthTabCallback + 69;
                                    onWarmupCompleted = i31 % 128;
                                    int i32 = i31 % 2;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                                    Function2 function217 = function29;
                                    Function2 function218 = function215;
                                    Function2 function219 = function210;
                                    Function2 function220 = function216;
                                    long j3 = jIAuthTabCallbackDefault;
                                    float f5 = f3;
                                    int i33 = i;
                                    int i34 = i2;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    Object[] objArr = {quirksExternalSyntheticBackport05, function217, function218, function219, function220, Long.valueOf(j3), Float.valueOf(f5), Integer.valueOf(i33), Integer.valueOf(i34), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                                    Unit unit = (Unit) x2ExternalSyntheticLambda13.onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1165544084, objArr, -1165544083, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                                    int i35 = onWarmupCompleted + 21;
                                    IAuthTabCallback = i35 % 128;
                                    int i36 = i35 % 2;
                                    return unit;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    int i30 = onExtraCallback + 55;
                    IAuthTabCallback = i30 % 128;
                    if (i30 % 2 != 0) {
                        i8 |= 1572864;
                        z = false;
                        int i31 = 23 / 0;
                    } else {
                        z = false;
                        i8 |= 1572864;
                    }
                    f2 = f;
                    if ((599187 & i8) != 599186) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i8 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                function27 = function24;
                i8 = i3;
                i9 = i2 & 32;
                if (i9 == 0) {
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                }
                f2 = f;
                if ((599187 & i8) != 599186) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i8 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            function26 = function23;
            i7 = i2 & 16;
            if (i7 != 0) {
            }
            function27 = function24;
            i8 = i3;
            i9 = i2 & 32;
            if (i9 == 0) {
            }
            i11 = i2 & 64;
            if (i11 != 0) {
            }
            f2 = f;
            if ((599187 & i8) != 599186) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i8 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        function25 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        function26 = function23;
        i7 = i2 & 16;
        if (i7 != 0) {
        }
        function27 = function24;
        i8 = i3;
        i9 = i2 & 32;
        if (i9 == 0) {
        }
        i11 = i2 & 64;
        if (i11 != 0) {
        }
        f2 = f;
        if ((599187 & i8) != 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i8 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1859298292);
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1859298292);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 99;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1859298292, i, -1, "im.toss.tds.compose.component.compound.result.Preview (TdsResultV1.kt:230)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1859298292, i, -1, "im.toss.tds.compose.component.compound.result.Preview (TdsResultV1.kt:230)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) x2ExternalSyntheticLambda11.onExtraCallback.asInterface(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsResultV1Kt$.ExternalSyntheticLambda9(i));
            int i5 = IAuthTabCallback + 87;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = IAuthTabCallback + 29;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 2128739841, objArr, -2128739834, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, int i, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1076119462, objArr, -1076119457, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1863471095, objArr, -1863471092, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, Function2 function23, Function2 function24, long j, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, function2, function22, function23, function24, Long.valueOf(j), Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1165544084, objArr, -1165544083, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, long j, float f, Function2 function2, Function2 function22, Function2 function23, Function2 function24, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, Long.valueOf(j), Float.valueOf(f), function2, function22, function23, function24, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -79333517, objArr, 79333519, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, Function2 function2, Function2 function22, Function2 function23, Function2 function24, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), function2, function22, function23, function24, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1298608092, objArr, -1298608088, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onTransact(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1621501550, objArr, 1621501556, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(deprecated_followRedirects deprecated_followredirects, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {deprecated_followredirects, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1332936669, objArr, 1332936669, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }
}
