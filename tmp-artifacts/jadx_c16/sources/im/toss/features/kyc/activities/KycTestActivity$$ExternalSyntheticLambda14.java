package im.toss.features.kyc.activities;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda14 implements View.OnClickListener {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ KycTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            KycTestActivity.access000(this.f$0, view);
            obj.hashCode();
            throw null;
        }
        KycTestActivity.access000(this.f$0, view);
        int i3 = onExtraCallback + 117;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
