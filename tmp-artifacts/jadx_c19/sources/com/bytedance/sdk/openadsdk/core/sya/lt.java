package com.bytedance.sdk.openadsdk.core.sya;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.sya.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    public static int jc = 8;
    public float ycx = -1.0f;
    public float zb = -1.0f;
    public float sya = -1.0f;
    public float dj = -1.0f;
    public long lud = -1;
    public long lt = -1;
    public int ul = -1;
    public int fby = -1024;
    public int jw = -1;
    public boolean ea = true;
    public SparseArray<sya.ycx> ok = new SparseArray<>();
    private float ry = 0.0f;
    private float xkz = 0.0f;
    private float syc = 0.0f;
    private float dy = 0.0f;
    private long wie = 0;
    private int pmi = 0;
    private int uh = 0;

    static {
        if (pmi.ycx() != null) {
            jc = pmi.zb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(MotionEvent motionEvent) {
        int i2;
        this.fby = motionEvent.getDeviceId();
        int i3 = 0;
        this.ul = motionEvent.getToolType(0);
        this.jw = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i4 = 1;
        if (actionMasked == 0) {
            this.pmi = (int) motionEvent.getRawX();
            this.uh = (int) motionEvent.getRawY();
            this.ycx = motionEvent.getRawX();
            this.zb = motionEvent.getRawY();
            this.lud = System.currentTimeMillis();
            this.ul = motionEvent.getToolType(0);
            this.fby = motionEvent.getDeviceId();
            this.jw = motionEvent.getSource();
            this.syc = 0.0f;
            this.dy = 0.0f;
            this.wie = System.currentTimeMillis();
            this.ea = true;
            this.ry = motionEvent.getX();
            this.xkz = motionEvent.getY();
        } else {
            i2 = 3;
            if (actionMasked == 1) {
                this.sya = motionEvent.getRawX();
                this.dj = motionEvent.getRawY();
                this.lt = System.currentTimeMillis();
                if (Math.abs(this.sya - this.pmi) >= jc || Math.abs(this.dj - this.uh) >= jc) {
                    this.ea = false;
                }
            } else if (actionMasked != 2) {
                i3 = actionMasked != 3 ? -1 : 4;
            } else {
                this.syc += Math.abs(motionEvent.getX() - this.ry);
                this.dy += Math.abs(motionEvent.getY() - this.xkz);
                this.ry = motionEvent.getX();
                this.xkz = motionEvent.getY();
                if (System.currentTimeMillis() - this.wie > 200) {
                    float f = this.syc;
                    float f2 = jc;
                    if (f <= f2 && this.dy <= f2) {
                        i4 = 2;
                    }
                    this.sya = motionEvent.getRawX();
                    this.dj = motionEvent.getRawY();
                    if (Math.abs(this.sya - this.pmi) >= jc || Math.abs(this.dj - this.uh) >= jc) {
                        this.ea = false;
                    }
                    i2 = i4;
                }
            }
            this.ok.put(motionEvent.getActionMasked(), new sya.ycx(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        i2 = i3;
        this.ok.put(motionEvent.getActionMasked(), new sya.ycx(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
