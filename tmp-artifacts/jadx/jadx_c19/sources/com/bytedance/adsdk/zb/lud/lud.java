package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class lud {
    static com.bytedance.adsdk.zb.sya.zb.ycx ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        com.bytedance.adsdk.zb.sya.zb.ycx ycxVar = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.zb.sya.zb.ycx ycxVarZb = zb(jsonReader, ulVar);
                    if (ycxVarZb != null) {
                        ycxVar = ycxVarZb;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return ycxVar;
    }

    private static com.bytedance.adsdk.zb.sya.zb.ycx zb(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.zb.sya.zb.ycx ycxVar = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (strNextName.equals("v")) {
                    if (z) {
                        ycxVar = new com.bytedance.adsdk.zb.sya.zb.ycx(dj.ycx(jsonReader, ulVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("ty")) {
                    if (jsonReader.nextInt() == 0) {
                        z = true;
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return ycxVar;
        }
    }
}
