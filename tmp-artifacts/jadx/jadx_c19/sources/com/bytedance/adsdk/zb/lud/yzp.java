package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class yzp {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.dy ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 3324) {
                if (iHashCode != 3371) {
                    c = (iHashCode == 3519 && strNextName.equals("nm")) ? (char) 2 : (char) 65535;
                } else if (strNextName.equals("it")) {
                    c = 1;
                }
            } else if (strNextName.equals("hd")) {
                c = 0;
            }
            if (c == 0) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (c == 1) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.zb.sya.zb.sya syaVarYcx = fby.ycx(jsonReader, ulVar);
                    if (syaVarYcx != null) {
                        arrayList.add(syaVarYcx);
                    }
                }
                jsonReader.endArray();
            } else if (c == 2) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.dy(strNextString, arrayList, zNextBoolean);
    }
}
