package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda29;
import o.x2ExternalSyntheticLambda32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda32 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final x2ExternalSyntheticLambda30 IAuthTabCallback;
    private final float onExtraCallbackWithResult;

    public static /* synthetic */ Unit IAuthTabCallback(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {x2externalsyntheticlambda32, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        if (i5 != 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            return (Unit) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, objArr, forceDomainCheck.IAuthTabCallback(), 363761196, -363761196, iIAuthTabCallback2);
        }
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
        throw null;
    }

    private static final Unit IAuthTabCallback(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        x2externalsyntheticlambda32.onExtraCallback(x2externalsyntheticlambda29, i, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 125;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        x2externalsyntheticlambda32.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 111;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit asInterface(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        x2externalsyntheticlambda32.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        x2ExternalSyntheticLambda32 x2externalsyntheticlambda32 = (x2ExternalSyntheticLambda32) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        x2externalsyntheticlambda32.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsInterface = asInterface(x2externalsyntheticlambda32, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 99;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {x2externalsyntheticlambda32, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, objArr, forceDomainCheck.IAuthTabCallback(), -1310883096, 1310883098, iIAuthTabCallback2);
        int i6 = onNavigationEvent + 7;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~((~i2) | i8);
        int i10 = i2 | i8;
        int i11 = i5 + i4 + i6 + ((-189913888) * i3) + ((-1809372279) * i);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i5) - 1671495680) + (10634006 * i4) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i6) + (952107008 * i3) + (1092222976 * i) + ((-70844416) * i12);
        int i14 = (i5 * 986545540) + 223666697 + (i4 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i6 * 986544659) + (i3 * 1843362976) + (i * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        if (i15 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i15 != 2) {
            return onExtraCallback(objArr);
        }
        x2ExternalSyntheticLambda32 x2externalsyntheticlambda32 = (x2ExternalSyntheticLambda32) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i16 = 2 % 2;
        int i17 = onNavigationEvent + 123;
        onWarmupCompleted = i17 % 128;
        int i18 = i17 % 2;
        x2externalsyntheticlambda32.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(x2externalsyntheticlambda32, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 57;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(x2externalsyntheticlambda32, x2externalsyntheticlambda29, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 83;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2ExternalSyntheticLambda32)) {
            return false;
        }
        x2ExternalSyntheticLambda32 x2externalsyntheticlambda32 = (x2ExternalSyntheticLambda32) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, x2externalsyntheticlambda32.IAuthTabCallback)) {
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Float.compare(this.onExtraCallbackWithResult, x2externalsyntheticlambda32.onExtraCallbackWithResult) != 0) {
            int i4 = onWarmupCompleted + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onWarmupCompleted + 119;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.IAuthTabCallback.hashCode() << 21) - Float.hashCode(this.onExtraCallbackWithResult) : (this.IAuthTabCallback.hashCode() * 31) + Float.hashCode(this.onExtraCallbackWithResult);
        int i3 = onWarmupCompleted + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TopPreset(state=" + this.IAuthTabCallback + ", fontScale=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public x2ExternalSyntheticLambda32(@NotNull x2ExternalSyntheticLambda30 x2externalsyntheticlambda30, float f) {
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda30, "");
        this.IAuthTabCallback = x2externalsyntheticlambda30;
        this.onExtraCallbackWithResult = f;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        x2ExternalSyntheticLambda32 x2externalsyntheticlambda32 = (x2ExternalSyntheticLambda32) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        x2ExternalSyntheticLambda30 x2externalsyntheticlambda30 = x2externalsyntheticlambda32.IAuthTabCallback;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return x2externalsyntheticlambda30;
    }

    private final void onExtraCallback(final x2ExternalSyntheticLambda29 x2externalsyntheticlambda29, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(830238929);
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x2externalsyntheticlambda29) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i6 = onNavigationEvent + 5;
                onWarmupCompleted = i6 % 128;
                i4 = i6 % 2 == 0 ? 75 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i2 & 384) == 0) {
            int i7 = onWarmupCompleted + 45;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 256 : 128;
        }
        boolean z2 = false;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            int i9 = onWarmupCompleted + 111;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            int i11 = onNavigationEvent + 25;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onNavigationEvent + 37;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(830238929, i3, -1, "im.toss.tds.compose.component.compound.skeleton.v1.TopPreset.TopSkeleton (TdsSkeletonPresets.kt:177)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            if ((i3 & 14) == 4) {
                int i15 = onNavigationEvent + 37;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                z2 = true;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(x2externalsyntheticlambda29.IAuthTabCallback() * this.onExtraCallbackWithResult));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized).IAuthTabCallback();
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zIAuthTabCallback || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = Float.valueOf(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Math.round(((fIAuthTabCallback / 10.0f) * 2.2f) + 4.0f))));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                int i17 = onNavigationEvent + 25;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
            }
            x2ExternalSyntheticLambda31.onExtraCallback(x2externalsyntheticlambda29.onNavigationEvent(), fIAuthTabCallback, ((Number) objOnMinimized2).floatValue(), x2externalsyntheticlambda29.onExtraCallback(), i, null, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 << 9) & 57344, 96);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i19 = onWarmupCompleted + 67;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.TopPreset$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i21 = 2 % 2;
                    int i22 = onExtraCallback + 77;
                    onNavigationEvent = i22 % 128;
                    if (i22 % 2 == 0) {
                        return x2ExternalSyntheticLambda32.onWarmupCompleted(this.f$0, x2externalsyntheticlambda29, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda32.onWarmupCompleted(this.f$0, x2externalsyntheticlambda29, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i23 = 16 / 0;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = x2ExternalSyntheticLambda32.this.new onExtraCallback(access13800Var);
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 9 / 0;
            }
            int i5 = onWarmupCompleted + 49;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 117;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {x2ExternalSyntheticLambda32.this};
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            ((x2ExternalSyntheticLambda30) x2ExternalSyntheticLambda32.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, objArr, forceDomainCheck.IAuthTabCallback(), 1200358814, -1200358813, iIAuthTabCallback2)).onNavigationEvent(2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1279282333);
        if ((i & 6) == 0) {
            int i6 = onWarmupCompleted + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i8 = onNavigationEvent + 71;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2 == 0 ? 2 : 4;
                i2 = i9 | i;
            }
        } else {
            i2 = i;
        }
        boolean z2 = false;
        if ((i2 & 3) != 2) {
            int i10 = onWarmupCompleted + 97;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onWarmupCompleted + 99;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1279282333, i2, -1, "im.toss.tds.compose.component.compound.skeleton.v1.TopPreset.Top (TdsSkeletonPresets.kt:198)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
            int i14 = ((i2 << 6) & 896) | 54;
            onExtraCallback(x2ExternalSyntheticLambda29.onWarmupCompleted.IAuthTabCallback, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14);
            onExtraCallback(x2ExternalSyntheticLambda29.onNavigationEvent.onWarmupCompleted, 1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            Unit unit = Unit.INSTANCE;
            if ((i2 & 14) == 4) {
                int i15 = onNavigationEvent + 73;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                z2 = true;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallback(null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                int i17 = onWarmupCompleted + 87;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.TopPreset$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i20 % 128;
                    int i21 = i20 % 2;
                    Unit unitOnExtraCallback = x2ExternalSyntheticLambda32.onExtraCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i22 = onNavigationEvent + 39;
                    onExtraCallbackWithResult = i22 % 128;
                    int i23 = i22 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = x2ExternalSyntheticLambda32.this.new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 81 / 0;
            } else {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 89;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {x2ExternalSyntheticLambda32.this};
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            ((x2ExternalSyntheticLambda30) x2ExternalSyntheticLambda32.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, objArr, forceDomainCheck.IAuthTabCallback(), 1200358814, -1200358813, iIAuthTabCallback2)).onNavigationEvent(1);
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    public final void onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1936305886);
        boolean z2 = true;
        if ((i & 6) == 0) {
            i2 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 2 : 4) | i;
        } else {
            int i6 = onNavigationEvent + 55;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i8 = onNavigationEvent + 13;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 7;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1936305886, i2, -1, "im.toss.tds.compose.component.compound.skeleton.v1.TopPreset.SubTitle (TdsSkeletonPresets.kt:211)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1936305886, i2, -1, "im.toss.tds.compose.component.compound.skeleton.v1.TopPreset.SubTitle (TdsSkeletonPresets.kt:211)");
            }
            onExtraCallback(x2ExternalSyntheticLambda29.onNavigationEvent.onWarmupCompleted, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 6) & 896) | 54);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            Unit unit = Unit.INSTANCE;
            if ((i2 & 14) == 4) {
                int i11 = onNavigationEvent + 53;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            } else {
                z2 = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onWarmupCompleted(null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onWarmupCompleted + 59;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i15 = onWarmupCompleted + 105;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.TopPreset$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = onNavigationEvent + 5;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda32.onWarmupCompleted(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i20 = onNavigationEvent + 63;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = x2ExternalSyntheticLambda32.this.new onNavigationEvent(access13800Var);
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 29 / 0;
            }
            int i5 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 57 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r8.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r8.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r9);
            r3 = new java.lang.Object[]{r8.this$0};
            r2 = o.forceDomainCheck.IAuthTabCallback();
            r7 = o.forceDomainCheck.IAuthTabCallback();
            ((o.x2ExternalSyntheticLambda30) o.x2ExternalSyntheticLambda32.onNavigationEvent(o.forceDomainCheck.IAuthTabCallback(), r2, r3, o.forceDomainCheck.IAuthTabCallback(), 1200358814, -1200358813, r7)).onNavigationEvent(2);
            r9 = kotlin.Unit.INSTANCE;
            r1 = o.x2ExternalSyntheticLambda32.onNavigationEvent.onNavigationEvent + 73;
            o.x2ExternalSyntheticLambda32.onNavigationEvent.onExtraCallbackWithResult = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[PHI: r11
      0x004a: PHI (r11v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r11v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r11v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r11
      0x0024: PHI (r11v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r11v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r11v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 17;
        onWarmupCompleted = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1836142187);
            if ((i & 63) == 0) {
                int i6 = onNavigationEvent + 39;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this);
                    obj.hashCode();
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                    i2 = 4;
                } else {
                    int i7 = onNavigationEvent + 105;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1836142187);
            if ((i & 6) == 0) {
            }
        }
        boolean z2 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            int i9 = onNavigationEvent + 41;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1836142187, i3, -1, "im.toss.tds.compose.component.compound.skeleton.v1.TopPreset.AmountTop (TdsSkeletonPresets.kt:221)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            int i11 = ((i3 << 6) & 896) | 54;
            onExtraCallback(x2ExternalSyntheticLambda29.onNavigationEvent.onWarmupCompleted, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i11);
            onExtraCallback(x2ExternalSyntheticLambda29.onWarmupCompleted.IAuthTabCallback, 1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i11);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            Unit unit = Unit.INSTANCE;
            if ((i3 & 14) == 4) {
                int i12 = onWarmupCompleted + 101;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                z2 = true;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z2) {
                int i14 = onWarmupCompleted + 11;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onNavigationEvent(null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = onWarmupCompleted + 47;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.TopPreset$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallback + 71;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    x2ExternalSyntheticLambda32 x2externalsyntheticlambda32 = this.f$0;
                    if (i19 == 0) {
                        return x2ExternalSyntheticLambda32.IAuthTabCallback(x2externalsyntheticlambda32, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    x2ExternalSyntheticLambda32.IAuthTabCallback(x2externalsyntheticlambda32, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = x2ExternalSyntheticLambda32.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = IAuthTabCallback + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 69 / 0;
            }
            int i5 = onNavigationEvent + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                Object[] objArr = {x2ExternalSyntheticLambda32.this};
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
                objOnNavigationEvent = x2ExternalSyntheticLambda32.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, objArr, forceDomainCheck.IAuthTabCallback(), 1200358814, -1200358813, iIAuthTabCallback2);
            } else {
                Object[] objArr2 = {x2ExternalSyntheticLambda32.this};
                int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
                int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
                objOnNavigationEvent = x2ExternalSyntheticLambda32.onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback3, objArr2, forceDomainCheck.IAuthTabCallback(), 1200358814, -1200358813, iIAuthTabCallback4);
            }
            ((x2ExternalSyntheticLambda30) objOnNavigationEvent).onNavigationEvent(0);
            return Unit.INSTANCE;
        }
    }

    public final void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(543681378);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i5 = onWarmupCompleted;
                int i6 = i5 + 49;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 39;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(543681378, i2, -1, "im.toss.tds.compose.component.compound.skeleton.v1.TopPreset.None (TdsSkeletonPresets.kt:233)");
            }
            Unit unit = Unit.INSTANCE;
            if ((i2 & 14) == 4) {
                int i10 = onNavigationEvent + 111;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallbackWithResult(null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.skeleton.v1.TopPreset$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 79;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    x2ExternalSyntheticLambda32 x2externalsyntheticlambda32 = this.f$0;
                    if (i14 != 0) {
                        return x2ExternalSyntheticLambda32.onExtraCallbackWithResult(x2externalsyntheticlambda32, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda32.onExtraCallbackWithResult(x2externalsyntheticlambda32, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i15 = 74 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    private static final Unit onNavigationEvent(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {x2externalsyntheticlambda32, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (Unit) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, objArr, forceDomainCheck.IAuthTabCallback(), 363761196, -363761196, iIAuthTabCallback2);
    }

    private static final Unit onTransact(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {x2externalsyntheticlambda32, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (Unit) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, objArr, forceDomainCheck.IAuthTabCallback(), -1310883096, 1310883098, iIAuthTabCallback2);
    }

    public static final /* synthetic */ x2ExternalSyntheticLambda30 onExtraCallback(x2ExternalSyntheticLambda32 x2externalsyntheticlambda32) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (x2ExternalSyntheticLambda30) onNavigationEvent(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, new Object[]{x2externalsyntheticlambda32}, iIAuthTabCallback3, 1200358814, -1200358813, iIAuthTabCallback2);
    }
}
