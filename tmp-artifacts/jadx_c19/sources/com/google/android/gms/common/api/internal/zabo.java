package com.google.android.gms.common.api.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zabo implements Runnable {
    final /* synthetic */ zabp zaa;

    zabo(zabp zabpVar) {
        this.zaa = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabq zabqVar = this.zaa.zaa;
        zabq.zae(zabqVar).disconnect(zabq.zae(zabqVar).getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
