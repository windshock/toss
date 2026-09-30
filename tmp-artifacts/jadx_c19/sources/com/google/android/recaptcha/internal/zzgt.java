package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class zzgt extends zzgs {
    protected final byte[] zza;

    zzgt(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgw) || zzd() != ((zzgw) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgt)) {
            return obj.equals(this);
        }
        zzgt zzgtVar = (zzgt) obj;
        int iZzl = zzl();
        int iZzl2 = zzgtVar.zzl();
        if (iZzl != 0 && iZzl2 != 0 && iZzl != iZzl2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzgtVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzgtVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzgtVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgtVar.zza;
        zzgtVar.zzc();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iZzd) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    byte zzb(int i2) {
        return this.zza[i2];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    protected void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, 0, bArr, 0, i4);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    protected final int zzf(int i2, int i3, int i4) {
        return zzjc.zzb(i2, this.zza, 0, i4);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final zzgw zzg(int i2, int i3) {
        int iZzk = zzgw.zzk(0, i3, zzd());
        return iZzk == 0 ? zzgw.zzb : new zzgq(this.zza, 0, iZzk);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    protected final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    final void zzi(zzgm zzgmVar) throws IOException {
        ((zzhe) zzgmVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final boolean zzj() {
        return zzma.zzf(this.zza, 0, zzd());
    }
}
