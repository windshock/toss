package im.toss.features.applock.impl.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SettingSecurityLevelBottomSheetActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ SettingSecurityLevelBottomSheetActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SettingSecurityLevelBottomSheetActivity.onExtraCallback(this.f$0, view);
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }
}
