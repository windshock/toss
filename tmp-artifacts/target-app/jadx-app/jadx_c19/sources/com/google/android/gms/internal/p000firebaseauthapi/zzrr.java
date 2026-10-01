package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzrr {

    @Nullable
    private ArrayList<zzru> zza = new ArrayList<>();
    private zzrl zzb = zzrl.zza;

    @Nullable
    private Integer zzc = null;

    public final zzrr zza(zzbw zzbwVar, int i2, String str, String str2) {
        ArrayList<zzru> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzru(zzbwVar, i2, str, str2));
        return this;
    }

    public final zzrr zza(zzrl zzrlVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzrlVar;
        return this;
    }

    public final zzrr zza(int i2) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i2);
        return this;
    }

    public final zzrs zza() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList<zzru> arrayList = this.zza;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                zzru zzruVar = arrayList.get(i2);
                i2++;
                if (zzruVar.zza() == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzrs zzrsVar = new zzrs(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
        this.zza = null;
        return zzrsVar;
    }
}
