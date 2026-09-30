package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.x4a;
import o.x5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x4a {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    public static final x4a IAuthTabCallback = new x4a();
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
    private static final float asInterface = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[x5.IAuthTabCallback.values().length];
            try {
                iArr[x5.IAuthTabCallback.Left.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 103;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x5.IAuthTabCallback.Right.ordinal()] = 2;
                int i3 = onExtraCallback + 119;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    private static final Unit onNavigationEvent(x4a x4aVar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        x4aVar.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x4a x4aVar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            onNavigationEvent(x4aVar, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(x4aVar, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallbackStub + 13;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private x4a() {
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = onWarmupCompleted;
        int i5 = i3 + 77;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 101;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallbackWithResult;
        int i5 = i2 + 31;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[PHI: r1 r12
      0x0024: PHI (r1v15 int) = (r1v4 int), (r1v16 int) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x0024: PHI (r12v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r12v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r12v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1 r12
      0x0022: PHI (r1v5 int) = (r1v4 int), (r1v16 int) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x0022: PHI (r12v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r12v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r12v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-569077309);
            i2 = i & 1;
            z = i2 != 0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-569077309);
            i2 = i & 1;
            if (i2 != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackDefault + 125;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-569077309, i, -1, "im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Defaults.Divider (TdsTableRowV1Defaults.kt:16)");
                if (i6 == 0) {
                    throw null;
                }
            }
            AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i7 = IAuthTabCallbackDefault + 67;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Defaults$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 83;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnWarmupCompleted = x4a.onWarmupCompleted(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = onExtraCallbackWithResult + 69;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    public static /* synthetic */ float onExtraCallbackWithResult(x4a x4aVar, x5.IAuthTabCallback iAuthTabCallback, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 109;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return x4aVar.onWarmupCompleted(iAuthTabCallback, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float onWarmupCompleted(@NotNull x5.IAuthTabCallback iAuthTabCallback, boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (z) {
            int i2 = IAuthTabCallbackStub + 61;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return onExtraCallback;
        }
        int i4 = IAuthTabCallback.IAuthTabCallback[iAuthTabCallback.ordinal()];
        if (i4 == 1) {
            return onNavigationEvent;
        }
        int i5 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0 ? i4 != 2 : i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return asInterface;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float onExtraCallbackWithResult(@NotNull x5.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            i = IAuthTabCallback.IAuthTabCallback[iAuthTabCallback.ordinal()];
            if (i == 0) {
                return 0.25f;
            }
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            i = IAuthTabCallback.IAuthTabCallback[iAuthTabCallback.ordinal()];
            if (i == 1) {
                return 0.25f;
            }
        }
        int i4 = IAuthTabCallbackDefault + 47;
        int i5 = i4 % 128;
        IAuthTabCallbackStub = i5;
        if (i4 % 2 != 0 ? i != 2 : i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i5 + 75;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return 0.5f;
    }

    static {
        int i = asBinder + 89;
        onTransact = i % 128;
        int i2 = i % 2;
    }
}
