package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw;
import o.setClickTrackingUrls;
import o.toPreviewOnlyRange;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw implements MeteringRepeatingSessionExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final MeteringRepeatingSessionExternalSyntheticLambda0 onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        Integer num = (Integer) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        setClickTrackingUrls.IAuthTabCallback iAuthTabCallback = (setClickTrackingUrls.IAuthTabCallback) objArr[2];
        RightPreset rightPreset = (RightPreset) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(num, iIntValue, iAuthTabCallback, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(num, iIntValue, iAuthTabCallback, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = onExtraCallback + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, List list, Integer num, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setClickTrackingUrls.IAuthTabCallback iAuthTabCallback, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {r8lambdauhpxsw2exovtbrzj8u1te7trnw, list, num, function1, quirksExternalSyntheticBackport0, iAuthTabCallback, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 711758594, -711758593, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        int i7 = onExtraCallback + 21;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i4)) | i5;
        int i9 = ~i5;
        int i10 = ~(i9 | i4 | i2);
        int i11 = (~(i2 | i9)) | i4 | (~(i7 | i5));
        int i12 = i4 + i5 + i + ((-381402339) * i6) + ((-2062754392) * i3);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i4) + 1063714816 + (1288888451 * i5) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i) + (1454768128 * i6) + (808452096 * i3) + ((-1790509056) * i13);
        int i15 = ((i4 * (-1355236691)) - 921838429) + (i5 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i * (-1355236397)) + (i6 * (-1583251481)) + (i3 * 1682205048) + (i13 * (-427491328));
        return i14 + ((i15 * i15) * 844169216) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw = (r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw) objArr[0];
        List<String> list = (List) objArr[1];
        Integer num = (Integer) objArr[2];
        Function1<? super Integer, Unit> function1 = (Function1) objArr[3];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
        setClickTrackingUrls.IAuthTabCallback iAuthTabCallback = (setClickTrackingUrls.IAuthTabCallback) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        r8lambdauhpxsw2exovtbrzj8u1te7trnw.IAuthTabCallback(list, num, function1, quirksExternalSyntheticBackport0, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 19 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(function1, i);
        }
        onExtraCallbackWithResult(function1, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull QuirkSettingsLoader.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = this.onNavigationEvent.onExtraCallback(quirksExternalSyntheticBackport0, onnavigationevent);
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0 = this.onNavigationEvent;
        if (i3 == 0) {
            return meteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
        }
        meteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw(@NotNull MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        this.onNavigationEvent = meteringRepeatingSessionExternalSyntheticLambda0;
    }

    public final void onExtraCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long jOnTransact;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        getHumanReadableName gethumanreadablename2 = (i2 & 4) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        if ((i2 & 8) != 0) {
            jOnTransact = setByteOrder.Companion.onTransact();
            int i4 = onWarmupCompleted + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            }
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 32) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(536977344, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset.Text (ContentPreset.kt:39)");
        }
        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), 2, (Object) null), gethumanreadablename2, Long.valueOf(jOnTransact), Long.valueOf(jOnNavigationEvent), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(65422 & i), Integer.valueOf(i & 458752), 98272}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 113;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onExtraCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i5 = onWarmupCompleted + 111;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onWarmupCompleted + 49;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1851670717, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset.Selector.<anonymous>.<anonymous>.<anonymous> (ContentPreset.kt:69)");
            }
            w5aVar.onExtraCallbackWithResult(str, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 13;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Integer num, int i, setClickTrackingUrls.IAuthTabCallback iAuthTabCallback, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = onExtraCallback + 17;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(86595283, i3, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset.Selector.<anonymous>.<anonymous>.<anonymous> (ContentPreset.kt:72)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            float f = 0.0f;
            if (num != null && num.intValue() == i) {
                int i7 = onExtraCallback + 35;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    f = 1.0f;
                }
            }
            rightPreset.onWarmupCompleted(true, onCaptureSessionStart.onExtraCallback(onextracallback, f), iAuthTabCallback, null, false, null, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 6, 56);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 81;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset$$ExternalSyntheticLambda2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final List<String> list, @Nullable final Integer num, @NotNull final Function1<? super Integer, Unit> function1, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setClickTrackingUrls.IAuthTabCallback iAuthTabCallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int iOrdinal;
        int i4;
        boolean z;
        setClickTrackingUrls.IAuthTabCallback iAuthTabCallback2;
        int i5;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1451570718);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                int i8 = onWarmupCompleted + 35;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i10 = onExtraCallback + 105;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i12 = onExtraCallback + 125;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 78 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
            }
            i3 |= i5;
        }
        int i14 = i2 & 8;
        Object obj = null;
        if (i14 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            int i15 = onWarmupCompleted + 53;
            onExtraCallback = i15 % 128;
            if (i15 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2048 : 1024;
        }
        int i16 = i2 & 16;
        if (i16 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (iAuthTabCallback == null) {
                int i17 = onExtraCallback + 49;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                iOrdinal = -1;
            } else {
                iOrdinal = iAuthTabCallback.ordinal();
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal)) {
                int i19 = onExtraCallback + 121;
                int i20 = i19 % 128;
                onWarmupCompleted = i20;
                i4 = i19 % 2 != 0 ? 15878 : 16384;
                int i21 = i20 + 17;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        int i23 = i3;
        boolean z2 = true;
        if ((i23 & 9363) != 9362) {
            int i24 = onExtraCallback + 13;
            onWarmupCompleted = i24 % 128;
            int i25 = i24 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i23 & 1)) {
            if (i14 != 0) {
                int i26 = onWarmupCompleted + 59;
                onExtraCallback = i26 % 128;
                int i27 = i26 % 2;
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            final setClickTrackingUrls.IAuthTabCallback iAuthTabCallback3 = i16 != 0 ? setClickTrackingUrls.IAuthTabCallback.Line : iAuthTabCallback;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1451570718, i23, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset.Selector (ContentPreset.kt:62)");
            }
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
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
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2058532082);
            int size = list.size();
            final int i28 = 0;
            while (i28 < size) {
                final String str = list.get(i28);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1851670717, z2, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i29 = 2 % 2;
                        int i30 = onNavigationEvent + 109;
                        onExtraCallback = i30 % 128;
                        int i31 = i30 % 2;
                        Unit unitOnNavigationEvent = r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw.onNavigationEvent(str, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i32 = onNavigationEvent + 105;
                        onExtraCallback = i32 % 128;
                        if (i32 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(86595283, z2, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i29 = 2 % 2;
                        int i30 = onNavigationEvent + 23;
                        onExtraCallbackWithResult = i30 % 128;
                        int i31 = i30 % 2;
                        Integer num2 = num;
                        int i32 = i28;
                        setClickTrackingUrls.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback3;
                        RightPreset rightPreset = (RightPreset) obj2;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                        if (i31 != 0) {
                            Object[] objArr = {num2, Integer.valueOf(i32), iAuthTabCallback4, rightPreset, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((Integer) obj4).intValue())};
                            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                            return (Unit) r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw.onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 1458097396, -1458097396, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
                        }
                        Object[] objArr2 = {num2, Integer.valueOf(i32), iAuthTabCallback4, rightPreset, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((Integer) obj4).intValue())};
                        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                        int i33 = 63 / 0;
                        return (Unit) r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw.onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr2, 1458097396, -1458097396, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                boolean z3 = (i23 & 896) == 256 ? z2 : false;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i28);
                Function0 function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z3 | zOnExtraCallback) || function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    function0OnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i29 = 2 % 2;
                            int i30 = onNavigationEvent + 41;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            Unit unitOnNavigationEvent = r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw.onNavigationEvent(function1, i28);
                            int i32 = IAuthTabCallback + 13;
                            onNavigationEvent = i32 % 128;
                            int i33 = i32 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((Object) function0OnMinimized);
                }
                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, null, null, null, null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, null, null, null, null, null, null, null, null, function0OnMinimized, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 0, 114654);
                i28++;
                z2 = z2;
                i23 = i23;
                iAuthTabCallback3 = iAuthTabCallback3;
            }
            iAuthTabCallback2 = iAuthTabCallback3;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i29 = onExtraCallback + 81;
                onWarmupCompleted = i29 % 128;
                if (i29 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            iAuthTabCallback2 = iAuthTabCallback;
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final setClickTrackingUrls.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.v2.ContentPreset$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i30 = 2 % 2;
                    int i31 = onNavigationEvent + 59;
                    onExtraCallback = i31 % 128;
                    int i32 = i31 % 2;
                    Unit unitIAuthTabCallback = r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw.IAuthTabCallback(this.f$0, list, num, function1, quirksExternalSyntheticBackport03, iAuthTabCallback4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i33 = onNavigationEvent + 5;
                    onExtraCallback = i33 % 128;
                    int i34 = i33 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw)) {
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.onNavigationEvent != ((r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw) obj).onNavigationEvent) {
            return false;
        }
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            System.identityHashCode(this.onNavigationEvent);
            throw null;
        }
        int iIdentityHashCode = System.identityHashCode(this.onNavigationEvent);
        int i3 = onWarmupCompleted + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iIdentityHashCode;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Integer num, int i, setClickTrackingUrls.IAuthTabCallback iAuthTabCallback, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {num, Integer.valueOf(i), iAuthTabCallback, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 1458097396, -1458097396, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, List list, Integer num, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setClickTrackingUrls.IAuthTabCallback iAuthTabCallback, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {r8lambdauhpxsw2exovtbrzj8u1te7trnw, list, num, function1, quirksExternalSyntheticBackport0, iAuthTabCallback, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 711758594, -711758593, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
    }
}
