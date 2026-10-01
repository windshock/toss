package o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setPreferredBitmapConfig {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNavigationEvent(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        int length2 = string.length();
        if (length2 == 10) {
            String strSubstring = string.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
            String strSubstring2 = string.substring(3, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, BuildConfig.FLAVOR);
            String strSubstring3 = string.substring(6, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, BuildConfig.FLAVOR);
            return strSubstring + " " + strSubstring2 + " " + strSubstring3;
        }
        if (length2 != 11) {
            return str;
        }
        String strSubstring4 = string.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, BuildConfig.FLAVOR);
        String strSubstring5 = string.substring(3, 7);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, BuildConfig.FLAVOR);
        String strSubstring6 = string.substring(7, 11);
        Intrinsics.checkNotNullExpressionValue(strSubstring6, BuildConfig.FLAVOR);
        return strSubstring4 + " " + strSubstring5 + " " + strSubstring6;
    }
}
