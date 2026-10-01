package com.bytedance.adsdk.zb;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud {
    private static boolean dj = true;
    private static volatile com.bytedance.adsdk.zb.dj.fby ea = null;
    private static int fby = 0;
    private static com.bytedance.adsdk.zb.dj.lud jc = null;
    private static com.bytedance.adsdk.zb.dj.lt jw = null;
    private static long[] lt = null;
    private static String[] lud = null;
    private static volatile com.bytedance.adsdk.zb.dj.ul ok = null;
    private static boolean sya = true;
    private static int ul = 0;
    public static boolean ycx = false;
    private static boolean zb = false;

    public static void ycx(String str) {
        if (zb) {
            int i2 = ul;
            if (i2 == 20) {
                fby++;
                return;
            }
            lud[i2] = str;
            lt[i2] = System.nanoTime();
            Trace.beginSection(str);
            ul++;
        }
    }

    public static float zb(String str) {
        int i2 = fby;
        if (i2 > 0) {
            fby = i2 - 1;
            return 0.0f;
        }
        if (!zb) {
            return 0.0f;
        }
        int i3 = ul - 1;
        ul = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(lud[i3])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + lud[ul] + ".");
        }
        Trace.endSection();
        return (System.nanoTime() - lt[ul]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.zb.dj.fby ycx(Context context) {
        com.bytedance.adsdk.zb.dj.fby fbyVar;
        com.bytedance.adsdk.zb.dj.fby fbyVar2 = ea;
        if (fbyVar2 != null) {
            return fbyVar2;
        }
        synchronized (com.bytedance.adsdk.zb.dj.fby.class) {
            fbyVar = ea;
            if (fbyVar == null) {
                com.bytedance.adsdk.zb.dj.ul ulVarZb = zb(context);
                com.bytedance.adsdk.zb.dj.lt zbVar = jw;
                if (zbVar == null) {
                    zbVar = new com.bytedance.adsdk.zb.dj.zb();
                }
                fbyVar = new com.bytedance.adsdk.zb.dj.fby(ulVarZb, zbVar);
                ea = fbyVar;
            }
        }
        return fbyVar;
    }

    public static com.bytedance.adsdk.zb.dj.ul zb(Context context) {
        com.bytedance.adsdk.zb.dj.ul ulVar;
        if (!sya) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.zb.dj.ul ulVar2 = ok;
        if (ulVar2 != null) {
            return ulVar2;
        }
        synchronized (com.bytedance.adsdk.zb.dj.ul.class) {
            ulVar = ok;
            if (ulVar == null) {
                com.bytedance.adsdk.zb.dj.lud ludVar = jc;
                if (ludVar == null) {
                    ludVar = new com.bytedance.adsdk.zb.dj.lud() { // from class: com.bytedance.adsdk.zb.lud.1
                        @Override // com.bytedance.adsdk.zb.dj.lud
                        public File ycx() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                ulVar = new com.bytedance.adsdk.zb.dj.ul(ludVar);
                ok = ulVar;
            }
        }
        return ulVar;
    }

    public static boolean ycx() {
        return dj;
    }
}
