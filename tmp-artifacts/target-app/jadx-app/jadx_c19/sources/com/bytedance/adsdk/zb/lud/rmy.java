package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class rmy implements dc<com.bytedance.adsdk.zb.ul.sya> {
    public static final rmy ycx = new rmy();

    private rmy() {
    }

    @Override // com.bytedance.adsdk.zb.lud.dc
    /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.zb.ul.sya zb(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.zb.ul.sya((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
