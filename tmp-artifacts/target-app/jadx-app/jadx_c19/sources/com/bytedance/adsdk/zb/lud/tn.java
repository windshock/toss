package com.bytedance.adsdk.zb.lud;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.alibaba.ariver.kernel.RVParams;
import com.bytedance.adsdk.zb.jc;
import com.bytedance.adsdk.zb.sya.sya.lud;
import com.bytedance.adsdk.zb.ul;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class tn {
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129 A[PHI: r21
      0x0129: PHI (r21v18 int) = 
      (r21v2 int)
      (r21v3 int)
      (r21v4 int)
      (r21v5 int)
      (r21v6 int)
      (r21v7 int)
      (r21v8 int)
      (r21v9 int)
      (r21v10 int)
      (r21v11 int)
      (r21v12 int)
      (r21v13 int)
      (r21v14 int)
      (r21v15 int)
      (r21v16 int)
      (r21v19 int)
     binds: [B:51:0x0125, B:48:0x0118, B:45:0x010b, B:42:0x00ff, B:39:0x00f3, B:36:0x00e7, B:33:0x00db, B:30:0x00cf, B:27:0x00c1, B:24:0x00b3, B:21:0x00a5, B:18:0x0097, B:15:0x0089, B:12:0x007b, B:9:0x006d, B:7:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.bytedance.adsdk.zb.ul ycx(JsonReader jsonReader) throws JSONException, IOException {
        int i2;
        char c;
        float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx();
        LongSparseArray<com.bytedance.adsdk.zb.sya.sya.lud> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.zb.sya.dj> sparseArray = new SparseArray<>();
        ul.sya syaVar = new ul.sya();
        ul.ycx ycxVar = new ul.ycx();
        ul.zb zbVar = new ul.zb();
        com.bytedance.adsdk.zb.ul ulVar = new com.bytedance.adsdk.zb.ul();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName.hashCode()) {
                case -1408207997:
                    i2 = iNextInt2;
                    if (!strNextName.equals("assets")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1109732030:
                    i2 = iNextInt2;
                    if (strNextName.equals("layers")) {
                        c = 1;
                        break;
                    }
                    break;
                case -865448777:
                    i2 = iNextInt2;
                    if (strNextName.equals("globalEvent")) {
                        c = 2;
                        break;
                    }
                    break;
                case 104:
                    i2 = iNextInt2;
                    if (strNextName.equals("h")) {
                        c = 3;
                        break;
                    }
                    break;
                case 118:
                    i2 = iNextInt2;
                    if (strNextName.equals("v")) {
                        c = 4;
                        break;
                    }
                    break;
                case 119:
                    i2 = iNextInt2;
                    if (strNextName.equals("w")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3208:
                    i2 = iNextInt2;
                    if (strNextName.equals("dl")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3276:
                    i2 = iNextInt2;
                    if (strNextName.equals("fr")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3292:
                    i2 = iNextInt2;
                    if (strNextName.equals("gc")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3367:
                    i2 = iNextInt2;
                    if (strNextName.equals("ip")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3553:
                    i2 = iNextInt2;
                    if (strNextName.equals("op")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 94623709:
                    i2 = iNextInt2;
                    if (strNextName.equals("chars")) {
                        c = 11;
                        break;
                    }
                    break;
                case 97615364:
                    i2 = iNextInt2;
                    if (strNextName.equals("fonts")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 110364485:
                    i2 = iNextInt2;
                    if (strNextName.equals("timer")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 839250809:
                    i2 = iNextInt2;
                    if (strNextName.equals("markers")) {
                        c = 14;
                        break;
                    }
                    break;
                default:
                    i2 = iNextInt2;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    ycx(jsonReader, ulVar, map, map2);
                    break;
                case 1:
                    ycx(jsonReader, ulVar, arrayList, longSparseArray);
                    break;
                case 2:
                    ycx(jsonReader, zbVar);
                    break;
                case 3:
                    iNextInt2 = jsonReader.nextInt();
                    continue;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.zb.lt.lt.ycx(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        ulVar.ycx("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 5:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    break;
                case 7:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case '\b':
                    ycx(jsonReader, ycxVar);
                    break;
                case '\t':
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case '\n':
                    fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 11:
                    ycx(jsonReader, ulVar, sparseArray);
                    break;
                case '\f':
                    ycx(jsonReader, map3);
                    break;
                case '\r':
                    ycx(jsonReader, syaVar);
                    break;
                case 14:
                    ycx(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            iNextInt2 = i2;
        }
        jsonReader.endObject();
        ulVar.ycx(new Rect(0, 0, (int) (iNextInt * fYcx), (int) (iNextInt2 * fYcx)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, syaVar, strNextString, ycxVar, zbVar);
        return ulVar;
    }

    private static void ycx(JsonReader jsonReader, ul.zb zbVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            zbVar.zb = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i2 = 0; i2 < 2; i2++) {
                                    if (jsonReader.hasNext()) {
                                        zbVar.zb[0][i2] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("lel")) {
                        zbVar.sya = sya(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    zbVar.ycx = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void ycx(JsonReader jsonReader, ul.ycx ycxVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    zb(jsonReader, ycxVar);
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("se")) {
                                ycxVar.ycx = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("pc")) {
                            ycxVar.dj = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("ee")) {
                        ycxVar.sya = zb(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("be")) {
                    ycxVar.zb = zb(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void zb(JsonReader jsonReader, ul.ycx ycxVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            ycxVar.ul = sya(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("fr")) {
                        ycxVar.lud = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    ycxVar.lt = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    private static Map<String, Object> zb(JsonReader jsonReader) throws JSONException, IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("lel")) {
                map.put("lel", sya(jsonReader));
            } else if (strNextName.equals("lottie_back")) {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.nextName().equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    private static void ycx(JsonReader jsonReader, ul.sya syaVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3123) {
                    if (iHashCode != 3239) {
                        if (iHashCode != 3355) {
                            if (iHashCode != 3418) {
                                if (iHashCode != 3704) {
                                    if (iHashCode != 107027) {
                                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                                            syaVar.lud = new int[]{-1, -1};
                                            jsonReader.beginArray();
                                            for (int i2 = 0; i2 < 2; i2++) {
                                                if (jsonReader.hasNext()) {
                                                    syaVar.lud[i2] = jsonReader.nextInt();
                                                }
                                            }
                                            jsonReader.endArray();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("lel")) {
                                        syaVar.ul = sya(jsonReader);
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals(RVParams.SHOW_TITLE_LOADING)) {
                                    syaVar.sya = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("ke")) {
                                syaVar.ycx = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals(TtmlNode.ATTR_ID)) {
                            syaVar.zb = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("el")) {
                        syaVar.lt = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("at")) {
                    syaVar.dj = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar, List<com.bytedance.adsdk.zb.sya.sya.lud> list, LongSparseArray<com.bytedance.adsdk.zb.sya.sya.lud> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.zb.sya.sya.lud ludVarYcx = wwx.ycx(jsonReader, ulVar);
            ludVarYcx.ea();
            lud.ycx ycxVar = lud.ycx.sya;
            list.add(ludVarYcx);
            longSparseArray.put(ludVarYcx.lud(), ludVarYcx);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar, Map<String, List<com.bytedance.adsdk.zb.sya.sya.lud>> map, Map<String, com.bytedance.adsdk.zb.jc> map2) throws JSONException, IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<jc.ycx> listDj = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArraySya = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.zb.sya.sya.lud ludVarYcx = wwx.ycx(jsonReader, ulVar);
                            longSparseArray.put(ludVarYcx.lud(), ludVarYcx);
                            arrayList.add(ludVarYcx);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "el":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    case "tc":
                        jsonReader.beginArray();
                        listDj = dj(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "lel":
                        jSONArraySya = sya(jsonReader);
                        break;
                    case "rel":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "inel":
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i2 = 0; i2 < 2; i2++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i2] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.zb.jc jcVar = new com.bytedance.adsdk.zb.jc(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listDj, strNextString5, iArr, jSONArraySya);
                map2.put(jcVar.fby(), jcVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static JSONArray sya(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            try {
                                jSONObject.put("vid", jsonReader.nextString());
                            } catch (JSONException unused) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("hd")) {
                        jSONObject.put("hd", jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    private static List<jc.ycx> dj(JsonReader jsonReader) throws IOException {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                jc.ycx ycxVar = new jc.ycx();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 99) {
                        if (iHashCode != 102) {
                            if (iHashCode != 108) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3153) {
                                        if (iHashCode != 3449) {
                                            if (iHashCode == 96670 && strNextName.equals("ali")) {
                                                ycxVar.ul = jsonReader.nextString();
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        } else if (strNextName.equals(RVParams.SSO_LOGIN_ENABLE)) {
                                            ycxVar.zb = jsonReader.nextInt();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("bs")) {
                                        ycxVar.lt = jsonReader.nextInt();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("s")) {
                                    ycxVar.lud = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("l")) {
                                ycxVar.ycx = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("f")) {
                            ycxVar.dj = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("c")) {
                        ycxVar.sya = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                arrayList.add(ycxVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void ycx(JsonReader jsonReader, Map<String, com.bytedance.adsdk.zb.sya.sya> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.zb.sya.sya syaVarYcx = xkz.ycx(jsonReader);
                    map.put(syaVarYcx.zb(), syaVarYcx);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar, SparseArray<com.bytedance.adsdk.zb.sya.dj> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.zb.sya.dj djVarYcx = ry.ycx(jsonReader, ulVar);
            sparseArray.put(djVarYcx.hashCode(), djVarYcx);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ycx(JsonReader jsonReader, List<com.bytedance.adsdk.zb.sya.lt> list) throws IOException {
        char c;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3178) {
                    if (iHashCode != 3214) {
                        c = (iHashCode == 3705 && strNextName.equals(RVParams.TOOLBAR_MENU)) ? (char) 2 : (char) 65535;
                    } else if (strNextName.equals(RVParams.DELAY_RENDER)) {
                        c = 1;
                    }
                } else if (strNextName.equals("cm")) {
                    c = 0;
                }
                if (c == 0) {
                    strNextString = jsonReader.nextString();
                } else if (c == 1) {
                    fNextDouble2 = (float) jsonReader.nextDouble();
                } else if (c == 2) {
                    fNextDouble = (float) jsonReader.nextDouble();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.zb.sya.lt(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
