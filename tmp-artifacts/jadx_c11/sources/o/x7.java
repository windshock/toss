package o;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.x5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x7 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final x5.IAuthTabCallback onWarmupCompleted;

    public x7(@NotNull x5.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onWarmupCompleted = iAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 4) != 0) {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                int i5 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 2) != 0) {
            }
        }
        Object obj = null;
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 4) != 0 ? null : graphicDeviceInfo;
        if ((i2 & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                obj.hashCode();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2041236013, i, -1, "im.toss.tds.compose.component.compound.tablerow.v1.LabelPreset.Text (LabelPreset.kt:32)");
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, graphicDeviceInfo2, jOnTransact, jOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, i & 524272, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i11 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 56 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        GraphicDeviceInfo graphicDeviceInfo2;
        long jOnTransact;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            quirksExternalSyntheticBackport02 = (i2 & 3) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((i2 & 2) != 0) {
            }
        }
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if ((i2 & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                obj.hashCode();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1012345263, i, -1, "im.toss.tds.compose.component.compound.tablerow.v1.LabelPreset.Text (LabelPreset.kt:50)");
        }
        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, onExtraCallback(this, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, 0.0f, 15, null), null, jOnTransact, jOnNavigationEvent, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, i & 64526, (i << 12) & 3670016, 196580);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i8 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 63 / 0;
        }
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(x7 x7Var, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            f = x4a.IAuthTabCallback.onExtraCallbackWithResult();
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = x4a.onExtraCallbackWithResult(x4a.IAuthTabCallback, x7Var.onWarmupCompleted, false, 2, null);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i3 % 128;
            f3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i3 % 2 != 0 ? 1.0f : 0.0f);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = x4a.onExtraCallbackWithResult(x4a.IAuthTabCallback, x7Var.onWarmupCompleted, false, 2, null);
            int i4 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return x7Var.onWarmupCompleted(quirksExternalSyntheticBackport0, f5, f6, f7, f4);
    }

    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            return quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, f, f2, f3, f4));
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, f, f2, f3, f4));
        int i3 = 43 / 0;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof x7) || this.onWarmupCompleted != ((x7) obj).onWarmupCompleted) {
            return false;
        }
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        return !(i4 % 2 != 0);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }
}
