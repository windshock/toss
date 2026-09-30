package com.bytedance.adsdk.zb.lud;

import android.graphics.PointF;
import android.util.JsonReader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class rmf {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.ea ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVarZb = null;
        com.bytedance.adsdk.zb.sya.ycx.lt ltVarSya = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 112) {
                if (iHashCode != 3324) {
                    if (iHashCode != 3519) {
                        if (iHashCode != 114) {
                            c = (iHashCode == 115 && strNextName.equals("s")) ? (char) 2 : (char) 65535;
                        } else if (strNextName.equals("r")) {
                            c = 1;
                        }
                    } else if (strNextName.equals("nm")) {
                        c = 4;
                    }
                } else if (strNextName.equals("hd")) {
                    c = 3;
                }
            } else if (strNextName.equals(TtmlNode.TAG_P)) {
                c = 0;
            }
            if (c == 0) {
                ryVarZb = ycx.zb(jsonReader, ulVar);
            } else if (c == 1) {
                zbVarYcx = dj.ycx(jsonReader, ulVar);
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
        return new com.bytedance.adsdk.zb.sya.zb.ea(strNextString, ryVarZb, ltVarSya, zbVarYcx, zNextBoolean);
    }
}
