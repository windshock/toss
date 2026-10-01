package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class zzfx extends zzfy {
    final zzft zzb;

    @CheckForNull
    final Character zzc;

    zzfx(zzft zzftVar, @CheckForNull Character ch) {
        this.zzb = zzftVar;
        if (ch != null && zzftVar.zzd('=')) {
            throw new IllegalArgumentException(zzfi.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof zzfx)) {
            return false;
        }
        zzfx zzfxVar = (zzfx) obj;
        if (!this.zzb.equals(zzfxVar.zzb)) {
            return false;
        }
        Character ch = this.zzc;
        Character ch2 = zzfxVar.zzc;
        if (ch != ch2) {
            return ch != null && ch.equals(ch2);
        }
        return true;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return (ch == null ? 0 : ch.hashCode()) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    int zza(byte[] bArr, CharSequence charSequence) throws zzfw {
        zzft zzftVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zzb.zzc(charSequenceZze.length())) {
            throw new zzfw("Invalid input length " + charSequenceZze.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceZze.length()) {
            long jZzb = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                zzftVar = this.zzb;
                if (i4 >= zzftVar.zzc) {
                    break;
                }
                jZzb <<= zzftVar.zzb;
                if (i2 + i4 < charSequenceZze.length()) {
                    jZzb |= this.zzb.zzb(charSequenceZze.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzftVar.zzd;
            int i7 = zzftVar.zzb;
            int i8 = (i6 - 1) << 3;
            while (i8 >= (i6 << 3) - (i5 * i7)) {
                bArr[i3] = (byte) ((jZzb >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += this.zzb.zzc;
        }
        return i3;
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    void zzb(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        zzff.zzd(0, i3, bArr.length);
        while (i4 < i3) {
            zzf(appendable, bArr, i4, Math.min(this.zzb.zzd, i3 - i4));
            i4 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    final int zzc(int i2) {
        return (int) (((this.zzb.zzb * i2) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    final int zzd(int i2) {
        zzft zzftVar = this.zzb;
        return zzftVar.zzc * zzga.zza(i2, zzftVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    final CharSequence zze(CharSequence charSequence) {
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        while (true) {
            int i2 = length - 1;
            if (i2 < 0 || charSequence.charAt(i2) != '=') {
                break;
            }
            length = i2;
        }
        return charSequence.subSequence(0, length);
    }

    final void zzf(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzff.zzd(i2, i2 + i3, bArr.length);
        int i4 = 0;
        zzff.zza(i3 <= this.zzb.zzd);
        long j = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            j = (j | (bArr[i2 + i5] & 255)) << 8;
        }
        zzft zzftVar = this.zzb;
        while (i4 < (i3 << 3)) {
            int i6 = zzftVar.zzb;
            zzft zzftVar2 = this.zzb;
            appendable.append(zzftVar2.zza(((int) (j >>> ((((i3 + 1) << 3) - i6) - i4))) & zzftVar2.zza));
            i4 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i4 < (this.zzb.zzd << 3)) {
                appendable.append('=');
                i4 += this.zzb.zzb;
            }
        }
    }

    zzfx(String str, String str2, @CheckForNull Character ch) {
        this(new zzft(str, str2.toCharArray()), ch);
    }
}
