package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.GraphicDeviceInfo;
import o.InterfaceC0083handshake;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getDistanceBetweenPoints;
import o.getHumanReadableName;
import o.hasProvider;
import o.roundUpToNearestHalfInt;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class roundUpToNearestHalfInt extends getTotalHorizontalSpacing implements MeteringRepeatingSessionExternalSyntheticLambda0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final MeteringRepeatingSessionExternalSyntheticLambda0 IAuthTabCallback;
    private final int onExtraCallbackWithResult;

    public /* synthetic */ roundUpToNearestHalfInt(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(meteringRepeatingSessionExternalSyntheticLambda0, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        roundUpToNearestHalfInt rounduptonearesthalfint = (roundUpToNearestHalfInt) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rounduptonearesthalfint, quirksExternalSyntheticBackport0, jLongValue, deviceQuirksExternalSyntheticLambda0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallback(roundUpToNearestHalfInt rounduptonearesthalfint, hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, GraphicDeviceInfo graphicDeviceInfo, InterfaceC0083handshake interfaceC0083handshake, int i, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 39;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        rounduptonearesthalfint.onExtraCallback(hasprovider, gethumanreadablename, j, graphicDeviceInfo, interfaceC0083handshake, i, f, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 27;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i4));
        int i11 = (~(i5 | i4)) | (~((~i4) | i7 | i9));
        int i12 = i7 | i4 | i9;
        int i13 = i4 + i + i2 + (1362283521 * i3) + ((-853422242) * i6);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i4) - 1228931072) + ((-782767794) * i) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i2 * 465567744) + (465567744 * i3) + (1887436800 * i6) + ((-1154482176) * i14);
        int i16 = ((i4 * 722868660) - 41817558) + (i * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i2 * 722869185) + (i3 * 1172694977) + (i6 * (-747618338)) + (i14 * 791674880);
        int i17 = i15 + (i16 * i16 * 751828992);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(roundUpToNearestHalfInt rounduptonearesthalfint, int i, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InterfaceC0083handshake interfaceC0083handshake, hasProvider hasprovider, long j, GraphicDeviceInfo graphicDeviceInfo, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rounduptonearesthalfint, i, f, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, interfaceC0083handshake, hasprovider, j, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 103;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onNavigationEvent(roundUpToNearestHalfInt rounduptonearesthalfint, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        rounduptonearesthalfint.onExtraCallback(quirksExternalSyntheticBackport0, j, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 1;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        roundUpToNearestHalfInt rounduptonearesthalfint = (roundUpToNearestHalfInt) objArr[0];
        hasProvider hasprovider = (hasProvider) objArr[1];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[4];
        InterfaceC0083handshake interfaceC0083handshake = (InterfaceC0083handshake) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        float fFloatValue = ((Number) objArr[7]).floatValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[8];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int iIntValue3 = ((Number) objArr[11]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        int iIntValue4 = ((Number) objArr[13]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rounduptonearesthalfint, hasprovider, gethumanreadablename, jLongValue, graphicDeviceInfo, interfaceC0083handshake, iIntValue, fFloatValue, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i4 = onWarmupCompleted + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof roundUpToNearestHalfInt)) {
            return false;
        }
        roundUpToNearestHalfInt rounduptonearesthalfint = (roundUpToNearestHalfInt) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, rounduptonearesthalfint.IAuthTabCallback)) {
            return false;
        }
        if (!getDistanceBetweenPoints.onNavigationEvent.onNavigationEvent(this.onExtraCallbackWithResult, rounduptonearesthalfint.onExtraCallbackWithResult)) {
            int i4 = onNavigationEvent + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onNavigationEvent + 109;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        if (i5 == 0) {
            i = iHashCode << 119;
            i2 = this.onExtraCallbackWithResult;
        } else {
            i = iHashCode * 31;
            i2 = this.onExtraCallbackWithResult;
        }
        return i + getDistanceBetweenPoints.onNavigationEvent.onExtraCallback(i2);
    }

    public QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull QuirkSettingsLoader.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = this.IAuthTabCallback.onExtraCallback(quirksExternalSyntheticBackport0, onnavigationevent);
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ItemPreset(containerScope=" + this.IAuthTabCallback + ", indent=" + getDistanceBetweenPoints.onNavigationEvent.onNavigationEvent(this.onExtraCallbackWithResult) + ")";
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private roundUpToNearestHalfInt(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, int i) {
        super(i, 0.0f, 2, null);
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        this.IAuthTabCallback = meteringRepeatingSessionExternalSyntheticLambda0;
        this.onExtraCallbackWithResult = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ roundUpToNearestHalfInt(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 75;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                i = getDistanceBetweenPoints.onNavigationEvent.Companion.IAuthTabCallback();
                int i4 = 44 / 0;
            } else {
                i = getDistanceBetweenPoints.onNavigationEvent.Companion.IAuthTabCallback();
            }
            int i5 = onNavigationEvent + 119;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this(meteringRepeatingSessionExternalSyntheticLambda0, i, null);
    }

    @Override // o.getTotalHorizontalSpacing
    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i2 + 125;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo2;
        int iOnNavigationEvent;
        InterfaceC0083handshake interfaceC0083handshake2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i3 & 4) != 0) {
            int i5 = onNavigationEvent + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i3 & 8) != 0) {
            int i7 = onNavigationEvent + 21;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 105;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        if ((i3 & 32) != 0) {
            int i12 = onWarmupCompleted + 115;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            iOnNavigationEvent = onNavigationEvent();
        } else {
            iOnNavigationEvent = i;
        }
        float fOnExtraCallbackWithResult = (i3 & 64) != 0 ? onExtraCallbackWithResult() : f;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = (i3 & 128) != 0 ? getCombinedPathForAllStarsWithSide.onNavigationEvent(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : deviceQuirksExternalSyntheticLambda0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1475246792, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading1 (ItemPreset.kt:46)");
        }
        getHumanReadableName gethumanreadablenameOnExtraCallback = AppLovinVastMediaView.onExtraCallback(AppLovinPostbackService.onExtraCallbackWithResult.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (protocol.onNavigationEvent(interfaceC0083handshakeIAuthTabCallback)) {
            interfaceC0083handshake2 = interfaceC0083handshakeIAuthTabCallback;
        } else {
            interfaceC0083handshake2 = (InterfaceC0083handshake.onNavigationEvent) getCombinedPathForAllStarsWithSide.onExtraCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -268374465, C40Encoder.onExtraCallback(), 268374468, new Object[]{getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult});
        }
        onExtraCallback(hasprovider, gethumanreadablenameOnExtraCallback, jOnTransact, graphicDeviceInfo2, interfaceC0083handshake2, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (33496974 & i2) | ((i2 << 21) & 234881024) | ((i2 << 3) & 1879048192), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i3 & 2) != 0) {
            int i7 = onNavigationEvent + 71;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        long jOnTransact = (i3 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        Object obj = null;
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 8) != 0 ? null : graphicDeviceInfo;
        if ((i3 & 16) != 0) {
            int i9 = onNavigationEvent + 119;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
        } else {
            interfaceC0083handshakeIAuthTabCallback = interfaceC0083handshake;
        }
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        float fOnExtraCallbackWithResult = (i3 & 64) != 0 ? onExtraCallbackWithResult() : f;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = (i3 & 128) != 0 ? getCombinedPathForAllStarsWithSide.onNavigationEvent(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : deviceQuirksExternalSyntheticLambda0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = onWarmupCompleted + 115;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1793522682, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading1 (ItemPreset.kt:71)");
                int i12 = 48 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1793522682, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading1 (ItemPreset.kt:71)");
            }
        }
        onWarmupCompleted(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, jOnTransact, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, i2 & 268435440, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i13 = onNavigationEvent + 23;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        float f2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback;
        InterfaceC0083handshake interfaceC0083handshake2;
        getCombinedPathForAllStarsWithSide getcombinedpathforallstarswithside;
        float f3;
        float f4;
        float f5;
        float f6;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Object obj = null;
        if ((i3 & 2) != 0) {
            int i6 = onWarmupCompleted + 117;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                obj.hashCode();
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            int i7 = onWarmupCompleted + 5;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 5;
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 4) != 0) {
            int i9 = onWarmupCompleted + 21;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 8) != 0 ? null : graphicDeviceInfo;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        if ((i3 & 64) != 0) {
            float fOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i11 = onWarmupCompleted + 115;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            f2 = fOnExtraCallbackWithResult;
        } else {
            f2 = f;
        }
        if ((i3 & 128) != 0) {
            int i13 = onWarmupCompleted + 17;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 == 0) {
                getcombinedpathforallstarswithside = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult;
                f3 = 2.0f;
                f4 = 1.0f;
                f5 = 1.0f;
                f6 = 1.0f;
                i4 = 34;
            } else {
                getcombinedpathforallstarswithside = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
                f6 = 0.0f;
                i4 = 15;
            }
            deviceQuirksExternalSyntheticLambda0OnExtraCallback = getCombinedPathForAllStarsWithSide.onExtraCallback(getcombinedpathforallstarswithside, f3, f4, f5, f6, i4, (Object) null);
        } else {
            deviceQuirksExternalSyntheticLambda0OnExtraCallback = deviceQuirksExternalSyntheticLambda0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1890573609, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading2 (ItemPreset.kt:95)");
        }
        getHumanReadableName gethumanreadablenameOnExtraCallback = AppLovinVastMediaView.onExtraCallback((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (protocol.onNavigationEvent(interfaceC0083handshakeIAuthTabCallback)) {
            interfaceC0083handshake2 = interfaceC0083handshakeIAuthTabCallback;
        } else {
            Object[] objArr = {getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult};
            interfaceC0083handshake2 = (InterfaceC0083handshake.onNavigationEvent) getCombinedPathForAllStarsWithSide.onExtraCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -268374465, C40Encoder.onExtraCallback(), 268374468, objArr);
        }
        onExtraCallback(hasprovider, gethumanreadablenameOnExtraCallback, jOnTransact, graphicDeviceInfo2, interfaceC0083handshake2, iOnNavigationEvent, f2, deviceQuirksExternalSyntheticLambda0OnExtraCallback, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (33496974 & i2) | ((i2 << 21) & 234881024) | ((i2 << 3) & 1879048192), 0);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i3 & 3) != 0) {
                int i6 = onWarmupCompleted + 125;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i3 & 2) != 0) {
            }
        }
        long jOnTransact = (i3 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 8) != 0 ? null : graphicDeviceInfo;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        float fOnExtraCallbackWithResult = (i3 & 64) != 0 ? onExtraCallbackWithResult() : f;
        if ((i3 & 128) != 0) {
            int i8 = onWarmupCompleted + 29;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            deviceQuirksExternalSyntheticLambda0OnExtraCallback = getCombinedPathForAllStarsWithSide.onExtraCallback(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null);
        } else {
            deviceQuirksExternalSyntheticLambda0OnExtraCallback = deviceQuirksExternalSyntheticLambda0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(831897467, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading2 (ItemPreset.kt:120)");
        }
        onExtraCallbackWithResult(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, jOnTransact, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, i2 & 268435440, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onNavigationEvent + 99;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i11 != 0) {
                int i12 = 2 / 0;
            }
        }
    }

    public final void onExtraCallback(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo2;
        float fOnExtraCallbackWithResult;
        InterfaceC0083handshake interfaceC0083handshake2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i3 & 4) != 0) {
            int i5 = onNavigationEvent + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i3 & 8) != 0) {
            int i7 = onWarmupCompleted + 77;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        if ((i3 & 64) != 0) {
            int i9 = onNavigationEvent + 45;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                onExtraCallbackWithResult();
                throw null;
            }
            fOnExtraCallbackWithResult = onExtraCallbackWithResult();
        } else {
            fOnExtraCallbackWithResult = f;
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = (i3 & 128) != 0 ? getCombinedPathForAllStarsWithSide.IAuthTabCallback(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : deviceQuirksExternalSyntheticLambda0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onNavigationEvent + 105;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1989066870, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading3 (ItemPreset.kt:144)");
        }
        getHumanReadableName gethumanreadablenameOnExtraCallback = AppLovinVastMediaView.onExtraCallback(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallbackStub(), cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (protocol.onNavigationEvent(interfaceC0083handshakeIAuthTabCallback)) {
            interfaceC0083handshake2 = interfaceC0083handshakeIAuthTabCallback;
        } else {
            int i12 = onNavigationEvent + 49;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            interfaceC0083handshake2 = (InterfaceC0083handshake.onNavigationEvent) getCombinedPathForAllStarsWithSide.onExtraCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -268374465, C40Encoder.onExtraCallback(), 268374468, new Object[]{getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult});
        }
        onExtraCallback(hasprovider, gethumanreadablenameOnExtraCallback, jOnTransact, graphicDeviceInfo2, interfaceC0083handshake2, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (33496974 & i2) | ((i2 << 21) & 234881024) | ((i2 << 3) & 1879048192), 0);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i14 = onNavigationEvent + 33;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        roundUpToNearestHalfInt rounduptonearesthalfint = (roundUpToNearestHalfInt) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[4];
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (InterfaceC0083handshake) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        float fFloatValue = ((Number) objArr[7]).floatValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = (DeviceQuirksExternalSyntheticLambda0) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int iIntValue3 = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((iIntValue3 & 2) != 0) {
            int i4 = onWarmupCompleted + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                throw null;
            }
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
        }
        if ((iIntValue3 & 4) != 0) {
            int i5 = onWarmupCompleted + 41;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jLongValue = setByteOrder.Companion.onTransact();
            int i6 = onWarmupCompleted + 107;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((iIntValue3 & 8) != 0) {
            graphicDeviceInfo = null;
        }
        if ((iIntValue3 & 16) != 0) {
            interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
        }
        if ((iIntValue3 & 32) != 0) {
            int i8 = onWarmupCompleted + 109;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            iIntValue = rounduptonearesthalfint.onNavigationEvent();
        }
        if ((iIntValue3 & 64) != 0) {
            fFloatValue = rounduptonearesthalfint.onExtraCallbackWithResult();
        }
        if ((iIntValue3 & 128) != 0) {
            deviceQuirksExternalSyntheticLambda0IAuthTabCallback = getCombinedPathForAllStarsWithSide.IAuthTabCallback(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-129727748, iIntValue2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading3 (ItemPreset.kt:169)");
        }
        rounduptonearesthalfint.onExtraCallback(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), (QuirksExternalSyntheticBackport0) onextracallback, jLongValue, graphicDeviceInfo, interfaceC0083handshakeIAuthTabCallback, iIntValue, fFloatValue, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2 & 268435440, 0);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return null;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        GraphicDeviceInfo graphicDeviceInfo2;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((i3 & 3) != 0) {
                int i6 = onNavigationEvent + 103;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                int i8 = onNavigationEvent + 45;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 % 4;
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((i3 & 2) != 0) {
            }
        }
        long jOnTransact = (i3 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i3 & 8) != 0) {
            int i10 = onWarmupCompleted + 77;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if ((i3 & 16) != 0) {
            int i12 = onWarmupCompleted + 97;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
                int i13 = 33 / 0;
            } else {
                interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
            }
        } else {
            interfaceC0083handshakeIAuthTabCallback = interfaceC0083handshake;
        }
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        float fOnExtraCallbackWithResult = (i3 & 64) != 0 ? onExtraCallbackWithResult() : f;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = (i3 & 128) != 0 ? getCombinedPathForAllStarsWithSide.onWarmupCompleted(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : deviceQuirksExternalSyntheticLambda0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1573740053, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading4 (ItemPreset.kt:193)");
        }
        getHumanReadableName gethumanreadablenameOnExtraCallback = AppLovinVastMediaView.onExtraCallback(AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (!protocol.onNavigationEvent(interfaceC0083handshakeIAuthTabCallback)) {
            int i14 = onWarmupCompleted + 57;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr = {getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult};
            interfaceC0083handshakeIAuthTabCallback = (InterfaceC0083handshake.onNavigationEvent) getCombinedPathForAllStarsWithSide.onExtraCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -268374465, C40Encoder.onExtraCallback(), 268374468, objArr);
        }
        onExtraCallback(hasprovider, gethumanreadablenameOnExtraCallback, jOnTransact, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnWarmupCompleted, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (33496974 & i2) | ((i2 << 21) & 234881024) | ((i2 << 3) & 1879048192), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i16 = onNavigationEvent + 17;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i18 = onNavigationEvent + 71;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        long jOnTransact;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
        roundUpToNearestHalfInt rounduptonearesthalfint = (roundUpToNearestHalfInt) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[4];
        InterfaceC0083handshake interfaceC0083handshake = (InterfaceC0083handshake) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        float fFloatValue = ((Number) objArr[7]).floatValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int iIntValue3 = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((iIntValue3 & 2) != 0) {
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = onextracallback;
        if ((iIntValue3 & 4) != 0) {
            int i2 = onNavigationEvent + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = jLongValue;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (iIntValue3 & 8) != 0 ? null : graphicDeviceInfo;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (iIntValue3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (iIntValue3 & 32) != 0 ? rounduptonearesthalfint.onNavigationEvent() : iIntValue;
        float fOnExtraCallbackWithResult = (iIntValue3 & 64) != 0 ? rounduptonearesthalfint.onExtraCallbackWithResult() : fFloatValue;
        if ((iIntValue3 & 128) != 0) {
            int i4 = onNavigationEvent + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = getCombinedPathForAllStarsWithSide.onWarmupCompleted(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        } else {
            deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = deviceQuirksExternalSyntheticLambda0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1091352963, iIntValue2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Heading4 (ItemPreset.kt:218)");
        }
        rounduptonearesthalfint.IAuthTabCallback(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), (QuirksExternalSyntheticBackport0) onextracallback2, jOnTransact, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 268435440 & iIntValue2, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i6 = onWarmupCompleted + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = onNavigationEvent + 75;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void onNavigationEvent(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        long j2;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback;
        float fOnExtraCallbackWithResult;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnTransact;
        long jOnTransact;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i3 & 4) != 0) {
            int i7 = onWarmupCompleted + 43;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i8 = 68 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            j2 = jOnTransact;
        } else {
            j2 = j;
        }
        Object obj = null;
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 8) != 0 ? null : graphicDeviceInfo;
        if ((i3 & 16) != 0) {
            int i9 = onWarmupCompleted + 9;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
        } else {
            interfaceC0083handshakeIAuthTabCallback = interfaceC0083handshake;
        }
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        if ((i3 & 64) != 0) {
            int i11 = onNavigationEvent + 15;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            fOnExtraCallbackWithResult = onExtraCallbackWithResult();
        } else {
            fOnExtraCallbackWithResult = f;
        }
        if ((i3 & 128) != 0) {
            int i12 = onNavigationEvent + 79;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            deviceQuirksExternalSyntheticLambda0OnTransact = getCombinedPathForAllStarsWithSide.onTransact(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        } else {
            deviceQuirksExternalSyntheticLambda0OnTransact = deviceQuirksExternalSyntheticLambda0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-822350155, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Paragraph (ItemPreset.kt:242)");
        }
        onExtraCallback(hasprovider, AppLovinVastMediaView.onWarmupCompleted(AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), cameraCaptureResultEmptyCameraCaptureResult, 6), j2, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnTransact, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (33554318 & i2) | ((i2 << 21) & 234881024) | ((i2 << 3) & 1879048192), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i3 & 4) != 0) {
            int i5 = onNavigationEvent + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        Object obj = null;
        if ((i3 & 8) != 0) {
            int i7 = onNavigationEvent + 93;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        float fOnExtraCallbackWithResult = (i3 & 64) != 0 ? onExtraCallbackWithResult() : f;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnTransact = (i3 & 128) != 0 ? getCombinedPathForAllStarsWithSide.onTransact(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : deviceQuirksExternalSyntheticLambda0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1977515555, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Paragraph (ItemPreset.kt:267)");
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, jOnTransact, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnTransact, cameraCaptureResultEmptyCameraCaptureResult, i2 & 268435440, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onNavigationEvent + 87;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i9 != 0) {
                throw null;
            }
        }
    }

    public final void asBinder(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        float fOnExtraCallbackWithResult;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if ((i3 & 2) != 0) {
            int i5 = onNavigationEvent + 47;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        long jOnTransact = (i3 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 8) != 0 ? null : graphicDeviceInfo;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        if ((i3 & 64) != 0) {
            int i7 = onNavigationEvent + 111;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            fOnExtraCallbackWithResult = onExtraCallbackWithResult();
        } else {
            fOnExtraCallbackWithResult = f;
        }
        if ((i3 & 128) != 0) {
            int i9 = onWarmupCompleted + 25;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnTransact = getCombinedPathForAllStarsWithSide.onTransact(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            int i11 = onWarmupCompleted + 113;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnTransact;
        } else {
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(344744494, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.ParagraphSmall (ItemPreset.kt:291)");
        }
        onExtraCallback(hasprovider, AppLovinVastMediaView.onWarmupCompleted((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), cameraCaptureResultEmptyCameraCaptureResult, 6), jOnTransact, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda02, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (33554318 & i2) | ((i2 << 21) & 234881024) | ((i2 << 3) & 1879048192), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void asInterface(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        long j2;
        GraphicDeviceInfo graphicDeviceInfo2;
        float fOnExtraCallbackWithResult;
        long jOnTransact;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i3 & 4) != 0) {
            int i7 = onWarmupCompleted + 11;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i8 = 22 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            j2 = jOnTransact;
        } else {
            j2 = j;
        }
        if ((i3 & 8) != 0) {
            int i9 = onNavigationEvent + 59;
            int i10 = i9 % 128;
            onWarmupCompleted = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 51;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        if ((i3 & 64) != 0) {
            int i14 = onNavigationEvent + 91;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            fOnExtraCallbackWithResult = onExtraCallbackWithResult();
        } else {
            fOnExtraCallbackWithResult = f;
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnTransact = (i3 & 128) != 0 ? getCombinedPathForAllStarsWithSide.onTransact(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : deviceQuirksExternalSyntheticLambda0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1827639876, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.ParagraphSmall (ItemPreset.kt:316)");
        }
        asBinder(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, j2, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnTransact, cameraCaptureResultEmptyCameraCaptureResult, i2 & 268435440, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void IAuthTabCallbackStub(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnTransact;
        getCombinedPathForAllStarsWithSide getcombinedpathforallstarswithside;
        float f2;
        float f3;
        float f4;
        float f5;
        int i4;
        long jOnTransact;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if ((i3 & 2) != 0) {
            int i6 = onWarmupCompleted + 77;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 4) != 0) {
            int i7 = onWarmupCompleted + 123;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i8 = 10 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            j2 = jOnTransact;
        } else {
            j2 = j;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 8) != 0 ? null : graphicDeviceInfo;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        float fOnExtraCallbackWithResult = (i3 & 64) != 0 ? onExtraCallbackWithResult() : f;
        if ((i3 & 128) != 0) {
            int i9 = onNavigationEvent + 19;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                getcombinedpathforallstarswithside = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult;
                f2 = 0.0f;
                f3 = 2.0f;
                f4 = 2.0f;
                f5 = 0.0f;
                i4 = 29;
            } else {
                getcombinedpathforallstarswithside = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
                i4 = 15;
            }
            deviceQuirksExternalSyntheticLambda0OnTransact = getCombinedPathForAllStarsWithSide.onTransact(getcombinedpathforallstarswithside, f2, f3, f4, f5, i4, null);
        } else {
            deviceQuirksExternalSyntheticLambda0OnTransact = deviceQuirksExternalSyntheticLambda0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1818861446, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.ParagraphXSmall (ItemPreset.kt:340)");
        }
        onExtraCallback(hasprovider, AppLovinVastMediaView.onWarmupCompleted(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), cameraCaptureResultEmptyCameraCaptureResult, 6), j2, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnTransact, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (33554318 & i2) | ((i2 << 21) & 234881024) | ((i2 << 3) & 1879048192), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onWarmupCompleted + 31;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void IAuthTabCallbackStub(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i3 & 2) != 0) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            int i5 = onNavigationEvent + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 4) != 0) {
            long jOnTransact = setByteOrder.Companion.onTransact();
            int i7 = onNavigationEvent + 41;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            j2 = jOnTransact;
        } else {
            j2 = j;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 8) != 0 ? null : graphicDeviceInfo;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 16) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        int iOnNavigationEvent = (i3 & 32) != 0 ? onNavigationEvent() : i;
        float fOnExtraCallbackWithResult = (i3 & 64) != 0 ? onExtraCallbackWithResult() : f;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnTransact = (i3 & 128) != 0 ? getCombinedPathForAllStarsWithSide.onTransact(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : deviceQuirksExternalSyntheticLambda0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-978357780, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.ParagraphXSmall (ItemPreset.kt:365)");
        }
        IAuthTabCallbackStub(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, j2, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, deviceQuirksExternalSyntheticLambda0OnTransact, cameraCaptureResultEmptyCameraCaptureResult, i2 & 268435440, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        long jOnTransact;
        int i5;
        boolean z;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult = deviceQuirksExternalSyntheticLambda0;
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 109;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(624834673);
        int i9 = i2 & 1;
        if (i9 != 0) {
            int i10 = onNavigationEvent + 115;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i12 = onNavigationEvent + 31;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                jOnTransact = j;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnTransact) ? 32 : 16;
            }
            i5 = i2 & 4;
            Object obj = null;
            if (i5 == 0) {
                int i15 = onNavigationEvent + 93;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                i3 |= 384;
            } else if ((i & 384) == 0) {
                int i17 = onNavigationEvent + 71;
                onWarmupCompleted = i17 % 128;
                if (i17 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult);
                    obj.hashCode();
                    throw null;
                }
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult) ? 256 : 128;
            }
            if ((i3 & 147) == 146) {
                int i18 = onWarmupCompleted + 51;
                onNavigationEvent = i18 % 128;
                z = i18 % 2 != 0;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (i14 != 0) {
                    jOnTransact = setByteOrder.Companion.onTransact();
                }
                if (i5 != 0) {
                    deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(624834673, i3, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Border (ItemPreset.kt:383)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-829290659);
                long jIAuthTabCallback = jOnTransact != 16 ? jOnTransact : getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, jIAuthTabCallback, (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport04), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                int i19 = onNavigationEvent + 77;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final long j2 = jOnTransact;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ItemPreset$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i21 = 2 % 2;
                        int i22 = onWarmupCompleted + 85;
                        IAuthTabCallback = i22 % 128;
                        Object obj4 = null;
                        if (i22 % 2 == 0) {
                            roundUpToNearestHalfInt rounduptonearesthalfint = this.f$0;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                            long j3 = j2;
                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda02;
                            int i23 = i;
                            int i24 = i2;
                            int iIntValue = ((Integer) obj3).intValue();
                            Object[] objArr = {rounduptonearesthalfint, quirksExternalSyntheticBackport05, Long.valueOf(j3), deviceQuirksExternalSyntheticLambda03, Integer.valueOf(i23), Integer.valueOf(i24), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                            obj4.hashCode();
                            throw null;
                        }
                        roundUpToNearestHalfInt rounduptonearesthalfint2 = this.f$0;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                        long j4 = j2;
                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda02;
                        int i25 = i;
                        int i26 = i2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        Object[] objArr2 = {rounduptonearesthalfint2, quirksExternalSyntheticBackport06, Long.valueOf(j4), deviceQuirksExternalSyntheticLambda04, Integer.valueOf(i25), Integer.valueOf(i26), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                        Unit unit = (Unit) roundUpToNearestHalfInt.onNavigationEvent(888108656, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -888108656, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr2, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
                        int i27 = onWarmupCompleted + 121;
                        IAuthTabCallback = i27 % 128;
                        if (i27 % 2 != 0) {
                            return unit;
                        }
                        obj4.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        jOnTransact = j;
        i5 = i2 & 4;
        Object obj2 = null;
        if (i5 == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallback(roundUpToNearestHalfInt rounduptonearesthalfint, int i, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InterfaceC0083handshake interfaceC0083handshake, hasProvider hasprovider, long j, GraphicDeviceInfo graphicDeviceInfo, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        boolean z;
        InterfaceC0083handshake interfaceC0083handshake2;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 27;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-478466857, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Content.<anonymous> (ItemPreset.kt:407)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-478466857, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Content.<anonymous> (ItemPreset.kt:407)");
            }
            Object[] objArr = {rounduptonearesthalfint, QuirksExternalSyntheticBackport0.Companion, Integer.valueOf(i), Float.valueOf(f)};
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback((QuirksExternalSyntheticBackport0) getTotalHorizontalSpacing.IAuthTabCallback(RNSScreenManagerDelegate.onNavigationEvent(), 1850937832, -1850937830, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), objArr), deviceQuirksExternalSyntheticLambda0).onExtraCallback(quirksExternalSyntheticBackport0);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = onWarmupCompleted + 53;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
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
            if (protocol.onNavigationEvent(interfaceC0083handshake)) {
                interfaceC0083handshake2 = interfaceC0083handshake;
            } else {
                InterfaceC0083handshake.onNavigationEvent onNavigationEvent2 = getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult.onNavigationEvent();
                int i8 = onNavigationEvent + 41;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                interfaceC0083handshake2 = onNavigationEvent2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, null, null, j, 0L, 0L, interfaceC0083handshake2, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 196534);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(final hasProvider hasprovider, final getHumanReadableName gethumanreadablename, final long j, final GraphicDeviceInfo graphicDeviceInfo, final InterfaceC0083handshake interfaceC0083handshake, final int i, final float f, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(317655592);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        Object obj = null;
        if ((i2 & 48) == 0) {
            int i8 = onWarmupCompleted + 25;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i9 = onNavigationEvent + 35;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            int i11 = onWarmupCompleted + 35;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo)) {
                int i13 = onWarmupCompleted + 51;
                onNavigationEvent = i13 % 128;
                i6 = i13 % 2 == 0 ? 28013 : 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceC0083handshake) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                i5 = 1048576;
            } else {
                int i14 = onWarmupCompleted + 47;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i5 = 524288;
            }
            i4 |= i5;
        }
        if ((12582912 & i2) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 8388608 : 4194304;
        }
        int i16 = i3 & 256;
        if (i16 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 536870912 : 268435456;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) != 306783378, i4 & 1)) {
            if (i16 != 0) {
                int i17 = onNavigationEvent + 9;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i19 = onWarmupCompleted + 83;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(317655592, i4, -1, "im.toss.tds.compose.component.atom.post.v2.ItemPreset.Content (ItemPreset.kt:405)");
            }
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            PreviewExternalSyntheticLambda3.IAuthTabCallback(gethumanreadablename, ForwardingCameraControl.onExtraCallback(-478466857, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ItemPreset$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i21 = 2 % 2;
                    int i22 = onNavigationEvent + 41;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    Unit unitOnNavigationEvent = roundUpToNearestHalfInt.onNavigationEvent(this.f$0, i, f, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport04, interfaceC0083handshake, hasprovider, j, graphicDeviceInfo, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i24 = onNavigationEvent + 7;
                    onWarmupCompleted = i24 % 128;
                    if (i24 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 3) & 14) | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ItemPreset$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i21 = 2 % 2;
                    int i22 = IAuthTabCallback + 49;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                    roundUpToNearestHalfInt rounduptonearesthalfint = this.f$0;
                    hasProvider hasprovider2 = hasprovider;
                    getHumanReadableName gethumanreadablename2 = gethumanreadablename;
                    long j2 = j;
                    GraphicDeviceInfo graphicDeviceInfo2 = graphicDeviceInfo;
                    InterfaceC0083handshake interfaceC0083handshake2 = interfaceC0083handshake;
                    int i24 = i;
                    float f2 = f;
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                    int i25 = i2;
                    int i26 = i3;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr = {rounduptonearesthalfint, hasprovider2, gethumanreadablename2, Long.valueOf(j2), graphicDeviceInfo2, interfaceC0083handshake2, Integer.valueOf(i24), Float.valueOf(f2), deviceQuirksExternalSyntheticLambda02, quirksExternalSyntheticBackport06, Integer.valueOf(i25), Integer.valueOf(i26), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) roundUpToNearestHalfInt.onNavigationEvent(-1217551878, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1217551880, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
                    int i27 = IAuthTabCallback + 41;
                    onNavigationEvent = i27 % 128;
                    int i28 = i27 % 2;
                    return unit;
                }
            });
        }
        int i21 = onWarmupCompleted + 119;
        onNavigationEvent = i21 % 128;
        if (i21 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(roundUpToNearestHalfInt rounduptonearesthalfint, hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, GraphicDeviceInfo graphicDeviceInfo, InterfaceC0083handshake interfaceC0083handshake, int i, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {rounduptonearesthalfint, hasprovider, gethumanreadablename, Long.valueOf(j), graphicDeviceInfo, interfaceC0083handshake, Integer.valueOf(i), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) onNavigationEvent(-1217551878, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1217551880, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(roundUpToNearestHalfInt rounduptonearesthalfint, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {rounduptonearesthalfint, quirksExternalSyntheticBackport0, Long.valueOf(j), deviceQuirksExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onNavigationEvent(888108656, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -888108656, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public final void onExtraCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {this, str, quirksExternalSyntheticBackport0, Long.valueOf(j), graphicDeviceInfo, interfaceC0083handshake, Integer.valueOf(i), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        onNavigationEvent(-455205582, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 455205585, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable InterfaceC0083handshake interfaceC0083handshake, int i, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {this, str, quirksExternalSyntheticBackport0, Long.valueOf(j), graphicDeviceInfo, interfaceC0083handshake, Integer.valueOf(i), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        onNavigationEvent(1709978979, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1709978978, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }
}
