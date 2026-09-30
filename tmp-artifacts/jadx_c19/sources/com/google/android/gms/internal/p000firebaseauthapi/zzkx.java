package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzkx implements zzld {
    private final String zza;

    final int zza() throws GeneralSecurityException {
        return Mac.getInstance(this.zza).getMacLength();
    }

    zzkx(String str) {
        this.zza = str;
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i2) throws IllegalStateException, GeneralSecurityException {
        Mac macZza = zzwr.zzb.zza(this.zza);
        if (i2 > macZza.getMacLength() * OggPageHeader.MAX_SEGMENT_COUNT) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i2];
        macZza.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArrDoFinal = new byte[0];
        int i3 = 1;
        int length = 0;
        while (true) {
            macZza.update(bArrDoFinal);
            macZza.update(bArr2);
            macZza.update((byte) i3);
            bArrDoFinal = macZza.doFinal();
            if (bArrDoFinal.length + length < i2) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
                length += bArrDoFinal.length;
                i3++;
            } else {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i2 - length);
                return bArr3;
            }
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac macZza = zzwr.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            macZza.init(new SecretKeySpec(new byte[macZza.getMacLength()], this.zza));
        } else {
            macZza.init(new SecretKeySpec(bArr2, this.zza));
        }
        return macZza.doFinal(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i2) throws GeneralSecurityException {
        return zza(zza(zzlq.zza(str, bArr2, bArr4), null), zzlq.zza(str2, bArr3, bArr4, i2), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zzb() throws GeneralSecurityException {
        char c;
        String str = this.zza;
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 984523022) {
            if (iHashCode != 984524074) {
                c = (iHashCode == 984525777 && str.equals("HmacSha512")) ? (char) 2 : (char) 65535;
            } else if (str.equals("HmacSha384")) {
                c = 1;
            }
        } else if (str.equals("HmacSha256")) {
            c = 0;
        }
        if (c == 0) {
            return zzlq.zzf;
        }
        if (c == 1) {
            return zzlq.zzg;
        }
        if (c == 2) {
            return zzlq.zzh;
        }
        throw new GeneralSecurityException("Could not determine HPKE KDF ID");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzld
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i2) throws GeneralSecurityException {
        return zza(bArr, zzlq.zza(str, bArr2, bArr3, i2), i2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzld
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return zza(zzlq.zza(str, bArr2, bArr3), bArr);
    }
}
