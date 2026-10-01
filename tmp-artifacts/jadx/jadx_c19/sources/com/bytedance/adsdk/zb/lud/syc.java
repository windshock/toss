package com.bytedance.adsdk.zb.lud;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class syc implements dc<com.bytedance.adsdk.zb.sya.zb.dj> {
    private int ycx;

    public syc(int i2) {
        this.ycx = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    @Override // com.bytedance.adsdk.zb.lud.dc
    /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.adsdk.zb.sya.zb.dj zb(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.ycx = 2;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.ycx == -1) {
            this.ycx = arrayList.size() / 4;
        }
        int i2 = this.ycx;
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < (this.ycx << 2); i5++) {
            int i6 = i5 / 4;
            double dFloatValue = arrayList.get(i5).floatValue();
            int i7 = i5 % 4;
            if (i7 != 0) {
                if (i7 == 1) {
                    i3 = (int) (dFloatValue * 255.0d);
                } else if (i7 == 2) {
                    i4 = (int) (dFloatValue * 255.0d);
                } else if (i7 == 3) {
                    iArr[i6] = Color.argb(OggPageHeader.MAX_SEGMENT_COUNT, i3, i4, (int) (dFloatValue * 255.0d));
                }
            } else if (i6 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i6 - 1] >= f2) {
                    fArr[i6] = f2 + 0.01f;
                } else {
                    fArr[i6] = (float) dFloatValue;
                }
            }
        }
        return ycx(new com.bytedance.adsdk.zb.sya.zb.dj(fArr, iArr), arrayList);
    }

    private com.bytedance.adsdk.zb.sya.zb.dj ycx(com.bytedance.adsdk.zb.sya.zb.dj djVar, List<Float> list) {
        int i2 = this.ycx << 2;
        if (list.size() <= i2) {
            return djVar;
        }
        float[] fArrYcx = djVar.ycx();
        int[] iArrZb = djVar.zb();
        int size = (list.size() - i2) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i3 = 0;
        while (i2 < list.size()) {
            if (i2 % 2 == 0) {
                fArr[i3] = list.get(i2).floatValue();
            } else {
                fArr2[i3] = list.get(i2).floatValue();
                i3++;
            }
            i2++;
        }
        float[] fArrYcx2 = ycx(djVar.ycx(), fArr);
        int length = fArrYcx2.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            float f = fArrYcx2[i4];
            int iBinarySearch = Arrays.binarySearch(fArrYcx, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i4] = ycx(f, fArr2[iBinarySearch2], fArrYcx, iArrZb);
            } else {
                iArr[i4] = ycx(f, iArrZb[iBinarySearch], fArr, fArr2);
            }
        }
        return new com.bytedance.adsdk.zb.sya.zb.dj(fArrYcx2, iArr);
    }

    int ycx(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f3 = fArr[i2];
            if (f3 >= f || i2 == fArr.length - 1) {
                int i3 = i2 - 1;
                float f4 = fArr[i3];
                float f5 = (f - f4) / (f3 - f4);
                int i4 = iArr[i2];
                int i5 = iArr[i3];
                return Color.argb((int) (f2 * 255.0f), com.bytedance.adsdk.zb.lt.zb.ycx(f5, Color.red(i5), Color.red(i4)), com.bytedance.adsdk.zb.lt.zb.ycx(f5, Color.green(i5), Color.green(i4)), com.bytedance.adsdk.zb.lt.zb.ycx(f5, Color.blue(i5), Color.blue(i4)));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int ycx(float f, int i2, float[] fArr, float[] fArr2) {
        float fYcx;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
        }
        for (int i3 = 1; i3 < fArr.length; i3++) {
            float f2 = fArr[i3];
            if (f2 >= f || i3 == fArr.length - 1) {
                if (f2 <= f) {
                    fYcx = fArr2[i3];
                } else {
                    int i4 = i3 - 1;
                    float f3 = fArr[i4];
                    fYcx = com.bytedance.adsdk.zb.lt.lud.ycx(fArr2[i4], fArr2[i3], (f - f3) / (f2 - f3));
                }
                return Color.argb((int) (fYcx * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] ycx(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            float f = i3 < fArr.length ? fArr[i3] : Float.NaN;
            float f2 = i4 < fArr2.length ? fArr2[i4] : Float.NaN;
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i5] = f;
                i3++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i5] = f2;
                i4++;
            } else {
                fArr3[i5] = f;
                i3++;
                i4++;
                i2++;
            }
        }
        return i2 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i2);
    }
}
