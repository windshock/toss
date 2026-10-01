package com.bytedance.sdk.openadsdk.core.jc.zb;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oty.sya;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    public static long[] ycx(String str, long j) {
        long j2;
        long j3;
        if (str == null || str.isEmpty() || j <= 0) {
            return new long[]{0, j - 1};
        }
        Matcher matcher = Pattern.compile("bytes\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)", 2).matcher(str);
        if (!matcher.matches()) {
            return new long[]{0, j - 1};
        }
        try {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            boolean zIsEmpty = TextUtils.isEmpty(strGroup);
            boolean zIsEmpty2 = TextUtils.isEmpty(strGroup2);
            if (zIsEmpty || zIsEmpty2) {
                if (!zIsEmpty) {
                    j2 = Long.parseLong(strGroup);
                } else if (!zIsEmpty2) {
                    j2 = j - Long.parseLong(strGroup2);
                } else {
                    return new long[]{0, j - 1};
                }
                j3 = j - 1;
            } else {
                long j4 = Long.parseLong(strGroup);
                long j5 = Long.parseLong(strGroup2);
                j2 = j4;
                j3 = j5;
            }
            return ycx(j2, j3, j);
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "ae8jkgaUbMaET8VomBisOw==", "S+8/hgaOaMmHTw==", 56);
            return new long[]{0, j - 1};
        }
    }

    private static long[] ycx(long j, long j2, long j3) {
        if (j < 0) {
            j = 0;
        }
        if (j2 >= j3) {
            j2 = j3 - 1;
        }
        if (j > j2 || j >= j3) {
            return null;
        }
        return new long[]{j, j2};
    }
}
