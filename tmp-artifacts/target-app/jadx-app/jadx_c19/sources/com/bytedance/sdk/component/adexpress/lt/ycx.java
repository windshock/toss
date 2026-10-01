package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.tru;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends TextSwitcher implements ViewSwitcher.ViewFactory, tru.ycx {
    private final int dj;
    private int ea;
    private int fby;
    private int jc;
    private float jw;
    private TextView lt;
    private Context lud;
    private int ok;
    private int ry;
    private int sya;
    private int ul;
    private Handler xkz;
    Animation.AnimationListener ycx;
    private List<String> zb;

    public ycx(Context context, int i2, float f, int i3, int i4) {
        super(context);
        this.zb = new ArrayList();
        this.sya = 0;
        this.dj = 1;
        this.xkz = new tru(Looper.getMainLooper(), this);
        this.ycx = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.lt.ycx.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (ycx.this.lt != null) {
                    ycx.this.lt.setText("");
                }
            }
        };
        this.lud = context;
        this.fby = i2;
        this.jw = f;
        this.jc = i3;
        this.ry = i4;
        sya();
    }

    private void sya() {
        setFactory(this);
    }

    public void setAnimationType(int i2) {
        this.ok = i2;
    }

    public void setAnimationDuration(int i2) {
        this.ul = i2;
    }

    public void ycx() {
        int i2 = this.ok;
        if (i2 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.wwx.jw(this.lud, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.wwx.jw(this.lud, "tt_text_animation_y_out"));
        } else if (i2 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.wwx.jw(this.lud, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.wwx.jw(this.lud, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.ycx);
            getOutAnimation().setAnimationListener(this.ycx);
        }
        this.xkz.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.zb = list;
    }

    public void zb() {
        List<String> list = this.zb;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i2 = this.sya;
        this.sya = i2 + 1;
        this.ea = i2;
        setText(this.zb.get(i2));
        if (this.sya > this.zb.size() - 1) {
            this.sya = 0;
        }
    }

    public void setTextColor(int i2) {
        this.fby = i2;
    }

    public void setTextSize(float f) {
        this.jw = f;
    }

    public void setMaxLines(int i2) {
        this.jc = i2;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.lt = textView;
        textView.setTextColor(this.fby);
        this.lt.setTextSize(this.jw);
        this.lt.setMaxLines(this.jc);
        this.lt.setTextAlignment(this.ry);
        return this.lt;
    }

    public void ycx(Message message) {
        if (message.what != 1) {
            return;
        }
        zb();
        this.xkz.sendEmptyMessageDelayed(1, this.ul);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.lud.ea.zb(this.zb.get(this.ea), this.jw, false)[0], 1073741824), i2);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "euAkmAKoYMiOftJFmA==", "VOAAkAKvfNWF", 182);
            super.onMeasure(i2, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.xkz.removeMessages(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.xkz.sendEmptyMessageDelayed(1, this.ul);
    }
}
