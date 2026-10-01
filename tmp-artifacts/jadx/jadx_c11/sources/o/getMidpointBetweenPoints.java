package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.tmoney.a;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.tds.compose.component.atom.post.TdsPostV2Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getDistanceBetweenPoints;
import o.getHumanReadableName;
import o.getMidpointBetweenPoints;
import o.initSDK;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMidpointBetweenPoints {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return access100(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        access100(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 41;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, getHumanReadableName gethumanreadablename, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, j, j2, graphicDeviceInfo, gethumanreadablename, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 33;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 50 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    private static final Unit IAuthTabCallbackStubProxy(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        asBinder(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 95;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit access100(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1046168603, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i))}, -1046168597);
        } else {
            onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1046168603, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, -1046168597);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 119;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 14 / 0;
        }
        return unit;
    }

    private static final Unit getInterfaceDescriptor(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsInterface = asInterface(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 119;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(str, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 27;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Unit unitOnNavigationEvent;
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[3];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[5];
        initSDK initsdk = (initSDK) objArr[6];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = onNavigationEvent(gethumanreadablename, jLongValue, jLongValue2, graphicDeviceInfo, quirksExternalSyntheticBackport0, getbacktracenote, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i3 = 18 / 0;
        } else {
            unitOnNavigationEvent = onNavigationEvent(gethumanreadablename, jLongValue, jLongValue2, graphicDeviceInfo, quirksExternalSyntheticBackport0, getbacktracenote, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 59;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            onExtraCallback(str, getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 35;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, getHumanReadableName gethumanreadablename, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{quirksExternalSyntheticBackport0, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, gethumanreadablename, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, -1636332773);
        } else {
            onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{quirksExternalSyntheticBackport0, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, gethumanreadablename, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, -1636332773);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 49;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 29 / 0;
        }
        int i6 = onExtraCallback + 71;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback((getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 99;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static final /* synthetic */ void onNavigationEvent(String str, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(str, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallbackWithResult + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
    }

    private static final Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -1516153379, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, 1516153381);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 83;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = ~(i9 | i3);
        int i11 = ~((~i) | i6);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i6 + i3 + i2 + ((-1232316077) * i4) + ((-263306238) * i5);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i6) - 1785593856) + (933837065 * i3) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i2) + (1319895040 * i4) + (1514668032 * i5) + (1334968320 * i15);
        int i17 = ((i6 * (-2046307327)) - 1888090795) + (i3 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i2 * (-2046307883)) + (i4 * 1526207759) + (i5 * (-1095616598)) + (i15 * 1719271424);
        boolean z = false;
        switch (i16 + (i17 * i17 * 2111700992)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                int iIntValue = ((Number) objArr[0]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i18 = 2 % 2;
                int i19 = onExtraCallback + 97;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                Unit unit = (Unit) onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 163088351, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, -163088347);
                int i21 = onExtraCallbackWithResult + 125;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            case 6:
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
                final int iIntValue3 = ((Number) objArr[1]).intValue();
                int i23 = 2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-778130496);
                if (iIntValue3 != 0) {
                    z = true;
                } else {
                    int i24 = onExtraCallbackWithResult + 21;
                    onExtraCallback = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 5 / 5;
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue3 & 1)) {
                    int i26 = onExtraCallbackWithResult + 1;
                    onExtraCallback = i26 % 128;
                    int i27 = i26 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-778130496, iIntValue3, -1, "im.toss.tds.compose.component.atom.post.StyleTest (TdsPostV2.kt:516)");
                    }
                    IAuthTabCallback((getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getStarPointsOnACircle.IAuthTabCallback.asInterface(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i28 = 2 % 2;
                            int i29 = IAuthTabCallback + 87;
                            onWarmupCompleted = i29 % 128;
                            int i30 = i29 % 2;
                            int i31 = iIntValue3;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            Object[] objArr2 = {Integer.valueOf(i31), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue4)};
                            if (i30 != 0) {
                                return (Unit) getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1814863382, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), objArr2, -1814863382);
                            }
                            throw null;
                        }
                    });
                }
                return null;
            case 7:
                return asInterface(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 101;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 83 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            onNavigationEvent(getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(gethumanreadablename, j, j2, graphicDeviceInfo, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(gethumanreadablename, j, j2, graphicDeviceInfo, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        boolean z = !getDistanceBetweenPoints.onNavigationEvent.onNavigationEvent(iIntValue, i2 % 2 == 0 ? getDistanceBetweenPoints.onNavigationEvent.Companion.IAuthTabCallback() : getDistanceBetweenPoints.onNavigationEvent.Companion.IAuthTabCallback());
        int i3 = onExtraCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        int i4 = 52 / 0;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = 0;
        if ((i & 3) != 2) {
            int i5 = onExtraCallbackWithResult + 29;
            onExtraCallback = i5 % 128;
            z = i5 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = onExtraCallbackWithResult + 125;
            onExtraCallback = i6 % 128;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 77;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1284450036, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.<anonymous>.<anonymous>.<anonymous> (TdsPostV2.kt:307)");
                    int i8 = 36 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1284450036, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.<anonymous>.<anonymous>.<anonymous> (TdsPostV2.kt:307)");
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport02);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
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
                int i9 = onExtraCallback + 91;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new roundUpToNearestHalfInt(lowLightBoostControlExternalSyntheticLambda0, i4, i2, defaultConstructorMarker);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getbacktracenote.invoke((roundUpToNearestHalfInt) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i5 = onExtraCallbackWithResult + 23;
            onExtraCallback = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-448455208, i, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.<anonymous>.<anonymous> (TdsPostV2.kt:300)");
            }
            putCharSequence.onExtraCallback(getHumanReadableName.onWarmupCompleted(gethumanreadablename, j, j2, graphicDeviceInfo, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (getChildPreviewOutConfig) null, 0, 0, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (notifySessionStop) null, 16777208, (Object) null), null, null, null, null, false, ForwardingCameraControl.onExtraCallback(-1284450036, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda6
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 125;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    if (i8 != 0) {
                        return getMidpointBetweenPoints.onNavigationEvent(quirksExternalSyntheticBackport03, quirksExternalSyntheticBackport02, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnNavigationEvent = getMidpointBetweenPoints.onNavigationEvent(quirksExternalSyntheticBackport03, quirksExternalSyntheticBackport02, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i9 = 40 / 0;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 7;
                onExtraCallback = i6 % 128;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final getHumanReadableName gethumanreadablename, final long j, final long j2, final GraphicDeviceInfo graphicDeviceInfo, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getBacktraceNote getbacktracenote, initSDK initsdk, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
            if ((i & 19) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
            if ((i & 48) == 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 145) != 144, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallbackWithResult + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-663590891, i2, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2.<anonymous> (TdsPostV2.kt:299)");
                int i6 = onExtraCallback + 109;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.readTypedObject(), null, null, ForwardingCameraControl.onExtraCallback(-448455208, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 83;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnWarmupCompleted = getMidpointBetweenPoints.onWarmupCompleted(gethumanreadablename, j, j2, graphicDeviceInfo, quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = onWarmupCompleted + 79;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        int i2;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i4;
        int i5;
        long j;
        boolean z;
        int i6;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final long j2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i7;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[3];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[4];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        final int iIntValue2 = ((Number) objArr[8]).intValue();
        int i8 = 2 % 2;
        int i9 = onExtraCallbackWithResult + 91;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1192545856);
        int i11 = iIntValue2 & 1;
        Object obj = null;
        if (i11 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i12 = onExtraCallbackWithResult + 23;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03);
                obj.hashCode();
                throw null;
            }
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        int i13 = iIntValue2 & 2;
        if (i13 == 0) {
            if ((iIntValue & 48) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue) ? 32 : 16) | i;
            }
            i3 = iIntValue2 & 4;
            if (i3 != 0) {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                if ((iIntValue & 384) == 0) {
                    int i14 = onExtraCallbackWithResult + 21;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue2) ? 256 : 128) | i2;
                }
                i5 = iIntValue2 & 8;
                if (i5 == 0) {
                    if ((iIntValue & 3072) == 0) {
                        int i16 = onExtraCallbackWithResult + 29;
                        j = jLongValue;
                        onExtraCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo);
                            throw null;
                        }
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 2048 : 1024;
                    }
                    if ((iIntValue & 24576) == 0) {
                        if ((iIntValue2 & 16) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) {
                            int i17 = onExtraCallbackWithResult + 57;
                            onExtraCallback = i17 % 128;
                            int i18 = i17 % 2;
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i4 |= i7;
                    }
                    if ((196608 & iIntValue) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 131072 : 65536;
                    }
                    if ((74899 & i4) == 74898) {
                        int i19 = onExtraCallback + 63;
                        onExtraCallbackWithResult = i19 % 128;
                        int i20 = i19 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                        i6 = iIntValue;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        j2 = j;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            if (i11 != 0) {
                                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                            }
                            if (i13 != 0) {
                                long jOnTransact = setByteOrder.Companion.onTransact();
                                int i21 = onExtraCallback + 83;
                                onExtraCallbackWithResult = i21 % 128;
                                int i22 = i21 % 2;
                                j = jOnTransact;
                            }
                            if (i3 != 0) {
                                jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                            }
                            if (i5 != 0) {
                                graphicDeviceInfo = null;
                            }
                            if ((iIntValue2 & 16) != 0) {
                                i4 &= -57345;
                                gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((iIntValue2 & 16) != 0) {
                                i4 &= -57345;
                            }
                        }
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                        final long j3 = j;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1192545856, i4, -1, "im.toss.tds.compose.component.atom.post.TdsPostV2 (TdsPostV2.kt:297)");
                        }
                        final getHumanReadableName gethumanreadablename2 = gethumanreadablename;
                        i6 = iIntValue;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        final long j4 = jLongValue2;
                        final GraphicDeviceInfo graphicDeviceInfo2 = graphicDeviceInfo;
                        setThreadList.IAuthTabCallback(onCrash.Post, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-663590891, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda9
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i23 = 2 % 2;
                                int i24 = onWarmupCompleted + 79;
                                onNavigationEvent = i24 % 128;
                                int i25 = i24 % 2;
                                getHumanReadableName gethumanreadablename3 = gethumanreadablename2;
                                long j5 = j3;
                                long j6 = j4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                Unit unit = (Unit) getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1430411221, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{gethumanreadablename3, Long.valueOf(j5), Long.valueOf(j6), graphicDeviceInfo2, quirksExternalSyntheticBackport04, getbacktracenote, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue3)}, -1430411220);
                                int i26 = onWarmupCompleted + 39;
                                onNavigationEvent = i26 % 128;
                                int i27 = i26 % 2;
                                return unit;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196614, 30);
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            int i23 = onExtraCallbackWithResult + 55;
                            onExtraCallback = i23 % 128;
                            if (i23 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                obj.hashCode();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        j2 = j3;
                    }
                    final long j5 = jLongValue2;
                    final GraphicDeviceInfo graphicDeviceInfo3 = graphicDeviceInfo;
                    final getHumanReadableName gethumanreadablename3 = gethumanreadablename;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        final int i24 = i6;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda10
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i25 = 2 % 2;
                                int i26 = onExtraCallback + 1;
                                onNavigationEvent = i26 % 128;
                                if (i26 % 2 == 0) {
                                    return getMidpointBetweenPoints.IAuthTabCallback(quirksExternalSyntheticBackport02, j2, j5, graphicDeviceInfo3, gethumanreadablename3, getbacktracenote, i24, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                }
                                getMidpointBetweenPoints.IAuthTabCallback(quirksExternalSyntheticBackport02, j2, j5, graphicDeviceInfo3, gethumanreadablename3, getbacktracenote, i24, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        });
                    }
                    return null;
                }
                i4 |= 3072;
                j = jLongValue;
                if ((iIntValue & 24576) == 0) {
                }
                if ((196608 & iIntValue) == 0) {
                }
                if ((74899 & i4) == 74898) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                }
                final long j52 = jLongValue2;
                final GraphicDeviceInfo graphicDeviceInfo32 = graphicDeviceInfo;
                final getHumanReadableName gethumanreadablename32 = gethumanreadablename;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return null;
            }
            int i25 = onExtraCallbackWithResult + 77;
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
            onExtraCallback = i25 % 128;
            int i26 = i25 % 2;
            i2 |= 384;
            i4 = i2;
            i5 = iIntValue2 & 8;
            if (i5 == 0) {
            }
            j = jLongValue;
            if ((iIntValue & 24576) == 0) {
            }
            if ((196608 & iIntValue) == 0) {
            }
            if ((74899 & i4) == 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            }
            final long j522 = jLongValue2;
            final GraphicDeviceInfo graphicDeviceInfo322 = graphicDeviceInfo;
            final getHumanReadableName gethumanreadablename322 = gethumanreadablename;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return null;
        }
        int i27 = onExtraCallback + 65;
        onExtraCallbackWithResult = i27 % 128;
        i = i27 % 2 == 0 ? i | 94 : i | 48;
        i2 = i;
        i3 = iIntValue2 & 4;
        if (i3 != 0) {
        }
        i4 = i2;
        i5 = iIntValue2 & 8;
        if (i5 == 0) {
        }
        j = jLongValue;
        if ((iIntValue & 24576) == 0) {
        }
        if ((196608 & iIntValue) == 0) {
        }
        if ((74899 & i4) == 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        final long j5222 = jLongValue2;
        final GraphicDeviceInfo graphicDeviceInfo3222 = graphicDeviceInfo;
        final getHumanReadableName gethumanreadablename3222 = gethumanreadablename;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1002240184);
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
                int i4 = onExtraCallback + 17;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    obj.hashCode();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1002240184, i, -1, "im.toss.tds.compose.component.atom.post.HeadingStyle (TdsPostV2.kt:319)");
                }
                IAuthTabCallback((getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getStarPointsOnACircle.IAuthTabCallback.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            }
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsPostV2Kt$.ExternalSyntheticLambda5(i));
                return;
            }
            return;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1002240184);
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(910442972);
        boolean z = false;
        if (i != 0) {
            int i3 = onExtraCallbackWithResult + 47;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(910442972, i, -1, "im.toss.tds.compose.component.atom.post.ParagraphStyle (TdsPostV2.kt:349)");
            }
            IAuthTabCallback((getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getStarPointsOnACircle.IAuthTabCallback.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 111;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsPostV2Kt$.ExternalSyntheticLambda11(i));
        }
        int i5 = onExtraCallbackWithResult + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1928014401);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1928014401, iIntValue, -1, "im.toss.tds.compose.component.atom.post.OrderedListStyle (TdsPostV2.kt:373)");
            }
            IAuthTabCallback((getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getStarPointsOnACircle.onNavigationEvent(new Object[]{getStarPointsOnACircle.IAuthTabCallback}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -587736845, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 587736856), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 11;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = iIntValue;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (i7 != 0) {
                        return getMidpointBetweenPoints.onNavigationEvent(i8, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    }
                    getMidpointBetweenPoints.onNavigationEvent(i8, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        return null;
    }

    private static final void asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(984162904);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 109;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(984162904, i, -1, "im.toss.tds.compose.component.atom.post.UnorderedListStyle (TdsPostV2.kt:430)");
            }
            IAuthTabCallback((getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getStarPointsOnACircle.IAuthTabCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 27;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsPostV2Kt$.ExternalSyntheticLambda0(i));
        }
    }

    private static final void IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1939048331);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 91;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1939048331, i, -1, "im.toss.tds.compose.component.atom.post.Test (TdsPostV2.kt:469)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1939048331, i, -1, "im.toss.tds.compose.component.atom.post.Test (TdsPostV2.kt:469)");
            }
            IAuthTabCallback((getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getStarPointsOnACircle.IAuthTabCallback.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallbackWithResult + 79;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = 87 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsPostV2Kt$.ExternalSyntheticLambda8(i));
            int i6 = onExtraCallbackWithResult + 85;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1756598974);
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                int i4 = onExtraCallback + 93;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1756598974, i, -1, "im.toss.tds.compose.component.atom.post.BorderStyle (TdsPostV2.kt:594)");
                    if (i7 == 0) {
                        int i8 = 56 / 0;
                    }
                }
                IAuthTabCallback((getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getStarPointsOnACircle.onNavigationEvent(new Object[]{getStarPointsOnACircle.IAuthTabCallback}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1137005831, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1137005856), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 87;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = i;
                        int iIntValue = ((Integer) obj2).intValue();
                        Unit unit = (Unit) getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -670770579, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{Integer.valueOf(i12), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, 670770584);
                        int i13 = onExtraCallback + 121;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        return unit;
                    }
                });
                return;
            }
            return;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1756598974);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(final String str, final getBacktraceNote<? super roundUpToNearestHalfInt, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(278849936);
        if ((i & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ^ true) ? 32 : 16;
        }
        int i8 = i2;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 19) != 18, i8 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(278849936, i8, -1, "im.toss.tds.compose.component.atom.post.LabeledPreviewContent (TdsPostV2.kt:618)");
            }
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = QuirkSettingsLoader.Companion.onTransact();
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
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
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{verifyDrawable.onExtraCallback(onextracallback, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0L, 0L, null, null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i8 << 12) & 458752), 30}, -1636332773);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IPostMessageService_Parcel()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i8 & 14) | 24576), 0, 131046}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda4
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 23;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    String str2 = str;
                    if (i11 != 0) {
                        return getMidpointBetweenPoints.onNavigationEvent(str2, getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnNavigationEvent = getMidpointBetweenPoints.onNavigationEvent(str2, getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = 55 / 0;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 5) == 3) {
            z = false;
        } else {
            int i5 = i3 + 43;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(909452192, i, -1, "im.toss.tds.compose.component.atom.post.PreviewContainer.<anonymous> (TdsPostV2.kt:634)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f));
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            getbacktracenote.invoke(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(final getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1900824136);
        if ((i & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote))) {
                int i5 = onExtraCallback + 95;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i7 = onExtraCallback + 111;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 93;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1900824136, i2, -1, "im.toss.tds.compose.component.atom.post.PreviewContainer (TdsPostV2.kt:632)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1900824136, i2, -1, "im.toss.tds.compose.component.atom.post.PreviewContainer (TdsPostV2.kt:632)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(909452192, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 123;
                    onWarmupCompleted = i11 % 128;
                    Object obj4 = null;
                    if (i11 % 2 != 0) {
                        getMidpointBetweenPoints.onExtraCallback(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = getMidpointBetweenPoints.onExtraCallback(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = IAuthTabCallback + 113;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i10 = onExtraCallbackWithResult + 43;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda13
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 37;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        getMidpointBetweenPoints.onWarmupCompleted(getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = getMidpointBetweenPoints.onWarmupCompleted(getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i14 = onNavigationEvent + 101;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -670770579, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 670770584);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1430411221, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, quirksExternalSyntheticBackport0, getbacktracenote, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1430411220);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1814863382, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -1814863382);
    }

    private static final Unit asBinder(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 163088351, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -163088347);
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -1516153379, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1516153381);
    }

    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1046168603, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1046168597);
    }

    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable getHumanReadableName gethumanreadablename, @NotNull getBacktraceNote<? super roundUpToNearestHalfInt, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{quirksExternalSyntheticBackport0, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, gethumanreadablename, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, -1636332773);
    }

    public static final boolean onExtraCallback(int i) {
        return ((Boolean) onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -124307517, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{Integer.valueOf(i)}, 124307524)).booleanValue();
    }
}
