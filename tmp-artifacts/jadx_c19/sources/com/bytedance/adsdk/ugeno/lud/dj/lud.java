package com.bytedance.adsdk.ugeno.lud.dj;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.fby.fby;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud extends sya {
    private AtomicBoolean dy;
    private float ea;
    private float ok;
    private String pmi;
    private int ry;
    private int syc;
    private com.bytedance.adsdk.ugeno.lud.ry uh;
    private int wie;
    private AtomicInteger xkz;

    public lud(Context context) {
        super(context);
        this.ry = 0;
        this.xkz = new AtomicInteger(Integer.MAX_VALUE);
        this.syc = Integer.MAX_VALUE;
        this.dy = new AtomicBoolean(true);
        this.wie = 0;
        this.pmi = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.lud.dj.sya
    public boolean ycx(Object... objArr) {
        Object obj;
        Object obj2;
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, Object> map = this.lud;
        if (map != null) {
            Object obj3 = map.get("direction");
            this.pmi = (obj3 == null || TextUtils.isEmpty(String.valueOf(obj3))) ? TtmlNode.COMBINE_ALL : String.valueOf(obj3);
            Object obj4 = this.lud.get("distance");
            if (obj4 == null) {
                this.ry = 0;
            } else {
                this.ry = com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj4), 0);
            }
            if (this.xkz.get() == Integer.MAX_VALUE && (obj2 = this.lud.get("frequency")) != null) {
                this.xkz.set(com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj2), Integer.MAX_VALUE));
            }
            if (this.syc == Integer.MAX_VALUE && (obj = this.lud.get("effectiveDuration")) != null) {
                this.syc = com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj), Integer.MAX_VALUE);
            }
            Object obj5 = this.lud.get("inView");
            if (obj5 != null) {
                this.wie = com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj5), 0);
            }
            Objects.toString(this.xkz);
            this.dy.get();
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        ycx();
        com.bytedance.adsdk.ugeno.lud.ry ryVar = this.uh;
        if (ryVar != null) {
            return ryVar.ycx(this.zb, motionEvent, this.ycx, this, this.pmi, this.ry, this.xkz, this.wie, this.dy.get());
        }
        return ycx(this.zb, motionEvent);
    }

    private void ycx() {
        if (this.syc == Integer.MAX_VALUE || this.zb == null || System.currentTimeMillis() - this.zb.oty() < this.syc) {
            return;
        }
        this.dy.set(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ea = motionEvent.getX();
            this.ok = motionEvent.getY();
        } else if (action == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.ry == 0 && this.ycx != null) {
                return ycx(syaVar, x, y);
            }
            int iZb = fby.zb(this.jc, x - this.ea);
            int iZb2 = fby.zb(this.jc, y - this.ok);
            String str = this.pmi;
            switch (str.hashCode()) {
                case 3739:
                    if (!str.equals("up")) {
                        iZb = (int) Math.abs(Math.sqrt(Math.pow(iZb, 2.0d) + Math.pow(iZb2, 2.0d)));
                        break;
                    } else {
                        iZb = -iZb2;
                        break;
                    }
                case 96673:
                    str.equals(TtmlNode.COMBINE_ALL);
                    iZb = (int) Math.abs(Math.sqrt(Math.pow(iZb, 2.0d) + Math.pow(iZb2, 2.0d)));
                    break;
                case 3089570:
                    if (str.equals("down")) {
                        iZb = iZb2;
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        iZb = -iZb;
                        break;
                    }
                    break;
                case 108511772:
                    if (!str.equals(TtmlNode.RIGHT)) {
                    }
                    break;
            }
            if (iZb < this.ry) {
                return false;
            }
            if (this.ycx != null) {
                this.ea = 0.0f;
                this.ok = 0.0f;
                return ycx(syaVar, x, y);
            }
        } else if (action == 3) {
            float rawX = motionEvent.getRawX();
            if (motionEvent.getRawY() != 0.0f || rawX != 0.0f) {
            }
        }
        return true;
    }

    private boolean ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, float f, float f2) {
        if (this.xkz.get() <= 0 || !this.dy.get()) {
            return false;
        }
        if (this.wie == 1 && !ycx(syaVar.ea(), f, f2)) {
            return false;
        }
        this.ycx.ycx(syaVar, this.lt, this.sya.zb(), this.sya);
        if (this.xkz.get() != Integer.MAX_VALUE) {
            this.xkz.decrementAndGet();
        }
        return true;
    }

    private boolean ycx(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    public void ycx(com.bytedance.adsdk.ugeno.lud.ry ryVar) {
        this.uh = ryVar;
    }
}
