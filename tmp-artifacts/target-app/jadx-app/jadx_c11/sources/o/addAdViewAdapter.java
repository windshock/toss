package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addAdViewAdapter implements getTitleMarginEnd {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback;
    private final toMetersPerSecond onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final DeviceQuirksExternalSyntheticLambda0 onNavigationEvent;
    private final skipBytes onWarmupCompleted;

    public /* synthetic */ addAdViewAdapter(toMetersPerSecond tometerspersecond, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, DefaultConstructorMarker defaultConstructorMarker) {
        this(tometerspersecond, j, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02);
    }

    public /* synthetic */ addAdViewAdapter(toMetersPerSecond tometerspersecond, skipBytes skipbytes, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, DefaultConstructorMarker defaultConstructorMarker) {
        this(tometerspersecond, skipbytes, j, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02);
    }

    private addAdViewAdapter(toMetersPerSecond tometerspersecond, skipBytes skipbytes, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02) {
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
        this.onExtraCallback = tometerspersecond;
        this.onWarmupCompleted = skipbytes;
        this.onExtraCallbackWithResult = j;
        this.onNavigationEvent = deviceQuirksExternalSyntheticLambda0;
        this.IAuthTabCallback = deviceQuirksExternalSyntheticLambda02;
    }

    public static final /* synthetic */ long onExtraCallbackWithResult(addAdViewAdapter addadviewadapter) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = addadviewadapter.onExtraCallbackWithResult;
        int i5 = i3 + 63;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final toMetersPerSecond onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        toMetersPerSecond tometerspersecond = this.onExtraCallback;
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return tometerspersecond;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private addAdViewAdapter(toMetersPerSecond tometerspersecond, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02) {
        this(tometerspersecond, null, j, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, null);
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
    }

    static final class IAuthTabCallback implements skipBytes {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        IAuthTabCallback() {
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            addAdViewAdapter addadviewadapter = addAdViewAdapter.this;
            if (i3 == 0) {
                return addAdViewAdapter.onExtraCallbackWithResult(addadviewadapter);
            }
            addAdViewAdapter.onExtraCallbackWithResult(addadviewadapter);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public modifyFpsForPreviewOnlyRepeating onWarmupCompleted(@NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, "");
        skipBytes iAuthTabCallback = this.onWarmupCompleted;
        if (iAuthTabCallback == null) {
            iAuthTabCallback = new IAuthTabCallback();
            int i3 = onTransact + 87;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 5;
            }
        }
        return new isAdShowing(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, iAuthTabCallback, this.onExtraCallback, this.onNavigationEvent, this.IAuthTabCallback);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onTransact + 59;
            asBinder = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof addAdViewAdapter)) {
            return false;
        }
        addAdViewAdapter addadviewadapter = (addAdViewAdapter) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, addadviewadapter.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, addadviewadapter.onWarmupCompleted)) {
            int i3 = asBinder + 111;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, addadviewadapter.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, addadviewadapter.onNavigationEvent)) {
            int i5 = asBinder + 15;
            onTransact = i5 % 128;
            return i5 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, addadviewadapter.IAuthTabCallback)) {
            return true;
        }
        int i6 = onTransact + 85;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        toMetersPerSecond tometerspersecond = this.onExtraCallback;
        if (tometerspersecond != null) {
            int i2 = asBinder + 23;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = tometerspersecond.hashCode();
        } else {
            iHashCode = 0;
        }
        skipBytes skipbytes = this.onWarmupCompleted;
        int iHashCode2 = (((((((iHashCode * 31) + (skipbytes != null ? skipbytes.hashCode() : 0)) * 31) + setByteOrder.onTransact(this.onExtraCallbackWithResult)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = asBinder + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }
}
