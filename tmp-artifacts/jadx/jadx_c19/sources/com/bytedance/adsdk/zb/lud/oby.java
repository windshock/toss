package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import com.bytedance.adsdk.zb.sya.zb.pmi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class oby {
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.pmi ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        char c2;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        com.bytedance.adsdk.zb.sya.ycx.dj djVar = null;
        String strNextString = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar = null;
        com.bytedance.adsdk.zb.sya.ycx.ycx ycxVarUl = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        pmi.ycx ycxVar = null;
        pmi.zb zbVar2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            int i2 = 1;
            if (iHashCode != 99) {
                if (iHashCode != 100) {
                    if (iHashCode != 111) {
                        if (iHashCode != 119) {
                            if (iHashCode != 3324) {
                                if (iHashCode != 3447) {
                                    if (iHashCode != 3454) {
                                        if (iHashCode != 3487) {
                                            c = (iHashCode == 3519 && strNextName.equals("nm")) ? '\b' : (char) 65535;
                                        } else if (strNextName.equals("ml")) {
                                            c = 7;
                                        }
                                    } else if (strNextName.equals("lj")) {
                                        c = 6;
                                    }
                                } else if (strNextName.equals("lc")) {
                                    c = 5;
                                }
                            } else if (strNextName.equals("hd")) {
                                c = 4;
                            }
                        } else if (strNextName.equals("w")) {
                            c = 3;
                        }
                    } else if (strNextName.equals("o")) {
                        c = 2;
                    }
                } else if (strNextName.equals("d")) {
                    c = 1;
                }
            } else if (strNextName.equals("c")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    ycxVarUl = dj.ul(jsonReader, ulVar);
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                zbVarYcx2 = dj.ycx(jsonReader, ulVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        int iHashCode2 = strNextString2.hashCode();
                        if (iHashCode2 != 100) {
                            if (iHashCode2 != 103) {
                                c2 = (iHashCode2 == 111 && strNextString2.equals("o")) ? (char) 2 : (char) 65535;
                            } else if (strNextString2.equals("g")) {
                                c2 = 1;
                            }
                        } else if (strNextString2.equals("d")) {
                            c2 = 0;
                        }
                        i2 = 1;
                        if (c2 == 0 || c2 == 1) {
                            ulVar.ycx(true);
                            arrayList.add(zbVarYcx2);
                        } else if (c2 == 2) {
                            zbVar = zbVarYcx2;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != i2) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                case 2:
                    djVar = dj.zb(jsonReader, ulVar);
                    break;
                case 3:
                    zbVarYcx = dj.ycx(jsonReader, ulVar);
                    break;
                case 4:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 5:
                    ycxVar = pmi.ycx.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    zbVar2 = pmi.zb.values()[jsonReader.nextInt() - 1];
                    break;
                case 7:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case '\b':
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (djVar == null) {
            djVar = new com.bytedance.adsdk.zb.sya.ycx.dj(Collections.singletonList(new com.bytedance.adsdk.zb.ul.ycx(100)));
        }
        return new com.bytedance.adsdk.zb.sya.zb.pmi(strNextString, zbVar, arrayList, ycxVarUl, djVar, zbVarYcx, ycxVar, zbVar2, fNextDouble, zNextBoolean);
    }
}
