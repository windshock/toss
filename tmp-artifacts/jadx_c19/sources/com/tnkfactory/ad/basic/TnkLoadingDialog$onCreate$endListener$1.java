package com.tnkfactory.ad.basic;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkLoadingDialog$onCreate$endListener$1 extends Animatable2.AnimationCallback {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ AnimatedVectorDrawable b;

    public TnkLoadingDialog$onCreate$endListener$1(ImageView imageView, AnimatedVectorDrawable animatedVectorDrawable) {
        this.a = imageView;
        this.b = animatedVectorDrawable;
    }

    public static final void a(AnimatedVectorDrawable animatedVectorDrawable) {
        animatedVectorDrawable.start();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationEnd(Drawable drawable) {
        ImageView imageView = this.a;
        final AnimatedVectorDrawable animatedVectorDrawable = this.b;
        imageView.post(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkLoadingDialog$onCreate$endListener$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TnkLoadingDialog$onCreate$endListener$1.a(animatedVectorDrawable);
            }
        });
    }
}
