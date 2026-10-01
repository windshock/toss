package im.toss.devtool.runtime.data.util;

import android.content.Context;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.writeTypedList;

/* loaded from: classes.dex */
public class Hilt_DevToolActionActivity$3 implements writeTypedList {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(Hilt_DevToolActionActivity$3.class);
    final /* synthetic */ Hilt_DevToolActionActivity onWarmupCompleted;

    public Hilt_DevToolActionActivity$3(Hilt_DevToolActionActivity hilt_DevToolActionActivity) {
        this.onWarmupCompleted = hilt_DevToolActionActivity;
    }

    public void onContextAvailable(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3338);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = (i2 ^ iOnWarmupCompleted) | i3;
        Object obj = null;
        if ((((i4 & (~i3)) >> 26) & 1) != 0) {
            this.onWarmupCompleted.aR_();
            throw null;
        }
        this.onWarmupCompleted.aR_();
        if ((((onExtraCallbackWithResult ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432)) >> 6) & 1) == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
