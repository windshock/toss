package com.iap.android.mppclient.container.utils;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ResourceUtils {
    private static final String TAG = "ResourceUtils";

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[EXC_TOP_SPLITTER, PHI: r0 r3
      0x0031: PHI (r0v2 java.lang.String) = (r0v0 java.lang.String), (r0v5 java.lang.String) binds: [B:11:0x002f, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r3v3 java.io.InputStream) = (r3v2 java.io.InputStream), (r3v4 java.io.InputStream) binds: [B:11:0x002f, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String readRawFromResource(int i, Resources resources) {
        InputStream inputStreamOpenRawResource;
        String string = null;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
        } catch (Throwable unused) {
            inputStreamOpenRawResource = null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
            StringBuilder sb = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
                sb.append('\n');
            }
            string = sb.toString();
        } catch (Throwable unused2) {
            if (inputStreamOpenRawResource != null) {
            }
            return string;
        }
        if (inputStreamOpenRawResource != null) {
            try {
                inputStreamOpenRawResource.close();
            } catch (Throwable unused3) {
            }
        }
        return string;
    }
}
