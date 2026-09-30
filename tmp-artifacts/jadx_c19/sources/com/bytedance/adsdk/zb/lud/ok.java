package com.bytedance.adsdk.zb.lud;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ok implements dc<Float> {
    public static final ok ycx = new ok();

    private ok() {
    }

    @Override // com.bytedance.adsdk.zb.lud.dc
    /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
    public Float zb(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(uh.zb(jsonReader) * f);
    }
}
