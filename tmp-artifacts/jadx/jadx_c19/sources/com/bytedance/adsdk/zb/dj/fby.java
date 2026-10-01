package com.bytedance.adsdk.zb.dj;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.zb.ok;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby {
    private final ul ycx;
    private final lt zb;

    public fby(ul ulVar, lt ltVar) {
        this.ycx = ulVar;
        this.zb = ltVar;
    }

    public ok<com.bytedance.adsdk.zb.ul> ycx(Context context, String str, String str2) {
        com.bytedance.adsdk.zb.ul ulVarZb = zb(context, str, str2);
        if (ulVarZb != null) {
            return new ok<>(ulVarZb);
        }
        return sya(context, str, str2);
    }

    private com.bytedance.adsdk.zb.ul zb(Context context, String str, String str2) {
        ul ulVar;
        Pair<sya, InputStream> pairYcx;
        ok<com.bytedance.adsdk.zb.ul> okVarZb;
        if (str2 == null || (ulVar = this.ycx) == null || (pairYcx = ulVar.ycx(str)) == null) {
            return null;
        }
        sya syaVar = (sya) pairYcx.first;
        InputStream inputStream = (InputStream) pairYcx.second;
        if (syaVar == sya.ZIP) {
            okVarZb = com.bytedance.adsdk.zb.fby.ycx(context, new ZipInputStream(inputStream), str2);
        } else {
            okVarZb = com.bytedance.adsdk.zb.fby.zb(inputStream, str2);
        }
        if (okVarZb.ycx() != null) {
            return okVarZb.ycx();
        }
        return null;
    }

    private ok<com.bytedance.adsdk.zb.ul> sya(Context context, String str, String str2) throws IOException {
        Closeable closeable = null;
        try {
            try {
                dj djVarYcx = this.zb.ycx(str);
                if (djVarYcx.ycx()) {
                    ok<com.bytedance.adsdk.zb.ul> okVarYcx = ycx(context, str, djVarYcx.zb(), djVarYcx.sya(), str2);
                    okVarYcx.ycx();
                    try {
                        djVarYcx.close();
                    } catch (IOException unused) {
                    }
                    return okVarYcx;
                }
                ok<com.bytedance.adsdk.zb.ul> okVar = new ok<>(new IllegalArgumentException(djVarYcx.dj()));
                try {
                    djVarYcx.close();
                } catch (IOException unused2) {
                }
                return okVar;
            } catch (Exception e) {
                ok<com.bytedance.adsdk.zb.ul> okVar2 = new ok<>(e);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return okVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private ok<com.bytedance.adsdk.zb.ul> ycx(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        ok<com.bytedance.adsdk.zb.ul> okVarYcx;
        sya syaVar;
        ul ulVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            sya syaVar2 = sya.ZIP;
            okVarYcx = ycx(context, str, inputStream, str3);
            syaVar = syaVar2;
        } else {
            syaVar = sya.JSON;
            okVarYcx = ycx(str, inputStream, str3);
        }
        if (str3 != null && okVarYcx.ycx() != null && (ulVar = this.ycx) != null) {
            ulVar.ycx(str, syaVar);
        }
        return okVarYcx;
    }

    private ok<com.bytedance.adsdk.zb.ul> ycx(Context context, String str, InputStream inputStream, String str2) throws IOException {
        ul ulVar;
        if (str2 == null || (ulVar = this.ycx) == null) {
            return com.bytedance.adsdk.zb.fby.ycx(context, new ZipInputStream(inputStream), (String) null);
        }
        return com.bytedance.adsdk.zb.fby.ycx(context, new ZipInputStream(new FileInputStream(ulVar.ycx(str, inputStream, sya.ZIP))), str);
    }

    private ok<com.bytedance.adsdk.zb.ul> ycx(String str, InputStream inputStream, String str2) throws IOException {
        ul ulVar;
        if (str2 == null || (ulVar = this.ycx) == null) {
            return com.bytedance.adsdk.zb.fby.zb(inputStream, (String) null);
        }
        return com.bytedance.adsdk.zb.fby.zb(new FileInputStream(ulVar.ycx(str, inputStream, sya.JSON).getAbsolutePath()), str);
    }
}
