package o;

import android.view.View;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toUpperCase implements View.OnClickListener {
    final onNavigationEvent IAuthTabCallback;
    final int onExtraCallback;

    public interface onNavigationEvent {
        void onExtraCallback(int i, View view);
    }

    public toUpperCase(onNavigationEvent onnavigationevent, int i) {
        this.IAuthTabCallback = onnavigationevent;
        this.onExtraCallback = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.IAuthTabCallback.onExtraCallback(this.onExtraCallback, view);
    }
}
