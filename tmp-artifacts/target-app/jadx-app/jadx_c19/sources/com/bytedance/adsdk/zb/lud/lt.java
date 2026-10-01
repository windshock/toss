package com.bytedance.adsdk.zb.lud;

import android.graphics.PointF;
import android.util.JsonReader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class lt {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.zb ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar, int i2) throws IOException {
        char c;
        boolean z = i2 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVarZb = null;
        com.bytedance.adsdk.zb.sya.ycx.lt ltVarSya = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 100) {
                if (iHashCode != 112) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3324) {
                            c = (iHashCode == 3519 && strNextName.equals("nm")) ? (char) 4 : (char) 65535;
                        } else if (strNextName.equals("hd")) {
                            c = 3;
                        }
                    } else if (strNextName.equals("s")) {
                        c = 2;
                    }
                } else if (strNextName.equals(TtmlNode.TAG_P)) {
                    c = 1;
                }
            } else if (strNextName.equals("d")) {
                c = 0;
            }
            if (c == 0) {
                z = jsonReader.nextInt() == 3;
            } else if (c == 1) {
                ryVarZb = ycx.zb(jsonReader, ulVar);
            } else if (c == 2) {
                ltVarSya = dj.sya(jsonReader, ulVar);
            } else if (c == 3) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 4) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.zb(strNextString, ryVarZb, ltVarSya, z, zNextBoolean);
    }
}
