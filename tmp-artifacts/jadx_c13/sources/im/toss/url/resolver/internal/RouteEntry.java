package im.toss.url.resolver.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.addFeatureFlag;
import o.logNull;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RouteEntry<H> {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private final logNull onExtraCallback;
    private final H onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final List<addFeatureFlag> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEntry(@NotNull logNull lognull, @NotNull List<? extends addFeatureFlag> list, long j, H h) {
        Intrinsics.checkNotNullParameter(lognull, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = lognull;
        this.onWarmupCompleted = list;
        this.onNavigationEvent = j;
        this.onExtraCallbackWithResult = h;
    }

    public final logNull onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        logNull lognull = this.onExtraCallback;
        int i4 = i2 + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return lognull;
    }

    public final List<addFeatureFlag> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        int i3 = 86 / 0;
        return this.onNavigationEvent;
    }

    public final H onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 21;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        H h = this.onExtraCallbackWithResult;
        int i5 = i2 + 119;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return h;
    }
}
