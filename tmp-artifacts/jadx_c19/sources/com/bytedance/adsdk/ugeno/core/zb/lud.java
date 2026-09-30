package com.bytedance.adsdk.ugeno.core.zb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.ry;
import com.bytedance.adsdk.ugeno.core.syc;
import com.bytedance.adsdk.ugeno.fby.fby;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud {
    private ycx dy;
    private String ea;
    private ry jc;
    private ry jw;
    private Context ok;
    private boolean ry;
    private boolean syc;
    private boolean xkz;
    private int ycx = 0;
    private int zb = Integer.MAX_VALUE;
    private int sya = Integer.MAX_VALUE;
    private AtomicBoolean dj = new AtomicBoolean(true);
    private float lud = Float.MIN_VALUE;
    private float lt = Float.MIN_VALUE;
    private Map<Integer, Float> ul = new HashMap();
    private Map<Integer, Float> fby = new HashMap();

    public lud(Context context, ry ryVar, boolean z, boolean z2, boolean z3) {
        this.ok = context;
        this.jw = ryVar;
        this.ry = z;
        this.xkz = z2;
        this.syc = z3;
        sya();
    }

    public lud(Context context, ry ryVar, ry ryVar2, boolean z, boolean z2, boolean z3) {
        this.ok = context;
        this.jw = ryVar;
        this.jc = ryVar2;
        this.ry = z;
        this.xkz = z2;
        this.syc = z3;
        sya();
    }

    private void sya() {
        if (this.xkz) {
            this.dy = new ycx();
        }
        ry ryVar = this.jw;
        if (ryVar == null) {
            return;
        }
        this.ycx = ryVar.sya().optInt("slideThreshold");
        this.ea = this.jw.sya().optString("slideDirection");
        this.zb = this.jw.sya().optInt("frequency", Integer.MAX_VALUE);
        this.sya = this.jw.sya().optInt("effectiveDuration", Integer.MAX_VALUE);
        this.dj.get();
    }

    public void ycx() {
        if (this.sya == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.zb.lud.1
            @Override // java.lang.Runnable
            public void run() {
                lud.this.dj.set(false);
            }
        }, this.sya);
    }

    public void zb() {
        this.lud = Float.MIN_VALUE;
        this.lt = Float.MIN_VALUE;
        this.ul.clear();
        this.fby.clear();
    }

    private void ycx(int i2) {
        this.ul.remove(Integer.valueOf(i2));
        this.fby.remove(Integer.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zb(syc sycVar, com.bytedance.adsdk.ugeno.zb.sya syaVar, MotionEvent motionEvent, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        if (actionMasked == 0) {
            this.ul.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getX(actionIndex)));
            this.fby.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getY(actionIndex)));
            Objects.toString(this.ul.get(Integer.valueOf(pointerId)));
            Objects.toString(this.fby.get(Integer.valueOf(pointerId)));
        } else {
            if (actionMasked == 1) {
                if (this.ul.containsKey(Integer.valueOf(pointerId)) && this.fby.containsKey(Integer.valueOf(pointerId))) {
                    float fFloatValue = this.ul.get(Integer.valueOf(pointerId)).floatValue();
                    float fFloatValue2 = this.fby.get(Integer.valueOf(pointerId)).floatValue();
                    float x = motionEvent.getX(actionIndex);
                    float y = motionEvent.getY(actionIndex);
                    if (this.ry && Math.abs(x - fFloatValue) <= 10.0f && Math.abs(y - fFloatValue2) <= 10.0f && sycVar != null) {
                        ycx(pointerId);
                        sycVar.ycx(this.jc, syaVar, syaVar);
                        return true;
                    }
                    if (this.ycx == 0 && sycVar != null) {
                        ycx(pointerId);
                        ycx(sycVar, this.jw, syaVar);
                        return true;
                    }
                    int iZb = fby.zb(this.ok, x - fFloatValue);
                    int iZb2 = fby.zb(this.ok, y - fFloatValue2);
                    if (TextUtils.equals(this.ea, "up")) {
                        iZb = -iZb2;
                    } else if (TextUtils.equals(this.ea, "down")) {
                        iZb = iZb2;
                    } else if (TextUtils.equals(this.ea, TtmlNode.LEFT)) {
                        iZb = -iZb;
                    } else if (!TextUtils.equals(this.ea, TtmlNode.RIGHT)) {
                        iZb = (int) Math.abs(Math.sqrt(Math.pow(iZb, 2.0d) + Math.pow(iZb2, 2.0d)));
                    }
                    if (iZb < this.ycx) {
                        ycx(pointerId);
                        ycx(syaVar);
                    } else if (sycVar != null) {
                        ycx(pointerId);
                        ycx(sycVar, this.jw, syaVar);
                        return true;
                    }
                }
                return false;
            }
            if (actionMasked == 3) {
                for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (this.ul.containsKey(Integer.valueOf(pointerId2)) && this.fby.containsKey(Integer.valueOf(pointerId2))) {
                        ycx(pointerId2);
                    }
                }
                return false;
            }
            if (actionMasked != 5) {
                if (actionMasked == 6) {
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean sya(syc sycVar, com.bytedance.adsdk.ugeno.zb.sya syaVar, MotionEvent motionEvent, boolean z) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lud = motionEvent.getX();
            this.lt = motionEvent.getY();
        } else if (action == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.ry && Math.abs(x - this.lud) <= 10.0f && Math.abs(y - this.lt) <= 10.0f && sycVar != null) {
                zb();
                sycVar.ycx(this.jc, syaVar, syaVar);
                return true;
            }
            if (this.ycx == 0 && sycVar != null) {
                zb();
                ycx(sycVar, this.jw, syaVar);
                return true;
            }
            int iZb = fby.zb(this.ok, x - this.lud);
            int iZb2 = fby.zb(this.ok, y - this.lt);
            if (TextUtils.equals(this.ea, "up")) {
                iZb = -iZb2;
            } else if (TextUtils.equals(this.ea, "down")) {
                iZb = iZb2;
            } else if (TextUtils.equals(this.ea, TtmlNode.LEFT)) {
                iZb = -iZb;
            } else if (!TextUtils.equals(this.ea, TtmlNode.RIGHT)) {
                iZb = (int) Math.abs(Math.sqrt(Math.pow(iZb, 2.0d) + Math.pow(iZb2, 2.0d)));
            }
            if (iZb < this.ycx) {
                zb();
                ycx(syaVar);
                return false;
            }
            if (sycVar != null) {
                zb();
                ycx(sycVar, this.jw, syaVar);
                return true;
            }
            zb();
        } else if (action == 3) {
            if (this.lud == Float.MIN_VALUE || this.lt == Float.MIN_VALUE) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            if (motionEvent.getRawY() != 0.0f || rawX != 0.0f) {
            }
        }
        return true;
    }

    public boolean ycx(syc sycVar, com.bytedance.adsdk.ugeno.zb.sya syaVar, MotionEvent motionEvent, boolean z) {
        ycx ycxVar = this.dy;
        if (ycxVar != null) {
            if (ycxVar.ycx(motionEvent)) {
                return false;
            }
            this.dy.ycx(syaVar, motionEvent);
        }
        if (this.syc) {
            return zb(sycVar, syaVar, motionEvent, z);
        }
        return sya(sycVar, syaVar, motionEvent, z);
    }

    private void ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar) {
        ycx ycxVar = this.dy;
        if (ycxVar != null) {
            ycxVar.ycx(syaVar);
        }
    }

    private void ycx(syc sycVar, ry ryVar, com.bytedance.adsdk.ugeno.zb.sya syaVar) {
        if (this.zb <= 0) {
            ycx(syaVar);
            return;
        }
        if (!this.dj.get()) {
            ycx(syaVar);
            return;
        }
        sycVar.ycx(ryVar, syaVar, syaVar);
        int i2 = this.zb;
        if (i2 != Integer.MAX_VALUE) {
            this.zb = i2 - 1;
        }
    }
}
