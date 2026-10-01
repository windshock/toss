package im.toss.tds.compose.foundation.anim.rally;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o.completePendingScreenFlashClear;
import o.hasMoreElements;
import o.seek;
import o.setByteOrder;
import o.setIso;
import o.setNativeAdView;
import o.setOrientationDegrees;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallyDrawBackgroundModifier extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements completePendingScreenFlashClear {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private setNativeAdView onNavigationEvent;

    public RallyDrawBackgroundModifier(@NotNull setNativeAdView setnativeadview) {
        Intrinsics.checkNotNullParameter(setnativeadview, "");
        this.onNavigationEvent = setnativeadview;
    }

    public final void onNavigationEvent(@NotNull setNativeAdView setnativeadview) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setnativeadview, "");
            this.onNavigationEvent = setnativeadview;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setnativeadview, "");
        this.onNavigationEvent = setnativeadview;
        int i3 = IAuthTabCallback + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[PHI: r1
      0x0051: PHI (r1v8 long) = (r1v7 long), (r1v16 long) binds: [B:8:0x004f, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull setIso setiso) {
        long jOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setiso, "");
            jOnWarmupCompleted = this.onNavigationEvent.ICustomTabsCallback().onWarmupCompleted();
            int i3 = 26 / 0;
            if (!setByteOrder.onExtraCallbackWithResult(jOnWarmupCompleted, setByteOrder.Companion.IAuthTabCallbackDefault())) {
                setOrientationDegrees.onWarmupCompleted(setiso, jOnWarmupCompleted, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
                int i4 = onExtraCallback + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(setiso, "");
            jOnWarmupCompleted = this.onNavigationEvent.ICustomTabsCallback().onWarmupCompleted();
            if (!setByteOrder.onExtraCallbackWithResult(jOnWarmupCompleted, setByteOrder.Companion.IAuthTabCallbackDefault())) {
            }
        }
        setiso.onWarmupCompleted();
    }
}
