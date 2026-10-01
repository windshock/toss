package com.bytedance.adsdk.zb.lud;

import android.graphics.Path;
import android.util.JsonReader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Collections;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class dy {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.lud ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        com.bytedance.adsdk.zb.sya.ycx.dj djVarZb = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.zb.ul ulVar2 = null;
        com.bytedance.adsdk.zb.sya.ycx.sya syaVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.lt ltVarSya = null;
        com.bytedance.adsdk.zb.sya.ycx.lt ltVarSya2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            int iNextInt = -1;
            if (iHashCode != 101) {
                if (iHashCode != 103) {
                    if (iHashCode != 111) {
                        if (iHashCode != 3324) {
                            if (iHashCode != 3519) {
                                switch (iHashCode) {
                                    case 114:
                                        if (!strNextName.equals("r")) {
                                            c = 65535;
                                            break;
                                        } else {
                                            c = 3;
                                            break;
                                        }
                                    case 115:
                                        if (strNextName.equals("s")) {
                                            c = 4;
                                            break;
                                        }
                                        break;
                                    case 116:
                                        if (strNextName.equals("t")) {
                                            c = 5;
                                            break;
                                        }
                                        break;
                                }
                            } else if (strNextName.equals("nm")) {
                                c = 7;
                            }
                        } else if (strNextName.equals("hd")) {
                            c = 6;
                        }
                    } else if (strNextName.equals("o")) {
                        c = 2;
                    }
                } else if (strNextName.equals("g")) {
                    c = 1;
                }
            } else if (strNextName.equals("e")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    ltVarSya2 = dj.sya(jsonReader, ulVar);
                    break;
                case 1:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        if (strNextName2.equals("k")) {
                            syaVarYcx = dj.ycx(jsonReader, ulVar, iNextInt);
                        } else if (strNextName2.equals(TtmlNode.TAG_P)) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    djVarZb = dj.zb(jsonReader, ulVar);
                    break;
                case 3:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 4:
                    ltVarSya = dj.sya(jsonReader, ulVar);
                    break;
                case 5:
                    ulVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.zb.sya.zb.ul.LINEAR : com.bytedance.adsdk.zb.sya.zb.ul.RADIAL;
                    break;
                case 6:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 7:
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.lud(strNextString, ulVar2, fillType, syaVarYcx, djVarZb == null ? new com.bytedance.adsdk.zb.sya.ycx.dj(Collections.singletonList(new com.bytedance.adsdk.zb.ul.ycx(100))) : djVarZb, ltVarSya, ltVarSya2, null, null, zNextBoolean);
    }
}
