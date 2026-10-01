package com.bytedance.adsdk.zb.lud;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    public static com.bytedance.adsdk.zb.sya.ycx.lud ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(hf.ycx(jsonReader, ulVar));
            }
            jsonReader.endArray();
            thx.ycx(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.zb.ul.ycx(uh.zb(jsonReader, com.bytedance.adsdk.zb.lt.lt.ycx())));
        }
        return new com.bytedance.adsdk.zb.sya.ycx.lud(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> zb(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        jsonReader.beginObject();
        com.bytedance.adsdk.zb.sya.ycx.lud ludVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 107) {
                if (iHashCode != 120) {
                    c = (iHashCode == 121 && strNextName.equals("y")) ? (char) 2 : (char) 65535;
                } else if (strNextName.equals("x")) {
                    c = 1;
                }
            } else if (strNextName.equals("k")) {
                c = 0;
            }
            if (c == 0) {
                ludVarYcx = ycx(jsonReader, ulVar);
            } else {
                if (c != 1) {
                    if (c == 2) {
                        if (jsonReader.peek() == JsonToken.STRING) {
                            z = true;
                        } else {
                            zbVarYcx2 = dj.ycx(jsonReader, ulVar);
                        }
                    }
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    z = true;
                } else {
                    zbVarYcx = dj.ycx(jsonReader, ulVar);
                }
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (z) {
            ulVar.ycx("Lottie doesn't support expressions.");
        }
        return ludVarYcx != null ? ludVarYcx : new com.bytedance.adsdk.zb.sya.ycx.jw(zbVarYcx, zbVarYcx2);
    }
}
