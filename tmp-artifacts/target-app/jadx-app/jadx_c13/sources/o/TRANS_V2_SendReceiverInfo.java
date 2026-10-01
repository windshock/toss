package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TRANS_V2_SendReceiverInfo {
    public static String onExtraCallback(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (byte b : bArr) {
            short s = (short) (b & 255);
            sb.append("0123456789ABCDEF".charAt((byte) (s >> 4)));
            sb.append("0123456789ABCDEF".charAt((byte) (s & 15)));
        }
        return sb.toString();
    }

    public static String onExtraCallbackWithResult(byte[] bArr, int i, String str, boolean z) {
        return TRANS_VeriSign_ImportCert.onNavigationEvent(onExtraCallback(bArr), i, str, z);
    }
}
