package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UST_TRANS_GenerateCertNum {
    private static final char[] onWarmupCompleted = "0123456789ABCDEF".toCharArray();

    public static String onWarmupCompleted(String str, byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append("b");
        if (str != null) {
            sb.append(" (");
            sb.append(str);
            sb.append(")");
        }
        sb.append(':');
        int length = (sb.toString().length() + 8) & (-8);
        sb.append('\t');
        int i3 = (80 - length) / 3;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 != 0 && i4 % i3 == 0) {
                sb.append('\n');
                for (int i5 = 0; i5 < length / 8; i5++) {
                    sb.append('\t');
                }
            }
            byte b = bArr[i4 + i];
            char[] cArr = onWarmupCompleted;
            sb.append(cArr[(b & 255) >> 4]);
            sb.append(cArr[b & 15]);
            sb.append(' ');
        }
        sb.append('\n');
        return sb.toString();
    }

    public static String onNavigationEvent(String str, byte[] bArr) {
        return onWarmupCompleted(str, bArr, 0, bArr.length);
    }
}
