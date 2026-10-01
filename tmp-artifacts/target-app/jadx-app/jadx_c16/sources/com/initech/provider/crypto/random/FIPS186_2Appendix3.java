package com.initech.provider.crypto.random;

import com.initech.cryptox.KSXRuntimeException;
import com.initech.cryptox.SecureRandomSpi;
import com.initech.cryptox.Zeroizable;
import com.initech.provider.crypto.md.SHA1;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class FIPS186_2Appendix3 extends SecureRandomSpi implements Zeroizable {
    private static final long serialVersionUID = 1901299646485917488L;
    byte[] block;
    int blockRemaining;
    boolean isInit;
    byte[] previous_block;
    BigInteger q;
    byte[] xkey;
    byte[] xseed;
    XSeeder xseeder;

    public FIPS186_2Appendix3() {
        this(null);
    }

    public FIPS186_2Appendix3(XSeeder xSeeder) {
        this.xkey = new byte[20];
        this.xseed = new byte[20];
        this.block = new byte[20];
        this.blockRemaining = 0;
        this.previous_block = null;
        this.isInit = false;
        this.xseeder = xSeeder;
    }

    public void setQ(byte[] bArr) {
        this.q = new BigInteger(1, bArr);
    }

    public void setXKey(byte[] bArr) throws KSXRuntimeException {
        System.arraycopy(bArr, 0, this.xkey, 0, 20);
        this.previous_block = null;
        newblock();
        this.blockRemaining = 0;
        this.isInit = true;
    }

    private void setXSeed(byte[] bArr) {
        System.arraycopy(bArr, 0, bArr, 0, 20);
    }

    private static byte[] integers2bytes(int[] iArr) {
        byte[] bArr = new byte[iArr.length << 2];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < 4; i3++) {
                bArr[(i << 2) + i3] = (byte) (i2 >>> (24 - (i3 << 3)));
            }
        }
        return bArr;
    }

    private static int[] bytes2integers(byte[] bArr) {
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 2;
            iArr[i] = (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
        }
        return iArr;
    }

    public byte[] getPreviousBlock() {
        byte[] bArr = new byte[20];
        byte[] bArr2 = this.previous_block;
        if (bArr2 != null) {
            if (this.q == null) {
                System.arraycopy(bArr2, 0, bArr, 0, 20);
                return bArr;
            }
            byte[] byteArray = new BigInteger(1, this.previous_block).mod(this.q).toByteArray();
            for (int i = 0; i < 20 && i < byteArray.length; i++) {
                if ((byteArray.length - 1) - i >= 0) {
                    bArr[19 - i] = byteArray[(byteArray.length - 1) - i];
                } else {
                    bArr[19 - i] = 0;
                }
            }
            return bArr;
        }
        throw new RuntimeException("珥?湲고?? ???? ?몄????? ???듬????.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.cryptox.KSXRuntimeException */
    private void newblock() throws KSXRuntimeException {
        byte[] bArr = new byte[64];
        int[] iArr = {1732584193, -271733879, -1732584194, 271733878, -1009589776};
        XSeeder xSeeder = this.xseeder;
        if (xSeeder != null && this.isInit) {
            setXSeed(xSeeder.getXseed());
        }
        int i = 0;
        for (int i2 = 19; i2 >= 0; i2--) {
            byte b = this.xkey[i2];
            byte[] bArr2 = this.xseed;
            int i3 = i + (b & 255) + (bArr2[i2] & 255);
            bArr[i2] = (byte) i3;
            i = i3 >> 8;
            bArr2[i2] = 0;
        }
        for (int i4 = 20; i4 < 64; i4++) {
            bArr[i4] = 0;
        }
        new SHA1().processBlock(iArr, bytes2integers(bArr));
        this.block = integers2bytes(iArr);
        int i5 = 1;
        for (int i6 = 19; i6 >= 0; i6--) {
            byte[] bArr3 = this.xkey;
            int i7 = i5 + (bArr3[i6] & 255) + (this.block[i6] & 255);
            bArr3[i6] = (byte) i7;
            i5 = i7 >> 8;
        }
        byte[] bArr4 = this.previous_block;
        if (bArr4 == null) {
            this.previous_block = new byte[20];
        } else if (Arrays.equals(bArr4, this.block)) {
            throw new KSXRuntimeException("Continuous Random Number Generation Check failed");
        }
        System.arraycopy(this.block, 0, this.previous_block, 0, 20);
        this.blockRemaining = 20;
    }

    private void autoseed() throws KSXRuntimeException {
        byte[] bArr = new byte[64];
        try {
            new HashDRBG("SHA224").nextBytes(bArr);
            seed(bArr);
        } catch (Exception unused) {
            throw new RuntimeException("fail to generate salt");
        }
    }

    private void seed(byte[] bArr) throws KSXRuntimeException {
        byte[] bArrDigest = new SHA1().digest(bArr);
        this.xkey = bArrDigest;
        setXKey(bArrDigest);
    }

    public void nextBytes(byte[] bArr) throws KSXRuntimeException {
        if (!this.isInit) {
            autoseed();
        }
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            if (this.blockRemaining == 0) {
                newblock();
            }
            int i2 = this.blockRemaining;
            int i3 = i2 > length ? length : i2;
            System.arraycopy(this.block, 20 - i2, bArr, i, i3);
            i += i3;
            length -= i3;
            this.blockRemaining -= i3;
        }
    }

    public byte[] _engineGenerateSeed(int i) throws KSXRuntimeException {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    public void _engineNextBytes(byte[] bArr) throws KSXRuntimeException {
        nextBytes(bArr);
    }

    public void _engineSetSeed(byte[] bArr) throws KSXRuntimeException {
        setXKey(bArr);
    }

    public static void main(String[] strArr) throws KSXRuntimeException {
        new FIPS186_2Appendix3().nextBytes(new byte[20]);
    }

    public void zeroize() {
        int i = 0;
        while (true) {
            byte[] bArr = this.xkey;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.xseed;
            if (i2 >= bArr2.length) {
                return;
            }
            bArr2[i2] = 0;
            i2++;
        }
    }
}
