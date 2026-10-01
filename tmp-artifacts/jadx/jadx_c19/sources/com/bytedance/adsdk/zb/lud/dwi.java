package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class dwi {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.wie ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.ycx.fby fbyVarLud = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 3324) {
                if (iHashCode != 3432) {
                    if (iHashCode != 3519) {
                        c = (iHashCode == 104415 && strNextName.equals("ind")) ? (char) 3 : (char) 65535;
                    } else if (strNextName.equals("nm")) {
                        c = 2;
                    }
                } else if (strNextName.equals("ks")) {
                    c = 1;
                }
            } else if (strNextName.equals("hd")) {
                c = 0;
            }
            if (c == 0) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 1) {
                fbyVarLud = dj.lud(jsonReader, ulVar);
            } else if (c == 2) {
                strNextString = jsonReader.nextString();
            } else if (c == 3) {
                iNextInt = jsonReader.nextInt();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.wie(strNextString, iNextInt, fbyVarLud, zNextBoolean);
    }
}
