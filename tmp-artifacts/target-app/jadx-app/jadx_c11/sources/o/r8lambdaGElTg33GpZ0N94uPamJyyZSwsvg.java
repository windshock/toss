package o;

import im.toss.securities.libs.performance.tracker.data.model.v1.MetricBody;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaGElTg33GpZ0N94uPamJyyZSwsvg {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final MetricBody onNavigationEvent(@NotNull r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e, "");
        String lowerCase = r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e.onExtraCallback().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        MetricBody metricBody = new MetricBody(lowerCase, (Long) null, (Long) null, String.valueOf(setLogBuffers.onNavigationEvent(r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e.IAuthTabCallback(), setRevision.MILLISECONDS)), 6, (DefaultConstructorMarker) null);
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return metricBody;
        }
        throw null;
    }

    public static final MetricBody onExtraCallbackWithResult(@NotNull r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        MetricBody metricBody = new MetricBody(onextracallback.onExtraCallback(), onextracallback.IAuthTabCallback(), onextracallback.onNavigationEvent(), onextracallback.onExtraCallbackWithResult());
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return metricBody;
    }
}
