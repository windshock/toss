package im.toss.core.webkit;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda20 implements DialogInterface.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ FragmentActivity f$0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            setCircleColor.onExtraCallbackWithResult(this.f$0, dialogInterface, i);
            int i4 = 22 / 0;
        } else {
            setCircleColor.onExtraCallbackWithResult(this.f$0, dialogInterface, i);
        }
        int i5 = onExtraCallback + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
