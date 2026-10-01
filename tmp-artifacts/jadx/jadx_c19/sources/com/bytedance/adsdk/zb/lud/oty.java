package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import com.bytedance.adsdk.zb.sya.zb.jw;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class oty {
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.jw ycx(JsonReader jsonReader) throws IOException {
        char c;
        String strNextString = null;
        jw.ycx ycxVarYcx = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 3324) {
                if (iHashCode != 3488) {
                    c = (iHashCode == 3519 && strNextName.equals("nm")) ? (char) 2 : (char) 65535;
                } else if (strNextName.equals("mm")) {
                    c = 1;
                }
            } else if (strNextName.equals("hd")) {
                c = 0;
            }
            if (c == 0) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 1) {
                ycxVarYcx = jw.ycx.ycx(jsonReader.nextInt());
            } else if (c == 2) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.jw(strNextString, ycxVarYcx, zNextBoolean);
    }
}
