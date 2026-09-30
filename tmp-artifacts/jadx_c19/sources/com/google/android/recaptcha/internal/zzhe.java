package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzhe extends zzhh {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzhe(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i3;
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzd(int i2, boolean z) throws IOException {
        zzq(i2 << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zze(int i2, zzgw zzgwVar) throws IOException {
        zzq((i2 << 3) | 2);
        zzq(zzgwVar.zzd());
        zzgwVar.zzi(this);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzf(int i2, int i3) throws IOException {
        zzq((i2 << 3) | 5);
        zzg(i3);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzg(int i2) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i3 = this.zze;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            this.zze = i3 + 4;
            bArr[i3 + 3] = (byte) (i2 >>> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzh(int i2, long j) throws IOException {
        zzq((i2 << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzi(long j) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            bArr[i2] = (byte) j;
            bArr[i2 + 1] = (byte) (j >> 8);
            bArr[i2 + 2] = (byte) (j >> 16);
            bArr[i2 + 3] = (byte) (j >> 24);
            bArr[i2 + 4] = (byte) (j >> 32);
            bArr[i2 + 5] = (byte) (j >> 40);
            bArr[i2 + 6] = (byte) (j >> 48);
            this.zze = i2 + 8;
            bArr[i2 + 7] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzj(int i2, int i3) throws IOException {
        zzq(i2 << 3);
        zzk(i3);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzk(int i2) throws IOException {
        if (i2 >= 0) {
            zzq(i2);
        } else {
            zzs(i2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzl(byte[] bArr, int i2, int i3) throws IOException {
        zzc(bArr, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzm(int i2, String str) throws IOException {
        zzq((i2 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i2 = this.zze;
        try {
            int iZzy = zzhh.zzy(str.length() * 3);
            int iZzy2 = zzhh.zzy(str.length());
            if (iZzy2 != iZzy) {
                zzq(zzma.zzc(str));
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                this.zze = zzma.zzb(str, bArr, i3, this.zzd - i3);
                return;
            }
            int i4 = i2 + iZzy2;
            this.zze = i4;
            int iZzb = zzma.zzb(str, this.zzc, i4, this.zzd - i4);
            this.zze = i2;
            zzq((iZzb - i2) - iZzy2);
            this.zze = iZzb;
        } catch (zzlz e) {
            this.zze = i2;
            zzC(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzhf(e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzo(int i2, int i3) throws IOException {
        zzq((i2 << 3) | i3);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzp(int i2, int i3) throws IOException {
        zzq(i2 << 3);
        zzq(i3);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzr(int i2, long j) throws IOException {
        zzq(i2 << 3);
        zzs(j);
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzb(byte b) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            this.zze = i2 + 1;
            bArr[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i3);
            this.zze += i3;
        } catch (IndexOutOfBoundsException e) {
            throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i3)), e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzq(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                this.zze = i3 + 1;
                bArr[i3] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        byte[] bArr2 = this.zzc;
        int i4 = this.zze;
        this.zze = i4 + 1;
        bArr2[i4] = (byte) i2;
    }

    @Override // com.google.android.recaptcha.internal.zzhh
    public final void zzs(long j) throws IOException {
        if (!zzhh.zzd || this.zzd - this.zze < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzc;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzhf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr2 = this.zzc;
            int i3 = this.zze;
            this.zze = i3 + 1;
            bArr2[i3] = (byte) j;
            return;
        }
        while (true) {
            int i4 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.zzc;
                int i5 = this.zze;
                this.zze = i5 + 1;
                zzlv.zzn(bArr3, i5, (byte) i4);
                return;
            }
            byte[] bArr4 = this.zzc;
            int i6 = this.zze;
            this.zze = i6 + 1;
            zzlv.zzn(bArr4, i6, (byte) ((i4 & 127) | 128));
            j >>>= 7;
        }
    }
}
