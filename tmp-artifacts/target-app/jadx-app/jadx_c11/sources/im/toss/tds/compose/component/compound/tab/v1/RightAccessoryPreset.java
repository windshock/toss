package im.toss.tds.compose.component.compound.tab.v1;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AvoidCaptureProcessProgressAvailabilityCheckQuirk;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CaptureNoResponseQuirk;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.GraphicDeviceInfo;
import o.ImmediateFutureImmediateSuccessfulFuture;
import o.QuirksExternalSyntheticBackport0;
import o.RequestOptionConfigBuilderExternalSyntheticLambda0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.isRepeatingEnabled;
import o.r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA;
import o.setByteOrder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RightAccessorySlotMarker
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RightAccessoryPreset {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final RightAccessoryPreset onNavigationEvent = new RightAccessoryPreset();
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.values().length];
            try {
                iArr[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Small.ordinal()] = 2;
                int i = onExtraCallback + 101;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.values().length];
            try {
                iArr2[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Underline.ordinal()] = 1;
                int i3 = onExtraCallbackWithResult + 41;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square.ordinal()] = 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr2;
        }
    }

    private static final Unit IAuthTabCallback(RightAccessoryPreset rightAccessoryPreset, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        rightAccessoryPreset.onWarmupCompleted(i, quirksExternalSyntheticBackport0, j, j2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 46 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RightAccessoryPreset rightAccessoryPreset, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rightAccessoryPreset, i, quirksExternalSyntheticBackport0, j, j2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 38 / 0;
        }
        return unitIAuthTabCallback;
    }

    private RightAccessoryPreset() {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        long j3;
        int i6;
        final long j4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long j5;
        long jOnNavigationEvent;
        int i7;
        int i8;
        long jOnTransact = j2;
        int i9 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-420991361);
        if ((i2 & 6) == 0) {
            int i10 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 88 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                    int i12 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    i8 = 4;
                } else {
                    i8 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
            }
            i4 = i8 | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            int i15 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    j3 = j;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    int i17 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i17 % 128;
                    if (i17 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnTransact);
                        throw null;
                    }
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnTransact) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                        int i18 = onExtraCallbackWithResult + 49;
                        IAuthTabCallback = i18 % 128;
                        int i19 = i18 % 2;
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) != 9362, i4 & 1)) {
                    int i20 = IAuthTabCallback;
                    int i21 = i20 + 45;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 == 0) {
                        throw null;
                    }
                    if (i14 != 0) {
                        int i22 = i20 + 73;
                        onExtraCallbackWithResult = i22 % 128;
                        if (i22 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            throw null;
                        }
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    long jOnNavigationEvent2 = i5 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                    if (i6 != 0) {
                        jOnTransact = setByteOrder.Companion.onTransact();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-420991361, i4, -1, "im.toss.tds.compose.component.compound.tab.v1.RightAccessoryPreset.Number (RightAccessoryPreset.kt:25)");
                    }
                    r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA r8lambdamefghmy2txyc8kg26jswvkwvrwa = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback;
                    r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(r8lambdamefghmy2txyc8kg26jswvkwvrwa.onWarmupCompleted());
                    r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(r8lambdamefghmy2txyc8kg26jswvkwvrwa.asBinder());
                    GraphicDeviceInfo graphicDeviceInfoOnTransact = isRepeatingEnabled.onExtraCallback.onTransact();
                    if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnNavigationEvent2) == 0) {
                        int i23 = WhenMappings.IAuthTabCallback[iAuthTabCallback.ordinal()];
                        if (i23 == 1) {
                            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                        } else {
                            if (i23 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i24 = onExtraCallbackWithResult + 13;
                            IAuthTabCallback = i24 % 128;
                            int i25 = i24 % 2;
                            int i26 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
                            if (i26 == 1) {
                                jOnNavigationEvent = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15);
                            } else {
                                if (i26 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                jOnNavigationEvent = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13);
                            }
                        }
                        j5 = jOnNavigationEvent;
                    } else {
                        j5 = jOnNavigationEvent2;
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{String.valueOf(i), IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, onwarmupcompleted).onExtraCallback(quirksExternalSyntheticBackport04), null, Long.valueOf(jOnTransact), Long.valueOf(j5), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnTransact, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i4 & 7168), 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    j4 = jOnTransact;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    j3 = jOnNavigationEvent2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    j4 = jOnTransact;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final long j6 = j3;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.RightAccessoryPreset$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i27 = 2 % 2;
                            int i28 = onExtraCallback + 39;
                            onExtraCallbackWithResult = i28 % 128;
                            int i29 = i28 % 2;
                            Unit unitOnWarmupCompleted = RightAccessoryPreset.onWarmupCompleted(this.f$0, i, quirksExternalSyntheticBackport03, j6, j4, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i30 = onExtraCallbackWithResult + 85;
                            onExtraCallback = i30 % 128;
                            int i31 = i30 % 2;
                            return unitOnWarmupCompleted;
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 384;
            j3 = j;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) != 9362, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3 & 4;
        if (i5 != 0) {
        }
        j3 = j;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) != 9362, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        int i4 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
        if (i4 == 1) {
            quirksExternalSyntheticBackport0OnWarmupCompleted = CaptureNoResponseQuirk.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImmediateFutureImmediateSuccessfulFuture.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, "MediumNumber"), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), onExtraCallback, 0.0f, 2, (Object) null);
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i5 % 128;
            quirksExternalSyntheticBackport0OnWarmupCompleted = i5 % 2 == 0 ? CaptureNoResponseQuirk.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImmediateFutureImmediateSuccessfulFuture.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, "SmallNumber"), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), 2.0f, 1.0f, 2.0f, 51, (Object) null), onWarmupCompleted, 1.0f, 3, (Object) null) : CaptureNoResponseQuirk.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImmediateFutureImmediateSuccessfulFuture.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, "SmallNumber"), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), onWarmupCompleted, 0.0f, 2, (Object) null);
            int i6 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted);
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        float f = onWarmupCompleted;
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = asInterface + 7;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
