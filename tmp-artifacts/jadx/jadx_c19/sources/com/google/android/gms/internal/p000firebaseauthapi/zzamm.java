package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzamm extends zzamn {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamn
    final int zza(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int length = str.length();
        int i7 = i3 + i2;
        int i8 = 0;
        while (i8 < length && (i6 = i8 + i2) < i7 && (cCharAt = str.charAt(i8)) < 128) {
            bArr[i6] = (byte) cCharAt;
            i8++;
        }
        if (i8 == length) {
            return i2 + length;
        }
        int i9 = i2 + i8;
        while (i8 < length) {
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 >= 128 || i9 >= i7) {
                if (cCharAt2 < 2048 && i9 <= i7 - 2) {
                    bArr[i9] = (byte) ((cCharAt2 >>> 6) | 960);
                    i4 = i9 + 2;
                    bArr[i9 + 1] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i9 > i7 - 3) {
                        if (i9 > i7 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                                throw new zzamp(i8, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i9);
                        }
                        int i10 = i8 + 1;
                        if (i10 != str.length()) {
                            char cCharAt3 = str.charAt(i10);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                bArr[i9 + 3] = (byte) ((codePoint & 63) | 128);
                                i9 += 4;
                                i8 = i10;
                            } else {
                                i8 = i10;
                            }
                        }
                        throw new zzamp(i8 - 1, length);
                    }
                    bArr[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                    bArr[i9 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i4 = i9 + 3;
                    bArr[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                }
                i9 = i4;
            } else {
                bArr[i9] = (byte) cCharAt2;
                i9++;
            }
            i8++;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamn
    final int zza(int i2, byte[] bArr, int i3, int i4) {
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return 0;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b < 0) {
                if (b < -32) {
                    if (i5 >= i4) {
                        return b;
                    }
                    if (b >= -62) {
                        i3 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i5 >= i4 - 2) {
                        return zzaml.zza(bArr, i5, i4);
                    }
                    byte b2 = bArr[i5];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0 && bArr[i3 + 2] <= -65) {
                        i5 = i3 + 4;
                        if (bArr[i3 + 3] > -65) {
                        }
                    }
                    return -1;
                }
                if (i5 >= i4 - 1) {
                    return zzaml.zza(bArr, i5, i4);
                }
                byte b3 = bArr[i5];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i5 = i3 + 3;
                    if (bArr[i3 + 2] > -65) {
                    }
                }
                return -1;
            }
            i3 = i5;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamn
    final String zza(byte[] bArr, int i2, int i3) throws zzajj {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b = bArr[i2];
            if (b < 0) {
                break;
            }
            i2++;
            zzamk.zza(b, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                zzamk.zza(b2, cArr, i6);
                i6++;
                i2 = i7;
                while (i2 < i4) {
                    byte b3 = bArr[i2];
                    if (b3 >= 0) {
                        i2++;
                        zzamk.zza(b3, cArr, i6);
                        i6++;
                    }
                }
            } else if (b2 < -32) {
                if (i7 >= i4) {
                    throw zzajj.zzd();
                }
                i2 += 2;
                zzamk.zza(b2, bArr[i7], cArr, i6);
                i6++;
            } else if (b2 < -16) {
                if (i7 >= i4 - 1) {
                    throw zzajj.zzd();
                }
                zzamk.zza(b2, bArr[i7], bArr[i2 + 2], cArr, i6);
                i6++;
                i2 += 3;
            } else {
                if (i7 >= i4 - 2) {
                    throw zzajj.zzd();
                }
                zzamk.zza(b2, bArr[i7], bArr[i2 + 2], bArr[i2 + 3], cArr, i6);
                i6 += 2;
                i2 += 4;
            }
        }
        return new String(cArr, 0, i6);
    }

    zzamm() {
    }
}
