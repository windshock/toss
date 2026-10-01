package com.bytedance.adsdk.ugeno.ycx.zb;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fby.fby;
import com.bytedance.adsdk.ugeno.ycx.lud;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends ycx {
    private List<Keyframe> fby;

    public dj(Context context, com.bytedance.adsdk.ugeno.zb.sya syaVar, String str, Map<Float, String> map) {
        super(context, syaVar, str, map);
        this.fby = new ArrayList();
    }

    /* renamed from: com.bytedance.adsdk.ugeno.ycx.zb.dj$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[lud.values().length];
            ycx = iArr;
            try {
                iArr[lud.ycx.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[lud.ul.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public void zb() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i2 = AnonymousClass1.ycx[this.dj.ordinal()];
        if (i2 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.ul.syc());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.ul.dy());
        } else if (i2 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.ul.wie());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.ul.pmi());
        }
        if (keyframeOfFloat != null) {
            this.lud.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.fby.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public void ycx(float f, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.dj == lud.ycx) {
                fOptDouble = fby.ycx(this.ycx, fOptDouble);
                fOptDouble2 = fby.ycx(this.ycx, fOptDouble2);
            }
            this.lud.add(Keyframe.ofFloat(f, fOptDouble));
            this.fby.add(Keyframe.ofFloat(f, fOptDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public List<PropertyValuesHolder> lud() {
        String strZb = this.dj.zb();
        dj();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strZb + "X", (Keyframe[]) this.lud.toArray(new Keyframe[0]));
        this.lt.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strZb + "Y", (Keyframe[]) this.fby.toArray(new Keyframe[0]));
        this.lt.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorLt = lt();
        if (typeEvaluatorLt != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorLt);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorLt);
        }
        return this.lt;
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public TypeEvaluator lt() {
        return new FloatEvaluator();
    }
}
