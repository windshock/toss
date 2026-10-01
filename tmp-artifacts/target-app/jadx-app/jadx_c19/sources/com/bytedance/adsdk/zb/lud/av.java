package com.bytedance.adsdk.zb.lud;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.zb.sya.zb.jc;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class av {
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.jc ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar, int i2) throws IOException {
        char c;
        boolean zNextBoolean = false;
        boolean z = i2 == 3;
        String strNextString = null;
        jc.ycx ycxVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVarZb = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx2 = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx3 = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx4 = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx5 = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 100) {
                if (iHashCode != 112) {
                    if (iHashCode != 114) {
                        if (iHashCode != 3324) {
                            if (iHashCode != 3519) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 3686) {
                                        if (iHashCode != 3369) {
                                            if (iHashCode != 3370) {
                                                if (iHashCode != 3555) {
                                                    c = (iHashCode == 3556 && strNextName.equals("os")) ? '\b' : (char) 65535;
                                                } else if (strNextName.equals("or")) {
                                                    c = 7;
                                                }
                                            } else if (strNextName.equals("is")) {
                                                c = 5;
                                            }
                                        } else if (strNextName.equals("ir")) {
                                            c = 4;
                                        }
                                    } else if (strNextName.equals("sy")) {
                                        c = '\n';
                                    }
                                } else if (strNextName.equals("pt")) {
                                    c = '\t';
                                }
                            } else if (strNextName.equals("nm")) {
                                c = 6;
                            }
                        } else if (strNextName.equals("hd")) {
                            c = 3;
                        }
                    } else if (strNextName.equals("r")) {
                        c = 2;
                    }
                } else if (strNextName.equals(TtmlNode.TAG_P)) {
                    c = 1;
                }
            } else if (strNextName.equals("d")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 1:
                    ryVarZb = ycx.zb(jsonReader, ulVar);
                    break;
                case 2:
                    zbVarYcx2 = dj.ycx(jsonReader, ulVar, false);
                    break;
                case 3:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 4:
                    zbVarYcx3 = dj.ycx(jsonReader, ulVar);
                    break;
                case 5:
                    zbVarYcx5 = dj.ycx(jsonReader, ulVar, false);
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    break;
                case 7:
                    zbVarYcx4 = dj.ycx(jsonReader, ulVar);
                    break;
                case '\b':
                    zbVarYcx6 = dj.ycx(jsonReader, ulVar, false);
                    break;
                case '\t':
                    zbVarYcx = dj.ycx(jsonReader, ulVar, false);
                    break;
                case '\n':
                    ycxVarYcx = jc.ycx.ycx(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.jc(strNextString, ycxVarYcx, zbVarYcx, ryVarZb, zbVarYcx2, zbVarYcx3, zbVarYcx4, zbVarYcx5, zbVarYcx6, zNextBoolean, z);
    }
}
