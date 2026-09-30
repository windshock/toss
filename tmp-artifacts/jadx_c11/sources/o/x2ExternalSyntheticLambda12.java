package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.tds.compose.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.InterfaceC0083handshake;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.x2ExternalSyntheticLambda12;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda12 {
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final x2ExternalSyntheticLambda12 onExtraCallbackWithResult = new x2ExternalSyntheticLambda12();
    private static final InterfaceC0083handshake.onNavigationEvent onExtraCallback = ConnectionPool.onWarmupCompleted.onWarmupCompleted();
    private static final CameraUnavailableException onWarmupCompleted = new CameraUnavailableException(0, (Boolean) null, 0, filterResolutionsByAspectRatio.Companion.asInterface(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 119, (DefaultConstructorMarker) null);
    private static final CameraState IAuthTabCallback = new CameraState((Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, 63, (DefaultConstructorMarker) null);

    private static final Unit onExtraCallback(x2ExternalSyntheticLambda12 x2externalsyntheticlambda12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            x2externalsyntheticlambda12.onExtraCallback(quirksExternalSyntheticBackport0, z, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            x2externalsyntheticlambda12.onExtraCallback(quirksExternalSyntheticBackport0, z, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 39;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i6) | i7 | i2);
        int i9 = (~(i7 | (~i2))) | (~(i2 | i6));
        int i10 = (~(i6 | i)) | i2;
        int i11 = i2 + i + i3 + ((-407681510) * i4) + ((-298114539) * i5);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i2) + 672923648 + (2103481690 * i) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i3) + ((-328728576) * i4) + ((-2108424192) * i5) + ((-1296629760) * i12);
        int i14 = ((i2 * 57881544) - 1472685786) + (i * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * 205) + (i3 * 57881749) + (i4 * 289608994) + (i5 * 969284153) + (i12 * 813891584);
        int i15 = i13 + (i14 * i14 * 454098944);
        if (i15 != 1) {
            if (i15 == 2) {
                return onWarmupCompleted(objArr);
            }
            useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
            int i16 = 2 % 2;
            int i17 = asInterface + 79;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            Unit unit = Unit.INSTANCE;
            int i19 = asInterface + 53;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            return unit;
        }
        x2ExternalSyntheticLambda12 x2externalsyntheticlambda12 = (x2ExternalSyntheticLambda12) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i21 = 2 % 2;
        int i22 = asInterface + 125;
        onNavigationEvent = i22 % 128;
        int i23 = i22 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(x2externalsyntheticlambda12, quirksExternalSyntheticBackport0, zBooleanValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i24 = asInterface + 115;
        onNavigationEvent = i24 % 128;
        int i25 = i24 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {useandconfigureprogramwithtexture};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        if (i3 != 0) {
            unit = (Unit) onExtraCallbackWithResult(objArr, 1750309847, -1750309847, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted);
            int i4 = 20 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(objArr, 1750309847, -1750309847, iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted);
        }
        int i5 = asInterface + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(x2ExternalSyntheticLambda12 x2externalsyntheticlambda12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        x2externalsyntheticlambda12.onExtraCallback(quirksExternalSyntheticBackport0, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = asInterface + 7;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onExtraCallbackWithResult(new Object[]{str, useandconfigureprogramwithtexture}, 268308865, -268308863, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(x2ExternalSyntheticLambda12 x2externalsyntheticlambda12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(x2externalsyntheticlambda12, quirksExternalSyntheticBackport0, z, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(x2externalsyntheticlambda12, quirksExternalSyntheticBackport0, z, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 65;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private x2ExternalSyntheticLambda12() {
    }

    public final long onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1688870446, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.<get-backgroundColor> (TdsSearchFieldV1Defaults.kt:43)");
        }
        long jOnWarmupCompleted = lc.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i4 = asInterface + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return jOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long onTransact(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = asInterface + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1571349232, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.<get-textFieldColor> (TdsSearchFieldV1Defaults.kt:48)");
                int i5 = asInterface + 93;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
        }
        long jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.SearchFieldFill, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnWarmupCompleted;
    }

    public final long onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = asInterface + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1195846920, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.<get-searchIconColor> (TdsSearchFieldV1Defaults.kt:53)");
            int i7 = asInterface + 51;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = asInterface + 77;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnExtraCallback;
    }

    public final long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onNavigationEvent + 99;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2032289296, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.<get-clearIconColor> (TdsSearchFieldV1Defaults.kt:58)");
            int i5 = asInterface + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = asInterface + 13;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = asInterface + 67;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 79 / 0;
        }
        return jOnExtraCallback;
    }

    public final long asBinder(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onNavigationEvent + 7;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2146963536, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.<get-textColor> (TdsSearchFieldV1Defaults.kt:63)");
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextStrong, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onNavigationEvent + 113;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnExtraCallback;
    }

    public final long IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = asInterface + 41;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-171879600, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.<get-placeholderColor> (TdsSearchFieldV1Defaults.kt:68)");
            if (i6 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = asInterface + 73;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 2;
            }
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextQuaternary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnExtraCallback;
    }

    public final long onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onNavigationEvent + 23;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1964138402, i, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.<get-cursorColor> (TdsSearchFieldV1Defaults.kt:73)");
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.FillBrand, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onNavigationEvent + 123;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                throw null;
            }
        }
        int i7 = onNavigationEvent + 73;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return jOnExtraCallback;
    }

    static {
        int i = asBinder + 65;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CameraUnavailableException onExtraCallback() {
        CameraUnavailableException cameraUnavailableException;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            cameraUnavailableException = onWarmupCompleted;
            int i4 = 20 / 0;
        } else {
            cameraUnavailableException = onWarmupCompleted;
        }
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return cameraUnavailableException;
        }
        throw null;
    }

    public final CameraState onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        CameraState cameraState = IAuthTabCallback;
        int i5 = i3 + 93;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return cameraState;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        boolean z2;
        boolean z3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z4;
        float fIAuthTabCallback;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 105;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(18563936);
        int i7 = i2 & 1;
        if (i7 != 0) {
            int i8 = asInterface + 111;
            onNavigationEvent = i8 % 128;
            i3 = i8 % 2 != 0 ? i | 118 : i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            int i9 = asInterface + 77;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 256 : 128;
            }
            if ((i3 & 147) == 146) {
                int i12 = asInterface + 19;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                if (i7 != 0) {
                    int i14 = onNavigationEvent + 89;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                } else {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                }
                if (i11 != 0) {
                    int i16 = onNavigationEvent + 49;
                    asInterface = i16 % 128;
                    z4 = i16 % 2 == 0;
                } else {
                    z4 = z2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(18563936, i3, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.Icon (TdsSearchFieldV1Defaults.kt:85)");
                }
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    int i17 = onNavigationEvent + 25;
                    asInterface = i17 % 128;
                    int i18 = i17 % 2;
                    objOnMinimized = Float.valueOf(deprecated_immutable.onWarmupCompleted(Float.valueOf(varyFields.onExtraCallbackWithResult(accessgetTlsVersionsAsStringp.Typography5, r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(), null, 2, null)), new Number[]{fValueOf, Float.valueOf(2.0f)}, new Number[]{fValueOf, Float.valueOf(1.5f)}).floatValue());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                float fFloatValue = ((Number) objOnMinimized).floatValue();
                int i19 = R.drawable.icn_searchfield;
                if (z4) {
                    int i20 = onNavigationEvent + 77;
                    asInterface = i20 % 128;
                    int i21 = i20 % 2;
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fFloatValue * 24.0f);
                } else {
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport04, fIAuthTabCallback);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i22 = 2 % 2;
                            int i23 = onExtraCallbackWithResult + 97;
                            onWarmupCompleted = i23 % 128;
                            int i24 = i23 % 2;
                            Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda12.onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
                            int i25 = onExtraCallbackWithResult + 75;
                            onWarmupCompleted = i25 % 128;
                            int i26 = i25 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                AppLovinNativeAdImplc.onExtraCallback(i19, getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized2), onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 6) & 14), null, null, null, null, null, "", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663296, 248);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                z2 = z4;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final boolean z5 = z2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i22 = 2 % 2;
                        int i23 = onNavigationEvent + 5;
                        onWarmupCompleted = i23 % 128;
                        int i24 = i23 % 2;
                        x2ExternalSyntheticLambda12 x2externalsyntheticlambda12 = this.f$0;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                        boolean z6 = z5;
                        int i25 = i;
                        int i26 = i2;
                        int iIntValue = ((Integer) obj2).intValue();
                        Unit unit = (Unit) x2ExternalSyntheticLambda12.onExtraCallbackWithResult(new Object[]{x2externalsyntheticlambda12, quirksExternalSyntheticBackport05, Boolean.valueOf(z6), Integer.valueOf(i25), Integer.valueOf(i26), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, -983128304, 983128305, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
                        int i27 = onNavigationEvent + 113;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        return unit;
                    }
                });
                return;
            }
            return;
        }
        int i22 = asInterface + 107;
        onNavigationEvent = i22 % 128;
        int i23 = i22 % 2;
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        boolean z2;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1148150196);
        int i6 = i2 & 1;
        if (i6 != 0) {
            int i7 = asInterface + 47;
            onNavigationEvent = i7 % 128;
            i3 = i7 % 2 != 0 ? i | 37 : i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i9 = asInterface + 79;
                    onNavigationEvent = i9 % 128;
                    i4 = i9 % 2 != 0 ? 29 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i & 384) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                z3 = z2;
            } else {
                int i10 = onNavigationEvent + 97;
                asInterface = i10 % 128;
                Object obj = null;
                if (i10 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i6 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                z3 = i8 != 0 ? true : z2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1148150196, i3, -1, "im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults.Clear (TdsSearchFieldV1Defaults.kt:109)");
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    int i11 = onNavigationEvent + 91;
                    asInterface = i11 % 128;
                    if (i11 % 2 == 0) {
                        objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        int i12 = 65 / 0;
                    } else {
                        objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                }
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_search_field_clear, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(addAdapter.onExtraCallback(quirksExternalSyntheticBackport03, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, configureReward.onExtraCallback(0.9f, 1.0f), null, 4, null), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, z3, (String) null, Role.IAuthTabCallback(Role.Companion.onWarmupCompleted()), function0, 8, (Object) null);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2) {
                            int i13 = 2 % 2;
                            int i14 = onExtraCallbackWithResult + 87;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                            String str = strOnExtraCallback;
                            useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                            if (i15 != 0) {
                                return x2ExternalSyntheticLambda12.onNavigationEvent(str, useandconfigureprogramwithtexture);
                            }
                            x2ExternalSyntheticLambda12.onNavigationEvent(str, useandconfigureprogramwithtexture);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, false, (Function1) objOnMinimized2, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i13 = asInterface + 115;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinNativeAdImplc.onExtraCallback(R.drawable.icn_delete, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, onextracallbackwithresult.onExtraCallback()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), onExtraCallbackWithResult.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), null, null, null, null, null, "", cameraCaptureResultEmptyCameraCaptureResult2, 100663296, 248);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final boolean z4 = z3;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.searchfield.TdsSearchFieldV1Defaults$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i15 = 2 % 2;
                        int i16 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i16 % 128;
                        if (i16 % 2 == 0) {
                            x2ExternalSyntheticLambda12.onNavigationEvent(this.f$0, quirksExternalSyntheticBackport02, z4, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit unitOnNavigationEvent = x2ExternalSyntheticLambda12.onNavigationEvent(this.f$0, quirksExternalSyntheticBackport02, z4, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i17 = onExtraCallbackWithResult + 107;
                        onNavigationEvent = i17 % 128;
                        int i18 = i17 % 2;
                        return unitOnNavigationEvent;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        int i15 = asInterface + 61;
        onNavigationEvent = i15 % 128;
        int i16 = i15 % 2;
        if ((i & 384) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(x2ExternalSyntheticLambda12 x2externalsyntheticlambda12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onExtraCallbackWithResult(new Object[]{x2externalsyntheticlambda12, quirksExternalSyntheticBackport0, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, -983128304, 983128305, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onExtraCallbackWithResult(new Object[]{str, useandconfigureprogramwithtexture}, 268308865, -268308863, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onExtraCallbackWithResult(new Object[]{useandconfigureprogramwithtexture}, 1750309847, -1750309847, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }
}
