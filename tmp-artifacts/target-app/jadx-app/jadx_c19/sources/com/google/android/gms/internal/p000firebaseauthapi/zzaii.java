package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzaii extends zzahn {
    private static final Logger zzb = Logger.getLogger(zzaii.class.getName());
    private static final boolean zzc = zzamh.zzc();
    zzaik zza;

    static final class zza extends zzaii {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzc() {
        }

        zza(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i3) | i3) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            this.zzb = bArr;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = i3;
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zza(byte b) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zze;
                this.zze = i2 + 1;
                bArr[i2] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        private final void zzc(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.zzb, this.zze, i3);
                this.zze += i3;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i3)), e);
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(int i2, boolean z) throws IOException {
            zzj(i2, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
            zzl(i3);
            zzc(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzc(int i2, zzahm zzahmVar) throws IOException {
            zzj(i2, 2);
            zzb(zzahmVar);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(zzahm zzahmVar) throws IOException {
            zzl(zzahmVar.zzb());
            zzahmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzg(int i2, int i3) throws IOException {
            zzj(i2, 5);
            zzi(i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzi(int i2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zze;
                bArr[i3] = (byte) i2;
                bArr[i3 + 1] = (byte) (i2 >> 8);
                bArr[i3 + 2] = (byte) (i2 >> 16);
                this.zze = i3 + 4;
                bArr[i3 + 3] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzf(int i2, long j) throws IOException {
            zzj(i2, 1);
            zzf(j);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzf(long j) throws IOException {
            try {
                byte[] bArr = this.zzb;
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
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzh(int i2, int i3) throws IOException {
            zzj(i2, 0);
            zzj(i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzj(int i2) throws IOException {
            if (i2 >= 0) {
                zzl(i2);
            } else {
                zzh(i2);
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahn
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            zzc(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        final void zzc(int i2, zzakk zzakkVar, zzalc zzalcVar) throws IOException {
            zzj(i2, 2);
            zzl(((zzahd) zzakkVar).zza(zzalcVar));
            zzalcVar.zza((zzalc) zzakkVar, (zzanb) this.zza);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzc(zzakk zzakkVar) throws IOException {
            zzl(zzakkVar.zzk());
            zzakkVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        final void zzb(zzakk zzakkVar, zzalc zzalcVar) throws IOException {
            zzl(((zzahd) zzakkVar).zza(zzalcVar));
            zzalcVar.zza((zzalc) zzakkVar, (zzanb) this.zza);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(int i2, zzakk zzakkVar) throws IOException {
            zzj(1, 3);
            zzk(2, i2);
            zzj(3, 2);
            zzc(zzakkVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzd(int i2, zzahm zzahmVar) throws IOException {
            zzj(1, 3);
            zzk(2, i2);
            zzc(3, zzahmVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(int i2, String str) throws IOException {
            zzj(i2, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(String str) throws IOException {
            int i2 = this.zze;
            try {
                int iZzh = zzaii.zzh(str.length() * 3);
                int iZzh2 = zzaii.zzh(str.length());
                if (iZzh2 == iZzh) {
                    int i3 = i2 + iZzh2;
                    this.zze = i3;
                    int iZza = zzaml.zza(str, this.zzb, i3, zza());
                    this.zze = i2;
                    zzl((iZza - i2) - iZzh2);
                    this.zze = iZza;
                    return;
                }
                zzl(zzaml.zza(str));
                this.zze = zzaml.zza(str, this.zzb, this.zze, zza());
            } catch (zzamp e) {
                this.zze = i2;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzd(e2);
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzj(int i2, int i3) throws IOException {
            zzl((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzk(int i2, int i3) throws IOException {
            zzj(i2, 0);
            zzl(i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzl(int i2) throws IOException {
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i3 = this.zze;
                    this.zze = i3 + 1;
                    bArr[i3] = (byte) (i2 | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr2 = this.zzb;
            int i4 = this.zze;
            this.zze = i4 + 1;
            bArr2[i4] = (byte) i2;
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzh(int i2, long j) throws IOException {
            zzj(i2, 0);
            zzh(j);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzh(long j) throws IOException {
            if (zzaii.zzc && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    zzamh.zza(bArr, i2, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zze;
                this.zze = i3 + 1;
                zzamh.zza(bArr2, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i4 = this.zze;
                    this.zze = i4 + 1;
                    bArr3[i4] = (byte) (((int) j) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i5 = this.zze;
            this.zze = i5 + 1;
            bArr4[i5] = (byte) j;
        }
    }

    static abstract class zzb extends zzaii {
        final byte[] zzb;
        final int zzc;
        int zzd;
        int zze;

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        zzb(int i2) {
            super();
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            int iMax = Math.max(i2, 20);
            this.zzb = new byte[iMax];
            this.zzc = iMax;
        }

        final void zzb(byte b) {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            bArr[i2] = b;
            this.zze++;
        }

        final void zzm(int i2) {
            byte[] bArr = this.zzb;
            int i3 = this.zzd;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            this.zzd = i3 + 4;
            bArr[i3 + 3] = (byte) (i2 >>> 24);
            this.zze += 4;
        }

        final void zzi(long j) {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            bArr[i2] = (byte) (j & 255);
            bArr[i2 + 1] = (byte) ((j >> 8) & 255);
            bArr[i2 + 2] = (byte) ((j >> 16) & 255);
            bArr[i2 + 3] = (byte) (255 & (j >> 24));
            bArr[i2 + 4] = (byte) (j >> 32);
            bArr[i2 + 5] = (byte) (j >> 40);
            bArr[i2 + 6] = (byte) (j >> 48);
            this.zzd = i2 + 8;
            bArr[i2 + 7] = (byte) (j >> 56);
            this.zze += 8;
        }

        final void zzl(int i2, int i3) {
            zzn((i2 << 3) | i3);
        }

        final void zzn(int i2) {
            if (zzaii.zzc) {
                long j = this.zzd;
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i3 = this.zzd;
                    this.zzd = i3 + 1;
                    zzamh.zza(bArr, i3, (byte) (i2 | 128));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                zzamh.zza(bArr2, i4, (byte) i2);
                this.zze += (int) (this.zzd - j);
                return;
            }
            while ((i2 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                bArr3[i5] = (byte) (i2 | 128);
                this.zze++;
                i2 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i6 = this.zzd;
            this.zzd = i6 + 1;
            bArr4[i6] = (byte) i2;
            this.zze++;
        }

        final void zzj(long j) {
            if (zzaii.zzc) {
                long j2 = this.zzd;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    zzamh.zza(bArr, i2, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                zzamh.zza(bArr2, i3, (byte) j);
                this.zze += (int) (this.zzd - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                bArr3[i4] = (byte) (((int) j) | 128);
                this.zze++;
                j >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr4[i5] = (byte) j;
            this.zze++;
        }
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zza(long j) {
        return 8;
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zzb(int i2) {
        return 4;
    }

    public static int zzc(long j) {
        return 8;
    }

    static int zzd(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int zze(int i2) {
        return 4;
    }

    private static long zzi(long j) {
        return (j << 1) ^ (j >> 63);
    }

    private static int zzm(int i2) {
        return (i2 << 1) ^ (i2 >> 31);
    }

    public abstract int zza();

    public abstract void zza(byte b) throws IOException;

    public abstract void zzb(int i2, zzakk zzakkVar) throws IOException;

    public abstract void zzb(int i2, String str) throws IOException;

    public abstract void zzb(int i2, boolean z) throws IOException;

    public abstract void zzb(zzahm zzahmVar) throws IOException;

    abstract void zzb(zzakk zzakkVar, zzalc zzalcVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    abstract void zzb(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzc() throws IOException;

    public abstract void zzc(int i2, zzahm zzahmVar) throws IOException;

    abstract void zzc(int i2, zzakk zzakkVar, zzalc zzalcVar) throws IOException;

    public abstract void zzc(zzakk zzakkVar) throws IOException;

    public abstract void zzd(int i2, zzahm zzahmVar) throws IOException;

    public abstract void zzf(int i2, long j) throws IOException;

    public abstract void zzf(long j) throws IOException;

    public abstract void zzg(int i2, int i3) throws IOException;

    public abstract void zzh(int i2, int i3) throws IOException;

    public abstract void zzh(int i2, long j) throws IOException;

    public abstract void zzh(long j) throws IOException;

    public abstract void zzi(int i2) throws IOException;

    public abstract void zzj(int i2) throws IOException;

    public abstract void zzj(int i2, int i3) throws IOException;

    public abstract void zzk(int i2, int i3) throws IOException;

    public abstract void zzl(int i2) throws IOException;

    public static final class zzd extends IOException {
        zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public zzd(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int zza(int i2, boolean z) {
        return zzh(i2 << 3) + 1;
    }

    static final class zzc extends zzb {
        private final OutputStream zzf;

        zzc(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zzb, 0, this.zzd);
            this.zzd = 0;
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzc() throws IOException {
            if (this.zzd > 0) {
                zze();
            }
        }

        private final void zzo(int i2) throws IOException {
            if (this.zzc - this.zzd < i2) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zza(byte b) throws IOException {
            if (this.zzd == this.zzc) {
                zze();
            }
            zzb(b);
        }

        private final void zzc(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.zzc;
            int i5 = this.zzd;
            int i6 = i4 - i5;
            if (i6 >= i3) {
                System.arraycopy(bArr, i2, this.zzb, i5, i3);
                this.zzd += i3;
            } else {
                System.arraycopy(bArr, i2, this.zzb, i5, i6);
                int i7 = i2 + i6;
                i3 -= i6;
                this.zzd = this.zzc;
                this.zze += i6;
                zze();
                if (i3 <= this.zzc) {
                    System.arraycopy(bArr, i7, this.zzb, 0, i3);
                    this.zzd = i3;
                } else {
                    this.zzf.write(bArr, i7, i3);
                }
            }
            this.zze += i3;
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(int i2, boolean z) throws IOException {
            zzo(11);
            zzl(i2, 0);
            zzb(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
            zzl(i3);
            zzc(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzc(int i2, zzahm zzahmVar) throws IOException {
            zzj(i2, 2);
            zzb(zzahmVar);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(zzahm zzahmVar) throws IOException {
            zzl(zzahmVar.zzb());
            zzahmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzg(int i2, int i3) throws IOException {
            zzo(14);
            zzl(i2, 5);
            zzm(i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzi(int i2) throws IOException {
            zzo(4);
            zzm(i2);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzf(int i2, long j) throws IOException {
            zzo(18);
            zzl(i2, 1);
            zzi(j);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzf(long j) throws IOException {
            zzo(8);
            zzi(j);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzh(int i2, int i3) throws IOException {
            zzo(20);
            zzl(i2, 0);
            if (i3 >= 0) {
                zzn(i3);
            } else {
                zzj(i3);
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzj(int i2) throws IOException {
            if (i2 >= 0) {
                zzl(i2);
            } else {
                zzh(i2);
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahn
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            zzc(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        final void zzc(int i2, zzakk zzakkVar, zzalc zzalcVar) throws IOException {
            zzj(i2, 2);
            zzb(zzakkVar, zzalcVar);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzc(zzakk zzakkVar) throws IOException {
            zzl(zzakkVar.zzk());
            zzakkVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        final void zzb(zzakk zzakkVar, zzalc zzalcVar) throws IOException {
            zzl(((zzahd) zzakkVar).zza(zzalcVar));
            zzalcVar.zza((zzalc) zzakkVar, (zzanb) this.zza);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(int i2, zzakk zzakkVar) throws IOException {
            zzj(1, 3);
            zzk(2, i2);
            zzj(3, 2);
            zzc(zzakkVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzd(int i2, zzahm zzahmVar) throws IOException {
            zzj(1, 3);
            zzk(2, i2);
            zzc(3, zzahmVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(int i2, String str) throws IOException {
            zzj(i2, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzb(String str) throws IOException {
            int iZza;
            try {
                int length = str.length() * 3;
                int iZzh = zzaii.zzh(length);
                int i2 = iZzh + length;
                int i3 = this.zzc;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iZza2 = zzaml.zza(str, bArr, 0, length);
                    zzl(iZza2);
                    zza(bArr, 0, iZza2);
                    return;
                }
                if (i2 > i3 - this.zzd) {
                    zze();
                }
                int iZzh2 = zzaii.zzh(str.length());
                int i4 = this.zzd;
                try {
                    if (iZzh2 == iZzh) {
                        int i5 = i4 + iZzh2;
                        this.zzd = i5;
                        int iZza3 = zzaml.zza(str, this.zzb, i5, this.zzc - i5);
                        this.zzd = i4;
                        iZza = (iZza3 - i4) - iZzh2;
                        zzn(iZza);
                        this.zzd = iZza3;
                    } else {
                        iZza = zzaml.zza(str);
                        zzn(iZza);
                        this.zzd = zzaml.zza(str, this.zzb, this.zzd, iZza);
                    }
                    this.zze += iZza;
                } catch (zzamp e) {
                    this.zze -= this.zzd - i4;
                    this.zzd = i4;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new zzd(e2);
                }
            } catch (zzamp e3) {
                zza(str, e3);
            }
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzj(int i2, int i3) throws IOException {
            zzl((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzk(int i2, int i3) throws IOException {
            zzo(20);
            zzl(i2, 0);
            zzn(i3);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzl(int i2) throws IOException {
            zzo(5);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzh(int i2, long j) throws IOException {
            zzo(20);
            zzl(i2, 0);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaii
        public final void zzh(long j) throws IOException {
            zzo(10);
            zzj(j);
        }
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzh(length) + length;
    }

    public static int zza(int i2, zzahm zzahmVar) {
        int iZzh = zzh(i2 << 3);
        int iZzb = zzahmVar.zzb();
        return iZzh + zzh(iZzb) + iZzb;
    }

    public static int zza(zzahm zzahmVar) {
        int iZzb = zzahmVar.zzb();
        return zzh(iZzb) + iZzb;
    }

    public static int zza(int i2, double d) {
        return zzh(i2 << 3) + 8;
    }

    public static int zza(int i2, int i3) {
        return zzh(i2 << 3) + zze(i3);
    }

    public static int zza(int i2) {
        return zze(i2);
    }

    public static int zzb(int i2, int i3) {
        return zzh(i2 << 3) + 4;
    }

    public static int zza(int i2, long j) {
        return zzh(i2 << 3) + 8;
    }

    public static int zza(int i2, float f) {
        return zzh(i2 << 3) + 4;
    }

    @Deprecated
    static int zza(int i2, zzakk zzakkVar, zzalc zzalcVar) {
        return (zzh(i2 << 3) << 1) + ((zzahd) zzakkVar).zza(zzalcVar);
    }

    @Deprecated
    public static int zza(zzakk zzakkVar) {
        return zzakkVar.zzk();
    }

    public static int zzc(int i2, int i3) {
        return zzh(i2 << 3) + zze(i3);
    }

    public static int zzc(int i2) {
        return zze(i2);
    }

    public static int zzb(int i2, long j) {
        return zzh(i2 << 3) + zze(j);
    }

    public static int zzb(long j) {
        return zze(j);
    }

    public static int zza(int i2, zzajo zzajoVar) {
        return (zzh(8) << 1) + zzf(2, i2) + zzb(3, zzajoVar);
    }

    public static int zzb(int i2, zzajo zzajoVar) {
        int iZzh = zzh(i2 << 3);
        int iZzb = zzajoVar.zzb();
        return iZzh + zzh(iZzb) + iZzb;
    }

    public static int zza(zzajo zzajoVar) {
        int iZzb = zzajoVar.zzb();
        return zzh(iZzb) + iZzb;
    }

    public static int zza(int i2, zzakk zzakkVar) {
        int iZzh = zzh(8);
        return (iZzh << 1) + zzf(2, i2) + zzh(24) + zzb(zzakkVar);
    }

    static int zzb(int i2, zzakk zzakkVar, zzalc zzalcVar) {
        return zzh(i2 << 3) + zza(zzakkVar, zzalcVar);
    }

    public static int zzb(zzakk zzakkVar) {
        int iZzk = zzakkVar.zzk();
        return zzh(iZzk) + iZzk;
    }

    static int zza(zzakk zzakkVar, zzalc zzalcVar) {
        int iZza = ((zzahd) zzakkVar).zza(zzalcVar);
        return zzh(iZza) + iZza;
    }

    public static int zzb(int i2, zzahm zzahmVar) {
        return (zzh(8) << 1) + zzf(2, i2) + zza(3, zzahmVar);
    }

    public static int zzd(int i2, int i3) {
        return zzh(i2 << 3) + 4;
    }

    public static int zzc(int i2, long j) {
        return zzh(i2 << 3) + 8;
    }

    public static int zze(int i2, int i3) {
        return zzh(i2 << 3) + zzh(zzm(i3));
    }

    public static int zzf(int i2) {
        return zzh(zzm(i2));
    }

    public static int zzd(int i2, long j) {
        return zzh(i2 << 3) + zze(zzi(j));
    }

    public static int zzd(long j) {
        return zze(zzi(j));
    }

    public static int zza(int i2, String str) {
        return zzh(i2 << 3) + zza(str);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzaml.zza(str);
        } catch (zzamp unused) {
            length = str.getBytes(zzajc.zza).length;
        }
        return zzh(length) + length;
    }

    public static int zzg(int i2) {
        return zzh(i2 << 3);
    }

    public static int zzf(int i2, int i3) {
        return zzh(i2 << 3) + zzh(i3);
    }

    public static int zzh(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int zze(int i2, long j) {
        return zzh(i2 << 3) + zze(j);
    }

    public static int zze(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static zzaii zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static zzaii zza(OutputStream outputStream, int i2) {
        return new zzc(outputStream, i2);
    }

    private zzaii() {
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(String str, zzamp zzampVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzampVar);
        byte[] bytes = str.getBytes(zzajc.zza);
        try {
            zzl(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzd(e);
        }
    }

    public final void zzb(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i2, double d) throws IOException {
        zzf(i2, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) throws IOException {
        zzf(Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i2, float f) throws IOException {
        zzg(i2, Float.floatToRawIntBits(f));
    }

    public final void zzb(float f) throws IOException {
        zzi(Float.floatToRawIntBits(f));
    }

    public final void zzi(int i2, int i3) throws IOException {
        zzk(i2, zzm(i3));
    }

    public final void zzk(int i2) throws IOException {
        zzl(zzm(i2));
    }

    public final void zzg(int i2, long j) throws IOException {
        zzh(i2, zzi(j));
    }

    public final void zzg(long j) throws IOException {
        zzh(zzi(j));
    }
}
