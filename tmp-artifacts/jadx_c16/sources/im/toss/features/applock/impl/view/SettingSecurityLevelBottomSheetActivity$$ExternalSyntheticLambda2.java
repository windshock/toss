package im.toss.features.applock.impl.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SettingSecurityLevelBottomSheetActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ SettingSecurityLevelBottomSheetActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SettingSecurityLevelBottomSheetActivity.onExtraCallbackWithResult(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
