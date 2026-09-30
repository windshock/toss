package com.bytedance.sdk.openadsdk.core.jc;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.jc;
import com.bytedance.sdk.openadsdk.core.model.ok;
import com.bytedance.sdk.openadsdk.utils.dc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class hf extends GestureDetector {
    private final ycx ycx;
    private final com.bytedance.sdk.openadsdk.core.sya.lt zb;

    public hf(Context context) {
        this(context, new ycx());
    }

    public hf(Context context, ycx ycxVar) {
        super(context, ycxVar);
        this.ycx = ycxVar;
        this.zb = new com.bytedance.sdk.openadsdk.core.sya.lt();
        setIsLongpressEnabled(false);
    }

    void ycx() {
        this.ycx.ycx();
    }

    public boolean zb() {
        return this.ycx.zb();
    }

    public com.bytedance.sdk.openadsdk.core.model.ok ycx(Context context, View view) {
        if (this.zb == null) {
            return new ok.ycx().ycx();
        }
        return new ok.ycx().lt(this.zb.ycx).lud(this.zb.zb).dj(this.zb.sya).sya(this.zb.dj).zb(this.zb.lud).ycx(this.zb.lt).ycx(dc.ycx(view)).zb(dc.sya(view)).dj(this.zb.ul).lud(this.zb.fby).lt(this.zb.jw).ycx(this.zb.ok).zb(jc.zb().ycx() ? 1 : 2).ycx("vessel").ycx(dc.jw(context)).sya(dc.ea(context)).zb(dc.jc(context)).ycx();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.zb.ycx(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    static class ycx extends GestureDetector.SimpleOnGestureListener {
        boolean ycx = false;

        ycx() {
        }

        void ycx() {
            this.ycx = false;
        }

        boolean zb() {
            return this.ycx;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.ycx = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
