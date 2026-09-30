package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class TRANS_VeriSign_ImportCert {
    static String onNavigationEvent(String str, int i, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            sb.append(str2);
            int i3 = i2 + i;
            if (i3 >= str.length()) {
                sb.append(str.substring(i2));
                if (z) {
                    sb.append(" )");
                }
            } else {
                sb.append((CharSequence) str, i2, i3);
                sb.append("\n");
            }
            i2 = i3;
        }
        return sb.toString();
    }
}
