package com.bytedance.adsdk.ugeno.ycx;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.ycx.sya;
import com.bytedance.adsdk.ugeno.ycx.ycx.ycx;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends AnimatorListenerAdapter {
    private Context dj;
    private String fby;
    private zb jw;
    private int lt = 1;
    private int lud;
    private ValueAnimator sya;
    private com.bytedance.adsdk.ugeno.ycx.ycx.ycx ul;
    private com.bytedance.adsdk.ugeno.zb.sya ycx;
    private sya zb;

    public ycx(Context context, com.bytedance.adsdk.ugeno.zb.sya syaVar, sya syaVar2) {
        this.ycx = syaVar;
        this.zb = syaVar2;
        this.dj = context;
    }

    public void ycx() {
        ValueAnimator valueAnimator = this.sya;
        if (valueAnimator == null || this.lt == 0 || this.lud == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public void ycx(zb zbVar) {
        this.jw = zbVar;
    }

    public void zb() {
        ValueAnimator valueAnimator = this.sya;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void sya() {
        ValueAnimator valueAnimator = this.sya;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValueAnimator dj() throws Throwable {
        char c;
        com.bytedance.adsdk.ugeno.ycx.zb.ycx syaVar;
        sya syaVar2 = this.zb;
        if (syaVar2 == null || this.ycx == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapZb = syaVar2.zb();
        ArrayList arrayList = new ArrayList();
        if (mapZb != null && !mapZb.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapZb.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String strSya = lud.ycx(key).sya();
                    int iHashCode = strSya.hashCode();
                    if (iHashCode == 104431) {
                        if (strSya.equals("int")) {
                            c = 0;
                        }
                        if (c == 0) {
                        }
                        if (syaVar != null) {
                        }
                    } else if (iHashCode != 97526364) {
                        c = (iHashCode == 106845584 && strSya.equals("point")) ? (char) 2 : (char) 65535;
                        if (c == 0) {
                            syaVar = new com.bytedance.adsdk.ugeno.ycx.zb.sya(this.dj, this.ycx, key, entry.getValue());
                        } else if (c == 1) {
                            syaVar = new com.bytedance.adsdk.ugeno.ycx.zb.zb(this.dj, this.ycx, key, entry.getValue());
                        } else {
                            syaVar = c != 2 ? null : new com.bytedance.adsdk.ugeno.ycx.zb.dj(this.dj, this.ycx, key, entry.getValue());
                        }
                        if (syaVar != null) {
                            arrayList.addAll(syaVar.lud());
                        }
                    } else {
                        if (strSya.equals("float")) {
                            c = 1;
                        }
                        if (c == 0) {
                        }
                        if (syaVar != null) {
                        }
                    }
                }
            }
        }
        JSONObject jSONObjectYcx = this.zb.ycx();
        if (jSONObjectYcx != null) {
            com.bytedance.adsdk.ugeno.ycx.ycx.ycx ycxVarYcx = ycx.C0009ycx.ycx(this.ycx, jSONObjectYcx);
            this.ul = ycxVarYcx;
            if (ycxVarYcx != null) {
                arrayList.addAll(ycxVarYcx.sya());
            }
        }
        final View viewEa = this.ycx.ea();
        if (viewEa == null) {
            return null;
        }
        final sya.ycx ycxVarUl = this.zb.ul();
        if (ycxVarUl != null) {
            viewEa.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ycx.ycx.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewEa.getWidth();
                    int height = viewEa.getHeight();
                    viewEa.setPivotX(dj.ycx(ycxVarUl.ycx, width));
                    viewEa.setPivotY(dj.ycx(ycxVarUl.zb, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewEa, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.lud = dj.ycx(this.zb.dj());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.zb.sya());
        int i2 = this.lud;
        if (i2 != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i2);
        }
        this.lt = this.zb.jc();
        this.fby = this.zb.jw();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.zb.lt());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(dj.ycx(this.zb.lud()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(dj.zb(this.zb.fby()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.sya = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void ycx(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ycx.ycx.ycx ycxVar = this.ul;
        if (ycxVar != null) {
            ycxVar.ycx(canvas);
        }
    }

    public void zb(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ycx.ycx.ycx ycxVar = this.ul;
        if (ycxVar != null) {
            ycxVar.zb(canvas);
        }
    }

    public void ycx(int i2, int i3) {
        com.bytedance.adsdk.ugeno.ycx.ycx.ycx ycxVar = this.ul;
        if (ycxVar != null) {
            ycxVar.ycx(i2, i3);
        }
    }

    public String lud() {
        return this.fby;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        zb zbVar = this.jw;
        if (zbVar != null) {
            zbVar.ycx();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        zb zbVar = this.jw;
        if (zbVar != null) {
            zbVar.zb();
        }
    }
}
