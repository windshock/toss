package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.horcrux.svg.SvgPackage;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddings;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddingsKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;
import o.initSDK;
import o.putCharArray;
import o.setCallToAction;
import o.setPackageName;
import o.toPreviewOnlyRange;
import o.u4;
import o.useAndConfigureProgramWithTexture;
import o.v5b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v5b {
    public static final v5b IAuthTabCallback = new v5b();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 45 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setPackageName setpackagename, String str, initSDK.onNavigationEvent onnavigationevent, setPackageName setpackagename2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setpackagename, str, onnavigationevent, setpackagename2);
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(v5b v5bVar, String str, Function0 function0, String str2, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        v5bVar.onWarmupCompleted(str, (Function0<Unit>) function0, str2, (Function0<Unit>) function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(v5b v5bVar, String str, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i5 % 128;
        v5bVar.onWarmupCompleted(str, function0, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(v5b v5bVar, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(v5bVar, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(v5b v5bVar, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(v5bVar, quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(v5bVar, quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor(getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public static /* synthetic */ Unit asInterface(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 96 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, initSDK initsdk, Function0 function0, String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, initsdk, function0, str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, initsdk, function0, str, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        onInstallReferrerSetupFinished oninstallreferrersetupfinished;
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i2 | i5);
        int i12 = (~(i5 | i2)) | (~(i7 | i9)) | i8;
        int i13 = i2 + i4 + i3 + ((-1422066268) * i6) + ((-2108786386) * i);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i2) + 967573504 + (322476998 * i4) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i3) + ((-1298137088) * i6) + (1722810368 * i) + (518782976 * i14);
        int i16 = (i2 * 793895740) + 1353643607 + (i4 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i3 * 793896001) + (i6 * 692483748) + (i * (-1016611666)) + (i14 * 166461440);
        boolean z = false;
        int i17 = 2;
        switch (i15 + (i16 * i16 * 1997799424)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                initSDK initsdk = (initSDK) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                int i18 = 2 % 2;
                int i19 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i19 % 128;
                if (i19 % 2 != 0) {
                    oninstallreferrersetupfinished = onInstallReferrerSetupFinished.onWarmupCompleted;
                    i17 = 4;
                } else {
                    oninstallreferrersetupfinished = onInstallReferrerSetupFinished.onWarmupCompleted;
                }
                onInstallReferrerSetupFinished.onExtraCallbackWithResult(oninstallreferrersetupfinished, initsdk, (initMiniApp) null, i17, (Object) null);
                function0.invoke();
                return Unit.INSTANCE;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
                final u4 u4Var = (u4) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i20 = 2 % 2;
                if ((iIntValue & 3) != 2) {
                    int i21 = onExtraCallbackWithResult + 111;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    int i23 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i25 = onExtraCallbackWithResult + 107;
                        onNavigationEvent = i25 % 128;
                        int i26 = i25 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1858583456, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous>.<anonymous> (ButtonsPreset.kt:114)");
                    }
                    onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 1234686723, new Object[]{IAuthTabCallback, ForwardingCameraControl.onExtraCallback(-1555231067, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda3
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i27 = 2 % 2;
                            int i28 = onWarmupCompleted + 67;
                            onNavigationEvent = i28 % 128;
                            int i29 = i28 % 2;
                            Object[] objArr2 = {getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
                            Unit unit = (Unit) v5b.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), -490955819, objArr2, SvgPackage.21.onExtraCallbackWithResult(), 490955824, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
                            int i30 = onWarmupCompleted + 27;
                            onNavigationEvent = i30 % 128;
                            if (i30 % 2 == 0) {
                                int i31 = 14 / 0;
                            }
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54}, SvgPackage.21.onExtraCallbackWithResult(), -1234686719, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    int i27 = onNavigationEvent + 27;
                    onExtraCallbackWithResult = i27 % 128;
                    int i28 = i27 % 2;
                }
                return Unit.INSTANCE;
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static final Unit onExtraCallbackWithResult(v5b v5bVar, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {v5bVar, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 1234686723, objArr, SvgPackage.21.onExtraCallbackWithResult(), -1234686719, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 2135758383, objArr, SvgPackage.21.onExtraCallbackWithResult(), -2135758377, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
        int i5 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setPackageName setpackagename, initSDK.onNavigationEvent onnavigationevent, setPackageName setpackagename2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(setpackagename, onnavigationevent, setpackagename2);
        }
        IAuthTabCallback(setpackagename, onnavigationevent, setpackagename2);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(v5b v5bVar, String str, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(v5bVar, str, function0, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(v5b v5bVar, String str, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return onWarmupCompleted(v5bVar, str, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(v5bVar, str, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        String str = (String) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        initSDK initsdk = (initSDK) objArr[4];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), -1209011063, new Object[]{quirksExternalSyntheticBackport0, function0, str, Long.valueOf(jLongValue), initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, SvgPackage.21.onExtraCallbackWithResult(), 1209011066, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 609314312, new Object[]{initsdk, function0}, iOnExtraCallbackWithResult2, -609314310, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
        int i4 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(v5b v5bVar, String str, Function0 function0, String str2, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return IAuthTabCallback(v5bVar, str, function0, str2, function02, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(v5bVar, str, function0, str2, function02, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    private static final Unit onWarmupCompleted(v5b v5bVar, String str, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        v5bVar.onNavigationEvent(str, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(v5b v5bVar, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        v5bVar.onNavigationEvent(quirksExternalSyntheticBackport0, (getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, (getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private v5b() {
    }

    private static final Unit IAuthTabCallback(setPackageName setpackagename, initSDK.onNavigationEvent onnavigationevent, setPackageName setpackagename2) {
        initSDK.onNavigationEvent interfaceDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(setpackagename2, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(setpackagename2, "");
        if (setpackagename != null && (interfaceDescriptor = setpackagename.getInterfaceDescriptor()) != null) {
            getReferrerClickTimestampSeconds.onExtraCallbackWithResult(interfaceDescriptor, "button_text", setpackagename2.IAuthTabCallbackDefault());
            int i3 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, final initSDK initsdk, final Function0 function0, String str, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1815501636, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Button.<anonymous>.<anonymous> (ButtonsPreset.kt:57)");
            }
            QuirkSettingsLoader quirkSettingsLoaderIAuthTabCallbackStub = QuirkSettingsLoader.Companion.IAuthTabCallbackStub();
            v5b v5bVar = IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(v5bVar.onNavigationEvent(quirksExternalSyntheticBackport0), 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderIAuthTabCallbackStub, false);
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
                int i5 = onNavigationEvent + 77;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
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
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
            int iOnExtraCallback = createCameraCaptureCallback.Companion.onExtraCallback();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda12
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallback + 61;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitIAuthTabCallback = v5b.IAuthTabCallback((useAndConfigureProgramWithTexture) obj);
                        int i10 = onExtraCallback + 1;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, false, (Function1) objOnMinimized, 1, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda13
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 45;
                            onWarmupCompleted = i8 % 128;
                            if (i8 % 2 != 0) {
                                v5b.onWarmupCompleted(initsdk, function0);
                                throw null;
                            }
                            Unit unitOnWarmupCompleted = v5b.onWarmupCompleted(initsdk, function0);
                            int i9 = onNavigationEvent + 59;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj = function02;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), -1758257454, new Object[]{v5bVar, measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 15, (Object) null)}, SvgPackage.21.onExtraCallbackWithResult(), 1758257455, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult()), null, Long.valueOf(j), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(iOnExtraCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98036}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
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

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        int i2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final Function0 function0 = (Function0) objArr[1];
        final String str = (String) objArr[2];
        final long jLongValue = ((Number) objArr[3]).longValue();
        int i3 = 4;
        final initSDK initsdk = (initSDK) objArr[4];
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((iIntValue & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk)) {
                i3 = 2;
            } else {
                int i7 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i9 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
            int i11 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 147) != 146, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i13 = onNavigationEvent + 77;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(575261599, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Button.<anonymous> (ButtonsPreset.kt:56)");
                    int i14 = 40 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(575261599, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Button.<anonymous> (ButtonsPreset.kt:56)");
                }
            }
            putBooleanArray.onExtraCallbackWithResult((String) putCharArray.onNavigationEvent.onExtraCallback(393927074, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{putCharArray.Companion}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -393927070, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), null, null, ForwardingCameraControl.onExtraCallback(-1815501636, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda18
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallbackWithResult + 53;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 != 0) {
                        return v5b.onExtraCallback(quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, initsdk, function0, str, jLongValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    v5b.onExtraCallback(quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, initsdk, function0, str, jLongValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull final String str, @NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long jOnWarmupCompleted;
        Object objIAuthTabCallback;
        final setPackageName setpackagename;
        boolean zOnNavigationEvent;
        Object obj;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(671485268);
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170) {
                int i8 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i8 % 128;
                z = i8 % 2 == 0;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                int i9 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i7 != 0) {
                        int i11 = onExtraCallbackWithResult + 65;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        jOnWarmupCompleted = v7.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(671485268, i3, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Button (ButtonsPreset.kt:47)");
                        }
                        objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setThreadList.IAuthTabCallback_Parcel());
                        if (objIAuthTabCallback instanceof setPackageName) {
                            setpackagename = null;
                        } else {
                            int i13 = onExtraCallbackWithResult + 33;
                            onNavigationEvent = i13 % 128;
                            int i14 = i13 % 2;
                            setpackagename = (setPackageName) objIAuthTabCallback;
                        }
                        onCrash oncrash = onCrash.DialogButton;
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setpackagename);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent) {
                            int i15 = onNavigationEvent + 125;
                            onExtraCallbackWithResult = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = 78 / 0;
                                obj = objOnMinimized;
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda9
                                        private static int onExtraCallback = 1;
                                        private static int onExtraCallbackWithResult;

                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i17 = 2 % 2;
                                            int i18 = onExtraCallbackWithResult + 45;
                                            onExtraCallback = i18 % 128;
                                            int i19 = i18 % 2;
                                            setPackageName setpackagename2 = setpackagename;
                                            initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) obj2;
                                            setPackageName setpackagename3 = (setPackageName) obj3;
                                            if (i19 != 0) {
                                                return v5b.onNavigationEvent(setpackagename2, onnavigationevent, setpackagename3);
                                            }
                                            v5b.onNavigationEvent(setpackagename2, onnavigationevent, setpackagename3);
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function2);
                                    int i17 = onExtraCallbackWithResult + 5;
                                    onNavigationEvent = i17 % 128;
                                    int i18 = i17 % 2;
                                    obj = function2;
                                }
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                final long j3 = jOnWarmupCompleted;
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(575261599, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda10
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                        int i19 = 2 % 2;
                                        int i20 = onExtraCallbackWithResult + 17;
                                        onExtraCallback = i20 % 128;
                                        Object obj6 = null;
                                        if (i20 % 2 != 0) {
                                            throw null;
                                        }
                                        Unit unit = (Unit) v5b.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 1480802769, new Object[]{quirksExternalSyntheticBackport05, function0, str, Long.valueOf(j3), (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())}, SvgPackage.21.onExtraCallbackWithResult(), -1480802761, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                        int i21 = onExtraCallbackWithResult + 115;
                                        onExtraCallback = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            return unit;
                                        }
                                        obj6.hashCode();
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                setThreadList.IAuthTabCallback(oncrash, (initMiniApp) null, (initSDK) null, (Function2) obj, (Set) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196998, 18);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                j2 = jOnWarmupCompleted;
                            } else {
                                obj = objOnMinimized;
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                }
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport04;
                                final long j32 = jOnWarmupCompleted;
                                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(575261599, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda10
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                        int i19 = 2 % 2;
                                        int i20 = onExtraCallbackWithResult + 17;
                                        onExtraCallback = i20 % 128;
                                        Object obj6 = null;
                                        if (i20 % 2 != 0) {
                                            throw null;
                                        }
                                        Unit unit = (Unit) v5b.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 1480802769, new Object[]{quirksExternalSyntheticBackport052, function0, str, Long.valueOf(j32), (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())}, SvgPackage.21.onExtraCallbackWithResult(), -1480802761, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                        int i21 = onExtraCallbackWithResult + 115;
                                        onExtraCallback = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            return unit;
                                        }
                                        obj6.hashCode();
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                setThreadList.IAuthTabCallback(oncrash, (initMiniApp) null, (initSDK) null, (Function2) obj, (Set) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196998, 18);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                j2 = jOnWarmupCompleted;
                            }
                        }
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                }
                jOnWarmupCompleted = j2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setThreadList.IAuthTabCallback_Parcel());
                if (objIAuthTabCallback instanceof setPackageName) {
                }
                onCrash oncrash2 = onCrash.DialogButton;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setpackagename);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent) {
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final long j4 = j2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda11
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        int i19 = 2 % 2;
                        int i20 = onWarmupCompleted + 5;
                        IAuthTabCallback = i20 % 128;
                        if (i20 % 2 == 0) {
                            v5b.onNavigationEvent(this.f$0, str, function0, quirksExternalSyntheticBackport02, j4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit unitOnNavigationEvent = v5b.onNavigationEvent(this.f$0, str, function0, quirksExternalSyntheticBackport02, j4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i21 = IAuthTabCallback + 5;
                        onWarmupCompleted = i21 % 128;
                        if (i21 % 2 != 0) {
                            int i22 = 90 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit IAuthTabCallback(String str, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                i3 = 4;
            } else {
                int i5 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 2;
                }
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1873941558, i2, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous> (ButtonsPreset.kt:90)");
            }
            u4Var.onNavigationEvent(str, null, null, function0, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2028026793, i2, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous> (ButtonsPreset.kt:93)");
            }
            u4Var.onNavigationEvent(str, null, null, function0, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@NotNull final String str, @NotNull final Function0<Unit> function0, @NotNull final String str2, @NotNull final Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-363354442);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i7 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i7 % 128;
                i5 = i7 % 2 != 0 ? 48 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                int i8 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i10 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i10 % 128;
                i3 = i10 % 2 != 0 ? 26831 : 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            int i11 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 16384 : 8192;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 9363) != 9362, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-363354442, i2, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons (ButtonsPreset.kt:87)");
            }
            onNavigationEvent((QuirksExternalSyntheticBackport0) null, (getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1873941558, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda14
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 99;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    String str3 = str;
                    if (i15 != 0) {
                        return v5b.onExtraCallback(str3, function0, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    v5b.onExtraCallback(str3, function0, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(2028026793, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda15
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 77;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    String str3 = str2;
                    if (i15 == 0) {
                        return v5b.onExtraCallbackWithResult(str3, function02, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = v5b.onExtraCallbackWithResult(str3, function02, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i16 = 51 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 >> 3) & 7168) | 432, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 != 0) {
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda16
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i14 = 2 % 2;
                    int i15 = onWarmupCompleted + 43;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    Unit unitOnWarmupCompleted = v5b.onWarmupCompleted(this.f$0, str, function0, str2, function02, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i17 = onExtraCallbackWithResult + 11;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    private static final Unit onTransact(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1555231067, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonsPreset.kt:115)");
            }
            getbacktracenote.invoke(u4Var, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(final getBacktraceNote getbacktracenote, final u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1477766142, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous> (ButtonsPreset.kt:112)");
                    int i4 = 13 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1477766142, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous> (ButtonsPreset.kt:112)");
                }
            }
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(716404714);
                IAuthTabCallback.onNavigationEvent("primary_button_text", (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1858583456, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda19
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 87;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnNavigationEvent = v5b.onNavigationEvent(getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i8 = onNavigationEvent + 69;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 438);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(716644964);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(787186275, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonsPreset.kt:129)");
                    int i6 = 84 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(787186275, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonsPreset.kt:129)");
                }
            }
            getbacktracenote.invoke(u4Var, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(final getBacktraceNote getbacktracenote, final u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-93966498, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous>.<anonymous> (ButtonsPreset.kt:128)");
                    int i4 = 14 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-93966498, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous>.<anonymous> (ButtonsPreset.kt:128)");
                }
            }
            onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 1234686723, new Object[]{IAuthTabCallback, ForwardingCameraControl.onExtraCallback(787186275, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda17
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 21;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    getBacktraceNote getbacktracenote2 = getbacktracenote;
                    if (i7 != 0) {
                        return v5b.asInterface(getbacktracenote2, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    v5b.asInterface(getbacktracenote2, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54}, SvgPackage.21.onExtraCallbackWithResult(), -1234686719, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 5;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit asBinder(final getBacktraceNote getbacktracenote, final u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i5 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-474783812, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous>.<anonymous> (ButtonsPreset.kt:126)");
                int i8 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-957178972);
                IAuthTabCallback.onNavigationEvent("secondary_button_text", (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-93966498, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallbackWithResult + 89;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr = {getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
                        Unit unit = (Unit) v5b.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 599497487, objArr, SvgPackage.21.onExtraCallbackWithResult(), -599497480, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
                        int i13 = IAuthTabCallback + 109;
                        onExtraCallbackWithResult = i13 % 128;
                        int i14 = i13 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 438);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-956931034);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 17 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1096505835, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous> (ButtonsPreset.kt:107)");
                    int i4 = 38 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1096505835, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons.<anonymous> (ButtonsPreset.kt:107)");
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = IAuthTabCallback.onExtraCallback(quirksExternalSyntheticBackport0);
            long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
            setCallToAction.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = setCallToAction.IAuthTabCallback.Companion;
            u1.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, null, ForwardingCameraControl.onExtraCallback(1477766142, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 115;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnExtraCallbackWithResult = v5b.onExtraCallbackWithResult(getbacktracenote, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i8 = onExtraCallbackWithResult + 1;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), new setCallToAction.onExtraCallbackWithResult(setCallToAction.onWarmupCompleted.Primary, setCallToAction.onExtraCallback.Fill, onextracallbackwithresult.onWarmupCompleted(), null, 8, null), ForwardingCameraControl.onExtraCallback(-474783812, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 27;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        return (Unit) v5b.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 867892324, new Object[]{getbacktracenote2, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, SvgPackage.21.onExtraCallbackWithResult(), -867892324, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                    }
                    Object[] objArr = {getbacktracenote2, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int i7 = 77 / 0;
                    return (Unit) v5b.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 867892324, objArr, SvgPackage.21.onExtraCallbackWithResult(), -867892324, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), new setCallToAction.onExtraCallbackWithResult(setCallToAction.onWarmupCompleted.Dark, setCallToAction.onExtraCallback.Weak, onextracallbackwithresult.onWarmupCompleted(), null, 8, null), null, null, jIAuthTabCallbackDefault, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 905994624, 0, 3266);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        boolean z;
        getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = getbacktracenote;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-192797013);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                i4 = 2;
            } else {
                int i7 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i7 % 128;
                i4 = i7 % 2 == 0 ? 5 : 4;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i9 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                getbacktracenote3 = getbacktracenote2;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 128 : 256;
            }
            if ((i3 & 147) == 146) {
                int i11 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                getbacktracenote4 = getbacktracenote6;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                getbacktracenote5 = getbacktracenote3;
            } else {
                quirksExternalSyntheticBackport03 = i6 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (i8 != 0) {
                    getbacktracenote6 = null;
                }
                getbacktracenote5 = i10 == 0 ? getbacktracenote3 : null;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-192797013, i3, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.Buttons (ButtonsPreset.kt:103)");
                }
                setPostviewFormatSelector.onNavigationEvent(RemoveCompoundPaddingsKt.onExtraCallbackWithResult().onExtraCallback(new RemoveCompoundPaddings(true)), ForwardingCameraControl.onExtraCallback(1096505835, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i13 = 2 % 2;
                        int i14 = IAuthTabCallback + 27;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unitOnWarmupCompleted = v5b.onWarmupCompleted(quirksExternalSyntheticBackport03, getbacktracenote6, getbacktracenote5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i16 = onNavigationEvent + 107;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i13 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                getbacktracenote4 = getbacktracenote6;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7 = getbacktracenote4;
                final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = getbacktracenote5;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i15 = 2 % 2;
                        int i16 = onWarmupCompleted + 75;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 == 0) {
                            return v5b.IAuthTabCallback(this.f$0, quirksExternalSyntheticBackport04, getbacktracenote7, getbacktracenote8, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        v5b.IAuthTabCallback(this.f$0, quirksExternalSyntheticBackport04, getbacktracenote7, getbacktracenote8, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                });
            }
            int i15 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
        }
        i3 |= 384;
        getbacktracenote3 = getbacktracenote2;
        if ((i3 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        int i152 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i152 % 128;
        int i162 = i152 % 2;
    }

    private static final Unit onExtraCallbackWithResult(setPackageName setpackagename, String str, initSDK.onNavigationEvent onnavigationevent, setPackageName setpackagename2) {
        initSDK.onNavigationEvent interfaceDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(setpackagename2, "");
        if (setpackagename != null && (interfaceDescriptor = setpackagename.getInterfaceDescriptor()) != null) {
            int i4 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getReferrerClickTimestampSeconds.onExtraCallbackWithResult(interfaceDescriptor, str, setpackagename2.IAuthTabCallbackDefault());
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(final String str, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        Object obj;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-911197418);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i6 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i8 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((i10 & 19) != 18) {
            z = true;
        } else {
            int i11 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
            int i13 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-911197418, i10, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.AutoLogDialogButton (ButtonsPreset.kt:148)");
            }
            Object objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setThreadList.IAuthTabCallback_Parcel());
            Object obj2 = null;
            final setPackageName setpackagename = objIAuthTabCallback instanceof setPackageName ? (setPackageName) objIAuthTabCallback : null;
            onCrash oncrash = onCrash.DialogButton;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setpackagename);
            boolean z2 = (i10 & 14) == 4;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(!(zOnNavigationEvent | z2))) {
                Function2 function22 = new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda4
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i17 = 2 % 2;
                        int i18 = onExtraCallbackWithResult + 7;
                        onNavigationEvent = i18 % 128;
                        int i19 = i18 % 2;
                        Unit unitIAuthTabCallback = v5b.IAuthTabCallback(setpackagename, str, (initSDK.onNavigationEvent) obj3, (setPackageName) obj4);
                        int i20 = onExtraCallbackWithResult + 13;
                        onNavigationEvent = i20 % 128;
                        if (i20 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function22);
                obj = function22;
                addAttachUserData.IAuthTabCallback(setThreadList.onExtraCallback(oncrash, (initMiniApp) null, (initSDK) null, (Function2) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 2), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i10 & 112);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj2.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                addAttachUserData.IAuthTabCallback(setThreadList.onExtraCallback(oncrash, (initMiniApp) null, (initSDK) null, (Function2) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 2), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i10 & 112);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj3, Object obj4) {
                    int i18 = 2 % 2;
                    int i19 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    Unit unitOnNavigationEvent = v5b.onNavigationEvent(this.f$0, str, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i21 = IAuthTabCallback + 59;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 25 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        final v5b v5bVar = (v5b) objArr[0];
        boolean z = true;
        final Function2 function2 = (Function2) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        final int iIntValue = ((Number) objArr[3]).intValue();
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2067058840);
        if ((iIntValue & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i6 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((i & 3) != 2) {
            int i8 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2067058840, i, -1, "im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset.ClearCtaYn (ButtonsPreset.kt:166)");
            }
            setPostviewFormatSelector.onNavigationEvent(((accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 174994773, -174994756, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).onExtraCallback((Object) null), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i << 3) & 112) | accessgetCameraFactoryp.onNavigationEvent);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 26 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.v1.ButtonsPreset$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallback + 121;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    v5b v5bVar2 = this.f$0;
                    if (i14 == 0) {
                        return v5b.IAuthTabCallback(v5bVar2, function2, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    v5b.IAuthTabCallback(v5bVar2, function2, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        return null;
    }

    public final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), 0.0f, 0.0f, 13, (Object) null));
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 2.0f, 10, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 0.0f, 13, (Object) null);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
        int i3 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            return quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 867892324, objArr, SvgPackage.21.onExtraCallbackWithResult(), -867892324, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, String str, long j, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, function0, str, Long.valueOf(j), initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 1480802769, objArr, SvgPackage.21.onExtraCallbackWithResult(), -1480802761, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 599497487, objArr, SvgPackage.21.onExtraCallbackWithResult(), -599497480, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), -490955819, objArr, SvgPackage.21.onExtraCallbackWithResult(), 490955824, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, String str, long j, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, function0, str, Long.valueOf(j), initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), -1209011063, objArr, SvgPackage.21.onExtraCallbackWithResult(), 1209011066, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(initSDK initsdk, Function0 function0) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 609314312, new Object[]{initsdk, function0}, iOnExtraCallbackWithResult2, -609314310, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
    }

    private static final Unit IAuthTabCallbackStub(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 2135758383, objArr, SvgPackage.21.onExtraCallbackWithResult(), -2135758377, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
    }

    private final void IAuthTabCallback(Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), 1234686723, objArr, SvgPackage.21.onExtraCallbackWithResult(), -1234686719, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
    }

    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        return (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), -1758257454, new Object[]{this, quirksExternalSyntheticBackport0}, iOnExtraCallbackWithResult2, 1758257455, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
    }
}
