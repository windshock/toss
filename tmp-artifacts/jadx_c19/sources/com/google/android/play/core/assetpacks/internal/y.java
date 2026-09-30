package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class y implements ServiceConnection {
    final /* synthetic */ z a;

    /* synthetic */ y(z zVar, x xVar) {
        this.a = zVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c().post(new v(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c().post(new w(this));
    }
}
