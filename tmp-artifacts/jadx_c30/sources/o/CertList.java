package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class CertList {
    public static int onNavigationEvent(byte[] bArr, byte[] bArr2) {
        int length;
        int length2;
        if (bArr.length != bArr2.length) {
            length = bArr.length;
            length2 = bArr2.length;
        } else {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    length = b & 255;
                    length2 = b2 & 255;
                }
            }
            return 0;
        }
        return length - length2;
    }
}
