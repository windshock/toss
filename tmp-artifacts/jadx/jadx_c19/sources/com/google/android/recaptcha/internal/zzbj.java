package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlin.coroutines.CoroutineContext;
import o.maybeUpdateAnimatable;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbj extends TimerTask {
    final /* synthetic */ zzbm zza;

    public zzbj(zzbm zzbmVar) {
        this.zza = zzbmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzbm zzbmVar = this.zza;
        maybeUpdateAnimatable.onNavigationEvent(zzbmVar.zzd, (CoroutineContext) null, (setRandomHost) null, new zzbk(zzbmVar, null), 3, (Object) null);
    }
}
