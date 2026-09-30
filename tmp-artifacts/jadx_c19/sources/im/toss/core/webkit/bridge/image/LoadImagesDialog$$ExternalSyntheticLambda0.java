package im.toss.core.webkit.bridge.image;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class LoadImagesDialog$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoadImagesDialog f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            LoadImagesDialog.onExtraCallback(this.f$0, view);
            obj.hashCode();
            throw null;
        }
        LoadImagesDialog.onExtraCallback(this.f$0, view);
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
