package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import com.alibaba.ariver.kernel.RVParams;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class fby {
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.zb.sya ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        com.bytedance.adsdk.zb.sya.zb.sya syaVarYcx;
        String strNextString;
        jsonReader.beginObject();
        char c = 2;
        int iNextInt = 2;
        while (true) {
            syaVarYcx = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            String strNextName = jsonReader.nextName();
            if (!strNextName.equals("d")) {
                if (strNextName.equals("ty")) {
                    strNextString = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        int iHashCode = strNextString.hashCode();
        if (iHashCode != 3239) {
            if (iHashCode != 3270) {
                if (iHashCode != 3295) {
                    if (iHashCode != 3488) {
                        if (iHashCode != 3646) {
                            if (iHashCode != 3669) {
                                if (iHashCode != 3679) {
                                    if (iHashCode != 3681) {
                                        if (iHashCode != 3705) {
                                            if (iHashCode != 3710) {
                                                if (iHashCode != 3307) {
                                                    if (iHashCode != 3308) {
                                                        if (iHashCode != 3633) {
                                                            c = (iHashCode == 3634 && strNextString.equals("rd")) ? (char) 7 : (char) 65535;
                                                        } else if (strNextString.equals("rc")) {
                                                            c = 6;
                                                        }
                                                    } else if (strNextString.equals("gs")) {
                                                        c = 4;
                                                    }
                                                } else if (strNextString.equals("gr")) {
                                                    c = 3;
                                                }
                                            } else if (strNextString.equals("tr")) {
                                                c = '\r';
                                            }
                                        } else if (strNextString.equals(RVParams.TOOLBAR_MENU)) {
                                            c = '\f';
                                        }
                                    } else if (strNextString.equals(RVParams.SHOW_TITLEBAR)) {
                                        c = 11;
                                    }
                                } else if (strNextString.equals(RVParams.SHOW_REPORT_BTN)) {
                                    c = '\n';
                                }
                            } else if (strNextString.equals("sh")) {
                                c = '\t';
                            }
                        } else if (strNextString.equals("rp")) {
                            c = '\b';
                        }
                    } else if (strNextString.equals("mm")) {
                        c = 5;
                    }
                } else if (!strNextString.equals("gf")) {
                }
            } else if (strNextString.equals("fl")) {
                c = 1;
            }
        } else if (strNextString.equals("el")) {
            c = 0;
        }
        switch (c) {
            case 0:
                syaVarYcx = lt.ycx(jsonReader, ulVar, iNextInt);
                break;
            case 1:
                syaVarYcx = ifb.ycx(jsonReader, ulVar);
                break;
            case 2:
                syaVarYcx = dy.ycx(jsonReader, ulVar);
                break;
            case 3:
                syaVarYcx = yzp.ycx(jsonReader, ulVar);
                break;
            case 4:
                syaVarYcx = wie.ycx(jsonReader, ulVar);
                break;
            case 5:
                syaVarYcx = oty.ycx(jsonReader);
                ulVar.ycx("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                syaVarYcx = rmf.ycx(jsonReader, ulVar);
                break;
            case 7:
                syaVarYcx = xz.ycx(jsonReader, ulVar);
                break;
            case '\b':
                syaVarYcx = aeu.ycx(jsonReader, ulVar);
                break;
            case '\t':
                syaVarYcx = dwi.ycx(jsonReader, ulVar);
                break;
            case '\n':
                syaVarYcx = av.ycx(jsonReader, ulVar, iNextInt);
                break;
            case 11:
                syaVarYcx = oby.ycx(jsonReader, ulVar);
                break;
            case '\f':
                syaVarYcx = nji.ycx(jsonReader, ulVar);
                break;
            case '\r':
                syaVarYcx = sya.ycx(jsonReader, ulVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return syaVarYcx;
    }
}
