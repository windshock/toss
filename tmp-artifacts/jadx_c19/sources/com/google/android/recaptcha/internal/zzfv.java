package com.google.android.recaptcha.internal;

import java.io.IOException;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzfv extends zzfx {
    zzfv(String str, String str2, @CheckForNull Character ch) {
        zzft zzftVar = new zzft(str, str2.toCharArray());
        super(zzftVar, ch);
        zzff.zza(zzftVar.zzf.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzfx, com.google.android.recaptcha.internal.zzfy
    final int zza(byte[] bArr, CharSequence charSequence) throws zzfw {
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zzb.zzc(charSequenceZze.length())) {
            throw new zzfw("Invalid input length " + charSequenceZze.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceZze.length()) {
            int i4 = i3 + 1;
            int iZzb = (this.zzb.zzb(charSequenceZze.charAt(i2)) << 18) | (this.zzb.zzb(charSequenceZze.charAt(i2 + 1)) << 12);
            bArr[i3] = (byte) (iZzb >>> 16);
            int i5 = i2 + 2;
            if (i5 < charSequenceZze.length()) {
                int i6 = i2 + 3;
                int iZzb2 = iZzb | (this.zzb.zzb(charSequenceZze.charAt(i5)) << 6);
                int i7 = i3 + 2;
                bArr[i4] = (byte) (iZzb2 >>> 8);
                if (i6 < charSequenceZze.length()) {
                    i2 += 4;
                    i3 += 3;
                    bArr[i7] = (byte) (iZzb2 | this.zzb.zzb(charSequenceZze.charAt(i6)));
                } else {
                    i3 = i7;
                    i2 = i6;
                }
            } else {
                i2 = i5;
                i3 = i4;
            }
        }
        return i3;
    }

    @Override // com.google.android.recaptcha.internal.zzfx, com.google.android.recaptcha.internal.zzfy
    final void zzb(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        zzff.zzd(0, i3, bArr.length);
        for (int i5 = i3; i5 >= 3; i5 -= 3) {
            int i6 = ((bArr[i4] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8) | (bArr[i4 + 2] & 255);
            appendable.append(this.zzb.zza(i6 >>> 18));
            appendable.append(this.zzb.zza((i6 >>> 12) & 63));
            appendable.append(this.zzb.zza((i6 >>> 6) & 63));
            appendable.append(this.zzb.zza(i6 & 63));
            i4 += 3;
        }
        if (i4 < i3) {
            zzf(appendable, bArr, i4, i3 - i4);
        }
    }
}
