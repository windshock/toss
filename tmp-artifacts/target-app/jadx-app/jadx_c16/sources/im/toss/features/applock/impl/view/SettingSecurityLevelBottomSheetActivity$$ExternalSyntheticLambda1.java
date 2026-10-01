package im.toss.features.applock.impl.view;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SettingSecurityLevelBottomSheetActivity$$ExternalSyntheticLambda1 implements DialogInterface.OnCancelListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ SettingSecurityLevelBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SettingSecurityLevelBottomSheetActivity.onNavigationEvent(this.f$0, dialogInterface);
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
