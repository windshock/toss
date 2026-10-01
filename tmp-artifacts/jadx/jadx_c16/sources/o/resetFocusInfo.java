package o;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class resetFocusInfo extends ContextWrapper {
    private final boolean IAuthTabCallback;
    private final boolean onNavigationEvent;

    public resetFocusInfo(Context context, boolean z, boolean z2) {
        super(context);
        this.IAuthTabCallback = z;
        this.onNavigationEvent = z2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return releaseGlows.onWarmupCompleted(super.getSystemService(str), str, this.onNavigationEvent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return this.IAuthTabCallback ? new resetFocusInfo(applicationContext, true) : applicationContext;
    }

    public resetFocusInfo(Context context, boolean z) {
        this(context, z, false);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
