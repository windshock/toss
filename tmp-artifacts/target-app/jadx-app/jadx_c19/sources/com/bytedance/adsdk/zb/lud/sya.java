package com.bytedance.adsdk.zb.lud;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya {
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.bytedance.adsdk.zb.sya.ycx.ok ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        char c;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar = null;
        com.bytedance.adsdk.zb.sya.ycx.lud ludVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVarZb = null;
        com.bytedance.adsdk.zb.sya.ycx.ul ulVarDj = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx2 = null;
        com.bytedance.adsdk.zb.sya.ycx.dj djVarZb = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx3 = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 97) {
                if (iHashCode != 3242) {
                    if (iHashCode != 3656) {
                        if (iHashCode != 3662) {
                            if (iHashCode != 3672) {
                                if (iHashCode != 3676) {
                                    if (iHashCode != 111) {
                                        if (iHashCode != 112) {
                                            if (iHashCode != 114) {
                                                c = (iHashCode == 115 && strNextName.equals("s")) ? (char) 4 : (char) 65535;
                                            } else if (strNextName.equals("r")) {
                                                c = 3;
                                            }
                                        } else if (strNextName.equals(TtmlNode.TAG_P)) {
                                            c = 2;
                                        }
                                    } else if (strNextName.equals("o")) {
                                        c = 1;
                                    }
                                } else if (strNextName.equals(RVParams.SHOW_OPTION_MENU)) {
                                    c = '\t';
                                }
                            } else if (strNextName.equals("sk")) {
                                c = '\b';
                            }
                        } else if (strNextName.equals("sa")) {
                            c = 7;
                        }
                    } else if (strNextName.equals("rz")) {
                        c = 6;
                    }
                } else if (strNextName.equals("eo")) {
                    c = 5;
                }
            } else if (strNextName.equals("a")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("k")) {
                            ludVarYcx = ycx.ycx(jsonReader, ulVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case 1:
                    djVarZb = dj.zb(jsonReader, ulVar);
                    continue;
                case 2:
                    ryVarZb = ycx.zb(jsonReader, ulVar);
                    continue;
                case 3:
                    break;
                case 4:
                    ulVarDj = dj.dj(jsonReader, ulVar);
                    continue;
                case 5:
                    zbVarYcx4 = dj.ycx(jsonReader, ulVar, false);
                    continue;
                case 6:
                    ulVar.ycx("Lottie doesn't support 3D layers.");
                    break;
                case 7:
                    zbVarYcx2 = dj.ycx(jsonReader, ulVar, false);
                    continue;
                case '\b':
                    zbVarYcx = dj.ycx(jsonReader, ulVar, false);
                    continue;
                case '\t':
                    zbVarYcx3 = dj.ycx(jsonReader, ulVar, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx5 = dj.ycx(jsonReader, ulVar, false);
            if (zbVarYcx5.sya().isEmpty()) {
                zbVarYcx5.sya().add(new com.bytedance.adsdk.zb.ul.ycx(ulVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(ulVar.ul())));
            } else if (((com.bytedance.adsdk.zb.ul.ycx) zbVarYcx5.sya().get(0)).ycx == 0) {
                zbVarYcx5.sya().set(0, new com.bytedance.adsdk.zb.ul.ycx(ulVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(ulVar.ul())));
            }
            zbVar = zbVarYcx5;
        }
        if (z) {
            jsonReader.endObject();
        }
        if (ycx(ludVarYcx)) {
            ludVarYcx = null;
        }
        return new com.bytedance.adsdk.zb.sya.ycx.ok(ludVarYcx, ycx(ryVarZb) ? null : ryVarZb, ycx(ulVarDj) ? null : ulVarDj, ycx(zbVar) ? null : zbVar, djVarZb, zbVarYcx3, zbVarYcx4, zb(zbVarYcx) ? null : zbVarYcx, sya(zbVarYcx2) ? null : zbVarYcx2);
    }

    private static boolean ycx(com.bytedance.adsdk.zb.sya.ycx.lud ludVar) {
        if (ludVar != null) {
            return ludVar.zb() && ludVar.sya().get(0).ycx.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean ycx(com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVar) {
        if (ryVar != null) {
            return !(ryVar instanceof com.bytedance.adsdk.zb.sya.ycx.jw) && ryVar.zb() && ryVar.sya().get(0).ycx.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean ycx(com.bytedance.adsdk.zb.sya.ycx.zb zbVar) {
        if (zbVar != null) {
            return zbVar.zb() && ((Float) ((com.bytedance.adsdk.zb.ul.ycx) zbVar.sya().get(0)).ycx).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean ycx(com.bytedance.adsdk.zb.sya.ycx.ul ulVar) {
        if (ulVar != null) {
            return ulVar.zb() && ((com.bytedance.adsdk.zb.ul.sya) ((com.bytedance.adsdk.zb.ul.ycx) ulVar.sya().get(0)).ycx).zb(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zb(com.bytedance.adsdk.zb.sya.ycx.zb zbVar) {
        if (zbVar != null) {
            return zbVar.zb() && ((Float) ((com.bytedance.adsdk.zb.ul.ycx) zbVar.sya().get(0)).ycx).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean sya(com.bytedance.adsdk.zb.sya.ycx.zb zbVar) {
        if (zbVar != null) {
            return zbVar.zb() && ((Float) ((com.bytedance.adsdk.zb.ul.ycx) zbVar.sya().get(0)).ycx).floatValue() == 0.0f;
        }
        return true;
    }
}
