package com.bytedance.adsdk.zb.lud;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.alibaba.ariver.kernel.RVParams;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class htf {
    private static final Interpolator ycx = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> zb;

    htf() {
    }

    private static SparseArray<WeakReference<Interpolator>> ycx() {
        if (zb == null) {
            zb = new SparseArray<>();
        }
        return zb;
    }

    private static WeakReference<Interpolator> ycx(int i2) {
        WeakReference<Interpolator> weakReference;
        synchronized (htf.class) {
            weakReference = ycx().get(i2);
        }
        return weakReference;
    }

    private static void ycx(int i2, WeakReference<Interpolator> weakReference) {
        synchronized (htf.class) {
            zb.put(i2, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.zb.ul.ycx<T> ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar, float f, dc<T> dcVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return zb(ulVar, jsonReader, f, dcVar);
        }
        if (z) {
            return ycx(ulVar, jsonReader, f, dcVar);
        }
        return ycx(jsonReader, f, dcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T> com.bytedance.adsdk.zb.ul.ycx<T> ycx(com.bytedance.adsdk.zb.ul ulVar, JsonReader jsonReader, float f, dc<T> dcVar) throws IOException {
        Interpolator interpolatorYcx;
        char c;
        jsonReader.beginObject();
        T tZb = null;
        PointF pointFZb = null;
        T tZb2 = null;
        PointF pointFZb2 = null;
        PointF pointFZb3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFZb4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != 101) {
                if (iHashCode != 111) {
                    if (iHashCode != 3701) {
                        if (iHashCode != 3707) {
                            if (iHashCode != 104) {
                                if (iHashCode != 105) {
                                    if (iHashCode != 115) {
                                        c = (iHashCode == 116 && strNextName.equals("t")) ? (char) 5 : (char) 65535;
                                    } else if (strNextName.equals("s")) {
                                        c = 4;
                                    }
                                } else if (strNextName.equals("i")) {
                                    c = 2;
                                }
                            } else if (strNextName.equals("h")) {
                                c = 1;
                            }
                        } else if (strNextName.equals("to")) {
                            c = 7;
                        }
                    } else if (strNextName.equals(RVParams.TITLE_IMAGE)) {
                        c = 6;
                    }
                } else if (strNextName.equals("o")) {
                    c = 3;
                }
            } else if (strNextName.equals("e")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    tZb = dcVar.zb(jsonReader, f);
                    break;
                case 1:
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 2:
                    pointFZb = uh.zb(jsonReader, 1.0f);
                    break;
                case 3:
                    pointFZb4 = uh.zb(jsonReader, 1.0f);
                    break;
                case 4:
                    tZb2 = dcVar.zb(jsonReader, f);
                    break;
                case 5:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    pointFZb2 = uh.zb(jsonReader, f);
                    break;
                case 7:
                    pointFZb3 = uh.zb(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z) {
            if (pointFZb4 != null && pointFZb != null) {
                interpolatorYcx = ycx(pointFZb4, pointFZb);
            }
            com.bytedance.adsdk.zb.ul.ycx<T> ycxVar = new com.bytedance.adsdk.zb.ul.ycx<>(ulVar, tZb2, tZb, interpolatorYcx, fNextDouble, null);
            ycxVar.fby = pointFZb3;
            ycxVar.jw = pointFZb2;
            return ycxVar;
        }
        tZb = tZb2;
        interpolatorYcx = ycx;
        com.bytedance.adsdk.zb.ul.ycx<T> ycxVar2 = new com.bytedance.adsdk.zb.ul.ycx<>(ulVar, tZb2, tZb, interpolatorYcx, fNextDouble, null);
        ycxVar2.fby = pointFZb3;
        ycxVar2.jw = pointFZb2;
        return ycxVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T> com.bytedance.adsdk.zb.ul.ycx<T> zb(com.bytedance.adsdk.zb.ul ulVar, JsonReader jsonReader, float f, dc<T> dcVar) throws IOException {
        T t;
        Interpolator interpolatorYcx;
        Interpolator interpolatorYcx2;
        T t2;
        Interpolator interpolatorYcx3;
        com.bytedance.adsdk.zb.ul.ycx<T> ycxVar;
        char c;
        T t3;
        float f2;
        PointF pointF;
        T t4;
        PointF pointF2;
        jsonReader.beginObject();
        PointF pointFZb = null;
        PointF pointFZb2 = null;
        boolean z = false;
        PointF pointFZb3 = null;
        PointF pointFZb4 = null;
        PointF pointF3 = null;
        T tZb = null;
        PointF pointF4 = null;
        T tZb2 = null;
        PointF pointF5 = null;
        float fNextDouble = 0.0f;
        PointF pointF6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            T t5 = tZb2;
            int iHashCode = strNextName.hashCode();
            PointF pointF7 = pointFZb2;
            PointF pointF8 = pointFZb;
            if (iHashCode != 101) {
                if (iHashCode != 111) {
                    if (iHashCode != 3701) {
                        if (iHashCode != 3707) {
                            if (iHashCode != 104) {
                                if (iHashCode != 105) {
                                    if (iHashCode != 115) {
                                        c = (iHashCode == 116 && strNextName.equals("t")) ? (char) 5 : (char) 65535;
                                    } else if (strNextName.equals("s")) {
                                        c = 4;
                                    }
                                } else if (strNextName.equals("i")) {
                                    c = 2;
                                }
                            } else if (strNextName.equals("h")) {
                                c = 1;
                            }
                        } else if (strNextName.equals("to")) {
                            c = 7;
                        }
                    } else if (strNextName.equals(RVParams.TITLE_IMAGE)) {
                        c = 6;
                    }
                } else if (strNextName.equals("o")) {
                    c = 3;
                }
            } else if (strNextName.equals("e")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    t3 = tZb;
                    tZb2 = dcVar.zb(jsonReader, f);
                    pointFZb2 = pointF7;
                    pointFZb = pointF8;
                    tZb = t3;
                    break;
                case 1:
                    t3 = tZb;
                    f2 = fNextDouble;
                    pointF = pointF6;
                    if (jsonReader.nextInt() != 1) {
                        pointF6 = pointF;
                        tZb2 = t5;
                        pointFZb2 = pointF7;
                        pointFZb = pointF8;
                        fNextDouble = f2;
                        tZb = t3;
                        z = false;
                        break;
                    } else {
                        z = true;
                        pointF6 = pointF;
                        tZb2 = t5;
                        pointFZb2 = pointF7;
                        pointFZb = pointF8;
                        fNextDouble = f2;
                        tZb = t3;
                        break;
                    }
                case 2:
                    t3 = tZb;
                    f2 = fNextDouble;
                    pointF = pointF6;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            if (strNextName2.equals("x")) {
                                JsonToken jsonTokenPeek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (jsonTokenPeek == jsonToken) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName2.equals("y")) {
                                JsonToken jsonTokenPeek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (jsonTokenPeek2 == jsonToken2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF9 = new PointF(fNextDouble2, fNextDouble3);
                        pointF6 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF5 = pointF9;
                        tZb2 = t5;
                        pointFZb2 = pointF7;
                        pointFZb = pointF8;
                        fNextDouble = f2;
                        tZb = t3;
                        break;
                    } else {
                        pointFZb4 = uh.zb(jsonReader, f);
                        pointF6 = pointF;
                        tZb2 = t5;
                        pointFZb2 = pointF7;
                        pointFZb = pointF8;
                        fNextDouble = f2;
                        tZb = t3;
                    }
                case 3:
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        while (jsonReader.hasNext()) {
                            float f3 = fNextDouble;
                            String strNextName3 = jsonReader.nextName();
                            if (strNextName3.equals("x")) {
                                t4 = tZb;
                                pointF2 = pointF6;
                                JsonToken jsonTokenPeek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (jsonTokenPeek3 == jsonToken3) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                            } else {
                                if (strNextName3.equals("y")) {
                                    JsonToken jsonTokenPeek4 = jsonReader.peek();
                                    JsonToken jsonToken4 = JsonToken.NUMBER;
                                    if (jsonTokenPeek4 == jsonToken4) {
                                        fNextDouble9 = (float) jsonReader.nextDouble();
                                        fNextDouble7 = fNextDouble9;
                                        tZb = tZb;
                                    } else {
                                        jsonReader.beginArray();
                                        t4 = tZb;
                                        pointF2 = pointF6;
                                        fNextDouble7 = (float) jsonReader.nextDouble();
                                        fNextDouble9 = jsonReader.peek() == jsonToken4 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                        jsonReader.endArray();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                fNextDouble = f3;
                            }
                            pointF6 = pointF2;
                            fNextDouble = f3;
                            tZb = t4;
                        }
                        t3 = tZb;
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF11 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF3 = pointF11;
                        pointF4 = pointF10;
                    } else {
                        t3 = tZb;
                        pointFZb3 = uh.zb(jsonReader, f);
                    }
                    tZb2 = t5;
                    pointFZb2 = pointF7;
                    pointFZb = pointF8;
                    tZb = t3;
                    break;
                case 4:
                    tZb = dcVar.zb(jsonReader, f);
                    tZb2 = t5;
                    pointFZb2 = pointF7;
                    pointFZb = pointF8;
                    break;
                case 5:
                    fNextDouble = (float) jsonReader.nextDouble();
                    tZb2 = t5;
                    pointFZb2 = pointF7;
                    pointFZb = pointF8;
                    break;
                case 6:
                    pointFZb2 = uh.zb(jsonReader, f);
                    tZb2 = t5;
                    pointFZb = pointF8;
                    break;
                case 7:
                    pointFZb = uh.zb(jsonReader, f);
                    tZb2 = t5;
                    pointFZb2 = pointF7;
                    break;
                default:
                    t3 = tZb;
                    jsonReader.skipValue();
                    tZb2 = t5;
                    pointFZb2 = pointF7;
                    pointFZb = pointF8;
                    tZb = t3;
                    break;
            }
        }
        PointF pointF12 = pointFZb;
        PointF pointF13 = pointFZb2;
        T t6 = tZb;
        T t7 = tZb2;
        float f4 = fNextDouble;
        PointF pointF14 = pointF6;
        jsonReader.endObject();
        if (z) {
            t = t6;
        } else {
            if (pointFZb3 != null && pointFZb4 != null) {
                interpolatorYcx3 = ycx(pointFZb3, pointFZb4);
                t = t7;
                t2 = t;
                interpolatorYcx = null;
                interpolatorYcx2 = null;
                if (interpolatorYcx != null) {
                    ycxVar = new com.bytedance.adsdk.zb.ul.ycx<>(ulVar, t6, t2, interpolatorYcx3, f4, null);
                }
                ycxVar.fby = pointF12;
                ycxVar.jw = pointF13;
                return ycxVar;
            }
            if (pointF4 != null && pointF3 != null && pointF5 != null && pointF14 != null) {
                interpolatorYcx = ycx(pointF4, pointF5);
                interpolatorYcx2 = ycx(pointF3, pointF14);
                t2 = t7;
                interpolatorYcx3 = null;
                if (interpolatorYcx != null && interpolatorYcx2 != null) {
                    ycxVar = new com.bytedance.adsdk.zb.ul.ycx<>(ulVar, t6, t2, interpolatorYcx, interpolatorYcx2, f4, null);
                } else {
                    ycxVar = new com.bytedance.adsdk.zb.ul.ycx<>(ulVar, t6, t2, interpolatorYcx3, f4, null);
                }
                ycxVar.fby = pointF12;
                ycxVar.jw = pointF13;
                return ycxVar;
            }
            t = t7;
        }
        interpolatorYcx3 = ycx;
        t2 = t;
        interpolatorYcx = null;
        interpolatorYcx2 = null;
        if (interpolatorYcx != null) {
        }
        ycxVar.fby = pointF12;
        ycxVar.jw = pointF13;
        return ycxVar;
    }

    private static Interpolator ycx(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.zb.lt.lud.zb(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.zb.lt.lud.zb(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.zb.lt.lud.zb(pointF2.x, -1.0f, 1.0f);
        float fZb = com.bytedance.adsdk.zb.lt.lud.zb(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fZb;
        int iYcx = com.bytedance.adsdk.zb.lt.lt.ycx(pointF.x, pointF.y, pointF2.x, fZb);
        WeakReference<Interpolator> weakReferenceYcx = com.bytedance.adsdk.zb.lud.ycx() ? null : ycx(iYcx);
        Interpolator interpolator = weakReferenceYcx != null ? weakReferenceYcx.get() : null;
        if (weakReferenceYcx != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.zb.wie.ycx(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.zb.wie.ycx(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.zb.lud.ycx()) {
            try {
                ycx(iYcx, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.zb.ul.ycx<T> ycx(JsonReader jsonReader, float f, dc<T> dcVar) throws IOException {
        return new com.bytedance.adsdk.zb.ul.ycx<>(dcVar.zb(jsonReader, f));
    }
}
