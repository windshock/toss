package viva.republica.toss.verify.unblock.point;

import android.view.View;
import kotlin.jvm.functions.Function1;
import viva.republica.toss.verify.unblock.UnblockSessionActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class UnblockSessionIntroFragment$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ UnblockSessionIntroFragment f$0;
    public final /* synthetic */ UnblockSessionActivity f$1;

    public /* synthetic */ UnblockSessionIntroFragment$$ExternalSyntheticLambda2(UnblockSessionIntroFragment unblockSessionIntroFragment, UnblockSessionActivity unblockSessionActivity) {
        this.f$0 = unblockSessionIntroFragment;
        this.f$1 = unblockSessionActivity;
    }

    public final Object invoke(Object obj) {
        return UnblockSessionIntroFragment.onWarmupCompleted(this.f$0, this.f$1, (View) obj);
    }
}
