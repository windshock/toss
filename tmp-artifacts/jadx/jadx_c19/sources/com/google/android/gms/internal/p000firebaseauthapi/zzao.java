package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class zzao<E> extends zzan<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzao<E> zza(E e) {
        zzz.zza(e);
        int i2 = this.zzb + 1;
        Object[] objArr = this.zza;
        if (objArr.length < i2) {
            this.zza = Arrays.copyOf(objArr, zzan.zza(objArr.length, i2));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        objArr2[i3] = e;
        return this;
    }

    zzao(int i2) {
        zzaj.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }
}
