package im.toss.core.webkit;

import android.content.DialogInterface;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda21 implements DialogInterface.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        setCircleColor.onExtraCallbackWithResult(dialogInterface, i);
        int i5 = onExtraCallback + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }
}
