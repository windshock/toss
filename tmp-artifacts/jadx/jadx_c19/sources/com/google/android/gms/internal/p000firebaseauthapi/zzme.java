package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzme {
    private static final byte[][] zza = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    public static void zza(long[] jArr, byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i2 = 32;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf[31] = (byte) (bArrCopyOf[31] & Byte.MAX_VALUE);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte[][] bArr3 = zza;
            if (i4 < bArr3.length) {
                if (MessageDigest.isEqual(bArr3[i4], bArrCopyOf)) {
                    throw new InvalidKeyException("Banned public key: " + zzxh.zza(bArr3[i4]));
                }
                i4++;
            } else {
                long[] jArrZza = zzmj.zza(bArrCopyOf);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i5 = 10;
                System.arraycopy(jArrZza, 0, jArr2, 0, 10);
                int i6 = 0;
                while (i6 < i2) {
                    int i7 = bArr[31 - i6] & 255;
                    while (i3 < 8) {
                        int i8 = (i7 >> (7 - i3)) & 1;
                        zza(jArr4, jArr2, i8);
                        zza(jArr5, jArr3, i8);
                        long[] jArrCopyOf = Arrays.copyOf(jArr4, i5);
                        int i9 = i7;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = new long[19];
                        int i10 = i6;
                        long[] jArr12 = new long[19];
                        int i11 = i3;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzmj.zzd(jArr4, jArr5);
                        zzmj.zzc(jArr5, jArrCopyOf);
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                        zzmj.zzd(jArr2, jArr3);
                        zzmj.zzc(jArr3, jArrCopyOf2);
                        zzmj.zzb(jArr13, jArr2, jArr5);
                        zzmj.zzb(jArr14, jArr4, jArr3);
                        zzmj.zzb(jArr13);
                        zzmj.zza(jArr13);
                        zzmj.zzb(jArr14);
                        zzmj.zza(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, jArrCopyOf2, 0, 10);
                        zzmj.zzd(jArr13, jArr14);
                        zzmj.zzc(jArr14, jArrCopyOf2);
                        zzmj.zzb(jArr17, jArr13);
                        zzmj.zzb(jArr16, jArr14);
                        zzmj.zzb(jArr14, jArr16, jArrZza);
                        zzmj.zzb(jArr14);
                        zzmj.zza(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzmj.zzb(jArr11, jArr4);
                        zzmj.zzb(jArr12, jArr5);
                        zzmj.zzb(jArr8, jArr11, jArr12);
                        zzmj.zzb(jArr8);
                        zzmj.zza(jArr8);
                        zzmj.zzc(jArr12, jArr11);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        zzmj.zza(jArr10, jArr12, 121665L);
                        zzmj.zza(jArr10);
                        zzmj.zzd(jArr10, jArr11);
                        zzmj.zzb(jArr15, jArr12, jArr10);
                        zzmj.zzb(jArr15);
                        zzmj.zza(jArr15);
                        zza(jArr8, jArr6, i8);
                        zza(jArr15, jArr7, i8);
                        i3 = i11 + 1;
                        jArr2 = jArr6;
                        i7 = i9;
                        i6 = i10;
                        jArr6 = jArr18;
                        i5 = 10;
                        long[] jArr19 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr19;
                        long[] jArr20 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr20;
                        jArr9 = jArr5;
                        jArr5 = jArr15;
                    }
                    i6++;
                    i2 = 32;
                    i3 = 0;
                    i5 = 10;
                }
                int i12 = i5;
                long[] jArr21 = new long[i12];
                zzmj.zza(jArr21, jArr5);
                zzmj.zza(jArr, jArr4, jArr21);
                long[] jArr22 = new long[i12];
                long[] jArr23 = new long[i12];
                long[] jArr24 = new long[11];
                long[] jArr25 = new long[11];
                long[] jArr26 = new long[11];
                zzmj.zza(jArr22, jArrZza, jArr);
                zzmj.zzd(jArr23, jArrZza, jArr);
                long[] jArr27 = new long[i12];
                jArr27[0] = 486662;
                zzmj.zzd(jArr25, jArr23, jArr27);
                zzmj.zza(jArr25, jArr25, jArr3);
                zzmj.zzd(jArr25, jArr2);
                zzmj.zza(jArr25, jArr25, jArr22);
                zzmj.zza(jArr25, jArr25, jArr2);
                zzmj.zza(jArr24, jArr25, 4L);
                zzmj.zza(jArr24);
                zzmj.zza(jArr25, jArr22, jArr3);
                zzmj.zzc(jArr25, jArr25, jArr3);
                zzmj.zza(jArr26, jArr23, jArr2);
                zzmj.zzd(jArr25, jArr25, jArr26);
                zzmj.zzb(jArr25, jArr25);
                if (MessageDigest.isEqual(zzmj.zzc(jArr24), zzmj.zzc(jArr25))) {
                    return;
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + zzxh.zza(bArr2));
            }
        }
    }

    private static void zza(long[] jArr, long[] jArr2, int i2) {
        int i3 = -i2;
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = (((int) jArr2[i4]) ^ ((int) jArr[i4])) & i3;
            jArr[i4] = r1 ^ i5;
            jArr2[i4] = ((int) jArr2[i4]) ^ i5;
        }
    }
}
