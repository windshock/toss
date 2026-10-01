package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzahq extends zzahw {
    private final int zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahw, com.google.android.gms.internal.p000firebaseauthapi.zzahm
    public final byte zza(int i2) {
        int iZzb = zzb();
        if (((iZzb - (i2 + 1)) | i2) >= 0) {
            return this.zzb[this.zzc + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + iZzb);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahw, com.google.android.gms.internal.p000firebaseauthapi.zzahm
    final byte zzb(int i2) {
        return this.zzb[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahw
    protected final int zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahw, com.google.android.gms.internal.p000firebaseauthapi.zzahm
    public final int zzb() {
        return this.zzd;
    }

    zzahq(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzahm.zza(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahw, com.google.android.gms.internal.p000firebaseauthapi.zzahm
    protected final void zza(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zzb, zzh(), bArr, 0, i4);
    }
}
