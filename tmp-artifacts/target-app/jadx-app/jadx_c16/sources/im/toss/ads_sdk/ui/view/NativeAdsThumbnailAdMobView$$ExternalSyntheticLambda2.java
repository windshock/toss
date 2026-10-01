package im.toss.ads_sdk.ui.view;

import android.view.View;
import com.google.android.gms.ads.VideoController;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailAdMobView$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsThumbnailAdMobView f$0;
    public final /* synthetic */ VideoController f$1;

    public /* synthetic */ NativeAdsThumbnailAdMobView$$ExternalSyntheticLambda2(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, VideoController videoController) {
        this.f$0 = nativeAdsThumbnailAdMobView;
        this.f$1 = videoController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, view};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        NativeAdsThumbnailAdMobView.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1403125017, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1403125016, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
