package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zabt implements Runnable {
    final /* synthetic */ ConnectionResult zaa;
    final /* synthetic */ zabu zab;

    zabt(zabu zabuVar, ConnectionResult connectionResult) {
        this.zab = zabuVar;
        this.zaa = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabu zabuVar = this.zab;
        zabq zabqVar = (zabq) GoogleApiManager.zar(zabuVar.zaa).get(zabu.zab(zabuVar));
        if (zabqVar == null) {
            return;
        }
        if (!this.zaa.isSuccess()) {
            zabqVar.zar(this.zaa, (Exception) null);
            return;
        }
        zabu.zac(this.zab, true);
        if (zabu.zaa(this.zab).requiresSignIn()) {
            zabu.zad(this.zab);
            return;
        }
        try {
            zabu zabuVar2 = this.zab;
            zabu.zaa(zabuVar2).getRemoteService((IAccountAccessor) null, zabu.zaa(zabuVar2).getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            zabu.zaa(this.zab).disconnect("Failed to get service from broker.");
            zabqVar.zar(new ConnectionResult(10), (Exception) null);
        }
    }
}
