package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class aeu {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.ok ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx2 = null;
        com.bytedance.adsdk.zb.sya.ycx.ok okVarYcx = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 99) {
                if (iHashCode != 111) {
                    if (iHashCode != 3324) {
                        if (iHashCode != 3519) {
                            c = (iHashCode == 3710 && strNextName.equals("tr")) ? (char) 4 : (char) 65535;
                        } else if (strNextName.equals("nm")) {
                            c = 3;
                        }
                    } else if (strNextName.equals("hd")) {
                        c = 2;
                    }
                } else if (strNextName.equals("o")) {
                    c = 1;
                }
            } else if (strNextName.equals("c")) {
                c = 0;
            }
            if (c == 0) {
                zbVarYcx = dj.ycx(jsonReader, ulVar, false);
            } else if (c == 1) {
                zbVarYcx2 = dj.ycx(jsonReader, ulVar, false);
            } else if (c == 2) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 3) {
                strNextString = jsonReader.nextString();
            } else if (c == 4) {
                okVarYcx = sya.ycx(jsonReader, ulVar);
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.ok(strNextString, zbVarYcx, zbVarYcx2, okVarYcx, zNextBoolean);
    }
}
