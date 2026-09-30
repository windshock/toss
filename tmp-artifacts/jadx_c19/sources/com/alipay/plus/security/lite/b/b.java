package com.alipay.plus.security.lite.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class b {
    public static final String a = "b";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable, java.io.InputStreamReader, java.io.Reader] */
    public static String a(Context context, String str) throws Throwable {
        Throwable th;
        Exception e;
        BufferedReader bufferedReader;
        ?? assets = context.getAssets();
        Closeable closeable = null;
        try {
            try {
                assets = assets.open(str, 3);
            } catch (Throwable th2) {
                closeable = 3;
                th = th2;
            }
            try {
                str = new InputStreamReader(assets);
                try {
                    bufferedReader = new BufferedReader(str);
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                String string = sb.toString();
                                a(bufferedReader);
                                a(str);
                                a(assets);
                                return string;
                            }
                            sb.append(line);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        d.a(a, "ConfigResourceUtils readConfigFromAsset failed: " + e);
                        a(bufferedReader);
                        a(str);
                        a(assets);
                        return null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    a(closeable);
                    a(str);
                    a(assets);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                assets = assets;
                str = 0;
                bufferedReader = null;
                d.a(a, "ConfigResourceUtils readConfigFromAsset failed: " + e);
                a(bufferedReader);
                a(str);
                a(assets);
                return null;
            } catch (Throwable th4) {
                th = th4;
                assets = assets;
                str = 0;
                a(closeable);
                a(str);
                a(assets);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            assets = 0;
        } catch (Throwable th5) {
            th = th5;
            assets = 0;
        }
    }

    public static String b(Context context, String str) throws Throwable {
        byte[] bArrDecode;
        String strA = a(context, "iapconnect_config_full");
        if (!TextUtils.isEmpty(strA) && (bArrDecode = Base64.decode(strA.getBytes(Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME)), 0)) != null) {
            try {
                return new JSONObject(new String(bArrDecode)).optString(str, "");
            } catch (JSONException e) {
                d.a(a, "ConfigResourceUtils parse config failed: " + e);
            }
        }
        return null;
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                d.a(a, "ConfigResourceUtils readConfigFromAsset failed: " + e);
            }
        }
    }
}
