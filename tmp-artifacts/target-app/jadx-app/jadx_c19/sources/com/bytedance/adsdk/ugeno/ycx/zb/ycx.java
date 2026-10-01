package com.bytedance.adsdk.ugeno.ycx.zb;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ycx.lud;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx {
    protected lud dj;
    protected List<PropertyValuesHolder> lt = new ArrayList();
    protected List<Keyframe> lud = new ArrayList();
    protected Map<Float, String> sya;
    protected com.bytedance.adsdk.ugeno.zb.sya ul;
    protected Context ycx;
    protected String zb;

    public abstract TypeEvaluator lt();

    public abstract void ycx(float f, String str);

    public abstract void zb();

    public ycx(Context context, com.bytedance.adsdk.ugeno.zb.sya syaVar, String str, Map<Float, String> map) {
        this.ycx = context;
        this.zb = str;
        this.sya = map;
        this.dj = lud.ycx(this.zb);
        this.ul = syaVar;
    }

    public boolean ycx() {
        Map<Float, String> map = this.sya;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.sya.containsKey(Float.valueOf(0.0f));
    }

    public void sya() {
        Map<Float, String> map = this.sya;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.sya;
        if (map2 instanceof TreeMap) {
            Float f = (Float) ((TreeMap) map2).lastKey();
            if (f.floatValue() != 100.0f) {
                ycx(100.0f, this.sya.get(f));
            }
        }
    }

    public void dj() {
        Map<Float, String> map = this.sya;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!ycx()) {
            zb();
        }
        for (Map.Entry<Float, String> entry : this.sya.entrySet()) {
            if (entry != null) {
                ycx(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        sya();
    }

    public List<PropertyValuesHolder> lud() {
        String strZb = this.dj.zb();
        dj();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strZb, (Keyframe[]) this.lud.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorLt = lt();
        if (typeEvaluatorLt != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorLt);
        }
        this.lt.add(propertyValuesHolderOfKeyframe);
        return this.lt;
    }
}
