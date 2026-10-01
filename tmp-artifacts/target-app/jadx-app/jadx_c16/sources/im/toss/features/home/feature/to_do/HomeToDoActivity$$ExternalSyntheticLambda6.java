package im.toss.features.home.feature.to_do;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeToDoActivity$$ExternalSyntheticLambda6 implements View.OnTouchListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ HomeToDoActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = HomeToDoActivity.IAuthTabCallback(this.f$0, view, motionEvent);
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }
}
