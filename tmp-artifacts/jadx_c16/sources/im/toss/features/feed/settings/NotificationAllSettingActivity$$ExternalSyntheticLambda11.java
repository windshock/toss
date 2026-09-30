package im.toss.features.feed.settings;

import android.view.View;
import o.getTypedExportedConstants;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda11 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getTypedExportedConstants f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ NotificationAllSettingActivity$$ExternalSyntheticLambda11(getTypedExportedConstants gettypedexportedconstants, String str, String str2) {
        this.f$0 = gettypedexportedconstants;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NotificationAllSettingActivity.onExtraCallback(789266570, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.f$0, this.f$1, this.f$2, view}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -789266555, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
