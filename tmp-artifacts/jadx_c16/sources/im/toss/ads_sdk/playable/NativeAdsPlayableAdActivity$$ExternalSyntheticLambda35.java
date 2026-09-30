package im.toss.ads_sdk.playable;

import android.view.MotionEvent;
import android.view.View;
import o.nSetPosition;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda35 implements View.OnTouchListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) NativeAdsPlayableAdActivity.onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1779912830, 1779912832, new Object[]{view, motionEvent})).booleanValue();
        int i4 = onNavigationEvent + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }
}
