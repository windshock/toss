package o;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.hasProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaSKTp07BDug1dt6rTGFYR7p2Uyw implements getMergedResolutions {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Context onWarmupCompleted;

    public r8lambdaSKTp07BDug1dt6rTGFYR7p2Uyw(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = context;
    }

    public getPreferredChildSize filter(@NotNull hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            CacheCacheResponseBody1.onNavigationEvent.onWarmupCompleted(hasprovider.onTransact()).isEmpty();
            throw null;
        }
        Intrinsics.checkNotNullParameter(hasprovider, "");
        List<IntRange> listOnWarmupCompleted = CacheCacheResponseBody1.onNavigationEvent.onWarmupCompleted(hasprovider.onTransact());
        if (listOnWarmupCompleted.isEmpty()) {
            return new getPreferredChildSize(hasprovider, isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent.Companion.onExtraCallback());
        }
        getSurfaceSize getsurfacesizeOnExtraCallbackWithResult = r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc.onWarmupCompleted.onExtraCallbackWithResult(this.onWarmupCompleted);
        if (getsurfacesizeOnExtraCallbackWithResult == null) {
            getPreferredChildSize getpreferredchildsize = new getPreferredChildSize(hasprovider, isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent.Companion.onExtraCallback());
            int i3 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return getpreferredchildsize;
        }
        int i5 = 1;
        hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
        iAuthTabCallback.onExtraCallbackWithResult(hasprovider);
        for (IntRange intRange : listOnWarmupCompleted) {
            int i6 = i5;
            iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, getsurfacesizeOnExtraCallbackWithResult, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65503, (DefaultConstructorMarker) null), intRange.getFirst(), intRange.getLast() + i6);
            i5 = i6;
        }
        return new getPreferredChildSize(iAuthTabCallback.onExtraCallbackWithResult(), isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent.Companion.onExtraCallback());
    }
}
