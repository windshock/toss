package com.bytedance.adsdk.zb.lud;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ifb {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.syc ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        com.bytedance.adsdk.zb.sya.ycx.dj djVar = null;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.ycx.ycx ycxVarUl = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -396065730) {
                if (iHashCode != 99) {
                    if (iHashCode != 111) {
                        if (iHashCode != 114) {
                            if (iHashCode != 3324) {
                                c = (iHashCode == 3519 && strNextName.equals("nm")) ? (char) 5 : (char) 65535;
                            } else if (strNextName.equals("hd")) {
                                c = 4;
                            }
                        } else if (strNextName.equals("r")) {
                            c = 3;
                        }
                    } else if (strNextName.equals("o")) {
                        c = 2;
                    }
                } else if (strNextName.equals("c")) {
                    c = 1;
                }
            } else if (strNextName.equals("fillEnabled")) {
                c = 0;
            }
            if (c == 0) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 1) {
                ycxVarUl = dj.ul(jsonReader, ulVar);
            } else if (c == 2) {
                djVar = dj.zb(jsonReader, ulVar);
            } else if (c == 3) {
                iNextInt = jsonReader.nextInt();
            } else if (c == 4) {
                zNextBoolean2 = jsonReader.nextBoolean();
            } else if (c == 5) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        if (djVar == null) {
            djVar = new com.bytedance.adsdk.zb.sya.ycx.dj(Collections.singletonList(new com.bytedance.adsdk.zb.ul.ycx(100)));
        }
        return new com.bytedance.adsdk.zb.sya.zb.syc(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, ycxVarUl, djVar, zNextBoolean2);
    }
}
