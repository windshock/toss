package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.ycx;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc {
    private View dj;
    private int lt;
    private int lud;
    private AnimatorSet sya = new AnimatorSet();
    private String ul;
    Paint ycx;
    private ycx zb;

    public jc(View view, ycx ycxVar) {
        this.dj = view;
        this.zb = ycxVar;
        Paint paint = new Paint();
        this.ycx = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx() {
        ArrayList arrayList = new ArrayList();
        List<ycx.C0003ycx> listSya = this.zb.sya();
        if (listSya == null || listSya.size() <= 0) {
            return;
        }
        for (ycx.C0003ycx c0003ycx : listSya) {
            if (c0003ycx != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0003ycx.ycx());
                if (TextUtils.equals(c0003ycx.lud(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0003ycx.lud(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0003ycx.lud());
                }
                objectAnimator.setStartDelay(c0003ycx.dj());
                objectAnimator.setTarget(this.dj);
                char c = 0;
                if (TextUtils.equals(c0003ycx.lud(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setIntValues((int) c0003ycx.lt(), (int) c0003ycx.ul());
                    c0003ycx.lt();
                    c0003ycx.ul();
                } else {
                    objectAnimator.setFloatValues(c0003ycx.lt(), c0003ycx.ul());
                }
                int iZb = (int) this.zb.zb();
                if (iZb != 0) {
                    objectAnimator.setRepeatCount(iZb);
                } else {
                    objectAnimator.setRepeatCount((int) c0003ycx.zb());
                }
                if (TextUtils.equals(c0003ycx.lud(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strLt = this.zb.lt();
                if (TextUtils.isEmpty(strLt)) {
                    strLt = c0003ycx.sya();
                }
                if (TextUtils.equals(strLt, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0003ycx.fby() != null && c0003ycx.fby().length > 0) {
                    objectAnimator.setFloatValues(c0003ycx.fby());
                }
                if (TextUtils.equals(c0003ycx.lud(), "rotationX")) {
                    this.dj.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.jc.1
                        @Override // java.lang.Runnable
                        public void run() {
                            jc.this.dj.setPivotX(jc.this.dj.getWidth() / 2.0f);
                            jc.this.dj.setPivotY(jc.this.dj.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0003ycx.lud(), "ripple")) {
                    this.ul = c0003ycx.jc();
                }
                String strJw = c0003ycx.jw();
                switch (strJw.hashCode()) {
                    case -1354466595:
                        if (!strJw.equals("accelerate")) {
                            c = 65535;
                            break;
                        }
                        break;
                    case -1263948740:
                        if (strJw.equals("decelerate")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1102672091:
                        if (strJw.equals("linear")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 475910905:
                        if (strJw.equals("accelerateDecelerate")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1312628413:
                        if (strJw.equals("standard")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    objectAnimator.setInterpolator(new AccelerateInterpolator());
                } else if (c == 1) {
                    objectAnimator.setInterpolator(new DecelerateInterpolator());
                } else if (c == 2) {
                    objectAnimator.setInterpolator(new LinearInterpolator());
                } else if (c == 3) {
                    objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                } else if (c == 4) {
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.zb.dj() != 0) {
            this.sya.setDuration(this.zb.dj());
        }
        this.sya.setStartDelay(this.zb.lud());
        if (TextUtils.equals(this.zb.ycx(), "sequentially")) {
            this.sya.playSequentially(arrayList);
        } else {
            this.sya.playTogether(arrayList);
        }
        this.sya.start();
    }

    public void zb() {
        AnimatorSet animatorSet = this.sya;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void ycx(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.ul)) {
                return;
            }
            this.ycx.setColor(com.bytedance.adsdk.ugeno.fby.ycx.ycx(this.ul));
            this.ycx.setAlpha(90);
            ((ViewGroup) this.dj.getParent()).setClipChildren(true);
            canvas.drawCircle(this.lud, this.lt, (Math.min(r0, r3) << 1) * iAnimation.getRipple(), this.ycx);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void ycx(int i2, int i3) {
        this.lud = i2 / 2;
        this.lt = i3 / 2;
    }
}
