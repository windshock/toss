package kr.or.kisa.seed.pbkdf2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PBKDF2 {
    public native int pbkdf2(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4);

    static {
        System.loadLibrary("pbkdf2");
    }

    public int MD(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        return pbkdf2(bArr, i, bArr2, i2, i3, bArr3, i4);
    }
}
