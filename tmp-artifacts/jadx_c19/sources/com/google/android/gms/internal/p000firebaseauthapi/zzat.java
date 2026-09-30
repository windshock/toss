package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzat<K, V> {
    zzaw zza;
    private Object[] zzb;
    private int zzc;
    private boolean zzd;

    public final zzat<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzaj.zza(key, value);
            Object[] objArr = this.zzb;
            int i2 = this.zzc;
            int i3 = i2 * 2;
            objArr[i3] = key;
            objArr[i3 + 1] = value;
            this.zzc = i2 + 1;
        }
        return this;
    }

    public final zzau<K, V> zza() {
        zzaw zzawVar = this.zza;
        if (zzawVar != null) {
            throw zzawVar.zza();
        }
        int i2 = this.zzc;
        Object[] objArr = this.zzb;
        this.zzd = true;
        zzax zzaxVarZza = zzax.zza(i2, objArr, this);
        zzaw zzawVar2 = this.zza;
        if (zzawVar2 == null) {
            return zzaxVarZza;
        }
        throw zzawVar2.zza();
    }

    public zzat() {
        this(4);
    }

    zzat(int i2) {
        this.zzb = new Object[i2 * 2];
        this.zzc = 0;
        this.zzd = false;
    }

    private final void zza(int i2) {
        int i3 = i2 << 1;
        Object[] objArr = this.zzb;
        if (i3 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzan.zza(objArr.length, i3));
            this.zzd = false;
        }
    }
}
