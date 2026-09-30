package com.bytedance.adsdk.zb.lud;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class uh {
    static int ycx(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(OggPageHeader.MAX_SEGMENT_COUNT, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static List<PointF> ycx(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(zb(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: com.bytedance.adsdk.zb.lud.uh$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[JsonToken.values().length];
            ycx = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ycx[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static PointF zb(JsonReader jsonReader, float f) throws IOException {
        int i2 = AnonymousClass1.ycx[jsonReader.peek().ordinal()];
        if (i2 == 1) {
            return sya(jsonReader, f);
        }
        if (i2 == 2) {
            return dj(jsonReader, f);
        }
        if (i2 == 3) {
            return lud(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    private static PointF sya(JsonReader jsonReader, float f) throws IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static PointF dj(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static PointF lud(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        float fZb = 0.0f;
        float fZb2 = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("x")) {
                fZb = zb(jsonReader);
            } else if (strNextName.equals("y")) {
                fZb2 = zb(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new PointF(fZb * f, fZb2 * f);
    }

    static float zb(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i2 = AnonymousClass1.ycx[jsonTokenPeek.ordinal()];
        if (i2 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i2 == 2) {
            jsonReader.beginArray();
            float fNextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return fNextDouble;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(jsonTokenPeek)));
    }
}
