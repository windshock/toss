package org.bouncycastle.cert.selector;

import java.io.IOException;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.util.Pack;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class MSOutlookKeyIdCalculator {

    static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        protected GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        protected GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        protected void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        public void finish() {
            long j = this.byteCount;
            byte b = ByteCompanionObject.MIN_VALUE;
            while (true) {
                update(b);
                if (this.xBufOff == 0) {
                    processLength(j << 3);
                    processBlock();
                    return;
                }
                b = 0;
            }
        }

        protected abstract void processBlock();

        protected abstract void processLength(long j);

        protected abstract void processWord(byte[] bArr, int i);

        public void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i >= bArr.length) {
                    return;
                }
                bArr[i] = 0;
                i++;
            }
        }

        public void update(byte b) {
            byte[] bArr = this.xBuf;
            int i = this.xBufOff;
            int i2 = i + 1;
            this.xBufOff = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }

        public void update(byte[] bArr, int i, int i2) {
            while (this.xBufOff != 0 && i2 > 0) {
                update(bArr[i]);
                i++;
                i2--;
            }
            while (i2 > this.xBuf.length) {
                processWord(bArr, i);
                byte[] bArr2 = this.xBuf;
                i += bArr2.length;
                i2 -= bArr2.length;
                this.byteCount += bArr2.length;
            }
            while (i2 > 0) {
                update(bArr[i]);
                i++;
                i2--;
            }
        }
    }

    static class SHA1Digest extends GeneralDigest {
        private static final int DIGEST_LENGTH = 20;
        private static final int Y1 = 1518500249;
        private static final int Y2 = 1859775393;
        private static final int Y3 = -1894007588;
        private static final int Y4 = -899497514;
        private int H1;
        private int H2;
        private int H3;
        private int H4;
        private int H5;
        private int[] X = new int[80];
        private int xOff;

        public SHA1Digest() {
            reset();
        }

        private int f(int i, int i2, int i3) {
            return (i & i2) | (i3 & (~i));
        }

        private int g(int i, int i2, int i3) {
            return (i & (i2 | i3)) | (i2 & i3);
        }

        private int h(int i, int i2, int i3) {
            return (i ^ i2) ^ i3;
        }

        public int doFinal(byte[] bArr, int i) {
            finish();
            Pack.intToBigEndian(this.H1, bArr, i);
            Pack.intToBigEndian(this.H2, bArr, i + 4);
            Pack.intToBigEndian(this.H3, bArr, i + 8);
            Pack.intToBigEndian(this.H4, bArr, i + 12);
            Pack.intToBigEndian(this.H5, bArr, i + 16);
            reset();
            return 20;
        }

        public String getAlgorithmName() {
            return "SHA-1";
        }

        public int getDigestSize() {
            return 20;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processBlock() {
            for (int i = 16; i < 80; i++) {
                int[] iArr = this.X;
                int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
                iArr[i] = (i2 << 1) | (i2 >>> 31);
            }
            int iH = this.H1;
            int iH2 = this.H2;
            int i3 = this.H3;
            int i4 = this.H4;
            int i5 = this.H5;
            int i6 = 0;
            int i7 = 0;
            while (i6 < 4) {
                int iF = i5 + ((iH << 5) | (iH >>> 27)) + f(iH2, i3, i4) + this.X[i7] + Y1;
                int i8 = (iH2 << 30) | (iH2 >>> 2);
                int iF2 = i4 + ((iF << 5) | (iF >>> 27)) + f(iH, i8, i3) + this.X[i7 + 1] + Y1;
                int i9 = (iH << 30) | (iH >>> 2);
                int iF3 = i3 + ((iF2 << 5) | (iF2 >>> 27)) + f(iF, i9, i8) + this.X[i7 + 2] + Y1;
                i5 = (iF << 30) | (iF >>> 2);
                iH2 = i8 + ((iF3 << 5) | (iF3 >>> 27)) + f(iF2, i5, i9) + this.X[i7 + 3] + Y1;
                i4 = (iF2 << 30) | (iF2 >>> 2);
                iH = i9 + ((iH2 << 5) | (iH2 >>> 27)) + f(iF3, i4, i5) + this.X[i7 + 4] + Y1;
                i3 = (iF3 << 30) | (iF3 >>> 2);
                i6++;
                i7 += 5;
            }
            int i10 = 0;
            while (i10 < 4) {
                int iH3 = i5 + ((iH << 5) | (iH >>> 27)) + h(iH2, i3, i4) + this.X[i7] + Y2;
                int i11 = (iH2 << 30) | (iH2 >>> 2);
                int iH4 = i4 + ((iH3 << 5) | (iH3 >>> 27)) + h(iH, i11, i3) + this.X[i7 + 1] + Y2;
                int i12 = (iH << 30) | (iH >>> 2);
                int iH5 = i3 + ((iH4 << 5) | (iH4 >>> 27)) + h(iH3, i12, i11) + this.X[i7 + 2] + Y2;
                i5 = (iH3 << 30) | (iH3 >>> 2);
                iH2 = i11 + ((iH5 << 5) | (iH5 >>> 27)) + h(iH4, i5, i12) + this.X[i7 + 3] + Y2;
                i4 = (iH4 << 30) | (iH4 >>> 2);
                iH = i12 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH5, i4, i5) + this.X[i7 + 4] + Y2;
                i3 = (iH5 << 30) | (iH5 >>> 2);
                i10++;
                i7 += 5;
            }
            int i13 = 0;
            while (i13 < 4) {
                int iG = i5 + (((((iH << 5) | (iH >>> 27)) + g(iH2, i3, i4)) + this.X[i7]) - 1894007588);
                int i14 = (iH2 << 30) | (iH2 >>> 2);
                int iG2 = i4 + (((((iG << 5) | (iG >>> 27)) + g(iH, i14, i3)) + this.X[i7 + 1]) - 1894007588);
                int i15 = (iH << 30) | (iH >>> 2);
                int iG3 = i3 + (((((iG2 << 5) | (iG2 >>> 27)) + g(iG, i15, i14)) + this.X[i7 + 2]) - 1894007588);
                i5 = (iG << 30) | (iG >>> 2);
                iH2 = i14 + (((((iG3 << 5) | (iG3 >>> 27)) + g(iG2, i5, i15)) + this.X[i7 + 3]) - 1894007588);
                i4 = (iG2 << 30) | (iG2 >>> 2);
                iH = i15 + (((((iH2 << 5) | (iH2 >>> 27)) + g(iG3, i4, i5)) + this.X[i7 + 4]) - 1894007588);
                i3 = (iG3 << 30) | (iG3 >>> 2);
                i13++;
                i7 += 5;
            }
            int i16 = 0;
            while (i16 <= 3) {
                int iH6 = i5 + (((((iH << 5) | (iH >>> 27)) + h(iH2, i3, i4)) + this.X[i7]) - 899497514);
                int i17 = (iH2 << 30) | (iH2 >>> 2);
                int iH7 = i4 + (((((iH6 << 5) | (iH6 >>> 27)) + h(iH, i17, i3)) + this.X[i7 + 1]) - 899497514);
                int i18 = (iH << 30) | (iH >>> 2);
                int iH8 = i3 + (((((iH7 << 5) | (iH7 >>> 27)) + h(iH6, i18, i17)) + this.X[i7 + 2]) - 899497514);
                i5 = (iH6 << 30) | (iH6 >>> 2);
                iH2 = i17 + (((((iH8 << 5) | (iH8 >>> 27)) + h(iH7, i5, i18)) + this.X[i7 + 3]) - 899497514);
                i4 = (iH7 << 30) | (iH7 >>> 2);
                iH = i18 + (((((iH2 << 5) | (iH2 >>> 27)) + h(iH8, i4, i5)) + this.X[i7 + 4]) - 899497514);
                i3 = (iH8 << 30) | (iH8 >>> 2);
                i16++;
                i7 += 5;
            }
            this.H1 += iH;
            this.H2 += iH2;
            this.H3 += i3;
            this.H4 += i4;
            this.H5 += i5;
            this.xOff = 0;
            for (int i19 = 0; i19 < 16; i19++) {
                this.X[i19] = 0;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processLength(long j) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) j;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processWord(byte[] bArr, int i) {
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            byte b3 = bArr[i + 2];
            byte b4 = bArr[i + 3];
            int[] iArr = this.X;
            int i2 = this.xOff;
            iArr[i2] = (b4 & 255) | (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
            int i3 = i2 + 1;
            this.xOff = i3;
            if (i3 == 16) {
                processBlock();
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void reset() {
            super.reset();
            this.H1 = 1732584193;
            this.H2 = -271733879;
            this.H3 = -1732584194;
            this.H4 = 271733878;
            this.H5 = -1009589776;
            this.xOff = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.X;
                if (i == iArr.length) {
                    return;
                }
                iArr[i] = 0;
                i++;
            }
        }
    }

    MSOutlookKeyIdCalculator() {
    }

    static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded("DER");
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
