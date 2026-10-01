package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import com.bytedance.adsdk.zb.sya.zb.uh;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class nji {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.uh ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        String strNextString = null;
        uh.ycx ycxVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx2 = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 101) {
                if (iHashCode != 109) {
                    if (iHashCode != 111) {
                        if (iHashCode != 115) {
                            if (iHashCode != 3324) {
                                c = (iHashCode == 3519 && strNextName.equals("nm")) ? (char) 5 : (char) 65535;
                            } else if (strNextName.equals("hd")) {
                                c = 4;
                            }
                        } else if (strNextName.equals("s")) {
                            c = 3;
                        }
                    } else if (strNextName.equals("o")) {
                        c = 2;
                    }
                } else if (strNextName.equals("m")) {
                    c = 1;
                }
            } else if (strNextName.equals("e")) {
                c = 0;
            }
            if (c == 0) {
                zbVarYcx2 = dj.ycx(jsonReader, ulVar, false);
            } else if (c == 1) {
                ycxVarYcx = uh.ycx.ycx(jsonReader.nextInt());
            } else if (c == 2) {
                zbVarYcx3 = dj.ycx(jsonReader, ulVar, false);
            } else if (c == 3) {
                zbVarYcx = dj.ycx(jsonReader, ulVar, false);
            } else if (c == 4) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 5) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.uh(strNextString, ycxVarYcx, zbVarYcx, zbVarYcx2, zbVarYcx3, zNextBoolean);
    }
}
