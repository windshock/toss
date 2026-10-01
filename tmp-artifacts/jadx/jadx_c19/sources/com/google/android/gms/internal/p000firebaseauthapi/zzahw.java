package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class zzahw extends zzahx {
    protected final byte[] zzb;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    public byte zza(int i2) {
        return this.zzb[i2];
    }

    protected int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    byte zzb(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    protected final int zzb(int i2, int i3, int i4) {
        return zzajc.zza(i2, this.zzb, zzh(), i4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    public final zzahm zza(int i2, int i3) {
        int iZza = zzahm.zza(0, i3, zzb());
        if (iZza == 0) {
            return zzahm.zza;
        }
        return new zzahq(this.zzb, zzh(), iZza);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    public final zzaib zzc() {
        return zzaib.zza(this.zzb, zzh(), zzb(), true);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    protected final String zza(Charset charset) {
        return new String(this.zzb, zzh(), zzb(), charset);
    }

    zzahw(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    protected void zza(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zzb, 0, bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    final void zza(zzahn zzahnVar) throws IOException {
        zzahnVar.zza(this.zzb, zzh(), zzb());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzahm) || zzb() != ((zzahm) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zzahw) {
            zzahw zzahwVar = (zzahw) obj;
            int iZza = zza();
            int iZza2 = zzahwVar.zza();
            if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
                return zza(zzahwVar, 0, zzb());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahx
    final boolean zza(zzahm zzahmVar, int i2, int i3) {
        if (i3 > zzahmVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i3 + zzb());
        }
        if (i3 > zzahmVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i3 + ", " + zzahmVar.zzb());
        }
        if (zzahmVar instanceof zzahw) {
            zzahw zzahwVar = (zzahw) zzahmVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzahwVar.zzb;
            int iZzh = zzh();
            int iZzh2 = zzh();
            int iZzh3 = zzahwVar.zzh();
            while (iZzh2 < iZzh + i3) {
                if (bArr[iZzh2] != bArr2[iZzh3]) {
                    return false;
                }
                iZzh2++;
                iZzh3++;
            }
            return true;
        }
        return zzahmVar.zza(0, i3).equals(zza(0, i3));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahm
    public final boolean zzf() {
        int iZzh = zzh();
        return zzaml.zzc(this.zzb, iZzh, zzb() + iZzh);
    }
}
