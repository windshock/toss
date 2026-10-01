package im.toss.features.mobileid.impl.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdDevCiNotValidActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdDevCiNotValidActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MobileIdDevCiNotValidActivity.IAuthTabCallback(this.f$0, view);
        int i4 = onNavigationEvent + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
