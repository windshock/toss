package im.toss.features.kyc.cdd;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SelectJobActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ SelectJobActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SelectJobActivity.onExtraCallbackWithResult(this.f$0, view);
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
