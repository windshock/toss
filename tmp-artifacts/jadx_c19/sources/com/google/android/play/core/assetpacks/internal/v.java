package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class v extends p {
    final /* synthetic */ IBinder a;
    final /* synthetic */ y b;

    v(y yVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = yVar;
    }

    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() throws RemoteException {
        this.b.a.n = e.b(this.a);
        z.q(this.b.a);
        this.b.a.h = false;
        Iterator it = this.b.a.e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.b.a.e.clear();
    }
}
