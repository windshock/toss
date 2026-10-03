package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ESSCertID extends isSignaturePolicyImplied {
    private final Context IAuthTabCallback;
    private final createNativeAdsManagerApi onNavigationEvent;

    public ESSCertID(@NotNull Context context, @NotNull createNativeAdsManagerApi createnativeadsmanagerapi) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createnativeadsmanagerapi, "");
        this.IAuthTabCallback = context;
        this.onNavigationEvent = createnativeadsmanagerapi;
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        FrameLayout frameLayout = new FrameLayout(this.IAuthTabCallback);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        long jOnExtraCallback = this.onNavigationEvent.onExtraCallback();
        DisplayMetrics displayMetrics = frameLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams2.height = varyMatches.onNavigationEvent(Long.valueOf(jOnExtraCallback), displayMetrics);
        layoutParams2.width = -1;
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }
}
