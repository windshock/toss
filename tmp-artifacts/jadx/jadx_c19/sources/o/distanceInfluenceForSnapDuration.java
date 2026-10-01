package o;

import android.view.View;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class distanceInfluenceForSnapDuration implements getCurrentItem {
    private static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    static {
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.getCurrentItem
    public void onExtraCallbackWithResult(@NotNull View view) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int i5 = onExtraCallback + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.executeKeyEvent
    public void onNavigationEvent(@NotNull NativeAdsEventLogType nativeAdsEventLogType) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        if (i4 == 0) {
            int i5 = 57 / 0;
        }
        int i6 = onWarmupCompleted + 47;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
    }

    @Override // o.executeKeyEvent
    public void onNavigationEvent(@NotNull getPageMargin getpagemargin) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(getpagemargin, "");
        int i5 = onWarmupCompleted + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
