package viva.republica.toss.guest.certify.guardian;

import android.view.View;
import android.widget.EditText;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class GuardianSimpleInfoFragment$$ExternalSyntheticLambda19 implements View.OnFocusChangeListener {
    public final /* synthetic */ GuardianSimpleInfoFragment f$0;
    public final /* synthetic */ EditText f$1;

    public /* synthetic */ GuardianSimpleInfoFragment$$ExternalSyntheticLambda19(GuardianSimpleInfoFragment guardianSimpleInfoFragment, EditText editText) {
        this.f$0 = guardianSimpleInfoFragment;
        this.f$1 = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        GuardianSimpleInfoFragment.onNavigationEvent(this.f$0, this.f$1, view, z);
    }
}
