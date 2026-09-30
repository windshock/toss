package viva.republica.toss.guest.certify.guardian;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class GuardianSimpleInfoFragment$$ExternalSyntheticLambda8 implements RenderInTransitionOverlayNodeElement {
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ GuardianSimpleInfoFragment f$2;

    public /* synthetic */ GuardianSimpleInfoFragment$$ExternalSyntheticLambda8(int i, int i2, GuardianSimpleInfoFragment guardianSimpleInfoFragment) {
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = guardianSimpleInfoFragment;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return GuardianSimpleInfoFragment.onWarmupCompleted(this.f$0, this.f$1, this.f$2, view, windowInsetsCompat);
    }
}
