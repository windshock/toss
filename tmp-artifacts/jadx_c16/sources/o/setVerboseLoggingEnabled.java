package o;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setVerboseLoggingEnabled implements WindowManager {
    private final WindowManager onNavigationEvent;

    @Override // android.view.ViewManager
    public void removeView(View view) {
        this.onNavigationEvent.removeView(view);
    }

    @Override // android.view.WindowManager
    public Display getDefaultDisplay() {
        return this.onNavigationEvent.getDefaultDisplay();
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        this.onNavigationEvent.updateViewLayout(view, IAuthTabCallback(layoutParams));
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        this.onNavigationEvent.addView(view, IAuthTabCallback(layoutParams));
    }

    public setVerboseLoggingEnabled(WindowManager windowManager) {
        this.onNavigationEvent = windowManager;
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        this.onNavigationEvent.removeViewImmediate(view);
    }

    private /* synthetic */ ViewGroup.LayoutParams IAuthTabCallback(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof WindowManager.LayoutParams) {
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            initAutofill.onExtraCallbackWithResult("\\\u001bZ\u001fb\u001fR\u000fC\u001f");
            initAutofill.onExtraCallbackWithResult("\u001c]\u001bVZ\u000bZw6p=n)t9d(tZ\u000bZ\tK\bH");
            initAutofill.onExtraCallbackWithResult("\\\u001bZ\u001fb\u001fR\u000fC\u001f");
            new StringBuilder().insert(0, initAutofill.onExtraCallbackWithResult("W\u0016P\u001d\u0011@\u0011\u0018T\u001c^\bTZ\u000bZ")).append(layoutParams2.flags);
            layoutParams2.flags |= 8192;
            initAutofill.onExtraCallbackWithResult("\\\u001bZ\u001fb\u001fR\u000fC\u001f");
            new StringBuilder().insert(0, initAutofill.onExtraCallbackWithResult("W\u0016P\u001d\u0011@\u0011\u001bW\u000eT\b\u0011Z\u000bZ")).append(layoutParams2.flags);
        }
        return layoutParams;
    }
}
