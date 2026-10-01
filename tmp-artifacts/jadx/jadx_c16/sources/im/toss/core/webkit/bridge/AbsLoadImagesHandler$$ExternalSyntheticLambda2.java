package im.toss.core.webkit.bridge;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;
import o.ALCTimerLabel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsLoadImagesHandler$$ExternalSyntheticLambda2 implements DialogInterface.OnCancelListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function0 f$0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ALCTimerLabel.onWarmupCompleted(this.f$0, dialogInterface);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
