package com.bytedance.sdk.openadsdk.xkz.ycx.ycx;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.oty.sya;
import java.nio.charset.StandardCharsets;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    public static String ycx(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strEncodeToString = Base64.encodeToString(ycx(str.getBytes(StandardCharsets.UTF_8)), 0);
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(strEncodeToString);
        return sb.toString();
    }

    public static String zb(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new String(ycx(Base64.decode(str, 0)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PthqsYcKSfthSgA==", "X+suhxqsffSUWN5Tiw==", 64);
            return null;
        }
    }

    private static byte[] ycx(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        byte[] bytes = "PAGAdSDK".getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = (byte) (bArr[i2] ^ bytes[i2 % length]);
        }
        return bArr2;
    }
}
