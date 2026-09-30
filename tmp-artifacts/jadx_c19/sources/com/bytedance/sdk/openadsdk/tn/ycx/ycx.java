package com.bytedance.sdk.openadsdk.tn.ycx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.openadsdk.dv.lud;
import com.bytedance.sdk.openadsdk.oty.sya;
import com.bytedance.sdk.openadsdk.tn.dy;
import com.bytedance.sdk.openadsdk.tn.fby;
import com.bytedance.sdk.openadsdk.tn.lt;
import com.bytedance.sdk.openadsdk.tn.zb;
import com.bytedance.sdk.openadsdk.utils.yzp;
import java.util.Hashtable;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private static Boolean ycx;

    public static void ycx(Context context, View view, String str) {
        if (!ycx() || view == null || TextUtils.isEmpty(str)) {
            return;
        }
        yzp.sya(new 1("add_qr_code", str, view, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap sya(String str) {
        int color;
        int color2;
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(lt.zb, HexStringUtil.DEFAULT_CHARSET_NAME);
            hashtable.put(lt.ycx, fby.ycx);
            hashtable.put(lt.sya, 1);
            int iYcx = ((ycx(str.getBytes(HexStringUtil.DEFAULT_CHARSET_NAME).length) - 1) << 2) + 22;
            int i2 = iYcx > 60 ? 60 : iYcx;
            zb zbVarYcx = new dy().ycx(str, i2, i2, hashtable);
            int[] iArr = new int[i2 * i2];
            JSONObject jSONObject = (JSONObject) lud.ycx("water_mark_config", (Object) null, com.bytedance.sdk.openadsdk.dv.zb.ycx);
            if (jSONObject != null) {
                color = Color.parseColor(jSONObject.optString("fg_color", "#FF000000"));
                color2 = Color.parseColor(jSONObject.optString("bg_color", "#FFFFFFFF"));
            } else {
                color = -16777216;
                color2 = -1;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    iArr[(i3 * i2) + i4] = zbVarYcx.ycx(i4, i3) ? color : color2;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i2);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf62OAF7Vl1A==", "atwOmge5TsKOT8VcmBSVPFLiPg==", "XOsjkBG9fcKxePRSiBQ=", 133);
            htf.sya("QRCodeGenerateUtils", "generateQRCode error: " + th.getMessage());
            return null;
        }
    }

    private static int ycx(int i2) {
        int[] iArr = {17, 32, 53, 78, 106, 134, 154, 192, 230, 271, 321, 367, 425, 458, 520, 586, 644, 718, 792, 858, 929, 1003, 1091, 1171, 1273, 1367, 1465, 1528, 1628, 1732, 1840, 1952, 2068, 2188, 2303, 2431, 2563, 2699, 2809, 2953};
        int i3 = 0;
        while (i3 < 40) {
            int i4 = iArr[i3];
            i3++;
            if (i4 >= i2) {
                return i3;
            }
        }
        return 40;
    }

    public static String ycx(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.xkz.ycx.ycx.ycx.ycx(str, "");
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf62OAF7Vl1A==", "atwOmge5TsKOT8VcmBSVPFLiPg==", "XOs5sA2/e96QXuVYnQSlO0/HKQ==", 164);
            htf.sya("QRCodeGenerateUtils", "getEncryptRequestId error: " + th.getMessage());
            return null;
        }
    }

    public static boolean ycx() {
        if (ycx == null) {
            JSONObject jSONObject = (JSONObject) lud.ycx("water_mark_config", (Object) null, com.bytedance.sdk.openadsdk.dv.zb.ycx);
            if (jSONObject == null) {
                return false;
            }
            ycx = Boolean.valueOf(jSONObject.optInt("enable", 0) == 1);
        }
        return ycx.booleanValue();
    }

    public static int zb() {
        JSONObject jSONObject = (JSONObject) lud.ycx("water_mark_config", (Object) null, com.bytedance.sdk.openadsdk.dv.zb.ycx);
        if (jSONObject == null) {
            return 10;
        }
        return jSONObject.optInt("upload_count", 10);
    }
}
