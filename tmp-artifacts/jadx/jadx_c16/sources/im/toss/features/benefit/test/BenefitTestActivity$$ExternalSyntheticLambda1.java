package im.toss.features.benefit.test;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda1 implements OnAdInspectorClosedListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BenefitTestActivity f$0;

    public final void onAdInspectorClosed(AdInspectorError adInspectorError) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BenefitTestActivity.IAuthTabCallback(this.f$0, adInspectorError);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
    }
}
