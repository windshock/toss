package com.tnkfactory.ad.e;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class e implements ServiceConnection {
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();
    public boolean a = false;

    public final IBinder a() throws InterruptedException {
        if (this.a) {
            throw new IllegalStateException();
        }
        this.a = true;
        Object objTake = this.b.take();
        Intrinsics.checkNotNull(objTake);
        return (IBinder) objTake;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
        Intrinsics.checkNotNullParameter(componentName, "");
        Intrinsics.checkNotNullParameter(iBinder, "");
        try {
            this.b.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "");
    }
}
