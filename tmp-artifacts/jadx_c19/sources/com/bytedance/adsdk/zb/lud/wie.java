package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import com.bytedance.adsdk.zb.sya.zb.pmi;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class wie {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.lt ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        pmi.ycx ycxVar;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.zb.ul ulVar2 = null;
        com.bytedance.adsdk.zb.sya.ycx.sya syaVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.lt ltVarSya = null;
        com.bytedance.adsdk.zb.sya.ycx.lt ltVarSya2 = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        pmi.ycx ycxVar2 = null;
        pmi.zb zbVar = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar2 = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.zb.sya.ycx.dj djVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            boolean z = zNextBoolean;
            com.bytedance.adsdk.zb.sya.ycx.zb zbVar3 = zbVar2;
            float f = fNextDouble;
            pmi.zb zbVar4 = zbVar;
            if (iHashCode != 100) {
                if (iHashCode != 101) {
                    if (iHashCode != 103) {
                        if (iHashCode != 111) {
                            if (iHashCode != 119) {
                                if (iHashCode != 3324) {
                                    if (iHashCode != 3447) {
                                        if (iHashCode != 3454) {
                                            if (iHashCode != 3487) {
                                                if (iHashCode != 3519) {
                                                    if (iHashCode != 115) {
                                                        c = (iHashCode == 116 && strNextName.equals("t")) ? (char) 5 : (char) 65535;
                                                    } else if (strNextName.equals("s")) {
                                                        c = 4;
                                                    }
                                                } else if (strNextName.equals("nm")) {
                                                    c = 11;
                                                }
                                            } else if (strNextName.equals("ml")) {
                                                c = '\n';
                                            }
                                        } else if (strNextName.equals("lj")) {
                                            c = '\t';
                                        }
                                    } else if (strNextName.equals("lc")) {
                                        c = '\b';
                                    }
                                } else if (strNextName.equals("hd")) {
                                    c = 7;
                                }
                            } else if (strNextName.equals("w")) {
                                c = 6;
                            }
                        } else if (strNextName.equals("o")) {
                            c = 3;
                        }
                    } else if (strNextName.equals("g")) {
                        c = 2;
                    }
                } else if (strNextName.equals("e")) {
                    c = 1;
                }
            } else if (strNextName.equals("d")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            pmi.ycx ycxVar3 = ycxVar2;
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                zbVarYcx2 = dj.ycx(jsonReader, ulVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            ycxVar2 = ycxVar3;
                        }
                        pmi.ycx ycxVar4 = ycxVar2;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            zbVar3 = zbVarYcx2;
                        } else if (strNextString2.equals("d") || strNextString2.equals("g")) {
                            ulVar.ycx(true);
                            arrayList.add(zbVarYcx2);
                        }
                        ycxVar2 = ycxVar4;
                    }
                    ycxVar = ycxVar2;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    zbVar2 = zbVar3;
                    zNextBoolean = z;
                    fNextDouble = f;
                    ycxVar2 = ycxVar;
                    zbVar = zbVar4;
                    break;
                case 1:
                    ltVarSya2 = dj.sya(jsonReader, ulVar);
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (strNextName3.equals("k")) {
                            syaVarYcx = dj.ycx(jsonReader, ulVar, iNextInt);
                        } else if (strNextName3.equals(TtmlNode.TAG_P)) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                case 3:
                    djVar = dj.zb(jsonReader, ulVar);
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                case 4:
                    ltVarSya = dj.sya(jsonReader, ulVar);
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                case 5:
                    ulVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.zb.sya.zb.ul.LINEAR : com.bytedance.adsdk.zb.sya.zb.ul.RADIAL;
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                case 6:
                    zbVarYcx = dj.ycx(jsonReader, ulVar);
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                case '\b':
                    ycxVar2 = pmi.ycx.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                case '\t':
                    zbVar = pmi.zb.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    break;
                case '\n':
                    fNextDouble = (float) jsonReader.nextDouble();
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    zbVar = zbVar4;
                    break;
                case 11:
                    strNextString = jsonReader.nextString();
                    zNextBoolean = z;
                    zbVar2 = zbVar3;
                    fNextDouble = f;
                    zbVar = zbVar4;
                    break;
                default:
                    ycxVar = ycxVar2;
                    jsonReader.skipValue();
                    zbVar2 = zbVar3;
                    zNextBoolean = z;
                    fNextDouble = f;
                    ycxVar2 = ycxVar;
                    zbVar = zbVar4;
                    break;
            }
        }
        pmi.ycx ycxVar5 = ycxVar2;
        pmi.zb zbVar5 = zbVar;
        float f2 = fNextDouble;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar6 = zbVar2;
        boolean z2 = zNextBoolean;
        if (djVar == null) {
            djVar = new com.bytedance.adsdk.zb.sya.ycx.dj(Collections.singletonList(new com.bytedance.adsdk.zb.ul.ycx(100)));
        }
        return new com.bytedance.adsdk.zb.sya.zb.lt(strNextString, ulVar2, syaVarYcx, djVar, ltVarSya, ltVarSya2, zbVarYcx, ycxVar5, zbVar5, f2, arrayList, zbVar6, z2);
    }
}
