package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzch extends zzcs {
    private final Object zza;
    private boolean zzb;

    zzch(Object obj) {
        this.zza = obj;
    }

    public final boolean hasNext() {
        return !this.zzb;
    }

    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
