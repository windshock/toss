package im.toss.features.kyc.activities;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda13 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ KycTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            KycTestActivity.writeTypedObject(this.f$0, view);
            throw null;
        }
        KycTestActivity.writeTypedObject(this.f$0, view);
        int i3 = IAuthTabCallback + 109;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
    }
}
