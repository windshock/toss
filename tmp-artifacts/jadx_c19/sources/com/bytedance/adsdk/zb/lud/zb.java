package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import com.alibaba.ariver.kernel.RVParams;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    public static com.bytedance.adsdk.zb.sya.ycx.ea ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.zb.sya.ycx.ea eaVarZb = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("a")) {
                eaVarZb = zb(jsonReader, ulVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return eaVarZb == null ? new com.bytedance.adsdk.zb.sya.ycx.ea(null, null, null, null) : eaVarZb;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.bytedance.adsdk.zb.sya.ycx.ea zb(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        jsonReader.beginObject();
        com.bytedance.adsdk.zb.sya.ycx.ycx ycxVarUl = null;
        com.bytedance.adsdk.zb.sya.ycx.ycx ycxVarUl2 = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 116) {
                if (iHashCode != 3261) {
                    if (iHashCode != 3664) {
                        c = (iHashCode == 3684 && strNextName.equals("sw")) ? (char) 3 : (char) 65535;
                    } else if (strNextName.equals(RVParams.SAFEPAY_CONTEXT)) {
                        c = 2;
                    }
                } else if (strNextName.equals("fc")) {
                    c = 1;
                }
            } else if (strNextName.equals("t")) {
                c = 0;
            }
            if (c == 0) {
                zbVarYcx2 = dj.ycx(jsonReader, ulVar);
            } else if (c == 1) {
                ycxVarUl = dj.ul(jsonReader, ulVar);
            } else if (c == 2) {
                ycxVarUl2 = dj.ul(jsonReader, ulVar);
            } else if (c == 3) {
                zbVarYcx = dj.ycx(jsonReader, ulVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.zb.sya.ycx.ea(ycxVarUl, ycxVarUl2, zbVarYcx, zbVarYcx2);
    }
}
