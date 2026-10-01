package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzfu extends zzfx {
    final char[] zza;

    zzfu(String str, String str2) {
        zzft zzftVar = new zzft("base16()", "0123456789ABCDEF".toCharArray());
        super(zzftVar, null);
        this.zza = new char[512];
        zzff.zza(zzftVar.zzf.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            this.zza[i2] = zzftVar.zza(i2 >>> 4);
            this.zza[i2 | 256] = zzftVar.zza(i2 & 15);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzfx, com.google.android.recaptcha.internal.zzfy
    final int zza(byte[] bArr, CharSequence charSequence) throws zzfw {
        if (charSequence.length() % 2 == 1) {
            throw new zzfw("Invalid input length " + charSequence.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            bArr[i3] = (byte) ((this.zzb.zzb(charSequence.charAt(i2)) << 4) | this.zzb.zzb(charSequence.charAt(i2 + 1)));
            i2 += 2;
            i3++;
        }
        return i3;
    }

    @Override // com.google.android.recaptcha.internal.zzfx, com.google.android.recaptcha.internal.zzfy
    final void zzb(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzff.zzd(0, i3, bArr.length);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = bArr[i4] & 255;
            appendable.append(this.zza[i5]);
            appendable.append(this.zza[i5 | 256]);
        }
    }
}
