package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class xz {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.ry ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 114) {
                if (iHashCode != 3324) {
                    c = (iHashCode == 3519 && strNextName.equals("nm")) ? (char) 2 : (char) 65535;
                } else if (strNextName.equals("hd")) {
                    c = 1;
                }
            } else if (strNextName.equals("r")) {
                c = 0;
            }
            if (c == 0) {
                zbVarYcx = dj.ycx(jsonReader, ulVar, true);
            } else if (c == 1) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 2) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.zb.sya.zb.ry(strNextString, zbVarYcx);
    }
}
