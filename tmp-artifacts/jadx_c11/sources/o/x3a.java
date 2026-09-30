package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSwitchMinWidth;
import o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import o.x3a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x3a {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final getSwitchMinWidth<Boolean> IAuthTabCallback;

    private static final int IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 15;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return 30;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        x3a x3aVar = (x3a) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        Function2 function22 = (Function2) objArr[2];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(x3aVar, function2, function22, getswitchminwidth, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, Function2 function2, Function2 function22, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, long j2, GraphicDeviceInfo graphicDeviceInfo2, getSwitchMinWidth getswitchminwidth, x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(deviceQuirksExternalSyntheticLambda0, accessgettlsversionsasstringp, j, graphicDeviceInfo, function2, function22, accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, getswitchminwidth, x3aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(deviceQuirksExternalSyntheticLambda0, accessgettlsversionsasstringp, j, graphicDeviceInfo, function2, function22, accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, getswitchminwidth, x3aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static final Unit IAuthTabCallback(x3a x3aVar, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, Function2 function2, long j, GraphicDeviceInfo graphicDeviceInfo, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, Function2 function22, long j2, GraphicDeviceInfo graphicDeviceInfo2, getSwitchMinWidth getswitchminwidth, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 113;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        x3aVar.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0, accessgettlsversionsasstringp, function2, j, graphicDeviceInfo, accessgettlsversionsasstringp2, function22, j2, graphicDeviceInfo2, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 17;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(x3a x3aVar, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {x3aVar, function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -616660016, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 616660018, objArr);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 77;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit asInterface(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iIAuthTabCallback = IAuthTabCallback(i);
        if (i4 != 0) {
            int i5 = 10 / 0;
        }
        return iIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        x3a x3aVar = (x3a) objArr[0];
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2 = (Function2) objArr[1];
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22 = (Function2) objArr[2];
        getSwitchMinWidth<Boolean> getswitchminwidth = (getSwitchMinWidth) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        x3aVar.onNavigationEvent(function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallbackStubProxy(str, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(x3a x3aVar, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {x3aVar, function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 206678162, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -206678157, objArr);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 57;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[0];
        x3a x3aVar = (x3a) objArr[1];
        Function2 function2 = (Function2) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(getswitchminwidth, x3aVar, function2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallbackWithResult(getswitchminwidth, x3aVar, function2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return unitAsBinder;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b A[PHI: r0
      0x024b: PHI (r0v16 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v15 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v20 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:80:0x0249, B:77:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0256 A[PHI: r0
      0x0256: PHI (r0v19 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v15 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v20 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:80:0x0249, B:77:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i7;
        int i8;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        boolean zIAuthTabCallback;
        Object objOnMinimized;
        int i9;
        int i10;
        int i11;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i12 = (~(i3 | i2)) | i6;
        int i13 = ~i3;
        int i14 = ~((~i6) | i13 | i2);
        int i15 = (~(i2 | i6)) | (~(i13 | (~i2)));
        int i16 = i3 + i6 + i4 + (1616745821 * i) + (2077170981 * i5);
        int i17 = i16 * i16;
        int i18 = (i3 * (-1558553916)) + 318941677 + (i6 * (-1558553002)) + (i12 * (-457)) + (i14 * 457) + (i15 * 457) + ((-1558553459) * i4) + (397062201 * i) + (609114465 * i5) + (i17 * (-138936320));
        boolean z = false;
        int i19 = 128;
        switch (((-162656556) * i3) + 1587019776 + (806482222 * i6) + ((-484569389) * i12) + (i14 * 484569389) + (484569389 * i15) + (321912832 * i4) + ((-395313152) * i) + (904921088 * i5) + (345505792 * i17) + (i18 * i18 * 1630011392)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                final x3a x3aVar = (x3a) objArr[0];
                Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24 = (Function2) objArr[1];
                Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function25 = (Function2) objArr[2];
                getSwitchMinWidth<Boolean> getswitchminwidth = (getSwitchMinWidth) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                final int iIntValue = ((Number) objArr[5]).intValue();
                final int iIntValue2 = ((Number) objArr[6]).intValue();
                int i20 = 2 % 2;
                int i21 = onWarmupCompleted + 27;
                onNavigationEvent = i21 % 128;
                if (i21 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(function24, "");
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1080299910);
                    if ((iIntValue & 43) == 0) {
                        i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function24) ? 4 : 2) | iIntValue;
                    } else {
                        int i22 = onNavigationEvent + 109;
                        onWarmupCompleted = i22 % 128;
                        int i23 = i22 % 2;
                        i7 = iIntValue;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(function24, "");
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1080299910);
                    if ((iIntValue & 6) == 0) {
                    }
                }
                int i24 = iIntValue2 & 2;
                if (i24 != 0) {
                    i7 |= 48;
                } else if ((iIntValue & 48) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function25)) {
                        int i25 = onWarmupCompleted + 41;
                        onNavigationEvent = i25 % 128;
                        i8 = i25 % 2 == 0 ? 80 : 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((iIntValue & 384) == 0) {
                    if ((iIntValue2 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth)) {
                        i19 = 256;
                    }
                    i7 |= i19;
                }
                if ((iIntValue & 3072) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x3aVar) ? 2048 : 1024;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 1171) != 1170, i7 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        if (i24 != 0) {
                            int i26 = onWarmupCompleted + 55;
                            onNavigationEvent = i26 % 128;
                            int i27 = i26 % 2;
                            function25 = null;
                        }
                        if ((iIntValue2 & 4) != 0) {
                            getswitchminwidth = x3aVar.IAuthTabCallback;
                        }
                        function22 = function25;
                        getSwitchMinWidth<Boolean> getswitchminwidth2 = getswitchminwidth;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1080299910, i7, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowC (CenterPreset.kt:124)");
                        }
                        r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent());
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zIAuthTabCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback((r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() <= 1.4f || function22 != null) ? 0.0f : 1.0f);
                            i9 = onWarmupCompleted + 37;
                            onNavigationEvent = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i28 = 3 % 3;
                            }
                            objOnMinimized = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized).IAuthTabCallback(), 0.0f, 0.0f, 13, (Object) null);
                        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
                        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                        int i29 = ((i7 << 6) & 896) | 100884528 | ((i7 << 15) & 3670016) | ((i7 << 21) & 1879048192);
                        int i30 = (i7 >> 9) & 14;
                        function2 = function24;
                        x3aVar.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0IAuthTabCallback, accessgettlsversionsasstringp, function2, 0L, isrepeatingenabled.onExtraCallbackWithResult(), accessgetTlsVersionsAsStringp.Typography7, function22, 0L, isrepeatingenabled.onTransact(), getswitchminwidth2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i29, i30, 136);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        function25 = function22;
                        getswitchminwidth = getswitchminwidth2;
                    } else {
                        int i31 = onWarmupCompleted + 15;
                        onNavigationEvent = i31 % 128;
                        int i32 = i31 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((iIntValue2 & 4) != 0) {
                            int i33 = onWarmupCompleted + 61;
                            onNavigationEvent = i33 % 128;
                            i7 = i33 % 2 == 0 ? i7 & 4981 : i7 & (-897);
                        }
                        function22 = function25;
                        getSwitchMinWidth<Boolean> getswitchminwidth22 = getswitchminwidth;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent());
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zIAuthTabCallback) {
                            if (r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() <= 1.4f) {
                                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback((r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() <= 1.4f || function22 != null) ? 0.0f : 1.0f);
                                i9 = onWarmupCompleted + 37;
                                onNavigationEvent = i9 % 128;
                                if (i9 % 2 == 0) {
                                }
                                objOnMinimized = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized).IAuthTabCallback(), 0.0f, 0.0f, 13, (Object) null);
                                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography5;
                                isRepeatingEnabled isrepeatingenabled2 = isRepeatingEnabled.onExtraCallback;
                                int i292 = ((i7 << 6) & 896) | 100884528 | ((i7 << 15) & 3670016) | ((i7 << 21) & 1879048192);
                                int i302 = (i7 >> 9) & 14;
                                function2 = function24;
                                x3aVar.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0IAuthTabCallback2, accessgettlsversionsasstringp2, function2, 0L, isrepeatingenabled2.onExtraCallbackWithResult(), accessgetTlsVersionsAsStringp.Typography7, function22, 0L, isrepeatingenabled2.onTransact(), getswitchminwidth22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i292, i302, 136);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                function25 = function22;
                                getswitchminwidth = getswitchminwidth22;
                            }
                        }
                    }
                    return null;
                }
                function2 = function24;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 != null) {
                    final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function26 = function2;
                    final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function27 = function25;
                    final getSwitchMinWidth<Boolean> getswitchminwidth3 = getswitchminwidth;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda4
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i34 = 2 % 2;
                            int i35 = IAuthTabCallback + 87;
                            onWarmupCompleted = i35 % 128;
                            if (i35 % 2 != 0) {
                                x3a x3aVar2 = this.f$0;
                                Function2 function28 = function26;
                                Function2 function29 = function27;
                                getSwitchMinWidth getswitchminwidth4 = getswitchminwidth3;
                                int i36 = iIntValue;
                                int i37 = iIntValue2;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                Object[] objArr2 = {x3aVar2, function28, function29, getswitchminwidth4, Integer.valueOf(i36), Integer.valueOf(i37), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue3)};
                                return (Unit) x3a.onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1438041183, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1438041183, objArr2);
                            }
                            x3a x3aVar3 = this.f$0;
                            Function2 function210 = function26;
                            Function2 function211 = function27;
                            getSwitchMinWidth getswitchminwidth5 = getswitchminwidth3;
                            int i38 = iIntValue;
                            int i39 = iIntValue2;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            Object[] objArr3 = {x3aVar3, function210, function211, getswitchminwidth5, Integer.valueOf(i38), Integer.valueOf(i39), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue4)};
                            throw null;
                        }
                    });
                }
                return null;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                final x3a x3aVar2 = (x3a) objArr[0];
                Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function28 = (Function2) objArr[1];
                Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function29 = (Function2) objArr[2];
                getSwitchMinWidth<Boolean> getswitchminwidth4 = (getSwitchMinWidth) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                final int iIntValue3 = ((Number) objArr[5]).intValue();
                final int iIntValue4 = ((Number) objArr[6]).intValue();
                int i34 = 2 % 2;
                Intrinsics.checkNotNullParameter(function28, "");
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(1385934439);
                if ((iIntValue3 & 6) == 0) {
                    i10 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.onExtraCallback(function28) ? 4 : 2) | iIntValue3;
                } else {
                    i10 = iIntValue3;
                }
                int i35 = iIntValue4 & 2;
                if (i35 == 0) {
                    if ((iIntValue3 & 48) == 0) {
                        i11 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.onExtraCallback(function29) ? 32 : 16) | i10;
                    }
                    if ((iIntValue3 & 384) == 0) {
                        if ((iIntValue4 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.onNavigationEvent(getswitchminwidth4)) {
                            i19 = 256;
                        }
                        i11 |= i19;
                    }
                    if ((iIntValue3 & 3072) == 0) {
                        i11 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.onNavigationEvent(x3aVar2) ? 1024 : 2048;
                    }
                    if ((i11 & 1171) == 1170) {
                        z = true;
                    } else {
                        int i36 = onWarmupCompleted + 25;
                        onNavigationEvent = i36 % 128;
                        int i37 = i36 % 2;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.onWarmupCompleted(z, i11 & 1)) {
                        function23 = function28;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2;
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.ICustomTabsCallbackStub();
                        if ((iIntValue3 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.onPostMessage()) {
                            if (i35 != 0) {
                                int i38 = onNavigationEvent + 67;
                                onWarmupCompleted = i38 % 128;
                                int i39 = i38 % 2;
                                function29 = null;
                            }
                            if ((iIntValue4 & 4) != 0) {
                                getswitchminwidth4 = x3aVar2.IAuthTabCallback;
                                i11 &= -897;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.ICustomTabsCallbackStubProxy();
                            if ((iIntValue4 & 4) != 0) {
                                int i40 = onWarmupCompleted + 117;
                                onNavigationEvent = i40 % 128;
                                int i41 = i40 % 2;
                                i11 &= -897;
                            }
                            int i42 = onWarmupCompleted + 87;
                            onNavigationEvent = i42 % 128;
                            int i43 = i42 % 2;
                        }
                        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function210 = function29;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1385934439, i11, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowB (CenterPreset.kt:92)");
                        }
                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3 = accessgetTlsVersionsAsStringp.Typography4;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2;
                        isRepeatingEnabled isrepeatingenabled3 = isRepeatingEnabled.onExtraCallback;
                        int i44 = ((i11 << 6) & 896) | 100884534 | ((i11 << 15) & 3670016) | ((i11 << 21) & 1879048192);
                        int i45 = (i11 >> 9) & 14;
                        function23 = function28;
                        x3aVar2.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0OnExtraCallback, accessgettlsversionsasstringp3, function23, 0L, isrepeatingenabled3.onExtraCallbackWithResult(), accessgetTlsVersionsAsStringp.Typography6, function210, 0L, isrepeatingenabled3.asBinder(), getswitchminwidth4, cameraCaptureResultEmptyCameraCaptureResult, i44, i45, 136);
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        function29 = function210;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function211 = function23;
                        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function212 = function29;
                        final getSwitchMinWidth<Boolean> getswitchminwidth5 = getswitchminwidth4;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda13
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                                int i46 = 2 % 2;
                                int i47 = onWarmupCompleted + 25;
                                onNavigationEvent = i47 % 128;
                                int i48 = i47 % 2;
                                Unit unitOnWarmupCompleted = x3a.onWarmupCompleted(this.f$0, function211, function212, getswitchminwidth5, iIntValue3, iIntValue4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i49 = onNavigationEvent + 41;
                                onWarmupCompleted = i49 % 128;
                                int i50 = i49 % 2;
                                return unitOnWarmupCompleted;
                            }
                        });
                    }
                    return null;
                }
                i10 |= 48;
                i11 = i10;
                if ((iIntValue3 & 384) == 0) {
                }
                if ((iIntValue3 & 3072) == 0) {
                }
                if ((i11 & 1171) == 1170) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback2.onWarmupCompleted(z, i11 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return null;
            case 6:
                return onExtraCallbackWithResult(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        x3a x3aVar = (x3a) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        Function2 function22 = (Function2) objArr[2];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1678312556, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1678312557, new Object[]{x3aVar, function2, function22, getswitchminwidth, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)});
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x3a x3aVar, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(x3aVar, function2, function22, getswitchminwidth, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 43;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x3a x3aVar, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, Function2 function2, long j, GraphicDeviceInfo graphicDeviceInfo, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, Function2 function22, long j2, GraphicDeviceInfo graphicDeviceInfo2, getSwitchMinWidth getswitchminwidth, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 101;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(x3aVar, deviceQuirksExternalSyntheticLambda0, accessgettlsversionsasstringp, function2, j, graphicDeviceInfo, accessgettlsversionsasstringp2, function22, j2, graphicDeviceInfo2, getswitchminwidth, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onWarmupCompleted + 27;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 71 / 0;
        }
        return unitIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3a)) {
            int i5 = i2 + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, ((x3a) obj).IAuthTabCallback)) {
            return false;
        }
        int i7 = onWarmupCompleted + 19;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getSwitchMinWidth<Boolean> getswitchminwidth = this.IAuthTabCallback;
        if (getswitchminwidth != null) {
            return getswitchminwidth.hashCode();
        }
        int i4 = i3 + 117;
        onNavigationEvent = i4 % 128;
        return i4 % 2 == 0 ? 1 : 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CenterPreset(visible=" + this.IAuthTabCallback + ")";
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public x3a(@Nullable getSwitchMinWidth<Boolean> getswitchminwidth) {
        this.IAuthTabCallback = getswitchminwidth;
    }

    public final void onExtraCallbackWithResult(@NotNull final String str, @Nullable String str2, @Nullable getSwitchMinWidth<Boolean> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        final String str3;
        Function2 function2OnExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        getSwitchMinWidth<Boolean> getswitchminwidth2 = (i2 & 4) != 0 ? this.IAuthTabCallback : getswitchminwidth;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = onNavigationEvent + 5;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1059502746, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowA (CenterPreset.kt:43)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1059502746, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowA (CenterPreset.kt:43)");
        }
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1506557082, true, new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                Unit unitOnExtraCallbackWithResult;
                int i7 = 2 % 2;
                int i8 = onNavigationEvent + 75;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    unitOnExtraCallbackWithResult = x3a.onExtraCallbackWithResult(str, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i9 = 46 / 0;
                } else {
                    unitOnExtraCallbackWithResult = x3a.onExtraCallbackWithResult(str, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i10 = IAuthTabCallback + 71;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54);
        if (str3 == null) {
            int i7 = onWarmupCompleted + 65;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(68577341);
                obj.hashCode();
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(68577341);
            function2OnExtraCallback = null;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(68577342);
            function2OnExtraCallback = ForwardingCameraControl.onExtraCallback(-1548350512, true, new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    Unit unitOnNavigationEvent;
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 15;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        unitOnNavigationEvent = x3a.onNavigationEvent(str3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i10 = 43 / 0;
                    } else {
                        unitOnNavigationEvent = x3a.onNavigationEvent(str3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i11 = onExtraCallback + 37;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        onNavigationEvent(encoderProfilesProxyVideoProfileProxyOnExtraCallback, function2OnExtraCallback, getswitchminwidth2, cameraCaptureResultEmptyCameraCaptureResult, (i & 896) | 6 | (i & 7168), 0);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    private static final Unit asBinder(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 35;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onNavigationEvent + 9;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = onWarmupCompleted + 55;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 33;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1506557082, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowA.<anonymous> (CenterPreset.kt:45)");
                    int i10 = 2 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1506557082, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowA.<anonymous> (CenterPreset.kt:45)");
                }
                int i11 = onWarmupCompleted + 55;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 81;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1548350512, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowA.<anonymous>.<anonymous> (CenterPreset.kt:46)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onWarmupCompleted + 85;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getSwitchMinWidth<Boolean> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23;
        getSwitchMinWidth<Boolean> getswitchminwidth2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24;
        final getSwitchMinWidth<Boolean> getswitchminwidth3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getSwitchMinWidth<Boolean> getswitchminwidth4;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function25;
        int i4;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        boolean zIAuthTabCallback;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1691568968);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                i7 = 4;
            } else {
                int i9 = onWarmupCompleted + 119;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                function23 = function22;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ? 16 : 32;
            }
            if ((i & 384) != 0) {
                int i12 = onNavigationEvent + 111;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                if ((i2 & 4) == 0) {
                    getswitchminwidth2 = getswitchminwidth;
                    int i14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth2) ? 256 : 128;
                    i3 |= i14;
                } else {
                    getswitchminwidth2 = getswitchminwidth;
                }
                i3 |= i14;
            } else {
                getswitchminwidth2 = getswitchminwidth;
            }
            if ((i & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                    i6 = 2048;
                } else {
                    int i15 = onWarmupCompleted + 37;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                function24 = function23;
                getswitchminwidth3 = getswitchminwidth2;
            } else {
                int i17 = onWarmupCompleted + 33;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 4) != 0) {
                            int i18 = onNavigationEvent + 123;
                            onWarmupCompleted = i18 % 128;
                            int i19 = i18 % 2;
                            i3 &= -897;
                        }
                    }
                    i4 = i3;
                    function25 = function23;
                    getswitchminwidth4 = getswitchminwidth2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1691568968, i4, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowA (CenterPreset.kt:56)");
                    }
                    r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                    zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent());
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zIAuthTabCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback((r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() <= 1.4f || function25 != null) ? 0.0f : 1.0f);
                        i5 = onNavigationEvent + 47;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback));
                            throw null;
                        }
                        objOnMinimized = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized).IAuthTabCallback(), 0.0f, 0.0f, 13, (Object) null);
                    accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                    onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0IAuthTabCallback, accessgettlsversionsasstringp, function2, 0L, isrepeatingenabled.onExtraCallbackWithResult(), accessgetTlsVersionsAsStringp.Typography6, function25, 0L, isrepeatingenabled.asBinder(), getswitchminwidth4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 << 21) & 1879048192) | ((i4 << 6) & 896) | 100884528 | ((i4 << 15) & 3670016), (i4 >> 9) & 14, 136);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i20 = onWarmupCompleted + 117;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    function24 = function25;
                    getswitchminwidth3 = getswitchminwidth4;
                }
                if (i11 != 0) {
                    function23 = null;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    getswitchminwidth4 = this.IAuthTabCallback;
                    function25 = function23;
                } else {
                    i4 = i3;
                    function25 = function23;
                    getswitchminwidth4 = getswitchminwidth2;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent());
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zIAuthTabCallback) {
                    if (r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() <= 1.4f) {
                        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback((r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() <= 1.4f || function25 != null) ? 0.0f : 1.0f);
                        i5 = onNavigationEvent + 47;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda5
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i22 = 2 % 2;
                        int i23 = onWarmupCompleted + 69;
                        onNavigationEvent = i23 % 128;
                        if (i23 % 2 == 0) {
                            x3a x3aVar = this.f$0;
                            Function2 function26 = function2;
                            Function2 function27 = function24;
                            getSwitchMinWidth getswitchminwidth5 = getswitchminwidth3;
                            int i24 = i;
                            int i25 = i2;
                            int iIntValue = ((Integer) obj2).intValue();
                            Object[] objArr = {x3aVar, function26, function27, getswitchminwidth5, Integer.valueOf(i24), Integer.valueOf(i25), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                            return (Unit) x3a.onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1223406040, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1223406044, objArr);
                        }
                        x3a x3aVar2 = this.f$0;
                        Function2 function28 = function2;
                        Function2 function29 = function24;
                        getSwitchMinWidth getswitchminwidth6 = getswitchminwidth3;
                        int i26 = i;
                        int i27 = i2;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        Object[] objArr2 = {x3aVar2, function28, function29, getswitchminwidth6, Integer.valueOf(i26), Integer.valueOf(i27), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)};
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function23 = function22;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onTransact(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1248995194, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowB.<anonymous> (CenterPreset.kt:81)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onWarmupCompleted + 59;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onWarmupCompleted = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 2) != 5, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1805912400, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowB.<anonymous>.<anonymous> (CenterPreset.kt:82)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 27;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@NotNull final String str, @Nullable String str2, @Nullable getSwitchMinWidth<Boolean> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        getSwitchMinWidth<Boolean> getswitchminwidth2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
        final String str3 = (i2 & 2) != 0 ? null : str2;
        if ((i2 & 4) != 0) {
            getswitchminwidth2 = this.IAuthTabCallback;
            int i4 = onWarmupCompleted + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            getswitchminwidth2 = getswitchminwidth;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1644274396, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowC (CenterPreset.kt:111)");
        }
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(991433306, true, new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitAsInterface = x3a.asInterface(str, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                if (i8 == 0) {
                    int i9 = 47 / 0;
                }
                return unitAsInterface;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54);
        if (str3 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-476295233);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-476295232);
            encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-2063474288, true, new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    Unit unitOnExtraCallback;
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 21;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        unitOnExtraCallback = x3a.onExtraCallback(str3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i8 = 43 / 0;
                    } else {
                        unitOnExtraCallback = x3a.onExtraCallback(str3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i9 = IAuthTabCallback + 89;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i6 = onNavigationEvent + 7;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -616660016, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 616660018, new Object[]{this, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, encoderProfilesProxyVideoProfileProxyOnExtraCallback, getswitchminwidth2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 896) | 6 | (i & 7168)), 0});
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    private static final Unit getInterfaceDescriptor(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 125;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onWarmupCompleted + 83;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onNavigationEvent + 63;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(991433306, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowC.<anonymous> (CenterPreset.kt:113)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(991433306, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowC.<anonymous> (CenterPreset.kt:113)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 81;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 35;
            onWarmupCompleted = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 39;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2063474288, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.RowC.<anonymous>.<anonymous> (CenterPreset.kt:114)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 95;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i9 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-596958355, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.CenterItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CenterPreset.kt:183)");
        }
        function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth, x3a x3aVar, final Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        onNavigationEvent = i3 % 128;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 5) != 5, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1971247494, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.CenterItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CenterPreset.kt:178)");
            }
            if (getswitchminwidth != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(346319811);
                updateAdView.onNavigationEvent(((Boolean) getswitchminwidth.access000()).booleanValue(), x3aVar.onExtraCallbackWithResult(), ForwardingCameraControl.onExtraCallback(-596958355, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 11;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnWarmupCompleted = x3a.onWarmupCompleted(function2, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i9 = IAuthTabCallback + 37;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 4 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(346659602);
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, Function2 function2, final Function2 function22, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, long j2, GraphicDeviceInfo graphicDeviceInfo2, final getSwitchMinWidth getswitchminwidth, final x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0 ? (i & 3) == 2 : (i & 3) == 2) {
            int i5 = i4 + 113;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onWarmupCompleted + 99;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 29;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1770590695, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.CenterItem.<anonymous> (CenterPreset.kt:158)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1770590695, i, -1, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.CenterItem.<anonymous> (CenterPreset.kt:158)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
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
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1762551746);
            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp, j, graphicDeviceInfo, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048572, null));
            int i10 = accessgetCameraFactoryp.onNavigationEvent;
            setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, function2, cameraCaptureResultEmptyCameraCaptureResult, i10);
            if (function22 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1255226321);
                setPostviewFormatSelector.onNavigationEvent(PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048572, null)), ForwardingCameraControl.onExtraCallback(1971247494, true, new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallback + 63;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr = {getswitchminwidth, x3aVar, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                        Unit unit = (Unit) x3a.onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1296343725, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1296343719, objArr);
                        int i14 = onExtraCallbackWithResult + 41;
                        onExtraCallback = i14 % 128;
                        int i15 = i14 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, i10 | 48);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1254419081);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onWarmupCompleted + 93;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i13 = onWarmupCompleted + 51;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, long j, final GraphicDeviceInfo graphicDeviceInfo, final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, long j2, final GraphicDeviceInfo graphicDeviceInfo2, final getSwitchMinWidth<Boolean> getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        long jOnExtraCallbackWithResult;
        int i5;
        final long j3;
        final long j4;
        x2ExternalSyntheticLambda4 x2externalsyntheticlambda4;
        int i6;
        long jOnWarmupCompleted;
        int i7;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-452549750);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(accessgettlsversionsasstringp.ordinal())) {
                i7 = 16;
            } else {
                int i9 = onWarmupCompleted + 117;
                onNavigationEvent = i9 % 128;
                i7 = i9 % 2 == 0 ? 47 : 32;
            }
            i4 |= i7;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i10 = onWarmupCompleted + 103;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            jOnExtraCallbackWithResult = j;
            i4 |= ((i3 & 8) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnExtraCallbackWithResult)) ? 2048 : 1024;
        } else {
            jOnExtraCallbackWithResult = j;
        }
        if ((i & 24576) == 0) {
            int i11 = onWarmupCompleted + 83;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(accessgettlsversionsasstringp2.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            int i12 = onNavigationEvent + 3;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0 ? (i3 & 128) == 0 : (i3 & 28165) == 0) {
                int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 8388608 : 4194304;
                i4 |= i13;
            }
            i4 |= i13;
        }
        if ((i & 100663296) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i3 & 8) != 0) {
                    jOnExtraCallbackWithResult = x2ExternalSyntheticLambda4.IAuthTabCallback.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    i4 &= -7169;
                }
                if ((i3 & 128) != 0) {
                    int i14 = onWarmupCompleted + 51;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 == 0) {
                        x2externalsyntheticlambda4 = x2ExternalSyntheticLambda4.IAuthTabCallback;
                        i6 = 90;
                    } else {
                        x2externalsyntheticlambda4 = x2ExternalSyntheticLambda4.IAuthTabCallback;
                        i6 = 6;
                    }
                    i4 &= -29360129;
                    jOnWarmupCompleted = x2externalsyntheticlambda4.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i6);
                }
                final long j5 = jOnExtraCallbackWithResult;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-452549750, i4, i5, "im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset.CenterItem (CenterPreset.kt:153)");
                }
                x2ExternalSyntheticLambda36 x2externalsyntheticlambda36 = x2ExternalSyntheticLambda36.onExtraCallback;
                String strOnExtraCallbackWithResult = x2externalsyntheticlambda36.onExtraCallbackWithResult();
                r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted onwarmupcompleted = new r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted((Pair<? extends r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onExtraCallback<?>, ? extends Object>[]) new Pair[]{getWrite.IAuthTabCallback(x2externalsyntheticlambda36.onExtraCallback(), Boolean.valueOf(function22 == null))});
                final long j6 = jOnWarmupCompleted;
                Function2 function23 = new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda9
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i15 = 2 % 2;
                        int i16 = onExtraCallback + 101;
                        onNavigationEvent = i16 % 128;
                        int i17 = i16 % 2;
                        Unit unitIAuthTabCallback = x3a.IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, accessgettlsversionsasstringp, j5, graphicDeviceInfo, function2, function22, accessgettlsversionsasstringp2, j6, graphicDeviceInfo2, getswitchminwidth, this, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i18 = onNavigationEvent + 3;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                putBooleanArray.onExtraCallbackWithResult(strOnExtraCallbackWithResult, onwarmupcompleted, null, ForwardingCameraControl.onExtraCallback(1770590695, true, function23, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 4);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                j4 = j5;
                j3 = jOnWarmupCompleted;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 128) != 0) {
                    int i15 = onWarmupCompleted + 57;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    i4 &= -29360129;
                }
            }
            jOnWarmupCompleted = j2;
            final long j52 = jOnExtraCallbackWithResult;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            x2ExternalSyntheticLambda36 x2externalsyntheticlambda362 = x2ExternalSyntheticLambda36.onExtraCallback;
            String strOnExtraCallbackWithResult2 = x2externalsyntheticlambda362.onExtraCallbackWithResult();
            r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted onwarmupcompleted2 = new r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted((Pair<? extends r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onExtraCallback<?>, ? extends Object>[]) new Pair[]{getWrite.IAuthTabCallback(x2externalsyntheticlambda362.onExtraCallback(), Boolean.valueOf(function22 == null))});
            final long j62 = jOnWarmupCompleted;
            Function2 function232 = new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda9
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj22, Object obj3) {
                    int i152 = 2 % 2;
                    int i16 = onExtraCallback + 101;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitIAuthTabCallback = x3a.IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, accessgettlsversionsasstringp, j52, graphicDeviceInfo, function2, function22, accessgettlsversionsasstringp2, j62, graphicDeviceInfo2, getswitchminwidth, this, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                    int i18 = onNavigationEvent + 3;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    return unitIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            putBooleanArray.onExtraCallbackWithResult(strOnExtraCallbackWithResult2, onwarmupcompleted2, null, ForwardingCameraControl.onExtraCallback(1770590695, true, function232, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            j4 = j52;
            j3 = jOnWarmupCompleted;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            j3 = j2;
            j4 = jOnExtraCallbackWithResult;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda10
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i16 = 2 % 2;
                    int i17 = onExtraCallbackWithResult + 29;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitOnWarmupCompleted = x3a.onWarmupCompleted(this.f$0, deviceQuirksExternalSyntheticLambda0, accessgettlsversionsasstringp, function2, j4, graphicDeviceInfo, accessgettlsversionsasstringp2, function22, j3, graphicDeviceInfo2, getswitchminwidth, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i19 = onExtraCallbackWithResult + 115;
                    onWarmupCompleted = i19 % 128;
                    if (i19 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            });
        }
    }

    private final ResourceManagerInternalResourceManagerHooks onExtraCallbackWithResult() {
        int i = 2 % 2;
        getCallToActionButton getcalltoactionbutton = getCallToActionButton.onExtraCallback;
        ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksOnNavigationEvent = ResourceManagerInternalVdcInflateDelegate.onNavigationEvent(onQueryRefine.onExtraCallback(900, 30, getcalltoactionbutton.onExtraCallback()), new Function1() { // from class: im.toss.tds.compose.component.compound.stepperrow.v1.CenterPreset$$ExternalSyntheticLambda12
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 121;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Integer numValueOf = Integer.valueOf(x3a.onExtraCallback(((Integer) obj).intValue()));
                int i5 = onExtraCallback + 63;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return numValueOf;
            }
        }).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(onQueryRefine.onExtraCallback(300, 30, getcalltoactionbutton.onTransact()), 0.0f, 2, (Object) null));
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return resourceManagerInternalResourceManagerHooksOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(x3a x3aVar, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {x3aVar, function2, function22, getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1438041183, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1438041183, objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1125024732, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1125024735, objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x3a x3aVar, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {x3aVar, function2, function22, getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1223406040, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1223406044, objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSwitchMinWidth getswitchminwidth, x3a x3aVar, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getswitchminwidth, x3aVar, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1296343725, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1296343719, objArr);
    }

    private static final Unit onNavigationEvent(x3a x3aVar, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {x3aVar, function2, function22, getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1678312556, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1678312557, objArr);
    }

    public final void IAuthTabCallback(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getSwitchMinWidth<Boolean> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 206678162, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -206678157, objArr);
    }

    public final void onExtraCallback(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getSwitchMinWidth<Boolean> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -616660016, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 616660018, objArr);
    }
}
