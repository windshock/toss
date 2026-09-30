package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class thx {
    static <T> List<com.bytedance.adsdk.zb.ul.ycx<T>> ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar, float f, dc<T> dcVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            ulVar.ycx("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("k")) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(htf.ycx(jsonReader, ulVar, f, dcVar, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(htf.ycx(jsonReader, ulVar, f, dcVar, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(htf.ycx(jsonReader, ulVar, f, dcVar, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ycx(arrayList);
        return arrayList;
    }

    public static <T> void ycx(List<? extends com.bytedance.adsdk.zb.ul.ycx<T>> list) {
        int i2;
        T t;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            com.bytedance.adsdk.zb.ul.ycx<T> ycxVar = list.get(i3);
            i3++;
            com.bytedance.adsdk.zb.ul.ycx<T> ycxVar2 = list.get(i3);
            ycxVar.ul = Float.valueOf(ycxVar2.lt);
            if (ycxVar.zb == null && (t = ycxVar2.ycx) != null) {
                ycxVar.zb = t;
                if (ycxVar instanceof com.bytedance.adsdk.zb.ycx.zb.jw) {
                    ((com.bytedance.adsdk.zb.ycx.zb.jw) ycxVar).ycx();
                }
            }
        }
        com.bytedance.adsdk.zb.ul.ycx<T> ycxVar3 = list.get(i2);
        if ((ycxVar3.ycx == null || ycxVar3.zb == null) && list.size() > 1) {
            list.remove(ycxVar3);
        }
    }
}
