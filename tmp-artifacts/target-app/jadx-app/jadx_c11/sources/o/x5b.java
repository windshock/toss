package o;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.x5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x5b {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final x5.IAuthTabCallback onNavigationEvent;

    public x5b(@NotNull x5.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onNavigationEvent = iAuthTabCallback;
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        GraphicDeviceInfo graphicDeviceInfo2;
        long jOnTransact;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 2) != 0) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 4) != 0) {
            int i6 = onWarmupCompleted + 123;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if ((i2 & 8) != 0) {
            int i8 = onWarmupCompleted + 119;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-607414621, i, -1, "im.toss.tds.compose.component.compound.tablerow.v1.ContentPreset.Text (ContentPreset.kt:31)");
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, graphicDeviceInfo2, jOnTransact, jOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, i & 524272, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        Object obj = null;
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 4) != 0 ? null : graphicDeviceInfo;
        if ((i2 & 8) != 0) {
            int i6 = onExtraCallback + 39;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                setByteOrder.Companion.onTransact();
                obj.hashCode();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
            int i7 = onWarmupCompleted + 93;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 5;
            }
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallback + 1;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1437047515, i, -1, "im.toss.tds.compose.component.compound.tablerow.v1.ContentPreset.Text (ContentPreset.kt:49)");
        }
        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, IAuthTabCallback(this, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, 0.0f, 15, null), null, jOnTransact, jOnNavigationEvent, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, i & 64526, (i << 12) & 3670016, 196580);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 IAuthTabCallback(x5b x5bVar, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            f = x4a.IAuthTabCallback.IAuthTabCallback();
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = x4a.onExtraCallbackWithResult(x4a.IAuthTabCallback, x5bVar.onNavigationEvent, false, 2, null);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            int i3 = onExtraCallback + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            f3 = x4a.IAuthTabCallback.onExtraCallbackWithResult();
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            int i5 = onExtraCallback + 3;
            onWarmupCompleted = i5 % 128;
            f4 = i5 % 2 != 0 ? x4a.onExtraCallbackWithResult(x4a.IAuthTabCallback, x5bVar.onNavigationEvent, true, 2, null) : x4a.onExtraCallbackWithResult(x4a.IAuthTabCallback, x5bVar.onNavigationEvent, false, 2, null);
        }
        return x5bVar.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, f5, f6, f7, f4);
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, f, f2, f3, f4));
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof x5b)) {
            int i3 = onWarmupCompleted + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.onNavigationEvent != ((x5b) obj).onNavigationEvent) {
            return false;
        }
        int i5 = onWarmupCompleted + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.hashCode();
            throw null;
        }
        int iHashCode = this.onNavigationEvent.hashCode();
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }
}
