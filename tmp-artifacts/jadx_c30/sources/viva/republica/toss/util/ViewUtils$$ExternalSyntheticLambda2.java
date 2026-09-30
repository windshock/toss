package viva.republica.toss.util;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import o.enableIOSViewClipToPaddingBox;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ViewUtils$$ExternalSyntheticLambda2 implements View.OnKeyListener {
    public final /* synthetic */ EditText f$0;

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return enableIOSViewClipToPaddingBox.onNavigationEvent(this.f$0, view, i, keyEvent);
    }
}
