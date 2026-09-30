package com.bytedance.adsdk.zb.lud;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class kgy implements dc<com.bytedance.adsdk.zb.sya.zb.xkz> {
    public static final kgy ycx = new kgy();

    private kgy() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    @Override // com.bytedance.adsdk.zb.lud.dc
    /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.adsdk.zb.sya.zb.xkz zb(JsonReader jsonReader, float f) throws IOException {
        char c;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listYcx = null;
        List<PointF> listYcx2 = null;
        List<PointF> listYcx3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 99) {
                if (iHashCode != 105) {
                    if (iHashCode != 111) {
                        c = (iHashCode == 118 && strNextName.equals("v")) ? (char) 3 : (char) 65535;
                    } else if (strNextName.equals("o")) {
                        c = 2;
                    }
                } else if (strNextName.equals("i")) {
                    c = 1;
                }
            } else if (strNextName.equals("c")) {
                c = 0;
            }
            if (c == 0) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 1) {
                listYcx2 = uh.ycx(jsonReader, f);
            } else if (c == 2) {
                listYcx3 = uh.ycx(jsonReader, f);
            } else if (c == 3) {
                listYcx = uh.ycx(jsonReader, f);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (listYcx == null || listYcx2 == null || listYcx3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listYcx.isEmpty()) {
            return new com.bytedance.adsdk.zb.sya.zb.xkz(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listYcx.size();
        PointF pointF = listYcx.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 1; i2 < size; i2++) {
            PointF pointF2 = listYcx.get(i2);
            int i3 = i2 - 1;
            arrayList.add(new com.bytedance.adsdk.zb.sya.ycx(com.bytedance.adsdk.zb.lt.lud.ycx(listYcx.get(i3), listYcx3.get(i3)), com.bytedance.adsdk.zb.lt.lud.ycx(pointF2, listYcx2.get(i2)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = listYcx.get(0);
            int i4 = size - 1;
            arrayList.add(new com.bytedance.adsdk.zb.sya.ycx(com.bytedance.adsdk.zb.lt.lud.ycx(listYcx.get(i4), listYcx3.get(i4)), com.bytedance.adsdk.zb.lt.lud.ycx(pointF3, listYcx2.get(0)), pointF3));
        }
        return new com.bytedance.adsdk.zb.sya.zb.xkz(pointF, zNextBoolean, arrayList);
    }
}
