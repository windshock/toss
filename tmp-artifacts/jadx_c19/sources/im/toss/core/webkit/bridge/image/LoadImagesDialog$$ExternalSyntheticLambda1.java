package im.toss.core.webkit.bridge.image;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class LoadImagesDialog$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoadImagesDialog f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        LoadImagesDialog.onNavigationEvent(this.f$0, view);
        int i5 = onWarmupCompleted + 75;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }
}
