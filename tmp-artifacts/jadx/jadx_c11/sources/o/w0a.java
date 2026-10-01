package o;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w0a {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final w0a onNavigationEvent = new w0a();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 71;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private w0a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((i2 & 2) != 0) {
                int i5 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    obj.hashCode();
                    throw null;
                }
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((i2 & 2) != 0) {
            }
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent = (i2 & 8) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 16) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-437141284, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.DescriptionPreset.Text (DescriptionPreset.kt:24)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-437141284, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.DescriptionPreset.Text (DescriptionPreset.kt:24)");
        }
        int i9 = i << 3;
        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport02, null, jOnTransact, jOnNavigationEvent, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, (i & 126) | (i9 & 7168) | (i9 & 57344), (i << 6) & 3670016, 196580);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        long jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            quirksExternalSyntheticBackport02 = (i2 & 3) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 2) != 0) {
            }
        }
        if ((i2 & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i2 & 8) != 0) {
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i6 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            jOnNavigationEvent = j2;
        }
        if ((i2 & 16) != 0) {
            int i8 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 54 / 0;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(845917402, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.DescriptionPreset.Text (DescriptionPreset.kt:42)");
        }
        IAuthTabCallback(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, jOnTransact, jOnNavigationEvent, graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, i & 524272, 0);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }
}
