package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ea extends FrameLayout {
    private final RotateAnimation dj;
    private final ok sya;
    private final TextView ycx;
    private final ImageView zb;

    public ea(@NonNull Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.sya.ycx.dj(context));
        this.ycx = (TextView) findViewById(2097610742);
        this.zb = (ImageView) findViewById(2097610745);
        this.sya = (ok) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.dj = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.ycx;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void ycx() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void zb() {
        this.dj.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.ea.1
            @Override // java.lang.Runnable
            public void run() {
                ea.this.zb.startAnimation(ea.this.dj);
                ea.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.ea.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ea.this.sya.ycx(4);
                    }
                }, 100L);
                ea.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.ea.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ea.this.sya.ycx(4);
                    }
                }, 300L);
                ea eaVar = ea.this;
                eaVar.postDelayed(eaVar.getHaloAnimation(), 1200L);
            }
        };
    }
}
