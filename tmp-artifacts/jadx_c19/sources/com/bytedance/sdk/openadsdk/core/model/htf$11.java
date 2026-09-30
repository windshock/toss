package com.bytedance.sdk.openadsdk.core.model;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class htf$11 implements Runnable {
    final /* synthetic */ htf ycx;

    htf$11(htf htfVar) {
        this.ycx = htfVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        htf.ycx(this.ycx, ValueAnimator.ofFloat(1.0f, 0.0f));
        htf.dwi(this.ycx).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.htf$11.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (htf.kgy(htf$11.this.ycx) != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) htf.kgy(htf$11.this.ycx).getLayoutParams();
                    layoutParams.weight = fFloatValue;
                    htf.kgy(htf$11.this.ycx).setLayoutParams(layoutParams);
                }
            }
        });
        htf.dwi(this.ycx).setDuration(500L);
        htf.dwi(this.ycx).start();
        if (htf.aeu(this.ycx) != null) {
            htf.aeu(this.ycx).setVisibility(8);
        }
    }
}
