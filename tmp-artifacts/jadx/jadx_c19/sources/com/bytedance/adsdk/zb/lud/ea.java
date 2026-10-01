package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ea {
    private com.bytedance.adsdk.zb.sya.ycx.zb dj;
    private com.bytedance.adsdk.zb.sya.ycx.zb lud;
    private com.bytedance.adsdk.zb.sya.ycx.zb sya;
    private com.bytedance.adsdk.zb.sya.ycx.ycx ycx;
    private com.bytedance.adsdk.zb.sya.ycx.zb zb;

    jc ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar2;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar3;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar4;
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    zb(jsonReader, ulVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.zb.sya.ycx.ycx ycxVar = this.ycx;
        if (ycxVar == null || (zbVar = this.zb) == null || (zbVar2 = this.sya) == null || (zbVar3 = this.dj) == null || (zbVar4 = this.lud) == null) {
            return null;
        }
        return new jc(ycxVar, zbVar, zbVar2, zbVar3, zbVar4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zb(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("v")) {
                switch (strNextString.hashCode()) {
                    case 353103893:
                        if (!strNextString.equals("Distance")) {
                            c = 65535;
                            break;
                        } else {
                            c = 0;
                            break;
                        }
                    case 397447147:
                        if (strNextString.equals("Opacity")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1041377119:
                        if (strNextString.equals("Direction")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1379387491:
                        if (strNextString.equals("Shadow Color")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1383710113:
                        if (strNextString.equals("Softness")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    this.dj = dj.ycx(jsonReader, ulVar);
                } else if (c == 1) {
                    this.zb = dj.ycx(jsonReader, ulVar, false);
                } else if (c == 2) {
                    this.sya = dj.ycx(jsonReader, ulVar, false);
                } else if (c == 3) {
                    this.ycx = dj.ul(jsonReader, ulVar);
                } else if (c == 4) {
                    this.lud = dj.ycx(jsonReader, ulVar);
                } else {
                    jsonReader.skipValue();
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
