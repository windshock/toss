package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.ads.zzgsa;
import com.tmoney.a;
import im.toss.TossApplication;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.deprecated_eventListenerFactory;
import o.flipHorizontally;
import o.getBacktraceNote;
import o.handleNativeAdClick;
import o.removeObserverLocked;
import o.setIso;
import o.setMainImageUri;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setMainImageUri {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, 606575622, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -606575616);
        int i6 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), new Object[]{getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, 1440808572, iOnWarmupCompleted2, a.3.onWarmupCompleted(), iOnWarmupCompleted, -1440808570);
        }
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(handleNativeAdClick.onNavigationEvent onnavigationevent, toMetersPerSecond tometerspersecond, handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(onnavigationevent, tometerspersecond, onextracallbackwithresult, sessionProcessorCaptureCallback);
        }
        onNavigationEvent(onnavigationevent, tometerspersecond, onextracallbackwithresult, sessionProcessorCaptureCallback);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        handleNativeAdClick.onExtraCallback onextracallback = (handleNativeAdClick.onExtraCallback) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        String str = (String) objArr[2];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        float fFloatValue = ((Number) objArr[5]).floatValue();
        Function0 function0 = (Function0) objArr[6];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(onextracallback, quirksExternalSyntheticBackport0, str, getbacktracenote, jLongValue, fFloatValue, function0, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i3 = 47 / 0;
        return onExtraCallback(onextracallback, quirksExternalSyntheticBackport0, str, getbacktracenote, jLongValue, fFloatValue, function0, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
    }

    private static final Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 41 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, gethumanreadablename, j, j2, graphicDeviceInfo, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 76 / 0;
        }
        int i6 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, handleNativeAdClick.onExtraCallback onextracallback, long j, getBacktraceNote getbacktracenote, float f, Function0 function0, String str, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, onextracallback, j, getbacktracenote, f, function0, str, getbacktracenote2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(fliphorizontally);
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 57 / 0;
        }
        int i6 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getbacktracenote, getbacktracenote2, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 43 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(hasprovider, gethumanreadablename, j, j2, graphicDeviceInfo, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i2;
        int i9 = ~i6;
        int i10 = ~i5;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = ~(i5 | i6);
        int i13 = i11 | i12;
        int i14 = (~(i8 | i6)) | (~(i8 | i10)) | (~(i10 | i6));
        int i15 = i6 + i2 + i3 + (669352129 * i) + (266941808 * i4);
        int i16 = i15 * i15;
        int i17 = (720661947 * i6) + 1572077568 + ((-1243901369) * i2) + (1165201990 * i13) + (i12 * (-1165201990)) + ((-1165201990) * i14) + (1885863936 * i3) + ((-1100480512) * i) + ((-1249902592) * i4) + ((-491520000) * i16);
        int i18 = (i6 * 1617402437) + 56426783 + (i2 * 1617401273) + (i13 * (-582)) + (i12 * 582) + (i14 * 582) + (i3 * 1617401855) + (i * 1244927807) + (i4 * (-404665712)) + (i16 * (-45350912));
        switch (i17 + (i18 * i18 * 1565261824)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
                getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[1];
                RowScope rowScope = (RowScope) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i19 = 2 % 2;
                int i20 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                Unit unitAsBinder = asBinder(getbacktracenote, getbacktracenote2, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i22 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i22 % 128;
                int i23 = i22 % 2;
                return unitAsBinder;
            case 4:
                int iIntValue2 = ((Number) objArr[0]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i24 = 2 % 2;
                int i25 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i25 % 128;
                int i26 = i25 % 2;
                Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(iIntValue2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue3);
                int i27 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                return unitIAuthTabCallbackStub;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[0];
                AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue4 = ((Number) objArr[3]).intValue();
                int i29 = 2 % 2;
                Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ^ true ? 2 : 4;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1382381278, iIntValue4, -1, "im.toss.tds.compose.component.atom.asset.Shapes.<anonymous>.<anonymous> (TdsAssetV2.kt:879)");
                    }
                    getbacktracenote3.invoke(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult3, Integer.valueOf((iIntValue4 & 14) | 48));
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i30 = onNavigationEvent + 7;
                        onExtraCallbackWithResult = i30 % 128;
                        int i31 = i30 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        i7 = onExtraCallbackWithResult + 43;
                        onNavigationEvent = i7 % 128;
                    }
                    return Unit.INSTANCE;
                }
                cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                i7 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i7 % 128;
                int i32 = i7 % 2;
                return Unit.INSTANCE;
            case 10:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, handleNativeAdClick.onExtraCallback onextracallback, getBacktraceNote getbacktracenote, long j, float f, Function0 function0, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, str, onextracallback, getbacktracenote, j, f, function0, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return asInterface(getbacktracenote, getbacktracenote2, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asInterface(getbacktracenote, getbacktracenote2, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, handleNativeAdClick.onExtraCallback onextracallback, long j, getBacktraceNote getbacktracenote, float f, Function0 function0, String str, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, onextracallback, j, getbacktracenote, f, function0, str, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 33 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), new Object[]{getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1313008869, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1313008878);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(removeTimestamp removetimestamp, setIso setiso) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(removetimestamp, setiso);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(removetimestamp, setiso);
        int i3 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Object obj = objArr[0];
        deprecated_eventListenerFactory deprecated_eventlistenerfactory = (deprecated_eventListenerFactory) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        handleNativeAdClick.onWarmupCompleted onwarmupcompleted = (handleNativeAdClick.onWarmupCompleted) objArr[5];
        String str = (String) objArr[6];
        AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(obj, deprecated_eventlistenerfactory, jLongValue, iIntValue, fFloatValue, onwarmupcompleted, str, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 518230978, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -518230978);
        int i6 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), new Object[]{getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, -1574146244, iOnWarmupCompleted2, a.3.onWarmupCompleted(), iOnWarmupCompleted, 1574146245);
        }
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, getbacktracenote2, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, 2101223444, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -2101223439);
        int i5 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getHumanReadableName gethumanreadablename;
        long jOnExtraCallbackWithResult;
        String str;
        final String str2 = (String) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
        handleNativeAdClick.onExtraCallback onextracallback2 = (handleNativeAdClick.onExtraCallback) objArr[2];
        getHumanReadableName gethumanreadablename2 = (getHumanReadableName) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        long jLongValue2 = ((Number) objArr[5]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[6];
        long jLongValue3 = ((Number) objArr[7]).longValue();
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[8];
        float fFloatValue = ((Number) objArr[9]).floatValue();
        Function0 function0 = (Function0) objArr[10];
        String str3 = (String) objArr[11];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        int iIntValue = ((Number) objArr[13]).intValue();
        GraphicDeviceInfo graphicDeviceInfo2 = graphicDeviceInfo;
        int iIntValue2 = ((Number) objArr[14]).intValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback;
        int iIntValue3 = ((Number) objArr[15]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        if ((iIntValue3 & 2) != 0) {
            int i2 = onNavigationEvent + 107;
            gethumanreadablename = gethumanreadablename2;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            gethumanreadablename = gethumanreadablename2;
        }
        handleNativeAdClick.onExtraCallback onextracallbackOnNavigationEvent = (iIntValue3 & 4) != 0 ? handleNativeAdClick.onExtraCallback.Companion.onNavigationEvent() : onextracallback2;
        final getHumanReadableName gethumanreadablename3 = (iIntValue3 & 8) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        if ((iIntValue3 & 16) != 0) {
            int i4 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            jLongValue = setByteOrder.Companion.onTransact();
        }
        if ((iIntValue3 & 32) != 0) {
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        Object obj = null;
        if ((iIntValue3 & 64) != 0) {
            jOnExtraCallbackWithResult = jLongValue3;
            int i6 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            graphicDeviceInfo2 = null;
        } else {
            jOnExtraCallbackWithResult = jLongValue3;
        }
        if ((iIntValue3 & 128) != 0) {
            jOnExtraCallbackWithResult = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 6) & 14) | 48);
        }
        if ((iIntValue3 & 256) != 0) {
            getbacktracenote = null;
        }
        if ((iIntValue3 & 512) != 0) {
            fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if ((iIntValue3 & 1024) != 0) {
            function0 = null;
        }
        if ((iIntValue3 & 2048) != 0) {
            int i8 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            str = null;
        } else {
            str = str3;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1884339082, iIntValue, iIntValue2, "im.toss.tds.compose.component.atom.asset.TdsAssetV2 (TdsAssetV2.kt:644)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1884339082, iIntValue, iIntValue2, "im.toss.tds.compose.component.atom.asset.TdsAssetV2 (TdsAssetV2.kt:644)");
        }
        handleNativeAdClick.onExtraCallback onextracallback4 = onextracallbackOnNavigationEvent;
        final long j = jLongValue;
        final long j2 = jLongValue2;
        final GraphicDeviceInfo graphicDeviceInfo3 = graphicDeviceInfo2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1749605679, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda20
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                Unit unitOnExtraCallback;
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 39;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    unitOnExtraCallback = setMainImageUri.onExtraCallback(str2, gethumanreadablename3, j, j2, graphicDeviceInfo3, (AppLovinNativeAdImplExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i13 = 34 / 0;
                } else {
                    unitOnExtraCallback = setMainImageUri.onExtraCallback(str2, gethumanreadablename3, j, j2, graphicDeviceInfo3, (AppLovinNativeAdImplExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
                int i14 = onWarmupCompleted + 37;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                return unitOnExtraCallback;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54);
        int i11 = iIntValue >> 3;
        int i12 = iIntValue >> 15;
        int i13 = iIntValue2 << 15;
        onExtraCallbackWithResult(onextracallback3, onextracallback4, jOnExtraCallbackWithResult, getbacktracenote, fFloatValue, function0, str, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, (i11 & 14) | 12582912 | (i11 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i13) | (3670016 & i13), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i14 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(String str, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
                int i7 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i7 % 128;
                i3 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1749605679, i2, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2.<anonymous> (TdsAssetV2.kt:654)");
                int i10 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onExtraCallbackWithResult(str, null, gethumanreadablename, j, j2, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable handleNativeAdClick.onExtraCallback onextracallback, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j3, @Nullable getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, float f, @Nullable Function0<Unit> function0, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnNavigationEvent;
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2;
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        Function0<Unit> function02;
        Function0<Unit> function03;
        String str2;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((i3 & 5) != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                int i6 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((i3 & 2) != 0) {
            }
        }
        handleNativeAdClick.onExtraCallback onextracallbackOnNavigationEvent = (i3 & 4) != 0 ? handleNativeAdClick.onExtraCallback.Companion.onNavigationEvent() : onextracallback;
        getHumanReadableName gethumanreadablename2 = (i3 & 8) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        long jOnTransact = (i3 & 16) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i3 & 32) != 0) {
            int i8 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 64) != 0 ? null : graphicDeviceInfo;
        long jOnExtraCallbackWithResult = (i3 & 128) != 0 ? setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 14) | 48) : j3;
        if ((i3 & 256) != 0) {
            int i10 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            getbacktracenote2 = null;
        } else {
            getbacktracenote2 = getbacktracenote;
        }
        float fIAuthTabCallback = (i3 & 512) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
        if ((i3 & 1024) != 0) {
            int i12 = onExtraCallbackWithResult + 5;
            getbacktracenote3 = getbacktracenote2;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            function02 = null;
        } else {
            getbacktracenote3 = getbacktracenote2;
            function02 = function0;
        }
        if ((i3 & 2048) != 0) {
            int i14 = onNavigationEvent;
            int i15 = i14 + 69;
            function03 = function02;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i14 + 71;
            onExtraCallbackWithResult = i17 % 128;
            int i18 = i17 % 2;
            str2 = null;
        } else {
            function03 = function02;
            str2 = str;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-95993216, i, i2, "im.toss.tds.compose.component.atom.asset.TdsAssetV2 (TdsAssetV2.kt:679)");
        }
        final getHumanReadableName gethumanreadablename3 = gethumanreadablename2;
        final long j4 = jOnTransact;
        final long j5 = jOnNavigationEvent;
        final GraphicDeviceInfo graphicDeviceInfo3 = graphicDeviceInfo2;
        int i19 = i >> 3;
        int i20 = i >> 15;
        int i21 = i2 << 15;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport02, onextracallbackOnNavigationEvent, jOnExtraCallbackWithResult, getbacktracenote3, fIAuthTabCallback, function03, str2, ForwardingCameraControl.onExtraCallback(310582041, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda10
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unitOnExtraCallback;
                int i22 = 2 % 2;
                int i23 = onNavigationEvent + 71;
                onWarmupCompleted = i23 % 128;
                if (i23 % 2 != 0) {
                    unitOnExtraCallback = setMainImageUri.onExtraCallback(hasprovider, gethumanreadablename3, j4, j5, graphicDeviceInfo3, (AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i24 = 73 / 0;
                } else {
                    unitOnExtraCallback = setMainImageUri.onExtraCallback(hasprovider, gethumanreadablename3, j4, j5, graphicDeviceInfo3, (AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i25 = onNavigationEvent + 29;
                onWarmupCompleted = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 57 / 0;
                }
                return unitOnExtraCallback;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, (i20 & 7168) | (i19 & 14) | 12582912 | (i19 & 112) | (i20 & 896) | (57344 & i20) | (458752 & i21) | (i21 & 3670016), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onNavigationEvent(hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(310582041, i2, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2.<anonymous> (TdsAssetV2.kt:689)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onWarmupCompleted(hasprovider, null, gethumanreadablename, j, j2, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void IAuthTabCallback(@NotNull final Object obj, @NotNull final deprecated_eventListenerFactory deprecated_eventlistenerfactory, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable handleNativeAdClick.onExtraCallback onextracallback, long j, int i, float f, @Nullable handleNativeAdClick.onWarmupCompleted onwarmupcompleted, long j2, @Nullable getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, float f2, @Nullable Function0<Unit> function0, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        handleNativeAdClick.onExtraCallback onextracallbackOnNavigationEvent;
        long jOnTransact;
        long jOnExtraCallbackWithResult;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(deprecated_eventlistenerfactory, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i4 & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            onextracallbackOnNavigationEvent = handleNativeAdClick.onExtraCallback.Companion.onNavigationEvent();
        } else {
            onextracallbackOnNavigationEvent = onextracallback;
        }
        Object obj2 = null;
        if ((i4 & 16) != 0) {
            int i8 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                setByteOrder.Companion.onTransact();
                obj2.hashCode();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
            int i9 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        } else {
            jOnTransact = j;
        }
        int i11 = (i4 & 32) != 0 ? 1 : i;
        float f3 = (i4 & 64) != 0 ? 1.0f : f;
        handleNativeAdClick.onWarmupCompleted onwarmupcompleted2 = (i4 & 128) != 0 ? handleNativeAdClick.onWarmupCompleted.Auto : onwarmupcompleted;
        if ((i4 & 256) != 0) {
            jOnExtraCallbackWithResult = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 9) & 14) | 48);
            int i12 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        } else {
            jOnExtraCallbackWithResult = j2;
        }
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2 = (i4 & 512) != 0 ? null : getbacktracenote;
        float fIAuthTabCallback = (i4 & 1024) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f2;
        Function0<Unit> function02 = (i4 & 2048) != 0 ? null : function0;
        String str2 = (i4 & 4096) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1529887321, i2, i3, "im.toss.tds.compose.component.atom.asset.TdsAssetV2 (TdsAssetV2.kt:719)");
            int i14 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 4 % 3;
            }
        }
        final long j3 = jOnTransact;
        final int i16 = i11;
        final float f4 = f3;
        final handleNativeAdClick.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted2;
        final String str3 = str2;
        int i17 = i2 >> 6;
        int i18 = i2 >> 18;
        int i19 = i3 << 12;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        handleNativeAdClick.onExtraCallback onextracallback2 = onextracallbackOnNavigationEvent;
        long j4 = jOnExtraCallbackWithResult;
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3 = getbacktracenote2;
        float f5 = fIAuthTabCallback;
        Function0<Unit> function03 = function02;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport03, onextracallback2, j4, getbacktracenote3, f5, function03, null, ForwardingCameraControl.onExtraCallback(1406685362, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                int i20 = 2 % 2;
                int i21 = onWarmupCompleted + 9;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                Object obj6 = obj;
                deprecated_eventListenerFactory deprecated_eventlistenerfactory2 = deprecated_eventlistenerfactory;
                long j5 = j3;
                int i23 = i16;
                float f6 = f4;
                int iIntValue = ((Integer) obj5).intValue();
                Object[] objArr = {obj6, deprecated_eventlistenerfactory2, Long.valueOf(j5), Integer.valueOf(i23), Float.valueOf(f6), onwarmupcompleted3, str3, (AppLovinNativeAdImplExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue)};
                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                Unit unit = (Unit) setMainImageUri.onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -482409154, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 482409164);
                int i24 = onExtraCallback + 59;
                onWarmupCompleted = i24 % 128;
                int i25 = i24 % 2;
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, (i18 & 896) | (i17 & 14) | 12582912 | (i17 & 112) | (i18 & 7168) | (57344 & i19) | (i19 & 458752), 64);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onNavigationEvent(Object obj, deprecated_eventListenerFactory deprecated_eventlistenerfactory, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
                int i6 = onNavigationEvent + 37;
                onExtraCallbackWithResult = i6 % 128;
                i4 = i6 % 2 == 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1406685362, i3, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2.<anonymous> (TdsAssetV2.kt:728)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(obj, deprecated_eventlistenerfactory, (QuirksExternalSyntheticBackport0) null, j, i, f, onwarmupcompleted, str, cameraCaptureResultEmptyCameraCaptureResult, (i3 << 24) & 234881024, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (str != null) {
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
                throw null;
            }
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            int i3 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1151057107, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAssetV2.kt:794)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1151057107, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAssetV2.kt:794)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i6 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new AppLovinNativeAdImplExternalSyntheticLambda0(highSpeedResolverExternalSyntheticLambda2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                getbacktracenote.invoke((AppLovinNativeAdImplExternalSyntheticLambda0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i7 = onNavigationEvent + 47;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final String str, handleNativeAdClick.onExtraCallback onextracallback, getBacktraceNote getbacktracenote, long j, float f, Function0 function0, final getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getHumanReadableName gethumanreadablenameOnWarmupCompleted;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1523426731, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2.<anonymous>.<anonymous> (TdsAssetV2.kt:757)");
                    onnavigationevent.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1523426731, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2.<anonymous>.<anonymous> (TdsAssetV2.kt:757)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i4 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i6 = 2 % 2;
                            int i7 = IAuthTabCallback + 81;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unitOnNavigationEvent = setMainImageUri.onNavigationEvent(str, (useAndConfigureProgramWithTexture) obj);
                            int i9 = IAuthTabCallback + 87;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                final HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = onWarmupCompleted(onextracallback != null ? quirksExternalSyntheticBackport0IAuthTabCallback.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, onextracallback.onExtraCallbackWithResult())) : quirksExternalSyntheticBackport0IAuthTabCallback, onextracallback);
                if (getbacktracenote == null || !(onextracallback instanceof handleNativeAdClick.onExtraCallback.onNavigationEvent)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1617129203);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1408096341);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj) {
                                int i6 = 2 % 2;
                                int i7 = onExtraCallback + 89;
                                onExtraCallbackWithResult = i7 % 128;
                                flipHorizontally fliphorizontally = (flipHorizontally) obj;
                                if (i7 % 2 == 0) {
                                    return setMainImageUri.onExtraCallback(fliphorizontally);
                                }
                                setMainImageUri.onExtraCallback(fliphorizontally);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized2), ((handleNativeAdClick.onExtraCallback.onNavigationEvent) onextracallback).getInterfaceDescriptor(), (getMainImageAspectRatio) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult()));
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = setTitleTextColor.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted3.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback), j == 16 ? setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()).access100() : j, onextracallback.onExtraCallbackWithResult()), f), (setTitleMarginStart) null, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function0, 31, (Object) null);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                onnavigationevent = onextracallback instanceof handleNativeAdClick.onExtraCallback.onNavigationEvent ? (handleNativeAdClick.onExtraCallback.onNavigationEvent) onextracallback : null;
                if (onnavigationevent == null || (gethumanreadablenameOnWarmupCompleted = onnavigationevent.IAuthTabCallback_Parcel()) == null) {
                    gethumanreadablenameOnWarmupCompleted = handleNativeAdClick.IAuthTabCallback.onNavigationEvent.onWarmupCompleted();
                }
                putCharSequence.onExtraCallback(gethumanreadablenameOnWarmupCompleted, null, null, null, null, false, ForwardingCameraControl.onExtraCallback(1151057107, true, new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 95;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnExtraCallback = setMainImageUri.onExtraCallback(highSpeedResolverExternalSyntheticLambda1, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i9 = IAuthTabCallback + 49;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 62);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (getbacktracenote != null) {
                    int i6 = onNavigationEvent + 85;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1409401410);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new setPrivacyIconUri(highSpeedResolverExternalSyntheticLambda1);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    getbacktracenote.invoke((setPrivacyIconUri) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1409581117);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i8 = onExtraCallbackWithResult + 33;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final handleNativeAdClick.onExtraCallback onextracallback, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final String str, final getBacktraceNote getbacktracenote, final long j, final float f, final Function0 function0, final getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onExtraCallbackWithResult + 77;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1737780629, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2.<anonymous> (TdsAssetV2.kt:753)");
                }
                handleNativeAdClick handlenativeadclick = handleNativeAdClick.onExtraCallback;
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{handlenativeadclick.onExtraCallback().onExtraCallback(onextracallback), handlenativeadclick.onExtraCallbackWithResult().onExtraCallback(new getMainImageAspectRatio(null, null, 3, null))}, ForwardingCameraControl.onExtraCallback(1523426731, true, new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda19
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 109;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallbackWithResult = setMainImageUri.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, onextracallback, getbacktracenote, j, f, function0, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i10 = onExtraCallback + 21;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                handleNativeAdClick handlenativeadclick2 = handleNativeAdClick.onExtraCallback;
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{handlenativeadclick2.onExtraCallback().onExtraCallback(onextracallback), handlenativeadclick2.onExtraCallbackWithResult().onExtraCallback(new getMainImageAspectRatio(null, null, 3, null))}, ForwardingCameraControl.onExtraCallback(1523426731, true, new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda19
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 109;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallbackWithResult = setMainImageUri.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, onextracallback, getbacktracenote, j, f, function0, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i10 = onExtraCallback + 21;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[PHI: r0 r1
      0x0037: PHI (r0v26 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v27 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r1v21 int) = (r1v4 int), (r1v22 int) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0272 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r0 r1
      0x0030: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v27 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r1v5 int) = (r1v4 int), (r1v22 int) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable handleNativeAdClick.onExtraCallback onextracallback, long j, @Nullable getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, float f, @Nullable Function0<Unit> function0, @Nullable String str, @NotNull final getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        long j2;
        int i5;
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        int i11;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final handleNativeAdClick.onExtraCallback onextracallback2;
        final long j3;
        final getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final String str3;
        final float f3;
        final Function0<Unit> function02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i12;
        handleNativeAdClick.onExtraCallback onextracallbackOnNavigationEvent;
        long jOnExtraCallbackWithResult;
        handleNativeAdClick.onExtraCallback onextracallback3;
        Function0<Unit> function03;
        long j4;
        float f4;
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        String str4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i13 = 2 % 2;
        int i14 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbacktracenote2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(400166760);
            i3 = i2 & 1;
            if (i3 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i | 6;
            } else if ((i & 6) == 0) {
                i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(getbacktracenote2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(400166760);
            i3 = i2 & 1;
            if (i3 != 0) {
            }
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            int i16 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                int i18 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(onextracallback) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    int i20 = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j2) ? 256 : 128;
                    i4 |= i20;
                } else {
                    j2 = j;
                }
                i4 |= i20;
            } else {
                j2 = j;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    getbacktracenote3 = getbacktracenote;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(getbacktracenote3) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        f2 = f;
                        if (cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f2)) {
                            int i21 = onExtraCallbackWithResult + 43;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i8 = i7 | i4;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            i8 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function0) ? 131072 : 65536;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            i8 |= 1572864;
                            str2 = str;
                        } else {
                            str2 = str;
                            if ((i & 1572864) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str2)) {
                                    int i23 = onNavigationEvent + 119;
                                    onExtraCallbackWithResult = i23 % 128;
                                    int i24 = i23 % 2;
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i8 |= i11;
                            }
                        }
                        if ((12582912 & i) == 0) {
                            int i25 = onExtraCallbackWithResult + 69;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            i8 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(getbacktracenote2) ? 8388608 : 4194304;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((4793491 & i8) != 4793490, i8 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStub();
                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage()) {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i3 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                if (i15 != 0) {
                                    int i27 = onExtraCallbackWithResult + 61;
                                    onNavigationEvent = i27 % 128;
                                    int i28 = i27 % 2;
                                    onextracallbackOnNavigationEvent = handleNativeAdClick.onExtraCallback.Companion.onNavigationEvent();
                                } else {
                                    onextracallbackOnNavigationEvent = onextracallback;
                                }
                                if ((i2 & 4) != 0) {
                                    jOnExtraCallbackWithResult = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult2, ((i8 >> 3) & 14) | 48);
                                    i8 &= -897;
                                } else {
                                    jOnExtraCallbackWithResult = j2;
                                }
                                if (i5 != 0) {
                                    getbacktracenote3 = null;
                                }
                                float fIAuthTabCallback = i6 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f2;
                                Function0<Unit> function04 = i9 != 0 ? null : function0;
                                if (i10 != 0) {
                                    int i29 = onExtraCallbackWithResult + 123;
                                    onNavigationEvent = i29 % 128;
                                    int i30 = i29 % 2;
                                    onextracallback3 = onextracallbackOnNavigationEvent;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                    function03 = function04;
                                    j4 = jOnExtraCallbackWithResult;
                                    f4 = fIAuthTabCallback;
                                    getbacktracenote5 = getbacktracenote3;
                                    str4 = null;
                                } else {
                                    onextracallback3 = onextracallbackOnNavigationEvent;
                                    function03 = function04;
                                    j4 = jOnExtraCallbackWithResult;
                                    f4 = fIAuthTabCallback;
                                    getbacktracenote5 = getbacktracenote3;
                                    str4 = str2;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                if ((i2 & 4) != 0) {
                                    i8 &= -897;
                                }
                                onextracallback3 = onextracallback;
                                function03 = function0;
                                getbacktracenote5 = getbacktracenote3;
                                str4 = str2;
                                f4 = f2;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                j4 = j2;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(400166760, i8, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV2 (TdsAssetV2.kt:751)");
                            }
                            final handleNativeAdClick.onExtraCallback onextracallback4 = onextracallback3;
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                            final String str5 = str4;
                            final getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = getbacktracenote5;
                            final long j5 = j4;
                            final float f5 = f4;
                            final Function0<Unit> function05 = function03;
                            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onExtraCallback(), null, null, ForwardingCameraControl.onExtraCallback(-1737780629, true, new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda22
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i31 = 2 % 2;
                                    int i32 = onWarmupCompleted + 29;
                                    onNavigationEvent = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        handleNativeAdClick.onExtraCallback onextracallback5 = onextracallback4;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                                        String str6 = str5;
                                        getBacktraceNote getbacktracenote7 = getbacktracenote6;
                                        long j6 = j5;
                                        float f6 = f5;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        Object[] objArr = {onextracallback5, quirksExternalSyntheticBackport06, str6, getbacktracenote7, Long.valueOf(j6), Float.valueOf(f6), function05, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                                        int iOnWarmupCompleted = a.3.onWarmupCompleted();
                                        return (Unit) setMainImageUri.onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -843001833, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 843001841);
                                    }
                                    handleNativeAdClick.onExtraCallback onextracallback6 = onextracallback4;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport05;
                                    String str7 = str5;
                                    getBacktraceNote getbacktracenote8 = getbacktracenote6;
                                    long j7 = j5;
                                    float f7 = f5;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    Object[] objArr2 = {onextracallback6, quirksExternalSyntheticBackport07, str7, getbacktracenote8, Long.valueOf(j7), Float.valueOf(f7), function05, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)};
                                    int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 3078, 6);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            int i31 = onExtraCallbackWithResult + 67;
                            onNavigationEvent = i31 % 128;
                            int i32 = i31 % 2;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            onextracallback2 = onextracallback3;
                            j3 = j4;
                            getbacktracenote4 = getbacktracenote5;
                            f3 = f4;
                            function02 = function03;
                            str3 = str4;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            onextracallback2 = onextracallback;
                            j3 = j2;
                            getbacktracenote4 = getbacktracenote3;
                            str3 = str2;
                            f3 = f2;
                            function02 = function0;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda23
                                private static int onExtraCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i33 = 2 % 2;
                                    int i34 = onWarmupCompleted + 101;
                                    onExtraCallback = i34 % 128;
                                    int i35 = i34 % 2;
                                    Unit unitOnExtraCallback = setMainImageUri.onExtraCallback(quirksExternalSyntheticBackport02, onextracallback2, j3, getbacktracenote4, f3, function02, str3, getbacktracenote2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i36 = onExtraCallback + 89;
                                    onWarmupCompleted = i36 % 128;
                                    int i37 = i36 % 2;
                                    return unitOnExtraCallback;
                                }
                            });
                        }
                        i12 = onNavigationEvent + 29;
                        onExtraCallbackWithResult = i12 % 128;
                        if (i12 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                    i8 |= 196608;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                    }
                    if ((12582912 & i) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((4793491 & i8) != 4793490, i8 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                    i12 = onNavigationEvent + 29;
                    onExtraCallbackWithResult = i12 % 128;
                    if (i12 % 2 == 0) {
                    }
                }
                f2 = f;
                i8 = i4;
                i9 = i2 & 32;
                if (i9 != 0) {
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                }
                if ((12582912 & i) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((4793491 & i8) != 4793490, i8 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                i12 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 == 0) {
                }
            }
            getbacktracenote3 = getbacktracenote;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            f2 = f;
            i8 = i4;
            i9 = i2 & 32;
            if (i9 != 0) {
            }
            i10 = i2 & 64;
            if (i10 != 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((4793491 & i8) != 4793490, i8 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            i12 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
            }
        }
        if ((i & 384) != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        getbacktracenote3 = getbacktracenote;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        f2 = f;
        i8 = i4;
        i9 = i2 & 32;
        if (i9 != 0) {
        }
        i10 = i2 & 64;
        if (i10 != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((4793491 & i8) != 4793490, i8 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        i12 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 == 0) {
        }
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final handleNativeAdClick.onNavigationEvent onnavigationevent, @NotNull getMainImageAspectRatio getmainimageaspectratio) {
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(getmainimageaspectratio, "");
        final handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult = (handleNativeAdClick.onExtraCallbackWithResult) getmainimageaspectratio.onExtraCallback().onExtraCallbackWithResult();
        final toMetersPerSecond tometerspersecond = (toMetersPerSecond) getmainimageaspectratio.onExtraCallbackWithResult().onExtraCallbackWithResult();
        if (onextracallbackwithresult != null) {
            if (tometerspersecond == null) {
                i = onExtraCallbackWithResult + 93;
                i2 = i % 128;
            } else {
                quirksExternalSyntheticBackport0 = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 15;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        removeObserverLocked removeobserverlockedIAuthTabCallback = setMainImageUri.IAuthTabCallback(onnavigationevent, tometerspersecond, onextracallbackwithresult, (SessionProcessorCaptureCallback) obj);
                        int i7 = onExtraCallback + 15;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return removeobserverlockedIAuthTabCallback;
                    }
                });
                i = onExtraCallbackWithResult + 57;
                i2 = i % 128;
            }
            onNavigationEvent = i2;
            int i4 = i % 2;
        }
        return quirksExternalSyntheticBackport0;
    }

    private static final removeObserverLocked onNavigationEvent(handleNativeAdClick.onNavigationEvent onnavigationevent, toMetersPerSecond tometerspersecond, handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        float fIntBitsToFloat;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        float fIAuthTabCallback = 2.0f * VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraInfo.onExtraCallbackWithResult(onnavigationevent.onExtraCallback()) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback));
        float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraInfo.onWarmupCompleted(onnavigationevent.onExtraCallback()) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback));
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        setDescription.onWarmupCompleted(removetimestampOnWarmupCompleted, tometerspersecond.IAuthTabCallback(setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback3)) & 4294967295L) | (Float.floatToRawIntBits(sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback2)) << 32)), sessionProcessorCaptureCallback.onExtraCallback(), sessionProcessorCaptureCallback));
        final removeTimestamp removetimestampOnWarmupCompleted2 = getMappingAreaSize.onWarmupCompleted();
        float fIntBitsToFloat2 = 0.0f;
        if (onextracallbackwithresult.onNavigationEvent() > 0.0f) {
            int i4 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i4 % 128;
            fIntBitsToFloat = i4 % 2 == 0 ? Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() << 64)) * sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback2) : Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32)) - sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback2);
        } else {
            fIntBitsToFloat = 0.0f;
        }
        if (onextracallbackwithresult.onExtraCallbackWithResult() > 0.0f) {
            int i5 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            fIntBitsToFloat2 = Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()) - sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback3);
            int i7 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        removetimestampOnWarmupCompleted2.onWarmupCompleted(removetimestampOnWarmupCompleted, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat + (sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onWarmupCompleted(onnavigationevent.onExtraCallbackWithResult()) + r1)) * onextracallbackwithresult.onNavigationEvent())) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2 + (sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(onnavigationevent.onExtraCallbackWithResult()) + r1)) * onextracallbackwithresult.onExtraCallbackWithResult())) & 4294967295L)));
        return sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda21
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 41;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnNavigationEvent = setMainImageUri.onNavigationEvent(removetimestampOnWarmupCompleted2, (setIso) obj);
                int i12 = IAuthTabCallback + 69;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
    }

    private static final Unit IAuthTabCallback(removeTimestamp removetimestamp, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        setOrientationDegrees.onWarmupCompleted(setiso, removetimestamp, setByteOrder.Companion.onNavigationEvent(), 0.0f, (hasMoreElements) null, (seek) null, readBoolean.Companion.onWarmupCompleted(), 28, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        boolean z = true;
        AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
                int i2 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2 == 0 ? 2 : 4;
                iIntValue |= i3;
            }
        }
        if ((iIntValue & 19) != 18) {
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(308903051, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.Shapes.<anonymous>.<anonymous> (TdsAssetV2.kt:884)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i9 != 0) {
                    int i10 = 34 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
            if ((iIntValue & 114) == 0) {
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i3 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 21 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(16517226, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.Shapes.<anonymous>.<anonymous> (TdsAssetV2.kt:889)");
                    int i5 = onNavigationEvent + 123;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
                getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue & 14) | 48));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue & 14) | 48));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1110084269);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1110084269);
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i4 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1110084269, i, -1, "im.toss.tds.compose.component.atom.asset.Shapes (TdsAssetV2.kt:861)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnExtraCallback, onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i6 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                objOnMinimized = getPhysicalCameraCharacteristics.onWarmupCompleted((getBacktraceNote) getPrivacyIconUri.onWarmupCompleted(-1711767460, new Object[]{getPrivacyIconUri.IAuthTabCallback}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1711767461, TossApplication.onSessionEnded.onExtraCallback()));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getBacktraceNote getbacktracenote = (getBacktraceNote) objOnMinimized;
            onExtraCallbackWithResult(null, handleNativeAdClick.onExtraCallback.asBinder.Companion.onExtraCallbackWithResult(), 0L, null, 0.0f, null, null, ForwardingCameraControl.onExtraCallback(-1382381278, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 21;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnNavigationEvent = setMainImageUri.onNavigationEvent(getbacktracenote, (AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = onWarmupCompleted + 89;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582960, 125);
            onExtraCallbackWithResult(null, handleNativeAdClick.onExtraCallback.IAuthTabCallback.Companion.onWarmupCompleted(), 0L, null, 0.0f, null, null, ForwardingCameraControl.onExtraCallback(308903051, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 39;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnWarmupCompleted = setMainImageUri.onWarmupCompleted(getbacktracenote, (AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = onExtraCallbackWithResult + 59;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582960, 125);
            onExtraCallbackWithResult(null, handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.Companion.asInterface(), 0L, null, 0.0f, null, null, ForwardingCameraControl.onExtraCallback(16517226, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda8
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 15;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitIAuthTabCallback = setMainImageUri.IAuthTabCallback(getbacktracenote, (AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = onNavigationEvent + 107;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582960, 125);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 13;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {Integer.valueOf(i11), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    int iOnWarmupCompleted = a.3.onWarmupCompleted();
                    Unit unit = (Unit) setMainImageUri.onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -1003209289, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 1003209293);
                    int i12 = IAuthTabCallback + 95;
                    onExtraCallbackWithResult = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unit;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(39188477, i, -1, "im.toss.tds.compose.component.atom.asset.Preview.<anonymous>.<anonymous>.<anonymous> (TdsAssetV2.kt:966)");
            }
            handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.Companion;
            List listListOf = CollectionsKt.listOf(new handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult[]{onwarmupcompleted.onExtraCallback(), onwarmupcompleted.onNavigationEvent(), onwarmupcompleted.onWarmupCompleted(), onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.onExtraCallbackWithResult(), onwarmupcompleted.asInterface()});
            int size = listListOf.size();
            for (int i5 = 0; i5 < size; i5++) {
                onExtraCallbackWithResult(null, (handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult) listListOf.get(i5), 0L, getbacktracenote, 0.0f, null, null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, 3072, 117);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-343802764, i, -1, "im.toss.tds.compose.component.atom.asset.Preview.<anonymous>.<anonymous>.<anonymous> (TdsAssetV2.kt:982)");
            }
            handleNativeAdClick.onExtraCallback.IAuthTabCallback.C0035onExtraCallback c0035onExtraCallback = handleNativeAdClick.onExtraCallback.IAuthTabCallback.Companion;
            List listListOf = CollectionsKt.listOf(new handleNativeAdClick.onExtraCallback.IAuthTabCallback[]{c0035onExtraCallback.onExtraCallback(), c0035onExtraCallback.onNavigationEvent(), c0035onExtraCallback.onExtraCallbackWithResult(), c0035onExtraCallback.IAuthTabCallback(), c0035onExtraCallback.onWarmupCompleted(), c0035onExtraCallback.asBinder()});
            int size = listListOf.size();
            int i5 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 < size; i7++) {
                onExtraCallbackWithResult(null, (handleNativeAdClick.onExtraCallback.IAuthTabCallback) listListOf.get(i7), 0L, getbacktracenote, 0.0f, null, null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, 3072, 117);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit asBinder(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1945673653, i, -1, "im.toss.tds.compose.component.atom.asset.Preview.<anonymous>.<anonymous>.<anonymous> (TdsAssetV2.kt:998)");
            }
            handleNativeAdClick.onExtraCallback.asInterface.onNavigationEvent onnavigationevent = handleNativeAdClick.onExtraCallback.asInterface.Companion;
            List listListOf = CollectionsKt.listOf(new handleNativeAdClick.onExtraCallback.asInterface[]{onnavigationevent.onNavigationEvent(), onnavigationevent.onWarmupCompleted(), onnavigationevent.onExtraCallback(), onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.IAuthTabCallback(), onnavigationevent.onTransact()});
            int size = listListOf.size();
            for (int i7 = 0; i7 < size; i7++) {
                onExtraCallbackWithResult(null, (handleNativeAdClick.onExtraCallback.asInterface) listListOf.get(i7), 0L, getbacktracenote, 0.0f, null, null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, 3072, 117);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        List list;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2 = 0;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[1];
        int i3 = 2;
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-59817226, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.Preview.<anonymous>.<anonymous>.<anonymous> (TdsAssetV2.kt:1014)");
            }
            handleNativeAdClick.onExtraCallback.asBinder.onNavigationEvent onnavigationevent = handleNativeAdClick.onExtraCallback.asBinder.Companion;
            List listListOf = CollectionsKt.listOf(new handleNativeAdClick.onExtraCallback.asBinder[]{onnavigationevent.onWarmupCompleted(), onnavigationevent.onExtraCallback(), onnavigationevent.onExtraCallbackWithResult()});
            int size = listListOf.size();
            while (i2 < size) {
                int i9 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i9 % 128;
                if (i9 % i3 != 0) {
                    i = size;
                    list = listListOf;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                    onExtraCallbackWithResult(null, (handleNativeAdClick.onExtraCallback.asBinder) listListOf.get(i2), 0L, getbacktracenote, 2.0f, null, null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult2, 5151, 86);
                    i2 += 113;
                } else {
                    i = size;
                    list = listListOf;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                    onExtraCallbackWithResult(null, (handleNativeAdClick.onExtraCallback.asBinder) list.get(i2), 0L, getbacktracenote, 0.0f, null, null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, 3072, 117);
                    i2++;
                }
                listListOf = list;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                size = i;
                i3 = 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 80) != 86;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2065308105, i, -1, "im.toss.tds.compose.component.atom.asset.Preview.<anonymous>.<anonymous>.<anonymous> (TdsAssetV2.kt:1028)");
            }
            onExtraCallbackWithResult(null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onExtraCallback(), 0L, null, 0.0f, null, null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 48, 125);
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f)), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 76) != 90) {
                int i4 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(224168312, i, -1, "im.toss.tds.compose.component.atom.asset.Preview.<anonymous>.<anonymous>.<anonymous> (TdsAssetV2.kt:1041)");
            }
            onExtraCallbackWithResult(null, (handleNativeAdClick.onExtraCallback.onWarmupCompleted) handleNativeAdClick.onExtraCallback.onWarmupCompleted.C0037onExtraCallback.IAuthTabCallback(zzgsa.onWarmupCompleted(), new Object[]{handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion}, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -521671473, zzgsa.onWarmupCompleted(), 521671473), 0L, null, 0.0f, null, null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 48, 125);
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-252636313);
        int i3 = 0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i4 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-252636313, i, -1, "im.toss.tds.compose.component.atom.asset.Preview (TdsAssetV2.kt:896)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = QuirkSettingsLoader.Companion.onTransact();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
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
                int i5 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
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
            getPrivacyIconUri getprivacyiconuri = getPrivacyIconUri.IAuthTabCallback;
            List listListOf = CollectionsKt.listOf(new getBacktraceNote[]{(getBacktraceNote) getPrivacyIconUri.onWarmupCompleted(1135623359, new Object[]{getprivacyiconuri}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1135623354, TossApplication.onSessionEnded.onExtraCallback()), getprivacyiconuri.IAuthTabCallback(), getprivacyiconuri.onWarmupCompleted(), getprivacyiconuri.IAuthTabCallbackStub()});
            final getBacktraceNote<setPrivacyIconUri, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteAsBinder = getprivacyiconuri.asBinder();
            final getBacktraceNote<setPrivacyIconUri, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnExtraCallbackWithResult = getprivacyiconuri.onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1118679378);
            int size = listListOf.size();
            while (i3 < size) {
                final getBacktraceNote getbacktracenote = (getBacktraceNote) listListOf.get(i3);
                onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(39188477, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda12
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Unit unitOnExtraCallback;
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 59;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            unitOnExtraCallback = setMainImageUri.onExtraCallback(getbacktracenoteOnExtraCallbackWithResult, getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i8 = 3 / 0;
                        } else {
                            unitOnExtraCallback = setMainImageUri.onExtraCallback(getbacktracenoteOnExtraCallbackWithResult, getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        int i9 = onExtraCallbackWithResult + 109;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-343802764, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda13
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 33;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            setMainImageUri.onExtraCallbackWithResult(getbacktracenoteAsBinder, getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = setMainImageUri.onExtraCallbackWithResult(getbacktracenoteAsBinder, getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i8 = onWarmupCompleted + 87;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1945673653, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda14
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 25;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr = {getbacktracenoteAsBinder, getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        int iOnWarmupCompleted = a.3.onWarmupCompleted();
                        Unit unit = (Unit) setMainImageUri.onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, 1965227354, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -1965227351);
                        int i9 = onNavigationEvent + 93;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 88 / 0;
                        }
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-59817226, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda15
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 77;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        getBacktraceNote getbacktracenote2 = getbacktracenoteOnExtraCallbackWithResult;
                        if (i8 != 0) {
                            return setMainImageUri.onWarmupCompleted(getbacktracenote2, getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        setMainImageUri.onWarmupCompleted(getbacktracenote2, getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-2065308105, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda16
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 33;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnExtraCallback = setMainImageUri.onExtraCallback(getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i9 = IAuthTabCallback + 59;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(224168312, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda17
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 1;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnNavigationEvent = setMainImageUri.onNavigationEvent(getbacktracenote, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i9 = onNavigationEvent + 109;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 41 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                i3++;
                int i6 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 4;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda18
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        setMainImageUri.onWarmupCompleted(i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = setMainImageUri.onWarmupCompleted(i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = onNavigationEvent + 93;
                    onExtraCallbackWithResult = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 33 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    private static final void onExtraCallback(final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1607871889);
        if ((i & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote);
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1607871889, i2, -1, "im.toss.tds.compose.component.atom.asset.PreviewRow (TdsAssetV2.kt:1057)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnExtraCallback, onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
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
                int i7 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            getbacktracenote.invoke(RowScopeInstance.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((((((i2 << 9) & 7168) | 432) >> 6) & 112) | 6));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda11
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 11;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    getBacktraceNote getbacktracenote2 = getbacktracenote;
                    if (i11 == 0) {
                        return setMainImageUri.onNavigationEvent(getbacktracenote2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    setMainImageUri.onNavigationEvent(getbacktracenote2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            });
            int i9 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1304050794);
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1304050794, i, -1, "im.toss.tds.compose.component.atom.asset.ContentScalePreview (TdsAssetV2.kt:1067)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i5 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    int i6 = 93 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
                int i7 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            getPrivacyIconUri getprivacyiconuri = getPrivacyIconUri.IAuthTabCallback;
            onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getprivacyiconuri.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            onExtraCallback((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getprivacyiconuri.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV2Kt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                    if (i11 == 0) {
                        return setMainImageUri.IAuthTabCallback(i12, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj2).intValue());
                    }
                    setMainImageUri.IAuthTabCallback(i12, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull handleNativeAdClick.onExtraCallback onextracallback) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraInfo.onExtraCallbackWithResult(onextracallback.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.Companion.onNavigationEvent());
            throw null;
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        float fOnExtraCallbackWithResult = VirtualCameraInfo.onExtraCallbackWithResult(onextracallback.onWarmupCompleted());
        VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = VirtualCameraControlExternalSyntheticLambda1.Companion;
        if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent())) {
            int i3 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i3 % 128;
            quirksExternalSyntheticBackport0AsBinder = i3 % 2 == 0 ? ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 1.0f, 1, (Object) null) : ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
        } else {
            quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, VirtualCameraInfo.onExtraCallbackWithResult(onextracallback.onWarmupCompleted()));
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0AsBinder);
        if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraInfo.onWarmupCompleted(onextracallback.onWarmupCompleted()), onextracallbackwithresult.onNavigationEvent())) {
            int i4 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
        } else {
            quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraInfo.onWarmupCompleted(onextracallback.onWarmupCompleted()));
        }
        return quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Object obj, deprecated_eventListenerFactory deprecated_eventlistenerfactory, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {obj, deprecated_eventlistenerfactory, Long.valueOf(j), Integer.valueOf(i), Float.valueOf(f), onwarmupcompleted, str, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -482409154, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 482409164);
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, getbacktracenote2, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, 1965227354, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -1965227351);
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -1003209289, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 1003209293);
    }

    public static /* synthetic */ Unit IAuthTabCallback(handleNativeAdClick.onExtraCallback onextracallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, getBacktraceNote getbacktracenote, long j, float f, Function0 function0, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallback, quirksExternalSyntheticBackport0, str, getbacktracenote, Long.valueOf(j), Float.valueOf(f), function0, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -843001833, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 843001841);
    }

    private static final Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, 606575622, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -606575616);
    }

    private static final Unit onTransact(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, getbacktracenote2, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, 2101223444, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -2101223439);
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, 518230978, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -518230978);
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -1313008869, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 1313008878);
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -1574146244, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 1574146245);
    }

    private static final Unit onTransact(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, 1440808572, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, -1440808570);
    }

    public static final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable handleNativeAdClick.onExtraCallback onextracallback, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j3, @Nullable getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, float f, @Nullable Function0<Unit> function0, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        Object[] objArr = {str, quirksExternalSyntheticBackport0, onextracallback, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, Long.valueOf(j3), getbacktracenote, Float.valueOf(f), function0, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        onExtraCallbackWithResult(a.3.onWarmupCompleted(), objArr, -546537532, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted, 546537539);
    }
}
