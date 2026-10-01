package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda25;
import o.x2ExternalSyntheticLambda27;
import o.x2ExternalSyntheticLambda29;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda27 {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback;
    private final int IAuthTabCallback;
    private final x2ExternalSyntheticLambda25.onExtraCallback onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        x2ExternalSyntheticLambda27 x2externalsyntheticlambda27 = (x2ExternalSyntheticLambda27) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(x2externalsyntheticlambda27, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(x2externalsyntheticlambda27, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = onExtraCallback + 97;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i2)) | i9 | (~(i8 | i2));
        int i11 = ~i2;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i4;
        int i14 = i + i4 + i6 + ((-700610695) * i3) + ((-1151578525) * i5);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i) + 1030029312 + ((-1366800679) * i4) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i6) + ((-665714688) * i3) + (367394816 * i5) + (374145024 * i15);
        int i17 = ((i * 323709325) - 650539883) + (i4 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i6 * 323709601) + (i3 * (-499299047)) + (i5 * 1568885315) + (i15 * (-395509760));
        int i18 = i16 + (i17 * i17 * (-772603904));
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    private static final Unit IAuthTabCallback(x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        x2externalsyntheticlambda27.onNavigationEvent(x2externalsyntheticlambda29, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 45;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit asBinder(x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        x2externalsyntheticlambda27.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        x2ExternalSyntheticLambda29 x2externalsyntheticlambda29 = (x2ExternalSyntheticLambda29) objArr[0];
        x2ExternalSyntheticLambda27 x2externalsyntheticlambda27 = (x2ExternalSyntheticLambda27) objArr[1];
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent(x2externalsyntheticlambda29, x2externalsyntheticlambda27, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        int i4 = IAuthTabCallbackDefault + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallback(x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return asBinder(x2externalsyntheticlambda27, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        asBinder(x2externalsyntheticlambda27, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(x2externalsyntheticlambda29, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f);
            throw null;
        }
        float fOnExtraCallback = onExtraCallback(x2externalsyntheticlambda29, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f);
        int i3 = onExtraCallback + 33;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return fOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        x2externalsyntheticlambda27.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 51;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 29;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            onWarmupCompleted(x2externalsyntheticlambda27, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(x2externalsyntheticlambda27, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 59;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(x2externalsyntheticlambda27, x2externalsyntheticlambda29, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 3;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        x2externalsyntheticlambda27.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 55;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 8 / 0;
        }
        return unit;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2ExternalSyntheticLambda27)) {
            int i2 = onExtraCallback + 89;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        x2ExternalSyntheticLambda27 x2externalsyntheticlambda27 = (x2ExternalSyntheticLambda27) obj;
        if (Float.compare(this.onWarmupCompleted, x2externalsyntheticlambda27.onWarmupCompleted) != 0) {
            return false;
        }
        if (Float.compare(this.onNavigationEvent, x2externalsyntheticlambda27.onNavigationEvent) != 0) {
            int i4 = IAuthTabCallbackDefault + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.IAuthTabCallback != x2externalsyntheticlambda27.IAuthTabCallback) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, x2externalsyntheticlambda27.onExtraCallbackWithResult)) {
            int i6 = IAuthTabCallbackDefault + 87;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = IAuthTabCallbackDefault + 19;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.onWarmupCompleted);
        return i3 == 0 ? (((((iHashCode / 73) >>> Float.hashCode(this.onNavigationEvent)) >> 54) - Integer.hashCode(this.IAuthTabCallback)) << 107) * this.onExtraCallbackWithResult.hashCode() : (((((iHashCode * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ListPreset(fontScale=" + this.onWarmupCompleted + ", parentHeightPx=" + this.onNavigationEvent + ", topSkeletonCount=" + this.IAuthTabCallback + ", repeatCount=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public x2ExternalSyntheticLambda27(float f, float f2, int i, @NotNull x2ExternalSyntheticLambda25.onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onWarmupCompleted = f;
        this.onNavigationEvent = f2;
        this.IAuthTabCallback = i;
        this.onExtraCallbackWithResult = onextracallback;
    }

    private static final float onExtraCallback(x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = x2externalsyntheticlambda29 instanceof x2ExternalSyntheticLambda29.onExtraCallbackWithResult;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (x2externalsyntheticlambda29 instanceof x2ExternalSyntheticLambda29.onExtraCallbackWithResult) {
            return r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(x2externalsyntheticlambda29.onWarmupCompleted());
        }
        float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Math.round(((f / 10.0f) * 2.2f) + 4.0f)));
        int i3 = onExtraCallback + 83;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return fOnExtraCallback;
    }

    private static final int onNavigationEvent(x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            if (!(x2externalsyntheticlambda29 instanceof x2ExternalSyntheticLambda29.onExtraCallbackWithResult)) {
                x2ExternalSyntheticLambda25.onExtraCallback onextracallback = x2externalsyntheticlambda27.onExtraCallbackWithResult;
                if (onextracallback instanceof x2ExternalSyntheticLambda25.onExtraCallback.onWarmupCompleted) {
                    int i4 = i2 + 43;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return ((x2ExternalSyntheticLambda25.onExtraCallback.onWarmupCompleted) onextracallback).onExtraCallbackWithResult();
                }
            }
            int iCeil = (int) Math.ceil(x2externalsyntheticlambda27.onNavigationEvent / r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(x2externalsyntheticlambda29.IAuthTabCallback()));
            int i6 = onExtraCallback + 71;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return iCeil;
        }
        boolean z = x2externalsyntheticlambda29 instanceof x2ExternalSyntheticLambda29.onExtraCallbackWithResult;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3 A[LOOP:0: B:75:0x01f1->B:76:0x01f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(final x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        float fIAuthTabCallback;
        boolean z;
        Object obj;
        boolean z2;
        boolean zIAuthTabCallback;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        int iIntValue;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1187497872);
        Object obj2 = null;
        if ((i & 6) == 0) {
            int i6 = IAuthTabCallbackDefault + 63;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x2externalsyntheticlambda29);
                obj2.hashCode();
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x2externalsyntheticlambda29) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i7 = IAuthTabCallbackDefault + 49;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = onExtraCallback + 79;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1187497872, i2, -1, "im.toss.tds.compose.component.compound.skeleton.v1.ListPreset.ListSkeleton (TdsSkeletonPresets.kt:248)");
            }
            final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            int i10 = i2 & 14;
            boolean z3 = i10 == 4;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z3 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                if ((x2externalsyntheticlambda29 instanceof x2ExternalSyntheticLambda29.onExtraCallbackWithResult) || Intrinsics.areEqual(x2externalsyntheticlambda29, x2ExternalSyntheticLambda29.IAuthTabCallback.IAuthTabCallback)) {
                    fIAuthTabCallback = x2externalsyntheticlambda29.IAuthTabCallback();
                } else {
                    int i11 = IAuthTabCallbackDefault + 43;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(x2externalsyntheticlambda29.IAuthTabCallback() * this.onWarmupCompleted);
                }
                objOnMinimized2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            final float fIAuthTabCallback2 = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized2).IAuthTabCallback();
            if (i10 == 4) {
                int i13 = onExtraCallback + 123;
                IAuthTabCallbackDefault = i13 % 128;
                int i14 = i13 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback2);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z || zIAuthTabCallback2) {
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.ListPreset$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i15 = 2 % 2;
                        int i16 = onExtraCallback + 103;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                        Float fValueOf = Float.valueOf(x2ExternalSyntheticLambda27.onExtraCallbackWithResult(x2externalsyntheticlambda29, r8lambdanm9dm2eewl4vrptnjmesfjqky4, fIAuthTabCallback2));
                        int i18 = onExtraCallbackWithResult + 35;
                        onExtraCallback = i18 % 128;
                        if (i18 % 2 != 0) {
                            int i19 = 46 / 0;
                        }
                        return fValueOf;
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                obj = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) obj;
                float f = this.onNavigationEvent;
                x2ExternalSyntheticLambda25.onExtraCallback onextracallback = this.onExtraCallbackWithResult;
                if (i10 != 4) {
                    int i15 = onExtraCallback + 87;
                    IAuthTabCallbackDefault = i15 % 128;
                    int i16 = i15 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((!(z2 | zIAuthTabCallback | zOnNavigationEvent)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.ListPreset$$ExternalSyntheticLambda4
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i17 = 2 % 2;
                            int i18 = onExtraCallbackWithResult + 101;
                            onWarmupCompleted = i18 % 128;
                            int i19 = i18 % 2;
                            x2ExternalSyntheticLambda29 x2externalsyntheticlambda292 = x2externalsyntheticlambda29;
                            if (i19 == 0) {
                                return Integer.valueOf(((Integer) x2ExternalSyntheticLambda27.IAuthTabCallback(new Object[]{x2externalsyntheticlambda292, this, r8lambdanm9dm2eewl4vrptnjmesfjqky4}, -237937306, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 237937307, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue());
                            }
                            Integer.valueOf(((Integer) x2ExternalSyntheticLambda27.IAuthTabCallback(new Object[]{x2externalsyntheticlambda292, this, r8lambdanm9dm2eewl4vrptnjmesfjqky4}, -237937306, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 237937307, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    });
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 12, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                boolean z4 = x2externalsyntheticlambda29 instanceof x2ExternalSyntheticLambda29.IAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(897964890);
                int i17 = IAuthTabCallbackDefault + 113;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                i3 = 0;
                for (iIntValue = ((Integer) IAuthTabCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda62}, -1833553122, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1833553124, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue(); i3 < iIntValue; iIntValue = iIntValue) {
                    x2ExternalSyntheticLambda31.onExtraCallback(x2externalsyntheticlambda29.onNavigationEvent(), fIAuthTabCallback2, IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6), x2externalsyntheticlambda29.onExtraCallback(), this.IAuthTabCallback + i3, null, z4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 32);
                    i3++;
                    fIAuthTabCallback2 = fIAuthTabCallback2;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = (CameraPresenceProviderExternalSyntheticLambda6) obj;
                float f2 = this.onNavigationEvent;
                x2ExternalSyntheticLambda25.onExtraCallback onextracallback2 = this.onExtraCallbackWithResult;
                if (i10 != 4) {
                }
                zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(z2 | zIAuthTabCallback | zOnNavigationEvent)) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.ListPreset$$ExternalSyntheticLambda4
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i172 = 2 % 2;
                            int i182 = onExtraCallbackWithResult + 101;
                            onWarmupCompleted = i182 % 128;
                            int i19 = i182 % 2;
                            x2ExternalSyntheticLambda29 x2externalsyntheticlambda292 = x2externalsyntheticlambda29;
                            if (i19 == 0) {
                                return Integer.valueOf(((Integer) x2ExternalSyntheticLambda27.IAuthTabCallback(new Object[]{x2externalsyntheticlambda292, this, r8lambdanm9dm2eewl4vrptnjmesfjqky4}, -237937306, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 237937307, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue());
                            }
                            Integer.valueOf(((Integer) x2ExternalSyntheticLambda27.IAuthTabCallback(new Object[]{x2externalsyntheticlambda292, this, r8lambdanm9dm2eewl4vrptnjmesfjqky4}, -237937306, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 237937307, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    });
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda622 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = setContentInsetsAbsolute.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 12, (Object) null);
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    boolean z42 = x2externalsyntheticlambda29 instanceof x2ExternalSyntheticLambda29.IAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(897964890);
                    int i172 = IAuthTabCallbackDefault + 113;
                    onExtraCallback = i172 % 128;
                    int i182 = i172 % 2;
                    i3 = 0;
                    while (i3 < iIntValue) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.ListPreset$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj3, Object obj4) {
                    int i19 = 2 % 2;
                    int i20 = IAuthTabCallback + 103;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    Unit unitOnNavigationEvent = x2ExternalSyntheticLambda27.onNavigationEvent(this.f$0, x2externalsyntheticlambda29, i, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i22 = onExtraCallbackWithResult + 83;
                    IAuthTabCallback = i22 % 128;
                    int i23 = i22 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    public final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1646565161);
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallbackDefault + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i7 = IAuthTabCallbackDefault + 79;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i2 & 3) == 2), i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1646565161, i2, -1, "im.toss.tds.compose.component.compound.skeleton.v1.ListPreset.List (TdsSkeletonPresets.kt:300)");
            }
            onNavigationEvent(x2ExternalSyntheticLambda29.onExtraCallback.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i9 = IAuthTabCallbackDefault + 55;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.ListPreset$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 77;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitOnNavigationEvent = x2ExternalSyntheticLambda27.onNavigationEvent(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i14 = onExtraCallbackWithResult + 67;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    public final void onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1185671880);
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i5 = onExtraCallback + 23;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = onExtraCallback + 81;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    i3 = 4;
                }
                i2 = i3 | i;
            }
            i3 = 2;
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1185671880, i2, -1, "im.toss.tds.compose.component.compound.skeleton.v1.ListPreset.ListWithIcon (TdsSkeletonPresets.kt:305)");
                int i8 = onExtraCallback + 39;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
            }
            onNavigationEvent(x2ExternalSyntheticLambda29.IAuthTabCallback.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.ListPreset$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 107;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    x2ExternalSyntheticLambda27 x2externalsyntheticlambda27 = this.f$0;
                    if (i12 != 0) {
                        return x2ExternalSyntheticLambda27.onExtraCallback(x2externalsyntheticlambda27, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    x2ExternalSyntheticLambda27.onExtraCallback(x2externalsyntheticlambda27, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r6
      0x002d: PHI (r6v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r6
      0x0022: PHI (r6v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1944524453);
            if ((i & 65) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1944524453);
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i5 = IAuthTabCallbackDefault + 87;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1944524453, i2, -1, "im.toss.tds.compose.component.compound.skeleton.v1.ListPreset.Card (TdsSkeletonPresets.kt:310)");
            }
            onNavigationEvent(x2ExternalSyntheticLambda29.onExtraCallbackWithResult.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackDefault + 47;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.ListPreset$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 49;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    x2ExternalSyntheticLambda27 x2externalsyntheticlambda27 = this.f$0;
                    if (i10 != 0) {
                        int i11 = i;
                        int iIntValue = ((Integer) obj3).intValue();
                        return (Unit) x2ExternalSyntheticLambda27.IAuthTabCallback(new Object[]{x2externalsyntheticlambda27, Integer.valueOf(i11), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)}, -1228489722, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1228489722, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                    }
                    int i12 = i;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            number.floatValue();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = IAuthTabCallbackDefault + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            iIntValue = number.intValue();
            int i4 = 59 / 0;
        } else {
            iIntValue = number.intValue();
        }
        int i5 = IAuthTabCallbackDefault + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ Unit IAuthTabCallback(x2ExternalSyntheticLambda27 x2externalsyntheticlambda27, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(new Object[]{x2externalsyntheticlambda27, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -1228489722, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1228489722, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final int onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Integer> cameraPresenceProviderExternalSyntheticLambda6) {
        return ((Integer) IAuthTabCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, -1833553122, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1833553124, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue();
    }
}
