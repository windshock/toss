package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.atom.asset.TdsAssetV1Kt$;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.forceDomainCheck;
import o.getPrivacyDestinationUri;
import o.setIconUri;
import o.setIso;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setIconUri {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i6)) | i4;
        int i9 = ~i6;
        int i10 = i7 | i4;
        int i11 = (~(i2 | i9 | i4)) | (~(i10 | i6));
        int i12 = (~i10) | (~(i9 | (~i4)));
        int i13 = i4 + i6 + i3 + (1353909401 * i5) + ((-1351514252) * i);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i4) + 799145984 + ((-1483212659) * i6) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i3) + (337379328 * i5) + ((-1540358144) * i) + (669122560 * i14);
        int i16 = ((i4 * 521834465) - 1171472169) + (i6 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (521834041 * i3) + (1123214353 * i5) + ((-684621612) * i) + (i14 * 1028784128);
        int i17 = 5;
        switch (i15 + (i16 * i16 * 1635647488)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = (getPrivacyDestinationUri.onExtraCallbackWithResult) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
                String str = (String) objArr[3];
                Function1 function1 = (Function1) objArr[4];
                long jLongValue = ((Number) objArr[5]).longValue();
                float fFloatValue = ((Number) objArr[6]).floatValue();
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[7];
                getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[8];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
                int iIntValue = ((Number) objArr[10]).intValue();
                int i18 = 2 % 2;
                int i19 = onNavigationEvent + 97;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, function0, quirksExternalSyntheticBackport0, str, function1, jLongValue, fFloatValue, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i21 = onWarmupCompleted + 53;
                onNavigationEvent = i21 % 128;
                int i22 = i21 % 2;
                return unitIAuthTabCallback;
            case 4:
                getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[0];
                AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i23 = 2 % 2;
                Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                if ((iIntValue2 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                        int i24 = onNavigationEvent + 79;
                        onWarmupCompleted = i24 % 128;
                        if (i24 % 2 != 0) {
                            i17 = 4;
                        }
                    } else {
                        i17 = 2;
                    }
                    iIntValue2 |= i17;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1341012647, iIntValue2, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:768)");
                    }
                    getbacktracenote3.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((iIntValue2 & 14) | 48));
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                Unit unit = Unit.INSTANCE;
                int i25 = onNavigationEvent + 75;
                onWarmupCompleted = i25 % 128;
                int i26 = i25 % 2;
                return unit;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnMinimized = onMinimized(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 22 / 0;
        }
        int i6 = onWarmupCompleted + 95;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnMinimized;
    }

    private static final Unit IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, long j, float f, Function1 function1, Function0 function0, String str, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(onextracallbackwithresult, quirksExternalSyntheticBackport0, getbacktracenote, j, f, function1, function0, str, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 27;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setUpNativeAdViewComponents setupnativeadviewcomponents, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback5 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback6 = forceDomainCheck.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback5, -1899939257, new Object[]{getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iIAuthTabCallback6, 1899939261);
        int i5 = onWarmupCompleted + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWriteTypedObject = writeTypedObject(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 54 / 0;
        }
        int i6 = onNavigationEvent + 73;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitExtraCallbackWithResult;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 2039951386, objArr2, forceDomainCheck.IAuthTabCallback(), -2039951379);
        int i4 = onWarmupCompleted + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit asBinder(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1101398817, objArr, forceDomainCheck.IAuthTabCallback(), -1101398817);
        int i5 = onWarmupCompleted + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 31;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(str, useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, useandconfigureprogramwithtexture);
        int i3 = onNavigationEvent + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback5 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback6 = forceDomainCheck.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback5, 1515744752, new Object[]{getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iIAuthTabCallback6, -1515744742);
        int i5 = onNavigationEvent + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, long j, float f, Function1 function1, Function0 function0, String str, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return IAuthTabCallback(onextracallbackwithresult, quirksExternalSyntheticBackport0, getbacktracenote, j, f, function1, function0, str, getbacktracenote2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(onextracallbackwithresult, quirksExternalSyntheticBackport0, getbacktracenote, j, f, function1, function0, str, getbacktracenote2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onMessageChannelReady(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnMessageChannelReady = onMessageChannelReady(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnMessageChannelReady;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 93;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 175278851, new Object[]{function0}, iIAuthTabCallback3, -175278843);
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 53;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getPrivacyDestinationUri.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, setUpNativeAdViewComponents setupnativeadviewcomponents, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(iAuthTabCallback, getbacktracenote, setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(iAuthTabCallback, getbacktracenote, setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, immediateFailedFuture immediatefailedfuture, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -2076308435, new Object[]{onextracallbackwithresult, immediatefailedfuture, highSpeedResolverExternalSyntheticLambda2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, forceDomainCheck.IAuthTabCallback(), 2076308436);
        int i5 = onWarmupCompleted + 121;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 119;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback_Parcel(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback_Parcel(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onNavigationEvent(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, getPrivacyDestinationUri.IAuthTabCallback iAuthTabCallback, toMetersPerSecond tometerspersecond, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackwithresult, iAuthTabCallback, tometerspersecond, sessionProcessorCaptureCallback);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        int i5 = onWarmupCompleted + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onTransact(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1822309492, objArr, forceDomainCheck.IAuthTabCallback(), 1822309494);
        int i5 = onWarmupCompleted + 77;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 13;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallback = extraCallback(getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(removeTimestamp removetimestamp, setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(removetimestamp, setiso);
        int i4 = onWarmupCompleted + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setUpNativeAdViewComponents setupnativeadviewcomponents, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, @NotNull getBacktraceNote<? super HighSpeedResolverExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getPrivacyDestinationUri.IAuthTabCallback iAuthTabCallback, @Nullable toMetersPerSecond tometerspersecond, long j, float f, @Nullable Function0<Unit> function0, @Nullable String str, @NotNull getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        getPrivacyDestinationUri.IAuthTabCallback IAuthTabCallback2;
        toMetersPerSecond tometerspersecond2;
        Function1 function1;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 8) != 0) {
            IAuthTabCallback2 = getPrivacyDestinationUri.IAuthTabCallback.Companion.IAuthTabCallback();
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            IAuthTabCallback2 = iAuthTabCallback;
        }
        if ((i2 & 16) != 0) {
            tometerspersecond2 = null;
        } else {
            int i6 = onWarmupCompleted + 95;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            tometerspersecond2 = tometerspersecond;
        }
        long jOnWarmupCompleted = (i2 & 32) != 0 ? getVastAd.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6) : j;
        float fIAuthTabCallback = (i2 & 64) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
        Function0<Unit> function02 = (i2 & 128) != 0 ? null : function0;
        String str2 = (i2 & 256) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-772778645, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV1 (TdsAssetV1.kt:79)");
        }
        if (tometerspersecond2 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-823079554);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            function1 = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-823079553);
            boolean z = (((i & 14) ^ 6) > 4 && !(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult) ^ true)) || (i & 6) == 4;
            if (((i & 7168) ^ 3072) > 2048) {
                int i8 = onWarmupCompleted + 11;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(IAuthTabCallback2)) {
                    boolean z2 = (i & 3072) == 2048;
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tometerspersecond2);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent | z | z2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new TdsAssetV1Kt$.ExternalSyntheticLambda22(onextracallbackwithresult, IAuthTabCallback2, tometerspersecond2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    function1 = (Function1) objOnMinimized;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
        }
        int i10 = i >> 3;
        int i11 = i >> 6;
        onExtraCallbackWithResult(onextracallbackwithresult, quirksExternalSyntheticBackport02, ForwardingCameraControl.onExtraCallback(385769844, true, new TdsAssetV1Kt$.ExternalSyntheticLambda23(IAuthTabCallback2, getbacktracenote), cameraCaptureResultEmptyCameraCaptureResult, 54), jOnWarmupCompleted, fIAuthTabCallback, function1, function02, str2, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 384 | (i10 & 112) | (i11 & 7168) | (57344 & i11) | (3670016 & i10) | (29360128 & i10) | (i10 & 234881024), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getPrivacyDestinationUri.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, setUpNativeAdViewComponents setupnativeadviewcomponents, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setupnativeadviewcomponents, "");
        boolean z = true;
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setupnativeadviewcomponents)) {
                int i3 = onNavigationEvent + 1;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2 == 0 ? 2 : 4;
                i |= i4;
            }
        }
        if ((i & 19) != 18) {
            int i5 = onWarmupCompleted;
            int i6 = i5 + 45;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 113;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 2;
            }
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(385769844, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV1.<anonymous> (TdsAssetV1.kt:83)");
            }
            setupnativeadviewcomponents.IAuthTabCallback(iAuthTabCallback, (getBacktraceNote<? super HighSpeedResolverExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 896, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final removeObserverLocked onExtraCallbackWithResult(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, getPrivacyDestinationUri.IAuthTabCallback iAuthTabCallback, toMetersPerSecond tometerspersecond, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            return (removeObserverLocked) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 614401623, new Object[]{sessionProcessorCaptureCallback, onextracallbackwithresult, iAuthTabCallback, tometerspersecond}, iIAuthTabCallback3, -614401617);
        }
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback5 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback6 = forceDomainCheck.IAuthTabCallback();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        float fIntBitsToFloat;
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[0];
        getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = (getPrivacyDestinationUri.onExtraCallbackWithResult) objArr[1];
        getPrivacyDestinationUri.IAuthTabCallback iAuthTabCallback = (getPrivacyDestinationUri.IAuthTabCallback) objArr[2];
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[3];
        int i = 2 % 2;
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
        float f = 2.0f * fIAuthTabCallback;
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(onextracallbackwithresult.onNavigationEvent().onWarmupCompleted() + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f));
        float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(onextracallbackwithresult.onNavigationEvent().IAuthTabCallback() + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f));
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        float fOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback2);
        setDescription.onWarmupCompleted(removetimestampOnWarmupCompleted, tometerspersecond.IAuthTabCallback(setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback3)) & 4294967295L) | (Float.floatToRawIntBits(fOnExtraCallback) << 32)), sessionProcessorCaptureCallback.onExtraCallback(), sessionProcessorCaptureCallback));
        final removeTimestamp removetimestampOnWarmupCompleted2 = getMappingAreaSize.onWarmupCompleted();
        float fIntBitsToFloat2 = 0.0f;
        if (iAuthTabCallback.onExtraCallback() > 0.0f) {
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32)) - sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback2);
        } else {
            int i4 = onNavigationEvent + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            fIntBitsToFloat = 0.0f;
        }
        if (iAuthTabCallback.onTransact() > 0.0f) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()) - sessionProcessorCaptureCallback.onExtraCallback(fIAuthTabCallback3);
            int i6 = onNavigationEvent + 47;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        float fOnExtraCallback2 = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onWarmupCompleted(onextracallbackwithresult.onNavigationEvent().onExtraCallbackWithResult()) + fIAuthTabCallback));
        float fOnExtraCallback3 = iAuthTabCallback.onExtraCallback();
        float fOnExtraCallback4 = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(onextracallbackwithresult.onNavigationEvent().onExtraCallbackWithResult()) + fIAuthTabCallback));
        float fOnTransact = iAuthTabCallback.onTransact();
        removetimestampOnWarmupCompleted2.onWarmupCompleted(removetimestampOnWarmupCompleted, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2 + (fOnExtraCallback4 * fOnTransact)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat + (fOnExtraCallback2 * fOnExtraCallback3)) << 32)));
        return sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV1Kt$$ExternalSyntheticLambda16
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnWarmupCompleted = setIconUri.onWarmupCompleted(removetimestampOnWarmupCompleted2, (setIso) obj);
                int i11 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        });
    }

    private static final Unit onExtraCallback(removeTimestamp removetimestamp, setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        setOrientationDegrees.onWarmupCompleted(setiso, removetimestamp, setByteOrder.Companion.onNavigationEvent(), 0.0f, (hasMoreElements) null, (seek) null, readBoolean.Companion.onWarmupCompleted(), 28, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void IAuthTabCallback(@NotNull getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, long j, float f, @Nullable Function0<Unit> function0, @Nullable String str, @NotNull getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        long jOnWarmupCompleted;
        Function0<Unit> function02;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        if ((i2 & 2) != 0) {
            int i4 = onNavigationEvent + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                int i5 = 43 / 0;
            } else {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i6 = onWarmupCompleted + 43;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            getbacktracenote3 = null;
        } else {
            getbacktracenote3 = getbacktracenote;
        }
        if ((i2 & 8) != 0) {
            int i8 = onWarmupCompleted + 49;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            jOnWarmupCompleted = getVastAd.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6);
        } else {
            jOnWarmupCompleted = j;
        }
        float fIAuthTabCallback = (i2 & 16) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
        if ((i2 & 32) != 0) {
            int i10 = onWarmupCompleted + 113;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            function02 = null;
        } else {
            function02 = function0;
        }
        String str2 = (i2 & 64) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = onWarmupCompleted + 93;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2072766178, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV1 (TdsAssetV1.kt:156)");
        }
        int i13 = i << 3;
        onExtraCallbackWithResult(onextracallbackwithresult, quirksExternalSyntheticBackport02, getbacktracenote3, jOnWarmupCompleted, fIAuthTabCallback, null, function02, str2, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, (i & 57344) | (i & 14) | 196608 | (i & 112) | (i & 896) | (i & 7168) | (3670016 & i13) | (29360128 & i13) | (i13 & 234881024), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            int i3 = 44 / 0;
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (str != null) {
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    static final class IAuthTabCallback implements Function1<flipHorizontally, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = onExtraCallback + 119;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((flipHorizontally) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallbackWithResult(flipHorizontally fliphorizontally) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(fliphorizontally, "");
                fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
                throw null;
            }
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
            int i3 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        boolean zOnNavigationEvent3;
        getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = (getPrivacyDestinationUri.onExtraCallbackWithResult) objArr[0];
        boolean z = true;
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[1];
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2 = (HighSpeedResolverExternalSyntheticLambda2) objArr[2];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0 ? (iIntValue & 3) == 2 : (iIntValue & 5) == 4) {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i3 = onNavigationEvent + 101;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-926005098, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:239)");
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(immediatefailedfuture);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3) {
                    int i5 = onNavigationEvent + 41;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new AppLovinNativeAdImplExternalSyntheticLambda1(onextracallbackwithresult, immediatefailedfuture, highSpeedResolverExternalSyntheticLambda2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    getbacktracenote.invoke((AppLovinNativeAdImplExternalSyntheticLambda1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(immediatefailedfuture);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, final Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final String str, Function1 function1, long j, float f, getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        boolean zOnNavigationEvent2;
        int i2;
        int i3;
        int i4 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = onNavigationEvent + 17;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 54 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-4832914, i, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV1.<anonymous> (TdsAssetV1.kt:185)");
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    if (!(onextracallbackwithresult instanceof getPrivacyDestinationUri.onExtraCallbackWithResult.C0021onExtraCallbackWithResult)) {
                        immediatefailedfutureIAuthTabCallback = !Float.isNaN(((getPrivacyDestinationUri.onExtraCallbackWithResult.C0021onExtraCallbackWithResult) onextracallbackwithresult).IAuthTabCallback()) ? immediateFailedFuture.Companion.onExtraCallbackWithResult() : immediateFailedFuture.Companion.onExtraCallback();
                    } else if (!Float.isNaN(onextracallbackwithresult.IAuthTabCallback()) || Float.isNaN(onextracallbackwithresult.onExtraCallbackWithResult())) {
                        immediatefailedfutureIAuthTabCallback = (Float.isNaN(onextracallbackwithresult.IAuthTabCallback()) || !Float.isNaN(onextracallbackwithresult.onExtraCallbackWithResult())) ? immediateFailedFuture.Companion.IAuthTabCallback() : immediateFailedFuture.Companion.onExtraCallbackWithResult();
                    } else {
                        immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.onExtraCallback();
                        int i7 = onNavigationEvent + 45;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    objOnMinimized = immediatefailedfutureIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                final immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objOnMinimized;
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent2) {
                    int i9 = onWarmupCompleted + 71;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = function0 != null ? measureChildConstrained.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted(), (getSubtitle) null, false, (String) null, (Role) null, new Function0() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV1Kt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i11 = 2 % 2;
                                int i12 = onNavigationEvent + 69;
                                IAuthTabCallback = i12 % 128;
                                int i13 = i12 % 2;
                                Unit unitOnExtraCallbackWithResult = setIconUri.onExtraCallbackWithResult(function0);
                                if (i13 != 0) {
                                    int i14 = 69 / 0;
                                }
                                return unitOnExtraCallbackWithResult;
                            }
                        }, 28, (Object) null) : QuirksExternalSyntheticBackport0.Companion;
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objOnMinimized2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV1Kt$$ExternalSyntheticLambda1
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj) {
                                int i11 = 2 % 2;
                                int i12 = onWarmupCompleted + 47;
                                onExtraCallbackWithResult = i12 % 128;
                                int i13 = i12 % 2;
                                Unit unitOnExtraCallback = setIconUri.onExtraCallback(str, (useAndConfigureProgramWithTexture) obj);
                                int i14 = onExtraCallbackWithResult + 77;
                                onWarmupCompleted = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i15 = 47 / 0;
                                }
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized3);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                    final HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(onextracallback, onextracallbackwithresult.IAuthTabCallback(), onextracallbackwithresult.onExtraCallbackWithResult());
                    if (function1 != null) {
                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult = quirksExternalSyntheticBackport0OnExtraCallbackWithResult.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(attachTimestamp.IAuthTabCallback(onextracallback, IAuthTabCallback.onWarmupCompleted), function1));
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = setExtensionStrength.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, j, onextracallbackwithresult.onWarmupCompleted()), f), onextracallbackwithresult.onWarmupCompleted()).onExtraCallback(quirksExternalSyntheticBackport02);
                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        i3 = 0;
                        i2 = 2;
                    } else {
                        int i11 = onNavigationEvent + 45;
                        onWarmupCompleted = i11 % 128;
                        i2 = 2;
                        if (i11 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                            i3 = 0;
                            int i12 = 53 / 0;
                        } else {
                            i3 = 0;
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                        }
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                    int i13 = i3;
                    int i14 = i2;
                    putCharSequence.onExtraCallback(getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), getVastAd.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null), null, null, null, null, false, ForwardingCameraControl.onExtraCallback(-926005098, true, new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV1Kt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            Unit unitOnExtraCallbackWithResult;
                            int i15 = 2 % 2;
                            int i16 = IAuthTabCallback + 77;
                            onNavigationEvent = i16 % 128;
                            if (i16 % 2 == 0) {
                                unitOnExtraCallbackWithResult = setIconUri.onExtraCallbackWithResult(onextracallbackwithresult, immediatefailedfuture, highSpeedResolverExternalSyntheticLambda1, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i17 = 27 / 0;
                            } else {
                                unitOnExtraCallbackWithResult = setIconUri.onExtraCallbackWithResult(onextracallbackwithresult, immediatefailedfuture, highSpeedResolverExternalSyntheticLambda1, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            int i18 = onNavigationEvent + 35;
                            IAuthTabCallback = i18 % 128;
                            int i19 = i18 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 62);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent4 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = new setUpNativeAdViewComponents(onextracallbackwithresult, highSpeedResolverExternalSyntheticLambda1);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    setUpNativeAdViewComponents setupnativeadviewcomponents = (setUpNativeAdViewComponents) objOnMinimized4;
                    if (getbacktracenote != null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1332303801);
                        getbacktracenote.invoke(setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i13));
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i15 = onWarmupCompleted + 5;
                        onNavigationEvent = i15 % 128;
                        int i16 = i15 % i14;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1332254790);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i17 = onWarmupCompleted + 5;
                        onNavigationEvent = i17 % 128;
                        if (i17 % i14 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i18 = 39 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent) {
                    if (!(onextracallbackwithresult instanceof getPrivacyDestinationUri.onExtraCallbackWithResult.C0021onExtraCallbackWithResult)) {
                    }
                    objOnMinimized = immediatefailedfutureIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    final immediateFailedFuture immediatefailedfuture2 = (immediateFailedFuture) objOnMinimized;
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent2) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, long j, float f, @Nullable final Function1<? super SessionProcessorCaptureCallback, removeObserverLocked> function1, @Nullable Function0<Unit> function0, @Nullable String str, @NotNull final getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        final float f2;
        final String str2;
        final long j3;
        final Function0<Unit> function02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        long jOnWarmupCompleted;
        Function0<Unit> function03;
        Function0<Unit> function04;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        String str3;
        getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        long j4;
        float f3;
        int i10;
        int i11;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2050909739);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult)) {
                int i13 = onWarmupCompleted + 39;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                        int i16 = onWarmupCompleted + 69;
                        onNavigationEvent = i16 % 128;
                        i5 = i16 % 2 != 0 ? 26932 : 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        int i17 = onNavigationEvent + 91;
                        onWarmupCompleted = i17 % 128;
                        int i18 = i17 % 2;
                        j2 = j;
                        int i19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 2048 : 1024;
                        i3 |= i19;
                    } else {
                        j2 = j;
                    }
                    i3 |= i19;
                } else {
                    j2 = j;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        int i20 = onWarmupCompleted + 73;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        i7 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 8192 : 16384) | i3;
                    }
                    if ((196608 & i) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                            int i22 = onWarmupCompleted + 79;
                            onNavigationEvent = i22 % 128;
                            int i23 = i22 % 2;
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i7 |= i10;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        int i24 = onNavigationEvent + 27;
                        onWarmupCompleted = i24 % 128;
                        int i25 = i24 % 2;
                        i7 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 == 0) {
                            if ((i & 12582912) == 0) {
                                z = true;
                                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true ? 4194304 : 8388608;
                            }
                            if ((i & 100663296) == 0) {
                                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 67108864 : 33554432;
                            }
                            if ((i7 & 38347923) == 38347922) {
                                int i26 = onNavigationEvent + 75;
                                onWarmupCompleted = i26 % 128;
                                int i27 = i26 % 2;
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                getbacktracenote3 = getbacktracenote;
                                f2 = f;
                                str2 = str;
                                j3 = j2;
                                function02 = function0;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i15 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    if (i4 != 0) {
                                        int i28 = onNavigationEvent + 3;
                                        onWarmupCompleted = i28 % 128;
                                        int i29 = i28 % 2;
                                        getbacktracenote4 = null;
                                    } else {
                                        getbacktracenote4 = getbacktracenote;
                                    }
                                    if ((i2 & 8) != 0) {
                                        jOnWarmupCompleted = getVastAd.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        i7 &= -7169;
                                    } else {
                                        jOnWarmupCompleted = j2;
                                    }
                                    float fIAuthTabCallback = i6 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
                                    if (i8 != 0) {
                                        int i30 = onNavigationEvent + 99;
                                        onWarmupCompleted = i30 % 128;
                                        int i31 = i30 % 2;
                                        function03 = null;
                                    } else {
                                        function03 = function0;
                                    }
                                    function04 = function03;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                    str3 = i9 == 0 ? str : null;
                                    getbacktracenote5 = getbacktracenote4;
                                    j4 = jOnWarmupCompleted;
                                    f3 = fIAuthTabCallback;
                                } else {
                                    int i32 = onWarmupCompleted + 109;
                                    onNavigationEvent = i32 % 128;
                                    int i33 = i32 % 2;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i2 & 8) != 0) {
                                        i7 &= -7169;
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    getbacktracenote5 = getbacktracenote;
                                    f3 = f;
                                    function04 = function0;
                                    str3 = str;
                                    j4 = j2;
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2050909739, i7, -1, "im.toss.tds.compose.component.atom.asset.TdsAssetV1 (TdsAssetV1.kt:183)");
                                }
                                final Function0<Unit> function05 = function04;
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                final String str4 = str3;
                                final long j5 = j4;
                                final float f4 = f3;
                                final getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = getbacktracenote5;
                                putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onExtraCallback(), null, null, ForwardingCameraControl.onExtraCallback(-4832914, z, new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV1Kt$$ExternalSyntheticLambda3
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i34 = 2 % 2;
                                        int i35 = onNavigationEvent + 31;
                                        onExtraCallback = i35 % 128;
                                        int i36 = i35 % 2;
                                        getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                                        Function0 function06 = function05;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                                        String str5 = str4;
                                        Function1 function12 = function1;
                                        long j6 = j5;
                                        float f5 = f4;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        Object[] objArr = {onextracallbackwithresult2, function06, quirksExternalSyntheticBackport06, str5, function12, Long.valueOf(j6), Float.valueOf(f5), getbacktracenote6, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                                        Unit unit = (Unit) setIconUri.IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -498600319, objArr, forceDomainCheck.IAuthTabCallback(), 498600322);
                                        int i37 = onExtraCallback + 67;
                                        onNavigationEvent = i37 % 128;
                                        if (i37 % 2 != 0) {
                                            int i38 = 37 / 0;
                                        }
                                        return unit;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 6);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                getbacktracenote3 = getbacktracenote5;
                                j3 = j4;
                                f2 = f3;
                                function02 = function04;
                                str2 = str3;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.TdsAssetV1Kt$$ExternalSyntheticLambda4
                                    private static int onNavigationEvent = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i34 = 2 % 2;
                                        int i35 = onNavigationEvent + 85;
                                        onWarmupCompleted = i35 % 128;
                                        int i36 = i35 % 2;
                                        Unit unitOnExtraCallback = setIconUri.onExtraCallback(onextracallbackwithresult, quirksExternalSyntheticBackport02, getbacktracenote3, j3, f2, function1, function02, str2, getbacktracenote2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i37 = onNavigationEvent + 95;
                                        onWarmupCompleted = i37 % 128;
                                        if (i37 % 2 == 0) {
                                            int i38 = 17 / 0;
                                        }
                                        return unitOnExtraCallback;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= 12582912;
                        z = true;
                        if ((i & 100663296) == 0) {
                        }
                        if ((i7 & 38347923) == 38347922) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                    }
                    z = true;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i7 & 38347923) == 38347922) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i7 = i3;
                if ((196608 & i) == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                z = true;
                if ((i & 100663296) == 0) {
                }
                if ((i7 & 38347923) == 38347922) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            if ((i & 3072) == 0) {
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            i7 = i3;
            if ((196608 & i) == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            z = true;
            if ((i & 100663296) == 0) {
            }
            if ((i7 & 38347923) == 38347922) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        i7 = i3;
        if ((196608 & i) == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        z = true;
        if ((i & 100663296) == 0) {
        }
        if ((i7 & 38347923) == 38347922) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((iIntValue & 38) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    int i4 = onNavigationEvent + 75;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    i = 4;
                } else {
                    i = 2;
                }
                iIntValue |= i;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1090025244, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.Shapes.<anonymous>.<anonymous> (TdsAssetV1.kt:652)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue & 14) | 48));
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onWarmupCompleted + 125;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i7 != 0) {
                    int i8 = 43 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onWarmupCompleted + 113;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i5 = onNavigationEvent + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onNavigationEvent + 37;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2118776845, i, -1, "im.toss.tds.compose.component.atom.asset.Shapes.<anonymous>.<anonymous> (TdsAssetV1.kt:657)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit getInterfaceDescriptor(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 26) == 0) {
                int i5 = onWarmupCompleted + 3;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    int i7 = onNavigationEvent + 73;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 6) == 0) {
            }
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i9 = onNavigationEvent + 125;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                z = true;
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1826391020, i, -1, "im.toss.tds.compose.component.atom.asset.Shapes.<anonymous>.<anonymous> (TdsAssetV1.kt:662)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onWarmupCompleted + 13;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i;
        boolean z = false;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onWarmupCompleted + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                int i5 = onWarmupCompleted + 15;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i7 = onNavigationEvent + 47;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i9 = onWarmupCompleted + 91;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1534005195, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.Shapes.<anonymous>.<anonymous> (TdsAssetV1.kt:667)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r0
      0x0032: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0025, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r0
      0x0027: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0025, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1110054478);
            int i4 = 65 / 0;
            if (i != 0) {
                int i5 = onWarmupCompleted + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1110054478);
            if (i != 0) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1110054478, i, -1, "im.toss.tds.compose.component.atom.asset.Shapes (TdsAssetV1.kt:635)");
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
                int i7 = onNavigationEvent + 99;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                int i9 = onNavigationEvent + 23;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
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
                objOnMinimized = getPhysicalCameraCharacteristics.onWarmupCompleted(getCustomTabsSession.onNavigationEvent.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getBacktraceNote getbacktracenote = (getBacktraceNote) objOnMinimized;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0L, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1090025244, true, new TdsAssetV1Kt$.ExternalSyntheticLambda17(getbacktracenote), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 12582918, 126);
            IAuthTabCallback((getPrivacyDestinationUri.onExtraCallbackWithResult) getPrivacyDestinationUri.onExtraCallbackWithResult.onWarmupCompleted.Companion.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0L, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(2118776845, true, new TdsAssetV1Kt$.ExternalSyntheticLambda18(getbacktracenote), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 12582918, 126);
            IAuthTabCallback((getPrivacyDestinationUri.onExtraCallbackWithResult) getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallback.Companion.onNavigationEvent(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0L, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1826391020, true, new TdsAssetV1Kt$.ExternalSyntheticLambda19(getbacktracenote), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 12582918, 126);
            IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, 0L, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1534005195, true, new TdsAssetV1Kt$.ExternalSyntheticLambda20(getbacktracenote), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 12582918, 126);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsAssetV1Kt$.ExternalSyntheticLambda21(i));
        }
    }

    private static final void onExtraCallbackWithResult(setUpNativeAdViewComponents setupnativeadviewcomponents, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-810397631, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.acc (TdsAssetV1.kt:677)");
            int i3 = onNavigationEvent + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        setupnativeadviewcomponents.IAuthTabCallback((getPrivacyDestinationUri.IAuthTabCallback) null, getCustomTabsSession.onNavigationEvent.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 48, 1);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onNavigationEvent + 45;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void asInterface(setUpNativeAdViewComponents setupnativeadviewcomponents, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jExtraCallback;
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 69;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1875511877, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.overlap (TdsAssetV1.kt:689)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1875511877, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.overlap (TdsAssetV1.kt:689)");
                throw null;
            }
        }
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
            int i4 = onWarmupCompleted + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1519353699);
            jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i5 != 0 ? 113 : 6).ICustomTabsCallback();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1519354691);
            jExtraCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i6 = onWarmupCompleted;
        int i7 = i6 + 107;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 89;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            setupnativeadviewcomponents.onExtraCallback(jExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, (i << 4) & 72);
            if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                return;
            }
        } else {
            setupnativeadviewcomponents.onExtraCallback(jExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
            if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                return;
            }
        }
        int i10 = onNavigationEvent + 77;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    private static final Unit onNavigationEvent(setUpNativeAdViewComponents setupnativeadviewcomponents, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setupnativeadviewcomponents, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setupnativeadviewcomponents) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i3 = onNavigationEvent + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 4;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 79;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1168712312, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:694)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1168712312, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:694)");
            }
            onExtraCallbackWithResult(setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, i & 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onNavigationEvent + 13;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(setUpNativeAdViewComponents setupnativeadviewcomponents, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setupnativeadviewcomponents, "");
            if ((i & 87) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setupnativeadviewcomponents)) {
                    int i5 = onWarmupCompleted + 119;
                    onNavigationEvent = i5 % 128;
                    i2 = i5 % 2 != 0 ? 3 : 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(setupnativeadviewcomponents, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 49;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(417163159, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:695)");
            }
            asInterface(setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, i & 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 121;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i9 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit extraCallbackWithResult(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 93) == 0) {
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i6 = onWarmupCompleted + 57;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onWarmupCompleted + 97;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 31 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-708639330, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:716)");
                }
                getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onWarmupCompleted + 115;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit extraCallback(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 110) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    int i5 = onWarmupCompleted + 99;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i7 = onNavigationEvent + 49;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = onWarmupCompleted + 23;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 117;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1445371129, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:723)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onNavigationEvent + 71;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        boolean z = false;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((iIntValue & 16) == 0) {
                int i4 = onNavigationEvent + 29;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    int i6 = onNavigationEvent + 67;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    i = 4;
                } else {
                    i = 2;
                }
                iIntValue |= i;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if ((iIntValue & 19) != 18) {
            int i8 = onWarmupCompleted + 51;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i10 = onWarmupCompleted + 125;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1681988954, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:730)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onNavigationEvent + 21;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i13 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedObject(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 11) == 0) {
                int i5 = onWarmupCompleted + 9;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    int i7 = onNavigationEvent + 7;
                    onWarmupCompleted = i7 % 128;
                    i2 = i7 % 2 == 0 ? 3 : 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i8 = onWarmupCompleted + 77;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1918606779, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:737)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onMessageChannelReady(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            int i3 = onWarmupCompleted + 37;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i4 = onNavigationEvent + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 97;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(947000702, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:759)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i;
        boolean z = false;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                int i3 = onNavigationEvent + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i5 = onNavigationEvent;
            int i6 = i5 + 51;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 33;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1577182470, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:777)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onWarmupCompleted + 9;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onMinimized(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 14) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    int i5 = onWarmupCompleted + 57;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i7 = onNavigationEvent + 21;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1813352293, i, -1, "im.toss.tds.compose.component.atom.asset.Unions.<anonymous>.<anonymous>.<anonymous> (TdsAssetV1.kt:786)");
            }
            getbacktracenote.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1651921056);
        int i4 = 0;
        boolean z2 = true;
        if (i != 0) {
            int i5 = onWarmupCompleted + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1651921056, i, -1, "im.toss.tds.compose.component.atom.asset.Unions (TdsAssetV1.kt:674)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            Object obj = null;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i7 = onWarmupCompleted + 111;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
                int i8 = onWarmupCompleted + 83;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
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
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = getPhysicalCameraCharacteristics.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1168712312, false, new TdsAssetV1Kt$.ExternalSyntheticLambda5()));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getBacktraceNote getbacktracenote = (getBacktraceNote) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = getPhysicalCameraCharacteristics.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(417163159, false, new TdsAssetV1Kt$.ExternalSyntheticLambda7()));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            List listListOf = CollectionsKt.listOf(new getBacktraceNote[]{getbacktracenote, (getBacktraceNote) objOnMinimized2});
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                int i10 = onWarmupCompleted + 69;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                objOnMinimized3 = setByteOrder.onNavigationEvent(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().MediaMetadataCompat());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            long jAccess100 = ((setByteOrder) objOnMinimized3).access100();
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                int i12 = onWarmupCompleted + 115;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getPhysicalCameraCharacteristics.onWarmupCompleted(getCustomTabsSession.onNavigationEvent.IAuthTabCallback()));
                    obj.hashCode();
                    throw null;
                }
                objOnMinimized4 = getPhysicalCameraCharacteristics.onWarmupCompleted(getCustomTabsSession.onNavigationEvent.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                int i13 = onWarmupCompleted + 121;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
            }
            getBacktraceNote getbacktracenote2 = (getBacktraceNote) objOnMinimized4;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2094425664);
            for (Iterator it = listListOf.iterator(); it.hasNext(); it = it) {
                int i15 = onNavigationEvent + 85;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % i2;
                getBacktraceNote getbacktracenote3 = (getBacktraceNote) it.next();
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnExtraCallback, onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                getBacktraceNote getbacktracenote4 = getbacktracenote2;
                IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, jAccess100, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-708639330, z2, new TdsAssetV1Kt$.ExternalSyntheticLambda8(getbacktracenote2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12585990, 114);
                IAuthTabCallback((getPrivacyDestinationUri.onExtraCallbackWithResult) getPrivacyDestinationUri.onExtraCallbackWithResult.onWarmupCompleted.Companion.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, jAccess100, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1445371129, true, new TdsAssetV1Kt$.ExternalSyntheticLambda9(getbacktracenote4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12585990, 114);
                IAuthTabCallback((getPrivacyDestinationUri.onExtraCallbackWithResult) getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallback.Companion.onNavigationEvent(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, jAccess100, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1681988954, true, new TdsAssetV1Kt$.ExternalSyntheticLambda10(getbacktracenote4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12585990, 114);
                IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, jAccess100, 0.0f, (Function0<Unit>) null, (String) null, (getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1918606779, true, new TdsAssetV1Kt$.ExternalSyntheticLambda11(getbacktracenote4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12585990, 114);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                getbacktracenote2 = getbacktracenote4;
                z2 = true;
                i2 = 2;
                i4 = 0;
            }
            getBacktraceNote getbacktracenote5 = getbacktracenote2;
            boolean z3 = z2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            getBacktraceNote getbacktracenoteOnWarmupCompleted = getCustomTabsSession.onNavigationEvent.onWarmupCompleted();
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback2 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault2 = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(asbinderOnExtraCallback2, onwarmupcompletedIAuthTabCallbackDefault2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted4);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout() != z3) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback2, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult3.onTransact());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
            onNavigationEvent(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback(), getbacktracenoteOnWarmupCompleted, null, null, RoundedCornerShapeKt.onWarmupCompleted(), jAccess100, 0.0f, null, null, ForwardingCameraControl.onExtraCallback(947000702, z3, new TdsAssetV1Kt$.ExternalSyntheticLambda12(getbacktracenote5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805503030, 460);
            getPrivacyDestinationUri.onExtraCallbackWithResult.onWarmupCompleted onWarmupCompleted2 = getPrivacyDestinationUri.onExtraCallbackWithResult.onWarmupCompleted.Companion.onWarmupCompleted();
            getPrivacyDestinationUri.IAuthTabCallback.onNavigationEvent onnavigationevent = getPrivacyDestinationUri.IAuthTabCallback.Companion;
            onNavigationEvent(onWarmupCompleted2, getbacktracenoteOnWarmupCompleted, null, onnavigationevent.onExtraCallbackWithResult(), RoundedCornerShapeKt.onWarmupCompleted(), jAccess100, 0.0f, null, null, ForwardingCameraControl.onExtraCallback(1341012647, z3, new TdsAssetV1Kt$.ExternalSyntheticLambda13(getbacktracenote5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805506102, 452);
            onNavigationEvent(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallback.Companion.onNavigationEvent(), getbacktracenoteOnWarmupCompleted, null, onnavigationevent.onNavigationEvent(), RoundedCornerShapeKt.onWarmupCompleted(), jAccess100, 0.0f, null, null, ForwardingCameraControl.onExtraCallback(1577182470, z3, new TdsAssetV1Kt$.ExternalSyntheticLambda14(getbacktracenote5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805506102, 452);
            getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent();
            getPrivacyDestinationUri.IAuthTabCallback iAuthTabCallbackOnExtraCallback = onnavigationevent.onExtraCallback();
            RoundedCornerShape roundedCornerShapeOnWarmupCompleted = RoundedCornerShapeKt.onWarmupCompleted();
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1813352293, z3, new TdsAssetV1Kt$.ExternalSyntheticLambda15(getbacktracenote5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            onNavigationEvent(onNavigationEvent2, getbacktracenoteOnWarmupCompleted, null, iAuthTabCallbackOnExtraCallback, roundedCornerShapeOnWarmupCompleted, jAccess100, 0.0f, null, null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805506102, 452);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = onWarmupCompleted + 81;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsAssetV1Kt$.ExternalSyntheticLambda6(i));
        }
    }

    public static final long onExtraCallback(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onWarmupCompleted(j));
        float fOnExtraCallback2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(j));
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fOnExtraCallback) << 32) | (Float.floatToRawIntBits(fOnExtraCallback2) & 4294967295L));
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return jIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function1 function1, long j, float f, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, function0, quirksExternalSyntheticBackport0, str, function1, Long.valueOf(j), Float.valueOf(f), getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -498600319, objArr, forceDomainCheck.IAuthTabCallback(), 498600322);
    }

    public static /* synthetic */ Unit asInterface(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1600653000, objArr, forceDomainCheck.IAuthTabCallback(), 1600653009);
    }

    public static /* synthetic */ Unit access100(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1077038484, objArr, forceDomainCheck.IAuthTabCallback(), -1077038479);
    }

    private static final Unit access000(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1101398817, objArr, forceDomainCheck.IAuthTabCallback(), -1101398817);
    }

    private static final Unit readTypedObject(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 2039951386, objArr, forceDomainCheck.IAuthTabCallback(), -2039951379);
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 175278851, new Object[]{function0}, iIAuthTabCallback3, -175278843);
    }

    private static final Unit onNavigationEvent(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, immediateFailedFuture immediatefailedfuture, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, immediatefailedfuture, highSpeedResolverExternalSyntheticLambda2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -2076308435, objArr, forceDomainCheck.IAuthTabCallback(), 2076308436);
    }

    private static final Unit ICustomTabsCallback(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1822309492, objArr, forceDomainCheck.IAuthTabCallback(), 1822309494);
    }

    private static final Unit onPostMessage(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1899939257, objArr, forceDomainCheck.IAuthTabCallback(), 1899939261);
    }

    private static final Unit onActivityResized(getBacktraceNote getbacktracenote, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1515744752, objArr, forceDomainCheck.IAuthTabCallback(), -1515744742);
    }

    private static final removeObserverLocked onExtraCallbackWithResult(SessionProcessorCaptureCallback sessionProcessorCaptureCallback, getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, getPrivacyDestinationUri.IAuthTabCallback iAuthTabCallback, toMetersPerSecond tometerspersecond) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (removeObserverLocked) IAuthTabCallback(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 614401623, new Object[]{sessionProcessorCaptureCallback, onextracallbackwithresult, iAuthTabCallback, tometerspersecond}, iIAuthTabCallback3, -614401617);
    }
}
