package im.toss.base;

import android.content.DialogInterface;
import o.onAdViewAdDisplayFailed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda34 implements DialogInterface.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BaseActivity f$0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1741964937, new Object[]{this.f$0, dialogInterface, Integer.valueOf(i)}, -1741964912, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i5 = onExtraCallback + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }
}
