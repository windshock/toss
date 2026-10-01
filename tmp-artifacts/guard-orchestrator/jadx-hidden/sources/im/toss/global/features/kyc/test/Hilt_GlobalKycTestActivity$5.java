package im.toss.global.features.kyc.test;

import android.content.Context;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.writeTypedList;

/* loaded from: classes.dex */
public class Hilt_GlobalKycTestActivity$5 implements writeTypedList {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(Hilt_GlobalKycTestActivity$5.class);
    final /* synthetic */ Hilt_GlobalKycTestActivity IAuthTabCallback;

    public Hilt_GlobalKycTestActivity$5(Hilt_GlobalKycTestActivity hilt_GlobalKycTestActivity) {
        this.IAuthTabCallback = hilt_GlobalKycTestActivity;
    }

    public void onContextAvailable(Context context) {
        int i = 2 % 2;
        if ((((onExtraCallback ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171)) >> 6) & 1) != 0) {
            this.IAuthTabCallback.aR_();
        } else {
            this.IAuthTabCallback.aR_();
            throw null;
        }
    }
}
