package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzami implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzamg zzb;

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    zzami(zzamg zzamgVar) {
        this.zzb = zzamgVar;
        this.zza = zzamgVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }
}
