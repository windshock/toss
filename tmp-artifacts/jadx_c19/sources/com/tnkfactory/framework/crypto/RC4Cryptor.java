package com.tnkfactory.framework.crypto;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RC4Cryptor implements Cryptor {
    public byte[] a;
    public int[] b = new int[256];
    public int c = 0;
    public int d = 0;

    public RC4Cryptor(byte[] bArr) {
        this.a = bArr;
    }

    public final void a(int[] iArr, int i2, int i3) {
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
    }

    @Override // com.tnkfactory.framework.crypto.Cryptor
    public int decrypt(int i2) {
        int i3 = (this.c + 1) & OggPageHeader.MAX_SEGMENT_COUNT;
        this.c = i3;
        int[] iArr = this.b;
        int i4 = (iArr[i3] + this.d) & OggPageHeader.MAX_SEGMENT_COUNT;
        this.d = i4;
        a(iArr, i3, i4);
        int[] iArr2 = this.b;
        return i2 ^ ((byte) iArr2[(iArr2[this.c] + iArr2[this.d]) & OggPageHeader.MAX_SEGMENT_COUNT]);
    }

    @Override // com.tnkfactory.framework.crypto.Cryptor
    public void decrypt(byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (this.c + 1) & OggPageHeader.MAX_SEGMENT_COUNT;
            this.c = i5;
            int[] iArr = this.b;
            int i6 = (iArr[i5] + this.d) & OggPageHeader.MAX_SEGMENT_COUNT;
            this.d = i6;
            a(iArr, i5, i6);
            int[] iArr2 = this.b;
            int i7 = iArr2[this.c];
            int i8 = iArr2[this.d];
            int i9 = i2 + i4;
            bArr[i9] = (byte) (((byte) iArr2[(i7 + i8) & OggPageHeader.MAX_SEGMENT_COUNT]) ^ bArr[i9]);
        }
    }

    @Override // com.tnkfactory.framework.crypto.Cryptor
    public int encrypt(int i2) {
        int i3 = (this.c + 1) & OggPageHeader.MAX_SEGMENT_COUNT;
        this.c = i3;
        int[] iArr = this.b;
        int i4 = (iArr[i3] + this.d) & OggPageHeader.MAX_SEGMENT_COUNT;
        this.d = i4;
        a(iArr, i3, i4);
        int[] iArr2 = this.b;
        return i2 ^ ((byte) iArr2[(iArr2[this.c] + iArr2[this.d]) & OggPageHeader.MAX_SEGMENT_COUNT]);
    }

    @Override // com.tnkfactory.framework.crypto.Cryptor
    public void encrypt(byte[] bArr, int i2, int i3) {
        decrypt(bArr, i2, i3);
    }

    @Override // com.tnkfactory.framework.crypto.Cryptor
    public Cryptor init() {
        int i2 = 0;
        this.c = 0;
        this.d = 0;
        byte[] bArr = this.a;
        if (bArr.length <= 0 || bArr.length > 32) {
            throw new IllegalArgumentException("number of bytes must be between 1 and 32");
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.b;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = i3;
            i3++;
        }
        int length = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.b;
            if (i2 >= iArr2.length) {
                return this;
            }
            int i5 = this.a[length];
            if (i5 < 0) {
                i5 += 256;
            }
            i4 = ((i5 + iArr2[i2]) + i4) % 256;
            a(iArr2, i2, i4);
            length = (length + 1) % this.a.length;
            i2++;
        }
    }
}
