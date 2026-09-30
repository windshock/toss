package im.toss.features.applock.impl.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SettingSecurityLevelBottomSheetActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ SettingSecurityLevelBottomSheetActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            SettingSecurityLevelBottomSheetActivity.onNavigationEvent(this.f$0, view);
            int i3 = 93 / 0;
        } else {
            SettingSecurityLevelBottomSheetActivity.onNavigationEvent(this.f$0, view);
        }
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
