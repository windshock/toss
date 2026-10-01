package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzahp extends zzahr {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzahm zzc;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahs
    public final byte zza() {
        int i2 = this.zza;
        if (i2 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i2 + 1;
        return this.zzc.zzb(i2);
    }

    zzahp(zzahm zzahmVar) {
        this.zzc = zzahmVar;
        this.zzb = zzahmVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }
}
