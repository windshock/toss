package com.bytedance.adsdk.zb.lud;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.zb.sya.sya.lud;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wwx {
    public static com.bytedance.adsdk.zb.sya.sya.lud ycx(com.bytedance.adsdk.zb.ul ulVar) {
        Rect rectDj = ulVar.dj();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.zb.sya.sya.lud(list, ulVar, "__container", -1L, lud.ycx.ycx, -1L, null, list, new com.bytedance.adsdk.zb.sya.ycx.ok(), 0, 0, 0, 0.0f, 0.0f, rectDj.width(), rectDj.height(), null, null, list, lud.zb.ycx, null, false, null, null);
    }

    /* renamed from: com.bytedance.adsdk.zb.lud.wwx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[lud.zb.values().length];
            ycx = iArr;
            try {
                iArr[lud.zb.dj.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[lud.zb.lud.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.bytedance.adsdk.zb.sya.sya.lud ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        ArrayList arrayList;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        lud.zb zbVar = lud.zb.ycx;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        String strNextString = "UNSET";
        float fNextDouble = 1.0f;
        lud.zb zbVar2 = zbVar;
        lud.ycx ycxVar = null;
        String strNextString2 = null;
        com.bytedance.adsdk.zb.sya.ycx.ok okVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.jc jcVarLt = null;
        com.bytedance.adsdk.zb.sya.ycx.ea eaVarYcx = null;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarYcx = null;
        com.bytedance.adsdk.zb.sya.zb.ycx ycxVarYcx = null;
        jc jcVarYcx = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        float fUl = 0.0f;
        long jNextInt2 = -1;
        String strNextString3 = null;
        float fNextDouble5 = 0.0f;
        while (jsonReader.hasNext()) {
            switch (jsonReader.nextName()) {
                case "parent":
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.zb.sya.zb.sya syaVarYcx = fby.ycx(jsonReader, ulVar);
                        if (syaVarYcx != null) {
                            arrayList3.add(syaVarYcx);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    fNextDouble4 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.zb.lt.lt.ycx());
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        if (strNextName.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                eaVarYcx = zb.ycx(jsonReader, ulVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (strNextName.equals("d")) {
                            jcVarLt = dj.lt(jsonReader, ulVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    fNextDouble3 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.zb.lt.lt.ycx());
                    break;
                case "cl":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            if (strNextName2.equals("nm")) {
                                arrayList4.add(jsonReader.nextString());
                            } else if (strNextName2.equals("ty")) {
                                int iNextInt3 = jsonReader.nextInt();
                                if (iNextInt3 == 29) {
                                    ycxVarYcx = lud.ycx(jsonReader, ulVar);
                                } else if (iNextInt3 == 25) {
                                    jcVarYcx = new ea().ycx(jsonReader, ulVar);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    ulVar.ycx("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList4)));
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    okVarYcx = sya.ycx(jsonReader, ulVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "op":
                    fUl = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iNextInt2 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.zb.lt.lt.ycx());
                    break;
                case "sr":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    iNextInt = (int) (jsonReader.nextInt() * com.bytedance.adsdk.zb.lt.lt.ycx());
                    break;
                case "tm":
                    zbVarYcx = dj.ycx(jsonReader, ulVar, false);
                    break;
                case "tt":
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 >= lud.zb.values().length) {
                        ulVar.ycx("Unsupported matte type: ".concat(String.valueOf(iNextInt4)));
                        break;
                    } else {
                        zbVar2 = lud.zb.values()[iNextInt4];
                        int i2 = AnonymousClass1.ycx[zbVar2.ordinal()];
                        if (i2 == 1) {
                            ulVar.ycx("Unsupported matte type: Luma");
                        } else if (i2 == 2) {
                            ulVar.ycx("Unsupported matte type: Luma Inverted");
                        }
                        ulVar.ycx(1);
                        break;
                    }
                case "ty":
                    int iNextInt5 = jsonReader.nextInt();
                    ycxVar = lud.ycx.ul;
                    if (iNextInt5 >= ycxVar.ordinal()) {
                        break;
                    } else {
                        ycxVar = lud.ycx.values()[iNextInt5];
                        break;
                    }
                case "ind":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "refId":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(dv.ycx(jsonReader, ulVar));
                    }
                    ulVar.ycx(arrayList2.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList5 = new ArrayList();
        if (fNextDouble5 > 0.0f) {
            arrayList = arrayList2;
            arrayList5.add(new com.bytedance.adsdk.zb.ul.ycx(ulVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble5)));
        } else {
            arrayList = arrayList2;
        }
        if (fUl <= 0.0f) {
            fUl = ulVar.ul();
        }
        arrayList5.add(new com.bytedance.adsdk.zb.ul.ycx(ulVar, fValueOf2, fValueOf2, null, fNextDouble5, Float.valueOf(fUl)));
        arrayList5.add(new com.bytedance.adsdk.zb.ul.ycx(ulVar, fValueOf, fValueOf, null, fUl, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString.endsWith(".ai") || "ai".equals(strNextString3)) {
            ulVar.ycx("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.zb.sya.sya.lud(arrayList3, ulVar, strNextString, jNextInt, ycxVar, jNextInt2, strNextString2, arrayList, okVarYcx, iNextInt, iNextInt2, color, fNextDouble, fNextDouble2, fNextDouble3, fNextDouble4, jcVarLt, eaVarYcx, arrayList5, zbVar2, zbVarYcx, zNextBoolean, ycxVarYcx, jcVarYcx);
    }
}
