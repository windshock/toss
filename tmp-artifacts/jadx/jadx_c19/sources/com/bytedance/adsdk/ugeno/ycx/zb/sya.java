package com.bytedance.adsdk.ugeno.ycx.zb;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ycx.lud;
import java.util.TreeMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends ycx {
    public sya(Context context, com.bytedance.adsdk.ugeno.zb.sya syaVar, String str, TreeMap<Float, String> treeMap) {
        super(context, syaVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public void zb() {
        if (this.dj == lud.ea) {
            this.lud.add(Keyframe.ofInt(0.0f, this.ul.oby()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public void ycx(float f, String str) {
        Keyframe keyframeOfInt;
        if (this.dj == lud.ea) {
            keyframeOfInt = Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.fby.ycx.ycx(str));
        } else {
            keyframeOfInt = Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.fby.sya.ycx(str, 0));
        }
        this.lud.add(keyframeOfInt);
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public TypeEvaluator lt() {
        if (this.dj == lud.ea) {
            return new ArgbEvaluator();
        }
        return new IntEvaluator();
    }
}
