package im.toss.features.feed.settings;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda10 implements DialogInterface.OnCancelListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ String f$0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NotificationAllSettingActivity.onNavigationEvent(this.f$0, dialogInterface);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }
}
