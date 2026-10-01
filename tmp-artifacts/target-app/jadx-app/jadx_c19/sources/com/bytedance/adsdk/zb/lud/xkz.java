package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class xkz {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.sya ycx(JsonReader jsonReader) throws IOException {
        char c;
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName.hashCode()) {
                case -1866931350:
                    if (!strNextName.equals("fFamily")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1408684838:
                    if (strNextName.equals("ascent")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1294566165:
                    if (strNextName.equals("fStyle")) {
                        c = 2;
                        break;
                    }
                    break;
                case 96619537:
                    if (strNextName.equals("fName")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                strNextString = jsonReader.nextString();
            } else if (c == 1) {
                fNextDouble = (float) jsonReader.nextDouble();
            } else if (c == 2) {
                strNextString2 = jsonReader.nextString();
            } else if (c == 3) {
                strNextString3 = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.zb.sya.sya(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
